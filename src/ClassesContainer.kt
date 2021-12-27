class CarClass(val make: String, val model: String, val fuelTank: Int = 20) {
    fun  checkOffRoad(): Boolean{
        if (fuelTank >= 20){
            return true
        }
        return  false
    }

    fun startEngine(): String{
        return "Vroom Vroom + Torque"
    }

    fun details(): String{
        return "$make $model"
    }
}

open class Person(val name: String, var age: Int){
    fun details(): String{
        return "name: $name \nage: $age"
    }

    fun checkIfAdult(): Boolean{
        if (age > 18){
            return true
        }
        return false
    }

    open fun checkDNA(): String{
        return "Human DNA"
    }
}

class SuperHero(name: String, age: Int, var power: String, var alias: String, var powerLevel: Int): Person(name, age){
    fun getSuperHeroDetails(): String{
        return "alias: $alias \npowers: $power \n${getPowerLevel()}"
    }

    override fun checkDNA(): String {
        return "Mutated Human DNA"
    }

    fun getPowerLevel(): String{
        if (powerLevel <= 200){
            return "Zero Level"
        } else if (powerLevel in 201..500){
            return "Mortal level"
        } else if (powerLevel in 501..700){
            return "Angel level"
        } else if (powerLevel in 701..800){
            return "Stellar level"
        }
        return "God level"
    }
}