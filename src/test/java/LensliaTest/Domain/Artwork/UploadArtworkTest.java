package LensliaTest.Domain.Artwork;

import Lenslia.Domain.Context.Artwork.UseCase.UploadArtwork;
import Lenslia.Domain.Context.Artwork.UseCase.DepInj;
import Lenslia.Infra.Gateway.Storage;
import io.activej.inject.Injector;
import io.activej.inject.module.Module;
import io.activej.inject.module.ModuleBuilder;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class UploadArtworkTest {

    private Storage storage;
    private Injector injector;

    @Test
    public void testShouldUploadPicture(){
        UploadArtwork uploadArtwork = new UploadArtwork();

        System.out.println(storage);

        storage = injector.getInstance(Storage.class);
        System.out.println(storage);
        uploadArtwork.upload("test");
    }

    @Before
    public void provideImpl() {
        Module artwork = ModuleBuilder.create().scan(DepInj.class).build();
        injector = Injector.of(artwork);
        storage = injector.getInstance(Storage.class);
    }
}
