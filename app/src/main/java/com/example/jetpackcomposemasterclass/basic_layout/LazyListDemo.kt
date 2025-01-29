package com.example.jetpackcomposemasterclass.basic_layout

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposemasterclass.ui.theme.JetpackComposeMasterclassTheme

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyListDemo(modifier: Modifier = Modifier){
    LazyColumn(
        modifier = Modifier.fillMaxSize()
    ){
        items(100){ i ->
            Text("Item $i")
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
private fun FlexLayoutDemoPreview(){
    JetpackComposeMasterclassTheme {
        LazyListDemo()
    }
}