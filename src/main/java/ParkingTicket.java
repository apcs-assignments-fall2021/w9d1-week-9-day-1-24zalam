public class ParkingTicket {

    private int parkingspot;
    private int duration;
    private double fee;

    public ParkingTicket( int parkingspot,int duration, double fee) {
    fee= 65.00;


    }

    public void setDuration(int d) {
        this.duration = d;
    }

    public void setFee() {
        this.fee = fee*duration;
    }

    public void setParkingspot() { this.parkingspot=(int)(Math.random()*(100-1)) +1;}


    public int getParkingspot() {
        return this.parkingspot;
    }

   public int getDuration() {
        return this.duration;
   }

    public double getFee() {
        return this.fee;
    }

    public String toString() {
        return ("Your fee is" +fee+ "Because your duration was" +duration+ "hours. Your parking spot is:" + parkingspot);

    }

}


