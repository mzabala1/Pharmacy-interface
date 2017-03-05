import java.util.Arrays;
/**
 * Creo un Array de Medicamentos que contiene los datos para cada uno de estos en orden.
 * 
 * @author (Mateo Alexander Zabala Gutierrez) 
 * @version (9/06/2015)
 */
public class Farmacia
{
   private Medicamento inventario;
   private Medicamento[] arrayMedicamento = new Medicamento[12];
   
   public Farmacia()
   {
     inventario = new Medicamento("nombre", "tipo", "ubicacion", "casillero");
     arrayMedicamento[0] = new Medicamento("Sevoflurano","Anestesico", "22", "1A");
     arrayMedicamento[1] = new Medicamento("Tiopental Sodico","Anestesico", "22", "2A");
     arrayMedicamento[2] = new Medicamento("Propofol","Anestesico", "22", "1B");
     arrayMedicamento[3] = new Medicamento("Mepivacaina","Anestesico", "22", "1C");
     arrayMedicamento[4] = new Medicamento("Petidin","Analgesico", "13", "1A");
     arrayMedicamento[5] = new Medicamento("Morfina","Analgesico", "13", "1B");
     arrayMedicamento[6] = new Medicamento("Buprenorfina","Analgesico", "13", "2B");
     arrayMedicamento[7] = new Medicamento("Difenoxiato","Analgesico", "13", "1C");
     arrayMedicamento[8] = new Medicamento("Bencilpenicilina","Antiinfeccioso", "31", "1C");
     arrayMedicamento[9] = new Medicamento("FenoximetilPenicilina","Antiinfeccioso", "31","1C");
     arrayMedicamento[10] = new Medicamento("Dicloxacilina","Antiinfeccioso", "31", "1C");
     arrayMedicamento[11] = new Medicamento("Oxacilina","Antiinfeccioso", "31", "1C"); 
   }
    
   public Medicamento[] getMedicamentos()
   {
      return arrayMedicamento;
   }
}