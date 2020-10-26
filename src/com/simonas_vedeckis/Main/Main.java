package com.simonas_vedeckis.Main;

import com.simonas_vedeckis.IO.LoadWithCSV;
import com.simonas_vedeckis.IO.LoadWithSerialization;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        LoadWithSerialization.loadWithSerialization();
        LoadWithCSV.loadWithCSV();

    }
}
