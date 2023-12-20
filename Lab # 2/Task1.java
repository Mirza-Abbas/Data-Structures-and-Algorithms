class Rectangle{
    float Length=1;
    float Width=1;

    float Perimeter(){
        return (2*Length*Width);
    }
    float Area(){
        return(Length*Width);
    }

    void setLength(float L) {
        if (L > 0.0 && L < 20.0) {
            Length = L;
        }
        else {
            System.out.println("Incorrect Value" );
        }
    }

    void setWidth(float W) {
        if (W > 0.0 && W < 20.0) {
            Width = W;
        }
        else {
            System.out.println("Incorrect Value" );
        }
    }

    float getLength() {
        return Length;
    }

    float getWidth() {
        return Width;
    }
}

class Task1{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(5);
        r1.setWidth(5);

        System.out.println("Area of Rectangle: "+r1.Area());
        System.out.println("Perimeter of Rectangle: "+r1.Perimeter());
    }
}