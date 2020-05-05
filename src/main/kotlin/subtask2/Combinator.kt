package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var x = 0
        var c=0
        val m = array[0]
        val n = array[1]
        while (x <= n) {
            c = factorial(n) / (factorial(x) * factorial(n - x))
            if ((c!= m) && (x == n)){return null; break}
            if (c == m) break
             else { c = 0; x++ }
        }
        return x
    }
}
fun factorial(a: Int):Int=if(a<2) 1 else a* factorial(a-1)