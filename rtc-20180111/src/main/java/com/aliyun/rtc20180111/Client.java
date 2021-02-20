// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111;

import com.aliyun.tea.*;
import com.aliyun.rtc20180111.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddRecordTemplate", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new AddRecordTemplateResponse());
    }

    public AddRecordTemplateResponse addRecordTemplate(AddRecordTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRecordTemplateWithOptions(request, runtime);
    }

    public CreateAutoLiveStreamRuleResponse createAutoLiveStreamRuleWithOptions(CreateAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAutoLiveStreamRule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAutoLiveStreamRuleResponse());
    }

    public CreateAutoLiveStreamRuleResponse createAutoLiveStreamRule(CreateAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public CreateChannelResponse createChannelWithOptions(CreateChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateChannel", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateChannelResponse());
    }

    public CreateChannelResponse createChannel(CreateChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createChannelWithOptions(request, runtime);
    }

    public CreateConferenceResponse createConferenceWithOptions(CreateConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConference", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConferenceResponse());
    }

    public CreateConferenceResponse createConference(CreateConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConferenceWithOptions(request, runtime);
    }

    public CreateEventSubscribeResponse createEventSubscribeWithOptions(CreateEventSubscribeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEventSubscribe", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEventSubscribeResponse());
    }

    public CreateEventSubscribeResponse createEventSubscribe(CreateEventSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEventSubscribeWithOptions(request, runtime);
    }

    public CreateMPULayoutResponse createMPULayoutWithOptions(CreateMPULayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMPULayout", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMPULayoutResponse());
    }

    public CreateMPULayoutResponse createMPULayout(CreateMPULayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMPULayoutWithOptions(request, runtime);
    }

    public CreateMPURuleResponse createMPURuleWithOptions(CreateMPURuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMPURule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMPURuleResponse());
    }

    public CreateMPURuleResponse createMPURule(CreateMPURuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMPURuleWithOptions(request, runtime);
    }

    public CreateServiceLinkedRoleForRtcResponse createServiceLinkedRoleForRtcWithOptions(CreateServiceLinkedRoleForRtcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateServiceLinkedRoleForRtc", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceLinkedRoleForRtcResponse());
    }

    public CreateServiceLinkedRoleForRtcResponse createServiceLinkedRoleForRtc(CreateServiceLinkedRoleForRtcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceLinkedRoleForRtcWithOptions(request, runtime);
    }

    public CreateSubscribeResponse createSubscribeWithOptions(CreateSubscribeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSubscribe", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSubscribeResponse());
    }

    public CreateSubscribeResponse createSubscribe(CreateSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubscribeWithOptions(request, runtime);
    }

    public DeleteAutoLiveStreamRuleResponse deleteAutoLiveStreamRuleWithOptions(DeleteAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAutoLiveStreamRule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAutoLiveStreamRuleResponse());
    }

    public DeleteAutoLiveStreamRuleResponse deleteAutoLiveStreamRule(DeleteAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public DeleteChannelResponse deleteChannelWithOptions(DeleteChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteChannel", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteChannelResponse());
    }

    public DeleteChannelResponse deleteChannel(DeleteChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteChannelWithOptions(request, runtime);
    }

    public DeleteConferenceResponse deleteConferenceWithOptions(DeleteConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConference", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConferenceResponse());
    }

    public DeleteConferenceResponse deleteConference(DeleteConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConferenceWithOptions(request, runtime);
    }

    public DeleteEventSubscribeResponse deleteEventSubscribeWithOptions(DeleteEventSubscribeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEventSubscribe", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEventSubscribeResponse());
    }

    public DeleteEventSubscribeResponse deleteEventSubscribe(DeleteEventSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEventSubscribeWithOptions(request, runtime);
    }

    public DeleteMPULayoutResponse deleteMPULayoutWithOptions(DeleteMPULayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMPULayout", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMPULayoutResponse());
    }

    public DeleteMPULayoutResponse deleteMPULayout(DeleteMPULayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMPULayoutWithOptions(request, runtime);
    }

    public DeleteMPURuleResponse deleteMPURuleWithOptions(DeleteMPURuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMPURule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMPURuleResponse());
    }

    public DeleteMPURuleResponse deleteMPURule(DeleteMPURuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMPURuleWithOptions(request, runtime);
    }

    public DeleteRecordTemplateResponse deleteRecordTemplateWithOptions(DeleteRecordTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRecordTemplate", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRecordTemplateResponse());
    }

    public DeleteRecordTemplateResponse deleteRecordTemplate(DeleteRecordTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRecordTemplateWithOptions(request, runtime);
    }

    public DeleteSubscribeResponse deleteSubscribeWithOptions(DeleteSubscribeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSubscribe", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSubscribeResponse());
    }

    public DeleteSubscribeResponse deleteSubscribe(DeleteSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubscribeWithOptions(request, runtime);
    }

    public DescribeAppsResponse describeAppsWithOptions(DescribeAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeApps", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAppsResponse());
    }

    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppsWithOptions(request, runtime);
    }

    public DescribeAutoLiveStreamRuleResponse describeAutoLiveStreamRuleWithOptions(DescribeAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoLiveStreamRule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoLiveStreamRuleResponse());
    }

    public DescribeAutoLiveStreamRuleResponse describeAutoLiveStreamRule(DescribeAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public DescribeChannelParticipantsResponse describeChannelParticipantsWithOptions(DescribeChannelParticipantsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeChannelParticipants", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeChannelParticipantsResponse());
    }

    public DescribeChannelParticipantsResponse describeChannelParticipants(DescribeChannelParticipantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeChannelParticipantsWithOptions(request, runtime);
    }

    public DescribeChannelUsersResponse describeChannelUsersWithOptions(DescribeChannelUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeChannelUsers", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeChannelUsersResponse());
    }

    public DescribeChannelUsersResponse describeChannelUsers(DescribeChannelUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeChannelUsersWithOptions(request, runtime);
    }

    public DescribeConferenceAuthInfoResponse describeConferenceAuthInfoWithOptions(DescribeConferenceAuthInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConferenceAuthInfo", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeConferenceAuthInfoResponse());
    }

    public DescribeConferenceAuthInfoResponse describeConferenceAuthInfo(DescribeConferenceAuthInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConferenceAuthInfoWithOptions(request, runtime);
    }

    public DescribeMPULayoutInfoResponse describeMPULayoutInfoWithOptions(DescribeMPULayoutInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMPULayoutInfo", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMPULayoutInfoResponse());
    }

    public DescribeMPULayoutInfoResponse describeMPULayoutInfo(DescribeMPULayoutInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMPULayoutInfoWithOptions(request, runtime);
    }

    public DescribeMPULayoutInfoListResponse describeMPULayoutInfoListWithOptions(DescribeMPULayoutInfoListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMPULayoutInfoList", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMPULayoutInfoListResponse());
    }

    public DescribeMPULayoutInfoListResponse describeMPULayoutInfoList(DescribeMPULayoutInfoListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMPULayoutInfoListWithOptions(request, runtime);
    }

    public DescribeMPULayoutListResponse describeMPULayoutListWithOptions(DescribeMPULayoutListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMPULayoutList", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMPULayoutListResponse());
    }

    public DescribeMPULayoutListResponse describeMPULayoutList(DescribeMPULayoutListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMPULayoutListWithOptions(request, runtime);
    }

    public DescribeMPURuleResponse describeMPURuleWithOptions(DescribeMPURuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMPURule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMPURuleResponse());
    }

    public DescribeMPURuleResponse describeMPURule(DescribeMPURuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMPURuleWithOptions(request, runtime);
    }

    public DescribeRecordFilesResponse describeRecordFilesWithOptions(DescribeRecordFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecordFiles", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordFilesResponse());
    }

    public DescribeRecordFilesResponse describeRecordFiles(DescribeRecordFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordFilesWithOptions(request, runtime);
    }

    public DescribeRecordTasksResponse describeRecordTasksWithOptions(DescribeRecordTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecordTasks", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordTasksResponse());
    }

    public DescribeRecordTasksResponse describeRecordTasks(DescribeRecordTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordTasksWithOptions(request, runtime);
    }

    public DescribeRecordTemplatesResponse describeRecordTemplatesWithOptions(DescribeRecordTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecordTemplates", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordTemplatesResponse());
    }

    public DescribeRecordTemplatesResponse describeRecordTemplates(DescribeRecordTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordTemplatesWithOptions(request, runtime);
    }

    public DescribeRTCAppKeyResponse describeRTCAppKeyWithOptions(DescribeRTCAppKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRTCAppKey", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRTCAppKeyResponse());
    }

    public DescribeRTCAppKeyResponse describeRTCAppKey(DescribeRTCAppKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRTCAppKeyWithOptions(request, runtime);
    }

    public DescribeRtcChannelCntDataResponse describeRtcChannelCntDataWithOptions(DescribeRtcChannelCntDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcChannelCntData", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcChannelCntDataResponse());
    }

    public DescribeRtcChannelCntDataResponse describeRtcChannelCntData(DescribeRtcChannelCntDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcChannelCntDataWithOptions(request, runtime);
    }

    public DescribeRtcChannelDetailResponse describeRtcChannelDetailWithOptions(DescribeRtcChannelDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcChannelDetail", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcChannelDetailResponse());
    }

    public DescribeRtcChannelDetailResponse describeRtcChannelDetail(DescribeRtcChannelDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcChannelDetailWithOptions(request, runtime);
    }

    public DescribeRtcChannelListResponse describeRtcChannelListWithOptions(DescribeRtcChannelListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcChannelList", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcChannelListResponse());
    }

    public DescribeRtcChannelListResponse describeRtcChannelList(DescribeRtcChannelListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcChannelListWithOptions(request, runtime);
    }

    public DescribeRtcChannelMetricResponse describeRtcChannelMetricWithOptions(DescribeRtcChannelMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcChannelMetric", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcChannelMetricResponse());
    }

    public DescribeRtcChannelMetricResponse describeRtcChannelMetric(DescribeRtcChannelMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcChannelMetricWithOptions(request, runtime);
    }

    public DescribeRtcChannelMetricsResponse describeRtcChannelMetricsWithOptions(DescribeRtcChannelMetricsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcChannelMetrics", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcChannelMetricsResponse());
    }

    public DescribeRtcChannelMetricsResponse describeRtcChannelMetrics(DescribeRtcChannelMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcChannelMetricsWithOptions(request, runtime);
    }

    public DescribeRtcChannelsResponse describeRtcChannelsWithOptions(DescribeRtcChannelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcChannels", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcChannelsResponse());
    }

    public DescribeRtcChannelsResponse describeRtcChannels(DescribeRtcChannelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcChannelsWithOptions(request, runtime);
    }

    public DescribeRtcChannelUserListResponse describeRtcChannelUserListWithOptions(DescribeRtcChannelUserListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcChannelUserList", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcChannelUserListResponse());
    }

    public DescribeRtcChannelUserListResponse describeRtcChannelUserList(DescribeRtcChannelUserListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcChannelUserListWithOptions(request, runtime);
    }

    public DescribeRtcDurationDataResponse describeRtcDurationDataWithOptions(DescribeRtcDurationDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcDurationData", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcDurationDataResponse());
    }

    public DescribeRtcDurationDataResponse describeRtcDurationData(DescribeRtcDurationDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcDurationDataWithOptions(request, runtime);
    }

    public DescribeRtcPeakChannelCntDataResponse describeRtcPeakChannelCntDataWithOptions(DescribeRtcPeakChannelCntDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcPeakChannelCntData", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcPeakChannelCntDataResponse());
    }

    public DescribeRtcPeakChannelCntDataResponse describeRtcPeakChannelCntData(DescribeRtcPeakChannelCntDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcPeakChannelCntDataWithOptions(request, runtime);
    }

    public DescribeRtcPeakUserCntDataResponse describeRtcPeakUserCntDataWithOptions(DescribeRtcPeakUserCntDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcPeakUserCntData", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcPeakUserCntDataResponse());
    }

    public DescribeRtcPeakUserCntDataResponse describeRtcPeakUserCntData(DescribeRtcPeakUserCntDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcPeakUserCntDataWithOptions(request, runtime);
    }

    public DescribeRtcScaleResponse describeRtcScaleWithOptions(DescribeRtcScaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcScale", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcScaleResponse());
    }

    public DescribeRtcScaleResponse describeRtcScale(DescribeRtcScaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcScaleWithOptions(request, runtime);
    }

    public DescribeRtcScaleDetailResponse describeRtcScaleDetailWithOptions(DescribeRtcScaleDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcScaleDetail", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcScaleDetailResponse());
    }

    public DescribeRtcScaleDetailResponse describeRtcScaleDetail(DescribeRtcScaleDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcScaleDetailWithOptions(request, runtime);
    }

    public DescribeRtcUserCntDataResponse describeRtcUserCntDataWithOptions(DescribeRtcUserCntDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcUserCntData", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcUserCntDataResponse());
    }

    public DescribeRtcUserCntDataResponse describeRtcUserCntData(DescribeRtcUserCntDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcUserCntDataWithOptions(request, runtime);
    }

    public DescribeRtcUserEventsResponse describeRtcUserEventsWithOptions(DescribeRtcUserEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcUserEvents", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcUserEventsResponse());
    }

    public DescribeRtcUserEventsResponse describeRtcUserEvents(DescribeRtcUserEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcUserEventsWithOptions(request, runtime);
    }

    public DescribeRtcUserListResponse describeRtcUserListWithOptions(DescribeRtcUserListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRtcUserList", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRtcUserListResponse());
    }

    public DescribeRtcUserListResponse describeRtcUserList(DescribeRtcUserListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRtcUserListWithOptions(request, runtime);
    }

    public DescribeUserInfoInChannelResponse describeUserInfoInChannelWithOptions(DescribeUserInfoInChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserInfoInChannel", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserInfoInChannelResponse());
    }

    public DescribeUserInfoInChannelResponse describeUserInfoInChannel(DescribeUserInfoInChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserInfoInChannelWithOptions(request, runtime);
    }

    public DisableMPURuleResponse disableMPURuleWithOptions(DisableMPURuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableMPURule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DisableMPURuleResponse());
    }

    public DisableMPURuleResponse disableMPURule(DisableMPURuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableMPURuleWithOptions(request, runtime);
    }

    public EnableMPURuleResponse enableMPURuleWithOptions(EnableMPURuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableMPURule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new EnableMPURuleResponse());
    }

    public EnableMPURuleResponse enableMPURule(EnableMPURuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableMPURuleWithOptions(request, runtime);
    }

    public GetMPUTaskStatusResponse getMPUTaskStatusWithOptions(GetMPUTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMPUTaskStatus", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new GetMPUTaskStatusResponse());
    }

    public GetMPUTaskStatusResponse getMPUTaskStatus(GetMPUTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMPUTaskStatusWithOptions(request, runtime);
    }

    public ModifyAppResponse modifyAppWithOptions(ModifyAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyApp", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAppResponse());
    }

    public ModifyAppResponse modifyApp(ModifyAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAppWithOptions(request, runtime);
    }

    public ModifyConferenceResponse modifyConferenceWithOptions(ModifyConferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyConference", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyConferenceResponse());
    }

    public ModifyConferenceResponse modifyConference(ModifyConferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyConferenceWithOptions(request, runtime);
    }

    public ModifyMPULayoutResponse modifyMPULayoutWithOptions(ModifyMPULayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyMPULayout", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyMPULayoutResponse());
    }

    public ModifyMPULayoutResponse modifyMPULayout(ModifyMPULayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMPULayoutWithOptions(request, runtime);
    }

    public MuteAudioResponse muteAudioWithOptions(MuteAudioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MuteAudio", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new MuteAudioResponse());
    }

    public MuteAudioResponse muteAudio(MuteAudioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.muteAudioWithOptions(request, runtime);
    }

    public MuteAudioAllResponse muteAudioAllWithOptions(MuteAudioAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MuteAudioAll", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new MuteAudioAllResponse());
    }

    public MuteAudioAllResponse muteAudioAll(MuteAudioAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.muteAudioAllWithOptions(request, runtime);
    }

    public ReceiveNotifyResponse receiveNotifyWithOptions(ReceiveNotifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReceiveNotify", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new ReceiveNotifyResponse());
    }

    public ReceiveNotifyResponse receiveNotify(ReceiveNotifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.receiveNotifyWithOptions(request, runtime);
    }

    public RemoveParticipantsResponse removeParticipantsWithOptions(RemoveParticipantsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveParticipants", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveParticipantsResponse());
    }

    public RemoveParticipantsResponse removeParticipants(RemoveParticipantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeParticipantsWithOptions(request, runtime);
    }

    public RemoveTerminalsResponse removeTerminalsWithOptions(RemoveTerminalsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveTerminals", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveTerminalsResponse());
    }

    public RemoveTerminalsResponse removeTerminals(RemoveTerminalsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeTerminalsWithOptions(request, runtime);
    }

    public SetChannelPropertyResponse setChannelPropertyWithOptions(SetChannelPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetChannelProperty", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new SetChannelPropertyResponse());
    }

    public SetChannelPropertyResponse setChannelProperty(SetChannelPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setChannelPropertyWithOptions(request, runtime);
    }

    public StartMPUTaskResponse startMPUTaskWithOptions(StartMPUTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartMPUTask", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new StartMPUTaskResponse());
    }

    public StartMPUTaskResponse startMPUTask(StartMPUTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startMPUTaskWithOptions(request, runtime);
    }

    public StartRecordTaskResponse startRecordTaskWithOptions(StartRecordTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartRecordTask", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new StartRecordTaskResponse());
    }

    public StartRecordTaskResponse startRecordTask(StartRecordTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRecordTaskWithOptions(request, runtime);
    }

    public StopChannelUserPublishResponse stopChannelUserPublishWithOptions(StopChannelUserPublishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopChannelUserPublish", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new StopChannelUserPublishResponse());
    }

    public StopChannelUserPublishResponse stopChannelUserPublish(StopChannelUserPublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopChannelUserPublishWithOptions(request, runtime);
    }

    public StopMPUTaskResponse stopMPUTaskWithOptions(StopMPUTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopMPUTask", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new StopMPUTaskResponse());
    }

    public StopMPUTaskResponse stopMPUTask(StopMPUTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopMPUTaskWithOptions(request, runtime);
    }

    public StopRecordTaskResponse stopRecordTaskWithOptions(StopRecordTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopRecordTask", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new StopRecordTaskResponse());
    }

    public StopRecordTaskResponse stopRecordTask(StopRecordTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopRecordTaskWithOptions(request, runtime);
    }

    public UnmuteAudioResponse unmuteAudioWithOptions(UnmuteAudioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnmuteAudio", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UnmuteAudioResponse());
    }

    public UnmuteAudioResponse unmuteAudio(UnmuteAudioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unmuteAudioWithOptions(request, runtime);
    }

    public UnmuteAudioAllResponse unmuteAudioAllWithOptions(UnmuteAudioAllRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnmuteAudioAll", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UnmuteAudioAllResponse());
    }

    public UnmuteAudioAllResponse unmuteAudioAll(UnmuteAudioAllRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unmuteAudioAllWithOptions(request, runtime);
    }

    public UpdateChannelResponse updateChannelWithOptions(UpdateChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateChannel", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateChannelResponse());
    }

    public UpdateChannelResponse updateChannel(UpdateChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateChannelWithOptions(request, runtime);
    }

    public UpdateMPULayoutResponse updateMPULayoutWithOptions(UpdateMPULayoutRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMPULayout", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMPULayoutResponse());
    }

    public UpdateMPULayoutResponse updateMPULayout(UpdateMPULayoutRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMPULayoutWithOptions(request, runtime);
    }

    public UpdateRecordTaskResponse updateRecordTaskWithOptions(UpdateRecordTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRecordTask", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRecordTaskResponse());
    }

    public UpdateRecordTaskResponse updateRecordTask(UpdateRecordTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRecordTaskWithOptions(request, runtime);
    }

    public UpdateRecordTemplateResponse updateRecordTemplateWithOptions(UpdateRecordTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRecordTemplate", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRecordTemplateResponse());
    }

    public UpdateRecordTemplateResponse updateRecordTemplate(UpdateRecordTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRecordTemplateWithOptions(request, runtime);
    }
}
