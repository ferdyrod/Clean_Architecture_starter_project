package com.ferdyrodriguez.package_Name.data.repository.datasource;

import com.ferdyrodriguez.package_Name.data.net.RestApi;
import com.ferdyrodriguez.package_Name.data.net.RestApiImpl;

import javax.inject.Singleton;

@Singleton public class DataStoreFactory {

    public CloudData createCloudData() {
        RestApi restApi = RestApiImpl.createRetrofitService(RestApi.class);
        return new CloudDataStore(restApi);
    }
}
