package com.lectures.l5_Oops;

public class part1 {

    public static class Rectangle{
        int x,y;
//        public Rectangle(int x,int y){
//            this.x = x;
//            this.y = y;
//        }
        public void setDimensions(int x,int y){
            this.x = x;
            this.y = y;
        }
        public void getDimensions(){
            System.out.println(this.x+" "+this.y);
        }
    }

    public static void main(String[] args) {

//      Rectangle rect=new Rectangle(1,2);
        Rectangle rect; //reference creation of type Rectangle
        rect = new Rectangle(); //now rect is referring the object of the rectangle
        rect.getDimensions();
        rect.setDimensions(3,4);
        rect.getDimensions();

//        rect=new Rectangle(5,6); //now rect is referring to new object not the previous once
        rect=new Rectangle();//by default if the constructor is not defined by the programmer then the default values will be 0
        rect.getDimensions();
    }
}
