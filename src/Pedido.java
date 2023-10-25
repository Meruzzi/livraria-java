class Pedido {
    private String nomeLivro;
    private String numPedido;
    private int numExemplares;
    private double total;

    public String getNumPedido() { return numPedido;};
    public int getNumExemplares() { return numExemplares;};
    public double getTotal() { return total;};
    public String setNumPedido(String numPedido) { return this.numPedido = numPedido;};
    public int setNumExemplares(int numExemplares) { return this.numExemplares = numExemplares;};

    public Pedido(String numPedido, int numExemplares) {
        this.numExemplares = numExemplares;
        this.numPedido = numPedido;
    };

    public void setTotal(int numExemplares, double valor) {
      total = numExemplares * valor;
    };


}
