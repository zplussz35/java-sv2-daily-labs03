package day04;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class Prison {
    private boolean[] cells= new boolean[100];

    public void openFreeCells(int cellnmuber){

        if(cellnmuber==1){
            for (int i = 0; i < cells.length; i++) {
                cells[i]=!cells[i];
            }
        }
        else{
            for(int i=cellnmuber-1;i<cells.length;i+=cellnmuber){
                cells[i]=!cells[i];
            }
        }

    }

    public List<Integer> getFreeCells() {
        List<Integer> freeCells = new ArrayList<>();
        for (int i = 0; i < cells.length; i++) {
            if(cells[i]){
                freeCells.add(i+1);
            }
        }
        return freeCells;
    }
}
