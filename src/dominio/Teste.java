package dominio;

import java.time.LocalDate;

public class Teste extends PaiTeste {
    private int teste;
    private LocalDate data;

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Teste() {
    }

    public int getTeste() {
        return teste;
    }

    public void setTeste(int teste) {
        this.teste = teste;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        result = prime * result + teste;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Teste other = (Teste) obj;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        if (teste != other.teste)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Teste [data=" +
                data +
                ", descricao=" + getDescricao() +
                ", teste=" + teste +
                ", titulo=" + getTitulo()
                + "]";
    }

}
