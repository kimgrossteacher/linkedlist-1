public class candyName {
    public static void main(String[] args) {

        linkedList candyList = new linkedList();
        candyList.push("candy1");
        candyList.push("candy2");
        candyList.push("candy3");

        System.out.println("Candy List:");
        System.out.println(candyList.pop());
        System.out.println(candyList.pop());
        System.out.println(candyList.pop());

        candyList.enQueue("candy1");
        candyList.enQueue("candy2");
        candyList.enQueue("candy3");

        System.out.println("Candy List:");
        System.out.println(candyList.deQueue());
        System.out.println(candyList.deQueue());
        System.out.println(candyList.deQueue());
    }
}