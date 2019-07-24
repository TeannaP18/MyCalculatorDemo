package hbcu.stay.ready.ttime;

public class Display {
    private String [] displayModeList = {"Binary", "Octal", "Decimal", "Hexadecimal"};
    private String setDisplayMode = "Binary";
    public String unitsMode = "Degrees";

    int x = 0;

    public String switchDisplayMode(){
        x++;
        if(x ==4){
            x = 0;
        }
        return displayModeList[x];
    }

    public String switchUnitsMode(){
        if(unitsMode == "Degrees"){
            unitsMode = "Radians";
        }
        else{
            unitsMode = "Degrees";
        }
        return unitsMode;
    }


}
