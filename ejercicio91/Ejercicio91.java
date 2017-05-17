/*
Practica91: Realiza el modelo entidad relacion del siguiente supuesto.
Tenemos una biblioteca donde tenemos libros y ejemplares de esos libros y queremos controlarlos.
Luego se desea saber quienes han realizado los prestamos y queremos tener guardados los datos de los usuarios de la biblioteca.
Gestión de biblioteca.
 */
package ejercicio91;

/**
 *
 * @author Legui
 */
public class Ejercicio91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Menu m = new Menu();

        Libro l1 = new Libro();
        Libro l2 = new Libro();
        Libro l3 = new Libro();

        Usuario u1 = new Usuario("11111111A", "Maria", "Alonso", "Pérez");
        Usuario u2 = new Usuario("22222222B", "Paco", "Abad", "González");
        Usuario u3 = new Usuario("33333333C", "David", "Pastor", "Fernández");

        int opcion = 0, libro = 0, usuario = 0;

        while (opcion != 4) {
            m.Mostrar();
            m.Opcion();
            opcion = m.LeerDatoInt();
            switch (opcion) {
                case 1:
                    m.Libros();
                    m.Opcion();
                    libro = m.LeerDatoInt();
                    switch (libro) {
                        case 1:
                            l1.AltaLibro();
                            break;
                        case 2:
                            l2.AltaLibro();
                            break;
                        case 3:
                            l3.AltaLibro();
                            break;
                        default:
                            System.out.println("Seleccione un libro existente. Gracias.");
                    }
                    break;

                case 2:
                    System.out.println("Nombre de libro: " + l1.getNombre() + "\t" + "Ejemplares: " + l1.getEjemplares());
                    System.out.println("Nombre de libro: " + l2.getNombre() + "\t" + "Ejemplares: " + l2.getEjemplares());
                    System.out.println("Nombre de libro: " + l3.getNombre() + "\t" + "Ejemplares: " + l3.getEjemplares());
                    break;

                case 3:
                    m.Libros();
                    m.Opcion();
                    libro = m.LeerDatoInt();
                    switch (libro) {
                        case 1:
                            l1.AltaEjemplar();
                            l1.Prestamo();
                            System.out.println("Usuario1 -> "+u1.getNombre());
                            System.out.println("Usuario2 -> "+u2.getNombre());
                            System.out.println("Usuario3 -> "+u3.getNombre());
                            m.Opcion();
                            usuario = m.LeerDatoInt();
                            switch (usuario) {
                                case 1:
                                    l1.ImprimirEjemplar();
                                    u1.ImprimirUsuario();
                                    break;

                                case 2:
                                    l1.ImprimirEjemplar();
                                    u2.ImprimirUsuario();
                                    break;

                                case 3:
                                    l1.ImprimirEjemplar();
                                    u3.ImprimirUsuario();
                                    break;
                            }
                            break;
                        case 2:
                            l2.AltaEjemplar();
                            l2.Prestamo();
                            System.out.println("Usuario1 -> "+u1.getNombre());
                            System.out.println("Usuario2 -> "+u2.getNombre());
                            System.out.println("Usuario3 -> "+u3.getNombre());
                            m.Opcion();
                            usuario = m.LeerDatoInt();
                            switch (usuario) {
                                case 1:
                                    l2.ImprimirEjemplar();
                                    u1.ImprimirUsuario();
                                    break;

                                case 2:
                                    l2.ImprimirEjemplar();
                                    u2.ImprimirUsuario();
                                    break;

                                case 3:
                                    l2.ImprimirEjemplar();
                                    u3.ImprimirUsuario();
                                    break;
                            }
                            break;
                        case 3:
                            l3.AltaEjemplar();
                            l3.Prestamo();
                            System.out.println("Usuario1 -> "+u1.getNombre());
                            System.out.println("Usuario2 -> "+u2.getNombre());
                            System.out.println("Usuario3 -> "+u3.getNombre());
                            m.Opcion();
                            usuario = m.LeerDatoInt();
                            switch (usuario) {
                                case 1:
                                    l3.ImprimirEjemplar();
                                    u1.ImprimirUsuario();
                                    break;

                                case 2:
                                    l3.ImprimirEjemplar();
                                    u2.ImprimirUsuario();
                                    break;

                                case 3:
                                    l3.ImprimirEjemplar();
                                    u3.ImprimirUsuario();
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Seleccione un libro existente. Gracias.");
                    }
                    break;
            }
        }
    }

}
