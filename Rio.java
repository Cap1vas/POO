public class Rio {
    String origem;

    public static void main(String[] args) {
        Rio r1 = new Rio();
        Rio r2 = new Rio();
        r1.setOrigem("Amazonia");
        r2.setOrigem("Nilo");
        teste(r1,r2);
        System.out.println(r1.getOrigem());
        System.out.println(r2.getOrigem());
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }
    public static void teste(Rio r2, Rio r1){
        r1.setOrigem("Mississipi");
        r1=r2;
        r1.setOrigem("Ganges");
        r2=r1;
        r2.setOrigem("Yangtzé");
    }
}
