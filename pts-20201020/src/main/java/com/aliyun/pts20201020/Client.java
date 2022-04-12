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

    public AdjustJMeterSceneSpeedResponse adjustJMeterSceneSpeedWithOptions(AdjustJMeterSceneSpeedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AdjustJMeterSceneSpeed"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AdjustJMeterSceneSpeedResponse());
    }

    public AdjustJMeterSceneSpeedResponse adjustJMeterSceneSpeed(AdjustJMeterSceneSpeedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.adjustJMeterSceneSpeedWithOptions(request, runtime);
    }

    public CreatePtsSceneResponse createPtsSceneWithOptions(CreatePtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePtsScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePtsSceneResponse());
    }

    public CreatePtsSceneResponse createPtsScene(CreatePtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPtsSceneWithOptions(request, runtime);
    }

    public CreatePtsSceneBaseLineFromReportResponse createPtsSceneBaseLineFromReportWithOptions(CreatePtsSceneBaseLineFromReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePtsSceneBaseLineFromReport"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePtsSceneBaseLineFromReportResponse());
    }

    public CreatePtsSceneBaseLineFromReportResponse createPtsSceneBaseLineFromReport(CreatePtsSceneBaseLineFromReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPtsSceneBaseLineFromReportWithOptions(request, runtime);
    }

    public DeletePtsSceneResponse deletePtsSceneWithOptions(DeletePtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePtsScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePtsSceneResponse());
    }

    public DeletePtsSceneResponse deletePtsScene(DeletePtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePtsSceneWithOptions(request, runtime);
    }

    public DeletePtsSceneBaseLineResponse deletePtsSceneBaseLineWithOptions(DeletePtsSceneBaseLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePtsSceneBaseLine"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePtsSceneBaseLineResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneIdsShrink)) {
            query.put("SceneIds", request.sceneIdsShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePtsScenes"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePtsScenesResponse());
    }

    public DeletePtsScenesResponse deletePtsScenes(DeletePtsScenesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePtsScenesWithOptions(request, runtime);
    }

    public GetAllRegionsResponse getAllRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAllRegions"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAllRegionsResponse());
    }

    public GetAllRegionsResponse getAllRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllRegionsWithOptions(runtime);
    }

    public GetJMeterLogsResponse getJMeterLogsWithOptions(GetJMeterLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentIndex)) {
            query.put("AgentIndex", request.agentIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thread)) {
            query.put("Thread", request.thread);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJMeterLogs"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJMeterLogsResponse());
    }

    public GetJMeterLogsResponse getJMeterLogs(GetJMeterLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJMeterLogsWithOptions(request, runtime);
    }

    public GetJMeterSampleMetricsResponse getJMeterSampleMetricsWithOptions(GetJMeterSampleMetricsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplerId)) {
            query.put("SamplerId", request.samplerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJMeterSampleMetrics"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJMeterSampleMetricsResponse());
    }

    public GetJMeterSampleMetricsResponse getJMeterSampleMetrics(GetJMeterSampleMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJMeterSampleMetricsWithOptions(request, runtime);
    }

    public GetJMeterSamplingLogsResponse getJMeterSamplingLogsWithOptions(GetJMeterSamplingLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("AgentId", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRT)) {
            query.put("MaxRT", request.maxRT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRT)) {
            query.put("MinRT", request.minRT);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.responseCode)) {
            query.put("ResponseCode", request.responseCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplerId)) {
            query.put("SamplerId", request.samplerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.success)) {
            query.put("Success", request.success);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thread)) {
            query.put("Thread", request.thread);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJMeterSamplingLogs"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJMeterSamplingLogsResponse());
    }

    public GetJMeterSamplingLogsResponse getJMeterSamplingLogs(GetJMeterSamplingLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJMeterSamplingLogsWithOptions(request, runtime);
    }

    public GetJMeterSceneRunningDataResponse getJMeterSceneRunningDataWithOptions(GetJMeterSceneRunningDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJMeterSceneRunningData"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJMeterSceneRunningDataResponse());
    }

    public GetJMeterSceneRunningDataResponse getJMeterSceneRunningData(GetJMeterSceneRunningDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getJMeterSceneRunningDataWithOptions(request, runtime);
    }

    public GetOpenJMeterSceneResponse getOpenJMeterSceneWithOptions(GetOpenJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpenJMeterScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpenJMeterSceneResponse());
    }

    public GetOpenJMeterSceneResponse getOpenJMeterScene(GetOpenJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOpenJMeterSceneWithOptions(request, runtime);
    }

    public GetPtsReportDetailsResponse getPtsReportDetailsWithOptions(GetPtsReportDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPtsReportDetails"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPtsReportDetailsResponse());
    }

    public GetPtsReportDetailsResponse getPtsReportDetails(GetPtsReportDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsReportDetailsWithOptions(request, runtime);
    }

    public GetPtsReportsBySceneIdResponse getPtsReportsBySceneIdWithOptions(GetPtsReportsBySceneIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPtsReportsBySceneId"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPtsReportsBySceneIdResponse());
    }

    public GetPtsReportsBySceneIdResponse getPtsReportsBySceneId(GetPtsReportsBySceneIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsReportsBySceneIdWithOptions(request, runtime);
    }

    public GetPtsSceneResponse getPtsSceneWithOptions(GetPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPtsScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPtsSceneResponse());
    }

    public GetPtsSceneResponse getPtsScene(GetPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsSceneWithOptions(request, runtime);
    }

    public GetPtsSceneBaseLineResponse getPtsSceneBaseLineWithOptions(GetPtsSceneBaseLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPtsSceneBaseLine"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPtsSceneBaseLineResponse());
    }

    public GetPtsSceneBaseLineResponse getPtsSceneBaseLine(GetPtsSceneBaseLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsSceneBaseLineWithOptions(request, runtime);
    }

    public GetPtsSceneRunningDataResponse getPtsSceneRunningDataWithOptions(GetPtsSceneRunningDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPtsSceneRunningData"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPtsSceneRunningDataResponse());
    }

    public GetPtsSceneRunningDataResponse getPtsSceneRunningData(GetPtsSceneRunningDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsSceneRunningDataWithOptions(request, runtime);
    }

    public GetPtsSceneRunningStatusResponse getPtsSceneRunningStatusWithOptions(GetPtsSceneRunningStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPtsSceneRunningStatus"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPtsSceneRunningStatusResponse());
    }

    public GetPtsSceneRunningStatusResponse getPtsSceneRunningStatus(GetPtsSceneRunningStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPtsSceneRunningStatusWithOptions(request, runtime);
    }

    public GetUserVpcSecurityGroupResponse getUserVpcSecurityGroupWithOptions(GetUserVpcSecurityGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserVpcSecurityGroup"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserVpcSecurityGroupResponse());
    }

    public GetUserVpcSecurityGroupResponse getUserVpcSecurityGroup(GetUserVpcSecurityGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserVpcSecurityGroupWithOptions(request, runtime);
    }

    public GetUserVpcVSwitchResponse getUserVpcVSwitchWithOptions(GetUserVpcVSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserVpcVSwitch"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserVpcVSwitchResponse());
    }

    public GetUserVpcVSwitchResponse getUserVpcVSwitch(GetUserVpcVSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserVpcVSwitchWithOptions(request, runtime);
    }

    public GetUserVpcsResponse getUserVpcsWithOptions(GetUserVpcsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserVpcs"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserVpcsResponse());
    }

    public GetUserVpcsResponse getUserVpcs(GetUserVpcsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserVpcsWithOptions(request, runtime);
    }

    public ListEnvsResponse listEnvsWithOptions(ListEnvsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envName)) {
            query.put("EnvName", request.envName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEnvs"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEnvsResponse());
    }

    public ListEnvsResponse listEnvs(ListEnvsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEnvsWithOptions(request, runtime);
    }

    public ListJMeterReportsResponse listJMeterReportsWithOptions(ListJMeterReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJMeterReports"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJMeterReportsResponse());
    }

    public ListJMeterReportsResponse listJMeterReports(ListJMeterReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJMeterReportsWithOptions(request, runtime);
    }

    public ListOpenJMeterScenesResponse listOpenJMeterScenesWithOptions(ListOpenJMeterScenesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOpenJMeterScenes"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOpenJMeterScenesResponse());
    }

    public ListOpenJMeterScenesResponse listOpenJMeterScenes(ListOpenJMeterScenesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOpenJMeterScenesWithOptions(request, runtime);
    }

    public ListPtsSceneResponse listPtsSceneWithOptions(ListPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPtsScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPtsSceneResponse());
    }

    public ListPtsSceneResponse listPtsScene(ListPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPtsSceneWithOptions(request, runtime);
    }

    public ModifyPtsSceneResponse modifyPtsSceneWithOptions(ModifyPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPtsScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPtsSceneResponse());
    }

    public ModifyPtsSceneResponse modifyPtsScene(ModifyPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPtsSceneWithOptions(request, runtime);
    }

    public RemoveEnvResponse removeEnvWithOptions(RemoveEnvRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveEnv"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveEnvResponse());
    }

    public RemoveEnvResponse removeEnv(RemoveEnvRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeEnvWithOptions(request, runtime);
    }

    public RemoveOpenJMeterSceneResponse removeOpenJMeterSceneWithOptions(RemoveOpenJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveOpenJMeterScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveOpenJMeterSceneResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envShrink)) {
            query.put("Env", request.envShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveEnv"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveEnvResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openJMeterSceneShrink)) {
            query.put("OpenJMeterScene", request.openJMeterSceneShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveOpenJMeterScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveOpenJMeterSceneResponse());
    }

    public SaveOpenJMeterSceneResponse saveOpenJMeterScene(SaveOpenJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveOpenJMeterSceneWithOptions(request, runtime);
    }

    public SavePtsSceneResponse savePtsSceneWithOptions(SavePtsSceneRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SavePtsSceneShrinkRequest request = new SavePtsSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.scene))) {
            request.sceneShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.scene), "Scene", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneShrink)) {
            query.put("Scene", request.sceneShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SavePtsScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SavePtsSceneResponse());
    }

    public SavePtsSceneResponse savePtsScene(SavePtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.savePtsSceneWithOptions(request, runtime);
    }

    public StartDebugPtsSceneResponse startDebugPtsSceneWithOptions(StartDebugPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDebugPtsScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDebugPtsSceneResponse());
    }

    public StartDebugPtsSceneResponse startDebugPtsScene(StartDebugPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDebugPtsSceneWithOptions(request, runtime);
    }

    public StartDebuggingJMeterSceneResponse startDebuggingJMeterSceneWithOptions(StartDebuggingJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartDebuggingJMeterScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartDebuggingJMeterSceneResponse());
    }

    public StartDebuggingJMeterSceneResponse startDebuggingJMeterScene(StartDebuggingJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDebuggingJMeterSceneWithOptions(request, runtime);
    }

    public StartPtsSceneResponse startPtsSceneWithOptions(StartPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartPtsScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartPtsSceneResponse());
    }

    public StartPtsSceneResponse startPtsScene(StartPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startPtsSceneWithOptions(request, runtime);
    }

    public StartTestingJMeterSceneResponse startTestingJMeterSceneWithOptions(StartTestingJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTestingJMeterScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartTestingJMeterSceneResponse());
    }

    public StartTestingJMeterSceneResponse startTestingJMeterScene(StartTestingJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startTestingJMeterSceneWithOptions(request, runtime);
    }

    public StopDebugPtsSceneResponse stopDebugPtsSceneWithOptions(StopDebugPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDebugPtsScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDebugPtsSceneResponse());
    }

    public StopDebugPtsSceneResponse stopDebugPtsScene(StopDebugPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDebugPtsSceneWithOptions(request, runtime);
    }

    public StopDebuggingJMeterSceneResponse stopDebuggingJMeterSceneWithOptions(StopDebuggingJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopDebuggingJMeterScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopDebuggingJMeterSceneResponse());
    }

    public StopDebuggingJMeterSceneResponse stopDebuggingJMeterScene(StopDebuggingJMeterSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDebuggingJMeterSceneWithOptions(request, runtime);
    }

    public StopPtsSceneResponse stopPtsSceneWithOptions(StopPtsSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopPtsScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopPtsSceneResponse());
    }

    public StopPtsSceneResponse stopPtsScene(StopPtsSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopPtsSceneWithOptions(request, runtime);
    }

    public StopTestingJMeterSceneResponse stopTestingJMeterSceneWithOptions(StopTestingJMeterSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTestingJMeterScene"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTestingJMeterSceneResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiBaselinesShrink)) {
            query.put("ApiBaselines", request.apiBaselinesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneBaselineShrink)) {
            query.put("SceneBaseline", request.sceneBaselineShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePtsSceneBaseLine"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePtsSceneBaseLineResponse());
    }

    public UpdatePtsSceneBaseLineResponse updatePtsSceneBaseLine(UpdatePtsSceneBaseLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePtsSceneBaseLineWithOptions(request, runtime);
    }
}
