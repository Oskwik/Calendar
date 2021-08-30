package se.lexicon.sequencers;

public class AppUserSequencer {

   private int appUserId = 1;

   public int appUserId{
       return appUserId++;
    }
   public void reset(){
       appUserId = 1;

   }

}
