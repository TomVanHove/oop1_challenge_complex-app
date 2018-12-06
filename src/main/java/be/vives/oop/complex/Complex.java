package be.vives.oop.complex;

/**
 * Complex
 */
public class Complex {
    private double real = 0;
    private double imaginary = 0;
    public Complex (double real, double imaginary){
        setReal(real);
        setImaginary(imaginary);
    }
    public void setReal(double real){
        this.real = real;
    }
    public double getReal(){
        return real;
    }
    public void setImaginary(double imaginary){
        this.imaginary = imaginary;
    }
    public double getImaginary(){
        return imaginary;
    }
    public Complex add(Complex second){
       Complex result = new Complex();
       result.setReal(this.getReal() + second.getReal());
       result.setImaginary(this.getImaginary() + second.getImaginary());
       return result;
    }
    public Complex(){
        this(0,0);
    }
    public Complex getCopy(){
       return new Complex(getReal(), getImaginary());
    }
    public Complex(Complex original){
        this(original.getReal(), original.getImaginary());
    }
    public Complex subtract (Complex second){
        Complex resultSubtract = new Complex();
        resultSubtract.setReal(this.getReal() - second.getReal());
        resultSubtract.setImaginary(this.getImaginary() - second.getImaginary());
        return resultSubtract;
    }
    public Complex multiply(Complex second){
        Complex resultMultiply = new Complex();
        resultMultiply.setReal((this.getReal() * second.getReal()) - ( this.getImaginary() * second.getImaginary()));
        resultMultiply.setImaginary((this.getReal() * second.getImaginary()) + (this.getImaginary() * second.getReal()));
        return resultMultiply;
    }
    public Complex divide(Complex second){
        Complex resultDivide = new Complex();
        resultDivide.setReal((second.getReal() * second.getReal()) + (second.getImaginary() * second.getImaginary())) ;
        resultDivide.setImaginary((this.getReal() / second.getImaginary()) + (this.getImaginary() / second.getReal()));
        return resultDivide;
    }
//    public Complex divide(double second){
//        
//    }
//    
    
    
    
    
    
    @Override
    public String toString(){
        return "(" + getReal() + " + " + getImaginary() + "j)" ;

    }
}