// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801;

import com.aliyun.tea.*;
import com.aliyun.openagent20260801.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("openagent", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>description</b> :
     * <p>Cancels a specified run and returns the run status after the cancellation.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a run.</p>
     * 
     * @param request CancelRunRequest
     * @param headers CancelRunHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRunResponse
     */
    public CancelRunResponse cancelRunWithOptions(String sessionId, String runId, CancelRunRequest request, CancelRunHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xOpenAgentIdempotencyKey)) {
            realHeaders.put("X-OpenAgent-Idempotency-Key", com.aliyun.teautil.Common.toJSONString(headers.xOpenAgentIdempotencyKey));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRun"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/agent/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionId) + "/runs/" + com.aliyun.openapiutil.Client.getEncodeParam(runId) + "/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>Cancels a specified run and returns the run status after the cancellation.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a run.</p>
     * 
     * @param request CancelRunRequest
     * @return CancelRunResponse
     */
    public CancelRunResponse cancelRun(String sessionId, String runId, CancelRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CancelRunHeaders headers = new CancelRunHeaders();
        return this.cancelRunWithOptions(sessionId, runId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a session and returns the session information. Use the returned sessionId for subsequent operations such as sending messages, querying records, and updating the session.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a session.</p>
     * 
     * @param request CreateSessionRequest
     * @param headers CreateSessionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSessionResponse
     */
    public CreateSessionResponse createSessionWithOptions(CreateSessionRequest request, CreateSessionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xOpenAgentIdempotencyKey)) {
            realHeaders.put("X-OpenAgent-Idempotency-Key", com.aliyun.teautil.Common.toJSONString(headers.xOpenAgentIdempotencyKey));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSession"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/agent/sessions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a session and returns the session information. Use the returned sessionId for subsequent operations such as sending messages, querying records, and updating the session.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a session.</p>
     * 
     * @param request CreateSessionRequest
     * @return CreateSessionResponse
     */
    public CreateSessionResponse createSession(CreateSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateSessionHeaders headers = new CreateSessionHeaders();
        return this.createSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified session. Returns 404 Session.NotFound if the session does not exist or has been deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a session.</p>
     * 
     * @param request DeleteSessionRequest
     * @param headers DeleteSessionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSessionResponse
     */
    public DeleteSessionResponse deleteSessionWithOptions(String sessionId, DeleteSessionRequest request, DeleteSessionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xOpenAgentIdempotencyKey)) {
            realHeaders.put("X-OpenAgent-Idempotency-Key", com.aliyun.teautil.Common.toJSONString(headers.xOpenAgentIdempotencyKey));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSession"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/agent/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified session. Returns 404 Session.NotFound if the session does not exist or has been deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a session.</p>
     * 
     * @param request DeleteSessionRequest
     * @return DeleteSessionResponse
     */
    public DeleteSessionResponse deleteSession(String sessionId, DeleteSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteSessionHeaders headers = new DeleteSessionHeaders();
        return this.deleteSessionWithOptions(sessionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the read-only mode switch for the current account. The read-only mode is enabled by default if it is not configured.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the read-only mode.</p>
     * 
     * @param request GetReadonlyModeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReadonlyModeResponse
     */
    public GetReadonlyModeResponse getReadonlyModeWithOptions(GetReadonlyModeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReadonlyMode"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/user/configs/readonly"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReadonlyModeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the read-only mode switch for the current account. The read-only mode is enabled by default if it is not configured.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the read-only mode.</p>
     * 
     * @param request GetReadonlyModeRequest
     * @return GetReadonlyModeResponse
     */
    public GetReadonlyModeResponse getReadonlyMode(GetReadonlyModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getReadonlyModeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the status and interrupt information of a specified run.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a run.</p>
     * 
     * @param request GetRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRunResponse
     */
    public GetRunResponse getRunWithOptions(String sessionId, String runId, GetRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRun"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/agent/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionId) + "/runs/" + com.aliyun.openapiutil.Client.getEncodeParam(runId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the status and interrupt information of a specified run.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a run.</p>
     * 
     * @param request GetRunRequest
     * @return GetRunResponse
     */
    public GetRunResponse getRun(String sessionId, String runId, GetRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRunWithOptions(sessionId, runId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the title, status, pinning information, and the ID and status of the most recent run of a specified session.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a session.</p>
     * 
     * @param request GetSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSessionResponse
     */
    public GetSessionResponse getSessionWithOptions(String sessionId, GetSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSession"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/agent/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the title, status, pinning information, and the ID and status of the most recent run of a specified session.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a session.</p>
     * 
     * @param request GetSessionRequest
     * @return GetSessionResponse
     */
    public GetSessionResponse getSession(String sessionId, GetSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSessionWithOptions(sessionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query on the message timeline of a specified session. Use the returned nextToken to retrieve the next page.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists messages.</p>
     * 
     * @param request ListMessagesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMessagesResponse
     */
    public ListMessagesResponse listMessagesWithOptions(String sessionId, ListMessagesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            query.put("runId", request.runId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMessages"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/agent/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionId) + "/messages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMessagesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query on the message timeline of a specified session. Use the returned nextToken to retrieve the next page.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists messages.</p>
     * 
     * @param request ListMessagesRequest
     * @return ListMessagesResponse
     */
    public ListMessagesResponse listMessages(String sessionId, ListMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMessagesWithOptions(sessionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Uses paging to query the list of sessions accessible to the current identity used to invoke. Use the returned nextToken to retrieve the next page.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists sessions.</p>
     * 
     * @param request ListSessionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSessionsResponse
     */
    public ListSessionsResponse listSessionsWithOptions(ListSessionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSessions"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/agent/sessions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSessionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Uses paging to query the list of sessions accessible to the current identity used to invoke. Use the returned nextToken to retrieve the next page.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists sessions.</p>
     * 
     * @param request ListSessionsRequest
     * @return ListSessionsResponse
     */
    public ListSessionsResponse listSessions(ListSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSessionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Sends a message to a specified session, submits interrupt handling results, or reconnects to a specified run. Returns the run progress and results through a Server-Sent Events (SSE) event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a message.</p>
     * 
     * @param request SendMessageRequest
     * @param headers SendMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessageWithOptions(String sessionId, SendMessageRequest request, SendMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resume)) {
            body.put("resume", request.resume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            body.put("runId", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xOpenAgentIdempotencyKey)) {
            realHeaders.put("X-OpenAgent-Idempotency-Key", com.aliyun.teautil.Common.toJSONString(headers.xOpenAgentIdempotencyKey));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessage"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/agent/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionId) + "/messages"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Sends a message to a specified session, submits interrupt handling results, or reconnects to a specified run. Returns the run progress and results through a Server-Sent Events (SSE) event stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Sends a message.</p>
     * 
     * @param request SendMessageRequest
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessage(String sessionId, SendMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendMessageHeaders headers = new SendMessageHeaders();
        return this.sendMessageWithOptions(sessionId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Enables or disables the read-only mode for the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the read-only mode.</p>
     * 
     * @param request UpdateReadonlyModeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateReadonlyModeResponse
     */
    public UpdateReadonlyModeResponse updateReadonlyModeWithOptions(UpdateReadonlyModeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateReadonlyMode"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/user/configs/readonly"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateReadonlyModeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Enables or disables the read-only mode for the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the read-only mode.</p>
     * 
     * @param request UpdateReadonlyModeRequest
     * @return UpdateReadonlyModeResponse
     */
    public UpdateReadonlyModeResponse updateReadonlyMode(UpdateReadonlyModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateReadonlyModeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the title or pinned status of a specified session. Specify at least one of the title and pinned fields. Unspecified fields remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the title or pinned status of a session.</p>
     * 
     * @param request UpdateSessionRequest
     * @param headers UpdateSessionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSessionResponse
     */
    public UpdateSessionResponse updateSessionWithOptions(String sessionId, UpdateSessionRequest request, UpdateSessionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pinned)) {
            body.put("pinned", request.pinned);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xOpenAgentIdempotencyKey)) {
            realHeaders.put("X-OpenAgent-Idempotency-Key", com.aliyun.teautil.Common.toJSONString(headers.xOpenAgentIdempotencyKey));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSession"),
            new TeaPair("version", "2026-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/v1/agent/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the title or pinned status of a specified session. Specify at least one of the title and pinned fields. Unspecified fields remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the title or pinned status of a session.</p>
     * 
     * @param request UpdateSessionRequest
     * @return UpdateSessionResponse
     */
    public UpdateSessionResponse updateSession(String sessionId, UpdateSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateSessionHeaders headers = new UpdateSessionHeaders();
        return this.updateSessionWithOptions(sessionId, request, headers, runtime);
    }
}
