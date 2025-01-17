package sidd.tutorials.musicappui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun AccountView() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Row {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = "ACCOUNT",
                    modifier = Modifier.padding(end = 8.dp))
                Column {
                    Text("Siddhant Jha")
                    Text("BCA")
                }
            }
            IconButton(onClick = {}){
                Icon(imageVector = Icons.Default.KeyboardArrowRight,contentDescription = null)
            }

        }
        Row(modifier = Modifier.padding(top=16.dp)) {
            Icon(painter = painterResource(id = R.drawable.baseline_music), contentDescription ="MY MUSIC",
                modifier = Modifier.padding(8.dp))
            Text(text = "MY MUSIC")
        }
        Divider()
    }

}