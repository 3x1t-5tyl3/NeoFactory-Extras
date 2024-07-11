package ch.exitian.nfextras.registry.material;

public interface FlintMaterialLevel {

    int level = 1;
    default int getLevel(){
        return level;
    };
}
