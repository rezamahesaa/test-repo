import data.TravelData;

public class TravelMaster {
    public static void main(String[] args) {
        displayExpense(3);
        System.out.println();
        displayAllTravel();
        System.out.println("Edit Expense\n");
        updateExpense(3, 2, 100000, 100000, 100000, 300000);
        displayAllTravel();
        displayExpense(2);
    }

    public static void displayExpense(int empID){
        int jumlahData = 0;
        for (int[] i : TravelData.expenses) {
            if(i[0] == empID){
                jumlahData++;
            }
        }
        int[][] hasil = new int[jumlahData][1];
        int indexHasil = 0;
        for (int[] i : TravelData.expenses) {
            if(i[0] == empID){
                hasil[indexHasil] = i;
                indexHasil++;
            }
        }
        System.out.println(TravelData.employeeName[empID-1] + "\tHotel\tTransp\tOther\tTotal");
        for (int[] expense : hasil) {
            for (int i : expense) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static void displayAllTravel(){
        System.out.println("Emp ID\tHotel\tTransp\tOther\tTotal");
        for (int[] i : TravelData.expenses) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void updateExpense(int expenseID, int empID, int hotel, int transport, int other, int total){
        TravelData.expenses[expenseID][0] = empID;
        TravelData.expenses[expenseID][1] = hotel;
        TravelData.expenses[expenseID][2] = transport;
        TravelData.expenses[expenseID][3] = other;
        TravelData.expenses[expenseID][4] = total;
    }
}
