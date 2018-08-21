public class Squares {

    public static void main(String[]args){
        System.out.print(isSquare(26));
    }

    public static boolean isSquare(int value){
        boolean valid=false;
        if(value<0)
            return false;
        for(int i=0;i<=value;i++){
            if(i*i==value){
                valid=true;
                break;
            }
        }
        return valid;
    }
}
