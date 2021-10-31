package day01;

import java.util.ArrayList;
import java.util.List;

public class Students {
    private List<Integer> heights = new ArrayList<>();

    public void addHeight(int height){
        this.heights.add(height);
    }
    public boolean isHeightsIncreasing(){
        int before=-1;
        for(int e :heights){
            if(e>=before){
                before=e;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public List<Integer> getHeights() {
        return heights;
    }
}
