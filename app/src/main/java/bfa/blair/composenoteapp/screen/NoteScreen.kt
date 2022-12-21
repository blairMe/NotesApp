package bfa.blair.composenoteapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import bfa.blair.composenoteapp.R

@Composable
fun NoteScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        TopAppBar(title = {
           Text(text = stringResource(id = R.string.app_name))               
        }, actions = {})
    }
}

@Preview(showBackground = true)
@Composable
fun NoteScreenPreview() {
    NoteScreen()
}