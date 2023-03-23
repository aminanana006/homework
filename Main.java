public class Main {
    public static void main(String[] args) {
        int adultCount = 9;
        int childCount = 11;
        int pensionerCount = 5;

        int adultPrice = new AdultTicket().getPrice();
        int childPrice = new ChildTicket().getPrice();
        int pensionerPrice = new PensionerTicket().getPrice();

        int totalAdultPrice = adultCount * adultPrice;
        int totalChildPrice = childCount * childPrice;
        int totalPensionerPrice = (int) ((pensionerCount * pensionerPrice) * 0.7);

        int totalPrice = totalAdultPrice + totalChildPrice + totalPensionerPrice;
        System.out.println("Total price of tickets: " + totalPrice);
    }
}

class AdultTicket {
    private int price = 70;

    public int getPrice() {
        return price;
    }
}

class ChildTicket {
    private int price = 35;

    public int getPrice() {
        return price;
    }
}

class PensionerTicket {
    private int price = 49;

    public int getPrice() {
        return price;
    }
}
