// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20190810;

import com.aliyun.tea.*;
import com.aliyun.pts20190810.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("pts", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DescribeConfigResponse describeConfigWithOptions(DescribeConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeConfig", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeConfigResponse());
    }

    public DescribeConfigResponse describeConfig(DescribeConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConfigWithOptions(request, runtime);
    }

    public SubmitTestingResponse submitTestingWithOptions(SubmitTestingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitTesting", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new SubmitTestingResponse());
    }

    public SubmitTestingResponse submitTesting(SubmitTestingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTestingWithOptions(request, runtime);
    }

    public SubmitProgressResponse submitProgressWithOptions(SubmitProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitProgress", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new SubmitProgressResponse());
    }

    public SubmitProgressResponse submitProgress(SubmitProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitProgressWithOptions(request, runtime);
    }

    public ListSlaWarningsResponse listSlaWarningsWithOptions(ListSlaWarningsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSlaWarnings", "HTTPS", "POST", "2019-08-10", "AK,APP,BearerToken,PrivateKey", null, TeaModel.buildMap(request), runtime), new ListSlaWarningsResponse());
    }

    public ListSlaWarningsResponse listSlaWarnings(ListSlaWarningsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSlaWarningsWithOptions(request, runtime);
    }

    public ListSlaSnapshotSummaryResponse listSlaSnapshotSummaryWithOptions(ListSlaSnapshotSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSlaSnapshotSummary", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new ListSlaSnapshotSummaryResponse());
    }

    public ListSlaSnapshotSummaryResponse listSlaSnapshotSummary(ListSlaSnapshotSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSlaSnapshotSummaryWithOptions(request, runtime);
    }

    public ExecuteSceneFunctionResponse executeSceneFunctionWithOptions(ExecuteSceneFunctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExecuteSceneFunction", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new ExecuteSceneFunctionResponse());
    }

    public ExecuteSceneFunctionResponse executeSceneFunction(ExecuteSceneFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeSceneFunctionWithOptions(request, runtime);
    }

    public DescribeIntranetResourceResponse describeIntranetResourceWithOptions(DescribeIntranetResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeIntranetResource", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeIntranetResourceResponse());
    }

    public DescribeIntranetResourceResponse describeIntranetResource(DescribeIntranetResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIntranetResourceWithOptions(request, runtime);
    }

    public UploadFileFromOSSResponse uploadFileFromOSSWithOptions(UploadFileFromOSSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UploadFileFromOSS", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new UploadFileFromOSSResponse());
    }

    public UploadFileFromOSSResponse uploadFileFromOSS(UploadFileFromOSSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadFileFromOSSWithOptions(request, runtime);
    }

    public ListSlaSnapshotRealResponse listSlaSnapshotRealWithOptions(ListSlaSnapshotRealRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListSlaSnapshotReal", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new ListSlaSnapshotRealResponse());
    }

    public ListSlaSnapshotRealResponse listSlaSnapshotReal(ListSlaSnapshotRealRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSlaSnapshotRealWithOptions(request, runtime);
    }

    public StopSceneTestingResponse stopSceneTestingWithOptions(StopSceneTestingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopSceneTesting", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new StopSceneTestingResponse());
    }

    public StopSceneTestingResponse stopSceneTesting(StopSceneTestingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopSceneTestingWithOptions(request, runtime);
    }

    public DescribeSlaTemplateResponse describeSlaTemplateWithOptions(DescribeSlaTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSlaTemplate", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeSlaTemplateResponse());
    }

    public DescribeSlaTemplateResponse describeSlaTemplate(DescribeSlaTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlaTemplateWithOptions(request, runtime);
    }

    public StartSceneTestingResponse startSceneTestingWithOptions(StartSceneTestingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartSceneTesting", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new StartSceneTestingResponse());
    }

    public StartSceneTestingResponse startSceneTesting(StartSceneTestingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSceneTestingWithOptions(request, runtime);
    }

    public SaveSceneResponse saveSceneWithOptions(SaveSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SaveScene", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new SaveSceneResponse());
    }

    public SaveSceneResponse saveScene(SaveSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSceneWithOptions(request, runtime);
    }

    public CreateSceneResponse createSceneWithOptions(CreateSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateScene", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new CreateSceneResponse());
    }

    public CreateSceneResponse createScene(CreateSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSceneWithOptions(request, runtime);
    }

    public ChangePressureResponse changePressureWithOptions(ChangePressureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ChangePressure", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new ChangePressureResponse());
    }

    public ChangePressureResponse changePressure(ChangePressureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changePressureWithOptions(request, runtime);
    }

    public ListEnginesResponse listEnginesWithOptions(ListEnginesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListEngines", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new ListEnginesResponse());
    }

    public ListEnginesResponse listEngines(ListEnginesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnginesWithOptions(request, runtime);
    }

    public DescribeRealTimeLogResponse describeRealTimeLogWithOptions(DescribeRealTimeLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRealTimeLog", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRealTimeLogResponse());
    }

    public DescribeRealTimeLogResponse describeRealTimeLog(DescribeRealTimeLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRealTimeLogWithOptions(request, runtime);
    }

    public DescribeStructureMonitorAuthResponse describeStructureMonitorAuthWithOptions(DescribeStructureMonitorAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeStructureMonitorAuth", "HTTPS", "GET", "2019-08-10", "AK,APP,PrivateKey,BearerToken", TeaModel.buildMap(request), null, runtime), new DescribeStructureMonitorAuthResponse());
    }

    public DescribeStructureMonitorAuthResponse describeStructureMonitorAuth(DescribeStructureMonitorAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStructureMonitorAuthWithOptions(request, runtime);
    }

    public DescribeJMeterSampleSummaryResponse describeJMeterSampleSummaryWithOptions(DescribeJMeterSampleSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeJMeterSampleSummary", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeJMeterSampleSummaryResponse());
    }

    public DescribeJMeterSampleSummaryResponse describeJMeterSampleSummary(DescribeJMeterSampleSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJMeterSampleSummaryWithOptions(request, runtime);
    }

    public CloneJMeterSceneResponse cloneJMeterSceneWithOptions(CloneJMeterSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CloneJMeterScene", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new CloneJMeterSceneResponse());
    }

    public CloneJMeterSceneResponse cloneJMeterScene(CloneJMeterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cloneJMeterSceneWithOptions(request, runtime);
    }

    public AdjustJMeterSpeedResponse adjustJMeterSpeedWithOptions(AdjustJMeterSpeedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AdjustJMeterSpeed", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new AdjustJMeterSpeedResponse());
    }

    public AdjustJMeterSpeedResponse adjustJMeterSpeed(AdjustJMeterSpeedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.adjustJMeterSpeedWithOptions(request, runtime);
    }

    public DescribeJMeterSamplingLogsResponse describeJMeterSamplingLogsWithOptions(DescribeJMeterSamplingLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeJMeterSamplingLogs", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeJMeterSamplingLogsResponse());
    }

    public DescribeJMeterSamplingLogsResponse describeJMeterSamplingLogs(DescribeJMeterSamplingLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJMeterSamplingLogsWithOptions(request, runtime);
    }

    public DescribeAgentNetTrafficResponse describeAgentNetTrafficWithOptions(DescribeAgentNetTrafficRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAgentNetTraffic", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeAgentNetTrafficResponse());
    }

    public DescribeAgentNetTrafficResponse describeAgentNetTraffic(DescribeAgentNetTrafficRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAgentNetTrafficWithOptions(request, runtime);
    }

    public DescribeAgentCpuInfoResponse describeAgentCpuInfoWithOptions(DescribeAgentCpuInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAgentCpuInfo", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey", null, TeaModel.buildMap(request), runtime), new DescribeAgentCpuInfoResponse());
    }

    public DescribeAgentCpuInfoResponse describeAgentCpuInfo(DescribeAgentCpuInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAgentCpuInfoWithOptions(request, runtime);
    }

    public DescribeAgentGCInfoResponse describeAgentGCInfoWithOptions(DescribeAgentGCInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAgentGCInfo", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeAgentGCInfoResponse());
    }

    public DescribeAgentGCInfoResponse describeAgentGCInfo(DescribeAgentGCInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAgentGCInfoWithOptions(request, runtime);
    }

    public DescribeAgentMemoryInfoResponse describeAgentMemoryInfoWithOptions(DescribeAgentMemoryInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAgentMemoryInfo", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAgentMemoryInfoResponse());
    }

    public DescribeAgentMemoryInfoResponse describeAgentMemoryInfo(DescribeAgentMemoryInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAgentMemoryInfoWithOptions(request, runtime);
    }

    public DescribeAgentLoadInfoResponse describeAgentLoadInfoWithOptions(DescribeAgentLoadInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeAgentLoadInfo", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new DescribeAgentLoadInfoResponse());
    }

    public DescribeAgentLoadInfoResponse describeAgentLoadInfo(DescribeAgentLoadInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAgentLoadInfoWithOptions(request, runtime);
    }

    public DescribeJMeterPlanResponse describeJMeterPlanWithOptions(DescribeJMeterPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeJMeterPlan", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeJMeterPlanResponse());
    }

    public DescribeJMeterPlanResponse describeJMeterPlan(DescribeJMeterPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJMeterPlanWithOptions(request, runtime);
    }

    public DescribeJMeterSceneResponse describeJMeterSceneWithOptions(DescribeJMeterSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeJMeterScene", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeJMeterSceneResponse());
    }

    public DescribeJMeterSceneResponse describeJMeterScene(DescribeJMeterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJMeterSceneWithOptions(request, runtime);
    }

    public DescribeJMeterSceneRunningStatusResponse describeJMeterSceneRunningStatusWithOptions(DescribeJMeterSceneRunningStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeJMeterSceneRunningStatus", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeJMeterSceneRunningStatusResponse());
    }

    public DescribeJMeterSceneRunningStatusResponse describeJMeterSceneRunningStatus(DescribeJMeterSceneRunningStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJMeterSceneRunningStatusWithOptions(request, runtime);
    }

    public DescribeJMeterTaskListResponse describeJMeterTaskListWithOptions(DescribeJMeterTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeJMeterTaskList", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeJMeterTaskListResponse());
    }

    public DescribeJMeterTaskListResponse describeJMeterTaskList(DescribeJMeterTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJMeterTaskListWithOptions(request, runtime);
    }

    public DescribeJMeterLogsResponse describeJMeterLogsWithOptions(DescribeJMeterLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeJMeterLogs", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeJMeterLogsResponse());
    }

    public DescribeJMeterLogsResponse describeJMeterLogs(DescribeJMeterLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJMeterLogsWithOptions(request, runtime);
    }

    public StopJMeterTestingResponse stopJMeterTestingWithOptions(StopJMeterTestingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopJMeterTesting", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new StopJMeterTestingResponse());
    }

    public StopJMeterTestingResponse stopJMeterTesting(StopJMeterTestingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopJMeterTestingWithOptions(request, runtime);
    }

    public DescribeSampleMetricResponse describeSampleMetricWithOptions(DescribeSampleMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSampleMetric", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeSampleMetricResponse());
    }

    public DescribeSampleMetricResponse describeSampleMetric(DescribeSampleMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleMetricWithOptions(request, runtime);
    }

    public DescribeJMeterChainDetailResponse describeJMeterChainDetailWithOptions(DescribeJMeterChainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeJMeterChainDetail", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeJMeterChainDetailResponse());
    }

    public DescribeJMeterChainDetailResponse describeJMeterChainDetail(DescribeJMeterChainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJMeterChainDetailWithOptions(request, runtime);
    }

    public StartJMeterTestingResponse startJMeterTestingWithOptions(StartJMeterTestingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartJMeterTesting", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new StartJMeterTestingResponse());
    }

    public StartJMeterTestingResponse startJMeterTesting(StartJMeterTestingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startJMeterTestingWithOptions(request, runtime);
    }

    public RemoveInstanceFromGroupResponse removeInstanceFromGroupWithOptions(RemoveInstanceFromGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveInstanceFromGroup", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new RemoveInstanceFromGroupResponse());
    }

    public RemoveInstanceFromGroupResponse removeInstanceFromGroup(RemoveInstanceFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeInstanceFromGroupWithOptions(request, runtime);
    }

    public ReplaceOssFileResponse replaceOssFileWithOptions(ReplaceOssFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReplaceOssFile", "HTTPS", "POST", "2019-08-10", "AK", null, TeaModel.buildMap(request), runtime), new ReplaceOssFileResponse());
    }

    public ReplaceOssFileResponse replaceOssFile(ReplaceOssFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.replaceOssFileWithOptions(request, runtime);
    }

    public StartTestingResponse startTestingWithOptions(StartTestingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartTesting", "HTTPS", "GET", "2019-08-10", "AK,APP,PrivateKey,BearerToken", TeaModel.buildMap(request), null, runtime), new StartTestingResponse());
    }

    public StartTestingResponse startTesting(StartTestingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTestingWithOptions(request, runtime);
    }

    public StopTestingResponse stopTestingWithOptions(StopTestingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopTesting", "HTTPS", "GET", "2019-08-10", "AK,APP,PrivateKey,BearerToken", TeaModel.buildMap(request), null, runtime), new StopTestingResponse());
    }

    public StopTestingResponse stopTesting(StopTestingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTestingWithOptions(request, runtime);
    }

    public ListReportsResponse listReportsWithOptions(ListReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListReports", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new ListReportsResponse());
    }

    public ListReportsResponse listReports(ListReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listReportsWithOptions(request, runtime);
    }

    public DescribeReportChainDetailResponse describeReportChainDetailWithOptions(DescribeReportChainDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeReportChainDetail", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeReportChainDetailResponse());
    }

    public DescribeReportChainDetailResponse describeReportChainDetail(DescribeReportChainDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReportChainDetailWithOptions(request, runtime);
    }

    public DescribeReportChainSummaryResponse describeReportChainSummaryWithOptions(DescribeReportChainSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeReportChainSummary", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeReportChainSummaryResponse());
    }

    public DescribeReportChainSummaryResponse describeReportChainSummary(DescribeReportChainSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReportChainSummaryWithOptions(request, runtime);
    }

    public RemoveScenesResponse removeScenesWithOptions(RemoveScenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveScenes", "HTTPS", "GET", "2019-08-10", "AK,APP,PrivateKey,BearerToken", TeaModel.buildMap(request), null, runtime), new RemoveScenesResponse());
    }

    public RemoveScenesResponse removeScenes(RemoveScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeScenesWithOptions(request, runtime);
    }

    public DescribeReportResponse describeReportWithOptions(DescribeReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeReport", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeReportResponse());
    }

    public DescribeReportResponse describeReport(DescribeReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReportWithOptions(request, runtime);
    }

    public ListScenesResponse listScenesWithOptions(ListScenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListScenes", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new ListScenesResponse());
    }

    public ListScenesResponse listScenes(ListScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScenesWithOptions(request, runtime);
    }

    public DescribeSceneResponse describeSceneWithOptions(DescribeSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeScene", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeSceneResponse());
    }

    public DescribeSceneResponse describeScene(DescribeSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSceneWithOptions(request, runtime);
    }

    public DescribeSceneRunningStatusResponse describeSceneRunningStatusWithOptions(DescribeSceneRunningStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSceneRunningStatus", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeSceneRunningStatusResponse());
    }

    public DescribeSceneRunningStatusResponse describeSceneRunningStatus(DescribeSceneRunningStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSceneRunningStatusWithOptions(request, runtime);
    }

    public AdjustSceneSpeedResponse adjustSceneSpeedWithOptions(AdjustSceneSpeedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AdjustSceneSpeed", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new AdjustSceneSpeedResponse());
    }

    public AdjustSceneSpeedResponse adjustSceneSpeed(AdjustSceneSpeedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.adjustSceneSpeedWithOptions(request, runtime);
    }

    public AdjustRelationSpeedResponse adjustRelationSpeedWithOptions(AdjustRelationSpeedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AdjustRelationSpeed", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new AdjustRelationSpeedResponse());
    }

    public AdjustRelationSpeedResponse adjustRelationSpeed(AdjustRelationSpeedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.adjustRelationSpeedWithOptions(request, runtime);
    }

    public DescribeSamplingLogResponse describeSamplingLogWithOptions(DescribeSamplingLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSamplingLog", "HTTPS", "POST", "2019-08-10", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new DescribeSamplingLogResponse());
    }

    public DescribeSamplingLogResponse describeSamplingLog(DescribeSamplingLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSamplingLogWithOptions(request, runtime);
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
}
