package Chapter4;

public class TestDriveFavoriteTeam {

    public static void main(String[]args){
        FavoriteTune myFave = new FavoriteTune();
        myFave.setBandName("Alice In Chains");
        myFave.setAlbumName("Dirt");
        myFave.setSongName("Down in a Hole");


        System.out.println("My favorite band is: " + myFave.getBandName());
        System.out.println("My favorite album is: " + myFave.getAlbumName());
        System.out.println("My favorite song is: " + myFave.getSongName());




    }

}






