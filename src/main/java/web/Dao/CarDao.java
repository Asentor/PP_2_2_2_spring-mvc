package web.Dao;

import web.model.Car;

import java.util.List;

public interface CarDao {
    void add(Car car);
    void addTestData();
    List getAll();
    List getAllLimitedByCount(Long count);
}