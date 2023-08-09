

/**
 * Class applicant
 */
public class applicant {

  //
  // Fields
  //

  private String applicant_name_;
  private String applicant_details_;
  
  //
  // Constructors
  //
  public applicant () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of applicant_name_
   * @param newVar the new value of applicant_name_
   */
  public void setApplicant_name_ (String newVar) {
    applicant_name_ = newVar;
  }

  /**
   * Get the value of applicant_name_
   * @return the value of applicant_name_
   */
  public String getApplicant_name_ () {
    return applicant_name_;
  }

  /**
   * Set the value of applicant_details_
   * @param newVar the new value of applicant_details_
   */
  public void setApplicant_details_ (String newVar) {
    applicant_details_ = newVar;
  }

  /**
   * Get the value of applicant_details_
   * @return the value of applicant_details_
   */
  public String getApplicant_details_ () {
    return applicant_details_;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String apply_passport()
  {
  }


  /**
   * @return       String
   */
  public String submission_of_proof()
  {
  }


}



/**
 * Class passport_managment_system
 * verify details
 */
public class passport_managment_system {

  //
  // Fields
  //

  private String verify_details;
  private String store_proof;
  
  //
  // Constructors
  //
  public passport_managment_system () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of verify_details
   * @param newVar the new value of verify_details
   */
  public void setVerify_details (String newVar) {
    verify_details = newVar;
  }

  /**
   * Get the value of verify_details
   * @return the value of verify_details
   */
  public String getVerify_details () {
    return verify_details;
  }

  /**
   * Set the value of store_proof
   * @param newVar the new value of store_proof
   */
  public void setStore_proof (String newVar) {
    store_proof = newVar;
  }

  /**
   * Get the value of store_proof
   * @return the value of store_proof
   */
  public String getStore_proof () {
    return store_proof;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String issue_of_passport()
  {
  }


  /**
   * @return       String
   */
  public String verification_of_passport()
  {
  }


  /**
   * @return       String
   */
  public String cancellation_of_passport()
  {
  }


}
