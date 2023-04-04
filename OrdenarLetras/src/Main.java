import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Cusco");
        palabras.add("Loreto");
        palabras.add("Quillabamba");
        palabras.add("Lima");
        palabras.add("Quebrada");
        palabras.add("San Martín");

        long initialTime = System.nanoTime();
        palabras.stream().sorted().collect(Collectors.toList()).forEach(s -> System.out.println(s));
        long endTime = System.nanoTime();
        System.out.print("Diferencia de tiempo de programación secuencial: "+(endTime - initialTime)/ 1_000_000_000.0 +" segundos");

        System.out.println();

        initialTime = System.nanoTime();
        palabras.stream().parallel().sorted().collect(Collectors.toList()).forEach(s -> System.out.println(s));
        endTime = System.nanoTime();
        System.out.print("Diferencia de tiempo de programación paralelo: "+(endTime - initialTime)/ 1_000_000_000.0 +" segundos");
    }
}