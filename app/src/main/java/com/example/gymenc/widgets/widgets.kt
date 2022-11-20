package com.example.gymenc.widgets

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.decode.SvgDecoder
import coil.request.ImageRequest
import coil.transform.RoundedCornersTransformation
import com.example.gymenc.model.Exercise
import com.example.gymenc.model.getCategories
import com.example.gymenc.model.getExercises

@Composable
fun CategoryRow(
    category: Exercise = getCategories()[0],
    onItemClick: (String) -> Unit = {}
) {

    Card(
        modifier = Modifier
            .size(100.dp)
            .padding(4.dp)
            .clickable {
                onItemClick(category.id)
            },
        shape = RoundedCornerShape(8.dp),
        elevation = 15.dp
    ) {

        Box(
            contentAlignment = Alignment.Center, modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFE8C547),
                            Color(0xFFB78628)
                        )
                    )
                )
        ) {

            Image(
                painter = rememberAsyncImagePainter(
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(category.images[0])
                        .decoderFactory(SvgDecoder.Factory())
                        .crossfade(true)
                        .build()
                ),

                contentDescription = "Category image"
            )

        }

    }

}

@Composable
fun ExerciseRow(
    exercise: Exercise = getExercises()[0],
    onItemClick: (String) -> Unit = {}
) {

    val isExpanded = remember {
        mutableStateOf(false)
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
//            .height(200.dp)
            .padding(12.dp)
            .clickable {
                isExpanded.value = !isExpanded.value
            },
        shape = RoundedCornerShape(12.dp),
        elevation = 4.dp
    ) {

        Box(
            contentAlignment = Alignment.Center, modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFE8C547),
                            Color(0xFFB78628)
                        )
                    )
                )
        ) {

            Column() {
                AsyncImage(modifier = Modifier.clip(RoundedCornerShape(12.dp)),
                    model = ImageRequest.Builder(LocalContext.current)
                        .data(exercise.images[0])
                        .crossfade(true)
                        .build(),
                    contentScale = ContentScale.FillBounds,
                    contentDescription = "Exercise Image")

                AnimatedVisibility(visible = isExpanded.value) {
                    Column(modifier = Modifier.padding(6.dp)) {
                        Text(text = "${exercise.name}",
                        fontSize = 26.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic)

                        Text(text = "${exercise.description}",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Light,
                        fontStyle = FontStyle.Italic)
                    }
                }
            }


        }

    }

}