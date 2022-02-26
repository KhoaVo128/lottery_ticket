

public class Ticket{
    private int[] numInOrder=new int[6];
    public Ticket(){
    }
    public Ticket(int a, int b, int c, int d, int e, int f){
        numInOrder[0]=a;
        numInOrder[1]=b;
        numInOrder[2]=c;
        numInOrder[3]=d;
        numInOrder[4]=e;
        numInOrder[5]=f;
    }
    public void display(){
        //System.out.print("Ticket information: ");
        for(int i=0;i<6;i++){
            System.out.printf("%d ",numInOrder[i]);
        }
        System.out.printf("\n");
    }
    public int number_Matched(Ticket prize){
        int count=0;
        for(int i=0;i<6;i++){
            if(prize.numInOrder[i]==this.numInOrder[i]){
                count++;
            }
        }
        return count;
    }

    public long prize_earned(Ticket prize_Ticket){
        if(number_Matched(prize_Ticket)<=2 && number_Matched(prize_Ticket)>=1){
            return 10;
        }else if(number_Matched(prize_Ticket)==3){
            return 100;
        }else if(number_Matched(prize_Ticket)==4){
            return 1000;
        }else if(number_Matched(prize_Ticket)==5){
            return 5000;
        }else if(number_Matched(prize_Ticket)==6){
            return 5000000;
        }else{
            return 0;
        }
    }

    //public boolean exist()
}