package classObjectAttributes;

//class
public class Main {
    //attribute
    int angka = 1;
    
    public static void main(String args[]){
//        //object pertama
//        Main obj = new Main();
//        
//        //object ke 2
//        Main obj1 = new Main();
//        
//        
//        System.out.println("angka dari objek pertama : " + obj.angka);
//        System.out.println("angka dari objek kedua : " + obj1.angka);
        
        //objek ke 3
        simpleAttributes SA = new simpleAttributes();
        
        System.out.println("angka dari objek ketiga : " + SA.angka);
        SA.angka = 12;
        System.out.println("angka dari objek ketiga : " + SA.angka);
        
        System.out.println("angka dari objek ketiga : " + SA.kata);
        SA.kata = "kata siapa";
        System.out.println("angka dari objek ketiga : " + SA.kata);
//        
//        System.out.println("angka dari objek ketiga : " + SA.kataYang);
//        SA.kataYang = "tak ubah";
//        System.out.println("angka dari objek ketiga : " + SA.kataYang);
    }
}
