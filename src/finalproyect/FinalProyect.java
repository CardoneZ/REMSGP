/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalproyect;

import java.sql.SQLException;
import java.util.List;
import logic.Director;
import dataaccessobject.DirectorDAO;
import java.util.ArrayList;
import logic.Codirector;
import dataaccessobject.CodirectorDAO;
import logic.Teacher;
import logic.TeacherDAO;



public class FinalProyect {

   
    public static void main(String[] args) throws SQLException {
        
        int IdDirector = 1;
       DirectorDAO directorDAO = new DirectorDAO();
        
        
        
        /*director.setTeacherId(3);
        director.setIdDirector(1);
        
       */
        directorDAO.deleteDirector(IdDirector);
       
       /*
       ArrayList<Director> director = new ArrayList();
       
        DirectorDAO directorDAO = new DirectorDAO();
        director = directorDAO.consultDirector();

        for(int i=0; i<director.size(); i++){
            System.out.println(director.get(i).getTeacherId());
            System.out.println(director.get(i).getFirstName());
            System.out.println(director.get(i).getFatherLastName());
            System.out.println(director.get(i).getMotherLastName());
            System.out.println(director.get(i).geteMail());
        }
        
        /*
        ArrayList<Codirector> codirector = new ArrayList();
       
        CodirectorDAO codirectorDAO = new CodirectorDAO();
        codirector = codirectorDAO.consultCodirector();

        for(int i=0; i<director.size(); i++){
            System.out.println(codirector.get(i).getTeacherId());
            System.out.println(codirector.get(i).getFirstName());
            System.out.println(codirector.get(i).getFatherLastName());
            System.out.println(codirector.get(i).getMotherLastName());
            System.out.println(codirector.get(i).geteMail());
        }
        */
        /*
        ArrayList<Teacher> teacher = new ArrayList();
       
        TeacherDAO TeacherDAO = new TeacherDAO();
        teacher = teacherDAO.consultTeacher();

        for(int i=0; i<director.size(); i++){
            System.out.println(teacher.get(i).getStaffNumber());
            System.out.println(teacher.get(i).getFirstName());
            System.out.println(teacher.get(i).getFatherLastName());
            System.out.println(teacher.get(i).getMotherLastName());
            System.out.println(teacher.get(i).geteMail());
        }
        */
       
       /*
        TeacherDAO teacherDAO = new TeacherDAO();
        
        Teacher teacher = new Teacher();
        teacher.setUserId(4);
        teacher.setStaffNumber(8743);
        
        teacherDAO.createTeacher(teacher);
       */
       
   
       /*
        CodirectorDAO codirectorDAO = new CodirectorDAO();
        
        Codirector codirector = new Codirector();
        codirector.setTeacherId(12);
        
       
        codirectorDAO.createCodirector(codirector);
     */
        }   
    
}
