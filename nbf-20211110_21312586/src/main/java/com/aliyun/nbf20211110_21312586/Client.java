// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586;

import com.aliyun.tea.*;
import com.aliyun.nbf20211110_21312586.models.*;
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

    public ApiTestResponse apiTest(ApiTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.apiTestWithOptions(request, headers, runtime);
    }

    public ApiTestResponse apiTestWithOptions(ApiTestRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.testCmd)) {
            query.put("testCmd", request.testCmd);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        ApiTestResponse res = new ApiTestResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.doROARequest("ApiTest", "2021-11-10_21-31-25-86", "HTTPS", "POST", "AK", "/nbf_gateway_inner/1_0_0/apiTest", "binary", req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        return res;
    }

    public BuildSdkResponse buildSdk(BuildSdkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.buildSdkWithOptions(request, headers, runtime);
    }

    public BuildSdkResponse buildSdkWithOptions(BuildSdkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buildCmd)) {
            query.put("buildCmd", request.buildCmd);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        BuildSdkResponse res = new BuildSdkResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.doROARequest("BuildSdk", "2021-11-10_21-31-25-86", "HTTPS", "POST", "AK", "/nbf_gateway_inner/1_0_0/buildSdk", "binary", req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        return res;
    }

    public CreateAndReleaseApiResponse createAndReleaseApi(CreateAndReleaseApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAndReleaseApiWithOptions(request, headers, runtime);
    }

    public CreateAndReleaseApiResponse createAndReleaseApiWithOptions(CreateAndReleaseApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatApiCmd)) {
            query.put("creatApiCmd", request.creatApiCmd);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateAndReleaseApi", "2021-11-10_21-31-25-86", "HTTPS", "POST", "AK", "/nbf_gateway_inner/1_0_0/createAndReleaseApi", "string", req, runtime), new CreateAndReleaseApiResponse());
    }

    public CreateSdkVersionResponse createSdkVersion(CreateSdkVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSdkVersionWithOptions(request, headers, runtime);
    }

    public CreateSdkVersionResponse createSdkVersionWithOptions(CreateSdkVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createSdkCmd)) {
            query.put("createSdkCmd", request.createSdkCmd);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        CreateSdkVersionResponse res = new CreateSdkVersionResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.doROARequest("CreateSdkVersion", "2021-11-10_21-31-25-86", "HTTPS", "POST", "AK", "/nbf_gateway_inner/1_0_0/createSdkVersion", "binary", req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        return res;
    }

    public DeleteApiResponse deleteApi(DeleteApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteApiWithOptions(request, headers, runtime);
    }

    public DeleteApiResponse deleteApiWithOptions(DeleteApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiExternalId)) {
            query.put("apiExternalId", request.apiExternalId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        DeleteApiResponse res = new DeleteApiResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.doROARequest("DeleteApi", "2021-11-10_21-31-25-86", "HTTPS", "POST", "AK", "/nbf_gateway_inner/1_0_0/deleteApi", "binary", req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        return res;
    }

    public GetResultResponse getResult(GetResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResultWithOptions(request, headers, runtime);
    }

    public GetResultResponse getResultWithOptions(GetResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        GetResultResponse res = new GetResultResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.doROARequest("GetResult", "2021-11-10_21-31-25-86", "HTTPS", "POST", "AK", "/nbf_gateway_inner/1_0_0/getResult", "binary", req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        return res;
    }

    public PreCheckResponse preCheck(PreCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.preCheckWithOptions(request, headers, runtime);
    }

    public PreCheckResponse preCheckWithOptions(PreCheckRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiSchemaDTO)) {
            query.put("apiSchemaDTO", request.apiSchemaDTO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupVersionExtraInfo)) {
            query.put("groupVersionExtraInfo", request.groupVersionExtraInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespaceExternalId)) {
            query.put("namespaceExternalId", request.namespaceExternalId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        PreCheckResponse res = new PreCheckResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.doROARequest("PreCheck", "2021-11-10_21-31-25-86", "HTTPS", "POST", "AK", "/nbf_gateway_inner/1_0_0/preCheck", "binary", req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        return res;
    }

    public PublishSdkResponse publishSdk(PublishSdkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishSdkWithOptions(request, headers, runtime);
    }

    public PublishSdkResponse publishSdkWithOptions(PublishSdkRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        PublishSdkResponse res = new PublishSdkResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.doROARequest("PublishSdk", "2021-11-10_21-31-25-86", "HTTPS", "POST", "AK", "/nbf_gateway_inner/1_0_0/publishSdk", "binary", req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        return res;
    }

    public SerializeApiResponse serializeApi(SerializeApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.serializeApiWithOptions(request, headers, runtime);
    }

    public SerializeApiResponse serializeApiWithOptions(SerializeApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiSchemaDTO)) {
            query.put("apiSchemaDTO", request.apiSchemaDTO);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        SerializeApiResponse res = new SerializeApiResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.doROARequest("SerializeApi", "2021-11-10_21-31-25-86", "HTTPS", "POST", "AK", "/nbf_gateway_inner/1_0_0/serializeApi", "binary", req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        return res;
    }

    public UpdateAndReleaseApiResponse updateAndReleaseApi(UpdateAndReleaseApiRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAndReleaseApiWithOptions(request, headers, runtime);
    }

    public UpdateAndReleaseApiResponse updateAndReleaseApiWithOptions(UpdateAndReleaseApiRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.updateApiCmd)) {
            query.put("updateApiCmd", request.updateApiCmd);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        UpdateAndReleaseApiResponse res = new UpdateAndReleaseApiResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.doROARequest("UpdateAndReleaseApi", "2021-11-10_21-31-25-86", "HTTPS", "POST", "AK", "/nbf_gateway_inner/1_0_0/updateAndReleaseApi", "binary", req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        return res;
    }
}
