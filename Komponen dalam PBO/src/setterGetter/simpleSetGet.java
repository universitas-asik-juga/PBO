package setterGetter;
public class simpleSetGet {
    int angka, angka1;
    
    void setAngka(int angka){
        this.angka = angka;
    }
    
    int getAngka(){
        return this.angka;
    }
    
    void setAngka1(int angka1){
        this.angka1 = angka1;
    }
    
    int getAngka1(){
        return this.angka1;
    }
    
    public static void main(String args[]){
        simpleSetGet ssg = new simpleSetGet();
        
        ssg.setAngka(12);
        ssg.setAngka1(21);
        
        System.out.println(ssg.getAngka());
        System.out.println(ssg.getAngka1());
    }
}
