public class VendingMachine {
   private int cans, tokens;

    public int getCans() {
        return cans;
    }

    public int getTokens() {
        return tokens;
    }

    public VendingMachine(){
        this.cans = 0;
        this.tokens = 0;
    }

   public String toString(){
        return "Cans" +getCans()+ "\nTokens" +getTokens();
   }

   public boolean canChecker(){
        if(this.cans > 0)
            return true;
        else
            return false;
   }
   public void fillMachine(int can){
        this.cans += getCans() + can;
   }

   public void  buyCan(){
        if(canChecker()==true){
            cans--;
            tokens++;
        }
   }
}

