//Two Sum

fun twoNumberSum(array:MutableList<Int>,targetSum:Int):List<Int>{
    array.sort()
    var left = 0
    var right = array.size - 1
    while(left < right) {
        val currentSum = array[left] + array[right]
        if(currentSum == targetSum) {
            return listOf<Int>(array[left],array[right])
        } else if(currentSum < targetSum) {
            left++
        } else if(currentSum > targetSum) {
            right--
        }
    }
    return listOf<Int>()
}

fun main(args: Array<String>) {
    val output = twoNumberSum(mutableListOf<Int>(3,5,-4,8,11,1,-1,6), 10)
    print(output)
}