package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {

    // Datos para ejercicio10 (sistema de gestión de estudiantes)
    private static final List<String> estudiantes = new ArrayList<>();
    private static final List<Double> calificaciones = new ArrayList<>();

    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10();
    }

    // Ejercicio 1
    public static void ejercicio1() {
        System.out.println("--- Ejercicio 1 ---");
        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Naranja");
        frutas.add("Pera");
        frutas.add(2, "Uva"); // insertar en la posición 2

        System.out.println("Primera fruta: " + frutas.get(0));
        frutas.set(3, "Kiwi"); // modifica posición 3
        System.out.println("Tamaño de la lista: " + frutas.size());
        System.out.println("Lista completa: " + frutas);
    }

    // Ejercicio 2
    public static void ejercicio2() {
        System.out.println("--- Ejercicio 2 ---");
        List<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 20));
        nums.remove(2); // elimina elemento en posición 2 (30)
        nums.remove(Integer.valueOf(20)); // elimina la primera aparición de 20

        System.out.println("Contiene 40? " + nums.contains(40));
        System.out.println("Tamaño final: " + nums.size());
        System.out.println("Lista resultante: " + nums);
    }

    // Ejercicio 3
    public static void ejercicio3() {
        System.out.println("--- Ejercicio 3 ---");
        List<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Luis", "María", "Carlos", "Elena"));
        int contador = 0;
        for (int i = 0; i < nombres.size(); i++) {
            String nombre = nombres.get(i);
            System.out.println("Posición [" + i + "]: " + nombre);
            if (nombre.length() > 4) {
                contador++;
            }
        }
        System.out.println("Nombres con más de 4 caracteres: " + contador);
    }

    // Ejercicio 4
    public static void ejercicio4() {
        System.out.println("--- Ejercicio 4 ---");
        List<Double> valores = new ArrayList<>(Arrays.asList(15.5, 23.8, 9.2, 31.7, 12.4));
        double suma = 0.0;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        for (double v : valores) {
            suma += v;
            if (v > max) max = v;
            if (v < min) min = v;
        }
        double promedio = valores.isEmpty() ? 0.0 : suma / valores.size();
        System.out.println("Suma: " + suma);
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Promedio: " + promedio);
    }

    // Ejercicio 5
    public static void ejercicio5() {
        System.out.println("--- Ejercicio 5 ---");
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 10; i++) nums.add(i);
        System.out.println("Antes: " + nums);
        Iterator<Integer> it = nums.iterator();
        int eliminados = 0;
        while (it.hasNext()) {
            Integer v = it.next();
            if (v % 2 == 0) {
                it.remove();
                eliminados++;
            }
        }
        System.out.println("Después: " + nums);
        System.out.println("Elementos eliminados: " + eliminados);
    }

    // Ejercicio 6
    public static void ejercicio6() {
        System.out.println("--- Ejercicio 6 ---");
        List<String> langs = new ArrayList<>(Arrays.asList("Java", "Python", "C++", "JavaScript", "Python", "Go"));
        int primera = langs.indexOf("Python");
        int ultima = langs.lastIndexOf("Python");
        boolean contieneRuby = langs.contains("Ruby");
        List<String> sub = new ArrayList<>(langs.subList(1, 4)); // 1 hasta 3

        System.out.println("Índice primera 'Python': " + primera);
        System.out.println("Índice última 'Python': " + ultima);
        System.out.println("Contiene 'Ruby'? " + contieneRuby);
        System.out.println("Sublista (1..3): " + sub);
    }

    // Ejercicio 7
    public static void ejercicio7() {
        System.out.println("--- Ejercicio 7 ---");
        List<Integer> nums = new ArrayList<>(Arrays.asList(45, 12, 78, 23, 67, 34, 89, 56));
        Collections.sort(nums);
        System.out.println("Orden ascendente: " + nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("Orden descendente: " + nums);

        List<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Luis", "María", "Carlos", "Elena"));
        Collections.sort(nombres);
        System.out.println("Nombres ordenados alfabéticamente: " + nombres);
        nombres.sort(Comparator.comparingInt(String::length));
        System.out.println("Nombres ordenados por longitud: " + nombres);
    }

    // Ejercicio 8
    public static void ejercicio8() {
        System.out.println("--- Ejercicio 8 ---");
        List<String> medios = new ArrayList<>(Arrays.asList("casa", "auto", "bicicleta", "avión", "barco", "tren"));
        medios.removeIf(s -> s.length() < 5);
        System.out.println("Palabras >=5 chars: " + medios);

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= 20; i++) nums.add(i);
        nums.removeIf(n -> n % 3 == 0);
        System.out.println("Números no divisibles por 3: " + nums);
    }

    // Ejercicio 9
    public static void ejercicio9() {
        System.out.println("--- Ejercicio 9 ---");
        List<String> dias = new ArrayList<>(Arrays.asList("Lunes", "Martes", "Miércoles", "Jueves", "Viernes"));
        Object[] objArr = dias.toArray();
        String[] strArr = dias.toArray(new String[0]);
        System.out.println("Longitud Object[]: " + objArr.length);
        System.out.println("Longitud String[]: " + strArr.length);
        System.out.println("Elementos Object[]:");
        for (Object o : objArr) System.out.println(" - " + o);
        System.out.println("Elementos String[]:");
        for (String s : strArr) System.out.println(" - " + s);

        List<String> desdeArreglo = new ArrayList<>(Arrays.asList(strArr));
        System.out.println("ArrayList desde arreglo: " + desdeArreglo);
    }

    // Ejercicio 10: mini-proyecto sistema de gestión de estudiantes
    public static void ejercicio10() {
        System.out.println("--- Ejercicio 10 ---");
        agregarEstudiante("Ana", 4.5);
        agregarEstudiante("Luis", 2.8);
        agregarEstudiante("María", 3.7);
        agregarEstudiante("Carlos", 4.2);
        agregarEstudiante("Elena", 2.5);

        System.out.println("Listado inicial:");
        listarEstudiantes();

        double promedio = calcularPromedio();
        System.out.println("Promedio general: " + promedio);

        System.out.println("Estudiantes aprobados (>=3.0):");
        estudiantesAprobados();

        System.out.println("Eliminando estudiante en posición 1...");
        eliminarEstudiante(1); // elimina a Luis

        int posMaria = buscarEstudiante("María");
        System.out.println("Posición de María: " + posMaria);

        System.out.println("Listado final:");
        listarEstudiantes();
    }

    // Métodos auxiliares para ejercicio10
    public static void agregarEstudiante(String nombre, Double calificacion) {
        estudiantes.add(nombre);
        calificaciones.add(calificacion);
    }

    public static void eliminarEstudiante(int indice) {
        if (indice >= 0 && indice < estudiantes.size()) {
            estudiantes.remove(indice);
            calificaciones.remove(indice);
        } else {
            System.out.println("Índice inválido: " + indice);
        }
    }

    public static int buscarEstudiante(String nombre) {
        return estudiantes.indexOf(nombre);
    }

    public static double calcularPromedio() {
        if (calificaciones.isEmpty()) return 0.0;
        double suma = 0.0;
        for (double c : calificaciones) suma += c;
        return suma / calificaciones.size();
    }

    public static void listarEstudiantes() {
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println(i + ": " + estudiantes.get(i) + " - " + calificaciones.get(i));
        }
    }

    public static void estudiantesAprobados() {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (calificaciones.get(i) >= 3.0) {
                System.out.println(estudiantes.get(i) + " - " + calificaciones.get(i));
            }
        }
    }
}