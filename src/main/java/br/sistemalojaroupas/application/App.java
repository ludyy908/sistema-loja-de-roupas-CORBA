/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.sistemalojaroupas.application;

import br.sistemalojaroupas.db.DB;


public class App {
    
    public static void main(String[] args) {
        DB.start();
        
        DB.close();
    }
}
