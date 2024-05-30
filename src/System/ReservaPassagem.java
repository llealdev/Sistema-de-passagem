package System;

import java.util.Date;

public class ReservaPassagem {

    private Passagem passagem;
    private Pagamento pagamento;
    private InformacaoCliente informacaoCliente;
    private Date dataReserva;

    public ReservaPassagem() {

    }

    public ReservaPassagem(Passagem passagem, Pagamento pagamento, InformacaoCliente informacaoCliente, Date dataReserva) {
        this.passagem = passagem;
        this.pagamento = pagamento;
        this.informacaoCliente = informacaoCliente;
        this.dataReserva = dataReserva;
    }

    public Passagem getPassagem() {
        return passagem;
    }

    public void setPassagem(Passagem passagem) {
        this.passagem = passagem;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public InformacaoCliente getInformacaoCliente() {
        return informacaoCliente;
    }

    public void setInformacaoCliente(InformacaoCliente informacaoCliente) {
        this.informacaoCliente = informacaoCliente;
    }

    public Date getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
    }

    @Override
    public String toString(){
        return "Destino: " + passagem.getDestino() + "\n"
                + "Tipo de passagem: " + passagem.getTipoPassagem() + "\n"
                + "Data da passagem: " + passagem.getDataPassagem() + "\n"
                + "Tipo de pagamento: " + pagamento.getTipoPagamento() + "\n"
                + "Valor Total: " + pagamento.getValor_total() + "\n";
    }

}
