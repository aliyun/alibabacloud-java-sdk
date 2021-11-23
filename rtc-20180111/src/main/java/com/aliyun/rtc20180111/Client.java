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

    public CreateRecordIndexFileResponse createRecordIndexFileWithOptions(CreateRecordIndexFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRecordIndexFile", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRecordIndexFileResponse());
    }

    public CreateRecordIndexFileResponse createRecordIndexFile(CreateRecordIndexFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRecordIndexFileWithOptions(request, runtime);
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

    public DisableAutoLiveStreamRuleResponse disableAutoLiveStreamRuleWithOptions(DisableAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableAutoLiveStreamRule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new DisableAutoLiveStreamRuleResponse());
    }

    public DisableAutoLiveStreamRuleResponse disableAutoLiveStreamRule(DisableAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public EnableAutoLiveStreamRuleResponse enableAutoLiveStreamRuleWithOptions(EnableAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableAutoLiveStreamRule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new EnableAutoLiveStreamRuleResponse());
    }

    public EnableAutoLiveStreamRuleResponse enableAutoLiveStreamRule(EnableAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableAutoLiveStreamRuleWithOptions(request, runtime);
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

    public UpdateAutoLiveStreamRuleResponse updateAutoLiveStreamRuleWithOptions(UpdateAutoLiveStreamRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAutoLiveStreamRule", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAutoLiveStreamRuleResponse());
    }

    public UpdateAutoLiveStreamRuleResponse updateAutoLiveStreamRule(UpdateAutoLiveStreamRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAutoLiveStreamRuleWithOptions(request, runtime);
    }

    public UpdateMPUTaskResponse updateMPUTaskWithOptions(UpdateMPUTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateMPUTask", "2018-01-11", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateMPUTaskResponse());
    }

    public UpdateMPUTaskResponse updateMPUTask(UpdateMPUTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMPUTaskWithOptions(request, runtime);
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
