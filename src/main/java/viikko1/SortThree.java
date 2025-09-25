package viikko1;


public class SortThree {
    public static String ascending(int a, int b, int c) {
        double max = Math.max(a, Math.max(b, c));
        double min = Math.min(a, Math.min(b, c));
        double mid = a+b+c-max-min;
        
        return ""+min+","+mid+","+max;
    }
}
