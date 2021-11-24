public class shape {
    void draw(){
        System.out.println("Drawing shape");
    }
    void erase(){
        System.out.println("Erasing shape");
    }
    static class circle extends shape{
        void draw(){
            System.out.println("Drawing Circle");
        }
        void erase(){
            System.out.println("Erasing Circle");
        }

    }
    static class Triangle extends shape{
        void draw(){
            System.out.println("Drawing Triangle");
        }
        void erase(){
            System.out.println("Erasing Triangle");
        }
    }
    static class Square extends shape{
        void draw(){
            System.out.println("Drawing Square");
        }
        void erase(){
            System.out.println("Erasing shape");
        }
    }

    public static void main(String[] args) {
        shape c=new circle();
        shape t=new Triangle();
        shape s=new Square();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();

    }
}
