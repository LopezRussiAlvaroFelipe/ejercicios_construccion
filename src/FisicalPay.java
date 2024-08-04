public class FisicalPay implements Pay{
    private int counter;
    private int quantity;
    private boolean status;
    public void count(int quantity) {

        for (int i = 0; i < quantity; i++) {
            this.counter++;
        }



    }


    @Override
    public void makePay(double amount, int reference,boolean status) {
        count(this.quantity);
        if(reference<0){
            this.status=true;
            status=true;
        }


    }

    @Override
    public void payType(String type) {

    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
