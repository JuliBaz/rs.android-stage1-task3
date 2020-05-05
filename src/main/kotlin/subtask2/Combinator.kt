package subtask2

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {
        var x = 1
        var c=0L
        val m = array[0]
        val n = array[1]
        while (x <= n) {
            c = factorial(n) / (factorial(x) * factorial(n - x))
            if ((c.toInt()!= m) && (x == n)){return null; break}
            if (c.toInt() == m) break
             else { c = 0; x++ }
        }
        return x
    }
}
fun factorial(a: Int):Long=if(a.toLong()<2L) 1L else a.toLong()* factorial(a-1)
