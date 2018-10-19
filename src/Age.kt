import java.util.*

fun main(args: Array<String>){
    print("Please enter year of birth: ")
    var dob: Int = readLine()!!.toInt()

    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age = year - dob

    println("Your age is: $age years")
}