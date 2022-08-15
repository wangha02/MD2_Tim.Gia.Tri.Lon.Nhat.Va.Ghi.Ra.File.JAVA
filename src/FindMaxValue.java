import java.util.List;

public class FindMaxValue {
    public static int findMAx(List<Integer>numbers){
        int max =numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }


    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

        String PATH_NUMBER = "C:\\Users\\Admin\\IdeaProjects\\TinhKetQuaFizzBuzz\\untitled2\\untitled4\\src\\number.txt";
        String PATH_RESULT = "C:\\Users\\Admin\\IdeaProjects\\TinhKetQuaFizzBuzz\\untitled2\\untitled4\\src\\result.txt";
        List<Integer> number =  readAndWriteFile.readFile(PATH_NUMBER);
        int maxValue = findMAx(number);
        readAndWriteFile.writeFile(PATH_RESULT, maxValue);
    }
}