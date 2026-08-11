// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20251111;

import com.aliyun.tea.*;
import com.aliyun.outboundbot20251111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "outboundbot.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("outboundbot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Creates an instance.</p>
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
     * <p>Creates an instance.</p>
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
     * <p>Creates a flash message configuration.</p>
     * 
     * @param tmpReq CreateFlashSmsAccessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFlashSmsAccessProfileResponse
     */
    public CreateFlashSmsAccessProfileResponse createFlashSmsAccessProfileWithOptions(CreateFlashSmsAccessProfileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFlashSmsAccessProfileShrinkRequest request = new CreateFlashSmsAccessProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accessProfile)) {
            request.accessProfileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accessProfile, "AccessProfile", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessProfileShrink)) {
            body.put("AccessProfile", request.accessProfileShrink);
        }

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
            new TeaPair("action", "CreateFlashSmsAccessProfile"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlashSmsAccessProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a flash message configuration.</p>
     * 
     * @param request CreateFlashSmsAccessProfileRequest
     * @return CreateFlashSmsAccessProfileResponse
     */
    public CreateFlashSmsAccessProfileResponse createFlashSmsAccessProfile(CreateFlashSmsAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFlashSmsAccessProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.concurrency)) {
            body.put("Concurrency", request.concurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceMode)) {
            body.put("ServiceMode", request.serviceMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2025-11-11"),
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
     * <p>Creates an instance.</p>
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
     * <p>Creates an instance.</p>
     * 
     * @param tmpReq CreateOutboundCallRestrictionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOutboundCallRestrictionResponse
     */
    public CreateOutboundCallRestrictionResponse createOutboundCallRestrictionWithOptions(CreateOutboundCallRestrictionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOutboundCallRestrictionShrinkRequest request = new CreateOutboundCallRestrictionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outboundCallRestriction)) {
            request.outboundCallRestrictionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outboundCallRestriction, "OutboundCallRestriction", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outboundCallRestrictionShrink)) {
            body.put("OutboundCallRestriction", request.outboundCallRestrictionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("Policy", request.policy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOutboundCallRestriction"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOutboundCallRestrictionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instance.</p>
     * 
     * @param request CreateOutboundCallRestrictionRequest
     * @return CreateOutboundCallRestrictionResponse
     */
    public CreateOutboundCallRestrictionResponse createOutboundCallRestriction(CreateOutboundCallRestrictionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOutboundCallRestrictionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instance.</p>
     * 
     * @param request CreateScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScriptResponse
     */
    public CreateScriptResponse createScriptWithOptions(CreateScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
     * <p>Creates an instance.</p>
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
     * <p>Creates a scenario configuration.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelConfigs)) {
            request.labelConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelConfigs, "LabelConfigs", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.labelConfigsShrink)) {
            body.put("LabelConfigs", request.labelConfigsShrink);
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
     * <p>Creates a scenario configuration.</p>
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
     * <p>Creates an instance.</p>
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
     * <p>Creates an instance.</p>
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
     * <p>Deletes a scene.</p>
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
     * <p>Deletes a scene.</p>
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
     * <p>Deletes a flash message configuration.</p>
     * 
     * @param request DeleteFlashSmsAccessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFlashSmsAccessProfileResponse
     */
    public DeleteFlashSmsAccessProfileResponse deleteFlashSmsAccessProfileWithOptions(DeleteFlashSmsAccessProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteFlashSmsAccessProfile"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFlashSmsAccessProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a flash message configuration.</p>
     * 
     * @param request DeleteFlashSmsAccessProfileRequest
     * @return DeleteFlashSmsAccessProfileResponse
     */
    public DeleteFlashSmsAccessProfileResponse deleteFlashSmsAccessProfile(DeleteFlashSmsAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFlashSmsAccessProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves instance details.</p>
     * 
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2025-11-11"),
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
     * <p>Retrieves instance details.</p>
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
     * <p>Deletes blacklists and whitelists.</p>
     * 
     * @param tmpReq DeleteOutboundCallRestrictionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOutboundCallRestrictionResponse
     */
    public DeleteOutboundCallRestrictionResponse deleteOutboundCallRestrictionWithOptions(DeleteOutboundCallRestrictionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteOutboundCallRestrictionShrinkRequest request = new DeleteOutboundCallRestrictionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.restrictionIdList)) {
            request.restrictionIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.restrictionIdList, "RestrictionIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restrictionIdListShrink)) {
            body.put("RestrictionIdList", request.restrictionIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOutboundCallRestriction"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOutboundCallRestrictionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes blacklists and whitelists.</p>
     * 
     * @param request DeleteOutboundCallRestrictionRequest
     * @return DeleteOutboundCallRestrictionResponse
     */
    public DeleteOutboundCallRestrictionResponse deleteOutboundCallRestriction(DeleteOutboundCallRestrictionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOutboundCallRestrictionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scenario.</p>
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
     * <p>Deletes a scenario.</p>
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
     * <p>Deletes a third-party voice configuration.</p>
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
     * <p>Deletes a third-party voice configuration.</p>
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
     * <p>Disables message subscription.</p>
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
     * <p>Disables message subscription.</p>
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
     * <p>Retrieves the details of an instance.</p>
     * 
     * @param request GetInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an instance.</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a prompt scenario template.</p>
     * 
     * @param request GetScriptProfileTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScriptProfileTemplateResponse
     */
    public GetScriptProfileTemplateResponse getScriptProfileTemplateWithOptions(GetScriptProfileTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScriptProfileTemplate"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScriptProfileTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a prompt scenario template.</p>
     * 
     * @param request GetScriptProfileTemplateRequest
     * @return GetScriptProfileTemplateResponse
     */
    public GetScriptProfileTemplateResponse getScriptProfileTemplate(GetScriptProfileTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScriptProfileTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the MQ configuration.</p>
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
     * <p>Retrieves the MQ configuration.</p>
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
     * <p>Retrieves the list of available models for voice cloning.</p>
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
     * <p>Retrieves the list of available models for voice cloning.</p>
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
     * <p>Retrieves the list of cloned voices.</p>
     * 
     * @param request ListCloneVoicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloneVoicesResponse
     */
    public ListCloneVoicesResponse listCloneVoicesWithOptions(ListCloneVoicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListCloneVoices"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloneVoicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of cloned voices.</p>
     * 
     * @param request ListCloneVoicesRequest
     * @return ListCloneVoicesResponse
     */
    public ListCloneVoicesResponse listCloneVoices(ListCloneVoicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloneVoicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of flash SMS configurations.</p>
     * 
     * @param request ListFlashSmsAccessProfilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlashSmsAccessProfilesResponse
     */
    public ListFlashSmsAccessProfilesResponse listFlashSmsAccessProfilesWithOptions(ListFlashSmsAccessProfilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListFlashSmsAccessProfiles"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlashSmsAccessProfilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of flash SMS configurations.</p>
     * 
     * @param request ListFlashSmsAccessProfilesRequest
     * @return ListFlashSmsAccessProfilesResponse
     */
    public ListFlashSmsAccessProfilesResponse listFlashSmsAccessProfiles(ListFlashSmsAccessProfilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlashSmsAccessProfilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of flash message providers.</p>
     * 
     * @param request ListFlashSmsProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlashSmsProvidersResponse
     */
    public ListFlashSmsProvidersResponse listFlashSmsProvidersWithOptions(ListFlashSmsProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlashSmsProviders"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlashSmsProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of flash message providers.</p>
     * 
     * @param request ListFlashSmsProvidersRequest
     * @return ListFlashSmsProvidersResponse
     */
    public ListFlashSmsProvidersResponse listFlashSmsProviders(ListFlashSmsProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlashSmsProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves flash SMS templates.</p>
     * 
     * @param request ListFlashSmsTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFlashSmsTemplatesResponse
     */
    public ListFlashSmsTemplatesResponse listFlashSmsTemplatesWithOptions(ListFlashSmsTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListFlashSmsTemplates"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlashSmsTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves flash SMS templates.</p>
     * 
     * @param request ListFlashSmsTemplatesRequest
     * @return ListFlashSmsTemplatesResponse
     */
    public ListFlashSmsTemplatesResponse listFlashSmsTemplates(ListFlashSmsTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFlashSmsTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves instance details.</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
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
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves instance details.</p>
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
     * <p>Retrieves the blacklists and whitelists.</p>
     * 
     * @param request ListOutboundCallRestrictionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOutboundCallRestrictionsResponse
     */
    public ListOutboundCallRestrictionsResponse listOutboundCallRestrictionsWithOptions(ListOutboundCallRestrictionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("Policy", request.policy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOutboundCallRestrictions"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOutboundCallRestrictionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the blacklists and whitelists.</p>
     * 
     * @param request ListOutboundCallRestrictionsRequest
     * @return ListOutboundCallRestrictionsResponse
     */
    public ListOutboundCallRestrictionsResponse listOutboundCallRestrictions(ListOutboundCallRestrictionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOutboundCallRestrictionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of scenario configuration templates.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.nluEngine)) {
            body.put("NluEngine", request.nluEngine);
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
     * <p>Retrieves the list of scenario configuration templates.</p>
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
     * <p>Retrieves the details of an instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishOnly)) {
            body.put("PublishOnly", request.publishOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptIdsShrink)) {
            body.put("ScriptIds", request.scriptIdsShrink);
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
     * <p>Retrieves the details of an instance.</p>
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
     * <p>Retrieves the list of scenarios associated with a flow by flow ID.</p>
     * 
     * @param request ListScriptsByFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScriptsByFlowResponse
     */
    public ListScriptsByFlowResponse listScriptsByFlowWithOptions(ListScriptsByFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowId)) {
            body.put("FlowId", request.flowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScriptsByFlow"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScriptsByFlowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of scenarios associated with a flow by flow ID.</p>
     * 
     * @param request ListScriptsByFlowRequest
     * @return ListScriptsByFlowResponse
     */
    public ListScriptsByFlowResponse listScriptsByFlow(ListScriptsByFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScriptsByFlowWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of system configurations.</p>
     * 
     * @param request ListSystemConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSystemConfigsResponse
     */
    public ListSystemConfigsResponse listSystemConfigsWithOptions(ListSystemConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            body.put("ObjectType", request.objectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSystemConfigs"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSystemConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of system configurations.</p>
     * 
     * @param request ListSystemConfigsRequest
     * @return ListSystemConfigsResponse
     */
    public ListSystemConfigsResponse listSystemConfigs(ListSystemConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSystemConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of voice access configurations.</p>
     * 
     * @param request ListVoiceAccessProfilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVoiceAccessProfilesResponse
     */
    public ListVoiceAccessProfilesResponse listVoiceAccessProfilesWithOptions(ListVoiceAccessProfilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListVoiceAccessProfiles"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVoiceAccessProfilesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of voice access configurations.</p>
     * 
     * @param request ListVoiceAccessProfilesRequest
     * @return ListVoiceAccessProfilesResponse
     */
    public ListVoiceAccessProfilesResponse listVoiceAccessProfiles(ListVoiceAccessProfilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVoiceAccessProfilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an instance.</p>
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
     * <p>Updates an instance.</p>
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
     * <p>Updates an instance.</p>
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
     * <p>Updates an instance.</p>
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
     * <p>Updates the flash message configuration.</p>
     * 
     * @param tmpReq UpdateFlashSmsAccessProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFlashSmsAccessProfileResponse
     */
    public UpdateFlashSmsAccessProfileResponse updateFlashSmsAccessProfileWithOptions(UpdateFlashSmsAccessProfileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFlashSmsAccessProfileShrinkRequest request = new UpdateFlashSmsAccessProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accessProfile)) {
            request.accessProfileShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accessProfile, "AccessProfile", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessProfileShrink)) {
            body.put("AccessProfile", request.accessProfileShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accessProfileId)) {
            body.put("AccessProfileId", request.accessProfileId);
        }

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
            new TeaPair("action", "UpdateFlashSmsAccessProfile"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlashSmsAccessProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the flash message configuration.</p>
     * 
     * @param request UpdateFlashSmsAccessProfileRequest
     * @return UpdateFlashSmsAccessProfileResponse
     */
    public UpdateFlashSmsAccessProfileResponse updateFlashSmsAccessProfile(UpdateFlashSmsAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFlashSmsAccessProfileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an instance.</p>
     * 
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an instance.</p>
     * 
     * @param request UpdateScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScriptWithOptions(UpdateScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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
     * <p>Updates an instance.</p>
     * 
     * @param request UpdateScriptRequest
     * @return UpdateScriptResponse
     */
    public UpdateScriptResponse updateScript(UpdateScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateScriptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>更新场景配置</p>
     * 
     * @param tmpReq UpdateScriptVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScriptVersionResponse
     */
    public UpdateScriptVersionResponse updateScriptVersionWithOptions(UpdateScriptVersionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateScriptVersionShrinkRequest request = new UpdateScriptVersionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.interactionConfig)) {
            request.interactionConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.interactionConfig, "InteractionConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelConfigs)) {
            request.labelConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelConfigs, "LabelConfigs", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.labelConfigsShrink)) {
            body.put("LabelConfigs", request.labelConfigsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptId)) {
            body.put("ScriptId", request.scriptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scriptProfileShrink)) {
            body.put("ScriptProfile", request.scriptProfileShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synthesizerConfigShrink)) {
            body.put("SynthesizerConfig", request.synthesizerConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcriberConfigShrink)) {
            body.put("TranscriberConfig", request.transcriberConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScriptVersion"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScriptVersionResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>更新场景配置</p>
     * 
     * @param request UpdateScriptVersionRequest
     * @return UpdateScriptVersionResponse
     */
    public UpdateScriptVersionResponse updateScriptVersion(UpdateScriptVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateScriptVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a message queue (MQ) configuration.</p>
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
     * <p>Creates or updates a message queue (MQ) configuration.</p>
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
     * <p>Updates system configurations.</p>
     * 
     * @param tmpReq UpdateSystemConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSystemConfigsResponse
     */
    public UpdateSystemConfigsResponse updateSystemConfigsWithOptions(UpdateSystemConfigsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSystemConfigsShrinkRequest request = new UpdateSystemConfigsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configs)) {
            request.configsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configs, "Configs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configsShrink)) {
            body.put("Configs", request.configsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            body.put("ObjectType", request.objectType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSystemConfigs"),
            new TeaPair("version", "2025-11-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSystemConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates system configurations.</p>
     * 
     * @param request UpdateSystemConfigsRequest
     * @return UpdateSystemConfigsResponse
     */
    public UpdateSystemConfigsResponse updateSystemConfigs(UpdateSystemConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSystemConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an instance.</p>
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
     * <p>Updates an instance.</p>
     * 
     * @param request UpdateVoiceAccessProfileRequest
     * @return UpdateVoiceAccessProfileResponse
     */
    public UpdateVoiceAccessProfileResponse updateVoiceAccessProfile(UpdateVoiceAccessProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVoiceAccessProfileWithOptions(request, runtime);
    }
}
