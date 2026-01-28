// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20250903;

import com.aliyun.tea.*;
import com.aliyun.sophonsoar20250903.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sophonsoar", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Please ensure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the response orchestration product (i.e., Threat Analysis and Response Log Ingress Traffic) before using this interface.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Component Asset.</p>
     * 
     * @param request CreateComponentAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateComponentAssetResponse
     */
    public CreateComponentAssetResponse createComponentAssetWithOptions(CreateComponentAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentAssetName)) {
            body.put("ComponentAssetName", request.componentAssetName);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentAssetValues)) {
            bodyFlat.put("ComponentAssetValues", request.componentAssetValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            body.put("ComponentName", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateComponentAsset"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateComponentAssetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the response orchestration product (i.e., Threat Analysis and Response Log Ingress Traffic) before using this interface.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Component Asset.</p>
     * 
     * @param request CreateComponentAssetRequest
     * @return CreateComponentAssetResponse
     */
    public CreateComponentAssetResponse createComponentAsset(CreateComponentAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createComponentAssetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Playbook.</p>
     * 
     * @param request CreatePlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePlaybookResponse
     */
    public CreatePlaybookResponse createPlaybookWithOptions(CreatePlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookDescription)) {
            body.put("PlaybookDescription", request.playbookDescription);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.playbookInputConfigs)) {
            bodyFlat.put("PlaybookInputConfigs", request.playbookInputConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookName)) {
            body.put("PlaybookName", request.playbookName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookOutputConfigs)) {
            bodyFlat.put("PlaybookOutputConfigs", request.playbookOutputConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookParamType)) {
            body.put("PlaybookParamType", request.playbookParamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookTaskFlow)) {
            body.put("PlaybookTaskFlow", request.playbookTaskFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcPlaybookUuid)) {
            body.put("SrcPlaybookUuid", request.srcPlaybookUuid);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePlaybook"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Playbook.</p>
     * 
     * @param request CreatePlaybookRequest
     * @return CreatePlaybookResponse
     */
    public CreatePlaybookResponse createPlaybook(CreatePlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the response orchestration product (i.e., Threat Analysis and Response Log Access Traffic).</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Component Asset.</p>
     * 
     * @param request DeleteComponentAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComponentAssetResponse
     */
    public DeleteComponentAssetResponse deleteComponentAssetWithOptions(DeleteComponentAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentAssetUuid)) {
            body.put("ComponentAssetUuid", request.componentAssetUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComponentAsset"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteComponentAssetResponse());
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that before using this interface, you have fully understood the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the response orchestration product (i.e., Threat Analysis and Response Log Access Traffic).</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Component Asset.</p>
     * 
     * @param request DeleteComponentAssetRequest
     * @return DeleteComponentAssetResponse
     */
    public DeleteComponentAssetResponse deleteComponentAsset(DeleteComponentAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteComponentAssetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Playbook.</p>
     * 
     * @param request DeletePlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePlaybookResponse
     */
    public DeletePlaybookResponse deletePlaybookWithOptions(DeletePlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePlaybook"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Playbook.</p>
     * 
     * @param request DeletePlaybookRequest
     * @return DeletePlaybookResponse
     */
    public DeletePlaybookResponse deletePlaybook(DeletePlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行组件动作</p>
     * 
     * @param request ExecuteComponentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteComponentResponse
     */
    public ExecuteComponentResponse executeComponentWithOptions(ExecuteComponentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentActionName)) {
            body.put("ComponentActionName", request.componentActionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentAssetUuid)) {
            body.put("ComponentAssetUuid", request.componentAssetUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentInput)) {
            body.put("ComponentInput", request.componentInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            body.put("ComponentName", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playBookNodeName)) {
            body.put("PlayBookNodeName", request.playBookNodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteComponent"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteComponentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行组件动作</p>
     * 
     * @param request ExecuteComponentRequest
     * @return ExecuteComponentResponse
     */
    public ExecuteComponentResponse executeComponent(ExecuteComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeComponentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get playbook details.</p>
     * 
     * @param request GetPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPlaybookResponse
     */
    public GetPlaybookResponse getPlaybookWithOptions(GetPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookVersion)) {
            body.put("PlaybookVersion", request.playbookVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookVersionType)) {
            body.put("PlaybookVersionType", request.playbookVersionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPlaybook"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get playbook details.</p>
     * 
     * @param request GetPlaybookRequest
     * @return GetPlaybookResponse
     */
    public GetPlaybookResponse getPlaybook(GetPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the list of assets configured for a component.</p>
     * 
     * @param request ListComponentAssetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComponentAssetsResponse
     */
    public ListComponentAssetsResponse listComponentAssetsWithOptions(ListComponentAssetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentAssetUuid)) {
            body.put("ComponentAssetUuid", request.componentAssetUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            body.put("ComponentName", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponentAssets"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentAssetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the list of assets configured for a component.</p>
     * 
     * @param request ListComponentAssetsRequest
     * @return ListComponentAssetsResponse
     */
    public ListComponentAssetsResponse listComponentAssets(ListComponentAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listComponentAssetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Component List.</p>
     * 
     * @param request ListComponentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponentsWithOptions(ListComponentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            body.put("ComponentName", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListComponents"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListComponentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Component List.</p>
     * 
     * @param request ListComponentsRequest
     * @return ListComponentsResponse
     */
    public ListComponentsResponse listComponents(ListComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listComponentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Playbook List.</p>
     * 
     * @param tmpReq ListPlaybooksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPlaybooksResponse
     */
    public ListPlaybooksResponse listPlaybooksWithOptions(ListPlaybooksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPlaybooksShrinkRequest request = new ListPlaybooksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.playbookParamTypes)) {
            request.playbookParamTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.playbookParamTypes, "PlaybookParamTypes", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.playbookUuids)) {
            request.playbookUuidsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.playbookUuids, "PlaybookUuids", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            body.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookExecutionEndTime)) {
            body.put("PlaybookExecutionEndTime", request.playbookExecutionEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookExecutionStartTime)) {
            body.put("PlaybookExecutionStartTime", request.playbookExecutionStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookName)) {
            body.put("PlaybookName", request.playbookName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookParamTypesShrink)) {
            body.put("PlaybookParamTypes", request.playbookParamTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookStatus)) {
            body.put("PlaybookStatus", request.playbookStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookType)) {
            body.put("PlaybookType", request.playbookType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuidsShrink)) {
            body.put("PlaybookUuids", request.playbookUuidsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPlaybooks"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPlaybooksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Playbook List.</p>
     * 
     * @param request ListPlaybooksRequest
     * @return ListPlaybooksResponse
     */
    public ListPlaybooksResponse listPlaybooks(ListPlaybooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPlaybooksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Component Asset.</p>
     * 
     * @param request UpdateComponentAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateComponentAssetResponse
     */
    public UpdateComponentAssetResponse updateComponentAssetWithOptions(UpdateComponentAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentAssetName)) {
            body.put("ComponentAssetName", request.componentAssetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentAssetUuid)) {
            body.put("ComponentAssetUuid", request.componentAssetUuid);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentAssetValues)) {
            bodyFlat.put("ComponentAssetValues", request.componentAssetValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateComponentAsset"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateComponentAssetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Component Asset.</p>
     * 
     * @param request UpdateComponentAssetRequest
     * @return UpdateComponentAssetResponse
     */
    public UpdateComponentAssetResponse updateComponentAsset(UpdateComponentAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateComponentAssetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Playbook.</p>
     * 
     * @param tmpReq UpdatePlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePlaybookResponse
     */
    public UpdatePlaybookResponse updatePlaybookWithOptions(UpdatePlaybookRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePlaybookShrinkRequest request = new UpdatePlaybookShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.playbookInputConfigs)) {
            request.playbookInputConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.playbookInputConfigs, "PlaybookInputConfigs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.playbookOutputConfigs)) {
            request.playbookOutputConfigsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.playbookOutputConfigs, "PlaybookOutputConfigs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookDescription)) {
            body.put("PlaybookDescription", request.playbookDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookInputConfigsShrink)) {
            body.put("PlaybookInputConfigs", request.playbookInputConfigsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookName)) {
            body.put("PlaybookName", request.playbookName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookOutputConfigsShrink)) {
            body.put("PlaybookOutputConfigs", request.playbookOutputConfigsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookParamType)) {
            body.put("PlaybookParamType", request.playbookParamType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookTaskFlow)) {
            body.put("PlaybookTaskFlow", request.playbookTaskFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            body.put("RoleFor", request.roleFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePlaybook"),
            new TeaPair("version", "2025-09-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update Playbook.</p>
     * 
     * @param request UpdatePlaybookRequest
     * @return UpdatePlaybookResponse
     */
    public UpdatePlaybookResponse updatePlaybook(UpdatePlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePlaybookWithOptions(request, runtime);
    }
}
