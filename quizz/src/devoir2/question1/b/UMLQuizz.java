package devoir2.question1.b;

public class UMLQuizz implements QuizzMaster {
	private String type;
	private String question;
    private String [] choix;
    private int reponse;

    public UMLQuizz ()
    {
    	choix = new String [4];
    }
    
    public void setType(String type) {
    	this.type = type; //"Question sur UML";
    }
    
    public void setQuestion(String question) {
    	this.question = question; //"Parmi les diagrammes suivants, lequel a été introduit dans UML2 ?";
    }
    
    public void setFirstChoice(String choix0) {
    	choix[0] = choix0; //"Diagramme d’activité";
    }
    
    public void setSecondChoice(String choix1) {
    	choix[1] = choix1; //"Diagramme de Classes";
    }
    
    public void setThirdChoice(String choix2) {
    	choix[2] = choix2; //"Diagramme de Temps";
    }
    
    public void setFourthChoice(String choix3) {
    	choix[3] = choix3; //"Diagramme des cas d’utilisation";
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
