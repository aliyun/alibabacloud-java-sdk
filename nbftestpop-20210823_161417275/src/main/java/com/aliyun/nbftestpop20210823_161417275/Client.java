// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210823_161417275;

import com.aliyun.tea.*;
import com.aliyun.nbftestpop20210823_161417275.models.*;
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
        return TeaModel.toModel(this.doROARequest("Add", "2021-08-23_16-14-17-275", "HTTPS", "GET", "AK", "/kxNineSixThree/add", "json", req, runtime), new AddResponse());
    }

    public HttpGroupTestResponse httpGroupTest(HttpGroupTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.httpGroupTestWithOptions(request, headers, runtime);
    }

    public HttpGroupTestResponse httpGroupTestWithOptions(HttpGroupTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.devConfig))) {
            body.put("devConfig", request.devConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            body.put("externalId", request.externalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraInfo)) {
            body.put("extraInfo", request.extraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("desc", request.desc);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("HttpGroupTest", "2021-08-23_16-14-17-275", "HTTPS", "POST", "AK", "/kxHttpTest/httpGroupTest", "json", req, runtime), new HttpGroupTestResponse());
    }

    public MultiComplexResponse multiComplex(MultiComplexRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.multiComplexWithOptions(request, headers, runtime);
    }

    public MultiComplexResponse multiComplexWithOptions(MultiComplexRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MultiComplexShrinkRequest request = new MultiComplexShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.arg2))) {
            request.arg2Shrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.arg2), "arg2", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arg0)) {
            query.put("arg0", request.arg0);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arg1)) {
            query.put("arg1", request.arg1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arg2Shrink)) {
            query.put("arg2", request.arg2Shrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("MultiComplex", "2021-08-23_16-14-17-275", "HTTPS", "GET", "AK", "/kxNineSixThree/multiComplex", "json", req, runtime), new MultiComplexResponse());
    }

    public GetSiteDomainResponse getSiteDomain(GetSiteDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSiteDomainWithOptions(request, headers, runtime);
    }

    public GetSiteDomainResponse getSiteDomainWithOptions(GetSiteDomainRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.age)) {
            query.put("age", request.age);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            body.put("hostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionType)) {
            body.put("regionType", request.regionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionTypeName)) {
            body.put("regionTypeName", request.regionTypeName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("GetSiteDomain", "2021-08-23_16-14-17-275", "HTTPS", "POST", "AK", "/kxHttpTest/firstHttp", "json", req, runtime), new GetSiteDomainResponse());
    }
}
