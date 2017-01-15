class MarsApplication{
    public static void main(String[] arguments){ //main method & named. Static keyword means the method is a class method shared by all MarsRobot obj.
        MarsRobot spirit = new MarsRobot(); //MarsRobot obj is created using the class as a template. The obj is named spirit.
        spirit.status = "exploring"; //instance variable
        spirit.speed = 2;           // instance variable
        spirit.temperature = -60;  //instance variable
        
        
        

       spirit.showAttributes(); //method of the spirit obj
       System.out.println("Increase speed to 3.");
       spirit.speed = 3;
       spirit.showAttributes();
       System.out.println("Changing temperature to -90.");
       spirit.temperature= -90;
       spirit.showAttributes();
       System.out.println("Checking the temperature.");
       spirit.checkTemperature(); //method of the spirit obj
       spirit.showAttributes(); //method of the spirit obj
       
       
      
       
    }
}