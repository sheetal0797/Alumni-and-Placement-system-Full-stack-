package com.example.project.controller;
import com.example.project.bean.Domain;
import com.example.project.bean.Placement;
import com.example.project.bean.Specialisation;
import com.example.project.service.PlacementService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Path("placement")
public class PlacementController {

    PlacementService placementService = new PlacementService();
    @POST
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    @Produces(MediaType.TEXT_PLAIN)
    public Response createOffer(@QueryParam("organisation") String organisation,
                                @QueryParam("profile") String profile,
                                @QueryParam("description") String description,
                                @QueryParam("intake") String intake,
                                @QueryParam("minimum_grade") String minimum_grade,
                                @QueryParam("specialisation") String specialisation,
                                @QueryParam("domain") String domain
                                ) throws URISyntaxException {
        String[] array1 = specialisation.split(" ");
        String[] array2 = domain.split(" ");
        int len1 = array1.length;
        int len2 = array2.length;
        List<Specialisation> specialisationList = new ArrayList<>();
        List<Domain> domainList = new ArrayList<>();

        for (int i = 0; i < len1; i++) {
            specialisationList.add(new Specialisation(array1[i]));
        }
        for (int i = 0; i < len2; i++) {
            domainList.add(new Domain(array2[i]));
        }

        Placement placement =  new Placement(organisation, profile, description, intake, minimum_grade, specialisationList,domainList);
        if(placementService.createOffer(placement)){
            return Response.ok().build();
        }
        return Response.status(203).build();
    }
}

