// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023;

import com.aliyun.tea.*;
import com.aliyun.sls20191023.models.*;
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
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "sls.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "sls.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hongkong", "sls.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "sls.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-shanghai", "sls.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "sls.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "sls.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("eu-central-1", "sls.eu-central-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sls", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AnalyzeAppLogResponse analyzeAppLogWithOptions(AnalyzeAppLogRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AnalyzeAppLogShrinkRequest request = new AnalyzeAppLogShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.variableMap)) {
            request.variableMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.variableMap, "VariableMap", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AnalyzeAppLog", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new AnalyzeAppLogResponse());
    }

    public AnalyzeAppLogResponse analyzeAppLog(AnalyzeAppLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.analyzeAppLogWithOptions(request, runtime);
    }

    public AnalyzeProductLogResponse analyzeProductLogWithOptions(AnalyzeProductLogRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AnalyzeProductLogShrinkRequest request = new AnalyzeProductLogShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.variableMap)) {
            request.variableMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.variableMap, "VariableMap", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AnalyzeProductLog", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new AnalyzeProductLogResponse());
    }

    public AnalyzeProductLogResponse analyzeProductLog(AnalyzeProductLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.analyzeProductLogWithOptions(request, runtime);
    }

    public CheckResourceOrchestrationResponse checkResourceOrchestrationWithOptions(CheckResourceOrchestrationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckResourceOrchestration", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new CheckResourceOrchestrationResponse());
    }

    public CheckResourceOrchestrationResponse checkResourceOrchestration(CheckResourceOrchestrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkResourceOrchestrationWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateApp", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public CreateImportIngestionJobResponse createImportIngestionJobWithOptions(CreateImportIngestionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateImportIngestionJob", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateImportIngestionJobResponse());
    }

    public CreateImportIngestionJobResponse createImportIngestionJob(CreateImportIngestionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createImportIngestionJobWithOptions(request, runtime);
    }

    public CreateIngestionJobResponse createIngestionJobWithOptions(CreateIngestionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIngestionJob", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIngestionJobResponse());
    }

    public CreateIngestionJobResponse createIngestionJob(CreateIngestionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIngestionJobWithOptions(request, runtime);
    }

    public CreateResourceOrchestrationResponse createResourceOrchestrationWithOptions(CreateResourceOrchestrationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateResourceOrchestration", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new CreateResourceOrchestrationResponse());
    }

    public CreateResourceOrchestrationResponse createResourceOrchestration(CreateResourceOrchestrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourceOrchestrationWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteApp", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public DeleteImportIngestionJobResponse deleteImportIngestionJobWithOptions(DeleteImportIngestionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteImportIngestionJob", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteImportIngestionJobResponse());
    }

    public DeleteImportIngestionJobResponse deleteImportIngestionJob(DeleteImportIngestionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteImportIngestionJobWithOptions(request, runtime);
    }

    public DeleteIngestionJobResponse deleteIngestionJobWithOptions(DeleteIngestionJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIngestionJob", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIngestionJobResponse());
    }

    public DeleteIngestionJobResponse deleteIngestionJob(DeleteIngestionJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIngestionJobWithOptions(request, runtime);
    }

    public DescribeAppResponse describeAppWithOptions(DescribeAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeApp", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAppResponse());
    }

    public DescribeAppResponse describeApp(DescribeAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppWithOptions(request, runtime);
    }

    public DisableAlertResponse disableAlertWithOptions(DisableAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableAlert", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new DisableAlertResponse());
    }

    public DisableAlertResponse disableAlert(DisableAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableAlertWithOptions(request, runtime);
    }

    public EnableAlertResponse enableAlertWithOptions(EnableAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableAlert", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new EnableAlertResponse());
    }

    public EnableAlertResponse enableAlert(EnableAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableAlertWithOptions(request, runtime);
    }

    public GetAlertResponse getAlertWithOptions(GetAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAlert", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetAlertResponse());
    }

    public GetAlertResponse getAlert(GetAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlertWithOptions(request, runtime);
    }

    public GetAlertHistoriesResponse getAlertHistoriesWithOptions(GetAlertHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAlertHistories", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetAlertHistoriesResponse());
    }

    public GetAlertHistoriesResponse getAlertHistories(GetAlertHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlertHistoriesWithOptions(request, runtime);
    }

    public GetSlsServiceResponse getSlsServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetSlsService", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new GetSlsServiceResponse());
    }

    public GetSlsServiceResponse getSlsService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSlsServiceWithOptions(runtime);
    }

    public InitProjectAlertResourceResponse initProjectAlertResourceWithOptions(InitProjectAlertResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InitProjectAlertResource", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new InitProjectAlertResourceResponse());
    }

    public InitProjectAlertResourceResponse initProjectAlertResource(InitProjectAlertResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initProjectAlertResourceWithOptions(request, runtime);
    }

    public InitUserAlertResourceResponse initUserAlertResourceWithOptions(InitUserAlertResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InitUserAlertResource", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new InitUserAlertResourceResponse());
    }

    public InitUserAlertResourceResponse initUserAlertResource(InitUserAlertResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initUserAlertResourceWithOptions(request, runtime);
    }

    public OpenSlsServiceResponse openSlsServiceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("OpenSlsService", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new OpenSlsServiceResponse());
    }

    public OpenSlsServiceResponse openSlsService() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openSlsServiceWithOptions(runtime);
    }

    public QuerySafServiceResponse querySafServiceWithOptions(QuerySafServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySafService", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySafServiceResponse());
    }

    public QuerySafServiceResponse querySafService(QuerySafServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySafServiceWithOptions(request, runtime);
    }

    public SetAlertActionPolicyResponse setAlertActionPolicyWithOptions(SetAlertActionPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAlertActionPolicy", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new SetAlertActionPolicyResponse());
    }

    public SetAlertActionPolicyResponse setAlertActionPolicy(SetAlertActionPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAlertActionPolicyWithOptions(request, runtime);
    }

    public SetAlertCenterResourceResponse setAlertCenterResourceWithOptions(SetAlertCenterResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAlertCenterResource", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new SetAlertCenterResourceResponse());
    }

    public SetAlertCenterResourceResponse setAlertCenterResource(SetAlertCenterResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAlertCenterResourceWithOptions(request, runtime);
    }

    public SetAlertCenterResourceByConsoleResponse setAlertCenterResourceByConsoleWithOptions(SetAlertCenterResourceByConsoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAlertCenterResourceByConsole", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new SetAlertCenterResourceByConsoleResponse());
    }

    public SetAlertCenterResourceByConsoleResponse setAlertCenterResourceByConsole(SetAlertCenterResourceByConsoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAlertCenterResourceByConsoleWithOptions(request, runtime);
    }

    public SyncAlertGroupsResponse syncAlertGroupsWithOptions(SyncAlertGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncAlertGroups", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new SyncAlertGroupsResponse());
    }

    public SyncAlertGroupsResponse syncAlertGroups(SyncAlertGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncAlertGroupsWithOptions(request, runtime);
    }

    public SyncAlertUsersResponse syncAlertUsersWithOptions(SyncAlertUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncAlertUsers", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new SyncAlertUsersResponse());
    }

    public SyncAlertUsersResponse syncAlertUsers(SyncAlertUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncAlertUsersWithOptions(request, runtime);
    }

    public UpdateAppResponse updateAppWithOptions(UpdateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateApp", "2019-10-23", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppResponse());
    }

    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppWithOptions(request, runtime);
    }
}
