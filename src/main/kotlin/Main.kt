fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    //diference between var and val
    var a=10
    println(a)
    val thisIs :Int
    thisIs=10
    println(thisIs)
    //thisIs=10
    println(thisIs)

    val count:Int
    //print(count)
    count=10
    print(count)
    //count=11
    //count=12


    //declaring object of a class
    val smartTvDevice = SmartDevice()
    print("This is an Smart ${smartTvDevice.category} Device named : ${smartTvDevice.name}")
    smartTvDevice.turnOnDevice()
    smartTvDevice.turnOffDevice()
    smartTvDevice.buyingStatus(100)
}