/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.matriculamodelo;

/**
 *
 * @author USUARIO
 */
public interface IMatricula {
    public matriculamodelo crear(matriculamodelo matricula);
    public List<matriculamodelo> listar();
    public matriculamodelo getByCodigo(int i);
}
