// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216;

import com.aliyun.tea.*;
import com.aliyun.nis20211216.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "nis.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "nis-intl.aliyuncs.com")
        );
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
     * <ul>
     * <li>You can call the <strong>CreateNetworkPath</strong> operation to create network paths in multiple networking scenarios and between multiple resources. After a path is created, the path parameters are saved for repeated analysis.</li>
     * <li>You can create up to 100 network paths within one Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a network path for reachability analysis.</p>
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
     * <ul>
     * <li>You can call the <strong>CreateNetworkPath</strong> operation to create network paths in multiple networking scenarios and between multiple resources. After a path is created, the path parameters are saved for repeated analysis.</li>
     * <li>You can create up to 100 network paths within one Alibaba Cloud account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a network path for reachability analysis.</p>
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
     * <ul>
     * <li>The <strong>CreateNetworkReachableAnalysis</strong> operation is used to create a task for analyzing the reachability of the network path that is created by calling the <strong>CreateNetworkPath</strong> operation and record the analysis results.</li>
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
     * <ul>
     * <li>The <strong>CreateNetworkReachableAnalysis</strong> operation is used to create a task for analyzing the reachability of the network path that is created by calling the <strong>CreateNetworkPath</strong> operation and record the analysis results.</li>
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
     * <p>Deletes an inspection report.</p>
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
     * <p>Deletes an inspection report.</p>
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
     * <p>Deletes an inspection task.</p>
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
     * <p>Deletes an inspection task.</p>
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
     * <p>Queries the instances of abnormal items identified in an inspection report.</p>
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
     * <p>Queries the instances of abnormal items identified in an inspection report.</p>
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
     * <p>Describes the details of check items in an inspection report.</p>
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
     * <p>Describes the details of check items in an inspection report.</p>
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
     * <p>Describes the status of an inspection report.</p>
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
     * <p>Describes the status of an inspection report.</p>
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
     * <p>Queries an inspection report summary.</p>
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
     * <p>Queries an inspection report summary.</p>
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
     * <p>Queries the details of an inspection task.</p>
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
     * <p>Queries the details of an inspection task.</p>
     * 
     * @param request DescribeNisInspectionTaskRequest
     * @return DescribeNisInspectionTaskResponse
     */
    public DescribeNisInspectionTaskResponse describeNisInspectionTask(DescribeNisInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNisInspectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><a href="https://www.alibabacloud.com/help/en/nis/product-overview/billing-method-new-version">Before using this operation, make sure that you fully understand the billing method and pricing of the NIS Traffic Analyzer.</a>
     * Supported analysis scenarios: </p>
     * <ul>
     * <li>All VPC network traffic analysis</li>
     * <li>Public VPC network traffic analysis</li>
     * <li>All TR network traffic analysis</li>
     * <li>Internet Shared Bandwidth metric analysis</li>
     * </ul>
     * <h2>VPC flow log - All VPC flow log query and analysis results</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionId</td>
     * <td>string</td>
     * <td>The region where the flow log resides.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>VpcId</td>
     * <td>string</td>
     * <td>The VPC ID.</td>
     * <td>vpc-m5ec6i0h5xss***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>VSwitchId</td>
     * <td>string</td>
     * <td>The vSwitch ID.</td>
     * <td>vsw-2zeekevlh****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NetworkInterfaceId</td>
     * <td>string</td>
     * <td>The elastic network interface (ENI) ID.</td>
     * <td>eni-8vbf2jxul***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>EcsId</td>
     * <td>string</td>
     * <td>The ECS instance ID of the management node.</td>
     * <td>i-uf6i1zi6yhq7h***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TrafficPath</td>
     * <td>string</td>
     * <td>The traffic path.</td>
     * <td>all</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the Alibaba Cloud network resource instance. Valid values:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● in: inbound traffic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● out: outbound traffic.</td>
     * <td>in</td>
     * <td>-in / -out</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceIp</td>
     * <td>string</td>
     * <td>The source IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>47.92.245.***</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourcePort</td>
     * <td>string</td>
     * <td>The source port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>5432</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationIp</td>
     * <td>string</td>
     * <td>The destination IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>192.168.***.0</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationPort</td>
     * <td>string</td>
     * <td>The destination port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>23</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Protocol</td>
     * <td>string</td>
     * <td>The network protocol.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>TCP</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Bytes</td>
     * <td>number</td>
     * <td>The bandwidth.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Packets</td>
     * <td>number</td>
     * <td>The number of packets.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RoundTripTime</td>
     * <td>number</td>
     * <td>The TCP RTT.</td>
     * <td>2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>BytesRate</td>
     * <td>number</td>
     * <td>The traffic ratio.</td>
     * <td>0.2</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <hr>
     * <h2>VPC flow log - Public VPC flow log query and analysis results</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionId</td>
     * <td>string</td>
     * <td>The region where the flow log resides.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>VpcId</td>
     * <td>string</td>
     * <td>The VPC ID.</td>
     * <td>vpc-m5ec6i0h5xss***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>VSwitchId</td>
     * <td>string</td>
     * <td>The vSwitch ID.</td>
     * <td>vsw-2zeekevlh****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NetworkInterfaceId</td>
     * <td>string</td>
     * <td>The elastic network interface (ENI) ID.</td>
     * <td>eni-8vbf2jxul***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>EcsId</td>
     * <td>string</td>
     * <td>The ECS instance ID of the management node.</td>
     * <td>i-uf6i1zi6yhq7h***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TrafficPath</td>
     * <td>string</td>
     * <td>The traffic path.</td>
     * <td>all</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the Alibaba Cloud network resource instance. Valid values:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● in: inbound traffic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● out: outbound traffic.</td>
     * <td>in</td>
     * <td>-in / -out</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceIp</td>
     * <td>string</td>
     * <td>The source IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>47.92.245.***</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourcePort</td>
     * <td>string</td>
     * <td>The source port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>5432</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationIp</td>
     * <td>string</td>
     * <td>The destination IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>192.168.***.0</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationPort</td>
     * <td>string</td>
     * <td>The destination port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>23</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Protocol</td>
     * <td>string</td>
     * <td>The network protocol.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>TCP</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>ClientCountry</td>
     * <td>string</td>
     * <td>The country of the client.</td>
     * <td>China</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>ClientProvince</td>
     * <td>string</td>
     * <td>The province of the client.</td>
     * <td>Hong Kong SAR</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>ClientCity</td>
     * <td>string</td>
     * <td>The city of the client.</td>
     * <td>Kowloon</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>ClientIsp</td>
     * <td>string</td>
     * <td>The network service provider.</td>
     * <td>Alibaba Cloud</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>ClientAsn</td>
     * <td>string</td>
     * <td>The autonomous system number.</td>
     * <td>45102</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Bytes</td>
     * <td>number</td>
     * <td>The bandwidth.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Packets</td>
     * <td>number</td>
     * <td>The number of packets.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RoundTripTime</td>
     * <td>number</td>
     * <td>The TCP RTT.</td>
     * <td>2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>BytesRate</td>
     * <td>number</td>
     * <td>The traffic ratio.</td>
     * <td>0.2</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <hr>
     * <h2>TR flow log - TR cross-region scenario analysis results.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the Alibaba Cloud network resource instance. Valid values:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● in: inbound traffic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● out: outbound traffic.</td>
     * <td>in</td>
     * <td>-in / -out</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceIp</td>
     * <td>string</td>
     * <td>The source IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>47.92.245.***</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourcePort</td>
     * <td>string</td>
     * <td>The source port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>5432</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationIp</td>
     * <td>string</td>
     * <td>The destination IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>192.168.***.0</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationPort</td>
     * <td>string</td>
     * <td>The destination port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>23</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Protocol</td>
     * <td>string</td>
     * <td>The network protocol.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>TCP</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Dscp</td>
     * <td>string</td>
     * <td>The Differentiated Services Code Point (DSCP) value.</td>
     * <td>0</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationRegionNo</td>
     * <td>string</td>
     * <td>The destination region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceRegionNo</td>
     * <td>string</td>
     * <td>The source region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterAttachmentId</td>
     * <td>string</td>
     * <td>The network instance connection ID.</td>
     * <td>tr-attach-bfde1cd4cj***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterId</td>
     * <td>string</td>
     * <td>The transit router instance ID.</td>
     * <td>tr-2zefvwy2fz3444***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterPairAttachmentId</td>
     * <td>string</td>
     * <td>The transit router peering connection instance ID.</td>
     * <td>tr-attach-okvj1cd4cjp***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Bytes</td>
     * <td>number</td>
     * <td>The bandwidth.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Packets</td>
     * <td>number</td>
     * <td>The number of packets.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>BytesRate</td>
     * <td>number</td>
     * <td>The traffic ratio.</td>
     * <td>0.2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostNoRoute</td>
     * <td>number</td>
     * <td>The number of packets dropped due to no route.</td>
     * <td>2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostBlackhole</td>
     * <td>number</td>
     * <td>The number of packets dropped due to blackhole routes.</td>
     * <td>4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostTTLExpired</td>
     * <td>number</td>
     * <td>The number of packets dropped due to TTL expiration.</td>
     * <td>7</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <hr>
     * <h2>TR flow log - VPC connection traffic scenario analysis results.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the Alibaba Cloud network resource instance. Valid values:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● in: inbound traffic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● out: outbound traffic.</td>
     * <td>in</td>
     * <td>-in / -out</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceIp</td>
     * <td>string</td>
     * <td>The source IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>47.92.245.***</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourcePort</td>
     * <td>string</td>
     * <td>The source port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>5432</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationIp</td>
     * <td>string</td>
     * <td>The destination IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>192.168.***.0</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationPort</td>
     * <td>string</td>
     * <td>The destination port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>23</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Protocol</td>
     * <td>string</td>
     * <td>The network protocol.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>TCP</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Dscp</td>
     * <td>string</td>
     * <td>The Differentiated Services Code Point (DSCP) value.</td>
     * <td>0</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationRegionNo</td>
     * <td>string</td>
     * <td>The destination region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceRegionNo</td>
     * <td>string</td>
     * <td>The source region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterAttachmentId</td>
     * <td>string</td>
     * <td>The network instance connection ID.</td>
     * <td>tr-attach-bfde1cd4cj***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterId</td>
     * <td>string</td>
     * <td>The transit router instance ID.</td>
     * <td>tr-2zefvwy2fz3444***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterPairAttachmentId</td>
     * <td>string</td>
     * <td>The transit router peering connection instance ID.</td>
     * <td>tr-attach-okvj1cd4cjp***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceResourceId</td>
     * <td>string</td>
     * <td>The source network instance ID.</td>
     * <td>tr-attach-hvve1cd4cjpj***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceAccountId</td>
     * <td>string</td>
     * <td>The account ID of the source network instance.</td>
     * <td>1906814138***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceVSwitchId</td>
     * <td>string</td>
     * <td>The vSwitch ID of the source TR ENI.</td>
     * <td>vsw-ikfdkevlhxpqxuz****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceNetworkInterface</td>
     * <td>string</td>
     * <td>The source TR ENI.</td>
     * <td>eni-8vbf2jxulma***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceAvailableZone</td>
     * <td>string</td>
     * <td>The source zone ID.</td>
     * <td>ap-southeast-1-j</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationResourceId</td>
     * <td>string</td>
     * <td>The destination network instance ID.</td>
     * <td>tr-attach-bfve1cd4cjp****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationAccountId</td>
     * <td>string</td>
     * <td>The account ID of the destination network instance.</td>
     * <td>1906814138***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationVSwitchId</td>
     * <td>string</td>
     * <td>The vSwitch ID of the destination TR ENI.</td>
     * <td>vsw-ikfdkevlhxpqxuz****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationNetworkInterface</td>
     * <td>string</td>
     * <td>The destination TR ENI.</td>
     * <td>eni-7kcf2jxulma***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationAvailableZone</td>
     * <td>string</td>
     * <td>The destination zone ID.</td>
     * <td>ap-southeast-1-j</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Bytes</td>
     * <td>number</td>
     * <td>The bandwidth.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Packets</td>
     * <td>number</td>
     * <td>The number of packets.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>BytesRate</td>
     * <td>number</td>
     * <td>The traffic ratio.</td>
     * <td>0.2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostNoRoute</td>
     * <td>number</td>
     * <td>The number of packets dropped due to no route.</td>
     * <td>2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostBlackhole</td>
     * <td>number</td>
     * <td>The number of packets dropped due to blackhole routes.</td>
     * <td>4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostTTLExpired</td>
     * <td>number</td>
     * <td>The number of packets dropped due to TTL expiration.</td>
     * <td>7</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <hr>
     * <h2>TR flow log - VBR traffic scenario analysis results.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the Alibaba Cloud network resource instance. Valid values:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● in: inbound traffic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● out: outbound traffic.</td>
     * <td>in</td>
     * <td>-in / -out</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceIp</td>
     * <td>string</td>
     * <td>The source IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>47.92.245.***</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourcePort</td>
     * <td>string</td>
     * <td>The source port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>5432</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationIp</td>
     * <td>string</td>
     * <td>The destination IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>192.168.***.0</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationPort</td>
     * <td>string</td>
     * <td>The destination port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>23</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Protocol</td>
     * <td>string</td>
     * <td>The network protocol.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>TCP</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Dscp</td>
     * <td>string</td>
     * <td>The Differentiated Services Code Point (DSCP) value.</td>
     * <td>0</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationRegionNo</td>
     * <td>string</td>
     * <td>The destination region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceRegionNo</td>
     * <td>string</td>
     * <td>The source region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterAttachmentId</td>
     * <td>string</td>
     * <td>The network instance connection ID.</td>
     * <td>tr-attach-bfde1cd4cj***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterId</td>
     * <td>string</td>
     * <td>The transit router instance ID.</td>
     * <td>tr-2zefvwy2fz3444***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterPairAttachmentId</td>
     * <td>string</td>
     * <td>The transit router peering connection instance ID.</td>
     * <td>tr-attach-okvj1cd4cjp***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceResourceId</td>
     * <td>string</td>
     * <td>The source network instance ID.</td>
     * <td>tr-attach-hvve1cd4cjpj***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceAccountId</td>
     * <td>string</td>
     * <td>The account ID of the source network instance.</td>
     * <td>1906814138***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationResourceId</td>
     * <td>string</td>
     * <td>The destination network instance ID.</td>
     * <td>tr-attach-bfve1cd4cjp****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationAccountId</td>
     * <td>string</td>
     * <td>The account ID of the destination network instance.</td>
     * <td>1906814138***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Bytes</td>
     * <td>number</td>
     * <td>The bandwidth.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Packets</td>
     * <td>number</td>
     * <td>The number of packets.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>BytesRate</td>
     * <td>number</td>
     * <td>The traffic ratio.</td>
     * <td>0.2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostNoRoute</td>
     * <td>number</td>
     * <td>The number of packets dropped due to no route.</td>
     * <td>2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostBlackhole</td>
     * <td>number</td>
     * <td>The number of packets dropped due to blackhole routes.</td>
     * <td>4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostTTLExpired</td>
     * <td>number</td>
     * <td>The number of packets dropped due to TTL expiration.</td>
     * <td>7</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <hr>
     * <h2>TR flow log - ECR traffic scenario analysis results.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of NIS traffic ranking analysis.</p>
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
     * <b>description</b> :
     * <p><a href="https://www.alibabacloud.com/help/en/nis/product-overview/billing-method-new-version">Before using this operation, make sure that you fully understand the billing method and pricing of the NIS Traffic Analyzer.</a>
     * Supported analysis scenarios: </p>
     * <ul>
     * <li>All VPC network traffic analysis</li>
     * <li>Public VPC network traffic analysis</li>
     * <li>All TR network traffic analysis</li>
     * <li>Internet Shared Bandwidth metric analysis</li>
     * </ul>
     * <h2>VPC flow log - All VPC flow log query and analysis results</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionId</td>
     * <td>string</td>
     * <td>The region where the flow log resides.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>VpcId</td>
     * <td>string</td>
     * <td>The VPC ID.</td>
     * <td>vpc-m5ec6i0h5xss***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>VSwitchId</td>
     * <td>string</td>
     * <td>The vSwitch ID.</td>
     * <td>vsw-2zeekevlh****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NetworkInterfaceId</td>
     * <td>string</td>
     * <td>The elastic network interface (ENI) ID.</td>
     * <td>eni-8vbf2jxul***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>EcsId</td>
     * <td>string</td>
     * <td>The ECS instance ID of the management node.</td>
     * <td>i-uf6i1zi6yhq7h***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TrafficPath</td>
     * <td>string</td>
     * <td>The traffic path.</td>
     * <td>all</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the Alibaba Cloud network resource instance. Valid values:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● in: inbound traffic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● out: outbound traffic.</td>
     * <td>in</td>
     * <td>-in / -out</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceIp</td>
     * <td>string</td>
     * <td>The source IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>47.92.245.***</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourcePort</td>
     * <td>string</td>
     * <td>The source port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>5432</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationIp</td>
     * <td>string</td>
     * <td>The destination IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>192.168.***.0</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationPort</td>
     * <td>string</td>
     * <td>The destination port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>23</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Protocol</td>
     * <td>string</td>
     * <td>The network protocol.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>TCP</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Bytes</td>
     * <td>number</td>
     * <td>The bandwidth.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Packets</td>
     * <td>number</td>
     * <td>The number of packets.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RoundTripTime</td>
     * <td>number</td>
     * <td>The TCP RTT.</td>
     * <td>2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>BytesRate</td>
     * <td>number</td>
     * <td>The traffic ratio.</td>
     * <td>0.2</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <hr>
     * <h2>VPC flow log - Public VPC flow log query and analysis results</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionId</td>
     * <td>string</td>
     * <td>The region where the flow log resides.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>VpcId</td>
     * <td>string</td>
     * <td>The VPC ID.</td>
     * <td>vpc-m5ec6i0h5xss***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>VSwitchId</td>
     * <td>string</td>
     * <td>The vSwitch ID.</td>
     * <td>vsw-2zeekevlh****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NetworkInterfaceId</td>
     * <td>string</td>
     * <td>The elastic network interface (ENI) ID.</td>
     * <td>eni-8vbf2jxul***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>EcsId</td>
     * <td>string</td>
     * <td>The ECS instance ID of the management node.</td>
     * <td>i-uf6i1zi6yhq7h***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TrafficPath</td>
     * <td>string</td>
     * <td>The traffic path.</td>
     * <td>all</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the Alibaba Cloud network resource instance. Valid values:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● in: inbound traffic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● out: outbound traffic.</td>
     * <td>in</td>
     * <td>-in / -out</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceIp</td>
     * <td>string</td>
     * <td>The source IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>47.92.245.***</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourcePort</td>
     * <td>string</td>
     * <td>The source port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>5432</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationIp</td>
     * <td>string</td>
     * <td>The destination IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>192.168.***.0</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationPort</td>
     * <td>string</td>
     * <td>The destination port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>23</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Protocol</td>
     * <td>string</td>
     * <td>The network protocol.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>TCP</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>ClientCountry</td>
     * <td>string</td>
     * <td>The country of the client.</td>
     * <td>China</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>ClientProvince</td>
     * <td>string</td>
     * <td>The province of the client.</td>
     * <td>Hong Kong SAR</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>ClientCity</td>
     * <td>string</td>
     * <td>The city of the client.</td>
     * <td>Kowloon</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>ClientIsp</td>
     * <td>string</td>
     * <td>The network service provider.</td>
     * <td>Alibaba Cloud</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>ClientAsn</td>
     * <td>string</td>
     * <td>The autonomous system number.</td>
     * <td>45102</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Bytes</td>
     * <td>number</td>
     * <td>The bandwidth.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Packets</td>
     * <td>number</td>
     * <td>The number of packets.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RoundTripTime</td>
     * <td>number</td>
     * <td>The TCP RTT.</td>
     * <td>2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>BytesRate</td>
     * <td>number</td>
     * <td>The traffic ratio.</td>
     * <td>0.2</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <hr>
     * <h2>TR flow log - TR cross-region scenario analysis results.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the Alibaba Cloud network resource instance. Valid values:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● in: inbound traffic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● out: outbound traffic.</td>
     * <td>in</td>
     * <td>-in / -out</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceIp</td>
     * <td>string</td>
     * <td>The source IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>47.92.245.***</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourcePort</td>
     * <td>string</td>
     * <td>The source port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>5432</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationIp</td>
     * <td>string</td>
     * <td>The destination IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>192.168.***.0</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationPort</td>
     * <td>string</td>
     * <td>The destination port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>23</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Protocol</td>
     * <td>string</td>
     * <td>The network protocol.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>TCP</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Dscp</td>
     * <td>string</td>
     * <td>The Differentiated Services Code Point (DSCP) value.</td>
     * <td>0</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationRegionNo</td>
     * <td>string</td>
     * <td>The destination region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceRegionNo</td>
     * <td>string</td>
     * <td>The source region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterAttachmentId</td>
     * <td>string</td>
     * <td>The network instance connection ID.</td>
     * <td>tr-attach-bfde1cd4cj***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterId</td>
     * <td>string</td>
     * <td>The transit router instance ID.</td>
     * <td>tr-2zefvwy2fz3444***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterPairAttachmentId</td>
     * <td>string</td>
     * <td>The transit router peering connection instance ID.</td>
     * <td>tr-attach-okvj1cd4cjp***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Bytes</td>
     * <td>number</td>
     * <td>The bandwidth.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Packets</td>
     * <td>number</td>
     * <td>The number of packets.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>BytesRate</td>
     * <td>number</td>
     * <td>The traffic ratio.</td>
     * <td>0.2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostNoRoute</td>
     * <td>number</td>
     * <td>The number of packets dropped due to no route.</td>
     * <td>2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostBlackhole</td>
     * <td>number</td>
     * <td>The number of packets dropped due to blackhole routes.</td>
     * <td>4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostTTLExpired</td>
     * <td>number</td>
     * <td>The number of packets dropped due to TTL expiration.</td>
     * <td>7</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <hr>
     * <h2>TR flow log - VPC connection traffic scenario analysis results.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the Alibaba Cloud network resource instance. Valid values:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● in: inbound traffic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● out: outbound traffic.</td>
     * <td>in</td>
     * <td>-in / -out</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceIp</td>
     * <td>string</td>
     * <td>The source IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>47.92.245.***</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourcePort</td>
     * <td>string</td>
     * <td>The source port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>5432</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationIp</td>
     * <td>string</td>
     * <td>The destination IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>192.168.***.0</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationPort</td>
     * <td>string</td>
     * <td>The destination port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>23</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Protocol</td>
     * <td>string</td>
     * <td>The network protocol.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>TCP</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Dscp</td>
     * <td>string</td>
     * <td>The Differentiated Services Code Point (DSCP) value.</td>
     * <td>0</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationRegionNo</td>
     * <td>string</td>
     * <td>The destination region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceRegionNo</td>
     * <td>string</td>
     * <td>The source region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterAttachmentId</td>
     * <td>string</td>
     * <td>The network instance connection ID.</td>
     * <td>tr-attach-bfde1cd4cj***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterId</td>
     * <td>string</td>
     * <td>The transit router instance ID.</td>
     * <td>tr-2zefvwy2fz3444***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterPairAttachmentId</td>
     * <td>string</td>
     * <td>The transit router peering connection instance ID.</td>
     * <td>tr-attach-okvj1cd4cjp***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceResourceId</td>
     * <td>string</td>
     * <td>The source network instance ID.</td>
     * <td>tr-attach-hvve1cd4cjpj***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceAccountId</td>
     * <td>string</td>
     * <td>The account ID of the source network instance.</td>
     * <td>1906814138***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceVSwitchId</td>
     * <td>string</td>
     * <td>The vSwitch ID of the source TR ENI.</td>
     * <td>vsw-ikfdkevlhxpqxuz****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceNetworkInterface</td>
     * <td>string</td>
     * <td>The source TR ENI.</td>
     * <td>eni-8vbf2jxulma***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceAvailableZone</td>
     * <td>string</td>
     * <td>The source zone ID.</td>
     * <td>ap-southeast-1-j</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationResourceId</td>
     * <td>string</td>
     * <td>The destination network instance ID.</td>
     * <td>tr-attach-bfve1cd4cjp****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationAccountId</td>
     * <td>string</td>
     * <td>The account ID of the destination network instance.</td>
     * <td>1906814138***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationVSwitchId</td>
     * <td>string</td>
     * <td>The vSwitch ID of the destination TR ENI.</td>
     * <td>vsw-ikfdkevlhxpqxuz****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationNetworkInterface</td>
     * <td>string</td>
     * <td>The destination TR ENI.</td>
     * <td>eni-7kcf2jxulma***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationAvailableZone</td>
     * <td>string</td>
     * <td>The destination zone ID.</td>
     * <td>ap-southeast-1-j</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Bytes</td>
     * <td>number</td>
     * <td>The bandwidth.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Packets</td>
     * <td>number</td>
     * <td>The number of packets.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>BytesRate</td>
     * <td>number</td>
     * <td>The traffic ratio.</td>
     * <td>0.2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostNoRoute</td>
     * <td>number</td>
     * <td>The number of packets dropped due to no route.</td>
     * <td>2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostBlackhole</td>
     * <td>number</td>
     * <td>The number of packets dropped due to blackhole routes.</td>
     * <td>4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostTTLExpired</td>
     * <td>number</td>
     * <td>The number of packets dropped due to TTL expiration.</td>
     * <td>7</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <hr>
     * <h2>TR flow log - VBR traffic scenario analysis results.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the Alibaba Cloud network resource instance. Valid values:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● in: inbound traffic.</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● out: outbound traffic.</td>
     * <td>in</td>
     * <td>-in / -out</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceIp</td>
     * <td>string</td>
     * <td>The source IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>47.92.245.***</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourcePort</td>
     * <td>string</td>
     * <td>The source port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>5432</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationIp</td>
     * <td>string</td>
     * <td>The destination IP address.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 2-tuple statistics are collected.</td>
     * <td>192.168.***.0</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationPort</td>
     * <td>string</td>
     * <td>The destination port.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>23</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Protocol</td>
     * <td>string</td>
     * <td>The network protocol.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● This field is returned only when 5-tuple statistics are collected.</td>
     * <td>TCP</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Dscp</td>
     * <td>string</td>
     * <td>The Differentiated Services Code Point (DSCP) value.</td>
     * <td>0</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>DestinationRegionNo</td>
     * <td>string</td>
     * <td>The destination region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>SourceRegionNo</td>
     * <td>string</td>
     * <td>The source region ID.</td>
     * <td>ap-southeast-1</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterAttachmentId</td>
     * <td>string</td>
     * <td>The network instance connection ID.</td>
     * <td>tr-attach-bfde1cd4cj***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterId</td>
     * <td>string</td>
     * <td>The transit router instance ID.</td>
     * <td>tr-2zefvwy2fz3444***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterPairAttachmentId</td>
     * <td>string</td>
     * <td>The transit router peering connection instance ID.</td>
     * <td>tr-attach-okvj1cd4cjp***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceResourceId</td>
     * <td>string</td>
     * <td>The source network instance ID.</td>
     * <td>tr-attach-hvve1cd4cjpj***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterSourceAccountId</td>
     * <td>string</td>
     * <td>The account ID of the source network instance.</td>
     * <td>1906814138***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationResourceId</td>
     * <td>string</td>
     * <td>The destination network instance ID.</td>
     * <td>tr-attach-bfve1cd4cjp****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TransitRouterDestinationAccountId</td>
     * <td>string</td>
     * <td>The account ID of the destination network instance.</td>
     * <td>1906814138***</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Bytes</td>
     * <td>number</td>
     * <td>The bandwidth.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Packets</td>
     * <td>number</td>
     * <td>The number of packets.</td>
     * <td>100</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>BytesRate</td>
     * <td>number</td>
     * <td>The traffic ratio.</td>
     * <td>0.2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostNoRoute</td>
     * <td>number</td>
     * <td>The number of packets dropped due to no route.</td>
     * <td>2</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostBlackhole</td>
     * <td>number</td>
     * <td>The number of packets dropped due to blackhole routes.</td>
     * <td>4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>PacketsLostTTLExpired</td>
     * <td>number</td>
     * <td>The number of packets dropped due to TTL expiration.</td>
     * <td>7</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <hr>
     * <h2>TR flow log - ECR traffic scenario analysis results.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>No</td>
     * <td>The paging token. Set this parameter to the NextToken value returned in the previous API call.</td>
     * <td>2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>No</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h3>Response parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>-</td>
     * <td>object</td>
     * <td>RpcResponse</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The ID of the network traffic analysis result.</td>
     * <td>task-7619ecb1db9148bab9f4</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Status</td>
     * <td>string</td>
     * <td>The task running status.</td>
     * <td>Complete</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>NextToken</td>
     * <td>string</td>
     * <td>The token for the next query.</td>
     * <td>LoeJLhK0fsDqYoXkXieZUqB2vWnccJtVnsyKu9KxFFOMQxtV8XckOg5lk7F2bhC+</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>MaxResults</td>
     * <td>integer</td>
     * <td>The paging size. Valid values: 1 to 100. Default value: 20.</td>
     * <td>20</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>TotalCount</td>
     * <td>integer</td>
     * <td>The total number of entries returned.</td>
     * <td>72</td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>FlowRankingList</td>
     * <td>array</td>
     * <td>The list of network traffic analysis results.</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <h4>FlowRankingList element structure</h4>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>The traffic direction based on the</td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of NIS traffic ranking analysis.</p>
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
     * <b>description</b> :
     * <p>Data query result synchronization:</p>
     * <ul>
     * <li>API data is synchronized every 6 hours. You can query current network analysis data only after 6 hours.
     * Supported analysis scenarios: </li>
     * <li>Internet performance observation dashboard scenario</li>
     * <li>Cross-zone internal network performance observation dashboard scenario</li>
     * <li>Cross-region internal network performance observation dashboard scenario</li>
     * </ul>
     * <h2>Internet performance observation dashboard scenario</h2>
     * <p><strong>Note</strong>
     * The maximum query time span is 24 hours. If not specified, the most recent 1 hour is queried by default. The query result contains one data point per minute.</p>
     * <h3><strong>Request parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionNo</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The Alibaba Cloud region where the probing source is located.</td>
     * </tr>
     * <tr>
     * <td>ResourceType</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>Set to <strong>InternetProbing</strong> to query Internet performance monitoring trends.</td>
     * </tr>
     * <tr>
     * <td>MetricName</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The metric for which to query trends. Valid value: <strong>rtt</strong>, the round-trip time of probing.</td>
     * </tr>
     * <tr>
     * <td>Dimensions</td>
     * <td>object[\]</td>
     * <td>Yes</td>
     * <td>The filter information.</td>
     * </tr>
     * <tr>
     * <td>\-Name</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The filter condition. Valid values:</td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><strong>Country</strong>: the probing country.</li>
     * <li><strong>Province</strong>: the probing province.</li>
     * <li><strong>Isp</strong>: the probing ISP.
     *  <strong>Note:</strong> Specify at least one of the preceding parameters. |
     * | \-Value | string | Yes | The filter value corresponding to the filter condition. Examples:</li>
     * <li>Country: China</li>
     * <li>Province: Zhejiang </li>
     * <li>Isp: Alibaba 
     * <strong>Note:</strong> Country and province values are capitalized. The ISP parameter value must match the name displayed in the console. |</li>
     * </ul>
     * <h3><strong>Response parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * </tr>
     * <tr>
     * <td>Data</td>
     * <td>object</td>
     * <td>The cloud network metric trends data object.</td>
     * </tr>
     * <tr>
     * <td>Metrics</td>
     * <td>array</td>
     * <td>The collection of metric trends data.</td>
     * </tr>
     * <tr>
     * <td>\-TimeStamp</td>
     * <td>long</td>
     * <td>The UNIX timestamp in milliseconds.</td>
     * </tr>
     * <tr>
     * <td>\-Value</td>
     * <td>double</td>
     * <td>The metric value corresponding to the <strong>MetricName</strong> input parameter.</td>
     * </tr>
     * <tr>
     * <td>Unit</td>
     * <td>String</td>
     * <td>The unit of <strong>Value</strong>.</td>
     * </tr>
     * </tbody></table>
     * <h2>Cross-zone internal network performance observation dashboard scenario</h2>
     * <p><strong>Note</strong></p>
     * <ul>
     * <li><p>If the query time span exceeds 5 days, the query result contains one data point per day.</p>
     * </li>
     * <li><p>If the query time span exceeds 1 day, the query result contains one data point per hour.</p>
     * </li>
     * <li><p>If the query time span is less than 1 day, the query result contains one data point per 5 minutes.</p>
     * </li>
     * </ul>
     * <h3><strong>Request parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionNo</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The Alibaba Cloud region.</td>
     * </tr>
     * <tr>
     * <td>ResourceType</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>Set to <strong>IntranetProbing</strong> to query cross-zone performance monitoring trends.</td>
     * </tr>
     * <tr>
     * <td>MetricName</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The metric for which to query trends. Valid value: <strong>rtt</strong>, the round-trip time of probing.</td>
     * </tr>
     * <tr>
     * <td>Dimensions</td>
     * <td>object[\]</td>
     * <td>Yes</td>
     * <td>The filter information.</td>
     * </tr>
     * <tr>
     * <td>\-Name</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The filter condition. Valid values:</td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><strong>SourceZone</strong>: the source zone for probing. This parameter is required.</li>
     * <li><strong>DestinationZone</strong>: the destination zone for probing. This parameter is required. |
     * | \-Value | string | Yes | The filter value corresponding to the filter condition. Examples:</li>
     * <li>SourceZone: cn-hangzhou-j</li>
     * <li>DestinationZone: cn-hangzhou-k |</li>
     * </ul>
     * <h3><strong>Response parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * </tr>
     * <tr>
     * <td>Data</td>
     * <td>object</td>
     * <td>The cloud network metric trends data object.</td>
     * </tr>
     * <tr>
     * <td>Metrics</td>
     * <td>array</td>
     * <td>The collection of metric trends data.</td>
     * </tr>
     * <tr>
     * <td>\-TimeStamp</td>
     * <td>long</td>
     * <td>The UNIX timestamp in milliseconds.</td>
     * </tr>
     * <tr>
     * <td>\-Value</td>
     * <td>double</td>
     * <td>The metric value corresponding to the <strong>MetricName</strong> input parameter.</td>
     * </tr>
     * <tr>
     * <td>Unit</td>
     * <td>String</td>
     * <td>The unit of <strong>Value</strong>.</td>
     * </tr>
     * </tbody></table>
     * <h2><strong>Cross-region internal network performance observation dashboard scenario</strong></h2>
     * <p><strong>Note</strong></p>
     * <ul>
     * <li><p>If the query time span exceeds 5 days, the query result contains one data point per day.</p>
     * </li>
     * <li><p>If the query time span exceeds 1 day, the query result contains one data point per hour.</p>
     * </li>
     * <li><p>If the query time span is less than 1 day, the query result contains one data point per 5 minutes.</p>
     * </li>
     * </ul>
     * <h3><strong>Request parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionNo</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The Alibaba Cloud region.</td>
     * </tr>
     * <tr>
     * <td>ResourceType</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>Set to <strong>IntranetProbing</strong> to query cross-region performance observation rankings.</td>
     * </tr>
     * <tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The probing direction. Valid values:</td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><strong>in</strong>: probing with RegionNo as the destination.</li>
     * <li><strong>out</strong>: probing with RegionNo as the source. |
     * | MetricName | string | Yes | The metric for which to query trends. Valid value: <strong>rtt</strong>, the round-trip time of probing. |
     * | Dimensions | object[\] | No | The filter information. |
     * | \-Name | string | No | The filter condition. Valid value: <strong>DestinationRegionNo</strong>, the destination region for probing. This parameter is required. |
     * | \-Value | string | No | The destination region ID. Example: DestinationRegionNo: cn-shenzhen |</li>
     * </ul>
     * <h3><strong>Response parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * </tr>
     * <tr>
     * <td>Data</td>
     * <td>object</td>
     * <td>The cloud network metric trends data object.</td>
     * </tr>
     * <tr>
     * <td>Metrics</td>
     * <td>array</td>
     * <td>The collection of metric trends data.</td>
     * </tr>
     * <tr>
     * <td>\-TimeStamp</td>
     * <td>long</td>
     * <td>The UNIX timestamp in milliseconds.</td>
     * </tr>
     * <tr>
     * <td>\-Value</td>
     * <td>double</td>
     * <td>The metric value corresponding to the <strong>MetricName</strong> input parameter.</td>
     * </tr>
     * <tr>
     * <td>Unit</td>
     * <td>String</td>
     * <td>The unit of <strong>Value</strong>.</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Retrieves detailed monitoring metric trends data for a specified NIS network analysis scenario, including traffic metric trends for network traffic analysis scenarios and performance metric trends for performance observation scenarios.</p>
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
     * <b>description</b> :
     * <p>Data query result synchronization:</p>
     * <ul>
     * <li>API data is synchronized every 6 hours. You can query current network analysis data only after 6 hours.
     * Supported analysis scenarios: </li>
     * <li>Internet performance observation dashboard scenario</li>
     * <li>Cross-zone internal network performance observation dashboard scenario</li>
     * <li>Cross-region internal network performance observation dashboard scenario</li>
     * </ul>
     * <h2>Internet performance observation dashboard scenario</h2>
     * <p><strong>Note</strong>
     * The maximum query time span is 24 hours. If not specified, the most recent 1 hour is queried by default. The query result contains one data point per minute.</p>
     * <h3><strong>Request parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionNo</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The Alibaba Cloud region where the probing source is located.</td>
     * </tr>
     * <tr>
     * <td>ResourceType</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>Set to <strong>InternetProbing</strong> to query Internet performance monitoring trends.</td>
     * </tr>
     * <tr>
     * <td>MetricName</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The metric for which to query trends. Valid value: <strong>rtt</strong>, the round-trip time of probing.</td>
     * </tr>
     * <tr>
     * <td>Dimensions</td>
     * <td>object[\]</td>
     * <td>Yes</td>
     * <td>The filter information.</td>
     * </tr>
     * <tr>
     * <td>\-Name</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The filter condition. Valid values:</td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><strong>Country</strong>: the probing country.</li>
     * <li><strong>Province</strong>: the probing province.</li>
     * <li><strong>Isp</strong>: the probing ISP.
     *  <strong>Note:</strong> Specify at least one of the preceding parameters. |
     * | \-Value | string | Yes | The filter value corresponding to the filter condition. Examples:</li>
     * <li>Country: China</li>
     * <li>Province: Zhejiang </li>
     * <li>Isp: Alibaba 
     * <strong>Note:</strong> Country and province values are capitalized. The ISP parameter value must match the name displayed in the console. |</li>
     * </ul>
     * <h3><strong>Response parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * </tr>
     * <tr>
     * <td>Data</td>
     * <td>object</td>
     * <td>The cloud network metric trends data object.</td>
     * </tr>
     * <tr>
     * <td>Metrics</td>
     * <td>array</td>
     * <td>The collection of metric trends data.</td>
     * </tr>
     * <tr>
     * <td>\-TimeStamp</td>
     * <td>long</td>
     * <td>The UNIX timestamp in milliseconds.</td>
     * </tr>
     * <tr>
     * <td>\-Value</td>
     * <td>double</td>
     * <td>The metric value corresponding to the <strong>MetricName</strong> input parameter.</td>
     * </tr>
     * <tr>
     * <td>Unit</td>
     * <td>String</td>
     * <td>The unit of <strong>Value</strong>.</td>
     * </tr>
     * </tbody></table>
     * <h2>Cross-zone internal network performance observation dashboard scenario</h2>
     * <p><strong>Note</strong></p>
     * <ul>
     * <li><p>If the query time span exceeds 5 days, the query result contains one data point per day.</p>
     * </li>
     * <li><p>If the query time span exceeds 1 day, the query result contains one data point per hour.</p>
     * </li>
     * <li><p>If the query time span is less than 1 day, the query result contains one data point per 5 minutes.</p>
     * </li>
     * </ul>
     * <h3><strong>Request parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionNo</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The Alibaba Cloud region.</td>
     * </tr>
     * <tr>
     * <td>ResourceType</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>Set to <strong>IntranetProbing</strong> to query cross-zone performance monitoring trends.</td>
     * </tr>
     * <tr>
     * <td>MetricName</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The metric for which to query trends. Valid value: <strong>rtt</strong>, the round-trip time of probing.</td>
     * </tr>
     * <tr>
     * <td>Dimensions</td>
     * <td>object[\]</td>
     * <td>Yes</td>
     * <td>The filter information.</td>
     * </tr>
     * <tr>
     * <td>\-Name</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The filter condition. Valid values:</td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><strong>SourceZone</strong>: the source zone for probing. This parameter is required.</li>
     * <li><strong>DestinationZone</strong>: the destination zone for probing. This parameter is required. |
     * | \-Value | string | Yes | The filter value corresponding to the filter condition. Examples:</li>
     * <li>SourceZone: cn-hangzhou-j</li>
     * <li>DestinationZone: cn-hangzhou-k |</li>
     * </ul>
     * <h3><strong>Response parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * </tr>
     * <tr>
     * <td>Data</td>
     * <td>object</td>
     * <td>The cloud network metric trends data object.</td>
     * </tr>
     * <tr>
     * <td>Metrics</td>
     * <td>array</td>
     * <td>The collection of metric trends data.</td>
     * </tr>
     * <tr>
     * <td>\-TimeStamp</td>
     * <td>long</td>
     * <td>The UNIX timestamp in milliseconds.</td>
     * </tr>
     * <tr>
     * <td>\-Value</td>
     * <td>double</td>
     * <td>The metric value corresponding to the <strong>MetricName</strong> input parameter.</td>
     * </tr>
     * <tr>
     * <td>Unit</td>
     * <td>String</td>
     * <td>The unit of <strong>Value</strong>.</td>
     * </tr>
     * </tbody></table>
     * <h2><strong>Cross-region internal network performance observation dashboard scenario</strong></h2>
     * <p><strong>Note</strong></p>
     * <ul>
     * <li><p>If the query time span exceeds 5 days, the query result contains one data point per day.</p>
     * </li>
     * <li><p>If the query time span exceeds 1 day, the query result contains one data point per hour.</p>
     * </li>
     * <li><p>If the query time span is less than 1 day, the query result contains one data point per 5 minutes.</p>
     * </li>
     * </ul>
     * <h3><strong>Request parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Required</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionNo</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The Alibaba Cloud region.</td>
     * </tr>
     * <tr>
     * <td>ResourceType</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>Set to <strong>IntranetProbing</strong> to query cross-region performance observation rankings.</td>
     * </tr>
     * <tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The probing direction. Valid values:</td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li><strong>in</strong>: probing with RegionNo as the destination.</li>
     * <li><strong>out</strong>: probing with RegionNo as the source. |
     * | MetricName | string | Yes | The metric for which to query trends. Valid value: <strong>rtt</strong>, the round-trip time of probing. |
     * | Dimensions | object[\] | No | The filter information. |
     * | \-Name | string | No | The filter condition. Valid value: <strong>DestinationRegionNo</strong>, the destination region for probing. This parameter is required. |
     * | \-Value | string | No | The destination region ID. Example: DestinationRegionNo: cn-shenzhen |</li>
     * </ul>
     * <h3><strong>Response parameters</strong></h3>
     * <table>
     * <thead>
     * <tr>
     * <th><strong>Name</strong></th>
     * <th><strong>Type</strong></th>
     * <th><strong>Description</strong></th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * </tr>
     * <tr>
     * <td>Data</td>
     * <td>object</td>
     * <td>The cloud network metric trends data object.</td>
     * </tr>
     * <tr>
     * <td>Metrics</td>
     * <td>array</td>
     * <td>The collection of metric trends data.</td>
     * </tr>
     * <tr>
     * <td>\-TimeStamp</td>
     * <td>long</td>
     * <td>The UNIX timestamp in milliseconds.</td>
     * </tr>
     * <tr>
     * <td>\-Value</td>
     * <td>double</td>
     * <td>The metric value corresponding to the <strong>MetricName</strong> input parameter.</td>
     * </tr>
     * <tr>
     * <td>Unit</td>
     * <td>String</td>
     * <td>The unit of <strong>Value</strong>.</td>
     * </tr>
     * </tbody></table>
     * 
     * <b>summary</b> : 
     * <p>Retrieves detailed monitoring metric trends data for a specified NIS network analysis scenario, including traffic metric trends for network traffic analysis scenarios and performance metric trends for performance observation scenarios.</p>
     * 
     * @param request GetNisNetworkMetricsRequest
     * @return GetNisNetworkMetricsResponse
     */
    public GetNisNetworkMetricsResponse getNisNetworkMetrics(GetNisNetworkMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNisNetworkMetricsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Supported analysis scenarios:</p>
     * <h2>Internet performance observation dashboard scenario.</h2>
     * <h3><strong>Request parameters</strong></h3>
     * <h3><strong>Response parameters</strong></h3>
     * <h2>Cross-zone internal network performance observation dashboard scenario.</h2>
     * <h3><strong>Request parameters</strong></h3>
     * <h3><strong>Response parameters</strong></h3>
     * <h2><strong>Cross-region internal network performance observation dashboard scenario</strong></h2>
     * <h3><strong>Request parameters</strong></h3>
     * <h3><strong>Response parameters</strong></h3>
     * 
     * <b>summary</b> : 
     * <p>Supports ranking analysis of traffic flowing through different cloud network resources by using sorting algorithms and data processing capabilities, and sorts detection metrics of Alibaba Cloud performance observation to help you quickly identify network bottlenecks, optimize resource configurations, and improve overall network performance.</p>
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
     * <b>description</b> :
     * <p>Supported analysis scenarios:</p>
     * <h2>Internet performance observation dashboard scenario.</h2>
     * <h3><strong>Request parameters</strong></h3>
     * <h3><strong>Response parameters</strong></h3>
     * <h2>Cross-zone internal network performance observation dashboard scenario.</h2>
     * <h3><strong>Request parameters</strong></h3>
     * <h3><strong>Response parameters</strong></h3>
     * <h2><strong>Cross-region internal network performance observation dashboard scenario</strong></h2>
     * <h3><strong>Request parameters</strong></h3>
     * <h3><strong>Response parameters</strong></h3>
     * 
     * <b>summary</b> : 
     * <p>Supports ranking analysis of traffic flowing through different cloud network resources by using sorting algorithms and data processing capabilities, and sorts detection metrics of Alibaba Cloud performance observation to help you quickly identify network bottlenecks, optimize resource configurations, and improve overall network performance.</p>
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
     * <p>Retrieves the metric trends for network traffic analysis.</p>
     * 
     * @param tmpReq GetNisTrafficMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNisTrafficMetricsResponse
     */
    public GetNisTrafficMetricsResponse getNisTrafficMetricsWithOptions(GetNisTrafficMetricsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetNisTrafficMetricsShrinkRequest request = new GetNisTrafficMetricsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "Filter", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            query.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanBy)) {
            query.put("ScanBy", request.scanBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stepMinutes)) {
            query.put("StepMinutes", request.stepMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageInterval)) {
            query.put("StorageInterval", request.storageInterval);
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
            new TeaPair("action", "GetNisTrafficMetrics"),
            new TeaPair("version", "2021-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNisTrafficMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the metric trends for network traffic analysis.</p>
     * 
     * @param request GetNisTrafficMetricsRequest
     * @return GetNisTrafficMetricsResponse
     */
    public GetNisTrafficMetricsResponse getNisTrafficMetrics(GetNisTrafficMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNisTrafficMetricsWithOptions(request, runtime);
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
     * <p>Lists the resource types available for inspection.</p>
     * 
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
     * <p>Lists the resource types available for inspection.</p>
     * @return ListNisInspectionResourceTypeResponse
     */
    public ListNisInspectionResourceTypeResponse listNisInspectionResourceType() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNisInspectionResourceTypeWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of inspection task reports.</p>
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
     * <p>Queries a list of inspection task reports.</p>
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
     * <p>Lists the network inspection tasks.</p>
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
     * <p>Lists the network inspection tasks.</p>
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
     * <p>Starts an inspection task to generate an inspection report.</p>
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
     * <p>Starts an inspection task to generate an inspection report.</p>
     * 
     * @param request StartNisInspectionTaskRequest
     * @return StartNisInspectionTaskResponse
     */
    public StartNisInspectionTaskResponse startNisInspectionTask(StartNisInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startNisInspectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><a href="https://www.alibabacloud.com/help/en/nis/product-overview/billing-method-new-version">Before using this operation, make sure that you fully understand the billing method and pricing of the NIS traffic analyzer.</a>
     * Before using this operation, create a traffic analyzer and add a data source.
     * <a href="https://www.alibabacloud.com/help/en/nis/user-guide/traffic-analyzer-management#39d1693bce6yp">Create a traffic analyzer</a>
     * <a href="https://www.alibabacloud.com/help/en/nis/user-guide/data-source-management#73845748bfstv">Add a data source</a>
     * Supported analysis scenarios: </p>
     * <ul>
     * <li>All VPC network traffic analysis</li>
     * <li>Internet VPC network traffic analysis</li>
     * <li>All TR network traffic analysis</li>
     * <li>Internet Shared Bandwidth metric analysis</li>
     * </ul>
     * <h2>All VPC flow log analysis.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionNo</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The region where the resource resides.</td>
     * <td>cn-shanghai</td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>TrafficAnalyzerId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The traffic analyzer ID.</td>
     * <td>nta-262****ca07f</td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>TrafficScenario</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The supported analysis scenario:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● All VPC flow log analysis</td>
     * <td>Fixed value: VpcFlowLogAll</td>
     * <td>VpcFlowLogAll</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The network traffic direction based on Alibaba Cloud resources. ● In: Traffic flowing into the elastic network interface (ENI).</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● Out: Traffic flowing out of the elastic network interface (ENI).</td>
     * <td>In</td>
     * <td>- In</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li>Out                                                                                                                                                                                                                                                                                                                                                                                                                                            |
     * | TupleDimension    | string   | Yes   | The traffic storage aggregation dimension.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Tuple1                 | - Tuple1 </li>
     * <li>Tuple2 </li>
     * <li>Tuple5                                                                                                                                                                                                                                                                                                                                                                                                                              |
     * | GroupBy           | array    | No   | Specifies multiple traffic dimensions for aggregation and sorting.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |  | -                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
     * |                   | string   | No   | Based on the TupleDimension field, you can specify the following aggregation dimensions:</li>
     * </ul>
     * <p>● When TupleDimension = Tuple1:
     * 　■  VpcId: VPC ID
     * 　■  VSwitchId: vSwitch ID
     * 　■  NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■  EcsId: ECS instance ID
     * 　■  CloudIp: Cloud IP
     * ● When TupleDimension = Tuple2:
     * 　■ VpcId: VPC ID
     * 　■ VSwitchId: vSwitch ID
     * 　■ NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■ EcsId: ECS instance ID
     * 　■ SourceIp: Source IP
     * 　■ DestinationIp: Destination IP
     * 　■ TrafficPath: Traffic path
     * ● When TupleDimension = Tuple5:
     * 　■ VpcId: VPC ID
     * 　■ VSwitchId: vSwitch ID
     * 　■ NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■ EcsId: ECS instance ID
     * 　■ SourceIp: Source IP
     * 　■ DestinationIp: Destination IP
     * 　■ TrafficPath: Traffic path
     * 　■ SourcePort: Source port
     * 　■ DestinationPort: Destination port
     * 　■ Protocol: Network protocol | [&quot;VpcId&quot;]                                | - VpcId</p>
     * <ul>
     * <li>VSwitchId</li>
     * <li>CloudIp</li>
     * <li>SourceIp</li>
     * <li>DestinationIp</li>
     * <li>Protocol</li>
     * <li>SourcePort</li>
     * <li>DestinationPort</li>
     * <li>TrafficPath</li>
     * <li>Country</li>
     * <li>Province</li>
     * <li>City</li>
     * <li>Isp</li>
     * <li>Asn                                                                                                                                                                                                                                          |
     * | OrderBy           | string   | Yes   | Based on the TrafficScenario field, the following traffic metrics are supported for sorting:
     * TrafficScenario = VpcFlowLogAll / VpcFlowLogInternet (VPC flow log scenario):
     * ● Bytes: Bandwidth
     * ● Packets: Packet count
     * ● RoundTripTime: TCP RTT                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Bytes                                    | - Bytes</li>
     * <li>Packets</li>
     * <li>RoundTripTime                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * | Filter            | array    | No   | Specifies additional filter conditions for focused traffic analysis.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |                                          | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * |                   | object   | No   | The filter condition for traffic, a Key-Value-Operator object.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |                                          | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |</li>
     * </ul>
     * <p>| key               | string   | No   | The supported filter condition label keys are as follows:</p>
     * <ul>
     * <li>When <code>TupleDimension</code> is 1-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (<strong>required</strong>, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>CloudIp</code>: Cloud IP (the corresponding value supports multiple selections)</li>
     * <li>When <code>TupleDimension</code> is 2-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (<strong>required</strong>, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>SourceIp</code>: Source IP (the corresponding value supports multiple selections)
     * 　- <code>DestinationIp</code>: Destination IP (the corresponding value supports multiple selections)
     * 　- <code>TrafficPath</code>: Traffic path (the corresponding value supports multiple selections)</li>
     * <li>When <code>TupleDimension</code> is 5-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (<strong>required</strong>, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>SourceIp</code>: Source IP
     * 　- <code>DestinationIp</code>: Destination IP
     * 　- <code>TrafficPath</code>: Traffic path (the corresponding value supports multiple selections)
     * 　- <code>SourcePort</code>: Source port (the corresponding value supports multiple selections)
     * 　- <code>DestinationPort</code>: Destination port (the corresponding value supports multiple selections)
     * 　- <code>Protocol</code>: Network protocol (the corresponding value supports multiple selections)</li>
     * <li>In VPC scenarios, you can also filter by traffic metrics:
     * 　- <code>MinBytes</code>: The minimum traffic volume for sorting, in bytes (the corresponding value does not support multiple selections)
     * 　- <code>MaxBytes</code>: The maximum traffic volume for sorting, in bytes (the corresponding value does not support multiple selections)
     * 　- <code>MinRoundTripTime</code>: The minimum RTT for sorting, in ms (the corresponding value does not support multiple selections)
     * 　- <code>MaxRoundTripTime</code>: The maximum RTT for sorting, in ms (the corresponding value does not support multiple selections)
     * 　- <code>MinPackages</code>: The minimum packet count for sorting (the corresponding value does not support multiple selections)
     * 　- <code>MaxPackages</code>: The maximum packet count for sorting (the corresponding value does not support multiple selections) | FlowAction                               | - FlowAction</li>
     * <li>VpcId</li>
     * <li>VSwitchId</li>
     * <li>NetworkInterfaceId</li>
     * <li>CloudIp</li>
     * <li>DestinationIp</li>
     * <li>SourceIp</li>
     * <li>EcsId</li>
     * <li>TrafficPath</li>
     * <li>SourcePort</li>
     * <li>DestinationPort</li>
     * <li>Protocol</li>
     * <li>MinBytes</li>
     * <li>MaxBytes</li>
     * <li>MinRoundTripTime</li>
     * <li>MaxRoundTripTime</li>
     * <li>MinPackages</li>
     * <li>MaxPackages                                                                                                                |
     * | value             | array    | No   | The filter condition values.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                          | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * |                   | string   | No   | The filter value corresponding to the specified key type.</li>
     * </ul>
     * <p>When the key is <code>FlowAction</code>, the valid values are:
     * 　- <code>ACCEPT</code> (default: <code>Accept</code>): Traffic allowed by security groups and network ACLs
     * 　- <code>REJECT</code>: Traffic denied by security groups and network ACLs                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Accept                                   | When the key is FlowAction: ACCEPT / REJECT                                                                                                                                                                                                                                                                                                                                                              |
     * | Operator          | string   | No   | For specified key types, some support operators for character string matching on the passed value. The supported values are as follows (default: in):
     * ● in: Equals
     * ● not in: Not equals
     * ● like: Contains
     * Based on the TupleDimension and TrafficScenario fields, the support for <code>like</code> is as follows:
     * TrafficScenario = VpcFlowLogAll / VpcFlowLogInternet (VPC flow log scenario):
     * The following keys support <code>like</code>:
     * 　○ CloudIp
     * 　○ SourceIp
     * 　○ DestinationIp
     * All other keys support only <code>in</code> and <code>not in</code> operators.                                                                                                                                                                                                                                                                                                                                                                                                                           | in                                       | - not in</p>
     * <ul>
     * <li>in</li>
     * <li>like                                                                                                                                                                                                                                                                                                                                                                                                                                   |
     * | BeginTime         | long     | Yes   | The start time of the query as a millisecond UNIX timestamp.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | 1638239092000                            | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * | EndTime           | long     | Yes   | The end time of the query as a millisecond UNIX timestamp.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | 1684373700099                            | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * | Sort              | string   | No   | The sorting order for traffic analysis:
     * ● ASC: Ascending order.
     * ● DESC: Descending order.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Desc                                     | - Desc</li>
     * <li>Asc                                                                                                                                                                                                                                                                                                                                                                                                                                           |
     * | TopN              | integer  | No   | The number of entries to return for the traffic sorting query.
     * You can specify a custom number. If this field is not specified, all traffic data that meets the specified conditions is sorted and analyzed within the performance limits of traffic analysis data.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | 10                                       | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * | Language          | string   | No   | The language. Valid values: zh-CN, en-US.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | zh-CN                                    | - zh-CN</li>
     * <li>en-US                                                                                                                                                                                                                                                                                                                                                                                                                                        |
     * | NextToken         | string   | No   | The pagination token. Leave this parameter empty for the first query or when no more results are available. If more results exist, set this to the NextToken value returned by the previous API call.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | 2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+ | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * | MaxResults        | integer  | No   | The page size. Valid values: 1 to 100. Default value: 20.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | 20                                       |                                                                                                                                                                                                                                                                                                                                                                                                                                         |
     * | StorageInterval   | integer  | No   | The storage bucket granularity property.
     * The storage bucket granularity specifies the storage aggregation period for the query. Two granularity levels are supported: high-precision (such as 1 minute) and long-period (such as 1 day). The specific granularity is determined by the traffic analysis sampling interval configured for high-precision or long-period traffic statistics when creating or editing the traffic analyzer.</li>
     * <li>The supported storage granularity values for the traffic analyzer tuple are:
     * 　- <code>1</code>: In minutes (1 minute)
     * 　- <code>10</code>: In minutes (10 minutes)
     * 　- <code>60</code>: In minutes (60 minutes, i.e., 1 hour)
     * 　- <code>1440</code>: In minutes (1440 minutes, i.e., 1 day)</li>
     * <li>The storage bucket granularity serves two typical purposes:
     * 　- High-precision traffic statistics: such as 1-minute, 10-minute, or 60-minute aggregation
     * 　- Long-period traffic statistics: such as 1440-minute (1-day) aggregation</li>
     * <li>Specify this field during the query to select the storage aggregation period. For example:
     * 　- Pass <code>10</code>: Query short-period data aggregated at 10-minute granularity
     * 　- Pass <code>1440</code>: Query long-period data aggregated at 1-day granularity | 10                                       | - 1</li>
     * <li>10</li>
     * <li>60</li>
     * <li>1440                                                                                                                                                                                                                                                                                                                                                                                                                                   |</li>
     * </ul>
     * <h3>Response elements</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example value</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td></td>
     * <td>object</td>
     * <td>RpcResponse <ArrayList></td>
     * <td></td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The result ID of this traffic ranking analysis. Call the DescribeNisTrafficRanking operation to obtain the final analysis results.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td>-</td>
     * </tr>
     * </tbody></table>
     * <h2>Internet VPC flow log analysis.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionNo</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The region where the resource resides.</td>
     * <td>cn-shanghai</td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>TrafficAnalyzerId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The traffic analyzer ID.</td>
     * <td>nta-262****ca07f</td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>TrafficScenario</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The supported analysis scenario:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● Internet VPC flow log analysis</td>
     * <td>Fixed value: VpcFlowLogInternet</td>
     * <td>VpcFlowLogInternet</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The network traffic direction based on Alibaba Cloud resources. ● In: Traffic flowing into the elastic network interfaces (ENIs).</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● Out: Traffic flowing out of the elastic network interfaces (ENIs).</td>
     * <td>In</td>
     * <td>- In</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li>Out                                                                                                                                                                                                                                                                                                      |
     * | TupleDimension    | string  | Yes   | The traffic storage aggregation dimension.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Tuple1                                   | - Tuple1</li>
     * <li>Tuple2</li>
     * <li>Tuple5                                                                                                                                                                                                                                                                                    |
     * | GroupBy           | array   | No   | Specifies multiple traffic dimensions for aggregation and sorting.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                          | -                                                                                                                                                                                                                                                                                                                |
     * |                   | string  | No   | Based on the TupleDimension field, you can specify the following aggregation dimensions:</li>
     * </ul>
     * <p>● When TupleDimension = Tuple1:
     * 　■ VpcId: VPC ID
     * 　■ VSwitchId: vSwitch ID
     * 　■ NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■ EcsId: ECS instance ID
     * 　■ CloudIp: Cloud IP
     * ● When TupleDimension = Tuple2:
     * 　■ VpcId: VPC ID
     * 　■ VSwitchId: vSwitch ID
     * 　■ NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■ EcsId: ECS instance ID
     * 　■ SourceIp: Source IP
     * 　■ DestinationIp: Destination IP
     * 　■ TrafficPath: Traffic path
     * 　■ <code>Country</code>: Client country
     * 　■ <code>Province</code>: Client province
     * 　■ <code>City</code>: Client city
     * 　■ <code>Isp</code>: Internet service provider
     * 　■ <code>Asn</code>: Autonomous system number
     * ● When TupleDimension = Tuple5:
     * 　■ VpcId: VPC ID
     * 　■ VSwitchId: vSwitch ID
     * 　■ NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■ EcsId: ECS instance ID
     * 　■ SourceIp: Source IP
     * 　■ DestinationIp: Destination IP
     * 　■ TrafficPath: Traffic path
     * 　■ SourcePort: Source port
     * 　■ DestinationPort: Destination port
     * 　■ Protocol: Network protocol
     * 　■ Country: Client country
     * 　■ Province: Client province
     * 　■ City: Client city
     * 　■ Isp: Internet service provider
     * 　■ Asn: Autonomous system number | [&quot;VpcId&quot;]                                | - VpcId</p>
     * <ul>
     * <li>VSwitchId</li>
     * <li>CloudIp</li>
     * <li>SourceIp</li>
     * <li>DestinationIp</li>
     * <li>Protocol</li>
     * <li>SourcePort</li>
     * <li>DestinationPort</li>
     * <li>TrafficPath</li>
     * <li>Country</li>
     * <li>Province</li>
     * <li>City</li>
     * <li>Isp</li>
     * <li>Asn                                                                                         |
     * | OrderBy           | string  | Yes   | The following traffic metrics are supported for sorting: Bytes, Packets, RoundTripTime.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Bytes                                    | - Bytes</li>
     * <li>Packets</li>
     * <li>RoundTripTime                                                                                                                                                                                                                                                                         |
     * | Filter            | array   | No   | Specifies additional filter conditions for focused traffic analysis.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |                                          | -                                                                                                                                                                                                                                                                                                                |
     * |                   | object  | No   | The filter condition for traffic, a Key-Value-Operator object.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |                                          | -                                                                                                                                                                                                                                                                                                                |</li>
     * </ul>
     * <p>| key               | string  | No   | The supported filter condition label keys are as follows:</p>
     * <ul>
     * <li>When <code>TupleDimension</code> is 1-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (required, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>CloudIp</code>: Cloud IP (the corresponding value supports multiple selections)</li>
     * <li>When <code>TupleDimension</code> is 2-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (required, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>SourceIp</code>: Source IP (the corresponding value supports multiple selections)
     * 　- <code>DestinationIp</code>: Destination IP (the corresponding value supports multiple selections)
     * 　- <code>TrafficPath</code>: Traffic path (the corresponding value supports multiple selections)
     * 　- <code>ClientCountry</code>: Filter traffic analysis scope by country (the corresponding value supports multiple selections)
     * 　- <code>ClientCity</code>: Filter traffic analysis scope by city (the corresponding value supports multiple selections)
     * 　- <code>ClientAsn</code>: Filter traffic analysis scope by ASN (the corresponding value supports multiple selections)
     * 　- <code>ClientIsp</code>: Filter traffic analysis scope by client ISP (the corresponding value supports multiple selections)</li>
     * <li>When <code>TupleDimension</code> is 5-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (required, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>SourceIp</code>: Source IP
     * 　- <code>DestinationIp</code>: Destination IP
     * 　- <code>TrafficPath</code>: Traffic path (the corresponding value supports multiple selections)
     * 　- <code>SourcePort</code>: Source port (the corresponding value supports multiple selections)
     * 　- <code>DestinationPort</code>: Destination port (the corresponding value supports multiple selections)</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Triggers the NIS traffic analyzer to execute a traffic sorting task within a specified scope.</p>
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
     * <b>description</b> :
     * <p><a href="https://www.alibabacloud.com/help/en/nis/product-overview/billing-method-new-version">Before using this operation, make sure that you fully understand the billing method and pricing of the NIS traffic analyzer.</a>
     * Before using this operation, create a traffic analyzer and add a data source.
     * <a href="https://www.alibabacloud.com/help/en/nis/user-guide/traffic-analyzer-management#39d1693bce6yp">Create a traffic analyzer</a>
     * <a href="https://www.alibabacloud.com/help/en/nis/user-guide/data-source-management#73845748bfstv">Add a data source</a>
     * Supported analysis scenarios: </p>
     * <ul>
     * <li>All VPC network traffic analysis</li>
     * <li>Internet VPC network traffic analysis</li>
     * <li>All TR network traffic analysis</li>
     * <li>Internet Shared Bandwidth metric analysis</li>
     * </ul>
     * <h2>All VPC flow log analysis.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionNo</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The region where the resource resides.</td>
     * <td>cn-shanghai</td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>TrafficAnalyzerId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The traffic analyzer ID.</td>
     * <td>nta-262****ca07f</td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>TrafficScenario</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The supported analysis scenario:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● All VPC flow log analysis</td>
     * <td>Fixed value: VpcFlowLogAll</td>
     * <td>VpcFlowLogAll</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The network traffic direction based on Alibaba Cloud resources. ● In: Traffic flowing into the elastic network interface (ENI).</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● Out: Traffic flowing out of the elastic network interface (ENI).</td>
     * <td>In</td>
     * <td>- In</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li>Out                                                                                                                                                                                                                                                                                                                                                                                                                                            |
     * | TupleDimension    | string   | Yes   | The traffic storage aggregation dimension.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Tuple1                 | - Tuple1 </li>
     * <li>Tuple2 </li>
     * <li>Tuple5                                                                                                                                                                                                                                                                                                                                                                                                                              |
     * | GroupBy           | array    | No   | Specifies multiple traffic dimensions for aggregation and sorting.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |  | -                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
     * |                   | string   | No   | Based on the TupleDimension field, you can specify the following aggregation dimensions:</li>
     * </ul>
     * <p>● When TupleDimension = Tuple1:
     * 　■  VpcId: VPC ID
     * 　■  VSwitchId: vSwitch ID
     * 　■  NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■  EcsId: ECS instance ID
     * 　■  CloudIp: Cloud IP
     * ● When TupleDimension = Tuple2:
     * 　■ VpcId: VPC ID
     * 　■ VSwitchId: vSwitch ID
     * 　■ NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■ EcsId: ECS instance ID
     * 　■ SourceIp: Source IP
     * 　■ DestinationIp: Destination IP
     * 　■ TrafficPath: Traffic path
     * ● When TupleDimension = Tuple5:
     * 　■ VpcId: VPC ID
     * 　■ VSwitchId: vSwitch ID
     * 　■ NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■ EcsId: ECS instance ID
     * 　■ SourceIp: Source IP
     * 　■ DestinationIp: Destination IP
     * 　■ TrafficPath: Traffic path
     * 　■ SourcePort: Source port
     * 　■ DestinationPort: Destination port
     * 　■ Protocol: Network protocol | [&quot;VpcId&quot;]                                | - VpcId</p>
     * <ul>
     * <li>VSwitchId</li>
     * <li>CloudIp</li>
     * <li>SourceIp</li>
     * <li>DestinationIp</li>
     * <li>Protocol</li>
     * <li>SourcePort</li>
     * <li>DestinationPort</li>
     * <li>TrafficPath</li>
     * <li>Country</li>
     * <li>Province</li>
     * <li>City</li>
     * <li>Isp</li>
     * <li>Asn                                                                                                                                                                                                                                          |
     * | OrderBy           | string   | Yes   | Based on the TrafficScenario field, the following traffic metrics are supported for sorting:
     * TrafficScenario = VpcFlowLogAll / VpcFlowLogInternet (VPC flow log scenario):
     * ● Bytes: Bandwidth
     * ● Packets: Packet count
     * ● RoundTripTime: TCP RTT                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         | Bytes                                    | - Bytes</li>
     * <li>Packets</li>
     * <li>RoundTripTime                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * | Filter            | array    | No   | Specifies additional filter conditions for focused traffic analysis.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     |                                          | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * |                   | object   | No   | The filter condition for traffic, a Key-Value-Operator object.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |                                          | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |</li>
     * </ul>
     * <p>| key               | string   | No   | The supported filter condition label keys are as follows:</p>
     * <ul>
     * <li>When <code>TupleDimension</code> is 1-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (<strong>required</strong>, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>CloudIp</code>: Cloud IP (the corresponding value supports multiple selections)</li>
     * <li>When <code>TupleDimension</code> is 2-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (<strong>required</strong>, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>SourceIp</code>: Source IP (the corresponding value supports multiple selections)
     * 　- <code>DestinationIp</code>: Destination IP (the corresponding value supports multiple selections)
     * 　- <code>TrafficPath</code>: Traffic path (the corresponding value supports multiple selections)</li>
     * <li>When <code>TupleDimension</code> is 5-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (<strong>required</strong>, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>SourceIp</code>: Source IP
     * 　- <code>DestinationIp</code>: Destination IP
     * 　- <code>TrafficPath</code>: Traffic path (the corresponding value supports multiple selections)
     * 　- <code>SourcePort</code>: Source port (the corresponding value supports multiple selections)
     * 　- <code>DestinationPort</code>: Destination port (the corresponding value supports multiple selections)
     * 　- <code>Protocol</code>: Network protocol (the corresponding value supports multiple selections)</li>
     * <li>In VPC scenarios, you can also filter by traffic metrics:
     * 　- <code>MinBytes</code>: The minimum traffic volume for sorting, in bytes (the corresponding value does not support multiple selections)
     * 　- <code>MaxBytes</code>: The maximum traffic volume for sorting, in bytes (the corresponding value does not support multiple selections)
     * 　- <code>MinRoundTripTime</code>: The minimum RTT for sorting, in ms (the corresponding value does not support multiple selections)
     * 　- <code>MaxRoundTripTime</code>: The maximum RTT for sorting, in ms (the corresponding value does not support multiple selections)
     * 　- <code>MinPackages</code>: The minimum packet count for sorting (the corresponding value does not support multiple selections)
     * 　- <code>MaxPackages</code>: The maximum packet count for sorting (the corresponding value does not support multiple selections) | FlowAction                               | - FlowAction</li>
     * <li>VpcId</li>
     * <li>VSwitchId</li>
     * <li>NetworkInterfaceId</li>
     * <li>CloudIp</li>
     * <li>DestinationIp</li>
     * <li>SourceIp</li>
     * <li>EcsId</li>
     * <li>TrafficPath</li>
     * <li>SourcePort</li>
     * <li>DestinationPort</li>
     * <li>Protocol</li>
     * <li>MinBytes</li>
     * <li>MaxBytes</li>
     * <li>MinRoundTripTime</li>
     * <li>MaxRoundTripTime</li>
     * <li>MinPackages</li>
     * <li>MaxPackages                                                                                                                |
     * | value             | array    | No   | The filter condition values.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |                                          | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * |                   | string   | No   | The filter value corresponding to the specified key type.</li>
     * </ul>
     * <p>When the key is <code>FlowAction</code>, the valid values are:
     * 　- <code>ACCEPT</code> (default: <code>Accept</code>): Traffic allowed by security groups and network ACLs
     * 　- <code>REJECT</code>: Traffic denied by security groups and network ACLs                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | Accept                                   | When the key is FlowAction: ACCEPT / REJECT                                                                                                                                                                                                                                                                                                                                                              |
     * | Operator          | string   | No   | For specified key types, some support operators for character string matching on the passed value. The supported values are as follows (default: in):
     * ● in: Equals
     * ● not in: Not equals
     * ● like: Contains
     * Based on the TupleDimension and TrafficScenario fields, the support for <code>like</code> is as follows:
     * TrafficScenario = VpcFlowLogAll / VpcFlowLogInternet (VPC flow log scenario):
     * The following keys support <code>like</code>:
     * 　○ CloudIp
     * 　○ SourceIp
     * 　○ DestinationIp
     * All other keys support only <code>in</code> and <code>not in</code> operators.                                                                                                                                                                                                                                                                                                                                                                                                                           | in                                       | - not in</p>
     * <ul>
     * <li>in</li>
     * <li>like                                                                                                                                                                                                                                                                                                                                                                                                                                   |
     * | BeginTime         | long     | Yes   | The start time of the query as a millisecond UNIX timestamp.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | 1638239092000                            | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * | EndTime           | long     | Yes   | The end time of the query as a millisecond UNIX timestamp.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            | 1684373700099                            | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * | Sort              | string   | No   | The sorting order for traffic analysis:
     * ● ASC: Ascending order.
     * ● DESC: Descending order.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | Desc                                     | - Desc</li>
     * <li>Asc                                                                                                                                                                                                                                                                                                                                                                                                                                           |
     * | TopN              | integer  | No   | The number of entries to return for the traffic sorting query.
     * You can specify a custom number. If this field is not specified, all traffic data that meets the specified conditions is sorted and analyzed within the performance limits of traffic analysis data.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   | 10                                       | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * | Language          | string   | No   | The language. Valid values: zh-CN, en-US.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              | zh-CN                                    | - zh-CN</li>
     * <li>en-US                                                                                                                                                                                                                                                                                                                                                                                                                                        |
     * | NextToken         | string   | No   | The pagination token. Leave this parameter empty for the first query or when no more results are available. If more results exist, set this to the NextToken value returned by the previous API call.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             | 2A07PfBPlzmmNi/75Qca9SK73UfY48/+WBiREjfVfXqMQxtV8XckOg5lk7F2bhC+ | -                                                                                                                                                                                                                                                                                                                                                                                                                                                     |
     * | MaxResults        | integer  | No   | The page size. Valid values: 1 to 100. Default value: 20.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               | 20                                       |                                                                                                                                                                                                                                                                                                                                                                                                                                         |
     * | StorageInterval   | integer  | No   | The storage bucket granularity property.
     * The storage bucket granularity specifies the storage aggregation period for the query. Two granularity levels are supported: high-precision (such as 1 minute) and long-period (such as 1 day). The specific granularity is determined by the traffic analysis sampling interval configured for high-precision or long-period traffic statistics when creating or editing the traffic analyzer.</li>
     * <li>The supported storage granularity values for the traffic analyzer tuple are:
     * 　- <code>1</code>: In minutes (1 minute)
     * 　- <code>10</code>: In minutes (10 minutes)
     * 　- <code>60</code>: In minutes (60 minutes, i.e., 1 hour)
     * 　- <code>1440</code>: In minutes (1440 minutes, i.e., 1 day)</li>
     * <li>The storage bucket granularity serves two typical purposes:
     * 　- High-precision traffic statistics: such as 1-minute, 10-minute, or 60-minute aggregation
     * 　- Long-period traffic statistics: such as 1440-minute (1-day) aggregation</li>
     * <li>Specify this field during the query to select the storage aggregation period. For example:
     * 　- Pass <code>10</code>: Query short-period data aggregated at 10-minute granularity
     * 　- Pass <code>1440</code>: Query long-period data aggregated at 1-day granularity | 10                                       | - 1</li>
     * <li>10</li>
     * <li>60</li>
     * <li>1440                                                                                                                                                                                                                                                                                                                                                                                                                                   |</li>
     * </ul>
     * <h3>Response elements</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Description</th>
     * <th>Example value</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td></td>
     * <td>object</td>
     * <td>RpcResponse <ArrayList></td>
     * <td></td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>RequestId</td>
     * <td>string</td>
     * <td>The request ID.</td>
     * <td>4DAC4BE1-BEEA-5D84-BE06-E1B796F3B941</td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>NisTrafficRankingId</td>
     * <td>string</td>
     * <td>The result ID of this traffic ranking analysis. Call the DescribeNisTrafficRanking operation to obtain the final analysis results.</td>
     * <td>task-6462a7b4c4a54b****</td>
     * <td>-</td>
     * </tr>
     * </tbody></table>
     * <h2>Internet VPC flow log analysis.</h2>
     * <h3>Request parameters</h3>
     * <table>
     * <thead>
     * <tr>
     * <th>Name</th>
     * <th>Type</th>
     * <th>Required</th>
     * <th>Description</th>
     * <th>Example</th>
     * <th>Valid values</th>
     * </tr>
     * </thead>
     * <tbody><tr>
     * <td>RegionNo</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The region where the resource resides.</td>
     * <td>cn-shanghai</td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>TrafficAnalyzerId</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The traffic analyzer ID.</td>
     * <td>nta-262****ca07f</td>
     * <td>-</td>
     * </tr>
     * <tr>
     * <td>TrafficScenario</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The supported analysis scenario:</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● Internet VPC flow log analysis</td>
     * <td>Fixed value: VpcFlowLogInternet</td>
     * <td>VpcFlowLogInternet</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>Direction</td>
     * <td>string</td>
     * <td>Yes</td>
     * <td>The network traffic direction based on Alibaba Cloud resources. ● In: Traffic flowing into the elastic network interfaces (ENIs).</td>
     * <td></td>
     * <td></td>
     * </tr>
     * <tr>
     * <td>● Out: Traffic flowing out of the elastic network interfaces (ENIs).</td>
     * <td>In</td>
     * <td>- In</td>
     * <td></td>
     * <td></td>
     * <td></td>
     * </tr>
     * </tbody></table>
     * <ul>
     * <li>Out                                                                                                                                                                                                                                                                                                      |
     * | TupleDimension    | string  | Yes   | The traffic storage aggregation dimension.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | Tuple1                                   | - Tuple1</li>
     * <li>Tuple2</li>
     * <li>Tuple5                                                                                                                                                                                                                                                                                    |
     * | GroupBy           | array   | No   | Specifies multiple traffic dimensions for aggregation and sorting.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |                                          | -                                                                                                                                                                                                                                                                                                                |
     * |                   | string  | No   | Based on the TupleDimension field, you can specify the following aggregation dimensions:</li>
     * </ul>
     * <p>● When TupleDimension = Tuple1:
     * 　■ VpcId: VPC ID
     * 　■ VSwitchId: vSwitch ID
     * 　■ NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■ EcsId: ECS instance ID
     * 　■ CloudIp: Cloud IP
     * ● When TupleDimension = Tuple2:
     * 　■ VpcId: VPC ID
     * 　■ VSwitchId: vSwitch ID
     * 　■ NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■ EcsId: ECS instance ID
     * 　■ SourceIp: Source IP
     * 　■ DestinationIp: Destination IP
     * 　■ TrafficPath: Traffic path
     * 　■ <code>Country</code>: Client country
     * 　■ <code>Province</code>: Client province
     * 　■ <code>City</code>: Client city
     * 　■ <code>Isp</code>: Internet service provider
     * 　■ <code>Asn</code>: Autonomous system number
     * ● When TupleDimension = Tuple5:
     * 　■ VpcId: VPC ID
     * 　■ VSwitchId: vSwitch ID
     * 　■ NetworkInterfaceId: elastic network interfaces (ENIs) ID
     * 　■ EcsId: ECS instance ID
     * 　■ SourceIp: Source IP
     * 　■ DestinationIp: Destination IP
     * 　■ TrafficPath: Traffic path
     * 　■ SourcePort: Source port
     * 　■ DestinationPort: Destination port
     * 　■ Protocol: Network protocol
     * 　■ Country: Client country
     * 　■ Province: Client province
     * 　■ City: Client city
     * 　■ Isp: Internet service provider
     * 　■ Asn: Autonomous system number | [&quot;VpcId&quot;]                                | - VpcId</p>
     * <ul>
     * <li>VSwitchId</li>
     * <li>CloudIp</li>
     * <li>SourceIp</li>
     * <li>DestinationIp</li>
     * <li>Protocol</li>
     * <li>SourcePort</li>
     * <li>DestinationPort</li>
     * <li>TrafficPath</li>
     * <li>Country</li>
     * <li>Province</li>
     * <li>City</li>
     * <li>Isp</li>
     * <li>Asn                                                                                         |
     * | OrderBy           | string  | Yes   | The following traffic metrics are supported for sorting: Bytes, Packets, RoundTripTime.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        | Bytes                                    | - Bytes</li>
     * <li>Packets</li>
     * <li>RoundTripTime                                                                                                                                                                                                                                                                         |
     * | Filter            | array   | No   | Specifies additional filter conditions for focused traffic analysis.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |                                          | -                                                                                                                                                                                                                                                                                                                |
     * |                   | object  | No   | The filter condition for traffic, a Key-Value-Operator object.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |                                          | -                                                                                                                                                                                                                                                                                                                |</li>
     * </ul>
     * <p>| key               | string  | No   | The supported filter condition label keys are as follows:</p>
     * <ul>
     * <li>When <code>TupleDimension</code> is 1-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (required, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>CloudIp</code>: Cloud IP (the corresponding value supports multiple selections)</li>
     * <li>When <code>TupleDimension</code> is 2-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (required, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>SourceIp</code>: Source IP (the corresponding value supports multiple selections)
     * 　- <code>DestinationIp</code>: Destination IP (the corresponding value supports multiple selections)
     * 　- <code>TrafficPath</code>: Traffic path (the corresponding value supports multiple selections)
     * 　- <code>ClientCountry</code>: Filter traffic analysis scope by country (the corresponding value supports multiple selections)
     * 　- <code>ClientCity</code>: Filter traffic analysis scope by city (the corresponding value supports multiple selections)
     * 　- <code>ClientAsn</code>: Filter traffic analysis scope by ASN (the corresponding value supports multiple selections)
     * 　- <code>ClientIsp</code>: Filter traffic analysis scope by client ISP (the corresponding value supports multiple selections)</li>
     * <li>When <code>TupleDimension</code> is 5-tuple:
     * 　- <code>FlowAction</code>: The action type executed on traffic after matching the corresponding rule or policy (required, the corresponding value does not support multiple selections)
     * 　- <code>VpcId</code>: VPC ID (the corresponding value supports multiple selections)
     * 　- <code>VSwitchId</code>: vSwitch ID (the corresponding value supports multiple selections)
     * 　- <code>NetworkInterfaceId</code>: elastic network interfaces (ENIs) ID (the corresponding value supports multiple selections)
     * 　- <code>EcsId</code>: ECS instance ID (the corresponding value supports multiple selections)
     * 　- <code>SourceIp</code>: Source IP
     * 　- <code>DestinationIp</code>: Destination IP
     * 　- <code>TrafficPath</code>: Traffic path (the corresponding value supports multiple selections)
     * 　- <code>SourcePort</code>: Source port (the corresponding value supports multiple selections)
     * 　- <code>DestinationPort</code>: Destination port (the corresponding value supports multiple selections)</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Triggers the NIS traffic analyzer to execute a traffic sorting task within a specified scope.</p>
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
     * <p>Updates an inspection task.</p>
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
     * <p>Updates an inspection task.</p>
     * 
     * @param request UpdateNisInspectionTaskRequest
     * @return UpdateNisInspectionTaskResponse
     */
    public UpdateNisInspectionTaskResponse updateNisInspectionTask(UpdateNisInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNisInspectionTaskWithOptions(request, runtime);
    }
}
