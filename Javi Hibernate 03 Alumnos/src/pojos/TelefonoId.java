package pojos;
// Generated 26-feb-2024 19:43:43 by Hibernate Tools 4.3.1



/**
 * TelefonoId generated by hbm2java
 */
public class TelefonoId  implements java.io.Serializable {


     private int codAlu;
     private String numeroTelefono;

    public TelefonoId() {
    }

    public TelefonoId(int codAlu, String numeroTelefono) {
       this.codAlu = codAlu;
       this.numeroTelefono = numeroTelefono;
    }
   
    public int getCodAlu() {
        return this.codAlu;
    }
    
    public void setCodAlu(int codAlu) {
        this.codAlu = codAlu;
    }
    public String getNumeroTelefono() {
        return this.numeroTelefono;
    }
    
    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TelefonoId) ) return false;
		 TelefonoId castOther = ( TelefonoId ) other; 
         
		 return (this.getCodAlu()==castOther.getCodAlu())
 && ( (this.getNumeroTelefono()==castOther.getNumeroTelefono()) || ( this.getNumeroTelefono()!=null && castOther.getNumeroTelefono()!=null && this.getNumeroTelefono().equals(castOther.getNumeroTelefono()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getCodAlu();
         result = 37 * result + ( getNumeroTelefono() == null ? 0 : this.getNumeroTelefono().hashCode() );
         return result;
   }   


}


