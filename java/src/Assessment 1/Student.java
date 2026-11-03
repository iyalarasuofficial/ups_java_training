package Day8;

class studentInfo{
    int reg;
    String name;
    int m1,m2,m3,m4,m5;

    studentInfo(int reg,String name, int m1,int m2,int m3,int m4,int m5){
        this.reg=reg;
        this.name=name;
        this.m1=m1;
        this.m2=m2;this.m3=m3;this.m4=m4;this.m5=m5;

    }
    public void displayDetails(){
        System.out.println(reg);
        System.out.println(name);

        int total=m1+m2+m3+m4+m5;
        int avg= total/5;
        System.out.println("Total marks 5 sub"+total);
        System.out.println("Avg :"+avg);



                if(avg>=90){
                    System.out.println("Grade A");
                }
                else if(avg>=75){
                    System.out.println("Grade B");
                }
                else if(avg>=60){
                    System.out.println("Grade C");
                }
                else if(avg>=40){
                    System.out.println("Grade D");
                }
                else{
                    System.out.println("Grade F");
                }


    }

}

public class Student {





    public static void main(String[] args) {

        studentInfo s1= new studentInfo(101,"iyal",50,90,50,80,47);
        studentInfo s2= new studentInfo(102,"vijay",50,20,50,70,40);
        studentInfo s3= new studentInfo(103,"ajay",50,90,10,70,40);

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();


    }
}
