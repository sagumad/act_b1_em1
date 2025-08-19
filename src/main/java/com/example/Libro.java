package com.example;

public class Libro {
    // TODO: Declarar atributos privados para titulo, autor y precio
    private String titulo;
    private String autor;
    private double precio;

    // TODO: Crear constructor con todos los atributos (titulo, autor, precio)
    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    // TODO: Crear constructor con solo titulo y autor (precio = 0.0)
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = 0.0;

    }

    // TODO: Implementar métodos getter para cada atributo
    public String getTitulo() {
        return titulo;

    }

    public String getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;

    }

    // TODO: Implementar métodos setter para cada atributo
    public void setTitulo(String titulo) {
        this.titulo = titulo;

    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    // Nota: Validar que el precio no sea negativo

    public void setPrecio(double precio) {
        if (precio < 0) {
            System.out.println("el valor es invalido");
        } else {
            this.precio = precio;
        }
    }

    // TODO: Crear método aplicarDescuento que reciba porcentaje

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje de descuento inválido.");
            return;
        }
        double descuento = precio * (porcentaje / 100.0);
        this.precio -= descuento;
    }
    // Nota: Calcular descuento y actualizar precio
    // Nota: Aplicar descuento solo si no excede el monto máximo
    // TODO: Crear método aplicarDescuento que reciba porcentaje y monto máximo

    public void aplicarDescuento(double porcentaje, double montoMaximo) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Porcentaje de descuento inválido.");
            return;
        }
        double descuento = precio * (porcentaje / 100.0);
        if (descuento > montoMaximo) {
            System.out.println("Descuento excede el monto máximo permitido.");
        } else {
            this.precio -= descuento;
        }
    }

    // TODO: Crear método mostrarInformacion que imprima los datos del libro
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Precio: " + precio);
    }

}
