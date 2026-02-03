// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216;

import com.aliyun.tea.*;
import com.aliyun.nis20211216.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nis", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>You can call this operation to initiate a task for analyzing network reachability by specifying only the information about the source and destination. You do not need to create a network path for reachability analysis. The analysis result is not recorded in the system. If you want to record the path parameters and analysis result in the Network Intelligence Service (NIS) console, we recommend that you call the <strong>createNetworkReachableAnalysis</strong> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates a task for analyzing network reachability.</p>
     * 
     * @param request CreateAndAnalyzeNetworkPathRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAndAnalyzeNetworkPathResponse
     */
    public CreateAndAnalyzeNetworkPathResponse createAndAnalyzeNetworkPathWithOptions(CreateAndAnalyzeNetworkPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAndAnalyzeNetworkPath"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAndAnalyzeNetworkPathResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to initiate a task for analyzing network reachability by specifying only the information about the source and destination. You do not need to create a network path for reachability analysis. The analysis result is not recorded in the system. If you want to record the path parameters and analysis result in the Network Intelligence Service (NIS) console, we recommend that you call the <strong>createNetworkReachableAnalysis</strong> operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates a task for analyzing network reachability.</p>
     * 
     * @param request CreateAndAnalyzeNetworkPathRequest
     * @return CreateAndAnalyzeNetworkPathResponse
     */
    public CreateAndAnalyzeNetworkPathResponse createAndAnalyzeNetworkPath(CreateAndAnalyzeNetworkPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAndAnalyzeNetworkPathWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <strong>CreateNetworkPath</strong> operation to create network paths in multiple networking scenarios and between multiple resources. After a path is created, the path parameters are saved for repeated analysis.</p>
     * <ul>
     * <li>You can create up to 100 network paths within one Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a network path in the cloud for reachability analysis.</p>
     * 
     * @param request CreateNetworkPathRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkPathResponse
     */
    public CreateNetworkPathResponse createNetworkPathWithOptions(CreateNetworkPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkPathDescription)) {
            query.put("NetworkPathDescription", request.networkPathDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkPathName)) {
            query.put("NetworkPathName", request.networkPathName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIpAddress)) {
            query.put("SourceIpAddress", request.sourceIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePort)) {
            query.put("SourcePort", request.sourcePort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetIpAddress)) {
            query.put("TargetIpAddress", request.targetIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPort)) {
            query.put("TargetPort", request.targetPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkPath"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkPathResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call the <strong>CreateNetworkPath</strong> operation to create network paths in multiple networking scenarios and between multiple resources. After a path is created, the path parameters are saved for repeated analysis.</p>
     * <ul>
     * <li>You can create up to 100 network paths within one Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a network path in the cloud for reachability analysis.</p>
     * 
     * @param request CreateNetworkPathRequest
     * @return CreateNetworkPathResponse
     */
    public CreateNetworkPathResponse createNetworkPath(CreateNetworkPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkPathWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The <strong>CreateNetworkReachableAnalysis</strong> operation is used to create a task for analyzing the reachability of the network path that is created by calling the <strong>CreateNetworkPath</strong> operation and record the analysis results.</p>
     * <ul>
     * <li>The <strong>CreateNetworkReachableAnalysis</strong> operation can be called to repeatedly analyze the reachability of a network path.</li>
     * <li>You can create up to 1,000 reachability analysis records within one Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a task for analyzing network reachability.</p>
     * 
     * @param request CreateNetworkReachableAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkReachableAnalysisResponse
     */
    public CreateNetworkReachableAnalysisResponse createNetworkReachableAnalysisWithOptions(CreateNetworkReachableAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkPathId)) {
            query.put("NetworkPathId", request.networkPathId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkReachableAnalysis"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkReachableAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The <strong>CreateNetworkReachableAnalysis</strong> operation is used to create a task for analyzing the reachability of the network path that is created by calling the <strong>CreateNetworkPath</strong> operation and record the analysis results.</p>
     * <ul>
     * <li>The <strong>CreateNetworkReachableAnalysis</strong> operation can be called to repeatedly analyze the reachability of a network path.</li>
     * <li>You can create up to 1,000 reachability analysis records within one Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a task for analyzing network reachability.</p>
     * 
     * @param request CreateNetworkReachableAnalysisRequest
     * @return CreateNetworkReachableAnalysisResponse
     */
    public CreateNetworkReachableAnalysisResponse createNetworkReachableAnalysis(CreateNetworkReachableAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkReachableAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a network path.</p>
     * 
     * @param tmpReq DeleteNetworkPathRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkPathResponse
     */
    public DeleteNetworkPathResponse deleteNetworkPathWithOptions(DeleteNetworkPathRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteNetworkPathShrinkRequest request = new DeleteNetworkPathShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.networkPathIds)) {
            request.networkPathIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.networkPathIds, "NetworkPathIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkPathIdsShrink)) {
            query.put("NetworkPathIds", request.networkPathIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkPath"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkPathResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a network path.</p>
     * 
     * @param request DeleteNetworkPathRequest
     * @return DeleteNetworkPathResponse
     */
    public DeleteNetworkPathResponse deleteNetworkPath(DeleteNetworkPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkPathWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a task for analyzing network reachability.</p>
     * 
     * @param tmpReq DeleteNetworkReachableAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkReachableAnalysisResponse
     */
    public DeleteNetworkReachableAnalysisResponse deleteNetworkReachableAnalysisWithOptions(DeleteNetworkReachableAnalysisRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteNetworkReachableAnalysisShrinkRequest request = new DeleteNetworkReachableAnalysisShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.networkReachableAnalysisIds)) {
            request.networkReachableAnalysisIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.networkReachableAnalysisIds, "NetworkReachableAnalysisIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkReachableAnalysisIdsShrink)) {
            query.put("NetworkReachableAnalysisIds", request.networkReachableAnalysisIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkReachableAnalysis"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkReachableAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a task for analyzing network reachability.</p>
     * 
     * @param request DeleteNetworkReachableAnalysisRequest
     * @return DeleteNetworkReachableAnalysisResponse
     */
    public DeleteNetworkReachableAnalysisResponse deleteNetworkReachableAnalysis(DeleteNetworkReachableAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkReachableAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除报告</p>
     * 
     * @param request DeleteNisInspectionReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNisInspectionReportResponse
     */
    public DeleteNisInspectionReportResponse deleteNisInspectionReportWithOptions(DeleteNisInspectionReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inspectionReportId)) {
            query.put("InspectionReportId", request.inspectionReportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNisInspectionReport"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNisInspectionReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除报告</p>
     * 
     * @param request DeleteNisInspectionReportRequest
     * @return DeleteNisInspectionReportResponse
     */
    public DeleteNisInspectionReportResponse deleteNisInspectionReport(DeleteNisInspectionReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNisInspectionReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除巡检任务</p>
     * 
     * @param request DeleteNisInspectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNisInspectionTaskResponse
     */
    public DeleteNisInspectionTaskResponse deleteNisInspectionTaskWithOptions(DeleteNisInspectionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inspectionTaskId)) {
            query.put("InspectionTaskId", request.inspectionTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNisInspectionTask"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNisInspectionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除巡检任务</p>
     * 
     * @param request DeleteNisInspectionTaskRequest
     * @return DeleteNisInspectionTaskResponse
     */
    public DeleteNisInspectionTaskResponse deleteNisInspectionTask(DeleteNisInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNisInspectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>受影响资源列表</p>
     * 
     * @param request DescribeNisInspectionRecommendationResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNisInspectionRecommendationResourcesResponse
     */
    public DescribeNisInspectionRecommendationResourcesResponse describeNisInspectionRecommendationResourcesWithOptions(DescribeNisInspectionRecommendationResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inspectionReportId)) {
            query.put("InspectionReportId", request.inspectionReportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recommendationCode)) {
            query.put("RecommendationCode", request.recommendationCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNisInspectionRecommendationResources"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNisInspectionRecommendationResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>受影响资源列表</p>
     * 
     * @param request DescribeNisInspectionRecommendationResourcesRequest
     * @return DescribeNisInspectionRecommendationResourcesResponse
     */
    public DescribeNisInspectionRecommendationResourcesResponse describeNisInspectionRecommendationResources(DescribeNisInspectionRecommendationResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNisInspectionRecommendationResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>报告巡检项列表</p>
     * 
     * @param tmpReq DescribeNisInspectionReportCheckItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNisInspectionReportCheckItemsResponse
     */
    public DescribeNisInspectionReportCheckItemsResponse describeNisInspectionReportCheckItemsWithOptions(DescribeNisInspectionReportCheckItemsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeNisInspectionReportCheckItemsShrinkRequest request = new DescribeNisInspectionReportCheckItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceType)) {
            request.resourceTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceType, "ResourceType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.riskLevel)) {
            request.riskLevelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.riskLevel, "RiskLevel", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryCode)) {
            query.put("CategoryCode", request.categoryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inspectionReportId)) {
            query.put("InspectionReportId", request.inspectionReportId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypeShrink)) {
            query.put("ResourceType", request.resourceTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevelShrink)) {
            query.put("RiskLevel", request.riskLevelShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNisInspectionReportCheckItems"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNisInspectionReportCheckItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>报告巡检项列表</p>
     * 
     * @param request DescribeNisInspectionReportCheckItemsRequest
     * @return DescribeNisInspectionReportCheckItemsResponse
     */
    public DescribeNisInspectionReportCheckItemsResponse describeNisInspectionReportCheckItems(DescribeNisInspectionReportCheckItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNisInspectionReportCheckItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询报告状态</p>
     * 
     * @param request DescribeNisInspectionReportStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNisInspectionReportStatusResponse
     */
    public DescribeNisInspectionReportStatusResponse describeNisInspectionReportStatusWithOptions(DescribeNisInspectionReportStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inspectionReportId)) {
            query.put("InspectionReportId", request.inspectionReportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNisInspectionReportStatus"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNisInspectionReportStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询报告状态</p>
     * 
     * @param request DescribeNisInspectionReportStatusRequest
     * @return DescribeNisInspectionReportStatusResponse
     */
    public DescribeNisInspectionReportStatusResponse describeNisInspectionReportStatus(DescribeNisInspectionReportStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNisInspectionReportStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>报告总结信息</p>
     * 
     * @param request DescribeNisInspectionReportSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNisInspectionReportSummaryResponse
     */
    public DescribeNisInspectionReportSummaryResponse describeNisInspectionReportSummaryWithOptions(DescribeNisInspectionReportSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inspectionReportId)) {
            query.put("InspectionReportId", request.inspectionReportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNisInspectionReportSummary"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNisInspectionReportSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>报告总结信息</p>
     * 
     * @param request DescribeNisInspectionReportSummaryRequest
     * @return DescribeNisInspectionReportSummaryResponse
     */
    public DescribeNisInspectionReportSummaryResponse describeNisInspectionReportSummary(DescribeNisInspectionReportSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNisInspectionReportSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询巡检任务</p>
     * 
     * @param request DescribeNisInspectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNisInspectionTaskResponse
     */
    public DescribeNisInspectionTaskResponse describeNisInspectionTaskWithOptions(DescribeNisInspectionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inspectionTaskId)) {
            query.put("InspectionTaskId", request.inspectionTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNisInspectionTask"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNisInspectionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询巡检任务</p>
     * 
     * @param request DescribeNisInspectionTaskRequest
     * @return DescribeNisInspectionTaskResponse
     */
    public DescribeNisInspectionTaskResponse describeNisInspectionTask(DescribeNisInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNisInspectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询流量分析topN异步任务结果</p>
     * 
     * @param request DescribeNisTrafficRankingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNisTrafficRankingResponse
     */
    public DescribeNisTrafficRankingResponse describeNisTrafficRankingWithOptions(DescribeNisTrafficRankingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nisTrafficRankingId)) {
            query.put("NisTrafficRankingId", request.nisTrafficRankingId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNisTrafficRanking"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNisTrafficRankingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询流量分析topN异步任务结果</p>
     * 
     * @param request DescribeNisTrafficRankingRequest
     * @return DescribeNisTrafficRankingResponse
     */
    public DescribeNisTrafficRankingResponse describeNisTrafficRanking(DescribeNisTrafficRankingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNisTrafficRankingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rankings of Internet traffic data in the form of 1-tuple, 2-tuple, or 5-tuple. Internet traffic data can be ranked by metrics such as traffic volumes and the number of packets.</p>
     * 
     * @deprecated OpenAPI GetInternetTuple is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.
     * 
     * @param tmpReq GetInternetTupleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInternetTupleResponse
     */
    @Deprecated
    // Deprecated
    public GetInternetTupleResponse getInternetTupleWithOptions(GetInternetTupleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetInternetTupleShrinkRequest request = new GetInternetTupleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cloudIpList)) {
            request.cloudIpListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cloudIpList, "CloudIpList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceList)) {
            request.instanceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceList, "InstanceList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIds)) {
            query.put("AccountIds", request.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudIp)) {
            query.put("CloudIp", request.cloudIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudIpListShrink)) {
            query.put("CloudIpList", request.cloudIpListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudIsp)) {
            query.put("CloudIsp", request.cloudIsp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudPort)) {
            query.put("CloudPort", request.cloudPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceListShrink)) {
            query.put("InstanceList", request.instanceListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherCity)) {
            query.put("OtherCity", request.otherCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherCountry)) {
            query.put("OtherCountry", request.otherCountry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherIp)) {
            query.put("OtherIp", request.otherIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherIsp)) {
            query.put("OtherIsp", request.otherIsp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherPort)) {
            query.put("OtherPort", request.otherPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topN)) {
            query.put("TopN", request.topN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tupleType)) {
            query.put("TupleType", request.tupleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useMultiAccount)) {
            query.put("UseMultiAccount", request.useMultiAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInternetTuple"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInternetTupleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rankings of Internet traffic data in the form of 1-tuple, 2-tuple, or 5-tuple. Internet traffic data can be ranked by metrics such as traffic volumes and the number of packets.</p>
     * 
     * @deprecated OpenAPI GetInternetTuple is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.
     * 
     * @param request GetInternetTupleRequest
     * @return GetInternetTupleResponse
     */
    @Deprecated
    // Deprecated
    public GetInternetTupleResponse getInternetTuple(GetInternetTupleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInternetTupleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the real-time SNAT performance ranking of a NAT gateway.</p>
     * 
     * @deprecated OpenAPI GetNatTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.
     * 
     * @param request GetNatTopNRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNatTopNResponse
     */
    @Deprecated
    // Deprecated
    public GetNatTopNResponse getNatTopNWithOptions(GetNatTopNRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topN)) {
            query.put("TopN", request.topN);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNatTopN"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNatTopNResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the real-time SNAT performance ranking of a NAT gateway.</p>
     * 
     * @deprecated OpenAPI GetNatTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.
     * 
     * @param request GetNatTopNRequest
     * @return GetNatTopNResponse
     */
    @Deprecated
    // Deprecated
    public GetNatTopNResponse getNatTopN(GetNatTopNRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNatTopNWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>GetNetworkReachableAnalysis</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can query the state of the task for analyzing network reachability.</p>
     * <ul>
     * <li>The <strong>init</strong> state indicates that the task is in progress.</li>
     * <li>The <strong>finish</strong> state indicates that the task is complete. In this state, you can obtain the analysis result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the results of network reachability analysis.</p>
     * 
     * @param request GetNetworkReachableAnalysisRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNetworkReachableAnalysisResponse
     */
    public GetNetworkReachableAnalysisResponse getNetworkReachableAnalysisWithOptions(GetNetworkReachableAnalysisRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkReachableAnalysisId)) {
            query.put("NetworkReachableAnalysisId", request.networkReachableAnalysisId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetworkReachableAnalysis"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNetworkReachableAnalysisResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>GetNetworkReachableAnalysis</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can query the state of the task for analyzing network reachability.</p>
     * <ul>
     * <li>The <strong>init</strong> state indicates that the task is in progress.</li>
     * <li>The <strong>finish</strong> state indicates that the task is complete. In this state, you can obtain the analysis result.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains the results of network reachability analysis.</p>
     * 
     * @param request GetNetworkReachableAnalysisRequest
     * @return GetNetworkReachableAnalysisResponse
     */
    public GetNetworkReachableAnalysisResponse getNetworkReachableAnalysis(GetNetworkReachableAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetworkReachableAnalysisWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取云网络指标趋势</p>
     * 
     * @param tmpReq GetNisNetworkMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNisNetworkMetricsResponse
     */
    public GetNisNetworkMetricsResponse getNisNetworkMetricsWithOptions(GetNisNetworkMetricsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetNisNetworkMetricsShrinkRequest request = new GetNisNetworkMetricsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dimensions)) {
            request.dimensionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dimensions, "Dimensions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIds)) {
            query.put("AccountIds", request.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensionsShrink)) {
            query.put("Dimensions", request.dimensionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanBy)) {
            query.put("ScanBy", request.scanBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stepMinutes)) {
            query.put("StepMinutes", request.stepMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCrossAccount)) {
            query.put("UseCrossAccount", request.useCrossAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNisNetworkMetrics"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNisNetworkMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取云网络指标趋势</p>
     * 
     * @param request GetNisNetworkMetricsRequest
     * @return GetNisNetworkMetricsResponse
     */
    public GetNisNetworkMetricsResponse getNisNetworkMetrics(GetNisNetworkMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNisNetworkMetricsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取云网络指标排名</p>
     * 
     * @param tmpReq GetNisNetworkRankingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNisNetworkRankingResponse
     */
    public GetNisNetworkRankingResponse getNisNetworkRankingWithOptions(GetNisNetworkRankingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetNisNetworkRankingShrinkRequest request = new GetNisNetworkRankingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIds)) {
            query.put("AccountIds", request.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topN)) {
            query.put("TopN", request.topN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCrossAccount)) {
            query.put("UseCrossAccount", request.useCrossAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNisNetworkRanking"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNisNetworkRankingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取云网络指标排名</p>
     * 
     * @param request GetNisNetworkRankingRequest
     * @return GetNisNetworkRankingResponse
     */
    public GetNisNetworkRankingResponse getNisNetworkRanking(GetNisNetworkRankingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNisNetworkRankingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rankings of inter-region traffic data in the form of 1-tuple, 2-tuple, or 5-tuple. Inter-region traffic data can be ranked by metrics such as traffic volumes and the number of packets.</p>
     * 
     * @deprecated OpenAPI GetTransitRouterFlowTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.
     * 
     * @param tmpReq GetTransitRouterFlowTopNRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTransitRouterFlowTopNResponse
     */
    @Deprecated
    // Deprecated
    public GetTransitRouterFlowTopNResponse getTransitRouterFlowTopNWithOptions(GetTransitRouterFlowTopNRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTransitRouterFlowTopNShrinkRequest request = new GetTransitRouterFlowTopNShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "AccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            query.put("AccountIds", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwithPackageId)) {
            query.put("BandwithPackageId", request.bandwithPackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherIp)) {
            query.put("OtherIp", request.otherIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherPort)) {
            query.put("OtherPort", request.otherPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherRegion)) {
            query.put("OtherRegion", request.otherRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thisIp)) {
            query.put("ThisIp", request.thisIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thisPort)) {
            query.put("ThisPort", request.thisPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thisRegion)) {
            query.put("ThisRegion", request.thisRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topN)) {
            query.put("TopN", request.topN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useMultiAccount)) {
            query.put("UseMultiAccount", request.useMultiAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTransitRouterFlowTopN"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTransitRouterFlowTopNResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rankings of inter-region traffic data in the form of 1-tuple, 2-tuple, or 5-tuple. Inter-region traffic data can be ranked by metrics such as traffic volumes and the number of packets.</p>
     * 
     * @deprecated OpenAPI GetTransitRouterFlowTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.
     * 
     * @param request GetTransitRouterFlowTopNRequest
     * @return GetTransitRouterFlowTopNResponse
     */
    @Deprecated
    // Deprecated
    public GetTransitRouterFlowTopNResponse getTransitRouterFlowTopN(GetTransitRouterFlowTopNRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTransitRouterFlowTopNWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rankings of hybrid cloud traffic data in the form of 1-tuple, 2-tuple, or 5-tuple. Hybrid cloud traffic data can be ranked by metrics such as traffic volumes and the number of packets.</p>
     * 
     * @deprecated OpenAPI GetVbrFlowTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.
     * 
     * @param tmpReq GetVbrFlowTopNRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVbrFlowTopNResponse
     */
    @Deprecated
    // Deprecated
    public GetVbrFlowTopNResponse getVbrFlowTopNWithOptions(GetVbrFlowTopNRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetVbrFlowTopNShrinkRequest request = new GetVbrFlowTopNShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "AccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            query.put("AccountIds", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attachmentId)) {
            query.put("AttachmentId", request.attachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            query.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudIp)) {
            query.put("CloudIp", request.cloudIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudPort)) {
            query.put("CloudPort", request.cloudPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupBy)) {
            query.put("GroupBy", request.groupBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherIp)) {
            query.put("OtherIp", request.otherIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otherPort)) {
            query.put("OtherPort", request.otherPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topN)) {
            query.put("TopN", request.topN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useMultiAccount)) {
            query.put("UseMultiAccount", request.useMultiAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualBorderRouterId)) {
            query.put("VirtualBorderRouterId", request.virtualBorderRouterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVbrFlowTopN"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVbrFlowTopNResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rankings of hybrid cloud traffic data in the form of 1-tuple, 2-tuple, or 5-tuple. Hybrid cloud traffic data can be ranked by metrics such as traffic volumes and the number of packets.</p>
     * 
     * @deprecated OpenAPI GetVbrFlowTopN is deprecated, please use nis::2021-12-16::GetNisNetworkRanking instead.
     * 
     * @param request GetVbrFlowTopNRequest
     * @return GetVbrFlowTopNResponse
     */
    @Deprecated
    // Deprecated
    public GetVbrFlowTopNResponse getVbrFlowTopN(GetVbrFlowTopNRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVbrFlowTopNWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>巡检资源类型列表</p>
     * 
     * @param request ListNisInspectionResourceTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNisInspectionResourceTypeResponse
     */
    public ListNisInspectionResourceTypeResponse listNisInspectionResourceTypeWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNisInspectionResourceType"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNisInspectionResourceTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>巡检资源类型列表</p>
     * @return ListNisInspectionResourceTypeResponse
     */
    public ListNisInspectionResourceTypeResponse listNisInspectionResourceType() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNisInspectionResourceTypeWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询巡检报告列表</p>
     * 
     * @param request ListNisInspectionTaskReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNisInspectionTaskReportsResponse
     */
    public ListNisInspectionTaskReportsResponse listNisInspectionTaskReportsWithOptions(ListNisInspectionTaskReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inspectionTaskId)) {
            query.put("InspectionTaskId", request.inspectionTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNisInspectionTaskReports"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNisInspectionTaskReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询巡检报告列表</p>
     * 
     * @param request ListNisInspectionTaskReportsRequest
     * @return ListNisInspectionTaskReportsResponse
     */
    public ListNisInspectionTaskReportsResponse listNisInspectionTaskReports(ListNisInspectionTaskReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNisInspectionTaskReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>巡检任务列表</p>
     * 
     * @param request ListNisInspectionTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNisInspectionTasksResponse
     */
    public ListNisInspectionTasksResponse listNisInspectionTasksWithOptions(ListNisInspectionTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inspectionName)) {
            query.put("InspectionName", request.inspectionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inspectionProject)) {
            query.put("InspectionProject", request.inspectionProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inspectionTaskId)) {
            query.put("InspectionTaskId", request.inspectionTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNisInspectionTasks"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNisInspectionTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>巡检任务列表</p>
     * 
     * @param request ListNisInspectionTasksRequest
     * @return ListNisInspectionTasksResponse
     */
    public ListNisInspectionTasksResponse listNisInspectionTasks(ListNisInspectionTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNisInspectionTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>请补充描述开启任务</p>
     * 
     * @param request StartNisInspectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartNisInspectionTaskResponse
     */
    public StartNisInspectionTaskResponse startNisInspectionTaskWithOptions(StartNisInspectionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inspectionTaskId)) {
            query.put("InspectionTaskId", request.inspectionTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartNisInspectionTask"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartNisInspectionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>请补充描述开启任务</p>
     * 
     * @param request StartNisInspectionTaskRequest
     * @return StartNisInspectionTaskResponse
     */
    public StartNisInspectionTaskResponse startNisInspectionTask(StartNisInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startNisInspectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取云网络流量指标排名</p>
     * 
     * @param tmpReq StartNisTrafficRankingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartNisTrafficRankingResponse
     */
    public StartNisTrafficRankingResponse startNisTrafficRankingWithOptions(StartNisTrafficRankingRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartNisTrafficRankingShrinkRequest request = new StartNisTrafficRankingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.groupBy)) {
            request.groupByShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.groupBy, "GroupBy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("Filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupByShrink)) {
            query.put("GroupBy", request.groupByShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageInterval)) {
            query.put("StorageInterval", request.storageInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topN)) {
            query.put("TopN", request.topN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficAnalyzerId)) {
            query.put("TrafficAnalyzerId", request.trafficAnalyzerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficScenario)) {
            query.put("TrafficScenario", request.trafficScenario);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tupleDimension)) {
            query.put("TupleDimension", request.tupleDimension);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartNisTrafficRanking"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartNisTrafficRankingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取云网络流量指标排名</p>
     * 
     * @param request StartNisTrafficRankingRequest
     * @return StartNisTrafficRankingResponse
     */
    public StartNisTrafficRankingResponse startNisTrafficRanking(StartNisTrafficRankingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startNisTrafficRankingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改巡检项</p>
     * 
     * @param request UpdateNisInspectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNisInspectionTaskResponse
     */
    public UpdateNisInspectionTaskResponse updateNisInspectionTaskWithOptions(UpdateNisInspectionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inspectionTaskId)) {
            query.put("InspectionTaskId", request.inspectionTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNisInspectionTask"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNisInspectionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改巡检项</p>
     * 
     * @param request UpdateNisInspectionTaskRequest
     * @return UpdateNisInspectionTaskResponse
     */
    public UpdateNisInspectionTaskResponse updateNisInspectionTask(UpdateNisInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNisInspectionTaskWithOptions(request, runtime);
    }
}
