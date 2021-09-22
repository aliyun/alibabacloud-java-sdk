// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20210922_105633300;

import com.aliyun.tea.*;
import com.aliyun.nbf20210922_105633300.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nbf", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public LcDemoResponse lcDemo(String userId, String hsfServiceName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.lcDemoWithOptions(userId, hsfServiceName, headers, runtime);
    }

    public LcDemoResponse lcDemoWithOptions(String userId, String hsfServiceName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        userId = com.aliyun.openapiutil.Client.getEncodeParam(userId);
        hsfServiceName = com.aliyun.openapiutil.Client.getEncodeParam(hsfServiceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("LcDemo", "2021-09-22_10-56-33-300", "HTTP", "GET", "AK", "/lc_demo/1_0_0/lcDemo", "json", req, runtime), new LcDemoResponse());
    }
}
