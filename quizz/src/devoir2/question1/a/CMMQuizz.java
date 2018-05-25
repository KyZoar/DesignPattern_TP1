package devoir2.question1.a;

public class CMMQuizz implements QuizzMaster {
	private String question;
    private String [] choix;
    private int reponse;
    private String type;

    public CMMQuizz (String type, String question, String choix0, String choix1, String choix2, String choix3, int reponse)
    {
    	choix = new String [4];
    	this.question = question; //"3.	La méthode  CMM (Capability Maturity Model) se divise en :";
    	choix[0] = choix0; //"a)	3 niveaux";
    	choix[1] = choix1; //"b)	4 niveaux";
    	choix[2] = choix2; //"c)	5 niveaux";
    	choix[3] = choix3; //"d)	6 niveaux";
    	this.reponse = reponse; //2;
    	this.type = type; //"Question sur CMM";
     }
	@Override
	public String getChoix(int indice) {
		// TODO Auto-generated method stub
		return choix[indice];
	}

	@Override
	public String getQuestion() {
		// TODO Auto-generated method stub
		return question;
	}

	@Override
	public int getReponse() {
		// TODO Auto-generated method stub
		return (reponse);
	}
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

}
