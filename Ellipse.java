package svg.element;

public class Ellipse extends Shape {
    private Double cx;
    private Double cy;
    private Double rx;
    private Double ry;

    public Ellipse(double cx, double cy, double rx, double ry){
        this.cx = cx;
        this.cy = cy;
        this.rx = rx;
        this.ry = ry;
    }

    public void setRx(double rx){
        this.rx = rx;
    }

    public void setRy(double ry){
        this.ry = ry;
    }

    public void setCx(double cx){
        this.cx = cx;
    }

    public void setCy(double cy){
        this.cy = cy;
    }

    public double getRx(){
        return rx;
    }

    public double getRy(){
        return ry;
    }

    public double getCx(){
        return cx;
    }

    public double getCy(){
        return cy;
    }

    @Override
    public Shape renderShape() {
        return this;
    }

   @Override
   public String label(){
       return "ellipse"; 
   }

   @Override
   public Element newInstance(){
       return this;
   }


    @Override 
    public boolean load(String expr){

       if(expr.contanins(" cx=")){
           final Double result = SVGParser.extractDouble(expr," cx=");
           if(result != null){
               cx = result.doubleValue();
           }
       } 

       if(expr.contanins(" cy=")){
        final Double result = SVGParser.extractDouble(expr," cy=");
        if(result != null){
            cx = result.doubleValue();
        }
    } 

    if(expr.contanins(" rx=")){
        final Double result = SVGParser.extractDouble(expr," rx=");
        if(result != null){
            cx = result.doubleValue();
        }
    } 

    if(expr.contanins(" ry=")){
        final Double result = SVGParser.extractDouble(expr," ry=");
        if(result != null){
            cx = result.doubleValue();
        }
    } 
    return (cx != null || cy != null || rx != null || ry != null);
    }

    
}
