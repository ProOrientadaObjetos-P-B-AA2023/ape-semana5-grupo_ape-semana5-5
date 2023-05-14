import java.util.Scanner;

public class TestProblema {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean iniciar = true;
        String cadenafinal = "";
        int i = 0;
        double salarios[] = new double[10000];
        String nombres[]= new String[10000];
        int edades[]= new int[10000];
        double sumaSalarios = 0;

        while (iniciar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar un empleado");
            System.out.println("2. Mostrar información de los empleados");
            System.out.println("3. Calcular aumento de salario");
            System.out.println("0. Salir");
            int opc = entrada.nextInt();

            if (opc == 1) {
                System.out.println("INGRESE: NOMBRE, SALARIO, EDAD");
                String nombre=entrada.next();
                double salario=entrada.nextDouble();
                int edad=entrada.nextInt();

                salarios[i] =salario;
                nombres[i]=nombre;
                edades[i]=edad;
                Borradores.Empleado1 empleado1 = new Borradores.Empleado1(nombres,salarios,edades);
                sumaSalarios += salario;
                i++;
            } else if (opc == 2) {
                Borradores.Empleado1 empleado1= new Borradores.Empleado1();
                empleado1.mostrarInformacion(i,nombres,salarios,edades);
            } else if (opc == 3) {
                Borradores.Empleado1 empleado1= new Borradores.Empleado1();
                empleado1.aumentarSueldo(salarios,i,sumaSalarios);
            } else if (opc == 0) {
                iniciar = false;
            }
        }
    }
}

class Empleado1 {
    private String nombre[];
    private double salario[];
    private int edad[];

    public Empleado1() {}

    public Empleado1(String[] nombre, double[] salario, int[] edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public void setNombre(String[] nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public void setEdad(int[] edad) {
        this.edad = edad;
    }

    public String[] getNombre() {
        return nombre;
    }

    public double[] getSalario() {
        return salario;
    }

    public int[] getEdad() {
        return edad;
    }

    public void aumentarSueldo(double salarios[], int i, double sumaSalarios){
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingrese el porcentaje que desea aumentar de salario");
        double aumentoSalario = entrada.nextDouble();
        double salarioPromedio = sumaSalarios / i;

        for (int j = 0; j < i; j++) {
            if (salarios[j] < salarioPromedio) {
                salarios[j] += (salarios[j] * aumentoSalario) / 100;
            }
        }

        System.out.println("Salarios actualizados:");
        for (int j = 0; j < i; j++) {
            System.out.println("Empleado " + (j + 1) + ": " + salarios[j]);
        }
    }
    public void mostrarInformacion(int i, String nombres[],double salarios[], int edades[]) {
        for (int j = 0; j < i; j++) {
            System.out.println("Nombre: "+nombres[j]+", Salario: "+salarios[j]+", Edad: "+edades[j]);
        }
    }

}