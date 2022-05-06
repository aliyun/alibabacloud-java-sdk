// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111;

import com.aliyun.tea.*;
import com.aliyun.rtc20180111.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public AddRecordTemplateResponse addRecordTemplateWithOptions(AddRecordTemplateRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddRecordTemplateResponse addRecordTemplate(AddRecordTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRecordTemplateWithOptions(request, runtime);
    }

    public CreateAutoLiveStreamRuleResponse createAutoLiveStreamRuleWithOptions(CreateAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateAutoLiveStreamRuleResponse createAutoLiveStreamRule(CreateAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public CreateEventSubscribeResponse createEventSubscribeWithOptions(CreateEventSubscribeRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            query.put("Users", request.users);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateEventSubscribeResponse createEventSubscribe(CreateEventSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEventSubscribeWithOptions(request, runtime);
    }

    public CreateMPULayoutResponse createMPULayoutWithOptions(CreateMPULayoutRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateMPULayoutResponse createMPULayout(CreateMPULayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMPULayoutWithOptions(request, runtime);
    }

    public DeleteAutoLiveStreamRuleResponse deleteAutoLiveStreamRuleWithOptions(DeleteAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteAutoLiveStreamRuleResponse deleteAutoLiveStreamRule(DeleteAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public DeleteChannelResponse deleteChannelWithOptions(DeleteChannelRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChannelWithOptions(request, runtime);
    }

    public DeleteEventSubscribeResponse deleteEventSubscribeWithOptions(DeleteEventSubscribeRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteEventSubscribeResponse deleteEventSubscribe(DeleteEventSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEventSubscribeWithOptions(request, runtime);
    }

    public DeleteMPULayoutResponse deleteMPULayoutWithOptions(DeleteMPULayoutRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteMPULayoutResponse deleteMPULayout(DeleteMPULayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMPULayoutWithOptions(request, runtime);
    }

    public DeleteRecordTemplateResponse deleteRecordTemplateWithOptions(DeleteRecordTemplateRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteRecordTemplateResponse deleteRecordTemplate(DeleteRecordTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRecordTemplateWithOptions(request, runtime);
    }

    public DescribeAppKeyResponse describeAppKeyWithOptions(DescribeAppKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeAppKeyResponse describeAppKey(DescribeAppKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppKeyWithOptions(request, runtime);
    }

    public DescribeAppsResponse describeAppsWithOptions(DescribeAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppsWithOptions(request, runtime);
    }

    public DescribeAutoLiveStreamRuleResponse describeAutoLiveStreamRuleWithOptions(DescribeAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeAutoLiveStreamRuleResponse describeAutoLiveStreamRule(DescribeAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public DescribeChannelParticipantsResponse describeChannelParticipantsWithOptions(DescribeChannelParticipantsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeChannelParticipantsResponse describeChannelParticipants(DescribeChannelParticipantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeChannelParticipantsWithOptions(request, runtime);
    }

    public DescribeChannelUsersResponse describeChannelUsersWithOptions(DescribeChannelUsersRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeChannelUsersResponse describeChannelUsers(DescribeChannelUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeChannelUsersWithOptions(request, runtime);
    }

    public DescribeMPULayoutInfoListResponse describeMPULayoutInfoListWithOptions(DescribeMPULayoutInfoListRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeMPULayoutInfoListResponse describeMPULayoutInfoList(DescribeMPULayoutInfoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMPULayoutInfoListWithOptions(request, runtime);
    }

    public DescribeRecordFilesResponse describeRecordFilesWithOptions(DescribeRecordFilesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeRecordFilesResponse describeRecordFiles(DescribeRecordFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordFilesWithOptions(request, runtime);
    }

    public DescribeRecordTemplatesResponse describeRecordTemplatesWithOptions(DescribeRecordTemplatesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeRecordTemplatesResponse describeRecordTemplates(DescribeRecordTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordTemplatesWithOptions(request, runtime);
    }

    public DescribeUserInfoInChannelResponse describeUserInfoInChannelWithOptions(DescribeUserInfoInChannelRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeUserInfoInChannelResponse describeUserInfoInChannel(DescribeUserInfoInChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserInfoInChannelWithOptions(request, runtime);
    }

    public DisableAutoLiveStreamRuleResponse disableAutoLiveStreamRuleWithOptions(DisableAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableAutoLiveStreamRuleResponse disableAutoLiveStreamRule(DisableAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public EnableAutoLiveStreamRuleResponse enableAutoLiveStreamRuleWithOptions(EnableAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public EnableAutoLiveStreamRuleResponse enableAutoLiveStreamRule(EnableAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public GetMPUTaskStatusResponse getMPUTaskStatusWithOptions(GetMPUTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetMPUTaskStatusResponse getMPUTaskStatus(GetMPUTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMPUTaskStatusWithOptions(request, runtime);
    }

    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    public ModifyMPULayoutResponse modifyMPULayoutWithOptions(ModifyMPULayoutRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ModifyMPULayoutResponse modifyMPULayout(ModifyMPULayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMPULayoutWithOptions(request, runtime);
    }

    public RemoveTerminalsResponse removeTerminalsWithOptions(RemoveTerminalsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RemoveTerminalsResponse removeTerminals(RemoveTerminalsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTerminalsWithOptions(request, runtime);
    }

    public StartMPUTaskResponse startMPUTaskWithOptions(StartMPUTaskRequest request, RuntimeOptions runtime) throws Exception {
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
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.enhancedParam))) {
            bodyFlat.put("EnhancedParam", request.enhancedParam);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StartMPUTaskResponse startMPUTask(StartMPUTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startMPUTaskWithOptions(request, runtime);
    }

    public StartRecordTaskResponse startRecordTaskWithOptions(StartRecordTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StartRecordTaskResponse startRecordTask(StartRecordTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRecordTaskWithOptions(request, runtime);
    }

    public StopMPUTaskResponse stopMPUTaskWithOptions(StopMPUTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StopMPUTaskResponse stopMPUTask(StopMPUTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopMPUTaskWithOptions(request, runtime);
    }

    public StopRecordTaskResponse stopRecordTaskWithOptions(StopRecordTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StopRecordTaskResponse stopRecordTask(StopRecordTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopRecordTaskWithOptions(request, runtime);
    }

    public UpdateAutoLiveStreamRuleResponse updateAutoLiveStreamRuleWithOptions(UpdateAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateAutoLiveStreamRuleResponse updateAutoLiveStreamRule(UpdateAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public UpdateMPUTaskResponse updateMPUTaskWithOptions(UpdateMPUTaskRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateMPUTaskResponse updateMPUTask(UpdateMPUTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMPUTaskWithOptions(request, runtime);
    }

    public UpdateRecordTaskResponse updateRecordTaskWithOptions(UpdateRecordTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutIds)) {
            query.put("LayoutIds", request.layoutIds);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRecordTaskResponse updateRecordTask(UpdateRecordTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRecordTaskWithOptions(request, runtime);
    }

    public UpdateRecordTemplateResponse updateRecordTemplateWithOptions(UpdateRecordTemplateRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRecordTemplateResponse updateRecordTemplate(UpdateRecordTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRecordTemplateWithOptions(request, runtime);
    }
}
