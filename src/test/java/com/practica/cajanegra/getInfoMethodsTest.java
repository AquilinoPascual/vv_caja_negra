package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class getInfoMethodsTest {

    private static SingleLinkedListImpl base= new SingleLinkedListImpl<>("A","B","C","D","E","F");
    private static SingleLinkedListImpl baseRep= new SingleLinkedListImpl<>("A","A","A","B","B","B","C","C","C","D","D","D","E","E","E","F","F","F");

    //Se prueban los valores worst case for robustness en los casos que hacen saltar la excepción
    //Y en los valores que no hacen saltar la expresión, todo correcto
    @DisplayName("getAPosTest")
    @ParameterizedTest
    @MethodSource("getAPosTestArguments")
    void getAPosTest(SingleLinkedListImpl<String> base, String s, int p){

        try {
            assertEquals(s,base.getAtPos(p));
        }catch(IllegalArgumentException e) {
            assertThrows(IllegalArgumentException.class, ()-> {
                base.getAtPos(p);
            });
        }

    }
    static Stream<Arguments>getAPosTestArguments(){
        return Stream.of(
                Arguments.of(base,"A",-1),
                Arguments.of(base,"A",0),
                Arguments.of(base,"A",1),
                Arguments.of(base,"B",2),
                Arguments.of(base,"C",3),
                Arguments.of(base,"E",base.size()-1),
                Arguments.of(base,"F",base.size()),
                Arguments.of(base,"F",base.size()+1),
                Arguments.of(base,"F",base.size()+2)
        );
    }

    //Valores wcfr para las posiciones  y hacer saltar la exception
    //Las listas de prueba tienen valores repetidos para comprobar que devuelve el primero que aparece en la lista

    @DisplayName("indexOfTest")
    @ParameterizedTest
    @MethodSource("indexOfTestArguments")
    void indexOfTest(SingleLinkedListImpl<String> baseRep,String s,int p){

        try {
            assertEquals(baseRep.indexOf(s),p);
        }catch(NoSuchElementException e) {
            assertThrows(NoSuchElementException.class, ()-> {
                baseRep.indexOf(s);
            });
        }

    }
    static Stream<Arguments>indexOfTestArguments(){
        return Stream.of(
                Arguments.of(baseRep,"@",1),
                Arguments.of(baseRep,"A",1),
                Arguments.of(baseRep,"B",4),
                Arguments.of(baseRep,"C",7),
                Arguments.of(baseRep,"E",13),
                Arguments.of(baseRep,"F",16),
                Arguments.of(baseRep,"G",6)

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
