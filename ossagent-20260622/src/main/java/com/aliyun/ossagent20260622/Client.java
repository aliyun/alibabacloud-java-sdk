// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260622;

import com.aliyun.tea.*;
import com.aliyun.ossagent20260622.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ossagent", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>聊天流式接口</p>
     * 
     * @param request ChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatResponse
     */
    public ChatResponse chatWithOptions(ChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Chat"),
            new TeaPair("version", "2026-06-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/chat/stream"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>聊天流式接口</p>
     * 
     * @param request ChatRequest
     * @return ChatResponse
     */
    public ChatResponse chat(ChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.chatWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>工具确认接口</p>
     * 
     * @param request ConfirmRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmResponse
     */
    public ConfirmResponse confirmWithOptions(ConfirmRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.confirmed)) {
            body.put("confirmed", request.confirmed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            body.put("phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolCalls)) {
            body.put("toolCalls", request.toolCalls);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Confirm"),
            new TeaPair("version", "2026-06-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/chat/confirm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>工具确认接口</p>
     * 
     * @param request ConfirmRequest
     * @return ConfirmResponse
     */
    public ConfirmResponse confirm(ConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>聊天中断接口</p>
     * 
     * @param request InterruptRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InterruptResponse
     */
    public InterruptResponse interruptWithOptions(String sessionId, InterruptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Interrupt"),
            new TeaPair("version", "2026-06-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/chat/interrupt/" + com.aliyun.openapiutil.Client.getEncodeParam(sessionId) + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InterruptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>聊天中断接口</p>
     * 
     * @param request InterruptRequest
     * @return InterruptResponse
     */
    public InterruptResponse interrupt(String sessionId, InterruptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.interruptWithOptions(sessionId, request, headers, runtime);
    }
}
