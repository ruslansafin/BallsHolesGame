import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] inputData = {4, 2, 2, 2, 2, 1, 4, 1, 1, 4, 3, 1, 2, 1, 3, 3, 2, 4, 2};

        int n = inputData[0];
        int k = inputData[1];
        int m = inputData[2];

        Map<Cell, List<Cell>> adjacencyList = new HashMap<>(n*n);


        Map<Integer, Coordinates> balls = new HashMap<>(k);
        int j = 1;
        for (int i = 3; i < 2*k + 3; i++) {
            balls.put(j, new Coordinates(inputData[i], inputData[i + 1]));
            if ((i - 3)%2 == 0){
                j += 1;
            }
        }

        Map<Integer, Coordinates> holes = new HashMap<>(k);
        j = 1;
        for (int i = 2*k + 3; i < 4*k + 3; i++){
            holes.put(j, new Coordinates(inputData[i], inputData[i + 1]));
            if ((i - 3)%2 == 0){
                j += 1;
            }
        }


    }
}
