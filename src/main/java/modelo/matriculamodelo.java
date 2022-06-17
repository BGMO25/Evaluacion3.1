/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class matriculamodelo {
    private int codigo;
    private String placa;
    private String ciudad;
    private String año;

    public matriculamodelo(int codigo, String placa, String ciudad, String año) {
        this.codigo = codigo;
        this.placa = placa;
        this.ciudad = ciudad;
        this.año = año;
    }

    public matriculamodelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Matricula{" + "codigo=" + codigo + ", placa=" + placa + 
                ", ciudad=" + ciudad + ", año=" + año + '}';
    }
}
