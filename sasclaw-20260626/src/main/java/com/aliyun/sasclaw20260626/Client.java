// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasclaw20260626;

import com.aliyun.tea.*;
import com.aliyun.sasclaw20260626.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sasclaw", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Claw SSE Chat</p>
     * 
     * @param request ChatUserSecAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatUserSecAgentResponse
     */
    public ChatUserSecAgentResponse chatUserSecAgentWithOptions(ChatUserSecAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agent)) {
            body.put("Agent", request.agent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachmentStagingId)) {
            body.put("AttachmentStagingId", request.attachmentStagingId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachments)) {
            body.put("Attachments", request.attachments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionMode)) {
            body.put("ExecutionMode", request.executionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraParams)) {
            body.put("ExtraParams", request.extraParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseLanguage)) {
            body.put("ResponseLanguage", request.responseLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skill)) {
            body.put("Skill", request.skill);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("Stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.talkId)) {
            body.put("TalkId", request.talkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("TimeZone", request.timeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInputInfo)) {
            body.put("UserInputInfo", request.userInputInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatUserSecAgent"),
            new TeaPair("version", "2026-06-26"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatUserSecAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Claw SSE Chat</p>
     * 
     * @param request ChatUserSecAgentRequest
     * @return ChatUserSecAgentResponse
     */
    public ChatUserSecAgentResponse chatUserSecAgent(ChatUserSecAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatUserSecAgentWithOptions(request, runtime);
    }
}
