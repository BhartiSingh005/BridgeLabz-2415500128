// Write a Program to compute the volume of Earth in km^3 and miles^3
class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm3 = (4.0/3) * Math.PI * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / 1.6; 
        double volumeMiles3 = (4.0/3) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}