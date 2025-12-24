// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728;

import com.aliyun.tea.*;
import com.aliyun.sophonsoar20220728.models.*;

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
     * <b>summary</b> : 
     * <p>Compares configurations between two versions of a published playbook.</p>
     * 
     * @param request ComparePlaybooksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ComparePlaybooksResponse
     */
    public ComparePlaybooksResponse comparePlaybooksWithOptions(ComparePlaybooksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPlaybookReleaseId)) {
            query.put("NewPlaybookReleaseId", request.newPlaybookReleaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldPlaybookReleaseId)) {
            query.put("OldPlaybookReleaseId", request.oldPlaybookReleaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            query.put("PlaybookUuid", request.playbookUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ComparePlaybooks"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ComparePlaybooksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Compares configurations between two versions of a published playbook.</p>
     * 
     * @param request ComparePlaybooksRequest
     * @return ComparePlaybooksResponse
     */
    public ComparePlaybooksResponse comparePlaybooks(ComparePlaybooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.comparePlaybooksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the orchestration product before using this interface.</p>
     * 
     * <b>summary</b> : 
     * <p>Convert XML configuration.</p>
     * 
     * @param request ConvertPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConvertPlaybookResponse
     */
    public ConvertPlaybookResponse convertPlaybookWithOptions(ConvertPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            query.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskflow)) {
            body.put("Taskflow", request.taskflow);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertPlaybook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertPlaybookResponse());
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the orchestration product before using this interface.</p>
     * 
     * <b>summary</b> : 
     * <p>Convert XML configuration.</p>
     * 
     * @param request ConvertPlaybookRequest
     * @return ConvertPlaybookResponse
     */
    public ConvertPlaybookResponse convertPlaybook(ConvertPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Copies a playbook.</p>
     * 
     * @param request CopyPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyPlaybookResponse
     */
    public CopyPlaybookResponse copyPlaybookWithOptions(CopyPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            query.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.releaseVersion)) {
            body.put("ReleaseVersion", request.releaseVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePlaybookUuid)) {
            body.put("SourcePlaybookUuid", request.sourcePlaybookUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyPlaybook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyPlaybookResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Copies a playbook.</p>
     * 
     * @param request CopyPlaybookRequest
     * @return CopyPlaybookResponse
     */
    public CopyPlaybookResponse copyPlaybook(CopyPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Create Playbook.</p>
     * 
     * <b>summary</b> : 
     * <p>New Playbook.</p>
     * 
     * @param request CreatePlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePlaybookResponse
     */
    public CreatePlaybookResponse createPlaybookWithOptions(CreatePlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParams)) {
            body.put("InputParams", request.inputParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputParams)) {
            body.put("OutputParams", request.outputParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskflowType)) {
            body.put("TaskflowType", request.taskflowType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePlaybook"),
            new TeaPair("version", "2022-07-28"),
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
     * <b>description</b> :
     * <p>Create Playbook.</p>
     * 
     * <b>summary</b> : 
     * <p>New Playbook.</p>
     * 
     * @param request CreatePlaybookRequest
     * @return CreatePlaybookResponse
     */
    public CreatePlaybookResponse createPlaybook(CreatePlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Debugs a playbook.</p>
     * 
     * @param request DebugPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DebugPlaybookResponse
     */
    public DebugPlaybookResponse debugPlaybookWithOptions(DebugPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.record)) {
            body.put("Record", request.record);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskflow)) {
            body.put("Taskflow", request.taskflow);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DebugPlaybook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DebugPlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Debugs a playbook.</p>
     * 
     * @param request DebugPlaybookRequest
     * @return DebugPlaybookResponse
     */
    public DebugPlaybookResponse debugPlaybook(DebugPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.debugPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the assets in a component.</p>
     * 
     * @param request DeleteComponentAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteComponentAssetResponse
     */
    public DeleteComponentAssetResponse deleteComponentAssetWithOptions(DeleteComponentAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetId)) {
            query.put("AssetId", request.assetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteComponentAsset"),
            new TeaPair("version", "2022-07-28"),
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
     * <b>summary</b> : 
     * <p>Deletes the assets in a component.</p>
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
     * <p>Deletes a custom playbook.</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePlaybook"),
            new TeaPair("version", "2022-07-28"),
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
     * <p>Deletes a custom playbook.</p>
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
     * <p>Queries the metadata of assets in a component. The metadata of an asset refers to the fields that describe the asset.</p>
     * 
     * @param request DescribeComponentAssetFormRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComponentAssetFormResponse
     */
    public DescribeComponentAssetFormResponse describeComponentAssetFormWithOptions(DescribeComponentAssetFormRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComponentAssetForm"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComponentAssetFormResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metadata of assets in a component. The metadata of an asset refers to the fields that describe the asset.</p>
     * 
     * @param request DescribeComponentAssetFormRequest
     * @return DescribeComponentAssetFormResponse
     */
    public DescribeComponentAssetFormResponse describeComponentAssetForm(DescribeComponentAssetFormRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComponentAssetFormWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of assets in a component.</p>
     * 
     * @param request DescribeComponentAssetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComponentAssetsResponse
     */
    public DescribeComponentAssetsResponse describeComponentAssetsWithOptions(DescribeComponentAssetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComponentAssets"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComponentAssetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of assets in a component.</p>
     * 
     * @param request DescribeComponentAssetsRequest
     * @return DescribeComponentAssetsResponse
     */
    public DescribeComponentAssetsResponse describeComponentAssets(DescribeComponentAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComponentAssetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of common components that are available.</p>
     * 
     * @param request DescribeComponentListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComponentListResponse
     */
    public DescribeComponentListResponse describeComponentListWithOptions(DescribeComponentListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComponentList"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComponentListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of common components that are available.</p>
     * 
     * @param request DescribeComponentListRequest
     * @return DescribeComponentListResponse
     */
    public DescribeComponentListResponse describeComponentList(DescribeComponentListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComponentListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of predefined components that are available.</p>
     * 
     * @param request DescribeComponentPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComponentPlaybookResponse
     */
    public DescribeComponentPlaybookResponse describeComponentPlaybookWithOptions(DescribeComponentPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComponentPlaybook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComponentPlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of predefined components that are available.</p>
     * 
     * @param request DescribeComponentPlaybookRequest
     * @return DescribeComponentPlaybookResponse
     */
    public DescribeComponentPlaybookResponse describeComponentPlaybook(DescribeComponentPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComponentPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the JavaScript file of a component. The component uses the returned JavaScript file for page rendering.</p>
     * 
     * @param request DescribeComponentsJsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComponentsJsResponse
     */
    public DescribeComponentsJsResponse describeComponentsJsWithOptions(DescribeComponentsJsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComponentsJs"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComponentsJsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the JavaScript file of a component. The component uses the returned JavaScript file for page rendering.</p>
     * 
     * @param request DescribeComponentsJsRequest
     * @return DescribeComponentsJsResponse
     */
    public DescribeComponentsJsResponse describeComponentsJs(DescribeComponentsJsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComponentsJsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the published versions of a playbook after deduplication.</p>
     * 
     * @param request DescribeDistinctReleasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDistinctReleasesResponse
     */
    public DescribeDistinctReleasesResponse describeDistinctReleasesWithOptions(DescribeDistinctReleasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDistinctReleases"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDistinctReleasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the published versions of a playbook after deduplication.</p>
     * 
     * @param request DescribeDistinctReleasesRequest
     * @return DescribeDistinctReleasesResponse
     */
    public DescribeDistinctReleasesResponse describeDistinctReleases(DescribeDistinctReleasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDistinctReleasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries enumeration items that are required by a cloud service.</p>
     * 
     * @param request DescribeEnumItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnumItemsResponse
     */
    public DescribeEnumItemsResponse describeEnumItemsWithOptions(DescribeEnumItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnumItems"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnumItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries enumeration items that are required by a cloud service.</p>
     * 
     * @param request DescribeEnumItemsRequest
     * @return DescribeEnumItemsResponse
     */
    public DescribeEnumItemsResponse describeEnumItems(DescribeEnumItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnumItemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the playbooks that are available for an automatic response plan.</p>
     * 
     * @param request DescribeExecutePlaybooksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExecutePlaybooksResponse
     */
    public DescribeExecutePlaybooksResponse describeExecutePlaybooksWithOptions(DescribeExecutePlaybooksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExecutePlaybooks"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExecutePlaybooksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the playbooks that are available for an automatic response plan.</p>
     * 
     * @param request DescribeExecutePlaybooksRequest
     * @return DescribeExecutePlaybooksResponse
     */
    public DescribeExecutePlaybooksResponse describeExecutePlaybooks(DescribeExecutePlaybooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExecutePlaybooksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global configuration information about a cloud service.</p>
     * 
     * @param request DescribeFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFieldResponse
     */
    public DescribeFieldResponse describeFieldWithOptions(DescribeFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeField"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global configuration information about a cloud service.</p>
     * 
     * @param request DescribeFieldRequest
     * @return DescribeFieldResponse
     */
    public DescribeFieldResponse describeField(DescribeFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFieldWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries groups of Alibaba Cloud services.</p>
     * 
     * @param request DescribeGroupProductionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupProductionsResponse
     */
    public DescribeGroupProductionsResponse describeGroupProductionsWithOptions(DescribeGroupProductionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupProductions"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupProductionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries groups of Alibaba Cloud services.</p>
     * 
     * @param request DescribeGroupProductionsRequest
     * @return DescribeGroupProductionsResponse
     */
    public DescribeGroupProductionsResponse describeGroupProductions(DescribeGroupProductionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupProductionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the output structure information of each node in a playbook based on the most recent running record of the playbook.</p>
     * 
     * @param request DescribeLatestRecordSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLatestRecordSchemaResponse
     */
    public DescribeLatestRecordSchemaResponse describeLatestRecordSchemaWithOptions(DescribeLatestRecordSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLatestRecordSchema"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLatestRecordSchemaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the output structure information of each node in a playbook based on the most recent running record of the playbook.</p>
     * 
     * @param request DescribeLatestRecordSchemaRequest
     * @return DescribeLatestRecordSchemaResponse
     */
    public DescribeLatestRecordSchemaResponse describeLatestRecordSchema(DescribeLatestRecordSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLatestRecordSchemaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries recommended dynamic input parameters of a component for playbook orchestration.</p>
     * 
     * @param request DescribeNodeParamTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNodeParamTagsResponse
     */
    public DescribeNodeParamTagsResponse describeNodeParamTagsWithOptions(DescribeNodeParamTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNodeParamTags"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNodeParamTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries recommended dynamic input parameters of a component for playbook orchestration.</p>
     * 
     * @param request DescribeNodeParamTagsRequest
     * @return DescribeNodeParamTagsResponse
     */
    public DescribeNodeParamTagsResponse describeNodeParamTags(DescribeNodeParamTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNodeParamTagsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries notification templates.</p>
     * 
     * @param request DescribeNotifyTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNotifyTemplateListResponse
     */
    public DescribeNotifyTemplateListResponse describeNotifyTemplateListWithOptions(DescribeNotifyTemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNotifyTemplateList"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNotifyTemplateListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries notification templates.</p>
     * 
     * @param request DescribeNotifyTemplateListRequest
     * @return DescribeNotifyTemplateListResponse
     */
    public DescribeNotifyTemplateListResponse describeNotifyTemplateList(DescribeNotifyTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNotifyTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an API operation.</p>
     * 
     * @param request DescribeOpenApiInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOpenApiInfoResponse
     */
    public DescribeOpenApiInfoResponse describeOpenApiInfoWithOptions(DescribeOpenApiInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOpenApiInfo"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOpenApiInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an API operation.</p>
     * 
     * @param request DescribeOpenApiInfoRequest
     * @return DescribeOpenApiInfoResponse
     */
    public DescribeOpenApiInfoResponse describeOpenApiInfo(DescribeOpenApiInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOpenApiInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or the pricing for log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the API operations of an Alibaba Cloud service.</p>
     * 
     * @param request DescribeOpenApiListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOpenApiListResponse
     */
    public DescribeOpenApiListResponse describeOpenApiListWithOptions(DescribeOpenApiListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOpenApiList"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOpenApiListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or the pricing for log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the API operations of an Alibaba Cloud service.</p>
     * 
     * @param request DescribeOpenApiListRequest
     * @return DescribeOpenApiListResponse
     */
    public DescribeOpenApiListResponse describeOpenApiList(DescribeOpenApiListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOpenApiListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the XML configuration of a playbook.</p>
     * 
     * @param request DescribePlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePlaybookResponse
     */
    public DescribePlaybookResponse describePlaybookWithOptions(DescribePlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlaybook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the XML configuration of a playbook.</p>
     * 
     * @param request DescribePlaybookRequest
     * @return DescribePlaybookResponse
     */
    public DescribePlaybookResponse describePlaybook(DescribePlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the input and output parameter configurations of a playbook.</p>
     * 
     * @param request DescribePlaybookInputOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePlaybookInputOutputResponse
     */
    public DescribePlaybookInputOutputResponse describePlaybookInputOutputWithOptions(DescribePlaybookInputOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlaybookInputOutput"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlaybookInputOutputResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the input and output parameter configurations of a playbook.</p>
     * 
     * @param request DescribePlaybookInputOutputRequest
     * @return DescribePlaybookInputOutputResponse
     */
    public DescribePlaybookInputOutputResponse describePlaybookInputOutput(DescribePlaybookInputOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlaybookInputOutputWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metrics of a playbook. The metrics include the playbook name, playbook description, the number of times that the playbook is run, and the failure rate of the playbook.</p>
     * 
     * @param request DescribePlaybookMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePlaybookMetricsResponse
     */
    public DescribePlaybookMetricsResponse describePlaybookMetricsWithOptions(DescribePlaybookMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlaybookMetrics"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlaybookMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metrics of a playbook. The metrics include the playbook name, playbook description, the number of times that the playbook is run, and the failure rate of the playbook.</p>
     * 
     * @param request DescribePlaybookMetricsRequest
     * @return DescribePlaybookMetricsResponse
     */
    public DescribePlaybookMetricsResponse describePlaybookMetrics(DescribePlaybookMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlaybookMetricsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical output data of a component node.</p>
     * 
     * @param request DescribePlaybookNodesOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePlaybookNodesOutputResponse
     */
    public DescribePlaybookNodesOutputResponse describePlaybookNodesOutputWithOptions(DescribePlaybookNodesOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlaybookNodesOutput"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlaybookNodesOutputResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical output data of a component node.</p>
     * 
     * @param request DescribePlaybookNodesOutputRequest
     * @return DescribePlaybookNodesOutputResponse
     */
    public DescribePlaybookNodesOutputResponse describePlaybookNodesOutput(DescribePlaybookNodesOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlaybookNodesOutputWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of Security Orchestration Automation Response (SOAR), such as the numbers of created and enabled playbooks.</p>
     * 
     * @param request DescribePlaybookNumberMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePlaybookNumberMetricsResponse
     */
    public DescribePlaybookNumberMetricsResponse describePlaybookNumberMetricsWithOptions(DescribePlaybookNumberMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlaybookNumberMetrics"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlaybookNumberMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of Security Orchestration Automation Response (SOAR), such as the numbers of created and enabled playbooks.</p>
     * 
     * @param request DescribePlaybookNumberMetricsRequest
     * @return DescribePlaybookNumberMetricsResponse
     */
    public DescribePlaybookNumberMetricsResponse describePlaybookNumberMetrics(DescribePlaybookNumberMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlaybookNumberMetricsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the published versions of a playbook.</p>
     * 
     * @param request DescribePlaybookReleasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePlaybookReleasesResponse
     */
    public DescribePlaybookReleasesResponse describePlaybookReleasesWithOptions(DescribePlaybookReleasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlaybookReleases"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlaybookReleasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the published versions of a playbook.</p>
     * 
     * @param request DescribePlaybookReleasesRequest
     * @return DescribePlaybookReleasesResponse
     */
    public DescribePlaybookReleasesResponse describePlaybookReleases(DescribePlaybookReleasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlaybookReleasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of playbooks.</p>
     * 
     * @param request DescribePlaybooksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePlaybooksResponse
     */
    public DescribePlaybooksResponse describePlaybooksWithOptions(DescribePlaybooksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePlaybooks"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePlaybooksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the list of playbooks.</p>
     * 
     * @param request DescribePlaybooksRequest
     * @return DescribePlaybooksResponse
     */
    public DescribePlaybooksResponse describePlaybooks(DescribePlaybooksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePlaybooksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an API operation.</p>
     * 
     * @param request DescribePopApiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePopApiResponse
     */
    public DescribePopApiResponse describePopApiWithOptions(DescribePopApiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePopApi"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePopApiResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an API operation.</p>
     * 
     * @param request DescribePopApiRequest
     * @return DescribePopApiResponse
     */
    public DescribePopApiResponse describePopApi(DescribePopApiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePopApiWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries statistics.</p>
     * 
     * @param request DescribeProcessStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProcessStatisticsResponse
     */
    public DescribeProcessStatisticsResponse describeProcessStatisticsWithOptions(DescribeProcessStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProcessStatistics"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProcessStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries statistics.</p>
     * 
     * @param request DescribeProcessStatisticsRequest
     * @return DescribeProcessStatisticsResponse
     */
    public DescribeProcessStatisticsResponse describeProcessStatistics(DescribeProcessStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProcessStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the number of associated disposal tasks based on the entity UUID.</p>
     * 
     * @param request DescribeProcessTaskCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProcessTaskCountResponse
     */
    public DescribeProcessTaskCountResponse describeProcessTaskCountWithOptions(DescribeProcessTaskCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProcessTaskCount"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProcessTaskCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the number of associated disposal tasks based on the entity UUID.</p>
     * 
     * @param request DescribeProcessTaskCountRequest
     * @return DescribeProcessTaskCountResponse
     */
    public DescribeProcessTaskCountResponse describeProcessTaskCount(DescribeProcessTaskCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProcessTaskCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about handling tasks. When you use Security Orchestration Automation Response (SOAR) to handle events, handling tasks are generated in the handling center.</p>
     * 
     * @param request DescribeProcessTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProcessTasksResponse
     */
    public DescribeProcessTasksResponse describeProcessTasksWithOptions(DescribeProcessTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityName)) {
            query.put("EntityName", request.entityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityUuid)) {
            query.put("EntityUuid", request.entityUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventUuid)) {
            query.put("EventUuid", request.eventUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderField)) {
            query.put("OrderField", request.orderField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramContent)) {
            query.put("ParamContent", request.paramContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processActionEnd)) {
            query.put("ProcessActionEnd", request.processActionEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processActionStart)) {
            query.put("ProcessActionStart", request.processActionStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processRemoveEnd)) {
            query.put("ProcessRemoveEnd", request.processRemoveEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processRemoveStart)) {
            query.put("ProcessRemoveStart", request.processRemoveStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processStrategyUuid)) {
            query.put("ProcessStrategyUuid", request.processStrategyUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reqUuid)) {
            query.put("ReqUuid", request.reqUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskStatus)) {
            query.put("TaskStatus", request.taskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerSource)) {
            query.put("TriggerSource", request.triggerSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yunCode)) {
            query.put("YunCode", request.yunCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProcessTasks"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProcessTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about handling tasks. When you use Security Orchestration Automation Response (SOAR) to handle events, handling tasks are generated in the handling center.</p>
     * 
     * @param request DescribeProcessTasksRequest
     * @return DescribeProcessTasksResponse
     */
    public DescribeProcessTasksResponse describeProcessTasks(DescribeProcessTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProcessTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data that is returned when a component initiates an action in a playbook task.</p>
     * 
     * @param request DescribeSoarRecordActionOutputListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSoarRecordActionOutputListResponse
     */
    public DescribeSoarRecordActionOutputListResponse describeSoarRecordActionOutputListWithOptions(DescribeSoarRecordActionOutputListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSoarRecordActionOutputList"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSoarRecordActionOutputListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data that is returned when a component initiates an action in a playbook task.</p>
     * 
     * @param request DescribeSoarRecordActionOutputListRequest
     * @return DescribeSoarRecordActionOutputListResponse
     */
    public DescribeSoarRecordActionOutputListResponse describeSoarRecordActionOutputList(DescribeSoarRecordActionOutputListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSoarRecordActionOutputListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the input and output data of a component action. You can call this operation after a playbook is run.</p>
     * 
     * @param request DescribeSoarRecordInOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSoarRecordInOutputResponse
     */
    public DescribeSoarRecordInOutputResponse describeSoarRecordInOutputWithOptions(DescribeSoarRecordInOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSoarRecordInOutput"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSoarRecordInOutputResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the input and output data of a component action. You can call this operation after a playbook is run.</p>
     * 
     * @param request DescribeSoarRecordInOutputRequest
     * @return DescribeSoarRecordInOutputResponse
     */
    public DescribeSoarRecordInOutputResponse describeSoarRecordInOutput(DescribeSoarRecordInOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSoarRecordInOutputWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get the execution records of a playbook.</p>
     * 
     * @param request DescribeSoarRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSoarRecordsResponse
     */
    public DescribeSoarRecordsResponse describeSoarRecordsWithOptions(DescribeSoarRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSoarRecords"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSoarRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get the execution records of a playbook.</p>
     * 
     * @param request DescribeSoarRecordsRequest
     * @return DescribeSoarRecordsResponse
     */
    public DescribeSoarRecordsResponse describeSoarRecords(DescribeSoarRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSoarRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution records of a component during the running of a playbook.</p>
     * 
     * @param request DescribeSoarTaskAndActionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSoarTaskAndActionsResponse
     */
    public DescribeSoarTaskAndActionsResponse describeSoarTaskAndActionsWithOptions(DescribeSoarTaskAndActionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSoarTaskAndActions"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSoarTaskAndActionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution records of a component during the running of a playbook.</p>
     * 
     * @param request DescribeSoarTaskAndActionsRequest
     * @return DescribeSoarTaskAndActionsResponse
     */
    public DescribeSoarTaskAndActionsResponse describeSoarTaskAndActions(DescribeSoarTaskAndActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSoarTaskAndActionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the commands that can be run to obtain objects.</p>
     * 
     * @param request DescribeSophonCommandsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSophonCommandsResponse
     */
    public DescribeSophonCommandsResponse describeSophonCommandsWithOptions(DescribeSophonCommandsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSophonCommands"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSophonCommandsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the commands that can be run to obtain objects.</p>
     * 
     * @param request DescribeSophonCommandsRequest
     * @return DescribeSophonCommandsResponse
     */
    public DescribeSophonCommandsResponse describeSophonCommands(DescribeSophonCommandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSophonCommandsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the response orchestration product (i.e., threat analysis and response log access traffic) before using this interface.</p>
     * 
     * <b>summary</b> : 
     * <p>Query OpenApi List of Cloud Vendors.</p>
     * 
     * @param request DescribeVendorApiListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVendorApiListResponse
     */
    public DescribeVendorApiListResponse describeVendorApiListWithOptions(DescribeVendorApiListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiName)) {
            query.put("ApiName", request.apiName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWord)) {
            query.put("KeyWord", request.keyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorCode)) {
            query.put("VendorCode", request.vendorCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVendorApiList"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVendorApiListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the response orchestration product (i.e., threat analysis and response log access traffic) before using this interface.</p>
     * 
     * <b>summary</b> : 
     * <p>Query OpenApi List of Cloud Vendors.</p>
     * 
     * @param request DescribeVendorApiListRequest
     * @return DescribeVendorApiListResponse
     */
    public DescribeVendorApiListResponse describeVendorApiList(DescribeVendorApiListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVendorApiListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operational logs of a Python3 script by using the UUID that is returned when the script is run. The UUID is specified by requestUuid.</p>
     * 
     * @param request DescriberPython3ScriptLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescriberPython3ScriptLogsResponse
     */
    public DescriberPython3ScriptLogsResponse describerPython3ScriptLogsWithOptions(DescriberPython3ScriptLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescriberPython3ScriptLogs"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescriberPython3ScriptLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operational logs of a Python3 script by using the UUID that is returned when the script is run. The UUID is specified by requestUuid.</p>
     * 
     * @param request DescriberPython3ScriptLogsRequest
     * @return DescriberPython3ScriptLogsResponse
     */
    public DescriberPython3ScriptLogsResponse describerPython3ScriptLogs(DescriberPython3ScriptLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describerPython3ScriptLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about the asset that is configured for a component.</p>
     * 
     * @param request ModifyComponentAssetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyComponentAssetResponse
     */
    public ModifyComponentAssetResponse modifyComponentAssetWithOptions(ModifyComponentAssetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assetConfig)) {
            query.put("AssetConfig", request.assetConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyComponentAsset"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyComponentAssetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about the asset that is configured for a component.</p>
     * 
     * @param request ModifyComponentAssetRequest
     * @return ModifyComponentAssetResponse
     */
    public ModifyComponentAssetResponse modifyComponentAsset(ModifyComponentAssetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyComponentAssetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a playbook.</p>
     * 
     * @param request ModifyPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPlaybookResponse
     */
    public ModifyPlaybookResponse modifyPlaybookWithOptions(ModifyPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskflow)) {
            body.put("Taskflow", request.taskflow);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPlaybook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configuration of a playbook.</p>
     * 
     * @param request ModifyPlaybookRequest
     * @return ModifyPlaybookResponse
     */
    public ModifyPlaybookResponse modifyPlaybook(ModifyPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the input and output parameters of a playbook.</p>
     * 
     * @param request ModifyPlaybookInputOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPlaybookInputOutputResponse
     */
    public ModifyPlaybookInputOutputResponse modifyPlaybookInputOutputWithOptions(ModifyPlaybookInputOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exeConfig)) {
            body.put("ExeConfig", request.exeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParams)) {
            body.put("InputParams", request.inputParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            body.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputParams)) {
            body.put("OutputParams", request.outputParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramType)) {
            body.put("ParamType", request.paramType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPlaybookInputOutput"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPlaybookInputOutputResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the input and output parameters of a playbook.</p>
     * 
     * @param request ModifyPlaybookInputOutputRequest
     * @return ModifyPlaybookInputOutputResponse
     */
    public ModifyPlaybookInputOutputResponse modifyPlaybookInputOutput(ModifyPlaybookInputOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPlaybookInputOutputWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Publishes the playbook. After the playbook is published, the playbook runs based on the new logic.</p>
     * 
     * @param request PublishPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishPlaybookResponse
     */
    public PublishPlaybookResponse publishPlaybookWithOptions(PublishPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishPlaybook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishPlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Publishes the playbook. After the playbook is published, the playbook runs based on the new logic.</p>
     * 
     * @param request PublishPlaybookRequest
     * @return PublishPlaybookResponse
     */
    public PublishPlaybookResponse publishPlaybook(PublishPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all playbooks at a time.</p>
     * 
     * @param request QueryTreeDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTreeDataResponse
     */
    public QueryTreeDataResponse queryTreeDataWithOptions(QueryTreeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTreeData"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTreeDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all playbooks at a time.</p>
     * 
     * @param request QueryTreeDataRequest
     * @return QueryTreeDataResponse
     */
    public QueryTreeDataResponse queryTreeData(QueryTreeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTreeDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back a playbook to a specific version. You can determine whether to publish the new playbook version during the rollback.</p>
     * 
     * @param request RevertPlaybookReleaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevertPlaybookReleaseResponse
     */
    public RevertPlaybookReleaseResponse revertPlaybookReleaseWithOptions(RevertPlaybookReleaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isPublish)) {
            body.put("IsPublish", request.isPublish);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playReleaseId)) {
            body.put("PlayReleaseId", request.playReleaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevertPlaybookRelease"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevertPlaybookReleaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back a playbook to a specific version. You can determine whether to publish the new playbook version during the rollback.</p>
     * 
     * @param request RevertPlaybookReleaseRequest
     * @return RevertPlaybookReleaseResponse
     */
    public RevertPlaybookReleaseResponse revertPlaybookRelease(RevertPlaybookReleaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revertPlaybookReleaseWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Runs the email notification component to send messages.</p>
     * 
     * @param request RunNotifyComponentWithEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunNotifyComponentWithEmailResponse
     */
    public RunNotifyComponentWithEmailResponse runNotifyComponentWithEmailWithOptions(RunNotifyComponentWithEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetId)) {
            query.put("AssetId", request.assetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            query.put("ComponentName", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            query.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            query.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receivers)) {
            query.put("Receivers", request.receivers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            query.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            query.put("Subject", request.subject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunNotifyComponentWithEmail"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunNotifyComponentWithEmailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Runs the email notification component to send messages.</p>
     * 
     * @param request RunNotifyComponentWithEmailRequest
     * @return RunNotifyComponentWithEmailResponse
     */
    public RunNotifyComponentWithEmailResponse runNotifyComponentWithEmail(RunNotifyComponentWithEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runNotifyComponentWithEmailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the response orchestration product (i.e., Threat Analysis and Response Log Access Traffic) before using this interface.</p>
     * 
     * <b>summary</b> : 
     * <p>Execute Notification Component - Send Message via Message Center.</p>
     * 
     * @param request RunNotifyComponentWithMessageCenterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunNotifyComponentWithMessageCenterResponse
     */
    public RunNotifyComponentWithMessageCenterResponse runNotifyComponentWithMessageCenterWithOptions(RunNotifyComponentWithMessageCenterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliuid)) {
            query.put("Aliuid", request.aliuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetId)) {
            query.put("AssetId", request.assetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelTypeList)) {
            query.put("ChannelTypeList", request.channelTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            query.put("ComponentName", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            query.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            query.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            query.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunNotifyComponentWithMessageCenter"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunNotifyComponentWithMessageCenterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/sas/detail/sas">pricing</a> of the response orchestration product (i.e., Threat Analysis and Response Log Access Traffic) before using this interface.</p>
     * 
     * <b>summary</b> : 
     * <p>Execute Notification Component - Send Message via Message Center.</p>
     * 
     * @param request RunNotifyComponentWithMessageCenterRequest
     * @return RunNotifyComponentWithMessageCenterResponse
     */
    public RunNotifyComponentWithMessageCenterResponse runNotifyComponentWithMessageCenter(RunNotifyComponentWithMessageCenterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runNotifyComponentWithMessageCenterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Runs the webhook notification component to send messages.</p>
     * 
     * @param request RunNotifyComponentWithWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunNotifyComponentWithWebhookResponse
     */
    public RunNotifyComponentWithWebhookResponse runNotifyComponentWithWebhookWithOptions(RunNotifyComponentWithWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionName)) {
            query.put("ActionName", request.actionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetId)) {
            query.put("AssetId", request.assetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            query.put("ComponentName", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgType)) {
            query.put("MsgType", request.msgType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            query.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            query.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleFor)) {
            query.put("RoleFor", request.roleFor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleType)) {
            query.put("RoleType", request.roleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secret)) {
            query.put("Secret", request.secret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhook)) {
            query.put("Webhook", request.webhook);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunNotifyComponentWithWebhook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunNotifyComponentWithWebhookResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR) or pricing for the log data added to the Cloud Threat Detection and Response (CTDR) feature. For more information, see <a href="https://www.aliyun.com/price/product#/sas/detail/sas">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Runs the webhook notification component to send messages.</p>
     * 
     * @param request RunNotifyComponentWithWebhookRequest
     * @return RunNotifyComponentWithWebhookResponse
     */
    public RunNotifyComponentWithWebhookResponse runNotifyComponentWithWebhook(RunNotifyComponentWithWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runNotifyComponentWithWebhookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.alibabacloud.com/en/pricing-calculator?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.4c41281fWhbdPa#/commodity/vm_intl">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits and runs a Python3 script. You can call this operation only for data processing.</p>
     * 
     * @param request RunPython3ScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunPython3ScriptResponse
     */
    public RunPython3ScriptResponse runPython3ScriptWithOptions(RunPython3ScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pythonVersion)) {
            query.put("PythonVersion", request.pythonVersion);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            body.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pythonScript)) {
            body.put("PythonScript", request.pythonScript);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunPython3Script"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunPython3ScriptResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing method and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.alibabacloud.com/en/pricing-calculator?_p_lc=1&spm=openapi-amp.newDocPublishment.0.0.4c41281fWhbdPa#/commodity/vm_intl">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits and runs a Python3 script. You can call this operation only for data processing.</p>
     * 
     * @param request RunPython3ScriptRequest
     * @return RunPython3ScriptResponse
     */
    public RunPython3ScriptResponse runPython3Script(RunPython3ScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runPython3ScriptWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.alibabacloud.com/en/pricing-calculator?_p_lc=1&spm=a2796.7960336.3034855210.1.7adab91arMeIx2#/commodity/vm_intl">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers an enabled custom playbook or a predefined playbook.</p>
     * 
     * @param request TriggerPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerPlaybookResponse
     */
    public TriggerPlaybookResponse triggerPlaybookWithOptions(TriggerPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputParam)) {
            body.put("InputParam", request.inputParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerPlaybook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerPlaybookResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.alibabacloud.com/en/pricing-calculator?_p_lc=1&spm=a2796.7960336.3034855210.1.7adab91arMeIx2#/commodity/vm_intl">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers an enabled custom playbook or a predefined playbook.</p>
     * 
     * @param request TriggerPlaybookRequest
     * @return TriggerPlaybookResponse
     */
    public TriggerPlaybookResponse triggerPlaybook(TriggerPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs an action on a handling task that is generated by the handling center when an event is handled by using Security Orchestration Automation Response (SOAR). For example, you can call this operation to cancel blocking or isolation, or retry blocking.</p>
     * 
     * @param request TriggerProcessTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerProcessTaskResponse
     */
    public TriggerProcessTaskResponse triggerProcessTaskWithOptions(TriggerProcessTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerProcessTask"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerProcessTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs an action on a handling task that is generated by the handling center when an event is handled by using Security Orchestration Automation Response (SOAR). For example, you can call this operation to cancel blocking or isolation, or retry blocking.</p>
     * 
     * @param request TriggerProcessTaskRequest
     * @return TriggerProcessTaskResponse
     */
    public TriggerProcessTaskResponse triggerProcessTask(TriggerProcessTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerProcessTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.alibabacloud.com/en/pricing-calculator?_p_lc=1&spm=a2796.7960336.3034855210.1.7adab91arMeIx2#/commodity/vm_intl">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers a playbook or a command.</p>
     * 
     * @param request TriggerSophonPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerSophonPlaybookResponse
     */
    public TriggerSophonPlaybookResponse triggerSophonPlaybookWithOptions(TriggerSophonPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commandName)) {
            query.put("CommandName", request.commandName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParams)) {
            query.put("InputParams", request.inputParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sophonTaskId)) {
            query.put("SophonTaskId", request.sophonTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerSophonPlaybook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerSophonPlaybookResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing methods and pricing of Security Orchestration Automation Response (SOAR). For more information, see <a href="https://www.alibabacloud.com/en/pricing-calculator?_p_lc=1&spm=a2796.7960336.3034855210.1.7adab91arMeIx2#/commodity/vm_intl">Pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers a playbook or a command.</p>
     * 
     * @param request TriggerSophonPlaybookRequest
     * @return TriggerSophonPlaybookResponse
     */
    public TriggerSophonPlaybookResponse triggerSophonPlaybook(TriggerSophonPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerSophonPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the configuration of the playbook is correct and whether the logic of the orchestration is reasonable.</p>
     * 
     * @param request VerifyPlaybookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyPlaybookResponse
     */
    public VerifyPlaybookResponse verifyPlaybookWithOptions(VerifyPlaybookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.playbookUuid)) {
            body.put("PlaybookUuid", request.playbookUuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskFlow)) {
            body.put("TaskFlow", request.taskFlow);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyPlaybook"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyPlaybookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the configuration of the playbook is correct and whether the logic of the orchestration is reasonable.</p>
     * 
     * @param request VerifyPlaybookRequest
     * @return VerifyPlaybookResponse
     */
    public VerifyPlaybookResponse verifyPlaybook(VerifyPlaybookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyPlaybookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the syntax of a Python code snippet is correct.</p>
     * 
     * @param request VerifyPythonFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyPythonFileResponse
     */
    public VerifyPythonFileResponse verifyPythonFileWithOptions(VerifyPythonFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyPythonFile"),
            new TeaPair("version", "2022-07-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyPythonFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the syntax of a Python code snippet is correct.</p>
     * 
     * @param request VerifyPythonFileRequest
     * @return VerifyPythonFileResponse
     */
    public VerifyPythonFileResponse verifyPythonFile(VerifyPythonFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyPythonFileWithOptions(request, runtime);
    }
}
