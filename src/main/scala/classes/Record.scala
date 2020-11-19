import Food.Food
import Exercise.Exercise

package record {
    class Record(var food: Map[Food,Int], var exercises: Map[Exercise,Int], var caloriesConsumed: Int, var caloriesSpent: Int)
}

