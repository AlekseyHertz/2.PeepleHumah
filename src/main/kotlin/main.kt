fun main () {
    val scoreMen = 629
    val even : String = "людям" // четные
    val odd : String = "человекам"// не четные
    var likes : String = if (scoreMen%2 === 0) {
        even
    } else {
        odd
    }
    
    println("Понравилось $scoreMen " + likes)
}