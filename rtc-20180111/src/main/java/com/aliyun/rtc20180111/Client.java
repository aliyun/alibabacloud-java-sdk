// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111;

import com.aliyun.tea.*;
import com.aliyun.rtc20180111.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
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
     * @param request AddRecordTemplateRequest
     * @return AddRecordTemplateResponse
     */
    public AddRecordTemplateResponse addRecordTemplate(AddRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用推流模版</p>
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
     * <b>summary</b> : 
     * <p>创建应用推流模版</p>
     * 
     * @param request CreateAppStreamingOutTemplateRequest
     * @return CreateAppStreamingOutTemplateResponse
     */
    public CreateAppStreamingOutTemplateResponse createAppStreamingOutTemplate(CreateAppStreamingOutTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppStreamingOutTemplateWithOptions(request, runtime);
    }

    /**
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
     * @param request CreateAutoLiveStreamRuleRequest
     * @return CreateAutoLiveStreamRuleResponse
     */
    public CreateAutoLiveStreamRuleResponse createAutoLiveStreamRule(CreateAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
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
     * @param request CreateEventSubscribeRequest
     * @return CreateEventSubscribeResponse
     */
    public CreateEventSubscribeResponse createEventSubscribe(CreateEventSubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEventSubscribeWithOptions(request, runtime);
    }

    /**
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
     * @param request CreateMPULayoutRequest
     * @return CreateMPULayoutResponse
     */
    public CreateMPULayoutResponse createMPULayout(CreateMPULayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMPULayoutWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除应用推流模版</p>
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
     * <b>summary</b> : 
     * <p>删除应用推流模版</p>
     * 
     * @param request DeleteAppStreamingOutTemplateRequest
     * @return DeleteAppStreamingOutTemplateResponse
     */
    public DeleteAppStreamingOutTemplateResponse deleteAppStreamingOutTemplate(DeleteAppStreamingOutTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppStreamingOutTemplateWithOptions(request, runtime);
    }

    /**
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
     * @param request DeleteAutoLiveStreamRuleRequest
     * @return DeleteAutoLiveStreamRuleResponse
     */
    public DeleteAutoLiveStreamRuleResponse deleteAutoLiveStreamRule(DeleteAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
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
     * @param request DeleteChannelRequest
     * @return DeleteChannelResponse
     */
    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChannelWithOptions(request, runtime);
    }

    /**
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
     * @param request DeleteEventSubscribeRequest
     * @return DeleteEventSubscribeResponse
     */
    public DeleteEventSubscribeResponse deleteEventSubscribe(DeleteEventSubscribeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEventSubscribeWithOptions(request, runtime);
    }

    /**
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
     * @param request DeleteMPULayoutRequest
     * @return DeleteMPULayoutResponse
     */
    public DeleteMPULayoutResponse deleteMPULayout(DeleteMPULayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMPULayoutWithOptions(request, runtime);
    }

    /**
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
     * @param request DeleteRecordTemplateRequest
     * @return DeleteRecordTemplateResponse
     */
    public DeleteRecordTemplateResponse deleteRecordTemplate(DeleteRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看AppKey</p>
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
     * <b>summary</b> : 
     * <p>查看AppKey</p>
     * 
     * @param request DescribeAppKeyRequest
     * @return DescribeAppKeyResponse
     */
    public DescribeAppKeyResponse describeAppKey(DescribeAppKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询录制列表</p>
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
     * <b>summary</b> : 
     * <p>查询录制列表</p>
     * 
     * @param request DescribeAppRecordingFilesRequest
     * @return DescribeAppRecordingFilesResponse
     */
    public DescribeAppRecordingFilesResponse describeAppRecordingFiles(DescribeAppRecordingFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppRecordingFilesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用推流模版列表</p>
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
     * <b>summary</b> : 
     * <p>应用推流模版列表</p>
     * 
     * @param request DescribeAppStreamingOutTemplatesRequest
     * @return DescribeAppStreamingOutTemplatesResponse
     */
    public DescribeAppStreamingOutTemplatesResponse describeAppStreamingOutTemplates(DescribeAppStreamingOutTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppStreamingOutTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>App列表</p>
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
     * <b>summary</b> : 
     * <p>App列表</p>
     * 
     * @param request DescribeAppsRequest
     * @return DescribeAppsResponse
     */
    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppsWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeAutoLiveStreamRuleRequest
     * @return DescribeAutoLiveStreamRuleResponse
     */
    public DescribeAutoLiveStreamRuleResponse describeAutoLiveStreamRule(DescribeAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribeCall获取单次通信详情。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribeCall获取单次通信详情。</p>
     * 
     * @param request DescribeCallRequest
     * @return DescribeCallResponse
     */
    public DescribeCallResponse describeCall(DescribeCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCallWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribeCallList分页查询时间范围内创建的通信信息。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribeCallList分页查询时间范围内创建的通信信息。</p>
     * 
     * @param request DescribeCallListRequest
     * @return DescribeCallListResponse
     */
    public DescribeCallListResponse describeCallList(DescribeCallListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCallListWithOptions(request, runtime);
    }

    /**
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
     * <b>summary</b> : 
     * <p>查询频道的所有参会者</p>
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
     * <b>summary</b> : 
     * <p>查询频道的所有参会者</p>
     * 
     * @param request DescribeChannelAllUsersRequest
     * @return DescribeChannelAllUsersResponse
     */
    public DescribeChannelAllUsersResponse describeChannelAllUsers(DescribeChannelAllUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelAllUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribeChannelAreaDistributionStatData获取频道地区分布统计数据。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribeChannelAreaDistributionStatData获取频道地区分布统计数据。</p>
     * 
     * @param request DescribeChannelAreaDistributionStatDataRequest
     * @return DescribeChannelAreaDistributionStatDataResponse
     */
    public DescribeChannelAreaDistributionStatDataResponse describeChannelAreaDistributionStatData(DescribeChannelAreaDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelAreaDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribeChannelDistributionStatData获取频道分布统计数据。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribeChannelDistributionStatData获取频道分布统计数据。</p>
     * 
     * @param request DescribeChannelDistributionStatDataRequest
     * @return DescribeChannelDistributionStatDataResponse
     */
    public DescribeChannelDistributionStatDataResponse describeChannelDistributionStatData(DescribeChannelDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribeChannelOverallData查询频道概览数据。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribeChannelOverallData查询频道概览数据。</p>
     * 
     * @param request DescribeChannelOverallDataRequest
     * @return DescribeChannelOverallDataResponse
     */
    public DescribeChannelOverallDataResponse describeChannelOverallData(DescribeChannelOverallDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelOverallDataWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeChannelParticipantsRequest
     * @return DescribeChannelParticipantsResponse
     */
    public DescribeChannelParticipantsResponse describeChannelParticipants(DescribeChannelParticipantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelParticipantsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribeChannelTopPubUserList获取频道内发布端的用户列表（按用户在线时长降序）。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribeChannelTopPubUserList获取频道内发布端的用户列表（按用户在线时长降序）。</p>
     * 
     * @param request DescribeChannelTopPubUserListRequest
     * @return DescribeChannelTopPubUserListResponse
     */
    public DescribeChannelTopPubUserListResponse describeChannelTopPubUserList(DescribeChannelTopPubUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelTopPubUserListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeChannelUser</p>
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
     * <b>summary</b> : 
     * <p>DescribeChannelUser</p>
     * 
     * @param request DescribeChannelUserRequest
     * @return DescribeChannelUserResponse
     */
    public DescribeChannelUserResponse describeChannelUser(DescribeChannelUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribeChannelUserMetrics查询频道总览中的用户数据。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribeChannelUserMetrics查询频道总览中的用户数据。</p>
     * 
     * @param request DescribeChannelUserMetricsRequest
     * @return DescribeChannelUserMetricsResponse
     */
    public DescribeChannelUserMetricsResponse describeChannelUserMetrics(DescribeChannelUserMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelUserMetricsWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeChannelUsersRequest
     * @return DescribeChannelUsersResponse
     */
    public DescribeChannelUsersResponse describeChannelUsers(DescribeChannelUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribeEndPointEventList获取端对端用户事件列表。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribeEndPointEventList获取端对端用户事件列表。</p>
     * 
     * @param request DescribeEndPointEventListRequest
     * @return DescribeEndPointEventListResponse
     */
    public DescribeEndPointEventListResponse describeEndPointEventList(DescribeEndPointEventListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEndPointEventListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribeEndPointMetricData获取端对端指标数据。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribeEndPointMetricData获取端对端指标数据。</p>
     * 
     * @param request DescribeEndPointMetricDataRequest
     * @return DescribeEndPointMetricDataResponse
     */
    public DescribeEndPointMetricDataResponse describeEndPointMetricData(DescribeEndPointMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEndPointMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取异常诊断影响因素分布</p>
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
     * <b>summary</b> : 
     * <p>获取异常诊断影响因素分布</p>
     * 
     * @param request DescribeFaultDiagnosisFactorDistributionStatRequest
     * @return DescribeFaultDiagnosisFactorDistributionStatResponse
     */
    public DescribeFaultDiagnosisFactorDistributionStatResponse describeFaultDiagnosisFactorDistributionStat(DescribeFaultDiagnosisFactorDistributionStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaultDiagnosisFactorDistributionStatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取异常诊断总览数据</p>
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
     * <b>summary</b> : 
     * <p>获取异常诊断总览数据</p>
     * 
     * @param request DescribeFaultDiagnosisOverallDataRequest
     * @return DescribeFaultDiagnosisOverallDataResponse
     */
    public DescribeFaultDiagnosisOverallDataResponse describeFaultDiagnosisOverallData(DescribeFaultDiagnosisOverallDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaultDiagnosisOverallDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取异常诊断用户详情</p>
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
     * <b>summary</b> : 
     * <p>获取异常诊断用户详情</p>
     * 
     * @param request DescribeFaultDiagnosisUserDetailRequest
     * @return DescribeFaultDiagnosisUserDetailResponse
     */
    public DescribeFaultDiagnosisUserDetailResponse describeFaultDiagnosisUserDetail(DescribeFaultDiagnosisUserDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaultDiagnosisUserDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取异常诊断用户明细列表</p>
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
     * <b>summary</b> : 
     * <p>获取异常诊断用户明细列表</p>
     * 
     * @param request DescribeFaultDiagnosisUserListRequest
     * @return DescribeFaultDiagnosisUserListResponse
     */
    public DescribeFaultDiagnosisUserListResponse describeFaultDiagnosisUserList(DescribeFaultDiagnosisUserListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFaultDiagnosisUserListWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeMPULayoutInfoListRequest
     * @return DescribeMPULayoutInfoListResponse
     */
    public DescribeMPULayoutInfoListResponse describeMPULayoutInfoList(DescribeMPULayoutInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMPULayoutInfoListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribePubUserListBySubUser根据订阅端获取通信中发布端用户列表。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribePubUserListBySubUser根据订阅端获取通信中发布端用户列表。</p>
     * 
     * @param request DescribePubUserListBySubUserRequest
     * @return DescribePubUserListBySubUserResponse
     */
    public DescribePubUserListBySubUserResponse describePubUserListBySubUser(DescribePubUserListBySubUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePubUserListBySubUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用DescribeQoeMetricData获取单次通信中用户的下行体验质量指标。</p>
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
     * <b>summary</b> : 
     * <p>调用DescribeQoeMetricData获取单次通信中用户的下行体验质量指标。</p>
     * 
     * @param request DescribeQoeMetricDataRequest
     * @return DescribeQoeMetricDataResponse
     */
    public DescribeQoeMetricDataResponse describeQoeMetricData(DescribeQoeMetricDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQoeMetricDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量统计区域分布统计数据</p>
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
     * <b>summary</b> : 
     * <p>获取质量统计区域分布统计数据</p>
     * 
     * @param request DescribeQualityAreaDistributionStatDataRequest
     * @return DescribeQualityAreaDistributionStatDataResponse
     */
    public DescribeQualityAreaDistributionStatDataResponse describeQualityAreaDistributionStatData(DescribeQualityAreaDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQualityAreaDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量统计分布数据</p>
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
     * <b>summary</b> : 
     * <p>获取质量统计分布数据</p>
     * 
     * @param request DescribeQualityDistributionStatDataRequest
     * @return DescribeQualityDistributionStatDataResponse
     */
    public DescribeQualityDistributionStatDataResponse describeQualityDistributionStatData(DescribeQualityDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQualityDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量统计各操作系统下SDK版本分布数据</p>
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
     * <b>summary</b> : 
     * <p>获取质量统计各操作系统下SDK版本分布数据</p>
     * 
     * @param request DescribeQualityOsSdkVersionDistributionStatDataRequest
     * @return DescribeQualityOsSdkVersionDistributionStatDataResponse
     */
    public DescribeQualityOsSdkVersionDistributionStatDataResponse describeQualityOsSdkVersionDistributionStatData(DescribeQualityOsSdkVersionDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQualityOsSdkVersionDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取质量统计概览数据</p>
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
     * <b>summary</b> : 
     * <p>获取质量统计概览数据</p>
     * 
     * @param request DescribeQualityOverallDataRequest
     * @return DescribeQualityOverallDataResponse
     */
    public DescribeQualityOverallDataResponse describeQualityOverallData(DescribeQualityOverallDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQualityOverallDataWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeRecordFilesRequest
     * @return DescribeRecordFilesResponse
     */
    public DescribeRecordFilesResponse describeRecordFiles(DescribeRecordFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordFilesWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeRecordTemplatesRequest
     * @return DescribeRecordTemplatesResponse
     */
    public DescribeRecordTemplatesResponse describeRecordTemplates(DescribeRecordTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecordTemplatesWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeRtcChannelListRequest
     * @return DescribeRtcChannelListResponse
     */
    public DescribeRtcChannelListResponse describeRtcChannelList(DescribeRtcChannelListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRtcChannelListWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeRtcChannelMetricRequest
     * @return DescribeRtcChannelMetricResponse
     */
    public DescribeRtcChannelMetricResponse describeRtcChannelMetric(DescribeRtcChannelMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRtcChannelMetricWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeRtcDurationDataRequest
     * @return DescribeRtcDurationDataResponse
     */
    public DescribeRtcDurationDataResponse describeRtcDurationData(DescribeRtcDurationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRtcDurationDataWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeRtcPeakChannelCntDataRequest
     * @return DescribeRtcPeakChannelCntDataResponse
     */
    public DescribeRtcPeakChannelCntDataResponse describeRtcPeakChannelCntData(DescribeRtcPeakChannelCntDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRtcPeakChannelCntDataWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeRtcUserCntDataRequest
     * @return DescribeRtcUserCntDataResponse
     */
    public DescribeRtcUserCntDataResponse describeRtcUserCntData(DescribeRtcUserCntDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRtcUserCntDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用量统计地域分布数据</p>
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
     * <b>summary</b> : 
     * <p>获取用量统计地域分布数据</p>
     * 
     * @param request DescribeUsageAreaDistributionStatDataRequest
     * @return DescribeUsageAreaDistributionStatDataResponse
     */
    public DescribeUsageAreaDistributionStatDataResponse describeUsageAreaDistributionStatData(DescribeUsageAreaDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsageAreaDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用量统计分布数据</p>
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
     * <b>summary</b> : 
     * <p>获取用量统计分布数据</p>
     * 
     * @param request DescribeUsageDistributionStatDataRequest
     * @return DescribeUsageDistributionStatDataResponse
     */
    public DescribeUsageDistributionStatDataResponse describeUsageDistributionStatData(DescribeUsageDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsageDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用量统计各操作系统下SDK版本分布数据</p>
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
     * <b>summary</b> : 
     * <p>获取用量统计各操作系统下SDK版本分布数据</p>
     * 
     * @param request DescribeUsageOsSdkVersionDistributionStatDataRequest
     * @return DescribeUsageOsSdkVersionDistributionStatDataResponse
     */
    public DescribeUsageOsSdkVersionDistributionStatDataResponse describeUsageOsSdkVersionDistributionStatData(DescribeUsageOsSdkVersionDistributionStatDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsageOsSdkVersionDistributionStatDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用量统计概览数据</p>
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
     * <b>summary</b> : 
     * <p>获取用量统计概览数据</p>
     * 
     * @param request DescribeUsageOverallDataRequest
     * @return DescribeUsageOverallDataResponse
     */
    public DescribeUsageOverallDataResponse describeUsageOverallData(DescribeUsageOverallDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsageOverallDataWithOptions(request, runtime);
    }

    /**
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
     * @param request DescribeUserInfoInChannelRequest
     * @return DescribeUserInfoInChannelResponse
     */
    public DescribeUserInfoInChannelResponse describeUserInfoInChannel(DescribeUserInfoInChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserInfoInChannelWithOptions(request, runtime);
    }

    /**
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
     * @param request DisableAutoLiveStreamRuleRequest
     * @return DisableAutoLiveStreamRuleResponse
     */
    public DisableAutoLiveStreamRuleResponse disableAutoLiveStreamRule(DisableAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
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
     * @param request EnableAutoLiveStreamRuleRequest
     * @return EnableAutoLiveStreamRuleResponse
     */
    public EnableAutoLiveStreamRuleResponse enableAutoLiveStreamRule(EnableAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
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
     * @param request GetMPUTaskStatusRequest
     * @return GetMPUTaskStatusResponse
     */
    public GetMPUTaskStatusResponse getMPUTaskStatus(GetMPUTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMPUTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改App信息</p>
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
     * <b>summary</b> : 
     * <p>修改App信息</p>
     * 
     * @param request ModifyAppRequest
     * @return ModifyAppResponse
     */
    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用推流模版</p>
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
     * <b>summary</b> : 
     * <p>更新应用推流模版</p>
     * 
     * @param request ModifyAppStreamingOutTemplateRequest
     * @return ModifyAppStreamingOutTemplateResponse
     */
    public ModifyAppStreamingOutTemplateResponse modifyAppStreamingOutTemplate(ModifyAppStreamingOutTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppStreamingOutTemplateWithOptions(request, runtime);
    }

    /**
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
     * @param request ModifyMPULayoutRequest
     * @return ModifyMPULayoutResponse
     */
    public ModifyMPULayoutResponse modifyMPULayout(ModifyMPULayoutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMPULayoutWithOptions(request, runtime);
    }

    /**
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
     * @param request RemoveTerminalsRequest
     * @return RemoveTerminalsResponse
     */
    public RemoveTerminalsResponse removeTerminals(RemoveTerminalsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeTerminalsWithOptions(request, runtime);
    }

    /**
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
     * <b>summary</b> : 
     * <p>StartCloudRecord</p>
     * 
     * @param request StartCloudRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartCloudRecordResponse
     */
    public StartCloudRecordResponse startCloudRecordWithOptions(StartCloudRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.panes)) {
            query.put("Panes", request.panes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageConfig)) {
            query.put("StorageConfig", request.storageConfig);
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
     * <b>summary</b> : 
     * <p>StartCloudRecord</p>
     * 
     * @param request StartCloudRecordRequest
     * @return StartCloudRecordResponse
     */
    public StartCloudRecordResponse startCloudRecord(StartCloudRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startCloudRecordWithOptions(request, runtime);
    }

    /**
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
     * @param request StartMPUTaskRequest
     * @return StartMPUTaskResponse
     */
    public StartMPUTaskResponse startMPUTask(StartMPUTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startMPUTaskWithOptions(request, runtime);
    }

    /**
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
     * @param request StartRecordTaskRequest
     * @return StartRecordTaskResponse
     */
    public StartRecordTaskResponse startRecordTask(StartRecordTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRecordTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>StartStreamingOut</p>
     * 
     * @param request StartStreamingOutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartStreamingOutResponse
     */
    public StartStreamingOutResponse startStreamingOutWithOptions(StartStreamingOutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
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
     * <b>summary</b> : 
     * <p>StartStreamingOut</p>
     * 
     * @param request StartStreamingOutRequest
     * @return StartStreamingOutResponse
     */
    public StartStreamingOutResponse startStreamingOut(StartStreamingOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startStreamingOutWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除频道</p>
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
     * <b>summary</b> : 
     * <p>删除频道</p>
     * 
     * @param request StopChannelRequest
     * @return StopChannelResponse
     */
    public StopChannelResponse stopChannel(StopChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopChannelWithOptions(request, runtime);
    }

    /**
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
     * @param request StopMPUTaskRequest
     * @return StopMPUTaskResponse
     */
    public StopMPUTaskResponse stopMPUTask(StopMPUTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopMPUTaskWithOptions(request, runtime);
    }

    /**
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
     * @param request StopRecordTaskRequest
     * @return StopRecordTaskResponse
     */
    public StopRecordTaskResponse stopRecordTask(StopRecordTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopRecordTaskWithOptions(request, runtime);
    }

    /**
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
     * @param request UpdateAutoLiveStreamRuleRequest
     * @return UpdateAutoLiveStreamRuleResponse
     */
    public UpdateAutoLiveStreamRuleResponse updateAutoLiveStreamRule(UpdateAutoLiveStreamRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAutoLiveStreamRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新云端录制任务</p>
     * 
     * @param request UpdateCloudRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudRecordResponse
     */
    public UpdateCloudRecordResponse updateCloudRecordWithOptions(UpdateCloudRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
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
     * <b>summary</b> : 
     * <p>更新云端录制任务</p>
     * 
     * @param request UpdateCloudRecordRequest
     * @return UpdateCloudRecordResponse
     */
    public UpdateCloudRecordResponse updateCloudRecord(UpdateCloudRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudRecordWithOptions(request, runtime);
    }

    /**
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
     * @param request UpdateMPUTaskRequest
     * @return UpdateMPUTaskResponse
     */
    public UpdateMPUTaskResponse updateMPUTask(UpdateMPUTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMPUTaskWithOptions(request, runtime);
    }

    /**
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
     * @param request UpdateRecordTaskRequest
     * @return UpdateRecordTaskResponse
     */
    public UpdateRecordTaskResponse updateRecordTask(UpdateRecordTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecordTaskWithOptions(request, runtime);
    }

    /**
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
     * @param request UpdateRecordTemplateRequest
     * @return UpdateRecordTemplateResponse
     */
    public UpdateRecordTemplateResponse updateRecordTemplate(UpdateRecordTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRecordTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新旁路推流任务</p>
     * 
     * @param request UpdateStreamingOutRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStreamingOutResponse
     */
    public UpdateStreamingOutResponse updateStreamingOutWithOptions(UpdateStreamingOutRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
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
     * <b>summary</b> : 
     * <p>更新旁路推流任务</p>
     * 
     * @param request UpdateStreamingOutRequest
     * @return UpdateStreamingOutResponse
     */
    public UpdateStreamingOutResponse updateStreamingOut(UpdateStreamingOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStreamingOutWithOptions(request, runtime);
    }
}
