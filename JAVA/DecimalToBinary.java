public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = Integer.parseInt(args[0]);
        boolean sizeChecker = false;
        int powers2 = 1;
        int arraySize = 1;
        
        while (!sizeChecker) {
            if (powers2 * 2 > decimal) {
                sizeChecker = true;
            } else {
                powers2 *= 2;
                arraySize++;
            }
        }
        
        int[] binary = new int[arraySize];
        String out = binaryFinder(binary, decimal, powers2);
        System.out.println(args[0] + " is equal to " + out);
    }
    
    //helper function
    public static String binaryFinder(int[] arr, int value, int binPower) {
        for (int i = 0; i < arr.length; i++) {
            if (value - binPower >= 0) {
                arr[i] = 1;
                value -= binPower;
                binPower /= 2;
            } else {
                arr[i] = 0;
                binPower /= 2;
            }
        }
        String out = "";
        for (int i = 0; i < arr.length; i++) {
            out += arr[i];
        }
        return out;
    }
}
