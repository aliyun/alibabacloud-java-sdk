// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210831_223006136;

import com.aliyun.tea.*;
import com.aliyun.nbftestpop20210831_223006136.models.*;
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
        this._endpoint = this.getEndpoint("nbftestpop", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddResponse add(AddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addWithOptions(request, headers, runtime);
    }

    public AddResponse addWithOptions(AddRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arg0)) {
            query.put("arg0", request.arg0);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arg1)) {
            query.put("arg1", request.arg1);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("Add", "2021-08-31_22-30-06-136", "HTTPS", "POST", "AK", "/kxNineThreeNineSeven/kxAddTest", "json", req, runtime), new AddResponse());
    }

    public AddAssetResponse addAsset(AddAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addAssetWithOptions(request, headers, runtime);
    }

    public AddAssetResponse addAssetWithOptions(AddAssetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.x)) {
            query.put("x", request.x);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.y)) {
            query.put("y", request.y);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AddAsset", "2021-08-31_22-30-06-136", "HTTPS", "POST", "AK", "/asset/add", "json", req, runtime), new AddAssetResponse());
    }

    public TestAssetResponse testAsset(TestAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.testAssetWithOptions(request, headers, runtime);
    }

    public TestAssetResponse testAssetWithOptions(TestAssetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.x)) {
            query.put("x", request.x);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.y)) {
            query.put("y", request.y);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("TestAsset", "2021-08-31_22-30-06-136", "HTTPS", "POST", "AK", "/test/url/a", "json", req, runtime), new TestAssetResponse());
    }
}
