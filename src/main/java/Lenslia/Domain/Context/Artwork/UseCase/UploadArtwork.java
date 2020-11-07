package Lenslia.Domain.Context.Artwork.UseCase;

import Lenslia.Infra.Gateway.Storage;
import io.activej.inject.Injector;
import io.activej.inject.module.Module;
import io.activej.inject.module.ModuleBuilder;


public class UploadArtwork {

    private Storage storage;


    public String upload(String tmpPath) {

        provideImpl();

        System.out.println(storage);

        return tmpPath;
    }

    public void provideImpl() {
        Module artwork = ModuleBuilder.create().scan(DepInj.class).build();
        Injector injector = Injector.of(artwork);
        storage = injector.getInstance(Storage.class);
    }
}
