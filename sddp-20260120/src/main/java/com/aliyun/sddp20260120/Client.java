// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120;

import com.aliyun.tea.*;
import com.aliyun.sddp20260120.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hongkong", "sddp-api.cn-hongkong.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sddp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Checks the permissions, engine, and runtime conditions of an instance before creating column encryption rules. Check both ErrorCode and ErrorMessage in the response. Only ErrorCode=Success indicates that the check passed. A successful request alone does not mean the instance meets all encryption conditions. This check does not create column encryption rules.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained from your account.
     * Use the service registration endpoint of the region where the target asset resides, and configure the common parameter RegionId to the corresponding value, such as cn-zhangjiakou. The product code and instance identifier must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks the prerequisites for column encryption on an instance.</p>
     * 
     * @param request CheckDataMaskingInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDataMaskingInstanceResponse
     */
    public CheckDataMaskingInstanceResponse checkDataMaskingInstanceWithOptions(CheckDataMaskingInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDataMaskingInstance"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDataMaskingInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Checks the permissions, engine, and runtime conditions of an instance before creating column encryption rules. Check both ErrorCode and ErrorMessage in the response. Only ErrorCode=Success indicates that the check passed. A successful request alone does not mean the instance meets all encryption conditions. This check does not create column encryption rules.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained from your account.
     * Use the service registration endpoint of the region where the target asset resides, and configure the common parameter RegionId to the corresponding value, such as cn-zhangjiakou. The product code and instance identifier must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks the prerequisites for column encryption on an instance.</p>
     * 
     * @param request CheckDataMaskingInstanceRequest
     * @return CheckDataMaskingInstanceResponse
     */
    public CheckDataMaskingInstanceResponse checkDataMaskingInstance(CheckDataMaskingInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDataMaskingInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a column encryption rule for a specified database, table, and columns under the same instance. Before invoking this operation, verify the instance status, supported algorithms, key, target columns, and accounts. SubRuleList is a list of target columns grouped by table. Columns is a comma-separated string of column names. Accounts in UserList are granted fullAccess plaintext access permissions. A successful request indicates only that the request has been accepted. You must invoke <a href="https://help.aliyun.com/document_detail/2859325.html">ListDataMaskingColumns</a> and <a href="https://help.aliyun.com/document_detail/2859330.html">ListDataAssetAccounts</a> to confirm the column status, account access permissions, and expiration time.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only RequestId. A successful request does not mean that the operation is complete. Read back the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a column encryption rule.</p>
     * 
     * @param tmpReq CreateDataMaskingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataMaskingRuleResponse
     */
    public CreateDataMaskingRuleResponse createDataMaskingRuleWithOptions(CreateDataMaskingRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataMaskingRuleShrinkRequest request = new CreateDataMaskingRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subRuleList)) {
            request.subRuleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subRuleList, "SubRuleList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userList)) {
            request.userListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userList, "UserList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encAlgorithm)) {
            query.put("EncAlgorithm", request.encAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKeyId)) {
            query.put("EncryptionKeyId", request.encryptionKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKeyMode)) {
            query.put("EncryptionKeyMode", request.encryptionKeyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTimeOperation)) {
            query.put("ExpireTimeOperation", request.expireTimeOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskHandleId)) {
            query.put("RiskHandleId", request.riskHandleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subRuleListShrink)) {
            query.put("SubRuleList", request.subRuleListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userListShrink)) {
            query.put("UserList", request.userListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataMaskingRule"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataMaskingRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a column encryption rule for a specified database, table, and columns under the same instance. Before invoking this operation, verify the instance status, supported algorithms, key, target columns, and accounts. SubRuleList is a list of target columns grouped by table. Columns is a comma-separated string of column names. Accounts in UserList are granted fullAccess plaintext access permissions. A successful request indicates only that the request has been accepted. You must invoke <a href="https://help.aliyun.com/document_detail/2859325.html">ListDataMaskingColumns</a> and <a href="https://help.aliyun.com/document_detail/2859330.html">ListDataAssetAccounts</a> to confirm the column status, account access permissions, and expiration time.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only RequestId. A successful request does not mean that the operation is complete. Read back the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a column encryption rule.</p>
     * 
     * @param request CreateDataMaskingRuleRequest
     * @return CreateDataMaskingRuleResponse
     */
    public CreateDataMaskingRuleResponse createDataMaskingRule(CreateDataMaskingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataMaskingRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Disables column encryption rules for specified columns within the same instance. SubRuleList precisely specifies the database, table, and columns. If no matching rule is found, no new operation object is created. The disable request is processed asynchronously. Use ListDataMaskingColumns to verify that the column has recovered to NotEncrypted or that the target rule has been removed. DeleteFailed indicates that the shutdown failed.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained by querying your current account.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId to the corresponding value, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only RequestId. Request acceptance does not indicate that the business operation is complete. Poll the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables encryption for specified columns.</p>
     * 
     * @param tmpReq DeleteDataMaskingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataMaskingRuleResponse
     */
    public DeleteDataMaskingRuleResponse deleteDataMaskingRuleWithOptions(DeleteDataMaskingRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteDataMaskingRuleShrinkRequest request = new DeleteDataMaskingRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subRuleList)) {
            request.subRuleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subRuleList, "SubRuleList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subRuleListShrink)) {
            query.put("SubRuleList", request.subRuleListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataMaskingRule"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataMaskingRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Disables column encryption rules for specified columns within the same instance. SubRuleList precisely specifies the database, table, and columns. If no matching rule is found, no new operation object is created. The disable request is processed asynchronously. Use ListDataMaskingColumns to verify that the column has recovered to NotEncrypted or that the target rule has been removed. DeleteFailed indicates that the shutdown failed.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained by querying your current account.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId to the corresponding value, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only RequestId. Request acceptance does not indicate that the business operation is complete. Poll the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables encryption for specified columns.</p>
     * 
     * @param request DeleteDataMaskingRuleRequest
     * @return DeleteDataMaskingRuleResponse
     */
    public DeleteDataMaskingRuleResponse deleteDataMaskingRule(DeleteDataMaskingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataMaskingRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the permission statistics of database accounts in the current region by product scope. Plaintext accounts correspond to FullAccessCount. Restricted access and decryption-prohibited accounts are counted in RestrictedAccessCount and NoneAccessCount, respectively. The number of accounts without configured permissions can be obtained by subtracting the preceding three account types from TotalCount. This operation does not accept filter conditions such as instance, database, table, or column.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained by querying the current account.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId to the corresponding value, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the permission statistics of column encryption accounts.</p>
     * 
     * @param request GetDataMaskingAccountCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataMaskingAccountCountResponse
     */
    public GetDataMaskingAccountCountResponse getDataMaskingAccountCountWithOptions(GetDataMaskingAccountCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productIds)) {
            query.put("ProductIds", request.productIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataMaskingAccountCount"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataMaskingAccountCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the permission statistics of database accounts in the current region by product scope. Plaintext accounts correspond to FullAccessCount. Restricted access and decryption-prohibited accounts are counted in RestrictedAccessCount and NoneAccessCount, respectively. The number of accounts without configured permissions can be obtained by subtracting the preceding three account types from TotalCount. This operation does not accept filter conditions such as instance, database, table, or column.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained by querying the current account.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId to the corresponding value, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the permission statistics of column encryption accounts.</p>
     * 
     * @param request GetDataMaskingAccountCountRequest
     * @return GetDataMaskingAccountCountResponse
     */
    public GetDataMaskingAccountCountResponse getDataMaskingAccountCount(GetDataMaskingAccountCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataMaskingAccountCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the total number of columns, the number of sensitive columns, the number of encrypted columns, and the number of columns that failed to be encrypted by region, product, and categorization template. This operation returns statistics card data and does not follow the instance, database name, table name, column name, or model filters in the column list.
     * For compatible with historical detection results, if no initial results are found for the specified template and no filtering by sensitivity level or detection model is applied, the results may backoff to built-in general detection results. To enforce strict template ownership, verify the results by using the sensitivity level or model conditions within the template.
     * The parameter examples are provided only to illustrate the format. Replace the values with the regions, resource identifiers, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries column encryption statistics.</p>
     * 
     * @param request GetDataMaskingColumnCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataMaskingColumnCountResponse
     */
    public GetDataMaskingColumnCountResponse getDataMaskingColumnCountWithOptions(GetDataMaskingColumnCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productIds)) {
            query.put("ProductIds", request.productIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataMaskingColumnCount"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataMaskingColumnCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the total number of columns, the number of sensitive columns, the number of encrypted columns, and the number of columns that failed to be encrypted by region, product, and categorization template. This operation returns statistics card data and does not follow the instance, database name, table name, column name, or model filters in the column list.
     * For compatible with historical detection results, if no initial results are found for the specified template and no filtering by sensitivity level or detection model is applied, the results may backoff to built-in general detection results. To enforce strict template ownership, verify the results by using the sensitivity level or model conditions within the template.
     * The parameter examples are provided only to illustrate the format. Replace the values with the regions, resource identifiers, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries column encryption statistics.</p>
     * 
     * @param request GetDataMaskingColumnCountRequest
     * @return GetDataMaskingColumnCountResponse
     */
    public GetDataMaskingColumnCountResponse getDataMaskingColumnCount(GetDataMaskingColumnCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataMaskingColumnCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the DPI engine, current kernel version, O&amp;M window, and KMS encryption support of an instance. After a kernel upgrade, you can read back CurrentKernelVersion to verify the target version. If ErrorCode or ErrorMessage is present, handle the property query exception first.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides, and configure the common parameter RegionId in Settings, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the engine and kernel properties of an instance.</p>
     * 
     * @param request GetInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceAttributeResponse
     */
    public GetInstanceAttributeResponse getInstanceAttributeWithOptions(GetInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceAttribute"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the DPI engine, current kernel version, O&amp;M window, and KMS encryption support of an instance. After a kernel upgrade, you can read back CurrentKernelVersion to verify the target version. If ErrorCode or ErrorMessage is present, handle the property query exception first.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides, and configure the common parameter RegionId in Settings, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the engine and kernel properties of an instance.</p>
     * 
     * @param request GetInstanceAttributeRequest
     * @return GetInstanceAttributeResponse
     */
    public GetInstanceAttributeResponse getInstanceAttribute(GetInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries columns and detection results of a data table with paging. When both DataAssetSourceId and InstanceName are specified, DataAssetSourceId takes precedence. For PostgreSQL and Oracle scenarios, you can use the schema.table format for TableName and pass in the corresponding EngineType. To query the execute status of column encryption, invoke ListDataMaskingColumns.
     * For compatible with historical detection results, if the specified template has no initial results and no filtering by sensitivity level or detection model is applied, the results may fall back to built-in general detection results. To strictly verify template ownership, use the sensitivity level or model conditions within the template for verification.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries columns and detection results of a data table.</p>
     * 
     * @param request ListColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListColumnsResponse
     */
    public ListColumnsResponse listColumnsWithOptions(ListColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataAssetSourceId)) {
            query.put("DataAssetSourceId", request.dataAssetSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            query.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevelId)) {
            query.put("RiskLevelId", request.riskLevelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListColumns"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListColumnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries columns and detection results of a data table with paging. When both DataAssetSourceId and InstanceName are specified, DataAssetSourceId takes precedence. For PostgreSQL and Oracle scenarios, you can use the schema.table format for TableName and pass in the corresponding EngineType. To query the execute status of column encryption, invoke ListDataMaskingColumns.
     * For compatible with historical detection results, if the specified template has no initial results and no filtering by sensitivity level or detection model is applied, the results may fall back to built-in general detection results. To strictly verify template ownership, use the sensitivity level or model conditions within the template for verification.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries columns and detection results of a data table.</p>
     * 
     * @param request ListColumnsRequest
     * @return ListColumnsResponse
     */
    public ListColumnsResponse listColumns(ListColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listColumnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries database accounts and their column encryption access permissions with paging. Use this operation to select plaintext accounts when creating rules, and to verify AuthRole, EncryptionKeyMode, and ExpireTime before and after modifying account permissions. AccountName filters by exact account name. The account identity is obtained from Items[].Id.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained from your current account query.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries database accounts and column encryption permissions.</p>
     * 
     * @param request ListDataAssetAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataAssetAccountsResponse
     */
    public ListDataAssetAccountsResponse listDataAssetAccountsWithOptions(ListDataAssetAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authRole)) {
            query.put("AuthRole", request.authRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productIds)) {
            query.put("ProductIds", request.productIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataAssetAccounts"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataAssetAccountsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries database accounts and their column encryption access permissions with paging. Use this operation to select plaintext accounts when creating rules, and to verify AuthRole, EncryptionKeyMode, and ExpireTime before and after modifying account permissions. AccountName filters by exact account name. The account identity is obtained from Items[].Id.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained from your current account query.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries database accounts and column encryption permissions.</p>
     * 
     * @param request ListDataAssetAccountsRequest
     * @return ListDataAssetAccountsResponse
     */
    public ListDataAssetAccountsResponse listDataAssetAccounts(ListDataAssetAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataAssetAccountsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query on columns and their encryption status, sensitivity levels, and detection models. You can filter results by combining template, product, instance, database, table, column name, model, and sensitivity level. Use this operation to read back results after creating or shutting down a rule. Processing and Deleting are intermediate states. Failed and DeleteFailed indicate operation failures. The casing of the parameter name RiskLeveLId must be preserved as-is.
     * When querying by product, use a single ProductId or the corresponding ProductCode. Column queries do not support multi-product filtering through ProductIds. Query each product separately for multi-product scenarios.
     * For compatibility with historical detection results, if no first-page results are found for the specified template and no sensitivity level or detection model filter is applied, the results may fall back to built-in general detection results. To enforce strict template ownership, also use a level or model condition from that template for verification.
     * Parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, for example, cn-zhangjiakou. The product code and instance identifier must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the encryption status and detection results of columns.</p>
     * 
     * @param request ListDataMaskingColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataMaskingColumnsResponse
     */
    public ListDataMaskingColumnsResponse listDataMaskingColumnsWithOptions(ListDataMaskingColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maskingStatus)) {
            query.put("MaskingStatus", request.maskingStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productIds)) {
            query.put("ProductIds", request.productIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLeveLId)) {
            query.put("RiskLeveLId", request.riskLeveLId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevelIds)) {
            query.put("RiskLevelIds", request.riskLevelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateRuleIds)) {
            query.put("TemplateRuleIds", request.templateRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataMaskingColumns"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataMaskingColumnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query on columns and their encryption status, sensitivity levels, and detection models. You can filter results by combining template, product, instance, database, table, column name, model, and sensitivity level. Use this operation to read back results after creating or shutting down a rule. Processing and Deleting are intermediate states. Failed and DeleteFailed indicate operation failures. The casing of the parameter name RiskLeveLId must be preserved as-is.
     * When querying by product, use a single ProductId or the corresponding ProductCode. Column queries do not support multi-product filtering through ProductIds. Query each product separately for multi-product scenarios.
     * For compatibility with historical detection results, if no first-page results are found for the specified template and no sensitivity level or detection model filter is applied, the results may fall back to built-in general detection results. To enforce strict template ownership, also use a level or model condition from that template for verification.
     * Parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, for example, cn-zhangjiakou. The product code and instance identifier must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the encryption status and detection results of columns.</p>
     * 
     * @param request ListDataMaskingColumnsRequest
     * @return ListDataMaskingColumnsResponse
     */
    public ListDataMaskingColumnsResponse listDataMaskingColumns(ListDataMaskingColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataMaskingColumnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the available column encryption algorithms for a specified instance and the restriction reasons for each algorithm. Before selecting an algorithm, check the ErrorCode and ErrorMessage of the corresponding entry. Do not assume that all instances support the same set of algorithms.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your current account.
     * Use the service registration endpoint of the region where the target asset resides, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identifier must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the column encryption algorithms supported by an instance.</p>
     * 
     * @param request ListDataMaskingEncryptionAlgorithmsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataMaskingEncryptionAlgorithmsResponse
     */
    public ListDataMaskingEncryptionAlgorithmsResponse listDataMaskingEncryptionAlgorithmsWithOptions(ListDataMaskingEncryptionAlgorithmsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataMaskingEncryptionAlgorithms"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataMaskingEncryptionAlgorithmsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the available column encryption algorithms for a specified instance and the restriction reasons for each algorithm. Before selecting an algorithm, check the ErrorCode and ErrorMessage of the corresponding entry. Do not assume that all instances support the same set of algorithms.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your current account.
     * Use the service registration endpoint of the region where the target asset resides, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identifier must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the column encryption algorithms supported by an instance.</p>
     * 
     * @param request ListDataMaskingEncryptionAlgorithmsRequest
     * @return ListDataMaskingEncryptionAlgorithmsResponse
     */
    public ListDataMaskingEncryptionAlgorithmsResponse listDataMaskingEncryptionAlgorithms(ListDataMaskingEncryptionAlgorithmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataMaskingEncryptionAlgorithmsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries column encryption instances by paging and supports filtering by product, detection template, and database/table/column. Instance-level status filtering differs from column-level status filtering in scope. To find all unencrypted sensitive columns, first enumerate the instances of the target product, and then use ListDataMaskingColumns to filter by NotEncrypted. This prevents you from missing instances that are partially encrypted.
     * To filter precisely by EngineType, read all candidate pages and then filter by the returned values. Some query paths do not apply this parameter. The matching semantics of InstanceId vary depending on the query combination. To precisely locate an instance, verify the complete instance identity in the response.
     * The parameter examples are provided only to illustrate the format. Replace the values with the region IDs, resource identities, and configuration values that you obtain from your account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries column encryption instances.</p>
     * 
     * @param request ListDataMaskingInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataMaskingInstancesResponse
     */
    public ListDataMaskingInstancesResponse listDataMaskingInstancesWithOptions(ListDataMaskingInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maskingStatus)) {
            query.put("MaskingStatus", request.maskingStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTagId)) {
            query.put("ModelTagId", request.modelTagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productIds)) {
            query.put("ProductIds", request.productIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevelId)) {
            query.put("RiskLevelId", request.riskLevelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevelIds)) {
            query.put("RiskLevelIds", request.riskLevelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateRuleIds)) {
            query.put("TemplateRuleIds", request.templateRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataMaskingInstances"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataMaskingInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries column encryption instances by paging and supports filtering by product, detection template, and database/table/column. Instance-level status filtering differs from column-level status filtering in scope. To find all unencrypted sensitive columns, first enumerate the instances of the target product, and then use ListDataMaskingColumns to filter by NotEncrypted. This prevents you from missing instances that are partially encrypted.
     * To filter precisely by EngineType, read all candidate pages and then filter by the returned values. Some query paths do not apply this parameter. The matching semantics of InstanceId vary depending on the query combination. To precisely locate an instance, verify the complete instance identity in the response.
     * The parameter examples are provided only to illustrate the format. Replace the values with the region IDs, resource identities, and configuration values that you obtain from your account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries column encryption instances.</p>
     * 
     * @param request ListDataMaskingInstancesRequest
     * @return ListDataMaskingInstancesResponse
     */
    public ListDataMaskingInstancesResponse listDataMaskingInstances(ListDataMaskingInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataMaskingInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query on managed data sources by using paging. In relational database scenarios, locate the instance by using ProductCode and InstanceId, and select a database from Items[].DbName. This operation queries the database inventory and does not filter by data categorization and classification templates.
     * Parameter examples are for format illustration only. Replace them with the region, resource identity, and configuration values obtained from the current account when you invoke this operation.
     * Use the service registration endpoint of the region where the target asset resides and configure the settings of the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the databases of an instance.</p>
     * 
     * @param request ListDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSourcesWithOptions(ListDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectStatus)) {
            query.put("ConnectStatus", request.connectStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataAssetId)) {
            query.put("DataAssetId", request.dataAssetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identifyStatus)) {
            query.put("IdentifyStatus", request.identifyStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query on managed data sources by using paging. In relational database scenarios, locate the instance by using ProductCode and InstanceId, and select a database from Items[].DbName. This operation queries the database inventory and does not filter by data categorization and classification templates.
     * Parameter examples are for format illustration only. Replace them with the region, resource identity, and configuration values obtained from the current account when you invoke this operation.
     * Use the service registration endpoint of the region where the target asset resides and configure the settings of the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the databases of an instance.</p>
     * 
     * @param request ListDataSourcesRequest
     * @return ListDataSourcesResponse
     */
    public ListDataSourcesResponse listDataSources(ListDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the valid sensitive data detection models within a specified template and returns RuleList. If TemplateId is not specified, the currently enabled template is used. Use RuleList[].Id to obtain model identifiers, which can be used for filtering with TemplateRuleIds.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sensitive data detection models of a template.</p>
     * 
     * @param request ListIdentifyModelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentifyModelsResponse
     */
    public ListIdentifyModelsResponse listIdentifyModelsWithOptions(ListIdentifyModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterAuditModel)) {
            query.put("FilterAuditModel", request.filterAuditModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentifyModels"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdentifyModelsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the valid sensitive data detection models within a specified template and returns RuleList. If TemplateId is not specified, the currently enabled template is used. Use RuleList[].Id to obtain model identifiers, which can be used for filtering with TemplateRuleIds.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sensitive data detection models of a template.</p>
     * 
     * @param request ListIdentifyModelsRequest
     * @return ListIdentifyModelsResponse
     */
    public ListIdentifyModelsResponse listIdentifyModels(ListIdentifyModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdentifyModelsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the available KMS key identities and aliases for column encryption configuration of a specified instance. Before using a KMS key, verify the key status and usage conditions by invoking the DescribeKey operation of KMS. This operation does not return key plaintext.
     * The parameter examples are provided only to illustrate the format. Replace them with the regions, resource identities, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available KMS keys for column encryption.</p>
     * 
     * @param request ListKmsKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKmsKeysResponse
     */
    public ListKmsKeysResponse listKmsKeysWithOptions(ListKmsKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKmsKeys"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKmsKeysResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the available KMS key identities and aliases for column encryption configuration of a specified instance. Before using a KMS key, verify the key status and usage conditions by invoking the DescribeKey operation of KMS. This operation does not return key plaintext.
     * The parameter examples are provided only to illustrate the format. Replace them with the regions, resource identities, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available KMS keys for column encryption.</p>
     * 
     * @param request ListKmsKeysRequest
     * @return ListKmsKeysResponse
     */
    public ListKmsKeysResponse listKmsKeys(ListKmsKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listKmsKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the kernel versions available for an instance. When upgrading, select the target version from KernelVersions[].KernelVersion. Do not manually construct version numbers.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available kernel versions for upgrade.</p>
     * 
     * @param request ListMiniEngineVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMiniEngineVersionsResponse
     */
    public ListMiniEngineVersionsResponse listMiniEngineVersionsWithOptions(ListMiniEngineVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMiniEngineVersions"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMiniEngineVersionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the kernel versions available for an instance. When upgrading, select the target version from KernelVersions[].KernelVersion. Do not manually construct version numbers.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides, and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the available kernel versions for upgrade.</p>
     * 
     * @param request ListMiniEngineVersionsRequest
     * @return ListMiniEngineVersionsResponse
     */
    public ListMiniEngineVersionsResponse listMiniEngineVersions(ListMiniEngineVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMiniEngineVersionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of regions where the assets owned by the current account are located. You can use this list to select the RegionId for subsequent region-specific API operations. You can filter the regions based on whether auditing or detection is enabled. The returned region list is not the same as the list of all regions supported by Alibaba Cloud services.
     * The parameter examples are for format illustration only. When you call this operation, replace them with the regions, resource identifiers, and configuration values queried from the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the regions where assets are located.</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(ListRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.audited)) {
            query.put("Audited", request.audited);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identified)) {
            query.put("Identified", request.identified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadAll)) {
            query.put("LoadAll", request.loadAll);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of regions where the assets owned by the current account are located. You can use this list to select the RegionId for subsequent region-specific API operations. You can filter the regions based on whether auditing or detection is enabled. The returned region list is not the same as the list of all regions supported by Alibaba Cloud services.
     * The parameter examples are for format illustration only. When you call this operation, replace them with the regions, resource identifiers, and configuration values queried from the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the regions where assets are located.</p>
     * 
     * @param request ListRegionsRequest
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the sensitivity levels in a data classification template. Use the returned level ID for subsequent queries. Do not use level names such as S1 or S2 directly as the RiskLevelId.
     * The parameter examples are provided only to illustrate the format. Replace them with the regions, resource identifiers, and configuration values obtained from your account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sensitivity levels of a template.</p>
     * 
     * @param request ListRiskLevelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRiskLevelsResponse
     */
    public ListRiskLevelsResponse listRiskLevelsWithOptions(ListRiskLevelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRiskLevels"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRiskLevelsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the sensitivity levels in a data classification template. Use the returned level ID for subsequent queries. Do not use level names such as S1 or S2 directly as the RiskLevelId.
     * The parameter examples are provided only to illustrate the format. Replace them with the regions, resource identifiers, and configuration values obtained from your account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sensitivity levels of a template.</p>
     * 
     * @param request ListRiskLevelsRequest
     * @return ListRiskLevelsResponse
     */
    public ListRiskLevelsResponse listRiskLevels(ListRiskLevelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRiskLevelsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query on data tables and detection results in a database. For relational database scenarios, set DataAssetSourceId to the instance identity and DataSourceName to the database name. Table names in PostgreSQL and Oracle may include a schema prefix. Pass the table name as-is in subsequent column queries.
     * For compatibility with historical detection results, if no results are found on the first page for the specified template and no filtering by sensitivity level or detection model is applied, the results may backoff to built-in general detection results. To strictly verify template ownership, also use the sensitivity level or model conditions within the template.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries database tables.</p>
     * 
     * @param request ListTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTablesResponse
     */
    public ListTablesResponse listTablesWithOptions(ListTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataAssetSourceId)) {
            query.put("DataAssetSourceId", request.dataAssetSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            query.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevelId)) {
            query.put("RiskLevelId", request.riskLevelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTables"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paging query on data tables and detection results in a database. For relational database scenarios, set DataAssetSourceId to the instance identity and DataSourceName to the database name. Table names in PostgreSQL and Oracle may include a schema prefix. Pass the table name as-is in subsequent column queries.
     * For compatibility with historical detection results, if no results are found on the first page for the specified template and no filtering by sensitivity level or detection model is applied, the results may backoff to built-in general detection results. To strictly verify template ownership, also use the sensitivity level or model conditions within the template.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained from your current account.
     * Use the endpoint of the region where the target asset resides and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match the target asset.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries database tables.</p>
     * 
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTablesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the classification and grading templates available to the current account. Use Items[].Id as the TemplateId for subsequent API calls. Detection models and sensitivity levels must come from the same template.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries classification and grading templates.</p>
     * 
     * @param request ListTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTemplatesResponse
     */
    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageScenario)) {
            query.put("UsageScenario", request.usageScenario);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTemplates"),
            new TeaPair("version", "2026-01-20"),
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
     * <b>description</b> :
     * <p>Queries the classification and grading templates available to the current account. Use Items[].Id as the TemplateId for subsequent API calls. Detection models and sensitivity levels must come from the same template.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identifiers, and configuration values obtained from your current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries classification and grading templates.</p>
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
     * <p>Queries the statistics of sensitive data from the overview, data catalog, or aggregated by region. CountType=41 returns overview statistics, 42 returns data catalog statistics for a specified product, and 43 returns data aggregated by region and template. The column encryption console uses CountType=43 with ProductCodeList to obtain region and template candidates. The statistics may come from pre-generated summary results and do not indicate that a recently initiated synchronization or encryption operation has completed.
     * The parameter examples are provided only to illustrate the format. Replace them with the regions, resource identifiers, and configuration values obtained by querying your current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the summary of sensitive data.</p>
     * 
     * @param request ListTotalSensitiveInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTotalSensitiveInfoResponse
     */
    public ListTotalSensitiveInfoResponse listTotalSensitiveInfoWithOptions(ListTotalSensitiveInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.countType)) {
            query.put("CountType", request.countType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCodeList)) {
            query.put("ProductCodeList", request.productCodeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTotalSensitiveInfo"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTotalSensitiveInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the statistics of sensitive data from the overview, data catalog, or aggregated by region. CountType=41 returns overview statistics, 42 returns data catalog statistics for a specified product, and 43 returns data aggregated by region and template. The column encryption console uses CountType=43 with ProductCodeList to obtain region and template candidates. The statistics may come from pre-generated summary results and do not indicate that a recently initiated synchronization or encryption operation has completed.
     * The parameter examples are provided only to illustrate the format. Replace them with the regions, resource identifiers, and configuration values obtained by querying your current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the summary of sensitive data.</p>
     * 
     * @param request ListTotalSensitiveInfoRequest
     * @return ListTotalSensitiveInfoResponse
     */
    public ListTotalSensitiveInfoResponse listTotalSensitiveInfo(ListTotalSensitiveInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTotalSensitiveInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Triggers asset synchronization for a specified product in the current region. The scope applies to the product and region, and is not limited to a specific instance. A successful request only indicates that the request is accepted. You can then verify asset changes by checking the lists of instances, databases, tables, and columns. This operation does not return a public node identifier for polling.
     * Parameter examples are for format illustration only. When you invoke this operation, replace them with the region, resource identifiers, and configuration values obtained from the current account.
     * Use the endpoint of the region where the target assets reside, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match the target assets.
     * This operation returns only RequestId. Request acceptance does not mean that the business operation is complete. You should check the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes the assets of a specified product in a region.</p>
     * 
     * @param request SyncDataAssetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncDataAssetsResponse
     */
    public SyncDataAssetsResponse syncDataAssetsWithOptions(SyncDataAssetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncDataAssets"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncDataAssetsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Triggers asset synchronization for a specified product in the current region. The scope applies to the product and region, and is not limited to a specific instance. A successful request only indicates that the request is accepted. You can then verify asset changes by checking the lists of instances, databases, tables, and columns. This operation does not return a public node identifier for polling.
     * Parameter examples are for format illustration only. When you invoke this operation, replace them with the region, resource identifiers, and configuration values obtained from the current account.
     * Use the endpoint of the region where the target assets reside, and set the common parameter RegionId, such as cn-zhangjiakou. The product code and instance identity must match the target assets.
     * This operation returns only RequestId. Request acceptance does not mean that the business operation is complete. You should check the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Synchronizes the assets of a specified product in a region.</p>
     * 
     * @param request SyncDataAssetsRequest
     * @return SyncDataAssetsResponse
     */
    public SyncDataAssetsResponse syncDataAssets(SyncDataAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncDataAssetsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Modifies the instance-level column encryption algorithm and key configuration, which affects the column encryption configuration of the instance. The current implementation supports ApsaraDB RDS for MySQL and PolarDB-X 2.0. Query the algorithms and keys supported by the instance before invoking this operation. This operation does not have an EncryptionKeyMode parameter. Configure the parameter based on the usage conditions of EncryptionKeyId. After a successful request, read back the instance encryption configuration and column status. Do not determine completion based solely on the RequestId.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained by querying your current account.
     * Use the service registration endpoint of the region where the target asset resides, and set the common parameter RegionId, for example, cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only the RequestId. A successful request does not indicate that the business operation is complete. Read back the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the column encryption algorithm and key for an instance.</p>
     * 
     * @param request UpdateDataMaskingEncryptionAlgorithmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataMaskingEncryptionAlgorithmResponse
     */
    public UpdateDataMaskingEncryptionAlgorithmResponse updateDataMaskingEncryptionAlgorithmWithOptions(UpdateDataMaskingEncryptionAlgorithmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptionAlgorithm)) {
            query.put("EncryptionAlgorithm", request.encryptionAlgorithm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKeyId)) {
            query.put("EncryptionKeyId", request.encryptionKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataMaskingEncryptionAlgorithm"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataMaskingEncryptionAlgorithmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modifies the instance-level column encryption algorithm and key configuration, which affects the column encryption configuration of the instance. The current implementation supports ApsaraDB RDS for MySQL and PolarDB-X 2.0. Query the algorithms and keys supported by the instance before invoking this operation. This operation does not have an EncryptionKeyMode parameter. Configure the parameter based on the usage conditions of EncryptionKeyId. After a successful request, read back the instance encryption configuration and column status. Do not determine completion based solely on the RequestId.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identities, and configuration values obtained by querying your current account.
     * Use the service registration endpoint of the region where the target asset resides, and set the common parameter RegionId, for example, cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only the RequestId. A successful request does not indicate that the business operation is complete. Read back the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the column encryption algorithm and key for an instance.</p>
     * 
     * @param request UpdateDataMaskingEncryptionAlgorithmRequest
     * @return UpdateDataMaskingEncryptionAlgorithmResponse
     */
    public UpdateDataMaskingEncryptionAlgorithmResponse updateDataMaskingEncryptionAlgorithm(UpdateDataMaskingEncryptionAlgorithmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataMaskingEncryptionAlgorithmWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Sets the same column encryption access permissions Settings for a batch of database accounts. UserList can contain accounts from different instances under the same product and region. Each item must include InstanceId and AccountId. fullAccess allows plaintext access, restrictedAccess allows restricted access, and noneAccess prohibits decryption and is supported only by specific DPI engines and key patterns. Only fullAccess supports configuring an expiration time. After a successful request, invoke ListDataAssetAccounts to read back the results.
     * The parameter examples are for format illustration only. When invoking this operation, replace them with the region, resource identity, and configuration values obtained from the current account.
     * Use the service registration endpoint of the region where the target asset is located and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only RequestId. Request acceptance does not mean the business operation is complete. You must read back the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the column encryption permissions for multiple database accounts.</p>
     * 
     * @param tmpReq UpdateDataMaskingUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDataMaskingUsersResponse
     */
    public UpdateDataMaskingUsersResponse updateDataMaskingUsersWithOptions(UpdateDataMaskingUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDataMaskingUsersShrinkRequest request = new UpdateDataMaskingUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userList)) {
            request.userListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userList, "UserList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authRole)) {
            query.put("AuthRole", request.authRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTime)) {
            query.put("ExpireTime", request.expireTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireTimeOperation)) {
            query.put("ExpireTimeOperation", request.expireTimeOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userListShrink)) {
            query.put("UserList", request.userListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataMaskingUsers"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataMaskingUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Sets the same column encryption access permissions Settings for a batch of database accounts. UserList can contain accounts from different instances under the same product and region. Each item must include InstanceId and AccountId. fullAccess allows plaintext access, restrictedAccess allows restricted access, and noneAccess prohibits decryption and is supported only by specific DPI engines and key patterns. Only fullAccess supports configuring an expiration time. After a successful request, invoke ListDataAssetAccounts to read back the results.
     * The parameter examples are for format illustration only. When invoking this operation, replace them with the region, resource identity, and configuration values obtained from the current account.
     * Use the service registration endpoint of the region where the target asset is located and set the common parameter RegionId, such as cn-zhangjiakou. The product encoding and instance identity must match the target asset.
     * This operation returns only RequestId. Request acceptance does not mean the business operation is complete. You must read back the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the column encryption permissions for multiple database accounts.</p>
     * 
     * @param request UpdateDataMaskingUsersRequest
     * @return UpdateDataMaskingUsersResponse
     */
    public UpdateDataMaskingUsersResponse updateDataMaskingUsers(UpdateDataMaskingUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDataMaskingUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Upgrades the database kernel of a specified instance at the selected time. Invoke ListMiniEngineVersions first to select a version, and check the current instance status and maintenance window. SpecifyTime requires a future SwitchTime value. PolarDB-X 2.0 does not support this time option. The upgrade is an asynchronous operation. Read back the CurrentKernelVersion field from GetInstanceAttribute to verify the result.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the service registration endpoint of the region where the target asset resides, and configure the common parameter RegionId to the corresponding value, for example, cn-zhangjiakou. The product code and instance identity must match the target asset.
     * This operation returns only a RequestId. A successful request does not mean the operation is complete. Read back the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the database kernel of an instance.</p>
     * 
     * @param request UpgradeKernelVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeKernelVersionResponse
     */
    public UpgradeKernelVersionResponse upgradeKernelVersionWithOptions(UpgradeKernelVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kernelVersion)) {
            query.put("KernelVersion", request.kernelVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTime)) {
            query.put("SwitchTime", request.switchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeTime)) {
            query.put("UpgradeTime", request.upgradeTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeKernelVersion"),
            new TeaPair("version", "2026-01-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeKernelVersionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Upgrades the database kernel of a specified instance at the selected time. Invoke ListMiniEngineVersions first to select a version, and check the current instance status and maintenance window. SpecifyTime requires a future SwitchTime value. PolarDB-X 2.0 does not support this time option. The upgrade is an asynchronous operation. Read back the CurrentKernelVersion field from GetInstanceAttribute to verify the result.
     * The parameter examples are provided only to illustrate the format. Replace them with the region, resource identity, and configuration values obtained from your current account.
     * Use the service registration endpoint of the region where the target asset resides, and configure the common parameter RegionId to the corresponding value, for example, cn-zhangjiakou. The product code and instance identity must match the target asset.
     * This operation returns only a RequestId. A successful request does not mean the operation is complete. Read back the status as described in the operation description.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the database kernel of an instance.</p>
     * 
     * @param request UpgradeKernelVersionRequest
     * @return UpgradeKernelVersionResponse
     */
    public UpgradeKernelVersionResponse upgradeKernelVersion(UpgradeKernelVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeKernelVersionWithOptions(request, runtime);
    }
}
