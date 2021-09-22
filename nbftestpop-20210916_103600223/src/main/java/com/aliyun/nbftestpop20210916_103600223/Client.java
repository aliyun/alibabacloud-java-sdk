// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210916_103600223;

import com.aliyun.tea.*;
import com.aliyun.nbftestpop20210916_103600223.models.*;
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
        return TeaModel.toModel(this.doROARequest("Add", "2021-09-16_10-36-00-223", "HTTPS", "GET", "AK", "/kxRoaProduct/9_0_9/add", "json", req, runtime), new AddResponse());
    }

    public ResolveOpenApiResponse resolveOpenApi(ResolveOpenApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resolveOpenApiWithOptions(request, headers, runtime);
    }

    public ResolveOpenApiResponse resolveOpenApiWithOptions(ResolveOpenApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.age)) {
            query.put("age", request.age);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.teacher))) {
            query.put("teacher", request.teacher);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.friends)) {
            query.put("friends", request.friends);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ResolveOpenApi", "2021-09-16_10-36-00-223", "HTTPS", "POST", "AK", "/kxRoaProduct/9_0_9/resolveOpenApi", "json", req, runtime), new ResolveOpenApiResponse());
    }

    public AssetPublishTestOpenApiResponse assetPublishTestOpenApi(AssetPublishTestOpenApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.assetPublishTestOpenApiWithOptions(request, headers, runtime);
    }

    public AssetPublishTestOpenApiResponse assetPublishTestOpenApiWithOptions(AssetPublishTestOpenApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.teacher))) {
            query.put("teacher", request.teacher);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("AssetPublishTestOpenApi", "2021-09-16_10-36-00-223", "HTTPS", "POST", "AK", "/kxRoaProduct/9_0_9/assetPublishTestOpenApi", "json", req, runtime), new AssetPublishTestOpenApiResponse());
    }
}
