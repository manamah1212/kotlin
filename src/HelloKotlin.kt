fun main() {
    fun arrays() {
        //Array decloration
        //Array have fixed allocated memory

        var arrayA = arrayOf(1, 2, 3)
        var arrayB: Array<String> = emptyArray()


        //array list decloration

        var arrayListA = mutableListOf<Int>(1, 3, 5, 6, 7)
        var arrayListB: ArrayList<String> = arrayListOf()

        //Edit array values
        arrayA[0] = 0
        arrayA += 4
        arrayB += "Number one"

        //edit arraylist values

        arrayListA[1] = 50

        arrayA.forEach {
            println(it)
        }

        arrayListA.forEach {
            println(it)
        }

    }
}