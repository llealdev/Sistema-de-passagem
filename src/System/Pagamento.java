package System;

import java.util.Date;

public class Pagamento {

    private Double valor_total;
    private String tipoPagamento;
    private String statusPagamento;
    private Date dataPagamento;

    public Pagamento(){

    }

    public Pagamento(Double valor_total, String tipoPagamento, String statusPagamento, Date dataPagamento) {
        this.valor_total = valor_total;
        this.tipoPagamento = tipoPagamento;
        this.statusPagamento = statusPagamento;
        this.dataPagamento = dataPagamento;
    }

    public Pagamento(Double valor_total, String tipoPagamento, String statusPagamento) {
        this.valor_total = valor_total;
        this.tipoPagamento = tipoPagamento;
        this.statusPagamento = statusPagamento;
    }

    public Double getValor_total() {
        return valor_total;
    }

    public void setValor_total(Double valor_total) {
        this.valor_total = valor_total;
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
}
