public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a=5;
        int b=8;
        int sum= a+b;
        System.out.println(sum);

        String c= "sathya";
        String d= "technologies";

        String fullname= c+d;
        System.out.println(fullname);

        int e= 5;
        int square= e*e;
        int cube = square* e;
        System.out.println(square);
        System.out.println(cube);

        int f=5;
        int squre= f * f;
        int cub= square *f;
        int total = squre +cub;
        System.out.println(total);

        int radius=5;
        float pi= 3.14f;
        float area = pi *radius ;
        float perimeter = 2 * pi * radius;
        System.out.println(area);
        System.out.println(perimeter);

        int length= 5;
        int breadth= 3;
        int areaa = length * breadth;
        int perimeterr= 2*(length+breadth);
        System.out.println(areaa);
        System.out.println(perimeterr);

        int sideofsquare = 5;
        int areaofsqaure= sideofsquare*sideofsquare;
        int perimeterofsqaure= 4*sideofsquare;
        System.out.println(areaofsqaure);
        System.out.println(perimeterofsqaure);

        int principlevalue= 1000;
        int rateofinterest= 15;
        int timeperiod= 5;
        int simpleinterest = (principlevalue*rateofinterest*timeperiod)/100;
        int totalamount = principlevalue + simpleinterest;
        System.out.println(totalamount);

        int netprice= 230;
        int gstamount=30;
        int originalcost= netprice-gstamount;
        System.out.println(originalcost);

        int basicsalary=10000;
        float hraamount = 0.3f * basicsalary;
        float daamount = 0.1f * basicsalary;
        float totalsalary= basicsalary+ hraamount + daamount;
        System.out.println(totalsalary);

        int sub1=60;
        int sub2=70;
        int sub3=80;
        int totalmarks=sub1+sub2+sub3;
        int Avg= totalmarks/3;
        System.out.println(totalmarks);
        System.out.println(Avg);

        int basicsal= 10000;
        int providentfund= 2000;
        int professionaltax= 200;
        float hraamountt= 0.3f * basicsal;
        float daamountt= 0.1f* basicsal;
        float grosssalary= basicsal+ hraamountt+ daamountt;
        float incometax= 0.1f*basicsal;
        float netsalary= grosssalary-(providentfund+ professionaltax+incometax);
        System.out.println(netsalary);
        System.out.println(grosssalary);

        int days= 500;
        int years= days/365;
        int month= (days%365)/12;
        int x1= days- (years*365);
        int weeks = x1/7;
        int dayss = days - ((years*365)+ (weeks*7));
        System.out.println(years);
        System.out.println(month);
        System.out.println(weeks);
        System.out.println(dayss);

        int input = 100000;
        int numberOfDays;
        int numberOfHours;
        int numberOfMinutes;
        int numberOfSeconds;

        numberOfDays = input / 86400;
        input= input % 86400;
        numberOfHours = (input) / 3600 ;
        input= input % 3600;
        numberOfMinutes = (input) / 60;
        numberOfSeconds = (input) % 60;

        System.out.println(numberOfDays);
        System.out.println(numberOfHours);
        System.out.println(numberOfMinutes);
        System.out.println(numberOfSeconds);

        System.out.println("numberofdays :    "+ numberOfDays);
        System.out.println("numberOfHours :   " + numberOfHours);
        System.out.println("numberOfMinutes:  " + numberOfMinutes);
        System.out.println("numberOfSeconds:  "+numberOfSeconds);









    }
}