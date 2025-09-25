package viikko1;


public class SortThree {
    public static String ascending(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int mid = a+b+c-max-min;
        
        return ""+min+","+mid+","+max;
    }
}
