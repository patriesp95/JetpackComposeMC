package com.example.jetpackcomposemasterclass.basic_layout

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.AssistChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposemasterclass.ui.theme.JetpackComposeMasterclassTheme

@Composable
fun FlowLayoutDemo() {
    Row(
        modifier = Modifier
            .fillMaxSize()
    ) {
        AssistChip(
            onClick = {},
            label = {
                Text("Hello world")
            }
        )
        AssistChip(
            onClick = {},
            label = {
                Text("Hello world")
            }
        )
    }
}

@Preview(
    showBackground  = true
)
@Composable
private fun FlowLayoutDemoPreview(){
    JetpackComposeMasterclassTheme {
        FlowLayoutDemo()
    }
}