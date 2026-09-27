fun main(){
    val num = arrayOf(1,2,3,4,5)
    var max =  num[0]
    for(n in num){
        if(n > max){
            max = n
        }
    }
    println(" the largest number in the given array is : $max")
}



