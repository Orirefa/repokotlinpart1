fun main() {
    val user = setUser("Refa", "play games", 16)
    println(user)

    printUser("Refa")
}

fun setUser(name: String, hobby: String, age: Int) = "My name is $name, my hobby is $hobby, and I'm $age years old"
fun printUser(name:String) {
    println("My name is $name")
}