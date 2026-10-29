package com.archis.studentmgmt.util;

public final class IdGenerator {
    private int next = 1;

    public int next() {
        return next++;
    }

    public void alignTo(int highestSeen) {
        if (highestSeen >= next) {
            next = highestSeen + 1;
        }
    }
}