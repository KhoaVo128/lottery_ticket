
import java.util.Scanner;
public class lottery {
    static int ticket_price=10;
    static Ticket prize_ticket=new Ticket();
    public static void main(String[] args){
        Ticket prize_ticket=new Ticket(1+(int)(Math.random()*49),1+(int)(Math.random()*49), 1+(int)(Math.random()*49),
        1+(int)(Math.random()*49),1+(int)(Math.random()*49), 1+(int)(Math.random()*49));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of ticket you want to buy: ");
        int tick_quantity=sc.nextInt();
        //int moneySpent=10*tick_quantity;
        //int reward=0;
        Ticket boughtTicket[]=new Ticket[tick_quantity];
        Account acc=new Account();
        acc.setAccount(ticket_price*tick_quantity,0);
        System.out.println("Do you want to pick your own tickets ?(yes/no)");
        String choice=sc.next();
        switch (choice){
            case "yes":
                for(int i=0;i<tick_quantity;i++){
                    System.out.printf("Enter ticket %d's information: ",i+1);
                    int first=sc.nextInt();
                    int sec=sc.nextInt();
                    int third=sc.nextInt();
                    int fourth=sc.nextInt();
                    int fifth=sc.nextInt();
                    int sixth=sc.nextInt();
                    boughtTicket[i]=new Ticket(first, sec, third, fourth, fifth, sixth);
                }
                break;
            case "no":
            for(int i=0;i<tick_quantity;i++){
                boughtTicket[i]=new Ticket(1+(int)(Math.random()*49),1+(int)(Math.random()*49), 1+(int)(Math.random()*49),
                1+(int)(Math.random()*49),1+(int)(Math.random()*49), 1+(int)(Math.random()*49));
            }
                break;
            default:
                break;
        }
        //int profit=-moneySpent+reward;
        System.out.printf("--------RESULT--------\n");
        System.out.print("THE PRIZE TICKET IS: ");
        prize_ticket.display();
        for(int i=0;i<tick_quantity;i++){
            //System.out.print("Ticket information: ");
            //boughtTicket[i].display();
            //System.out.println("Number matched: "+boughtTicket[i].number_Matched(prize_ticket));
            //System.out.println("You've won: $"+boughtTicket[i].prize_earned(prize_ticket));
            acc.setAccount(0, boughtTicket[i].prize_earned(prize_ticket));
            
        }
        System.out.println("TOTAL PROFIT [WIN (+)/LOSE(-)]: $"+acc.Profit());
        System.gc();
        sc.close();
        
    }
}
