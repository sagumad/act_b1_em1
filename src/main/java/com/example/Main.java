package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:


        // 1. Crear dos objetos Estudiante con diferentes valores
        Estudiante estudiante1 = new Estudiante("miguel", 24, 4.2);
        Estudiante estudiante2 = new Estudiante("angel", 21, 3.5);


        // 2. Mostrar la información de ambos estudiantes
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
     

        // 3. Modificar algún atributo usando un setter
        estudiante1.setEdad(25);
        estudiante2.setPromedio(3.8);

   

        // 4. Mostrar la información actualizada
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        
        

        // TODO: Crear método main para:

        // 1. Crear un libro usando el constructor completo
        Libro libro1 = new Libro("Dracula", "bram stocker", 250.000);
            
        

        // 2. Crear un libro usando el constructor con solo titulo y autor
        Libro libro2 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");
        
        
        
        // 3. Mostrar información de ambos libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
        // 4. Aplicar descuento usando ambas versiones del método
        libro1.aplicarDescuento(10); 
        

        libro2.aplicarDescuento(15.25); 
        
        // 5. Mostrar información actualizada de los libros
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}