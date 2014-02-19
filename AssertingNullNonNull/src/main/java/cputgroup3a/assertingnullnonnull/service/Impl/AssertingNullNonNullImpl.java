/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cputgroup3a.assertingnullnonnull.service.Impl;

/**
 *
 * @author kurvin
 */

import cputgroup3a.assertingnullnonnull.service.AssertingNullNonNull;


public class AssertingNullNonNullImpl implements AssertingNullNonNull{
    
    public AssertingNullNonNull obj = null;
    public String stuff = "I love macdonalds burgers yo";
    public int data = 13245;
    public char letter;
    
    @Override
    public AssertingNullNonNull sendObj(){
        return obj;
    }
    
    @Override
    public int sendDataObj(){
        return data;
    }
    
    @Override
    public String sendMsg(){
        return stuff;
    }
    
    @Override
    public char sendLetter(){
        return letter;
    }
}
