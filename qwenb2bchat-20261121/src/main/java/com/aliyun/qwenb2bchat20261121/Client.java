// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bchat20261121;

import com.aliyun.tea.*;
import com.aliyun.qwenb2bchat20261121.models.*;

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
     * <p>发送文本或多模态消息进行联网对话，支持深度思考、会话历史管理以及完整 JSON 响应和 SSE 流式响应。具体 Agent 及媒体能力以已开通范围为准。</p>
     * 
     * @param request ChatRequest
     * @param headers ChatHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatResponse
     */
    public ChatResponse chatWithOptions(ChatRequest request, ChatHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Chat"),
            new TeaPair("version", "2026-11-21"),
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
     * <p>发送文本或多模态消息进行联网对话，支持深度思考、会话历史管理以及完整 JSON 响应和 SSE 流式响应。具体 Agent 及媒体能力以已开通范围为准。</p>
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
     * <p>验证服务开通接口或为当前账户发起服务开通，返回当前开通状态及可用的订单或实例编号。</p>
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
            new TeaPair("version", "2026-11-21"),
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
     * <p>验证服务开通接口或为当前账户发起服务开通，返回当前开通状态及可用的订单或实例编号。</p>
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
     * <p>通过 WebSocket 上传语音并接收识别文字、Agent 回复及合成音频，支持图文辅助输入、识别上下文和会话历史。接口说明包含完整握手、控制帧、音频帧、返回事件与错误处理协议。</p>
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
            new TeaPair("version", "2026-11-21"),
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
     * <p>通过 WebSocket 上传语音并接收识别文字、Agent 回复及合成音频，支持图文辅助输入、识别上下文和会话历史。接口说明包含完整握手、控制帧、音频帧、返回事件与错误处理协议。</p>
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
