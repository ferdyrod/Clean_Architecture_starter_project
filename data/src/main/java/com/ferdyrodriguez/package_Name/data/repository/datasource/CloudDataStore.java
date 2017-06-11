package com.ferdyrodriguez.package_Name.data.repository.datasource;

import com.ferdyrodriguez.package_Name.data.net.RestApi;


public class CloudDataStore implements CloudData {

    private final RestApi mRestApi;

    public CloudDataStore(RestApi restApi) { mRestApi = restApi; }
}
