package data;

import static data.helpers.Artist.DrawQuadText;

public class TileGrid {

    public Tile[][] map;

    public TileGrid(){
        map = new Tile[20][15];
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++){
                map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Grass);
            }
        }
    }

    public void Draw(){

        for(int i = 0; i < map.length; i++){
            for( int j = 0; j < map[i].length; j++){
                map[i][j].Draw();

            }
        }

    }

    public TileGrid(int[][] newMap){
        map = new Tile[20][15];
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){


                switch(newMap[j][i]){
                    case 0 :
                        map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Grass);
                        break;
                    case 1 :
                        map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Ground);
                        break;
                    case 2 :
                        map[i][j] = new Tile(i * 64, j * 64, 64, 64, TileType.Water);
                       break;}
            }
        }
    }

    public void SetTile(int xCoord, int yCoord, TileType type){
        map[xCoord][yCoord] = new Tile(xCoord * 64, yCoord * 64, 64, 64, type);
    }

    public  Tile GetTile(int xPlace, int yPlace){
        return map[xPlace][yPlace];
    }

}
