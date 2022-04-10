package com.practica.cajanegra;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class getInfoMethodsTest {


    @DisplayName("getAPosTest")
    @ParameterizedTest
    @MethodSource("getAPosTestArguments")
    void getAPosTest(){}
    static Stream<Arguments>getAPosTestArguments(){
        return Stream.of(
                Arguments.of()
        );
    }

    @DisplayName("indexOfTest")
    @ParameterizedTest
    @MethodSource("indexOfTestArguments")
    void indexOfTest(){}
    static Stream<Arguments>indexOfTestArguments(){
        return Stream.of(
                Arguments.of()
        );
    }
    @DisplayName("isEmptyTest")
    @ParameterizedTest
    @MethodSource("isEmptyTestArguments")
    void isEmptyTest(){}
    static Stream<Arguments>isEmptyTestArguments(){
        return Stream.of(
                Arguments.of()
        );
    }
    @DisplayName("isSublistTest")
    @ParameterizedTest
    @MethodSource("isSublistTestArguments")
    void isSublistTest(){}
    static Stream<Arguments>isSublistTestArguments(){
        return Stream.of(
                Arguments.of()
        );
    }

}
