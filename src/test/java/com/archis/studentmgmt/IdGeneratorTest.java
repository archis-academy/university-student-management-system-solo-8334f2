package com.archis.studentmgmt;

import com.archis.studentmgmt.util.IdGenerator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IdGeneratorTest {
    @Test
    void generatesSequentialIds() {
        IdGenerator generator = new IdGenerator();
        assertEquals(1, generator.next());
        assertEquals(2, generator.next());
    }

    @Test
    void alignsToHighestSeen() {
        IdGenerator generator = new IdGenerator();
        generator.next();
        generator.next();
        generator.alignTo(10);
        assertEquals(11, generator.next());
    }
}