/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISM
 */
import java.sql.SQLException;
import java.util.Calendar;
import java.util.List;
import minhavaga.minhavagaweb.cdp.*;
import minhavaga.minhavagaweb.cgd.*;
import minhavaga.minhavagaweb.cgt.AplCliente;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        AplCliente aplCliente = new AplCliente();      
        Pessoa p = new Pessoa();
        p.setNome("Helen Franca Medeiros");
        p.setEmail("helen@gmail.com");
        p.setCpf("98765432198");
        p.setSenha("123456");

        aplCliente.cadastrarCliente(p);
       
    }
}