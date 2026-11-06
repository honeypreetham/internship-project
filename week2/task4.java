public class task4 {
    public float sq(float side){
        return side*side;
    }
    public float cb(float side){
        return side*side*side;
    }
    public float av(float n1,float n2,float n3){
        return (n1+n2+n3)/3;
    }
    public float mx(float n1, float n2){
        if(n1>n2){
            return n1;
        }
        return n2;
    }
    public static void main(String[] args){
        task4 obj = new task4();
        
        System.out.println("Square of 5 : "+obj.sq(5));
        
        System.out.println("Cube of 5 : "+ obj.cb(5));
        
        System.out.println("Average of three 5's : "+obj.av(5,5,5));
        
        System.out.println("Maximum of 5 and 10 : " +obj.mx(5,10));
        
    }
}
