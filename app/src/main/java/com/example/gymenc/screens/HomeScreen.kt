package com.example.gymenc.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.gymenc.model.Exercise
import com.example.gymenc.model.getCategories
import com.example.gymenc.navigation.Screens
import com.example.gymenc.widgets.CategoryRow

@Composable
fun HomeScreen(navController: NavController,
exerciseCategoriesList: List<Exercise> = getCategories()
) {

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

        
        Column(modifier = Modifier.padding(top = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {

            Text(
                modifier = Modifier.padding(top = 120.dp),
                text = "Gym Enc",
                fontSize = 64.sp,
                fontWeight = FontWeight.ExtraBold,
                fontStyle = FontStyle.Italic,
                color = Color(0xFFE8C547),
                style = MaterialTheme.typography.h4.copy(
                    shadow = Shadow(
                        color = Color.Black,
                        offset = Offset(8f, 8f),
                        blurRadius = 8f
                    )
                )
            )

            Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 70.dp)) {
                LazyVerticalGrid(
                    columns = GridCells.Fixed(3)) {

                    items(items = exerciseCategoriesList) {
                        CategoryRow(exercise = it) { category ->
                            navController.navigate(route = Screens.DetailsScreen.name + "/$category")
                        }
                    }
                }
            }


        }
//
//            Row() {
//
//                MainCard(text = "C\nH\nE\nS\nT") {
//                    navController.navigate(Screens.DetailsScreen.name)
//                }
//
//                Spacer(modifier = Modifier.width(16.dp))
//
//                MainCard(text = "B\nA\nC\nK") {
//                    navController.navigate(Screens.DetailsScreen.name)
//                }
//
//                Spacer(modifier = Modifier.width(16.dp))
//
//                MainCard(text = "D\nE\nL\nT\nS") {
//                    navController.navigate(Screens.DetailsScreen.name)
//                }
//            }
//
//            Column() {
//                Row() {
//
//                    MainCard(text = "B\nI\nC\nE\nP\nS") {
//                        navController.navigate(Screens.DetailsScreen.name)
//                    }
//
//                    Spacer(modifier = Modifier.width(16.dp))
//
//                    MainCard(
//                        text = "T\nR\nI\nC\nE\nP\nS",
//                        fontSize = 17.sp) {
//                        navController.navigate(Screens.DetailsScreen.name)
//                    }
//
//                    Spacer(modifier = Modifier.width(16.dp))
//
//                    MainCard(text = "L\nE\nG\nS") {
//                        navController.navigate(Screens.DetailsScreen.name)
//                    }
//                }
//
//            }
//        }
    }

}

@Composable
private fun MainCard(modifier: Modifier = Modifier, text: String, fontSize: TextUnit = 20.sp,
    onClick: () -> Unit = {}) {
    Card(
        modifier = modifier
            .width(80.dp)
            .height(210.dp)
            .padding(top = 40.dp, end = 24.dp)
            .shadow(4.dp, ambientColor = Color.White)
            .clickable {
                onClick()
            },
        shape = RoundedCornerShape(32.dp),
        backgroundColor = Color(0xFFE8C547),
        elevation = 15.dp,
        border = BorderStroke(2.dp, Color(0xFF1F0322))
    ) {

        Box(contentAlignment = Alignment.Center, modifier = Modifier
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFFE8C547),
                            Color(0xFFb34700)
                        )
                    )
                )
        ) {

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Text(
                    text = text,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = fontSize,
                    color = Color.White,
                    style = MaterialTheme.typography.h4.copy(
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(4f, 4f),
                            blurRadius = 8f
                        )
                    )
                )
            }

        }

    }
}
