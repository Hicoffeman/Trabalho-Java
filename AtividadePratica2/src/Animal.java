public class Animal {

    private String NomeDoAnimal;
    private int IdadeDoAnimal;
    private String CorDoAnimal;

    public Animal(String nomeDoAnimal, int idadeDoAnimal, String corDoAnimal) {
        NomeDoAnimal = nomeDoAnimal;
        IdadeDoAnimal = idadeDoAnimal;
        CorDoAnimal = corDoAnimal;
    }

    public String getNomeDoAnimal() {
        return NomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        NomeDoAnimal = nomeDoAnimal;
    }

    public int getIdadeDoAnimal() {
        return IdadeDoAnimal;
    }

    public void setIdadeDoAnimal(int idadeDoAnimal) {
        IdadeDoAnimal = idadeDoAnimal;
    }

    public String getCorDoAnimal() {
        return CorDoAnimal;
    }

    public void setCorDoAnimal(String corDoAnimal) {
        CorDoAnimal = corDoAnimal;
    }

}