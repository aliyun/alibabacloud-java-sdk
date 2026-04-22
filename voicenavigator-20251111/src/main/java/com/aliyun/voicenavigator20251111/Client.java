// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20251111;

import com.aliyun.tea.*;
import com.aliyun.voicenavigator20251111.models.*;

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

    /**
     * <b>summary</b> : 
     * <p>开启会话</p>
     * 
     * @param request BeginSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BeginSessionResponse
     */
    public BeginSessionResponse beginSessionWithOptions(BeginSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.draftVersion)) {
            query.put("DraftVersion", request.draftVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorParams)) {
            query.put("VendorParams", request.vendorParams);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BeginSession"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BeginSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启会话</p>
     * 
     * @param request BeginSessionRequest
     * @return BeginSessionResponse
     */
    public BeginSessionResponse beginSession(BeginSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.beginSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发起呼叫</p>
     * 
     * @param request BridgeWebCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BridgeWebCallResponse
     */
    public BridgeWebCallResponse bridgeWebCallWithOptions(BridgeWebCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessChannelId)) {
            query.put("AccessChannelId", request.accessChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessChannelType)) {
            query.put("AccessChannelType", request.accessChannelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.draftVersion)) {
            query.put("DraftVersion", request.draftVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleRate)) {
            query.put("SampleRate", request.sampleRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeoutSeconds)) {
            query.put("TimeoutSeconds", request.timeoutSeconds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BridgeWebCall"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BridgeWebCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发起呼叫</p>
     * 
     * @param request BridgeWebCallRequest
     * @return BridgeWebCallResponse
     */
    public BridgeWebCallResponse bridgeWebCall(BridgeWebCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bridgeWebCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务提供商</p>
     * 
     * @param request CreateCallCenterProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCallCenterProviderResponse
     */
    public CreateCallCenterProviderResponse createCallCenterProviderWithOptions(CreateCallCenterProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            body.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extras)) {
            body.put("Extras", request.extras);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originator)) {
            body.put("Originator", request.originator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerType)) {
            body.put("ProviderType", request.providerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referTo)) {
            body.put("ReferTo", request.referTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trunkId)) {
            body.put("TrunkId", request.trunkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCallCenterProvider"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCallCenterProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建服务提供商</p>
     * 
     * @param request CreateCallCenterProviderRequest
     * @return CreateCallCenterProviderResponse
     */
    public CreateCallCenterProviderResponse createCallCenterProvider(CreateCallCenterProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCallCenterProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例</p>
     * 
     * @param request CreateCloneVoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloneVoiceResponse
     */
    public CreateCloneVoiceResponse createCloneVoiceWithOptions(CreateCloneVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileKey)) {
            body.put("FileKey", request.fileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloneVoice"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloneVoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例</p>
     * 
     * @param request CreateCloneVoiceRequest
     * @return CreateCloneVoiceResponse
     */
    public CreateCloneVoiceResponse createCloneVoice(CreateCloneVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloneVoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建指令</p>
     * 
     * @param request CreateInstructionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstructionResponse
     */
    public CreateInstructionResponse createInstructionWithOptions(CreateInstructionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstruction"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstructionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建指令</p>
     * 
     * @param request CreateInstructionRequest
     * @return CreateInstructionResponse
     */
    public CreateInstructionResponse createInstruction(CreateInstructionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstructionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建语言模型配置信息</p>
     * 
     * @param tmpReq CreateLlmAccessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLlmAccessProfileResponse
     */
    public CreateLlmAccessProfileResponse createLlmAccessProfileWithOptions(CreateLlmAccessProfileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLlmAccessProfileShrinkRequest request = new CreateLlmAccessProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.profile)) {
            request.profileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.profile, "Profile", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileShrink)) {
            body.put("Profile", request.profileShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLlmAccessProfile"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLlmAccessProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建语言模型配置信息</p>
     * 
     * @param request CreateLlmAccessProfileRequest
     * @return CreateLlmAccessProfileResponse
     */
    public CreateLlmAccessProfileResponse createLlmAccessProfile(CreateLlmAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLlmAccessProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例</p>
     * 
     * @param request CreateScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScriptWithOptions(CreateScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            body.put("Concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nluEngine)) {
            body.put("NluEngine", request.nluEngine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScript"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例</p>
     * 
     * @param request CreateScriptRequest
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScript(CreateScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建场景配置</p>
     * 
     * @param tmpReq CreateScriptVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScriptVersionResponse
     */
    public CreateScriptVersionResponse createScriptVersionWithOptions(CreateScriptVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScriptVersionShrinkRequest request = new CreateScriptVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.interactionConfig)) {
            request.interactionConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.interactionConfig, "InteractionConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelConfig)) {
            request.labelConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelConfig, "LabelConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scriptProfile)) {
            request.scriptProfileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scriptProfile, "ScriptProfile", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.synthesizerConfig)) {
            request.synthesizerConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.synthesizerConfig, "SynthesizerConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transcriberConfig)) {
            request.transcriberConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transcriberConfig, "TranscriberConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interactionConfigShrink)) {
            body.put("InteractionConfig", request.interactionConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelConfigShrink)) {
            body.put("LabelConfig", request.labelConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptProfileShrink)) {
            body.put("ScriptProfile", request.scriptProfileShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceVersionId)) {
            body.put("SourceVersionId", request.sourceVersionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synthesizerConfigShrink)) {
            body.put("SynthesizerConfig", request.synthesizerConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcriberConfigShrink)) {
            body.put("TranscriberConfig", request.transcriberConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScriptVersion"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScriptVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建场景配置</p>
     * 
     * @param request CreateScriptVersionRequest
     * @return CreateScriptVersionResponse
     */
    public CreateScriptVersionResponse createScriptVersion(CreateScriptVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScriptVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建变量</p>
     * 
     * @param request CreateVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVariableResponse
     */
    public CreateVariableResponse createVariableWithOptions(CreateVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVariable"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建变量</p>
     * 
     * @param request CreateVariableRequest
     * @return CreateVariableResponse
     */
    public CreateVariableResponse createVariable(CreateVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例</p>
     * 
     * @param tmpReq CreateVocabularyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVocabularyResponse
     */
    public CreateVocabularyResponse createVocabularyWithOptions(CreateVocabularyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateVocabularyShrinkRequest request = new CreateVocabularyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.words)) {
            request.wordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.words, "Words", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wordsShrink)) {
            body.put("Words", request.wordsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVocabulary"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVocabularyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例</p>
     * 
     * @param request CreateVocabularyRequest
     * @return CreateVocabularyResponse
     */
    public CreateVocabularyResponse createVocabulary(CreateVocabularyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVocabularyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例</p>
     * 
     * @param tmpReq CreateVoiceAccessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVoiceAccessProfileResponse
     */
    public CreateVoiceAccessProfileResponse createVoiceAccessProfileWithOptions(CreateVoiceAccessProfileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateVoiceAccessProfileShrinkRequest request = new CreateVoiceAccessProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.profile)) {
            request.profileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.profile, "Profile", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsEngine)) {
            body.put("NlsEngine", request.nlsEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileShrink)) {
            body.put("Profile", request.profileShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVoiceAccessProfile"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVoiceAccessProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建实例</p>
     * 
     * @param request CreateVoiceAccessProfileRequest
     * @return CreateVoiceAccessProfileResponse
     */
    public CreateVoiceAccessProfileResponse createVoiceAccessProfile(CreateVoiceAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVoiceAccessProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务提供商</p>
     * 
     * @param request DeleteCallCenterProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCallCenterProviderResponse
     */
    public DeleteCallCenterProviderResponse deleteCallCenterProviderWithOptions(DeleteCallCenterProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerId)) {
            body.put("ProviderId", request.providerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCallCenterProvider"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCallCenterProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除服务提供商</p>
     * 
     * @param request DeleteCallCenterProviderRequest
     * @return DeleteCallCenterProviderResponse
     */
    public DeleteCallCenterProviderResponse deleteCallCenterProvider(DeleteCallCenterProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCallCenterProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景</p>
     * 
     * @param request DeleteCloneVoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloneVoiceResponse
     */
    public DeleteCloneVoiceResponse deleteCloneVoiceWithOptions(DeleteCloneVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloneVoiceId)) {
            body.put("CloneVoiceId", request.cloneVoiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloneVoice"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloneVoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景</p>
     * 
     * @param request DeleteCloneVoiceRequest
     * @return DeleteCloneVoiceResponse
     */
    public DeleteCloneVoiceResponse deleteCloneVoice(DeleteCloneVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloneVoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指令</p>
     * 
     * @param request DeleteInstructionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstructionResponse
     */
    public DeleteInstructionResponse deleteInstructionWithOptions(DeleteInstructionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstruction"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstructionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指令</p>
     * 
     * @param request DeleteInstructionRequest
     * @return DeleteInstructionResponse
     */
    public DeleteInstructionResponse deleteInstruction(DeleteInstructionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstructionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除语言模型配置信息</p>
     * 
     * @param request DeleteLlmAccessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLlmAccessProfileResponse
     */
    public DeleteLlmAccessProfileResponse deleteLlmAccessProfileWithOptions(DeleteLlmAccessProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessProfileId)) {
            body.put("AccessProfileId", request.accessProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLlmAccessProfile"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLlmAccessProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除语言模型配置信息</p>
     * 
     * @param request DeleteLlmAccessProfileRequest
     * @return DeleteLlmAccessProfileResponse
     */
    public DeleteLlmAccessProfileResponse deleteLlmAccessProfile(DeleteLlmAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLlmAccessProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景</p>
     * 
     * @param request DeleteScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScriptWithOptions(DeleteScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScript"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景</p>
     * 
     * @param request DeleteScriptRequest
     * @return DeleteScriptResponse
     */
    public DeleteScriptResponse deleteScript(DeleteScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除变量</p>
     * 
     * @param request DeleteVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVariableResponse
     */
    public DeleteVariableResponse deleteVariableWithOptions(DeleteVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableId)) {
            body.put("VariableId", request.variableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVariable"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除变量</p>
     * 
     * @param request DeleteVariableRequest
     * @return DeleteVariableResponse
     */
    public DeleteVariableResponse deleteVariable(DeleteVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景</p>
     * 
     * @param request DeleteVocabularyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVocabularyResponse
     */
    public DeleteVocabularyResponse deleteVocabularyWithOptions(DeleteVocabularyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vocabularyId)) {
            body.put("VocabularyId", request.vocabularyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVocabulary"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVocabularyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景</p>
     * 
     * @param request DeleteVocabularyRequest
     * @return DeleteVocabularyResponse
     */
    public DeleteVocabularyResponse deleteVocabulary(DeleteVocabularyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVocabularyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景</p>
     * 
     * @param request DeleteVoiceAccessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVoiceAccessProfileResponse
     */
    public DeleteVoiceAccessProfileResponse deleteVoiceAccessProfileWithOptions(DeleteVoiceAccessProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessProfileId)) {
            body.put("AccessProfileId", request.accessProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVoiceAccessProfile"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVoiceAccessProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除场景</p>
     * 
     * @param request DeleteVoiceAccessProfileRequest
     * @return DeleteVoiceAccessProfileResponse
     */
    public DeleteVoiceAccessProfileResponse deleteVoiceAccessProfile(DeleteVoiceAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVoiceAccessProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启会话</p>
     * 
     * @param request DialogueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DialogueResponse
     */
    public DialogueResponse dialogueWithOptions(DialogueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extras)) {
            query.put("Extras", request.extras);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterance)) {
            query.put("Utterance", request.utterance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Dialogue"),
            new TeaPair("version", "2025-11-11"),
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
     * <p>开启会话</p>
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
     * <p>禁用消息订阅</p>
     * 
     * @param request DisableSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableSubscriptionResponse
     */
    public DisableSubscriptionResponse disableSubscriptionWithOptions(DisableSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableSubscription"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用消息订阅</p>
     * 
     * @param request DisableSubscriptionRequest
     * @return DisableSubscriptionResponse
     */
    public DisableSubscriptionResponse disableSubscription(DisableSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSubscriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>结束会话</p>
     * 
     * @param request EndSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EndSessionResponse
     */
    public EndSessionResponse endSessionWithOptions(EndSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            query.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EndSession"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EndSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>结束会话</p>
     * 
     * @param request EndSessionRequest
     * @return EndSessionResponse
     */
    public EndSessionResponse endSession(EndSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.endSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ExportScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportScriptResponse
     */
    public ExportScriptResponse exportScriptWithOptions(ExportScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportScript"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ExportScriptRequest
     * @return ExportScriptResponse
     */
    public ExportScriptResponse exportScript(ExportScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出热词</p>
     * 
     * @param tmpReq ExportVocabularyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportVocabularyResponse
     */
    public ExportVocabularyResponse exportVocabularyWithOptions(ExportVocabularyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExportVocabularyShrinkRequest request = new ExportVocabularyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vocabularyIds)) {
            request.vocabularyIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vocabularyIds, "VocabularyIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vocabularyIdsShrink)) {
            body.put("VocabularyIds", request.vocabularyIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportVocabulary"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportVocabularyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出热词</p>
     * 
     * @param request ExportVocabularyRequest
     * @return ExportVocabularyResponse
     */
    public ExportVocabularyResponse exportVocabulary(ExportVocabularyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportVocabularyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request GenerateFileUploadParamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateFileUploadParamsResponse
     */
    public GenerateFileUploadParamsResponse generateFileUploadParamsWithOptions(GenerateFileUploadParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            body.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateFileUploadParams"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateFileUploadParamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request GenerateFileUploadParamsRequest
     * @return GenerateFileUploadParamsResponse
     */
    public GenerateFileUploadParamsResponse generateFileUploadParams(GenerateFileUploadParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateFileUploadParamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取通话详情</p>
     * 
     * @param request GetCallDetailRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCallDetailRecordResponse
     */
    public GetCallDetailRecordResponse getCallDetailRecordWithOptions(GetCallDetailRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCallDetailRecord"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCallDetailRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取通话详情</p>
     * 
     * @param request GetCallDetailRecordRequest
     * @return GetCallDetailRecordResponse
     */
    public GetCallDetailRecordResponse getCallDetailRecord(GetCallDetailRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCallDetailRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取语音对话参数</p>
     * 
     * @param request GetDataChannelCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataChannelCredentialResponse
     */
    public GetDataChannelCredentialResponse getDataChannelCredentialWithOptions(GetDataChannelCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceId)) {
            query.put("DeviceId", request.deviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataChannelCredential"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataChannelCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取语音对话参数</p>
     * 
     * @param request GetDataChannelCredentialRequest
     * @return GetDataChannelCredentialResponse
     */
    public GetDataChannelCredentialResponse getDataChannelCredential(GetDataChannelCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataChannelCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例指标趋势详情</p>
     * 
     * @param request GetInstanceTrendingReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceTrendingReportResponse
     */
    public GetInstanceTrendingReportResponse getInstanceTrendingReportWithOptions(GetInstanceTrendingReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeInterval)) {
            body.put("TimeInterval", request.timeInterval);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceTrendingReport"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceTrendingReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例指标趋势详情</p>
     * 
     * @param request GetInstanceTrendingReportRequest
     * @return GetInstanceTrendingReportResponse
     */
    public GetInstanceTrendingReportResponse getInstanceTrendingReport(GetInstanceTrendingReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceTrendingReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例实时指标</p>
     * 
     * @param request GetRealtimeInstanceStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRealtimeInstanceStatsResponse
     */
    public GetRealtimeInstanceStatsResponse getRealtimeInstanceStatsWithOptions(GetRealtimeInstanceStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealtimeInstanceStats"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealtimeInstanceStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例实时指标</p>
     * 
     * @param request GetRealtimeInstanceStatsRequest
     * @return GetRealtimeInstanceStatsResponse
     */
    public GetRealtimeInstanceStatsResponse getRealtimeInstanceStats(GetRealtimeInstanceStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealtimeInstanceStatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景实时指标</p>
     * 
     * @param request GetRealtimeScriptStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRealtimeScriptStatsResponse
     */
    public GetRealtimeScriptStatsResponse getRealtimeScriptStatsWithOptions(GetRealtimeScriptStatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRealtimeScriptStats"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRealtimeScriptStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景实时指标</p>
     * 
     * @param request GetRealtimeScriptStatsRequest
     * @return GetRealtimeScriptStatsResponse
     */
    public GetRealtimeScriptStatsResponse getRealtimeScriptStats(GetRealtimeScriptStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRealtimeScriptStatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取录音</p>
     * 
     * @param request GetRecordingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRecordingResponse
     */
    public GetRecordingResponse getRecordingWithOptions(GetRecordingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRecording"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRecordingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取录音</p>
     * 
     * @param request GetRecordingRequest
     * @return GetRecordingResponse
     */
    public GetRecordingResponse getRecording(GetRecordingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRecordingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request GetScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScriptResponse
     */
    public GetScriptResponse getScriptWithOptions(GetScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScript"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request GetScriptRequest
     * @return GetScriptResponse
     */
    public GetScriptResponse getScript(GetScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景指标趋势详情</p>
     * 
     * @param request GetScriptTrendingReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScriptTrendingReportResponse
     */
    public GetScriptTrendingReportResponse getScriptTrendingReportWithOptions(GetScriptTrendingReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeInterval)) {
            body.put("TimeInterval", request.timeInterval);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScriptTrendingReport"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScriptTrendingReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景指标趋势详情</p>
     * 
     * @param request GetScriptTrendingReportRequest
     * @return GetScriptTrendingReportResponse
     */
    public GetScriptTrendingReportResponse getScriptTrendingReport(GetScriptTrendingReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScriptTrendingReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取MQ配置</p>
     * 
     * @param request GetSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubscriptionResponse
     */
    public GetSubscriptionResponse getSubscriptionWithOptions(GetSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscription"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取MQ配置</p>
     * 
     * @param request GetSubscriptionRequest
     * @return GetSubscriptionResponse
     */
    public GetSubscriptionResponse getSubscription(GetSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubscriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request GetVocabularyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVocabularyResponse
     */
    public GetVocabularyResponse getVocabularyWithOptions(GetVocabularyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vocabularyId)) {
            body.put("VocabularyId", request.vocabularyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVocabulary"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVocabularyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request GetVocabularyRequest
     * @return GetVocabularyResponse
     */
    public GetVocabularyResponse getVocabulary(GetVocabularyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVocabularyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导入热词</p>
     * 
     * @param request ImportVocabularyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportVocabularyResponse
     */
    public ImportVocabularyResponse importVocabularyWithOptions(ImportVocabularyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileKey)) {
            body.put("FileKey", request.fileKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportVocabulary"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportVocabularyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导入热词</p>
     * 
     * @param request ImportVocabularyRequest
     * @return ImportVocabularyResponse
     */
    public ImportVocabularyResponse importVocabulary(ImportVocabularyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importVocabularyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取背景音列表</p>
     * 
     * @param request ListBackgroundMusicsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBackgroundMusicsResponse
     */
    public ListBackgroundMusicsResponse listBackgroundMusicsWithOptions(ListBackgroundMusicsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBackgroundMusics"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBackgroundMusicsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取背景音列表</p>
     * 
     * @param request ListBackgroundMusicsRequest
     * @return ListBackgroundMusicsResponse
     */
    public ListBackgroundMusicsResponse listBackgroundMusics(ListBackgroundMusicsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBackgroundMusicsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务提供商</p>
     * 
     * @param request ListCallCenterProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallCenterProvidersResponse
     */
    public ListCallCenterProvidersResponse listCallCenterProvidersWithOptions(ListCallCenterProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerId)) {
            body.put("ProviderId", request.providerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallCenterProviders"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallCenterProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询服务提供商</p>
     * 
     * @param request ListCallCenterProvidersRequest
     * @return ListCallCenterProvidersResponse
     */
    public ListCallCenterProvidersResponse listCallCenterProviders(ListCallCenterProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallCenterProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param tmpReq ListCallDetailRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCallDetailRecordsResponse
     */
    public ListCallDetailRecordsResponse listCallDetailRecordsWithOptions(ListCallDetailRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCallDetailRecordsShrinkRequest request = new ListCallDetailRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dispositionCodes)) {
            request.dispositionCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dispositionCodes, "DispositionCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dispositionReasons)) {
            request.dispositionReasonsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dispositionReasons, "DispositionReasons", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sessionIds)) {
            request.sessionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sessionIds, "SessionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessChannelId)) {
            query.put("AccessChannelId", request.accessChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessChannelType)) {
            query.put("AccessChannelType", request.accessChannelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.draftVersion)) {
            query.put("DraftVersion", request.draftVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issueResolved)) {
            query.put("IssueResolved", request.issueResolved);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxTalkTurns)) {
            query.put("MaxTalkTurns", request.maxTalkTurns);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minTalkTurns)) {
            query.put("MinTalkTurns", request.minTalkTurns);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callee)) {
            body.put("Callee", request.callee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            body.put("Caller", request.caller);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispositionCodesShrink)) {
            body.put("DispositionCodes", request.dispositionCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispositionReasonsShrink)) {
            body.put("DispositionReasons", request.dispositionReasonsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionIdsShrink)) {
            body.put("SessionIds", request.sessionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCallDetailRecords"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCallDetailRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ListCallDetailRecordsRequest
     * @return ListCallDetailRecordsResponse
     */
    public ListCallDetailRecordsResponse listCallDetailRecords(ListCallDetailRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCallDetailRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ListCloneVoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloneVoiceResponse
     */
    public ListCloneVoiceResponse listCloneVoiceWithOptions(ListCloneVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloneVoice"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloneVoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ListCloneVoiceRequest
     * @return ListCloneVoiceResponse
     */
    public ListCloneVoiceResponse listCloneVoice(ListCloneVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloneVoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取克隆音色可用模型列表</p>
     * 
     * @param request ListCloneVoiceModelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloneVoiceModelsResponse
     */
    public ListCloneVoiceModelsResponse listCloneVoiceModelsWithOptions(ListCloneVoiceModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloneVoiceModels"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloneVoiceModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取克隆音色可用模型列表</p>
     * 
     * @param request ListCloneVoiceModelsRequest
     * @return ListCloneVoiceModelsResponse
     */
    public ListCloneVoiceModelsResponse listCloneVoiceModels(ListCloneVoiceModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloneVoiceModelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例指标汇总数据</p>
     * 
     * @param tmpReq ListHistoricalInstanceReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHistoricalInstanceReportResponse
     */
    public ListHistoricalInstanceReportResponse listHistoricalInstanceReportWithOptions(ListHistoricalInstanceReportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHistoricalInstanceReportShrinkRequest request = new ListHistoricalInstanceReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            body.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHistoricalInstanceReport"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHistoricalInstanceReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例指标汇总数据</p>
     * 
     * @param request ListHistoricalInstanceReportRequest
     * @return ListHistoricalInstanceReportResponse
     */
    public ListHistoricalInstanceReportResponse listHistoricalInstanceReport(ListHistoricalInstanceReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHistoricalInstanceReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景指标汇总数据</p>
     * 
     * @param tmpReq ListHistoricalScriptReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListHistoricalScriptReportResponse
     */
    public ListHistoricalScriptReportResponse listHistoricalScriptReportWithOptions(ListHistoricalScriptReportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHistoricalScriptReportShrinkRequest request = new ListHistoricalScriptReportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scriptIds)) {
            request.scriptIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scriptIds, "ScriptIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptIdsShrink)) {
            body.put("ScriptIds", request.scriptIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHistoricalScriptReport"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHistoricalScriptReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景指标汇总数据</p>
     * 
     * @param request ListHistoricalScriptReportRequest
     * @return ListHistoricalScriptReportResponse
     */
    public ListHistoricalScriptReportResponse listHistoricalScriptReport(ListHistoricalScriptReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHistoricalScriptReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指令</p>
     * 
     * @param request ListInstructionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstructionsResponse
     */
    public ListInstructionsResponse listInstructionsWithOptions(ListInstructionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerId)) {
            body.put("ProviderId", request.providerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstructions"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstructionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指令</p>
     * 
     * @param request ListInstructionsRequest
     * @return ListInstructionsResponse
     */
    public ListInstructionsResponse listInstructions(ListInstructionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstructionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取语言模型配置信息</p>
     * 
     * @param request ListLlmAccessProfilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLlmAccessProfilesResponse
     */
    public ListLlmAccessProfilesResponse listLlmAccessProfilesWithOptions(ListLlmAccessProfilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLlmAccessProfiles"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLlmAccessProfilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取语言模型配置信息</p>
     * 
     * @param request ListLlmAccessProfilesRequest
     * @return ListLlmAccessProfilesResponse
     */
    public ListLlmAccessProfilesResponse listLlmAccessProfiles(ListLlmAccessProfilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLlmAccessProfilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取对话模型列表</p>
     * 
     * @param request ListNluModelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNluModelsResponse
     */
    public ListNluModelsResponse listNluModelsWithOptions(ListNluModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNluModels"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNluModelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取对话模型列表</p>
     * 
     * @param request ListNluModelsRequest
     * @return ListNluModelsResponse
     */
    public ListNluModelsResponse listNluModels(ListNluModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNluModelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例实时指标</p>
     * 
     * @param tmpReq ListRealtimeInstanceStatsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRealtimeInstanceStatsResponse
     */
    public ListRealtimeInstanceStatsResponse listRealtimeInstanceStatsWithOptions(ListRealtimeInstanceStatsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListRealtimeInstanceStatsShrinkRequest request = new ListRealtimeInstanceStatsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            body.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRealtimeInstanceStats"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRealtimeInstanceStatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例实时指标</p>
     * 
     * @param request ListRealtimeInstanceStatsRequest
     * @return ListRealtimeInstanceStatsResponse
     */
    public ListRealtimeInstanceStatsResponse listRealtimeInstanceStats(ListRealtimeInstanceStatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRealtimeInstanceStatsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景配置模板列表</p>
     * 
     * @param request ListScriptProfileTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScriptProfileTemplatesResponse
     */
    public ListScriptProfileTemplatesResponse listScriptProfileTemplatesWithOptions(ListScriptProfileTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScriptProfileTemplates"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScriptProfileTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景配置模板列表</p>
     * 
     * @param request ListScriptProfileTemplatesRequest
     * @return ListScriptProfileTemplatesResponse
     */
    public ListScriptProfileTemplatesResponse listScriptProfileTemplates(ListScriptProfileTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScriptProfileTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param tmpReq ListScriptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScriptsWithOptions(ListScriptsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListScriptsShrinkRequest request = new ListScriptsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scriptIds)) {
            request.scriptIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scriptIds, "ScriptIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            body.put("Number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptIdsShrink)) {
            body.put("ScriptIds", request.scriptIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScripts"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScriptsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ListScriptsRequest
     * @return ListScriptsResponse
     */
    public ListScriptsResponse listScripts(ListScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScriptsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取变量列表</p>
     * 
     * @param request ListVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVariableResponse
     */
    public ListVariableResponse listVariableWithOptions(ListVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchPattern)) {
            body.put("SearchPattern", request.searchPattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVariable"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取变量列表</p>
     * 
     * @param request ListVariableRequest
     * @return ListVariableResponse
     */
    public ListVariableResponse listVariable(ListVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ListVocabularyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVocabularyResponse
     */
    public ListVocabularyResponse listVocabularyWithOptions(ListVocabularyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVocabulary"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVocabularyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ListVocabularyRequest
     * @return ListVocabularyResponse
     */
    public ListVocabularyResponse listVocabulary(ListVocabularyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVocabularyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ListVoiceAccessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVoiceAccessProfileResponse
     */
    public ListVoiceAccessProfileResponse listVoiceAccessProfileWithOptions(ListVoiceAccessProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVoiceAccessProfile"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVoiceAccessProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ListVoiceAccessProfileRequest
     * @return ListVoiceAccessProfileResponse
     */
    public ListVoiceAccessProfileResponse listVoiceAccessProfile(ListVoiceAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVoiceAccessProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取引擎列表</p>
     * 
     * @param request ListVoiceEnginesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVoiceEnginesResponse
     */
    public ListVoiceEnginesResponse listVoiceEnginesWithOptions(ListVoiceEnginesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVoiceEngines"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVoiceEnginesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取引擎列表</p>
     * 
     * @param request ListVoiceEnginesRequest
     * @return ListVoiceEnginesResponse
     */
    public ListVoiceEnginesResponse listVoiceEngines(ListVoiceEnginesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVoiceEnginesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ListVoicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVoicesResponse
     */
    public ListVoicesResponse listVoicesWithOptions(ListVoicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsAccessType)) {
            body.put("NlsAccessType", request.nlsAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsEngine)) {
            body.put("NlsEngine", request.nlsEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVoices"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVoicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例详情</p>
     * 
     * @param request ListVoicesRequest
     * @return ListVoicesResponse
     */
    public ListVoicesResponse listVoices(ListVoicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVoicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>试听</p>
     * 
     * @param tmpReq PreviewVoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewVoiceResponse
     */
    public PreviewVoiceResponse previewVoiceWithOptions(PreviewVoiceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PreviewVoiceShrinkRequest request = new PreviewVoiceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "Params", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsAccessType)) {
            body.put("NlsAccessType", request.nlsAccessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsEngine)) {
            body.put("NlsEngine", request.nlsEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            body.put("Params", request.paramsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            body.put("Voice", request.voice);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewVoice"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewVoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>试听</p>
     * 
     * @param request PreviewVoiceRequest
     * @return PreviewVoiceResponse
     */
    public PreviewVoiceResponse previewVoice(PreviewVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.previewVoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param request PublishScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishScriptResponse
     */
    public PublishScriptResponse publishScriptWithOptions(PublishScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishScript"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param request PublishScriptRequest
     * @return PublishScriptResponse
     */
    public PublishScriptResponse publishScript(PublishScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改服务提供商</p>
     * 
     * @param request UpdateCallCenterProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCallCenterProviderResponse
     */
    public UpdateCallCenterProviderResponse updateCallCenterProviderWithOptions(UpdateCallCenterProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            body.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extras)) {
            body.put("Extras", request.extras);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originator)) {
            body.put("Originator", request.originator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerId)) {
            body.put("ProviderId", request.providerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerType)) {
            body.put("ProviderType", request.providerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referTo)) {
            body.put("ReferTo", request.referTo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trunkId)) {
            body.put("TrunkId", request.trunkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCallCenterProvider"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCallCenterProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改服务提供商</p>
     * 
     * @param request UpdateCallCenterProviderRequest
     * @return UpdateCallCenterProviderResponse
     */
    public UpdateCallCenterProviderResponse updateCallCenterProvider(UpdateCallCenterProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCallCenterProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param request UpdateCloneVoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloneVoiceResponse
     */
    public UpdateCloneVoiceResponse updateCloneVoiceWithOptions(UpdateCloneVoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloneVoiceId)) {
            body.put("CloneVoiceId", request.cloneVoiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloneVoice"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloneVoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param request UpdateCloneVoiceRequest
     * @return UpdateCloneVoiceResponse
     */
    public UpdateCloneVoiceResponse updateCloneVoice(UpdateCloneVoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloneVoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改指令</p>
     * 
     * @param request UpdateInstructionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstructionResponse
     */
    public UpdateInstructionResponse updateInstructionWithOptions(UpdateInstructionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstruction"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstructionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改指令</p>
     * 
     * @param request UpdateInstructionRequest
     * @return UpdateInstructionResponse
     */
    public UpdateInstructionResponse updateInstruction(UpdateInstructionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstructionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新语言模型配置信息</p>
     * 
     * @param tmpReq UpdateLlmAccessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLlmAccessProfileResponse
     */
    public UpdateLlmAccessProfileResponse updateLlmAccessProfileWithOptions(UpdateLlmAccessProfileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLlmAccessProfileShrinkRequest request = new UpdateLlmAccessProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.profile)) {
            request.profileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.profile, "Profile", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessProfileId)) {
            body.put("AccessProfileId", request.accessProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileShrink)) {
            body.put("Profile", request.profileShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLlmAccessProfile"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLlmAccessProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新语言模型配置信息</p>
     * 
     * @param request UpdateLlmAccessProfileRequest
     * @return UpdateLlmAccessProfileResponse
     */
    public UpdateLlmAccessProfileResponse updateLlmAccessProfile(UpdateLlmAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLlmAccessProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param request UpdateScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScriptWithOptions(UpdateScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            body.put("Concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScript"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScriptResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param request UpdateScriptRequest
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScript(UpdateScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateScriptWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新MQ配置</p>
     * 
     * @param tmpReq UpdateSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscriptionWithOptions(UpdateSubscriptionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSubscriptionShrinkRequest request = new UpdateSubscriptionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventSubscriptions)) {
            request.eventSubscriptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventSubscriptions, "EventSubscriptions", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endpoint)) {
            body.put("Endpoint", request.endpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventSubscriptionsShrink)) {
            body.put("EventSubscriptions", request.eventSubscriptionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqInstanceId)) {
            body.put("MqInstanceId", request.mqInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mqType)) {
            body.put("MqType", request.mqType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.producerId)) {
            body.put("ProducerId", request.producerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            body.put("Topic", request.topic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubscription"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建或更新MQ配置</p>
     * 
     * @param request UpdateSubscriptionRequest
     * @return UpdateSubscriptionResponse
     */
    public UpdateSubscriptionResponse updateSubscription(UpdateSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSubscriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新变量</p>
     * 
     * @param request UpdateVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVariableResponse
     */
    public UpdateVariableResponse updateVariableWithOptions(UpdateVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variableId)) {
            body.put("VariableId", request.variableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVariable"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新变量</p>
     * 
     * @param request UpdateVariableRequest
     * @return UpdateVariableResponse
     */
    public UpdateVariableResponse updateVariable(UpdateVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVariableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param tmpReq UpdateVocabularyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVocabularyResponse
     */
    public UpdateVocabularyResponse updateVocabularyWithOptions(UpdateVocabularyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateVocabularyShrinkRequest request = new UpdateVocabularyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.words)) {
            request.wordsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.words, "Words", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vocabularyId)) {
            body.put("VocabularyId", request.vocabularyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wordsShrink)) {
            body.put("Words", request.wordsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVocabulary"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVocabularyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param request UpdateVocabularyRequest
     * @return UpdateVocabularyResponse
     */
    public UpdateVocabularyResponse updateVocabulary(UpdateVocabularyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVocabularyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param tmpReq UpdateVoiceAccessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVoiceAccessProfileResponse
     */
    public UpdateVoiceAccessProfileResponse updateVoiceAccessProfileWithOptions(UpdateVoiceAccessProfileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateVoiceAccessProfileShrinkRequest request = new UpdateVoiceAccessProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.profile)) {
            request.profileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.profile, "Profile", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessProfileId)) {
            body.put("AccessProfileId", request.accessProfileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nlsEngine)) {
            body.put("NlsEngine", request.nlsEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileShrink)) {
            body.put("Profile", request.profileShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVoiceAccessProfile"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVoiceAccessProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例</p>
     * 
     * @param request UpdateVoiceAccessProfileRequest
     * @return UpdateVoiceAccessProfileResponse
     */
    public UpdateVoiceAccessProfileResponse updateVoiceAccessProfile(UpdateVoiceAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVoiceAccessProfileWithOptions(request, runtime);
    }
}
