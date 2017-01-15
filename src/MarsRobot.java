class MarsRobot {
    String status; //variable- String obj are created from the STRING class. A class can use an obj as an instance variable
    int speed; //variable
    float temperature; //variable
    
    void checkTemperature() {  //instance method
        if (temperature < -80){  //if this condition is met, the 2 variables change
            status = "returning home";
            speed = 5;
        }
    
    }
    void showAttributes(){ //instance method
        System.out.println("Status:" + status);
        System.out.println("Speed:" + speed);
        System.out.println("Temperature:" + temperature); 
        
//        System.out.println is a method.
    }

}