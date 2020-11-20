package controllers

import Food.Food

case class FoodController private(food: Food) {

    //In a future the food will be added to the database
    def addFood(calories: Int, description: String, nutrients: List[String]) : Boolean = {
        var food: Food = null
        var res = false
        if (description.length > 0 && calories > 0 && nutrients.size > 0 ){
            food = new Food(calories,description,nutrients)
            res = true
        }else {
            res = false
        }
        res
    }
  
}