package com.toyProjcet.toyProject.service;

import com.toyProjcet.toyProject.domain.DBConnTest;
import com.toyProjcet.toyProject.repository.DBConnTestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DBConnTestService {
    @Autowired
    private DBConnTestRepository dbConnTestRepo;

    public List<DBConnTest> getDBConnTest() throws IllegalAccessException {
        List<DBConnTest> dbConnTestList = dbConnTestRepo.findAll();
        if(!dbConnTestList.isEmpty()) {
            return dbConnTestList;
        } else {
            throw new IllegalAccessException("데이터 없음");
        }
    }

    public DBConnTest getDBConnTestById(final Long id) {
        return dbConnTestRepo.findById(id).orElseThrow(() -> new IllegalArgumentException("데이터 없음"));
    }

    public DBConnTest createDBConnTest(final DBConnTest createItem) {
        if(createItem == null) throw new IllegalArgumentException("createDbConntest 없음");
        return dbConnTestRepo.save(createItem);
    }

    public DBConnTest updateDBConnTest(final Long id, final DBConnTest updateItem) {
        DBConnTest dbConnTest = getDBConnTestById(id);
        dbConnTest.setTestId(updateItem.getTestId());

        return dbConnTestRepo.save(dbConnTest);
    }

    public void deleteDBConnTest(final Long id) {
        dbConnTestRepo.deleteById(id);
    }
}
