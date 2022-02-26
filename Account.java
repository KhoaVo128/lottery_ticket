public class Account {
    private  long earned;
    private  long spent;

    public Account(){
        earned=100;
        spent=0;
    }

    public void setAccount(long spent, long earned){
        this.earned+=earned;
        this.spent+=spent;
    }

    

    public long Profit(){
        return earned-spent;
    }

}
