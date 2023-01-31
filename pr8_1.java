class pr{
    public static void main(String[] args) {

        Triangle t =new Triangle();
        
        t.area(3.0, 3.0);
    }
}

class Rectangle {

    void area(Double l,Double w)
    {

        double array;
        array = l*w;

        System.out.println("Rectangle= "+array);

    }
 
}


class Triangle extends Rectangle{

    
    void area(Double l,Double b)
    {
        super.area(10.0,20.0);

        double array;
        array = (l*b)/2;

        System.out.println("Triangle= "+array);

    }

}



