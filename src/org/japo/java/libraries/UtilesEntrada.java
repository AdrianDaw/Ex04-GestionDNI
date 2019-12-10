/* 
 * Copyright 2019 Adrián Pérez Rodríguez - adrianp899@gmail.com .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.libraries;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public final class UtilesEntrada {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");


    public static final double obtenerNumero(
            String msgUsr, String msgErr) {
        // Dato
        double n = 0;
        
        //Proceso entrada
        boolean repeatOk = true;
        do {
            try {
                //Entrada número
                System.out.print(msgUsr);
                n = SCN.nextDouble();
                repeatOk = false;
            } catch (Exception e) {
                //Mensaje error 
                System.out.println("---");
                System.out.println(msgErr);
                System.out.println("---");
                repeatOk = true;
            } finally {
                SCN.nextLine();
            }
        } while (repeatOk);
        
        return n;
    }

    public static final double obtenerNumero(
            String msgUsr, String msgErr, double min, double max) {

        // Dato
        double n = 0;
        
        //Proceso entrada
        boolean rangoOk;
        do {
            n = obtenerNumero(msgUsr, msgErr);
            rangoOk = n >= min && n <= max;
            if (!rangoOk) {
                System.out.println("---");
                System.out.println(msgErr);
                System.out.println("---");
                rangoOk = false;
            }
        } while (!rangoOk);
        
        return n;
    }

    public static final char obtenerCaracter(
            String msgusr, String msgErr) {
        // Dato
        char c = 'a';

        boolean repeat;
        do {
            try {
                System.out.print(msgusr);
                c = SCN.nextLine().charAt(0);
                repeat = false;

            } catch (Exception e) {
                System.out.println(msgErr);
                repeat = true;
            }
        } while (repeat);

        return c;
    }
}
