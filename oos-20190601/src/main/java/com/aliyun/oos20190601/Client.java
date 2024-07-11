// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601;

import com.aliyun.tea.*;
import com.aliyun.oos20190601.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("oos", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Cancels an execution.</p>
     * 
     * @param request CancelExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelExecutionResponse
     */
    public CancelExecutionResponse cancelExecutionWithOptions(CancelExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelExecution"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an execution.</p>
     * 
     * @param request CancelExecutionRequest
     * @return CancelExecutionResponse
     */
    public CancelExecutionResponse cancelExecution(CancelExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the resource group to which a cloud resource belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroupWithOptions(ChangeResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the resource group to which a cloud resource belongs.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Continues deploying an application group when an error occurs for calling the DeployApplicationGroup operation. You can call this operation only for the applications which reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request ContinueDeployApplicationGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ContinueDeployApplicationGroupResponse
     */
    public ContinueDeployApplicationGroupResponse continueDeployApplicationGroupWithOptions(ContinueDeployApplicationGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployParameters)) {
            query.put("DeployParameters", request.deployParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ContinueDeployApplicationGroup"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ContinueDeployApplicationGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Continues deploying an application group when an error occurs for calling the DeployApplicationGroup operation. You can call this operation only for the applications which reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request ContinueDeployApplicationGroupRequest
     * @return ContinueDeployApplicationGroupResponse
     */
    public ContinueDeployApplicationGroupResponse continueDeployApplicationGroup(ContinueDeployApplicationGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.continueDeployApplicationGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application. You can call this operation only for the applications that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param tmpReq CreateApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateApplicationShrinkRequest request = new CreateApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alarmConfig)) {
            request.alarmConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alarmConfig, "AlarmConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmConfigShrink)) {
            query.put("AlarmConfig", request.alarmConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplication"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application. You can call this operation only for the applications that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application group. You can call this operation only for the application groups that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request CreateApplicationGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationGroupResponse
     */
    public CreateApplicationGroupResponse createApplicationGroupWithOptions(CreateApplicationGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmsGroupId)) {
            query.put("CmsGroupId", request.cmsGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployRegionId)) {
            query.put("DeployRegionId", request.deployRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importTagKey)) {
            query.put("ImportTagKey", request.importTagKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importTagValue)) {
            query.put("ImportTagValue", request.importTagValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicationGroup"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application group. You can call this operation only for the application groups that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request CreateApplicationGroupRequest
     * @return CreateApplicationGroupResponse
     */
    public CreateApplicationGroupResponse createApplicationGroup(CreateApplicationGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an O\\\\\\&amp;M Item.</p>
     * 
     * @param tmpReq CreateOpsItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOpsItemResponse
     */
    public CreateOpsItemResponse createOpsItemWithOptions(CreateOpsItemRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOpsItemShrinkRequest request = new CreateOpsItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedupString)) {
            query.put("DedupString", request.dedupString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            query.put("Severity", request.severity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutions)) {
            query.put("Solutions", request.solutions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOpsItem"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOpsItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an O\\\\\\&amp;M Item.</p>
     * 
     * @param request CreateOpsItemRequest
     * @return CreateOpsItemResponse
     */
    public CreateOpsItemResponse createOpsItem(CreateOpsItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOpsItemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a common parameter.</p>
     * 
     * @param tmpReq CreateParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateParameterResponse
     */
    public CreateParameterResponse createParameterWithOptions(CreateParameterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateParameterShrinkRequest request = new CreateParameterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.constraints)) {
            query.put("Constraints", request.constraints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a common parameter.</p>
     * 
     * @param request CreateParameterRequest
     * @return CreateParameterResponse
     */
    public CreateParameterResponse createParameter(CreateParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a patch baseline.</p>
     * 
     * @param tmpReq CreatePatchBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePatchBaselineResponse
     */
    public CreatePatchBaselineResponse createPatchBaselineWithOptions(CreatePatchBaselineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePatchBaselineShrinkRequest request = new CreatePatchBaselineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.approvedPatches)) {
            request.approvedPatchesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.approvedPatches, "ApprovedPatches", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rejectedPatches)) {
            request.rejectedPatchesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rejectedPatches, "RejectedPatches", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalRules)) {
            query.put("ApprovalRules", request.approvalRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvedPatchesShrink)) {
            query.put("ApprovedPatches", request.approvedPatchesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvedPatchesEnableNonSecurity)) {
            query.put("ApprovedPatchesEnableNonSecurity", request.approvedPatchesEnableNonSecurity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationSystem)) {
            query.put("OperationSystem", request.operationSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rejectedPatchesShrink)) {
            query.put("RejectedPatches", request.rejectedPatchesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rejectedPatchesAction)) {
            query.put("RejectedPatchesAction", request.rejectedPatchesAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            query.put("Sources", request.sourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePatchBaseline"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePatchBaselineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a patch baseline.</p>
     * 
     * @param request CreatePatchBaselineRequest
     * @return CreatePatchBaselineResponse
     */
    public CreatePatchBaselineResponse createPatchBaseline(CreatePatchBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPatchBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an encryption parameter. Make sure that you have the permissions to call this operation.</p>
     * 
     * @param tmpReq CreateSecretParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecretParameterResponse
     */
    public CreateSecretParameterResponse createSecretParameterWithOptions(CreateSecretParameterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSecretParameterShrinkRequest request = new CreateSecretParameterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.constraints)) {
            query.put("Constraints", request.constraints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DKMSInstanceId)) {
            query.put("DKMSInstanceId", request.DKMSInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecretParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecretParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an encryption parameter. Make sure that you have the permissions to call this operation.</p>
     * 
     * @param request CreateSecretParameterRequest
     * @return CreateSecretParameterResponse
     */
    public CreateSecretParameterResponse createSecretParameter(CreateSecretParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecretParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a desired-state configuration.</p>
     * 
     * @param tmpReq CreateStateConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStateConfigurationResponse
     */
    public CreateStateConfigurationResponse createStateConfigurationWithOptions(CreateStateConfigurationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStateConfigurationShrinkRequest request = new CreateStateConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configureMode)) {
            query.put("ConfigureMode", request.configureMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleExpression)) {
            query.put("ScheduleExpression", request.scheduleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            query.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targets)) {
            query.put("Targets", request.targets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStateConfiguration"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStateConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a desired-state configuration.</p>
     * 
     * @param request CreateStateConfigurationRequest
     * @return CreateStateConfigurationResponse
     */
    public CreateStateConfigurationResponse createStateConfiguration(CreateStateConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStateConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a template.</p>
     * 
     * @param tmpReq CreateTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTemplateShrinkRequest request = new CreateTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            query.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a template.</p>
     * 
     * @param request CreateTemplateRequest
     * @return CreateTemplateResponse
     */
    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application. You can call this operation only for the applications that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request DeleteApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainResource)) {
            query.put("RetainResource", request.retainResource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplication"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application. You can call this operation only for the applications that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application group. You can call this operation only for the application groups which reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request DeleteApplicationGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationGroupResponse
     */
    public DeleteApplicationGroupResponse deleteApplicationGroupWithOptions(DeleteApplicationGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retainResource)) {
            query.put("RetainResource", request.retainResource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplicationGroup"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application group. You can call this operation only for the application groups which reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request DeleteApplicationGroupRequest
     * @return DeleteApplicationGroupResponse
     */
    public DeleteApplicationGroupResponse deleteApplicationGroup(DeleteApplicationGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple executions.</p>
     * 
     * @param request DeleteExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExecutionsResponse
     */
    public DeleteExecutionsResponse deleteExecutionsWithOptions(DeleteExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionIds)) {
            query.put("ExecutionIds", request.executionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExecutions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExecutionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple executions.</p>
     * 
     * @param request DeleteExecutionsRequest
     * @return DeleteExecutionsResponse
     */
    public DeleteExecutionsResponse deleteExecutions(DeleteExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a common parameter.</p>
     * 
     * @param request DeleteParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteParameterResponse
     */
    public DeleteParameterResponse deleteParameterWithOptions(DeleteParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a common parameter.</p>
     * 
     * @param request DeleteParameterRequest
     * @return DeleteParameterResponse
     */
    public DeleteParameterResponse deleteParameter(DeleteParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a patch baseline.</p>
     * 
     * @param request DeletePatchBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePatchBaselineResponse
     */
    public DeletePatchBaselineResponse deletePatchBaselineWithOptions(DeletePatchBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePatchBaseline"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePatchBaselineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a patch baseline.</p>
     * 
     * @param request DeletePatchBaselineRequest
     * @return DeletePatchBaselineResponse
     */
    public DeletePatchBaselineResponse deletePatchBaseline(DeletePatchBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePatchBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an encryption parameter. Make sure that you have the permissions to call the DeleteSecret operation before you call this operation.</p>
     * 
     * @param request DeleteSecretParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecretParameterResponse
     */
    public DeleteSecretParameterResponse deleteSecretParameterWithOptions(DeleteSecretParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecretParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecretParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an encryption parameter. Make sure that you have the permissions to call the DeleteSecret operation before you call this operation.</p>
     * 
     * @param request DeleteSecretParameterRequest
     * @return DeleteSecretParameterResponse
     */
    public DeleteSecretParameterResponse deleteSecretParameter(DeleteSecretParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecretParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple desired-state configurations at a time.</p>
     * 
     * @param request DeleteStateConfigurationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStateConfigurationsResponse
     */
    public DeleteStateConfigurationsResponse deleteStateConfigurationsWithOptions(DeleteStateConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateConfigurationIds)) {
            query.put("StateConfigurationIds", request.stateConfigurationIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStateConfigurations"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStateConfigurationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple desired-state configurations at a time.</p>
     * 
     * @param request DeleteStateConfigurationsRequest
     * @return DeleteStateConfigurationsResponse
     */
    public DeleteStateConfigurationsResponse deleteStateConfigurations(DeleteStateConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStateConfigurationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param request DeleteTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDeleteExecutions)) {
            query.put("AutoDeleteExecutions", request.autoDeleteExecutions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a template.</p>
     * 
     * @param request DeleteTemplateRequest
     * @return DeleteTemplateResponse
     */
    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple templates.</p>
     * 
     * @param request DeleteTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTemplatesResponse
     */
    public DeleteTemplatesResponse deleteTemplatesWithOptions(DeleteTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoDeleteExecutions)) {
            query.put("AutoDeleteExecutions", request.autoDeleteExecutions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateNames)) {
            query.put("TemplateNames", request.templateNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTemplates"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple templates.</p>
     * 
     * @param request DeleteTemplatesRequest
     * @return DeleteTemplatesResponse
     */
    public DeleteTemplatesResponse deleteTemplates(DeleteTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys an application group. You can call this operation only for the applications which reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request DeployApplicationGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployApplicationGroupResponse
     */
    public DeployApplicationGroupResponse deployApplicationGroupWithOptions(DeployApplicationGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployParameters)) {
            query.put("DeployParameters", request.deployParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployApplicationGroup"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployApplicationGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys an application group. You can call this operation only for the applications which reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request DeployApplicationGroupRequest
     * @return DeployApplicationGroupResponse
     */
    public DeployApplicationGroupResponse deployApplicationGroup(DeployApplicationGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployApplicationGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用分组资源成本</p>
     * 
     * @param request DescribeApplicationGroupBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationGroupBillResponse
     */
    public DescribeApplicationGroupBillResponse describeApplicationGroupBillWithOptions(DescribeApplicationGroupBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationGroupBill"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationGroupBillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用分组资源成本</p>
     * 
     * @param request DescribeApplicationGroupBillRequest
     * @return DescribeApplicationGroupBillResponse
     */
    public DescribeApplicationGroupBillResponse describeApplicationGroupBill(DescribeApplicationGroupBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationGroupBillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries supported regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries supported regions.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Resource Access Management (RAM) policy required for template execution.</p>
     * 
     * @param request GenerateExecutionPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateExecutionPolicyResponse
     */
    public GenerateExecutionPolicyResponse generateExecutionPolicyWithOptions(GenerateExecutionPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            query.put("RamRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateContent)) {
            query.put("TemplateContent", request.templateContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateExecutionPolicy"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateExecutionPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Resource Access Management (RAM) policy required for template execution.</p>
     * 
     * @param request GenerateExecutionPolicyRequest
     * @return GenerateExecutionPolicyResponse
     */
    public GenerateExecutionPolicyResponse generateExecutionPolicy(GenerateExecutionPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateExecutionPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of an application. You can call this operation only for the applications that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request GetApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplication"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of an application. You can call this operation only for the applications that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request GetApplicationRequest
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an application group. You can call this operation only for the application groups that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request GetApplicationGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationGroupResponse
     */
    public GetApplicationGroupResponse getApplicationGroupWithOptions(GetApplicationGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationGroup"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an application group. You can call this operation only for the application groups that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request GetApplicationGroupRequest
     * @return GetApplicationGroupResponse
     */
    public GetApplicationGroupResponse getApplicationGroup(GetApplicationGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the template of an execution, including the content of the template.</p>
     * 
     * @param request GetExecutionTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExecutionTemplateResponse
     */
    public GetExecutionTemplateResponse getExecutionTemplateWithOptions(GetExecutionTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExecutionTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExecutionTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the template of an execution, including the content of the template.</p>
     * 
     * @param request GetExecutionTemplateRequest
     * @return GetExecutionTemplateResponse
     */
    public GetExecutionTemplateResponse getExecutionTemplate(GetExecutionTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExecutionTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the properties of a configuration list.</p>
     * 
     * @param request GetInventorySchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInventorySchemaResponse
     */
    public GetInventorySchemaResponse getInventorySchemaWithOptions(GetInventorySchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregator)) {
            query.put("Aggregator", request.aggregator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeName)) {
            query.put("TypeName", request.typeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInventorySchema"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInventorySchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the properties of a configuration list.</p>
     * 
     * @param request GetInventorySchemaRequest
     * @return GetInventorySchemaResponse
     */
    public GetInventorySchemaResponse getInventorySchema(GetInventorySchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInventorySchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an O\\\\\\&amp;M item.</p>
     * 
     * @param request GetOpsItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOpsItemResponse
     */
    public GetOpsItemResponse getOpsItemWithOptions(GetOpsItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.opsItemId)) {
            query.put("OpsItemId", request.opsItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpsItem"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpsItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an O\\\\\\&amp;M item.</p>
     * 
     * @param request GetOpsItemRequest
     * @return GetOpsItemResponse
     */
    public GetOpsItemResponse getOpsItem(GetOpsItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpsItemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a common parameter and its value.</p>
     * 
     * @param request GetParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetParameterResponse
     */
    public GetParameterResponse getParameterWithOptions(GetParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterVersion)) {
            query.put("ParameterVersion", request.parameterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a common parameter and its value.</p>
     * 
     * @param request GetParameterRequest
     * @return GetParameterResponse
     */
    public GetParameterResponse getParameter(GetParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more parameters.</p>
     * 
     * @param request GetParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetParametersResponse
     */
    public GetParametersResponse getParametersWithOptions(GetParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.names)) {
            query.put("Names", request.names);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetParameters"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more parameters.</p>
     * 
     * @param request GetParametersRequest
     * @return GetParametersResponse
     */
    public GetParametersResponse getParameters(GetParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more parameters by path.</p>
     * 
     * @param request GetParametersByPathRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetParametersByPathResponse
     */
    public GetParametersByPathResponse getParametersByPathWithOptions(GetParametersByPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recursive)) {
            query.put("Recursive", request.recursive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetParametersByPath"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetParametersByPathResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more parameters by path.</p>
     * 
     * @param request GetParametersByPathRequest
     * @return GetParametersByPathResponse
     */
    public GetParametersByPathResponse getParametersByPath(GetParametersByPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getParametersByPathWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a patch baseline.</p>
     * 
     * @param request GetPatchBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPatchBaselineResponse
     */
    public GetPatchBaselineResponse getPatchBaselineWithOptions(GetPatchBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPatchBaseline"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPatchBaselineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a patch baseline.</p>
     * 
     * @param request GetPatchBaselineRequest
     * @return GetPatchBaselineResponse
     */
    public GetPatchBaselineResponse getPatchBaseline(GetPatchBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPatchBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an encryption parameter, including the parameter value. Make sure that you have the permissions to call the GetSecretValue operation before you call this operation.</p>
     * 
     * @param request GetSecretParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecretParameterResponse
     */
    public GetSecretParameterResponse getSecretParameterWithOptions(GetSecretParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterVersion)) {
            query.put("ParameterVersion", request.parameterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withDecryption)) {
            query.put("WithDecryption", request.withDecryption);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecretParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecretParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an encryption parameter, including the parameter value. Make sure that you have the permissions to call the GetSecretValue operation before you call this operation.</p>
     * 
     * @param request GetSecretParameterRequest
     * @return GetSecretParameterResponse
     */
    public GetSecretParameterResponse getSecretParameter(GetSecretParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecretParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more encryption parameters. Make sure that you have the permissions to call the GetSecretValue operation before you call this operation.</p>
     * 
     * @param request GetSecretParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecretParametersResponse
     */
    public GetSecretParametersResponse getSecretParametersWithOptions(GetSecretParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.names)) {
            query.put("Names", request.names);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withDecryption)) {
            query.put("WithDecryption", request.withDecryption);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecretParameters"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecretParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more encryption parameters. Make sure that you have the permissions to call the GetSecretValue operation before you call this operation.</p>
     * 
     * @param request GetSecretParametersRequest
     * @return GetSecretParametersResponse
     */
    public GetSecretParametersResponse getSecretParameters(GetSecretParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecretParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries encryption parameters by path. Make sure that you have the permissions to call the GetSecretValue operation before you call this operation.</p>
     * 
     * @param request GetSecretParametersByPathRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecretParametersByPathResponse
     */
    public GetSecretParametersByPathResponse getSecretParametersByPathWithOptions(GetSecretParametersByPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recursive)) {
            query.put("Recursive", request.recursive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withDecryption)) {
            query.put("WithDecryption", request.withDecryption);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecretParametersByPath"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecretParametersByPathResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries encryption parameters by path. Make sure that you have the permissions to call the GetSecretValue operation before you call this operation.</p>
     * 
     * @param request GetSecretParametersByPathRequest
     * @return GetSecretParametersByPathResponse
     */
    public GetSecretParametersByPathResponse getSecretParametersByPath(GetSecretParametersByPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecretParametersByPathWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the settings of the delivery feature.</p>
     * 
     * @param request GetServiceSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceSettingsResponse
     */
    public GetServiceSettingsResponse getServiceSettingsWithOptions(GetServiceSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceSettings"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the settings of the delivery feature.</p>
     * 
     * @param request GetServiceSettingsRequest
     * @return GetServiceSettingsResponse
     */
    public GetServiceSettingsResponse getServiceSettings(GetServiceSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a template, including the content of the template.</p>
     * 
     * @param request GetTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a template, including the content of the template.</p>
     * 
     * @param request GetTemplateRequest
     * @return GetTemplateResponse
     */
    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available actions, including atomic actions and cloud product actions.</p>
     * 
     * @param request ListActionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListActionsResponse
     */
    public ListActionsResponse listActionsWithOptions(ListActionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OOSActionName)) {
            query.put("OOSActionName", request.OOSActionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListActions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available actions, including atomic actions and cloud product actions.</p>
     * 
     * @param request ListActionsRequest
     * @return ListActionsResponse
     */
    public ListActionsResponse listActions(ListActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listActionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of application groups. You can call this operation only for the application groups that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request ListApplicationGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationGroupsResponse
     */
    public ListApplicationGroupsResponse listApplicationGroupsWithOptions(ListApplicationGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployRegionId)) {
            query.put("DeployRegionId", request.deployRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceProduct)) {
            query.put("ResourceProduct", request.resourceProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationGroups"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of application groups. You can call this operation only for the application groups that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request ListApplicationGroupsRequest
     * @return ListApplicationGroupsResponse
     */
    public ListApplicationGroupsResponse listApplicationGroups(ListApplicationGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of applications. You can call this operation only for the applications that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param tmpReq ListApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListApplicationsShrinkRequest request = new ListApplicationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            query.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.names)) {
            query.put("Names", request.names);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplications"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of applications. You can call this operation only for the applications that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of an execution.</p>
     * 
     * @param request ListExecutionLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExecutionLogsResponse
     */
    public ListExecutionLogsResponse listExecutionLogsWithOptions(ListExecutionLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            query.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExecutionId)) {
            query.put("TaskExecutionId", request.taskExecutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExecutionLogs"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExecutionLogsResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of an execution.</p>
     * 
     * @param request ListExecutionLogsRequest
     * @return ListExecutionLogsResponse
     */
    public ListExecutionLogsResponse listExecutionLogs(ListExecutionLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExecutionLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries high-risk tasks in the execution of a template.</p>
     * 
     * @param request ListExecutionRiskyTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExecutionRiskyTasksResponse
     */
    public ListExecutionRiskyTasksResponse listExecutionRiskyTasksWithOptions(ListExecutionRiskyTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExecutionRiskyTasks"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExecutionRiskyTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries high-risk tasks in the execution of a template.</p>
     * 
     * @param request ListExecutionRiskyTasksRequest
     * @return ListExecutionRiskyTasksResponse
     */
    public ListExecutionRiskyTasksResponse listExecutionRiskyTasks(ListExecutionRiskyTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExecutionRiskyTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries executions. Multiple methods are supported to filter executions.</p>
     * 
     * @param tmpReq ListExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExecutionsResponse
     */
    public ListExecutionsResponse listExecutionsWithOptions(ListExecutionsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListExecutionsShrinkRequest request = new ListExecutionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categories)) {
            query.put("Categories", request.categories);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depth)) {
            query.put("Depth", request.depth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDateAfter)) {
            query.put("EndDateAfter", request.endDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDateBefore)) {
            query.put("EndDateBefore", request.endDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executedBy)) {
            query.put("ExecutedBy", request.executedBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeChildExecution)) {
            query.put("IncludeChildExecution", request.includeChildExecution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentExecutionId)) {
            query.put("ParentExecutionId", request.parentExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            query.put("RamRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTemplateName)) {
            query.put("ResourceTemplateName", request.resourceTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDateAfter)) {
            query.put("StartDateAfter", request.startDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDateBefore)) {
            query.put("StartDateBefore", request.startDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExecutions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExecutionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries executions. Multiple methods are supported to filter executions.</p>
     * 
     * @param request ListExecutionsRequest
     * @return ListExecutionsResponse
     */
    public ListExecutionsResponse listExecutions(ListExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取仓库信息</p>
     * 
     * @param request ListGitRepositoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGitRepositoriesResponse
     */
    public ListGitRepositoriesResponse listGitRepositoriesWithOptions(ListGitRepositoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            query.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.owner)) {
            query.put("Owner", request.owner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGitRepositories"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGitRepositoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取仓库信息</p>
     * 
     * @param request ListGitRepositoriesRequest
     * @return ListGitRepositoriesResponse
     */
    public ListGitRepositoriesResponse listGitRepositories(ListGitRepositoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGitRepositoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the patches of an instance.</p>
     * 
     * @param request ListInstancePatchStatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancePatchStatesResponse
     */
    public ListInstancePatchStatesResponse listInstancePatchStatesWithOptions(ListInstancePatchStatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstancePatchStates"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancePatchStatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the patches of an instance.</p>
     * 
     * @param request ListInstancePatchStatesRequest
     * @return ListInstancePatchStatesResponse
     */
    public ListInstancePatchStatesResponse listInstancePatchStates(ListInstancePatchStatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancePatchStatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the patches of an instance.</p>
     * 
     * @param request ListInstancePatchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancePatchesResponse
     */
    public ListInstancePatchesResponse listInstancePatchesWithOptions(ListInstancePatchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patchStatuses)) {
            query.put("PatchStatuses", request.patchStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstancePatches"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancePatchesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the patches of an instance.</p>
     * 
     * @param request ListInstancePatchesRequest
     * @return ListInstancePatchesResponse
     */
    public ListInstancePatchesResponse listInstancePatches(ListInstancePatchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancePatchesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request ListInventoryEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInventoryEntriesResponse
     */
    public ListInventoryEntriesResponse listInventoryEntriesWithOptions(ListInventoryEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeName)) {
            query.put("TypeName", request.typeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInventoryEntries"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInventoryEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request ListInventoryEntriesRequest
     * @return ListInventoryEntriesResponse
     */
    public ListInventoryEntriesResponse listInventoryEntries(ListInventoryEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInventoryEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries O\&amp;M items.</p>
     * 
     * @param tmpReq ListOpsItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOpsItemsResponse
     */
    public ListOpsItemsResponse listOpsItemsWithOptions(ListOpsItemsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListOpsItemsShrinkRequest request = new ListOpsItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTags)) {
            request.resourceTagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTags, "ResourceTags", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTagsShrink)) {
            query.put("ResourceTags", request.resourceTagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOpsItems"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOpsItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries O\&amp;M items.</p>
     * 
     * @param request ListOpsItemsRequest
     * @return ListOpsItemsResponse
     */
    public ListOpsItemsResponse listOpsItems(ListOpsItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOpsItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of a common parameter.</p>
     * 
     * @param request ListParameterVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListParameterVersionsResponse
     */
    public ListParameterVersionsResponse listParameterVersionsWithOptions(ListParameterVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListParameterVersions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListParameterVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the versions of a common parameter.</p>
     * 
     * @param request ListParameterVersionsRequest
     * @return ListParameterVersionsResponse
     */
    public ListParameterVersionsResponse listParameterVersions(ListParameterVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listParameterVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries common parameters. Multiple methods are supported to filter common parameters.</p>
     * 
     * @param tmpReq ListParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListParametersResponse
     */
    public ListParametersResponse listParametersWithOptions(ListParametersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListParametersShrinkRequest request = new ListParametersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recursive)) {
            query.put("Recursive", request.recursive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListParameters"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries common parameters. Multiple methods are supported to filter common parameters.</p>
     * 
     * @param request ListParametersRequest
     * @return ListParametersResponse
     */
    public ListParametersResponse listParameters(ListParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of patch baselines.</p>
     * 
     * @param tmpReq ListPatchBaselinesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPatchBaselinesResponse
     */
    public ListPatchBaselinesResponse listPatchBaselinesWithOptions(ListPatchBaselinesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPatchBaselinesShrinkRequest request = new ListPatchBaselinesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.approvedPatches)) {
            request.approvedPatchesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.approvedPatches, "ApprovedPatches", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvedPatchesShrink)) {
            query.put("ApprovedPatches", request.approvedPatchesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvedPatchesEnableNonSecurity)) {
            query.put("ApprovedPatchesEnableNonSecurity", request.approvedPatchesEnableNonSecurity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationSystem)) {
            query.put("OperationSystem", request.operationSystem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            query.put("Sources", request.sourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPatchBaselines"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPatchBaselinesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of patch baselines.</p>
     * 
     * @param request ListPatchBaselinesRequest
     * @return ListPatchBaselinesResponse
     */
    public ListPatchBaselinesResponse listPatchBaselines(ListPatchBaselinesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPatchBaselinesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a scheduled execution that involves O&amp;M operations on Elastic Compute Service (ECS) instances.</p>
     * 
     * @param request ListResourceExecutionStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceExecutionStatusResponse
     */
    public ListResourceExecutionStatusResponse listResourceExecutionStatusWithOptions(ListResourceExecutionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceExecutionStatus"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceExecutionStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a scheduled execution that involves O&amp;M operations on Elastic Compute Service (ECS) instances.</p>
     * 
     * @param request ListResourceExecutionStatusRequest
     * @return ListResourceExecutionStatusResponse
     */
    public ListResourceExecutionStatusResponse listResourceExecutionStatus(ListResourceExecutionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceExecutionStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries versions of an encryption parameter.</p>
     * 
     * @param request ListSecretParameterVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecretParameterVersionsResponse
     */
    public ListSecretParameterVersionsResponse listSecretParameterVersionsWithOptions(ListSecretParameterVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withDecryption)) {
            query.put("WithDecryption", request.withDecryption);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecretParameterVersions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecretParameterVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries versions of an encryption parameter.</p>
     * 
     * @param request ListSecretParameterVersionsRequest
     * @return ListSecretParameterVersionsResponse
     */
    public ListSecretParameterVersionsResponse listSecretParameterVersions(ListSecretParameterVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecretParameterVersionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have the permission to manage Key Management Service (KMS) secrets.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries common parameters. Multiple types of queries are supported.</p>
     * 
     * @param tmpReq ListSecretParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecretParametersResponse
     */
    public ListSecretParametersResponse listSecretParametersWithOptions(ListSecretParametersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSecretParametersShrinkRequest request = new ListSecretParametersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recursive)) {
            query.put("Recursive", request.recursive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecretParameters"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecretParametersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you have the permission to manage Key Management Service (KMS) secrets.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries common parameters. Multiple types of queries are supported.</p>
     * 
     * @param request ListSecretParametersRequest
     * @return ListSecretParametersResponse
     */
    public ListSecretParametersResponse listSecretParameters(ListSecretParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecretParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries desired-state configurations.</p>
     * 
     * @param tmpReq ListStateConfigurationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStateConfigurationsResponse
     */
    public ListStateConfigurationsResponse listStateConfigurationsWithOptions(ListStateConfigurationsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListStateConfigurationsShrinkRequest request = new ListStateConfigurationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateConfigurationIds)) {
            query.put("StateConfigurationIds", request.stateConfigurationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStateConfigurations"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStateConfigurationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries desired-state configurations.</p>
     * 
     * @param request ListStateConfigurationsRequest
     * @return ListStateConfigurationsResponse
     */
    public ListStateConfigurationsResponse listStateConfigurations(ListStateConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStateConfigurationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags.</p>
     * 
     * @param request ListTagKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagKeys"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags.</p>
     * 
     * @param request ListTagKeysRequest
     * @return ListTagKeysResponse
     */
    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to one or more resources.</p>
     * 
     * @param tmpReq ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("ResourceIds", request.resourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to one or more resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the values of created tags.</p>
     * 
     * @param request ListTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValuesWithOptions(ListTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagValues"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagValuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the values of created tags.</p>
     * 
     * @param request ListTagValuesRequest
     * @return ListTagValuesResponse
     */
    public ListTagValuesResponse listTagValues(ListTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries task executions. Multiple methods are supported to filter task executions.</p>
     * 
     * @param request ListTaskExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskExecutionsResponse
     */
    public ListTaskExecutionsResponse listTaskExecutionsWithOptions(ListTaskExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDateAfter)) {
            query.put("EndDateAfter", request.endDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDateBefore)) {
            query.put("EndDateBefore", request.endDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeChildTaskExecution)) {
            query.put("IncludeChildTaskExecution", request.includeChildTaskExecution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentTaskExecutionId)) {
            query.put("ParentTaskExecutionId", request.parentTaskExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDateAfter)) {
            query.put("StartDateAfter", request.startDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDateBefore)) {
            query.put("StartDateBefore", request.startDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAction)) {
            query.put("TaskAction", request.taskAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExecutionId)) {
            query.put("TaskExecutionId", request.taskExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskExecutions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskExecutionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries task executions. Multiple methods are supported to filter task executions.</p>
     * 
     * @param request ListTaskExecutionsRequest
     * @return ListTaskExecutionsResponse
     */
    public ListTaskExecutionsResponse listTaskExecutions(ListTaskExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of versions of a template.</p>
     * 
     * @param request ListTemplateVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplateVersionsResponse
     */
    public ListTemplateVersionsResponse listTemplateVersionsWithOptions(ListTemplateVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplateVersions"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplateVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of versions of a template.</p>
     * 
     * @param request ListTemplateVersionsRequest
     * @return ListTemplateVersionsResponse
     */
    public ListTemplateVersionsResponse listTemplateVersions(ListTemplateVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplateVersionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries templates. Multiple methods are supported to filter templates.</p>
     * 
     * @param tmpReq ListTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTemplatesShrinkRequest request = new ListTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdBy)) {
            query.put("CreatedBy", request.createdBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdDateAfter)) {
            query.put("CreatedDateAfter", request.createdDateAfter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdDateBefore)) {
            query.put("CreatedDateBefore", request.createdDateBefore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasTrigger)) {
            query.put("HasTrigger", request.hasTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isExample)) {
            query.put("IsExample", request.isExample);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isFavorite)) {
            query.put("IsFavorite", request.isFavorite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shareType)) {
            query.put("ShareType", request.shareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            query.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateFormat)) {
            query.put("TemplateFormat", request.templateFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries templates. Multiple methods are supported to filter templates.</p>
     * 
     * @param request ListTemplatesRequest
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to notify an execution in the following scenarios:</p>
     * <ul>
     * <li>If a template contains a special task, such as an approval task, the Operation Orchestration Service (OOS) execution engine sets the execution state to Waiting when the approval task is being run. You can call this operation to specify whether to continue the execution.</li>
     * <li>If you perform debugging in the debug mode, you can call this operation to notify the execution of the subsequent operations after the execution is created or a task is complete.</li>
     * <li>If a high-risk operation task waits for approval, you can call this operation to specify whether to continue the execution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Notifies an execution in the Waiting state of the subsequent operations.</p>
     * 
     * @param request NotifyExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return NotifyExecutionResponse
     */
    public NotifyExecutionResponse notifyExecutionWithOptions(NotifyExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionStatus)) {
            query.put("ExecutionStatus", request.executionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loopItem)) {
            query.put("LoopItem", request.loopItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyNote)) {
            query.put("NotifyNote", request.notifyNote);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyType)) {
            query.put("NotifyType", request.notifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExecutionId)) {
            query.put("TaskExecutionId", request.taskExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExecutionIds)) {
            query.put("TaskExecutionIds", request.taskExecutionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NotifyExecution"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new NotifyExecutionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to notify an execution in the following scenarios:</p>
     * <ul>
     * <li>If a template contains a special task, such as an approval task, the Operation Orchestration Service (OOS) execution engine sets the execution state to Waiting when the approval task is being run. You can call this operation to specify whether to continue the execution.</li>
     * <li>If you perform debugging in the debug mode, you can call this operation to notify the execution of the subsequent operations after the execution is created or a task is complete.</li>
     * <li>If a high-risk operation task waits for approval, you can call this operation to specify whether to continue the execution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Notifies an execution in the Waiting state of the subsequent operations.</p>
     * 
     * @param request NotifyExecutionRequest
     * @return NotifyExecutionResponse
     */
    public NotifyExecutionResponse notifyExecution(NotifyExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.notifyExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers the default patch baseline.</p>
     * 
     * @param request RegisterDefaultPatchBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterDefaultPatchBaselineResponse
     */
    public RegisterDefaultPatchBaselineResponse registerDefaultPatchBaselineWithOptions(RegisterDefaultPatchBaselineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterDefaultPatchBaseline"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterDefaultPatchBaselineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Registers the default patch baseline.</p>
     * 
     * @param request RegisterDefaultPatchBaselineRequest
     * @return RegisterDefaultPatchBaselineResponse
     */
    public RegisterDefaultPatchBaselineResponse registerDefaultPatchBaseline(RegisterDefaultPatchBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerDefaultPatchBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details or aggregate information of a configuration inventory.</p>
     * 
     * @param request SearchInventoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchInventoryResponse
     */
    public SearchInventoryResponse searchInventoryWithOptions(SearchInventoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregator)) {
            query.put("Aggregator", request.aggregator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchInventory"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchInventoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details or aggregate information of a configuration inventory.</p>
     * 
     * @param request SearchInventoryRequest
     * @return SearchInventoryResponse
     */
    public SearchInventoryResponse searchInventory(SearchInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchInventoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the feature of delivering template execution records and sets the storage location.</p>
     * 
     * @param request SetServiceSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetServiceSettingsResponse
     */
    public SetServiceSettingsResponse setServiceSettingsWithOptions(SetServiceSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryOssBucketName)) {
            query.put("DeliveryOssBucketName", request.deliveryOssBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryOssEnabled)) {
            query.put("DeliveryOssEnabled", request.deliveryOssEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryOssKeyPrefix)) {
            query.put("DeliveryOssKeyPrefix", request.deliveryOssKeyPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverySlsEnabled)) {
            query.put("DeliverySlsEnabled", request.deliverySlsEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverySlsProjectName)) {
            query.put("DeliverySlsProjectName", request.deliverySlsProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdcEnterpriseId)) {
            query.put("RdcEnterpriseId", request.rdcEnterpriseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetServiceSettings"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetServiceSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the feature of delivering template execution records and sets the storage location.</p>
     * 
     * @param request SetServiceSettingsRequest
     * @return SetServiceSettingsResponse
     */
    public SetServiceSettingsResponse setServiceSettings(SetServiceSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setServiceSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an execution.</p>
     * 
     * @param tmpReq StartExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartExecutionResponse
     */
    public StartExecutionResponse startExecutionWithOptions(StartExecutionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartExecutionShrinkRequest request = new StartExecutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loopMode)) {
            query.put("LoopMode", request.loopMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentExecutionId)) {
            query.put("ParentExecutionId", request.parentExecutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.safetyCheck)) {
            query.put("SafetyCheck", request.safetyCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateContent)) {
            query.put("TemplateContent", request.templateContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateVersion)) {
            query.put("TemplateVersion", request.templateVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartExecution"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an execution.</p>
     * 
     * @param request StartExecutionRequest
     * @return StartExecutionResponse
     */
    public StartExecutionResponse startExecution(StartExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to one or more resources.</p>
     * 
     * @param tmpReq TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TagResourcesShrinkRequest request = new TagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("ResourceIds", request.resourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to one or more resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Debugs a started execution that contains an event trigger task or alert trigger task. If the operation is called, a message body is sent to the event trigger task or alert trigger task. After the trigger task receives the message body, the trigger task generates a new child execution.</p>
     * 
     * @param request TriggerExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerExecutionResponse
     */
    public TriggerExecutionResponse triggerExecutionWithOptions(TriggerExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerExecution"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Debugs a started execution that contains an event trigger task or alert trigger task. If the operation is called, a message body is sent to the event trigger task or alert trigger task. After the trigger task receives the message body, the trigger task generates a new child execution.</p>
     * 
     * @param request TriggerExecutionRequest
     * @return TriggerExecutionResponse
     */
    public TriggerExecutionResponse triggerExecution(TriggerExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from one or more resources.</p>
     * 
     * @param tmpReq UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UntagResourcesShrinkRequest request = new UntagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceIds)) {
            request.resourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceIds, "ResourceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKeys)) {
            request.tagKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKeys, "TagKeys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsShrink)) {
            query.put("ResourceIds", request.resourceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeysShrink)) {
            query.put("TagKeys", request.tagKeysShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from one or more resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an application. You can call this operation only for the applications that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param tmpReq UpdateApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationResponse
     */
    public UpdateApplicationResponse updateApplicationWithOptions(UpdateApplicationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateApplicationShrinkRequest request = new UpdateApplicationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alarmConfig)) {
            request.alarmConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alarmConfig, "AlarmConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmConfigShrink)) {
            query.put("AlarmConfig", request.alarmConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteAlarmRulesBeforeUpdate)) {
            query.put("DeleteAlarmRulesBeforeUpdate", request.deleteAlarmRulesBeforeUpdate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplication"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an application. You can call this operation only for the applications that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request UpdateApplicationRequest
     * @return UpdateApplicationResponse
     */
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of an application group. You can call this operation only for the application groups that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request UpdateApplicationGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationGroupResponse
     */
    public UpdateApplicationGroupResponse updateApplicationGroupWithOptions(UpdateApplicationGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newName)) {
            query.put("NewName", request.newName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationGroup"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of an application group. You can call this operation only for the application groups that reside in the China (Hangzhou) region. Use an endpoint of the China (Hangzhou) region.</p>
     * 
     * @param request UpdateApplicationGroupRequest
     * @return UpdateApplicationGroupResponse
     */
    public UpdateApplicationGroupResponse updateApplicationGroup(UpdateApplicationGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an execution.</p>
     * 
     * @param request UpdateExecutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateExecutionResponse
     */
    public UpdateExecutionResponse updateExecutionWithOptions(UpdateExecutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("ExecutionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateExecution"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateExecutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an execution.</p>
     * 
     * @param request UpdateExecutionRequest
     * @return UpdateExecutionResponse
     */
    public UpdateExecutionResponse updateExecution(UpdateExecutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateExecutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an O\\\\\\&amp;M item.</p>
     * 
     * @param tmpReq UpdateOpsItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOpsItemResponse
     */
    public UpdateOpsItemResponse updateOpsItemWithOptions(UpdateOpsItemRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateOpsItemShrinkRequest request = new UpdateOpsItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dedupString)) {
            query.put("DedupString", request.dedupString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opsItemId)) {
            query.put("OpsItemId", request.opsItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.severity)) {
            query.put("Severity", request.severity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutions)) {
            query.put("Solutions", request.solutions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOpsItem"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOpsItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an O\\\\\\&amp;M item.</p>
     * 
     * @param request UpdateOpsItemRequest
     * @return UpdateOpsItemResponse
     */
    public UpdateOpsItemResponse updateOpsItem(UpdateOpsItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOpsItemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a common parameter.</p>
     * 
     * @param request UpdateParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateParameterResponse
     */
    public UpdateParameterResponse updateParameterWithOptions(UpdateParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a common parameter.</p>
     * 
     * @param request UpdateParameterRequest
     * @return UpdateParameterResponse
     */
    public UpdateParameterResponse updateParameter(UpdateParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a patch baseline.</p>
     * 
     * @param tmpReq UpdatePatchBaselineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePatchBaselineResponse
     */
    public UpdatePatchBaselineResponse updatePatchBaselineWithOptions(UpdatePatchBaselineRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePatchBaselineShrinkRequest request = new UpdatePatchBaselineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.approvedPatches)) {
            request.approvedPatchesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.approvedPatches, "ApprovedPatches", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rejectedPatches)) {
            request.rejectedPatchesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rejectedPatches, "RejectedPatches", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sources)) {
            request.sourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sources, "Sources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalRules)) {
            query.put("ApprovalRules", request.approvalRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvedPatchesShrink)) {
            query.put("ApprovedPatches", request.approvedPatchesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvedPatchesEnableNonSecurity)) {
            query.put("ApprovedPatchesEnableNonSecurity", request.approvedPatchesEnableNonSecurity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rejectedPatchesShrink)) {
            query.put("RejectedPatches", request.rejectedPatchesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rejectedPatchesAction)) {
            query.put("RejectedPatchesAction", request.rejectedPatchesAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcesShrink)) {
            query.put("Sources", request.sourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePatchBaseline"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePatchBaselineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a patch baseline.</p>
     * 
     * @param request UpdatePatchBaselineRequest
     * @return UpdatePatchBaselineResponse
     */
    public UpdatePatchBaselineResponse updatePatchBaseline(UpdatePatchBaselineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePatchBaselineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an encryption parameter.</p>
     * 
     * @param tmpReq UpdateSecretParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSecretParameterResponse
     */
    public UpdateSecretParameterResponse updateSecretParameterWithOptions(UpdateSecretParameterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSecretParameterShrinkRequest request = new UpdateSecretParameterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSecretParameter"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSecretParameterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an encryption parameter.</p>
     * 
     * @param request UpdateSecretParameterRequest
     * @return UpdateSecretParameterResponse
     */
    public UpdateSecretParameterResponse updateSecretParameter(UpdateSecretParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSecretParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a desired-state configuration.</p>
     * 
     * @param tmpReq UpdateStateConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStateConfigurationResponse
     */
    public UpdateStateConfigurationResponse updateStateConfigurationWithOptions(UpdateStateConfigurationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateStateConfigurationShrinkRequest request = new UpdateStateConfigurationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.parameters)) {
            request.parametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.parameters, "Parameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configureMode)) {
            query.put("ConfigureMode", request.configureMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parametersShrink)) {
            query.put("Parameters", request.parametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleExpression)) {
            query.put("ScheduleExpression", request.scheduleExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleType)) {
            query.put("ScheduleType", request.scheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateConfigurationId)) {
            query.put("StateConfigurationId", request.stateConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targets)) {
            query.put("Targets", request.targets);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStateConfiguration"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStateConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a desired-state configuration.</p>
     * 
     * @param request UpdateStateConfigurationRequest
     * @return UpdateStateConfigurationResponse
     */
    public UpdateStateConfigurationResponse updateStateConfiguration(UpdateStateConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStateConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about an existing template.</p>
     * 
     * @param tmpReq UpdateTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTemplateShrinkRequest request = new UpdateTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            query.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTemplate"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about an existing template.</p>
     * 
     * @param request UpdateTemplateRequest
     * @return UpdateTemplateResponse
     */
    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Check whether a template is valid.</p>
     * 
     * @param request ValidateTemplateContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidateTemplateContentResponse
     */
    public ValidateTemplateContentResponse validateTemplateContentWithOptions(ValidateTemplateContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateURL)) {
            query.put("TemplateURL", request.templateURL);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateTemplateContent"),
            new TeaPair("version", "2019-06-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateTemplateContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Check whether a template is valid.</p>
     * 
     * @param request ValidateTemplateContentRequest
     * @return ValidateTemplateContentResponse
     */
    public ValidateTemplateContentResponse validateTemplateContent(ValidateTemplateContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateTemplateContentWithOptions(request, runtime);
    }
}
