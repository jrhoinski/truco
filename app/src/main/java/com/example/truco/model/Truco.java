package com.example.truco.model;




import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "truco_table")
public class Truco {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    private  String nomeDupla;
    private int qtdeDerrotas;
    private int qtdeVitorias;


    public Truco() {
    }

    public Truco(long id, String nomeDupla, Integer qtdeDerrotas, Integer qtdeVitorias) {
        this.id = id;
        this.nomeDupla = nomeDupla;
        this.qtdeDerrotas = qtdeDerrotas;
        this.qtdeVitorias = qtdeVitorias;

    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeDupla() {
        return nomeDupla;
    }

    public void setNomeDupla(String nomeDupla) {
        this.nomeDupla = nomeDupla;
    }

    public int getQtdeDerrotas() {
        return qtdeDerrotas;
    }

    public void setQtdeDerrotas(int qtdeDerrotas) {
        this.qtdeDerrotas = qtdeDerrotas;
    }


    public int getQtdeVitorias() {
        return qtdeVitorias;
    }

    public void setQtdeVitorias(int qtdeVitorias) {
        this.qtdeVitorias = qtdeVitorias;
    }
}
