public class Printer {

    private int paper;
    private int toner;

    public Printer(){
        this.paper = 100;
        this.toner = 100;
    }

    public int getPaper(){
        return this.paper;
    }

    public void print(int pages, int copies) {
        int totalPaper = pages * copies;
        if(this.paper >= totalPaper && this.toner >= totalPaper) {
            this.paper -= totalPaper;
            this.toner -= totalPaper;
        }
    }

    public void fillPaper() {
        this.paper = 100;
    }

    public int getToner() {
        return this.toner;
    }


}
