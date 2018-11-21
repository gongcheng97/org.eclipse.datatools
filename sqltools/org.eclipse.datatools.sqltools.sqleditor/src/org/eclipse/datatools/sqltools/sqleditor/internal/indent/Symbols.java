/*
 * Created on 2005-5-27
 * 
 * Copyright Sybase, Inc. All rights reserved.
 */
package org.eclipse.datatools.sqltools.sqleditor.internal.indent;

/**
 * Symbols for the heuristic sql scanner.
 * 
 * @author Li Huang
 *  
 */
public interface Symbols
{
    int TokenEOF   = -1;
    int TokenOTHER = 0;
    int Tokenbegin = 1000;
    int TokenBEGIN = 1001;
    int Tokenend = 1002;
    int TokenEND = 1003;
    int TokenIDENT = 2000;


    String BEGIN = "BEGIN";
    String begin = "begin";
    String beginTrail = "end ";
    String BEGINTrail = "END ";
}

