public class Door {
    lock Lobj;
    class lock{
        private boolean lockstatus;
        public lock(boolean lockstatus){
            this.lockstatus=lockstatus;

        }
        public boolean getstatus(){
            return lockstatus;
        }

    }
    public Door(){
        Lobj=new lock(true);
    }
    public void shopstatus()
    {
        if(Lobj.getstatus()==true)
            System.out.println("open");
        else
            System.out.println("close");
    }
}
class Test2
{
    public static void main(String[] args) {
        Door obj1=new Door();
        obj1.shopstatus();
    }
}
