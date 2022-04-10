package com.practica.cajanegra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class removeReverseMethodsTest {


    @DisplayName("removeLastTest")
    @ParameterizedTest
    @MethodSource("removeLastTestArguments")
    void removeLastTest(){}
    static Stream<Arguments> removeLastTestArguments(){
        return Stream.of(
                Arguments.of()
        );
    }
    @DisplayName("removeLastOfElemTest")
    @ParameterizedTest
    @MethodSource("removeLastOfElemTestArguments")
    void removeLastOfElemTest(){}
    static Stream<Arguments> removeLastOfElemTestArguments(){
        return Stream.of(
                Arguments.of()
        );
    }
    @DisplayName("reverseTest")
    @ParameterizedTest
    @MethodSource("reverseTestArguments")
    void reverseTest(){}
    static Stream<Arguments> reverseTestArguments(){
        return Stream.of(
                Arguments.of()
        );
    }
}
