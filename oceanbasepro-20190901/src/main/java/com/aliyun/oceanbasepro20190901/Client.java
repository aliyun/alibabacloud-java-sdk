// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901;

import com.aliyun.tea.*;
import com.aliyun.oceanbasepro20190901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("oceanbasepro", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>You can call this operation to close sessions in batches. Please note that this operation is executed asynchronously. After calling this operation, you need to verify it by calling DescribeProcessStatsComposition.</p>
     * 
     * @param request BatchKillProcessListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchKillProcessListResponse
     */
    public BatchKillProcessListResponse batchKillProcessListWithOptions(BatchKillProcessListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionList)) {
            body.put("SessionList", request.sessionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchKillProcessList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchKillProcessListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to close sessions in batches. Please note that this operation is executed asynchronously. After calling this operation, you need to verify it by calling DescribeProcessStatsComposition.</p>
     * 
     * @param request BatchKillProcessListRequest
     * @return BatchKillProcessListResponse
     */
    public BatchKillProcessListResponse batchKillProcessList(BatchKillProcessListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchKillProcessListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>异步关闭集群租户的会话信息；关闭oceanbase云服务和业务之间的会话信息</p>
     * 
     * @param request BatchKillSessionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchKillSessionListResponse
     */
    public BatchKillSessionListResponse batchKillSessionListWithOptions(BatchKillSessionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionList)) {
            body.put("SessionList", request.sessionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchKillSessionList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchKillSessionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>异步关闭集群租户的会话信息；关闭oceanbase云服务和业务之间的会话信息</p>
     * 
     * @param request BatchKillSessionListRequest
     * @return BatchKillSessionListResponse
     */
    public BatchKillSessionListResponse batchKillSessionList(BatchKillSessionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchKillSessionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据记录id取消修改操作 （仅支持处于 PENDING 状态的修改记录）</p>
     * 
     * @param request CancelProjectModifyRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelProjectModifyRecordResponse
     */
    public CancelProjectModifyRecordResponse cancelProjectModifyRecordWithOptions(CancelProjectModifyRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelProjectModifyRecord"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelProjectModifyRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据记录id取消修改操作 （仅支持处于 PENDING 状态的修改记录）</p>
     * 
     * @param request CancelProjectModifyRecordRequest
     * @return CancelProjectModifyRecordResponse
     */
    public CancelProjectModifyRecordResponse cancelProjectModifyRecord(CancelProjectModifyRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelProjectModifyRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建备份任务下载链接</p>
     * 
     * @param request CreateBackupSetDownloadLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackupSetDownloadLinkResponse
     */
    public CreateBackupSetDownloadLinkResponse createBackupSetDownloadLinkWithOptions(CreateBackupSetDownloadLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            body.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackupSetDownloadLink"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackupSetDownloadLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建备份任务下载链接</p>
     * 
     * @param request CreateBackupSetDownloadLinkRequest
     * @return CreateBackupSetDownloadLinkResponse
     */
    public CreateBackupSetDownloadLinkResponse createBackupSetDownloadLink(CreateBackupSetDownloadLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupSetDownloadLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The request ID.</p>
     * 
     * @param request CreateDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabaseWithOptions(CreateDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collation)) {
            body.put("Collation", request.collation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encoding)) {
            body.put("Encoding", request.encoding);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatabase"),
            new TeaPair("version", "2019-09-01"),
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
     * <b>summary</b> : 
     * <p>The request ID.</p>
     * 
     * @param request CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to create an OceanBase cluster.</p>
     * 
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            body.put("AutoRenewPeriod", request.autoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpuArch)) {
            body.put("CpuArch", request.cpuArch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            body.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            body.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            body.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isolationOptimization)) {
            body.put("IsolationOptimization", request.isolationOptimization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obVersion)) {
            body.put("ObVersion", request.obVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryInstance)) {
            body.put("PrimaryInstance", request.primaryInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryRegion)) {
            body.put("PrimaryRegion", request.primaryRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicaMode)) {
            body.put("ReplicaMode", request.replicaMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.series)) {
            body.put("Series", request.series);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zones)) {
            body.put("Zones", request.zones);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to create an OceanBase cluster.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建标签</p>
     * 
     * @param request CreateLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLabelResponse
     */
    public CreateLabelResponse createLabelWithOptions(CreateLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLabel"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建标签</p>
     * 
     * @param request CreateLabelRequest
     * @return CreateLabelResponse
     */
    public CreateLabelResponse createLabel(CreateLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建 MySQL 数据源</p>
     * 
     * @param request CreateMySqlDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMySqlDataSourceResponse
     */
    public CreateMySqlDataSourceResponse createMySqlDataSourceWithOptions(CreateMySqlDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dgInstanceId)) {
            body.put("DgInstanceId", request.dgInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            body.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useSsl)) {
            body.put("UseSsl", request.useSsl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMySqlDataSource"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMySqlDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建 MySQL 数据源</p>
     * 
     * @param request CreateMySqlDataSourceRequest
     * @return CreateMySqlDataSourceResponse
     */
    public CreateMySqlDataSourceResponse createMySqlDataSource(CreateMySqlDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMySqlDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建 OceanBase 数据源</p>
     * 
     * @param request CreateOceanBaseDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOceanBaseDataSourceResponse
     */
    public CreateOceanBaseDataSourceResponse createOceanBaseDataSourceWithOptions(CreateOceanBaseDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            body.put("Cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configUrl)) {
            body.put("ConfigUrl", request.configUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drcPassword)) {
            body.put("DrcPassword", request.drcPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.drcUserName)) {
            body.put("DrcUserName", request.drcUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.innerDrcPassword)) {
            body.put("InnerDrcPassword", request.innerDrcPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProxyIp)) {
            body.put("LogProxyIp", request.logProxyIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logProxyPort)) {
            body.put("LogProxyPort", request.logProxyPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenant)) {
            body.put("Tenant", request.tenant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOceanBaseDataSource"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOceanBaseDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建 OceanBase 数据源</p>
     * 
     * @param request CreateOceanBaseDataSourceRequest
     * @return CreateOceanBaseDataSourceResponse
     */
    public CreateOceanBaseDataSourceResponse createOceanBaseDataSource(CreateOceanBaseDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOceanBaseDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To call this operation, you must add the IP address of the OceanBase Migration Service (OMS) server to the whitelist of the Alibaba Cloud database instance, the security rules of the ECS instance, or the security settings of your self-managed database (usually the firewall of your self-managed database) to ensure that OMS can successfully access your database instance. To obtain the IP address of the OMS server, go to the OMS data source management page in the OMS console.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to create a MySQL data source.</p>
     * 
     * @param request CreateOmsMysqlDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOmsMysqlDataSourceResponse
     */
    public CreateOmsMysqlDataSourceResponse createOmsMysqlDataSourceWithOptions(CreateOmsMysqlDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dgDatabaseId)) {
            body.put("DgDatabaseId", request.dgDatabaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            body.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOmsMysqlDataSource"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOmsMysqlDataSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>To call this operation, you must add the IP address of the OceanBase Migration Service (OMS) server to the whitelist of the Alibaba Cloud database instance, the security rules of the ECS instance, or the security settings of your self-managed database (usually the firewall of your self-managed database) to ensure that OMS can successfully access your database instance. To obtain the IP address of the OMS server, go to the OMS data source management page in the OMS console.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to create a MySQL data source.</p>
     * 
     * @param request CreateOmsMysqlDataSourceRequest
     * @return CreateOmsMysqlDataSourceResponse
     */
    public CreateOmsMysqlDataSourceResponse createOmsMysqlDataSource(CreateOmsMysqlDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOmsMysqlDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param tmpReq CreateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectShrinkRequest request = new CreateProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commonTransferConfig)) {
            request.commonTransferConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commonTransferConfig, "CommonTransferConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fullTransferConfig)) {
            request.fullTransferConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fullTransferConfig, "FullTransferConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.incrTransferConfig)) {
            request.incrTransferConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.incrTransferConfig, "IncrTransferConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelIds)) {
            request.labelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelIds, "LabelIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reverseIncrTransferConfig)) {
            request.reverseIncrTransferConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reverseIncrTransferConfig, "ReverseIncrTransferConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.structTransferConfig)) {
            request.structTransferConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.structTransferConfig, "StructTransferConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transferMapping)) {
            request.transferMappingShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transferMapping, "TransferMapping", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commonTransferConfigShrink)) {
            body.put("CommonTransferConfig", request.commonTransferConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableFullTransfer)) {
            body.put("EnableFullTransfer", request.enableFullTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableFullVerify)) {
            body.put("EnableFullVerify", request.enableFullVerify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableIncrTransfer)) {
            body.put("EnableIncrTransfer", request.enableIncrTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableReverseIncrTransfer)) {
            body.put("EnableReverseIncrTransfer", request.enableReverseIncrTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableStructTransfer)) {
            body.put("EnableStructTransfer", request.enableStructTransfer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullTransferConfigShrink)) {
            body.put("FullTransferConfig", request.fullTransferConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incrTransferConfigShrink)) {
            body.put("IncrTransferConfig", request.incrTransferConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labelIdsShrink)) {
            body.put("LabelIds", request.labelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            body.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverseIncrTransferConfigShrink)) {
            body.put("ReverseIncrTransferConfig", request.reverseIncrTransferConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkEndpointId)) {
            body.put("SinkEndpointId", request.sinkEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointId)) {
            body.put("SourceEndpointId", request.sourceEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.structTransferConfigShrink)) {
            body.put("StructTransferConfig", request.structTransferConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferMappingShrink)) {
            body.put("TransferMapping", request.transferMappingShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useOss)) {
            body.put("UseOss", request.useOss);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workerGradeId)) {
            body.put("WorkerGradeId", request.workerGradeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建项目</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改传输对象（加减表）(仅支持处于 RUNNING/FAILED/SUSPEND 状态的项目)</p>
     * 
     * @param tmpReq CreateProjectModifyRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectModifyRecordsResponse
     */
    public CreateProjectModifyRecordsResponse createProjectModifyRecordsWithOptions(CreateProjectModifyRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProjectModifyRecordsShrinkRequest request = new CreateProjectModifyRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.databases)) {
            request.databasesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.databases, "Databases", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databasesShrink)) {
            body.put("Databases", request.databasesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProjectModifyRecords"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectModifyRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改传输对象（加减表）(仅支持处于 RUNNING/FAILED/SUSPEND 状态的项目)</p>
     * 
     * @param request CreateProjectModifyRecordsRequest
     * @return CreateProjectModifyRecordsResponse
     */
    public CreateProjectModifyRecordsResponse createProjectModifyRecords(CreateProjectModifyRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectModifyRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建RDS PG 数据源</p>
     * 
     * @param request CreateRdsPostgreSQLDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRdsPostgreSQLDataSourceResponse
     */
    public CreateRdsPostgreSQLDataSourceResponse createRdsPostgreSQLDataSourceWithOptions(CreateRdsPostgreSQLDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRdsPostgreSQLDataSource"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRdsPostgreSQLDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建RDS PG 数据源</p>
     * 
     * @param request CreateRdsPostgreSQLDataSourceRequest
     * @return CreateRdsPostgreSQLDataSourceResponse
     */
    public CreateRdsPostgreSQLDataSourceResponse createRdsPostgreSQLDataSource(CreateRdsPostgreSQLDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRdsPostgreSQLDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the whitelist group.</p>
     * 
     * @param request CreateSecurityIpGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecurityIpGroupResponse
     */
    public CreateSecurityIpGroupResponse createSecurityIpGroupWithOptions(CreateSecurityIpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIpGroupName)) {
            body.put("SecurityIpGroupName", request.securityIpGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            body.put("SecurityIps", request.securityIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecurityIpGroup"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityIpGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the whitelist group.</p>
     * 
     * @param request CreateSecurityIpGroupRequest
     * @return CreateSecurityIpGroupResponse
     */
    public CreateSecurityIpGroupResponse createSecurityIpGroup(CreateSecurityIpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityIpGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to create a tag group.</p>
     * 
     * @param request CreateTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTagResponse
     */
    public CreateTagResponse createTagWithOptions(CreateTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTag"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to create a tag group.</p>
     * 
     * @param request CreateTagRequest
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to create a tag.</p>
     * 
     * @param request CreateTagValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTagValueResponse
     */
    public CreateTagValueResponse createTagValueWithOptions(CreateTagValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTagValue"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTagValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to create a tag.</p>
     * 
     * @param request CreateTagValueRequest
     * @return CreateTagValueResponse
     */
    public CreateTagValueResponse createTagValue(CreateTagValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTagValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to create a tenant.</p>
     * 
     * @param tmpReq CreateTenantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTenantResponse
     */
    public CreateTenantResponse createTenantWithOptions(CreateTenantRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTenantShrinkRequest request = new CreateTenantShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createParams)) {
            request.createParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createParams, "CreateParams", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.charset)) {
            body.put("Charset", request.charset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createParamsShrink)) {
            body.put("CreateParams", request.createParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logDisk)) {
            body.put("LogDisk", request.logDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryZone)) {
            body.put("PrimaryZone", request.primaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readOnlyZoneList)) {
            body.put("ReadOnlyZoneList", request.readOnlyZoneList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantMode)) {
            body.put("TenantMode", request.tenantMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantName)) {
            body.put("TenantName", request.tenantName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            body.put("TimeZone", request.timeZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unitNum)) {
            body.put("UnitNum", request.unitNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVSwitchId)) {
            body.put("UserVSwitchId", request.userVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpcId)) {
            body.put("UserVpcId", request.userVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpcOwnerId)) {
            body.put("UserVpcOwnerId", request.userVpcOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTenant"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTenantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to create a tenant.</p>
     * 
     * @param request CreateTenantRequest
     * @return CreateTenantResponse
     */
    public CreateTenantResponse createTenant(CreateTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTenantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The request ID.</p>
     * 
     * @param request CreateTenantReadOnlyConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTenantReadOnlyConnectionResponse
     */
    public CreateTenantReadOnlyConnectionResponse createTenantReadOnlyConnectionWithOptions(CreateTenantReadOnlyConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            body.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTenantReadOnlyConnection"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTenantReadOnlyConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The request ID.</p>
     * 
     * @param request CreateTenantReadOnlyConnectionRequest
     * @return CreateTenantReadOnlyConnectionResponse
     */
    public CreateTenantReadOnlyConnectionResponse createTenantReadOnlyConnection(CreateTenantReadOnlyConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTenantReadOnlyConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to create the security whitelist for the tenant.</p>
     * 
     * @param request CreateTenantSecurityIpGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTenantSecurityIpGroupResponse
     */
    public CreateTenantSecurityIpGroupResponse createTenantSecurityIpGroupWithOptions(CreateTenantSecurityIpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIpGroupName)) {
            body.put("SecurityIpGroupName", request.securityIpGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            body.put("SecurityIps", request.securityIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTenantSecurityIpGroup"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTenantSecurityIpGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to create the security whitelist for the tenant.</p>
     * 
     * @param request CreateTenantSecurityIpGroupRequest
     * @return CreateTenantSecurityIpGroupResponse
     */
    public CreateTenantSecurityIpGroupResponse createTenantSecurityIpGroup(CreateTenantSecurityIpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTenantSecurityIpGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateTenantUser</p>
     * 
     * @param request CreateTenantUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTenantUserResponse
     */
    public CreateTenantUserResponse createTenantUserWithOptions(CreateTenantUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionType)) {
            body.put("EncryptionType", request.encryptionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roles)) {
            body.put("Roles", request.roles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPassword)) {
            body.put("UserPassword", request.userPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            body.put("UserType", request.userType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTenantUser"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTenantUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>CreateTenantUser</p>
     * 
     * @param request CreateTenantUserRequest
     * @return CreateTenantUserResponse
     */
    public CreateTenantUserResponse createTenantUser(CreateTenantUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTenantUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * 
     * @param request DeleteDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除数据源</p>
     * 
     * @param request DeleteDataSourceRequest
     * @return DeleteDataSourceResponse
     */
    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The request ID.</p>
     * 
     * @param request DeleteDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatabasesResponse
     */
    public DeleteDatabasesResponse deleteDatabasesWithOptions(DeleteDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseNames)) {
            body.put("DatabaseNames", request.databaseNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatabases"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatabasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The request ID.</p>
     * 
     * @param request DeleteDatabasesRequest
     * @return DeleteDatabasesResponse
     */
    public DeleteDatabasesResponse deleteDatabases(DeleteDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDatabasesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that the following requirements are met:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The cluster is a primary cluster and the billing method is pay-as-you-go.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to release an OceanBase cluster.</p>
     * 
     * @param request DeleteInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstancesResponse
     */
    public DeleteInstancesResponse deleteInstancesWithOptions(DeleteInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupRetainMode)) {
            body.put("BackupRetainMode", request.backupRetainMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            body.put("InstanceIds", request.instanceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstances"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, ensure that the following requirements are met:</p>
     * <ul>
     * <li>The cluster is in the Running state.</li>
     * <li>The cluster is a primary cluster and the billing method is pay-as-you-go.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to release an OceanBase cluster.</p>
     * 
     * @param request DeleteInstancesRequest
     * @return DeleteInstancesResponse
     */
    public DeleteInstancesResponse deleteInstances(DeleteInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DeleteProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除项目</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the deleted IP address whitelist group.</p>
     * 
     * @param request DeleteSecurityIpGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityIpGroupResponse
     */
    public DeleteSecurityIpGroupResponse deleteSecurityIpGroupWithOptions(DeleteSecurityIpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIpGroupName)) {
            body.put("SecurityIpGroupName", request.securityIpGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityIpGroup"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityIpGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the deleted IP address whitelist group.</p>
     * 
     * @param request DeleteSecurityIpGroupRequest
     * @return DeleteSecurityIpGroupResponse
     */
    public DeleteSecurityIpGroupResponse deleteSecurityIpGroup(DeleteSecurityIpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityIpGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete a tag group.</p>
     * 
     * @param request DeleteTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTagWithOptions(DeleteTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTag"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete a tag group.</p>
     * 
     * @param request DeleteTagRequest
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete a tag from a tag group.</p>
     * 
     * @param request DeleteTagValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTagValueResponse
     */
    public DeleteTagValueResponse deleteTagValueWithOptions(DeleteTagValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTagValue"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTagValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete a tag from a tag group.</p>
     * 
     * @param request DeleteTagValueRequest
     * @return DeleteTagValueResponse
     */
    public DeleteTagValueResponse deleteTagValue(DeleteTagValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTagValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete the information on the whitelist group of the tenant.</p>
     * 
     * @param request DeleteTenantSecurityIpGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTenantSecurityIpGroupResponse
     */
    public DeleteTenantSecurityIpGroupResponse deleteTenantSecurityIpGroupWithOptions(DeleteTenantSecurityIpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIpGroupName)) {
            body.put("SecurityIpGroupName", request.securityIpGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTenantSecurityIpGroup"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTenantSecurityIpGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete the information on the whitelist group of the tenant.</p>
     * 
     * @param request DeleteTenantSecurityIpGroupRequest
     * @return DeleteTenantSecurityIpGroupResponse
     */
    public DeleteTenantSecurityIpGroupResponse deleteTenantSecurityIpGroup(DeleteTenantSecurityIpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTenantSecurityIpGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete one or more database accounts.</p>
     * 
     * @param request DeleteTenantUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTenantUsersResponse
     */
    public DeleteTenantUsersResponse deleteTenantUsersWithOptions(DeleteTenantUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTenantUsers"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTenantUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to delete one or more database accounts.</p>
     * 
     * @param request DeleteTenantUsersRequest
     * @return DeleteTenantUsersResponse
     */
    public DeleteTenantUsersResponse deleteTenantUsers(DeleteTenantUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTenantUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The return result of the request.</p>
     * 
     * @param request DeleteTenantsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTenantsResponse
     */
    public DeleteTenantsResponse deleteTenantsWithOptions(DeleteTenantsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantIds)) {
            body.put("TenantIds", request.tenantIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTenants"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTenantsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The return result of the request.</p>
     * 
     * @param request DeleteTenantsRequest
     * @return DeleteTenantsResponse
     */
    public DeleteTenantsResponse deleteTenants(DeleteTenantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTenantsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to obtain the list of SQL statements that may have performance problems according to the diagnostic system.</p>
     * 
     * @param tmpReq DescribeAnomalySQLListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAnomalySQLListResponse
     */
    public DescribeAnomalySQLListResponse describeAnomalySQLListWithOptions(DescribeAnomalySQLListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeAnomalySQLListShrinkRequest request = new DescribeAnomalySQLListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterCondition)) {
            request.filterConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterCondition, "FilterCondition", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterConditionShrink)) {
            body.put("FilterCondition", request.filterConditionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIp)) {
            body.put("NodeIp", request.nodeIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLId)) {
            body.put("SQLId", request.SQLId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyWord)) {
            body.put("SearchKeyWord", request.searchKeyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchParameter)) {
            body.put("SearchParameter", request.searchParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRule)) {
            body.put("SearchRule", request.searchRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            body.put("SearchValue", request.searchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortColumn)) {
            body.put("SortColumn", request.sortColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAnomalySQLList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAnomalySQLListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to obtain the list of SQL statements that may have performance problems according to the diagnostic system.</p>
     * 
     * @param request DescribeAnomalySQLListRequest
     * @return DescribeAnomalySQLListResponse
     */
    public DescribeAnomalySQLListResponse describeAnomalySQLList(DescribeAnomalySQLListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAnomalySQLListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The maximum number of CPU cores per resource unit.</p>
     * 
     * @param request DescribeAvailableCpuResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableCpuResourceResponse
     */
    public DescribeAvailableCpuResourceResponse describeAvailableCpuResourceWithOptions(DescribeAvailableCpuResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            body.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableCpuResource"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableCpuResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The maximum number of CPU cores per resource unit.</p>
     * 
     * @param request DescribeAvailableCpuResourceRequest
     * @return DescribeAvailableCpuResourceResponse
     */
    public DescribeAvailableCpuResourceResponse describeAvailableCpuResource(DescribeAvailableCpuResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableCpuResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the available memory resource of an OceanBase Database tenant.</p>
     * 
     * @param request DescribeAvailableMemResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableMemResourceResponse
     */
    public DescribeAvailableMemResourceResponse describeAvailableMemResourceWithOptions(DescribeAvailableMemResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuNum)) {
            body.put("CpuNum", request.cpuNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unitNum)) {
            body.put("UnitNum", request.unitNum);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableMemResource"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableMemResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the available memory resource of an OceanBase Database tenant.</p>
     * 
     * @param request DescribeAvailableMemResourceRequest
     * @return DescribeAvailableMemResourceResponse
     */
    public DescribeAvailableMemResourceResponse describeAvailableMemResource(DescribeAvailableMemResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableMemResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群变配页可选配置</p>
     * 
     * @param request DescribeAvailableSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableSpecResponse
     */
    public DescribeAvailableSpecResponse describeAvailableSpecWithOptions(DescribeAvailableSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeType)) {
            body.put("UpgradeType", request.upgradeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableSpec"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群变配页可选配置</p>
     * 
     * @param request DescribeAvailableSpecRequest
     * @return DescribeAvailableSpecResponse
     */
    public DescribeAvailableSpecResponse describeAvailableSpec(DescribeAvailableSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群售卖页可选配置</p>
     * 
     * @param request DescribeAvailableZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableZoneResponse
     */
    public DescribeAvailableZoneResponse describeAvailableZoneWithOptions(DescribeAvailableZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuArch)) {
            body.put("CpuArch", request.cpuArch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            body.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.obVersion)) {
            body.put("ObVersion", request.obVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.series)) {
            body.put("Series", request.series);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableZone"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群售卖页可选配置</p>
     * 
     * @param request DescribeAvailableZoneRequest
     * @return DescribeAvailableZoneResponse
     */
    public DescribeAvailableZoneResponse describeAvailableZone(DescribeAvailableZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the link for downloading a backup set of OceanBase Database.</p>
     * 
     * @param request DescribeBackupSetDownloadLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupSetDownloadLinkResponse
     */
    public DescribeBackupSetDownloadLinkResponse describeBackupSetDownloadLinkWithOptions(DescribeBackupSetDownloadLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downloadTaskId)) {
            body.put("DownloadTaskId", request.downloadTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupSetDownloadLink"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupSetDownloadLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the link for downloading a backup set of OceanBase Database.</p>
     * 
     * @param request DescribeBackupSetDownloadLinkRequest
     * @return DescribeBackupSetDownloadLinkResponse
     */
    public DescribeBackupSetDownloadLinkResponse describeBackupSetDownloadLink(DescribeBackupSetDownloadLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupSetDownloadLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the character sets of an OceanBase Database tenant.</p>
     * 
     * @param request DescribeCharsetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCharsetResponse
     */
    public DescribeCharsetResponse describeCharsetWithOptions(DescribeCharsetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.series)) {
            body.put("Series", request.series);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantMode)) {
            body.put("TenantMode", request.tenantMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCharset"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCharsetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the character sets of an OceanBase Database tenant.</p>
     * 
     * @param request DescribeCharsetRequest
     * @return DescribeCharsetResponse
     */
    public DescribeCharsetResponse describeCharset(DescribeCharsetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCharsetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询备份集信息</p>
     * 
     * @param request DescribeDataBackupSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataBackupSetResponse
     */
    public DescribeDataBackupSetResponse describeDataBackupSetWithOptions(DescribeDataBackupSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupObjectType)) {
            body.put("BackupObjectType", request.backupObjectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataBackupSet"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataBackupSetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询备份集信息</p>
     * 
     * @param request DescribeDataBackupSetRequest
     * @return DescribeDataBackupSetResponse
     */
    public DescribeDataBackupSetResponse describeDataBackupSet(DescribeDataBackupSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataBackupSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query databases in a tenant.</p>
     * 
     * @param request DescribeDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDatabasesResponse
     */
    public DescribeDatabasesResponse describeDatabasesWithOptions(DescribeDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withTables)) {
            body.put("WithTables", request.withTables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDatabases"),
            new TeaPair("version", "2019-09-01"),
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
     * <p>You can call this operation to query databases in a tenant.</p>
     * 
     * @param request DescribeDatabasesRequest
     * @return DescribeDatabasesResponse
     */
    public DescribeDatabasesResponse describeDatabases(DescribeDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDatabasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The size of used memory in the cluster, in GB.</p>
     * 
     * @param request DescribeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxConnectionLimit)) {
            body.put("MaxConnectionLimit", request.maxConnectionLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstance"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The size of used memory in the cluster, in GB.</p>
     * 
     * @param request DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the zone.</p>
     * 
     * @param request DescribeInstanceCreatableZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceCreatableZoneResponse
     */
    public DescribeInstanceCreatableZoneResponse describeInstanceCreatableZoneWithOptions(DescribeInstanceCreatableZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceCreatableZone"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceCreatableZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the zone.</p>
     * 
     * @param request DescribeInstanceCreatableZoneRequest
     * @return DescribeInstanceCreatableZoneResponse
     */
    public DescribeInstanceCreatableZoneResponse describeInstanceCreatableZone(DescribeInstanceCreatableZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceCreatableZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询集群SSL配置</p>
     * 
     * @param request DescribeInstanceSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSSLResponse
     */
    public DescribeInstanceSSLResponse describeInstanceSSLWithOptions(DescribeInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSSL"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询集群SSL配置</p>
     * 
     * @param request DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     */
    public DescribeInstanceSSLResponse describeInstanceSSL(DescribeInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSSLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query security check items of an OceanBase cluster.</p>
     * 
     * @param request DescribeInstanceSecurityConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSecurityConfigsResponse
     */
    public DescribeInstanceSecurityConfigsResponse describeInstanceSecurityConfigsWithOptions(DescribeInstanceSecurityConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkId)) {
            body.put("CheckId", request.checkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSecurityConfigs"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSecurityConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query security check items of an OceanBase cluster.</p>
     * 
     * @param request DescribeInstanceSecurityConfigsRequest
     * @return DescribeInstanceSecurityConfigsResponse
     */
    public DescribeInstanceSecurityConfigsResponse describeInstanceSecurityConfigs(DescribeInstanceSecurityConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSecurityConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the tags of clusters.</p>
     * 
     * @param request DescribeInstanceTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceTagsResponse
     */
    public DescribeInstanceTagsResponse describeInstanceTagsWithOptions(DescribeInstanceTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            body.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceTags"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the tags of clusters.</p>
     * 
     * @param request DescribeInstanceTagsRequest
     * @return DescribeInstanceTagsResponse
     */
    public DescribeInstanceTagsResponse describeInstanceTags(DescribeInstanceTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The return result of the request.</p>
     * 
     * @param request DescribeInstanceTenantModesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceTenantModesResponse
     */
    public DescribeInstanceTenantModesResponse describeInstanceTenantModesWithOptions(DescribeInstanceTenantModesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceTenantModes"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceTenantModesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The return result of the request.</p>
     * 
     * @param request DescribeInstanceTenantModesRequest
     * @return DescribeInstanceTenantModesResponse
     */
    public DescribeInstanceTenantModesResponse describeInstanceTenantModes(DescribeInstanceTenantModesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTenantModesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the zone.</p>
     * 
     * @param request DescribeInstanceTopologyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceTopologyResponse
     */
    public DescribeInstanceTopologyResponse describeInstanceTopologyWithOptions(DescribeInstanceTopologyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceTopology"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceTopologyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the zone.</p>
     * 
     * @param request DescribeInstanceTopologyRequest
     * @return DescribeInstanceTopologyResponse
     */
    public DescribeInstanceTopologyResponse describeInstanceTopology(DescribeInstanceTopologyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTopologyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to obtain the list of OceanBase clusters.</p>
     * 
     * @param request DescribeInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("SearchKey", request.searchKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to obtain the list of OceanBase clusters.</p>
     * 
     * @param request DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询监控指标数据</p>
     * 
     * @param request DescribeMetricsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricsDataResponse
     */
    public DescribeMetricsDataResponse describeMetricsDataWithOptions(DescribeMetricsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupByLabels)) {
            query.put("GroupByLabels", request.groupByLabels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortMetricKey)) {
            query.put("SortMetricKey", request.sortMetricKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.replicaType)) {
            body.put("ReplicaType", request.replicaType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetricsData"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricsDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询监控指标数据</p>
     * 
     * @param request DescribeMetricsDataRequest
     * @return DescribeMetricsDataResponse
     */
    public DescribeMetricsDataResponse describeMetricsData(DescribeMetricsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricsDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The list of nodes.</p>
     * 
     * @param request DescribeNodeMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNodeMetricsResponse
     */
    public DescribeNodeMetricsResponse describeNodeMetricsWithOptions(DescribeNodeMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            body.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIdList)) {
            body.put("NodeIdList", request.nodeIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            body.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNodeMetrics"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNodeMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The list of nodes.</p>
     * 
     * @param request DescribeNodeMetricsRequest
     * @return DescribeNodeMetricsResponse
     */
    public DescribeNodeMetricsResponse describeNodeMetrics(DescribeNodeMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNodeMetricsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to view the list of SQL statements that are identified as having performance issues by the diagnostic system.</p>
     * 
     * @param request DescribeOasAnomalySQLListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOasAnomalySQLListResponse
     */
    public DescribeOasAnomalySQLListResponse describeOasAnomalySQLListWithOptions(DescribeOasAnomalySQLListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicSql)) {
            body.put("DynamicSql", request.dynamicSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterCondition)) {
            body.put("FilterCondition", request.filterCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeDynamicSql)) {
            body.put("MergeDynamicSql", request.mergeDynamicSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIp)) {
            body.put("NodeIp", request.nodeIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyWord)) {
            body.put("SearchKeyWord", request.searchKeyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchParam)) {
            body.put("SearchParam", request.searchParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRule)) {
            body.put("SearchRule", request.searchRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            body.put("SearchValue", request.searchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlTextLength)) {
            body.put("SqlTextLength", request.sqlTextLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOasAnomalySQLList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOasAnomalySQLListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to view the list of SQL statements that are identified as having performance issues by the diagnostic system.</p>
     * 
     * @param request DescribeOasAnomalySQLListRequest
     * @return DescribeOasAnomalySQLListResponse
     */
    public DescribeOasAnomalySQLListResponse describeOasAnomalySQLList(DescribeOasAnomalySQLListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOasAnomalySQLListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to query detailed information about the SQL, including the SQL text, related table names, and so on.</p>
     * 
     * @param request DescribeOasSQLDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOasSQLDetailsResponse
     */
    public DescribeOasSQLDetailsResponse describeOasSQLDetailsWithOptions(DescribeOasSQLDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicSql)) {
            body.put("DynamicSql", request.dynamicSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOasSQLDetails"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOasSQLDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to query detailed information about the SQL, including the SQL text, related table names, and so on.</p>
     * 
     * @param request DescribeOasSQLDetailsRequest
     * @return DescribeOasSQLDetailsResponse
     */
    public DescribeOasSQLDetailsResponse describeOasSQLDetails(DescribeOasSQLDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOasSQLDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to view the SQL execution history.</p>
     * 
     * @param request DescribeOasSQLHistoryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOasSQLHistoryListResponse
     */
    public DescribeOasSQLHistoryListResponse describeOasSQLHistoryListWithOptions(DescribeOasSQLHistoryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicSql)) {
            body.put("DynamicSql", request.dynamicSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIp)) {
            body.put("NodeIp", request.nodeIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOasSQLHistoryList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOasSQLHistoryListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to view the SQL execution history.</p>
     * 
     * @param request DescribeOasSQLHistoryListRequest
     * @return DescribeOasSQLHistoryListResponse
     */
    public DescribeOasSQLHistoryListResponse describeOasSQLHistoryList(DescribeOasSQLHistoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOasSQLHistoryListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to retrieve information about the SQL execution plan stored in the diagnostic system based on the SQL ID.</p>
     * 
     * @param request DescribeOasSQLPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOasSQLPlansResponse
     */
    public DescribeOasSQLPlansResponse describeOasSQLPlansWithOptions(DescribeOasSQLPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicSql)) {
            body.put("DynamicSql", request.dynamicSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planUnionHash)) {
            body.put("PlanUnionHash", request.planUnionHash);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnBriefInfo)) {
            body.put("ReturnBriefInfo", request.returnBriefInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOasSQLPlans"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOasSQLPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to retrieve information about the SQL execution plan stored in the diagnostic system based on the SQL ID.</p>
     * 
     * @param request DescribeOasSQLPlansRequest
     * @return DescribeOasSQLPlansResponse
     */
    public DescribeOasSQLPlansResponse describeOasSQLPlans(DescribeOasSQLPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOasSQLPlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to view a list of slow queries.</p>
     * 
     * @param request DescribeOasSlowSQLListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOasSlowSQLListResponse
     */
    public DescribeOasSlowSQLListResponse describeOasSlowSQLListWithOptions(DescribeOasSlowSQLListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicSql)) {
            body.put("DynamicSql", request.dynamicSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterCondition)) {
            body.put("FilterCondition", request.filterCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeDynamicSql)) {
            body.put("MergeDynamicSql", request.mergeDynamicSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIp)) {
            body.put("NodeIp", request.nodeIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyWord)) {
            body.put("SearchKeyWord", request.searchKeyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchParam)) {
            body.put("SearchParam", request.searchParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRule)) {
            body.put("SearchRule", request.searchRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            body.put("SearchValue", request.searchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlTextLength)) {
            body.put("SqlTextLength", request.sqlTextLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOasSlowSQLList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOasSlowSQLListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to view a list of slow queries.</p>
     * 
     * @param request DescribeOasSlowSQLListRequest
     * @return DescribeOasSlowSQLListResponse
     */
    public DescribeOasSlowSQLListResponse describeOasSlowSQLList(DescribeOasSlowSQLListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOasSlowSQLListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to retrieve the list of data on the SQL execution performance collected by the diagnostic system.</p>
     * 
     * @param request DescribeOasTopSQLListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOasTopSQLListResponse
     */
    public DescribeOasTopSQLListResponse describeOasTopSQLListWithOptions(DescribeOasTopSQLListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicSql)) {
            body.put("DynamicSql", request.dynamicSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterCondition)) {
            body.put("FilterCondition", request.filterCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mergeDynamicSql)) {
            body.put("MergeDynamicSql", request.mergeDynamicSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIp)) {
            body.put("NodeIp", request.nodeIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyWord)) {
            body.put("SearchKeyWord", request.searchKeyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchParam)) {
            body.put("SearchParam", request.searchParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRule)) {
            body.put("SearchRule", request.searchRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            body.put("SearchValue", request.searchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlTextLength)) {
            body.put("SqlTextLength", request.sqlTextLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOasTopSQLList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOasTopSQLListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to retrieve the list of data on the SQL execution performance collected by the diagnostic system.</p>
     * 
     * @param request DescribeOasTopSQLListRequest
     * @return DescribeOasTopSQLListResponse
     */
    public DescribeOasTopSQLListResponse describeOasTopSQLList(DescribeOasTopSQLListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOasTopSQLListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the outline binding information or throttling information of an SQL statement in the database based on an SQLID.</p>
     * 
     * @param request DescribeOutlineBindingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOutlineBindingResponse
     */
    public DescribeOutlineBindingResponse describeOutlineBindingWithOptions(DescribeOutlineBindingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isConcurrentLimit)) {
            body.put("IsConcurrentLimit", request.isConcurrentLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLId)) {
            body.put("SQLId", request.SQLId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOutlineBinding"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOutlineBindingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the outline binding information or throttling information of an SQL statement in the database based on an SQLID.</p>
     * 
     * @param request DescribeOutlineBindingRequest
     * @return DescribeOutlineBindingResponse
     */
    public DescribeOutlineBindingResponse describeOutlineBinding(DescribeOutlineBindingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOutlineBindingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether a restart is required for changes to the parameter to take effect. Valid values: - true: A restart is required. - false: A restart is not required.</p>
     * 
     * @param request DescribeParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParametersResponse
     */
    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimension)) {
            body.put("Dimension", request.dimension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensionValue)) {
            body.put("DimensionValue", request.dimensionValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParameters"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether a restart is required for changes to the parameter to take effect. Valid values: - true: A restart is required. - false: A restart is not required.</p>
     * 
     * @param request DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the modification history of cluster or tenant parameters.</p>
     * 
     * @param request DescribeParametersHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParametersHistoryResponse
     */
    public DescribeParametersHistoryResponse describeParametersHistoryWithOptions(DescribeParametersHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimension)) {
            body.put("Dimension", request.dimension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensionValue)) {
            body.put("DimensionValue", request.dimensionValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParametersHistory"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParametersHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the modification history of cluster or tenant parameters.</p>
     * 
     * @param request DescribeParametersHistoryRequest
     * @return DescribeParametersHistoryResponse
     */
    public DescribeParametersHistoryResponse describeParametersHistory(DescribeParametersHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParametersHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query session information.</p>
     * 
     * @param request DescribeProcessStatsCompositionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProcessStatsCompositionResponse
     */
    public DescribeProcessStatsCompositionResponse describeProcessStatsCompositionWithOptions(DescribeProcessStatsCompositionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverIp)) {
            body.put("ServerIp", request.serverIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlText)) {
            body.put("SqlText", request.sqlText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.UId)) {
            body.put("UId", request.UId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProcessStatsComposition"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProcessStatsCompositionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query session information.</p>
     * 
     * @param request DescribeProcessStatsCompositionRequest
     * @return DescribeProcessStatsCompositionResponse
     */
    public DescribeProcessStatsCompositionResponse describeProcessStatsComposition(DescribeProcessStatsCompositionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProcessStatsCompositionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目详情</p>
     * 
     * @param request DescribeProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectResponse
     */
    public DescribeProjectResponse describeProjectWithOptions(DescribeProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProject"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目详情</p>
     * 
     * @param request DescribeProjectRequest
     * @return DescribeProjectResponse
     */
    public DescribeProjectResponse describeProject(DescribeProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目的组件信息</p>
     * 
     * @param request DescribeProjectComponentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectComponentsResponse
     */
    public DescribeProjectComponentsResponse describeProjectComponentsWithOptions(DescribeProjectComponentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjectComponents"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectComponentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取项目的组件信息</p>
     * 
     * @param request DescribeProjectComponentsRequest
     * @return DescribeProjectComponentsResponse
     */
    public DescribeProjectComponentsResponse describeProjectComponents(DescribeProjectComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectComponentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取迁移/同步项目 Progress 信息</p>
     * 
     * @param request DescribeProjectProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectProgressResponse
     */
    public DescribeProjectProgressResponse describeProjectProgressWithOptions(DescribeProjectProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjectProgress"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectProgressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取迁移/同步项目 Progress 信息</p>
     * 
     * @param request DescribeProjectProgressRequest
     * @return DescribeProjectProgressResponse
     */
    public DescribeProjectProgressResponse describeProjectProgress(DescribeProjectProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectProgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目步骤指标</p>
     * 
     * @param request DescribeProjectStepMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectStepMetricResponse
     */
    public DescribeProjectStepMetricResponse describeProjectStepMetricWithOptions(DescribeProjectStepMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregator)) {
            body.put("Aggregator", request.aggregator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginTimestamp)) {
            body.put("BeginTimestamp", request.beginTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimestamp)) {
            body.put("EndTimestamp", request.endTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPointNum)) {
            body.put("MaxPointNum", request.maxPointNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            body.put("MetricType", request.metricType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stepName)) {
            body.put("StepName", request.stepName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjectStepMetric"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectStepMetricResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目步骤指标</p>
     * 
     * @param request DescribeProjectStepMetricRequest
     * @return DescribeProjectStepMetricResponse
     */
    public DescribeProjectStepMetricResponse describeProjectStepMetric(DescribeProjectStepMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectStepMetricWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目步骤</p>
     * 
     * @param request DescribeProjectStepsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectStepsResponse
     */
    public DescribeProjectStepsResponse describeProjectStepsWithOptions(DescribeProjectStepsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjectSteps"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectStepsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目步骤</p>
     * 
     * @param request DescribeProjectStepsRequest
     * @return DescribeProjectStepsResponse
     */
    public DescribeProjectStepsResponse describeProjectSteps(DescribeProjectStepsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectStepsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The tenant mode.   Valid values:<br>Oracle<br>MySQL</p>
     * 
     * @param request DescribeRecommendIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRecommendIndexResponse
     */
    public DescribeRecommendIndexResponse describeRecommendIndexWithOptions(DescribeRecommendIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLId)) {
            body.put("SQLId", request.SQLId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRecommendIndex"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRecommendIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The tenant mode.   Valid values:<br>Oracle<br>MySQL</p>
     * 
     * @param request DescribeRecommendIndexRequest
     * @return DescribeRecommendIndexResponse
     */
    public DescribeRecommendIndexResponse describeRecommendIndex(DescribeRecommendIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecommendIndexWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The username.</p>
     * 
     * @param request DescribeSQLDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSQLDetailsResponse
     */
    public DescribeSQLDetailsResponse describeSQLDetailsWithOptions(DescribeSQLDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SQLId)) {
            body.put("SQLId", request.SQLId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSQLDetails"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSQLDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The username.</p>
     * 
     * @param request DescribeSQLDetailsRequest
     * @return DescribeSQLDetailsResponse
     */
    public DescribeSQLDetailsResponse describeSQLDetails(DescribeSQLDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the execution history of an SQL statement in a specified period based on an SQL ID.</p>
     * 
     * @param request DescribeSQLHistoryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSQLHistoryListResponse
     */
    public DescribeSQLHistoryListResponse describeSQLHistoryListWithOptions(DescribeSQLHistoryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLId)) {
            body.put("SQLId", request.SQLId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSQLHistoryList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSQLHistoryListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the execution history of an SQL statement in a specified period based on an SQL ID.</p>
     * 
     * @param request DescribeSQLHistoryListRequest
     * @return DescribeSQLHistoryListResponse
     */
    public DescribeSQLHistoryListResponse describeSQLHistoryList(DescribeSQLHistoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLHistoryListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the information about the SQL execution plans stored in the diagnostic system based on an SQL ID.</p>
     * 
     * @param request DescribeSQLPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSQLPlansResponse
     */
    public DescribeSQLPlansResponse describeSQLPlansWithOptions(DescribeSQLPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SQLId)) {
            body.put("SQLId", request.SQLId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSQLPlans"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSQLPlansResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the information about the SQL execution plans stored in the diagnostic system based on an SQL ID.</p>
     * 
     * @param request DescribeSQLPlansRequest
     * @return DescribeSQLPlansResponse
     */
    public DescribeSQLPlansResponse describeSQLPlans(DescribeSQLPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLPlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to view the sample data of the execution details of the slow queries.</p>
     * 
     * @param request DescribeSQLSamplesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSQLSamplesResponse
     */
    public DescribeSQLSamplesResponse describeSQLSamplesWithOptions(DescribeSQLSamplesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnSqlText)) {
            body.put("ReturnSqlText", request.returnSqlText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSQLSamples"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSQLSamplesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this API to view the sample data of the execution details of the slow queries.</p>
     * 
     * @param request DescribeSQLSamplesRequest
     * @return DescribeSQLSamplesResponse
     */
    public DescribeSQLSamplesResponse describeSQLSamples(DescribeSQLSamplesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLSamplesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询采样SQL的原始文本</p>
     * 
     * @param request DescribeSampleSqlRawTextsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSampleSqlRawTextsResponse
     */
    public DescribeSampleSqlRawTextsResponse describeSampleSqlRawTextsWithOptions(DescribeSampleSqlRawTextsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            body.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            body.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            body.put("TraceId", request.traceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSampleSqlRawTexts"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSampleSqlRawTextsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询采样SQL的原始文本</p>
     * 
     * @param request DescribeSampleSqlRawTextsRequest
     * @return DescribeSampleSqlRawTextsResponse
     */
    public DescribeSampleSqlRawTextsResponse describeSampleSqlRawTexts(DescribeSampleSqlRawTextsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleSqlRawTextsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the security group.</p>
     * 
     * @param request DescribeSecurityIpGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityIpGroupsResponse
     */
    public DescribeSecurityIpGroupsResponse describeSecurityIpGroupsWithOptions(DescribeSecurityIpGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityIpGroups"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityIpGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the security group.</p>
     * 
     * @param request DescribeSecurityIpGroupsRequest
     * @return DescribeSecurityIpGroupsResponse
     */
    public DescribeSecurityIpGroupsResponse describeSecurityIpGroups(DescribeSecurityIpGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityIpGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询集群租户的会话信息；展示oceanbase云服务和业务之间的会话信息</p>
     * 
     * @param request DescribeSessionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSessionListResponse
     */
    public DescribeSessionListResponse describeSessionListWithOptions(DescribeSessionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSessionList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSessionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询集群租户的会话信息；展示oceanbase云服务和业务之间的会话信息</p>
     * 
     * @param request DescribeSessionListRequest
     * @return DescribeSessionListResponse
     */
    public DescribeSessionListResponse describeSessionList(DescribeSessionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSessionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the execution history of an SQL statement by SQL ID that is determined as a slow SQL statement during a specified period of time.</p>
     * 
     * @param request DescribeSlowSQLHistoryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowSQLHistoryListResponse
     */
    public DescribeSlowSQLHistoryListResponse describeSlowSQLHistoryListWithOptions(DescribeSlowSQLHistoryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLId)) {
            body.put("SQLId", request.SQLId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowSQLHistoryList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowSQLHistoryListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the execution history of an SQL statement by SQL ID that is determined as a slow SQL statement during a specified period of time.</p>
     * 
     * @param request DescribeSlowSQLHistoryListRequest
     * @return DescribeSlowSQLHistoryListResponse
     */
    public DescribeSlowSQLHistoryListResponse describeSlowSQLHistoryList(DescribeSlowSQLHistoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowSQLHistoryListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the list of slow SQL statements</p>
     * 
     * @param tmpReq DescribeSlowSQLListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlowSQLListResponse
     */
    public DescribeSlowSQLListResponse describeSlowSQLListWithOptions(DescribeSlowSQLListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSlowSQLListShrinkRequest request = new DescribeSlowSQLListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterCondition)) {
            request.filterConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterCondition, "FilterCondition", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterConditionShrink)) {
            body.put("FilterCondition", request.filterConditionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIp)) {
            body.put("NodeIp", request.nodeIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLId)) {
            body.put("SQLId", request.SQLId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyWord)) {
            body.put("SearchKeyWord", request.searchKeyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchParameter)) {
            body.put("SearchParameter", request.searchParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRule)) {
            body.put("SearchRule", request.searchRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            body.put("SearchValue", request.searchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortColumn)) {
            body.put("SortColumn", request.sortColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlowSQLList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlowSQLListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the list of slow SQL statements</p>
     * 
     * @param request DescribeSlowSQLListRequest
     * @return DescribeSlowSQLListResponse
     */
    public DescribeSlowSQLListResponse describeSlowSQLList(DescribeSlowSQLListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlowSQLListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query tags.</p>
     * 
     * @param request DescribeTagValuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagValuesResponse
     */
    public DescribeTagValuesResponse describeTagValuesWithOptions(DescribeTagValuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTagValues"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagValuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query tags.</p>
     * 
     * @param request DescribeTagValuesRequest
     * @return DescribeTagValuesResponse
     */
    public DescribeTagValuesResponse describeTagValues(DescribeTagValuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagValuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the VPC.</p>
     * 
     * @param request DescribeTenantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantResponse
     */
    public DescribeTenantResponse describeTenantWithOptions(DescribeTenantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenant"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the VPC.</p>
     * 
     * @param request DescribeTenantRequest
     * @return DescribeTenantResponse
     */
    public DescribeTenantResponse describeTenant(DescribeTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询租户加密信息</p>
     * 
     * @param request DescribeTenantEncryptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantEncryptionResponse
     */
    public DescribeTenantEncryptionResponse describeTenantEncryptionWithOptions(DescribeTenantEncryptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantName)) {
            body.put("TenantName", request.tenantName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenantEncryption"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantEncryptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询租户加密信息</p>
     * 
     * @param request DescribeTenantEncryptionRequest
     * @return DescribeTenantEncryptionResponse
     */
    public DescribeTenantEncryptionResponse describeTenantEncryption(DescribeTenantEncryptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantEncryptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The list of tenant IDs.</p>
     * 
     * @param request DescribeTenantMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantMetricsResponse
     */
    public DescribeTenantMetricsResponse describeTenantMetricsWithOptions(DescribeTenantMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            body.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantIdList)) {
            body.put("TenantIdList", request.tenantIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantName)) {
            body.put("TenantName", request.tenantName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenantMetrics"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantMetricsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The list of tenant IDs.</p>
     * 
     * @param request DescribeTenantMetricsRequest
     * @return DescribeTenantMetricsResponse
     */
    public DescribeTenantMetricsResponse describeTenantMetrics(DescribeTenantMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantMetricsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the maximum readable timestamp of a tenant.</p>
     * 
     * @param request DescribeTenantReadableScnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantReadableScnResponse
     */
    public DescribeTenantReadableScnResponse describeTenantReadableScnWithOptions(DescribeTenantReadableScnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenantReadableScn"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantReadableScnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the maximum readable timestamp of a tenant.</p>
     * 
     * @param request DescribeTenantReadableScnRequest
     * @return DescribeTenantReadableScnResponse
     */
    public DescribeTenantReadableScnResponse describeTenantReadableScn(DescribeTenantReadableScnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantReadableScnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query security check items of an OceanBase Database tenant.</p>
     * 
     * @param request DescribeTenantSecurityConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantSecurityConfigsResponse
     */
    public DescribeTenantSecurityConfigsResponse describeTenantSecurityConfigsWithOptions(DescribeTenantSecurityConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkId)) {
            body.put("CheckId", request.checkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenantSecurityConfigs"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantSecurityConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query security check items of an OceanBase Database tenant.</p>
     * 
     * @param request DescribeTenantSecurityConfigsRequest
     * @return DescribeTenantSecurityConfigsResponse
     */
    public DescribeTenantSecurityConfigsResponse describeTenantSecurityConfigs(DescribeTenantSecurityConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantSecurityConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to view the list of whitelist groups of the tenant.</p>
     * 
     * @param request DescribeTenantSecurityIpGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantSecurityIpGroupsResponse
     */
    public DescribeTenantSecurityIpGroupsResponse describeTenantSecurityIpGroupsWithOptions(DescribeTenantSecurityIpGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenantSecurityIpGroups"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantSecurityIpGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to view the list of whitelist groups of the tenant.</p>
     * 
     * @param request DescribeTenantSecurityIpGroupsRequest
     * @return DescribeTenantSecurityIpGroupsResponse
     */
    public DescribeTenantSecurityIpGroupsResponse describeTenantSecurityIpGroups(DescribeTenantSecurityIpGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantSecurityIpGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the tags of tenants in a cluster.</p>
     * 
     * @param request DescribeTenantTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantTagsResponse
     */
    public DescribeTenantTagsResponse describeTenantTagsWithOptions(DescribeTenantTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantIds)) {
            body.put("TenantIds", request.tenantIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenantTags"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the tags of tenants in a cluster.</p>
     * 
     * @param request DescribeTenantTagsRequest
     * @return DescribeTenantTagsResponse
     */
    public DescribeTenantTagsResponse describeTenantTags(DescribeTenantTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to obtain the account authorization information of the tenant.</p>
     * 
     * @param request DescribeTenantUserRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantUserRolesResponse
     */
    public DescribeTenantUserRolesResponse describeTenantUserRolesWithOptions(DescribeTenantUserRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenantUserRoles"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantUserRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to obtain the account authorization information of the tenant.</p>
     * 
     * @param request DescribeTenantUserRolesRequest
     * @return DescribeTenantUserRolesResponse
     */
    public DescribeTenantUserRolesResponse describeTenantUserRoles(DescribeTenantUserRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantUserRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The return result of the request.</p>
     * 
     * @param request DescribeTenantUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantUsersResponse
     */
    public DescribeTenantUsersResponse describeTenantUsersWithOptions(DescribeTenantUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenantUsers"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The return result of the request.</p>
     * 
     * @param request DescribeTenantUsersRequest
     * @return DescribeTenantUsersResponse
     */
    public DescribeTenantUsersResponse describeTenantUsers(DescribeTenantUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether a read-only connection has been created.</p>
     * 
     * @param request DescribeTenantZonesReadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantZonesReadResponse
     */
    public DescribeTenantZonesReadResponse describeTenantZonesReadWithOptions(DescribeTenantZonesReadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenantZonesRead"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantZonesReadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether a read-only connection has been created.</p>
     * 
     * @param request DescribeTenantZonesReadRequest
     * @return DescribeTenantZonesReadResponse
     */
    public DescribeTenantZonesReadResponse describeTenantZonesRead(DescribeTenantZonesReadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantZonesReadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The total memory size of the tenant, in GB.</p>
     * 
     * @param request DescribeTenantsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTenantsResponse
     */
    public DescribeTenantsResponse describeTenantsWithOptions(DescribeTenantsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantName)) {
            body.put("TenantName", request.tenantName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTenants"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTenantsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The total memory size of the tenant, in GB.</p>
     * 
     * @param request DescribeTenantsRequest
     * @return DescribeTenantsResponse
     */
    public DescribeTenantsResponse describeTenants(DescribeTenantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTenantsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The time zones supported by the tenant.</p>
     * 
     * @param request DescribeTimeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTimeZonesResponse
     */
    public DescribeTimeZonesResponse describeTimeZonesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTimeZones"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTimeZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The time zones supported by the tenant.</p>
     * @return DescribeTimeZonesResponse
     */
    public DescribeTimeZonesResponse describeTimeZones() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTimeZonesWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the database.</p>
     * 
     * @param tmpReq DescribeTopSQLListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTopSQLListResponse
     */
    public DescribeTopSQLListResponse describeTopSQLListWithOptions(DescribeTopSQLListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeTopSQLListShrinkRequest request = new DescribeTopSQLListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterCondition)) {
            request.filterConditionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterCondition, "FilterCondition", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterConditionShrink)) {
            body.put("FilterCondition", request.filterConditionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIp)) {
            body.put("NodeIp", request.nodeIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLId)) {
            body.put("SQLId", request.SQLId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyWord)) {
            body.put("SearchKeyWord", request.searchKeyWord);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchParameter)) {
            body.put("SearchParameter", request.searchParameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRule)) {
            body.put("SearchRule", request.searchRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            body.put("SearchValue", request.searchValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortColumn)) {
            body.put("SortColumn", request.sortColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTopSQLList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTopSQLListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the database.</p>
     * 
     * @param request DescribeTopSQLListRequest
     * @return DescribeTopSQLListResponse
     */
    public DescribeTopSQLListResponse describeTopSQLList(DescribeTopSQLListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTopSQLListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The deployment mode.</p>
     * 
     * @param request DescribeZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZonesWithOptions(DescribeZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuArch)) {
            body.put("CpuArch", request.cpuArch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployType)) {
            body.put("DeployType", request.deployType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.series)) {
            body.put("Series", request.series);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeZones"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The deployment mode.</p>
     * 
     * @param request DescribeZonesRequest
     * @return DescribeZonesResponse
     */
    public DescribeZonesResponse describeZones(DescribeZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>公有云上传OSS 获取一个临时上传url</p>
     * 
     * @param request GetUploadOssUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadOssUrlResponse
     */
    public GetUploadOssUrlResponse getUploadOssUrlWithOptions(GetUploadOssUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTimeMinutes)) {
            body.put("EffectiveTimeMinutes", request.effectiveTimeMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadOssUrl"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadOssUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>公有云上传OSS 获取一个临时上传url</p>
     * 
     * @param request GetUploadOssUrlRequest
     * @return GetUploadOssUrlResponse
     */
    public GetUploadOssUrlResponse getUploadOssUrl(GetUploadOssUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadOssUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to close a session.</p>
     * 
     * @param request KillProcessListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillProcessListResponse
     */
    public KillProcessListResponse killProcessListWithOptions(KillProcessListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionList)) {
            body.put("SessionList", request.sessionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillProcessList"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillProcessListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to close a session.</p>
     * 
     * @param request KillProcessListRequest
     * @return KillProcessListResponse
     */
    public KillProcessListResponse killProcessList(KillProcessListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killProcessListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询标签列表</p>
     * 
     * @param request ListAllLabelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAllLabelsResponse
     */
    public ListAllLabelsResponse listAllLabelsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAllLabels"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAllLabelsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询标签列表</p>
     * @return ListAllLabelsResponse
     */
    public ListAllLabelsResponse listAllLabels() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAllLabelsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据源列表 (MySql、OB_MYSQL、OB_ORACLE)</p>
     * 
     * @param tmpReq ListDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataSourceResponse
     */
    public ListDataSourceResponse listDataSourceWithOptions(ListDataSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDataSourceShrinkRequest request = new ListDataSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "Types", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typesShrink)) {
            body.put("Types", request.typesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSource"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据源列表 (MySql、OB_MYSQL、OB_ORACLE)</p>
     * 
     * @param request ListDataSourceRequest
     * @return ListDataSourceResponse
     */
    public ListDataSourceResponse listDataSource(ListDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目的全量校验结果</p>
     * 
     * @param tmpReq ListProjectFullVerifyResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectFullVerifyResultResponse
     */
    public ListProjectFullVerifyResultResponse listProjectFullVerifyResultWithOptions(ListProjectFullVerifyResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectFullVerifyResultShrinkRequest request = new ListProjectFullVerifyResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destSchemas)) {
            request.destSchemasShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destSchemas, "DestSchemas", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceSchemas)) {
            request.sourceSchemasShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceSchemas, "SourceSchemas", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destSchemasShrink)) {
            body.put("DestSchemas", request.destSchemasShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceSchemasShrink)) {
            body.put("SourceSchemas", request.sourceSchemasShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectFullVerifyResult"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectFullVerifyResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目的全量校验结果</p>
     * 
     * @param request ListProjectFullVerifyResultRequest
     * @return ListProjectFullVerifyResultResponse
     */
    public ListProjectFullVerifyResultResponse listProjectFullVerifyResult(ListProjectFullVerifyResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectFullVerifyResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据项目 ID 查询项目的修改记录</p>
     * 
     * @param request ListProjectModifyRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectModifyRecordsResponse
     */
    public ListProjectModifyRecordsResponse listProjectModifyRecordsWithOptions(ListProjectModifyRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjectModifyRecords"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectModifyRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据项目 ID 查询项目的修改记录</p>
     * 
     * @param request ListProjectModifyRecordsRequest
     * @return ListProjectModifyRecordsResponse
     */
    public ListProjectModifyRecordsResponse listProjectModifyRecords(ListProjectModifyRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectModifyRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目列表</p>
     * 
     * @param tmpReq ListProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListProjectsShrinkRequest request = new ListProjectsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.labelIds)) {
            request.labelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.labelIds, "LabelIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sinkEndpointTypes)) {
            request.sinkEndpointTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sinkEndpointTypes, "SinkEndpointTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceEndpointTypes)) {
            request.sourceEndpointTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceEndpointTypes, "SourceEndpointTypes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.status)) {
            request.statusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.status, "Status", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labelIdsShrink)) {
            body.put("LabelIds", request.labelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needRelatedInfo)) {
            body.put("NeedRelatedInfo", request.needRelatedInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            body.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sinkEndpointTypesShrink)) {
            body.put("SinkEndpointTypes", request.sinkEndpointTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointTypesShrink)) {
            body.put("SourceEndpointTypes", request.sourceEndpointTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusShrink)) {
            body.put("Status", request.statusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibleSubProject)) {
            body.put("VisibleSubProject", request.visibleSubProject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询项目列表</p>
     * 
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询传输实例列表</p>
     * 
     * @param tmpReq ListWorkerInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkerInstancesResponse
     */
    public ListWorkerInstancesResponse listWorkerInstancesWithOptions(ListWorkerInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListWorkerInstancesShrinkRequest request = new ListWorkerInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.specs)) {
            request.specsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.specs, "Specs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destType)) {
            body.put("DestType", request.destType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyBindable)) {
            body.put("OnlyBindable", request.onlyBindable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specsShrink)) {
            body.put("Specs", request.specsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkerInstances"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkerInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询传输实例列表</p>
     * 
     * @param request ListWorkerInstancesRequest
     * @return ListWorkerInstancesResponse
     */
    public ListWorkerInstancesResponse listWorkerInstances(ListWorkerInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkerInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The request ID.</p>
     * 
     * @param request ModifyDatabaseDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDatabaseDescriptionResponse
     */
    public ModifyDatabaseDescriptionResponse modifyDatabaseDescriptionWithOptions(ModifyDatabaseDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDatabaseDescription"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDatabaseDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The request ID.</p>
     * 
     * @param request ModifyDatabaseDescriptionRequest
     * @return ModifyDatabaseDescriptionResponse
     */
    public ModifyDatabaseDescriptionResponse modifyDatabaseDescription(ModifyDatabaseDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDatabaseDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The accounts that have privileges on the database.</p>
     * 
     * @param request ModifyDatabaseUserRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDatabaseUserRolesResponse
     */
    public ModifyDatabaseUserRolesResponse modifyDatabaseUserRolesWithOptions(ModifyDatabaseUserRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDatabaseUserRoles"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDatabaseUserRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The accounts that have privileges on the database.</p>
     * 
     * @param request ModifyDatabaseUserRolesRequest
     * @return ModifyDatabaseUserRolesResponse
     */
    public ModifyDatabaseUserRolesResponse modifyDatabaseUserRoles(ModifyDatabaseUserRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDatabaseUserRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the OceanBase cluster.</p>
     * 
     * @param request ModifyInstanceNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceNameResponse
     */
    public ModifyInstanceNameResponse modifyInstanceNameWithOptions(ModifyInstanceNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceName"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the OceanBase cluster.</p>
     * 
     * @param request ModifyInstanceNameRequest
     * @return ModifyInstanceNameResponse
     */
    public ModifyInstanceNameResponse modifyInstanceName(ModifyInstanceNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the number of nodes in a cluster.</p>
     * 
     * @param request ModifyInstanceNodeNumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceNodeNumResponse
     */
    public ModifyInstanceNodeNumResponse modifyInstanceNodeNumWithOptions(ModifyInstanceNodeNumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNum)) {
            body.put("NodeNum", request.nodeNum);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceNodeNum"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceNodeNumResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the number of nodes in a cluster.</p>
     * 
     * @param request ModifyInstanceNodeNumRequest
     * @return ModifyInstanceNodeNumResponse
     */
    public ModifyInstanceNodeNumResponse modifyInstanceNodeNum(ModifyInstanceNodeNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceNodeNumWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>There is currently no authorization information disclosed in the API.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to modify the Secure Sockets Layer (SSL) setting for an OceanBase cluster instance.</p>
     * 
     * @param request ModifyInstanceSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceSSLResponse
     */
    public ModifyInstanceSSLResponse modifyInstanceSSLWithOptions(ModifyInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableSSL)) {
            body.put("EnableSSL", request.enableSSL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceSSL"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceSSLResponse());
    }

    /**
     * <b>description</b> :
     * <p>There is currently no authorization information disclosed in the API.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call this operation to modify the Secure Sockets Layer (SSL) setting for an OceanBase cluster instance.</p>
     * 
     * @param request ModifyInstanceSSLRequest
     * @return ModifyInstanceSSLResponse
     */
    public ModifyInstanceSSLResponse modifyInstanceSSL(ModifyInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceSSLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the cluster specifications and storage space.</p>
     * 
     * @param request ModifyInstanceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceSpecResponse
     */
    public ModifyInstanceSpecResponse modifyInstanceSpecWithOptions(ModifyInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            body.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            body.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            body.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeSpecNative)) {
            body.put("UpgradeSpecNative", request.upgradeSpecNative);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceSpec"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the cluster specifications and storage space.</p>
     * 
     * @param request ModifyInstanceSpecRequest
     * @return ModifyInstanceSpecResponse
     */
    public ModifyInstanceSpecResponse modifyInstanceSpec(ModifyInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the tags of a cluster.</p>
     * 
     * @param request ModifyInstanceTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceTagsResponse
     */
    public ModifyInstanceTagsResponse modifyInstanceTagsWithOptions(ModifyInstanceTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceTags"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the tags of a cluster.</p>
     * 
     * @param request ModifyInstanceTagsRequest
     * @return ModifyInstanceTagsResponse
     */
    public ModifyInstanceTagsResponse modifyInstanceTags(ModifyInstanceTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the temporary capacity of the OceanBase cluster.</p>
     * 
     * @param request ModifyInstanceTemporaryCapacityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceTemporaryCapacityResponse
     */
    public ModifyInstanceTemporaryCapacityResponse modifyInstanceTemporaryCapacityWithOptions(ModifyInstanceTemporaryCapacityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskSize)) {
            body.put("DiskSize", request.diskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceTemporaryCapacity"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceTemporaryCapacityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the temporary capacity of the OceanBase cluster.</p>
     * 
     * @param request ModifyInstanceTemporaryCapacityRequest
     * @return ModifyInstanceTemporaryCapacityResponse
     */
    public ModifyInstanceTemporaryCapacityResponse modifyInstanceTemporaryCapacity(ModifyInstanceTemporaryCapacityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceTemporaryCapacityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The modification results.</p>
     * 
     * @param request ModifyParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyParametersResponse
     */
    public ModifyParametersResponse modifyParametersWithOptions(ModifyParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dimension)) {
            body.put("Dimension", request.dimension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimensionValue)) {
            body.put("DimensionValue", request.dimensionValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("Parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyParameters"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyParametersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The modification results.</p>
     * 
     * @param request ModifyParametersRequest
     * @return ModifyParametersResponse
     */
    public ModifyParametersResponse modifyParameters(ModifyParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the security group.</p>
     * 
     * @param request ModifySecurityIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySecurityIpsResponse
     */
    public ModifySecurityIpsResponse modifySecurityIpsWithOptions(ModifySecurityIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIpGroupName)) {
            body.put("SecurityIpGroupName", request.securityIpGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            body.put("SecurityIps", request.securityIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityIps"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityIpsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The name of the security group.</p>
     * 
     * @param request ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    /**
     * @param request ModifyTagNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTagNameResponse
     */
    public ModifyTagNameResponse modifyTagNameWithOptions(ModifyTagNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newKey)) {
            body.put("NewKey", request.newKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTagName"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTagNameResponse());
    }

    /**
     * @param request ModifyTagNameRequest
     * @return ModifyTagNameResponse
     */
    public ModifyTagNameResponse modifyTagName(ModifyTagNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTagNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to rename a tag.</p>
     * 
     * @param request ModifyTagValueNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTagValueNameResponse
     */
    public ModifyTagValueNameResponse modifyTagValueNameWithOptions(ModifyTagValueNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newValue)) {
            body.put("NewValue", request.newValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTagValueName"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTagValueNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to rename a tag.</p>
     * 
     * @param request ModifyTagValueNameRequest
     * @return ModifyTagValueNameResponse
     */
    public ModifyTagValueNameResponse modifyTagValueName(ModifyTagValueNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTagValueNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>租户加密变更</p>
     * 
     * @param request ModifyTenantEncryptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantEncryptionResponse
     */
    public ModifyTenantEncryptionResponse modifyTenantEncryptionWithOptions(ModifyTenantEncryptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKeyId)) {
            body.put("EncryptionKeyId", request.encryptionKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionType)) {
            body.put("EncryptionType", request.encryptionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantEncryption"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantEncryptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>租户加密变更</p>
     * 
     * @param request ModifyTenantEncryptionRequest
     * @return ModifyTenantEncryptionResponse
     */
    public ModifyTenantEncryptionResponse modifyTenantEncryption(ModifyTenantEncryptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantEncryptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The return result of the request.</p>
     * 
     * @param request ModifyTenantPrimaryZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantPrimaryZoneResponse
     */
    public ModifyTenantPrimaryZoneResponse modifyTenantPrimaryZoneWithOptions(ModifyTenantPrimaryZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterIntranetAddressZone)) {
            body.put("MasterIntranetAddressZone", request.masterIntranetAddressZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryZone)) {
            body.put("PrimaryZone", request.primaryZone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantEndpointDirectId)) {
            body.put("TenantEndpointDirectId", request.tenantEndpointDirectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantEndpointId)) {
            body.put("TenantEndpointId", request.tenantEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDirectVSwitchId)) {
            body.put("UserDirectVSwitchId", request.userDirectVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVSwitchId)) {
            body.put("UserVSwitchId", request.userVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpcOwnerId)) {
            body.put("UserVpcOwnerId", request.userVpcOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantPrimaryZone"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantPrimaryZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The return result of the request.</p>
     * 
     * @param request ModifyTenantPrimaryZoneRequest
     * @return ModifyTenantPrimaryZoneResponse
     */
    public ModifyTenantPrimaryZoneResponse modifyTenantPrimaryZone(ModifyTenantPrimaryZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantPrimaryZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the specifications of a tenant in an OceanBase cluster.</p>
     * 
     * @param request ModifyTenantResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantResourceResponse
     */
    public ModifyTenantResourceResponse modifyTenantResourceWithOptions(ModifyTenantResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            body.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logDisk)) {
            body.put("LogDisk", request.logDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.readOnlyZoneList)) {
            body.put("ReadOnlyZoneList", request.readOnlyZoneList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantResource"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the specifications of a tenant in an OceanBase cluster.</p>
     * 
     * @param request ModifyTenantResourceRequest
     * @return ModifyTenantResourceResponse
     */
    public ModifyTenantResourceResponse modifyTenantResource(ModifyTenantResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the information on the whitelist group of the tenant.</p>
     * 
     * @param request ModifyTenantSecurityIpGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantSecurityIpGroupResponse
     */
    public ModifyTenantSecurityIpGroupResponse modifyTenantSecurityIpGroupWithOptions(ModifyTenantSecurityIpGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIpGroupName)) {
            body.put("SecurityIpGroupName", request.securityIpGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            body.put("SecurityIps", request.securityIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantSecurityIpGroup"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantSecurityIpGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the information on the whitelist group of the tenant.</p>
     * 
     * @param request ModifyTenantSecurityIpGroupRequest
     * @return ModifyTenantSecurityIpGroupResponse
     */
    public ModifyTenantSecurityIpGroupResponse modifyTenantSecurityIpGroup(ModifyTenantSecurityIpGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantSecurityIpGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the tags of a tenant.</p>
     * 
     * @param request ModifyTenantTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantTagsResponse
     */
    public ModifyTenantTagsResponse modifyTenantTagsWithOptions(ModifyTenantTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantTags"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to modify the tags of a tenant.</p>
     * 
     * @param request ModifyTenantTagsRequest
     * @return ModifyTenantTagsResponse
     */
    public ModifyTenantTagsResponse modifyTenantTags(ModifyTenantTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The description of the database.</p>
     * 
     * @param request ModifyTenantUserDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantUserDescriptionResponse
     */
    public ModifyTenantUserDescriptionResponse modifyTenantUserDescriptionWithOptions(ModifyTenantUserDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantUserDescription"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantUserDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The description of the database.</p>
     * 
     * @param request ModifyTenantUserDescriptionRequest
     * @return ModifyTenantUserDescriptionResponse
     */
    public ModifyTenantUserDescriptionResponse modifyTenantUserDescription(ModifyTenantUserDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantUserDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The request ID.</p>
     * 
     * @param request ModifyTenantUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantUserPasswordResponse
     */
    public ModifyTenantUserPasswordResponse modifyTenantUserPasswordWithOptions(ModifyTenantUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptionType)) {
            body.put("EncryptionType", request.encryptionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPassword)) {
            body.put("UserPassword", request.userPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantUserPassword"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The request ID.</p>
     * 
     * @param request ModifyTenantUserPasswordRequest
     * @return ModifyTenantUserPasswordResponse
     */
    public ModifyTenantUserPasswordResponse modifyTenantUserPassword(ModifyTenantUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the privilege was granted to the role.</p>
     * 
     * @param request ModifyTenantUserRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantUserRolesResponse
     */
    public ModifyTenantUserRolesResponse modifyTenantUserRolesWithOptions(ModifyTenantUserRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            body.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userRole)) {
            body.put("UserRole", request.userRole);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantUserRoles"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantUserRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the privilege was granted to the role.</p>
     * 
     * @param request ModifyTenantUserRolesRequest
     * @return ModifyTenantUserRolesResponse
     */
    public ModifyTenantUserRolesResponse modifyTenantUserRoles(ModifyTenantUserRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantUserRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the tenant.</p>
     * 
     * @param request ModifyTenantUserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantUserStatusResponse
     */
    public ModifyTenantUserStatusResponse modifyTenantUserStatusWithOptions(ModifyTenantUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("TenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userStatus)) {
            body.put("UserStatus", request.userStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantUserStatus"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantUserStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The ID of the tenant.</p>
     * 
     * @param request ModifyTenantUserStatusRequest
     * @return ModifyTenantUserStatusResponse
     */
    public ModifyTenantUserStatusResponse modifyTenantUserStatus(ModifyTenantUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantUserStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放项目</p>
     * 
     * @param request ReleaseProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseProjectResponse
     */
    public ReleaseProjectResponse releaseProjectWithOptions(ReleaseProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseProject"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放项目</p>
     * 
     * @param request ReleaseProjectRequest
     * @return ReleaseProjectResponse
     */
    public ReleaseProjectResponse releaseProject(ReleaseProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放传输实例 （未绑定项目时才可以释放）</p>
     * 
     * @param request ReleaseWorkerInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseWorkerInstanceResponse
     */
    public ReleaseWorkerInstanceResponse releaseWorkerInstanceWithOptions(ReleaseWorkerInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseWorkerInstance"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseWorkerInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放传输实例 （未绑定项目时才可以释放）</p>
     * 
     * @param request ReleaseWorkerInstanceRequest
     * @return ReleaseWorkerInstanceResponse
     */
    public ReleaseWorkerInstanceResponse releaseWorkerInstance(ReleaseWorkerInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseWorkerInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>恢复项目</p>
     * 
     * @param request ResumeProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeProjectResponse
     */
    public ResumeProjectResponse resumeProjectWithOptions(ResumeProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeProject"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>恢复项目</p>
     * 
     * @param request ResumeProjectRequest
     * @return ResumeProjectResponse
     */
    public ResumeProjectResponse resumeProject(ResumeProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据修改记录 ID 重试修改操作（仅支持处于 FAILED 状态的修改记录）</p>
     * 
     * @param request RetryProjectModifyRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryProjectModifyRecordsResponse
     */
    public RetryProjectModifyRecordsResponse retryProjectModifyRecordsWithOptions(RetryProjectModifyRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryProjectModifyRecords"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryProjectModifyRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据修改记录 ID 重试修改操作（仅支持处于 FAILED 状态的修改记录）</p>
     * 
     * @param request RetryProjectModifyRecordsRequest
     * @return RetryProjectModifyRecordsResponse
     */
    public RetryProjectModifyRecordsResponse retryProjectModifyRecords(RetryProjectModifyRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryProjectModifyRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动项目</p>
     * 
     * @param request StartProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartProjectResponse
     */
    public StartProjectResponse startProjectWithOptions(StartProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartProject"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动项目</p>
     * 
     * @param request StartProjectRequest
     * @return StartProjectResponse
     */
    public StartProjectResponse startProject(StartProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动该label下的所有未启动项目</p>
     * 
     * @param request StartProjectsByLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartProjectsByLabelResponse
     */
    public StartProjectsByLabelResponse startProjectsByLabelWithOptions(StartProjectsByLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartProjectsByLabel"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartProjectsByLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启动该label下的所有未启动项目</p>
     * 
     * @param request StartProjectsByLabelRequest
     * @return StartProjectsByLabelResponse
     */
    public StartProjectsByLabelResponse startProjectsByLabel(StartProjectsByLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startProjectsByLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>暂停项目</p>
     * 
     * @param request StopProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopProjectResponse
     */
    public StopProjectResponse stopProjectWithOptions(StopProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopProject"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopProjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>暂停项目</p>
     * 
     * @param request StopProjectRequest
     * @return StopProjectResponse
     */
    public StopProjectResponse stopProject(StopProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据修改记录 ID 终止修改操作，不可恢复（仅支持处于 RUNNING / FAILED 状态的修改记录）</p>
     * 
     * @param request StopProjectModifyRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopProjectModifyRecordsResponse
     */
    public StopProjectModifyRecordsResponse stopProjectModifyRecordsWithOptions(StopProjectModifyRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopProjectModifyRecords"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopProjectModifyRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据修改记录 ID 终止修改操作，不可恢复（仅支持处于 RUNNING / FAILED 状态的修改记录）</p>
     * 
     * @param request StopProjectModifyRecordsRequest
     * @return StopProjectModifyRecordsResponse
     */
    public StopProjectModifyRecordsResponse stopProjectModifyRecords(StopProjectModifyRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopProjectModifyRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>暂停该label下的所有运行中项目</p>
     * 
     * @param request StopProjectsByLabelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopProjectsByLabelResponse
     */
    public StopProjectsByLabelResponse stopProjectsByLabelWithOptions(StopProjectsByLabelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopProjectsByLabel"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopProjectsByLabelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>暂停该label下的所有运行中项目</p>
     * 
     * @param request StopProjectsByLabelRequest
     * @return StopProjectsByLabelResponse
     */
    public StopProjectsByLabelResponse stopProjectsByLabel(StopProjectsByLabelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopProjectsByLabelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to switch between the primary and standby instances of OceanBase.</p>
     * 
     * @param request SwitchoverInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchoverInstanceResponse
     */
    public SwitchoverInstanceResponse switchoverInstanceWithOptions(SwitchoverInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forced)) {
            body.put("Forced", request.forced);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetInstanceId)) {
            body.put("TargetInstanceId", request.targetInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchoverInstance"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchoverInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to switch between the primary and standby instances of OceanBase.</p>
     * 
     * @param request SwitchoverInstanceRequest
     * @return SwitchoverInstanceResponse
     */
    public SwitchoverInstanceResponse switchoverInstance(SwitchoverInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchoverInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新项目配置 Action=UpdateProjectConfig</p>
     * 
     * @param tmpReq UpdateProjectConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectConfigResponse
     */
    public UpdateProjectConfigResponse updateProjectConfigWithOptions(UpdateProjectConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateProjectConfigShrinkRequest request = new UpdateProjectConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.commonTransferConfig)) {
            request.commonTransferConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.commonTransferConfig, "CommonTransferConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fullTransferConfig)) {
            request.fullTransferConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fullTransferConfig, "FullTransferConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.incrTransferConfig)) {
            request.incrTransferConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.incrTransferConfig, "IncrTransferConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reverseIncrTransferConfig)) {
            request.reverseIncrTransferConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reverseIncrTransferConfig, "ReverseIncrTransferConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commonTransferConfigShrink)) {
            body.put("CommonTransferConfig", request.commonTransferConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullTransferConfigShrink)) {
            body.put("FullTransferConfig", request.fullTransferConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incrTransferConfigShrink)) {
            body.put("IncrTransferConfig", request.incrTransferConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reverseIncrTransferConfigShrink)) {
            body.put("ReverseIncrTransferConfig", request.reverseIncrTransferConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProjectConfig"),
            new TeaPair("version", "2019-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新项目配置 Action=UpdateProjectConfig</p>
     * 
     * @param request UpdateProjectConfigRequest
     * @return UpdateProjectConfigResponse
     */
    public UpdateProjectConfigResponse updateProjectConfig(UpdateProjectConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProjectConfigWithOptions(request, runtime);
    }
}
