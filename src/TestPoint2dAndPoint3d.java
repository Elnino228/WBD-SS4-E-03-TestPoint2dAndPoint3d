public class TestPoint2dAndPoint3d {
    public static void main(String[] args) {
        Point2d point2d=new Point2d();
        System.out.println(point2d);
        point2d=new Point2d(2.0f,2.0f);
        System.out.println(point2d);

        Point3d point3d=new Point3d();
        System.out.println(point3d);
        point3d=new Point3d(3.0f,3.0f,3.0f);
        System.out.println(point3d);
    }
}

class Point2d{
    private float x=0.0f;
    private float y=0.0f;

    public Point2d(){
    }
    public Point2d(float x,float y){
        this.x=x;
        this.y=y;
    }
    public float getX(){
        return x;
    }
    public float getY(){
        return y;
    }
    public float[] getXY(){
        float[] arr={getX(),getY()};
        return arr;
    }
    public void setX(float x){
        this.x=x;
    }
    public void setY(float y){
        this.y=y;
    }
    public void setXY(float x,float y){
        setX(x);
        setY(y);
    }

    @Override
    public String toString(){
        return "A point 2d has position x is "+getX()
                +", y is "+getY();
    }
}
class Point3d extends Point2d{
    private float z=0.0f;

    public Point3d(){
    }
    public Point3d(float x,float y, float z){
        super(x,y);
        this.z=z;
    }

    public float getZ(){
        return z;
    }
    public void setZ(float z){
        this.z=z;
    }
    public void setXYZ(float x,float y,float z){
        super.setXY(x,y);
        setZ(z);
    }
    public float[] getXYZ(){
        float[] arr={super.getX(),super.getY(),getZ()};
        return arr;
    }

    @Override
    public String toString(){
        return "A point 3d has position x is "+super.getX()
                +", y is "+super.getY()
                +", z is "+getZ()
                +" and is subclass of "+super.toString();
    }
}
