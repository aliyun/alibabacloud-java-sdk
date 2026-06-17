// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuyingai20260311;

import com.aliyun.tea.*;
import com.aliyun.wuyingai20260311.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("wuyingai", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p><em>Features</em>*</p>
     * <ul>
     * <li>Real-time streaming response that reduces time to first token.</li>
     * <li>Supports multimodal input (text, images, and files).</li>
     * <li>Session persistence for multi-turn conversations.</li>
     * <li>Event-driven architecture for precise message status control.
     * <strong>Request information</strong></li>
     * <li><strong>Request method</strong>: <code>POST</code></li>
     * <li><strong>Content-Type</strong>: <code>application/json</code></li>
     * <li><strong>Response Content-Type</strong>: <code>text/event-stream</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Conducts a streaming conversation with JVS Crew, using the Server-Sent Events (SSE) protocol to push conversation content in real time.</p>
     * 
     * @param tmpReq ChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatResponse
     */
    public ChatResponse chatWithOptions(ChatRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ChatShrinkRequest request = new ChatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.input)) {
            request.inputShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.input, "Input", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.settings)) {
            request.settingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.settings, "Settings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamOptions)) {
            request.streamOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamOptions, "StreamOptions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorization)) {
            query.put("Authorization", request.authorization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalUserId)) {
            body.put("ExternalUserId", request.externalUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputShrink)) {
            body.put("Input", request.inputShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resume)) {
            body.put("Resume", request.resume);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routingKey)) {
            body.put("RoutingKey", request.routingKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settingsShrink)) {
            body.put("Settings", request.settingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamOptionsShrink)) {
            body.put("StreamOptions", request.streamOptionsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Chat"),
            new TeaPair("version", "2026-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new ChatResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Features</em>*</p>
     * <ul>
     * <li>Real-time streaming response that reduces time to first token.</li>
     * <li>Supports multimodal input (text, images, and files).</li>
     * <li>Session persistence for multi-turn conversations.</li>
     * <li>Event-driven architecture for precise message status control.
     * <strong>Request information</strong></li>
     * <li><strong>Request method</strong>: <code>POST</code></li>
     * <li><strong>Content-Type</strong>: <code>application/json</code></li>
     * <li><strong>Response Content-Type</strong>: <code>text/event-stream</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Conducts a streaming conversation with JVS Crew, using the Server-Sent Events (SSE) protocol to push conversation content in real time.</p>
     * 
     * @param request ChatRequest
     * @return ChatResponse
     */
    public ChatResponse chat(ChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Token format</em>*: The AccessToken is a <strong>JWT</strong> consisting of <strong>Header.Payload.Signature</strong> segments, each Base64URL-encoded and concatenated with <code>.</code> into a single line. The examples in the following table are masked for illustration purposes. The actual RequestId and JWT segments are longer.
     * <strong>Token validity</strong>: The AccessToken <strong>is valid for a limited period of time</strong>. After it expires, call this operation again to obtain a new token.
     * <strong>Authentication method</strong>: POP V1 signature (AK/SK)
     * <strong>Action</strong>: <code>GetAccessToken</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains an access token (AccessToken) for user conversations, which is used to authenticate when invoking the Chat operation.</p>
     * 
     * @param request GetAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessTokenResponse
     */
    public GetAccessTokenResponse getAccessTokenWithOptions(GetAccessTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalUserId)) {
            query.put("ExternalUserId", request.externalUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessToken"),
            new TeaPair("version", "2026-03-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Token format</em>*: The AccessToken is a <strong>JWT</strong> consisting of <strong>Header.Payload.Signature</strong> segments, each Base64URL-encoded and concatenated with <code>.</code> into a single line. The examples in the following table are masked for illustration purposes. The actual RequestId and JWT segments are longer.
     * <strong>Token validity</strong>: The AccessToken <strong>is valid for a limited period of time</strong>. After it expires, call this operation again to obtain a new token.
     * <strong>Authentication method</strong>: POP V1 signature (AK/SK)
     * <strong>Action</strong>: <code>GetAccessToken</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains an access token (AccessToken) for user conversations, which is used to authenticate when invoking the Chat operation.</p>
     * 
     * @param request GetAccessTokenRequest
     * @return GetAccessTokenResponse
     */
    public GetAccessTokenResponse getAccessToken(GetAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessTokenWithOptions(request, runtime);
    }
}
