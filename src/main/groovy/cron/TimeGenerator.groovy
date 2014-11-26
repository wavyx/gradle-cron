package cron

import groovy.util.logging.Slf4j

@Slf4j
class TimeGenerator {

    public static void main(String[] args) {
        TimeGenerator.getTime()
    }

    public static String getTime(){
        Date date = new Date()
        String time = date.toString()
        log.info(time)
        return time
    }
}
