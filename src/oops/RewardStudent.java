package oops;

public interface RewardStudent{
        public void rewardStudentForSports(String sport);
        public void rewardStudentForDebate(int debates);
        public void rewardStudentForBravery();

}
class P{

}
 class RewardStudForSports extends P implements RewardStudent{
     @Override
     public void rewardStudentForSports(String sport) {

     }
     @Override
     public void rewardStudentForDebate(int debates) {
     }
     @Override
     public void rewardStudentForBravery() {

     }
// Method to be implemented here
}
interface RewardStudentForSportsInt{
    public void rewardStudentForSports(String sport);
}
class RewardStudentForSports implements RewardStudentForSportsInt{
    @Override
    public void rewardStudentForSports(String sport) {
        // criteria
    }
}
interface RewardStudentForBraveryInt{
    public void rewardStudentForBravery(String braveryEvent);
}
class RewardStudentForBravery implements RewardStudentForBraveryInt{
    @Override
    public void rewardStudentForBravery(String braveryEvent) {
        // criteria related to bravery
    }
}


