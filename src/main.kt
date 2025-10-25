fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val Flathead = Cat("Flathead", 7, 10)
    val Cupra = Cat("Cupra", 2, 7)
    binnie.walk()
    clyde.walk()
    println(binnie)
    println(clyde)
    Flathead.eat(21)
    Cupra.walk(2)
    println(Flathead)
    println(Cupra)

}