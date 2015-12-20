object Fib {

	def fib(n: Int): Long = {
		@annotation.tailrec
		def go(cur: Int, second: Long, first: Long): Long = {
			if (cur <= 0) second
			else if (cur == 1) first
			else go(cur - 1, first, second + first)
		}
		go(n, 0, 1)
	}

	def main(args: Array[String]): Unit = {
		val n = args(0).toInt
		println(s"Fib($n) = ${fib(n)}")
	}
}