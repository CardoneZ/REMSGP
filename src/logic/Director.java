/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;


public class Director extends Teacher {

   public int getTeacherId() {
        return idTeacher;
    }

    public void setTeacherId(int idTeacher) {
        this.idTeacher = idTeacher;
    }

    public int getIdDirector() {
        return idCodirector;
    }

    public void setIdDirector(int idCodirector) {
        this.idCodirector = idCodirector;
    }
    private int idCodirector;
    private int idTeacher;
    
}
