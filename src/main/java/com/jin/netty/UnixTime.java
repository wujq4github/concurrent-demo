package com.jin.netty;

import java.util.Date;

/**
 * @author wu.jinqing
 * @date 2017年05月08日
 */
public class UnixTime {
    private final long value;

    public UnixTime() {
        this(System.currentTimeMillis() / 1000L + 2208988800L);
    }

    public UnixTime(long value) {
        this.value = value;
    }

    public long value() {
        return value;
    }

    @Override
    public String toString() {
        return new Date((value() - 2208988800L) * 1000L).toString();
    }
}