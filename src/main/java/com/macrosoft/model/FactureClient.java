package com.macrosoft.model;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

/***
 * 
 * @author SOULEYSANOGO
 *
 */
@Document(indexName = "factureindex")
public class FactureClient {
	
	@Id
    private String id;
	
	@Field(type = FieldType.Keyword, name = "drName")
	private  String  drName;
	
	@Field(type = FieldType.Byte, name = "pdfFilebytes")
	private  byte[]  pdfFilebytes;
	
	@Field(type = FieldType.Text, name = "fullpathpdffacture")
	private String  fullpathpdffacture;
	
	@Field(type = FieldType.Integer, name = "numFacture")
	private Integer  numFacture; //Numero facture

	@Field(type = FieldType.Text, name = "periodeFacture")
	private String  periodeFacture;
	
	@Field(type = FieldType.Text, name = "dateEmission")
	private  String  dateEmission;
	
	@Field(type = FieldType.Text, name = "refContratIdentifiant")
	private String  refContratIdentifiant;
	
	@Field(type = FieldType.Text, name = "refBranchement")
	private String  refBranchement;
	
	@Field(type = FieldType.Text, name = "exploitation")
	private  String  exploitation;
	
	@Field(type = FieldType.Keyword, name = "nomPrenom")
	private String nomPrenom;  // Nom et Prenoms
	
	@Field(type = FieldType.Keyword, name = "lotIlot")
	private String lotIlot;  // lot et ilot
	
	@Field(type = FieldType.Text, name = "puissanceSouscrite")
	private String puissanceSouscrite; // Puissance Souscrite
	
	@Field(type = FieldType.Integer, name = "netApayer")
	private Integer  netApayer;  // Net à payer
	
	@Field(type = FieldType.Integer, name = "montantFactTTC")
	private Integer montantFactTTC; // Mont_fact_TTC
	
	@Field(type = FieldType.Integer, name = "montantFactSansLesImpayes")
	private Integer montantFactSansLesImpayes;
	
	@Field(type = FieldType.Integer, name = "totalMontantImpayes")
	private Integer totalMontantImpayes;
	
	
	@Field(type = FieldType.Text, name = "codeTarif")
	private String  codeTarif;  //Code Tarif
	
	@Field(type = FieldType.Text, name = "codeUsage")
	private String  codeUsage;  // code Usage
	
	
	@Field(type = FieldType.Text, name = "telephone")
	private String  telephone;
	
	@Field(type = FieldType.Text, name = "nouveauIndex")
	private String nouveauIndex;


	@Field(type = FieldType.Text, name = "ancienIndex")
	private String ancienIndex;


	
	@Field(type = FieldType.Text, name = "dateLimite")
	private String dateLimite;
	
	
	@Field(type = FieldType.Text, name = "dateDebutReleve")
	private String dateDebutReleve;
	
	@Field(type = FieldType.Text, name = "dateFinReleve")
	private String dateFinReleve;
	
	@Field(type = FieldType.Text, name = "numcompteur")
	private String numcompteur;


	@Field(type = FieldType.Text, name = "typeClient")
	private String typeClient;
	
	
	@Field(type = FieldType.Text, name = "typeBranchement")
	private String typeBranchement;
	
	
	@Field(type = FieldType.Text, name = "matricule")
	private String matricule;
	
	@Field(type = FieldType.Text, name = "regroupement")
	private String regroupement;
	
	@Field(type = FieldType.Text, name = "reglageDisjoncteur")
	private String reglageDisjoncteur;
	

	
	/*
	Nom et Prenoms
	Code tarif
	Compteur
	Type Branchement
	categorie_contract
	regroupement
	Numero facture
	Periode
	Type facture
	Puissance Souscrite
	Ancien index
	Nouvel index
	Net à payer
	Mont_fact_TTC
	*/
	
	/**
	 * 
	 */
	public FactureClient() {
	
	}
	
	
	public FactureClient(String drName,String exploitation, int numFacture, Integer montantFactTTC, Integer netApayer) {
		this.drName =drName;
		this.exploitation = exploitation;
		this.numFacture = numFacture;
		this.montantFactTTC = montantFactTTC;
		this.netApayer = netApayer;
	}

	public FactureClient(String drName, String exploitation, int numFacture, int montantFactTTC, int netApayer, String nomPrenom, String refContratIdentifiant,
			String refBranchement, String periodeFacture, String puissanceSouscrite) {
		
		this.drName = drName;
		this.exploitation =exploitation;
		this.numFacture =numFacture ;
		this.montantFactTTC =montantFactTTC;
		this.netApayer =netApayer;
		this.nomPrenom = nomPrenom;
		this.refContratIdentifiant = refContratIdentifiant;
		this.refBranchement = refBranchement;
		this.periodeFacture = periodeFacture;
		this.puissanceSouscrite = puissanceSouscrite;
		
	
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	

	public String getCodeTarif() {
		return codeTarif;
	}
	
	


	public String getLotIlot() {
		return lotIlot;
	}


	public void setLotIlot(String lotIlot) {
		this.lotIlot = lotIlot;
	}


	public void setCodeTarif(String codeTarif) {
		this.codeTarif = codeTarif;
	}


	public String getDrName() {
		return drName;
	}

	public void setDrName(String drName) {
		this.drName = drName;
	}

	public byte[] getPdfFilebytes() {
		return pdfFilebytes;
	}

	public void setPdfFilebytes(byte[] pdfFilebytes) {
		this.pdfFilebytes = pdfFilebytes;
	}

	public String getFullpathpdffacture() {
		return fullpathpdffacture;
	}

	public void setFullpathpdffacture(String fullpathpdffacture) {
		this.fullpathpdffacture = fullpathpdffacture;
	}

	public Integer getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(Integer numFacture) {
		this.numFacture = numFacture;
	}

	public String getPeriodeFacture() {
		return periodeFacture;
	}

	public void setPeriodeFacture(String periodeFacture) {
		this.periodeFacture = periodeFacture;
	}

	public String getDateEmission() {
		return dateEmission;
	}

	public void setDateEmission(String dateEmission) {
		this.dateEmission = dateEmission;
	}

	public String getRefContratIdentifiant() {
		return refContratIdentifiant;
	}

	public void setRefContratIdentifiant(String refContratIdentifiant) {
		this.refContratIdentifiant = refContratIdentifiant;
	}

	public String getExploitation() {
		return exploitation;
	}

	public void setExploitation(String exploitation) {
		this.exploitation = exploitation;
	}

	public String getNomPrenom() {
		return nomPrenom;
	}

	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}

	public String getPuissanceSouscrite() {
		return puissanceSouscrite;
	}

	public void setPuissanceSouscrite(String puissanceSouscrite) {
		this.puissanceSouscrite = puissanceSouscrite;
	}

	public Integer getNetApayer() {
		return netApayer;
	}

	public void setNetApayer(Integer netApayer) {
		this.netApayer = netApayer;
	}

	public Integer getMontantFactTTC() {
		return montantFactTTC;
	}

	public void setMontantFactTTC(Integer montantFactTTC) {
		this.montantFactTTC = montantFactTTC;
	}


	public String getRefBranchement() {
		return refBranchement;
	}


	public void setRefBranchement(String refBranchement) {
		this.refBranchement = refBranchement;
	}


	public String getCodeUsage() {
		return codeUsage;
	}


	public void setCodeUsage(String codeUsage) {
		this.codeUsage = codeUsage;
	}
	
	

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((drName == null) ? 0 : drName.hashCode());
		result = prime * result + ((exploitation == null) ? 0 : exploitation.hashCode());
		result = prime * result + ((montantFactTTC == null) ? 0 : montantFactTTC.hashCode());
		result = prime * result + ((netApayer == null) ? 0 : netApayer.hashCode());
		result = prime * result + ((nomPrenom == null) ? 0 : nomPrenom.hashCode());
		result = prime * result + ((numFacture == null) ? 0 : numFacture.hashCode());
		result = prime * result + ((periodeFacture == null) ? 0 : periodeFacture.hashCode());
		result = prime * result + ((puissanceSouscrite == null) ? 0 : puissanceSouscrite.hashCode());
		result = prime * result + ((refBranchement == null) ? 0 : refBranchement.hashCode());
		result = prime * result + ((refContratIdentifiant == null) ? 0 : refContratIdentifiant.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FactureClient other = (FactureClient) obj;
		if (drName == null) {
			if (other.drName != null)
				return false;
		} else if (!drName.equals(other.drName))
			return false;
		if (exploitation == null) {
			if (other.exploitation != null)
				return false;
		} else if (!exploitation.equals(other.exploitation))
			return false;
		if (montantFactTTC == null) {
			if (other.montantFactTTC != null)
				return false;
		} else if (!montantFactTTC.equals(other.montantFactTTC))
			return false;
		if (netApayer == null) {
			if (other.netApayer != null)
				return false;
		} else if (!netApayer.equals(other.netApayer))
			return false;
		if (nomPrenom == null) {
			if (other.nomPrenom != null)
				return false;
		} else if (!nomPrenom.equals(other.nomPrenom))
			return false;
		if (numFacture == null) {
			if (other.numFacture != null)
				return false;
		} else if (!numFacture.equals(other.numFacture))
			return false;
		if (periodeFacture == null) {
			if (other.periodeFacture != null)
				return false;
		} else if (!periodeFacture.equals(other.periodeFacture))
			return false;
		if (puissanceSouscrite == null) {
			if (other.puissanceSouscrite != null)
				return false;
		} else if (!puissanceSouscrite.equals(other.puissanceSouscrite))
			return false;
		if (refBranchement == null) {
			if (other.refBranchement != null)
				return false;
		} else if (!refBranchement.equals(other.refBranchement))
			return false;
		if (refContratIdentifiant == null) {
			if (other.refContratIdentifiant != null)
				return false;
		} else if (!refContratIdentifiant.equals(other.refContratIdentifiant))
			return false;
		return true;
	}


	public String getTelephone() {
		return telephone;
	}


	public String getNouveauIndex() {
		return nouveauIndex;
	}


	


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public void setTypeClient(String typeClient) {
		 this.typeClient =  typeClient;
		
	}


	public void setRegroupement(String regroupement) {
		 this.regroupement =  regroupement;
		
	}


	public void setReglageDisjoncteur(String reglageDisjoncteur) {
		this.reglageDisjoncteur = reglageDisjoncteur;
		
	}


	


	public void setTypeBranchement(String typeBranchement) {
		this.typeBranchement = typeBranchement;
		
	}


	


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getDateLimite() {
		return dateLimite;
	}


	public String getDateDebutReleve() {
		return dateDebutReleve;
	}


	public String getDateFinReleve() {
		return dateFinReleve;
	}


	public String getNumcompteur() {
		return numcompteur;
	}


	public String getTypeClient() {
		return typeClient;
	}


	public String getTypeBranchement() {
		return typeBranchement;
	}


	public String getRegroupement() {
		return regroupement;
	}


	public String getReglageDisjoncteur() {
		return reglageDisjoncteur;
	}


	public void setDateDebutReleve(String dateDebutReleve) {
		this.dateDebutReleve= dateDebutReleve;
		
	}


	public void setDateFinReleve(String dateFinReleve) {
		this.dateFinReleve= dateFinReleve;
		
	}


	public void setDateLimite(String dateLimite) {
		this.dateLimite= dateLimite;
		
	}


	public void setNumcompteur(String numcompteur) {
		this.numcompteur= numcompteur;
		
	}
	


	public Integer getMontantImpayes() {
		return totalMontantImpayes;
	}


	public void setMontantImpayes(Integer montantImpayes) {
		this.totalMontantImpayes = montantImpayes;
	}


	public void setAncienIndex(String ancienIndex) {
		this.ancienIndex = ancienIndex;
		
	}


	public void setNouveauIndex(String nouveauIndex) {
		this.nouveauIndex = nouveauIndex;
		
	}


	public Integer getTotalMontantImpayes() {
		return totalMontantImpayes;
	}


	public void setTotalMontantImpayes(Integer totalMontantImpayes) {
		this.totalMontantImpayes = totalMontantImpayes;
	}



	public String getAncienIndex() {
		return ancienIndex;
	}



	public Integer getMontantFactSansLesImpayes() {
		return montantFactSansLesImpayes;
	}


	public void setMontantFactSansLesImpayes(Integer montantFactSansLesImpayes) {
		this.montantFactSansLesImpayes = montantFactSansLesImpayes;
	}


	@Override
	public String toString() {
		return "FactureClient [id=" + id + ", drName=" + drName + ", pdfFilebytes=" + Arrays.toString(pdfFilebytes)
				+ ", fullpathpdffacture=" + fullpathpdffacture + ", numFacture=" + numFacture + ", periodeFacture="
				+ periodeFacture + ", dateEmission=" + dateEmission + ", refContratIdentifiant=" + refContratIdentifiant
				+ ", refBranchement=" + refBranchement + ", exploitation=" + exploitation + ", nomPrenom=" + nomPrenom
				+ ", lotIlot=" + lotIlot + ", puissanceSouscrite=" + puissanceSouscrite + ", netApayer=" + netApayer
				+ ", montantFactTTC=" + montantFactTTC + ", montantFactSansLesImpayes=" + montantFactSansLesImpayes
				+ ", totalMontantImpayes=" + totalMontantImpayes + ", codeTarif=" + codeTarif + ", codeUsage="
				+ codeUsage + ", telephone=" + telephone + ", nouveauIndex=" + nouveauIndex + ", ancienIndex="
				+ ancienIndex + ", dateLimite=" + dateLimite + ", dateDebutReleve=" + dateDebutReleve
				+ ", dateFinReleve=" + dateFinReleve + ", numcompteur=" + numcompteur + ", typeClient=" + typeClient
				+ ", typeBranchement=" + typeBranchement + ", matricule=" + matricule + ", regroupement=" + regroupement
				+ ", reglageDisjoncteur=" + reglageDisjoncteur + "]";
	}


	
  	
	
}
