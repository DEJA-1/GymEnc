package com.example.gymenc.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import coil.transform.RoundedCornersTransformation
import com.example.gymenc.model.Exercise
import com.example.gymenc.model.getCategories
import com.example.gymenc.model.getExercises

@Composable
fun ExerciseRow(
    exercise: Exercise = getCategories()[0],
    onItemClick: (String) -> Unit = {}
) {

    Card(modifier = Modifier
        .size(100.dp)
        .padding(4.dp)
        .clickable {
            onItemClick(exercise.id)
        },
        shape = RoundedCornerShape(8.dp),
        elevation = 15.dp
    ) {

        Box(contentAlignment = Alignment.Center, modifier = Modifier
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFFE8C547),
                        Color(0xFFB78628)
                    )
                )
            )
        ) {

            Image(painter = rememberAsyncImagePainter(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(exercise.images[0])
                    .decoderFactory(SvgDecoder.Factory())
                    .crossfade(true)
                    .build()),

                contentDescription = "Exercise image")

        }



    }

}