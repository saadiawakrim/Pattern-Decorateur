import produits.Boisson;
import produits.Deca;
import produits.Espresso;
import produits.Sumatra;

public class Main {

        public static void main(String[] args) {

            Boisson boisson = new Espresso();

            System.out.println(boisson.getDescription());
            System.out.println(boisson.cout());

            boisson = new Deca();
            System.out.println(boisson.getDescription());
            System.out.println(boisson.cout());

            boisson = new Sumatra();
            System.out.println(boisson.getDescription());
            System.out.println(boisson.cout());
        }

}
