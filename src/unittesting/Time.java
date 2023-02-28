package unittesting;


/**
 * Kelas Time buatan ChatGPT versi 2.
 * @author ChatGPT
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void nextSecond() {
        second++;

        if (second >= 60) {
            second = 0;
            nextMinute();
        }
    }

    public void previousSecond() {
        second--;

        if (second < 0) {
            second = 59;
            previousMinute();
        }
    }

    public void nextMinute() {
        minute++;

        if (minute >= 60) {
            minute = 0;
            nextHour();
        }
    }

    public void previousMinute() {
        minute--;

        if (minute < 0) {
            minute = 59;
            previousHour();
        }
    }

    public void nextHour() {
        hour++;

        if (hour >= 24) {
            hour = 0;
        }
    }

    public void previousHour() {
        hour--;

        if (hour < 0) {
            hour = 23;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}

/**
 * Class hasil generate ChatGPT yang bisa lolos unit test.
 * @author ChatGPT
 */
/*public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
            if (minute >= 60) {
                minute = 0;
                hour++;
                if (hour >= 24) {
                    hour = 0;
                }
            }
        }
    }

    public void previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour--;
                if (hour < 0) {
                    hour = 23;
                }
            }
        }
    }
}


/**
 * Kelas Time merepresentasikan waktu.
 *
 * @author Ahmad Zein Haddad
 */
// public class Time {
// 
//     private int hour;
//     private int minute;
//     private int second;
// 
//     /**
//      * Menginstansiasi Time dengan hour, minute, dan second tertentu, tidak ada
//      * validasi input disini.
//      */
//     public Time(int hour, int minute, int second) {
//         this.hour = hour;
//         this.minute = minute;
//         this.second = second;
//     }
// 
//     public int getHour() {
//         return hour;
//     }
// 
//     public int getMinute() {
//         return minute;
//     }
// 
//     public int getSecond() {
//         return second;
//     }
// 
//     /**
//      * Mengatur jam ke waktu tertentu, input akan divalidasi.
//      *
//      * @param hour atur jam ke ini.
//      */
//     public void setHour(int hour) {
//         if (hour >= 0 && hour <= 23) {
//             this.hour = hour;
//         } else if (hour >= 24) {
//             this.hour = 0;
//         } else {
//             this.hour = 23;
//         }
//     }
// 
//     /**
//      * Mengatur menit ke waktu tertentu, input akan divalidasi.
//      *
//      * @param minute atur menit ke ini.
//      */
//     public void setMinute(int minute) {
//         if (minute >= 0 && minute <= 59) {
//             this.minute = minute;
//         } else if (minute >= 60) {
//             this.minute = 0;
//             this.setHour(this.hour + 1);
//         } else {
//             this.minute = 59;
//             this.setHour(this.hour - 1);
//         }
//     }
// 
//     /**
//      * Mengatur detik ke waktu tertentu, input akan divalidasi.
//      *
//      * @param second atur detik ke ini.
//      */
//     public void setSecond(int second) {
//         if (second >= 0 && second <= 59) {
//             this.second = second;
//         } else if (second >= 60) {
//             this.second = 0;
//             this.setMinute(this.minute + 1);
//         } else {
//             this.second = 59;
//             this.setMinute(this.minute - 1);
//         }
//     }
// 
//     /**
//      * Atur ke waktu yang ditentukan, input akan divalidasi.
//      *
//      * @param hour jam
//      * @param minute menit
//      * @param second detik
//      */
//     public void setTime(int hour, int minute, int second) {
//         this.setHour(hour);
//         this.setMinute(minute);
//         this.setSecond(second);
//     }
// 
//     public String toString() {
//         return String.format("%02d:%02d:%02d",
//                 hour,
//                 minute,
//                 second
//         );
//     }
// 
//     /**
//      * Mengatur waktu ke detik berikutnya, akan berganti menit/jam jika
//      * diperlukan.
//      *
//      * @return this
//      */
//     public Time nextSecond() {
//         this.setSecond(this.second + 1);
//         return this;
//     }
// 
//     /**
//      * Mengatur waktu ke detik sebelumnya, akan berganti menit/jam jika
//      * diperlukan.
//      *
//      * @return this
//      */
//     public Time previousSecond() {
//         this.setSecond(this.second - 1);
//         return this;
//     }
// }
// 