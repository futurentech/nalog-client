package nalog_client;

import unisoft.ws.*;
import unisoft.ws.fnsndscaws2.request.NdsRequest2;
import unisoft.ws.fnsndscaws2.request.ObjectFactory;
import unisoft.ws.fnsndscaws2.response.NdsResponse2;

import javax.xml.ws.WebServiceException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        List<NdsRequest2.NP> request_list;
        List<NdsResponse2.NP> response_list;
        String result = null;

        FNSNDSCAWS2Port service = new FNSNDSCAWS2().getFNSNDSCAWS2Port();
        // create request
        NdsRequest2 request = new ObjectFactory().createNdsRequest2();
        NdsRequest2.NP request_np = new ObjectFactory().createNdsRequest2NP();
        // create response
        NdsResponse2 response = new unisoft.ws.fnsndscaws2.response.ObjectFactory().createNdsResponse2();
        // user input

        Scanner in = new Scanner(System.in);
        System.out.print("Individual tax number: ");
        String INN = in.nextLine();
        System.out.print("Code of reason: ");
        String KPP = in.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String DT = dateFormat.format(new Date());
        System.out.println("Date in format(dd.mm.yy): " + DT);

        request_np.setINN(INN);
        request_np.setKPP(KPP);
        request_np.setDT(DT);

        request_list = request.getNP();
        request_list.add(request_np);

        try {
            response = service.ndsRequest2(request);
            response_list = response.getNP();
            result = response_list.get(0).getState();
            System.out.println("Result = " + result);
        } catch (WebServiceException ex) {ex.printStackTrace();
        }


    }

}

