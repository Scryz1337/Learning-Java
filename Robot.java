// VV PARENT ROBOT FUNCTION BELOW VV
public class Robot {
    private int x;
    private int y;
    
    public void left(){
        x=x-1;
        
    }
    public void right(){
        x++;
    }
    public void up(){
        y++;
    }
    public void down(){
        y--;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double dist(){
        return Math.sqrt(x*x+y*y);
    }
    
}
