package kotlin.main

abstract class Person(val firstName:String, val lastName:String){

}

class Visitors(firstName: String, lastName:String, val menu: Menu):
    Person(firstName, lastName){

    fun order(){
        println("Замовлення страв та напоїв")
    }

    fun payment(){
       println("Можна рахунок")
    }
}

open class Personnel(firstName: String, lastName:String, val position:String, val salary:Int):
    Person(firstName, lastName){

}

class Cooks(firstName: String, lastName:String, position:String, salary:Int):
    Personnel(firstName, lastName, position, salary){

    fun cooking(){
        println("Приготуй їжу")

    }
}

class Waiters(firstName: String, lastName:String, position:String, salary:Int, val menu: Menu):
    Personnel(firstName, lastName, position, salary){

    fun orderAcceptance(){
        println("Список замовлення від відвідувача")

    }

    fun calculation(){
        println("Можна вас розрахувати")

    }
}

class Administrator(firstName: String, lastName:String, position:String, salary:Int, val visitors: Visitors):
    Personnel(firstName, lastName, position, salary){

    fun meetingGuests(){
        println("Проходьте до столику")
    }

    fun reservation(){
        println("Бронювання столику")
    }
}