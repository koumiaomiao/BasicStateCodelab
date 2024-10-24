package com.kmj.basestatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.toMutableStateList
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kmj.basestatecodelab.ui.theme.BaseStateCodelabTheme

@Composable
fun WellnessScreen(modifier: Modifier = Modifier) {
    Column(modifier) {
        StatefulCounter()

        val list = remember { getWellnessTasks().toMutableStateList() }
        WellnessTasksList(list, { task -> list.remove(task) })
    }
}

@Preview
@Composable
fun WellnessScreenPreview() {
    BaseStateCodelabTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            WellnessScreen()
        }
    }
}
