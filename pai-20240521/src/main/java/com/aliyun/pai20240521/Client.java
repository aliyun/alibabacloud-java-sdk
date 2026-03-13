// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai20240521;

import com.aliyun.tea.*;
import com.aliyun.pai20240521.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("pai", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>获取Quota</p>
     * 
     * @param request GetQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaResponse
     */
    public GetQuotaResponse getQuotaWithOptions(String QuotaId, GetQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuota"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/" + com.aliyun.openapiutil.Client.getEncodeParam(QuotaId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Quota</p>
     * 
     * @param request GetQuotaRequest
     * @return GetQuotaResponse
     */
    public GetQuotaResponse getQuota(String QuotaId, GetQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaWithOptions(QuotaId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get resource group by group id</p>
     * 
     * @param tmpReq GetResourceGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupResponse
     */
    public GetResourceGroupResponse getResourceGroupWithOptions(String ResourceGroupID, GetResourceGroupRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetResourceGroupShrinkRequest request = new GetResourceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isAIWorkspaceDataEnabled)) {
            query.put("IsAIWorkspaceDataEnabled", request.isAIWorkspaceDataEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroup"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>get resource group by group id</p>
     * 
     * @param request GetResourceGroupRequest
     * @return GetResourceGroupResponse
     */
    public GetResourceGroupResponse getResourceGroup(String ResourceGroupID, GetResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupWithOptions(ResourceGroupID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get machine group</p>
     * 
     * @param tmpReq GetResourceGroupMachineGroupRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupMachineGroupResponse
     */
    public GetResourceGroupMachineGroupResponse getResourceGroupMachineGroupWithOptions(String MachineGroupID, String ResourceGroupID, GetResourceGroupMachineGroupRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetResourceGroupMachineGroupShrinkRequest request = new GetResourceGroupMachineGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupMachineGroup"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + "/machinegroups/" + com.aliyun.openapiutil.Client.getEncodeParam(MachineGroupID) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupMachineGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>get machine group</p>
     * 
     * @param request GetResourceGroupMachineGroupRequest
     * @return GetResourceGroupMachineGroupResponse
     */
    public GetResourceGroupMachineGroupResponse getResourceGroupMachineGroup(String MachineGroupID, String ResourceGroupID, GetResourceGroupMachineGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupMachineGroupWithOptions(MachineGroupID, ResourceGroupID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get resource group requested resource by resource group id</p>
     * 
     * @param request GetResourceGroupRequestRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupRequestResponse
     */
    public GetResourceGroupRequestResponse getResourceGroupRequestWithOptions(GetResourceGroupRequestRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.podStatus)) {
            query.put("PodStatus", request.podStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            query.put("ResourceGroupID", request.resourceGroupID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupRequest"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/data/request"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupRequestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>get resource group requested resource by resource group id</p>
     * 
     * @param request GetResourceGroupRequestRequest
     * @return GetResourceGroupRequestResponse
     */
    public GetResourceGroupRequestResponse getResourceGroupRequest(GetResourceGroupRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupRequestWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get resource group total resource by group id</p>
     * 
     * @param request GetResourceGroupTotalRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceGroupTotalResponse
     */
    public GetResourceGroupTotalResponse getResourceGroupTotalWithOptions(GetResourceGroupTotalRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupID)) {
            query.put("ResourceGroupID", request.resourceGroupID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceGroupTotal"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/data/total"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceGroupTotalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>get resource group total resource by group id</p>
     * 
     * @param request GetResourceGroupTotalRequest
     * @return GetResourceGroupTotalResponse
     */
    public GetResourceGroupTotalResponse getResourceGroupTotal(GetResourceGroupTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourceGroupTotalWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetUserAliUidByInstanceId</p>
     * 
     * @param request GetUserAliUidByInstanceIdRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserAliUidByInstanceIdResponse
     */
    public GetUserAliUidByInstanceIdResponse getUserAliUidByInstanceIdWithOptions(String ResourceInstanceId, GetUserAliUidByInstanceIdRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerUid)) {
            query.put("ResourceOwnerUid", request.resourceOwnerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserAliUidByInstanceId"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/inner/pods/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceInstanceId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserAliUidByInstanceIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetUserAliUidByInstanceId</p>
     * 
     * @param request GetUserAliUidByInstanceIdRequest
     * @return GetUserAliUidByInstanceIdResponse
     */
    public GetUserAliUidByInstanceIdResponse getUserAliUidByInstanceId(String ResourceInstanceId, GetUserAliUidByInstanceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserAliUidByInstanceIdWithOptions(ResourceInstanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get user view  metrics</p>
     * 
     * @param request GetUserViewMetricsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserViewMetricsResponse
     */
    public GetUserViewMetricsResponse getUserViewMetricsWithOptions(String ResourceGroupID, GetUserViewMetricsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStep)) {
            query.put("TimeStep", request.timeStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserViewMetrics"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + "/usermetrics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserViewMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>get user view  metrics</p>
     * 
     * @param request GetUserViewMetricsRequest
     * @return GetUserViewMetricsResponse
     */
    public GetUserViewMetricsResponse getUserViewMetrics(String ResourceGroupID, GetUserViewMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserViewMetricsWithOptions(ResourceGroupID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListCacheServices</p>
     * 
     * @param request ListDataCacheServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCacheServicesResponse
     */
    public ListDataCacheServicesResponse listDataCacheServicesWithOptions(ListDataCacheServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaId)) {
            query.put("QuotaId", request.quotaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCacheServices"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/caches"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCacheServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListCacheServices</p>
     * 
     * @param request ListDataCacheServicesRequest
     * @return ListDataCacheServicesResponse
     */
    public ListDataCacheServicesResponse listDataCacheServices(ListDataCacheServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataCacheServicesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源节点列表</p>
     * 
     * @param tmpReq ListNodesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodesShrinkRequest request = new ListNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.healthCount)) {
            request.healthCountShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.healthCount, "HealthCount", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.healthRate)) {
            request.healthRateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.healthRate, "HealthRate", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceleratorType)) {
            query.put("AcceleratorType", request.acceleratorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.availabilityZone)) {
            query.put("AvailabilityZone", request.availabilityZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cliqueID)) {
            query.put("CliqueID", request.cliqueID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterByQuotaId)) {
            query.put("FilterByQuotaId", request.filterByQuotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterByResourceGroupIds)) {
            query.put("FilterByResourceGroupIds", request.filterByResourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GPUType)) {
            query.put("GPUType", request.GPUType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCountShrink)) {
            query.put("HealthCount", request.healthCountShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthRateShrink)) {
            query.put("HealthRate", request.healthRateShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hyperNode)) {
            query.put("HyperNode", request.hyperNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hyperZone)) {
            query.put("HyperZone", request.hyperZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutMode)) {
            query.put("LayoutMode", request.layoutMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineGroupIds)) {
            query.put("MachineGroupIds", request.machineGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNames)) {
            query.put("NodeNames", request.nodeNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeStatuses)) {
            query.put("NodeStatuses", request.nodeStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeTypes)) {
            query.put("NodeTypes", request.nodeTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderInstanceIds)) {
            query.put("OrderInstanceIds", request.orderInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderStatuses)) {
            query.put("OrderStatuses", request.orderStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaId)) {
            query.put("QuotaId", request.quotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasonCodes)) {
            query.put("ReasonCodes", request.reasonCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/nodes"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源节点列表</p>
     * 
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listNodesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Quota列表</p>
     * 
     * @param request ListQuotasRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotasWithOptions(ListQuotasRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.layoutMode)) {
            query.put("LayoutMode", request.layoutMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentQuotaId)) {
            query.put("ParentQuotaId", request.parentQuotaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaIds)) {
            query.put("QuotaIds", request.quotaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaName)) {
            query.put("QuotaName", request.quotaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statuses)) {
            query.put("Statuses", request.statuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceIds)) {
            query.put("WorkspaceIds", request.workspaceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("WorkspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQuotas"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/quotas/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQuotasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Quota列表</p>
     * 
     * @param request ListQuotasRequest
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQuotasWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list machine groups</p>
     * 
     * @param request ListResourceGroupMachineGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupMachineGroupsResponse
     */
    public ListResourceGroupMachineGroupsResponse listResourceGroupMachineGroupsWithOptions(String ResourceGroupID, ListResourceGroupMachineGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creatorID)) {
            query.put("CreatorID", request.creatorID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsSpec)) {
            query.put("EcsSpec", request.ecsSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderInstanceId)) {
            query.put("OrderInstanceId", request.orderInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDuration)) {
            query.put("PaymentDuration", request.paymentDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDurationUnit)) {
            query.put("PaymentDurationUnit", request.paymentDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroupMachineGroups"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources/" + com.aliyun.openapiutil.Client.getEncodeParam(ResourceGroupID) + "/machinegroups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupMachineGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>list machine groups</p>
     * 
     * @param request ListResourceGroupMachineGroupsRequest
     * @return ListResourceGroupMachineGroupsResponse
     */
    public ListResourceGroupMachineGroupsResponse listResourceGroupMachineGroups(String ResourceGroupID, ListResourceGroupMachineGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceGroupMachineGroupsWithOptions(ResourceGroupID, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list resource group</p>
     * 
     * @param request ListResourceGroupsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroupsWithOptions(ListResourceGroupsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.computingResourceProvider)) {
            query.put("ComputingResourceProvider", request.computingResourceProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showAll)) {
            query.put("ShowAll", request.showAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceGroups"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/resources"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>list resource group</p>
     * 
     * @param request ListResourceGroupsRequest
     * @return ListResourceGroupsResponse
     */
    public ListResourceGroupsResponse listResourceGroups(ListResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listResourceGroupsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云产品查标签接口</p>
     * 
     * @param tmpReq ListTagResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "ResourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("ResourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagOwnerUid)) {
            query.put("TagOwnerUid", request.tagOwnerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/inner/tags"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云产品查标签接口</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTagResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>打系统标签接口</p>
     * 
     * @param request TagResourcesSystemTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesSystemTagsResponse
     */
    public TagResourcesSystemTagsResponse tagResourcesSystemTagsWithOptions(TagResourcesSystemTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagOwnerUid)) {
            body.put("TagOwnerUid", request.tagOwnerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResourcesSystemTags"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/inner/tags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesSystemTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>打系统标签接口</p>
     * 
     * @param request TagResourcesSystemTagsRequest
     * @return TagResourcesSystemTagsResponse
     */
    public TagResourcesSystemTagsResponse tagResourcesSystemTags(TagResourcesSystemTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.tagResourcesSystemTagsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删系统标签接口</p>
     * 
     * @param tmpReq UntagResourcesSystemTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesSystemTagsResponse
     */
    public UntagResourcesSystemTagsResponse untagResourcesSystemTagsWithOptions(UntagResourcesSystemTagsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UntagResourcesSystemTagsShrinkRequest request = new UntagResourcesSystemTagsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceId)) {
            request.resourceIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceId, "ResourceId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKey)) {
            request.tagKeyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKey, "TagKey", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdShrink)) {
            query.put("ResourceId", request.resourceIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyShrink)) {
            query.put("TagKey", request.tagKeyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagOwnerUid)) {
            query.put("TagOwnerUid", request.tagOwnerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResourcesSystemTags"),
            new TeaPair("version", "2024-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/inner/tags"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesSystemTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删系统标签接口</p>
     * 
     * @param request UntagResourcesSystemTagsRequest
     * @return UntagResourcesSystemTagsResponse
     */
    public UntagResourcesSystemTagsResponse untagResourcesSystemTags(UntagResourcesSystemTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.untagResourcesSystemTagsWithOptions(request, headers, runtime);
    }
}
