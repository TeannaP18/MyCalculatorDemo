package hbcu.stay.ready.ttime;

public class ScientificFeatures extends Calculator {
    private double sci;



    public ScientificFeatures(){
        sci = 0;
    }

    public ScientificFeatures(double sci) {

        this.sci = sci;
    }

    public double sineFunction(){
        sci = Math.sin(sci);
        return sci;
    }

    public double tanFunction(){
        sci = Math.tan(sci);
        return sci;
    }

    public double cosineFunction(){
        sci = Math.cos(sci);
        return sci;
    }

    public double inverseSineFunction(){
        sci = Math.asin(sci);
        return sci;
    }

    public double inverseCosFunction(){
        sci = Math.acos(sci);
        return sci;
    }

    public double inverseTanFunction(){
        sci = Math.atan(sci);
        return sci;
    }

    public double logFunction(){
        sci = Math.log(sci);
        return sci;
    }

    public double inLogFunction(){
        sci = 1/Math.log(sci);
        return sci;
    }

    public double naturalLogFunction(){
        sci = Math.log(sci);
        return sci;
    }
    public double inverseLog(){
        sci = Math.exp(sci);
        return sci;
    }
    public double factorial(){
        int fac = 1, i;
        for(i =2; i<= sci; i++){
            fac*=i;
        }
        return fac;
    }







}
