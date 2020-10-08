package com.alps.git;

import java.time.LocalDateTime;

/**
 * @author Ly
 * @date 2020/10/7 15:03
 */
public class SecondHelloGit {

    private LocalDateTime date;
    private int number = 0;


    public LocalDateTime getDate()
    {
        return this.date;
    }

    public void setDate(LocalDateTime date)
    {
        this.date = date;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;

    }
}
