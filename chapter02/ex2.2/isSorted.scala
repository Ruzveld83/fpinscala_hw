object IsSorted {

	// def orderedString(a: String, b: String): Boolean = a < b

	def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
		@annotation.tailrec
		def go(start: Int): Boolean = {
			if (start >= as.length) true	
			else ordered(as(start - 1), as(start)) && go(start + 1)
		}
		as.length < 2 || go(1)
	}

	def main(args: Array[String]): Unit = {
		println(s"args are ${if (!isSorted(args, (a: String, b: String) => a < b)) "not " else ""}sorted")
	}
}