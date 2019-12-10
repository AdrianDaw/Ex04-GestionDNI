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
package org.japo.java.app;

import org.japo.java.libraries.UtilesDNI;
import org.japo.java.libraries.UtilesEntrada;

/**
 *
 * @author Adrián Pérez Rodríguez - adrianp899@gmail.com
 */
public final class App {

    // Constantes
    public static final String MSG_USR = "Número de DNI ...: ";
    public static final String MSG_CTR = "Control de DNI ..: ";
    public static final String MSG_ERR = "ERROR: DNI incorrecto ";
    public static final String MSG_OUT = "DNI introducido .: ";

    public final void launchApp() {
        System.out.println("VALIDACIÓN DE DNI");
        System.out.println("=================");

        // Datos
        int dniN;
        char dniC;

        // Bucle
        boolean dniOk;
        do {
            // Entrada Número
            dniN = (int) UtilesEntrada.obtenerNumero(MSG_USR, MSG_ERR,
                    UtilesDNI.DNI_MIN, UtilesDNI.DNI_MAX);

            // Entrada Letra
            dniC = UtilesEntrada.obtenerCaracter(MSG_CTR, MSG_ERR);

            // Validación
            if (!UtilesDNI.validar(dniN, dniC)) {
                System.out.println("---");
                System.out.println(MSG_ERR);
                System.out.println("---");
            }

            dniOk = UtilesDNI.validar(dniN, dniC);
        } while (!dniOk);
        System.out.println("---");
        System.out.printf("%s%d%C%n", MSG_OUT, dniN, dniC);
    }
}
