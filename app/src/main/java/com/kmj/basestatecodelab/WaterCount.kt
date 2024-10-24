package com.kmj.basestatecodelab

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun WaterCounter(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.padding(16.dp)) {

        // Changes to count are now tracked by Compose
        val count: MutableState<Int> = remember { mutableStateOf(0) }

        Text("You've had ${count.value} glasses.")
        Button(
            onClick = { count.value++ },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Add One")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WaterCounterPreview() {
    WaterCounter()
}
