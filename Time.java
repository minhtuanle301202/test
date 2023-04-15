class Time{
    private int hour ;
    private int minute ;
    private int second ;
    public Time(int hour, int minute,int second) {
        this.hour = hour ;
        this.minute = minute ;
        this.second = second ;
    }

    public void setTime(int hour, int minute,int second) {
        this.hour = hour ;
        this.minute = minute ;
        this.second = second ;
    }
    public void setHour(int hour) {
        this.hour = hour ;
    }
    public int getHour(){
        return hour ;
    }

    public int getMinute() {
        return minute;
    }
    public void setMinute(int minute){
        this.minute = minute ;
    }
    public int getSecond(){
        return second ; }
    public void setSecond(int second){
        this.second = second ;
        }
        public void nextSecond() {
          if((second==59)&&(minute==59)&&(hour==23)){
                second = 0 ;
                minute = 0 ;
                hour = 0 ;

            }
          else if((second==59)&&(minute==59)&&(hour!=0))
          {
              second = 0 ;
              minute = 0 ;
              hour = hour +1 ;
          }
         else if((second==59)&&(minute!=0))
            { second = 0 ;
                minute = minute +1 ; }
            else {
                second = second +1 ; }

}
public void previousSecond() {
        if ((second==0)&&(minute==0)&&(hour==0)) {
        second = 59 ;
        minute = 59 ;
        hour = 23 ;
    }
        else if ((second==0)&&(minute==0)&&(hour!=0)){
            second = 59 ;
            minute = 59 ;
            hour = hour -1 ;
        }
       else if((second==0)&&(minute!=0)){
            second = 59 ;

        }
        else { second=second-1 ;} }
 public void display(){
       String hour = this.hour + "" ;
       String minute = this.minute + "" ;
       String second = this.second + "" ;
       if(hour.length()==1)
           hour =  "0"+hour ;
       if(minute.length()==1)
           minute = "0"+minute ;
       if(second.length()==1)
           second = "0"+second ;
     System.out.println(hour+":"+minute+":"+second); } }
class Entry {
    public static void main(String[] args) {
        Time t = new Time(12, 1, 1);
        t.display();
        t.setTime(23, 59, 59);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(7, 0, 0);
        t.display();
        t.previousSecond();
        t.display();
    }
}