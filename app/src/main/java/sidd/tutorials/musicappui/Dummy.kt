package sidd.tutorials.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon : Int,val name : String)
val libraries = listOf<Lib>(
    Lib(R.drawable.baseline_library_music_24,"Playlist"),
    Lib(R.drawable.baseline_mic_24,"Artist"),
    Lib(R.drawable.baseline_music,"Songs"),
    Lib(R.drawable.baseline_album_24,"Album"),
    Lib(R.drawable.baseline_article_24,"Genre")


)
