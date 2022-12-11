
public class Maison implements IEtage, IMurs, IToit {
	
	protected String unMateriel;
	protected String unEtage;
	protected String desMurs;
	protected String unToit;
	
	public void setMateriel(String unMateriel) {
		this.unMateriel = unMateriel;
	}
	
	public void setEtage(String unMateriel) {
		this.unEtage = unMateriel;
	}

	public void setMurs(String unMateriel) {
		this.desMurs = unMateriel;
	}
	
	public void setToit(String unMateriel) {
		this.unToit = unMateriel;
	}

	@Override
	public String getEtageRepresentation() {
		return "Construction "+this.unEtage+" terminée\n";
	}

	@Override
	public String getMursRepresentation() {
		return "Construction "+this.desMurs+" terminée\n";
	}
	
	@Override
	public String getToitRepresentation() {
		return "Construction "+this.unToit+" terminée\n";
	}
	
	public String getMaisonRepresentation() {
		String rep = "Construction d'une maison en "+this.unMateriel+"\n";
		rep += this.getEtageRepresentation();
		rep += this.getMursRepresentation();
		rep += this.getToitRepresentation();
		return rep;
	}

}
