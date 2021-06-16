// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509;

import com.aliyun.tea.*;
import com.aliyun.tunnel_service20210509.models.*;
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
        this._endpoint = this.getEndpoint("tunnel-service", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DeleteSessionResponse deleteSession(String sessionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSessionWithOptions(sessionId, headers, runtime);
    }

    public DeleteSessionResponse deleteSessionWithOptions(String sessionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteSession", "2021-05-09", "HTTPS", "DELETE", "AK", "/v1/sessions/" + sessionId + "", "json", req, runtime), new DeleteSessionResponse());
    }

    public GetInstanceResponse getInstance(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceWithOptions(instanceId, headers, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetInstance", "2021-05-09", "HTTPS", "GET", "AK", "/v1/instances/" + instanceId + "", "json", req, runtime), new GetInstanceResponse());
    }

    public HeartBeatResponse heartBeat(HeartBeatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.heartBeatWithOptions(request, headers, runtime);
    }

    public HeartBeatResponse heartBeatWithOptions(HeartBeatRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionStatus)) {
            body.put("sessionStatus", request.sessionStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("HeartBeat", "2021-05-09", "HTTPS", "PUT", "AK", "/v1/sessions/", "json", req, runtime), new HeartBeatResponse());
    }

    public UnRegisterInstanceResponse unRegisterInstance(String instanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unRegisterInstanceWithOptions(instanceId, headers, runtime);
    }

    public UnRegisterInstanceResponse unRegisterInstanceWithOptions(String instanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("UnRegisterInstance", "2021-05-09", "HTTPS", "PUT", "AK", "/v1/instances/" + instanceId + "", "json", req, runtime), new UnRegisterInstanceResponse());
    }

    public CreateSessionResponse createSession(CreateSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSessionWithOptions(request, headers, runtime);
    }

    public CreateSessionResponse createSessionWithOptions(CreateSessionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionName)) {
            body.put("sessionName", request.sessionName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("CreateSession", "2021-05-09", "HTTPS", "POST", "AK", "/v1/sessions/", "json", req, runtime), new CreateSessionResponse());
    }

    public RegisterInstanceResponse registerInstance(RegisterInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerInstanceWithOptions(request, headers, runtime);
    }

    public RegisterInstanceResponse registerInstanceWithOptions(RegisterInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("instanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("instanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("RegisterInstance", "2021-05-09", "HTTPS", "POST", "AK", "/v1/instances/", "json", req, runtime), new RegisterInstanceResponse());
    }

    public GetSessionResponse getSession(String sessionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSessionWithOptions(sessionId, headers, runtime);
    }

    public GetSessionResponse getSessionWithOptions(String sessionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("GetSession", "2021-05-09", "HTTPS", "GET", "AK", "/v1/sessions/" + sessionId + "", "json", req, runtime), new GetSessionResponse());
    }

    public ListSessionsResponse listSessions(ListSessionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSessionsWithOptions(request, headers, runtime);
    }

    public ListSessionsResponse listSessionsWithOptions(ListSessionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("pageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSessions", "2021-05-09", "HTTPS", "GET", "AK", "/v1/sessions/", "json", req, runtime), new ListSessionsResponse());
    }
}
