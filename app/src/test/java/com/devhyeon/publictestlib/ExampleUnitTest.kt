package com.devhyeon.publictestlib

import org.junit.Test

import org.junit.Assert.*

/** Import */
import com.devhyeon.devtestlib.ADD
import com.devhyeon.devtestlib.MUL
import com.devhyeon.devtestlib.REM
import com.devhyeon.devtestlib.DIV
import com.devhyeon.devtestlib.SUB
/** or */
import com.devhyeon.devtestlib.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)

        /** USE */
        println("ADD: "+ADD(1,2))
        println("MUL: "+MUL(1,2))
        println("SUM: "+SUB(1,2))
        println("DIV: "+DIV(1,2))
        println("REM: "+REM(1,2))
    }
}