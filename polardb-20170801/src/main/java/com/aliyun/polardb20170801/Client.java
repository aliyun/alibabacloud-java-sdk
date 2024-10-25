// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801;

import com.aliyun.tea.*;
import com.aliyun.polardb20170801.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing", "polardb.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "polardb.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "polardb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "polardb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-fujian", "polardb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "polardb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "polardb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "polardb.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "polardb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "polardb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "polardb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "polardb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "polardb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "polardb.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "polardb.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("polardb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Cancels scheduled tasks that are not yet started.</p>
     * 
     * @param request CancelScheduleTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelScheduleTasksResponse
     */
    public CancelScheduleTasksResponse cancelScheduleTasksWithOptions(CancelScheduleTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelScheduleTasks"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelScheduleTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels scheduled tasks that are not yet started.</p>
     * 
     * @param request CancelScheduleTasksRequest
     * @return CancelScheduleTasksResponse
     */
    public CancelScheduleTasksResponse cancelScheduleTasks(CancelScheduleTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelScheduleTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether an account name is valid or unique in a cluster.</p>
     * 
     * @param request CheckAccountNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAccountNameResponse
     */
    public CheckAccountNameResponse checkAccountNameWithOptions(CheckAccountNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAccountName"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAccountNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether an account name is valid or unique in a cluster.</p>
     * 
     * @param request CheckAccountNameRequest
     * @return CheckAccountNameResponse
     */
    public CheckAccountNameResponse checkAccountName(CheckAccountNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAccountNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a database name is valid or whether the name is already used by another database in the current cluster.</p>
     * 
     * @param request CheckDBNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDBNameResponse
     */
    public CheckDBNameResponse checkDBNameWithOptions(CheckDBNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDBName"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDBNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a database name is valid or whether the name is already used by another database in the current cluster.</p>
     * 
     * @param request CheckDBNameRequest
     * @return CheckDBNameResponse
     */
    public CheckDBNameResponse checkDBName(CheckDBNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDBNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the cluster is authorized to use Key Management Service (KMS).</p>
     * 
     * @param request CheckKMSAuthorizedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckKMSAuthorizedResponse
     */
    public CheckKMSAuthorizedResponse checkKMSAuthorizedWithOptions(CheckKMSAuthorizedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TDERegion)) {
            query.put("TDERegion", request.TDERegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckKMSAuthorized"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckKMSAuthorizedResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the cluster is authorized to use Key Management Service (KMS).</p>
     * 
     * @param request CheckKMSAuthorizedRequest
     * @return CheckKMSAuthorizedResponse
     */
    public CheckKMSAuthorizedResponse checkKMSAuthorized(CheckKMSAuthorizedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkKMSAuthorizedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a service-linked role (SLR) is created.</p>
     * 
     * @param request CheckServiceLinkedRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckServiceLinkedRoleResponse
     */
    public CheckServiceLinkedRoleResponse checkServiceLinkedRoleWithOptions(CheckServiceLinkedRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckServiceLinkedRole"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a service-linked role (SLR) is created.</p>
     * 
     * @param request CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    public CheckServiceLinkedRoleResponse checkServiceLinkedRole(CheckServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭DB4AI</p>
     * 
     * @param request CloseAITaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseAITaskResponse
     */
    public CloseAITaskResponse closeAITaskWithOptions(CloseAITaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseAITask"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseAITaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭DB4AI</p>
     * 
     * @param request CloseAITaskRequest
     * @return CloseAITaskResponse
     */
    public CloseAITaskResponse closeAITask(CloseAITaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeAITaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to cancel the migration task before data migration.</p>
     * <ul>
     * <li>You can call this operation to perform the migration task after data migration.<blockquote>
     * <p>Before you call this operation, ensure that a one-click upgrade task has been created for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create an upgrade task. Set the <strong>CreationOption</strong> parameter to <strong>MigrationFromRDS</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">Create a PolarDB for MySQL cluster by using the Migration from RDS method</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels or completes the migration task that upgrades an RDS cluster to a PolarDB cluster.</p>
     * 
     * @param request CloseDBClusterMigrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseDBClusterMigrationResponse
     */
    public CloseDBClusterMigrationResponse closeDBClusterMigrationWithOptions(CloseDBClusterMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.continueEnableBinlog)) {
            query.put("ContinueEnableBinlog", request.continueEnableBinlog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseDBClusterMigration"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseDBClusterMigrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to cancel the migration task before data migration.</p>
     * <ul>
     * <li>You can call this operation to perform the migration task after data migration.<blockquote>
     * <p>Before you call this operation, ensure that a one-click upgrade task has been created for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create an upgrade task. Set the <strong>CreationOption</strong> parameter to <strong>MigrationFromRDS</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">Create a PolarDB for MySQL cluster by using the Migration from RDS method</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Cancels or completes the migration task that upgrades an RDS cluster to a PolarDB cluster.</p>
     * 
     * @param request CloseDBClusterMigrationRequest
     * @return CloseDBClusterMigrationResponse
     */
    public CloseDBClusterMigrationResponse closeDBClusterMigration(CloseDBClusterMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeDBClusterMigrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a database account for a PolarDB cluster.</p>
     * 
     * @param request CreateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPrivilege)) {
            query.put("AccountPrivilege", request.accountPrivilege);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privForAllDB)) {
            query.put("PrivForAllDB", request.privForAllDB);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a database account for a PolarDB cluster.</p>
     * 
     * @param request CreateAccountRequest
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成轻量化版本激活码</p>
     * 
     * @param request CreateActivationCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateActivationCodeResponse
     */
    public CreateActivationCodeResponse createActivationCodeWithOptions(CreateActivationCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunOrderId)) {
            query.put("AliyunOrderId", request.aliyunOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.macAddress)) {
            query.put("MacAddress", request.macAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemIdentifier)) {
            query.put("SystemIdentifier", request.systemIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateActivationCode"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateActivationCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成轻量化版本激活码</p>
     * 
     * @param request CreateActivationCodeRequest
     * @return CreateActivationCodeResponse
     */
    public CreateActivationCodeResponse createActivationCode(CreateActivationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createActivationCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can manually create up to three backups for each cluster.</li>
     * <li>The <code>Exceeding the daily backup times of this DB cluster</code> error message indicates that three manual backups already exist in your cluster. You must delete existing backups before you call this operation to manually create backups. For more information about how to delete backups, see <a href="https://help.aliyun.com/document_detail/98101.html">Delete backups</a>.</li>
     * <li>After you call this operation, a backup task is created in the backend. The task may be time-consuming if you want to back up large amounts of data.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a full snapshot backup for a PolarDB cluster.</p>
     * 
     * @param request CreateBackupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackupWithOptions(CreateBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can manually create up to three backups for each cluster.</li>
     * <li>The <code>Exceeding the daily backup times of this DB cluster</code> error message indicates that three manual backups already exist in your cluster. You must delete existing backups before you call this operation to manually create backups. For more information about how to delete backups, see <a href="https://help.aliyun.com/document_detail/98101.html">Delete backups</a>.</li>
     * <li>After you call this operation, a backup task is created in the backend. The task may be time-consuming if you want to back up large amounts of data.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a full snapshot backup for a PolarDB cluster.</p>
     * 
     * @param request CreateBackupRequest
     * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackup(CreateBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cluster that is used to store cold data.</p>
     * 
     * @param request CreateColdStorageInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateColdStorageInstanceResponse
     */
    public CreateColdStorageInstanceResponse createColdStorageInstanceWithOptions(CreateColdStorageInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coldStorageInstanceDescription)) {
            query.put("ColdStorageInstanceDescription", request.coldStorageInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateColdStorageInstance"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateColdStorageInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cluster that is used to store cold data.</p>
     * 
     * @param request CreateColdStorageInstanceRequest
     * @return CreateColdStorageInstanceResponse
     */
    public CreateColdStorageInstanceResponse createColdStorageInstance(CreateColdStorageInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createColdStorageInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Database Cluster</p>
     * 
     * @param request CreateDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBClusterResponse
     */
    public CreateDBClusterResponse createDBClusterWithOptions(CreateDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowShutDown)) {
            query.put("AllowShutDown", request.allowShutDown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.architecture)) {
            query.put("Architecture", request.architecture);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPolicyOnClusterDeletion)) {
            query.put("BackupRetentionPolicyOnClusterDeletion", request.backupRetentionPolicyOnClusterDeletion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloneDataPoint)) {
            query.put("CloneDataPoint", request.cloneDataPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterNetworkType)) {
            query.put("ClusterNetworkType", request.clusterNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creationCategory)) {
            query.put("CreationCategory", request.creationCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creationOption)) {
            query.put("CreationOption", request.creationOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBMinorVersion)) {
            query.put("DBMinorVersion", request.DBMinorVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeClass)) {
            query.put("DBNodeClass", request.DBNodeClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeNum)) {
            query.put("DBNodeNum", request.DBNodeNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBType)) {
            query.put("DBType", request.DBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBVersion)) {
            query.put("DBVersion", request.DBVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultTimeZone)) {
            query.put("DefaultTimeZone", request.defaultTimeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GDNId)) {
            query.put("GDNId", request.GDNId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotStandbyCluster)) {
            query.put("HotStandbyCluster", request.hotStandbyCluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loosePolarLogBin)) {
            query.put("LoosePolarLogBin", request.loosePolarLogBin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.looseXEngine)) {
            query.put("LooseXEngine", request.looseXEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.looseXEngineUseMemoryPct)) {
            query.put("LooseXEngineUseMemoryPct", request.looseXEngineUseMemoryPct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lowerCaseTableNames)) {
            query.put("LowerCaseTableNames", request.lowerCaseTableNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterGroupId)) {
            query.put("ParameterGroupId", request.parameterGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionedIops)) {
            query.put("ProvisionedIops", request.provisionedIops);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyClass)) {
            query.put("ProxyClass", request.proxyClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyType)) {
            query.put("ProxyType", request.proxyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleMax)) {
            query.put("ScaleMax", request.scaleMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleMin)) {
            query.put("ScaleMin", request.scaleMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleRoNumMax)) {
            query.put("ScaleRoNumMax", request.scaleRoNumMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleRoNumMin)) {
            query.put("ScaleRoNumMin", request.scaleRoNumMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIPList)) {
            query.put("SecurityIPList", request.securityIPList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessType)) {
            query.put("ServerlessType", request.serverlessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceResourceId)) {
            query.put("SourceResourceId", request.sourceResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyAZ)) {
            query.put("StandbyAZ", request.standbyAZ);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageAutoScale)) {
            query.put("StorageAutoScale", request.storageAutoScale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePayType)) {
            query.put("StoragePayType", request.storagePayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSpace)) {
            query.put("StorageSpace", request.storageSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageUpperBound)) {
            query.put("StorageUpperBound", request.storageUpperBound);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strictConsistency)) {
            query.put("StrictConsistency", request.strictConsistency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TDEStatus)) {
            query.put("TDEStatus", request.TDEStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Database Cluster</p>
     * 
     * @param request CreateDBClusterRequest
     * @return CreateDBClusterResponse
     */
    public CreateDBClusterResponse createDBCluster(CreateDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom cluster endpoint for a PolarDB cluster.</p>
     * 
     * @param request CreateDBClusterEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBClusterEndpointResponse
     */
    public CreateDBClusterEndpointResponse createDBClusterEndpointWithOptions(CreateDBClusterEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoAddNewNodes)) {
            query.put("AutoAddNewNodes", request.autoAddNewNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBEndpointDescription)) {
            query.put("DBEndpointDescription", request.DBEndpointDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointConfig)) {
            query.put("EndpointConfig", request.endpointConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointType)) {
            query.put("EndpointType", request.endpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            query.put("Nodes", request.nodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polarSccTimeoutAction)) {
            query.put("PolarSccTimeoutAction", request.polarSccTimeoutAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polarSccWaitTimeout)) {
            query.put("PolarSccWaitTimeout", request.polarSccWaitTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readWriteMode)) {
            query.put("ReadWriteMode", request.readWriteMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sccMode)) {
            query.put("SccMode", request.sccMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBClusterEndpoint"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBClusterEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom cluster endpoint for a PolarDB cluster.</p>
     * 
     * @param request CreateDBClusterEndpointRequest
     * @return CreateDBClusterEndpointResponse
     */
    public CreateDBClusterEndpointResponse createDBClusterEndpoint(CreateDBClusterEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBClusterEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can create a public endpoint for the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a public endpoint for the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.</p>
     * 
     * @param request CreateDBEndpointAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBEndpointAddressResponse
     */
    public CreateDBEndpointAddressResponse createDBEndpointAddressWithOptions(CreateDBEndpointAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBEndpointId)) {
            query.put("DBEndpointId", request.DBEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netType)) {
            query.put("NetType", request.netType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneInfo)) {
            query.put("ZoneInfo", request.zoneInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBEndpointAddress"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBEndpointAddressResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can create a public endpoint for the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a public endpoint for the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.</p>
     * 
     * @param request CreateDBEndpointAddressRequest
     * @return CreateDBEndpointAddressResponse
     */
    public CreateDBEndpointAddressResponse createDBEndpointAddress(CreateDBEndpointAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBEndpointAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A database link can be used to connect two PolarDB for PostgreSQL(Compatible with Oracle) clusters, or connect a PolarDB for PostgreSQL(Compatible with Oracle) cluster to a user-created PostgreSQL database that is hosted on an Elastic Compute Service (ECS) instance. You can use database links to query data across clusters.</p>
     * <blockquote>
     * <ul>
     * <li>You can create up to 10 database links for a cluster.</li>
     * <li>Each database link connects a source cluster and a destination cluster.</li>
     * <li>The source cluster and the destination cluster or the destination ECS instance must be located in the same region.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a database link.</p>
     * 
     * @param request CreateDBLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBLinkResponse
     */
    public CreateDBLinkResponse createDBLinkWithOptions(CreateDBLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBLinkName)) {
            query.put("DBLinkName", request.DBLinkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDBName)) {
            query.put("SourceDBName", request.sourceDBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDBAccount)) {
            query.put("TargetDBAccount", request.targetDBAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDBInstanceName)) {
            query.put("TargetDBInstanceName", request.targetDBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDBName)) {
            query.put("TargetDBName", request.targetDBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDBPasswd)) {
            query.put("TargetDBPasswd", request.targetDBPasswd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetIp)) {
            query.put("TargetIp", request.targetIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPort)) {
            query.put("TargetPort", request.targetPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBLink"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBLinkResponse());
    }

    /**
     * <b>description</b> :
     * <p>A database link can be used to connect two PolarDB for PostgreSQL(Compatible with Oracle) clusters, or connect a PolarDB for PostgreSQL(Compatible with Oracle) cluster to a user-created PostgreSQL database that is hosted on an Elastic Compute Service (ECS) instance. You can use database links to query data across clusters.</p>
     * <blockquote>
     * <ul>
     * <li>You can create up to 10 database links for a cluster.</li>
     * <li>Each database link connects a source cluster and a destination cluster.</li>
     * <li>The source cluster and the destination cluster or the destination ECS instance must be located in the same region.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a database link.</p>
     * 
     * @param request CreateDBLinkRequest
     * @return CreateDBLinkResponse
     */
    public CreateDBLinkResponse createDBLink(CreateDBLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a read-only node to a PolarDB cluster.</p>
     * 
     * @param request CreateDBNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBNodesResponse
     */
    public CreateDBNodesResponse createDBNodesWithOptions(CreateDBNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNode)) {
            query.put("DBNode", request.DBNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeType)) {
            query.put("DBNodeType", request.DBNodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointBindList)) {
            query.put("EndpointBindList", request.endpointBindList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imciSwitch)) {
            query.put("ImciSwitch", request.imciSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBNodes"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a read-only node to a PolarDB cluster.</p>
     * 
     * @param request CreateDBNodesRequest
     * @return CreateDBNodesResponse
     */
    public CreateDBNodesResponse createDBNodes(CreateDBNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBNodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The cluster is unlocked.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a database for a PolarDB cluster.</p>
     * 
     * @param request CreateDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabaseWithOptions(CreateDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPrivilege)) {
            query.put("AccountPrivilege", request.accountPrivilege);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.characterSetName)) {
            query.put("CharacterSetName", request.characterSetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collate)) {
            query.put("Collate", request.collate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ctype)) {
            query.put("Ctype", request.ctype);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBDescription)) {
            query.put("DBDescription", request.DBDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatabase"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatabaseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the following requirements are met:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The cluster is unlocked.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a database for a PolarDB cluster.</p>
     * 
     * @param request CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A cluster belongs to only one GDN.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a global database network (GDN).</p>
     * 
     * @param request CreateGlobalDatabaseNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGlobalDatabaseNetworkResponse
     */
    public CreateGlobalDatabaseNetworkResponse createGlobalDatabaseNetworkWithOptions(CreateGlobalDatabaseNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableGlobalDomainName)) {
            query.put("EnableGlobalDomainName", request.enableGlobalDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GDNDescription)) {
            query.put("GDNDescription", request.GDNDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGlobalDatabaseNetwork"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGlobalDatabaseNetworkResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> A cluster belongs to only one GDN.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a global database network (GDN).</p>
     * 
     * @param request CreateGlobalDatabaseNetworkRequest
     * @return CreateGlobalDatabaseNetworkResponse
     */
    public CreateGlobalDatabaseNetworkResponse createGlobalDatabaseNetwork(CreateGlobalDatabaseNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGlobalDatabaseNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a global IP whitelist template.</p>
     * 
     * @param request CreateGlobalSecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGlobalSecurityIPGroupResponse
     */
    public CreateGlobalSecurityIPGroupResponse createGlobalSecurityIPGroupWithOptions(CreateGlobalSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.GIpList)) {
            query.put("GIpList", request.GIpList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalIgName)) {
            query.put("GlobalIgName", request.globalIgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGlobalSecurityIPGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGlobalSecurityIPGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a global IP whitelist template.</p>
     * 
     * @param request CreateGlobalSecurityIPGroupRequest
     * @return CreateGlobalSecurityIPGroupResponse
     */
    public CreateGlobalSecurityIPGroupResponse createGlobalSecurityIPGroup(CreateGlobalSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGlobalSecurityIPGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建或获取虚拟证书订单</p>
     * 
     * @param request CreateOrGetVirtualLicenseOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrGetVirtualLicenseOrderResponse
     */
    public CreateOrGetVirtualLicenseOrderResponse createOrGetVirtualLicenseOrderWithOptions(CreateOrGetVirtualLicenseOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrGetVirtualLicenseOrder"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrGetVirtualLicenseOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建或获取虚拟证书订单</p>
     * 
     * @param request CreateOrGetVirtualLicenseOrderRequest
     * @return CreateOrGetVirtualLicenseOrderResponse
     */
    public CreateOrGetVirtualLicenseOrderResponse createOrGetVirtualLicenseOrder(CreateOrGetVirtualLicenseOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrGetVirtualLicenseOrderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>You can call this operation only on a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a parameter template.</p>
     * 
     * @param request CreateParameterGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateParameterGroupResponse
     */
    public CreateParameterGroupResponse createParameterGroupWithOptions(CreateParameterGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBType)) {
            query.put("DBType", request.DBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBVersion)) {
            query.put("DBVersion", request.DBVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterGroupDesc)) {
            query.put("ParameterGroupDesc", request.parameterGroupDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterGroupName)) {
            query.put("ParameterGroupName", request.parameterGroupName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateParameterGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateParameterGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>You can call this operation only on a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a parameter template.</p>
     * 
     * @param request CreateParameterGroupRequest
     * @return CreateParameterGroupResponse
     */
    public CreateParameterGroupResponse createParameterGroup(CreateParameterGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createParameterGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role (SLR).</p>
     * 
     * @param request CreateServiceLinkedRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServiceLinkedRole"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role (SLR).</p>
     * 
     * @param request CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Purchases a storage plan.</p>
     * 
     * @param request CreateStoragePlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStoragePlanResponse
     */
    public CreateStoragePlanResponse createStoragePlanWithOptions(CreateStoragePlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageClass)) {
            query.put("StorageClass", request.storageClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStoragePlan"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStoragePlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Purchases a storage plan.</p>
     * 
     * @param request CreateStoragePlanRequest
     * @return CreateStoragePlanResponse
     */
    public CreateStoragePlanResponse createStoragePlan(CreateStoragePlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStoragePlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that the cluster is in the Running state. Otherwise, the operation fails.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a database account for a PolarDB cluster.</p>
     * 
     * @param request DeleteAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccount"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccountResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, make sure that the cluster is in the Running state. Otherwise, the operation fails.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a database account for a PolarDB cluster.</p>
     * 
     * @param request DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the cluster meets the following requirements:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The backup sets are in the Success state.<blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98102.html">DescribeBackups</a> operation to query the status of backup sets.</li>
     * <li>After you delete the backup set file, the storage space that is occupied by the file is released. The released storage space is smaller than the size of the file because your snapshots share some data blocks</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the backup sets of a PolarDB cluster.</p>
     * 
     * @param request DeleteBackupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackupWithOptions(DeleteBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the cluster meets the following requirements:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The backup sets are in the Success state.<blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98102.html">DescribeBackups</a> operation to query the status of backup sets.</li>
     * <li>After you delete the backup set file, the storage space that is occupied by the file is released. The released storage space is smaller than the size of the file because your snapshots share some data blocks</li>
     * </ul>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes the backup sets of a PolarDB cluster.</p>
     * 
     * @param request DeleteBackupRequest
     * @return DeleteBackupResponse
     */
    public DeleteBackupResponse deleteBackup(DeleteBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go PolarDB cluster.</p>
     * 
     * @param request DeleteDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBClusterResponse
     */
    public DeleteDBClusterResponse deleteDBClusterWithOptions(DeleteDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPolicyOnClusterDeletion)) {
            query.put("BackupRetentionPolicyOnClusterDeletion", request.backupRetentionPolicyOnClusterDeletion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go PolarDB cluster.</p>
     * 
     * @param request DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    public DeleteDBClusterResponse deleteDBCluster(DeleteDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a custom cluster endpoint of a PolarDB cluster.</p>
     * 
     * @param request DeleteDBClusterEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBClusterEndpointResponse
     */
    public DeleteDBClusterEndpointResponse deleteDBClusterEndpointWithOptions(DeleteDBClusterEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBEndpointId)) {
            query.put("DBEndpointId", request.DBEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBClusterEndpoint"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBClusterEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a custom cluster endpoint of a PolarDB cluster.</p>
     * 
     * @param request DeleteDBClusterEndpointRequest
     * @return DeleteDBClusterEndpointResponse
     */
    public DeleteDBClusterEndpointResponse deleteDBClusterEndpoint(DeleteDBClusterEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBClusterEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can delete a public-facing or classic network endpoint of the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.</li>
     * <li>Classic network endpoints are supported only on the China site (aliyun.com). Therefore, you do not need to delete classic network endpoints on the International site (alibabacloud.com).</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Releases the public endpoints of a PolarDB cluster, including the primary endpoint, default cluster endpoint, and custom cluster endpoint.</p>
     * 
     * @param request DeleteDBEndpointAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBEndpointAddressResponse
     */
    public DeleteDBEndpointAddressResponse deleteDBEndpointAddressWithOptions(DeleteDBEndpointAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBEndpointId)) {
            query.put("DBEndpointId", request.DBEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netType)) {
            query.put("NetType", request.netType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBEndpointAddress"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBEndpointAddressResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can delete a public-facing or classic network endpoint of the primary endpoint, the default cluster endpoint, or a custom cluster endpoint.</li>
     * <li>Classic network endpoints are supported only on the China site (aliyun.com). Therefore, you do not need to delete classic network endpoints on the International site (alibabacloud.com).</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Releases the public endpoints of a PolarDB cluster, including the primary endpoint, default cluster endpoint, and custom cluster endpoint.</p>
     * 
     * @param request DeleteDBEndpointAddressRequest
     * @return DeleteDBEndpointAddressResponse
     */
    public DeleteDBEndpointAddressResponse deleteDBEndpointAddress(DeleteDBEndpointAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBEndpointAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a database link from a PolarDB for PostgreSQL (Compatible with Oracle) cluster.</p>
     * 
     * @param request DeleteDBLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBLinkResponse
     */
    public DeleteDBLinkResponse deleteDBLinkWithOptions(DeleteDBLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBLinkName)) {
            query.put("DBLinkName", request.DBLinkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBLink"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a database link from a PolarDB for PostgreSQL (Compatible with Oracle) cluster.</p>
     * 
     * @param request DeleteDBLinkRequest
     * @return DeleteDBLinkResponse
     */
    public DeleteDBLinkResponse deleteDBLink(DeleteDBLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a read-only node from a PolarDB cluster.</p>
     * 
     * @param request DeleteDBNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBNodesResponse
     */
    public DeleteDBNodesResponse deleteDBNodesWithOptions(DeleteDBNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeId)) {
            query.put("DBNodeId", request.DBNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeType)) {
            query.put("DBNodeType", request.DBNodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBNodes"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a read-only node from a PolarDB cluster.</p>
     * 
     * @param request DeleteDBNodesRequest
     * @return DeleteDBNodesResponse
     */
    public DeleteDBNodesResponse deleteDBNodes(DeleteDBNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBNodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The cluster must be in the Running state and unlocked. Otherwise, the specified database cannot be deleted.</li>
     * <li>The delete operation is performed in an asynchronous manner. A long period of time may be required to delete a large database. A success response for this operation only indicates that the request to delete the database is sent. You must query the database to check whether the database is deleted.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a database from a PolarDB cluster.</p>
     * 
     * @param request DeleteDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatabase"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatabaseResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>The cluster must be in the Running state and unlocked. Otherwise, the specified database cannot be deleted.</li>
     * <li>The delete operation is performed in an asynchronous manner. A long period of time may be required to delete a large database. A success response for this operation only indicates that the request to delete the database is sent. You must query the database to check whether the database is deleted.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a database from a PolarDB cluster.</p>
     * 
     * @param request DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can delete a GDN only when the GDN includes only a primary cluster.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a global database network (GDN).</p>
     * 
     * @param request DeleteGlobalDatabaseNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGlobalDatabaseNetworkResponse
     */
    public DeleteGlobalDatabaseNetworkResponse deleteGlobalDatabaseNetworkWithOptions(DeleteGlobalDatabaseNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.GDNId)) {
            query.put("GDNId", request.GDNId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGlobalDatabaseNetwork"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGlobalDatabaseNetworkResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can delete a GDN only when the GDN includes only a primary cluster.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a global database network (GDN).</p>
     * 
     * @param request DeleteGlobalDatabaseNetworkRequest
     * @return DeleteGlobalDatabaseNetworkResponse
     */
    public DeleteGlobalDatabaseNetworkResponse deleteGlobalDatabaseNetwork(DeleteGlobalDatabaseNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGlobalDatabaseNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a global IP whitelist template.</p>
     * 
     * @param request DeleteGlobalSecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGlobalSecurityIPGroupResponse
     */
    public DeleteGlobalSecurityIPGroupResponse deleteGlobalSecurityIPGroupWithOptions(DeleteGlobalSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalIgName)) {
            query.put("GlobalIgName", request.globalIgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGlobalSecurityIPGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGlobalSecurityIPGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a global IP whitelist template.</p>
     * 
     * @param request DeleteGlobalSecurityIPGroupRequest
     * @return DeleteGlobalSecurityIPGroupResponse
     */
    public DeleteGlobalSecurityIPGroupResponse deleteGlobalSecurityIPGroup(DeleteGlobalSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGlobalSecurityIPGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data masking rule.</p>
     * 
     * @param request DeleteMaskingRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMaskingRulesResponse
     */
    public DeleteMaskingRulesResponse deleteMaskingRulesWithOptions(DeleteMaskingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleNameList)) {
            query.put("RuleNameList", request.ruleNameList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMaskingRules"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMaskingRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a data masking rule.</p>
     * 
     * @param request DeleteMaskingRulesRequest
     * @return DeleteMaskingRulesResponse
     */
    public DeleteMaskingRulesResponse deleteMaskingRules(DeleteMaskingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMaskingRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and quickly apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p> When you delete a parameter template, the parameter settings that are applied to PolarDB clusters are not affected.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a parameter template of a PolarDB cluster.</p>
     * 
     * @param request DeleteParameterGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteParameterGroupResponse
     */
    public DeleteParameterGroupResponse deleteParameterGroupWithOptions(DeleteParameterGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterGroupId)) {
            query.put("ParameterGroupId", request.parameterGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteParameterGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteParameterGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and quickly apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p> When you delete a parameter template, the parameter settings that are applied to PolarDB clusters are not affected.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a parameter template of a PolarDB cluster.</p>
     * 
     * @param request DeleteParameterGroupRequest
     * @return DeleteParameterGroupResponse
     */
    public DeleteParameterGroupResponse deleteParameterGroup(DeleteParameterGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteParameterGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the PolarDB for AI feature.</p>
     * 
     * @param request DescribeAITaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAITaskStatusResponse
     */
    public DescribeAITaskStatusResponse describeAITaskStatusWithOptions(DescribeAITaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAITaskStatus"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAITaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the PolarDB for AI feature.</p>
     * 
     * @param request DescribeAITaskStatusRequest
     * @return DescribeAITaskStatusResponse
     */
    public DescribeAITaskStatusResponse describeAITaskStatus(DescribeAITaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAITaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a database account of a PolarDB cluster.</p>
     * 
     * @param request DescribeAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccounts"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a database account of a PolarDB cluster.</p>
     * 
     * @param request DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询激活码详情</p>
     * 
     * @param request DescribeActivationCodeDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeActivationCodeDetailsResponse
     */
    public DescribeActivationCodeDetailsResponse describeActivationCodeDetailsWithOptions(DescribeActivationCodeDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activationCodeId)) {
            query.put("ActivationCodeId", request.activationCodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliyunOrderId)) {
            query.put("AliyunOrderId", request.aliyunOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActivationCodeDetails"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActivationCodeDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询激活码详情</p>
     * 
     * @param request DescribeActivationCodeDetailsRequest
     * @return DescribeActivationCodeDetailsResponse
     */
    public DescribeActivationCodeDetailsResponse describeActivationCodeDetails(DescribeActivationCodeDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActivationCodeDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询激活码列表</p>
     * 
     * @param request DescribeActivationCodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeActivationCodesResponse
     */
    public DescribeActivationCodesResponse describeActivationCodesWithOptions(DescribeActivationCodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunOrderId)) {
            query.put("AliyunOrderId", request.aliyunOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActivationCodes"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActivationCodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询激活码列表</p>
     * 
     * @param request DescribeActivationCodesRequest
     * @return DescribeActivationCodesResponse
     */
    public DescribeActivationCodesResponse describeActivationCodes(DescribeActivationCodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActivationCodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the auto-renewal attributes of a subscription PolarDB cluster.</p>
     * 
     * @param request DescribeAutoRenewAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoRenewAttributeResponse
     */
    public DescribeAutoRenewAttributeResponse describeAutoRenewAttributeWithOptions(DescribeAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIds)) {
            query.put("DBClusterIds", request.DBClusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoRenewAttribute"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoRenewAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the auto-renewal attributes of a subscription PolarDB cluster.</p>
     * 
     * @param request DescribeAutoRenewAttributeRequest
     * @return DescribeAutoRenewAttributeResponse
     */
    public DescribeAutoRenewAttributeResponse describeAutoRenewAttribute(DescribeAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries backup logs and the URLs to download the backup logs.</p>
     * 
     * @param request DescribeBackupLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupLogsResponse
     */
    public DescribeBackupLogsResponse describeBackupLogsWithOptions(DescribeBackupLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupRegion)) {
            query.put("BackupRegion", request.backupRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupLogs"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries backup logs and the URLs to download the backup logs.</p>
     * 
     * @param request DescribeBackupLogsRequest
     * @return DescribeBackupLogsResponse
     */
    public DescribeBackupLogsResponse describeBackupLogs(DescribeBackupLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the automatic backup policy of a PolarDB cluster.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPolicy"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the automatic backup policy of a PolarDB cluster.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the backup tasks of a PolarDB cluster.</p>
     * 
     * @param request DescribeBackupTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupTasksResponse
     */
    public DescribeBackupTasksResponse describeBackupTasksWithOptions(DescribeBackupTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupJobId)) {
            query.put("BackupJobId", request.backupJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMode)) {
            query.put("BackupMode", request.backupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupTasks"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the backup tasks of a PolarDB cluster.</p>
     * 
     * @param request DescribeBackupTasksRequest
     * @return DescribeBackupTasksResponse
     */
    public DescribeBackupTasksResponse describeBackupTasks(DescribeBackupTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the backup details of a PolarDB cluster.</p>
     * 
     * @param request DescribeBackupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupsResponse
     */
    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMode)) {
            query.put("BackupMode", request.backupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRegion)) {
            query.put("BackupRegion", request.backupRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStatus)) {
            query.put("BackupStatus", request.backupStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackups"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the backup details of a PolarDB cluster.</p>
     * 
     * @param request DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries character sets that are supported by a PolarDB for MySQL cluster.</p>
     * 
     * @param request DescribeCharacterSetNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCharacterSetNameResponse
     */
    public DescribeCharacterSetNameResponse describeCharacterSetNameWithOptions(DescribeCharacterSetNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCharacterSetName"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCharacterSetNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries character sets that are supported by a PolarDB for MySQL cluster.</p>
     * 
     * @param request DescribeCharacterSetNameRequest
     * @return DescribeCharacterSetNameResponse
     */
    public DescribeCharacterSetNameResponse describeCharacterSetName(DescribeCharacterSetNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCharacterSetNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of a cluster.</p>
     * 
     * @param request DescribeClassListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClassListResponse
     */
    public DescribeClassListResponse describeClassListWithOptions(DescribeClassListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterHa)) {
            query.put("MasterHa", request.masterHa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClassList"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClassListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of a cluster.</p>
     * 
     * @param request DescribeClassListRequest
     * @return DescribeClassListResponse
     */
    public DescribeClassListResponse describeClassList(DescribeClassListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClassListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP address whitelists and security groups of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterAccessWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterAccessWhitelistResponse
     */
    public DescribeDBClusterAccessWhitelistResponse describeDBClusterAccessWhitelistWithOptions(DescribeDBClusterAccessWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterAccessWhitelist"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterAccessWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the IP address whitelists and security groups of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterAccessWhitelistRequest
     * @return DescribeDBClusterAccessWhitelistResponse
     */
    public DescribeDBClusterAccessWhitelistResponse describeDBClusterAccessWhitelist(DescribeDBClusterAccessWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterAccessWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterAttributeResponse
     */
    public DescribeDBClusterAttributeResponse describeDBClusterAttributeWithOptions(DescribeDBClusterAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describeType)) {
            query.put("DescribeType", request.describeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterAttribute"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterAttributeRequest
     * @return DescribeDBClusterAttributeResponse
     */
    public DescribeDBClusterAttributeResponse describeDBClusterAttribute(DescribeDBClusterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Describe SQL collector for a PolarDB cluster. Features related to SQL collector include audit log and SQL Explorer.</p>
     * 
     * @param request DescribeDBClusterAuditLogCollectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterAuditLogCollectorResponse
     */
    public DescribeDBClusterAuditLogCollectorResponse describeDBClusterAuditLogCollectorWithOptions(DescribeDBClusterAuditLogCollectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterAuditLogCollector"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterAuditLogCollectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Describe SQL collector for a PolarDB cluster. Features related to SQL collector include audit log and SQL Explorer.</p>
     * 
     * @param request DescribeDBClusterAuditLogCollectorRequest
     * @return DescribeDBClusterAuditLogCollectorResponse
     */
    public DescribeDBClusterAuditLogCollectorResponse describeDBClusterAuditLogCollector(DescribeDBClusterAuditLogCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterAuditLogCollectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available resources in a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterAvailableResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterAvailableResourcesResponse
     */
    public DescribeDBClusterAvailableResourcesResponse describeDBClusterAvailableResourcesWithOptions(DescribeDBClusterAvailableResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeClass)) {
            query.put("DBNodeClass", request.DBNodeClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBType)) {
            query.put("DBType", request.DBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBVersion)) {
            query.put("DBVersion", request.DBVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterAvailableResources"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterAvailableResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available resources in a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterAvailableResourcesRequest
     * @return DescribeDBClusterAvailableResourcesResponse
     */
    public DescribeDBClusterAvailableResourcesResponse describeDBClusterAvailableResources(DescribeDBClusterAvailableResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterAvailableResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the source IP address can access a cluster.</p>
     * 
     * @param request DescribeDBClusterConnectivityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterConnectivityResponse
     */
    public DescribeDBClusterConnectivityResponse describeDBClusterConnectivityWithOptions(DescribeDBClusterConnectivityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIpAddress)) {
            query.put("SourceIpAddress", request.sourceIpAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterConnectivity"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterConnectivityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the source IP address can access a cluster.</p>
     * 
     * @param request DescribeDBClusterConnectivityRequest
     * @return DescribeDBClusterConnectivityResponse
     */
    public DescribeDBClusterConnectivityResponse describeDBClusterConnectivity(DescribeDBClusterConnectivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterConnectivityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoints of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterEndpointsResponse
     */
    public DescribeDBClusterEndpointsResponse describeDBClusterEndpointsWithOptions(DescribeDBClusterEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBEndpointId)) {
            query.put("DBEndpointId", request.DBEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describeType)) {
            query.put("DescribeType", request.describeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterEndpoints"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the endpoints of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterEndpointsRequest
     * @return DescribeDBClusterEndpointsResponse
     */
    public DescribeDBClusterEndpointsResponse describeDBClusterEndpoints(DescribeDBClusterEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the status of data migration from an ApsaraDB RDS instance to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">Upgrade ApsaraDB RDS for MySQL to PolarDB for MySQL with one click</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that a one-click upgrade task has been created for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create an upgrade task. Set the <strong>CreationOption</strong> parameter to <strong>MigrationFromRDS</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the migration status of PolarDB clusters.</p>
     * 
     * @param request DescribeDBClusterMigrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterMigrationResponse
     */
    public DescribeDBClusterMigrationResponse describeDBClusterMigrationWithOptions(DescribeDBClusterMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterMigration"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterMigrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query the status of data migration from an ApsaraDB RDS instance to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">Upgrade ApsaraDB RDS for MySQL to PolarDB for MySQL with one click</a>.</p>
     * <ul>
     * <li>Before you call this operation, make sure that a one-click upgrade task has been created for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create an upgrade task. Set the <strong>CreationOption</strong> parameter to <strong>MigrationFromRDS</strong>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the migration status of PolarDB clusters.</p>
     * 
     * @param request DescribeDBClusterMigrationRequest
     * @return DescribeDBClusterMigrationResponse
     */
    public DescribeDBClusterMigrationResponse describeDBClusterMigration(DescribeDBClusterMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterMigrationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the interval at which the monitoring data of a PolarDB cluster is collected.</p>
     * 
     * @param request DescribeDBClusterMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterMonitorResponse
     */
    public DescribeDBClusterMonitorResponse describeDBClusterMonitorWithOptions(DescribeDBClusterMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterMonitor"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterMonitorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the interval at which the monitoring data of a PolarDB cluster is collected.</p>
     * 
     * @param request DescribeDBClusterMonitorRequest
     * @return DescribeDBClusterMonitorResponse
     */
    public DescribeDBClusterMonitorResponse describeDBClusterMonitor(DescribeDBClusterMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterMonitorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the parameters of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterParametersResponse
     */
    public DescribeDBClusterParametersResponse describeDBClusterParametersWithOptions(DescribeDBClusterParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describeType)) {
            query.put("DescribeType", request.describeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterParameters"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the parameters of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterParametersRequest
     * @return DescribeDBClusterParametersResponse
     */
    public DescribeDBClusterParametersResponse describeDBClusterParameters(DescribeDBClusterParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterParametersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.<blockquote>
     * <p> By default, the monitoring data is collected once every 60 seconds. You can call the <a href="https://help.aliyun.com/document_detail/159557.html">ModifyDBClusterMonitor</a> operation to set the data collection interval to every 5 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterPerformanceResponse
     */
    public DescribeDBClusterPerformanceResponse describeDBClusterPerformanceWithOptions(DescribeDBClusterPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterPerformance"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterPerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.<blockquote>
     * <p> By default, the monitoring data is collected once every 60 seconds. You can call the <a href="https://help.aliyun.com/document_detail/159557.html">ModifyDBClusterMonitor</a> operation to set the data collection interval to every 5 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    public DescribeDBClusterPerformanceResponse describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Secure Sockets Layer (SSL) settings of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterSSLResponse
     */
    public DescribeDBClusterSSLResponse describeDBClusterSSLWithOptions(DescribeDBClusterSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterSSL"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Secure Sockets Layer (SSL) settings of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterSSLRequest
     * @return DescribeDBClusterSSLResponse
     */
    public DescribeDBClusterSSLResponse describeDBClusterSSL(DescribeDBClusterSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterSSLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a serverless cluster.</p>
     * 
     * @param request DescribeDBClusterServerlessConfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterServerlessConfResponse
     */
    public DescribeDBClusterServerlessConfResponse describeDBClusterServerlessConfWithOptions(DescribeDBClusterServerlessConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterServerlessConf"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterServerlessConfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a serverless cluster.</p>
     * 
     * @param request DescribeDBClusterServerlessConfRequest
     * @return DescribeDBClusterServerlessConfResponse
     */
    public DescribeDBClusterServerlessConfResponse describeDBClusterServerlessConf(DescribeDBClusterServerlessConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterServerlessConfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the transparent data encryption (TDE) settings of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterTDERequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterTDEResponse
     */
    public DescribeDBClusterTDEResponse describeDBClusterTDEWithOptions(DescribeDBClusterTDERequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterTDE"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterTDEResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the transparent data encryption (TDE) settings of a PolarDB cluster.</p>
     * 
     * @param request DescribeDBClusterTDERequest
     * @return DescribeDBClusterTDEResponse
     */
    public DescribeDBClusterTDEResponse describeDBClusterTDE(DescribeDBClusterTDERequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterTDEWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the database engine version of a PolarDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBClusterVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterVersionResponse
     */
    public DescribeDBClusterVersionResponse describeDBClusterVersionWithOptions(DescribeDBClusterVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describeType)) {
            query.put("DescribeType", request.describeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterVersion"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the database engine version of a PolarDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBClusterVersionRequest
     * @return DescribeDBClusterVersionResponse
     */
    public DescribeDBClusterVersionResponse describeDBClusterVersion(DescribeDBClusterVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries PolarDB clusters or the clusters that can be accessed by an authorized RAM user.</p>
     * 
     * @param request DescribeDBClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClustersResponse
     */
    public DescribeDBClustersResponse describeDBClustersWithOptions(DescribeDBClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionString)) {
            query.put("ConnectionString", request.connectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIds)) {
            query.put("DBClusterIds", request.DBClusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterStatus)) {
            query.put("DBClusterStatus", request.DBClusterStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeIds)) {
            query.put("DBNodeIds", request.DBNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBType)) {
            query.put("DBType", request.DBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBVersion)) {
            query.put("DBVersion", request.DBVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.describeType)) {
            query.put("DescribeType", request.describeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expired)) {
            query.put("Expired", request.expired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recentCreationInterval)) {
            query.put("RecentCreationInterval", request.recentCreationInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recentExpirationInterval)) {
            query.put("RecentExpirationInterval", request.recentExpirationInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusters"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries PolarDB clusters or the clusters that can be accessed by an authorized RAM user.</p>
     * 
     * @param request DescribeDBClustersRequest
     * @return DescribeDBClustersResponse
     */
    public DescribeDBClustersResponse describeDBClusters(DescribeDBClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClustersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about PolarDB clusters that contain backup sets in a region.</p>
     * 
     * @param request DescribeDBClustersWithBackupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClustersWithBackupsResponse
     */
    public DescribeDBClustersWithBackupsResponse describeDBClustersWithBackupsWithOptions(DescribeDBClustersWithBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIds)) {
            query.put("DBClusterIds", request.DBClusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBType)) {
            query.put("DBType", request.DBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBVersion)) {
            query.put("DBVersion", request.DBVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDeleted)) {
            query.put("IsDeleted", request.isDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClustersWithBackups"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClustersWithBackupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about PolarDB clusters that contain backup sets in a region.</p>
     * 
     * @param request DescribeDBClustersWithBackupsRequest
     * @return DescribeDBClustersWithBackupsResponse
     */
    public DescribeDBClustersWithBackupsResponse describeDBClustersWithBackups(DescribeDBClustersWithBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClustersWithBackupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries attributes such as character sets and collations supported by a database in a PolarDB cluster.</p>
     * 
     * @param request DescribeDBInitializeVariableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInitializeVariableResponse
     */
    public DescribeDBInitializeVariableResponse describeDBInitializeVariableWithOptions(DescribeDBInitializeVariableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInitializeVariable"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInitializeVariableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries attributes such as character sets and collations supported by a database in a PolarDB cluster.</p>
     * 
     * @param request DescribeDBInitializeVariableRequest
     * @return DescribeDBInitializeVariableResponse
     */
    public DescribeDBInitializeVariableResponse describeDBInitializeVariable(DescribeDBInitializeVariableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInitializeVariableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query only the database links that use a PolarDB for Oracle cluster as the source.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the database links of a PolarDB for PostgreSQL (Compatible with Oracle) cluster.</p>
     * 
     * @param request DescribeDBLinksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBLinksResponse
     */
    public DescribeDBLinksResponse describeDBLinksWithOptions(DescribeDBLinksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBLinkName)) {
            query.put("DBLinkName", request.DBLinkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBLinks"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBLinksResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can query only the database links that use a PolarDB for Oracle cluster as the source.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the database links of a PolarDB for PostgreSQL (Compatible with Oracle) cluster.</p>
     * 
     * @param request DescribeDBLinksRequest
     * @return DescribeDBLinksResponse
     */
    public DescribeDBLinksResponse describeDBLinks(DescribeDBLinksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBLinksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.<blockquote>
     * <p> By default, the monitoring data is collected once every 60 seconds. You can call the <a href="https://help.aliyun.com/document_detail/159557.html">ModifyDBClusterMonitor</a> operation to set the data collection interval to every 5 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of a node in a PolarDB cluster.</p>
     * 
     * @param request DescribeDBNodePerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBNodePerformanceResponse
     */
    public DescribeDBNodePerformanceResponse describeDBNodePerformanceWithOptions(DescribeDBNodePerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeId)) {
            query.put("DBNodeId", request.DBNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBNodePerformance"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBNodePerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.<blockquote>
     * <p> By default, the monitoring data is collected once every 60 seconds. You can call the <a href="https://help.aliyun.com/document_detail/159557.html">ModifyDBClusterMonitor</a> operation to set the data collection interval to every 5 seconds.</p>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of a node in a PolarDB cluster.</p>
     * 
     * @param request DescribeDBNodePerformanceRequest
     * @return DescribeDBNodePerformanceResponse
     */
    public DescribeDBNodePerformanceResponse describeDBNodePerformance(DescribeDBNodePerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBNodePerformanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the parameters of a specified node in a cluster.</p>
     * 
     * @param request DescribeDBNodesParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBNodesParametersResponse
     */
    public DescribeDBNodesParametersResponse describeDBNodesParametersWithOptions(DescribeDBNodesParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeIds)) {
            query.put("DBNodeIds", request.DBNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBNodesParameters"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBNodesParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the parameters of a specified node in a cluster.</p>
     * 
     * @param request DescribeDBNodesParametersRequest
     * @return DescribeDBNodesParametersResponse
     */
    public DescribeDBNodesParametersResponse describeDBNodesParameters(DescribeDBNodesParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBNodesParametersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of PolarProxy.</p>
     * 
     * @param request DescribeDBProxyPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBProxyPerformanceResponse
     */
    public DescribeDBProxyPerformanceResponse describeDBProxyPerformanceWithOptions(DescribeDBProxyPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBEndpointId)) {
            query.put("DBEndpointId", request.DBEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeId)) {
            query.put("DBNodeId", request.DBNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBProxyPerformance"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBProxyPerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of PolarProxy.</p>
     * 
     * @param request DescribeDBProxyPerformanceRequest
     * @return DescribeDBProxyPerformanceResponse
     */
    public DescribeDBProxyPerformanceResponse describeDBProxyPerformance(DescribeDBProxyPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBProxyPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a cluster in Database Autonomy Service (DAS).</p>
     * 
     * @param request DescribeDasConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDasConfigResponse
     */
    public DescribeDasConfigResponse describeDasConfigWithOptions(DescribeDasConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDasConfig"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDasConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a cluster in Database Autonomy Service (DAS).</p>
     * 
     * @param request DescribeDasConfigRequest
     * @return DescribeDasConfigResponse
     */
    public DescribeDasConfigResponse describeDasConfig(DescribeDasConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDasConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about databases in a PolarDB cluster.</p>
     * 
     * @param request DescribeDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatabasesResponse
     */
    public DescribeDatabasesResponse describeDatabasesWithOptions(DescribeDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDatabases"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDatabasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about databases in a PolarDB cluster.</p>
     * 
     * @param request DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     */
    public DescribeDatabasesResponse describeDatabases(DescribeDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatabasesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the PolarDB cluster is in the <strong>Released</strong> state. You must also confirm that the <strong>Retain All Backups Permanently</strong> or <strong>Retain Last Automatic Backup Permanently</strong> backup retention policy takes effect after you release the cluster. If you delete all backup sets after the cluster is released, you cannot use this API operation to query the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98181.html">DescribeDBClusterAttribute</a> operation to query the cluster status.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the backup sets in a released PolarDB cluster.</p>
     * 
     * @param request DescribeDetachedBackupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDetachedBackupsResponse
     */
    public DescribeDetachedBackupsResponse describeDetachedBackupsWithOptions(DescribeDetachedBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMode)) {
            query.put("BackupMode", request.backupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRegion)) {
            query.put("BackupRegion", request.backupRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStatus)) {
            query.put("BackupStatus", request.backupStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDetachedBackups"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDetachedBackupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that the PolarDB cluster is in the <strong>Released</strong> state. You must also confirm that the <strong>Retain All Backups Permanently</strong> or <strong>Retain Last Automatic Backup Permanently</strong> backup retention policy takes effect after you release the cluster. If you delete all backup sets after the cluster is released, you cannot use this API operation to query the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98181.html">DescribeDBClusterAttribute</a> operation to query the cluster status.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the backup sets in a released PolarDB cluster.</p>
     * 
     * @param request DescribeDetachedBackupsRequest
     * @return DescribeDetachedBackupsResponse
     */
    public DescribeDetachedBackupsResponse describeDetachedBackups(DescribeDetachedBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDetachedBackupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Global Database Network (GDN).</p>
     * 
     * @param request DescribeGlobalDatabaseNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGlobalDatabaseNetworkResponse
     */
    public DescribeGlobalDatabaseNetworkResponse describeGlobalDatabaseNetworkWithOptions(DescribeGlobalDatabaseNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.GDNId)) {
            query.put("GDNId", request.GDNId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGlobalDatabaseNetwork"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGlobalDatabaseNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Global Database Network (GDN).</p>
     * 
     * @param request DescribeGlobalDatabaseNetworkRequest
     * @return DescribeGlobalDatabaseNetworkResponse
     */
    public DescribeGlobalDatabaseNetworkResponse describeGlobalDatabaseNetwork(DescribeGlobalDatabaseNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGlobalDatabaseNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all Global Database Networks (GDNs) that belong to an account.</p>
     * 
     * @param request DescribeGlobalDatabaseNetworksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGlobalDatabaseNetworksResponse
     */
    public DescribeGlobalDatabaseNetworksResponse describeGlobalDatabaseNetworksWithOptions(DescribeGlobalDatabaseNetworksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterRegion)) {
            query.put("FilterRegion", request.filterRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GDNDescription)) {
            query.put("GDNDescription", request.GDNDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GDNId)) {
            query.put("GDNId", request.GDNId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGlobalDatabaseNetworks"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGlobalDatabaseNetworksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all Global Database Networks (GDNs) that belong to an account.</p>
     * 
     * @param request DescribeGlobalDatabaseNetworksRequest
     * @return DescribeGlobalDatabaseNetworksResponse
     */
    public DescribeGlobalDatabaseNetworksResponse describeGlobalDatabaseNetworks(DescribeGlobalDatabaseNetworksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGlobalDatabaseNetworksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries global IP whitelist templates.</p>
     * 
     * @param request DescribeGlobalSecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGlobalSecurityIPGroupResponse
     */
    public DescribeGlobalSecurityIPGroupResponse describeGlobalSecurityIPGroupWithOptions(DescribeGlobalSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGlobalSecurityIPGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGlobalSecurityIPGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries global IP whitelist templates.</p>
     * 
     * @param request DescribeGlobalSecurityIPGroupRequest
     * @return DescribeGlobalSecurityIPGroupResponse
     */
    public DescribeGlobalSecurityIPGroupResponse describeGlobalSecurityIPGroup(DescribeGlobalSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGlobalSecurityIPGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the relationship between a cluster and a global IP whitelist template.</p>
     * 
     * @param request DescribeGlobalSecurityIPGroupRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGlobalSecurityIPGroupRelationResponse
     */
    public DescribeGlobalSecurityIPGroupRelationResponse describeGlobalSecurityIPGroupRelationWithOptions(DescribeGlobalSecurityIPGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGlobalSecurityIPGroupRelation"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGlobalSecurityIPGroupRelationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the relationship between a cluster and a global IP whitelist template.</p>
     * 
     * @param request DescribeGlobalSecurityIPGroupRelationRequest
     * @return DescribeGlobalSecurityIPGroupRelationResponse
     */
    public DescribeGlobalSecurityIPGroupRelationResponse describeGlobalSecurityIPGroupRelation(DescribeGlobalSecurityIPGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGlobalSecurityIPGroupRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看License订单详情</p>
     * 
     * @param request DescribeLicenseOrderDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLicenseOrderDetailsResponse
     */
    public DescribeLicenseOrderDetailsResponse describeLicenseOrderDetailsWithOptions(DescribeLicenseOrderDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunOrderId)) {
            query.put("AliyunOrderId", request.aliyunOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLicenseOrderDetails"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLicenseOrderDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看License订单详情</p>
     * 
     * @param request DescribeLicenseOrderDetailsRequest
     * @return DescribeLicenseOrderDetailsResponse
     */
    public DescribeLicenseOrderDetailsResponse describeLicenseOrderDetails(DescribeLicenseOrderDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLicenseOrderDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询License订单列表</p>
     * 
     * @param request DescribeLicenseOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLicenseOrdersResponse
     */
    public DescribeLicenseOrdersResponse describeLicenseOrdersWithOptions(DescribeLicenseOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunOrderId)) {
            query.put("AliyunOrderId", request.aliyunOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseChannel)) {
            query.put("PurchaseChannel", request.purchaseChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualOrder)) {
            query.put("VirtualOrder", request.virtualOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLicenseOrders"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLicenseOrdersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询License订单列表</p>
     * 
     * @param request DescribeLicenseOrdersRequest
     * @return DescribeLicenseOrdersResponse
     */
    public DescribeLicenseOrdersResponse describeLicenseOrders(DescribeLicenseOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLicenseOrdersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the retention policy of log backups in a PolarDB cluster.</p>
     * 
     * @param request DescribeLogBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogBackupPolicyResponse
     */
    public DescribeLogBackupPolicyResponse describeLogBackupPolicyWithOptions(DescribeLogBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLogBackupPolicy"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogBackupPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the retention policy of log backups in a PolarDB cluster.</p>
     * 
     * @param request DescribeLogBackupPolicyRequest
     * @return DescribeLogBackupPolicyResponse
     */
    public DescribeLogBackupPolicyResponse describeLogBackupPolicy(DescribeLogBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data masking rules of a PolarDB cluster or the information about a specified masking rule.</p>
     * 
     * @param request DescribeMaskingRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMaskingRulesResponse
     */
    public DescribeMaskingRulesResponse describeMaskingRulesWithOptions(DescribeMaskingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleNameList)) {
            query.put("RuleNameList", request.ruleNameList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMaskingRules"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMaskingRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data masking rules of a PolarDB cluster or the information about a specified masking rule.</p>
     * 
     * @param request DescribeMaskingRulesRequest
     * @return DescribeMaskingRulesResponse
     */
    public DescribeMaskingRulesResponse describeMaskingRules(DescribeMaskingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMaskingRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the databases or tables that can be restored.</p>
     * 
     * @param request DescribeMetaListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetaListResponse
     */
    public DescribeMetaListResponse describeMetaListWithOptions(DescribeMetaListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.getDbName)) {
            query.put("GetDbName", request.getDbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionCode)) {
            query.put("RegionCode", request.regionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTime)) {
            query.put("RestoreTime", request.restoreTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetaList"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetaListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the databases or tables that can be restored.</p>
     * 
     * @param request DescribeMetaListRequest
     * @return DescribeMetaListResponse
     */
    public DescribeMetaListResponse describeMetaList(DescribeMetaListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetaListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>This parameter is valid only for a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a parameter template.</p>
     * 
     * @param request DescribeParameterGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParameterGroupResponse
     */
    public DescribeParameterGroupResponse describeParameterGroupWithOptions(DescribeParameterGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterGroupId)) {
            query.put("ParameterGroupId", request.parameterGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParameterGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParameterGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>This parameter is valid only for a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a parameter template.</p>
     * 
     * @param request DescribeParameterGroupRequest
     * @return DescribeParameterGroupResponse
     */
    public DescribeParameterGroupResponse describeParameterGroup(DescribeParameterGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParameterGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries parameter templates that are available in a specified region.</p>
     * 
     * @param request DescribeParameterGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParameterGroupsResponse
     */
    public DescribeParameterGroupsResponse describeParameterGroupsWithOptions(DescribeParameterGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBType)) {
            query.put("DBType", request.DBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBVersion)) {
            query.put("DBVersion", request.DBVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParameterGroups"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParameterGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use parameter templates to manage multiple parameters at a time and apply existing parameters to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.</p>
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries parameter templates that are available in a specified region.</p>
     * 
     * @param request DescribeParameterGroupsRequest
     * @return DescribeParameterGroupsResponse
     */
    public DescribeParameterGroupsResponse describeParameterGroups(DescribeParameterGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParameterGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default parameters in a cluster.</p>
     * 
     * @param request DescribeParameterTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParameterTemplatesResponse
     */
    public DescribeParameterTemplatesResponse describeParameterTemplatesWithOptions(DescribeParameterTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBType)) {
            query.put("DBType", request.DBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBVersion)) {
            query.put("DBVersion", request.DBVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParameterTemplates"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParameterTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default parameters in a cluster.</p>
     * 
     * @param request DescribeParameterTemplatesRequest
     * @return DescribeParameterTemplatesResponse
     */
    public DescribeParameterTemplatesResponse describeParameterTemplates(DescribeParameterTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParameterTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a pending event.</p>
     * 
     * @param request DescribePendingMaintenanceActionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePendingMaintenanceActionResponse
     */
    public DescribePendingMaintenanceActionResponse describePendingMaintenanceActionWithOptions(DescribePendingMaintenanceActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isHistory)) {
            query.put("IsHistory", request.isHistory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePendingMaintenanceAction"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePendingMaintenanceActionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a pending event.</p>
     * 
     * @param request DescribePendingMaintenanceActionRequest
     * @return DescribePendingMaintenanceActionResponse
     */
    public DescribePendingMaintenanceActionResponse describePendingMaintenanceAction(DescribePendingMaintenanceActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePendingMaintenanceActionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the numbers of pending events of different task types.</p>
     * 
     * @param request DescribePendingMaintenanceActionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePendingMaintenanceActionsResponse
     */
    public DescribePendingMaintenanceActionsResponse describePendingMaintenanceActionsWithOptions(DescribePendingMaintenanceActionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isHistory)) {
            query.put("IsHistory", request.isHistory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePendingMaintenanceActions"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePendingMaintenanceActionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the numbers of pending events of different task types.</p>
     * 
     * @param request DescribePendingMaintenanceActionsRequest
     * @return DescribePendingMaintenanceActionsResponse
     */
    public DescribePendingMaintenanceActionsResponse describePendingMaintenanceActions(DescribePendingMaintenanceActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePendingMaintenanceActionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the SQL Explorer feature is enabled for the cluster.</p>
     * 
     * @param request DescribePolarSQLCollectorPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePolarSQLCollectorPolicyResponse
     */
    public DescribePolarSQLCollectorPolicyResponse describePolarSQLCollectorPolicyWithOptions(DescribePolarSQLCollectorPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePolarSQLCollectorPolicy"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePolarSQLCollectorPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the SQL Explorer feature is enabled for the cluster.</p>
     * 
     * @param request DescribePolarSQLCollectorPolicyRequest
     * @return DescribePolarSQLCollectorPolicyResponse
     */
    public DescribePolarSQLCollectorPolicyResponse describePolarSQLCollectorPolicy(DescribePolarSQLCollectorPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePolarSQLCollectorPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions and zones available for PolarDB.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2017-08-01"),
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
     * <p>Queries the regions and zones available for PolarDB.</p>
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
     * <p>Queries the details of all scheduled tasks.</p>
     * 
     * @param request DescribeScheduleTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeScheduleTasksResponse
     */
    public DescribeScheduleTasksResponse describeScheduleTasksWithOptions(DescribeScheduleTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAction)) {
            query.put("TaskAction", request.taskAction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeScheduleTasks"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeScheduleTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of all scheduled tasks.</p>
     * 
     * @param request DescribeScheduleTasksRequest
     * @return DescribeScheduleTasksResponse
     */
    public DescribeScheduleTasksResponse describeScheduleTasks(DescribeScheduleTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeScheduleTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Only PolarDB MySQL Edition clusters support calling this interface.</li>
     * <li>Starting from September 1, 2024, due to the optimization of the SQL template algorithm, when calling this interface, the value of the SQLHash field will change. For more details, please refer to [Notice] Optimization of Slow SQL Template Algorithm (<del>2845725</del>).</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Slow Log Details</p>
     * 
     * @param request DescribeSlowLogRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowLogRecordsResponse
     */
    public DescribeSlowLogRecordsResponse describeSlowLogRecordsWithOptions(DescribeSlowLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLHASH)) {
            query.put("SQLHASH", request.SQLHASH);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowLogRecords"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowLogRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Only PolarDB MySQL Edition clusters support calling this interface.</li>
     * <li>Starting from September 1, 2024, due to the optimization of the SQL template algorithm, when calling this interface, the value of the SQLHash field will change. For more details, please refer to [Notice] Optimization of Slow SQL Template Algorithm (<del>2845725</del>).</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Slow Log Details</p>
     * 
     * @param request DescribeSlowLogRecordsRequest
     * @return DescribeSlowLogRecordsResponse
     */
    public DescribeSlowLogRecordsResponse describeSlowLogRecords(DescribeSlowLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics about the slow query logs of a PolarDB cluster.</p>
     * 
     * @param request DescribeSlowLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowLogsResponse
     */
    public DescribeSlowLogsResponse describeSlowLogsWithOptions(DescribeSlowLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowLogs"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowLogsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is applicable only to PolarDB for MySQL clusters.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics about the slow query logs of a PolarDB cluster.</p>
     * 
     * @param request DescribeSlowLogsRequest
     * @return DescribeSlowLogsResponse
     */
    public DescribeSlowLogsResponse describeSlowLogs(DescribeSlowLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to view the details of a task that is generated by a specific API operation or in the PolarDB console. The system calls the specific API operation when you perform an operation in the PolarDB console. For example, you can view the details of the task when you call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation or <a href="https://help.aliyun.com/document_detail/58769.html">create a cluster</a> in the PolarDB console.</p>
     * <ul>
     * <li>You can view the details of tasks that are generated only when you call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create a cluster and <code>CreationOption</code> is not set to <code>CreateGdnStandby</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of the tasks that are generated based on API operations, such as the status of instance creation tasks.</p>
     * 
     * @param request DescribeTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasksWithOptions(DescribeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeId)) {
            query.put("DBNodeId", request.DBNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTasks"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to view the details of a task that is generated by a specific API operation or in the PolarDB console. The system calls the specific API operation when you perform an operation in the PolarDB console. For example, you can view the details of the task when you call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation or <a href="https://help.aliyun.com/document_detail/58769.html">create a cluster</a> in the PolarDB console.</p>
     * <ul>
     * <li>You can view the details of tasks that are generated only when you call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create a cluster and <code>CreationOption</code> is not set to <code>CreateGdnStandby</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of the tasks that are generated based on API operations, such as the status of instance creation tasks.</p>
     * 
     * @param request DescribeTasksRequest
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasks(DescribeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Key Management Service (KMS)-managed customer master keys (CMKs) that are used to encrypt data in a PolarDB cluster.</p>
     * 
     * @param request DescribeUserEncryptionKeyListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyListWithOptions(DescribeUserEncryptionKeyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TDERegion)) {
            query.put("TDERegion", request.TDERegion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserEncryptionKeyList"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserEncryptionKeyListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Key Management Service (KMS)-managed customer master keys (CMKs) that are used to encrypt data in a PolarDB cluster.</p>
     * 
     * @param request DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserEncryptionKeyListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a vSwitch.</p>
     * 
     * @param request DescribeVSwitchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVSwitchesResponse
     */
    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dedicatedHostGroupId)) {
            query.put("DedicatedHostGroupId", request.dedicatedHostGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVSwitches"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVSwitchesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a vSwitch.</p>
     * 
     * @param request DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a stable serverless cluster.</p>
     * 
     * @param request DisableDBClusterServerlessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDBClusterServerlessResponse
     */
    public DisableDBClusterServerlessResponse disableDBClusterServerlessWithOptions(DisableDBClusterServerlessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDBClusterServerless"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDBClusterServerlessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a stable serverless cluster.</p>
     * 
     * @param request DisableDBClusterServerlessRequest
     * @return DisableDBClusterServerlessResponse
     */
    public DisableDBClusterServerlessResponse disableDBClusterServerless(DisableDBClusterServerlessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDBClusterServerlessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a stable serverless cluster.</p>
     * 
     * @param request EnableDBClusterServerlessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDBClusterServerlessResponse
     */
    public EnableDBClusterServerlessResponse enableDBClusterServerlessWithOptions(EnableDBClusterServerlessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleApRoNumMax)) {
            query.put("ScaleApRoNumMax", request.scaleApRoNumMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleApRoNumMin)) {
            query.put("ScaleApRoNumMin", request.scaleApRoNumMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleMax)) {
            query.put("ScaleMax", request.scaleMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleMin)) {
            query.put("ScaleMin", request.scaleMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleRoNumMax)) {
            query.put("ScaleRoNumMax", request.scaleRoNumMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleRoNumMin)) {
            query.put("ScaleRoNumMin", request.scaleRoNumMin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDBClusterServerless"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDBClusterServerlessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a stable serverless cluster.</p>
     * 
     * @param request EnableDBClusterServerlessRequest
     * @return EnableDBClusterServerlessResponse
     */
    public EnableDBClusterServerlessResponse enableDBClusterServerless(EnableDBClusterServerlessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDBClusterServerlessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of SQL firewall rules for a cluster.</p>
     * 
     * @param request EnableFirewallRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableFirewallRulesResponse
     */
    public EnableFirewallRulesResponse enableFirewallRulesWithOptions(EnableFirewallRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleNameList)) {
            query.put("RuleNameList", request.ruleNameList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableFirewallRules"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableFirewallRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of SQL firewall rules for a cluster.</p>
     * 
     * @param request EnableFirewallRulesRequest
     * @return EnableFirewallRulesResponse
     */
    public EnableFirewallRulesResponse enableFirewallRules(EnableFirewallRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableFirewallRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Evaluates available resources.</p>
     * 
     * @param request EvaluateRegionResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EvaluateRegionResourceResponse
     */
    public EvaluateRegionResourceResponse evaluateRegionResourceWithOptions(EvaluateRegionResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceConnType)) {
            query.put("DBInstanceConnType", request.DBInstanceConnType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeClass)) {
            query.put("DBNodeClass", request.DBNodeClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBType)) {
            query.put("DBType", request.DBType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBVersion)) {
            query.put("DBVersion", request.DBVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispenseMode)) {
            query.put("DispenseMode", request.dispenseMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needMaxScaleLink)) {
            query.put("NeedMaxScaleLink", request.needMaxScaleLink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDomain)) {
            query.put("SubDomain", request.subDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EvaluateRegionResource"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EvaluateRegionResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Evaluates available resources.</p>
     * 
     * @param request EvaluateRegionResourceRequest
     * @return EvaluateRegionResourceResponse
     */
    public EvaluateRegionResourceResponse evaluateRegionResource(EvaluateRegionResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.evaluateRegionResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a manual failover to promote a read-only node to the primary node in a PolarDB cluster.</p>
     * 
     * @param request FailoverDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FailoverDBClusterResponse
     */
    public FailoverDBClusterResponse failoverDBClusterWithOptions(FailoverDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollBackForDisaster)) {
            query.put("RollBackForDisaster", request.rollBackForDisaster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDBNodeId)) {
            query.put("TargetDBNodeId", request.targetDBNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetZoneType)) {
            query.put("TargetZoneType", request.targetZoneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FailoverDBCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FailoverDBClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a manual failover to promote a read-only node to the primary node in a PolarDB cluster.</p>
     * 
     * @param request FailoverDBClusterRequest
     * @return FailoverDBClusterResponse
     */
    public FailoverDBClusterResponse failoverDBCluster(FailoverDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.failoverDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>An account can be authorized to access one or more databases.</li>
     * <li>If the specified account already has the access permissions on the specified databases, the operation returns a successful response.</li>
     * <li>Before you call this operation, make sure that the cluster is in the Running state. Otherwise, the operation fails.</li>
     * <li>You can call this operation only on a PolarDB for MySQL cluster.</li>
     * <li>By default, a privileged account for a cluster has all the permissions on the databases in the cluster.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Grants a standard account the permissions to access one or more databases in a specified PolarDB cluster.</p>
     * 
     * @param request GrantAccountPrivilegeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantAccountPrivilegeResponse
     */
    public GrantAccountPrivilegeResponse grantAccountPrivilegeWithOptions(GrantAccountPrivilegeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPrivilege)) {
            query.put("AccountPrivilege", request.accountPrivilege);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantAccountPrivilege"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantAccountPrivilegeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>An account can be authorized to access one or more databases.</li>
     * <li>If the specified account already has the access permissions on the specified databases, the operation returns a successful response.</li>
     * <li>Before you call this operation, make sure that the cluster is in the Running state. Otherwise, the operation fails.</li>
     * <li>You can call this operation only on a PolarDB for MySQL cluster.</li>
     * <li>By default, a privileged account for a cluster has all the permissions on the databases in the cluster.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Grants a standard account the permissions to access one or more databases in a specified PolarDB cluster.</p>
     * 
     * @param request GrantAccountPrivilegeRequest
     * @return GrantAccountPrivilegeResponse
     */
    public GrantAccountPrivilegeResponse grantAccountPrivilege(GrantAccountPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantAccountPrivilegeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to one or more PolarDB clusters, or the PolarDB clusters to which one or more tags are added.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2017-08-01"),
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
     * <p>Queries the tags that are added to one or more PolarDB clusters, or the PolarDB clusters to which one or more tags are added.</p>
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
     * <p>Manually starts a cluster.</p>
     * 
     * @param request ManuallyStartDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManuallyStartDBClusterResponse
     */
    public ManuallyStartDBClusterResponse manuallyStartDBClusterWithOptions(ManuallyStartDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManuallyStartDBCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManuallyStartDBClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Manually starts a cluster.</p>
     * 
     * @param request ManuallyStartDBClusterRequest
     * @return ManuallyStartDBClusterResponse
     */
    public ManuallyStartDBClusterResponse manuallyStartDBCluster(ManuallyStartDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manuallyStartDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a database account of a PolarDB cluster.</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountDescription"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a database account of a PolarDB cluster.</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the password of a database account for a specified PolarDB cluster.</p>
     * 
     * @param request ModifyAccountPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountPasswordResponse
     */
    public ModifyAccountPasswordResponse modifyAccountPasswordWithOptions(ModifyAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newAccountPassword)) {
            query.put("NewAccountPassword", request.newAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordType)) {
            query.put("PasswordType", request.passwordType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountPassword"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the password of a database account for a specified PolarDB cluster.</p>
     * 
     * @param request ModifyAccountPasswordRequest
     * @return ModifyAccountPasswordResponse
     */
    public ModifyAccountPasswordResponse modifyAccountPassword(ModifyAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the auto-renewal attributes of a subscription PolarDB cluster.</p>
     * 
     * @param request ModifyAutoRenewAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAutoRenewAttributeResponse
     */
    public ModifyAutoRenewAttributeResponse modifyAutoRenewAttributeWithOptions(ModifyAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIds)) {
            query.put("DBClusterIds", request.DBClusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewalStatus)) {
            query.put("RenewalStatus", request.renewalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoRenewAttribute"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoRenewAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the auto-renewal attributes of a subscription PolarDB cluster.</p>
     * 
     * @param request ModifyAutoRenewAttributeRequest
     * @return ModifyAutoRenewAttributeResponse
     */
    public ModifyAutoRenewAttributeResponse modifyAutoRenewAttribute(ModifyAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can also modify the automatic backup policy of a PolarDB cluster in the console. For more information, see <a href="https://help.aliyun.com/document_detail/280422.html">Backup settings</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the automatic backup policy of a PolarDB cluster.</p>
     * 
     * @param request ModifyBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupFrequency)) {
            query.put("BackupFrequency", request.backupFrequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPolicyOnClusterDeletion)) {
            query.put("BackupRetentionPolicyOnClusterDeletion", request.backupRetentionPolicyOnClusterDeletion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataLevel1BackupFrequency)) {
            query.put("DataLevel1BackupFrequency", request.dataLevel1BackupFrequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataLevel1BackupPeriod)) {
            query.put("DataLevel1BackupPeriod", request.dataLevel1BackupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataLevel1BackupRetentionPeriod)) {
            query.put("DataLevel1BackupRetentionPeriod", request.dataLevel1BackupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataLevel1BackupTime)) {
            query.put("DataLevel1BackupTime", request.dataLevel1BackupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataLevel2BackupAnotherRegionRegion)) {
            query.put("DataLevel2BackupAnotherRegionRegion", request.dataLevel2BackupAnotherRegionRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataLevel2BackupAnotherRegionRetentionPeriod)) {
            query.put("DataLevel2BackupAnotherRegionRetentionPeriod", request.dataLevel2BackupAnotherRegionRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataLevel2BackupPeriod)) {
            query.put("DataLevel2BackupPeriod", request.dataLevel2BackupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataLevel2BackupRetentionPeriod)) {
            query.put("DataLevel2BackupRetentionPeriod", request.dataLevel2BackupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupPeriod)) {
            query.put("PreferredBackupPeriod", request.preferredBackupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupTime)) {
            query.put("PreferredBackupTime", request.preferredBackupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupPolicy"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackupPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can also modify the automatic backup policy of a PolarDB cluster in the console. For more information, see <a href="https://help.aliyun.com/document_detail/280422.html">Backup settings</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the automatic backup policy of a PolarDB cluster.</p>
     * 
     * @param request ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a PolarDB for MySQL cluster.</p>
     * 
     * @param request ModifyDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterResponse
     */
    public ModifyDBClusterResponse modifyDBClusterWithOptions(ModifyDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compressStorage)) {
            query.put("CompressStorage", request.compressStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeCrashList)) {
            query.put("DBNodeCrashList", request.DBNodeCrashList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSyncMode)) {
            query.put("DataSyncMode", request.dataSyncMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faultInjectionType)) {
            query.put("FaultInjectionType", request.faultInjectionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.faultSimulateMode)) {
            query.put("FaultSimulateMode", request.faultSimulateMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imciAutoIndex)) {
            query.put("ImciAutoIndex", request.imciAutoIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyHAMode)) {
            query.put("StandbyHAMode", request.standbyHAMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageAutoScale)) {
            query.put("StorageAutoScale", request.storageAutoScale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageUpperBound)) {
            query.put("StorageUpperBound", request.storageUpperBound);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBCluster"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a PolarDB for MySQL cluster.</p>
     * 
     * @param request ModifyDBClusterRequest
     * @return ModifyDBClusterResponse
     */
    public ModifyDBClusterResponse modifyDBCluster(ModifyDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies the whitelists (IP whitelists and security groups) of a specified cluster.</p>
     * 
     * @param request ModifyDBClusterAccessWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterAccessWhitelistResponse
     */
    public ModifyDBClusterAccessWhitelistResponse modifyDBClusterAccessWhitelistWithOptions(ModifyDBClusterAccessWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIPArrayAttribute)) {
            query.put("DBClusterIPArrayAttribute", request.DBClusterIPArrayAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIPArrayName)) {
            query.put("DBClusterIPArrayName", request.DBClusterIPArrayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("ModifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupIds)) {
            query.put("SecurityGroupIds", request.securityGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            query.put("SecurityIps", request.securityIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteListType)) {
            query.put("WhiteListType", request.whiteListType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterAccessWhitelist"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterAccessWhitelistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates or modifies the whitelists (IP whitelists and security groups) of a specified cluster.</p>
     * 
     * @param request ModifyDBClusterAccessWhitelistRequest
     * @return ModifyDBClusterAccessWhitelistResponse
     */
    public ModifyDBClusterAccessWhitelistResponse modifyDBClusterAccessWhitelist(ModifyDBClusterAccessWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterAccessWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies cluster parameters and applies them to specified nodes.</p>
     * 
     * @param request ModifyDBClusterAndNodesParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterAndNodesParametersResponse
     */
    public ModifyDBClusterAndNodesParametersResponse modifyDBClusterAndNodesParametersWithOptions(ModifyDBClusterAndNodesParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeIds)) {
            query.put("DBNodeIds", request.DBNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTimeService)) {
            query.put("FromTimeService", request.fromTimeService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterGroupId)) {
            query.put("ParameterGroupId", request.parameterGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterAndNodesParameters"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterAndNodesParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies cluster parameters and applies them to specified nodes.</p>
     * 
     * @param request ModifyDBClusterAndNodesParametersRequest
     * @return ModifyDBClusterAndNodesParametersResponse
     */
    public ModifyDBClusterAndNodesParametersResponse modifyDBClusterAndNodesParameters(ModifyDBClusterAndNodesParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterAndNodesParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables SQL collector for a PolarDB cluster. The features related to SQL collector include Audit Logs and SQL Explorer.</p>
     * 
     * @param request ModifyDBClusterAuditLogCollectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterAuditLogCollectorResponse
     */
    public ModifyDBClusterAuditLogCollectorResponse modifyDBClusterAuditLogCollectorWithOptions(ModifyDBClusterAuditLogCollectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collectorStatus)) {
            query.put("CollectorStatus", request.collectorStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterAuditLogCollector"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterAuditLogCollectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables SQL collector for a PolarDB cluster. The features related to SQL collector include Audit Logs and SQL Explorer.</p>
     * 
     * @param request ModifyDBClusterAuditLogCollectorRequest
     * @return ModifyDBClusterAuditLogCollectorResponse
     */
    public ModifyDBClusterAuditLogCollectorResponse modifyDBClusterAuditLogCollector(ModifyDBClusterAuditLogCollectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterAuditLogCollectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the cluster lock feature for a PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterDeletionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterDeletionResponse
     */
    public ModifyDBClusterDeletionResponse modifyDBClusterDeletionWithOptions(ModifyDBClusterDeletionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protection)) {
            query.put("Protection", request.protection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterDeletion"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterDeletionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the cluster lock feature for a PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterDeletionRequest
     * @return ModifyDBClusterDeletionResponse
     */
    public ModifyDBClusterDeletionResponse modifyDBClusterDeletion(ModifyDBClusterDeletionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterDeletionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterDescriptionResponse
     */
    public ModifyDBClusterDescriptionResponse modifyDBClusterDescriptionWithOptions(ModifyDBClusterDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterDescription"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterDescriptionRequest
     * @return ModifyDBClusterDescriptionResponse
     */
    public ModifyDBClusterDescriptionResponse modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of a specified PolarDB cluster endpoint. For example, you can modify the following attributes for the specified cluster endpoint: read/write mode, consistency level, transaction splitting, primary node accepts read requests, and connection pool. You can also call the operation to specify whether newly added nodes are automatically associated with the specified cluster endpoint.</p>
     * 
     * @param request ModifyDBClusterEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterEndpointResponse
     */
    public ModifyDBClusterEndpointResponse modifyDBClusterEndpointWithOptions(ModifyDBClusterEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoAddNewNodes)) {
            query.put("AutoAddNewNodes", request.autoAddNewNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBEndpointDescription)) {
            query.put("DBEndpointDescription", request.DBEndpointDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBEndpointId)) {
            query.put("DBEndpointId", request.DBEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endpointConfig)) {
            query.put("EndpointConfig", request.endpointConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            query.put("Nodes", request.nodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polarSccTimeoutAction)) {
            query.put("PolarSccTimeoutAction", request.polarSccTimeoutAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polarSccWaitTimeout)) {
            query.put("PolarSccWaitTimeout", request.polarSccWaitTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readWriteMode)) {
            query.put("ReadWriteMode", request.readWriteMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sccMode)) {
            query.put("SccMode", request.sccMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterEndpoint"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the attributes of a specified PolarDB cluster endpoint. For example, you can modify the following attributes for the specified cluster endpoint: read/write mode, consistency level, transaction splitting, primary node accepts read requests, and connection pool. You can also call the operation to specify whether newly added nodes are automatically associated with the specified cluster endpoint.</p>
     * 
     * @param request ModifyDBClusterEndpointRequest
     * @return ModifyDBClusterEndpointResponse
     */
    public ModifyDBClusterEndpointResponse modifyDBClusterEndpoint(ModifyDBClusterEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterEndpointWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> We recommend that you set the routine maintenance window to off-peak hours. Alibaba Cloud maintains your cluster within the specified maintenance window to minimize the negative impacts on your business.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maintenance window of a PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterMaintainTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterMaintainTimeResponse
     */
    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTimeWithOptions(ModifyDBClusterMaintainTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainTime)) {
            query.put("MaintainTime", request.maintainTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterMaintainTime"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterMaintainTimeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> We recommend that you set the routine maintenance window to off-peak hours. Alibaba Cloud maintains your cluster within the specified maintenance window to minimize the negative impacts on your business.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maintenance window of a PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterMaintainTimeRequest
     * @return ModifyDBClusterMaintainTimeResponse
     */
    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterMaintainTimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to switch the task that migrates data from ApsaraDB for RDS to PolarDB.</p>
     * <ul>
     * <li>You can call this operation to roll back the task that migrates data from ApsaraDB for RDS to PolarDB.<blockquote>
     * <p>Before you call this operation, ensure that a one-click upgrade task has been created for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create an upgrade task. Set the <strong>CreationOption</strong> parameter to <strong>MigrationFromRDS</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">Create a PolarDB for MySQL cluster by using the Migration from RDS method</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Switches or rolls back the task that migrates data from ApsaraDB for RDS to PolarDB.</p>
     * 
     * @param request ModifyDBClusterMigrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterMigrationResponse
     */
    public ModifyDBClusterMigrationResponse modifyDBClusterMigrationWithOptions(ModifyDBClusterMigrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStrings)) {
            query.put("ConnectionStrings", request.connectionStrings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newMasterInstanceId)) {
            query.put("NewMasterInstanceId", request.newMasterInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRDSDBInstanceId)) {
            query.put("SourceRDSDBInstanceId", request.sourceRDSDBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.swapConnectionString)) {
            query.put("SwapConnectionString", request.swapConnectionString);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterMigration"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterMigrationResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to switch the task that migrates data from ApsaraDB for RDS to PolarDB.</p>
     * <ul>
     * <li>You can call this operation to roll back the task that migrates data from ApsaraDB for RDS to PolarDB.<blockquote>
     * <p>Before you call this operation, ensure that a one-click upgrade task has been created for the cluster. You can call the <a href="https://help.aliyun.com/document_detail/98169.html">CreateDBCluster</a> operation to create an upgrade task. Set the <strong>CreationOption</strong> parameter to <strong>MigrationFromRDS</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/121582.html">Create a PolarDB for MySQL cluster by using the Migration from RDS method</a>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Switches or rolls back the task that migrates data from ApsaraDB for RDS to PolarDB.</p>
     * 
     * @param request ModifyDBClusterMigrationRequest
     * @return ModifyDBClusterMigrationResponse
     */
    public ModifyDBClusterMigrationResponse modifyDBClusterMigration(ModifyDBClusterMigrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterMigrationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the interval at which the monitoring data of a PolarDB cluster is collected.</p>
     * 
     * @param request ModifyDBClusterMonitorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterMonitorResponse
     */
    public ModifyDBClusterMonitorResponse modifyDBClusterMonitorWithOptions(ModifyDBClusterMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterMonitor"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterMonitorResponse());
    }

    /**
     * <b>description</b> :
     * <p>  When the monitoring data is collected every 5 seconds:
     *     *   If the query time range is less than or equal to 1 hour, the data is displayed at intervals of 5 seconds.
     *     *   If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.
     *     *   If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.
     *     *   If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.
     *     *   When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</p>
     * <ul>
     * <li>When the monitoring data is collected every 60 seconds:<ul>
     * <li>If the query time range is less than or equal to one day, the data is displayed at intervals of 1 minute.</li>
     * <li>If the query time range is less than or equal to seven days, the data is displayed at intervals of 10 minutes.</li>
     * <li>If the query time range is less than or equal to 30 days, the data is displayed at intervals of 1 hour.</li>
     * <li>When the query time range is greater than 30 days, the data is displayed at intervals of 1 day.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the interval at which the monitoring data of a PolarDB cluster is collected.</p>
     * 
     * @param request ModifyDBClusterMonitorRequest
     * @return ModifyDBClusterMonitorResponse
     */
    public ModifyDBClusterMonitorResponse modifyDBClusterMonitor(ModifyDBClusterMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterMonitorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>PolarDB supports the parameter template feature to centrally manage clusters. You can configure a number of parameters at a time by using a parameter template and apply the template to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.
     * **
     * **Only PolarDB for MySQL clusters support parameter templates.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the parameters of a specified PolarDB cluster or applies existing parameter templates to a specified cluster.</p>
     * 
     * @param request ModifyDBClusterParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterParametersResponse
     */
    public ModifyDBClusterParametersResponse modifyDBClusterParametersWithOptions(ModifyDBClusterParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTimeService)) {
            query.put("FromTimeService", request.fromTimeService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterGroupId)) {
            query.put("ParameterGroupId", request.parameterGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterParameters"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterParametersResponse());
    }

    /**
     * <b>description</b> :
     * <p>PolarDB supports the parameter template feature to centrally manage clusters. You can configure a number of parameters at a time by using a parameter template and apply the template to a PolarDB cluster. For more information, see <a href="https://help.aliyun.com/document_detail/207009.html">Use a parameter template</a>.
     * **
     * **Only PolarDB for MySQL clusters support parameter templates.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the parameters of a specified PolarDB cluster or applies existing parameter templates to a specified cluster.</p>
     * 
     * @param request ModifyDBClusterParametersRequest
     * @return ModifyDBClusterParametersResponse
     */
    public ModifyDBClusterParametersResponse modifyDBClusterParameters(ModifyDBClusterParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the primary zone of a PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterPrimaryZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterPrimaryZoneResponse
     */
    public ModifyDBClusterPrimaryZoneResponse modifyDBClusterPrimaryZoneWithOptions(ModifyDBClusterPrimaryZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTimeService)) {
            query.put("FromTimeService", request.fromTimeService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSwitchOverForDisaster)) {
            query.put("IsSwitchOverForDisaster", request.isSwitchOverForDisaster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneType)) {
            query.put("ZoneType", request.zoneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterPrimaryZone"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterPrimaryZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the primary zone of a PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterPrimaryZoneRequest
     * @return ModifyDBClusterPrimaryZoneResponse
     */
    public ModifyDBClusterPrimaryZoneResponse modifyDBClusterPrimaryZone(ModifyDBClusterPrimaryZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterPrimaryZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a resource group for a database cluster.</p>
     * 
     * @param request ModifyDBClusterResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterResourceGroupResponse
     */
    public ModifyDBClusterResourceGroupResponse modifyDBClusterResourceGroupWithOptions(ModifyDBClusterResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterResourceGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a resource group for a database cluster.</p>
     * 
     * @param request ModifyDBClusterResourceGroupRequest
     * @return ModifyDBClusterResourceGroupResponse
     */
    public ModifyDBClusterResourceGroupResponse modifyDBClusterResourceGroup(ModifyDBClusterResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables Secure Sockets Layer (SSL) encryption or updates the Certificate Authorities (CA) certificate for a specified PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterSSLResponse
     */
    public ModifyDBClusterSSLResponse modifyDBClusterSSLWithOptions(ModifyDBClusterSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBEndpointId)) {
            query.put("DBEndpointId", request.DBEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netType)) {
            query.put("NetType", request.netType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLAutoRotate)) {
            query.put("SSLAutoRotate", request.SSLAutoRotate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLEnabled)) {
            query.put("SSLEnabled", request.SSLEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterSSL"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables Secure Sockets Layer (SSL) encryption or updates the Certificate Authorities (CA) certificate for a specified PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterSSLRequest
     * @return ModifyDBClusterSSLResponse
     */
    public ModifyDBClusterSSLResponse modifyDBClusterSSL(ModifyDBClusterSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterSSLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a serverless cluster.</p>
     * 
     * @param request ModifyDBClusterServerlessConfRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterServerlessConfResponse
     */
    public ModifyDBClusterServerlessConfResponse modifyDBClusterServerlessConfWithOptions(ModifyDBClusterServerlessConfRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowShutDown)) {
            query.put("AllowShutDown", request.allowShutDown);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.crontabJobId)) {
            query.put("CrontabJobId", request.crontabJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTimeService)) {
            query.put("FromTimeService", request.fromTimeService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleApRoNumMax)) {
            query.put("ScaleApRoNumMax", request.scaleApRoNumMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleApRoNumMin)) {
            query.put("ScaleApRoNumMin", request.scaleApRoNumMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleMax)) {
            query.put("ScaleMax", request.scaleMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleMin)) {
            query.put("ScaleMin", request.scaleMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleRoNumMax)) {
            query.put("ScaleRoNumMax", request.scaleRoNumMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleRoNumMin)) {
            query.put("ScaleRoNumMin", request.scaleRoNumMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondsUntilAutoPause)) {
            query.put("SecondsUntilAutoPause", request.secondsUntilAutoPause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessRuleCpuEnlargeThreshold)) {
            query.put("ServerlessRuleCpuEnlargeThreshold", request.serverlessRuleCpuEnlargeThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessRuleCpuShrinkThreshold)) {
            query.put("ServerlessRuleCpuShrinkThreshold", request.serverlessRuleCpuShrinkThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessRuleMode)) {
            query.put("ServerlessRuleMode", request.serverlessRuleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterServerlessConf"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterServerlessConfResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a serverless cluster.</p>
     * 
     * @param request ModifyDBClusterServerlessConfRequest
     * @return ModifyDBClusterServerlessConfResponse
     */
    public ModifyDBClusterServerlessConfResponse modifyDBClusterServerlessConf(ModifyDBClusterServerlessConfRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterServerlessConfWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the storage capacity of a pay-as-you-go cluster of Enterprise Edition or a cluster of Standard Edition.</p>
     * 
     * @param request ModifyDBClusterStorageSpaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterStorageSpaceResponse
     */
    public ModifyDBClusterStorageSpaceResponse modifyDBClusterStorageSpaceWithOptions(ModifyDBClusterStorageSpaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSpace)) {
            query.put("StorageSpace", request.storageSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCategory)) {
            query.put("SubCategory", request.subCategory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterStorageSpace"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterStorageSpaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the storage capacity of a pay-as-you-go cluster of Enterprise Edition or a cluster of Standard Edition.</p>
     * 
     * @param request ModifyDBClusterStorageSpaceRequest
     * @return ModifyDBClusterStorageSpaceResponse
     */
    public ModifyDBClusterStorageSpaceResponse modifyDBClusterStorageSpace(ModifyDBClusterStorageSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterStorageSpaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To perform this operation, you must activate KMS first. For more information, see <a href="https://help.aliyun.com/document_detail/153781.html">Purchase a dedicated KMS instance</a>.</li>
     * <li>After TDE is enabled, you cannot disable TDE.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables the transparent data encryption (TDE) feature for a PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterTDERequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterTDEResponse
     */
    public ModifyDBClusterTDEResponse modifyDBClusterTDEWithOptions(ModifyDBClusterTDERequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAutomaticRotation)) {
            query.put("EnableAutomaticRotation", request.enableAutomaticRotation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptNewTables)) {
            query.put("EncryptNewTables", request.encryptNewTables);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKey)) {
            query.put("EncryptionKey", request.encryptionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            query.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TDEStatus)) {
            query.put("TDEStatus", request.TDEStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterTDE"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterTDEResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>To perform this operation, you must activate KMS first. For more information, see <a href="https://help.aliyun.com/document_detail/153781.html">Purchase a dedicated KMS instance</a>.</li>
     * <li>After TDE is enabled, you cannot disable TDE.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Enables the transparent data encryption (TDE) feature for a PolarDB cluster.</p>
     * 
     * @param request ModifyDBClusterTDERequest
     * @return ModifyDBClusterTDEResponse
     */
    public ModifyDBClusterTDEResponse modifyDBClusterTDE(ModifyDBClusterTDERequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterTDEWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a database in a PolarDB for MySQL cluster.</p>
     * 
     * @param request ModifyDBDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBDescriptionResponse
     */
    public ModifyDBDescriptionResponse modifyDBDescriptionWithOptions(ModifyDBDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBDescription)) {
            query.put("DBDescription", request.DBDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBDescription"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a database in a PolarDB for MySQL cluster.</p>
     * 
     * @param request ModifyDBDescriptionRequest
     * @return ModifyDBDescriptionResponse
     */
    public ModifyDBDescriptionResponse modifyDBDescription(ModifyDBDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the endpoints of a PolarDB cluster, including the primary endpoint, default cluster endpoint, custom cluster endpoint, and private domain name.</p>
     * 
     * @param request ModifyDBEndpointAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBEndpointAddressResponse
     */
    public ModifyDBEndpointAddressResponse modifyDBEndpointAddressWithOptions(ModifyDBEndpointAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBEndpointId)) {
            query.put("DBEndpointId", request.DBEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netType)) {
            query.put("NetType", request.netType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateZoneAddressPrefix)) {
            query.put("PrivateZoneAddressPrefix", request.privateZoneAddressPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateZoneName)) {
            query.put("PrivateZoneName", request.privateZoneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBEndpointAddress"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBEndpointAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the endpoints of a PolarDB cluster, including the primary endpoint, default cluster endpoint, custom cluster endpoint, and private domain name.</p>
     * 
     * @param request ModifyDBEndpointAddressRequest
     * @return ModifyDBEndpointAddressResponse
     */
    public ModifyDBEndpointAddressResponse modifyDBEndpointAddress(ModifyDBEndpointAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBEndpointAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the node specifications of a PolarDB cluster.</p>
     * 
     * @param request ModifyDBNodeClassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBNodeClassResponse
     */
    public ModifyDBNodeClassResponse modifyDBNodeClassWithOptions(ModifyDBNodeClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeTargetClass)) {
            query.put("DBNodeTargetClass", request.DBNodeTargetClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeType)) {
            query.put("DBNodeType", request.DBNodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            query.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedFlashingOffTime)) {
            query.put("PlannedFlashingOffTime", request.plannedFlashingOffTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCategory)) {
            query.put("SubCategory", request.subCategory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBNodeClass"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBNodeClassResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the node specifications of a PolarDB cluster.</p>
     * 
     * @param request ModifyDBNodeClassRequest
     * @return ModifyDBNodeClassResponse
     */
    public ModifyDBNodeClassResponse modifyDBNodeClass(ModifyDBNodeClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBNodeClassWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the hot standby node in a cluster.</p>
     * 
     * @param request ModifyDBNodeHotReplicaModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBNodeHotReplicaModeResponse
     */
    public ModifyDBNodeHotReplicaModeResponse modifyDBNodeHotReplicaModeWithOptions(ModifyDBNodeHotReplicaModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeId)) {
            query.put("DBNodeId", request.DBNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotReplicaMode)) {
            query.put("HotReplicaMode", request.hotReplicaMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBNodeHotReplicaMode"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBNodeHotReplicaModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the hot standby node in a cluster.</p>
     * 
     * @param request ModifyDBNodeHotReplicaModeRequest
     * @return ModifyDBNodeHotReplicaModeResponse
     */
    public ModifyDBNodeHotReplicaModeResponse modifyDBNodeHotReplicaMode(ModifyDBNodeHotReplicaModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBNodeHotReplicaModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the specifications of a node in a PolarDB cluster.</p>
     * 
     * @param request ModifyDBNodesClassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBNodesClassResponse
     */
    public ModifyDBNodesClassResponse modifyDBNodesClassWithOptions(ModifyDBNodesClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNode)) {
            query.put("DBNode", request.DBNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            query.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedFlashingOffTime)) {
            query.put("PlannedFlashingOffTime", request.plannedFlashingOffTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCategory)) {
            query.put("SubCategory", request.subCategory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBNodesClass"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBNodesClassResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the specifications of a node in a PolarDB cluster.</p>
     * 
     * @param request ModifyDBNodesClassRequest
     * @return ModifyDBNodesClassResponse
     */
    public ModifyDBNodesClassResponse modifyDBNodesClass(ModifyDBNodesClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBNodesClassWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the parameters of a node and applies them to specified nodes.</p>
     * 
     * @param request ModifyDBNodesParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBNodesParametersResponse
     */
    public ModifyDBNodesParametersResponse modifyDBNodesParametersWithOptions(ModifyDBNodesParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeIds)) {
            query.put("DBNodeIds", request.DBNodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTimeService)) {
            query.put("FromTimeService", request.fromTimeService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterGroupId)) {
            query.put("ParameterGroupId", request.parameterGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBNodesParameters"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBNodesParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the parameters of a node and applies them to specified nodes.</p>
     * 
     * @param request ModifyDBNodesParametersRequest
     * @return ModifyDBNodesParametersResponse
     */
    public ModifyDBNodesParametersResponse modifyDBNodesParameters(ModifyDBNodesParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBNodesParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a global database network (GDN).</p>
     * 
     * @param request ModifyGlobalDatabaseNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGlobalDatabaseNetworkResponse
     */
    public ModifyGlobalDatabaseNetworkResponse modifyGlobalDatabaseNetworkWithOptions(ModifyGlobalDatabaseNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableGlobalDomainName)) {
            query.put("EnableGlobalDomainName", request.enableGlobalDomainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GDNDescription)) {
            query.put("GDNDescription", request.GDNDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GDNId)) {
            query.put("GDNId", request.GDNId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGlobalDatabaseNetwork"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGlobalDatabaseNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a global database network (GDN).</p>
     * 
     * @param request ModifyGlobalDatabaseNetworkRequest
     * @return ModifyGlobalDatabaseNetworkResponse
     */
    public ModifyGlobalDatabaseNetworkResponse modifyGlobalDatabaseNetwork(ModifyGlobalDatabaseNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGlobalDatabaseNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an IP whitelist template.</p>
     * 
     * @param request ModifyGlobalSecurityIPGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGlobalSecurityIPGroupResponse
     */
    public ModifyGlobalSecurityIPGroupResponse modifyGlobalSecurityIPGroupWithOptions(ModifyGlobalSecurityIPGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.GIpList)) {
            query.put("GIpList", request.GIpList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalIgName)) {
            query.put("GlobalIgName", request.globalIgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGlobalSecurityIPGroup"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGlobalSecurityIPGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an IP whitelist template.</p>
     * 
     * @param request ModifyGlobalSecurityIPGroupRequest
     * @return ModifyGlobalSecurityIPGroupResponse
     */
    public ModifyGlobalSecurityIPGroupResponse modifyGlobalSecurityIPGroup(ModifyGlobalSecurityIPGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGlobalSecurityIPGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a global IP whitelist template.</p>
     * 
     * @param request ModifyGlobalSecurityIPGroupNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGlobalSecurityIPGroupNameResponse
     */
    public ModifyGlobalSecurityIPGroupNameResponse modifyGlobalSecurityIPGroupNameWithOptions(ModifyGlobalSecurityIPGroupNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.globalIgName)) {
            query.put("GlobalIgName", request.globalIgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGlobalSecurityIPGroupName"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGlobalSecurityIPGroupNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name of a global IP whitelist template.</p>
     * 
     * @param request ModifyGlobalSecurityIPGroupNameRequest
     * @return ModifyGlobalSecurityIPGroupNameResponse
     */
    public ModifyGlobalSecurityIPGroupNameResponse modifyGlobalSecurityIPGroupName(ModifyGlobalSecurityIPGroupNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGlobalSecurityIPGroupNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the relationship between a cluster and a global IP whitelist template.</p>
     * 
     * @param request ModifyGlobalSecurityIPGroupRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGlobalSecurityIPGroupRelationResponse
     */
    public ModifyGlobalSecurityIPGroupRelationResponse modifyGlobalSecurityIPGroupRelationWithOptions(ModifyGlobalSecurityIPGroupRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.globalSecurityGroupId)) {
            query.put("GlobalSecurityGroupId", request.globalSecurityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGlobalSecurityIPGroupRelation"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGlobalSecurityIPGroupRelationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the relationship between a cluster and a global IP whitelist template.</p>
     * 
     * @param request ModifyGlobalSecurityIPGroupRelationRequest
     * @return ModifyGlobalSecurityIPGroupRelationResponse
     */
    public ModifyGlobalSecurityIPGroupRelationResponse modifyGlobalSecurityIPGroupRelation(ModifyGlobalSecurityIPGroupRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGlobalSecurityIPGroupRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the retention policy of the log backups in a PolarDB cluster.</p>
     * 
     * @param request ModifyLogBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLogBackupPolicyResponse
     */
    public ModifyLogBackupPolicyResponse modifyLogBackupPolicyWithOptions(ModifyLogBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logBackupAnotherRegionRegion)) {
            query.put("LogBackupAnotherRegionRegion", request.logBackupAnotherRegionRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logBackupAnotherRegionRetentionPeriod)) {
            query.put("LogBackupAnotherRegionRetentionPeriod", request.logBackupAnotherRegionRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logBackupRetentionPeriod)) {
            query.put("LogBackupRetentionPeriod", request.logBackupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLogBackupPolicy"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLogBackupPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the retention policy of the log backups in a PolarDB cluster.</p>
     * 
     * @param request ModifyLogBackupPolicyRequest
     * @return ModifyLogBackupPolicyResponse
     */
    public ModifyLogBackupPolicyResponse modifyLogBackupPolicy(ModifyLogBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLogBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies or adds a data masking rule.</p>
     * 
     * @param request ModifyMaskingRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMaskingRulesResponse
     */
    public ModifyMaskingRulesResponse modifyMaskingRulesWithOptions(ModifyMaskingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleConfig)) {
            query.put("RuleConfig", request.ruleConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleNameList)) {
            query.put("RuleNameList", request.ruleNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleVersion)) {
            query.put("RuleVersion", request.ruleVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMaskingRules"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMaskingRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies or adds a data masking rule.</p>
     * 
     * @param request ModifyMaskingRulesRequest
     * @return ModifyMaskingRulesResponse
     */
    public ModifyMaskingRulesResponse modifyMaskingRules(ModifyMaskingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMaskingRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the switching time of a pending event.</p>
     * 
     * @param request ModifyPendingMaintenanceActionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPendingMaintenanceActionResponse
     */
    public ModifyPendingMaintenanceActionResponse modifyPendingMaintenanceActionWithOptions(ModifyPendingMaintenanceActionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTime)) {
            query.put("SwitchTime", request.switchTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPendingMaintenanceAction"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPendingMaintenanceActionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the switching time of a pending event.</p>
     * 
     * @param request ModifyPendingMaintenanceActionRequest
     * @return ModifyPendingMaintenanceActionResponse
     */
    public ModifyPendingMaintenanceActionResponse modifyPendingMaintenanceAction(ModifyPendingMaintenanceActionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPendingMaintenanceActionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the PolarDB for AI feature for a cluster.</p>
     * 
     * @param request OpenAITaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenAITaskResponse
     */
    public OpenAITaskResponse openAITaskWithOptions(OpenAITaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("NodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenAITask"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenAITaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the PolarDB for AI feature for a cluster.</p>
     * 
     * @param request OpenAITaskRequest
     * @return OpenAITaskResponse
     */
    public OpenAITaskResponse openAITask(OpenAITaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openAITaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the storage usage of a cluster.</p>
     * 
     * @param request RefreshDBClusterStorageUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshDBClusterStorageUsageResponse
     */
    public RefreshDBClusterStorageUsageResponse refreshDBClusterStorageUsageWithOptions(RefreshDBClusterStorageUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncRealTime)) {
            query.put("SyncRealTime", request.syncRealTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshDBClusterStorageUsage"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshDBClusterStorageUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the storage usage of a cluster.</p>
     * 
     * @param request RefreshDBClusterStorageUsageRequest
     * @return RefreshDBClusterStorageUsageResponse
     */
    public RefreshDBClusterStorageUsageResponse refreshDBClusterStorageUsage(RefreshDBClusterStorageUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshDBClusterStorageUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot remove the primary cluster from a GDN.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Removes a secondary cluster from a GDN.</p>
     * 
     * @param request RemoveDBClusterFromGDNRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveDBClusterFromGDNResponse
     */
    public RemoveDBClusterFromGDNResponse removeDBClusterFromGDNWithOptions(RemoveDBClusterFromGDNRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GDNId)) {
            query.put("GDNId", request.GDNId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDBClusterFromGDN"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDBClusterFromGDNResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You cannot remove the primary cluster from a GDN.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Removes a secondary cluster from a GDN.</p>
     * 
     * @param request RemoveDBClusterFromGDNRequest
     * @return RemoveDBClusterFromGDNResponse
     */
    public RemoveDBClusterFromGDNResponse removeDBClusterFromGDN(RemoveDBClusterFromGDNRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDBClusterFromGDNWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Only PolarDB for MySQL clusters support this operation.</li>
     * <li>If the privileged account of your cluster encounters exceptions, you can call this operation to reset the permissions. For example, the permissions are accidentally revoked.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets the permissions of a privileged account for a PolarDB cluster.</p>
     * 
     * @param request ResetAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAccountResponse
     */
    public ResetAccountResponse resetAccountWithOptions(ResetAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAccount"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAccountResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>Only PolarDB for MySQL clusters support this operation.</li>
     * <li>If the privileged account of your cluster encounters exceptions, you can call this operation to reset the permissions. For example, the permissions are accidentally revoked.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets the permissions of a privileged account for a PolarDB cluster.</p>
     * 
     * @param request ResetAccountRequest
     * @return ResetAccountResponse
     */
    public ResetAccountResponse resetAccount(ResetAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rebuilds a secondary cluster in a Global Database Network (GDN).</p>
     * 
     * @param request ResetGlobalDatabaseNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetGlobalDatabaseNetworkResponse
     */
    public ResetGlobalDatabaseNetworkResponse resetGlobalDatabaseNetworkWithOptions(ResetGlobalDatabaseNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GDNId)) {
            query.put("GDNId", request.GDNId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetGlobalDatabaseNetwork"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetGlobalDatabaseNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rebuilds a secondary cluster in a Global Database Network (GDN).</p>
     * 
     * @param request ResetGlobalDatabaseNetworkRequest
     * @return ResetGlobalDatabaseNetworkResponse
     */
    public ResetGlobalDatabaseNetworkResponse resetGlobalDatabaseNetwork(ResetGlobalDatabaseNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetGlobalDatabaseNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts database links.</p>
     * 
     * @param request RestartDBLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartDBLinkResponse
     */
    public RestartDBLinkResponse restartDBLinkWithOptions(RestartDBLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDBLink"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDBLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts database links.</p>
     * 
     * @param request RestartDBLinkRequest
     * @return RestartDBLinkResponse
     */
    public RestartDBLinkResponse restartDBLink(RestartDBLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDBLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a node in a PolarDB cluster.</p>
     * 
     * @param request RestartDBNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartDBNodeResponse
     */
    public RestartDBNodeResponse restartDBNodeWithOptions(RestartDBNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBNodeId)) {
            query.put("DBNodeId", request.DBNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDBNode"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDBNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a node in a PolarDB cluster.</p>
     * 
     * @param request RestartDBNodeRequest
     * @return RestartDBNodeResponse
     */
    public RestartDBNodeResponse restartDBNode(RestartDBNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDBNodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restores PolarDB databases and tables.</p>
     * 
     * @param request RestoreTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestoreTableResponse
     */
    public RestoreTableResponse restoreTableWithOptions(RestoreTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTime)) {
            query.put("RestoreTime", request.restoreTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableMeta)) {
            query.put("TableMeta", request.tableMeta);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreTable"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restores PolarDB databases and tables.</p>
     * 
     * @param request RestoreTableRequest
     * @return RestoreTableResponse
     */
    public RestoreTableResponse restoreTable(RestoreTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreTableWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the access permissions on one or more databases from a specified PolarDB standard account.</p>
     * 
     * @param request RevokeAccountPrivilegeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeAccountPrivilegeResponse
     */
    public RevokeAccountPrivilegeResponse revokeAccountPrivilegeWithOptions(RevokeAccountPrivilegeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeAccountPrivilege"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeAccountPrivilegeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the access permissions on one or more databases from a specified PolarDB standard account.</p>
     * 
     * @param request RevokeAccountPrivilegeRequest
     * @return RevokeAccountPrivilegeResponse
     */
    public RevokeAccountPrivilegeResponse revokeAccountPrivilege(RevokeAccountPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeAccountPrivilegeWithOptions(request, runtime);
    }

    /**
     * @param request SwitchOverGlobalDatabaseNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchOverGlobalDatabaseNetworkResponse
     */
    public SwitchOverGlobalDatabaseNetworkResponse switchOverGlobalDatabaseNetworkWithOptions(SwitchOverGlobalDatabaseNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forced)) {
            query.put("Forced", request.forced);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.GDNId)) {
            query.put("GDNId", request.GDNId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchOverGlobalDatabaseNetwork"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchOverGlobalDatabaseNetworkResponse());
    }

    /**
     * @param request SwitchOverGlobalDatabaseNetworkRequest
     * @return SwitchOverGlobalDatabaseNetworkResponse
     */
    public SwitchOverGlobalDatabaseNetworkResponse switchOverGlobalDatabaseNetwork(SwitchOverGlobalDatabaseNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchOverGlobalDatabaseNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates tags for a PolarDB cluster.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2017-08-01"),
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
     * <p>Creates tags for a PolarDB cluster.</p>
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
     * <p>Temporarily changes the node configurations of a cluster.</p>
     * 
     * @param request TempModifyDBNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TempModifyDBNodeResponse
     */
    public TempModifyDBNodeResponse tempModifyDBNodeWithOptions(TempModifyDBNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNode)) {
            query.put("DBNode", request.DBNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            query.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreTime)) {
            query.put("RestoreTime", request.restoreTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TempModifyDBNode"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TempModifyDBNodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Temporarily changes the node configurations of a cluster.</p>
     * 
     * @param request TempModifyDBNodeRequest
     * @return TempModifyDBNodeResponse
     */
    public TempModifyDBNodeResponse tempModifyDBNode(TempModifyDBNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tempModifyDBNodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>PolarDB clusters support the subscription and pay-as-you-go billing methods. You can change the billing method from subscription to pay-as-you-go or from pay-as-you-go to subscription based on your business requirements. For more information, see <a href="https://help.aliyun.com/document_detail/172886.html">Change the billing method from subscription to pay-as-you-go</a> and <a href="https://help.aliyun.com/document_detail/84076.html">Change the billing method from pay-as-you-go to subscription</a>.</li>
     * <li>You cannot change the billing method from pay-as-you-go to subscription if your account balance is insufficient.</li>
     * <li>If you change the billing method from subscription to pay-as-you-go, the system automatically refunds the balance of the prepaid subscription fees.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the billing method of a PolarDB cluster.</p>
     * 
     * @param request TransformDBClusterPayTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransformDBClusterPayTypeResponse
     */
    public TransformDBClusterPayTypeResponse transformDBClusterPayTypeWithOptions(TransformDBClusterPayTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransformDBClusterPayType"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransformDBClusterPayTypeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>PolarDB clusters support the subscription and pay-as-you-go billing methods. You can change the billing method from subscription to pay-as-you-go or from pay-as-you-go to subscription based on your business requirements. For more information, see <a href="https://help.aliyun.com/document_detail/172886.html">Change the billing method from subscription to pay-as-you-go</a> and <a href="https://help.aliyun.com/document_detail/84076.html">Change the billing method from pay-as-you-go to subscription</a>.</li>
     * <li>You cannot change the billing method from pay-as-you-go to subscription if your account balance is insufficient.</li>
     * <li>If you change the billing method from subscription to pay-as-you-go, the system automatically refunds the balance of the prepaid subscription fees.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the billing method of a PolarDB cluster.</p>
     * 
     * @param request TransformDBClusterPayTypeRequest
     * @return TransformDBClusterPayTypeResponse
     */
    public TransformDBClusterPayTypeResponse transformDBClusterPayType(TransformDBClusterPayTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transformDBClusterPayTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds tags from PolarDB clusters.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2017-08-01"),
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
     * <p>Unbinds tags from PolarDB clusters.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can update only the revision version of a PolarDB for MySQL cluster, for example, from 8.0.1.1.3 to 8.0.1.1.4.</li>
     * <li>You can use only your Alibaba Cloud account to create scheduled tasks that update the kernel version of a PolarDB for MySQL cluster. RAM users are not authorized to update the kernel version of a PolarDB for MySQL cluster.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the kernel version of a PolarDB for MySQL cluster.</p>
     * 
     * @param request UpgradeDBClusterVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeDBClusterVersionResponse
     */
    public UpgradeDBClusterVersionResponse upgradeDBClusterVersionWithOptions(UpgradeDBClusterVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTimeService)) {
            query.put("FromTimeService", request.fromTimeService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedEndTime)) {
            query.put("PlannedEndTime", request.plannedEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.plannedStartTime)) {
            query.put("PlannedStartTime", request.plannedStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDBRevisionVersionCode)) {
            query.put("TargetDBRevisionVersionCode", request.targetDBRevisionVersionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProxyRevisionVersionCode)) {
            query.put("TargetProxyRevisionVersionCode", request.targetProxyRevisionVersionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeLabel)) {
            query.put("UpgradeLabel", request.upgradeLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradePolicy)) {
            query.put("UpgradePolicy", request.upgradePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeType)) {
            query.put("UpgradeType", request.upgradeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeDBClusterVersion"),
            new TeaPair("version", "2017-08-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeDBClusterVersionResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <ul>
     * <li>You can update only the revision version of a PolarDB for MySQL cluster, for example, from 8.0.1.1.3 to 8.0.1.1.4.</li>
     * <li>You can use only your Alibaba Cloud account to create scheduled tasks that update the kernel version of a PolarDB for MySQL cluster. RAM users are not authorized to update the kernel version of a PolarDB for MySQL cluster.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Upgrades the kernel version of a PolarDB for MySQL cluster.</p>
     * 
     * @param request UpgradeDBClusterVersionRequest
     * @return UpgradeDBClusterVersionResponse
     */
    public UpgradeDBClusterVersionResponse upgradeDBClusterVersion(UpgradeDBClusterVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBClusterVersionWithOptions(request, runtime);
    }
}
