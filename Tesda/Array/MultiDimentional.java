package Tesda.Array;

public class MultiDimentional {
    public static void main(String[] args) {
        
        String[][] planets = {
            {"Mercury", "Venus", "Earth", "Mars"},
            {"Jupiter", "Saturn", "Uranus", "Neptune"},
        };
        
        //to get the number of columns
            System.out.println(planets.length);
                
        //to get the number of rows
            System.out.println(planets[1].length);
            
        //traversing multidimensional array using nested for loop
        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets[i].length; j++) {
                System.out.println(planets[i][j]);   
            }
            System.out.println("");
        }
        for (String[] rows : planets) {
            for (String column : rows){
                System.out.println(column);
            }
            System.out.println("");
        }
    }      
}
