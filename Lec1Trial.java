public class Lec1Trial {

   public static void main(String[] args) {

     input(data); 
     //input data file as an array of classes for each UFO

     //longest sighting
     int longDur = data[0].duration;
     int longIndex = 0;
     for (int i=1; i<data.length; i++) {
       if (data[i].duration > longDur) {
         longDur = data[i].duration;
         longIndex = i;
       }
     }
     System.out.println("Longest sighting:");
     System.out.println("When: " + data[longIndex].date + " " + data[longIndex].time);
     System.out.println("Shape: " + data[longIndex].shape);
     System.out.println("Where: (" + data[longIndex].latitude + ", " + data[longIndex].longitude + ")");

     //shortest sighting
     int shortDur = data[0].duration;
     int shortIndex = 0;
     for (int i=1; i<data.length; i++) {
       if (data[i].duration < shortDur) {
         shortDur = data[i].duration;
         shortIndex = i;
       }
     }
     System.out.println("Shortest sighting:");
     System.out.println("When: " + data[shortIndex].date + " " + data[shortIndex].time);
     System.out.println("Shape: " + data[shortIndex].shape);
     System.out.println("Where: (" + data[shortIndex].latitude + ", " + data[shortIndex].longitude + ")");

     // averages for each shape (assume there are three shapes - cigar, fireball, and light)
     int cDur = 0;
     int cLat = 0;
     int cLon = 0;
     int cN = 0;

     int fDur = 0;
     int fLat = 0;
     int fLon = 0;
     int fN = 0;

     int lDur = 0;
     int lLat = 0;
     int lLon = 0;
     int lN = 0;

     for (int i=0; i<data.length; i++) {
       if (data[i].shape == "cigar") {
         cDur += data[i].duration;
         cLat += data[i].latitude;
         cLon += data[i].longitude;
         cN++;
       } else if (data[i].shape == "fireball") {
        fDur += data[i].duration;
        fLat += data[i].latitude;
        fLon += data[i].longitude;
        fN++;
      } else {
        lDur += data[i].duration;
        lLat += data[i].latitude;
        lLon += data[i].longitude;
        lN++;
      }

      System.out.println("Averages for cigar:");
      System.out.println("Duration: " + cDur / cN);
      System.out.println("Location: (" + cLat / cN + ", " + cLon / cN + ")");

      System.out.println("Averages for fireball:");
      System.out.println("Duration: " + fDur / fN);
      System.out.println("Location: (" + fLat / fN + ", " + fLon / fN + ")");

      System.out.println("Averages for light:");
      System.out.println("Duration: " + lDur / lN);
      System.out.println("Location: (" + lLat / lN + ", " + lLon / lN + ")");

   }
}}