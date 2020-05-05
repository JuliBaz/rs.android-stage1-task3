package subtask4

import kotlin.math.sqrt

class SquareDecomposer {

    // TODO: Complete the following function
    fun decomposeNumber(number: Int): Array<Int>? {
        if (number<=4) return null
        return recursion(number*number, number - 1)
    }
    fun recursion(value:Int,konec:Int): Array<Int>? {
        for (i in konec downTo 1){
            val square = i*i
            val difference = value - square
            if (difference==0){
                return arrayOf(i)
            }
            if (difference<0){
                return null
            }
            var sqrt = sqrt(difference.toDouble()).toInt()
            if(sqrt>=i) sqrt = i-1
            var chast = recursion(difference,sqrt)
            if(chast!=null)  return chast+ arrayOf(i)
        }
        return null
    }

    }
