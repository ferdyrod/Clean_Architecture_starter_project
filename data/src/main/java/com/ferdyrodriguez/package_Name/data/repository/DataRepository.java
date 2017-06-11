package com.ferdyrodriguez.package_Name.data.repository;


import com.ferdyrodriguez.package_Name.data.repository.datasource.DataStoreFactory;
import com.ferdyrodriguez.package_Name.domain.repository.Repository;

import javax.inject.Inject;

public class DataRepository implements Repository {

    private DataStoreFactory mDataStoreFactory;

    @Inject public DataRepository(DataStoreFactory dataStoreFactory) {
        mDataStoreFactory = dataStoreFactory;
    }
}
