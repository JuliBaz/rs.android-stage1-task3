package subtask1

import kotlin.math.abs

class PolynomialConverter {

    // TODO: Complete the following function
    fun convertToStringFrom(numbers: Array<Int>):String?  {
        if (numbers.isEmpty())
            return null
             val result = StringBuilder()
        for (i in numbers.indices){
           if (numbers[i] == 0) continue
            when (i) {
                0-> {
                    result.append(numbers[i])
                    .append("x^")
                    .append(numbers.size-1)
                    .append(" ")
                }
               numbers.size-1->{
                   if (numbers[i] > 0)
                       result.append("+ ")
                   else
                       result.append("- ")
                   result.append(abs(numbers[i]))
               }
                else -> {
                    if (numbers[i] > 0)
                        result.append("+ ")
                    else
                        result.append("- ")
                    if (abs(numbers[i]) == 1)
                        result.append("x")
                    else
                        result.append(abs(numbers[i])).append("x")
                    if (i != numbers.size - 2)
                        result.append("^").append(numbers.size - 1 - i)
                    result.append(" ")
                }
            }

        }
        return result.toString()
    }
}
