package com.java21days;

    public class investment{
        public static void main(String[] arguments) {
            
           float invest = 14000;
            double incrValue = 0.40; // could be expressed as .4F
            int decrValue = 1500; //could be expressed as 1500F
            int year = 2017;
            
            System.out.print(year);
            System.out.println(" Initial Investment is $" + invest );
            year++;
            System.out.print(year);
            invest= (int) (invest + (invest * incrValue));
            System.out.println(" First year value is $" + invest );
            year++;
            invest= invest - decrValue;
            System.out.print(year);
             System.out.println(" Second year value is $" + invest );
             year++;
             invest = invest + (invest * .12F); //expressed as a decimal 12%
             System.out.print(year);
             System.out.println(" Third year value is $" + invest );
            
           
//              . Create a program that calculates how much a $14,000 investment 
//                      would be worth if it increased in value by 40% during the
//                              first year, lost $1,500 in value the second year, 
//                              and increased 12% in the third year.  
            
        }  
        }