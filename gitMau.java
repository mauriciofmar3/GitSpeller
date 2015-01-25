import java.util.*;

class gitMau {
    public static void main(String args[]) throws Exception {
        long firstDay = 1422230400000L;
        long today = (new Date()).getTime();
        long daysSinceToday = (today - firstDay) / 1000 / 60 / 60 / 24;
        daysSinceToday = daysSinceToday % (18 * 7);
        System.out.println(daysSinceToday);
        boolean[][] printingDays = printingDays();
        for (int x = 0; x < 120; ++x) {
            Date todayDate = new Date(firstDay + ((long)x) * (24L * 60L * 60L * 1000L));
            daysSinceToday = (todayDate.getTime() - firstDay) / 1000L / 60L / 60L / 24L;
            long weeksSince = daysSinceToday / 7;
            long daysSince = daysSinceToday % 7;
            // System.out.println(daysSinceToday + " " + weeksSince + " " + daysSince);
            if (printingDays[(int)weeksSince][(int)daysSince]) {
                System.out.println(todayDate);
            }
        }
    }

    public static boolean[][] printingDays() {
        boolean[][] printingDays = {{false, true, true, true, true, true, false},
                                    {false, false, true, false, false, false, false},
                                    {false, false, false, true, false, false, false},
                                    {false, false, true, false, false, false, false},
                                    {false, true, true, true, true, true, false},
                                    {false, false, false, false, false, false, false},
                                    {false, true, true, true, true, true, false},
                                    {false, true, false, true, false, false, false},
                                    {false, true, false, true, false, false, false},
                                    {false, true, false, true, false, false, false},
                                    {false, true, true, true, true, true, false},
                                    {false, false, false, false, false, false, false},
                                    {false, true, true, true, true, true, false},
                                    {false, false, false, false, false, true, false},
                                    {false, false, false, false, false, true, false},
                                    {false, false, false, false, false, true, false},
                                    {false, true, true, true, true, true, false},
                                    {false, false, false, false, false, false, false}}; 
        return printingDays;
    }
}
