package Restaurant;

public class Table {
    private int tableNo;
    private boolean isEmpty;

    public Table (){}
    public Table(int tableNo, boolean isEmpty) {
        this.tableNo = tableNo;
        this.isEmpty = isEmpty;
    }

    public int getTableNo() {
        return tableNo;
    }

    public void setTableNo(int tableNo) {
        this.tableNo = tableNo;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }


    public String toString2() {
        return tableNo+ "<N/>" + isEmpty;
    }

}
