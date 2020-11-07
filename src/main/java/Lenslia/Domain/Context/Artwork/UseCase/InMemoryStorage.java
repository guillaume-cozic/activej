package Lenslia.Domain.Context.Artwork.UseCase;

import Lenslia.Infra.Gateway.Storage;


import java.util.HashMap;


public class InMemoryStorage implements Storage {


    private HashMap<String, Double> files = new HashMap<>();

    public double getSize(String filePath) {
        return files.get(filePath);
    }

    public void add(String path, double size){
        files.put(path, size);
    }

    public HashMap<String, Double> getFiles(){
        return files;
    }
}
