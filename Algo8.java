public class Algo8 {
    public static void main(String[] args) {
        int[] numA = { 5, 7, -2, 3, 4, 6, -8 };
        int[] numB = { 7, 8, -8, 2, 1, -9, 6 };

        String output = "";

        for (int i = 0; i < numA.length; i++) {
            for (int j = 0; j < numB.length; j++) {
                if (numA[i] == numB[j]) {
                    output += numA[i] + ", ";
                    break;
                }
            }
        }
        output += "\b\b  ";

        // for (int i = 0; i < output.length(); i += 3) {
        //     for (int j = i + 3; j < output.length(); j += 3) {

        //         if (output.charAt(i) == output.charAt(j)) {

        //             output = output.substring(0, j) + output.substring(j + 3, output.length() - 1);
        //         }
        //     }
        // }
        System.out.println("Intersection for A & B : " + output);

        output = "";
        for (int i = 0; i < numA.length; i++) {
            output += numA[i] + ", ";
        }
        for (int i = 0; i < numB.length; i++) {
            output += numB[i] + ", ";
        }
        output += "\b\b  ";

        // for(int i =0;i<output.length();i+=3){
        // for(int j = i+3; j < output.length();j+=3){
        // System.out.println(output.charAt(i));
        // if(output.charAt(i)==output.charAt(j)){
        // //System.out.println(output.charAt(i));
        // System.out.println(output.charAt(j));
        // output = output.substring(0, j)+output.substring(j+3, output.length()-1);
        // }
        // }
        // }

        System.out.println("Union for A & B : " + output);

        // for()
    }
}
