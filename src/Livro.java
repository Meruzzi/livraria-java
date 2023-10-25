class Livro {
    private String isbn;
    private String titulo;
    private String autor;
    private int qntEstoque;
    private double preco;

    public String getTitulo() {return titulo;}
    public String getIsbn() {return isbn;}
    public int getQntEstoque() {return qntEstoque;}
    public String getAutor() {return autor;}
    public double getPreco() {return preco;}


    public int setQntEstoque(int qntEstoque) {
        return this.qntEstoque = qntEstoque;
    }

    public double setPreco(double preco) {
        return this.preco = preco;
    }

    public Livro(String isbn, String titulo, String autor, int qntEstoque, double preco) {
      this.isbn = isbn;
      this.titulo = titulo;
      this.autor = autor;
      this.qntEstoque = qntEstoque;
      this.preco = preco;
    };

}
