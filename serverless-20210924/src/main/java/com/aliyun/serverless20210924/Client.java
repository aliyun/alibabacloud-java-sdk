// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924;

import com.aliyun.tea.*;
import com.aliyun.serverless20210924.models.*;
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
        this._endpoint = this.getEndpoint("serverless", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetEnvironmentResponse getEnvironment(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEnvironmentWithOptions(name, headers, runtime);
    }

    public GetEnvironmentResponse getEnvironmentWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEnvironment"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/environments/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEnvironmentResponse());
    }

    public GetServiceResponse getService(String name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceWithOptions(name, headers, runtime);
    }

    public GetServiceResponse getServiceWithOptions(String name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetService"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/services/" + name + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceResponse());
    }

    public ListEnvironmentsResponse listEnvironments() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listEnvironmentsWithOptions(headers, runtime);
    }

    public ListEnvironmentsResponse listEnvironmentsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvironments"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/environments/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvironmentsResponse());
    }

    public ListServicesResponse listServices() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listServicesWithOptions(headers, runtime);
    }

    public ListServicesResponse listServicesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServices"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/services/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServicesResponse());
    }

    public PutEnvironmentResponse putEnvironment(String name, PutEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putEnvironmentWithOptions(name, request, headers, runtime);
    }

    public PutEnvironmentResponse putEnvironmentWithOptions(String name, PutEnvironmentRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEnvironment"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/environments/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEnvironmentResponse());
    }

    public PutServiceResponse putService(String name, PutServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.putServiceWithOptions(name, request, headers, runtime);
    }

    public PutServiceResponse putServiceWithOptions(String name, PutServiceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        name = com.aliyun.openapiutil.Client.getEncodeParam(name);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutService"),
            new TeaPair("version", "2021-09-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apis/serverlessdeployment/v1/services/" + name + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutServiceResponse());
    }
}
