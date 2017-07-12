//import org.junit.Test;
//
//import javax.xml.soap.SOAPConnection;
//import javax.xml.soap.SOAPConnectionFactory;
//import javax.xml.soap.SOAPMessage;
//
//public class WebServiceTest2 extends Functions {
//    @Test
//    public void WS1() throws Exception {
//        SOAPMessage message = createSOAPRequest("C:\\Users\\Work PC\\Desktop\\EssexLocation.xml");
//        SOAPMessage response = getSOAPResponse(message, "http://www.webservicex.net/uklocation.asmx" );
//        validateValue(response, "County", "Essex" );
//        System.out.print(response);
//    }
//}