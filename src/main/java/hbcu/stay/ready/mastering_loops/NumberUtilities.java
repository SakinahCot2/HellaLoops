package hbcu.stay.ready.mastering_loops;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String response = " ";
        for(int i = start; i < stop; i++){
            if((i%2) == 0){
                response += "" + i;
            }
        }
        return response;
    }


    public static String getOddNumbers(int start, int stop) {
        String response = " ";
        for(int i = start; i < stop; i++){
            if ((i%2) == 1){
                response += "" + i;
            }

        }
        return response;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String response = "";
        for(int i = start; i < stop; i+=step){
            int squared = i*i;
            response += ""+squared;
        }
        return response;
    }

    public static String getRange(int stop) {
        String response = "";
        for(int i = 0; i < stop; i++){
            response += "" +i;
        }
        return response;
    }

    public static String getRange(int start, int stop) {
        String response = "";
        for(int i = start; i < stop; i++){
            response += ""+ i;
        }

        return response;
    }


    public static String getRange(int start, int stop, int step) {
        String response = "";
        for (int i = start; i < stop; i+=step){
            response +="" + i;
        }
        return response;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String response = "";
        for(int i = start; i < stop; i+=step){
            double squared = Math.pow(i,exponent);
            int expo = (int) squared;
            response += ""+expo;
        }
        return response;
    }
}
