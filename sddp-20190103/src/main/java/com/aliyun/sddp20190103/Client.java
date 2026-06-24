// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103;

import com.aliyun.tea.*;
import com.aliyun.sddp20190103.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hongkong", "sddp-api.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "sddp.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "sddp.ap-southeast-1.aliyuncs.com")
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
     * <p>Creates or restores configurations based on the codes of common alert configuration items, allowing you to manage these configurations.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the general alert configuration parameters.</p>
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
     * <p>Creates or restores configurations based on the codes of common alert configuration items, allowing you to manage these configurations.</p>
     * <h1>Limits</h1>
     * <p>You can call this operation up to 10 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the general alert configuration parameters.</p>
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
     * <p>You can use this operation to grant permissions to scan your data assets. This helps improve the security of your data assets.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, the system throttles your API calls. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the CreateDataLimit operation to grant permissions to scan databases, projects, and buckets.</p>
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
     * <p>You can use this operation to grant permissions to scan your data assets. This helps improve the security of your data assets.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, the system throttles your API calls. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the CreateDataLimit operation to grant permissions to scan databases, projects, and buckets.</p>
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
     * <p>Call CreateRule to create a custom sensitive data detection rule.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.modelRuleIds)) {
            query.put("ModelRuleIds", request.modelRuleIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateRuleIds)) {
            query.put("TemplateRuleIds", request.templateRuleIds);
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
     * <p>Call CreateRule to create a custom sensitive data detection rule.</p>
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
     * <p>This operation creates custom scan tasks for authorized assets. You can control the run interval and runtime of each scan task.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for a single user. If you exceed this limit, API calls are throttled. This may impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the CreateScanTask operation to create a custom scan task to detect sensitive data in authorized assets.</p>
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
     * <p>This operation creates custom scan tasks for authorized assets. You can control the run interval and runtime of each scan task.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for a single user. If you exceed this limit, API calls are throttled. This may impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the CreateScanTask operation to create a custom scan task to detect sensitive data in authorized assets.</p>
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
     * <p>This operation allows DSC to access the resources of Alibaba Cloud services such as OSS, RDS, and MaxCompute. After you call this operation, the system automatically creates a service-linked role. The role is named AliyunServiceRoleForSDDP, and its access policy is AliyunServiceRolePolicyForSDDP.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 for each user. If you exceed the limit, API calls are throttled, which can affect your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Call CreateSlrRole to create a service-linked role for Data Security Center (DSC). This role authorizes DSC to access your cloud resources.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
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
     * <p>This operation allows DSC to access the resources of Alibaba Cloud services such as OSS, RDS, and MaxCompute. After you call this operation, the system automatically creates a service-linked role. The role is named AliyunServiceRoleForSDDP, and its access policy is AliyunServiceRolePolicyForSDDP.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 for each user. If you exceed the limit, API calls are throttled, which can affect your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Call CreateSlrRole to create a service-linked role for Data Security Center (DSC). This role authorizes DSC to access your cloud resources.</p>
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
     * <p>This operation is typically used to revoke authorization for data assets. This helps you manage data access permissions.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed this limit, API calls are throttled. This may affect your business. We recommend that you call this operation within this limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes the scan authorization for a data asset, such as a database, instance, or bucket.</p>
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
     * <p>This operation is typically used to revoke authorization for data assets. This helps you manage data access permissions.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed this limit, API calls are throttled. This may affect your business. We recommend that you call this operation within this limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes the scan authorization for a data asset, such as a database, instance, or bucket.</p>
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
     * <p>Deletes a custom sensitive data detection rule.</p>
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
     * <p>Deletes a custom sensitive data detection rule.</p>
     * 
     * @param request DeleteRuleRequest
     * @return DeleteRuleResponse
     */
    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries a list of data audit alert logs, allowing you to search for and handle alerts.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10. If you exceed this limit, the system throttles your API calls. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of audit alert logs.</p>
     * 
     * @param request DescribeAuditLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuditLogsResponse
     */
    public DescribeAuditLogsResponse describeAuditLogsWithOptions(DescribeAuditLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asyncRequestId)) {
            query.put("AsyncRequestId", request.asyncRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientUa)) {
            query.put("ClientUa", request.clientUa);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectRowRange)) {
            query.put("EffectRowRange", request.effectRowRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeTimeRange)) {
            query.put("ExecuteTimeRange", request.executeTimeRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipType)) {
            query.put("IpType", request.ipType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadWhiteList)) {
            query.put("LoadWhiteList", request.loadWhiteList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logQueryOpJson)) {
            query.put("LogQueryOpJson", request.logQueryOpJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSource)) {
            query.put("LogSource", request.logSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberAccount)) {
            query.put("MemberAccount", request.memberAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossObjectKey)) {
            query.put("OssObjectKey", request.ossObjectKey);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleAggQuery)) {
            query.put("RuleAggQuery", request.ruleAggQuery);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleCategory)) {
            query.put("RuleCategory", request.ruleCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleID)) {
            query.put("RuleID", request.ruleID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlText)) {
            query.put("SqlText", request.sqlText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuditLogs"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuditLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries a list of data audit alert logs, allowing you to search for and handle alerts.</p>
     * <h2>QPS limit</h2>
     * <p>The QPS limit for a single user is 10. If you exceed this limit, the system throttles your API calls. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of audit alert logs.</p>
     * 
     * @param request DescribeAuditLogsRequest
     * @return DescribeAuditLogsResponse
     */
    public DescribeAuditLogsResponse describeAuditLogs(DescribeAuditLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuditLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists industry-specific templates.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Lists industry-specific templates.</p>
     * 
     * @param request DescribeCategoryTemplateListRequest
     * @return DescribeCategoryTemplateListResponse
     */
    public DescribeCategoryTemplateListResponse describeCategoryTemplateList(DescribeCategoryTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCategoryTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the rules in a data classification template to help you review the rule details.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user on this operation is 10 calls per second. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a paginated list of rules in a data classification template.</p>
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
     * <p>Retrieves the rules in a data classification template to help you review the rule details.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user on this operation is 10 calls per second. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a paginated list of rules in a data classification template.</p>
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
     * <p>This API is typically used to view column data in sensitive data asset information tables. This helps users accurately analyze sensitive data.</p>
     * <h2>Notes</h2>
     * <p>The DescribeColumns API has been revised and replaced by DescribeColumnsV2. Use the newer DescribeColumnsV2 version when developing applications.</p>
     * <h2>QPS Limits</h2>
     * <p>The single-user QPS limit for this API is 10 calls per second. If you exceed this limit, API calls will be rate-limited. This may affect your business. You should call the API reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the DescribeColumns API to query column data in data asset tables, such as MaxCompute and RDS, that are authorized to connect to Data Security Center.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.modelTagId)) {
            query.put("ModelTagId", request.modelTagId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sensLevelName)) {
            query.put("SensLevelName", request.sensLevelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateRuleId)) {
            query.put("TemplateRuleId", request.templateRuleId);
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
     * <p>This API is typically used to view column data in sensitive data asset information tables. This helps users accurately analyze sensitive data.</p>
     * <h2>Notes</h2>
     * <p>The DescribeColumns API has been revised and replaced by DescribeColumnsV2. Use the newer DescribeColumnsV2 version when developing applications.</p>
     * <h2>QPS Limits</h2>
     * <p>The single-user QPS limit for this API is 10 calls per second. If you exceed this limit, API calls will be rate-limited. This may affect your business. You should call the API reasonably.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the DescribeColumns API to query column data in data asset tables, such as MaxCompute and RDS, that are authorized to connect to Data Security Center.</p>
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
     * <p>The DescribeColumnsV2 operation queries data in the columns of data asset tables, such as those in MaxCompute and RDS, that are authorized in Data Security Center.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
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
     * <p>The DescribeColumnsV2 operation queries data in the columns of data asset tables, such as those in MaxCompute and RDS, that are authorized in Data Security Center.</p>
     * 
     * @param request DescribeColumnsV2Request
     * @return DescribeColumnsV2Response
     */
    public DescribeColumnsV2Response describeColumnsV2(DescribeColumnsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeColumnsV2WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Queries common configuration items for anomaly alerts, which you can use to create or restore alert configurations.</p>
     * <h1>QPS limit</h1>
     * <p>The maximum number of queries per second (QPS) per user is 10. If this limit is exceeded, API calls are throttled. This may impact your business. Call this operation only as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries common configuration items for anomaly alerts.</p>
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
     * <b>description</b> :
     * <h1>Usage notes</h1>
     * <p>Queries common configuration items for anomaly alerts, which you can use to create or restore alert configurations.</p>
     * <h1>QPS limit</h1>
     * <p>The maximum number of queries per second (QPS) per user is 10. If this limit is exceeded, API calls are throttled. This may impact your business. Call this operation only as needed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries common configuration items for anomaly alerts.</p>
     * 
     * @param request DescribeConfigsRequest
     * @return DescribeConfigsResponse
     */
    public DescribeConfigsResponse describeConfigs(DescribeConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConfigsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is typically used to query data assets of different types on the overview page of DSC.</p>
     * <h2>Usage notes</h2>
     * <p>This operation is deprecated and no longer maintained.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Searches for data assets on the Overview page of Data Security Center (DSC).</p>
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
     * <b>description</b> :
     * <p>This operation is typically used to query data assets of different types on the overview page of DSC.</p>
     * <h2>Usage notes</h2>
     * <p>This operation is deprecated and no longer maintained.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Searches for data assets on the Overview page of Data Security Center (DSC).</p>
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
     * <p>Retrieves the details of an authorized data asset, such as a MaxCompute project, ApsaraDB RDS database, or OSS bucket.</p>
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
     * <p>Retrieves the details of an authorized data asset, such as a MaxCompute project, ApsaraDB RDS database, or OSS bucket.</p>
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
     * <p>Use this operation to retrieve a list of authorized product assets. This list helps you search for and aggregate resources.</p>
     * <h2>Notes</h2>
     * <p>In the future, this operation will be used only to retrieve the list of regions that a product supports. Other features will no longer be maintained.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. API calls that exceed this limit are throttled. Throttling can affect your business. We recommend that you call this operation a reasonable number of times.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeDataLimitSet operation to query the authorization list for unstructured assets or the list of regions supported by Data Security Center.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.regionType)) {
            query.put("RegionType", request.regionType);
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
     * <p>Use this operation to retrieve a list of authorized product assets. This list helps you search for and aggregate resources.</p>
     * <h2>Notes</h2>
     * <p>In the future, this operation will be used only to retrieve the list of regions that a product supports. Other features will no longer be maintained.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. API calls that exceed this limit are throttled. Throttling can affect your business. We recommend that you call this operation a reasonable number of times.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeDataLimitSet operation to query the authorization list for unstructured assets or the list of regions supported by Data Security Center.</p>
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
     * <p>Queries the list of data assets for authorized instances, databases, and buckets.</p>
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
     * <p>Queries the list of data assets for authorized instances, databases, and buckets.</p>
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
     * <p>This operation retrieves the execution history of static data masking tasks. You can use it to search for task statuses and view task progress.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user on this operation is 10 calls per second. Calls that exceed this limit are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call DescribeDataMaskingRunHistory to query the execution history of data masking tasks.</p>
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
     * <p>This operation retrieves the execution history of static data masking tasks. You can use it to search for task statuses and view task progress.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user on this operation is 10 calls per second. Calls that exceed this limit are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call DescribeDataMaskingRunHistory to query the execution history of data masking tasks.</p>
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
     * <p>This operation retrieves a list of static data masking tasks, which you can then search and manage.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, your API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Call DescribeDataMaskingTasks to retrieve a list of data masking tasks.</p>
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
     * <p>This operation retrieves a list of static data masking tasks, which you can then search and manage.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, your API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Call DescribeDataMaskingTasks to retrieve a list of data masking tasks.</p>
     * 
     * @param request DescribeDataMaskingTasksRequest
     * @return DescribeDataMaskingTasksResponse
     */
    public DescribeDataMaskingTasksResponse describeDataMaskingTasks(DescribeDataMaskingTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataMaskingTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Notes</h2>
     * <p>The DescribeDataObjectColumnDetail operation has been updated to DescribeDataObjectColumnDetailV2. We recommend that you use the latest version, DescribeDataObjectColumnDetailV2, for application development.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detection results for columns in a data table.</p>
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
     * <b>description</b> :
     * <h2>Notes</h2>
     * <p>The DescribeDataObjectColumnDetail operation has been updated to DescribeDataObjectColumnDetailV2. We recommend that you use the latest version, DescribeDataObjectColumnDetailV2, for application development.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the detection results for columns in a data table.</p>
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
     * <p>Queries the detection results for the columns of a data table.</p>
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
     * <p>Queries the detection results for the columns of a data table.</p>
     * 
     * @param request DescribeDataObjectColumnDetailV2Request
     * @return DescribeDataObjectColumnDetailV2Response
     */
    public DescribeDataObjectColumnDetailV2Response describeDataObjectColumnDetailV2(DescribeDataObjectColumnDetailV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataObjectColumnDetailV2WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries data detection results for tables and files, to provide a comprehensive view across all your assets.</p>
     * <h2>QPS limit</h2>
     * <p>The per-user QPS limit for this operation is 10 requests per second. If you exceed this limit, the system throttles your API calls. To prevent business disruptions, call this operation only when necessary.</p>
     * 
     * <b>summary</b> : 
     * <p>Query data detection results for tables and files.</p>
     * 
     * @param request DescribeDataObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataObjectsResponse
     */
    public DescribeDataObjectsResponse describeDataObjectsWithOptions(DescribeDataObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIVersion)) {
            query.put("APIVersion", request.APIVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.logStore)) {
            query.put("LogStore", request.logStore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreFlag)) {
            query.put("LogStoreFlag", request.logStoreFlag);
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

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            query.put("ProductId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productIds)) {
            query.put("ProductIds", request.productIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            query.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryName)) {
            query.put("QueryName", request.queryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevelIdList)) {
            query.put("RiskLevelIdList", request.riskLevelIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevels)) {
            query.put("RiskLevels", request.riskLevels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIds)) {
            query.put("RuleIds", request.ruleIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
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
     * <b>description</b> :
     * <p>This operation queries data detection results for tables and files, to provide a comprehensive view across all your assets.</p>
     * <h2>QPS limit</h2>
     * <p>The per-user QPS limit for this operation is 10 requests per second. If you exceed this limit, the system throttles your API calls. To prevent business disruptions, call this operation only when necessary.</p>
     * 
     * <b>summary</b> : 
     * <p>Query data detection results for tables and files.</p>
     * 
     * @param request DescribeDataObjectsRequest
     * @return DescribeDataObjectsResponse
     */
    public DescribeDataObjectsResponse describeDataObjects(DescribeDataObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataObjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of file types supported by Object Storage Service (OSS).</p>
     * 
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
     * <b>summary</b> : 
     * <p>Queries a list of file types supported by Object Storage Service (OSS).</p>
     * 
     * @param request DescribeDocTypesRequest
     * @return DescribeDocTypesResponse
     */
    public DescribeDocTypesResponse describeDocTypes(DescribeDocTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDocTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an anomalous event, including its occurrence time, description, and handling status.</p>
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
     * <p>Retrieves the details of an anomalous event, including its occurrence time, description, and handling status.</p>
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
     * <p>Queries anomalous activity types.</p>
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
     * <p>Queries anomalous activity types.</p>
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
     * <p>This operation queries alerts for data breach risks to help you find and handle them.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 for each user. If you exceed the limit, your API calls are throttled. This may affect your business. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists anomalous events.</p>
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
     * <p>This operation queries alerts for data breach risks to help you find and handle them.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 for each user. If you exceed the limit, your API calls are throttled. This may affect your business. Plan your API calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists anomalous events.</p>
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
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 for each user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the completion status of a detection task based on the task ID. You can obtain the task ID from the Id field in the return value of a CreateScanTask or ScanOssObjectV1 API call.</p>
     * 
     * @param request DescribeIdentifyTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIdentifyTaskStatusResponse
     */
    public DescribeIdentifyTaskStatusResponse describeIdentifyTaskStatusWithOptions(DescribeIdentifyTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIdentifyTaskStatus"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIdentifyTaskStatusResponse());
    }

    /**
     * <b>description</b> :
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 for each user. If you exceed the limit, API calls are throttled, which may affect your business. Call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the completion status of a detection task based on the task ID. You can obtain the task ID from the Id field in the return value of a CreateScanTask or ScanOssObjectV1 API call.</p>
     * 
     * @param request DescribeIdentifyTaskStatusRequest
     * @return DescribeIdentifyTaskStatusResponse
     */
    public DescribeIdentifyTaskStatusResponse describeIdentifyTaskStatus(DescribeIdentifyTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIdentifyTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of authorized or unauthorized data assets based on the AuthStatus parameter to help you understand the authorization status of your data assets.
     * This operation is no longer used in the new console.</p>
     * <h2>QPS limit</h2>
     * <p>Each user can call this operation up to 10 times per second. If this limit is exceeded, API calls are throttled, which may affect your business.</p>
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
     * <p>Queries the list of authorized or unauthorized data assets based on the AuthStatus parameter to help you understand the authorization status of your data assets.
     * This operation is no longer used in the new console.</p>
     * <h2>QPS limit</h2>
     * <p>Each user can call this operation up to 10 times per second. If this limit is exceeded, API calls are throttled, which may affect your business.</p>
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
     * <p>When you call the DescribeInstances operation, you can set parameters such as search keywords and the threat level of data asset instances to retrieve a list of instances that meet your requirements.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user for this operation is 10 calls per second. If you exceed this limit, API calls are throttled. This can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of authorized MaxCompute, RDS, and OSS data asset instances.</p>
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
     * <p>When you call the DescribeInstances operation, you can set parameters such as search keywords and the threat level of data asset instances to retrieve a list of instances that meet your requirements.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user for this operation is 10 calls per second. If you exceed this limit, API calls are throttled. This can affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of authorized MaxCompute, RDS, and OSS data asset instances.</p>
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
     * <p>This operation is typically used to query the details of OSS objects. This information helps you accurately locate sensitive data assets in OSS.</p>
     * <h2>Usage notes</h2>
     * <p>The DescribeOssObjectDetail operation has been updated to DescribeOssObjectDetailV2. We recommend that you use the new version, DescribeOssObjectDetailV2, when you develop applications.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can make up to 10 queries per second (QPS). If you exceed the limit, API calls are throttled. This may affect your business. We recommend that you plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains detailed information about an authorized OSS object in Data Security Center.</p>
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
     * <p>This operation is typically used to query the details of OSS objects. This information helps you accurately locate sensitive data assets in OSS.</p>
     * <h2>Usage notes</h2>
     * <p>The DescribeOssObjectDetail operation has been updated to DescribeOssObjectDetailV2. We recommend that you use the new version, DescribeOssObjectDetailV2, when you develop applications.</p>
     * <h2>QPS limit</h2>
     * <p>A single user can make up to 10 queries per second (QPS). If you exceed the limit, API calls are throttled. This may affect your business. We recommend that you plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains detailed information about an authorized OSS object in Data Security Center.</p>
     * 
     * @param request DescribeOssObjectDetailRequest
     * @return DescribeOssObjectDetailResponse
     */
    public DescribeOssObjectDetailResponse describeOssObjectDetail(DescribeOssObjectDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssObjectDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the details of OSS objects. You can use this operation to locate sensitive data assets in OSS.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains detailed information about an authorized OSS object in Data Security Center.</p>
     * 
     * @param request DescribeOssObjectDetailV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssObjectDetailV2Response
     */
    public DescribeOssObjectDetailV2Response describeOssObjectDetailV2WithOptions(DescribeOssObjectDetailV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKey)) {
            query.put("ObjectKey", request.objectKey);
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
     * <b>description</b> :
     * <p>This operation queries the details of OSS objects. You can use this operation to locate sensitive data assets in OSS.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains detailed information about an authorized OSS object in Data Security Center.</p>
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
     * <p>Lists authorized OSS objects.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
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
     * <p>Lists authorized OSS objects.</p>
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
     * <p>This API is typically used to query a list of MaxCompute packages. This helps you search for packages and obtain an overview of sensitive information.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, your API calls are throttled. This can affect your business. Make sure to call this API within the limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about MaxCompute packages authorized for scanning, including package names, owner accounts, and risk levels.</p>
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
     * <p>This API is typically used to query a list of MaxCompute packages. This helps you search for packages and obtain an overview of sensitive information.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, your API calls are throttled. This can affect your business. Make sure to call this API within the limit.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about MaxCompute packages authorized for scanning, including package names, owner accounts, and risk levels.</p>
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
     * <p>Lists assets and their authorization status.</p>
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
     * <p>Lists assets and their authorization status.</p>
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
     * <p>You can use this operation to retrieve a list of risk levels for sensitive data that are defined in the current template. This lets you view the number of rules that reference each risk level and the maximum risk level in the template.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for a single user. If you exceed this limit, your API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeRiskLevels operation to retrieve a list of risk levels for sensitive data.</p>
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
     * <p>You can use this operation to retrieve a list of risk levels for sensitive data that are defined in the current template. This lets you view the number of rules that reference each risk level and the maximum risk level in the template.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for a single user. If you exceed this limit, your API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>Call the DescribeRiskLevels operation to retrieve a list of risk levels for sensitive data.</p>
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
     * <p>Queries a list of sensitive data detection rules.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.cooperationChannel)) {
            query.put("CooperationChannel", request.cooperationChannel);
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

        if (!com.aliyun.teautil.Common.isUnset(request.simplify)) {
            query.put("Simplify", request.simplify);
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
     * <p>Queries a list of sensitive data detection rules.</p>
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
     * <p>You can call the DescribeTables operation to retrieve information about specific data asset tables. You can specify parameters such as search keywords and risk levels.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can call this operation up to 10 times per second. If you exceed this limit, throttling is triggered, which may affect your business. We recommend that you call this operation at a sustainable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries tables in data assets, such as MaxCompute and RDS, that Data Security Center is authorized to access.</p>
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
     * <p>You can call the DescribeTables operation to retrieve information about specific data asset tables. You can specify parameters such as search keywords and risk levels.</p>
     * <h2>QPS limits</h2>
     * <p>Each Alibaba Cloud account can call this operation up to 10 times per second. If you exceed this limit, throttling is triggered, which may affect your business. We recommend that you call this operation at a sustainable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries tables in data assets, such as MaxCompute and RDS, that Data Security Center is authorized to access.</p>
     * 
     * @param request DescribeTablesRequest
     * @return DescribeTablesResponse
     */
    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists all rules in an industry-specific template.</p>
     * 
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
     * <b>summary</b> : 
     * <p>Lists all rules in an industry-specific template.</p>
     * 
     * @param request DescribeTemplateAllRulesRequest
     * @return DescribeTemplateAllRulesResponse
     */
    public DescribeTemplateAllRulesResponse describeTemplateAllRules(DescribeTemplateAllRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplateAllRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves information about the current account, such as your usage of Data Security Center (DSC).</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed this limit, API calls are throttled. This may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a user account.</p>
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
     * <p>Retrieves information about the current account, such as your usage of Data Security Center (DSC).</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed this limit, API calls are throttled. This may affect your business. Call this operation at a reasonable frequency.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a user account.</p>
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
     * <p>This operation disables a user configuration based on the code of a configuration item in the general anomaly alert configuration module. This lets you promptly change the status of the user configuration.</p>
     * <h2>QPS limits</h2>
     * <p>This operation is limited to 10 queries per second (QPS) per user. Calls that exceed this limit are throttled. Throttling may impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the DisableUserConfig operation to disable a user configuration. After a configuration is disabled, you can call the CreateConfig operation and specify the same Code parameter to restore the general anomaly alert configuration.</p>
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
     * <p>This operation disables a user configuration based on the code of a configuration item in the general anomaly alert configuration module. This lets you promptly change the status of the user configuration.</p>
     * <h2>QPS limits</h2>
     * <p>This operation is limited to 10 queries per second (QPS) per user. Calls that exceed this limit are throttled. Throttling may impact your business. Plan your calls accordingly.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the DisableUserConfig operation to disable a user configuration. After a configuration is disabled, you can call the CreateConfig operation and specify the same Code parameter to restore the general anomaly alert configuration.</p>
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
     * <p>You can call the ExecDatamask operation to dynamically mask data.</p>
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
     * <p>You can call the ExecDatamask operation to dynamically mask data.</p>
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
     * <p>Triggers a data masking task.</p>
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
     * <p>Triggers a data masking task.</p>
     * 
     * @param request ManualTriggerMaskingProcessRequest
     * @return ManualTriggerMaskingProcessResponse
     */
    public ManualTriggerMaskingProcessResponse manualTriggerMaskingProcess(ManualTriggerMaskingProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.manualTriggerMaskingProcessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*
     * To use this operation, you must have an image masking quota. Each call deducts one unit from your quota.
     * <strong>QPS limit</strong>
     * The QPS limit for a single user is 10. If you exceed this limit, API calls are throttled, which can affect your business. To prevent service disruptions, operate within this limit.
     * <strong>Usage notes</strong>
     * After masking is complete, the system stores the masked image in the aliyun_dsc_desensitization folder within the source bucket.
     * For example, an image at exampledir/test.png in a bucket is saved as aliyun_dsc_desensitization/exampledir/test.png after masking.
     * For more information, see https\://help.aliyun.com/zh/dsc/data-security-center/user-guide/picture-desensitization</p>
     * 
     * <b>summary</b> : 
     * <p>Use the MaskOssImage operation to mask images stored as objects.</p>
     * 
     * @param request MaskOssImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MaskOssImageResponse
     */
    public MaskOssImageResponse maskOssImageWithOptions(MaskOssImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAlwaysUpload)) {
            query.put("IsAlwaysUpload", request.isAlwaysUpload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isCoverObject)) {
            query.put("IsCoverObject", request.isCoverObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isSupportRestore)) {
            query.put("IsSupportRestore", request.isSupportRestore);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maskRuleIdList)) {
            query.put("MaskRuleIdList", request.maskRuleIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKey)) {
            query.put("ObjectKey", request.objectKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MaskOssImage"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MaskOssImageResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Prerequisites</em>*
     * To use this operation, you must have an image masking quota. Each call deducts one unit from your quota.
     * <strong>QPS limit</strong>
     * The QPS limit for a single user is 10. If you exceed this limit, API calls are throttled, which can affect your business. To prevent service disruptions, operate within this limit.
     * <strong>Usage notes</strong>
     * After masking is complete, the system stores the masked image in the aliyun_dsc_desensitization folder within the source bucket.
     * For example, an image at exampledir/test.png in a bucket is saved as aliyun_dsc_desensitization/exampledir/test.png after masking.
     * For more information, see https\://help.aliyun.com/zh/dsc/data-security-center/user-guide/picture-desensitization</p>
     * 
     * <b>summary</b> : 
     * <p>Use the MaskOssImage operation to mask images stored as objects.</p>
     * 
     * @param request MaskOssImageRequest
     * @return MaskOssImageResponse
     */
    public MaskOssImageResponse maskOssImage(MaskOssImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.maskOssImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call ModifyDataLimit to modify the configuration items of a connection authorization in Data Security Center (DSC).</p>
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
     * <p>You can call ModifyDataLimit to modify the configuration items of a connection authorization in Data Security Center (DSC).</p>
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
     * <p>This API modifies the rules that define threat levels for sensitive data to help with threat level planning.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are throttled. Throttling can impact your business. We recommend that you call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the rules that define threat levels for sensitive data. This includes the default threat level for unidentified data and the threat levels for data that is classified as sensitive.</p>
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
     * <p>This API modifies the rules that define threat levels for sensitive data to help with threat level planning.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are throttled. Throttling can impact your business. We recommend that you call this API at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the rules that define threat levels for sensitive data. This includes the default threat level for unidentified data and the threat levels for data that is classified as sensitive.</p>
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
     * <p>This API operation is typically used to handle alerts for data breach threats, helping you protect your data assets promptly.</p>
     * <h2>QPS limits</h2>
     * <p>This API operation has a queries per second (QPS) limit of 10 for each user. If you exceed the limit, API calls are throttled, which can affect your business. We recommend calling the API operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Handles anomalous activities.</p>
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
     * <p>This API operation is typically used to handle alerts for data breach threats, helping you protect your data assets promptly.</p>
     * <h2>QPS limits</h2>
     * <p>This API operation has a queries per second (QPS) limit of 10 for each user. If you exceed the limit, API calls are throttled, which can affect your business. We recommend calling the API operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>Handles anomalous activities.</p>
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
     * <p>This operation enables anomalous activity detection for subtypes.</p>
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
     * <p>This operation enables anomalous activity detection for subtypes.</p>
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
     * <p>After you activate Data Security Center (DSC), report tasks are enabled by default. If you disable report tasks, Report Center, Cloud-native Data Audit Overview, and Data Security Lab will not generate new statistical data. Existing data is not affected.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the ModifyReportTaskStatus operation to enable or disable report tasks.</p>
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
     * <p>After you activate Data Security Center (DSC), report tasks are enabled by default. If you disable report tasks, Report Center, Cloud-native Data Audit Overview, and Data Security Lab will not generate new statistical data. Existing data is not affected.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are throttled, which may affect your business. We recommend that you call this operation at a reasonable rate.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the ModifyReportTaskStatus operation to enable or disable report tasks.</p>
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
     * <p>You must specify the rule name, rule ID, and rule content.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for a single user. If the limit is exceeded, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.modelRuleIds)) {
            query.put("ModelRuleIds", request.modelRuleIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateRuleIds)) {
            query.put("TemplateRuleIds", request.templateRuleIds);
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
     * <p>You must specify the rule name, rule ID, and rule content.</p>
     * <h2>QPS limits</h2>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for a single user. If the limit is exceeded, API calls are throttled. This may affect your business. Plan your calls accordingly.</p>
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
     * <p>Enables or disables sensitive data detection rules.</p>
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
     * <p>Enables or disables sensitive data detection rules.</p>
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
     * <p>You can use RestoreOssImage to retrieve the original images that were processed by the MaskOssImage operation if the IsAlwaysUpload parameter is set to <code>true</code>.
     * For example, the image <code>aliyun_dsc_desensitization/exampledir/test.png</code> in a bucket is restored and saved as <code>aliyun_dsc_original/exampledir/test.png</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the RestoreOssImage operation to restore desensitized images.</p>
     * 
     * @param request RestoreOssImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestoreOssImageResponse
     */
    public RestoreOssImageResponse restoreOssImageWithOptions(RestoreOssImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucket)) {
            query.put("Bucket", request.bucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKey)) {
            query.put("ObjectKey", request.objectKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceRegionId)) {
            query.put("ServiceRegionId", request.serviceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetObjectKey)) {
            query.put("TargetObjectKey", request.targetObjectKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestoreOssImage"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestoreOssImageResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use RestoreOssImage to retrieve the original images that were processed by the MaskOssImage operation if the IsAlwaysUpload parameter is set to <code>true</code>.
     * For example, the image <code>aliyun_dsc_desensitization/exampledir/test.png</code> in a bucket is restored and saved as <code>aliyun_dsc_original/exampledir/test.png</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the RestoreOssImage operation to restore desensitized images.</p>
     * 
     * @param request RestoreOssImageRequest
     * @return RestoreOssImageResponse
     */
    public RestoreOssImageResponse restoreOssImage(RestoreOssImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreOssImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>You must authorize and connect to the specified bucket before you call this operation. If the bucket is not authorized, the API call returns the bucket_not_authorized error code.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed the limit, API calls are throttled. This may affect your business. We recommend that you call the operation at a reasonable rate.</p>
     * <h3>Usage notes</h3>
     * <p>You can use the returned task ID to call the DescribeIdentifyTaskStatus operation to check the running status of the task.
     * After the task is complete, call the DescribeOssObjectDetailV2 operation and provide the BucketName, ServiceRegionId, and ObjectKey to view the sensitive data detection results for the object.</p>
     * 
     * <b>summary</b> : 
     * <p>The ScanOssObjectV1 operation creates a scan task to detect sensitive data in a specified object.</p>
     * 
     * @param tmpReq ScanOssObjectV1Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScanOssObjectV1Response
     */
    public ScanOssObjectV1Response scanOssObjectV1WithOptions(ScanOssObjectV1Request tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScanOssObjectV1ShrinkRequest request = new ScanOssObjectV1ShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectKeyList)) {
            request.objectKeyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectKeyList, "ObjectKeyList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKeyListShrink)) {
            query.put("ObjectKeyList", request.objectKeyListShrink);
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
            new TeaPair("action", "ScanOssObjectV1"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanOssObjectV1Response());
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>You must authorize and connect to the specified bucket before you call this operation. If the bucket is not authorized, the API call returns the bucket_not_authorized error code.</p>
     * <h3>QPS limits</h3>
     * <p>The queries per second (QPS) limit for this operation is 10 calls per second for each user. If you exceed the limit, API calls are throttled. This may affect your business. We recommend that you call the operation at a reasonable rate.</p>
     * <h3>Usage notes</h3>
     * <p>You can use the returned task ID to call the DescribeIdentifyTaskStatus operation to check the running status of the task.
     * After the task is complete, call the DescribeOssObjectDetailV2 operation and provide the BucketName, ServiceRegionId, and ObjectKey to view the sensitive data detection results for the object.</p>
     * 
     * <b>summary</b> : 
     * <p>The ScanOssObjectV1 operation creates a scan task to detect sensitive data in a specified object.</p>
     * 
     * @param request ScanOssObjectV1Request
     * @return ScanOssObjectV1Response
     */
    public ScanOssObjectV1Response scanOssObjectV1(ScanOssObjectV1Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.scanOssObjectV1WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation stops a running data masking task. For example, you can call this operation if you no longer need to mask data for a previously configured task.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are throttled. This may affect your business. Ensure that you call this operation within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the StopMaskingProcess operation to stop a data masking task. You can call the ManualTriggerMaskingProcess operation to restart a stopped task using its unique resource ID.</p>
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
     * <p>This operation stops a running data masking task. For example, you can call this operation if you no longer need to mask data for a previously configured task.</p>
     * <h2>QPS limit</h2>
     * <p>The queries per second (QPS) limit for a single user is 10 calls per second. If you exceed this limit, API calls are throttled. This may affect your business. Ensure that you call this operation within the specified limit.</p>
     * 
     * <b>summary</b> : 
     * <p>You can call the StopMaskingProcess operation to stop a data masking task. You can call the ManualTriggerMaskingProcess operation to restart a stopped task using its unique resource ID.</p>
     * 
     * @param request StopMaskingProcessRequest
     * @return StopMaskingProcessResponse
     */
    public StopMaskingProcessResponse stopMaskingProcess(StopMaskingProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopMaskingProcessWithOptions(request, runtime);
    }
}
