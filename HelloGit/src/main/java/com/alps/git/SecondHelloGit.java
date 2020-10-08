package com.alps.git;

import java.time.LocalDateTime;

/**
 * @author Ly
 * @date 2020/10/7 15:03
 */
public class SecondHelloGit {

    private LocalDateTime date;
    private long count;
    public LocalDateTime getDate()
    {
        return this.date;
    }

    public void setDate(LocalDateTime date)
    {
        this.date = date;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
