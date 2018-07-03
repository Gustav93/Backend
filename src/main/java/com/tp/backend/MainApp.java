package com.tp.backend;

import com.tp.backend.service.MacheoService;

public class MainApp {

    public static void main(String... args) throws Exception {

        MacheoService macheoService = new MacheoService();
        macheoService.machear();
    }
}

