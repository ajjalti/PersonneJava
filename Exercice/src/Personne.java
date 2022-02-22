public class Personne {
    String nom;
    private String prenom;
    private int age;
    boolean mineur;
    static int erreur=0;
    static int nombrePersonne=0;
    //constructor
    public Personne(){
        nombrePersonne++;
        this.erreur=10;
    }
    public  Personne(String name,String prenom,int age){
        this.nom=name;
        this.prenom=prenom;
        this.age=age;
        if(age>18){
            this.mineur=false;
        }else{
            this.mineur=true;
        }

    }
    public Personne(String nom,String prenom){
        this.nom=nom;
        this.prenom=prenom;
        this.age=10;
        this.mineur=true;
        nombrePersonne++;
    }
    // les getters

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public boolean isMineur() {
        return mineur;
    }
    //les seters:

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
        if(age>=18){
            this.mineur=false;
        }else{
            this.mineur=true;
        }
    }

    public void Profil(){
        System.out.println("bonjour je m'appel "+this.prenom+" "+this.nom+" et j\'ai "+this.age);
    }
}
class Etudiant extends Personne{
    int nombreInscr;
    public Etudiant(int nbr,String name,String prenom,int age){
        /*super.nom = name;
        super.setPrenom(prenom);
        super.setAge(age);*/
        super(name,prenom,age);
        this.nombreInscr=nbr;
        super.nombrePersonne++;
    }


    public  void  Profil(){
        super.Profil();
        System.out.println("ok");
    }

}
