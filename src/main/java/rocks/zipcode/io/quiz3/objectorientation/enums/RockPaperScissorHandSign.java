package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK("ROCK"),
    PAPER("PAPER"),
    SCISSOR("SCISSOR");


    private final String sign;

   RockPaperScissorHandSign(String sign){
      this.sign = sign;
    }

    public RockPaperScissorHandSign getWinner() {

       switch (RockPaperScissorHandSign.valueOf(sign)){
           case ROCK:
               return PAPER;
           case PAPER:
               return SCISSOR;
           case SCISSOR:
               return ROCK;

       }

        return null;
    }

    public RockPaperScissorHandSign getLoser() {
       switch (RockPaperScissorHandSign.valueOf(sign)){
           case ROCK:
               return SCISSOR;
           case PAPER:
               return ROCK;
           case SCISSOR:
               return PAPER;
       }

        return null;
    }
}
