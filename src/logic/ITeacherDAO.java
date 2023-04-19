/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logic;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author wero1
 */
public interface ITeacherDAO {
    boolean createTeacher(Teacher teacher) throws SQLException;
    ArrayList<Teacher> consultTeacher() throws SQLException;
}
