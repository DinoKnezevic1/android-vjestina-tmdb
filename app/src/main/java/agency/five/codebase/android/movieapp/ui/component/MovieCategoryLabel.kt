package agency.five.codebase.android.movieapp.ui.component

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable

data class MovieCategoryLabelViewState(
    val itemId: Int,
    val isSelected: Boolean,
    val categoryText: MovieCategoryLabelTextViewState
)

sealed class MovieCategoryLabelTextViewState {
    class LabelTextFromString(val text: String) : MovieCategoryLabelTextViewState()
    class LabelTextFromResource(@StringRes val textRes: Int) : MovieCategoryLabelTextViewState()
}

@Composable
fun MovieCategoryLabel(
    labelViewState: MovieCategoryLabelViewState
){}

//will do it later I don't really understand