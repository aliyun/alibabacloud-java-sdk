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
        query.put("AppId", request.appId);
        query.put("BackgroundColor", request.backgroundColor);
        query.put("Backgrounds", request.backgrounds);
        query.put("ClockWidgets", request.clockWidgets);
        query.put("DelayStopTime", request.delayStopTime);
        query.put("EnableM3u8DateTime", request.enableM3u8DateTime);
        query.put("FileSplitInterval", request.fileSplitInterval);
        query.put("Formats", request.formats);
        query.put("HttpCallbackUrl", request.httpCallbackUrl);
        query.put("LayoutIds", request.layoutIds);
        query.put("MediaEncode", request.mediaEncode);
        query.put("MnsQueue", request.mnsQueue);
        query.put("Name", request.name);
        query.put("OssBucket", request.ossBucket);
        query.put("OssFilePrefix", request.ossFilePrefix);
        query.put("OwnerId", request.ownerId);
        query.put("TaskProfile", request.taskProfile);
        query.put("Watermarks", request.watermarks);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddRecordTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("CallBack", request.callBack);
        query.put("ChannelIdPrefixes", request.channelIdPrefixes);
        query.put("ChannelIds", request.channelIds);
        query.put("MediaEncode", request.mediaEncode);
        query.put("OwnerId", request.ownerId);
        query.put("PlayDomain", request.playDomain);
        query.put("RuleName", request.ruleName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("CallbackUrl", request.callbackUrl);
        query.put("ChannelId", request.channelId);
        query.put("ClientToken", request.clientToken);
        query.put("Events", request.events);
        query.put("OwnerId", request.ownerId);
        query.put("Users", request.users);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEventSubscribe"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("AudioMixCount", request.audioMixCount);
        query.put("Name", request.name);
        query.put("OwnerId", request.ownerId);
        query.put("Panes", request.panes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMPULayout"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("OwnerId", request.ownerId);
        query.put("RuleId", request.ruleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoLiveStreamRuleResponse());
    }

    public DeleteAutoLiveStreamRuleResponse deleteAutoLiveStreamRule(DeleteAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public DeleteEventSubscribeResponse deleteEventSubscribeWithOptions(DeleteEventSubscribeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("OwnerId", request.ownerId);
        query.put("SubscribeId", request.subscribeId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEventSubscribe"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("LayoutId", request.layoutId);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMPULayout"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("OwnerId", request.ownerId);
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRecordTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRecordTemplateResponse());
    }

    public DeleteRecordTemplateResponse deleteRecordTemplate(DeleteRecordTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRecordTemplateWithOptions(request, runtime);
    }

    public DescribeAutoLiveStreamRuleResponse describeAutoLiveStreamRuleWithOptions(DescribeAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("ChannelId", request.channelId);
        query.put("Order", request.order);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelParticipants"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("ChannelId", request.channelId);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelUsers"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("LayoutId", request.layoutId);
        query.put("Name", request.name);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMPULayoutInfoList"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("ChannelId", request.channelId);
        query.put("EndTime", request.endTime);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        query.put("TaskIds", request.taskIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordFiles"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("TemplateIds", request.templateIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecordTemplates"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("ChannelId", request.channelId);
        query.put("OwnerId", request.ownerId);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserInfoInChannel"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("OwnerId", request.ownerId);
        query.put("RuleId", request.ruleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("OwnerId", request.ownerId);
        query.put("RuleId", request.ruleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("OwnerId", request.ownerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMPUTaskStatus"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMPUTaskStatusResponse());
    }

    public GetMPUTaskStatusResponse getMPUTaskStatus(GetMPUTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMPUTaskStatusWithOptions(request, runtime);
    }

    public ModifyMPULayoutResponse modifyMPULayoutWithOptions(ModifyMPULayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("AudioMixCount", request.audioMixCount);
        query.put("LayoutId", request.layoutId);
        query.put("Name", request.name);
        query.put("OwnerId", request.ownerId);
        query.put("Panes", request.panes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMPULayout"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("ChannelId", request.channelId);
        query.put("OwnerId", request.ownerId);
        query.put("TerminalIds", request.terminalIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveTerminals"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("BackgroundColor", request.backgroundColor);
        query.put("Backgrounds", request.backgrounds);
        query.put("ChannelId", request.channelId);
        query.put("ClockWidgets", request.clockWidgets);
        query.put("CropMode", request.cropMode);
        query.put("LayoutIds", request.layoutIds);
        query.put("MediaEncode", request.mediaEncode);
        query.put("MixMode", request.mixMode);
        query.put("OwnerId", request.ownerId);
        query.put("PayloadType", request.payloadType);
        query.put("ReportVad", request.reportVad);
        query.put("RtpExtInfo", request.rtpExtInfo);
        query.put("SourceType", request.sourceType);
        query.put("StreamType", request.streamType);
        query.put("StreamURL", request.streamURL);
        query.put("SubSpecAudioUsers", request.subSpecAudioUsers);
        query.put("SubSpecCameraUsers", request.subSpecCameraUsers);
        query.put("SubSpecShareScreenUsers", request.subSpecShareScreenUsers);
        query.put("SubSpecUsers", request.subSpecUsers);
        query.put("TaskId", request.taskId);
        query.put("TaskType", request.taskType);
        query.put("TimeStampRef", request.timeStampRef);
        query.put("UnsubSpecAudioUsers", request.unsubSpecAudioUsers);
        query.put("UnsubSpecCameraUsers", request.unsubSpecCameraUsers);
        query.put("UnsubSpecShareScreenUsers", request.unsubSpecShareScreenUsers);
        query.put("UserPanes", request.userPanes);
        query.put("VadInterval", request.vadInterval);
        query.put("Watermarks", request.watermarks);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
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
        query.put("AppId", request.appId);
        query.put("ChannelId", request.channelId);
        query.put("CropMode", request.cropMode);
        query.put("LayoutIds", request.layoutIds);
        query.put("MediaEncode", request.mediaEncode);
        query.put("MixMode", request.mixMode);
        query.put("OwnerId", request.ownerId);
        query.put("SourceType", request.sourceType);
        query.put("StreamType", request.streamType);
        query.put("SubSpecAudioUsers", request.subSpecAudioUsers);
        query.put("SubSpecCameraUsers", request.subSpecCameraUsers);
        query.put("SubSpecShareScreenUsers", request.subSpecShareScreenUsers);
        query.put("SubSpecUsers", request.subSpecUsers);
        query.put("TaskId", request.taskId);
        query.put("TaskProfile", request.taskProfile);
        query.put("TemplateId", request.templateId);
        query.put("UnsubSpecAudioUsers", request.unsubSpecAudioUsers);
        query.put("UnsubSpecCameraUsers", request.unsubSpecCameraUsers);
        query.put("UnsubSpecShareScreenUsers", request.unsubSpecShareScreenUsers);
        query.put("UserPanes", request.userPanes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRecordTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRecordTaskResponse());
    }

    public StartRecordTaskResponse startRecordTask(StartRecordTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRecordTaskWithOptions(request, runtime);
    }

    public StopChannelUserPublishResponse stopChannelUserPublishWithOptions(StopChannelUserPublishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("ChannelId", request.channelId);
        query.put("OwnerId", request.ownerId);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopChannelUserPublish"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopChannelUserPublishResponse());
    }

    public StopChannelUserPublishResponse stopChannelUserPublish(StopChannelUserPublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopChannelUserPublishWithOptions(request, runtime);
    }

    public StopMPUTaskResponse stopMPUTaskWithOptions(StopMPUTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppId", request.appId);
        query.put("OwnerId", request.ownerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMPUTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("OwnerId", request.ownerId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopRecordTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("CallBack", request.callBack);
        query.put("ChannelIdPrefixes", request.channelIdPrefixes);
        query.put("ChannelIds", request.channelIds);
        query.put("MediaEncode", request.mediaEncode);
        query.put("OwnerId", request.ownerId);
        query.put("PlayDomain", request.playDomain);
        query.put("RuleId", request.ruleId);
        query.put("RuleName", request.ruleName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAutoLiveStreamRule"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("BackgroundColor", request.backgroundColor);
        query.put("Backgrounds", request.backgrounds);
        query.put("ClockWidgets", request.clockWidgets);
        query.put("CropMode", request.cropMode);
        query.put("LayoutIds", request.layoutIds);
        query.put("MediaEncode", request.mediaEncode);
        query.put("MixMode", request.mixMode);
        query.put("OwnerId", request.ownerId);
        query.put("SourceType", request.sourceType);
        query.put("StreamType", request.streamType);
        query.put("SubSpecAudioUsers", request.subSpecAudioUsers);
        query.put("SubSpecCameraUsers", request.subSpecCameraUsers);
        query.put("SubSpecShareScreenUsers", request.subSpecShareScreenUsers);
        query.put("SubSpecUsers", request.subSpecUsers);
        query.put("TaskId", request.taskId);
        query.put("UnsubSpecAudioUsers", request.unsubSpecAudioUsers);
        query.put("UnsubSpecCameraUsers", request.unsubSpecCameraUsers);
        query.put("UnsubSpecShareScreenUsers", request.unsubSpecShareScreenUsers);
        query.put("UserPanes", request.userPanes);
        query.put("Watermarks", request.watermarks);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMPUTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("ChannelId", request.channelId);
        query.put("LayoutIds", request.layoutIds);
        query.put("OwnerId", request.ownerId);
        query.put("SubSpecAudioUsers", request.subSpecAudioUsers);
        query.put("SubSpecCameraUsers", request.subSpecCameraUsers);
        query.put("SubSpecShareScreenUsers", request.subSpecShareScreenUsers);
        query.put("SubSpecUsers", request.subSpecUsers);
        query.put("TaskId", request.taskId);
        query.put("TemplateId", request.templateId);
        query.put("UnsubSpecAudioUsers", request.unsubSpecAudioUsers);
        query.put("UnsubSpecCameraUsers", request.unsubSpecCameraUsers);
        query.put("UnsubSpecShareScreenUsers", request.unsubSpecShareScreenUsers);
        query.put("UserPanes", request.userPanes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecordTask"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
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
        query.put("AppId", request.appId);
        query.put("BackgroundColor", request.backgroundColor);
        query.put("Backgrounds", request.backgrounds);
        query.put("ClockWidgets", request.clockWidgets);
        query.put("DelayStopTime", request.delayStopTime);
        query.put("EnableM3u8DateTime", request.enableM3u8DateTime);
        query.put("FileSplitInterval", request.fileSplitInterval);
        query.put("Formats", request.formats);
        query.put("HttpCallbackUrl", request.httpCallbackUrl);
        query.put("LayoutIds", request.layoutIds);
        query.put("MediaEncode", request.mediaEncode);
        query.put("MnsQueue", request.mnsQueue);
        query.put("Name", request.name);
        query.put("OssBucket", request.ossBucket);
        query.put("OssFilePrefix", request.ossFilePrefix);
        query.put("OwnerId", request.ownerId);
        query.put("TaskProfile", request.taskProfile);
        query.put("TemplateId", request.templateId);
        query.put("Watermarks", request.watermarks);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRecordTemplate"),
            new TeaPair("version", "2018-01-11"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRecordTemplateResponse());
    }

    public UpdateRecordTemplateResponse updateRecordTemplate(UpdateRecordTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRecordTemplateWithOptions(request, runtime);
    }
}
