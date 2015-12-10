
public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name){
	super(radius,name);
    }

    public String toString(){
	return "FIXME!";
    }

    public double getVolume()
    {
	return 4*Math.pow(getRadius(),3)*Math.PI/3;
    }
}
