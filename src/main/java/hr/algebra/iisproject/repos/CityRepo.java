package hr.algebra.iisproject.repos;

import hr.algebra.iisproject.models.City;
import hr.algebra.iisproject.models.DhmzCity;

import java.util.List;

public interface CityRepo {
    List<City> getCities();
    DhmzCity getCity(String name);
}
