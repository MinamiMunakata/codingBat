public class caughtSpeedingQuiz {
    static int caughtSpeeding(int speed, boolean isBirthday) {
        int noTicketBorderLine = 60;
        int smallTicketBoderLine = 80;
        int noTicket = 0;
        int smallTicket = 1;
        int bigTicket = 2;
        int birthDayBonus = 0;
        int bonus = 5;
        if (isBirthday) {
            birthDayBonus += bonus;
        }
        if (speed <= noTicketBorderLine + birthDayBonus) {
            return noTicket;
        } else if (speed <= smallTicketBoderLine + birthDayBonus) {
            return smallTicket;
        } else {
            return bigTicket;
        }
    }

    public static void main(String[] args) {
        System.out.println(caughtSpeeding(65, false));
    }
}
