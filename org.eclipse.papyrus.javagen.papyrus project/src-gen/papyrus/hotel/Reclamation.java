package papyrus.hotel;
import java.util.Date;

// Code generated by Papyrus Java
// --------------------------------------------------------





/************************************************************/
/**
 * 
 */
public class Reclamation {
				/**
				 * 
				 */
				public int ClaimNumber;
				/**
				 * 
				 */
				public Date Date;
				/**
				 * 
				 */
				public String Raison;
	/**
	 * 
	 */
	public void Claim() {
	}
	
	public Reclamation() {
		
	}

	public Reclamation(int claimNumber, Date date, String raison) {
		super();
		ClaimNumber = claimNumber;
		Date = date;
		Raison = raison;
	}

	public int getClaimNumber() {
		return ClaimNumber;
	}

	public void setClaimNumber(int claimNumber) {
		ClaimNumber = claimNumber;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public String getRaison() {
		return Raison;
	}

	public void setRaison(String raison) {
		Raison = raison;
	}
	
	
}
