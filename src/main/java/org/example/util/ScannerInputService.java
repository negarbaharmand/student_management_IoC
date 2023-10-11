package org.example.util;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ScannerInputService implements UserInputService {
    private Scanner scanner;

    public ScannerInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String getString() {
        if (scanner != null) {
            return scanner.nextLine();
        } else {
            throw new IllegalStateException("Input can not be null.");
        }
    }

    @Override
    public int getInt() {
        if (scanner != null) {
            return scanner.nextInt();
        } else {
            throw new IllegalStateException("Input can not be null.");
        }
    }
}
