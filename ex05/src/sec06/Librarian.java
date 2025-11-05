package sec06;

public class Librarian {
    private LibraryMaterial material;

    public Librarian(LibraryMaterial material) {
        this.material = material;
    }

    public void register() {
        material.registerMaterial();
    }

    public void loan() {
        material.loanMaterial();
    }
}
