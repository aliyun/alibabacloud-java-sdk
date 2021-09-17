// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214;

import com.aliyun.tea.*;
import com.aliyun.rtc_white_board20201214.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("rtc-white-board", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public DescribeAppsResponse describeAppsWithOptions(DescribeAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeApps", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAppsResponse());
    }

    public DescribeAppsResponse describeApps(DescribeAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppsWithOptions(request, runtime);
    }

    public PauseWhiteBoardRecordingResponse pauseWhiteBoardRecordingWithOptions(PauseWhiteBoardRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PauseWhiteBoardRecording", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new PauseWhiteBoardRecordingResponse());
    }

    public PauseWhiteBoardRecordingResponse pauseWhiteBoardRecording(PauseWhiteBoardRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pauseWhiteBoardRecordingWithOptions(request, runtime);
    }

    public SetAppCallbackUrlResponse setAppCallbackUrlWithOptions(SetAppCallbackUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAppCallbackUrl", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetAppCallbackUrlResponse());
    }

    public SetAppCallbackUrlResponse setAppCallbackUrl(SetAppCallbackUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAppCallbackUrlWithOptions(request, runtime);
    }

    public StartWhiteBoardRecordingResponse startWhiteBoardRecordingWithOptions(StartWhiteBoardRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartWhiteBoardRecording", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new StartWhiteBoardRecordingResponse());
    }

    public StartWhiteBoardRecordingResponse startWhiteBoardRecording(StartWhiteBoardRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startWhiteBoardRecordingWithOptions(request, runtime);
    }

    public SetAppNameResponse setAppNameWithOptions(SetAppNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAppName", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetAppNameResponse());
    }

    public SetAppNameResponse setAppName(SetAppNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAppNameWithOptions(request, runtime);
    }

    public DescribeWhiteBoardsResponse describeWhiteBoardsWithOptions(DescribeWhiteBoardsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWhiteBoards", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWhiteBoardsResponse());
    }

    public DescribeWhiteBoardsResponse describeWhiteBoards(DescribeWhiteBoardsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWhiteBoardsWithOptions(request, runtime);
    }

    public ResumeWhiteBoardRecordingResponse resumeWhiteBoardRecordingWithOptions(ResumeWhiteBoardRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeWhiteBoardRecording", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeWhiteBoardRecordingResponse());
    }

    public ResumeWhiteBoardRecordingResponse resumeWhiteBoardRecording(ResumeWhiteBoardRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeWhiteBoardRecordingWithOptions(request, runtime);
    }

    public SetAppDomainNamesResponse setAppDomainNamesWithOptions(SetAppDomainNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAppDomainNames", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetAppDomainNamesResponse());
    }

    public SetAppDomainNamesResponse setAppDomainNames(SetAppDomainNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAppDomainNamesWithOptions(request, runtime);
    }

    public OpenWhiteBoardResponse openWhiteBoardWithOptions(OpenWhiteBoardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenWhiteBoard", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new OpenWhiteBoardResponse());
    }

    public OpenWhiteBoardResponse openWhiteBoard(OpenWhiteBoardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openWhiteBoardWithOptions(request, runtime);
    }

    public RefreshUsersPermissionsResponse refreshUsersPermissionsWithOptions(RefreshUsersPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshUsersPermissions", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshUsersPermissionsResponse());
    }

    public RefreshUsersPermissionsResponse refreshUsersPermissions(RefreshUsersPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshUsersPermissionsWithOptions(request, runtime);
    }

    public SetAppCallbackTypeResponse setAppCallbackTypeWithOptions(SetAppCallbackTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAppCallbackType", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetAppCallbackTypeResponse());
    }

    public SetAppCallbackTypeResponse setAppCallbackType(SetAppCallbackTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAppCallbackTypeWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateApp", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public SetUsersPermissionsResponse setUsersPermissionsWithOptions(SetUsersPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetUsersPermissions", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetUsersPermissionsResponse());
    }

    public SetUsersPermissionsResponse setUsersPermissions(SetUsersPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setUsersPermissionsWithOptions(request, runtime);
    }

    public CreateWhiteBoardResponse createWhiteBoardWithOptions(CreateWhiteBoardRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWhiteBoard", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWhiteBoardResponse());
    }

    public CreateWhiteBoardResponse createWhiteBoard(CreateWhiteBoardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWhiteBoardWithOptions(request, runtime);
    }

    public SetAppStatusResponse setAppStatusWithOptions(SetAppStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAppStatus", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetAppStatusResponse());
    }

    public SetAppStatusResponse setAppStatus(SetAppStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAppStatusWithOptions(request, runtime);
    }

    public DescribeWhiteBoardRecordingsResponse describeWhiteBoardRecordingsWithOptions(DescribeWhiteBoardRecordingsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWhiteBoardRecordings", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWhiteBoardRecordingsResponse());
    }

    public DescribeWhiteBoardRecordingsResponse describeWhiteBoardRecordings(DescribeWhiteBoardRecordingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWhiteBoardRecordingsWithOptions(request, runtime);
    }

    public StopWhiteBoardRecordingResponse stopWhiteBoardRecordingWithOptions(StopWhiteBoardRecordingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopWhiteBoardRecording", "2020-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new StopWhiteBoardRecordingResponse());
    }

    public StopWhiteBoardRecordingResponse stopWhiteBoardRecording(StopWhiteBoardRecordingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopWhiteBoardRecordingWithOptions(request, runtime);
    }
}
