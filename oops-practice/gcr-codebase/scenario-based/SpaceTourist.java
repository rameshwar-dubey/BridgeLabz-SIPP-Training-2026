package ioexamples;

public class SpaceTourist {
        static int totalReservations = 0;
        static String missionName = "Sun Explorer";
        String touristName;
        int seatNumber;

        SpaceTourist(String touristName, int seatNumber) {
            this.touristName = touristName;
            this.seatNumber = seatNumber;
            totalReservations++;
        }

        SpaceTourist updateSeatNumber(int seatNumber) {
            this.seatNumber = seatNumber;
            return this;
        }

        void displayDetails() {
            System.out.println("Mission Name      : " + missionName);
            System.out.println("Tourist Name      : " + touristName);
            System.out.println("Final Seat Number : " + seatNumber);
            System.out.println("Total Reservations: " + totalReservations);
        }

        public static void main(String[] args) {

            SpaceTourist tourist = new SpaceTourist("Rameshwar", 5);

            tourist.updateSeatNumber(10)
                    .updateSeatNumber(15);
            tourist.displayDetails();
        }

}
