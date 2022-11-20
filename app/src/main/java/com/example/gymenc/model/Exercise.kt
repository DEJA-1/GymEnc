package com.example.gymenc.model

data class Exercise(
    val id: String,
    val name: String,
    val images: List<String>,
    val description: String = ""
)

fun getExercises(): List<Exercise> {

    return listOf(
        Exercise(
            id = "c1",
            name = "Dumbbell Bench Press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/dumbbell-bench-press-1000x1000.jpg"),
            description = "Main focus: chest"
        ),

        Exercise(
            id = "c2",
            name = "Push up",
            images = listOf("https://static.strengthlevel.com/images/illustrations/push-ups-1000x1000.jpg"),
            description = "Main focus: chest, triceps"
        ),

        Exercise(
            id = "c3",
            name = "Barbell Bench Press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/bench-press-1000x1000.jpg"),
            description = "Main focus: Chest"
        ),

        Exercise(
            id = "c4",
            name = "Incline Dumbbell Bench Press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/incline-dumbbell-bench-press-1000x1000.jpg"),
            description = "Main focus: upper chest"
        ),

        Exercise(
            id = "c5",
            name = "Machine Chest Press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/chest-press-1000x1000.jpg"),
            description = "Main focus: chest"
        ),

        Exercise(
            id = "c6",
            name = "Decline Dumbbell Press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/decline-dumbbell-bench-press-1000x1000.jpg"),
            description = "Main focus: lower chest"
        ),

        Exercise(
            id = "b1",
            name = "Bent-Over Row",
            images = listOf("https://static.strengthlevel.com/images/illustrations/bent-over-row-1-1000x1000.jpg"),
            description = "Main focus: back"
        ),

        Exercise(
            id = "b2",
            name = "Pull up",
            images = listOf("https://static.strengthlevel.com/images/illustrations/pull-ups-2-1000x1000.jpg"),
            description = "Main focus: lats"
        ),

        Exercise(
            id = "b3",
            name = "Seated Row",
            images = listOf("https://static.strengthlevel.com/images/illustrations/seated-cable-row-1000x1000.jpg"),
            description = "Main focus: upper back/lats"
        ),

        Exercise(
            id = "b4",
            name = "Lat Pull-Down",
            images = listOf("https://static.strengthlevel.com/images/illustrations/lat-pulldown-1000x1000.jpg"),
            description = "Main focus: upper back/lats"
        ),

        Exercise(
            id = "b5",
            name = "Single-Arm Dumbbell Row",
            images = listOf("https://static.strengthlevel.com/images/illustrations/dumbbell-row-1000x1000.jpg"),
            description = "Main focus: lats"
        ),

        Exercise(
            id = "d1",
            name = "Overhead press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/shoulder-press-1000x1000.jpg"),
            description = "Main focus: front delts"
        ),

        Exercise(
            id = "d2",
            name = "Seated Dumbbell Press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/dumbbell-shoulder-press-1000x1000.jpg"),
            description = "Main focus: front delts"
        ),

        Exercise(
            id = "d3",
            name = "Seated Overhead press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/seated-shoulder-press-1000x1000.jpg"),
            description = "Main focus: front delts"
        ),

        Exercise(
            id = "d4",
            name = "Dumbbell Lateral Raise",
            images = listOf("https://static.strengthlevel.com/images/illustrations/dumbbell-lateral-raise-1000x1000.jpg"),
            description = "Main focus: side delt"
        ),

        Exercise(
            id = "d5",
            name = "Face Pull",
            images = listOf("https://static.strengthlevel.com/images/illustrations/face-pull-1000x1000.jpg"),
            description = "Main focus: rear delt"
        ),

        Exercise(
            id = "bi1",
            name = "Chin Up",
            images = listOf("https://static.strengthlevel.com/images/illustrations/chin-ups-1-1000x1000.jpg"),
            description = "Main focus: biceps, lats"
        ),

        Exercise(
            id = "bi2",
            name = "EZ Bar Curl",
            images = listOf("https://static.strengthlevel.com/images/illustrations/ez-bar-curl-1000x1000.jpg"),
            description = "Main focus: biceps"
        ),

        Exercise(
            id = "bi3",
            name = "Dumbbell Curl",
            images = listOf("https://static.strengthlevel.com/images/illustrations/dumbbell-curl-2-1000x1000.jpg"),
            description = "Main focus: biceps"
        ),

        Exercise(
            id = "bi4",
            name = "Hammer Curl",
            images = listOf("https://static.strengthlevel.com/images/illustrations/hammer-curl-1000x1000.jpg"),
            description = "Main focus: forearm, biceps"
        ),

        Exercise(
            id = "t1",
            name = "Close Grip Bench Press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/close-grip-dumbbell-bench-press-1000x1000.jpg"),
            description = "Main focus: triceps"
        ),

        Exercise(
            id = "t2",
            name = "Cable Push Down",
            images = listOf("https://static.strengthlevel.com/images/illustrations/tricep-rope-pushdown-1000x1000.jpg"),
            description = "Main focus: lateral head"
        ),

        Exercise(
            id = "t3",
            name = "Dip",
            images = listOf("https://static.strengthlevel.com/images/illustrations/dips-1000x1000.jpg"),
            description = "Main focus: triceps, chest"
        ),

        Exercise(
            id = "t4",
            name = "Cable Overhead Extension",
            images = listOf("https://static.strengthlevel.com/images/illustrations/cable-overhead-tricep-extension-1000x1000.jpg"),
            description = "Main focus: triceps"
        ),

        Exercise(
            id = "t5",
            name = "Dumbbell Bench Press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/dumbbell-bench-press-1-1000x1000.jpg"),
            description = "Main focus: chest, triceps"
        ),

        Exercise(
            id = "l1",
            name = "Barbell Squat",
            images = listOf("https://static.strengthlevel.com/images/illustrations/squat-1000x1000.jpg"),
            description = "Main focus: quads, glutes"
        ),

        Exercise(
            id = "l2",
            name = "Barbell Front Squat",
            images = listOf("https://static.strengthlevel.com/images/illustrations/front-squat-1000x1000.jpg"),
            description = "Main focus: quads, glutes"
        ),

        Exercise(
            id = "l3",
            name = "Deadlift",
            images = listOf("https://static.strengthlevel.com/images/illustrations/deadlift-1-1000x1000.jpg"),
            description = "Main focus: hamstrings, glutes, quads"
        ),

        Exercise(
            id = "l4",
            name = "Romanian Deadlift",
            images = listOf("https://static.strengthlevel.com/images/illustrations/romanian-deadlift-1000x1000.jpg"),
            description = "Main focus: hamstrings, glutes"
        ),

        Exercise(
            id = "l5",
            name = "Leg Press",
            images = listOf("https://static.strengthlevel.com/images/illustrations/sled-leg-press-1000x1000.jpg"),
            description = "Main focus: quads, glutes"
        ),

        Exercise(
            id = "l6",
            name = "Standing Calf Raise",
            images = listOf("https://static.strengthlevel.com/images/illustrations/dumbbell-calf-raise-1000x1000.jpg"),
            description = "Main focus: calves"
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
