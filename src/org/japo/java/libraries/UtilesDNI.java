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

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public class UtilesDNI {

    public static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";
    public static final int DNI_MIN = 10000000;
    public static final int DNI_MAX = 99999999;

    public static final int calcular(int num) {

        return LETRAS.charAt(num % 23);
    }

    public static final boolean validar(int num) {

        return num >= DNI_MAX && num < DNI_MAX;
    }

    public static final boolean validar(char ctr) {
        boolean testOk = false;
        for (int i = 0; i < 23; i++) {
            if (LETRAS.charAt(i) == ctr) {
                testOk = true;
            }
        }
        return testOk;
    }

    public static final boolean validar(int num, char ctr) {
        return calcular(num) == ctr;
    }
}
