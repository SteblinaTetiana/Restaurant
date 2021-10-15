package kotlin.main


open class Menu(val name:String, val storage:String, val price:Int){

    val menuFood = mutableListOf<Food>()
    val menuDrink = mutableListOf<Drinks>()

}

class Food(name:String, storage:String, price:Int, val mass:Int, val type:String ):
    Menu(name, storage, price){

}

class Drinks(name:String, storage:String, price:Int, val volume:Int, val alcoholContent:Boolean):
    Menu(name, storage, price){

}