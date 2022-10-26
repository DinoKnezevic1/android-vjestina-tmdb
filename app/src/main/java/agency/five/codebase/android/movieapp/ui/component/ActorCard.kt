package agency.five.codebase.android.movieapp.ui.component

import agency.five.codebase.android.movieapp.MovieApp
import agency.five.codebase.android.movieapp.mock.MoviesMock
import agency.five.codebase.android.movieapp.ui.theme.MovieAppTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

data class ActorCardViewState(
    val imageUrl: String,
    val name: String,
    val character: String,
)
@Composable
fun ActorCard(
    actorCardViewState: ActorCardViewState,
    modifier: Modifier = Modifier,
) {
    Surface(color = MaterialTheme.colors.background, modifier = Modifier.padding(10.dp)){
        Card {
            Column(
                modifier= Modifier
                    .fillMaxSize()
                    .wrapContentSize()
                    .clip(RoundedCornerShape(4.dp))
            ) {
                AsyncImage(
                    model = actorCardViewState.imageUrl,
                    contentDescription = "actor image",
                    modifier=Modifier.width(100.dp).width(170.dp)

                )
                Text(
                    text = actorCardViewState.name,
                    modifier= Modifier
                        .width(100.dp)
                        .padding(start = 5.dp, end = 2.dp, top = 3.dp),
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = actorCardViewState.character,
                    modifier= Modifier
                        .width(100.dp)
                        .alpha(ContentAlpha.disabled)
                        .padding(start = 5.dp, bottom = 10.dp, end = 2.dp, top = 2.dp),
                    fontSize = 10.sp
                )


            }

        }
    }

}
@Preview
@Composable
private fun ActorCardPreview() {
    val actor = MoviesMock.getActor()
    val actorCardViewState= ActorCardViewState(actor.name,actor.character,
        actor.imageUrl.toString()
    )
    ActorCard(actorCardViewState)

}