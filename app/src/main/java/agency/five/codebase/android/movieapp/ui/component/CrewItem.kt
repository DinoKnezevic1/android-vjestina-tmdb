package agency.five.codebase.android.movieapp.ui.component

import agency.five.codebase.android.movieapp.mock.MoviesMock
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

data class CrewItemViewState (
    val name : String,
    val job : String
)

@Composable
fun CrewItem(
    viewState: CrewItemViewState
){
    Column{
        Text(
            text = viewState.name,
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = viewState.job,
            fontSize = 10.sp,
            fontWeight = FontWeight.Light
        )
    }
}

@Preview
@Composable
fun CrewItemPreview(){
    val crewman= MoviesMock.getCrewman()
    val viewState=CrewItemViewState(crewman.name,crewman.job)
    CrewItem(viewState = viewState)
}