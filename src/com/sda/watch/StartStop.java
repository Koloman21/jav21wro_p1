package com.sda.watch;

public class StartStop {

    public long Start

    {
        Start = System.nanoTime();
    }

    public long Stop

    {
        return (System.nanoTime() - Start) / 1 000 000;
    }

}
