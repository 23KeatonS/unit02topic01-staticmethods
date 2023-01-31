public class Solutions {
    
    public static int max3(int a, int b, int c){
        int [] numList = new int[3];
        numList[0] = a;
        numList[1] = b;
        numList[2] = c;
        int maxvalue = numList[0];
        for (int i = 0; i<numList.length;i++){
            if (maxvalue < numList[i]){
                maxvalue = numList[i];
            }
        }
        return(maxvalue);
    }

    public static double max3(double a, double b, double c){
        double [] numList = new double[3];
        numList[0] = a;
        numList[1] = b;
        numList[2] = c;
        double maxvalue = numList[0];
        for (int i = 0; i<numList.length;i++){
            if (maxvalue < numList[i]){
                maxvalue = numList[i];
            }
        }
        return(maxvalue);
    }


    
    
    public static void main(String[] args) {
        System.out.println(max3(2,-5,3));
        System.out.println(max3(2.0,5.3,5.3000001));
    }
}



//javac Solutions.java; java Solutions