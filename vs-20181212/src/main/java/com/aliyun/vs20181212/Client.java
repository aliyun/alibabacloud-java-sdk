// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212;

import com.aliyun.tea.*;
import com.aliyun.vs20181212.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("vs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddVsPullStreamInfoConfigResponse addVsPullStreamInfoConfigWithOptions(AddVsPullStreamInfoConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVsPullStreamInfoConfig", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new AddVsPullStreamInfoConfigResponse());
    }

    public AddVsPullStreamInfoConfigResponse addVsPullStreamInfoConfig(AddVsPullStreamInfoConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    public BatchBindDirectoriesResponse batchBindDirectoriesWithOptions(BatchBindDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchBindDirectories", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchBindDirectoriesResponse());
    }

    public BatchBindDirectoriesResponse batchBindDirectories(BatchBindDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindDirectoriesWithOptions(request, runtime);
    }

    public BatchBindParentPlatformDevicesResponse batchBindParentPlatformDevicesWithOptions(BatchBindParentPlatformDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchBindParentPlatformDevices", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchBindParentPlatformDevicesResponse());
    }

    public BatchBindParentPlatformDevicesResponse batchBindParentPlatformDevices(BatchBindParentPlatformDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindParentPlatformDevicesWithOptions(request, runtime);
    }

    public BatchBindPurchasedDevicesResponse batchBindPurchasedDevicesWithOptions(BatchBindPurchasedDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchBindPurchasedDevices", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchBindPurchasedDevicesResponse());
    }

    public BatchBindPurchasedDevicesResponse batchBindPurchasedDevices(BatchBindPurchasedDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindPurchasedDevicesWithOptions(request, runtime);
    }

    public BatchBindTemplateResponse batchBindTemplateWithOptions(BatchBindTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchBindTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchBindTemplateResponse());
    }

    public BatchBindTemplateResponse batchBindTemplate(BatchBindTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindTemplateWithOptions(request, runtime);
    }

    public BatchBindTemplatesResponse batchBindTemplatesWithOptions(BatchBindTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchBindTemplates", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchBindTemplatesResponse());
    }

    public BatchBindTemplatesResponse batchBindTemplates(BatchBindTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindTemplatesWithOptions(request, runtime);
    }

    public BatchDeleteDevicesResponse batchDeleteDevicesWithOptions(BatchDeleteDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteDevices", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteDevicesResponse());
    }

    public BatchDeleteDevicesResponse batchDeleteDevices(BatchDeleteDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteDevicesWithOptions(request, runtime);
    }

    public BatchDeleteVsDomainConfigsResponse batchDeleteVsDomainConfigsWithOptions(BatchDeleteVsDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteVsDomainConfigs", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteVsDomainConfigsResponse());
    }

    public BatchDeleteVsDomainConfigsResponse batchDeleteVsDomainConfigs(BatchDeleteVsDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteVsDomainConfigsWithOptions(request, runtime);
    }

    public BatchForbidVsStreamResponse batchForbidVsStreamWithOptions(BatchForbidVsStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchForbidVsStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchForbidVsStreamResponse());
    }

    public BatchForbidVsStreamResponse batchForbidVsStream(BatchForbidVsStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchForbidVsStreamWithOptions(request, runtime);
    }

    public BatchResumeVsStreamResponse batchResumeVsStreamWithOptions(BatchResumeVsStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchResumeVsStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchResumeVsStreamResponse());
    }

    public BatchResumeVsStreamResponse batchResumeVsStream(BatchResumeVsStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchResumeVsStreamWithOptions(request, runtime);
    }

    public BatchSetVsDomainConfigsResponse batchSetVsDomainConfigsWithOptions(BatchSetVsDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchSetVsDomainConfigs", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchSetVsDomainConfigsResponse());
    }

    public BatchSetVsDomainConfigsResponse batchSetVsDomainConfigs(BatchSetVsDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetVsDomainConfigsWithOptions(request, runtime);
    }

    public BatchStartDevicesResponse batchStartDevicesWithOptions(BatchStartDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStartDevices", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStartDevicesResponse());
    }

    public BatchStartDevicesResponse batchStartDevices(BatchStartDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStartDevicesWithOptions(request, runtime);
    }

    public BatchStartStreamsResponse batchStartStreamsWithOptions(BatchStartStreamsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStartStreams", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStartStreamsResponse());
    }

    public BatchStartStreamsResponse batchStartStreams(BatchStartStreamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStartStreamsWithOptions(request, runtime);
    }

    public BatchStopDevicesResponse batchStopDevicesWithOptions(BatchStopDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStopDevices", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStopDevicesResponse());
    }

    public BatchStopDevicesResponse batchStopDevices(BatchStopDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStopDevicesWithOptions(request, runtime);
    }

    public BatchStopStreamsResponse batchStopStreamsWithOptions(BatchStopStreamsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStopStreams", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStopStreamsResponse());
    }

    public BatchStopStreamsResponse batchStopStreams(BatchStopStreamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStopStreamsWithOptions(request, runtime);
    }

    public BatchUnbindDirectoriesResponse batchUnbindDirectoriesWithOptions(BatchUnbindDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUnbindDirectories", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUnbindDirectoriesResponse());
    }

    public BatchUnbindDirectoriesResponse batchUnbindDirectories(BatchUnbindDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindDirectoriesWithOptions(request, runtime);
    }

    public BatchUnbindParentPlatformDevicesResponse batchUnbindParentPlatformDevicesWithOptions(BatchUnbindParentPlatformDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUnbindParentPlatformDevices", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUnbindParentPlatformDevicesResponse());
    }

    public BatchUnbindParentPlatformDevicesResponse batchUnbindParentPlatformDevices(BatchUnbindParentPlatformDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindParentPlatformDevicesWithOptions(request, runtime);
    }

    public BatchUnbindPurchasedDevicesResponse batchUnbindPurchasedDevicesWithOptions(BatchUnbindPurchasedDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUnbindPurchasedDevices", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUnbindPurchasedDevicesResponse());
    }

    public BatchUnbindPurchasedDevicesResponse batchUnbindPurchasedDevices(BatchUnbindPurchasedDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindPurchasedDevicesWithOptions(request, runtime);
    }

    public BatchUnbindTemplateResponse batchUnbindTemplateWithOptions(BatchUnbindTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUnbindTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUnbindTemplateResponse());
    }

    public BatchUnbindTemplateResponse batchUnbindTemplate(BatchUnbindTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindTemplateWithOptions(request, runtime);
    }

    public BatchUnbindTemplatesResponse batchUnbindTemplatesWithOptions(BatchUnbindTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchUnbindTemplates", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BatchUnbindTemplatesResponse());
    }

    public BatchUnbindTemplatesResponse batchUnbindTemplates(BatchUnbindTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindTemplatesWithOptions(request, runtime);
    }

    public BindDirectoryResponse bindDirectoryWithOptions(BindDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindDirectory", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BindDirectoryResponse());
    }

    public BindDirectoryResponse bindDirectory(BindDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindDirectoryWithOptions(request, runtime);
    }

    public BindParentPlatformDeviceResponse bindParentPlatformDeviceWithOptions(BindParentPlatformDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindParentPlatformDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BindParentPlatformDeviceResponse());
    }

    public BindParentPlatformDeviceResponse bindParentPlatformDevice(BindParentPlatformDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindParentPlatformDeviceWithOptions(request, runtime);
    }

    public BindPurchasedDeviceResponse bindPurchasedDeviceWithOptions(BindPurchasedDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindPurchasedDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BindPurchasedDeviceResponse());
    }

    public BindPurchasedDeviceResponse bindPurchasedDevice(BindPurchasedDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindPurchasedDeviceWithOptions(request, runtime);
    }

    public BindTemplateResponse bindTemplateWithOptions(BindTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new BindTemplateResponse());
    }

    public BindTemplateResponse bindTemplate(BindTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindTemplateWithOptions(request, runtime);
    }

    public ContinuousAdjustResponse continuousAdjustWithOptions(ContinuousAdjustRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ContinuousAdjust", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ContinuousAdjustResponse());
    }

    public ContinuousAdjustResponse continuousAdjust(ContinuousAdjustRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.continuousAdjustWithOptions(request, runtime);
    }

    public ContinuousMoveResponse continuousMoveWithOptions(ContinuousMoveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ContinuousMove", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ContinuousMoveResponse());
    }

    public ContinuousMoveResponse continuousMove(ContinuousMoveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.continuousMoveWithOptions(request, runtime);
    }

    public CreateDeviceResponse createDeviceWithOptions(CreateDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeviceResponse());
    }

    public CreateDeviceResponse createDevice(CreateDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceWithOptions(request, runtime);
    }

    public CreateDeviceAlarmResponse createDeviceAlarmWithOptions(CreateDeviceAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeviceAlarm", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeviceAlarmResponse());
    }

    public CreateDeviceAlarmResponse createDeviceAlarm(CreateDeviceAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceAlarmWithOptions(request, runtime);
    }

    public CreateDirectoryResponse createDirectoryWithOptions(CreateDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDirectory", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDirectoryResponse());
    }

    public CreateDirectoryResponse createDirectory(CreateDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDirectoryWithOptions(request, runtime);
    }

    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGroup", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGroupResponse());
    }

    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    public CreateParentPlatformResponse createParentPlatformWithOptions(CreateParentPlatformRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateParentPlatform", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateParentPlatformResponse());
    }

    public CreateParentPlatformResponse createParentPlatform(CreateParentPlatformRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createParentPlatformWithOptions(request, runtime);
    }

    public CreateStreamSnapshotResponse createStreamSnapshotWithOptions(CreateStreamSnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateStreamSnapshot", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateStreamSnapshotResponse());
    }

    public CreateStreamSnapshotResponse createStreamSnapshot(CreateStreamSnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStreamSnapshotWithOptions(request, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTemplateResponse());
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceResponse());
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    public DeleteDirectoryResponse deleteDirectoryWithOptions(DeleteDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDirectory", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDirectoryResponse());
    }

    public DeleteDirectoryResponse deleteDirectory(DeleteDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDirectoryWithOptions(request, runtime);
    }

    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGroup", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGroupResponse());
    }

    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    public DeleteParentPlatformResponse deleteParentPlatformWithOptions(DeleteParentPlatformRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteParentPlatform", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteParentPlatformResponse());
    }

    public DeleteParentPlatformResponse deleteParentPlatform(DeleteParentPlatformRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteParentPlatformWithOptions(request, runtime);
    }

    public DeletePresetResponse deletePresetWithOptions(DeletePresetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePreset", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePresetResponse());
    }

    public DeletePresetResponse deletePreset(DeletePresetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePresetWithOptions(request, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTemplateResponse());
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    public DeleteVsPullStreamInfoConfigResponse deleteVsPullStreamInfoConfigWithOptions(DeleteVsPullStreamInfoConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVsPullStreamInfoConfig", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVsPullStreamInfoConfigResponse());
    }

    public DeleteVsPullStreamInfoConfigResponse deleteVsPullStreamInfoConfig(DeleteVsPullStreamInfoConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    public DeleteVsStreamsNotifyUrlConfigResponse deleteVsStreamsNotifyUrlConfigWithOptions(DeleteVsStreamsNotifyUrlConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVsStreamsNotifyUrlConfig", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVsStreamsNotifyUrlConfigResponse());
    }

    public DeleteVsStreamsNotifyUrlConfigResponse deleteVsStreamsNotifyUrlConfig(DeleteVsStreamsNotifyUrlConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVsStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    public DescribeAccountStatResponse describeAccountStatWithOptions(DescribeAccountStatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccountStat", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccountStatResponse());
    }

    public DescribeAccountStatResponse describeAccountStat(DescribeAccountStatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccountStatWithOptions(request, runtime);
    }

    public DescribeDeviceResponse describeDeviceWithOptions(DescribeDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceResponse());
    }

    public DescribeDeviceResponse describeDevice(DescribeDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceWithOptions(request, runtime);
    }

    public DescribeDeviceChannelsResponse describeDeviceChannelsWithOptions(DescribeDeviceChannelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceChannels", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceChannelsResponse());
    }

    public DescribeDeviceChannelsResponse describeDeviceChannels(DescribeDeviceChannelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceChannelsWithOptions(request, runtime);
    }

    public DescribeDeviceGatewayResponse describeDeviceGatewayWithOptions(DescribeDeviceGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceGateway", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceGatewayResponse());
    }

    public DescribeDeviceGatewayResponse describeDeviceGateway(DescribeDeviceGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceGatewayWithOptions(request, runtime);
    }

    public DescribeDevicesResponse describeDevicesWithOptions(DescribeDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDevices", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDevicesResponse());
    }

    public DescribeDevicesResponse describeDevices(DescribeDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDevicesWithOptions(request, runtime);
    }

    public DescribeDeviceURLResponse describeDeviceURLWithOptions(DescribeDeviceURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceURL", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceURLResponse());
    }

    public DescribeDeviceURLResponse describeDeviceURL(DescribeDeviceURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceURLWithOptions(request, runtime);
    }

    public DescribeDirectoriesResponse describeDirectoriesWithOptions(DescribeDirectoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDirectories", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDirectoriesResponse());
    }

    public DescribeDirectoriesResponse describeDirectories(DescribeDirectoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDirectoriesWithOptions(request, runtime);
    }

    public DescribeDirectoryResponse describeDirectoryWithOptions(DescribeDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDirectory", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDirectoryResponse());
    }

    public DescribeDirectoryResponse describeDirectory(DescribeDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDirectoryWithOptions(request, runtime);
    }

    public DescribeGroupResponse describeGroupWithOptions(DescribeGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroup", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupResponse());
    }

    public DescribeGroupResponse describeGroup(DescribeGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupWithOptions(request, runtime);
    }

    public DescribeGroupsResponse describeGroupsWithOptions(DescribeGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroups", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupsResponse());
    }

    public DescribeGroupsResponse describeGroups(DescribeGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupsWithOptions(request, runtime);
    }

    public DescribeParentPlatformResponse describeParentPlatformWithOptions(DescribeParentPlatformRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParentPlatform", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParentPlatformResponse());
    }

    public DescribeParentPlatformResponse describeParentPlatform(DescribeParentPlatformRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParentPlatformWithOptions(request, runtime);
    }

    public DescribeParentPlatformDevicesResponse describeParentPlatformDevicesWithOptions(DescribeParentPlatformDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParentPlatformDevices", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParentPlatformDevicesResponse());
    }

    public DescribeParentPlatformDevicesResponse describeParentPlatformDevices(DescribeParentPlatformDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParentPlatformDevicesWithOptions(request, runtime);
    }

    public DescribeParentPlatformsResponse describeParentPlatformsWithOptions(DescribeParentPlatformsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeParentPlatforms", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeParentPlatformsResponse());
    }

    public DescribeParentPlatformsResponse describeParentPlatforms(DescribeParentPlatformsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeParentPlatformsWithOptions(request, runtime);
    }

    public DescribePresetsResponse describePresetsWithOptions(DescribePresetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePresets", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePresetsResponse());
    }

    public DescribePresetsResponse describePresets(DescribePresetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePresetsWithOptions(request, runtime);
    }

    public DescribePurchasedDeviceResponse describePurchasedDeviceWithOptions(DescribePurchasedDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePurchasedDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePurchasedDeviceResponse());
    }

    public DescribePurchasedDeviceResponse describePurchasedDevice(DescribePurchasedDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePurchasedDeviceWithOptions(request, runtime);
    }

    public DescribePurchasedDevicesResponse describePurchasedDevicesWithOptions(DescribePurchasedDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePurchasedDevices", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePurchasedDevicesResponse());
    }

    public DescribePurchasedDevicesResponse describePurchasedDevices(DescribePurchasedDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePurchasedDevicesWithOptions(request, runtime);
    }

    public DescribeRecordsResponse describeRecordsWithOptions(DescribeRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRecords", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRecordsResponse());
    }

    public DescribeRecordsResponse describeRecords(DescribeRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRecordsWithOptions(request, runtime);
    }

    public DescribeStreamResponse describeStreamWithOptions(DescribeStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStreamResponse());
    }

    public DescribeStreamResponse describeStream(DescribeStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStreamWithOptions(request, runtime);
    }

    public DescribeStreamsResponse describeStreamsWithOptions(DescribeStreamsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStreams", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStreamsResponse());
    }

    public DescribeStreamsResponse describeStreams(DescribeStreamsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStreamsWithOptions(request, runtime);
    }

    public DescribeStreamURLResponse describeStreamURLWithOptions(DescribeStreamURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStreamURL", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStreamURLResponse());
    }

    public DescribeStreamURLResponse describeStreamURL(DescribeStreamURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStreamURLWithOptions(request, runtime);
    }

    public DescribeStreamVodListResponse describeStreamVodListWithOptions(DescribeStreamVodListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStreamVodList", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStreamVodListResponse());
    }

    public DescribeStreamVodListResponse describeStreamVodList(DescribeStreamVodListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStreamVodListWithOptions(request, runtime);
    }

    public DescribeTemplateResponse describeTemplateWithOptions(DescribeTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTemplateResponse());
    }

    public DescribeTemplateResponse describeTemplate(DescribeTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTemplateWithOptions(request, runtime);
    }

    public DescribeTemplatesResponse describeTemplatesWithOptions(DescribeTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTemplates", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTemplatesResponse());
    }

    public DescribeTemplatesResponse describeTemplates(DescribeTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTemplatesWithOptions(request, runtime);
    }

    public DescribeVodStreamURLResponse describeVodStreamURLWithOptions(DescribeVodStreamURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVodStreamURL", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVodStreamURLResponse());
    }

    public DescribeVodStreamURLResponse describeVodStreamURL(DescribeVodStreamURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVodStreamURLWithOptions(request, runtime);
    }

    public DescribeVsCertificateDetailResponse describeVsCertificateDetailWithOptions(DescribeVsCertificateDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsCertificateDetail", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsCertificateDetailResponse());
    }

    public DescribeVsCertificateDetailResponse describeVsCertificateDetail(DescribeVsCertificateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsCertificateDetailWithOptions(request, runtime);
    }

    public DescribeVsCertificateListResponse describeVsCertificateListWithOptions(DescribeVsCertificateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsCertificateList", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsCertificateListResponse());
    }

    public DescribeVsCertificateListResponse describeVsCertificateList(DescribeVsCertificateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsCertificateListWithOptions(request, runtime);
    }

    public DescribeVsDomainBpsDataResponse describeVsDomainBpsDataWithOptions(DescribeVsDomainBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainBpsData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainBpsDataResponse());
    }

    public DescribeVsDomainBpsDataResponse describeVsDomainBpsData(DescribeVsDomainBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainBpsDataWithOptions(request, runtime);
    }

    public DescribeVsDomainCertificateInfoResponse describeVsDomainCertificateInfoWithOptions(DescribeVsDomainCertificateInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainCertificateInfo", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainCertificateInfoResponse());
    }

    public DescribeVsDomainCertificateInfoResponse describeVsDomainCertificateInfo(DescribeVsDomainCertificateInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainCertificateInfoWithOptions(request, runtime);
    }

    public DescribeVsDomainConfigsResponse describeVsDomainConfigsWithOptions(DescribeVsDomainConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainConfigs", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainConfigsResponse());
    }

    public DescribeVsDomainConfigsResponse describeVsDomainConfigs(DescribeVsDomainConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainConfigsWithOptions(request, runtime);
    }

    public DescribeVsDomainDetailResponse describeVsDomainDetailWithOptions(DescribeVsDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainDetail", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainDetailResponse());
    }

    public DescribeVsDomainDetailResponse describeVsDomainDetail(DescribeVsDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainDetailWithOptions(request, runtime);
    }

    public DescribeVsDomainPvDataResponse describeVsDomainPvDataWithOptions(DescribeVsDomainPvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainPvData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainPvDataResponse());
    }

    public DescribeVsDomainPvDataResponse describeVsDomainPvData(DescribeVsDomainPvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainPvDataWithOptions(request, runtime);
    }

    public DescribeVsDomainPvUvDataResponse describeVsDomainPvUvDataWithOptions(DescribeVsDomainPvUvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainPvUvData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainPvUvDataResponse());
    }

    public DescribeVsDomainPvUvDataResponse describeVsDomainPvUvData(DescribeVsDomainPvUvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainPvUvDataWithOptions(request, runtime);
    }

    public DescribeVsDomainRecordDataResponse describeVsDomainRecordDataWithOptions(DescribeVsDomainRecordDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainRecordData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainRecordDataResponse());
    }

    public DescribeVsDomainRecordDataResponse describeVsDomainRecordData(DescribeVsDomainRecordDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainRecordDataWithOptions(request, runtime);
    }

    public DescribeVsDomainRegionDataResponse describeVsDomainRegionDataWithOptions(DescribeVsDomainRegionDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainRegionData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainRegionDataResponse());
    }

    public DescribeVsDomainRegionDataResponse describeVsDomainRegionData(DescribeVsDomainRegionDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainRegionDataWithOptions(request, runtime);
    }

    public DescribeVsDomainReqBpsDataResponse describeVsDomainReqBpsDataWithOptions(DescribeVsDomainReqBpsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainReqBpsData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainReqBpsDataResponse());
    }

    public DescribeVsDomainReqBpsDataResponse describeVsDomainReqBpsData(DescribeVsDomainReqBpsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainReqBpsDataWithOptions(request, runtime);
    }

    public DescribeVsDomainReqTrafficDataResponse describeVsDomainReqTrafficDataWithOptions(DescribeVsDomainReqTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainReqTrafficData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainReqTrafficDataResponse());
    }

    public DescribeVsDomainReqTrafficDataResponse describeVsDomainReqTrafficData(DescribeVsDomainReqTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainReqTrafficDataWithOptions(request, runtime);
    }

    public DescribeVsDomainSnapshotDataResponse describeVsDomainSnapshotDataWithOptions(DescribeVsDomainSnapshotDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainSnapshotData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainSnapshotDataResponse());
    }

    public DescribeVsDomainSnapshotDataResponse describeVsDomainSnapshotData(DescribeVsDomainSnapshotDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainSnapshotDataWithOptions(request, runtime);
    }

    public DescribeVsDomainTrafficDataResponse describeVsDomainTrafficDataWithOptions(DescribeVsDomainTrafficDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainTrafficData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainTrafficDataResponse());
    }

    public DescribeVsDomainTrafficDataResponse describeVsDomainTrafficData(DescribeVsDomainTrafficDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainTrafficDataWithOptions(request, runtime);
    }

    public DescribeVsDomainUvDataResponse describeVsDomainUvDataWithOptions(DescribeVsDomainUvDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsDomainUvData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsDomainUvDataResponse());
    }

    public DescribeVsDomainUvDataResponse describeVsDomainUvData(DescribeVsDomainUvDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsDomainUvDataWithOptions(request, runtime);
    }

    public DescribeVsPullStreamInfoConfigResponse describeVsPullStreamInfoConfigWithOptions(DescribeVsPullStreamInfoConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsPullStreamInfoConfig", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsPullStreamInfoConfigResponse());
    }

    public DescribeVsPullStreamInfoConfigResponse describeVsPullStreamInfoConfig(DescribeVsPullStreamInfoConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsPullStreamInfoConfigWithOptions(request, runtime);
    }

    public DescribeVsStreamsNotifyUrlConfigResponse describeVsStreamsNotifyUrlConfigWithOptions(DescribeVsStreamsNotifyUrlConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsStreamsNotifyUrlConfig", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsStreamsNotifyUrlConfigResponse());
    }

    public DescribeVsStreamsNotifyUrlConfigResponse describeVsStreamsNotifyUrlConfig(DescribeVsStreamsNotifyUrlConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    public DescribeVsStreamsOnlineListResponse describeVsStreamsOnlineListWithOptions(DescribeVsStreamsOnlineListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsStreamsOnlineList", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsStreamsOnlineListResponse());
    }

    public DescribeVsStreamsOnlineListResponse describeVsStreamsOnlineList(DescribeVsStreamsOnlineListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsStreamsOnlineListWithOptions(request, runtime);
    }

    public DescribeVsStreamsPublishListResponse describeVsStreamsPublishListWithOptions(DescribeVsStreamsPublishListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsStreamsPublishList", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsStreamsPublishListResponse());
    }

    public DescribeVsStreamsPublishListResponse describeVsStreamsPublishList(DescribeVsStreamsPublishListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsStreamsPublishListWithOptions(request, runtime);
    }

    public DescribeVsTopDomainsByFlowResponse describeVsTopDomainsByFlowWithOptions(DescribeVsTopDomainsByFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsTopDomainsByFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsTopDomainsByFlowResponse());
    }

    public DescribeVsTopDomainsByFlowResponse describeVsTopDomainsByFlow(DescribeVsTopDomainsByFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsTopDomainsByFlowWithOptions(request, runtime);
    }

    public DescribeVsUpPeakPublishStreamDataResponse describeVsUpPeakPublishStreamDataWithOptions(DescribeVsUpPeakPublishStreamDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsUpPeakPublishStreamData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsUpPeakPublishStreamDataResponse());
    }

    public DescribeVsUpPeakPublishStreamDataResponse describeVsUpPeakPublishStreamData(DescribeVsUpPeakPublishStreamDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsUpPeakPublishStreamDataWithOptions(request, runtime);
    }

    public DescribeVsUserResourcePackageResponse describeVsUserResourcePackageWithOptions(DescribeVsUserResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVsUserResourcePackage", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVsUserResourcePackageResponse());
    }

    public DescribeVsUserResourcePackageResponse describeVsUserResourcePackage(DescribeVsUserResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVsUserResourcePackageWithOptions(request, runtime);
    }

    public ForbidVsStreamResponse forbidVsStreamWithOptions(ForbidVsStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ForbidVsStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ForbidVsStreamResponse());
    }

    public ForbidVsStreamResponse forbidVsStream(ForbidVsStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.forbidVsStreamWithOptions(request, runtime);
    }

    public GotoPresetResponse gotoPresetWithOptions(GotoPresetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GotoPreset", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new GotoPresetResponse());
    }

    public GotoPresetResponse gotoPreset(GotoPresetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.gotoPresetWithOptions(request, runtime);
    }

    public ModifyDeviceResponse modifyDeviceWithOptions(ModifyDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDeviceResponse());
    }

    public ModifyDeviceResponse modifyDevice(ModifyDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDeviceWithOptions(request, runtime);
    }

    public ModifyDeviceAlarmResponse modifyDeviceAlarmWithOptions(ModifyDeviceAlarmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDeviceAlarm", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDeviceAlarmResponse());
    }

    public ModifyDeviceAlarmResponse modifyDeviceAlarm(ModifyDeviceAlarmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDeviceAlarmWithOptions(request, runtime);
    }

    public ModifyDeviceCaptureResponse modifyDeviceCaptureWithOptions(ModifyDeviceCaptureRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDeviceCapture", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDeviceCaptureResponse());
    }

    public ModifyDeviceCaptureResponse modifyDeviceCapture(ModifyDeviceCaptureRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDeviceCaptureWithOptions(request, runtime);
    }

    public ModifyDeviceChannelsResponse modifyDeviceChannelsWithOptions(ModifyDeviceChannelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDeviceChannels", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDeviceChannelsResponse());
    }

    public ModifyDeviceChannelsResponse modifyDeviceChannels(ModifyDeviceChannelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDeviceChannelsWithOptions(request, runtime);
    }

    public ModifyDirectoryResponse modifyDirectoryWithOptions(ModifyDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDirectory", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDirectoryResponse());
    }

    public ModifyDirectoryResponse modifyDirectory(ModifyDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDirectoryWithOptions(request, runtime);
    }

    public ModifyGroupResponse modifyGroupWithOptions(ModifyGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyGroup", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyGroupResponse());
    }

    public ModifyGroupResponse modifyGroup(ModifyGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGroupWithOptions(request, runtime);
    }

    public ModifyParentPlatformResponse modifyParentPlatformWithOptions(ModifyParentPlatformRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyParentPlatform", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyParentPlatformResponse());
    }

    public ModifyParentPlatformResponse modifyParentPlatform(ModifyParentPlatformRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyParentPlatformWithOptions(request, runtime);
    }

    public ModifyTemplateResponse modifyTemplateWithOptions(ModifyTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyTemplateResponse());
    }

    public ModifyTemplateResponse modifyTemplate(ModifyTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyTemplateWithOptions(request, runtime);
    }

    public OpenVsServiceResponse openVsServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("OpenVsService", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new OpenVsServiceResponse());
    }

    public OpenVsServiceResponse openVsService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openVsServiceWithOptions(runtime);
    }

    public ResumeVsStreamResponse resumeVsStreamWithOptions(ResumeVsStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeVsStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeVsStreamResponse());
    }

    public ResumeVsStreamResponse resumeVsStream(ResumeVsStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeVsStreamWithOptions(request, runtime);
    }

    public SetPresetResponse setPresetWithOptions(SetPresetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetPreset", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new SetPresetResponse());
    }

    public SetPresetResponse setPreset(SetPresetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setPresetWithOptions(request, runtime);
    }

    public SetVsDomainCertificateResponse setVsDomainCertificateWithOptions(SetVsDomainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetVsDomainCertificate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new SetVsDomainCertificateResponse());
    }

    public SetVsDomainCertificateResponse setVsDomainCertificate(SetVsDomainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setVsDomainCertificateWithOptions(request, runtime);
    }

    public SetVsStreamsNotifyUrlConfigResponse setVsStreamsNotifyUrlConfigWithOptions(SetVsStreamsNotifyUrlConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetVsStreamsNotifyUrlConfig", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new SetVsStreamsNotifyUrlConfigResponse());
    }

    public SetVsStreamsNotifyUrlConfigResponse setVsStreamsNotifyUrlConfig(SetVsStreamsNotifyUrlConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setVsStreamsNotifyUrlConfigWithOptions(request, runtime);
    }

    public StartDeviceResponse startDeviceWithOptions(StartDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StartDeviceResponse());
    }

    public StartDeviceResponse startDevice(StartDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDeviceWithOptions(request, runtime);
    }

    public StartParentPlatformResponse startParentPlatformWithOptions(StartParentPlatformRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartParentPlatform", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StartParentPlatformResponse());
    }

    public StartParentPlatformResponse startParentPlatform(StartParentPlatformRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startParentPlatformWithOptions(request, runtime);
    }

    public StartRecordStreamResponse startRecordStreamWithOptions(StartRecordStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartRecordStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StartRecordStreamResponse());
    }

    public StartRecordStreamResponse startRecordStream(StartRecordStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRecordStreamWithOptions(request, runtime);
    }

    public StartStreamResponse startStreamWithOptions(StartStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StartStreamResponse());
    }

    public StartStreamResponse startStream(StartStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startStreamWithOptions(request, runtime);
    }

    public StartTransferStreamResponse startTransferStreamWithOptions(StartTransferStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartTransferStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StartTransferStreamResponse());
    }

    public StartTransferStreamResponse startTransferStream(StartTransferStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startTransferStreamWithOptions(request, runtime);
    }

    public StopAdjustResponse stopAdjustWithOptions(StopAdjustRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopAdjust", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StopAdjustResponse());
    }

    public StopAdjustResponse stopAdjust(StopAdjustRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopAdjustWithOptions(request, runtime);
    }

    public StopDeviceResponse stopDeviceWithOptions(StopDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StopDeviceResponse());
    }

    public StopDeviceResponse stopDevice(StopDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDeviceWithOptions(request, runtime);
    }

    public StopMoveResponse stopMoveWithOptions(StopMoveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopMove", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StopMoveResponse());
    }

    public StopMoveResponse stopMove(StopMoveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopMoveWithOptions(request, runtime);
    }

    public StopRecordStreamResponse stopRecordStreamWithOptions(StopRecordStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopRecordStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StopRecordStreamResponse());
    }

    public StopRecordStreamResponse stopRecordStream(StopRecordStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopRecordStreamWithOptions(request, runtime);
    }

    public StopStreamResponse stopStreamWithOptions(StopStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StopStreamResponse());
    }

    public StopStreamResponse stopStream(StopStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopStreamWithOptions(request, runtime);
    }

    public StopTransferStreamResponse stopTransferStreamWithOptions(StopTransferStreamRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopTransferStream", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new StopTransferStreamResponse());
    }

    public StopTransferStreamResponse stopTransferStream(StopTransferStreamRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopTransferStreamWithOptions(request, runtime);
    }

    public SyncCatalogsResponse syncCatalogsWithOptions(SyncCatalogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncCatalogs", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new SyncCatalogsResponse());
    }

    public SyncCatalogsResponse syncCatalogs(SyncCatalogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncCatalogsWithOptions(request, runtime);
    }

    public UnbindDirectoryResponse unbindDirectoryWithOptions(UnbindDirectoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindDirectory", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindDirectoryResponse());
    }

    public UnbindDirectoryResponse unbindDirectory(UnbindDirectoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindDirectoryWithOptions(request, runtime);
    }

    public UnbindParentPlatformDeviceResponse unbindParentPlatformDeviceWithOptions(UnbindParentPlatformDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindParentPlatformDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindParentPlatformDeviceResponse());
    }

    public UnbindParentPlatformDeviceResponse unbindParentPlatformDevice(UnbindParentPlatformDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindParentPlatformDeviceWithOptions(request, runtime);
    }

    public UnbindPurchasedDeviceResponse unbindPurchasedDeviceWithOptions(UnbindPurchasedDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindPurchasedDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindPurchasedDeviceResponse());
    }

    public UnbindPurchasedDeviceResponse unbindPurchasedDevice(UnbindPurchasedDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindPurchasedDeviceWithOptions(request, runtime);
    }

    public UnbindTemplateResponse unbindTemplateWithOptions(UnbindTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindTemplateResponse());
    }

    public UnbindTemplateResponse unbindTemplate(UnbindTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindTemplateWithOptions(request, runtime);
    }

    public UnlockDeviceResponse unlockDeviceWithOptions(UnlockDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnlockDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new UnlockDeviceResponse());
    }

    public UnlockDeviceResponse unlockDevice(UnlockDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unlockDeviceWithOptions(request, runtime);
    }

    public UpdateVsPullStreamInfoConfigResponse updateVsPullStreamInfoConfigWithOptions(UpdateVsPullStreamInfoConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateVsPullStreamInfoConfig", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateVsPullStreamInfoConfigResponse());
    }

    public UpdateVsPullStreamInfoConfigResponse updateVsPullStreamInfoConfig(UpdateVsPullStreamInfoConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVsPullStreamInfoConfigWithOptions(request, runtime);
    }
}
