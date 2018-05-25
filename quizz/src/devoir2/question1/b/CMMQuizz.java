package devoir2.question1.b;

public class CMMQuizz implements QuizzMaster {
	private String question;
    private String [] choix;
    private int reponse;
    private String type;

    public CMMQuizz ()
    {
    	choix = new String [4];
    }
    
    public void setType(String type) {
    	this.type = type; //"Question sur CMM";
    }
    
    public void setQuestion(String question) {
    	this.question = question; //"3.	La méthode  CMM (Capability Maturity Model) se divise en :";
    }
    
    public void setFirstChoice(String choix0) {
    	choix[0] = choix0; //"a)	3 niveaux";
    }
    
    public void setSecondChoice(String choix1) {
    	choix[1] = choix1; //"b)	4 niveaux";
    }

    
    public void setThirdChoice(String choix2) {
    	choix[2] = choix2; //"c)	5 niveaux";
    }
    public void setFourthChoice(String choix3) {
    	choix[3] = choix3; //"d)	6 niveaux";
    }
    
    public void setReponse(int reponse) {
    	this.reponse = reponse; //2;
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
