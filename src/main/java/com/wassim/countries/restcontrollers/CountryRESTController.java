package com.wassim.countries.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.wassim.countries.entities.Country;
import com.wassim.countries.services.CountryService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class CountryRESTController {
@Autowired
CountryService countryService;
@RequestMapping(method = RequestMethod.GET)
public List<Country> getAllProduits() {
return countryService.getAllCountries();
}
}