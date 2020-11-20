import Food.Food
import Exercise.Exercise

package record {
    class Record(var food: scala.collection.mutable.Map[Food,Int] = scala.collection.mutable.Map[Food,Int](),  var exercises: scala.collection.mutable.Map[Exercise,Int] = scala.collection.mutable.Map[Exercise,Int](), var caloriesConsumed: Int = 0, var caloriesSpent: Int = 0)
}

