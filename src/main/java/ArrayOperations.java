public class ArrayOperations {

    public static double getTotal( double [] numbers) {
        double total = 0;
        
        for( int currentNumbersIndex = 0; currentNumbersIndex < numbers.length; currentNumbersIndex++){
            total = total + numbers[ currentNumbersIndex];
        }
        
        return total;
    }
    
    public static double getAverage( double [ ] numbers) {
        double numbersTotal = getTotal( numbers);
        int numberOfItemsInNumbersArray = numbers.length;
        double average = numbersTotal / numberOfItemsInNumbersArray;
        return average;
    }
    public static double getHighest( double [ ] numbers){
        double highestNumber = numbers[ 0 ];
        
        for( int currentNumbersIndex = 0; currentNumbersIndex < numbers.length; currentNumbersIndex++){
            if( numbers[ currentNumbersIndex] > highestNumber) {
                highestNumber = numbers[ currentNumbersIndex];
            }
        }
        
        return highestNumber;
    }
    
    public static double getLowest( double [ ] numbers) {
        double lowestNumber = numbers[ 0];
        
        for( int currentNumbersIndex = 0; currentNumbersIndex < numbers.length; currentNumbersIndex++ ){
        if( numbers[ currentNumbersIndex] < lowestNumber) {
            lowestNumber = numbers[ currentNumbersIndex];
        }
    }
        return lowestNumber;
    }
    
    public static void main( String [ ] args) {
        double [ ] numbers = { 3.4, 3.6, 1.2, 4.5, 3.0} ;
        
        System.out.println( "Total: " + getTotal( numbers ) + "\n" +
                "Average: " + String.format( "%.2f", getAverage(numbers)) + "\n" +
                "Highest: " + getHighest( numbers) + "\n" +
                "Lowest:  " + getLowest( numbers));
    }
}
