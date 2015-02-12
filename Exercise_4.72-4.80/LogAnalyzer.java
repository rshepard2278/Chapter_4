/**
 * Read web server data and analyse
 * hourly access patterns.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class LogAnalyzer
{
    // Where to calculate the hourly access counts.
    private int[] hourCounts;
    private int[] dayCounts;
    // Use a LogfileReader to access the data.
    private LogfileReader reader;

    /**
     * Create an object to analyze hourly web accesses.
     */
    public LogAnalyzer()
    { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        dayCounts = new int[32];
        // Create the reader to obtain the data.
        reader = new LogfileReader();
    }


    /**
     * author Richard
     * overloaded constructor to specify filename
     */
     public LogAnalyzer(String filename) { 
        // Create the array object to hold the hourly
        // access counts.
        hourCounts = new int[24];
        dayCounts = new int[32];
        // Create the reader to obtain the data.
        reader = new LogfileReader(filename);
    }

    /**
     * Analyze the hourly access data from the log file.
     */
    public void analyzeData()
    {
        while(reader.hasNext()) {
            LogEntry entry = reader.next();
            int hour = entry.getHour();
            hourCounts[hour]++;
            int day = entry.getDay();
            dayCounts[day]++;
        }
    }

 

    /**
     * Print the hourly counts.
     * These should have been set with a prior
     * call to analyzeHourlyData.
     */
    public void printHourlyCounts()
    {
        int count = 0;
        System.out.println("Hr: Count");
        for(int hour = 0; hour < hourCounts.length; hour++) {
            System.out.println(hour + ": " + hourCounts[hour]);
            count += hourCounts[hour];
        }
        System.out.println("Total access: " + count);
    }

    public void printDailyCounts() {
         int count = 0;
        System.out.println("Day : Count");
        for(int day = 1; day < dayCounts.length; day++) {
            System.out.println(day + ": " + dayCounts[day]);
            count += dayCounts[day];
        }
        System.out.println("Total access: " + count);
    }   
    
    /**
     * Print the lines of data read by the LogfileReader
     */
    public void printData()
    {
        reader.printData();
    }

    public int numberOfAccessess() {
        int total = 0;
        for(int hours = 0; hours < hourCounts.length; hours++) {
            total += hourCounts[hours];
        }
        return total;
    }   

    public int busiestHour() {
        int busiestHour = 0;
        int maxValue = 0;
        for(int hour = 0; hour < hourCounts.length; hour++) {
            if(hourCounts[hour] > maxValue) {
                maxValue = hourCounts[hour];
                busiestHour = hour;
            }
        }
        return busiestHour;
    }

    public int quietestHour() {
        int quietestHour = 0;
        int maxValue = busiestHour();
        int minValue = hourCounts[maxValue];
        for(int hour = 0; hour < hourCounts.length; hour++) {
            if(hourCounts[hour] < minValue) {
                minValue = hourCounts[hour];
                quietestHour = hour;
            }
        }
        return quietestHour;
    }

    public int busiestTwoHour() {
        int busyHours = 0;
        int busyTotal = 0;
        for(int hour = 0; hour < (hourCounts.length - 1); hour++) {
            if(hourCounts[hour] + hourCounts[hour + 1] > busyTotal) {
                busyTotal = hourCounts[hour] + hourCounts[hour + 1];
                busyHours = hour;
            }
        }
        return busyHours;
    }

     public int busiestDay() {
        int busiestDay = 0;
        int maxValue = 0;
        for(int day = 1; day < dayCounts.length; day++) {
            if(dayCounts[day] > maxValue) {
                maxValue = dayCounts[day];
                busiestDay = day;
            }
        }
        return busiestDay;
    }

    public int quietestday() {
        int quietestDay = 0;
        int maxValue = busiestDay();
        int minValue = dayCounts[maxValue];
        for(int day = 1; day < dayCounts.length; day++) {
            if(dayCounts[day] < minValue) {
                minValue = dayCounts[day];
                quietestDay = day;
            }
        }
        return quietestDay;
    }
























}
