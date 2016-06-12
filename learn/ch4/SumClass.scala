class SumClass {
	private var sum = 0;
	def add(b :Byte ) : Unit = {
		sum += b
	}
	def checkSum(): Int = {
		return ~ (sum & 0xFF) +1 
	}
}

class SumClassSmall {
	private var sum = 0
	def add( b :Byte) : Unit = sum +=b
	def checkSum (): Int = ~(sum & 0xFF) + 1 
}

