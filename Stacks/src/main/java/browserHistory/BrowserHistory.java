package browserHistory;

import java.util.Deque;
import java.util.LinkedList;

public class BrowserHistory {

    Deque<String> historyStack = new LinkedList<>();
    Deque<String> forwardStack = new LinkedList<>();
    String currentPage;

    public BrowserHistory(String currentPage) {
        this.currentPage = currentPage;
    }

    public void visit(String url){

        historyStack.push(currentPage);
        currentPage=url;
        forwardStack.clear();
    }

    public String back(int steps){
        int counter=steps;
        while(!historyStack.isEmpty() && counter>0){
            forwardStack.push(currentPage);
            currentPage=historyStack.pop();
            counter--;
        }
        return currentPage;
    }
    public String forward(int steps){
        int counter=steps;
        while(!historyStack.isEmpty() && counter>0){
            historyStack.push(currentPage);
            currentPage=forwardStack.pop();
            counter--;
        }
        return currentPage;
    }
}
