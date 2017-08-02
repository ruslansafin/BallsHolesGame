/**
 * Created by ruslan on 01.08.2017.
 */
public class Cell {
    private int holeNumber; // numder of hole, if it doesn't exist holeNumber = 0
    private Coordinates coordinates;
    private class Wall{
        private boolean north;
        private boolean west;
        private boolean east;
        private boolean south;

        public Wall(boolean north, boolean west, boolean east, boolean south) {
            this.north = north;
            this.west = west;
            this.east = east;
            this.south = south;
        }

        public boolean isNorth() {
            return north;
        }

        public void setNorth(boolean north) {
            this.north = north;
        }

        public boolean isWest() {
            return west;
        }

        public void setWest(boolean west) {
            this.west = west;
        }

        public boolean isEast() {
            return east;
        }

        public void setEast(boolean east) {
            this.east = east;
        }

        public boolean isSouth() {
            return south;
        }

        public void setSouth(boolean south) {
            this.south = south;
        }
    };

    public Cell(int holeNumber, Coordinates coordinates) {
        this.holeNumber = holeNumber;
        this.coordinates = coordinates;
    }

    public int getHoleNumber() {
        return holeNumber;
    }

    public void setHoleNumber(int holeNumber) {
        this.holeNumber = holeNumber;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
