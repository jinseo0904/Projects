public class BinaryToDecimal {
    public static void main(String[] args) {
        String input = args[0];
        int output = 0;
        int[] binary = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() - 1) {
                binary[i] = Integer.parseInt(input.substring(i));
            } else {
                binary[i] = Integer.parseInt(input.substring(i, i + 1));
            }
        }
        
        for (int i = 0; i < binary.length; i++) {
            output += binary[i] * Math.pow(2, binary.length - (i + 1));
        }
        
        System.out.println(args[0] + " is equal to " + output);
    }
}