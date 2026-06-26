// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612;

import com.aliyun.tea.*;
import com.aliyun.voicenavigator20180612.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "voicenavigator.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "voicenavigator.cn-hangzhou.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("voicenavigator", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Associates a chatbot with a navigation instance.</p>
     * 
     * @param request AssociateChatbotInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateChatbotInstanceResponse
     */
    public AssociateChatbotInstanceResponse associateChatbotInstanceWithOptions(AssociateChatbotInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatbotInstanceId)) {
            query.put("ChatbotInstanceId", request.chatbotInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatbotName)) {
            query.put("ChatbotName", request.chatbotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluServiceParamsJson)) {
            query.put("NluServiceParamsJson", request.nluServiceParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluServiceType)) {
            query.put("NluServiceType", request.nluServiceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionSource)) {
            query.put("UnionSource", request.unionSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateChatbotInstance"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateChatbotInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a chatbot with a navigation instance.</p>
     * 
     * @param request AssociateChatbotInstanceRequest
     * @return AssociateChatbotInstanceResponse
     */
    public AssociateChatbotInstanceResponse associateChatbotInstance(AssociateChatbotInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateChatbotInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Previews a text-to-speech (TTS) voice.</p>
     * 
     * @param request AuditTTSVoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuditTTSVoiceResponse
     */
    public AuditTTSVoiceResponse auditTTSVoiceWithOptions(AuditTTSVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessKey)) {
            query.put("AccessKey", request.accessKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParams)) {
            query.put("ExtParams", request.extParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pitchRate)) {
            query.put("PitchRate", request.pitchRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretKey)) {
            query.put("SecretKey", request.secretKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            query.put("SpeechRate", request.speechRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            query.put("Voice", request.voice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuditTTSVoice"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuditTTSVoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Previews a text-to-speech (TTS) voice.</p>
     * 
     * @param request AuditTTSVoiceRequest
     * @return AuditTTSVoiceResponse
     */
    public AuditTTSVoiceResponse auditTTSVoice(AuditTTSVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.auditTTSVoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a conversation.</p>
     * 
     * @param request BeginDialogueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BeginDialogueResponse
     */
    public BeginDialogueResponse beginDialogueWithOptions(BeginDialogueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialContext)) {
            query.put("InitialContext", request.initialContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            query.put("InstanceOwnerId", request.instanceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BeginDialogue"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BeginDialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a conversation.</p>
     * 
     * @param request BeginDialogueRequest
     * @return BeginDialogueResponse
     */
    public BeginDialogueResponse beginDialogue(BeginDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.beginDialogueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Collects a number entered by a user during a call.</p>
     * 
     * @param request CollectedNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CollectedNumberResponse
     */
    public CollectedNumberResponse collectedNumberWithOptions(CollectedNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalContext)) {
            query.put("AdditionalContext", request.additionalContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            query.put("InstanceOwnerId", request.instanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CollectedNumber"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CollectedNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Collects a number entered by a user during a call.</p>
     * 
     * @param request CollectedNumberRequest
     * @return CollectedNumberResponse
     */
    public CollectedNumberResponse collectedNumber(CollectedNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.collectedNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a temporary URL to download a file.</p>
     * 
     * @param request CreateDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDownloadUrlResponse
     */
    public CreateDownloadUrlResponse createDownloadUrlWithOptions(CreateDownloadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDownloadUrl"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDownloadUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a temporary URL to download a file.</p>
     * 
     * @param request CreateDownloadUrlRequest
     * @return CreateDownloadUrlResponse
     */
    public CreateDownloadUrlResponse createDownloadUrl(CreateDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDownloadUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Voice Navigator instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            query.put("Concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluServiceParamsJson)) {
            query.put("NluServiceParamsJson", request.nluServiceParamsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionInstanceId)) {
            query.put("UnionInstanceId", request.unionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionSource)) {
            query.put("UnionSource", request.unionSource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Voice Navigator instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a conversation in a debugging environment.</p>
     * 
     * @param request DebugBeginDialogueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DebugBeginDialogueResponse
     */
    public DebugBeginDialogueResponse debugBeginDialogueWithOptions(DebugBeginDialogueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialContext)) {
            query.put("InitialContext", request.initialContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shouldUseSandBox)) {
            query.put("ShouldUseSandBox", request.shouldUseSandBox);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DebugBeginDialogue"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DebugBeginDialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a conversation in a debugging environment.</p>
     * 
     * @param request DebugBeginDialogueRequest
     * @return DebugBeginDialogueResponse
     */
    public DebugBeginDialogueResponse debugBeginDialogue(DebugBeginDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.debugBeginDialogueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Debugs the number collection process.</p>
     * 
     * @param request DebugCollectedNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DebugCollectedNumberResponse
     */
    public DebugCollectedNumberResponse debugCollectedNumberWithOptions(DebugCollectedNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DebugCollectedNumber"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DebugCollectedNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Debugs the number collection process.</p>
     * 
     * @param request DebugCollectedNumberRequest
     * @return DebugCollectedNumberResponse
     */
    public DebugCollectedNumberResponse debugCollectedNumber(DebugCollectedNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.debugCollectedNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends a user utterance to the dialogue engine to debug a conversation flow.</p>
     * 
     * @param request DebugDialogueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DebugDialogueResponse
     */
    public DebugDialogueResponse debugDialogueWithOptions(DebugDialogueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalContext)) {
            query.put("AdditionalContext", request.additionalContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterance)) {
            query.put("Utterance", request.utterance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DebugDialogue"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DebugDialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sends a user utterance to the dialogue engine to debug a conversation flow.</p>
     * 
     * @param request DebugDialogueRequest
     * @return DebugDialogueResponse
     */
    public DebugDialogueResponse debugDialogue(DebugDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.debugDialogueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a navigation instance.</p>
     * 
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a navigation instance.</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a conversation.</p>
     * 
     * @param request DescribeConversationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConversationResponse
     */
    public DescribeConversationResponse describeConversationWithOptions(DescribeConversationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConversation"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a conversation.</p>
     * 
     * @param request DescribeConversationRequest
     * @return DescribeConversationResponse
     */
    public DescribeConversationResponse describeConversation(DescribeConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConversationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the context of a specified conversation.</p>
     * 
     * @param request DescribeConversationContextRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConversationContextResponse
     */
    public DescribeConversationContextResponse describeConversationContextWithOptions(DescribeConversationContextRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConversationContext"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConversationContextResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the context of a specified conversation.</p>
     * 
     * @param request DescribeConversationContextRequest
     * @return DescribeConversationContextResponse
     */
    public DescribeConversationContextResponse describeConversationContext(DescribeConversationContextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConversationContextWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of an export task.</p>
     * 
     * @param request DescribeExportProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExportProgressResponse
     */
    public DescribeExportProgressResponse describeExportProgressWithOptions(DescribeExportProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExportProgress"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExportProgressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of an export task.</p>
     * 
     * @param request DescribeExportProgressRequest
     * @return DescribeExportProgressResponse
     */
    public DescribeExportProgressResponse describeExportProgress(DescribeExportProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExportProgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details for a specified instance.</p>
     * 
     * @param request DescribeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstance"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves details for a specified instance.</p>
     * 
     * @param request DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>View the instance IVR configuration.</p>
     * 
     * @param request DescribeNavigationConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNavigationConfigResponse
     */
    public DescribeNavigationConfigResponse describeNavigationConfigWithOptions(DescribeNavigationConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNavigationConfig"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNavigationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>View the instance IVR configuration.</p>
     * 
     * @param request DescribeNavigationConfigRequest
     * @return DescribeNavigationConfigResponse
     */
    public DescribeNavigationConfigResponse describeNavigationConfig(DescribeNavigationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNavigationConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a conversation recording.</p>
     * 
     * @param request DescribeRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecordingResponse
     */
    public DescribeRecordingResponse describeRecordingWithOptions(DescribeRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecording"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a conversation recording.</p>
     * 
     * @param request DescribeRecordingRequest
     * @return DescribeRecordingResponse
     */
    public DescribeRecordingResponse describeRecording(DescribeRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>View the current instance\&quot;s statistics.</p>
     * 
     * @param request DescribeStatisticalDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStatisticalDataResponse
     */
    public DescribeStatisticalDataResponse describeStatisticalDataWithOptions(DescribeStatisticalDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStatisticalData"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStatisticalDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>View the current instance\&quot;s statistics.</p>
     * 
     * @param request DescribeStatisticalDataRequest
     * @return DescribeStatisticalDataResponse
     */
    public DescribeStatisticalDataResponse describeStatisticalData(DescribeStatisticalDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStatisticalDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the TTS configuration.</p>
     * 
     * @param request DescribeTTSConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTTSConfigResponse
     */
    public DescribeTTSConfigResponse describeTTSConfigWithOptions(DescribeTTSConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTTSConfig"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTTSConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the TTS configuration.</p>
     * 
     * @param request DescribeTTSConfigRequest
     * @return DescribeTTSConfigResponse
     */
    public DescribeTTSConfigResponse describeTTSConfig(DescribeTTSConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTTSConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Use this API to continue a conversation with an intelligent assistant by processing a user\&quot;s utterance.</p>
     * 
     * @param request DialogueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DialogueResponse
     */
    public DialogueResponse dialogueWithOptions(DialogueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalContext)) {
            query.put("AdditionalContext", request.additionalContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calledNumber)) {
            query.put("CalledNumber", request.calledNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emotion)) {
            query.put("Emotion", request.emotion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            query.put("InstanceOwnerId", request.instanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterance)) {
            query.put("Utterance", request.utterance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Dialogue"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Use this API to continue a conversation with an intelligent assistant by processing a user\&quot;s utterance.</p>
     * 
     * @param request DialogueRequest
     * @return DialogueResponse
     */
    public DialogueResponse dialogue(DialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dialogueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a Voice Navigator instance.</p>
     * 
     * @param request DisableInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableInstanceResponse
     */
    public DisableInstanceResponse disableInstanceWithOptions(DisableInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableInstance"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a Voice Navigator instance.</p>
     * 
     * @param request DisableInstanceRequest
     * @return DisableInstanceResponse
     */
    public DisableInstanceResponse disableInstance(DisableInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a Voice Navigator instance.</p>
     * 
     * @param request EnableInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableInstanceResponse
     */
    public EnableInstanceResponse enableInstanceWithOptions(EnableInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableInstance"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a Voice Navigator instance.</p>
     * 
     * @param request EnableInstanceRequest
     * @return EnableInstanceResponse
     */
    public EnableInstanceResponse enableInstance(EnableInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Ends an ongoing dialogue.</p>
     * 
     * @param request EndDialogueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EndDialogueResponse
     */
    public EndDialogueResponse endDialogueWithOptions(EndDialogueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hangUpParams)) {
            query.put("HangUpParams", request.hangUpParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            query.put("InstanceOwnerId", request.instanceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EndDialogue"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EndDialogueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Ends an ongoing dialogue.</p>
     * 
     * @param request EndDialogueRequest
     * @return EndDialogueResponse
     */
    public EndDialogueResponse endDialogue(EndDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.endDialogueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports conversation details.</p>
     * 
     * @param request ExportConversationDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportConversationDetailsResponse
     */
    public ExportConversationDetailsResponse exportConversationDetailsWithOptions(ExportConversationDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTimeLeftRange)) {
            query.put("BeginTimeLeftRange", request.beginTimeLeftRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTimeRightRange)) {
            query.put("BeginTimeRightRange", request.beginTimeRightRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callingNumber)) {
            query.put("CallingNumber", request.callingNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.debugConversation)) {
            query.put("DebugConversation", request.debugConversation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            query.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.result)) {
            query.put("Result", request.result);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roundsLeftRange)) {
            query.put("RoundsLeftRange", request.roundsLeftRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roundsRightRange)) {
            query.put("RoundsRightRange", request.roundsRightRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportConversationDetails"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportConversationDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports conversation details.</p>
     * 
     * @param request ExportConversationDetailsRequest
     * @return ExportConversationDetailsResponse
     */
    public ExportConversationDetailsResponse exportConversationDetails(ExportConversationDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportConversationDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports statistical data.</p>
     * 
     * @param request ExportStatisticalDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportStatisticalDataResponse
     */
    public ExportStatisticalDataResponse exportStatisticalDataWithOptions(ExportStatisticalDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTimeLeftRange)) {
            query.put("BeginTimeLeftRange", request.beginTimeLeftRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTimeRightRange)) {
            query.put("BeginTimeRightRange", request.beginTimeRightRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportType)) {
            query.put("ExportType", request.exportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeUnit)) {
            query.put("TimeUnit", request.timeUnit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportStatisticalData"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportStatisticalDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports statistical data.</p>
     * 
     * @param request ExportStatisticalDataRequest
     * @return ExportStatisticalDataResponse
     */
    public ExportStatisticalDataResponse exportStatisticalData(ExportStatisticalDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportStatisticalDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the ASR configuration.</p>
     * 
     * @param request GetAsrConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsrConfigResponse
     */
    public GetAsrConfigResponse getAsrConfigWithOptions(GetAsrConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configLevel)) {
            query.put("ConfigLevel", request.configLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsrConfig"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsrConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the ASR configuration.</p>
     * 
     * @param request GetAsrConfigRequest
     * @return GetAsrConfigResponse
     */
    public GetAsrConfigResponse getAsrConfig(GetAsrConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsrConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the real-time concurrency of an instance.</p>
     * 
     * @param request GetRealTimeConcurrencyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRealTimeConcurrencyResponse
     */
    public GetRealTimeConcurrencyResponse getRealTimeConcurrencyWithOptions(GetRealTimeConcurrencyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealTimeConcurrency"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealTimeConcurrencyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the real-time concurrency of an instance.</p>
     * 
     * @param request GetRealTimeConcurrencyRequest
     * @return GetRealTimeConcurrencyResponse
     */
    public GetRealTimeConcurrencyResponse getRealTimeConcurrency(GetRealTimeConcurrencyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealTimeConcurrencyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of chatbot instances.</p>
     * 
     * @param request ListChatbotInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatbotInstancesResponse
     */
    public ListChatbotInstancesResponse listChatbotInstancesWithOptions(ListChatbotInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatbotInstances"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatbotInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of chatbot instances.</p>
     * 
     * @param request ListChatbotInstancesRequest
     * @return ListChatbotInstancesResponse
     */
    public ListChatbotInstancesResponse listChatbotInstances(ListChatbotInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatbotInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the conversation details for a specific conversation.</p>
     * 
     * @param request ListConversationDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConversationDetailsResponse
     */
    public ListConversationDetailsResponse listConversationDetailsWithOptions(ListConversationDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConversationDetails"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConversationDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the conversation details for a specific conversation.</p>
     * 
     * @param request ListConversationDetailsRequest
     * @return ListConversationDetailsResponse
     */
    public ListConversationDetailsResponse listConversationDetails(ListConversationDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConversationDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns the session list.</p>
     * 
     * @param request ListConversationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConversationsResponse
     */
    public ListConversationsResponse listConversationsWithOptions(ListConversationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConversations"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConversationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns the session list.</p>
     * 
     * @param request ListConversationsRequest
     * @return ListConversationsResponse
     */
    public ListConversationsResponse listConversations(ListConversationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConversationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Download list</p>
     * 
     * @param request ListDownloadTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDownloadTasksResponse
     */
    public ListDownloadTasksResponse listDownloadTasksWithOptions(ListDownloadTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownloadTasks"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDownloadTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Download list</p>
     * 
     * @param request ListDownloadTasksRequest
     * @return ListDownloadTasksResponse
     */
    public ListDownloadTasksResponse listDownloadTasks(ListDownloadTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDownloadTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of intelligent navigation instances for the current tenant.</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of intelligent navigation instances for the current tenant.</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an ASR configuration.</p>
     * 
     * @param request ModifyAsrConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAsrConfigResponse
     */
    public ModifyAsrConfigResponse modifyAsrConfigWithOptions(ModifyAsrConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrAcousticModelId)) {
            query.put("AsrAcousticModelId", request.asrAcousticModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrClassVocabularyId)) {
            query.put("AsrClassVocabularyId", request.asrClassVocabularyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrCustomizationId)) {
            query.put("AsrCustomizationId", request.asrCustomizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrOverrides)) {
            query.put("AsrOverrides", request.asrOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrVocabularyId)) {
            query.put("AsrVocabularyId", request.asrVocabularyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configLevel)) {
            query.put("ConfigLevel", request.configLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entryId)) {
            query.put("EntryId", request.entryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsServiceType)) {
            query.put("NlsServiceType", request.nlsServiceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAsrConfig"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAsrConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an ASR configuration.</p>
     * 
     * @param request ModifyAsrConfigRequest
     * @return ModifyAsrConfigResponse
     */
    public ModifyAsrConfigResponse modifyAsrConfig(ModifyAsrConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAsrConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the greeting configuration.</p>
     * 
     * @param request ModifyGreetingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGreetingConfigResponse
     */
    public ModifyGreetingConfigResponse modifyGreetingConfigWithOptions(ModifyGreetingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.greetingWords)) {
            query.put("GreetingWords", request.greetingWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentTrigger)) {
            query.put("IntentTrigger", request.intentTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGreetingConfig"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGreetingConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the greeting configuration.</p>
     * 
     * @param request ModifyGreetingConfigRequest
     * @return ModifyGreetingConfigResponse
     */
    public ModifyGreetingConfigResponse modifyGreetingConfig(ModifyGreetingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGreetingConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify an instance.</p>
     * 
     * @param request ModifyInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            query.put("Concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstance"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify an instance.</p>
     * 
     * @param request ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the silence timeout configuration for a voice bot instance.</p>
     * 
     * @param request ModifySilenceTimeoutConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySilenceTimeoutConfigResponse
     */
    public ModifySilenceTimeoutConfigResponse modifySilenceTimeoutConfigWithOptions(ModifySilenceTimeoutConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.finalAction)) {
            query.put("FinalAction", request.finalAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finalActionParams)) {
            query.put("FinalActionParams", request.finalActionParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finalPrompt)) {
            query.put("FinalPrompt", request.finalPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intentTrigger)) {
            query.put("IntentTrigger", request.intentTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySilenceTimeoutConfig"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySilenceTimeoutConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the silence timeout configuration for a voice bot instance.</p>
     * 
     * @param request ModifySilenceTimeoutConfigRequest
     * @return ModifySilenceTimeoutConfigResponse
     */
    public ModifySilenceTimeoutConfigResponse modifySilenceTimeoutConfig(ModifySilenceTimeoutConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySilenceTimeoutConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the TTS configuration.</p>
     * 
     * @param request ModifyTTSConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTTSConfigResponse
     */
    public ModifyTTSConfigResponse modifyTTSConfigWithOptions(ModifyTTSConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliCustomizedVoice)) {
            query.put("AliCustomizedVoice", request.aliCustomizedVoice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineXunfei)) {
            query.put("EngineXunfei", request.engineXunfei);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extParams)) {
            query.put("ExtParams", request.extParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsServiceType)) {
            query.put("NlsServiceType", request.nlsServiceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pitchRate)) {
            query.put("PitchRate", request.pitchRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            query.put("SpeechRate", request.speechRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsOverrides)) {
            query.put("TtsOverrides", request.ttsOverrides);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            query.put("Voice", request.voice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            query.put("Volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTTSConfig"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTTSConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the TTS configuration.</p>
     * 
     * @param request ModifyTTSConfigRequest
     * @return ModifyTTSConfigResponse
     */
    public ModifyTTSConfigResponse modifyTTSConfig(ModifyTTSConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTTSConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the rejection configuration.</p>
     * 
     * @param request ModifyUnrecognizingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUnrecognizingConfigResponse
     */
    public ModifyUnrecognizingConfigResponse modifyUnrecognizingConfigWithOptions(ModifyUnrecognizingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.finalAction)) {
            query.put("FinalAction", request.finalAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finalActionParams)) {
            query.put("FinalActionParams", request.finalActionParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finalPrompt)) {
            query.put("FinalPrompt", request.finalPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUnrecognizingConfig"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUnrecognizingConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the rejection configuration.</p>
     * 
     * @param request ModifyUnrecognizingConfigRequest
     * @return ModifyUnrecognizingConfigResponse
     */
    public ModifyUnrecognizingConfigResponse modifyUnrecognizingConfig(ModifyUnrecognizingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUnrecognizingConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of conversation records.</p>
     * 
     * @param request QueryConversationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConversationsResponse
     */
    public QueryConversationsResponse queryConversationsWithOptions(QueryConversationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryConversations"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConversationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of conversation records.</p>
     * 
     * @param request QueryConversationsRequest
     * @return QueryConversationsResponse
     */
    public QueryConversationsResponse queryConversations(QueryConversationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryConversationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Saves a recording.</p>
     * 
     * @param request SaveRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveRecordingResponse
     */
    public SaveRecordingResponse saveRecordingWithOptions(SaveRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            query.put("InstanceOwnerId", request.instanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceSliceRecordingList)) {
            query.put("VoiceSliceRecordingList", request.voiceSliceRecordingList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveRecording"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveRecordingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Saves a recording.</p>
     * 
     * @param request SaveRecordingRequest
     * @return SaveRecordingResponse
     */
    public SaveRecordingResponse saveRecording(SaveRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveRecordingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Handles the silence timeout event in a conversation.</p>
     * 
     * @param request SilenceTimeoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SilenceTimeoutResponse
     */
    public SilenceTimeoutResponse silenceTimeoutWithOptions(SilenceTimeoutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialContext)) {
            query.put("InitialContext", request.initialContext);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            query.put("InstanceOwnerId", request.instanceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SilenceTimeout"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SilenceTimeoutResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Handles the silence timeout event in a conversation.</p>
     * 
     * @param request SilenceTimeoutRequest
     * @return SilenceTimeoutResponse
     */
    public SilenceTimeoutResponse silenceTimeout(SilenceTimeoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.silenceTimeoutWithOptions(request, runtime);
    }
}
