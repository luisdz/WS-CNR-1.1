package sv.gob.cnr.comerciows.recievedata;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.jws.WebService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;  

import java.awt.image.BufferedImage;
import java.io.FileOutputStream; 

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import com.icafe4j.image.ImageColorType;
import com.icafe4j.image.ImageParam;
import com.icafe4j.image.options.TIFFOptions;
import com.icafe4j.image.quant.DitherMethod;
import com.icafe4j.image.quant.DitherMatrix;
import com.icafe4j.image.tiff.TIFFTweaker;
import com.icafe4j.image.tiff.TiffFieldEnum.Compression;
import com.icafe4j.io.FileCacheRandomAccessOutputStream;
import com.icafe4j.io.RandomAccessOutputStream;


@WebService
public class Data {
	public String jsonData(String param) throws IOException
	    {
		if(isJSONValid(param))
		{
			JSONObject jsonObject = new JSONObject(param); 
			String res = jsonObject.get("id").toString();
			//**********************************************************
			//general
			String idSolicitud;
			Date fechaIngreso;
			Date fechaAprovacion;
			String emailSolicitante;
			List servicios;
			//Notificacion
			String calleNotificaion;
			String edificioNotificacion;
			String casaNotificacion;
			String coloniaNotificacion;
			String departamentoNotificacion;
			String municipioNotificacion;
			String complementoNotificacion;
			String telefonoFijoNotificacion;
			String telefonoCelularNotificaion;
			String telefonoFaxNotificacion;
			String emailNotificaion;
			//retiro
			String retiroPresencial;
			String primerNombreRetiro;
			String otrosNombresRetiro;
			String primerApellidoRetiro;
			String otrosApellidosRetiro;
			String aliasRetiro;
			String tipoDocumentoIdRetiro;
			String numeroDocumentoIdRetiro;
			String nitRetiro;
			//sociedad
			String tipoSociedadSociedad;
			String denominacionSociedad;
			String abreviaturaSociedad;
			String departamentoSociedad;
			String municipioSociedad;
			String paisSociedad;
			Date fechaEscrituarSociedad;
			String formaAdministracionSociedad;
			String numeroMiembrosSociedad;
			Double capitalSocialSociedad;
			//representante legal
			String primerNombreLegal;
			String otrosNombresLegal;
			String primerApellidoLegal;
			String otrosApellidosLegal;
			String aliasLegal;
			String generoLegal;
			String nacionalidadLegal;
			String tipoDocumentoIdLegal;
			String numeroDocumentoIdLegal;
			String nitLegal;
			String cargoLegal;
			String telefonoFijoLegal;
			String telefonoCelularLegal;
			String emailLegal;
			//socio natural()
			String primerNombreNatural;
			String otrosNombresNatural;
			String primerApellidoNatural;
			String otrosApellidosNatural;
			String aliasNatural;
			String generoNatural;
			String nacionalidadNatural;
			String tipoDocumentoIdNatural;
			String numeroDocumentoIdNatural;
			String nitNatural;
			int numAccionesNatural;
			Double participacionNatural;
			//socio juridico
			String personaJuridica;
			String denominacionJuridica;
			String nitJuridica;
			int numeroAccionesJuridica;
			Double participacionJuridica;
			//pago sociedad
			String numeroComprobanteSociedad;
			Double montoPagoSoiedad;
			String institucionColectoraPagoScoiedad;
			Date fechaPagoSociedad;
			//matricula
			String nombreNegocioMatricula;
			String sectorMatricula;
			String ciiuMatricula;
			String actividadEconomicaMatricula;
			String departamentoMatricula;
			String municipioMatricula;
			String calleMatricula;
			String edificioMatricula;
			String casaMatricula;
			String coloniaMatricula;
			String complementoMatricula;
			String telefonoFijoMatricula;
			String telefonoCelularMatricula;
			String telefonoFaxMatricula;
			String emailMatricula;
			//otros establecimientos(mas de uno)
			String nombreNegocioMatriculaOtro;
			String tipoNegocioMatriculaOtro;
			String actividadEconomicaMatriculaOtro;
			String ciiuMatriculaOtro;
			String primerNombreMatriculaOtro;
			String otrosNombresMatriculaOtro;
			String primerApellidoMatriculaOtro;
			String otrosApellidosMatriculaOtro;
			String calleMatriculaOtro;
			String edificioMatriculaOtro;
			String casaMatriculaOtro;
			String coloniaMatriculaOtro;
			String complementoMatriculaOtro;
			String departamentoMatriculaOtro;
			String municipioMatriculaOtro;
			String telefonoFijoMatriculaOtro;
			String telefonoCelularMatriculaOtro;
			String emailMatriculaOtro;
			//pago matricula
			String numeroComprobanteMatricula;
			Double montoPagoMatricula;
			String institucionColectoraPagoMatricula;
			Date fechaPagoMatricula;
			//balance
			String anioBalance;
			String fechaBalance;
			double activoCirculante;
			double activoNoCirculante;
			double pasivoCirculante;
			double pasivoNoCirculante;
			double totalActivo;
			//pago balance
			String numeroComprobanteBalance;
			Double montoPagoBalance;
			String institucionColectoraPagoBalance;
			Date fechaPagoBalance;
			//anexos
			//****************************descarga de archivos***********************************
			 URL url = new URL("https://miempresa.gob.sv/519g9gszj3yr/y919gewrb8v6q-banca-formulario-unico-de-inscripcion-firmado-por-el-rep.png");
			 InputStream in = new BufferedInputStream(url.openStream());
			 ByteArrayOutputStream out = new ByteArrayOutputStream();
			 byte[] buf = new byte[1024];
			 int n = 0;
			 while (-1!=(n=in.read(buf)))
			 {
			    out.write(buf, 0, n);
			 }
			 out.close();
			 in.close();
			 byte[] response = out.toByteArray();
			 
			 FileOutputStream fos = new FileOutputStream("C://Users//luis.mozo//Documents//borrowed_image.jpg");
			 fos.write(response);
			 fos.close();		 	
			
			 //********************************************************
			 JSONObject newjSON= new JSONObject();
				newjSON.put("id", res);
				newjSON.put("status", "recieved");
			    return  newjSON.toString();
		}
		else
		{
			//***************************conversion tiff**********************
			 String pdf = "princecatalogue.pdf";
		        PDDocument pddoc = null;
		        BufferedImage image = null;
		        try {		        	
		        	//URL url = new URL("https://d2n7qp1it8qrl2.cloudfront.net/img/logo-bg-white-v.png");
		        	//URL url = new URL("http://www.bergophil.ch/a.pdf"); 
		            URL url = new URL("https://miempresa.gob.sv/519g9gszj3yr/y919gewrb8v6q-banca-formulario-unico-de-inscripcion-firmado-por-el-rep.png");
					//****extension***
		            String extension = "";

		            int ind = url.getFile().lastIndexOf('.');
		            if (ind > 0) {
		                extension = url.getFile().substring(ind+1);
		            }
		            //****************
		            InputStream in = url.openStream();	
					int i = 0;
					if(extension.equals("pdf"))
					{
			            pddoc = PDDocument.load(url);
			            try {
				            savePdfAsTiff(pddoc);
				        } catch (IOException e) {
				        }
					}
					//if(extension == "png")
					else
					{
						image = ImageIO.read(url);
						try {
				            saveImgAsTiff(image);
				        } catch (IOException e) {
				        }
					}
		        } catch (IOException e) {
		        }

		       
			//*****************************************************************
			JSONObject newjSON= new JSONObject(); 
			newjSON.put("status", "error");
		    return  newjSON.toString();
		 }
		
	    }
	
	private boolean isJSONValid(String test) {
	    try {
	        new JSONObject(test);
	    } catch (JSONException ex) { 
	        try {
	            new JSONArray(test);
	        } catch (JSONException ex1) {
	            return false;
	        }
	    }
	    return true;
	}

	private static void savePdfAsTiff(PDDocument pdf) throws IOException 
	{
        BufferedImage[] images = new BufferedImage[pdf.getNumberOfPages()];
        for (int i = 0; i < images.length; i++) 
        {
            PDPage page = (PDPage) pdf.getDocumentCatalog().getAllPages()
                    .get(i);
            BufferedImage image; 
            try {
              image = page.convertToImage(BufferedImage.TYPE_INT_RGB, 288); //works
//                image = page.convertToImage(BufferedImage.TYPE_INT_RGB, 300); // does not work
                images[i] = image;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileOutputStream fos = new FileOutputStream("C://Users//luis.mozo//Documents//a.tiff");
        RandomAccessOutputStream rout = new FileCacheRandomAccessOutputStream(fos);
        ImageParam.ImageParamBuilder builder = ImageParam.getBuilder();
        ImageParam[] param = new ImageParam[1];
        TIFFOptions tiffOptions = new TIFFOptions();
        tiffOptions.setTiffCompression(Compression.CCITTFAX4);
        builder.imageOptions(tiffOptions);
        builder.colorType(ImageColorType.BILEVEL).ditherMatrix(DitherMatrix.getBayer8x8Diag()).applyDither(true).ditherMethod(DitherMethod.BAYER);
        param[0] = builder.build();
        TIFFTweaker.writeMultipageTIFF(rout, param, images);
        rout.close();
        fos.close();
    }
	
	private static void saveImgAsTiff(BufferedImage image) throws IOException 
	{  
        FileOutputStream fos = new FileOutputStream("C://Users//luis.mozo//Documents//a.tiff");
        RandomAccessOutputStream rout = new FileCacheRandomAccessOutputStream(fos);
        ImageParam.ImageParamBuilder builder = ImageParam.getBuilder();
        ImageParam[] param = new ImageParam[1];
        TIFFOptions tiffOptions = new TIFFOptions();
        tiffOptions.setTiffCompression(Compression.DEFLATE_ADOBE);
        builder.imageOptions(tiffOptions);
        builder.colorType(ImageColorType.GRAY_SCALE);//.ditherMatrix(DitherMatrix.getBayer8x8Default()).applyDither(true).ditherMethod(DitherMethod.FLOYD_STEINBERG);
        param[0] = builder.build();
        TIFFTweaker.writeMultipageTIFF(rout, param, image);
        rout.close();
        fos.close();
    }
	
}

	

    
