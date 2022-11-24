public class Main {
    public static void main(String[] args) {

        System.out.println("Funcionando");

        GrupoA afrontalo = new GrupoA("Afrontalo");


        afrontalo.addBailarin(new Bailarin("Ana", true));
        afrontalo.addBailarin(new Bailarin("Nelson", true));

    }
}