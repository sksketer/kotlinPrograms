fun main(){
    var name: String = "sketer"
    var age: Int = 20
    val space: String =" "
    val msg: String = "Happy BirthDay"

    println(msg+space+name)
    printCake(age, name)

}
fun printCake(age: Int, name: String){
    printCandles(age)
    printTop(age)
    printBase(age, name)
}
fun printCandles(age: Int){
    print(" ")
    repeat(age){
        print(".")
    }
    println(" ")
    print(" ")
    repeat(age){
        print("|")
    }
    println(" ")
}
fun printTop(age: Int){
    repeat(age+2){
        print("=")
    }
    println()
}
fun printBase(age: Int, name: String){
    repeat(2){
        repeat(age+2){
            print("@")
        }
        println()
    }

    var len: Int = ((age-name.length)/2) + 1
    repeat(len){
        print("@")
    }
    print(name)
    repeat(len){
        print("@")
    }
    println()

    repeat(2){
        repeat(age+2){
            print("@")
        }
        println()
    }
}