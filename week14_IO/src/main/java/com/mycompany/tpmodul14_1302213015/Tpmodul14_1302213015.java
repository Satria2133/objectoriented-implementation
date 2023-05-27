/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tpmodul14_1302213015;

/**
 *
 * @author glori
 */
public class Tpmodul14_1302213015 {

    public static void main(String[] args) {
        AppConfig config = new AppConfig("Bahasa Indonesia", true, false, "messiWC2022", "F-mbappe");

        ConfigHelper.saveConfigToFile(config);
        AppConfig loadedConfig = ConfigHelper.loadConfigFromFile();
        if (loadedConfig != null) {
            loadedConfig.printConfig();
        }
    }
}
