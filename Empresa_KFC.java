import java.util.Scanner;

public class Empresa_KFC {
    public static void main(String[] args) {
        System.out.println("----BIENVENIDO A KFC---");
        Empresa_KFC goku = new Empresa_KFC();
        goku.FMENU();
    }
    public void FMENU() {
        Scanner wal = new Scanner(System.in);
        System.out.println("---HOLA BIENVENIDO A KFC---");
        System.out.println("---A CONTINUACIÓN LE MOSTRAMOS EL MENÚ---");
        System.out.println("1: MEGA REGULARES");
        System.out.println("2: PARA 2");
        System.out.println("3: BIG BOX");
        System.out.println("4: COMBOS");
        System.out.println("5: SANDWICHES & TOSTADOS");
        System.out.println("Seleccione una opción:");
        String op = wal.nextLine();
        switch (op) {
            case "1":
                FMegas_Regulares();
                break;
            case "2":
                Bienvenidoo();
                break;
            case "3":
                fBIG_BOX();
                break;
            case "4":
                Bienvenida();
                break;
            case "5":
                sa();
                break;
            default:
                System.out.println("Opción no válida, por favor intente nuevamente.");
                FMENU();
                break;
        }
    }

    private String ubica_dirrec, opcion, delive_tienda, Ubica_Salidas;
    private int eleccion;

    public String FMegas_Regulares() {
        Scanner KFC = new Scanner(System.in);
        System.out.println("ESCOGE ENTRE ESTAS OPCIONES");
        System.out.println("1: MEGA MIX - 8 PIEZAS ");
        System.out.println("2: SUPER MEGA - 10 PIEZAS");
        System.out.println("3: MEGA FULL - 12 PIEZAS");
        System.out.println("4: MEGA GIGANTE - 14 PIEZAS ");
        System.out.println("5: MEGA 12 PIEZAS CON PAPAS");
        opcion = KFC.nextLine();

        switch (opcion) {
            case "MEGA MIX - 8 PIEZAS":
                String Mix = "";
                System.out.println("DELIVERY/RECOJO EN LA TIENDA");
                Mix = KFC.nextLine();
                switch (Mix) {
                    case "DELIVERY":
                        int cantidad_delivery;
                        double precio_delivery = 69.90, total_pagardelivery;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_delivery = KFC.nextInt();
                        total_pagardelivery = precio_delivery * cantidad_delivery;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagardelivery);
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;
                    case "RECOJO EN LA TIENDA":
                        int cantidad_tienda;
                        double precio_tienda = 69.90, total_pagartienda;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_tienda = KFC.nextInt();
                        total_pagartienda = precio_tienda * cantidad_tienda;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;


                }

            case "SUPER MEGA - 10 PIEZAS":
                String mega = "";
                System.out.println("DELIVERY/RECOJO EN LA TIENDA");
                mega = KFC.nextLine();

                switch (mega) {
                    case "DELIVERY":
                        int cantidad_delivery;
                        double precio_delivery = 79.90, total_pagardelivery;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_delivery = KFC.nextInt();
                        total_pagardelivery = precio_delivery * cantidad_delivery;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagardelivery);
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;
                    case "RECOJO EN LA TIENDA":
                        int cantidad_tienda;
                        double precio_tienda = 79.90, total_pagartienda;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_tienda = KFC.nextInt();
                        total_pagartienda = precio_tienda * cantidad_tienda;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;


                }

            case "MEGA FULL - 12 PIEZAS":
                String mega_full = "";
                System.out.println("DELIVERY/RECOJO EN LA TIENDA");
                mega_full = KFC.nextLine();

                switch (mega_full) {
                    case "DELIVERY":
                        int cantidad_delivery;
                        double precio_delivery = 89.90, total_pagardelivery;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_delivery = KFC.nextInt();
                        total_pagardelivery = precio_delivery * cantidad_delivery;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagardelivery);
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;
                    case "RECOJO EN LA TIENDA":
                        int cantidad_tienda;
                        double precio_tienda = 89.90, total_pagartienda;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_tienda = KFC.nextInt();
                        total_pagartienda = precio_tienda * cantidad_tienda;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;


                }
            case "MEGA GIGANTE - 14 PIEZAS ":
                String mega_gigante = "";
                System.out.println("DELIVERY/RECOJO EN LA TIENDA");
                mega_gigante = KFC.nextLine();

                switch (mega_gigante) {
                    case "DELIVERY":
                        int cantidad_delivery;
                        double precio_delivery = 99.90, total_pagardelivery;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_delivery = KFC.nextInt();
                        total_pagardelivery = precio_delivery * cantidad_delivery;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagardelivery);
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;
                    case "RECOJO EN LA TIENDA":
                        int cantidad_tienda;
                        double precio_tienda = 99.90, total_pagartienda;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_tienda = KFC.nextInt();
                        total_pagartienda = precio_tienda * cantidad_tienda;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;


                }
            case "MEGA 12 PIEZAS CON PAPAS":
                String mega_piezas = "";
                System.out.println("DELIVERY/RECOJO EN LA TIENDA");
                mega_piezas = KFC.nextLine();

                switch (mega_piezas) {
                    case "DELIVERY":
                        int cantidad_delivery;
                        double precio_delivery = 77.90, total_pagardelivery;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_delivery = KFC.nextInt();
                        total_pagardelivery = precio_delivery * cantidad_delivery;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagardelivery);
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;
                    case "RECOJO EN LA TIENDA":
                        int cantidad_tienda;
                        double precio_tienda = 77.90, total_pagartienda;
                        System.out.println("CUANTAS ORDENES DESEA LLEVAR");
                        cantidad_tienda = KFC.nextInt();
                        total_pagartienda = precio_tienda * cantidad_tienda;
                        System.out.println("EL TOTAL A PAGAR ES:" + total_pagartienda);
                        System.out.println("GRACIAS POR SER CLINTE DE KFC");
                        break;
                }

        }

        return null;
    }

    static String Bienvenidoo() {
        Scanner KFC = new Scanner(System.in);
        int opcion_parados;
        System.out.println("------------------------");
        System.out.println("----BIENVENIDO A KFC----");
        System.out.println("------------------------");
        System.out.println("PARA DOS");
        System.out.println("------------------------");
        System.out.println("CHICK'N SHARE PARA COMPARTIR");
        System.out.println("QUE LE GUSTARIA CONSUMIR? TENEMOS LOS SIGUIENTES CHICK'NS: ");
        System.out.println("1. COMBO CHICK'N SHARE CLÁSICO ");
        System.out.println("2. CHICK'N SHARE 18 NUGGETS + 2 PAPAS  ");
        System.out.println("3. CHICK'N SHARE MIX 3 PIEZAS + 6 HOT WINGS O NUGGETS + 2 PAPAS ");
        System.out.println("4. CHICK'N SHARE NUGGETS Y HOT WINGS ");
        System.out.println("5. POP CORN PARA 2 ");
        opcion_parados = KFC.nextInt();

        switch (opcion_parados) {
            case 1:
                CHICKN_COMBO_CLÁSICO();
                break;
            case 2:
                CHICKN_18NUGGETS();
                break;
            case 3:
                CHICKN_3_PIEZAS_6HOT_WINGS_WINGS();
                break;
            case 4:
                CHICKN_SHARE_NUGGETS_Y_HOT_WINGS();
                break;
            case 5:
                POP_POPCORN_PARA_DOS();
                break;
        }
        return null;
    }

    static String CHICKN_COMBO_CLÁSICO() {

        Scanner KFC = new Scanner(System.in);
        int opcion;
        System.out.println("---CHICKN_COMBO_CLÁSICO---");
        System.out.println("EL CHICK'N INCLUYE:");
        System.out.println("KFC Combo Chick'N Share Clásico4 Piezas de Pollo , 2 Papas Personales y 1 Bebida de 1 L");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 40.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 40.90, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String CHICKN_18NUGGETS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;
        System.out.println("--- CHICKN_18NUGGETS---");
        System.out.println("EL CHICK'N INCLUYE:");
        System.out.println("KFC Chick'N Share 18 Nuggets + 2 Papas18 Nuggets y 2 Papas Personales");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 38.00, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 38.00, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;

        }
        return null;
    }

    static String CHICKN_3_PIEZAS_6HOT_WINGS_WINGS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---CHICKN_3_PIEZAS_6HOT_WINGS_WINGS---");
        System.out.println("EL CHICK'N INCLUYE:");
        System.out.println("KFC Chick'N Share Mix 3 Piezas + 6 Hot Wings o Nuggets + 2 papas3 Piezas de Pollo, 6 Hot Wings o 6 Nuggets y 2 Papas Personales");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 38.00, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 38.00, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String CHICKN_SHARE_NUGGETS_Y_HOT_WINGS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---CHICKN_SHARE_NUGGETS_Y_HOT_WINGS---");
        System.out.println("EL CHICK'N INCLUYE:");
        System.out.println("KFC Chick'n Share Nuggets y Hot Wings8 Nuggets, 8 Hot Wings, 2 Papas Regulares y 1 Gaseosa 1L");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 42.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 42.90, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String POP_POPCORN_PARA_DOS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---POP_POPCORN_PARA_DOS-1--");
        System.out.println(" POP CORN PARA 2  INCLUYE:");
        System.out.println("KFC Pop Corn Para 22 Pop Corn y 1 Papa Familiar");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 31.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 31.90, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    public String fBIG_BOX() {
        Scanner KFC = new Scanner(System.in);
        opcion = KFC.nextLine();
        System.out.println("BIG BOX:Opciones contundentes con piezas de pollo, papas, ensalada y gasesosa personal");
        System.out.println("---1_:BIG BOX KRUNCHY ==> s/.26.90---");
        System.out.println("---2-.BIG BOX KENTUNCKY CHIKEN SANDWINCH DELUXE ==> s/32.90---");
        System.out.println("---3-.BIG BOX POPCORN ==> s/33.90---");
        System.out.println("---4-.BIG BOX WOW ==> s/28.90---");
        System.out.println("---5-.BIG BOX CLASSIC ==> s/27.90---");
        System.out.println("---6-.BIG BOX FULL ==> s/34.90---");
        opcion = KFC.nextLine();
        return null;
    }

    public String Fopcion_tomada() {
        switch (opcion) {
            case "1":
                this.fKRUNCHY();
                break;
            case "2":
                this.fKENTUNCKY_CHIKEN_SANDWINCH_DELUXE();
                break;
            case "3":
                this.fPOPCORN();
                break;
            case "4":
                this.fWOW();
                break;
            case "5":
                this.fCLASSIC();
                break;
            case "6":
                this.fFULL();
                break;
        }
        return null;
    }

    public String fKRUNCHY() {
        Scanner KFC = new Scanner(System.in);
        System.out.println("-----BIG BOX KRUNCHY----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        this.Fdeliveri_teinda();
        return null;
    }

    public String fKENTUNCKY_CHIKEN_SANDWINCH_DELUXE() {
        Scanner KFC = new Scanner(System.in);
        System.out.println("-----BIG BOX KENTUNCKY CHIKEN SANDWINCH DELUXE----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        this.Fdeliveri_teinda();
        return null;
    }

    public String fPOPCORN() {
        Scanner KFC = new Scanner(System.in);
        System.out.println("-----BIG BOX POPCORN----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        this.Fdeliveri_teinda();
        return null;
    }

    public String fWOW() {
        Scanner KFC = new Scanner(System.in);
        System.out.println("-----BIG BOX WOW----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        this.Fdeliveri_teinda();
        return null;
    }

    public String fCLASSIC() {
        Scanner KFC = new Scanner(System.in);
        System.out.println("-----BIG BOX CLASSIC----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        this.Fdeliveri_teinda();
        return null;
    }

    public String fFULL() {
        Scanner KFC = new Scanner(System.in);
        System.out.println("-----BIG BOX FULL----- ");
        System.out.println("Que deliciosa eleccion hizo ");
        System.out.println("--EMPIECE A ORDENAR--");
        this.Fdeliveri_teinda();
        return null;
    }

    public String Fdeliveri_teinda() {
        Scanner KFC = new Scanner(System.in);
        System.out.println("Delivery");
        System.out.println("o");
        System.out.println("Recojo en tienda");
        delive_tienda = KFC.nextLine();
        return null;
    }

    public String Fselecc_dely_tienda() {
        Scanner KFC = new Scanner(System.in);
        switch (delive_tienda) {
            case "Delivery":
                this.Fubicaicon_direccion();
                break;
            case "Recojo en tienda":
                this.Fubicaicon_direccion();
                break;
        }
        return null;
    }

    public String Fubicaicon_direccion() {
        Scanner KFC = new Scanner(System.in);
        System.out.println("1: ==> Usar mi ubicacion actual");
        System.out.println("o");
        System.out.println("2: ==> Ingrese su direccion");
        ubica_dirrec = KFC.nextLine();
        switch (ubica_dirrec) {
            case "1":
                this.Fubicacion();
                break;
            case "2":
                this.Fdirecion();
                break;
        }
        return null;
    }

    public String Fubicacion() {
        Scanner Ubicaciones = new Scanner(System.in);
        System.out.println("OJO:Este deliveri tendra un costo de 5 soles mas a su pedido");
        System.out.println("Elija cual es su direcciones Actual");
        System.out.println("1: ==>  Salida Lampa ");//25KM
        System.out.println("2: ==>  Salida Cusco");//30KM
        System.out.println("3: ==>  Plaza de armas");//15KM
        System.out.println("4: ==>  Salida Tacna");//60KM
        System.out.println("5: ==>  Salida Arequipa");//70KM
        Ubica_Salidas = Ubicaciones.nextLine();
        switch (Ubica_Salidas) {
            //kfc ESTA EN EL CENTRO DE JULIACA 0KM
            case "1":
                System.out.println("Su pedido llegara antes que se enfrie ");
                System.out.println("  __");
                System.out.println(" /|||\\`.__");
                System.out.println("(   _    _ _\\");
                System.out.println("=`-()--()-'");
                System.out.println("     o  o");
                System.out.println("--------------------");
                System.out.println("  __");
                System.out.println(" /|||\\`.__");
                System.out.println("(   _    _ _\\");
                System.out.println("=`-()--()-'");
                System.out.println("     o  o");

                break;
            case "2":
                break;
            case "3":
                break;
            case "4":
                break;
            case "5":
                break;
        }
        return null;
    }

    public String Fdirecion() {
        System.out.println("OJO:Este delivery tendra un costo de $5 soles mas a su pedido");
        System.out.println();
        return null;
    }

    static String Bienvenida() {

        Scanner KFC = new Scanner(System.in);
        int opcion_combos;
        System.out.println("BIENVENIDO A KFC");
        System.out.println("---COMOBOS---");
        System.out.println("PIEZZAS DE POLLO, NUGGETS O HOTWINGS, ACOMPAÑADOS DE PAPAS Y GASEOSA PERSONAL");
        System.out.println("ESCOJA ENTRE LAS SIGUIENTES OPCIONES:");
        System.out.println("1. COMBO CLÁSICO");
        System.out.println("2. COMBO SNACKS");
        System.out.println("3. COMBO 8 HOT WINGS");
        System.out.println("4. COMBO 8 NUGGETS");
        System.out.println("5. COMBO POPCORN");
        opcion_combos = KFC.nextInt();

        switch (opcion_combos) {
            case 1:
                COMBO_CLÁSICO();
                break;
            case 2:
                COMBO_SNACKS();
                break;
            case 3:
                COMBO_8_HOT_WINGS();
                break;
            case 4:
                COMBO_8_NUGGETS();
                break;
            case 5:
                COMBO_POPCORN();
                break;
        }
        return null;
    }

    static String COMBO_CLÁSICO() {

        Scanner KFC = new Scanner(System.in);
        int opcion;
        System.out.println("---COMBO_CLÁSICO---");
        System.out.println("EL COMBO INCLUYE:");
        System.out.println("2 Piezas de Pollo , 1 Papa Personal y 1 Bebida Personal");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {


            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 20.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 20.90, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String COMBO_SNACKS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;
        System.out.println("---COMBO_SNACKS---");
        System.out.println("EL COMBO INCLUYE:");
        System.out.println("4 Hot Wings, 4 Nuggets, 1 Papa Personal y 1 Bebida Personal");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 24.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 24.90, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;

        }
        return null;
    }

    static String COMBO_8_HOT_WINGS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---COMBO_8_HOT_WINGS---");
        System.out.println("EL COMBO INCLUYE:");
        System.out.println("8 Hot Wings, 1 Papa Personal y 1 Bebida Personal (500ml) [Para Recojo en tienda la bebida personal se reemplaza por 1 vaso de bebida mediana]");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 24.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 24.90, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String COMBO_8_NUGGETS() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---COMBO_8_NUGGETS---");
        System.out.println("EL COMBO INCLUYE:");
        System.out.println("8 Nuggets de Pollo, 1 Papa Personal y 1 Bebida Personal (500ml) [Para Recojo en tienda la bebida personal se reemplaza por 1 vaso de bebida mediana]");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2." + " RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 24.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 29.90, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static String COMBO_POPCORN() {

        Scanner KFC = new Scanner(System.in);
        int opcion;

        System.out.println("---COMBO_POPCORN---");
        System.out.println("EL COMBO INCLUYE:");
        System.out.println("1 Pop Corn, 1 Papa Personal y 1 Bebida Personal");
        System.out.println("ELIJA LA OPCIÓN DE RECEPCIÓN DEL PEDIDO:");
        System.out.println("1. DELIVERY");
        System.out.println("2. RECOJO EN LA TIENDA");
        opcion = KFC.nextInt();

        switch (opcion) {

            case 1:
                int cantidad_delivery1;
                double precio_delivery1 = 24.90, total_pago_delivery1;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery1 = KFC.nextInt();
                total_pago_delivery1 = precio_delivery1 * cantidad_delivery1;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery1);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
            case 2:
                int cantidad_delivery2;
                double precio_delivery2 = 24.90, total_pago_delivery2;
                System.out.println("¿CUANTAS ORDENES DESEA?");
                cantidad_delivery2 = KFC.nextInt();
                total_pago_delivery2 = precio_delivery2 * cantidad_delivery2;
                System.out.println("EL TOTAL A PAGAR ES:" + total_pago_delivery2);
                System.out.println("GRACIAS POR SER CLINTE DE KFC");
                break;
        }
        return null;
    }

    static void menu() {
        System.out.println("bienmvenidos a la opcion de [sandwich y tostadas]");
        System.out.println("___________");
        System.out.println("selecione una //opcion");
        System.out.println(" 1 .COMBO TWISTER TRADICIONAL");
        System.out.println(" 2 .COMBO TWISTER AMERICANO");
        System.out.println(" 3 .TOASTED TWISTER TRADICIONAL");
        System.out.println(" 4 .TOASTED TWISTER AMERICANO");
        System.out.println(" 5 .COMBO KENTUCKY CHICKEN SANDWICH");
        System.out.println(" 6 .KENTUCKY CHICKEN SANDWICH");
        System.out.println("-----------------------------------");
        System.out.println("EMPIECE A ORDENAR");
    }

    static void confirmar(double total) {
        System.out.println("subtotal es dee..");
        System.out.println(total + " soles");
        System.out.println("igv = 18%");
        System.out.println("delibery = 7 soles");
        System.out.println("por favor su pedido, tien un total dee..");
        System.out.println(+factura(total) + " soles ");
    }

    static double preciototal(double precio, int cantidad) {
        double total = precio * cantidad;
        return total;
    }

    static double factura(double total) {
        double igv = 0.18;
        double delivery = 7;
        double pre_facatura = total * igv;
        double facturas = pre_facatura + total + delivery;
        return facturas;
    }

    public static void sa() {
        Scanner wali = new Scanner(System.in);
        String direccion, si;
        menu();
        do {
            System.out.println("ingrese su dirección" + "|DELIVERY|");
            direccion = wali.nextLine();
            if (direccion.trim().length() < 8) {
                System.out.println("Por favor, ingrese una dirección válida.");
            }
        } while (direccion.trim().length() < 8);
        System.out.println("Dirección guardada: " + direccion);
        menu();
        double precio = 0;
        int cantidad;
        int opcion = wali.nextInt();
        wali.nextLine();
        switch (opcion) {
            case 1:
                precio = 24.90;
                System.out.println("COMBO TWISTER TRADICIONAL" + "||24 soles||");
                System.out.println("Tostado con 2 Strips de Pollo, queso americano, lechuga, tomate y mayonesa), 1 Papa Personal y 1 Bebida Personal");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("su factura seria deeee..");
                    confirmar(preciototal(precio, cantidad));
                }
                break;
            case 2:
                precio = 25.90;
                System.out.println("COMBO TWISTER AMERICANO");
                System.out.println("Tostado con 2 Strips de Pollo, queso americano, tocino, lechuga y salsa meltz, 1 Papa Personal y 1 Bebida Personal");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("su factura seria deeee..");
                    confirmar(preciototal(precio, cantidad));
                }
                break;
            case 3:
                precio = 18.90;
                System.out.println("TOASTED TWISTER TRADICIONAL");
                System.out.println("Tostado con 2 Strips de Pollo, queso americano, lechuga, tomate y mayonesa");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("su factura seria deeee..");
                    confirmar(preciototal(precio, cantidad));
                }
                break;
            case 4:
                precio = 19.90;
                System.out.println("TOASTED TWISTER AMERICANO");
                System.out.println("Tostado con 2 Strips de Pollo, queso americano, tocino, lechuga, tomate y salsa meltz");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("su factura seria deeee..");
                    confirmar(preciototal(precio, cantidad));
                }
                break;
            case 5:
                precio = 25.90;
                System.out.println("COMBO KENTUCKY CHICKEN SANDWICH");
                System.out.println("1 Kentucky Chicken Sándwich, 1 Papa Personal y 1 Gaseosa Personal");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("su factura seria deeee..");
                    confirmar(preciototal(precio, cantidad));
                }
                break;
            case 6:
                precio = 19.90;
                System.out.println("KENTUCKY CHICKEN SANDWICH");
                System.out.println("Sandwich de pan brioche con mantequilla, pechuga de Pollo crujiente con triple empanizado, mayonesa premium y pepinillos");
                System.out.println("Cuantas cantidades desea adquirir?");
                cantidad = wali.nextInt();
                System.out.println("DESEA CONFIRMAR TU PEDIDO DE: " + preciototal(precio, cantidad) + " soles");
                wali.nextLine();
                si = wali.nextLine();
                if (si.equals("SI") || si.equals("si")) {
                    System.out.println("su factura seria deeee..");
                    confirmar(preciototal(precio, cantidad));
                }
                break;

        }
    }
}