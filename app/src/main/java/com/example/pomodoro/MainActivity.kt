package com.example.pomodoro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import com.example.pomodoro.ui.theme.PomodoroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PomodoroTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.surface
                ) {
                    Box(
                        contentAlignment = Alignment.Center
                    ) {
                        Canvas(modifier = Modifier
                            .padding(20.dp)
                            .size(300.dp)
                        ) {
                            drawRoundRect(
                                color = Color.Black,
                                size = size,
                                cornerRadius = CornerRadius(16.dp.toPx(), 16.dp.toPx()),
                                style = Stroke(width = 2.dp.toPx())
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Timer(
    totalTime: Long,
    handleColor: Color,
    activeBarColor: Color,
    inactiveBarColor: Color,
    modifier: Modifier = Modifier,
    initialValue: Float = 0f,
    strokeWidth: Dp = 5.dp
) {
    var size by remember { mutableStateOf(IntSize.Zero) }
    var value by remember { mutableStateOf(initialValue) }
    var currentTime by remember { mutableStateOf(totalTime) }
    var isTimerRunning by remember { mutableStateOf(false) }
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .onSizeChanged { size = it }
    ) {

    }
}