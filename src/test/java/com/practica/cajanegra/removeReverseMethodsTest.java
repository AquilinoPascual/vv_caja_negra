package com.practica.cajanegra;

import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedList;
import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class removeReverseMethodsTest {

    //Valores repetidos y marcados para comprobar que si coge los ultimos valores en los removelast
    private static SingleLinkedListImpl baseOrdered = new SingleLinkedListImpl<>("1", "A", "1", "2", "A", "2", "3", "A", "3", "4", "A", "4");
    private static SingleLinkedListImpl baseOrderedExpected = new SingleLinkedListImpl<>("1", "A", "1", "2", "A", "2", "3", "A", "3", "4", "4");
    private static SingleLinkedListImpl basicOrder = new SingleLinkedListImpl<>("1", "2", "3", "4");


    @DisplayName("removeLastTest")
    @ParameterizedTest
    @MethodSource("removeLastTestArguments")
    void removeLastTest(SingleLinkedListImpl<String> test, String expected) {
        try {
            assertEquals(expected, test.removeLast());
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
    }

    static Stream<Arguments> removeLastTestArguments() {
        return Stream.of(
                Arguments.of(baseOrdered, "4"),
                Arguments.of(new SingleLinkedListImpl<String>("Hola"), "Hola")
        );
    }

    @DisplayName("removeLastTestThrowException")
    @Test
    void removeLastTestThrowException() {
        SingleLinkedListImpl<String> empty = new SingleLinkedListImpl<>();
        assertThrows(EmptyCollectionException.class, () -> empty.removeLast());
    }


    // FALLA PORQUE ELIMINA TODAS LAS APARICIONES, NO SOLO LA ÚLTIMA
    @DisplayName("removeLastOfElemTest")
    @ParameterizedTest
    @MethodSource("removeLastOfElemTestArguments")
    void removeLastOfElemTest(SingleLinkedListImpl<String> test, SingleLinkedListImpl<String> expected, String toRemove) {
        try {
            assertEquals(toRemove, test.removeLast(toRemove));
        } catch (EmptyCollectionException e) {
            e.printStackTrace();
        }
        assertEquals(expected.toString(), test.toString());
    }

    static Stream<Arguments> removeLastOfElemTestArguments() {
        return Stream.of(
                Arguments.of(baseOrdered, baseOrderedExpected, "A"),
                Arguments.of(new SingleLinkedListImpl<String>("hola"), new SingleLinkedListImpl<String>(), "hola")
        );
    }

    @DisplayName("removeLastOfElemTestThrowEmptyCollectionException")
    @Test
    void removeLastOfElemTestThrowEmptyCollectionException() {
        assertThrows(EmptyCollectionException.class, () -> new SingleLinkedListImpl<String>().removeLast("hola"));

    }

    //No lanza exception cuando el elemento a eliminar no está en la lista
    @DisplayName("removeLastOfElemTestThrowEmptyCollectionException")
    @Test
    void removeLastOfElemTestThrowNoSuchElementException() {
        assertThrows(NoSuchElementException.class, () -> baseOrdered.removeLast("No estoy"));

    }

    @DisplayName("reverseTestReturn")
    @Test
    void reverseTestReturn() {
        assertEquals(new SingleLinkedListImpl<String>("4", "3", "2", "1").toString(), (basicOrder.reverse()).toString());

    }

    @DisplayName("reverseTestList")
    @Test
    void reverseTestList() {
        basicOrder.reverse();
        assertEquals(new SingleLinkedListImpl<String>("1", "2", "3", "4").toString(), basicOrder.toString());
    }
}
