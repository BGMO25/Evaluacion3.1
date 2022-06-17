/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.matriculamodelo;

/**
 *
 * @author USUARIO
 */
public class matriculaservicio implements IMatricula {
    private final List<matriculamodelo> matriculamodeloList = new ArrayList<>();

    
    @Override
    public matriculamodelo crear(matriculamodelo matricula) {
        this.matriculamodeloList.add(matricula);
        return matricula;
    }

    @Override
    public List<matriculamodelo> listar() {
        return this.matriculamodeloList;
    }

    @Override
    public matriculamodelo getByCodigo(int i) {
        var matricula = new matriculamodelo();
        for(matriculamodelo mat:this.matriculamodeloList){
            if(mat.getCodigo()==i){
                matricula=mat;
                break;
            }
        }
        return matricula;
    }
}
