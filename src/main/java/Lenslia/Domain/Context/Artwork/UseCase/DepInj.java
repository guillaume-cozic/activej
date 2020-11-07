package Lenslia.Domain.Context.Artwork.UseCase;


import Lenslia.Infra.Gateway.Storage;
import io.activej.inject.annotation.Provides;

public class DepInj {
    @Provides
    static Storage storage() { return new InMemoryStorage(); }
}