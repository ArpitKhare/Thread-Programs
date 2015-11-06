/**
 * Created by arpitkhare on 10/24/15.
 */
public class TotalTickets {

    int tkt=10;

/*
    public TotalTickets(int t){
        this.tkt = t;
    }
    public TotalTickets(){}

    public int getTkt() {
        System.out.println("getTkt: "+tkt);
        return tkt;
    }

    public void setTkt(int tkt) {
        System.out.println("tkt:::::: " + tkt);
        this.tkt = tkt;
    }
*/


    void m(int buy) {

synchronized (this) {
    tkt = tkt - buy;
}


        System.out.println("Total tkts left: "+tkt);

    }
}
