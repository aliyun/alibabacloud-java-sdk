// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261105;

import com.aliyun.tea.*;
import com.aliyun.qwenb2bchat20261105.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "QwenB2BChat";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("qwenb2bchat", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Sends text or multimodal messages to initiate conversations with web search capabilities, supporting deep thinking, session history management, and both complete JSON and Server-Sent Events (SSE) streaming responses. Specific agent and media capabilities are subject to the activated scope.</p>
     * 
     * @param request ChatRequest
     * @param headers ChatHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatResponse
     */
    public ChatResponse chatWithOptions(ChatRequest request, ChatHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.communication)) {
            body.put("communication", request.communication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.accept)) {
            realHeaders.put("Accept", com.aliyun.teautil.Common.toJSONString(headers.accept));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xDashScopeSSE)) {
            realHeaders.put("X-DashScope-SSE", com.aliyun.teautil.Common.toJSONString(headers.xDashScopeSSE));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWAccess)) {
            realHeaders.put("X-GW-Access", com.aliyun.teautil.Common.toJSONString(headers.xGWAccess));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWNonce)) {
            realHeaders.put("X-GW-Nonce", com.aliyun.teautil.Common.toJSONString(headers.xGWNonce));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWProtocol)) {
            realHeaders.put("X-GW-Protocol", com.aliyun.teautil.Common.toJSONString(headers.xGWProtocol));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWSignature)) {
            realHeaders.put("X-GW-Signature", com.aliyun.teautil.Common.toJSONString(headers.xGWSignature));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWTimestamp)) {
            realHeaders.put("X-GW-Timestamp", com.aliyun.teautil.Common.toJSONString(headers.xGWTimestamp));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xRequestId)) {
            realHeaders.put("X-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xRequestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Chat"),
            new TeaPair("version", "2026-11-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/api/chat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sends text or multimodal messages to initiate conversations with web search capabilities, supporting deep thinking, session history management, and both complete JSON and Server-Sent Events (SSE) streaming responses. Specific agent and media capabilities are subject to the activated scope.</p>
     * 
     * @param request ChatRequest
     * @return ChatResponse
     */
    public ChatResponse chat(ChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChatHeaders headers = new ChatHeaders();
        return this.chatWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the service activation API or initiates service activation for the current account, and returns the current activation status along with the available order or instance ID.</p>
     * 
     * @param request OpenServiceRequest
     * @param headers OpenServiceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenServiceResponse
     */
    public OpenServiceResponse openServiceWithOptions(OpenServiceRequest request, OpenServiceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.communication)) {
            body.put("communication", request.communication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openBenefits)) {
            body.put("openBenefits", request.openBenefits);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWAccess)) {
            realHeaders.put("X-GW-Access", com.aliyun.teautil.Common.toJSONString(headers.xGWAccess));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWNonce)) {
            realHeaders.put("X-GW-Nonce", com.aliyun.teautil.Common.toJSONString(headers.xGWNonce));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWSignature)) {
            realHeaders.put("X-GW-Signature", com.aliyun.teautil.Common.toJSONString(headers.xGWSignature));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWTimestamp)) {
            realHeaders.put("X-GW-Timestamp", com.aliyun.teautil.Common.toJSONString(headers.xGWTimestamp));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xRequestId)) {
            realHeaders.put("X-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xRequestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenService"),
            new TeaPair("version", "2026-11-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/api/openService"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the service activation API or initiates service activation for the current account, and returns the current activation status along with the available order or instance ID.</p>
     * 
     * @param request OpenServiceRequest
     * @return OpenServiceResponse
     */
    public OpenServiceResponse openService(OpenServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenServiceHeaders headers = new OpenServiceHeaders();
        return this.openServiceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads audio and receives recognized text, agent responses, and synthesized audio over a WebSocket connection. Supports image and text auxiliary input, recognition context, and conversation history. The operation description covers the complete handshake, control frames, audio frames, return events, and error handling protocols.</p>
     * 
     * @param request StreamVoiceRequest
     * @param headers StreamVoiceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StreamVoiceResponse
     */
    public StreamVoiceResponse streamVoiceWithOptions(StreamVoiceRequest request, StreamVoiceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWAccess)) {
            realHeaders.put("X-GW-Access", com.aliyun.teautil.Common.toJSONString(headers.xGWAccess));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWNonce)) {
            realHeaders.put("X-GW-Nonce", com.aliyun.teautil.Common.toJSONString(headers.xGWNonce));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWProtocol)) {
            realHeaders.put("X-GW-Protocol", com.aliyun.teautil.Common.toJSONString(headers.xGWProtocol));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWSignature)) {
            realHeaders.put("X-GW-Signature", com.aliyun.teautil.Common.toJSONString(headers.xGWSignature));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWTimestamp)) {
            realHeaders.put("X-GW-Timestamp", com.aliyun.teautil.Common.toJSONString(headers.xGWTimestamp));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xRequestId)) {
            realHeaders.put("X-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xRequestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StreamVoice"),
            new TeaPair("version", "2026-11-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/api/voice"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StreamVoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads audio and receives recognized text, agent responses, and synthesized audio over a WebSocket connection. Supports image and text auxiliary input, recognition context, and conversation history. The operation description covers the complete handshake, control frames, audio frames, return events, and error handling protocols.</p>
     * 
     * @param request StreamVoiceRequest
     * @return StreamVoiceResponse
     */
    public StreamVoiceResponse streamVoice(StreamVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StreamVoiceHeaders headers = new StreamVoiceHeaders();
        return this.streamVoiceWithOptions(request, headers, runtime);
    }
}
