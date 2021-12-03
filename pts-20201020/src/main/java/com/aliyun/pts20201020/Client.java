// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020;

import com.aliyun.tea.*;
import com.aliyun.pts20201020.models.*;
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
        this._endpoint = this.getEndpoint("pts", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreatePtsSceneResponse createPtsSceneWithOptions(CreatePtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePtsScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePtsSceneResponse());
    }

    public CreatePtsSceneResponse createPtsScene(CreatePtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPtsSceneWithOptions(request, runtime);
    }

    public CreatePtsSceneBaseLineFromReportResponse createPtsSceneBaseLineFromReportWithOptions(CreatePtsSceneBaseLineFromReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePtsSceneBaseLineFromReport", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePtsSceneBaseLineFromReportResponse());
    }

    public CreatePtsSceneBaseLineFromReportResponse createPtsSceneBaseLineFromReport(CreatePtsSceneBaseLineFromReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPtsSceneBaseLineFromReportWithOptions(request, runtime);
    }

    public DeletePtsSceneResponse deletePtsSceneWithOptions(DeletePtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePtsScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePtsSceneResponse());
    }

    public DeletePtsSceneResponse deletePtsScene(DeletePtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePtsSceneWithOptions(request, runtime);
    }

    public DeletePtsSceneBaseLineResponse deletePtsSceneBaseLineWithOptions(DeletePtsSceneBaseLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePtsSceneBaseLine", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePtsSceneBaseLineResponse());
    }

    public DeletePtsSceneBaseLineResponse deletePtsSceneBaseLine(DeletePtsSceneBaseLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePtsSceneBaseLineWithOptions(request, runtime);
    }

    public DeletePtsScenesResponse deletePtsScenesWithOptions(DeletePtsScenesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeletePtsScenesShrinkRequest request = new DeletePtsScenesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sceneIds)) {
            request.sceneIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sceneIds, "SceneIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePtsScenes", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePtsScenesResponse());
    }

    public DeletePtsScenesResponse deletePtsScenes(DeletePtsScenesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePtsScenesWithOptions(request, runtime);
    }

    public GetJMeterLogsResponse getJMeterLogsWithOptions(GetJMeterLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJMeterLogs", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetJMeterLogsResponse());
    }

    public GetJMeterLogsResponse getJMeterLogs(GetJMeterLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJMeterLogsWithOptions(request, runtime);
    }

    public GetJMeterSampleMetricsResponse getJMeterSampleMetricsWithOptions(GetJMeterSampleMetricsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJMeterSampleMetrics", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetJMeterSampleMetricsResponse());
    }

    public GetJMeterSampleMetricsResponse getJMeterSampleMetrics(GetJMeterSampleMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJMeterSampleMetricsWithOptions(request, runtime);
    }

    public GetJMeterSamplingLogsResponse getJMeterSamplingLogsWithOptions(GetJMeterSamplingLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJMeterSamplingLogs", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetJMeterSamplingLogsResponse());
    }

    public GetJMeterSamplingLogsResponse getJMeterSamplingLogs(GetJMeterSamplingLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJMeterSamplingLogsWithOptions(request, runtime);
    }

    public GetJMeterSceneRunningDataResponse getJMeterSceneRunningDataWithOptions(GetJMeterSceneRunningDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetJMeterSceneRunningData", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetJMeterSceneRunningDataResponse());
    }

    public GetJMeterSceneRunningDataResponse getJMeterSceneRunningData(GetJMeterSceneRunningDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJMeterSceneRunningDataWithOptions(request, runtime);
    }

    public GetOpenJMeterSceneResponse getOpenJMeterSceneWithOptions(GetOpenJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOpenJMeterScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetOpenJMeterSceneResponse());
    }

    public GetOpenJMeterSceneResponse getOpenJMeterScene(GetOpenJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOpenJMeterSceneWithOptions(request, runtime);
    }

    public GetPtsReportDetailsResponse getPtsReportDetailsWithOptions(GetPtsReportDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPtsReportDetails", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetPtsReportDetailsResponse());
    }

    public GetPtsReportDetailsResponse getPtsReportDetails(GetPtsReportDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsReportDetailsWithOptions(request, runtime);
    }

    public GetPtsReportsBySceneIdResponse getPtsReportsBySceneIdWithOptions(GetPtsReportsBySceneIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPtsReportsBySceneId", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetPtsReportsBySceneIdResponse());
    }

    public GetPtsReportsBySceneIdResponse getPtsReportsBySceneId(GetPtsReportsBySceneIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsReportsBySceneIdWithOptions(request, runtime);
    }

    public GetPtsSceneResponse getPtsSceneWithOptions(GetPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPtsScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetPtsSceneResponse());
    }

    public GetPtsSceneResponse getPtsScene(GetPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsSceneWithOptions(request, runtime);
    }

    public GetPtsSceneBaseLineResponse getPtsSceneBaseLineWithOptions(GetPtsSceneBaseLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPtsSceneBaseLine", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetPtsSceneBaseLineResponse());
    }

    public GetPtsSceneBaseLineResponse getPtsSceneBaseLine(GetPtsSceneBaseLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsSceneBaseLineWithOptions(request, runtime);
    }

    public GetPtsSceneRunningDataResponse getPtsSceneRunningDataWithOptions(GetPtsSceneRunningDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPtsSceneRunningData", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetPtsSceneRunningDataResponse());
    }

    public GetPtsSceneRunningDataResponse getPtsSceneRunningData(GetPtsSceneRunningDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsSceneRunningDataWithOptions(request, runtime);
    }

    public GetPtsSceneRunningStatusResponse getPtsSceneRunningStatusWithOptions(GetPtsSceneRunningStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPtsSceneRunningStatus", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetPtsSceneRunningStatusResponse());
    }

    public GetPtsSceneRunningStatusResponse getPtsSceneRunningStatus(GetPtsSceneRunningStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsSceneRunningStatusWithOptions(request, runtime);
    }

    public ListEnvsResponse listEnvsWithOptions(ListEnvsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEnvs", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListEnvsResponse());
    }

    public ListEnvsResponse listEnvs(ListEnvsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEnvsWithOptions(request, runtime);
    }

    public ListJMeterReportsResponse listJMeterReportsWithOptions(ListJMeterReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListJMeterReports", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListJMeterReportsResponse());
    }

    public ListJMeterReportsResponse listJMeterReports(ListJMeterReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJMeterReportsWithOptions(request, runtime);
    }

    public ListOpenJMeterScenesResponse listOpenJMeterScenesWithOptions(ListOpenJMeterScenesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOpenJMeterScenes", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListOpenJMeterScenesResponse());
    }

    public ListOpenJMeterScenesResponse listOpenJMeterScenes(ListOpenJMeterScenesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOpenJMeterScenesWithOptions(request, runtime);
    }

    public ListPtsSceneResponse listPtsSceneWithOptions(ListPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPtsScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListPtsSceneResponse());
    }

    public ListPtsSceneResponse listPtsScene(ListPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPtsSceneWithOptions(request, runtime);
    }

    public ModifyPtsSceneResponse modifyPtsSceneWithOptions(ModifyPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPtsScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPtsSceneResponse());
    }

    public ModifyPtsSceneResponse modifyPtsScene(ModifyPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPtsSceneWithOptions(request, runtime);
    }

    public RemoveEnvResponse removeEnvWithOptions(RemoveEnvRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveEnv", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveEnvResponse());
    }

    public RemoveEnvResponse removeEnv(RemoveEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeEnvWithOptions(request, runtime);
    }

    public RemoveOpenJMeterSceneResponse removeOpenJMeterSceneWithOptions(RemoveOpenJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveOpenJMeterScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveOpenJMeterSceneResponse());
    }

    public RemoveOpenJMeterSceneResponse removeOpenJMeterScene(RemoveOpenJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeOpenJMeterSceneWithOptions(request, runtime);
    }

    public SaveEnvResponse saveEnvWithOptions(SaveEnvRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveEnvShrinkRequest request = new SaveEnvShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.env))) {
            request.envShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.env), "Env", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveEnv", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new SaveEnvResponse());
    }

    public SaveEnvResponse saveEnv(SaveEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveEnvWithOptions(request, runtime);
    }

    public SaveOpenJMeterSceneResponse saveOpenJMeterSceneWithOptions(SaveOpenJMeterSceneRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveOpenJMeterSceneShrinkRequest request = new SaveOpenJMeterSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.openJMeterScene))) {
            request.openJMeterSceneShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.openJMeterScene), "OpenJMeterScene", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveOpenJMeterScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new SaveOpenJMeterSceneResponse());
    }

    public SaveOpenJMeterSceneResponse saveOpenJMeterScene(SaveOpenJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveOpenJMeterSceneWithOptions(request, runtime);
    }

    public StartDebugPtsSceneResponse startDebugPtsSceneWithOptions(StartDebugPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartDebugPtsScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new StartDebugPtsSceneResponse());
    }

    public StartDebugPtsSceneResponse startDebugPtsScene(StartDebugPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDebugPtsSceneWithOptions(request, runtime);
    }

    public StartDebuggingJMeterSceneResponse startDebuggingJMeterSceneWithOptions(StartDebuggingJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartDebuggingJMeterScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new StartDebuggingJMeterSceneResponse());
    }

    public StartDebuggingJMeterSceneResponse startDebuggingJMeterScene(StartDebuggingJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDebuggingJMeterSceneWithOptions(request, runtime);
    }

    public StartPtsSceneResponse startPtsSceneWithOptions(StartPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartPtsScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new StartPtsSceneResponse());
    }

    public StartPtsSceneResponse startPtsScene(StartPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startPtsSceneWithOptions(request, runtime);
    }

    public StartTestingJMeterSceneResponse startTestingJMeterSceneWithOptions(StartTestingJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartTestingJMeterScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new StartTestingJMeterSceneResponse());
    }

    public StartTestingJMeterSceneResponse startTestingJMeterScene(StartTestingJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startTestingJMeterSceneWithOptions(request, runtime);
    }

    public StopDebugPtsSceneResponse stopDebugPtsSceneWithOptions(StopDebugPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopDebugPtsScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new StopDebugPtsSceneResponse());
    }

    public StopDebugPtsSceneResponse stopDebugPtsScene(StopDebugPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDebugPtsSceneWithOptions(request, runtime);
    }

    public StopDebuggingJMeterSceneResponse stopDebuggingJMeterSceneWithOptions(StopDebuggingJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopDebuggingJMeterScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new StopDebuggingJMeterSceneResponse());
    }

    public StopDebuggingJMeterSceneResponse stopDebuggingJMeterScene(StopDebuggingJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDebuggingJMeterSceneWithOptions(request, runtime);
    }

    public StopPtsSceneResponse stopPtsSceneWithOptions(StopPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopPtsScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new StopPtsSceneResponse());
    }

    public StopPtsSceneResponse stopPtsScene(StopPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopPtsSceneWithOptions(request, runtime);
    }

    public StopTestingJMeterSceneResponse stopTestingJMeterSceneWithOptions(StopTestingJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopTestingJMeterScene", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new StopTestingJMeterSceneResponse());
    }

    public StopTestingJMeterSceneResponse stopTestingJMeterScene(StopTestingJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopTestingJMeterSceneWithOptions(request, runtime);
    }

    public UpdatePtsSceneBaseLineResponse updatePtsSceneBaseLineWithOptions(UpdatePtsSceneBaseLineRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePtsSceneBaseLineShrinkRequest request = new UpdatePtsSceneBaseLineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apiBaselines)) {
            request.apiBaselinesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apiBaselines, "ApiBaselines", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sceneBaseline)) {
            request.sceneBaselineShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sceneBaseline, "SceneBaseline", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePtsSceneBaseLine", "2020-10-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePtsSceneBaseLineResponse());
    }

    public UpdatePtsSceneBaseLineResponse updatePtsSceneBaseLine(UpdatePtsSceneBaseLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePtsSceneBaseLineWithOptions(request, runtime);
    }
}
