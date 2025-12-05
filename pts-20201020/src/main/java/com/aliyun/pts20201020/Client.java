// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pts20201020;

import com.aliyun.tea.*;
import com.aliyun.pts20201020.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * <b>summary</b> : 
     * <p>Adjusts the JMeter load.</p>
     * 
     * @param request AdjustJMeterSceneSpeedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AdjustJMeterSceneSpeedResponse
     */
    public AdjustJMeterSceneSpeedResponse adjustJMeterSceneSpeedWithOptions(AdjustJMeterSceneSpeedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speed)) {
            query.put("Speed", request.speed);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Adjusts the JMeter load.</p>
     * 
     * @param request AdjustJMeterSceneSpeedRequest
     * @return AdjustJMeterSceneSpeedResponse
     */
    public AdjustJMeterSceneSpeedResponse adjustJMeterSceneSpeed(AdjustJMeterSceneSpeedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.adjustJMeterSceneSpeedWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In concurrency mode, only the concurrency of the first API is passed as that of a session.
     * In requests per second (RPS) mode, the RPS of each API can be adjusted. Make sure that the RPS decreases in the API order in the same session.</p>
     * 
     * <b>summary</b> : 
     * <p>Adjusts the stress in a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param tmpReq AdjustPtsSceneSpeedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AdjustPtsSceneSpeedResponse
     */
    public AdjustPtsSceneSpeedResponse adjustPtsSceneSpeedWithOptions(AdjustPtsSceneSpeedRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AdjustPtsSceneSpeedShrinkRequest request = new AdjustPtsSceneSpeedShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apiSpeedList)) {
            request.apiSpeedListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apiSpeedList, "ApiSpeedList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiSpeedListShrink)) {
            query.put("ApiSpeedList", request.apiSpeedListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AdjustPtsSceneSpeed"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AdjustPtsSceneSpeedResponse());
    }

    /**
     * <b>description</b> :
     * <p>In concurrency mode, only the concurrency of the first API is passed as that of a session.
     * In requests per second (RPS) mode, the RPS of each API can be adjusted. Make sure that the RPS decreases in the API order in the same session.</p>
     * 
     * <b>summary</b> : 
     * <p>Adjusts the stress in a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param request AdjustPtsSceneSpeedRequest
     * @return AdjustPtsSceneSpeedResponse
     */
    public AdjustPtsSceneSpeedResponse adjustPtsSceneSpeed(AdjustPtsSceneSpeedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.adjustPtsSceneSpeedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a stress testing scenario.</p>
     * 
     * @param request CreatePtsSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePtsSceneResponse
     */
    public CreatePtsSceneResponse createPtsSceneWithOptions(CreatePtsSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Creates a stress testing scenario.</p>
     * 
     * @param request CreatePtsSceneRequest
     * @return CreatePtsSceneResponse
     */
    public CreatePtsSceneResponse createPtsScene(CreatePtsSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPtsSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>null</p>
     * 
     * @param request CreatePtsSceneBaseLineFromReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePtsSceneBaseLineFromReportResponse
     */
    public CreatePtsSceneBaseLineFromReportResponse createPtsSceneBaseLineFromReportWithOptions(CreatePtsSceneBaseLineFromReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>null</p>
     * 
     * @param request CreatePtsSceneBaseLineFromReportRequest
     * @return CreatePtsSceneBaseLineFromReportResponse
     */
    public CreatePtsSceneBaseLineFromReportResponse createPtsSceneBaseLineFromReport(CreatePtsSceneBaseLineFromReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPtsSceneBaseLineFromReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param request DeletePtsSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePtsSceneResponse
     */
    public DeletePtsSceneResponse deletePtsSceneWithOptions(DeletePtsSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Deletes a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param request DeletePtsSceneRequest
     * @return DeletePtsSceneResponse
     */
    public DeletePtsSceneResponse deletePtsScene(DeletePtsSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePtsSceneWithOptions(request, runtime);
    }

    /**
     * @param request DeletePtsSceneBaseLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePtsSceneBaseLineResponse
     */
    public DeletePtsSceneBaseLineResponse deletePtsSceneBaseLineWithOptions(DeletePtsSceneBaseLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeletePtsSceneBaseLineRequest
     * @return DeletePtsSceneBaseLineResponse
     */
    public DeletePtsSceneBaseLineResponse deletePtsSceneBaseLine(DeletePtsSceneBaseLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePtsSceneBaseLineWithOptions(request, runtime);
    }

    /**
     * @param tmpReq DeletePtsScenesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePtsScenesResponse
     */
    public DeletePtsScenesResponse deletePtsScenesWithOptions(DeletePtsScenesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeletePtsScenesRequest
     * @return DeletePtsScenesResponse
     */
    public DeletePtsScenesResponse deletePtsScenes(DeletePtsScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePtsScenesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all supported regions.</p>
     * 
     * @param request GetAllRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAllRegionsResponse
     */
    public GetAllRegionsResponse getAllRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries all supported regions.</p>
     * @return GetAllRegionsResponse
     */
    public GetAllRegionsResponse getAllRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAllRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operational logs of JMeter stress testers. By default, the operational logs of the stress tester identified as number 0 are queried and the total number of stress testers is returned.</p>
     * 
     * @param request GetJMeterLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJMeterLogsResponse
     */
    public GetJMeterLogsResponse getJMeterLogsWithOptions(GetJMeterLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries the operational logs of JMeter stress testers. By default, the operational logs of the stress tester identified as number 0 are queried and the total number of stress testers is returned.</p>
     * 
     * @param request GetJMeterLogsRequest
     * @return GetJMeterLogsResponse
     */
    public GetJMeterLogsResponse getJMeterLogs(GetJMeterLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJMeterLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a JMeter report.</p>
     * 
     * @param request GetJMeterReportDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJMeterReportDetailsResponse
     */
    public GetJMeterReportDetailsResponse getJMeterReportDetailsWithOptions(GetJMeterReportDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJMeterReportDetails"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJMeterReportDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a JMeter report.</p>
     * 
     * @param request GetJMeterReportDetailsRequest
     * @return GetJMeterReportDetailsResponse
     */
    public GetJMeterReportDetailsResponse getJMeterReportDetails(GetJMeterReportDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJMeterReportDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metrics of JMeter samplers based on specified conditions.</p>
     * 
     * @param request GetJMeterSampleMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJMeterSampleMetricsResponse
     */
    public GetJMeterSampleMetricsResponse getJMeterSampleMetricsWithOptions(GetJMeterSampleMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries the metrics of JMeter samplers based on specified conditions.</p>
     * 
     * @param request GetJMeterSampleMetricsRequest
     * @return GetJMeterSampleMetricsResponse
     */
    public GetJMeterSampleMetricsResponse getJMeterSampleMetrics(GetJMeterSampleMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJMeterSampleMetricsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the sampling logs of a JMeter sampler.</p>
     * 
     * @param request GetJMeterSamplingLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJMeterSamplingLogsResponse
     */
    public GetJMeterSamplingLogsResponse getJMeterSamplingLogsWithOptions(GetJMeterSamplingLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries the sampling logs of a JMeter sampler.</p>
     * 
     * @param request GetJMeterSamplingLogsRequest
     * @return GetJMeterSamplingLogsResponse
     */
    public GetJMeterSamplingLogsResponse getJMeterSamplingLogs(GetJMeterSamplingLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJMeterSamplingLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries data that is generated during the stress testing of a JMeter scenario based on the ID of the scenario.</p>
     * 
     * @param request GetJMeterSceneRunningDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJMeterSceneRunningDataResponse
     */
    public GetJMeterSceneRunningDataResponse getJMeterSceneRunningDataWithOptions(GetJMeterSceneRunningDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries data that is generated during the stress testing of a JMeter scenario based on the ID of the scenario.</p>
     * 
     * @param request GetJMeterSceneRunningDataRequest
     * @return GetJMeterSceneRunningDataResponse
     */
    public GetJMeterSceneRunningDataResponse getJMeterSceneRunningData(GetJMeterSceneRunningDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJMeterSceneRunningDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a JMeter scenario.</p>
     * 
     * @param request GetOpenJMeterSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOpenJMeterSceneResponse
     */
    public GetOpenJMeterSceneResponse getOpenJMeterSceneWithOptions(GetOpenJMeterSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries information about a JMeter scenario.</p>
     * 
     * @param request GetOpenJMeterSceneRequest
     * @return GetOpenJMeterSceneResponse
     */
    public GetOpenJMeterSceneResponse getOpenJMeterScene(GetOpenJMeterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpenJMeterSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the sampling logs for a Performance Testing Service (PTS) debugging task.</p>
     * 
     * @param request GetPtsDebugSampleLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPtsDebugSampleLogsResponse
     */
    public GetPtsDebugSampleLogsResponse getPtsDebugSampleLogsWithOptions(GetPtsDebugSampleLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPtsDebugSampleLogs"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPtsDebugSampleLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the sampling logs for a Performance Testing Service (PTS) debugging task.</p>
     * 
     * @param request GetPtsDebugSampleLogsRequest
     * @return GetPtsDebugSampleLogsResponse
     */
    public GetPtsDebugSampleLogsResponse getPtsDebugSampleLogs(GetPtsDebugSampleLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPtsDebugSampleLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a report for a performance testing task in a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param request GetPtsReportDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPtsReportDetailsResponse
     */
    public GetPtsReportDetailsResponse getPtsReportDetailsWithOptions(GetPtsReportDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a report for a performance testing task in a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param request GetPtsReportDetailsRequest
     * @return GetPtsReportDetailsResponse
     */
    public GetPtsReportDetailsResponse getPtsReportDetails(GetPtsReportDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPtsReportDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all reports of multiple scenarios that are generated during the stress testing in batch.</p>
     * 
     * @param request GetPtsReportsBySceneIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPtsReportsBySceneIdResponse
     */
    public GetPtsReportsBySceneIdResponse getPtsReportsBySceneIdWithOptions(GetPtsReportsBySceneIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries all reports of multiple scenarios that are generated during the stress testing in batch.</p>
     * 
     * @param request GetPtsReportsBySceneIdRequest
     * @return GetPtsReportsBySceneIdResponse
     */
    public GetPtsReportsBySceneIdResponse getPtsReportsBySceneId(GetPtsReportsBySceneIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPtsReportsBySceneIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the structure and load settings of a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param request GetPtsSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPtsSceneResponse
     */
    public GetPtsSceneResponse getPtsSceneWithOptions(GetPtsSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries the structure and load settings of a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param request GetPtsSceneRequest
     * @return GetPtsSceneResponse
     */
    public GetPtsSceneResponse getPtsScene(GetPtsSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPtsSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>null</p>
     * 
     * @param request GetPtsSceneBaseLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPtsSceneBaseLineResponse
     */
    public GetPtsSceneBaseLineResponse getPtsSceneBaseLineWithOptions(GetPtsSceneBaseLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>null</p>
     * 
     * @param request GetPtsSceneBaseLineRequest
     * @return GetPtsSceneBaseLineResponse
     */
    public GetPtsSceneBaseLineResponse getPtsSceneBaseLine(GetPtsSceneBaseLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPtsSceneBaseLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the runtime data of a stress testing or debugging scenario.</p>
     * 
     * @param request GetPtsSceneRunningDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPtsSceneRunningDataResponse
     */
    public GetPtsSceneRunningDataResponse getPtsSceneRunningDataWithOptions(GetPtsSceneRunningDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries the runtime data of a stress testing or debugging scenario.</p>
     * 
     * @param request GetPtsSceneRunningDataRequest
     * @return GetPtsSceneRunningDataResponse
     */
    public GetPtsSceneRunningDataResponse getPtsSceneRunningData(GetPtsSceneRunningDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPtsSceneRunningDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the runtime status of a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param request GetPtsSceneRunningStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPtsSceneRunningStatusResponse
     */
    public GetPtsSceneRunningStatusResponse getPtsSceneRunningStatusWithOptions(GetPtsSceneRunningStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries the runtime status of a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param request GetPtsSceneRunningStatusRequest
     * @return GetPtsSceneRunningStatusResponse
     */
    public GetPtsSceneRunningStatusResponse getPtsSceneRunningStatus(GetPtsSceneRunningStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPtsSceneRunningStatusWithOptions(request, runtime);
    }

    /**
     * @param request GetUserVpcSecurityGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserVpcSecurityGroupResponse
     */
    public GetUserVpcSecurityGroupResponse getUserVpcSecurityGroupWithOptions(GetUserVpcSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetUserVpcSecurityGroupRequest
     * @return GetUserVpcSecurityGroupResponse
     */
    public GetUserVpcSecurityGroupResponse getUserVpcSecurityGroup(GetUserVpcSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserVpcSecurityGroupWithOptions(request, runtime);
    }

    /**
     * @param request GetUserVpcVSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserVpcVSwitchResponse
     */
    public GetUserVpcVSwitchResponse getUserVpcVSwitchWithOptions(GetUserVpcVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetUserVpcVSwitchRequest
     * @return GetUserVpcVSwitchResponse
     */
    public GetUserVpcVSwitchResponse getUserVpcVSwitch(GetUserVpcVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserVpcVSwitchWithOptions(request, runtime);
    }

    /**
     * @param request GetUserVpcsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserVpcsResponse
     */
    public GetUserVpcsResponse getUserVpcsWithOptions(GetUserVpcsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request GetUserVpcsRequest
     * @return GetUserVpcsResponse
     */
    public GetUserVpcsResponse getUserVpcs(GetUserVpcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserVpcsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about JMeter environments.</p>
     * 
     * @param request ListEnvsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEnvsResponse
     */
    public ListEnvsResponse listEnvsWithOptions(ListEnvsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about JMeter environments.</p>
     * 
     * @param request ListEnvsRequest
     * @return ListEnvsResponse
     */
    public ListEnvsResponse listEnvs(ListEnvsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEnvsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries JMeter reports based on specified conditions.</p>
     * 
     * @param request ListJMeterReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJMeterReportsResponse
     */
    public ListJMeterReportsResponse listJMeterReportsWithOptions(ListJMeterReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries JMeter reports based on specified conditions.</p>
     * 
     * @param request ListJMeterReportsRequest
     * @return ListJMeterReportsResponse
     */
    public ListJMeterReportsResponse listJMeterReports(ListJMeterReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJMeterReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries JMeter scenarios based on a specified condition.</p>
     * 
     * @param request ListOpenJMeterScenesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOpenJMeterScenesResponse
     */
    public ListOpenJMeterScenesResponse listOpenJMeterScenesWithOptions(ListOpenJMeterScenesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries JMeter scenarios based on a specified condition.</p>
     * 
     * @param request ListOpenJMeterScenesRequest
     * @return ListOpenJMeterScenesResponse
     */
    public ListOpenJMeterScenesResponse listOpenJMeterScenes(ListOpenJMeterScenesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOpenJMeterScenesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Performance Testing Service (PTS) reports based on specified conditions.</p>
     * 
     * @param request ListPtsReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPtsReportsResponse
     */
    public ListPtsReportsResponse listPtsReportsWithOptions(ListPtsReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            body.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            body.put("ReportId", request.reportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPtsReports"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPtsReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Performance Testing Service (PTS) reports based on specified conditions.</p>
     * 
     * @param request ListPtsReportsRequest
     * @return ListPtsReportsResponse
     */
    public ListPtsReportsResponse listPtsReports(ListPtsReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPtsReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Performance Testing Service (PTS) scenarios by page.</p>
     * 
     * @param request ListPtsSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPtsSceneResponse
     */
    public ListPtsSceneResponse listPtsSceneWithOptions(ListPtsSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Queries Performance Testing Service (PTS) scenarios by page.</p>
     * 
     * @param request ListPtsSceneRequest
     * @return ListPtsSceneResponse
     */
    public ListPtsSceneResponse listPtsScene(ListPtsSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPtsSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取vpc配置信息列表</p>
     * 
     * @param request ListVpcConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpcConfigsResponse
     */
    public ListVpcConfigsResponse listVpcConfigsWithOptions(ListVpcConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("ConfigName", request.configName);
        }

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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpcConfigs"),
            new TeaPair("version", "2020-10-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpcConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取vpc配置信息列表</p>
     * 
     * @param request ListVpcConfigsRequest
     * @return ListVpcConfigsResponse
     */
    public ListVpcConfigsResponse listVpcConfigs(ListVpcConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpcConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>null</p>
     * 
     * @param request ModifyPtsSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPtsSceneResponse
     */
    public ModifyPtsSceneResponse modifyPtsSceneWithOptions(ModifyPtsSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>null</p>
     * 
     * @param request ModifyPtsSceneRequest
     * @return ModifyPtsSceneResponse
     */
    public ModifyPtsSceneResponse modifyPtsScene(ModifyPtsSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPtsSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes the JMeter environment that corresponds to a specific JMeter environment ID.</p>
     * 
     * @param request RemoveEnvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveEnvResponse
     */
    public RemoveEnvResponse removeEnvWithOptions(RemoveEnvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envId)) {
            query.put("EnvId", request.envId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Removes the JMeter environment that corresponds to a specific JMeter environment ID.</p>
     * 
     * @param request RemoveEnvRequest
     * @return RemoveEnvResponse
     */
    public RemoveEnvResponse removeEnv(RemoveEnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeEnvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a JMeter scenario.</p>
     * 
     * @param request RemoveOpenJMeterSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveOpenJMeterSceneResponse
     */
    public RemoveOpenJMeterSceneResponse removeOpenJMeterSceneWithOptions(RemoveOpenJMeterSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Removes a JMeter scenario.</p>
     * 
     * @param request RemoveOpenJMeterSceneRequest
     * @return RemoveOpenJMeterSceneResponse
     */
    public RemoveOpenJMeterSceneResponse removeOpenJMeterScene(RemoveOpenJMeterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeOpenJMeterSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a JMeter environment.</p>
     * 
     * @param tmpReq SaveEnvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveEnvResponse
     */
    public SaveEnvResponse saveEnvWithOptions(SaveEnvRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveEnvShrinkRequest request = new SaveEnvShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.env)) {
            request.envShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.env, "Env", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.envShrink)) {
            query.put("Env", request.envShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a JMeter environment.</p>
     * 
     * @param request SaveEnvRequest
     * @return SaveEnvResponse
     */
    public SaveEnvResponse saveEnv(SaveEnvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveEnvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a JMeter scenario.</p>
     * 
     * @param tmpReq SaveOpenJMeterSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveOpenJMeterSceneResponse
     */
    public SaveOpenJMeterSceneResponse saveOpenJMeterSceneWithOptions(SaveOpenJMeterSceneRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveOpenJMeterSceneShrinkRequest request = new SaveOpenJMeterSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openJMeterScene)) {
            request.openJMeterSceneShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openJMeterScene, "OpenJMeterScene", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openJMeterSceneShrink)) {
            query.put("OpenJMeterScene", request.openJMeterSceneShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Creates or updates a JMeter scenario.</p>
     * 
     * @param request SaveOpenJMeterSceneRequest
     * @return SaveOpenJMeterSceneResponse
     */
    public SaveOpenJMeterSceneResponse saveOpenJMeterScene(SaveOpenJMeterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveOpenJMeterSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Saves or modifies a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param tmpReq SavePtsSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SavePtsSceneResponse
     */
    public SavePtsSceneResponse savePtsSceneWithOptions(SavePtsSceneRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SavePtsSceneShrinkRequest request = new SavePtsSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scene)) {
            request.sceneShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scene, "Scene", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneShrink)) {
            query.put("Scene", request.sceneShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Saves or modifies a Performance Testing Service (PTS) scenario.</p>
     * 
     * @param request SavePtsSceneRequest
     * @return SavePtsSceneResponse
     */
    public SavePtsSceneResponse savePtsScene(SavePtsSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.savePtsSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts the debugging of a scenario to check whether the settings of the scenario take effect.</p>
     * 
     * @param request StartDebugPtsSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDebugPtsSceneResponse
     */
    public StartDebugPtsSceneResponse startDebugPtsSceneWithOptions(StartDebugPtsSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Starts the debugging of a scenario to check whether the settings of the scenario take effect.</p>
     * 
     * @param request StartDebugPtsSceneRequest
     * @return StartDebugPtsSceneResponse
     */
    public StartDebugPtsSceneResponse startDebugPtsScene(StartDebugPtsSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDebugPtsSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Debugs a JMeter scenario.</p>
     * 
     * @param request StartDebuggingJMeterSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartDebuggingJMeterSceneResponse
     */
    public StartDebuggingJMeterSceneResponse startDebuggingJMeterSceneWithOptions(StartDebuggingJMeterSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Debugs a JMeter scenario.</p>
     * 
     * @param request StartDebuggingJMeterSceneRequest
     * @return StartDebuggingJMeterSceneResponse
     */
    public StartDebuggingJMeterSceneResponse startDebuggingJMeterScene(StartDebuggingJMeterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDebuggingJMeterSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a scenario by using its ID.</p>
     * 
     * @param request StartPtsSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartPtsSceneResponse
     */
    public StartPtsSceneResponse startPtsSceneWithOptions(StartPtsSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Starts a scenario by using its ID.</p>
     * 
     * @param request StartPtsSceneRequest
     * @return StartPtsSceneResponse
     */
    public StartPtsSceneResponse startPtsScene(StartPtsSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startPtsSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts performance testing in a JMeter scenario.</p>
     * 
     * @param request StartTestingJMeterSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTestingJMeterSceneResponse
     */
    public StartTestingJMeterSceneResponse startTestingJMeterSceneWithOptions(StartTestingJMeterSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Starts performance testing in a JMeter scenario.</p>
     * 
     * @param request StartTestingJMeterSceneRequest
     * @return StartTestingJMeterSceneResponse
     */
    public StartTestingJMeterSceneResponse startTestingJMeterScene(StartTestingJMeterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTestingJMeterSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops the scenario that is in debugging.</p>
     * 
     * @param request StopDebugPtsSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDebugPtsSceneResponse
     */
    public StopDebugPtsSceneResponse stopDebugPtsSceneWithOptions(StopDebugPtsSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Stops the scenario that is in debugging.</p>
     * 
     * @param request StopDebugPtsSceneRequest
     * @return StopDebugPtsSceneResponse
     */
    public StopDebugPtsSceneResponse stopDebugPtsScene(StopDebugPtsSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDebugPtsSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops the debugging of a JMeter scenario.</p>
     * 
     * @param request StopDebuggingJMeterSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopDebuggingJMeterSceneResponse
     */
    public StopDebuggingJMeterSceneResponse stopDebuggingJMeterSceneWithOptions(StopDebuggingJMeterSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Stops the debugging of a JMeter scenario.</p>
     * 
     * @param request StopDebuggingJMeterSceneRequest
     * @return StopDebuggingJMeterSceneResponse
     */
    public StopDebuggingJMeterSceneResponse stopDebuggingJMeterScene(StopDebuggingJMeterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDebuggingJMeterSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a scenario by using its ID.</p>
     * 
     * @param request StopPtsSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopPtsSceneResponse
     */
    public StopPtsSceneResponse stopPtsSceneWithOptions(StopPtsSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Stops a scenario by using its ID.</p>
     * 
     * @param request StopPtsSceneRequest
     * @return StopPtsSceneResponse
     */
    public StopPtsSceneResponse stopPtsScene(StopPtsSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopPtsSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops performance testing by using a JMeter scenario.</p>
     * 
     * @param request StopTestingJMeterSceneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTestingJMeterSceneResponse
     */
    public StopTestingJMeterSceneResponse stopTestingJMeterSceneWithOptions(StopTestingJMeterSceneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>Stops performance testing by using a JMeter scenario.</p>
     * 
     * @param request StopTestingJMeterSceneRequest
     * @return StopTestingJMeterSceneResponse
     */
    public StopTestingJMeterSceneResponse stopTestingJMeterScene(StopTestingJMeterSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTestingJMeterSceneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>null</p>
     * 
     * @param tmpReq UpdatePtsSceneBaseLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePtsSceneBaseLineResponse
     */
    public UpdatePtsSceneBaseLineResponse updatePtsSceneBaseLineWithOptions(UpdatePtsSceneBaseLineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>null</p>
     * 
     * @param request UpdatePtsSceneBaseLineRequest
     * @return UpdatePtsSceneBaseLineResponse
     */
    public UpdatePtsSceneBaseLineResponse updatePtsSceneBaseLine(UpdatePtsSceneBaseLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePtsSceneBaseLineWithOptions(request, runtime);
    }
}
