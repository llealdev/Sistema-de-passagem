package System;

import java.util.Date;

public class Pagamento {

    private Double valorTotal;
    private String tipoPagamento;
    private String statusPagamento;
    private Date dataPagamento;

    public Pagamento(){

    }

    public Pagamento(Double valorTotal, String tipoPagamento, String statusPagamento, Date dataPagamento) {
        this.valorTotal = valorTotal;
        this.tipoPagamento = tipoPagamento;
        this.statusPagamento = statusPagamento;
        this.dataPagamento = dataPagamento;

    }

    public Pagamento(Double valorTotal, String tipoPagamento, String statusPagamento) {
        this.valorTotal = valorTotal;
        this.tipoPagamento = tipoPagamento;
        this.statusPagamento = statusPagamento;
    }

    public Double getValor_total() {
        return valorTotal;
    }

    public void setValor_total(Double valor_total) {
        this.valorTotal = valor_total;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public void parcelamento(int parcela){
        double valorPacerlamento = valorTotal / parcela;

    }
}
