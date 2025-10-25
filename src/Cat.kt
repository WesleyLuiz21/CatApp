class Cat(val name: String, var age: Int, var weight: Int) {

    fun walk(times: Int = 1) {
        weight -= times
    }

    fun eat(times: Int = 1) {
        if (times >= 20 ){
            println("Error Cat is too fat")
            return
        } else {
            weight += times
        }
    }

    override fun toString(): String {
        return "Name: $name  Age: $age  Weight: $weight"
    }
}
