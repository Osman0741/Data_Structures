package browserHistory;

public class BrowserHistoryApp {

    public static void main(String[] args) {
        BrowserHistory bh = new BrowserHistory("google.com");
        bh.visit("facebook.com");
        bh.visit("amazon.com");
        bh.visit("leetcode.com");
        bh.visit("codewars.com");
        System.out.println("Three steps back is "+ bh.back(3));
        System.out.println("Two steps forward is "+ bh.forward(2));
    }
}
