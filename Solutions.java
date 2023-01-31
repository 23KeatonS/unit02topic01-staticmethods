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



    public static boolean odd(boolean a, boolean b, boolean c){
        int trueCount = 0;
        if (a){
            trueCount ++;
        }
        if (b){
            trueCount ++;
        }
        if (c){
            trueCount ++;
        }
        if (trueCount%2==1){
            return true;
        }else{
            return false;
        }

    }


    /* 
    public static boolean majority(boolean a, boolean b, boolean c){
        
        int trueCount = 0;
        boolean [] argList = new boolean[3];
        argList[0] = a;
        argList[1] = b;
        argList[2] = c;
        for (int i = 0; i<argList.length;i++){
            if (argList[i]==true){
                trueCount++;
            }
        }
        return trueCount >= 2;
    }
*/
    public static boolean majority(boolean a, boolean b, boolean c){
        boolean statement = ((a&&b) || (a&&c) || (c&&b));

        
        
        return statement;

    }



    public static double trigIdentity(double a){
        double result = Math.pow(Math.sin(a),2) + Math.pow(Math.cos(a),2);
        return result;
        
    }


    
    
    public static void main(String[] args) {
        System.out.println(max3(2,-5,3));
        System.out.println(max3(2.0,5.3,5.3000001));
        System.out.println(odd(false, false, false));
        System.out.println(majority(false, false, false));
        System.out.println(trigIdentity(5));
    }
}



//javac Solutions.java; java Solutions