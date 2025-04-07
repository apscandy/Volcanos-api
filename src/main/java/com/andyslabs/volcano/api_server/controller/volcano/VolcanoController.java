package com.andyslabs.volcano.api_server.controller.volcano;

import com.andyslabs.volcano.api_server.controller.ErrorResponse;
import com.andyslabs.volcano.api_server.model.volcano.data.Volcano;
import com.andyslabs.volcano.api_server.model.volcano.data.VolcanoPopulationData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class VolcanoController {

    @GetMapping("/countries")
    public ResponseEntity<List<String>> getCountries() {
        List<String> list = new ArrayList<String>();
        list.add("India");
        list.add("USA");
        list.add("Germany");
        list.add("France");
        return ResponseEntity.ok(list);
    }

    @GetMapping("/volcano/{id}")
    public ResponseEntity<Volcano> getVolcanoById(@PathVariable int id) {
        var vol = new VolcanoPopulationData();
        vol.setId(id);
        vol.setName("Abu");
        vol.setCountry("Japan");
        vol.setRegion("Japan, Taiwan, Marianas");
        vol.setSubregion("Honshu");
        vol.setLastEruption("6850 BCE");
        vol.setSummit(641);
        vol.setElevation(2103);
        vol.setLatitude("34.5000");
        vol.setLongitude("131.6000");
        return ResponseEntity.ok(vol);
    }

    @GetMapping("/volcanoes")
    public ResponseEntity<List<Volcano>> getVolcanoes() {
        boolean error = true;
        if (!error) {
            ErrorResponse errorResponse = new ErrorResponse(400, "Invalid query parameters. Query parameters are not permitted.");
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,errorResponse.getMessage());
        }

        List<Volcano> list = new ArrayList<Volcano>();
        list.add(new Volcano());
        list.add(new Volcano());
        list.add(new Volcano());
        return ResponseEntity.ok(list);
    }
}
