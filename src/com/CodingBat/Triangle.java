package com.CodingBat;

public class Triangle {
    public int getTotalNumberOfBlocks(int rows){
        if(rows == 0) return 0;
        if(rows == 1) return 1;
        return rows + getTotalNumberOfBlocks(rows -1);
    }
}
