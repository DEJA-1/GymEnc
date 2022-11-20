package com.example.gymenc.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.gymenc.model.Exercise
import com.example.gymenc.model.getExercises
import com.example.gymenc.widgets.ExerciseRow

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun DetailsScreen(navController: NavController, categoryId: String?) {

    var newExerciseList: List<Exercise> = when (categoryId) {
        "chest" -> getExercises().filter { it.id.contains("c") }
        "back" -> getExercises().filter { it.id.contains("b") }
        "delts" -> getExercises().filter { it.id.contains("d") }
        "biceps" -> getExercises().filter { it.id.contains("bi") }
        "triceps" -> getExercises().filter { it.id.contains("t") }
        else -> getExercises().filter { it.id.contains("l") }
    }


    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = MaterialTheme.colors.background,
            elevation = 0.dp
        ) {

            Row(horizontalArrangement = Arrangement.Start) {
                Icon(imageVector = Icons.Default.ArrowBack,
                    tint = MaterialTheme.colors.primary,
                    contentDescription = "Back Arrow",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    })
            }

        }
    }) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF020122),
                            Color(0xFF131515)
                        )
                    )
                ),
            contentAlignment = Alignment.TopCenter
        ) {
            LazyColumn() {
                items(items = newExerciseList) {
                    ExerciseRow(exercise = it) {

                    }
                }
            }
        }
    }
}

