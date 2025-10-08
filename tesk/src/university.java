public class university {
    String name;
    String adress;
    int year;


    public university(String name,String adress,int year){
        this.name = name;
        this.adress = adress;
        this.year = year;
    }

      public void showuniversityDetail(){
        System.out.println("university name is " + name);
          System.out.println("university address " + adress);
          System.out.println("opened year " + year );

      }
}
