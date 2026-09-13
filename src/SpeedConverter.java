public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }

        long result = Math.round( (kilometersPerHour / 1.609));

        return result;
    }

    public static void printConversion(double kilometersPerHour){
        long miles = toMilesPerHour(kilometersPerHour);
        if(miles==-1){
            System.out.print("Invalid Value");
            return;
        }
        System.out.print(kilometersPerHour+" km/h = "+miles+" mi/h");
    }

}