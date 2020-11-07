package Lenslia.Infra.Gateway;

import java.util.HashMap;

public interface Storage {
    double getSize(String filePath);
    void add (String filePath, double size);
    HashMap<String, Double> getFiles();
}
