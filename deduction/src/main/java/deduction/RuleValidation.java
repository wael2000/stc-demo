package deduction;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class RuleValidation implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private java.lang.String key;
   private java.lang.String message;

   public RuleValidation()
   {
   }

   public java.lang.String getKey()
   {
      return this.key;
   }

   public void setKey(java.lang.String key)
   {
      this.key = key;
   }

   public java.lang.String getMessage()
   {
      return this.message;
   }

   public void setMessage(java.lang.String message)
   {
      this.message = message;
   }

   public RuleValidation(java.lang.String key, java.lang.String message)
   {
      this.key = key;
      this.message = message;
   }

}