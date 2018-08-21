public class CenturyFromYear {

    public static void main(String[]args){
        System.out.print(century(89));
    }

    /**
     * The first century spans from the year 1 up to and including the year 100, The second - from the year 101 up to and including the year 200, etc.
     *
     * Task :
     * Given a year, return the century it is in.
     * @param number
     * @return
     */
    static int century(int number){
        return number%100==0?number/100:number/100+1;
    }
}
