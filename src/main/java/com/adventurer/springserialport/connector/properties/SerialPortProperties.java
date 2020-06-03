package com.adventurer.springserialport.connector.properties;

import lombok.Data;
import lombok.NonNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * @author Claudia López
 * @author Diego Sepúlveda
 */

@Component
@ConfigurationProperties(prefix = "spring-serial-port-connector")
public @Data
class SerialPortProperties {

    /**
     * Port used in the application
     */
    private String portName;

    /**
     * This is the baudRate to use for read and write data in the serial port
     */
    private int baudRate;
}
