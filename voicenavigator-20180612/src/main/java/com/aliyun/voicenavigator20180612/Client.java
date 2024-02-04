// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612;

import com.aliyun.tea.*;
import com.aliyun.voicenavigator20180612.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
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

    public AssociateChatbotInstanceResponse associateChatbotInstance(AssociateChatbotInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateChatbotInstanceWithOptions(request, runtime);
    }

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

    public AuditTTSVoiceResponse auditTTSVoice(AuditTTSVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.auditTTSVoiceWithOptions(request, runtime);
    }

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

    public BeginDialogueResponse beginDialogue(BeginDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.beginDialogueWithOptions(request, runtime);
    }

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

    public CollectedNumberResponse collectedNumber(CollectedNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.collectedNumberWithOptions(request, runtime);
    }

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

    public CreateDownloadUrlResponse createDownloadUrl(CreateDownloadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDownloadUrlWithOptions(request, runtime);
    }

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

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

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

    public DebugBeginDialogueResponse debugBeginDialogue(DebugBeginDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.debugBeginDialogueWithOptions(request, runtime);
    }

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

    public DebugCollectedNumberResponse debugCollectedNumber(DebugCollectedNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.debugCollectedNumberWithOptions(request, runtime);
    }

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

    public DebugDialogueResponse debugDialogue(DebugDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.debugDialogueWithOptions(request, runtime);
    }

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

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

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

    public DescribeConversationResponse describeConversation(DescribeConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConversationWithOptions(request, runtime);
    }

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

    public DescribeConversationContextResponse describeConversationContext(DescribeConversationContextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConversationContextWithOptions(request, runtime);
    }

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

    public DescribeExportProgressResponse describeExportProgress(DescribeExportProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExportProgressWithOptions(request, runtime);
    }

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

    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

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

    public DescribeNavigationConfigResponse describeNavigationConfig(DescribeNavigationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNavigationConfigWithOptions(request, runtime);
    }

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

    public DescribeRecordingResponse describeRecording(DescribeRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordingWithOptions(request, runtime);
    }

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

    public DescribeStatisticalDataResponse describeStatisticalData(DescribeStatisticalDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStatisticalDataWithOptions(request, runtime);
    }

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

    public DescribeTTSConfigResponse describeTTSConfig(DescribeTTSConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTTSConfigWithOptions(request, runtime);
    }

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

    public DialogueResponse dialogue(DialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dialogueWithOptions(request, runtime);
    }

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

    public DisableInstanceResponse disableInstance(DisableInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableInstanceWithOptions(request, runtime);
    }

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

    public EnableInstanceResponse enableInstance(EnableInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInstanceWithOptions(request, runtime);
    }

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

    public EndDialogueResponse endDialogue(EndDialogueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.endDialogueWithOptions(request, runtime);
    }

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

    public ExportConversationDetailsResponse exportConversationDetails(ExportConversationDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportConversationDetailsWithOptions(request, runtime);
    }

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

    public ExportStatisticalDataResponse exportStatisticalData(ExportStatisticalDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportStatisticalDataWithOptions(request, runtime);
    }

    public GenerateUploadUrlResponse generateUploadUrlWithOptions(GenerateUploadUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callerBid)) {
            body.put("CallerBid", request.callerBid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerIp)) {
            body.put("CallerIp", request.callerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerParentId)) {
            body.put("CallerParentId", request.callerParentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerType)) {
            body.put("CallerType", request.callerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerUid)) {
            body.put("CallerUid", request.callerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environment)) {
            body.put("Environment", request.environment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceOwnerId)) {
            body.put("InstanceOwnerId", request.instanceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mfaPresent)) {
            body.put("MfaPresent", request.mfaPresent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyOriginalSecurityTransport)) {
            body.put("ProxyOriginalSecurityTransport", request.proxyOriginalSecurityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyOriginalSourceIp)) {
            body.put("ProxyOriginalSourceIp", request.proxyOriginalSourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyTrustTransportInfo)) {
            body.put("ProxyTrustTransportInfo", request.proxyTrustTransportInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityTransport)) {
            body.put("SecurityTransport", request.securityTransport);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantName)) {
            body.put("TenantName", request.tenantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.xspaceServicerId)) {
            body.put("XspaceServicerId", request.xspaceServicerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.xspaceTenantBuId)) {
            body.put("XspaceTenantBuId", request.xspaceTenantBuId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateUploadUrl"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateUploadUrlResponse());
    }

    public GenerateUploadUrlResponse generateUploadUrl(GenerateUploadUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUploadUrlWithOptions(request, runtime);
    }

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

    public GetAsrConfigResponse getAsrConfig(GetAsrConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAsrConfigWithOptions(request, runtime);
    }

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

    public GetRealTimeConcurrencyResponse getRealTimeConcurrency(GetRealTimeConcurrencyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealTimeConcurrencyWithOptions(request, runtime);
    }

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

    public ListChatbotInstancesResponse listChatbotInstances(ListChatbotInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listChatbotInstancesWithOptions(request, runtime);
    }

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

    public ListConversationDetailsResponse listConversationDetails(ListConversationDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConversationDetailsWithOptions(request, runtime);
    }

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

    public ListConversationsResponse listConversations(ListConversationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConversationsWithOptions(request, runtime);
    }

    public ListDownloadTasksResponse listDownloadTasksWithOptions(ListDownloadTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDownloadTasks"),
            new TeaPair("version", "2018-06-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDownloadTasksResponse());
    }

    public ListDownloadTasksResponse listDownloadTasks(ListDownloadTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDownloadTasksWithOptions(request, runtime);
    }

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

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public ModifyAsrConfigResponse modifyAsrConfigWithOptions(ModifyAsrConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asrAcousticModelId)) {
            query.put("AsrAcousticModelId", request.asrAcousticModelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrClassVocabularyId)) {
            query.put("AsrClassVocabularyId", request.asrClassVocabularyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrCustomizationId)) {
            query.put("AsrCustomizationId", request.asrCustomizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrVocabularyId)) {
            query.put("AsrVocabularyId", request.asrVocabularyId);
        }

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

    public ModifyAsrConfigResponse modifyAsrConfig(ModifyAsrConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAsrConfigWithOptions(request, runtime);
    }

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

    public ModifyGreetingConfigResponse modifyGreetingConfig(ModifyGreetingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGreetingConfigWithOptions(request, runtime);
    }

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

    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

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

    public ModifySilenceTimeoutConfigResponse modifySilenceTimeoutConfig(ModifySilenceTimeoutConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySilenceTimeoutConfigWithOptions(request, runtime);
    }

    public ModifyTTSConfigResponse modifyTTSConfigWithOptions(ModifyTTSConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("AppKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineXunfei)) {
            query.put("EngineXunfei", request.engineXunfei);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsServiceType)) {
            query.put("NlsServiceType", request.nlsServiceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            query.put("SpeechRate", request.speechRate);
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

    public ModifyTTSConfigResponse modifyTTSConfig(ModifyTTSConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTTSConfigWithOptions(request, runtime);
    }

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

    public ModifyUnrecognizingConfigResponse modifyUnrecognizingConfig(ModifyUnrecognizingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUnrecognizingConfigWithOptions(request, runtime);
    }

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

    public QueryConversationsResponse queryConversations(QueryConversationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryConversationsWithOptions(request, runtime);
    }

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

    public SaveRecordingResponse saveRecording(SaveRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveRecordingWithOptions(request, runtime);
    }

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

    public SilenceTimeoutResponse silenceTimeout(SilenceTimeoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.silenceTimeoutWithOptions(request, runtime);
    }
}
