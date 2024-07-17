public class test1{
    public static void main(String[] args) {
        int[] arrBilangan = {1,2,3,4,5,6,7,8,9,10};
        int[] arr = hitungGanjilV2(arrBilangan);
        for (int i : arr) {
            System.out.println(i);
        }

        // System.out.println(person.display());
        person blud = new person();
        System.out.println(blud.display());

    }

    public static int hitungGanjil (int value){
        int hasil = 0;
        if(value % 2 == 1){
            hasil = 1;
        }
        return hasil;
    }


    public static int[] hitungGanjilV2(int[] bilanganBulat){
        int[] hasil = new int[bilanganBulat.length/2];
        int indexHasil = 0;
        for (int i : bilanganBulat) {
            if(i % 2 == 1){
                hasil[indexHasil] = i;
                indexHasil++;
            }
        }
        return hasil;
    }
}

class employee{
    public static String ola(){
        return "aku employee";
    }
}

class person{
    public String display(){
        return employee.ola();
    }
}
