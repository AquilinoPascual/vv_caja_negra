package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class sizeAndToStringTest {

    private static SingleLinkedListImpl base= new SingleLinkedListImpl<>("A","B","C","D","E","F");

    @DisplayName(".Size test")
    @ParameterizedTest
    @MethodSource("sizeTestArguments")
    void sizeTest(SingleLinkedListImpl<String> test,int expected){
        assertEquals(expected,test.size());
    }
    static Stream<Arguments> sizeTestArguments(){
        return Stream.of(
                Arguments.of(new SingleLinkedListImpl<String>(),0),
                Arguments.of(new SingleLinkedListImpl<String>("A"),1),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),6)

        );
    }

    @DisplayName("toString test")
    @ParameterizedTest
    @MethodSource("toStringTestArguments")
    void toStringTest(SingleLinkedListImpl<String> test,String expected){
        assertEquals(expected,test.toString());
    }
    static Stream<Arguments> toStringTestArguments(){
        return Stream.of(
                Arguments.of(new SingleLinkedListImpl<String>(),"[]"),
                Arguments.of(new SingleLinkedListImpl<String>("A"),"[A]"),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),
                        "[A, B, C, D, E, F]")
        );
    }


}
