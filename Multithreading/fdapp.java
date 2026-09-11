class OrderPlacement extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Order Placement: Order #" + i + " placed.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OrderDelivery extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(1500); // delivery takes a bit longer than placement
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Order Delivery: Order #" + i + " delivered.");
        }
    }
}

public class fdapp {
    public static void main(String[] args) {
        OrderPlacement placement = new OrderPlacement();
        OrderDelivery delivery = new OrderDelivery();

        placement.start();
        delivery.start();
    }
}