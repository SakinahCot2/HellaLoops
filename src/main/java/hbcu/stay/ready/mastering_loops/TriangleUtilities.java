package hbcu.stay.ready.mastering_loops;

public class TriangleUtilities {

    public static String getTriangle(int numberOfStars) {
        String response = "";
        int i = 0;
        int count = 0;
        while(i < numberOfStars){
            if(count <=i){
                response+="*";
                count++;
            }
            else if((i+1) == numberOfStars){
                break;
            }
            else {
                response+="\n";
                count = 0;
                i++;
            }
        }
        return response;
    }

    public static String getRow(int numberOfRows) {
        int i = 0;
        String response = "";
        while(i< numberOfRows){
            response += "*";
            i++;

        }
        return response;
    }

    public static String getSmallTriangle() {
        int small = 4;
        String response = "";
        int i = 0;
        int count = 0;
        while(i < small){
            if(count <=i){
                response+="*";
                count++;
            }
            else if((i+1) == small){
                break;
            }
            else {
                response+="\n";
                count = 0;
                i++;
            }
        }
        return response;
    }

    public static String getLargeTriangle() {
        String response = "";
        int large = 9;
        int i = 0;
        int count = 0;
        while(i < large){
            if(count <=i){
                response+="*";
                count++;
            }
            else if((i+1) == large){
                break;
            }
            else {
                response+="\n";
                count = 0;
                i++;
            }
        }
        return response;
    }
}
