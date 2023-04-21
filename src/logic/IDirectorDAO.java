/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package logic;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author wero1
 */
public interface IDirectorDAO {
    
    boolean createDirector(Director director)throws SQLException;
    List<Director> consultDirector() throws SQLException;    
    boolean deleteDirector(int directorId) throws SQLException;
    boolean updateDirector(Director director) throws SQLException;
}
