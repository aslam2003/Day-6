package hello;

	class Number {
	    int value;

	    Number(int value) {
	        this.value = value;
	    }
	

	void modifyValue(Number num) {
	    num = new Number(100);  // Reassigning the parameter
	}

	public static void main(String[] args) {
	    Number num = new Number(50);
	    num.modifyValue(num);  // Passing argument by value
	    System.out.println(num.value);  // Output: 50
	}

}
