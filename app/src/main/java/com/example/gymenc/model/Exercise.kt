package com.example.gymenc.model

data class Exercise(
    val id: String,
    val name: String,
    val images: List<String>
)

fun getExercises(): List<Exercise> {

    return listOf(
        Exercise(
            id = "c1",
            name = "Dumbbell Bench Press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/dumbbell-bench-press-1000x1000.jpg")
        )
    )

}

fun getCategories(): List<Exercise> {
    return listOf(
        Exercise(
            id = "chest",
            name = "Chest",
            images = listOf("https://visualpharm.com/assets/414/Chest-595b40b75ba036ed117d7aed.svg")
        ),

        Exercise(
            id = "back",
            name = "Back",
            images = listOf("https://visualpharm.com/assets/929/Back%20Muscles-595b40b75ba036ed117d9137.svg")
        ),

        Exercise(
            id = "delts",
            name = "Delts",
            images = listOf("https://visualpharm.com/assets/57/Shoulders-595b40b85ba036ed117dba91.svg")
        ),

        Exercise(
            id = "biceps",
            name = "Biceps",
            images = listOf("https://visualpharm.com/assets/406/Flex%20Biceps-595b40b75ba036ed117d9580.svg")
        ),

        Exercise(
            id = "triceps",
            name = "Triceps",
            images = listOf("https://visualpharm.com/assets/568/Flex%20Biceps-595b40b85ba036ed117dd248.svg")
        ),

        Exercise(
            id = "legs",
            name = "Legs",
            images = listOf("https://visualpharm.com/assets/378/Leg-595b40b75ba036ed117d97ed.svg")
        )
    )
}
