package com.sda.powtorka;

public class Rectangle implements iDrawable {



    public int sideA, sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        for (int i = 0; i < sideA; ++i){
            for (int j = 0; j < sideB; ++j)
                System.out.print("+");
                System.out.println();
            }

    }
}
