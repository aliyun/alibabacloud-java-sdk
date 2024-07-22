// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103;

import com.aliyun.tea.*;
import com.aliyun.sddp20190103.models.*;

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
     * <p>You can call this operation to create or restore configurations based on the codes of common configuration items. This allows you to manage the configurations of common configuration items.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a common configuration item for alerts.</p>
     * 
     * @param request CreateConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConfigResponse
     */
    public CreateConfigResponse createConfigWithOptions(CreateConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfig"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create or restore configurations based on the codes of common configuration items. This allows you to manage the configurations of common configuration items.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a common configuration item for alerts.</p>
     * 
     * @param request CreateConfigRequest
     * @return CreateConfigResponse
     */
    public CreateConfigResponse createConfig(CreateConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to authorize DSC to scan data assets to ensure the security of the data assets.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Authorizes Data Security Center (DSC) to scan data assets. The data assets can be a database, a project, or a bucket.</p>
     * 
     * @param request CreateDataLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataLimitResponse
     */
    public CreateDataLimitResponse createDataLimitWithOptions(CreateDataLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoScan)) {
            query.put("AutoScan", request.autoScan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificatePermission)) {
            query.put("CertificatePermission", request.certificatePermission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventStatus)) {
            query.put("EventStatus", request.eventStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instantlyScan)) {
            query.put("InstantlyScan", request.instantlyScan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreDay)) {
            query.put("LogStoreDay", request.logStoreDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ocrStatus)) {
            query.put("OcrStatus", request.ocrStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingSize)) {
            query.put("SamplingSize", request.samplingSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataLimit"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to authorize DSC to scan data assets to ensure the security of the data assets.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Authorizes Data Security Center (DSC) to scan data assets. The data assets can be a database, a project, or a bucket.</p>
     * 
     * @param request CreateDataLimitRequest
     * @return CreateDataLimitResponse
     */
    public CreateDataLimitResponse createDataLimit(CreateDataLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom sensitive data detection rule.</p>
     * 
     * @param request CreateRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentCategory)) {
            query.put("ContentCategory", request.contentCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            query.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statExpress)) {
            query.put("StatExpress", request.statExpress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportForm)) {
            query.put("SupportForm", request.supportForm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            query.put("Target", request.target);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warnLevel)) {
            query.put("WarnLevel", request.warnLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom sensitive data detection rule.</p>
     * 
     * @param request CreateRuleRequest
     * @return CreateRuleResponse
     */
    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a custom scan task for authorized data assets. You can customize the interval between two consecutive scan tasks and the time when the scan task is executed next time.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom scan task. The custom scan task is used to scan data assets on which Data Security Center (DSC) is granted the scan permissions for sensitive data.</p>
     * 
     * @param request CreateScanTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScanTaskResponse
     */
    public CreateScanTaskResponse createScanTaskWithOptions(CreateScanTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataLimitId)) {
            query.put("DataLimitId", request.dataLimitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalDay)) {
            query.put("IntervalDay", request.intervalDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossScanPath)) {
            query.put("OssScanPath", request.ossScanPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runHour)) {
            query.put("RunHour", request.runHour);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runMinute)) {
            query.put("RunMinute", request.runMinute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanRange)) {
            query.put("ScanRange", request.scanRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanRangeContent)) {
            query.put("ScanRangeContent", request.scanRangeContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskUserName)) {
            query.put("TaskUserName", request.taskUserName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScanTask"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScanTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create a custom scan task for authorized data assets. You can customize the interval between two consecutive scan tasks and the time when the scan task is executed next time.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom scan task. The custom scan task is used to scan data assets on which Data Security Center (DSC) is granted the scan permissions for sensitive data.</p>
     * 
     * @param request CreateScanTaskRequest
     * @return CreateScanTaskResponse
     */
    public CreateScanTaskResponse createScanTask(CreateScanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScanTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to allow DSC to access the data assets in services such as Object Storage Service (OSS), ApsaraDB RDS, and MaxCompute. After you call this operation, the system automatically creates a service-linked role named AliyunServiceRoleForSDDP and attaches the AliyunServiceRolePolicyForSDDP policy to the role.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a service-linked role for Data Security Center (DSC) to grant DSC the permissions to access data assets in other services.</p>
     * 
     * @param request CreateSlrRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSlrRoleResponse
     */
    public CreateSlrRoleResponse createSlrRoleWithOptions(CreateSlrRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSlrRole"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSlrRoleResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to allow DSC to access the data assets in services such as Object Storage Service (OSS), ApsaraDB RDS, and MaxCompute. After you call this operation, the system automatically creates a service-linked role named AliyunServiceRoleForSDDP and attaches the AliyunServiceRolePolicyForSDDP policy to the role.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a service-linked role for Data Security Center (DSC) to grant DSC the permissions to access data assets in other services.</p>
     * 
     * @param request CreateSlrRoleRequest
     * @return CreateSlrRoleResponse
     */
    public CreateSlrRoleResponse createSlrRole(CreateSlrRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSlrRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to revoke the permissions on a data asset from Data Security Center (DSC).</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes the scan permissions on a data asset. The data asset can be a database, an instance, or a bucket.</p>
     * 
     * @param request DeleteDataLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDataLimitResponse
     */
    public DeleteDataLimitResponse deleteDataLimitWithOptions(DeleteDataLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataLimit"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataLimitResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to revoke the permissions on a data asset from Data Security Center (DSC).</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes the scan permissions on a data asset. The data asset can be a database, an instance, or a bucket.</p>
     * 
     * @param request DeleteDataLimitRequest
     * @return DeleteDataLimitResponse
     */
    public DeleteDataLimitResponse deleteDataLimit(DeleteDataLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDataLimitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom sensitive data detection rule from Data Security Center (DSC).</p>
     * 
     * @param request DeleteRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom sensitive data detection rule from Data Security Center (DSC).</p>
     * 
     * @param request DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCategoryTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCategoryTemplateListResponse
     */
    public DescribeCategoryTemplateListResponse describeCategoryTemplateListWithOptions(DescribeCategoryTemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeCategoryTemplateList"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCategoryTemplateListResponse());
    }

    /**
     * @param request DescribeCategoryTemplateListRequest
     * @return DescribeCategoryTemplateListResponse
     */
    public DescribeCategoryTemplateListResponse describeCategoryTemplateList(DescribeCategoryTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCategoryTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query rules in a classification template.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries rules in a classification template by page.</p>
     * 
     * @param request DescribeCategoryTemplateRuleListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCategoryTemplateRuleListResponse
     */
    public DescribeCategoryTemplateRuleListResponse describeCategoryTemplateRuleListWithOptions(DescribeCategoryTemplateRuleListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevelId)) {
            query.put("RiskLevelId", request.riskLevelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCategoryTemplateRuleList"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCategoryTemplateRuleListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query rules in a classification template.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries rules in a classification template by page.</p>
     * 
     * @param request DescribeCategoryTemplateRuleListRequest
     * @return DescribeCategoryTemplateRuleListResponse
     */
    public DescribeCategoryTemplateRuleListResponse describeCategoryTemplateRuleList(DescribeCategoryTemplateRuleListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCategoryTemplateRuleListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the data in columns of a table that may contain sensitive data. This helps you analyze sensitive data.</p>
     * <h2><a href="#"></a>Precautions</h2>
     * <p>The DescribeColumns operation is changed to DescribeColumnsV2. We recommend that you call the DescribeColumnsV2 operation when you develop your applications.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>Each Alibaba Cloud account can call this operation up to 10 times per second. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries data in the columns of the tables that Data Security Center (DSC) is authorized to access. The tables include the tables of MaxCompute and ApsaraDB RDS.</p>
     * 
     * @param request DescribeColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeColumnsResponse
     */
    public DescribeColumnsResponse describeColumnsWithOptions(DescribeColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensLevelName)) {
            query.put("SensLevelName", request.sensLevelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeColumns"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeColumnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the data in columns of a table that may contain sensitive data. This helps you analyze sensitive data.</p>
     * <h2><a href="#"></a>Precautions</h2>
     * <p>The DescribeColumns operation is changed to DescribeColumnsV2. We recommend that you call the DescribeColumnsV2 operation when you develop your applications.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>Each Alibaba Cloud account can call this operation up to 10 times per second. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries data in the columns of the tables that Data Security Center (DSC) is authorized to access. The tables include the tables of MaxCompute and ApsaraDB RDS.</p>
     * 
     * @param request DescribeColumnsRequest
     * @return DescribeColumnsResponse
     */
    public DescribeColumnsResponse describeColumns(DescribeColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeColumnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the columns of tables in instances, such as MaxCompute projects and ApsaraDB RDS instances, that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request DescribeColumnsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeColumnsV2Response
     */
    public DescribeColumnsV2Response describeColumnsV2WithOptions(DescribeColumnsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensLevelName)) {
            query.put("SensLevelName", request.sensLevelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeColumnsV2"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeColumnsV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the columns of tables in instances, such as MaxCompute projects and ApsaraDB RDS instances, that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request DescribeColumnsV2Request
     * @return DescribeColumnsV2Response
     */
    public DescribeColumnsV2Response describeColumnsV2(DescribeColumnsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeColumnsV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries common configuration items for alerts.</p>
     * 
     * @param request DescribeConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConfigsResponse
     */
    public DescribeConfigsResponse describeConfigsWithOptions(DescribeConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigs"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries common configuration items for alerts.</p>
     * 
     * @param request DescribeConfigsRequest
     * @return DescribeConfigsResponse
     */
    public DescribeConfigsResponse describeConfigs(DescribeConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the sensitive data detection results of data assets that Data Security Center (DSC) is authorized to access.</p>
     * 
     * @param request DescribeDataAssetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataAssetsResponse
     */
    public DescribeDataAssetsResponse describeDataAssetsWithOptions(DescribeDataAssetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
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

        if (!com.aliyun.teautil.Common.isUnset(request.rangeId)) {
            query.put("RangeId", request.rangeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevels)) {
            query.put("RiskLevels", request.riskLevels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataAssets"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataAssetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the sensitive data detection results of data assets that Data Security Center (DSC) is authorized to access.</p>
     * 
     * @param request DescribeDataAssetsRequest
     * @return DescribeDataAssetsResponse
     */
    public DescribeDataAssetsResponse describeDataAssets(DescribeDataAssetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataAssetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a data asset, such as a MaxCompute project, an ApsaraDB RDS database, or an Object Storage Service (OSS) bucket, that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request DescribeDataLimitDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataLimitDetailResponse
     */
    public DescribeDataLimitDetailResponse describeDataLimitDetailWithOptions(DescribeDataLimitDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataLimitDetail"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataLimitDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a data asset, such as a MaxCompute project, an ApsaraDB RDS database, or an Object Storage Service (OSS) bucket, that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request DescribeDataLimitDetailRequest
     * @return DescribeDataLimitDetailResponse
     */
    public DescribeDataLimitDetailResponse describeDataLimitDetail(DescribeDataLimitDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataLimitDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the data assets that are authorized to be scanned. This facilitates resource search and aggregation.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries data assets, such as instances, databases, and Object Storage Service (OSS) buckets, that you authorize Data Security Center (DSC) to scan in a service.</p>
     * 
     * @param request DescribeDataLimitSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataLimitSetResponse
     */
    public DescribeDataLimitSetResponse describeDataLimitSetWithOptions(DescribeDataLimitSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataLimitSet"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataLimitSetResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the data assets that are authorized to be scanned. This facilitates resource search and aggregation.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries data assets, such as instances, databases, and Object Storage Service (OSS) buckets, that you authorize Data Security Center (DSC) to scan in a service.</p>
     * 
     * @param request DescribeDataLimitSetRequest
     * @return DescribeDataLimitSetResponse
     */
    public DescribeDataLimitSetResponse describeDataLimitSet(DescribeDataLimitSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataLimitSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data assets such as instances, databases, or buckets that Data Security Center (DSC) is authorized to access.</p>
     * 
     * @param request DescribeDataLimitsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataLimitsResponse
     */
    public DescribeDataLimitsResponse describeDataLimitsWithOptions(DescribeDataLimitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkStatus)) {
            query.put("CheckStatus", request.checkStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datamaskStatus)) {
            query.put("DatamaskStatus", request.datamaskStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            query.put("Enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberAccount)) {
            query.put("MemberAccount", request.memberAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataLimits"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataLimitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data assets such as instances, databases, or buckets that Data Security Center (DSC) is authorized to access.</p>
     * 
     * @param request DescribeDataLimitsRequest
     * @return DescribeDataLimitsResponse
     */
    public DescribeDataLimitsResponse describeDataLimits(DescribeDataLimitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataLimitsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the execution information of a static de-identification task, including the status and progress.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution information about a de-identification task.</p>
     * 
     * @param request DescribeDataMaskingRunHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataMaskingRunHistoryResponse
     */
    public DescribeDataMaskingRunHistoryResponse describeDataMaskingRunHistoryWithOptions(DescribeDataMaskingRunHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstType)) {
            query.put("DstType", request.dstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainProcessId)) {
            query.put("MainProcessId", request.mainProcessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcTableName)) {
            query.put("SrcTableName", request.srcTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcType)) {
            query.put("SrcType", request.srcType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataMaskingRunHistory"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataMaskingRunHistoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the execution information of a static de-identification task, including the status and progress.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution information about a de-identification task.</p>
     * 
     * @param request DescribeDataMaskingRunHistoryRequest
     * @return DescribeDataMaskingRunHistoryResponse
     */
    public DescribeDataMaskingRunHistoryResponse describeDataMaskingRunHistory(DescribeDataMaskingRunHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataMaskingRunHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query static de-identification tasks. This facilitates task queries and management.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries de-identification tasks.</p>
     * 
     * @param request DescribeDataMaskingTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataMaskingTasksResponse
     */
    public DescribeDataMaskingTasksResponse describeDataMaskingTasksWithOptions(DescribeDataMaskingTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dstType)) {
            query.put("DstType", request.dstType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataMaskingTasks"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataMaskingTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query static de-identification tasks. This facilitates task queries and management.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries de-identification tasks.</p>
     * 
     * @param request DescribeDataMaskingTasksRequest
     * @return DescribeDataMaskingTasksResponse
     */
    public DescribeDataMaskingTasksResponse describeDataMaskingTasks(DescribeDataMaskingTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataMaskingTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据对象列详情</p>
     * 
     * @param request DescribeDataObjectColumnDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataObjectColumnDetailResponse
     */
    public DescribeDataObjectColumnDetailResponse describeDataObjectColumnDetailWithOptions(DescribeDataObjectColumnDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataObjectColumnDetail"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataObjectColumnDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据对象列详情</p>
     * 
     * @param request DescribeDataObjectColumnDetailRequest
     * @return DescribeDataObjectColumnDetailResponse
     */
    public DescribeDataObjectColumnDetailResponse describeDataObjectColumnDetail(DescribeDataObjectColumnDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataObjectColumnDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据对象列详情V2</p>
     * 
     * @param request DescribeDataObjectColumnDetailV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataObjectColumnDetailV2Response
     */
    public DescribeDataObjectColumnDetailV2Response describeDataObjectColumnDetailV2WithOptions(DescribeDataObjectColumnDetailV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataObjectColumnDetailV2"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataObjectColumnDetailV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>查看数据对象列详情V2</p>
     * 
     * @param request DescribeDataObjectColumnDetailV2Request
     * @return DescribeDataObjectColumnDetailV2Response
     */
    public DescribeDataObjectColumnDetailV2Response describeDataObjectColumnDetailV2(DescribeDataObjectColumnDetailV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataObjectColumnDetailV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询数据目录对象</p>
     * 
     * @param request DescribeDataObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataObjectsResponse
     */
    public DescribeDataObjectsResponse describeDataObjectsWithOptions(DescribeDataObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileCategoryCode)) {
            query.put("FileCategoryCode", request.fileCategoryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberAccount)) {
            query.put("MemberAccount", request.memberAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelIds)) {
            query.put("ModelIds", request.modelIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTagIds)) {
            query.put("ModelTagIds", request.modelTagIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCategoryIds)) {
            query.put("ParentCategoryIds", request.parentCategoryIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productIds)) {
            query.put("ProductIds", request.productIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryName)) {
            query.put("QueryName", request.queryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevels)) {
            query.put("RiskLevels", request.riskLevels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataObjects"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataObjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询数据目录对象</p>
     * 
     * @param request DescribeDataObjectsRequest
     * @return DescribeDataObjectsResponse
     */
    public DescribeDataObjectsResponse describeDataObjects(DescribeDataObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataObjectsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDocTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDocTypesResponse
     */
    public DescribeDocTypesResponse describeDocTypesWithOptions(DescribeDocTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDocTypes"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDocTypesResponse());
    }

    /**
     * @param request DescribeDocTypesRequest
     * @return DescribeDocTypesResponse
     */
    public DescribeDocTypesResponse describeDocTypes(DescribeDocTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDocTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an anomalous event. The details include the time when the anomalous event occurred, and the description and handling status of the anomalous event.</p>
     * 
     * @param request DescribeEventDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventDetailResponse
     */
    public DescribeEventDetailResponse describeEventDetailWithOptions(DescribeEventDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventDetail"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an anomalous event. The details include the time when the anomalous event occurred, and the description and handling status of the anomalous event.</p>
     * 
     * @param request DescribeEventDetailRequest
     * @return DescribeEventDetailResponse
     */
    public DescribeEventDetailResponse describeEventDetail(DescribeEventDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the types of anomalous events.</p>
     * 
     * @param request DescribeEventTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventTypesResponse
     */
    public DescribeEventTypesResponse describeEventTypesWithOptions(DescribeEventTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentTypeId)) {
            query.put("ParentTypeId", request.parentTypeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventTypes"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the types of anomalous events.</p>
     * 
     * @param request DescribeEventTypesRequest
     * @return DescribeEventTypesResponse
     */
    public DescribeEventTypesResponse describeEventTypes(DescribeEventTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventTypesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query anomalous events that may involve data leaks. This helps you search for and handle anomalous events.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries anomalous events.</p>
     * 
     * @param request DescribeEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventsResponse
     */
    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealUserId)) {
            query.put("DealUserId", request.dealUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subTypeCode)) {
            query.put("SubTypeCode", request.subTypeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetProductCode)) {
            query.put("TargetProductCode", request.targetProductCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            query.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warnLevel)) {
            query.put("WarnLevel", request.warnLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEvents"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query anomalous events that may involve data leaks. This helps you search for and handle anomalous events.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries anomalous events.</p>
     * 
     * @param request DescribeEventsRequest
     * @return DescribeEventsResponse
     */
    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query a list of unauthorized or authorized data assets based on the value of AuthStatus.
     * This operation is no longer used for the KMS console of the new version.</p>
     * <h1><a href="#qps-"></a>QPS limits</h1>
     * <p>This operation can be called up to 10 times per second for each Alibaba Cloud account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data assets.</p>
     * 
     * @param request DescribeInstanceSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSourcesResponse
     */
    public DescribeInstanceSourcesResponse describeInstanceSourcesWithOptions(DescribeInstanceSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authStatus)) {
            query.put("AuthStatus", request.authStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            query.put("SearchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSources"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query a list of unauthorized or authorized data assets based on the value of AuthStatus.
     * This operation is no longer used for the KMS console of the new version.</p>
     * <h1><a href="#qps-"></a>QPS limits</h1>
     * <p>This operation can be called up to 10 times per second for each Alibaba Cloud account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of data assets.</p>
     * 
     * @param request DescribeInstanceSourcesRequest
     * @return DescribeInstanceSourcesResponse
     */
    public DescribeInstanceSourcesResponse describeInstanceSources(DescribeInstanceSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call the DescribeInstances operation, you can specify parameters such as Name and RiskLevelId to query data assets that meet filter conditions.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries data assets such as MaxCompute, ApsaraDB RDS, and Object Storage Service (OSS) that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request DescribeInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2019-01-03"),
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
     * <b>description</b> :
     * <p>When you call the DescribeInstances operation, you can specify parameters such as Name and RiskLevelId to query data assets that meet filter conditions.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries data assets such as MaxCompute, ApsaraDB RDS, and Object Storage Service (OSS) that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of an Object Storage Service (OSS) object. This helps you locate sensitive data detected in OSS.</p>
     * <h2><a href="#"></a>Precautions</h2>
     * <p>The DescribeOssObjectDetail operation is chagned to DescribeOssObjectDetailV2. We recommend that you call the DescribeOssObjectDetailV2 operation when you develop your applications.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>Each Alibaba Cloud account can call this operation up to 10 times per second. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an Object Storage Service (OSS) object that Data Security Center (DSC) is authorized to access.</p>
     * 
     * @param request DescribeOssObjectDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssObjectDetailResponse
     */
    public DescribeOssObjectDetailResponse describeOssObjectDetailWithOptions(DescribeOssObjectDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssObjectDetail"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssObjectDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of an Object Storage Service (OSS) object. This helps you locate sensitive data detected in OSS.</p>
     * <h2><a href="#"></a>Precautions</h2>
     * <p>The DescribeOssObjectDetail operation is chagned to DescribeOssObjectDetailV2. We recommend that you call the DescribeOssObjectDetailV2 operation when you develop your applications.</p>
     * <h2><a href="#qps"></a>Limits</h2>
     * <p>Each Alibaba Cloud account can call this operation up to 10 times per second. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an Object Storage Service (OSS) object that Data Security Center (DSC) is authorized to access.</p>
     * 
     * @param request DescribeOssObjectDetailRequest
     * @return DescribeOssObjectDetailResponse
     */
    public DescribeOssObjectDetailResponse describeOssObjectDetail(DescribeOssObjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssObjectDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用本接口查询数据安全中心连接授权的OSS的单个存储对象的详细信息</p>
     * 
     * @param request DescribeOssObjectDetailV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssObjectDetailV2Response
     */
    public DescribeOssObjectDetailV2Response describeOssObjectDetailV2WithOptions(DescribeOssObjectDetailV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssObjectDetailV2"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssObjectDetailV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>调用本接口查询数据安全中心连接授权的OSS的单个存储对象的详细信息</p>
     * 
     * @param request DescribeOssObjectDetailV2Request
     * @return DescribeOssObjectDetailV2Response
     */
    public DescribeOssObjectDetailV2Response describeOssObjectDetailV2(DescribeOssObjectDetailV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssObjectDetailV2WithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Object Storage Service (OSS) objects that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request DescribeOssObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssObjectsResponse
     */
    public DescribeOssObjectsResponse describeOssObjectsWithOptions(DescribeOssObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileCategoryCode)) {
            query.put("FileCategoryCode", request.fileCategoryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastScanTimeEnd)) {
            query.put("LastScanTimeEnd", request.lastScanTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastScanTimeStart)) {
            query.put("LastScanTimeStart", request.lastScanTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevelId)) {
            query.put("RiskLevelId", request.riskLevelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssObjects"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssObjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Object Storage Service (OSS) objects that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request DescribeOssObjectsRequest
     * @return DescribeOssObjectsResponse
     */
    public DescribeOssObjectsResponse describeOssObjects(DescribeOssObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssObjectsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query MaxCompute packages that are scanned by DSC. This helps you search for MaxCompute packages and view the summary of MaxCompute packages.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the MaxCompute packages that Data Security Center (DSC) is authorized to access. The information includes the names of MaxCompute packages, the accounts of MaxCompute package owners, and the sensitivity levels of MaxCompute packages.</p>
     * 
     * @param request DescribePackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePackagesResponse
     */
    public DescribePackagesResponse describePackagesWithOptions(DescribePackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevelId)) {
            query.put("RiskLevelId", request.riskLevelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePackages"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePackagesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query MaxCompute packages that are scanned by DSC. This helps you search for MaxCompute packages and view the summary of MaxCompute packages.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the MaxCompute packages that Data Security Center (DSC) is authorized to access. The information includes the names of MaxCompute packages, the accounts of MaxCompute package owners, and the sensitivity levels of MaxCompute packages.</p>
     * 
     * @param request DescribePackagesRequest
     * @return DescribePackagesResponse
     */
    public DescribePackagesResponse describePackages(DescribePackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePackagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一级授权列表</p>
     * 
     * @param request DescribeParentInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParentInstanceResponse
     */
    public DescribeParentInstanceResponse describeParentInstanceWithOptions(DescribeParentInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authStatus)) {
            query.put("AuthStatus", request.authStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkStatus)) {
            query.put("CheckStatus", request.checkStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterStatus)) {
            query.put("ClusterStatus", request.clusterStatus);
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

        if (!com.aliyun.teautil.Common.isUnset(request.memberAccount)) {
            query.put("MemberAccount", request.memberAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParentInstance"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParentInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一级授权列表</p>
     * 
     * @param request DescribeParentInstanceRequest
     * @return DescribeParentInstanceResponse
     */
    public DescribeParentInstanceResponse describeParentInstance(DescribeParentInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParentInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the sensitivity levels that are defined in the current rule template provided by DSC. This helps you learn about the number of times that each sensitivity level is referenced in the rule template and the highest sensitivity level.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sensitivity levels that are defined in a rule template provided by Data Security Center (DSC).</p>
     * 
     * @param request DescribeRiskLevelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRiskLevelsResponse
     */
    public DescribeRiskLevelsResponse describeRiskLevelsWithOptions(DescribeRiskLevelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeRiskLevels"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskLevelsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the sensitivity levels that are defined in the current rule template provided by DSC. This helps you learn about the number of times that each sensitivity level is referenced in the rule template and the highest sensitivity level.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sensitivity levels that are defined in a rule template provided by Data Security Center (DSC).</p>
     * 
     * @param request DescribeRiskLevelsRequest
     * @return DescribeRiskLevelsResponse
     */
    public DescribeRiskLevelsResponse describeRiskLevels(DescribeRiskLevelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRiskLevelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries sensitive data detection rules.</p>
     * 
     * @param request DescribeRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRulesResponse
     */
    public DescribeRulesResponse describeRulesWithOptions(DescribeRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentCategory)) {
            query.put("ContentCategory", request.contentCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customType)) {
            query.put("CustomType", request.customType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywordCompatible)) {
            query.put("KeywordCompatible", request.keywordCompatible);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            query.put("MatchType", request.matchType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportForm)) {
            query.put("SupportForm", request.supportForm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warnLevel)) {
            query.put("WarnLevel", request.warnLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRules"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries sensitive data detection rules.</p>
     * 
     * @param request DescribeRulesRequest
     * @return DescribeRulesResponse
     */
    public DescribeRulesResponse describeRules(DescribeRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call the DescribeTables operation to query tables, you can specify parameters such as Name and RiskLevelId to filter tables.</p>
     * <h1>Limits</h1>
     * <p>You can send up to 10 requests per second to call this operation by using your Alibaba Cloud account. If you send excessive requests, throttling is implemented, and your business may be affected.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries tables in data assets, such as MaxCompute projects and ApsaraDB RDS instances, that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request DescribeTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTablesResponse
     */
    public DescribeTablesResponse describeTablesWithOptions(DescribeTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageId)) {
            query.put("PackageId", request.packageId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTables"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTablesResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call the DescribeTables operation to query tables, you can specify parameters such as Name and RiskLevelId to filter tables.</p>
     * <h1>Limits</h1>
     * <p>You can send up to 10 requests per second to call this operation by using your Alibaba Cloud account. If you send excessive requests, throttling is implemented, and your business may be affected.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries tables in data assets, such as MaxCompute projects and ApsaraDB RDS instances, that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request DescribeTablesRequest
     * @return DescribeTablesResponse
     */
    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTemplateAllRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplateAllRulesResponse
     */
    public DescribeTemplateAllRulesResponse describeTemplateAllRulesWithOptions(DescribeTemplateAllRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeTemplateAllRules"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplateAllRulesResponse());
    }

    /**
     * @param request DescribeTemplateAllRulesRequest
     * @return DescribeTemplateAllRulesResponse
     */
    public DescribeTemplateAllRulesResponse describeTemplateAllRules(DescribeTemplateAllRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateAllRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about the current account. This helps you get familiar with your account that accesses Data Security Center (DSC).</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an account.</p>
     * 
     * @param request DescribeUserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserStatusResponse
     */
    public DescribeUserStatusResponse describeUserStatusWithOptions(DescribeUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserStatus"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about the current account. This helps you get familiar with your account that accesses Data Security Center (DSC).</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an account.</p>
     * 
     * @param request DescribeUserStatusRequest
     * @return DescribeUserStatusResponse
     */
    public DescribeUserStatusResponse describeUserStatus(DescribeUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to disable a configuration item based on the code of the configuration item. This helps you modify configurations at the earliest opportunity.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a configuration item. After you disable a configuration item, you can call the CreateConfig operation to enable the configuration item by specifying the code of the configuration item for the Code parameter in the request.</p>
     * 
     * @param request DisableUserConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableUserConfigResponse
     */
    public DisableUserConfigResponse disableUserConfigWithOptions(DisableUserConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableUserConfig"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableUserConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to disable a configuration item based on the code of the configuration item. This helps you modify configurations at the earliest opportunity.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a configuration item. After you disable a configuration item, you can call the CreateConfig operation to enable the configuration item by specifying the code of the configuration item for the Code parameter in the request.</p>
     * 
     * @param request DisableUserConfigRequest
     * @return DisableUserConfigResponse
     */
    public DisableUserConfigResponse disableUserConfig(DisableUserConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableUserConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Dynamically de-identifies sensitive data.</p>
     * 
     * @param request ExecDatamaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecDatamaskResponse
     */
    public ExecDatamaskResponse execDatamaskWithOptions(ExecDatamaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

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
            new TeaPair("action", "ExecDatamask"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDatamaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Dynamically de-identifies sensitive data.</p>
     * 
     * @param request ExecDatamaskRequest
     * @return ExecDatamaskResponse
     */
    public ExecDatamaskResponse execDatamask(ExecDatamaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.execDatamaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers a de-identification task.</p>
     * 
     * @param request ManualTriggerMaskingProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ManualTriggerMaskingProcessResponse
     */
    public ManualTriggerMaskingProcessResponse manualTriggerMaskingProcessWithOptions(ManualTriggerMaskingProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManualTriggerMaskingProcess"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManualTriggerMaskingProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Triggers a de-identification task.</p>
     * 
     * @param request ManualTriggerMaskingProcessRequest
     * @return ManualTriggerMaskingProcessResponse
     */
    public ManualTriggerMaskingProcessResponse manualTriggerMaskingProcess(ManualTriggerMaskingProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manualTriggerMaskingProcessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies configuration items for a data asset that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request ModifyDataLimitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDataLimitResponse
     */
    public ModifyDataLimitResponse modifyDataLimitWithOptions(ModifyDataLimitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditStatus)) {
            query.put("AuditStatus", request.auditStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoScan)) {
            query.put("AutoScan", request.autoScan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreDay)) {
            query.put("LogStoreDay", request.logStoreDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyPassword)) {
            query.put("ModifyPassword", request.modifyPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samplingSize)) {
            query.put("SamplingSize", request.samplingSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupIdList)) {
            query.put("SecurityGroupIdList", request.securityGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdList)) {
            query.put("VSwitchIdList", request.vSwitchIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataLimit"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataLimitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies configuration items for a data asset that you authorize Data Security Center (DSC) to access.</p>
     * 
     * @param request ModifyDataLimitRequest
     * @return ModifyDataLimitResponse
     */
    public ModifyDataLimitResponse modifyDataLimit(ModifyDataLimitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDataLimitWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the sensitivity levels of data. This helps you manage the sensitivity levels.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the sensitivity levels of sensitive data. You can change the default sensitivity levels of data that cannot be classified as sensitive or insensitive, and the sensitivity levels of data that can be classified as sensitive.</p>
     * 
     * @param request ModifyDefaultLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDefaultLevelResponse
     */
    public ModifyDefaultLevelResponse modifyDefaultLevelWithOptions(ModifyDefaultLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultId)) {
            query.put("DefaultId", request.defaultId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensitiveIds)) {
            query.put("SensitiveIds", request.sensitiveIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefaultLevel"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefaultLevelResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify the sensitivity levels of data. This helps you manage the sensitivity levels.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the sensitivity levels of sensitive data. You can change the default sensitivity levels of data that cannot be classified as sensitive or insensitive, and the sensitivity levels of data that can be classified as sensitive.</p>
     * 
     * @param request ModifyDefaultLevelRequest
     * @return ModifyDefaultLevelResponse
     */
    public ModifyDefaultLevelResponse modifyDefaultLevel(ModifyDefaultLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDefaultLevelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to handle anomalous events that involve data leaks. This helps protect your data assets at the earliest opportunity.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Handles an anomalous event.</p>
     * 
     * @param request ModifyEventStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEventStatusResponse
     */
    public ModifyEventStatusResponse modifyEventStatusWithOptions(ModifyEventStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backed)) {
            query.put("Backed", request.backed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealReason)) {
            query.put("DealReason", request.dealReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEventStatus"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEventStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to handle anomalous events that involve data leaks. This helps protect your data assets at the earliest opportunity.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Handles an anomalous event.</p>
     * 
     * @param request ModifyEventStatusRequest
     * @return ModifyEventStatusResponse
     */
    public ModifyEventStatusResponse modifyEventStatus(ModifyEventStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEventStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the detection of anomalous events of subtypes.</p>
     * 
     * @param request ModifyEventTypeStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEventTypeStatusResponse
     */
    public ModifyEventTypeStatusResponse modifyEventTypeStatusWithOptions(ModifyEventTypeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subTypeIds)) {
            query.put("SubTypeIds", request.subTypeIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEventTypeStatus"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEventTypeStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the detection of anomalous events of subtypes.</p>
     * 
     * @param request ModifyEventTypeStatusRequest
     * @return ModifyEventTypeStatusResponse
     */
    public ModifyEventTypeStatusResponse modifyEventTypeStatus(ModifyEventTypeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEventTypeStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable or disable the report task. After you activate Data Security Center (DSC), the report task is enabled by default. After you disable the report task, you cannot view statistics that are newly generated in the Report Center module, on the Overview page of the Cloud Native Data Audit module, and in the Data security lab module. Existing statistics are not affected.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the report task.</p>
     * 
     * @param request ModifyReportTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyReportTaskStatusResponse
     */
    public ModifyReportTaskStatusResponse modifyReportTaskStatusWithOptions(ModifyReportTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureType)) {
            query.put("FeatureType", request.featureType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportTaskStatus)) {
            query.put("ReportTaskStatus", request.reportTaskStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyReportTaskStatus"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyReportTaskStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable or disable the report task. After you activate Data Security Center (DSC), the report task is enabled by default. After you disable the report task, you cannot view statistics that are newly generated in the Report Center module, on the Overview page of the Cloud Native Data Audit module, and in the Data security lab module. Existing statistics are not affected.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the report task.</p>
     * 
     * @param request ModifyReportTaskStatusRequest
     * @return ModifyReportTaskStatusResponse
     */
    public ModifyReportTaskStatusResponse modifyReportTaskStatus(ModifyReportTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyReportTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you must configure request parameters to specify the rule name, rule ID, and rule content.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a custom sensitive data detection rule in Data Security Center (DSC).</p>
     * 
     * @param request ModifyRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRuleResponse
     */
    public ModifyRuleResponse modifyRuleWithOptions(ModifyRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchType)) {
            query.put("MatchType", request.matchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportForm)) {
            query.put("SupportForm", request.supportForm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warnLevel)) {
            query.put("WarnLevel", request.warnLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRule"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you must configure request parameters to specify the rule name, rule ID, and rule content.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a custom sensitive data detection rule in Data Security Center (DSC).</p>
     * 
     * @param request ModifyRuleRequest
     * @return ModifyRuleResponse
     */
    public ModifyRuleResponse modifyRule(ModifyRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables a sensitive data detection rule.</p>
     * 
     * @param request ModifyRuleStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyRuleStatusResponse
     */
    public ModifyRuleStatusResponse modifyRuleStatusWithOptions(ModifyRuleStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRuleStatus"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRuleStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables a sensitive data detection rule.</p>
     * 
     * @param request ModifyRuleStatusRequest
     * @return ModifyRuleStatusResponse
     */
    public ModifyRuleStatusResponse modifyRuleStatus(ModifyRuleStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRuleStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to stop a de-identification task that is running. For example, you can stop a de-identification task that is used to de-identify specific data.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a de-identification task. After you stop a de-identification task, you can resume the task by calling the ManualTriggerMaskingProcess operation.</p>
     * 
     * @param request StopMaskingProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopMaskingProcessResponse
     */
    public StopMaskingProcessResponse stopMaskingProcessWithOptions(StopMaskingProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMaskingProcess"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMaskingProcessResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to stop a de-identification task that is running. For example, you can stop a de-identification task that is used to de-identify specific data.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a de-identification task. After you stop a de-identification task, you can resume the task by calling the ManualTriggerMaskingProcess operation.</p>
     * 
     * @param request StopMaskingProcessRequest
     * @return StopMaskingProcessResponse
     */
    public StopMaskingProcessResponse stopMaskingProcess(StopMaskingProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopMaskingProcessWithOptions(request, runtime);
    }
}
