package com.company;
import java.time.LocalDate;
import java.util.Scanner;

public class Main
{
    // VARIABLES

    private static int opc = 0;
    private static int opcCit;
    private static int opcDiag = 0;
    private static int opcRep;
    private static int hora;
    private static int minutos;
    private static int cita;
    private static int correlative;
    private static LocalDate date;
    private static String Yes = "y";
    private static String No = "n";
    private static String Y = "y";
    private static String N = "n";
    private static String cliente;
    private static String mascota;
    private static String cliente2;
    private static String mascota2;
    private static String diagnostico;
    private static LocalDate[] fechas = new LocalDate[10];
    private static String[] nombresClnt = new String[10];
    private static String[] nombreMascta = new String[10];
    private static String[] Cancelada = new String[10];
    private static String[] nombreCltDiag = new String[10];
    private static String[] nombreMasctaDiag = new String[10];
    private static String[] mascotaDiag = new String[10];
    private static boolean opcValida = false;
    private static boolean opcV = false;


    // METODOS

    public static void MenuP() // METODO PARA MOSTRAR MENU PRINCIPAL EN PANTALLA
    {
        System.out.println("*******************************");
        System.out.println("*     Clinica Veterinaria     *");
        System.out.println("* 1- Citas                    *");
        System.out.println("* 2- Diagnosticos             *");
        System.out.println("* 3- Reportes                 *");
        System.out.println("* 4- Salir                    *");
        System.out.println("*******************************");
        System.out.print("Su Opcion es: ");
    }

    public static void menuCitas() // METODO PARA MOSTRAR MENU DE CITAS EN PANTALLA
    {
        System.out.println("*************Citas*************");
        System.out.println("1- Agendar Cita");
        System.out.println("2- Re-agendar Cita");
        System.out.println("3- Cancelar Cita");
        System.out.println("4- Menu Principal");
        System.out.print("Su Opcion es: ");
    }

    public static void menuDiag() // METODO PARA MOSTRAR MENU DE DIAGNOSTICOS EN PANTALLA
    {
        System.out.println("*********Diagnosticos**********");
        System.out.println("1- Registrar Diagnostico");
        System.out.println("2- Modificar  Diagnostico");
        System.out.println("3- Eliminar Diagnostico");
        System.out.println("4- Menu Principal");
        System.out.print("Su Opcion es: ");
    }

    public static void menuRep() // METODO PARA MOSTRAR MENU DE REPORTES EN PANTALLA
    {
        System.out.println("***********Reportes************");
        System.out.println("1- Reporte de Citas");
        System.out.println("2- Reporte de Diagnosticos");
        System.out.println("3- Menu Principal");
        System.out.print("Su Opcion es: ");
    }

    public static int leerMenu() // METODO PARA LEER OPCIONES EN EL MENU PRINCIPAL
    {
        // VARIABLES
        int opc1 = 0;
        boolean opcVa = false;

        // CREAR OBJETOS
        Scanner lector = new Scanner(System.in); // Creando Objeto Para Leer Teclado

        while(!opcVa)
        {
            try
            {
                opc1 = lector.nextInt();
                System.out.println(" ");
                opcVa = true;
            }
            catch (Exception ex)
            {
                lector.next();
                System.out.print("Ingrese una opcion correcta por favor: ");
            }
        }

        return opc1;
    }

    public static int leerCita() // METODO PARA LEER OPCIONES EN EL MENU CITAS
    {
        // VARIABLES
        int opcCitas = 0;
        boolean opcVal = false;

        // CREAR OBJETO PARA LECTURA TECLADO
        Scanner ltr = new Scanner(System.in); // Creando Objeto Para Leer Teclado

        while(!opcVal)
        {
            try
            {
                opcCitas = ltr.nextInt();
                System.out.println(" ");
                opcVal = true;
            }
            catch(Exception ex)
            {
                ltr.next();
                System.out.print("Opcion Incorrecta, Ingrese una opcion valida: ");
            }
        }

        return opcCitas;
    }

    public static int leerDiag() // METODO PARA LEER OPCIONES EN EL MENU DIAGNOSTICOS
    {
        // VARIABLES
        int opcDiagnosticos = 0;
        boolean opcVa1 = false;

        // CREAR OBJETO PARA LECTURA TECLADO
        Scanner lect = new Scanner(System.in); // Creando Objeto Para Leer Teclado

        while(!opcVa1)
        {
            try
            {
                opcDiagnosticos = lect.nextInt();
                System.out.println(" ");
                opcVa1 = true;
            }
            catch (Exception ex)
            {
                lect.nextInt();
                System.out.println("Ingrese una opcion correcta por favor");
            }
        }

        return opcDiagnosticos;
    }

    public static int leerRep() // METODO PARA LEER OPCIONES EN EL MENU REPORTES
    {
        // VARIABLES
        int opcReporte = 0;
        boolean opcVal = false;

        // CREAR OBJETO PARA LECTURA TECLADO
        Scanner ltr = new Scanner(System.in); // Creando Objeto Para Leer Teclado

        while(!opcVal)
        {
            try
            {
                opcReporte = ltr.nextInt();
                System.out.println(" ");
                opcVal = true;
            }
            catch(Exception ex)
            {
                ltr.next();
                System.out.print("Opcion Incorrecta, Ingrese una opcion valida: ");
            }
        }

        return opcReporte;
    }

    public static int leerCorrelativo() // METODO PARA LEER NUMERO CORRELATIVO EN CITAS
    {
        // VARIABLES
        int correlativo = 0;
        boolean valido = false;

        // CREAR OBJETO PARA LECTURA TECLADO
        Scanner leer = new Scanner(System.in); // Creando Objeto Para Leer Teclado

        while(!valido)
        {
            try
            {
                correlativo = leer.nextInt();
                valido = true;
            }
            catch(Exception ex)
            {
                leer.next();
                System.out.print("Debe ingresar un numero");
            }
        }

        return correlativo;
    }

    public static LocalDate leerFecha() // METODO PARA LEER FECHA DE CITAS
    {
        // VARIABLES
        LocalDate fecha = null;
        String fchEntrada;
        boolean valida = false;

        // CREAR OBJETO PARA LECTURA TECLADO
        Scanner lt = new Scanner(System.in); // Creando Objeto Para Leer Teclado

        while(!valida)
        {
            try
            {
                fchEntrada = lt.next();
                fecha = LocalDate.parse(fchEntrada);
                System.out.println(" ");
                valida = true;
            }
            catch (Exception ex)
            {
                lt.next();
                System.out.print("Ingrese una fecha correcta por favor: ");
            }
        }

        return fecha;
    }

    public static String confirmarPregunta() // METODO PARA CONFIRMAR SI DESEA AGENDAR NUEVA CITA
    {
        // VARIABLES
        String pregunta = null;
        boolean v = false;


        // CREAR OBJETO PARA LECTURA TECLADO
        Scanner lct = new Scanner(System.in); // Creando Objeto Para Leer Teclado

        while(!v)
        {
            try
            {
                pregunta = lct.next();
                System.out.println(" ");
                v = true;
            }
            catch (Exception ex)
            {
                lct.next();
                System.out.print("Escriba solamente y o n");
            }
        }

        return pregunta;
    }

    public static String mostrarCitas() // METODO PARA MOSTRAR CITAS
    {
        for(cita = 0; cita<nombresClnt.length-1;cita++)
        {
            System.out.print("    " + cita + "  ");
        }

        return " ";
    }

    public static String mostrarClientes() // METODO PARA MOSTRAR CLIENTES
    {
        System.out.println(" ");
        for(cita = 0; cita<nombresClnt.length-1;cita++)
        {
            System.out.print("    " + nombresClnt[cita] + "      ");
        }

        return " ";
    }

    public static void mostrarMascotas() // METODO PARA MOSTRAR MASCOTAS
    {

    }

    public static void mostrarFechas() // METODO PARA MOSTRAR FECHAS
    {

    }

    public static void mostrarStatus() // METODO PARA MOSTRAR STATUS
    {

    }

    public static void main(String[] args)
    {
        // CREAR OBJETOS
        Scanner lector = new Scanner(System.in); // Creando Objeto Para Leer Teclado

        // MENU PRINCIPAL, LECTURA DE TECLADO Y USO DEL TRY-CATCH
        MenuP();
        opc = leerMenu();


        // CICLO WHILE Y USO DEL SWITCH
        while(opc != 4) // CICLO WHILE MENU PRINCIPAL
        {


            switch(opc) // SWITCH MENU PRINCIPAL
            {
                case 1: // Citas

                    // MOSTRAR MENU CITAS Y LEER TECLADO CON USO DEL TRY-CATCH
                    menuCitas();
                    opcCit = leerCita();

                    // SWITCH MENU CITAS
                    switch(opcCit)
                    {
                        case 1: // AGENDAR CITA

                            System.out.println("*********Agendar Citas*********");

                            String ask;
                            boolean confirmar = false;

                            while(!confirmar)
                            {
                                // SOLICITAR NUMERO DE CITA
                                System.out.print("Ingrese el numero de cita: ");
                                cita = leerCorrelativo();

                                // SOLICITAR NOMBRE DE CLIENTE
                                System.out.print("Ingrese su nombre: ");
                                cliente = lector.next();

                                // SOLICITAR NOMBRE DE MASCOTA
                                System.out.print("Ingrese el nombre de la mascota: ");
                                mascota = lector.next();

                                // SOLICITAR FECHA DE CITA
                                System.out.println("Ingrese fecha de la cita (AAAA-MM-DD): ");
                                date = leerFecha();

                                // INGRESANDO EL NOMBRE DEL CLIENTE EN LA POSICION "cita" DEL ARREGLO nombresClnt
                                nombresClnt[cita] = cliente;

                                // INGRESANDO EL NOMBRE DE LA MASCOTA EN LA POSICION "cita" DEL ARREGLO nombresMascta
                                nombreMascta[cita] = mascota;

                                // INGRESANDO LA FECHA DE LA CITA EN LA POSICION "cita" DEL ARREGLO fechas
                                fechas[cita] = date;

                                // INGRESANDO STATUS DE ACTIVA EN LA POSICION "cita" DEL ARREGLO CANCELADA
                                Cancelada[cita] = "Activa";

                                System.out.println("Cita Guardada");
                                System.out.println("¿Desea agendar otra cita? y/n");
                                ask = confirmarPregunta();

                                if(ask.equals(No))
                                {
                                    confirmar = true;
                                }
                            }

                            MenuP();
                            opc = leerMenu();

                            break;



                        case 2: // RE-AGENDAR CITA

                            System.out.println("********Re-Agendar Citas*******");

                            // SOLICITAR NUMERO DE CITA A CAMBIAR
                            System.out.print("Ingrese la cita que desea cambiar: ");
                            cita = leerCorrelativo();

                            // MOSTRAR DATOS DE LA CITA INDICADA
                            System.out.println("Numero de Cita: " + cita);
                            System.out.println("Nombre Cliente: " + nombresClnt[cita]);
                            System.out.println("Nombre Mascota: " + nombreMascta[cita]);
                            System.out.println("Fecha de Cita:  " + fechas[cita]);

                            String ask2;

                            System.out.println("¿Desea cambiar la fecha de la cita? y/n");
                            ask2 = confirmarPregunta();

                            if(ask2.equals(Y))
                            {
                                System.out.println("Ingrese la nueva fecha de la cita (AAAA-MM-DD)");
                                date = leerFecha();

                                // INGRESANDO LA NUEVA FECHA DE LA CITA EN LA POSICION "cita"
                                fechas[cita] = date;

                                System.out.println("Fecha de la cita modificada");
                                System.out.println(" ");
                            }

                            MenuP();
                            opc = leerMenu();

                            break;



                        case 3: // CANCELAR CITA

                            System.out.println("*********Cancelar Citas********");

                            // SOLICITAR NUMERO DE CITA A CANCELAR
                            System.out.print("Ingrese la cita que desea cambiar: ");
                            cita = leerCorrelativo();

                            // MOSTRAR DATOS DE LA CITA INDICADA
                            System.out.println("Numero de Cita: " + cita);
                            System.out.println("Nombre Cliente: " + nombresClnt[cita]);
                            System.out.println("Nombre Mascota: " + nombreMascta[cita]);
                            System.out.println("Fecha de Cita:  " + fechas[cita]);

                            String ask3;

                            System.out.println("¿Desea cancelar la cita? y/n");
                            ask3 = confirmarPregunta();

                            if(ask3.equals(Y))
                            {
                                // Agregando Status de Cancelada a la cita
                                Cancelada[cita] = "Cancelada";

                                // MOSTRAR DATOS DE LA CITA INDICADA
                                System.out.println("Numero de Cita: " + cita);
                                System.out.println("Nombre Cliente: " + nombresClnt[cita]);
                                System.out.println("Nombre Mascota: " + nombreMascta[cita]);
                                System.out.println("Fecha de Cita:  " + fechas[cita]);
                                System.out.println("Status de Cita: " + Cancelada[cita]);
                                System.out.println(" ");
                            }

                            MenuP();
                            opc = leerMenu();

                            break;



                        case 4: // MENU PRINCIPAL

                            while(!opcV)
                            {
                                try
                                {
                                    MenuP();
                                    opc = lector.nextInt();
                                    opcV = true;
                                }
                                catch (Exception ex)
                                {
                                    lector.nextInt();
                                    System.out.println("Ingrese una opcion correcta por favor");
                                }
                            }

                            break;
                    }

                    break;




                case 2: // Diagnosticos
                    menuDiag();
                    opcDiag = leerDiag();

                    // SWITCH MENU DIAGNOSTICOS
                    switch(opcDiag)
                    {
                        case 1: // REGISTRAR DIAGNOSTICO

                            System.out.println("****Registrar Diagnosticos*****");

                            String ask4;
                            boolean confirmar2 = false;

                            while(!confirmar2)
                            {
                                // SOLICITAR NUMERO DE CORRELATIVO
                                System.out.print("Ingrese el correlativo: ");
                                correlative = leerCorrelativo();

                                // SOLICITAR NOMBRE DE CLIENTE
                                System.out.print("Ingrese el nombre del Cliente: ");
                                cliente2 = lector.next();

                                // SOLICITAR NOMBRE DE MASCOTA
                                System.out.print("Ingrese el nombre de la mascota: ");
                                mascota2 = lector.next();

                                // SOLICITAR DIAGNOSTICO
                                System.out.print("Escriba el diagnostico: ");
                                diagnostico = lector.next();

                                // INGRESANDO EL NOMBRE DEL CLIENTE EN LA POSICION "cita" DEL ARREGLO nombreCltDiag
                                nombreCltDiag[correlative] = cliente2;

                                // INGRESANDO EL NOMBRE DE LA MASCOTA EN LA POSICION "cita" DEL ARREGLO nombreMasctaDiag
                                nombreMasctaDiag[correlative] = mascota2;

                                // INGRESANDO EL DIAGNOSTICO EN LA POSICION "cita" DEL ARREGLO mascotaDiag
                                mascotaDiag[correlative] = diagnostico;

                                System.out.println(" ");
                                System.out.println("Datos guardados");
                                System.out.println("¿Desea registrar otro diagnostico? y/n");
                                ask4 = confirmarPregunta();

                                if(ask4.equals(No))
                                {
                                    confirmar2 = true;
                                }
                            }

                            MenuP();
                            opc = leerMenu();

                            break;



                        case 2: // MODIFICAR DIAGNOSTICO

                            System.out.println("****Modificar Diagnosticos*****");

                            String ask5;
                            boolean confirmar3 = false;

                            while(!confirmar3)
                            {
                                // SOLICITAR NUMERO DE CORRELATIVO
                                System.out.print("Ingrese el correlativo del diagnostico a modificar: ");
                                correlative = leerCorrelativo();

                                // MOSTRAR DATOS DEL PACIENTE
                                System.out.println("Numero de Cita: " + correlative);
                                System.out.println("Nombre Cliente: " + nombreCltDiag[correlative]);
                                System.out.println("Nombre Mascota: " + nombreMasctaDiag[correlative]);
                                System.out.println("Diagnostico:    " + mascotaDiag[correlative]);

                                System.out.println("¿Desea modificar el diagnostico? y/n");
                                ask5 = confirmarPregunta();

                                if(ask5.equals(Y))
                                {
                                    // Agregando Nuevo Diagnostico
                                    System.out.print("Escriba el nuevo diagnostico: ");
                                    diagnostico = lector.next();

                                    mascotaDiag[correlative] = diagnostico;

                                    // MOSTRAR DATOS DEL NUEVO DIAGNOSTICO
                                    System.out.println("Numero de Cita: " + correlative);
                                    System.out.println("Nombre Cliente: " + nombreCltDiag[correlative]);
                                    System.out.println("Nombre Mascota: " + nombreMasctaDiag[correlative]);
                                    System.out.println("Diagnostico:    " + mascotaDiag[correlative]);

                                    System.out.println(" ");
                                    System.out.println("Datos guardados");
                                    System.out.println("¿Desea modificar otro diagnostico? y/n");
                                    ask5 = confirmarPregunta();
                                }

                                if(ask5.equals(No))
                                {
                                    confirmar3 = true;
                                }
                            }

                            MenuP();
                            opc = leerMenu();

                            break;



                        case 3: // ELIMINAR DIAGNOSTICO
                            System.out.println("*****Eliminar Diagnosticos*****");

                            String ask6;
                            boolean confirmar4 = false;

                            while(!confirmar4)
                            {
                                // SOLICITAR NUMERO DE CORRELATIVO
                                System.out.print("Ingrese el correlativo del diagnostico a eliminar: ");
                                correlative = leerCorrelativo();

                                // MOSTRAR DATOS DEL PACIENTE
                                System.out.println("Numero de Cita: " + correlative);
                                System.out.println("Nombre Cliente: " + nombreCltDiag[correlative]);
                                System.out.println("Nombre Mascota: " + nombreMasctaDiag[correlative]);
                                System.out.println("Diagnostico:    " + mascotaDiag[correlative]);

                                System.out.println("¿Desea eliminar el diagnostico? y/n");
                                ask6 = confirmarPregunta();

                                if(ask6.equals(Y))
                                {
                                    // Eliminando Diagnostico
                                    mascotaDiag[correlative] = String.valueOf("Eliminado");

                                    // MOSTRAR DATOS NUEVOS
                                    System.out.println("Numero de Cita: " + correlative);
                                    System.out.println("Nombre Cliente: " + nombreCltDiag[correlative]);
                                    System.out.println("Nombre Mascota: " + nombreMasctaDiag[correlative]);
                                    System.out.println("Diagnostico:    " + mascotaDiag[correlative]);

                                    System.out.println(" ");
                                    System.out.println("Datos guardados");
                                    System.out.println("¿Desea eliminar otro diagnostico? y/n");
                                    ask6 = confirmarPregunta();
                                }

                                if(ask6.equals(No))
                                {
                                    confirmar4 = true;
                                }
                            }

                            MenuP();
                            opc = leerMenu();

                            break;



                        case 4: // MENU PRINCIPAL

                            MenuP();
                            opc = leerMenu();

                            break;
                    }

                    break;




                case 3: // Reportes
                    menuRep();
                    opcRep = leerRep();

                    // SWITCH MENU REPORTES
                    switch(opcRep)
                    {
                        case 1: // REPORTE DE CITAS

                            System.out.println("********Reporte de Citas*******");

                            System.out.println("|  #Cita  |    Nombre    |     Mascota    |    Fecha    |     Status    |");
                            mostrarCitas();
                            mostrarClientes();


                            /*for(cita = 0; cita<nombreMascta.length-1;cita++)
                            {
                                System.out.println("                       " + nombreMascta[cita]);
                            }

                            for(cita = 0; cita<fechas.length-1;cita++)
                            {
                                System.out.println("                                   " + fechas[cita]);
                            }

                            for(cita = 0; cita<Cancelada.length-1;cita++)
                            {
                                System.out.println("                                                " + Cancelada[cita]);
                            }*/

                            System.out.println(" ");
                            break;

                        case 2: // REPORTE DE DIAGNOSTICOS

                            System.out.println("****Reporte de Diagnosticos****");

                            break;

                        case 3: // MENU PRINCIPAL

                            MenuP();
                            opc = leerMenu();

                            break;
                    }

                    break;
            }
        }
    }
}