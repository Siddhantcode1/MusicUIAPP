package sidd.tutorials.musicappui

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable

@Composable
fun BrowseScreen() {
    LazyVerticalGrid(columns = GridCells.Fixed(2), ){

        val categories1 = listOf<String>("Sad","Dead","Rock","Jazz","Mj","Pop")
        items(categories1){
            cat ->
            BrowserItem(cat = cat, drawable = R.drawable.baseline_article_24 )


        }

    }

}