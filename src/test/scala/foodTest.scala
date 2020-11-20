import controllers.FoodController
import Food.Food

class testFood extends munit.FunSuite {

  var nutrients = List("test","test")
  var nutrientsEmpty = List()
  var food = new Food(45, "test", nutrients)
  val foodController: FoodController = FoodController(food)
  
  test("addFood") {
    assert(clue(foodController.addFood(3, "test", nutrients)) == clue(true))
  }

  test("addFoodEmptyNutrients") {
    assert(clue(foodController.addFood(3, "test", nutrientsEmpty)) == clue(false))
  }

   test("addFood0Calories") {
    assert(clue(foodController.addFood(0, "test", nutrients)) == clue(false))
  }

   test("addFoodEmptyDescription") {
    assert(clue(foodController.addFood(3, "", nutrients)) == clue(false))
  }
    
  
}