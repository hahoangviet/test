package svg.element;

public class Rectangle extends Shape {
    private Double x;
    private Double y;
    private Double rx;
    private Double ry;
    private Double width;
    private Double height;

    public Rectangle(double x, double y, double rx, double ry, double width, double height){
        this.x = x;
        this.y = y;
        this.rx = rx;
        this.ry = ry;
        this.width = width;
        this.height = height;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setRx(double rx){
        this.rx = rx;
    }

    public void setRy(double ry){
        this.ry = ry;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRx(){
        return rx;
    }

    public double getRy(){
        return ry;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public Shape renderShape() {
        return this;
    }

    @Override
    public String label(){
        return "rectangle"; 
    }

    @Override
    public Element newInstance(){
        return this; 
    }

    @Override
    public boolean load(){
        if(expr.contanins(" x=")){
            final Double result = SVGParser.extractDouble(expr," x=");
            if(result != null){
                x = result.doubleValue();
            }
        } 
 
        if(expr.contanins(" y=")){
         final Double result = SVGParser.extractDouble(expr," y=");
         if(result != null){
             y = result.doubleValue();
         }
     } 
 
     if(expr.contanins(" rx=")){
         final Double result = SVGParser.extractDouble(expr," rx=");
         if(result != null){
             rx = result.doubleValue();
         }
     } 
 
     if(expr.contanins(" ry=")){
         final Double result = SVGParser.extractDouble(expr," ry=");
         if(result != null){
             ry = result.doubleValue();
         }
     } 
     if(expr.contanins(" width=")){
        final Double result = SVGParser.extractDouble(expr," width=");
        if(result != null){
            width = result.doubleValue();
        }
    } 
    if(expr.contanins(" height=")){
        final Double result = SVGParser.extractDouble(expr," height=");
        if(result != null){
            height= result.doubleValue();
        }
    } 
     return (x != null || y != null || rx != null || ry != null || width != null || height != null);
     }
    }
}