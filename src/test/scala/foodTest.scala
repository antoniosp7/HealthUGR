import controllers.FoodController
import Food.Food

class testFood extends munit.FunSuite {

  var nutrients = List("test","test")
  var food = new Food(45, "test", nutrients)
  val foodController: FoodController = FoodController(food)
  
  test("addFood") {
    assert(foodController.addFood(3, "test", nutrients) != false)
  }
    
  
}