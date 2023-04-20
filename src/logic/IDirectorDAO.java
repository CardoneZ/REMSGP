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
public interface IDirectorDAO {
    
    boolean createDirector(Director director)throws SQLException;
    ArrayList<Director> consultDirector() throws SQLException;    
    boolean deleteDirector(int directorId) throws SQLException;
    boolean updateDirector(Director director) throws SQLException;
}
