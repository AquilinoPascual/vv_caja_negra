package com.practica.cajanegra;

import com.cajanegra.SingleLinkedListImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class addMethodsTest {

    private static final String[] wcfr = {"@","A","B","N","Y","Z","["}; //Conjunto de valores ASCII para prueba tipo worst case for robustness según nuestro dominio

     //Una prueba por cada Carácter del robust case for robustness y por cada posicion tambien rcfr (primera pos, segunda, posición de en medio, penultima posición y última posición(sobrespasando el tamaño)),
     //Comprobación de la excepción de posiciones negativas debajo (-1 y MIN_VALUE)
    @DisplayName("addAtPosTest")
    @ParameterizedTest
    @MethodSource("addAtPosTestArguments")
    void addAtPosTest(SingleLinkedListImpl<String> base,SingleLinkedListImpl<String> modified, String s, int p){

        base.addAtPos(s,p);
        assertEquals(modified.toString(),base.toString());
            }
    static Stream<Arguments> addAtPosTestArguments(){

            int posTest[]={1,2,4,6,7};


            SingleLinkedListImpl<String> test00 = new SingleLinkedListImpl<String>(wcfr[0], "A", "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test01 = new SingleLinkedListImpl<String>("A", wcfr[0], "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test02 = new SingleLinkedListImpl<String>("A", "B", "C", wcfr[0], "D", "E", "F");
            SingleLinkedListImpl<String> test03 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", wcfr[0], "F");
            SingleLinkedListImpl<String> test04 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "F", wcfr[0]);

            SingleLinkedListImpl<String> test10 = new SingleLinkedListImpl<String>(wcfr[1], "A", "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test11 = new SingleLinkedListImpl<String>("A", wcfr[1], "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test12 = new SingleLinkedListImpl<String>("A", "B", "C", wcfr[1], "D", "E", "F");
            SingleLinkedListImpl<String> test13 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", wcfr[1], "F");
            SingleLinkedListImpl<String> test14 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "F", wcfr[1]);

            SingleLinkedListImpl<String> test20 = new SingleLinkedListImpl<String>(wcfr[2], "A", "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test21 = new SingleLinkedListImpl<String>("A", wcfr[2], "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test22 = new SingleLinkedListImpl<String>("A", "B", "C", wcfr[2], "D", "E", "F");
            SingleLinkedListImpl<String> test23 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", wcfr[2], "F");
            SingleLinkedListImpl<String> test24 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "F", wcfr[2]);

            SingleLinkedListImpl<String> test30 = new SingleLinkedListImpl<String>(wcfr[3], "A", "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test31 = new SingleLinkedListImpl<String>("A", wcfr[3], "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test32 = new SingleLinkedListImpl<String>("A", "B", "C", wcfr[3], "D", "E", "F");
            SingleLinkedListImpl<String> test33 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", wcfr[3], "F");
            SingleLinkedListImpl<String> test34 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "F", wcfr[3]);

            SingleLinkedListImpl<String> test40 = new SingleLinkedListImpl<String>(wcfr[4], "A", "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test41 = new SingleLinkedListImpl<String>("A", wcfr[4], "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test42 = new SingleLinkedListImpl<String>("A", "B", "C", wcfr[4], "D", "E", "F");
            SingleLinkedListImpl<String> test43 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", wcfr[4], "F");
            SingleLinkedListImpl<String> test44 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "F", wcfr[4]);

            SingleLinkedListImpl<String> test50 = new SingleLinkedListImpl<String>(wcfr[5], "A", "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test51 = new SingleLinkedListImpl<String>("A", wcfr[5], "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test52 = new SingleLinkedListImpl<String>("A", "B", "C", wcfr[5], "D", "E", "F");
            SingleLinkedListImpl<String> test53 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", wcfr[5], "F");
            SingleLinkedListImpl<String> test54 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "F", wcfr[5]);

            SingleLinkedListImpl<String> test60 = new SingleLinkedListImpl<String>(wcfr[6], "A", "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test61 = new SingleLinkedListImpl<String>("A", wcfr[6], "B", "C", "D", "E", "F");
            SingleLinkedListImpl<String> test62 = new SingleLinkedListImpl<String>("A", "B", "C", wcfr[6], "D", "E", "F");
            SingleLinkedListImpl<String> test63 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", wcfr[6], "F");
            SingleLinkedListImpl<String> test64 = new SingleLinkedListImpl<String>("A", "B", "C", "D", "E", "F", wcfr[6]);




        return Stream.of(


                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")),test00, wcfr[0],posTest[0]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test01, wcfr[0],posTest[1]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test02, wcfr[0],posTest[2]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test03, wcfr[0],posTest[3]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test04, wcfr[0],posTest[4]),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test10, wcfr[1],posTest[0]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test11, wcfr[1],posTest[1]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test12, wcfr[1],posTest[2]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test13, wcfr[1],posTest[3]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test14, wcfr[1],posTest[4]),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test20, wcfr[2],posTest[0]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test21, wcfr[2],posTest[1]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test22, wcfr[2],posTest[2]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test23, wcfr[2],posTest[3]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test24, wcfr[2],posTest[4]),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test30, wcfr[3],posTest[0]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test31, wcfr[3],posTest[1]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test32, wcfr[3],posTest[2]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test33, wcfr[3],posTest[3]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test34, wcfr[3],posTest[4]),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test40, wcfr[4],posTest[0]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test41, wcfr[4],posTest[1]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test42, wcfr[4],posTest[2]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test43, wcfr[4],posTest[3]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test44, wcfr[4],posTest[4]),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test50, wcfr[5],posTest[0]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test51, wcfr[5],posTest[1]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test52, wcfr[5],posTest[2]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test53, wcfr[5],posTest[3]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test54, wcfr[5],posTest[4]),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test60, wcfr[6],posTest[0]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test61, wcfr[6],posTest[1]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test62, wcfr[6],posTest[2]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test63, wcfr[6],posTest[3]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test64, wcfr[6],posTest[4])
        );
    }

    @DisplayName("addAtPosTestException")
    @ParameterizedTest
    @MethodSource("throwExceptionTestArguments")
    void addAtPosTestException(SingleLinkedListImpl<String> base,String s, int p){

        try {
            base.addAtPos(s,p);
        }catch(IllegalArgumentException e) {
            assertThrows(IllegalArgumentException.class, ()-> {
                base.addAtPos(s,p);
            });
        }


    }
    static Stream<Arguments> throwExceptionTestArguments(){

        return Stream.of(
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[0],-1),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[1],-1),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[2],-1),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[3],-1),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[4],-1),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[5],-1),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[6],-1),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[0],Integer.MIN_VALUE),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[1],Integer.MIN_VALUE),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[2],Integer.MIN_VALUE),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[3],Integer.MIN_VALUE),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[4],Integer.MIN_VALUE),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[5],Integer.MIN_VALUE),
                Arguments.of((new SingleLinkedListImpl<String>("A","B","C","D","E","F")), wcfr[6],Integer.MIN_VALUE)

        );
    }




    //Una prueba por cada Carácter del robust case for robustness
    //Resultado: No inserta correctamente
    @DisplayName("addFirstTest")
    @ParameterizedTest
    @MethodSource("addFirstTestArguments")
    void addFirstTest(SingleLinkedListImpl<String> base, SingleLinkedListImpl<String> modified, String s){
        base.addFirst(s);
        assertEquals(modified.toString(),base.toString());

    }
    static Stream<Arguments> addFirstTestArguments(){
        SingleLinkedListImpl<String> test0 = new SingleLinkedListImpl<String >(wcfr[0],"A","B","C","D","E","F");
        SingleLinkedListImpl<String> test1 = new SingleLinkedListImpl<String >(wcfr[1],"A","B","C","D","E","F");
        SingleLinkedListImpl<String> test2 = new SingleLinkedListImpl<String >(wcfr[2],"A","B","C","D","E","F");
        SingleLinkedListImpl<String> test3 = new SingleLinkedListImpl<String >(wcfr[3],"A","B","C","D","E","F");
        SingleLinkedListImpl<String> test4 = new SingleLinkedListImpl<String >(wcfr[4],"A","B","C","D","E","F");
        SingleLinkedListImpl<String> test5 = new SingleLinkedListImpl<String >(wcfr[5],"A","B","C","D","E","F");
        SingleLinkedListImpl<String> test6 = new SingleLinkedListImpl<String >(wcfr[6],"A","B","C","D","E","F");


        return Stream.of(
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test0, wcfr[0]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test1, wcfr[1]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test2, wcfr[2]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test3, wcfr[3]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test4, wcfr[4]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test5, wcfr[5]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test6, wcfr[6])
                        );
                }


    //Una prueba por cada carácter worst case for robustness a insertar
    @DisplayName("addLastTest")
    @ParameterizedTest
    @MethodSource("addLastTestArguments")
    void addLastTest(SingleLinkedListImpl<String> base, SingleLinkedListImpl<String> modified, String s){
        base.addLast(s);
        assertEquals(modified.toString(),base.toString());

    }
    static Stream<Arguments> addLastTestArguments(){

        SingleLinkedListImpl<String> test0 = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[0]);
        SingleLinkedListImpl<String> test1 = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[1]);
        SingleLinkedListImpl<String> test2 = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[2]);
        SingleLinkedListImpl<String> test3 = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[3]);
        SingleLinkedListImpl<String> test4 = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[4]);
        SingleLinkedListImpl<String> test5 = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[5]);
        SingleLinkedListImpl<String> test6 = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[6]);

        return Stream.of(
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test0, wcfr[0]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test1, wcfr[1]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test2, wcfr[2]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test3, wcfr[3]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test4, wcfr[4]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test5, wcfr[5]),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test6, wcfr[6])
        );
    }



    //Pruebo repetir 0 veces,una vez y 3 veces por cada caracter(límite, primer valor fuera del límite y valor medio)
    //Me habría gustado probar insertando MAX_VALUE veces y MAX_VALUE+1 veces
    //La comprobación de la excepción la compruebo debajo y compruebo el valor límite y el primero fuera del límite
    //Resultado: No permite tampoco introuducir numVeces= 0

    @DisplayName("addNTimesTest")
    @ParameterizedTest
    @MethodSource("addNTimesTestArguments")
    void addNTimesTest(SingleLinkedListImpl<String> base, SingleLinkedListImpl<String> modified,String s,int n){
        base.addNTimes(s,n);
        assertEquals(modified.toString(),base.toString());
    }
    static Stream<Arguments>addNTimesTestArguments(){



        SingleLinkedListImpl<String> test0  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F");

        SingleLinkedListImpl<String> test01  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[0]);
        SingleLinkedListImpl<String> test03  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[0], wcfr[0], wcfr[0]);

        SingleLinkedListImpl<String> test11  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[1]);
        SingleLinkedListImpl<String> test13  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[1], wcfr[1], wcfr[1]);

        SingleLinkedListImpl<String> test21  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[2]);
        SingleLinkedListImpl<String> test23  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[2], wcfr[2], wcfr[2]);

        SingleLinkedListImpl<String> test31  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[3]);
        SingleLinkedListImpl<String> test33  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[3], wcfr[3], wcfr[3]);

        SingleLinkedListImpl<String> test41  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[4]);
        SingleLinkedListImpl<String> test43  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[4], wcfr[4], wcfr[4]);

        SingleLinkedListImpl<String> test51  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[5]);
        SingleLinkedListImpl<String> test53  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[5], wcfr[5], wcfr[5]);

        SingleLinkedListImpl<String> test61  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[6]);
        SingleLinkedListImpl<String> test63  = new SingleLinkedListImpl<String> ("A","B","C","D","E","F", wcfr[6], wcfr[6], wcfr[6]);


        return Stream.of(


                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test0, wcfr[0],0),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test01, wcfr[0],1),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test03, wcfr[0],3),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test0, wcfr[1],0),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test11, wcfr[1],1),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test13, wcfr[1],3),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test0, wcfr[2],0),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test21, wcfr[2],1),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test23, wcfr[2],3),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test0, wcfr[3],0),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test31, wcfr[3],1),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test33, wcfr[3],3),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test0, wcfr[4],0),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test41, wcfr[4],1),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test43, wcfr[4],3),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test0, wcfr[5],0),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test51, wcfr[5],1),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test53, wcfr[5],3),

                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test0, wcfr[6],0),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test61, wcfr[6],1),
                Arguments.of(new SingleLinkedListImpl<String>("A","B","C","D","E","F"),test63, wcfr[6],3)

                );
    }

    @DisplayName("addNTimesExceptionTest")
    @ParameterizedTest
    @MethodSource("addNTimesTestExceptionArguments")
    void addNTimesExceptionTest(SingleLinkedListImpl<String> base,int n) {
        try {
            base.addNTimes("A", n);
        } catch (IllegalArgumentException e) {
            assertThrows(IllegalArgumentException.class, () -> {
                base.addNTimes("A", n);
            });
        }
    }
    static Stream<Arguments>addNTimesTestExceptionArguments(){
        return Stream.of(
                Arguments.of(new SingleLinkedListImpl<String>("A","B"),-1),
                Arguments.of(new SingleLinkedListImpl<String>("A","B"),0)

        );
    }
}
