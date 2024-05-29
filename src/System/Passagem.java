package System;

import java.util.Date;
import java.util.Timer;

public class Passagem {

    private Boolean disponibilidadePassagem;
    private String tipoPassagem;
    private String origemPassagem;
    private String destino;
    private Date dataPassagem;

    public Passagem(){

    }

    public Passagem(Boolean disponibilidadePassagem, String tipoPassagem, String origemPassagem, String destino, Date dataPassagem) {
        this.disponibilidadePassagem = disponibilidadePassagem;
        this.tipoPassagem = tipoPassagem;
        this.origemPassagem = origemPassagem;
        this.destino = destino;
        this.dataPassagem = dataPassagem;
    }

    public Boolean getDisponibilidadePassagem() {
        return disponibilidadePassagem;
    }

    public void setDisponibilidadePassagem(Boolean disponibilidadePassagem) {
        this.disponibilidadePassagem = disponibilidadePassagem;
    }

    public String getTipoPassagem() {
        return tipoPassagem;
    }

    public void setTipoPassagem(String tipoPassagem) {
        this.tipoPassagem = tipoPassagem;
    }

    public String getOrigemPassagem() {
        return origemPassagem;
    }

    public void setOrigemPassagem(String origemPassagem) {
        this.origemPassagem = origemPassagem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getDataPassagem() {
        return dataPassagem;
    }

    public void setDataPassagem(Date dataPassagem) {
        this.dataPassagem = dataPassagem;
    }
}
