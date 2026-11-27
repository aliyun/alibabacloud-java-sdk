// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111;

import com.aliyun.tea.*;
import com.aliyun.rtc20180111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "rtc";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("rtc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <h1>Usage notes</h1>
     * <p>This operation adds a recording configuration template. For example, when you add a recording configuration template, you can configure parameters such as recording specifications and encoding options.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a recording configuration template.</p>
     * 
     * @param request AddRecordTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddRecordTemplateResponse
     */
    public AddRecordTemplateResponse addRecordTemplateWithOptions(AddRecordTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundColor)) {
            query.put("BackgroundColor", request.backgroundColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgrounds)) {
            query.put("Backgrounds", request.backgrounds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clockWidgets)) {
            query.put("ClockWidgets", request.clockWidgets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayStopTime)) {
            query.put("DelayStopTime", request.delayStopTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableM3u8DateTime)) {
            query.put("EnableM3u8DateTime", request.enableM3u8DateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSplitInterval)) {
            query.put("FileSplitInterval", request.fileSplitInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formats)) {
            query.put("Formats", request.formats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpCallbackUrl)) {
            query.put("HttpCallbackUrl", request.httpCallbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutIds)) {
            query.put("LayoutIds", request.layoutIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaEncode)) {
            query.put("MediaEncode", request.mediaEncode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mnsQueue)) {
            query.put("MnsQueue", request.mnsQueue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFilePrefix)) {
            query.put("OssFilePrefix", request.ossFilePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskProfile)) {
            query.put("TaskProfile", request.taskProfile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarks)) {
            query.put("Watermarks", request.watermarks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRecordTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddRecordTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation adds a recording configuration template. For example, when you add a recording configuration template, you can configure parameters such as recording specifications and encoding options.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a recording configuration template.</p>
     * 
     * @param request AddRecordTemplateRequest
     * @return AddRecordTemplateResponse
     */
    public AddRecordTemplateResponse addRecordTemplate(AddRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second for this API operation. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application agent template.</p>
     * 
     * @param tmpReq CreateAppAgentTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppAgentTemplateResponse
     */
    public CreateAppAgentTemplateResponse createAppAgentTemplateWithOptions(CreateAppAgentTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppAgentTemplateShrinkRequest request = new CreateAppAgentTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentSilenceConfig)) {
            request.agentSilenceConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentSilenceConfig, "AgentSilenceConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ambientSoundConfig)) {
            request.ambientSoundConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ambientSoundConfig, "AmbientSoundConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.asrConfig)) {
            request.asrConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.asrConfig, "AsrConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backChannelConfig)) {
            request.backChannelConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backChannelConfig, "BackChannelConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.interruptConfig)) {
            request.interruptConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.interruptConfig, "InterruptConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.llmConfig)) {
            request.llmConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.llmConfig, "LlmConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ttsConfig)) {
            request.ttsConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ttsConfig, "TtsConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSilenceConfigShrink)) {
            query.put("AgentSilenceConfig", request.agentSilenceConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ambientSoundConfigShrink)) {
            query.put("AmbientSoundConfig", request.ambientSoundConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrConfigShrink)) {
            query.put("AsrConfig", request.asrConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backChannelConfigShrink)) {
            query.put("BackChannelConfig", request.backChannelConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatMode)) {
            query.put("ChatMode", request.chatMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableVideoUnderstanding)) {
            query.put("EnableVideoUnderstanding", request.enableVideoUnderstanding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greeting)) {
            query.put("Greeting", request.greeting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interruptConfigShrink)) {
            query.put("InterruptConfig", request.interruptConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interruptMode)) {
            query.put("InterruptMode", request.interruptMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmConfigShrink)) {
            query.put("LlmConfig", request.llmConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferVideo)) {
            query.put("PreferVideo", request.preferVideo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsConfigShrink)) {
            query.put("TtsConfig", request.ttsConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppAgentTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppAgentTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second for this API operation. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application agent template.</p>
     * 
     * @param request CreateAppAgentTemplateRequest
     * @return CreateAppAgentTemplateResponse
     */
    public CreateAppAgentTemplateResponse createAppAgentTemplate(CreateAppAgentTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppAgentTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom layout for an application.</p>
     * 
     * @param tmpReq CreateAppLayoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppLayoutResponse
     */
    public CreateAppLayoutResponse createAppLayoutWithOptions(CreateAppLayoutRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppLayoutShrinkRequest request = new CreateAppLayoutShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.layout)) {
            request.layoutShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.layout, "Layout", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutShrink)) {
            query.put("Layout", request.layoutShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppLayout"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppLayoutResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom layout for an application.</p>
     * 
     * @param request CreateAppLayoutRequest
     * @return CreateAppLayoutResponse
     */
    public CreateAppLayoutResponse createAppLayout(CreateAppLayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppLayoutWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application recording template.</p>
     * 
     * @param tmpReq CreateAppRecordTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppRecordTemplateResponse
     */
    public CreateAppRecordTemplateResponse createAppRecordTemplateWithOptions(CreateAppRecordTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppRecordTemplateShrinkRequest request = new CreateAppRecordTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recordTemplate)) {
            request.recordTemplateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recordTemplate, "RecordTemplate", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordTemplateShrink)) {
            query.put("RecordTemplate", request.recordTemplateShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppRecordTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppRecordTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application recording template.</p>
     * 
     * @param request CreateAppRecordTemplateRequest
     * @return CreateAppRecordTemplateResponse
     */
    public CreateAppRecordTemplateResponse createAppRecordTemplate(CreateAppRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation creates a stream forwarding template for an RTC 3.0 application.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a stream forwarding template for an RTC 3.0 application.</p>
     * 
     * @param tmpReq CreateAppStreamingOutTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppStreamingOutTemplateResponse
     */
    public CreateAppStreamingOutTemplateResponse createAppStreamingOutTemplateWithOptions(CreateAppStreamingOutTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppStreamingOutTemplateShrinkRequest request = new CreateAppStreamingOutTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamingOutTemplate)) {
            request.streamingOutTemplateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamingOutTemplate, "StreamingOutTemplate", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamingOutTemplateShrink)) {
            query.put("StreamingOutTemplate", request.streamingOutTemplateShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppStreamingOutTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppStreamingOutTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation creates a stream forwarding template for an RTC 3.0 application.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a stream forwarding template for an RTC 3.0 application.</p>
     * 
     * @param request CreateAppStreamingOutTemplateRequest
     * @return CreateAppStreamingOutTemplateResponse
     */
    public CreateAppStreamingOutTemplateResponse createAppStreamingOutTemplate(CreateAppStreamingOutTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppStreamingOutTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application stream mixing template.</p>
     * 
     * @param tmpReq CreateAppViewTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppViewTemplateResponse
     */
    public CreateAppViewTemplateResponse createAppViewTemplateWithOptions(CreateAppViewTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppViewTemplateShrinkRequest request = new CreateAppViewTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.template)) {
            request.templateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.template, "Template", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateShrink)) {
            query.put("Template", request.templateShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppViewTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppViewTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application stream mixing template.</p>
     * 
     * @param request CreateAppViewTemplateRequest
     * @return CreateAppViewTemplateResponse
     */
    public CreateAppViewTemplateResponse createAppViewTemplate(CreateAppViewTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppViewTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to create a relay rule.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 1,000 calls per minute. If the limit is exceeded, API calls will be throttled, which may affect your business. Call the operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls CreateAutoLiveStreamRule to create an automatic single-stream relay rule.</p>
     * 
     * @param request CreateAutoLiveStreamRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutoLiveStreamRuleResponse
     */
    public CreateAutoLiveStreamRuleResponse createAutoLiveStreamRuleWithOptions(CreateAutoLiveStreamRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callBack)) {
            query.put("CallBack", request.callBack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelIdPrefixes)) {
            query.put("ChannelIdPrefixes", request.channelIdPrefixes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelIds)) {
            query.put("ChannelIds", request.channelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaEncode)) {
            query.put("MediaEncode", request.mediaEncode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playDomain)) {
            query.put("PlayDomain", request.playDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoLiveStreamRuleResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to create a relay rule.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 1,000 calls per minute. If the limit is exceeded, API calls will be throttled, which may affect your business. Call the operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls CreateAutoLiveStreamRule to create an automatic single-stream relay rule.</p>
     * 
     * @param request CreateAutoLiveStreamRuleRequest
     * @return CreateAutoLiveStreamRuleResponse
     */
    public CreateAutoLiveStreamRuleResponse createAutoLiveStreamRule(CreateAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a hotword table for meeting minutes.</p>
     * 
     * @param tmpReq CreateCloudNotePhrasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudNotePhrasesResponse
     */
    public CreateCloudNotePhrasesResponse createCloudNotePhrasesWithOptions(CreateCloudNotePhrasesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCloudNotePhrasesShrinkRequest request = new CreateCloudNotePhrasesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phrase)) {
            request.phraseShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phrase, "Phrase", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phraseShrink)) {
            query.put("Phrase", request.phraseShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudNotePhrases"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudNotePhrasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a hotword table for meeting minutes.</p>
     * 
     * @param request CreateCloudNotePhrasesRequest
     * @return CreateCloudNotePhrasesResponse
     */
    public CreateCloudNotePhrasesResponse createCloudNotePhrases(CreateCloudNotePhrasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudNotePhrasesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to create a callback for subscribing to room messages. For example, when you create a callback, you can configure parameters such as the callback URL and event type.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make sure that you call this operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls CreateEventSubscribe to create a callback for subscribing to room messages.</p>
     * 
     * @param request CreateEventSubscribeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEventSubscribeResponse
     */
    public CreateEventSubscribeResponse createEventSubscribeWithOptions(CreateEventSubscribeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.events)) {
            query.put("Events", request.events);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needCallbackAuth)) {
            query.put("NeedCallbackAuth", request.needCallbackAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            query.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEventSubscribe"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEventSubscribeResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to create a callback for subscribing to room messages. For example, when you create a callback, you can configure parameters such as the callback URL and event type.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make sure that you call this operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls CreateEventSubscribe to create a callback for subscribing to room messages.</p>
     * 
     * @param request CreateEventSubscribeRequest
     * @return CreateEventSubscribeResponse
     */
    public CreateEventSubscribeResponse createEventSubscribe(CreateEventSubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventSubscribeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation creates a bypass live streaming layout. For example, you can configure parameters such as the number of audio mixes and the main pane.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a bypass live streaming layout.</p>
     * 
     * @param request CreateMPULayoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMPULayoutResponse
     */
    public CreateMPULayoutResponse createMPULayoutWithOptions(CreateMPULayoutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioMixCount)) {
            query.put("AudioMixCount", request.audioMixCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.panes)) {
            query.put("Panes", request.panes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMPULayout"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMPULayoutResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation creates a bypass live streaming layout. For example, you can configure parameters such as the number of audio mixes and the main pane.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a bypass live streaming layout.</p>
     * 
     * @param request CreateMPULayoutRequest
     * @return CreateMPULayoutResponse
     */
    public CreateMPULayoutResponse createMPULayout(CreateMPULayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMPULayoutWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user for this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an application agent template.</p>
     * 
     * @param request DeleteAppAgentTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppAgentTemplateResponse
     */
    public DeleteAppAgentTemplateResponse deleteAppAgentTemplateWithOptions(DeleteAppAgentTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppAgentTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppAgentTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user for this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an application agent template.</p>
     * 
     * @param request DeleteAppAgentTemplateRequest
     * @return DeleteAppAgentTemplateResponse
     */
    public DeleteAppAgentTemplateResponse deleteAppAgentTemplate(DeleteAppAgentTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppAgentTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom layout for an application.</p>
     * 
     * @param tmpReq DeleteAppLayoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppLayoutResponse
     */
    public DeleteAppLayoutResponse deleteAppLayoutWithOptions(DeleteAppLayoutRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAppLayoutShrinkRequest request = new DeleteAppLayoutShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.layout)) {
            request.layoutShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.layout, "Layout", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutShrink)) {
            query.put("Layout", request.layoutShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppLayout"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppLayoutResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom layout for an application.</p>
     * 
     * @param request DeleteAppLayoutRequest
     * @return DeleteAppLayoutResponse
     */
    public DeleteAppLayoutResponse deleteAppLayout(DeleteAppLayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppLayoutWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an application recording template.</p>
     * 
     * @param tmpReq DeleteAppRecordTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppRecordTemplateResponse
     */
    public DeleteAppRecordTemplateResponse deleteAppRecordTemplateWithOptions(DeleteAppRecordTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAppRecordTemplateShrinkRequest request = new DeleteAppRecordTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.template)) {
            request.templateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.template, "Template", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateShrink)) {
            query.put("Template", request.templateShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppRecordTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppRecordTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an application recording template.</p>
     * 
     * @param request DeleteAppRecordTemplateRequest
     * @return DeleteAppRecordTemplateResponse
     */
    public DeleteAppRecordTemplateResponse deleteAppRecordTemplate(DeleteAppRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation deletes a stream ingest template for an RTC 3.0 application.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a stream ingest template for an RTC 3.0 application.</p>
     * 
     * @param tmpReq DeleteAppStreamingOutTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppStreamingOutTemplateResponse
     */
    public DeleteAppStreamingOutTemplateResponse deleteAppStreamingOutTemplateWithOptions(DeleteAppStreamingOutTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAppStreamingOutTemplateShrinkRequest request = new DeleteAppStreamingOutTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamingOutTemplate)) {
            request.streamingOutTemplateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamingOutTemplate, "StreamingOutTemplate", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamingOutTemplateShrink)) {
            query.put("StreamingOutTemplate", request.streamingOutTemplateShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppStreamingOutTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppStreamingOutTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation deletes a stream ingest template for an RTC 3.0 application.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a stream ingest template for an RTC 3.0 application.</p>
     * 
     * @param request DeleteAppStreamingOutTemplateRequest
     * @return DeleteAppStreamingOutTemplateResponse
     */
    public DeleteAppStreamingOutTemplateResponse deleteAppStreamingOutTemplate(DeleteAppStreamingOutTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppStreamingOutTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 calls per second for each user. If you exceed this limit, rate limiting is triggered. This may affect your business. Call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an application\&quot;s composite stream template.</p>
     * 
     * @param tmpReq DeleteAppViewTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppViewTemplateResponse
     */
    public DeleteAppViewTemplateResponse deleteAppViewTemplateWithOptions(DeleteAppViewTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAppViewTemplateShrinkRequest request = new DeleteAppViewTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.template)) {
            request.templateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.template, "Template", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateShrink)) {
            query.put("Template", request.templateShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppViewTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppViewTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 calls per second for each user. If you exceed this limit, rate limiting is triggered. This may affect your business. Call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an application\&quot;s composite stream template.</p>
     * 
     * @param request DeleteAppViewTemplateRequest
     * @return DeleteAppViewTemplateResponse
     */
    public DeleteAppViewTemplateResponse deleteAppViewTemplate(DeleteAppViewTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppViewTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an automatic bypass single-stream relay rule.</p>
     * 
     * @param request DeleteAutoLiveStreamRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAutoLiveStreamRuleResponse
     */
    public DeleteAutoLiveStreamRuleResponse deleteAutoLiveStreamRuleWithOptions(DeleteAutoLiveStreamRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoLiveStreamRuleResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an automatic bypass single-stream relay rule.</p>
     * 
     * @param request DeleteAutoLiveStreamRuleRequest
     * @return DeleteAutoLiveStreamRuleResponse
     */
    public DeleteAutoLiveStreamRuleResponse deleteAutoLiveStreamRule(DeleteAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation deletes a channel.</p>
     * <h1>QPS limit</h1>
     * <p>This operation has no QPS limit per user. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a channel.</p>
     * 
     * @param request DeleteChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChannelResponse
     */
    public DeleteChannelResponse deleteChannelWithOptions(DeleteChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChannel"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChannelResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation deletes a channel.</p>
     * <h1>QPS limit</h1>
     * <p>This operation has no QPS limit per user. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a channel.</p>
     * 
     * @param request DeleteChannelRequest
     * @return DeleteChannelResponse
     */
    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a hot word table.</p>
     * 
     * @param tmpReq DeleteCloudNotePhrasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudNotePhrasesResponse
     */
    public DeleteCloudNotePhrasesResponse deleteCloudNotePhrasesWithOptions(DeleteCloudNotePhrasesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteCloudNotePhrasesShrinkRequest request = new DeleteCloudNotePhrasesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phrase)) {
            request.phraseShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phrase, "Phrase", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phraseShrink)) {
            query.put("Phrase", request.phraseShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudNotePhrases"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudNotePhrasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a hot word table.</p>
     * 
     * @param request DeleteCloudNotePhrasesRequest
     * @return DeleteCloudNotePhrasesResponse
     */
    public DeleteCloudNotePhrasesResponse deleteCloudNotePhrases(DeleteCloudNotePhrasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudNotePhrasesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/274447.html">CreateEventSubscribe</a> to create a callback for subscribing to room messages.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit of this operation is 1,000 calls per minute per user. If the limit is exceeded, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a callback for subscribing to room messages by calling DeleteEventSubscribe.</p>
     * 
     * @param request DeleteEventSubscribeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEventSubscribeResponse
     */
    public DeleteEventSubscribeResponse deleteEventSubscribeWithOptions(DeleteEventSubscribeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeId)) {
            query.put("SubscribeId", request.subscribeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventSubscribe"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEventSubscribeResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/274447.html">CreateEventSubscribe</a> to create a callback for subscribing to room messages.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit of this operation is 1,000 calls per minute per user. If the limit is exceeded, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a callback for subscribing to room messages by calling DeleteEventSubscribe.</p>
     * 
     * @param request DeleteEventSubscribeRequest
     * @return DeleteEventSubscribeResponse
     */
    public DeleteEventSubscribeResponse deleteEventSubscribe(DeleteEventSubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventSubscribeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/162192.html">CreateMPULayout</a> to create a bypass live streaming layout.</p>
     * <h1>QPS limits</h1>
     * <p>The per-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a bypass live streaming layout.</p>
     * 
     * @param request DeleteMPULayoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMPULayoutResponse
     */
    public DeleteMPULayoutResponse deleteMPULayoutWithOptions(DeleteMPULayoutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutId)) {
            query.put("LayoutId", request.layoutId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMPULayout"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMPULayoutResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/162192.html">CreateMPULayout</a> to create a bypass live streaming layout.</p>
     * <h1>QPS limits</h1>
     * <p>The per-user QPS limit for this operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a bypass live streaming layout.</p>
     * 
     * @param request DeleteMPULayoutRequest
     * @return DeleteMPULayoutResponse
     */
    public DeleteMPULayoutResponse deleteMPULayout(DeleteMPULayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMPULayoutWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording configuration template.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a recording configuration template.</p>
     * 
     * @param request DeleteRecordTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRecordTemplateResponse
     */
    public DeleteRecordTemplateResponse deleteRecordTemplateWithOptions(DeleteRecordTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecordTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecordTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording configuration template.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this operation as needed. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a recording configuration template.</p>
     * 
     * @param request DeleteRecordTemplateRequest
     * @return DeleteRecordTemplateResponse
     */
    public DeleteRecordTemplateResponse deleteRecordTemplate(DeleteRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports a maximum of 10 calls per second per user. If you exceed this limit, rate limiting is applied to your API calls, which may affect your business operations. Use this API judiciously.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the event callbacks supported by the system.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAllCallbackResponse
     */
    public DescribeAllCallbackResponse describeAllCallbackWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAllCallback"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAllCallbackResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports a maximum of 10 calls per second per user. If you exceed this limit, rate limiting is applied to your API calls, which may affect your business operations. Use this API judiciously.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the event callbacks supported by the system.</p>
     * @return DescribeAllCallbackResponse
     */
    public DescribeAllCallbackResponse describeAllCallback() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAllCallbackWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API operation supports a maximum of 10 queries per second per user. If you exceed this limit, rate limiting is triggered, which may affect your application. Call this API only as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the status of the application agent feature.</p>
     * 
     * @param request DescribeAppAgentFunctionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppAgentFunctionStatusResponse
     */
    public DescribeAppAgentFunctionStatusResponse describeAppAgentFunctionStatusWithOptions(DescribeAppAgentFunctionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppAgentFunctionStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppAgentFunctionStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API operation supports a maximum of 10 queries per second per user. If you exceed this limit, rate limiting is triggered, which may affect your application. Call this API only as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the status of the application agent feature.</p>
     * 
     * @param request DescribeAppAgentFunctionStatusRequest
     * @return DescribeAppAgentFunctionStatusResponse
     */
    public DescribeAppAgentFunctionStatusResponse describeAppAgentFunctionStatus(DescribeAppAgentFunctionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppAgentFunctionStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Rate limits</h3>
     * <p>The rate limit for this API operation is 10 queries per second (QPS) per user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists agent templates.</p>
     * 
     * @param request DescribeAppAgentTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppAgentTemplatesResponse
     */
    public DescribeAppAgentTemplatesResponse describeAppAgentTemplatesWithOptions(DescribeAppAgentTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppAgentTemplates"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppAgentTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Rate limits</h3>
     * <p>The rate limit for this API operation is 10 queries per second (QPS) per user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists agent templates.</p>
     * 
     * @param request DescribeAppAgentTemplatesRequest
     * @return DescribeAppAgentTemplatesResponse
     */
    public DescribeAppAgentTemplatesResponse describeAppAgentTemplates(DescribeAppAgentTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppAgentTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the callback switch of an application.</p>
     * 
     * @param request DescribeAppCallStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppCallStatusResponse
     */
    public DescribeAppCallStatusResponse describeAppCallStatusWithOptions(DescribeAppCallStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppCallStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppCallStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the callback switch of an application.</p>
     * 
     * @param request DescribeAppCallStatusRequest
     * @return DescribeAppCallStatusResponse
     */
    public DescribeAppCallStatusResponse describeAppCallStatus(DescribeAppCallStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppCallStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the application callback key</p>
     * 
     * @param request DescribeAppCallbackSecretKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppCallbackSecretKeyResponse
     */
    public DescribeAppCallbackSecretKeyResponse describeAppCallbackSecretKeyWithOptions(DescribeAppCallbackSecretKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppCallbackSecretKey"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppCallbackSecretKeyResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtain the application callback key</p>
     * 
     * @param request DescribeAppCallbackSecretKeyRequest
     * @return DescribeAppCallbackSecretKeyResponse
     */
    public DescribeAppCallbackSecretKeyResponse describeAppCallbackSecretKey(DescribeAppCallbackSecretKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppCallbackSecretKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>Before invoking this API, you must have already created an application in the RTC console.  </p>
     * <h3>queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 200 requests per minute per user. If the limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke DescribeAppKey to query the AppKey of a specified application.</p>
     * 
     * @param request DescribeAppKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppKeyResponse
     */
    public DescribeAppKeyResponse describeAppKeyWithOptions(DescribeAppKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppKey"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppKeyResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>Before invoking this API, you must have already created an application in the RTC console.  </p>
     * <h3>queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 200 requests per minute per user. If the limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke DescribeAppKey to query the AppKey of a specified application.</p>
     * 
     * @param request DescribeAppKeyRequest
     * @return DescribeAppKeyResponse
     */
    public DescribeAppKeyResponse describeAppKey(DescribeAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 queries per second (QPS) per user. Exceeding this limit triggers rate limiting, which may affect your business operations. Use the API judiciously.</p>
     * 
     * <b>summary</b> : 
     * <p>Query custom application layouts.</p>
     * 
     * @param tmpReq DescribeAppLayoutsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppLayoutsResponse
     */
    public DescribeAppLayoutsResponse describeAppLayoutsWithOptions(DescribeAppLayoutsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeAppLayoutsShrinkRequest request = new DescribeAppLayoutsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.condition)) {
            request.conditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.condition, "Condition", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppLayouts"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppLayoutsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 queries per second (QPS) per user. Exceeding this limit triggers rate limiting, which may affect your business operations. Use the API judiciously.</p>
     * 
     * <b>summary</b> : 
     * <p>Query custom application layouts.</p>
     * 
     * @param request DescribeAppLayoutsRequest
     * @return DescribeAppLayoutsResponse
     */
    public DescribeAppLayoutsResponse describeAppLayouts(DescribeAppLayoutsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppLayoutsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 for each user. API calls that exceed this limit are subject to rate limiting, which may impact your business. We recommend that you call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>View the application bypass switch.</p>
     * 
     * @param request DescribeAppLiveStreamStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppLiveStreamStatusResponse
     */
    public DescribeAppLiveStreamStatusResponse describeAppLiveStreamStatusWithOptions(DescribeAppLiveStreamStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppLiveStreamStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppLiveStreamStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 for each user. API calls that exceed this limit are subject to rate limiting, which may impact your business. We recommend that you call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>View the application bypass switch.</p>
     * 
     * @param request DescribeAppLiveStreamStatusRequest
     * @return DescribeAppLiveStreamStatusResponse
     */
    public DescribeAppLiveStreamStatusResponse describeAppLiveStreamStatus(DescribeAppLiveStreamStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppLiveStreamStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this operation is 10 calls per second per user. Exceeding this limit triggers rate limiting, which may affect your business. Call this operation only as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the recording status of an application.</p>
     * 
     * @param request DescribeAppRecordStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppRecordStatusResponse
     */
    public DescribeAppRecordStatusResponse describeAppRecordStatusWithOptions(DescribeAppRecordStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppRecordStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppRecordStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this operation is 10 calls per second per user. Exceeding this limit triggers rate limiting, which may affect your business. Call this operation only as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the recording status of an application.</p>
     * 
     * @param request DescribeAppRecordStatusRequest
     * @return DescribeAppRecordStatusResponse
     */
    public DescribeAppRecordStatusResponse describeAppRecordStatus(DescribeAppRecordStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppRecordStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user calling this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of application recording templates.</p>
     * 
     * @param tmpReq DescribeAppRecordTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppRecordTemplatesResponse
     */
    public DescribeAppRecordTemplatesResponse describeAppRecordTemplatesWithOptions(DescribeAppRecordTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeAppRecordTemplatesShrinkRequest request = new DescribeAppRecordTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.condition)) {
            request.conditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.condition, "Condition", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppRecordTemplates"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppRecordTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user calling this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of application recording templates.</p>
     * 
     * @param request DescribeAppRecordTemplatesRequest
     * @return DescribeAppRecordTemplatesResponse
     */
    public DescribeAppRecordTemplatesResponse describeAppRecordTemplates(DescribeAppRecordTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppRecordTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. Exceeding this limit triggers rate limiting, which may affect your service. Call this API only when necessary.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists recording files.</p>
     * 
     * @param tmpReq DescribeAppRecordingFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppRecordingFilesResponse
     */
    public DescribeAppRecordingFilesResponse describeAppRecordingFilesWithOptions(DescribeAppRecordingFilesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeAppRecordingFilesShrinkRequest request = new DescribeAppRecordingFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIds)) {
            request.taskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIds, "TaskIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppRecordingFiles"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppRecordingFilesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. Exceeding this limit triggers rate limiting, which may affect your service. Call this API only when necessary.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists recording files.</p>
     * 
     * @param request DescribeAppRecordingFilesRequest
     * @return DescribeAppRecordingFilesResponse
     */
    public DescribeAppRecordingFilesResponse describeAppRecordingFiles(DescribeAppRecordingFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppRecordingFilesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to view the list of stream ingest templates for an RTC 3.0 application.  </p>
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If this limit is exceeded, API calls will be rate-limited, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the list of stream ingest templates under an RTC 3.0 application.</p>
     * 
     * @param tmpReq DescribeAppStreamingOutTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppStreamingOutTemplatesResponse
     */
    public DescribeAppStreamingOutTemplatesResponse describeAppStreamingOutTemplatesWithOptions(DescribeAppStreamingOutTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeAppStreamingOutTemplatesShrinkRequest request = new DescribeAppStreamingOutTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.condition)) {
            request.conditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.condition, "Condition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionShrink)) {
            query.put("Condition", request.conditionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppStreamingOutTemplates"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppStreamingOutTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to view the list of stream ingest templates for an RTC 3.0 application.  </p>
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If this limit is exceeded, API calls will be rate-limited, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the list of stream ingest templates under an RTC 3.0 application.</p>
     * 
     * @param request DescribeAppStreamingOutTemplatesRequest
     * @return DescribeAppStreamingOutTemplatesResponse
     */
    public DescribeAppStreamingOutTemplatesResponse describeAppStreamingOutTemplates(DescribeAppStreamingOutTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppStreamingOutTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>This API has a QPS limit of 10 queries per second (QPS) per user. If you exceed this limit, rate limiting is triggered, which can affect your business operations. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>View the stream merging switch</p>
     * 
     * @param request DescribeAppViewStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppViewStatusResponse
     */
    public DescribeAppViewStatusResponse describeAppViewStatusWithOptions(DescribeAppViewStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppViewStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppViewStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>This API has a QPS limit of 10 queries per second (QPS) per user. If you exceed this limit, rate limiting is triggered, which can affect your business operations. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>View the stream merging switch</p>
     * 
     * @param request DescribeAppViewStatusRequest
     * @return DescribeAppViewStatusResponse
     */
    public DescribeAppViewStatusResponse describeAppViewStatus(DescribeAppViewStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppViewStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this operation is 10 calls per second. Exceeding this limit triggers rate limiting, which may affect your business. You should call this operation only as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists application compositing templates.</p>
     * 
     * @param tmpReq DescribeAppViewTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppViewTemplatesResponse
     */
    public DescribeAppViewTemplatesResponse describeAppViewTemplatesWithOptions(DescribeAppViewTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeAppViewTemplatesShrinkRequest request = new DescribeAppViewTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.condition)) {
            request.conditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.condition, "Condition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionShrink)) {
            query.put("Condition", request.conditionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppViewTemplates"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppViewTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this operation is 10 calls per second. Exceeding this limit triggers rate limiting, which may affect your business. You should call this operation only as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists application compositing templates.</p>
     * 
     * @param request DescribeAppViewTemplatesRequest
     * @return DescribeAppViewTemplatesResponse
     */
    public DescribeAppViewTemplatesResponse describeAppViewTemplates(DescribeAppViewTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppViewTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the list of applications. For example, you can obtain data such as the application ID, application name, and application type from the query results.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 200 calls per minute. If this limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of applications.</p>
     * 
     * @param request DescribeAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeAppsWithOptions(DescribeAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            query.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApps"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the list of applications. For example, you can obtain data such as the application ID, application name, and application type from the query results.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 200 calls per minute. If this limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of applications.</p>
     * 
     * @param request DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the automatic bypass single-stream relay rules.</p>
     * 
     * @param request DescribeAutoLiveStreamRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoLiveStreamRuleResponse
     */
    public DescribeAutoLiveStreamRuleResponse describeAutoLiveStreamRuleWithOptions(DescribeAutoLiveStreamRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoLiveStreamRuleResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the automatic bypass single-stream relay rules.</p>
     * 
     * @param request DescribeAutoLiveStreamRuleRequest
     * @return DescribeAutoLiveStreamRuleResponse
     */
    public DescribeAutoLiveStreamRuleResponse describeAutoLiveStreamRule(DescribeAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the details of a single communication session. For example, you can query the communication status and user details.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a single communication session. For example, you can query the communication status and user details.</p>
     * 
     * @param request DescribeCallRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCallResponse
     */
    public DescribeCallResponse describeCallWithOptions(DescribeCallRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extDataType)) {
            query.put("ExtDataType", request.extDataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryExpInfo)) {
            query.put("QueryExpInfo", request.queryExpInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCall"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCallResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the details of a single communication session. For example, you can query the communication status and user details.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a single communication session. For example, you can query the communication status and user details.</p>
     * 
     * @param request DescribeCallRequest
     * @return DescribeCallResponse
     */
    public DescribeCallResponse describeCall(DescribeCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCallWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query communication records created within a specified time range. For example, you can query information such as call duration, status, and user count.  </p>
     * <h3>Rate Limiting</h3>
     * <p>The queries per second (QPS) limit for this API is 10 calls per second per user. If this limit is exceeded, API calls will be rate-limited, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke DescribeCallList to perform a paged query of communication records created within a specified time range.</p>
     * 
     * @param request DescribeCallListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCallListResponse
     */
    public DescribeCallListResponse describeCallListWithOptions(DescribeCallListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callStatus)) {
            query.put("CallStatus", request.callStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryMode)) {
            query.put("QueryMode", request.queryMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCallList"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCallListResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query communication records created within a specified time range. For example, you can query information such as call duration, status, and user count.  </p>
     * <h3>Rate Limiting</h3>
     * <p>The queries per second (QPS) limit for this API is 10 calls per second per user. If this limit is exceeded, API calls will be rate-limited, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke DescribeCallList to perform a paged query of communication records created within a specified time range.</p>
     * 
     * @param request DescribeCallListRequest
     * @return DescribeCallListResponse
     */
    public DescribeCallListResponse describeCallList(DescribeCallListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCallListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 queries per second (QPS) per user. If you exceed this limit, the system applies rate limiting to your API calls, which may affect your business operations. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the event callbacks configured for an application.</p>
     * 
     * @param request DescribeCallbacksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCallbacksResponse
     */
    public DescribeCallbacksResponse describeCallbacksWithOptions(DescribeCallbacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCallbacks"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCallbacksResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 queries per second (QPS) per user. If you exceed this limit, the system applies rate limiting to your API calls, which may affect your business operations. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the event callbacks configured for an application.</p>
     * 
     * @param request DescribeCallbacksRequest
     * @return DescribeCallbacksResponse
     */
    public DescribeCallbacksResponse describeCallbacks(DescribeCallbacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCallbacksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query online channel information.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If the limit is exceeded, Rate Limiting will be applied to your API Call, which may Impact your business. Please invoke the API reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>DescribeChannel</p>
     * 
     * @param request DescribeChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelResponse
     */
    public DescribeChannelResponse describeChannelWithOptions(DescribeChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannel"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query online channel information.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If the limit is exceeded, Rate Limiting will be applied to your API Call, which may Impact your business. Please invoke the API reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>DescribeChannel</p>
     * 
     * @param request DescribeChannelRequest
     * @return DescribeChannelResponse
     */
    public DescribeChannelResponse describeChannel(DescribeChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query the list of users in an online channel.  </p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Invoke this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to query the user list in a channel.</p>
     * 
     * @param request DescribeChannelAllUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelAllUsersResponse
     */
    public DescribeChannelAllUsersResponse describeChannelAllUsersWithOptions(DescribeChannelAllUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelAllUsers"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelAllUsersResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query the list of users in an online channel.  </p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Invoke this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to query the user list in a channel.</p>
     * 
     * @param request DescribeChannelAllUsersRequest
     * @return DescribeChannelAllUsersResponse
     */
    public DescribeChannelAllUsersResponse describeChannelAllUsers(DescribeChannelAllUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelAllUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the regional distribution statistics of a channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the regional distribution statistics of a channel.</p>
     * 
     * @param request DescribeChannelAreaDistributionStatDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelAreaDistributionStatDataResponse
     */
    public DescribeChannelAreaDistributionStatDataResponse describeChannelAreaDistributionStatDataWithOptions(DescribeChannelAreaDistributionStatDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentArea)) {
            query.put("ParentArea", request.parentArea);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelAreaDistributionStatData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelAreaDistributionStatDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the regional distribution statistics of a channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the regional distribution statistics of a channel.</p>
     * 
     * @param request DescribeChannelAreaDistributionStatDataRequest
     * @return DescribeChannelAreaDistributionStatDataResponse
     */
    public DescribeChannelAreaDistributionStatDataResponse describeChannelAreaDistributionStatData(DescribeChannelAreaDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelAreaDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the channel distribution statistics. You can query the statistics by dimension, such as operating system type or SDK version.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the channel distribution statistics.</p>
     * 
     * @param request DescribeChannelDistributionStatDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelDistributionStatDataResponse
     */
    public DescribeChannelDistributionStatDataResponse describeChannelDistributionStatDataWithOptions(DescribeChannelDistributionStatDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelDistributionStatData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelDistributionStatDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the channel distribution statistics. You can query the statistics by dimension, such as operating system type or SDK version.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the channel distribution statistics.</p>
     * 
     * @param request DescribeChannelDistributionStatDataRequest
     * @return DescribeChannelDistributionStatDataResponse
     */
    public DescribeChannelDistributionStatDataResponse describeChannelDistributionStatData(DescribeChannelDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query channel overview data. For example, you can query basic communication information, Trend Indicators, and other information.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per User. If the limit is exceeded, Rate Limiting will be applied to API Calls, which may Impact your business. Invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to query channel overview data.</p>
     * 
     * @param request DescribeChannelOverallDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelOverallDataResponse
     */
    public DescribeChannelOverallDataResponse describeChannelOverallDataWithOptions(DescribeChannelOverallDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelOverallData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelOverallDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query channel overview data. For example, you can query basic communication information, Trend Indicators, and other information.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per User. If the limit is exceeded, Rate Limiting will be applied to API Calls, which may Impact your business. Invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to query channel overview data.</p>
     * 
     * @param request DescribeChannelOverallDataRequest
     * @return DescribeChannelOverallDataResponse
     */
    public DescribeChannelOverallDataResponse describeChannelOverallData(DescribeChannelOverallDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelOverallDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation queries the list of online users in a channel, excluding detailed user information.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of online users in a channel without detailed information.</p>
     * 
     * @param request DescribeChannelParticipantsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelParticipantsResponse
     */
    public DescribeChannelParticipantsResponse describeChannelParticipantsWithOptions(DescribeChannelParticipantsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelParticipants"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelParticipantsResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation queries the list of online users in a channel, excluding detailed user information.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of online users in a channel without detailed information.</p>
     * 
     * @param request DescribeChannelParticipantsRequest
     * @return DescribeChannelParticipantsResponse
     */
    public DescribeChannelParticipantsResponse describeChannelParticipants(DescribeChannelParticipantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelParticipantsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the list of publishing users in a channel in descending order of online duration. For example, you can query information such as the time when a user joined the call and the communication duration from the user list.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of publishing users in a channel in descending order of online duration.</p>
     * 
     * @param request DescribeChannelTopPubUserListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelTopPubUserListResponse
     */
    public DescribeChannelTopPubUserListResponse describeChannelTopPubUserListWithOptions(DescribeChannelTopPubUserListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelTopPubUserList"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelTopPubUserListResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the list of publishing users in a channel in descending order of online duration. For example, you can query information such as the time when a user joined the call and the communication duration from the user list.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of publishing users in a channel in descending order of online duration.</p>
     * 
     * @param request DescribeChannelTopPubUserListRequest
     * @return DescribeChannelTopPubUserListResponse
     */
    public DescribeChannelTopPubUserListResponse describeChannelTopPubUserList(DescribeChannelTopPubUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelTopPubUserListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the information of a user in an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of a user in a channel.</p>
     * 
     * @param request DescribeChannelUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelUserResponse
     */
    public DescribeChannelUserResponse describeChannelUserWithOptions(DescribeChannelUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelUser"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelUserResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the information of a user in an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information of a user in a channel.</p>
     * 
     * @param request DescribeChannelUserRequest
     * @return DescribeChannelUserResponse
     */
    public DescribeChannelUserResponse describeChannelUser(DescribeChannelUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the user data in the channel overview. For example, you can query metric data details and overview data.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the user data in the channel overview.</p>
     * 
     * @param request DescribeChannelUserMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelUserMetricsResponse
     */
    public DescribeChannelUserMetricsResponse describeChannelUserMetricsWithOptions(DescribeChannelUserMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelUserMetrics"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelUserMetricsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the user data in the channel overview. For example, you can query metric data details and overview data.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the user data in the channel overview.</p>
     * 
     * @param request DescribeChannelUserMetricsRequest
     * @return DescribeChannelUserMetricsResponse
     */
    public DescribeChannelUserMetricsResponse describeChannelUserMetrics(DescribeChannelUserMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelUserMetricsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation queries the details of online users in a channel. For example, you can query the total number of users in communication mode and live streaming mode.</p>
     * <h1>QPS limit</h1>
     * <p>The queries per second (QPS) limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of real-time online users in a channel.</p>
     * 
     * @param request DescribeChannelUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelUsersResponse
     */
    public DescribeChannelUsersResponse describeChannelUsersWithOptions(DescribeChannelUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelUsers"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelUsersResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation queries the details of online users in a channel. For example, you can query the total number of users in communication mode and live streaming mode.</p>
     * <h1>QPS limit</h1>
     * <p>The queries per second (QPS) limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of real-time online users in a channel.</p>
     * 
     * @param request DescribeChannelUsersRequest
     * @return DescribeChannelUsersResponse
     */
    public DescribeChannelUsersResponse describeChannelUsers(DescribeChannelUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries all active channels under a single AppId.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all active channels under a single AppId.</p>
     * 
     * @param request DescribeChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelsResponse
     */
    public DescribeChannelsResponse describeChannelsWithOptions(DescribeChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannels"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries all active channels under a single AppId.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all active channels under a single AppId.</p>
     * 
     * @param request DescribeChannelsRequest
     * @return DescribeChannelsResponse
     */
    public DescribeChannelsResponse describeChannels(DescribeChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hotword lists for meeting minutes.</p>
     * 
     * @param tmpReq DescribeCloudNotePhrasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudNotePhrasesResponse
     */
    public DescribeCloudNotePhrasesResponse describeCloudNotePhrasesWithOptions(DescribeCloudNotePhrasesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCloudNotePhrasesShrinkRequest request = new DescribeCloudNotePhrasesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.condition)) {
            request.conditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.condition, "Condition", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionShrink)) {
            query.put("Condition", request.conditionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudNotePhrases"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudNotePhrasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the hotword lists for meeting minutes.</p>
     * 
     * @param request DescribeCloudNotePhrasesRequest
     * @return DescribeCloudNotePhrasesResponse
     */
    public DescribeCloudNotePhrasesResponse describeCloudNotePhrases(DescribeCloudNotePhrasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudNotePhrasesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query the list of meeting summary job files that have generated summary results.  </p>
     * <h3>Queries Per Second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If this limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Meeting Summary List</p>
     * 
     * @param tmpReq DescribeCloudNotesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudNotesResponse
     */
    public DescribeCloudNotesResponse describeCloudNotesWithOptions(DescribeCloudNotesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCloudNotesShrinkRequest request = new DescribeCloudNotesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIds)) {
            request.taskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIds, "TaskIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudNotes"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudNotesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to query the list of meeting summary job files that have generated summary results.  </p>
     * <h3>Queries Per Second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If this limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Meeting Summary List</p>
     * 
     * @param request DescribeCloudNotesRequest
     * @return DescribeCloudNotesResponse
     */
    public DescribeCloudNotesResponse describeCloudNotes(DescribeCloudNotesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudNotesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a recording task.</p>
     * 
     * @param request DescribeCloudRecordStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudRecordStatusResponse
     */
    public DescribeCloudRecordStatusResponse describeCloudRecordStatusWithOptions(DescribeCloudRecordStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudRecordStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudRecordStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a recording task.</p>
     * 
     * @param request DescribeCloudRecordStatusRequest
     * @return DescribeCloudRecordStatusResponse
     */
    public DescribeCloudRecordStatusResponse describeCloudRecordStatus(DescribeCloudRecordStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudRecordStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves a list of end-to-end user events. For example, you can obtain information such as the event name and event type from the event list.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of end-to-end user events.</p>
     * 
     * @param request DescribeEndPointEventListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEndPointEventListResponse
     */
    public DescribeEndPointEventListResponse describeEndPointEventListWithOptions(DescribeEndPointEventListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            query.put("UserIdList", request.userIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEndPointEventList"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEndPointEventListResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves a list of end-to-end user events. For example, you can obtain information such as the event name and event type from the event list.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of end-to-end user events.</p>
     * 
     * @param request DescribeEndPointEventListRequest
     * @return DescribeEndPointEventListResponse
     */
    public DescribeEndPointEventListResponse describeEndPointEventList(DescribeEndPointEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEndPointEventListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves end-to-end metric data. For example, you can retrieve metric information for subscribers and publishers.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the number of calls per second exceeds the limit, throttling is triggered, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves end-to-end metric data.</p>
     * 
     * @param request DescribeEndPointMetricDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEndPointMetricDataResponse
     */
    public DescribeEndPointMetricDataResponse describeEndPointMetricDataWithOptions(DescribeEndPointMetricDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubCallIdList)) {
            query.put("PubCallIdList", request.pubCallIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pubUserId)) {
            query.put("PubUserId", request.pubUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEndPointMetricData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEndPointMetricDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves end-to-end metric data. For example, you can retrieve metric information for subscribers and publishers.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the number of calls per second exceeds the limit, throttling is triggered, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves end-to-end metric data.</p>
     * 
     * @param request DescribeEndPointMetricDataRequest
     * @return DescribeEndPointMetricDataResponse
     */
    public DescribeEndPointMetricDataResponse describeEndPointMetricData(DescribeEndPointMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEndPointMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to retrieve the distribution of factors impacting abnormal diagnosis. When using this API, you can query data from the last 48 hours, with each query covering a time range of no more than 24 hours.</p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If this limit is exceeded, API calls will be subject to rate limiting, which may impact your service. Please call the API responsibly.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the DescribeFaultDiagnosisFactorDistributionStat API to obtain the distribution of factors impacting abnormal diagnosis.</p>
     * 
     * @param request DescribeFaultDiagnosisFactorDistributionStatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFaultDiagnosisFactorDistributionStatResponse
     */
    public DescribeFaultDiagnosisFactorDistributionStatResponse describeFaultDiagnosisFactorDistributionStatWithOptions(DescribeFaultDiagnosisFactorDistributionStatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaultDiagnosisFactorDistributionStat"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaultDiagnosisFactorDistributionStatResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to retrieve the distribution of factors impacting abnormal diagnosis. When using this API, you can query data from the last 48 hours, with each query covering a time range of no more than 24 hours.</p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If this limit is exceeded, API calls will be subject to rate limiting, which may impact your service. Please call the API responsibly.</p>
     * 
     * <b>summary</b> : 
     * <p>Invoke the DescribeFaultDiagnosisFactorDistributionStat API to obtain the distribution of factors impacting abnormal diagnosis.</p>
     * 
     * @param request DescribeFaultDiagnosisFactorDistributionStatRequest
     * @return DescribeFaultDiagnosisFactorDistributionStatResponse
     */
    public DescribeFaultDiagnosisFactorDistributionStatResponse describeFaultDiagnosisFactorDistributionStat(DescribeFaultDiagnosisFactorDistributionStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaultDiagnosisFactorDistributionStatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the overview data of exception diagnostics. When you call this operation, you can query data from the last 48 hours, and the query time range cannot exceed 24 hours.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit on this operation is 10 per user. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the overview data of exception diagnostics.</p>
     * 
     * @param request DescribeFaultDiagnosisOverallDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFaultDiagnosisOverallDataResponse
     */
    public DescribeFaultDiagnosisOverallDataResponse describeFaultDiagnosisOverallDataWithOptions(DescribeFaultDiagnosisOverallDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaultDiagnosisOverallData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaultDiagnosisOverallDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the overview data of exception diagnostics. When you call this operation, you can query data from the last 48 hours, and the query time range cannot exceed 24 hours.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit on this operation is 10 per user. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the overview data of exception diagnostics.</p>
     * 
     * @param request DescribeFaultDiagnosisOverallDataRequest
     * @return DescribeFaultDiagnosisOverallDataResponse
     */
    public DescribeFaultDiagnosisOverallDataResponse describeFaultDiagnosisOverallData(DescribeFaultDiagnosisOverallDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaultDiagnosisOverallDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>[responses_200_schema_properties_UserDetail_properties_CreatedTs_description]Call creation time, represented as a UNIX timestamp in seconds.</p>
     * 
     * <b>summary</b> : 
     * <p>[responses_200_schema_properties_UserDetail_properties_Duration_type]integer</p>
     * 
     * @param request DescribeFaultDiagnosisUserDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFaultDiagnosisUserDetailResponse
     */
    public DescribeFaultDiagnosisUserDetailResponse describeFaultDiagnosisUserDetailWithOptions(DescribeFaultDiagnosisUserDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faultType)) {
            query.put("FaultType", request.faultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCallUserInfo)) {
            query.put("QueryCallUserInfo", request.queryCallUserInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaultDiagnosisUserDetail"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaultDiagnosisUserDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>[responses_200_schema_properties_UserDetail_properties_CreatedTs_description]Call creation time, represented as a UNIX timestamp in seconds.</p>
     * 
     * <b>summary</b> : 
     * <p>[responses_200_schema_properties_UserDetail_properties_Duration_type]integer</p>
     * 
     * @param request DescribeFaultDiagnosisUserDetailRequest
     * @return DescribeFaultDiagnosisUserDetailResponse
     */
    public DescribeFaultDiagnosisUserDetailResponse describeFaultDiagnosisUserDetail(DescribeFaultDiagnosisUserDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaultDiagnosisUserDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation is used to retrieve the detailed user list for fault diagnosis. When you call this operation, you can query data from the last 48 hours, and the query time range cannot exceed 24 hours.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed user list for fault diagnosis.</p>
     * 
     * @param request DescribeFaultDiagnosisUserListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFaultDiagnosisUserListResponse
     */
    public DescribeFaultDiagnosisUserListResponse describeFaultDiagnosisUserListWithOptions(DescribeFaultDiagnosisUserListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTs)) {
            query.put("EndTs", request.endTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faultTypes)) {
            query.put("FaultTypes", request.faultTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTs)) {
            query.put("StartTs", request.startTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFaultDiagnosisUserList"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFaultDiagnosisUserListResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation is used to retrieve the detailed user list for fault diagnosis. When you call this operation, you can query data from the last 48 hours, and the query time range cannot exceed 24 hours.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detailed user list for fault diagnosis.</p>
     * 
     * @param request DescribeFaultDiagnosisUserListRequest
     * @return DescribeFaultDiagnosisUserListResponse
     */
    public DescribeFaultDiagnosisUserListResponse describeFaultDiagnosisUserList(DescribeFaultDiagnosisUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaultDiagnosisUserListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before calling this operation, call <a href="https://help.aliyun.com/document_detail/162192.html">CreateMPULayout</a> to create a bypass live streaming layout.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit for this operation is 10 calls per second. Exceeding this limit triggers rate limiting, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call DescribeMPULayoutInfoList to retrieve layout parameters for a bypass live streaming task.</p>
     * 
     * @param request DescribeMPULayoutInfoListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMPULayoutInfoListResponse
     */
    public DescribeMPULayoutInfoListResponse describeMPULayoutInfoListWithOptions(DescribeMPULayoutInfoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutId)) {
            query.put("LayoutId", request.layoutId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMPULayoutInfoList"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMPULayoutInfoListResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before calling this operation, call <a href="https://help.aliyun.com/document_detail/162192.html">CreateMPULayout</a> to create a bypass live streaming layout.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit for this operation is 10 calls per second. Exceeding this limit triggers rate limiting, which may affect your business. Call this operation appropriately. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call DescribeMPULayoutInfoList to retrieve layout parameters for a bypass live streaming task.</p>
     * 
     * @param request DescribeMPULayoutInfoListRequest
     * @return DescribeMPULayoutInfoListResponse
     */
    public DescribeMPULayoutInfoListResponse describeMPULayoutInfoList(DescribeMPULayoutInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMPULayoutInfoListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the list of publishing users in a communication session based on the subscriber. For example, you can retrieve detailed information about both the subscriber and the publishing users.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. If this limit is exceeded, API calls will be subject to rate limiting, which may affect your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the list of publishing users in a communication session based on the subscriber.</p>
     * 
     * @param request DescribePubUserListBySubUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePubUserListBySubUserResponse
     */
    public DescribePubUserListBySubUserResponse describePubUserListBySubUserWithOptions(DescribePubUserListBySubUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserId)) {
            query.put("SubUserId", request.subUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePubUserListBySubUser"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePubUserListBySubUserResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the list of publishing users in a communication session based on the subscriber. For example, you can retrieve detailed information about both the subscriber and the publishing users.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. If this limit is exceeded, API calls will be subject to rate limiting, which may affect your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the list of publishing users in a communication session based on the subscriber.</p>
     * 
     * @param request DescribePubUserListBySubUserRequest
     * @return DescribePubUserListBySubUserResponse
     */
    public DescribePubUserListBySubUserResponse describePubUserListBySubUser(DescribePubUserListBySubUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePubUserListBySubUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the downlink experience quality metrics of a user in a single communication session. For example, you can retrieve information such as the metric types that impact communication experience and audio/video trend indicators.  </p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If this limit is exceeded, API calls will be subject to rate limiting, which may affect your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the downlink experience quality metrics of a user in a single communication session.</p>
     * 
     * @param request DescribeQoeMetricDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQoeMetricDataResponse
     */
    public DescribeQoeMetricDataResponse describeQoeMetricDataWithOptions(DescribeQoeMetricDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdTs)) {
            query.put("CreatedTs", request.createdTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destroyedTs)) {
            query.put("DestroyedTs", request.destroyedTs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQoeMetricData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQoeMetricDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the downlink experience quality metrics of a user in a single communication session. For example, you can retrieve information such as the metric types that impact communication experience and audio/video trend indicators.  </p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If this limit is exceeded, API calls will be subject to rate limiting, which may affect your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the downlink experience quality metrics of a user in a single communication session.</p>
     * 
     * @param request DescribeQoeMetricDataRequest
     * @return DescribeQoeMetricDataResponse
     */
    public DescribeQoeMetricDataResponse describeQoeMetricData(DescribeQoeMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQoeMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the regional distribution data of quality statistics. When you call this operation, the following limits apply:</p>
     * <ul>
     * <li>You can query data within any time range in the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the regional distribution data of quality statistics.</p>
     * 
     * @param request DescribeQualityAreaDistributionStatDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQualityAreaDistributionStatDataResponse
     */
    public DescribeQualityAreaDistributionStatDataResponse describeQualityAreaDistributionStatDataWithOptions(DescribeQualityAreaDistributionStatDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentArea)) {
            query.put("ParentArea", request.parentArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQualityAreaDistributionStatData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQualityAreaDistributionStatDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the regional distribution data of quality statistics. When you call this operation, the following limits apply:</p>
     * <ul>
     * <li>You can query data within any time range in the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the regional distribution data of quality statistics.</p>
     * 
     * @param request DescribeQualityAreaDistributionStatDataRequest
     * @return DescribeQualityAreaDistributionStatDataResponse
     */
    public DescribeQualityAreaDistributionStatDataResponse describeQualityAreaDistributionStatData(DescribeQualityAreaDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQualityAreaDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the distribution data of quality statistics. The following limits apply when using this API:</p>
     * <ul>
     * <li>You can query data for any period within the last 365 days (excluding the current day).</li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If you exceed this limit, your API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the distribution data of quality statistics.</p>
     * 
     * @param request DescribeQualityDistributionStatDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQualityDistributionStatDataResponse
     */
    public DescribeQualityDistributionStatDataResponse describeQualityDistributionStatDataWithOptions(DescribeQualityDistributionStatDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQualityDistributionStatData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQualityDistributionStatDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the distribution data of quality statistics. The following limits apply when using this API:</p>
     * <ul>
     * <li>You can query data for any period within the last 365 days (excluding the current day).</li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If you exceed this limit, your API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the distribution data of quality statistics.</p>
     * 
     * @param request DescribeQualityDistributionStatDataRequest
     * @return DescribeQualityDistributionStatDataResponse
     */
    public DescribeQualityDistributionStatDataResponse describeQualityDistributionStatData(DescribeQualityDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQualityDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the distribution data of operating systems and SDK versions in quality statistics. The following limits apply when you call this operation:</p>
     * <ul>
     * <li>You can query data within the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the distribution data of operating systems and SDK versions in quality statistics.</p>
     * 
     * @param request DescribeQualityOsSdkVersionDistributionStatDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQualityOsSdkVersionDistributionStatDataResponse
     */
    public DescribeQualityOsSdkVersionDistributionStatDataResponse describeQualityOsSdkVersionDistributionStatDataWithOptions(DescribeQualityOsSdkVersionDistributionStatDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQualityOsSdkVersionDistributionStatData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQualityOsSdkVersionDistributionStatDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the distribution data of operating systems and SDK versions in quality statistics. The following limits apply when you call this operation:</p>
     * <ul>
     * <li>You can query data within the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the distribution data of operating systems and SDK versions in quality statistics.</p>
     * 
     * @param request DescribeQualityOsSdkVersionDistributionStatDataRequest
     * @return DescribeQualityOsSdkVersionDistributionStatDataResponse
     */
    public DescribeQualityOsSdkVersionDistributionStatDataResponse describeQualityOsSdkVersionDistributionStatData(DescribeQualityOsSdkVersionDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQualityOsSdkVersionDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain overview data of quality statistics. The following restrictions apply when using this API:  </p>
     * <ul>
     * <li>You can query data for any time range within the last 365 days (excluding the current day).  </li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If you exceed this limit, your API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain overview data of quality statistics.</p>
     * 
     * @param request DescribeQualityOverallDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQualityOverallDataResponse
     */
    public DescribeQualityOverallDataResponse describeQualityOverallDataWithOptions(DescribeQualityOverallDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQualityOverallData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQualityOverallDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain overview data of quality statistics. The following restrictions apply when using this API:  </p>
     * <ul>
     * <li>You can query data for any time range within the last 365 days (excluding the current day).  </li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If you exceed this limit, your API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain overview data of quality statistics.</p>
     * 
     * @param request DescribeQualityOverallDataRequest
     * @return DescribeQualityOverallDataResponse
     */
    public DescribeQualityOverallDataResponse describeQualityOverallData(DescribeQualityOverallDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQualityOverallDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to query the list of files generated by recording. For example, you can query parameters such as the creation time and recording duration of files generated by recording.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 10 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call this operation reasonably. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls DescribeRecordFiles to query the list of files generated by recording.</p>
     * 
     * @param request DescribeRecordFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecordFilesResponse
     */
    public DescribeRecordFilesResponse describeRecordFilesWithOptions(DescribeRecordFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskIds)) {
            query.put("TaskIds", request.taskIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordFiles"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordFilesResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to query the list of files generated by recording. For example, you can query parameters such as the creation time and recording duration of files generated by recording.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 10 calls per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Please call this operation reasonably. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls DescribeRecordFiles to query the list of files generated by recording.</p>
     * 
     * @param request DescribeRecordFilesRequest
     * @return DescribeRecordFilesResponse
     */
    public DescribeRecordFilesResponse describeRecordFiles(DescribeRecordFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordFilesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording template.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of recording template configurations.</p>
     * 
     * @param request DescribeRecordTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecordTemplatesResponse
     */
    public DescribeRecordTemplatesResponse describeRecordTemplatesWithOptions(DescribeRecordTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateIds)) {
            query.put("TemplateIds", request.templateIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordTemplates"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecordTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording template.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of recording template configurations.</p>
     * 
     * @param request DescribeRecordTemplatesRequest
     * @return DescribeRecordTemplatesResponse
     */
    public DescribeRecordTemplatesResponse describeRecordTemplates(DescribeRecordTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of channel communication records.</p>
     * 
     * @param request DescribeRtcChannelListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRtcChannelListResponse
     */
    public DescribeRtcChannelListResponse describeRtcChannelListWithOptions(DescribeRtcChannelListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceArea)) {
            query.put("ServiceArea", request.serviceArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoint)) {
            query.put("TimePoint", request.timePoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcChannelList"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcChannelListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of channel communication records.</p>
     * 
     * @param request DescribeRtcChannelListRequest
     * @return DescribeRtcChannelListResponse
     */
    public DescribeRtcChannelListResponse describeRtcChannelList(DescribeRtcChannelListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRtcChannelListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of communication records in a channel. You can query data within the last 180 days.</p>
     * 
     * @param request DescribeRtcChannelMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRtcChannelMetricResponse
     */
    public DescribeRtcChannelMetricResponse describeRtcChannelMetricWithOptions(DescribeRtcChannelMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timePoint)) {
            query.put("TimePoint", request.timePoint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcChannelMetric"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcChannelMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of communication records in a channel. You can query data within the last 180 days.</p>
     * 
     * @param request DescribeRtcChannelMetricRequest
     * @return DescribeRtcChannelMetricResponse
     */
    public DescribeRtcChannelMetricResponse describeRtcChannelMetric(DescribeRtcChannelMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRtcChannelMetricWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum query time range is 30 days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the total communication duration for an application within a specified time range. Data is aggregated by audio and video specifications.</p>
     * 
     * @param request DescribeRtcDurationDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRtcDurationDataResponse
     */
    public DescribeRtcDurationDataResponse describeRtcDurationDataWithOptions(DescribeRtcDurationDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceArea)) {
            query.put("ServiceArea", request.serviceArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcDurationData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcDurationDataResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum query time range is 30 days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the total communication duration for an application within a specified time range. Data is aggregated by audio and video specifications.</p>
     * 
     * @param request DescribeRtcDurationDataRequest
     * @return DescribeRtcDurationDataResponse
     */
    public DescribeRtcDurationDataResponse describeRtcDurationData(DescribeRtcDurationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRtcDurationDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum time range that can be queried is 30 days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the peak number of concurrent channels of an application in a specified time range.</p>
     * 
     * @param request DescribeRtcPeakChannelCntDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRtcPeakChannelCntDataResponse
     */
    public DescribeRtcPeakChannelCntDataResponse describeRtcPeakChannelCntDataWithOptions(DescribeRtcPeakChannelCntDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceArea)) {
            query.put("ServiceArea", request.serviceArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcPeakChannelCntData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcPeakChannelCntDataResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum time range that can be queried is 30 days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the peak number of concurrent channels of an application in a specified time range.</p>
     * 
     * @param request DescribeRtcPeakChannelCntDataRequest
     * @return DescribeRtcPeakChannelCntDataResponse
     */
    public DescribeRtcPeakChannelCntDataResponse describeRtcPeakChannelCntData(DescribeRtcPeakChannelCntDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRtcPeakChannelCntDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum time span between the start time and the end time of a data query is 30 days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of active users of an application within a specified time range, that is, the number of user terminals that engaged in communication.</p>
     * 
     * @param request DescribeRtcUserCntDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRtcUserCntDataResponse
     */
    public DescribeRtcUserCntDataResponse describeRtcUserCntDataWithOptions(DescribeRtcUserCntDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceArea)) {
            query.put("ServiceArea", request.serviceArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRtcUserCntData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRtcUserCntDataResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The maximum time span between the start time and the end time of a data query is 30 days.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of active users of an application within a specified time range, that is, the number of user terminals that engaged in communication.</p>
     * 
     * @param request DescribeRtcUserCntDataRequest
     * @return DescribeRtcUserCntDataResponse
     */
    public DescribeRtcUserCntDataResponse describeRtcUserCntData(DescribeRtcUserCntDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRtcUserCntDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the bypass streaming status.</p>
     * 
     * @param request DescribeStreamingOutStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStreamingOutStatusResponse
     */
    public DescribeStreamingOutStatusResponse describeStreamingOutStatusWithOptions(DescribeStreamingOutStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStreamingOutStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStreamingOutStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user for this API operation is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the bypass streaming status.</p>
     * 
     * @param request DescribeStreamingOutStatusRequest
     * @return DescribeStreamingOutStatusResponse
     */
    public DescribeStreamingOutStatusResponse describeStreamingOutStatus(DescribeStreamingOutStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamingOutStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 10 calls per second. Exceeding this limit triggers rate limiting, which may affect your business. Call the API responsibly.</p>
     * 
     * <b>summary</b> : 
     * <p>Built-in system layouts</p>
     * 
     * @param request DescribeSystemLayoutListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSystemLayoutListResponse
     */
    public DescribeSystemLayoutListResponse describeSystemLayoutListWithOptions(DescribeSystemLayoutListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSystemLayoutList"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSystemLayoutListResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The per-user QPS limit for this API is 10 calls per second. Exceeding this limit triggers rate limiting, which may affect your business. Call the API responsibly.</p>
     * 
     * <b>summary</b> : 
     * <p>Built-in system layouts</p>
     * 
     * @param request DescribeSystemLayoutListRequest
     * @return DescribeSystemLayoutListResponse
     */
    public DescribeSystemLayoutListResponse describeSystemLayoutList(DescribeSystemLayoutListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSystemLayoutListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to retrieve the regional distribution data of usage statistics. The following restrictions apply when using this API:</p>
     * <ul>
     * <li>You can query data for any period within the last 365 days (excluding the current day).</li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If you exceed this limit, your API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to retrieve the regional distribution data of usage statistics.</p>
     * 
     * @param request DescribeUsageAreaDistributionStatDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsageAreaDistributionStatDataResponse
     */
    public DescribeUsageAreaDistributionStatDataResponse describeUsageAreaDistributionStatDataWithOptions(DescribeUsageAreaDistributionStatDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentArea)) {
            query.put("ParentArea", request.parentArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsageAreaDistributionStatData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsageAreaDistributionStatDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to retrieve the regional distribution data of usage statistics. The following restrictions apply when using this API:</p>
     * <ul>
     * <li>You can query data for any period within the last 365 days (excluding the current day).</li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If you exceed this limit, your API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to retrieve the regional distribution data of usage statistics.</p>
     * 
     * @param request DescribeUsageAreaDistributionStatDataRequest
     * @return DescribeUsageAreaDistributionStatDataResponse
     */
    public DescribeUsageAreaDistributionStatDataResponse describeUsageAreaDistributionStatData(DescribeUsageAreaDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsageAreaDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the distribution data of usage statistics. When you call this operation, the following limits apply:</p>
     * <ul>
     * <li>You can query data within any time range in the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution data of usage statistics.</p>
     * 
     * @param request DescribeUsageDistributionStatDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsageDistributionStatDataResponse
     */
    public DescribeUsageDistributionStatDataResponse describeUsageDistributionStatDataWithOptions(DescribeUsageDistributionStatDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statDim)) {
            query.put("StatDim", request.statDim);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsageDistributionStatData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsageDistributionStatDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation queries the distribution data of usage statistics. When you call this operation, the following limits apply:</p>
     * <ul>
     * <li>You can query data within any time range in the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the distribution data of usage statistics.</p>
     * 
     * @param request DescribeUsageDistributionStatDataRequest
     * @return DescribeUsageDistributionStatDataResponse
     */
    public DescribeUsageDistributionStatDataResponse describeUsageDistributionStatData(DescribeUsageDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsageDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the distribution data of operating systems and SDK versions in usage statistics. When using this API, the following restrictions apply:  </p>
     * <ul>
     * <li>You can query data for any period within the last 365 days (excluding the current day).  </li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>Rate Limiting</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If you exceed this limit, your API calls will be rate-limited, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the distribution data of operating systems and SDK versions in usage statistics.</p>
     * 
     * @param request DescribeUsageOsSdkVersionDistributionStatDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsageOsSdkVersionDistributionStatDataResponse
     */
    public DescribeUsageOsSdkVersionDistributionStatDataResponse describeUsageOsSdkVersionDistributionStatDataWithOptions(DescribeUsageOsSdkVersionDistributionStatDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsageOsSdkVersionDistributionStatData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsageOsSdkVersionDistributionStatDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to obtain the distribution data of operating systems and SDK versions in usage statistics. When using this API, the following restrictions apply:  </p>
     * <ul>
     * <li>You can query data for any period within the last 365 days (excluding the current day).  </li>
     * <li>If the query range is less than 24 hours, the data is aggregated by hour. If the query range is greater than or equal to 24 hours, the data is aggregated by day.</li>
     * </ul>
     * <h3>Rate Limiting</h3>
     * <p>The queries per second (QPS) limit for this API is 10 requests per second per user. If you exceed this limit, your API calls will be rate-limited, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to obtain the distribution data of operating systems and SDK versions in usage statistics.</p>
     * 
     * @param request DescribeUsageOsSdkVersionDistributionStatDataRequest
     * @return DescribeUsageOsSdkVersionDistributionStatDataResponse
     */
    public DescribeUsageOsSdkVersionDistributionStatDataResponse describeUsageOsSdkVersionDistributionStatData(DescribeUsageOsSdkVersionDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsageOsSdkVersionDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the overview data of usage statistics. The following limits apply when you call this operation:</p>
     * <ul>
     * <li>You can query data for any time range within the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the overview data of usage statistics.</p>
     * 
     * @param request DescribeUsageOverallDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsageOverallDataResponse
     */
    public DescribeUsageOverallDataResponse describeUsageOverallDataWithOptions(DescribeUsageOverallDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.types)) {
            query.put("Types", request.types);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsageOverallData"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsageOverallDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation retrieves the overview data of usage statistics. The following limits apply when you call this operation:</p>
     * <ul>
     * <li>You can query data for any time range within the last 365 days, excluding the current day.</li>
     * <li>If the query time range is less than 24 hours, the data is aggregated by hour. If the query time range is 24 hours or more, the data is aggregated by day.</li>
     * </ul>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the overview data of usage statistics.</p>
     * 
     * @param request DescribeUsageOverallDataRequest
     * @return DescribeUsageOverallDataResponse
     */
    public DescribeUsageOverallDataResponse describeUsageOverallData(DescribeUsageOverallDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsageOverallDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to query the real-time information of a user in a channel. For example, you can query information such as the user role type and the time of joining the meeting.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 100 times per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls DescribeUserInfoInChannel to query the real-time information of a user in a channel.</p>
     * 
     * @param request DescribeUserInfoInChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserInfoInChannelResponse
     */
    public DescribeUserInfoInChannelResponse describeUserInfoInChannelWithOptions(DescribeUserInfoInChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserInfoInChannel"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserInfoInChannelResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to query the real-time information of a user in a channel. For example, you can query information such as the user role type and the time of joining the meeting.</p>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this operation is 100 times per second. If the limit is exceeded, API calls will be throttled, which may affect your business. Call this operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls DescribeUserInfoInChannel to query the real-time information of a user in a channel.</p>
     * 
     * @param request DescribeUserInfoInChannelRequest
     * @return DescribeUserInfoInChannelResponse
     */
    public DescribeUserInfoInChannelResponse describeUserInfoInChannel(DescribeUserInfoInChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserInfoInChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit per user is 1,000 requests per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the automatic bypass single-stream relay rule.</p>
     * 
     * @param request DisableAutoLiveStreamRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAutoLiveStreamRuleResponse
     */
    public DisableAutoLiveStreamRuleResponse disableAutoLiveStreamRuleWithOptions(DisableAutoLiveStreamRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAutoLiveStreamRuleResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit per user is 1,000 requests per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables the automatic bypass single-stream relay rule.</p>
     * 
     * @param request DisableAutoLiveStreamRuleRequest
     * @return DisableAutoLiveStreamRuleResponse
     */
    public DisableAutoLiveStreamRuleResponse disableAutoLiveStreamRule(DisableAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit per user for this operation is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the automatic bypass single-stream relay rule.</p>
     * 
     * @param request EnableAutoLiveStreamRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAutoLiveStreamRuleResponse
     */
    public EnableAutoLiveStreamRuleResponse enableAutoLiveStreamRuleWithOptions(EnableAutoLiveStreamRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAutoLiveStreamRuleResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit per user for this operation is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the automatic bypass single-stream relay rule.</p>
     * 
     * @param request EnableAutoLiveStreamRuleRequest
     * @return EnableAutoLiveStreamRuleResponse
     */
    public EnableAutoLiveStreamRuleResponse enableAutoLiveStreamRule(EnableAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetAgent.</p>
     * 
     * @param request GetAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgentWithOptions(GetAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgent"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetAgent.</p>
     * 
     * @param request GetAgentRequest
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> to start a bypass transcoding task.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 4,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the status of a bypass transcoding task.</p>
     * 
     * @param request GetMPUTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMPUTaskStatusResponse
     */
    public GetMPUTaskStatusResponse getMPUTaskStatusWithOptions(GetMPUTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMPUTaskStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMPUTaskStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> to start a bypass transcoding task.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 4,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the status of a bypass transcoding task.</p>
     * 
     * @param request GetMPUTaskStatusRequest
     * @return GetMPUTaskStatusResponse
     */
    public GetMPUTaskStatusResponse getMPUTaskStatus(GetMPUTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMPUTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h4>Usage notes</h4>
     * <p>This operation modifies the name of a specified application.</p>
     * <h4>QPS limit</h4>
     * <p>The queries per second (QPS) limit per user for this operation is 200 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name of a specified application.</p>
     * 
     * @param request ModifyAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApp"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppResponse());
    }

    /**
     * <b>description</b> :
     * <h4>Usage notes</h4>
     * <p>This operation modifies the name of a specified application.</p>
     * <h4>QPS limit</h4>
     * <p>The queries per second (QPS) limit per user for this operation is 200 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the name of a specified application.</p>
     * 
     * @param request ModifyAppRequest
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the agent feature switch for an application.</p>
     * 
     * @param request ModifyAppAgentFunctionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppAgentFunctionStatusResponse
     */
    public ModifyAppAgentFunctionStatusResponse modifyAppAgentFunctionStatusWithOptions(ModifyAppAgentFunctionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppAgentFunctionStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppAgentFunctionStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the agent feature switch for an application.</p>
     * 
     * @param request ModifyAppAgentFunctionStatusRequest
     * @return ModifyAppAgentFunctionStatusResponse
     */
    public ModifyAppAgentFunctionStatusResponse modifyAppAgentFunctionStatus(ModifyAppAgentFunctionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppAgentFunctionStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an application agent template.</p>
     * 
     * @param tmpReq ModifyAppAgentTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppAgentTemplateResponse
     */
    public ModifyAppAgentTemplateResponse modifyAppAgentTemplateWithOptions(ModifyAppAgentTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppAgentTemplateShrinkRequest request = new ModifyAppAgentTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.agentSilenceConfig)) {
            request.agentSilenceConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.agentSilenceConfig, "AgentSilenceConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ambientSoundConfig)) {
            request.ambientSoundConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ambientSoundConfig, "AmbientSoundConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.asrConfig)) {
            request.asrConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.asrConfig, "AsrConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backChannelConfig)) {
            request.backChannelConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backChannelConfig, "BackChannelConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.interruptConfig)) {
            request.interruptConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.interruptConfig, "InterruptConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.llmConfig)) {
            request.llmConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.llmConfig, "LlmConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ttsConfig)) {
            request.ttsConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ttsConfig, "TtsConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSilenceConfigShrink)) {
            query.put("AgentSilenceConfig", request.agentSilenceConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ambientSoundConfigShrink)) {
            query.put("AmbientSoundConfig", request.ambientSoundConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.asrConfigShrink)) {
            query.put("AsrConfig", request.asrConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backChannelConfigShrink)) {
            query.put("BackChannelConfig", request.backChannelConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatMode)) {
            query.put("ChatMode", request.chatMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableVideoUnderstanding)) {
            query.put("EnableVideoUnderstanding", request.enableVideoUnderstanding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.greeting)) {
            query.put("Greeting", request.greeting);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interruptConfigShrink)) {
            query.put("InterruptConfig", request.interruptConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interruptMode)) {
            query.put("InterruptMode", request.interruptMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmConfigShrink)) {
            query.put("LlmConfig", request.llmConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferVideo)) {
            query.put("PreferVideo", request.preferVideo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttsConfigShrink)) {
            query.put("TtsConfig", request.ttsConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppAgentTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppAgentTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an application agent template.</p>
     * 
     * @param request ModifyAppAgentTemplateRequest
     * @return ModifyAppAgentTemplateResponse
     */
    public ModifyAppAgentTemplateResponse modifyAppAgentTemplate(ModifyAppAgentTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppAgentTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user for this API operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the callback event switch for an application.</p>
     * 
     * @param request ModifyAppCallbackStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppCallbackStatusResponse
     */
    public ModifyAppCallbackStatusResponse modifyAppCallbackStatusWithOptions(ModifyAppCallbackStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppCallbackStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppCallbackStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user for this API operation is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the callback event switch for an application.</p>
     * 
     * @param request ModifyAppCallbackStatusRequest
     * @return ModifyAppCallbackStatusResponse
     */
    public ModifyAppCallbackStatusResponse modifyAppCallbackStatus(ModifyAppCallbackStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppCallbackStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>This API supports a maximum of 10 calls per second per user. Exceeding this limit triggers rate limiting, which may impact your business operations. Use the API judiciously.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify a custom application layout.</p>
     * 
     * @param tmpReq ModifyAppLayoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppLayoutResponse
     */
    public ModifyAppLayoutResponse modifyAppLayoutWithOptions(ModifyAppLayoutRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppLayoutShrinkRequest request = new ModifyAppLayoutShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.layout)) {
            request.layoutShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.layout, "Layout", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutShrink)) {
            query.put("Layout", request.layoutShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppLayout"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppLayoutResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>This API supports a maximum of 10 calls per second per user. Exceeding this limit triggers rate limiting, which may impact your business operations. Use the API judiciously.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify a custom application layout.</p>
     * 
     * @param request ModifyAppLayoutRequest
     * @return ModifyAppLayoutResponse
     */
    public ModifyAppLayoutResponse modifyAppLayout(ModifyAppLayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppLayoutWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user per second. If the limit is exceeded, API calls will be subject to Rate Limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the bypass toggle of an application</p>
     * 
     * @param request ModifyAppLiveStreamStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppLiveStreamStatusResponse
     */
    public ModifyAppLiveStreamStatusResponse modifyAppLiveStreamStatusWithOptions(ModifyAppLiveStreamStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppLiveStreamStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppLiveStreamStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Queries per second (QPS) limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user per second. If the limit is exceeded, API calls will be subject to Rate Limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the bypass toggle of an application</p>
     * 
     * @param request ModifyAppLiveStreamStatusRequest
     * @return ModifyAppLiveStreamStatusResponse
     */
    public ModifyAppLiveStreamStatusResponse modifyAppLiveStreamStatus(ModifyAppLiveStreamStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppLiveStreamStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the recording switch of an application.</p>
     * 
     * @param request ModifyAppRecordStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppRecordStatusResponse
     */
    public ModifyAppRecordStatusResponse modifyAppRecordStatusWithOptions(ModifyAppRecordStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppRecordStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppRecordStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit per user for this API operation is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the recording switch of an application.</p>
     * 
     * @param request ModifyAppRecordStatusRequest
     * @return ModifyAppRecordStatusResponse
     */
    public ModifyAppRecordStatusResponse modifyAppRecordStatus(ModifyAppRecordStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppRecordStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 calls per second per user. If you exceed this limit, rate limiting is triggered, which might affect your service. Call the API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify an application recording template.</p>
     * 
     * @param tmpReq ModifyAppRecordTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppRecordTemplateResponse
     */
    public ModifyAppRecordTemplateResponse modifyAppRecordTemplateWithOptions(ModifyAppRecordTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppRecordTemplateShrinkRequest request = new ModifyAppRecordTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recordTemplate)) {
            request.recordTemplateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recordTemplate, "RecordTemplate", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordTemplateShrink)) {
            query.put("RecordTemplate", request.recordTemplateShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppRecordTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppRecordTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 calls per second per user. If you exceed this limit, rate limiting is triggered, which might affect your service. Call the API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify an application recording template.</p>
     * 
     * @param request ModifyAppRecordTemplateRequest
     * @return ModifyAppRecordTemplateResponse
     */
    public ModifyAppRecordTemplateResponse modifyAppRecordTemplate(ModifyAppRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API modifies the stream ingest template for an RTC 3.0 application.  </p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If you exceed this limit, your API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the stream ingest template for an RTC 3.0 application.</p>
     * 
     * @param tmpReq ModifyAppStreamingOutTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppStreamingOutTemplateResponse
     */
    public ModifyAppStreamingOutTemplateResponse modifyAppStreamingOutTemplateWithOptions(ModifyAppStreamingOutTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppStreamingOutTemplateShrinkRequest request = new ModifyAppStreamingOutTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.streamingOutTemplate)) {
            request.streamingOutTemplateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.streamingOutTemplate, "StreamingOutTemplate", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamingOutTemplateShrink)) {
            query.put("StreamingOutTemplate", request.streamingOutTemplateShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppStreamingOutTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppStreamingOutTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API modifies the stream ingest template for an RTC 3.0 application.  </p>
     * <h3>QPS Limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If you exceed this limit, your API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the stream ingest template for an RTC 3.0 application.</p>
     * 
     * @param request ModifyAppStreamingOutTemplateRequest
     * @return ModifyAppStreamingOutTemplateResponse
     */
    public ModifyAppStreamingOutTemplateResponse modifyAppStreamingOutTemplate(ModifyAppStreamingOutTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppStreamingOutTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the merging switch.</p>
     * 
     * @param request ModifyAppViewStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppViewStatusResponse
     */
    public ModifyAppViewStatusResponse modifyAppViewStatusWithOptions(ModifyAppViewStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppViewStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppViewStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the merging switch.</p>
     * 
     * @param request ModifyAppViewStatusRequest
     * @return ModifyAppViewStatusResponse
     */
    public ModifyAppViewStatusResponse modifyAppViewStatus(ModifyAppViewStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppViewStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>This API supports up to 10 calls per second per user. Exceeding this limit triggers rate limiting, which may affect your business. Use this API with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Update an application view template.</p>
     * 
     * @param tmpReq ModifyAppViewTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppViewTemplateResponse
     */
    public ModifyAppViewTemplateResponse modifyAppViewTemplateWithOptions(ModifyAppViewTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppViewTemplateShrinkRequest request = new ModifyAppViewTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.template)) {
            request.templateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.template, "Template", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateShrink)) {
            query.put("Template", request.templateShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppViewTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppViewTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>This API supports up to 10 calls per second per user. Exceeding this limit triggers rate limiting, which may affect your business. Use this API with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Update an application view template.</p>
     * 
     * @param request ModifyAppViewTemplateRequest
     * @return ModifyAppViewTemplateResponse
     */
    public ModifyAppViewTemplateResponse modifyAppViewTemplate(ModifyAppViewTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppViewTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the callback configuration of an application.</p>
     * 
     * @param tmpReq ModifyCallbackMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCallbackMetaResponse
     */
    public ModifyCallbackMetaResponse modifyCallbackMetaWithOptions(ModifyCallbackMetaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyCallbackMetaShrinkRequest request = new ModifyCallbackMetaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callback)) {
            request.callbackShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callback, "Callback", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackShrink)) {
            query.put("Callback", request.callbackShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCallbackMeta"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCallbackMetaResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the callback configuration of an application.</p>
     * 
     * @param request ModifyCallbackMetaRequest
     * @return ModifyCallbackMetaResponse
     */
    public ModifyCallbackMetaResponse modifyCallbackMeta(ModifyCallbackMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCallbackMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the hotwords table for meeting minutes.</p>
     * 
     * @param tmpReq ModifyCloudNotePhrasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCloudNotePhrasesResponse
     */
    public ModifyCloudNotePhrasesResponse modifyCloudNotePhrasesWithOptions(ModifyCloudNotePhrasesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyCloudNotePhrasesShrinkRequest request = new ModifyCloudNotePhrasesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phrase)) {
            request.phraseShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phrase, "Phrase", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phraseShrink)) {
            query.put("Phrase", request.phraseShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCloudNotePhrases"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCloudNotePhrasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the hotwords table for meeting minutes.</p>
     * 
     * @param request ModifyCloudNotePhrasesRequest
     * @return ModifyCloudNotePhrasesResponse
     */
    public ModifyCloudNotePhrasesResponse modifyCloudNotePhrases(ModifyCloudNotePhrasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCloudNotePhrasesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/162192.html">CreateMPULayout</a> to create a bypass live streaming layout.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a bypass live streaming layout.</p>
     * 
     * @param request ModifyMPULayoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMPULayoutResponse
     */
    public ModifyMPULayoutResponse modifyMPULayoutWithOptions(ModifyMPULayoutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audioMixCount)) {
            query.put("AudioMixCount", request.audioMixCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutId)) {
            query.put("LayoutId", request.layoutId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.panes)) {
            query.put("Panes", request.panes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMPULayout"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMPULayoutResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/162192.html">CreateMPULayout</a> to create a bypass live streaming layout.</p>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a bypass live streaming layout.</p>
     * 
     * @param request ModifyMPULayoutRequest
     * @return ModifyMPULayoutResponse
     */
    public ModifyMPULayoutResponse modifyMPULayout(ModifyMPULayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMPULayoutWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the stream properties.</p>
     * 
     * @param tmpReq ModifyStreamingPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyStreamingPropertyResponse
     */
    public ModifyStreamingPropertyResponse modifyStreamingPropertyWithOptions(ModifyStreamingPropertyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyStreamingPropertyShrinkRequest request = new ModifyStreamingPropertyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.viewSubscribers)) {
            request.viewSubscribersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.viewSubscribers, "ViewSubscribers", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewContent)) {
            query.put("ViewContent", request.viewContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewSubscribersShrink)) {
            query.put("ViewSubscribers", request.viewSubscribersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyStreamingProperty"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyStreamingPropertyResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the stream properties.</p>
     * 
     * @param request ModifyStreamingPropertyRequest
     * @return ModifyStreamingPropertyResponse
     */
    public ModifyStreamingPropertyResponse modifyStreamingProperty(ModifyStreamingPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyStreamingPropertyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the mixed stream layout.</p>
     * 
     * @param tmpReq ModifyViewLayoutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyViewLayoutResponse
     */
    public ModifyViewLayoutResponse modifyViewLayoutWithOptions(ModifyViewLayoutRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyViewLayoutShrinkRequest request = new ModifyViewLayoutShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.layoutSpecifiedUsers)) {
            request.layoutSpecifiedUsersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.layoutSpecifiedUsers, "LayoutSpecifiedUsers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgrounds)) {
            query.put("Backgrounds", request.backgrounds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clockWidgets)) {
            query.put("ClockWidgets", request.clockWidgets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.images)) {
            query.put("Images", request.images);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutSpecifiedUsersShrink)) {
            query.put("LayoutSpecifiedUsers", request.layoutSpecifiedUsersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.panes)) {
            query.put("Panes", request.panes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.texts)) {
            query.put("Texts", request.texts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyViewLayout"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyViewLayoutResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit per user is 10 calls per second. If this limit is exceeded, API calls are throttled, which may affect your services. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the mixed stream layout.</p>
     * 
     * @param request ModifyViewLayoutRequest
     * @return ModifyViewLayoutResponse
     */
    public ModifyViewLayoutResponse modifyViewLayout(ModifyViewLayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyViewLayoutWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>NotifyAgent</p>
     * 
     * @param tmpReq NotifyAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return NotifyAgentResponse
     */
    public NotifyAgentResponse notifyAgentWithOptions(NotifyAgentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        NotifyAgentShrinkRequest request = new NotifyAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backgroundMusic)) {
            request.backgroundMusicShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backgroundMusic, "BackgroundMusic", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundMusicShrink)) {
            query.put("BackgroundMusic", request.backgroundMusicShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAttribute)) {
            query.put("CustomAttribute", request.customAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interruptable)) {
            query.put("Interruptable", request.interruptable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NotifyAgent"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new NotifyAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>NotifyAgent</p>
     * 
     * @param request NotifyAgentRequest
     * @return NotifyAgentResponse
     */
    public NotifyAgentResponse notifyAgent(NotifyAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.notifyAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This API removes specified end users from a channel.</p>
     * <h1>QPS limit</h1>
     * <p>The queries per second (QPS) limit for this API is 1,000 calls per minute per user. If you exceed the limit, API calls are subject to rate limiting, which may affect your business. Call this API at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the RemoveTerminals operation to remove specified end users from a channel.</p>
     * 
     * @param request RemoveTerminalsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveTerminalsResponse
     */
    public RemoveTerminalsResponse removeTerminalsWithOptions(RemoveTerminalsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.terminalIds)) {
            query.put("TerminalIds", request.terminalIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTerminals"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveTerminalsResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This API removes specified end users from a channel.</p>
     * <h1>QPS limit</h1>
     * <p>The queries per second (QPS) limit for this API is 1,000 calls per minute per user. If you exceed the limit, API calls are subject to rate limiting, which may affect your business. Call this API at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the RemoveTerminals operation to remove specified end users from a channel.</p>
     * 
     * @param request RemoveTerminalsRequest
     * @return RemoveTerminalsResponse
     */
    public RemoveTerminalsResponse removeTerminals(RemoveTerminalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTerminalsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to kick users out of an online channel.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. If the limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>RemoveUsers</p>
     * 
     * @param request RemoveUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUsersResponse
     */
    public RemoveUsersResponse removeUsersWithOptions(RemoveUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            query.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUsers"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUsersResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to kick users out of an online channel.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. If the limit is exceeded, API calls will be subject to Rate Limiting, which may Impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>RemoveUsers</p>
     * 
     * @param request RemoveUsersRequest
     * @return RemoveUsersResponse
     */
    public RemoveUsersResponse removeUsers(RemoveUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If you exceed this limit, API calls are subject to rate limiting, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a SIP invite.</p>
     * 
     * @param request RtcCancelSipInviteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RtcCancelSipInviteResponse
     */
    public RtcCancelSipInviteResponse rtcCancelSipInviteWithOptions(RtcCancelSipInviteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RtcCancelSipInvite"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RtcCancelSipInviteResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for this API is 10 per user. If you exceed this limit, API calls are subject to rate limiting, which may affect your business. Call this API at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a SIP invite.</p>
     * 
     * @param request RtcCancelSipInviteRequest
     * @return RtcCancelSipInviteResponse
     */
    public RtcCancelSipInviteResponse rtcCancelSipInvite(RtcCancelSipInviteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rtcCancelSipInviteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends DTMF key signals to a target OneRTC SIP call in a specified channel.</p>
     * 
     * @param request RtcSendSipDtmfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RtcSendSipDtmfResponse
     */
    public RtcSendSipDtmfResponse rtcSendSipDtmfWithOptions(RtcSendSipDtmfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelUserId)) {
            query.put("ChannelUserId", request.channelUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digits)) {
            query.put("Digits", request.digits);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RtcSendSipDtmf"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RtcSendSipDtmfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sends DTMF key signals to a target OneRTC SIP call in a specified channel.</p>
     * 
     * @param request RtcSendSipDtmfRequest
     * @return RtcSendSipDtmfResponse
     */
    public RtcSendSipDtmfResponse rtcSendSipDtmf(RtcSendSipDtmfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rtcSendSipDtmfWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Rate limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Invites a SIP endpoint to join a channel.</p>
     * 
     * @param request RtcSipInviteMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RtcSipInviteMemberResponse
     */
    public RtcSipInviteMemberResponse rtcSipInviteMemberWithOptions(RtcSipInviteMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appToken)) {
            query.put("AppToken", request.appToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callNumber)) {
            query.put("CallNumber", request.callNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            query.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registered)) {
            query.put("Registered", request.registered);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverAddress)) {
            query.put("ServerAddress", request.serverAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sipDisplayName)) {
            query.put("SipDisplayName", request.sipDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sipRoomId)) {
            query.put("SipRoomId", request.sipRoomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sipUri)) {
            query.put("SipUri", request.sipUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sipUserAgent)) {
            query.put("SipUserAgent", request.sipUserAgent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sipUserId)) {
            query.put("SipUserId", request.sipUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sipUserPassword)) {
            query.put("SipUserPassword", request.sipUserPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RtcSipInviteMember"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RtcSipInviteMemberResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Rate limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Invites a SIP endpoint to join a channel.</p>
     * 
     * @param request RtcSipInviteMemberRequest
     * @return RtcSipInviteMemberResponse
     */
    public RtcSipInviteMemberResponse rtcSipInviteMember(RtcSipInviteMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rtcSipInviteMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Mutes or unmutes the microphone for a SIP endpoint.</p>
     * 
     * @param request RtcSipMuteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RtcSipMuteResponse
     */
    public RtcSipMuteResponse rtcSipMuteWithOptions(RtcSipMuteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operations)) {
            query.put("Operations", request.operations);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RtcSipMute"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RtcSipMuteResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call this API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Mutes or unmutes the microphone for a SIP endpoint.</p>
     * 
     * @param request RtcSipMuteRequest
     * @return RtcSipMuteResponse
     */
    public RtcSipMuteResponse rtcSipMute(RtcSipMuteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rtcSipMuteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an AI agent.</p>
     * 
     * @param tmpReq StartAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAgentResponse
     */
    public StartAgentResponse startAgentWithOptions(StartAgentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartAgentShrinkRequest request = new StartAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rtcConfig)) {
            request.rtcConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rtcConfig, "RtcConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.voiceChatConfig)) {
            request.voiceChatConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.voiceChatConfig, "VoiceChatConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rtcConfigShrink)) {
            query.put("RtcConfig", request.rtcConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceChatConfigShrink)) {
            query.put("VoiceChatConfig", request.voiceChatConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAgent"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an AI agent.</p>
     * 
     * @param request StartAgentRequest
     * @return StartAgentResponse
     */
    public StartAgentResponse startAgent(StartAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for this API is 10 calls per second per user. If you exceed the limit, API calls are subject to rate limiting, which may affect your business. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts an event callback.</p>
     * 
     * @param tmpReq StartCategoryCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartCategoryCallbackResponse
     */
    public StartCategoryCallbackResponse startCategoryCallbackWithOptions(StartCategoryCallbackRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartCategoryCallbackShrinkRequest request = new StartCategoryCallbackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callback)) {
            request.callbackShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callback, "Callback", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackShrink)) {
            query.put("Callback", request.callbackShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCategoryCallback"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCategoryCallbackResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for this API is 10 calls per second per user. If you exceed the limit, API calls are subject to rate limiting, which may affect your business. Call the API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts an event callback.</p>
     * 
     * @param request StartCategoryCallbackRequest
     * @return StartCategoryCallbackResponse
     */
    public StartCategoryCallbackResponse startCategoryCallback(StartCategoryCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCategoryCallbackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation starts a meeting minutes task for an online channel. If you need meeting minutes and subtitles, enable all features.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable frequency.</p>
     * <blockquote>
     * <p>Concurrency limits</p>
     * <ul>
     * <li>Only one meeting minutes task can run in the same channel at a time.</li>
     * <li>You can start and stop meeting minutes tasks multiple times in the same channel, but the TaskId must be different each time.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Starts an intelligent meeting minutes task.</p>
     * 
     * @param tmpReq StartCloudNoteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartCloudNoteResponse
     */
    public StartCloudNoteResponse startCloudNoteWithOptions(StartCloudNoteRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartCloudNoteShrinkRequest request = new StartCloudNoteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.autoChapters)) {
            request.autoChaptersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.autoChapters, "AutoChapters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customPrompt)) {
            request.customPromptShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customPrompt, "CustomPrompt", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.meetingAssistance)) {
            request.meetingAssistanceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.meetingAssistance, "MeetingAssistance", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.realtimeSubtitle)) {
            request.realtimeSubtitleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.realtimeSubtitle, "RealtimeSubtitle", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serviceInspection)) {
            request.serviceInspectionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serviceInspection, "ServiceInspection", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.summarization)) {
            request.summarizationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.summarization, "Summarization", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.textPolish)) {
            request.textPolishShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.textPolish, "TextPolish", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transcription)) {
            request.transcriptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transcription, "Transcription", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoChaptersShrink)) {
            query.put("AutoChapters", request.autoChaptersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPromptShrink)) {
            query.put("CustomPrompt", request.customPromptShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageHints)) {
            query.put("LanguageHints", request.languageHints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.meetingAssistanceShrink)) {
            query.put("MeetingAssistance", request.meetingAssistanceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realtimeSubtitleShrink)) {
            query.put("RealtimeSubtitle", request.realtimeSubtitleShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceInspectionShrink)) {
            query.put("ServiceInspection", request.serviceInspectionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceLanguage)) {
            query.put("SourceLanguage", request.sourceLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageConfig)) {
            query.put("StorageConfig", request.storageConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.summarizationShrink)) {
            query.put("Summarization", request.summarizationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textPolishShrink)) {
            query.put("TextPolish", request.textPolishShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transcriptionShrink)) {
            query.put("Transcription", request.transcriptionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCloudNote"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCloudNoteResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation starts a meeting minutes task for an online channel. If you need meeting minutes and subtitles, enable all features.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit per user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable frequency.</p>
     * <blockquote>
     * <p>Concurrency limits</p>
     * <ul>
     * <li>Only one meeting minutes task can run in the same channel at a time.</li>
     * <li>You can start and stop meeting minutes tasks multiple times in the same channel, but the TaskId must be different each time.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Starts an intelligent meeting minutes task.</p>
     * 
     * @param request StartCloudNoteRequest
     * @return StartCloudNoteResponse
     */
    public StartCloudNoteResponse startCloudNote(StartCloudNoteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCloudNoteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation starts a cloud recording task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a cloud recording task.</p>
     * 
     * @param tmpReq StartCloudRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartCloudRecordResponse
     */
    public StartCloudRecordResponse startCloudRecordWithOptions(StartCloudRecordRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartCloudRecordShrinkRequest request = new StartCloudRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.layoutSpecifiedUsers)) {
            request.layoutSpecifiedUsersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.layoutSpecifiedUsers, "LayoutSpecifiedUsers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.singleStreamingRecord)) {
            request.singleStreamingRecordShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.singleStreamingRecord, "SingleStreamingRecord", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotation)) {
            query.put("Annotation", request.annotation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgrounds)) {
            query.put("Backgrounds", request.backgrounds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgColor)) {
            query.put("BgColor", request.bgColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clockWidgets)) {
            query.put("ClockWidgets", request.clockWidgets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cropMode)) {
            query.put("CropMode", request.cropMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.images)) {
            query.put("Images", request.images);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutSpecifiedUsersShrink)) {
            query.put("LayoutSpecifiedUsers", request.layoutSpecifiedUsersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.panes)) {
            query.put("Panes", request.panes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordMode)) {
            query.put("RecordMode", request.recordMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionColor)) {
            query.put("RegionColor", request.regionColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservePaneForNoCameraUser)) {
            query.put("ReservePaneForNoCameraUser", request.reservePaneForNoCameraUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDefaultBackgroundOnMute)) {
            query.put("ShowDefaultBackgroundOnMute", request.showDefaultBackgroundOnMute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.singleStreamingRecordShrink)) {
            query.put("SingleStreamingRecord", request.singleStreamingRecordShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWithoutChannel)) {
            query.put("StartWithoutChannel", request.startWithoutChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWithoutChannelWaitTime)) {
            query.put("StartWithoutChannelWaitTime", request.startWithoutChannelWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageConfig)) {
            query.put("StorageConfig", request.storageConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subHighResolutionStream)) {
            query.put("SubHighResolutionStream", request.subHighResolutionStream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.texts)) {
            query.put("Texts", request.texts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCloudRecord"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartCloudRecordResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation starts a cloud recording task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a cloud recording task.</p>
     * 
     * @param request StartCloudRecordRequest
     * @return StartCloudRecordResponse
     */
    public StartCloudRecordResponse startCloudRecord(StartCloudRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCloudRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to start a bypass relaying task. When you use the bypass relaying service, ApsaraVideo Live has the following limits:
     * &lt;props=&quot;china&quot;&gt;- For the concurrency limit on tasks, see <a href="https://help.aliyun.com/document_detail/71050.html#section-eaz-anq-a47">Concurrency limits</a>. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a> two weeks in advance.
     * &lt;props=&quot;intl&quot;&gt;- For the concurrency limit on tasks, see <a href="https://www.alibabacloud.com/help/rtc-61399/latest/60e652#section-eaz-anq-a47">Concurrency limits</a>. If you have special requirements, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a> two weeks in advance.</p>
     * <ul>
     * <li>If the transcoding feature is disabled, each account can concurrently push up to 20 original-quality live streams per live streaming accelerated domain name by default. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</li>
     * <li>If the transcoding feature is enabled, each account can concurrently push up to 10 transcoded live streams per live streaming accelerated domain name by default. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user calling this operation is 500 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a bypass relaying task.</p>
     * 
     * @param request StartMPUTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartMPUTaskResponse
     */
    public StartMPUTaskResponse startMPUTaskWithOptions(StartMPUTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundColor)) {
            query.put("BackgroundColor", request.backgroundColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgrounds)) {
            query.put("Backgrounds", request.backgrounds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clockWidgets)) {
            query.put("ClockWidgets", request.clockWidgets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cropMode)) {
            query.put("CropMode", request.cropMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutIds)) {
            query.put("LayoutIds", request.layoutIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaEncode)) {
            query.put("MediaEncode", request.mediaEncode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mixMode)) {
            query.put("MixMode", request.mixMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadType)) {
            query.put("PayloadType", request.payloadType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportVad)) {
            query.put("ReportVad", request.reportVad);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rtpExtInfo)) {
            query.put("RtpExtInfo", request.rtpExtInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamURL)) {
            query.put("StreamURL", request.streamURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecAudioUsers)) {
            query.put("SubSpecAudioUsers", request.subSpecAudioUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecCameraUsers)) {
            query.put("SubSpecCameraUsers", request.subSpecCameraUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecShareScreenUsers)) {
            query.put("SubSpecShareScreenUsers", request.subSpecShareScreenUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecUsers)) {
            query.put("SubSpecUsers", request.subSpecUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStampRef)) {
            query.put("TimeStampRef", request.timeStampRef);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecAudioUsers)) {
            query.put("UnsubSpecAudioUsers", request.unsubSpecAudioUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecCameraUsers)) {
            query.put("UnsubSpecCameraUsers", request.unsubSpecCameraUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecShareScreenUsers)) {
            query.put("UnsubSpecShareScreenUsers", request.unsubSpecShareScreenUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPanes)) {
            query.put("UserPanes", request.userPanes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vadInterval)) {
            query.put("VadInterval", request.vadInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarks)) {
            query.put("Watermarks", request.watermarks);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enhancedParam)) {
            bodyFlat.put("EnhancedParam", request.enhancedParam);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartMPUTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartMPUTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>This operation is used to start a bypass relaying task. When you use the bypass relaying service, ApsaraVideo Live has the following limits:
     * &lt;props=&quot;china&quot;&gt;- For the concurrency limit on tasks, see <a href="https://help.aliyun.com/document_detail/71050.html#section-eaz-anq-a47">Concurrency limits</a>. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a> two weeks in advance.
     * &lt;props=&quot;intl&quot;&gt;- For the concurrency limit on tasks, see <a href="https://www.alibabacloud.com/help/rtc-61399/latest/60e652#section-eaz-anq-a47">Concurrency limits</a>. If you have special requirements, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a> two weeks in advance.</p>
     * <ul>
     * <li>If the transcoding feature is disabled, each account can concurrently push up to 20 original-quality live streams per live streaming accelerated domain name by default. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</li>
     * <li>If the transcoding feature is enabled, each account can concurrently push up to 10 transcoded live streams per live streaming accelerated domain name by default. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user calling this operation is 500 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a bypass relaying task.</p>
     * 
     * @param request StartMPUTaskRequest
     * @return StartMPUTaskResponse
     */
    public StartMPUTaskResponse startMPUTask(StartMPUTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMPUTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording configuration template.
     * &lt;props=&quot;china&quot;&gt;- By default, you can start a maximum of 100 recording tasks at the same time. If the limit is exceeded, new recording tasks become unavailable. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.
     * &lt;props=&quot;intl&quot;&gt;- By default, you can start a maximum of 100 recording tasks at the same time. If the limit is exceeded, new recording tasks become unavailable. If you have special requirements, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 500 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a video recording task.</p>
     * 
     * @param request StartRecordTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartRecordTaskResponse
     */
    public StartRecordTaskResponse startRecordTaskWithOptions(StartRecordTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cropMode)) {
            query.put("CropMode", request.cropMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutIds)) {
            query.put("LayoutIds", request.layoutIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaEncode)) {
            query.put("MediaEncode", request.mediaEncode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mixMode)) {
            query.put("MixMode", request.mixMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecAudioUsers)) {
            query.put("SubSpecAudioUsers", request.subSpecAudioUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecCameraUsers)) {
            query.put("SubSpecCameraUsers", request.subSpecCameraUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecShareScreenUsers)) {
            query.put("SubSpecShareScreenUsers", request.subSpecShareScreenUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecUsers)) {
            query.put("SubSpecUsers", request.subSpecUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskProfile)) {
            query.put("TaskProfile", request.taskProfile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecAudioUsers)) {
            query.put("UnsubSpecAudioUsers", request.unsubSpecAudioUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecCameraUsers)) {
            query.put("UnsubSpecCameraUsers", request.unsubSpecCameraUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecShareScreenUsers)) {
            query.put("UnsubSpecShareScreenUsers", request.unsubSpecShareScreenUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPanes)) {
            query.put("UserPanes", request.userPanes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRecordTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRecordTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording configuration template.
     * &lt;props=&quot;china&quot;&gt;- By default, you can start a maximum of 100 recording tasks at the same time. If the limit is exceeded, new recording tasks become unavailable. If you have special requirements, <a href="https://selfservice.console.aliyun.com/ticket/createIndex">submit a ticket</a>.
     * &lt;props=&quot;intl&quot;&gt;- By default, you can start a maximum of 100 recording tasks at the same time. If the limit is exceeded, new recording tasks become unavailable. If you have special requirements, <a href="https://workorder-intl.console.aliyun.com/#/ticket/createIndex">submit a ticket</a>.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit for a single user is 500 queries per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a video recording task.</p>
     * 
     * @param request StartRecordTaskRequest
     * @return StartRecordTaskResponse
     */
    public StartRecordTaskResponse startRecordTask(StartRecordTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRecordTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation starts a bypass streaming task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a bypass streaming task.</p>
     * 
     * @param tmpReq StartStreamingOutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartStreamingOutResponse
     */
    public StartStreamingOutResponse startStreamingOutWithOptions(StartStreamingOutRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartStreamingOutShrinkRequest request = new StartStreamingOutShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.layoutSpecifiedUsers)) {
            request.layoutSpecifiedUsersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.layoutSpecifiedUsers, "LayoutSpecifiedUsers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.annotation)) {
            query.put("Annotation", request.annotation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgrounds)) {
            query.put("Backgrounds", request.backgrounds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgColor)) {
            query.put("BgColor", request.bgColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clockWidgets)) {
            query.put("ClockWidgets", request.clockWidgets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cropMode)) {
            query.put("CropMode", request.cropMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.images)) {
            query.put("Images", request.images);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutSpecifiedUsersShrink)) {
            query.put("LayoutSpecifiedUsers", request.layoutSpecifiedUsersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.panes)) {
            query.put("Panes", request.panes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionColor)) {
            query.put("RegionColor", request.regionColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservePaneForNoCameraUser)) {
            query.put("ReservePaneForNoCameraUser", request.reservePaneForNoCameraUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showDefaultBackgroundOnMute)) {
            query.put("ShowDefaultBackgroundOnMute", request.showDefaultBackgroundOnMute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specMixedUserList)) {
            query.put("SpecMixedUserList", request.specMixedUserList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWithoutChannel)) {
            query.put("StartWithoutChannel", request.startWithoutChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWithoutChannelWaitTime)) {
            query.put("StartWithoutChannelWaitTime", request.startWithoutChannelWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subHighResolutionStream)) {
            query.put("SubHighResolutionStream", request.subHighResolutionStream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.texts)) {
            query.put("Texts", request.texts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartStreamingOut"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartStreamingOutResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation starts a bypass streaming task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The queries per second (QPS) limit for a single user is 10. If the limit is exceeded, API calls are throttled, which may affect your services. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts a bypass streaming task.</p>
     * 
     * @param request StartStreamingOutRequest
     * @return StartStreamingOutResponse
     */
    public StartStreamingOutResponse startStreamingOut(StartStreamingOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startStreamingOutWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts stream mixing.</p>
     * 
     * @param tmpReq StartViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartViewResponse
     */
    public StartViewResponse startViewWithOptions(StartViewRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartViewShrinkRequest request = new StartViewShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.viewSubscribers)) {
            request.viewSubscribersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.viewSubscribers, "ViewSubscribers", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgColor)) {
            query.put("BgColor", request.bgColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cropMode)) {
            query.put("CropMode", request.cropMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionColor)) {
            query.put("RegionColor", request.regionColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWithoutChannel)) {
            query.put("StartWithoutChannel", request.startWithoutChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startWithoutChannelWaitTime)) {
            query.put("StartWithoutChannelWaitTime", request.startWithoutChannelWaitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewContent)) {
            query.put("ViewContent", request.viewContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewSubscribersShrink)) {
            query.put("ViewSubscribers", request.viewSubscribersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartView"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartViewResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limits</h3>
     * <p>The QPS limit for a single user is 10 queries per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the API operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Starts stream mixing.</p>
     * 
     * @param request StartViewRequest
     * @return StartViewResponse
     */
    public StartViewResponse startView(StartViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an AI agent.</p>
     * 
     * @param request StopAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopAgentResponse
     */
    public StopAgentResponse stopAgentWithOptions(StopAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopAgent"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an AI agent.</p>
     * 
     * @param request StopAgentRequest
     * @return StopAgentResponse
     */
    public StopAgentResponse stopAgent(StopAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an event callback.</p>
     * 
     * @param tmpReq StopCategoryCallbackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopCategoryCallbackResponse
     */
    public StopCategoryCallbackResponse stopCategoryCallbackWithOptions(StopCategoryCallbackRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopCategoryCallbackShrinkRequest request = new StopCategoryCallbackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.callback)) {
            request.callbackShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.callback, "Callback", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackShrink)) {
            query.put("Callback", request.callbackShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCategoryCallback"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCategoryCallbackResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an event callback.</p>
     * 
     * @param request StopCategoryCallbackRequest
     * @return StopCategoryCallbackResponse
     */
    public StopCategoryCallbackResponse stopCategoryCallback(StopCategoryCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopCategoryCallbackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used by the server to actively shut down an online channel.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your service. Invoke this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used by the server to actively shut down a channel.</p>
     * 
     * @param request StopChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopChannelResponse
     */
    public StopChannelResponse stopChannelWithOptions(StopChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopChannel"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopChannelResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used by the server to actively shut down an online channel.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your service. Invoke this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used by the server to actively shut down a channel.</p>
     * 
     * @param request StopChannelRequest
     * @return StopChannelResponse
     */
    public StopChannelResponse stopChannel(StopChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation stops a meeting minutes task for an online channel.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an intelligent meeting minutes task.</p>
     * 
     * @param request StopCloudNoteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopCloudNoteResponse
     */
    public StopCloudNoteResponse stopCloudNoteWithOptions(StopCloudNoteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCloudNote"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCloudNoteResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation stops a meeting minutes task for an online channel.</p>
     * <h3>QPS limits</h3>
     * <p>The QPS limit per user is 10 calls per second. If the limit is exceeded, API calls are throttled, which may affect your services. Call the operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops an intelligent meeting minutes task.</p>
     * 
     * @param request StopCloudNoteRequest
     * @return StopCloudNoteResponse
     */
    public StopCloudNoteResponse stopCloudNote(StopCloudNoteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopCloudNoteWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to stop an online channel cloud recording job.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>StopCloudRecord</p>
     * 
     * @param request StopCloudRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopCloudRecordResponse
     */
    public StopCloudRecordResponse stopCloudRecordWithOptions(StopCloudRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCloudRecord"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCloudRecordResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to stop an online channel cloud recording job.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Please invoke the API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>StopCloudRecord</p>
     * 
     * @param request StopCloudRecordRequest
     * @return StopCloudRecordResponse
     */
    public StopCloudRecordResponse stopCloudRecord(StopCloudRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopCloudRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> to start a stream relay task.</li>
     * <li>If you need to stop a stream relay task and the stream relay task is abnormal (the StopMPUTask operation is not called to stop the task), the stream relay task is automatically stopped 2 minutes after the last user leaves the channel. After the task is stopped, if you need to resume stream relay, you need to call the <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> operation again.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit per user for this operation is 500 times per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the StopMPUTask operation to stop a stream relay task.</p>
     * 
     * @param request StopMPUTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopMPUTaskResponse
     */
    public StopMPUTaskResponse stopMPUTaskWithOptions(StopMPUTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMPUTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMPUTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>Before you call this operation, you must have called <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> to start a stream relay task.</li>
     * <li>If you need to stop a stream relay task and the stream relay task is abnormal (the StopMPUTask operation is not called to stop the task), the stream relay task is automatically stopped 2 minutes after the last user leaves the channel. After the task is stopped, if you need to resume stream relay, you need to call the <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> operation again.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The QPS limit per user for this operation is 500 times per second. If the limit is exceeded, API calls are throttled, which may affect your business. Call the operation properly. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the StopMPUTask operation to stop a stream relay task.</p>
     * 
     * @param request StopMPUTaskRequest
     * @return StopMPUTaskResponse
     */
    public StopMPUTaskResponse stopMPUTask(StopMPUTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopMPUTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/193528.html">StartRecordTask</a> operation to start a video recording task.</p>
     * <h1>QPS limit</h1>
     * <p>You can call this operation up to 4,000 times per minute per user. If the number of calls per minute exceeds the limit, throttling is triggered, which may affect your business. Call this operation as required. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the StopRecordTask operation to stop a video recording task.</p>
     * 
     * @param request StopRecordTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopRecordTaskResponse
     */
    public StopRecordTaskResponse stopRecordTaskWithOptions(StopRecordTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopRecordTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopRecordTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/193528.html">StartRecordTask</a> operation to start a video recording task.</p>
     * <h1>QPS limit</h1>
     * <p>You can call this operation up to 4,000 times per minute per user. If the number of calls per minute exceeds the limit, throttling is triggered, which may affect your business. Call this operation as required. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limit</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the StopRecordTask operation to stop a video recording task.</p>
     * 
     * @param request StopRecordTaskRequest
     * @return StopRecordTaskResponse
     */
    public StopRecordTaskResponse stopRecordTask(StopRecordTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopRecordTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to stop a bypass stream ingest job for an online channel.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Invoke this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>StopStreamingOut</p>
     * 
     * @param request StopStreamingOutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopStreamingOutResponse
     */
    public StopStreamingOutResponse stopStreamingOutWithOptions(StopStreamingOutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopStreamingOut"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopStreamingOutResponse());
    }

    /**
     * <b>description</b> :
     * <h3>How-To</h3>
     * <p>This API is used to stop a bypass stream ingest job for an online channel.  </p>
     * <h3>queries per second (QPS) Limit</h3>
     * <p>The QPS limit for this API is 10 queries per second (QPS) per user. If the limit is exceeded, API calls will be subject to rate limiting, which may impact your business. Invoke this API appropriately.</p>
     * 
     * <b>summary</b> : 
     * <p>StopStreamingOut</p>
     * 
     * @param request StopStreamingOutRequest
     * @return StopStreamingOutResponse
     */
    public StopStreamingOutResponse stopStreamingOut(StopStreamingOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopStreamingOutWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. Exceeding this limit triggers rate limiting, which can affect your application. Therefore, call the API judiciously.</p>
     * 
     * <b>summary</b> : 
     * <p>Stop stream mixing.</p>
     * 
     * @param request StopViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopViewResponse
     */
    public StopViewResponse stopViewWithOptions(StopViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopView"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopViewResponse());
    }

    /**
     * <b>description</b> :
     * <h3>QPS limit</h3>
     * <p>The QPS limit for this API is 10 requests per second per user. Exceeding this limit triggers rate limiting, which can affect your application. Therefore, call the API judiciously.</p>
     * 
     * <b>summary</b> : 
     * <p>Stop stream mixing.</p>
     * 
     * @param request StopViewRequest
     * @return StopViewResponse
     */
    public StopViewResponse stopView(StopViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update an AI Agent</p>
     * 
     * @param tmpReq UpdateAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgentWithOptions(UpdateAgentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAgentShrinkRequest request = new UpdateAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.voiceChatConfig)) {
            request.voiceChatConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.voiceChatConfig, "VoiceChatConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voiceChatConfigShrink)) {
            query.put("VoiceChatConfig", request.voiceChatConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgent"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update an AI Agent</p>
     * 
     * @param request UpdateAgentRequest
     * @return UpdateAgentResponse
     */
    public UpdateAgentResponse updateAgent(UpdateAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an automatic bypass single-stream relay rule.</p>
     * 
     * @param request UpdateAutoLiveStreamRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAutoLiveStreamRuleResponse
     */
    public UpdateAutoLiveStreamRuleResponse updateAutoLiveStreamRuleWithOptions(UpdateAutoLiveStreamRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callBack)) {
            query.put("CallBack", request.callBack);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelIdPrefixes)) {
            query.put("ChannelIdPrefixes", request.channelIdPrefixes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelIds)) {
            query.put("ChannelIds", request.channelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaEncode)) {
            query.put("MediaEncode", request.mediaEncode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playDomain)) {
            query.put("PlayDomain", request.playDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAutoLiveStreamRuleResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/353179.html">CreateAutoLiveStreamRule</a> to create a bypass rule.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 1,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an automatic bypass single-stream relay rule.</p>
     * 
     * @param request UpdateAutoLiveStreamRuleRequest
     * @return UpdateAutoLiveStreamRuleResponse
     */
    public UpdateAutoLiveStreamRuleResponse updateAutoLiveStreamRule(UpdateAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage</h3>
     * <p>Updates a cloud recording task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 requests per second per user. Exceeding this limit triggers rate limiting, which may affect your service. Call the API responsibly.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a cloud recording task.</p>
     * 
     * @param tmpReq UpdateCloudRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudRecordResponse
     */
    public UpdateCloudRecordResponse updateCloudRecordWithOptions(UpdateCloudRecordRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCloudRecordShrinkRequest request = new UpdateCloudRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.layoutSpecifiedUsers)) {
            request.layoutSpecifiedUsersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.layoutSpecifiedUsers, "LayoutSpecifiedUsers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgrounds)) {
            query.put("Backgrounds", request.backgrounds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clockWidgets)) {
            query.put("ClockWidgets", request.clockWidgets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.images)) {
            query.put("Images", request.images);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutSpecifiedUsersShrink)) {
            query.put("LayoutSpecifiedUsers", request.layoutSpecifiedUsersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.panes)) {
            query.put("Panes", request.panes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.texts)) {
            query.put("Texts", request.texts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudRecord"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudRecordResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage</h3>
     * <p>Updates a cloud recording task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>This API supports up to 10 requests per second per user. Exceeding this limit triggers rate limiting, which may affect your service. Call the API responsibly.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a cloud recording task.</p>
     * 
     * @param request UpdateCloudRecordRequest
     * @return UpdateCloudRecordResponse
     */
    public UpdateCloudRecordResponse updateCloudRecord(UpdateCloudRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>Before calling this API, you must have called <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> to start a bypass relay task.</li>
     * <li>This API must be called while the task is running normally. Calls are invalid when the task has not started, has ended, or is in an abnormal state. You can call <a href="https://help.aliyun.com/document_detail/93181.html">GetMPUTaskStatus</a> to obtain the task running status.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this API is 4,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Please call reasonably. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS Limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call UpdateMPUTask to update a bypass relay task.</p>
     * 
     * @param request UpdateMPUTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMPUTaskResponse
     */
    public UpdateMPUTaskResponse updateMPUTaskWithOptions(UpdateMPUTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundColor)) {
            query.put("BackgroundColor", request.backgroundColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgrounds)) {
            query.put("Backgrounds", request.backgrounds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clockWidgets)) {
            query.put("ClockWidgets", request.clockWidgets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cropMode)) {
            query.put("CropMode", request.cropMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutIds)) {
            query.put("LayoutIds", request.layoutIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaEncode)) {
            query.put("MediaEncode", request.mediaEncode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mixMode)) {
            query.put("MixMode", request.mixMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamType)) {
            query.put("StreamType", request.streamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecAudioUsers)) {
            query.put("SubSpecAudioUsers", request.subSpecAudioUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecCameraUsers)) {
            query.put("SubSpecCameraUsers", request.subSpecCameraUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecShareScreenUsers)) {
            query.put("SubSpecShareScreenUsers", request.subSpecShareScreenUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecUsers)) {
            query.put("SubSpecUsers", request.subSpecUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecAudioUsers)) {
            query.put("UnsubSpecAudioUsers", request.unsubSpecAudioUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecCameraUsers)) {
            query.put("UnsubSpecCameraUsers", request.unsubSpecCameraUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecShareScreenUsers)) {
            query.put("UnsubSpecShareScreenUsers", request.unsubSpecShareScreenUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPanes)) {
            query.put("UserPanes", request.userPanes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarks)) {
            query.put("Watermarks", request.watermarks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMPUTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMPUTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <ul>
     * <li>Before calling this API, you must have called <a href="https://help.aliyun.com/document_detail/93183.html">StartMpuTask</a> to start a bypass relay task.</li>
     * <li>This API must be called while the task is running normally. Calls are invalid when the task has not started, has ended, or is in an abnormal state. You can call <a href="https://help.aliyun.com/document_detail/93181.html">GetMPUTaskStatus</a> to obtain the task running status.</li>
     * </ul>
     * <h1>QPS limit</h1>
     * <p>The per-user QPS limit of this API is 4,000 calls per minute. If the limit is exceeded, API calls are throttled, which may affect your business. Please call reasonably. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS Limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Call UpdateMPUTask to update a bypass relay task.</p>
     * 
     * @param request UpdateMPUTaskRequest
     * @return UpdateMPUTaskResponse
     */
    public UpdateMPUTaskResponse updateMPUTask(UpdateMPUTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMPUTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193528.html">StartRecordTask</a> to start a video recording task.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a video recording task.</p>
     * 
     * @param request UpdateRecordTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecordTaskResponse
     */
    public UpdateRecordTaskResponse updateRecordTaskWithOptions(UpdateRecordTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cropMode)) {
            query.put("CropMode", request.cropMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutIds)) {
            query.put("LayoutIds", request.layoutIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaEncode)) {
            query.put("MediaEncode", request.mediaEncode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecAudioUsers)) {
            query.put("SubSpecAudioUsers", request.subSpecAudioUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecCameraUsers)) {
            query.put("SubSpecCameraUsers", request.subSpecCameraUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecShareScreenUsers)) {
            query.put("SubSpecShareScreenUsers", request.subSpecShareScreenUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subSpecUsers)) {
            query.put("SubSpecUsers", request.subSpecUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskProfile)) {
            query.put("TaskProfile", request.taskProfile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecAudioUsers)) {
            query.put("UnsubSpecAudioUsers", request.unsubSpecAudioUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecCameraUsers)) {
            query.put("UnsubSpecCameraUsers", request.unsubSpecCameraUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unsubSpecShareScreenUsers)) {
            query.put("UnsubSpecShareScreenUsers", request.unsubSpecShareScreenUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPanes)) {
            query.put("UserPanes", request.userPanes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecordTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecordTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193528.html">StartRecordTask</a> to start a video recording task.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable frequency. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a video recording task.</p>
     * 
     * @param request UpdateRecordTaskRequest
     * @return UpdateRecordTaskResponse
     */
    public UpdateRecordTaskResponse updateRecordTask(UpdateRecordTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecordTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording configuration template.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a recording configuration template.</p>
     * 
     * @param request UpdateRecordTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRecordTemplateResponse
     */
    public UpdateRecordTemplateResponse updateRecordTemplateWithOptions(UpdateRecordTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgroundColor)) {
            query.put("BackgroundColor", request.backgroundColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgrounds)) {
            query.put("Backgrounds", request.backgrounds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clockWidgets)) {
            query.put("ClockWidgets", request.clockWidgets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delayStopTime)) {
            query.put("DelayStopTime", request.delayStopTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableM3u8DateTime)) {
            query.put("EnableM3u8DateTime", request.enableM3u8DateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSplitInterval)) {
            query.put("FileSplitInterval", request.fileSplitInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.formats)) {
            query.put("Formats", request.formats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.httpCallbackUrl)) {
            query.put("HttpCallbackUrl", request.httpCallbackUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutIds)) {
            query.put("LayoutIds", request.layoutIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaEncode)) {
            query.put("MediaEncode", request.mediaEncode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mnsQueue)) {
            query.put("MnsQueue", request.mnsQueue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            query.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossEndpoint)) {
            query.put("OssEndpoint", request.ossEndpoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossFilePrefix)) {
            query.put("OssFilePrefix", request.ossFilePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskProfile)) {
            query.put("TaskProfile", request.taskProfile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.watermarks)) {
            query.put("Watermarks", request.watermarks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecordTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecordTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Before you call this operation, you must call <a href="https://help.aliyun.com/document_detail/193625.html">AddRecordTemplate</a> to add a recording configuration template.</p>
     * <h1>QPS limits</h1>
     * <p>The QPS limit for a single user is 100 calls per second. If the limit is exceeded, API calls are throttled, which may affect your business. Make API calls at a reasonable rate. For more information, see <a href="https://help.aliyun.com/document_detail/341645.html">QPS limits</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a recording configuration template.</p>
     * 
     * @param request UpdateRecordTemplateRequest
     * @return UpdateRecordTemplateResponse
     */
    public UpdateRecordTemplateResponse updateRecordTemplate(UpdateRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation updates a bypass live streaming task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 requests per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a bypass live streaming task.</p>
     * 
     * @param tmpReq UpdateStreamingOutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStreamingOutResponse
     */
    public UpdateStreamingOutResponse updateStreamingOutWithOptions(UpdateStreamingOutRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStreamingOutShrinkRequest request = new UpdateStreamingOutShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.layoutSpecifiedUsers)) {
            request.layoutSpecifiedUsersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.layoutSpecifiedUsers, "LayoutSpecifiedUsers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backgrounds)) {
            query.put("Backgrounds", request.backgrounds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgColor)) {
            query.put("BgColor", request.bgColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clockWidgets)) {
            query.put("ClockWidgets", request.clockWidgets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cropMode)) {
            query.put("CropMode", request.cropMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.images)) {
            query.put("Images", request.images);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutSpecifiedUsersShrink)) {
            query.put("LayoutSpecifiedUsers", request.layoutSpecifiedUsersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.panes)) {
            query.put("Panes", request.panes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionColor)) {
            query.put("RegionColor", request.regionColor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specMixedUserList)) {
            query.put("SpecMixedUserList", request.specMixedUserList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.texts)) {
            query.put("Texts", request.texts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStreamingOut"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStreamingOutResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <p>This operation updates a bypass live streaming task for an online channel.</p>
     * <h3>QPS limit</h3>
     * <p>The QPS limit for a single user is 10 requests per second. If the limit is exceeded, API calls are throttled, which may affect your services. Make API calls at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a bypass live streaming task.</p>
     * 
     * @param request UpdateStreamingOutRequest
     * @return UpdateStreamingOutResponse
     */
    public UpdateStreamingOutResponse updateStreamingOut(UpdateStreamingOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStreamingOutWithOptions(request, runtime);
    }
}
