package viikko1;

public class NumberProperties {
    public static String describe(int n) {

    if(n>0 && n% 2==0){
            return "positiivinen parillinen";
        }
        else if(n>0 && n%2==1){
            return "positiivinen pariton";
        }
        else if(n<0 && n%2==0){
            return "negatiivinen parillinen";
        }
        else if(n<0 && n%2==-1){
            return "negatiivinen pariton";
        }
        else  { 
            return "nolla";
        }
        
        
    }
}
