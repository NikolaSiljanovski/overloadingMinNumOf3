class MinNum {
    int min;

    void minFun(int n1, int n2) {		 // method - min of two numbers
        min = n1; 						// assumed min
        if (min > n2) {
            min = n2;
        }
        System.out.println("Od broevite " + n1 + " i " + n2 + " pomal e " + min);
    }

    void minFun(int n1, int n2, int n3) { // method - min of three numbers
        min = n1; 							// assumed min
        if (min > n2) {
            min = n2;
        }
        if (min > n3) {
            min = n3;
        }
        System.out.println("Od broevite " + n1 + ", " + n2 + ", " + n3 + " najmal e " + min);
    }

    public static void main(String[] args) {
        MinNum najmal = new MinNum();  					// creating object
        najmal.minFun(10, 3);
        najmal.minFun(10, 14, 330);
    }
}