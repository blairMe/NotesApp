package bfa.blair.composenoteapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import bfa.blair.composenoteapp.R
import bfa.blair.composenoteapp.components.NoteButton
import bfa.blair.composenoteapp.components.NoteInputText

@Composable
fun NoteScreen() {

    var title by remember {
        mutableStateOf("")
    }

    var description by remember {
        mutableStateOf("")
    }

    Column(modifier = Modifier.padding(16.dp)) {
        TopAppBar(title = {
           Text(text = stringResource(id = R.string.app_name))               
        }, actions = {
            Icon(imageVector = Icons.Rounded.Notifications, contentDescription = "Icon")
        },
        backgroundColor = Color(0xFFDADFE3))

        // Content
        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            NoteInputText(
                modifier = Modifier.padding(top = 9.dp, bottom = 8.dp),
                text = title,
                label = "Title",
                onTextChange = {
                    if(it.all { char ->
                        char.isLetter() || char.isWhitespace()
                        }) title = it
                },
                onImeAction = {})
            NoteInputText(
                modifier = Modifier.padding(top = 9.dp, bottom = 8.dp),
                text = description,
                label = "Add a note",
                onTextChange = {
                    if(it.all { char ->
                            char.isLetter() || char.isWhitespace()
                        }) description = it
                },
                onImeAction = {})
            NoteButton(
                text = "Done",
                onClick = {
                if(title.isNotEmpty() && description.isNotEmpty()) {
                    // Save or add data to list
                    // Comment
                    title = ""
                    description = ""
                }
            })
        }
    }
}

@Preview(showBackground = true)
@Composable
fun NoteScreenPreview() {
    NoteScreen()
}