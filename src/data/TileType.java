package data;

public enum TileType {

    Grass("grass", true), Ground("ground", false), Water("water", false);

    String textureName;
    boolean buildable;

    TileType(String textureName,boolean buildable){
        this.textureName = textureName;
        this.buildable = buildable;
    }
}
