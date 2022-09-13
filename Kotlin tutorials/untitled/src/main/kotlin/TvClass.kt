class SmartDevice {

    //defining class methods

    fun turnOnDevice()
    {
        println("\nDevice is turned on")
    }
    fun turnOffDevice(){
        println("Device is turned off")
    }

    //now add the properties of the SmartDevice
    val name="Android Tv"
    val category="Entertainment"
    val price:Int=10000;

    fun buyingStatus(budget:Int)
    {
        if(price<=budget)
        {
            print("Lele Lele")
        }
        else if(price>budget)
        {
            print("Aisa Keech Ke Lafa Dunga")
        }
    }
}