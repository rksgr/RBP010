package exception;

public class CashWithdrawal {
    public void withdrawCash(int cash) throws WrongDenominationException{
        if(cash % 500 == 0 || cash % 100 == 0){
            System.out.println("Cash withdrawn successfully");
        }else{
            throw new WrongDenominationException("Please enter correct denomination");
        }
    }

    public static void main(String[] args) throws WrongDenominationException {
        CashWithdrawal cashWithdrawalObj = new CashWithdrawal();
//        try{
            cashWithdrawalObj.withdrawCash(410);
//        }catch (WrongDenominationException e){
//            System.out.println(e);
//        }
    }
}
