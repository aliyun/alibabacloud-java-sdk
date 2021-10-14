// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103;

import com.aliyun.tea.*;
import com.aliyun.sddp20190103.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public CreateConfigResponse createConfigWithOptions(CreateConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Code", request.code);
        query.put("Description", request.description);
        query.put("Lang", request.lang);
        query.put("Value", request.value);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfig"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigResponse());
    }

    public CreateConfigResponse createConfig(CreateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConfigWithOptions(request, runtime);
    }

    public CreateDataLimitResponse createDataLimitWithOptions(CreateDataLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuditStatus", request.auditStatus);
        query.put("AutoScan", request.autoScan);
        query.put("EngineType", request.engineType);
        query.put("EventStatus", request.eventStatus);
        query.put("Lang", request.lang);
        query.put("LogStoreDay", request.logStoreDay);
        query.put("OcrStatus", request.ocrStatus);
        query.put("ParentId", request.parentId);
        query.put("Password", request.password);
        query.put("Port", request.port);
        query.put("ResourceType", request.resourceType);
        query.put("ServiceRegionId", request.serviceRegionId);
        query.put("UserName", request.userName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataLimit"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataLimitResponse());
    }

    public CreateDataLimitResponse createDataLimit(CreateDataLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataLimitWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Category", request.category);
        query.put("Content", request.content);
        query.put("ContentCategory", request.contentCategory);
        query.put("Description", request.description);
        query.put("Lang", request.lang);
        query.put("Name", request.name);
        query.put("ProductCode", request.productCode);
        query.put("ProductId", request.productId);
        query.put("RiskLevelId", request.riskLevelId);
        query.put("RuleType", request.ruleType);
        query.put("StatExpress", request.statExpress);
        query.put("Status", request.status);
        query.put("Target", request.target);
        query.put("WarnLevel", request.warnLevel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateScanTaskResponse createScanTaskWithOptions(CreateScanTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataLimitId", request.dataLimitId);
        query.put("IntervalDay", request.intervalDay);
        query.put("OssScanPath", request.ossScanPath);
        query.put("ResourceType", request.resourceType);
        query.put("RunHour", request.runHour);
        query.put("RunMinute", request.runMinute);
        query.put("ScanRange", request.scanRange);
        query.put("ScanRangeContent", request.scanRangeContent);
        query.put("TaskName", request.taskName);
        query.put("TaskUserName", request.taskUserName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScanTask"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScanTaskResponse());
    }

    public CreateScanTaskResponse createScanTask(CreateScanTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScanTaskWithOptions(request, runtime);
    }

    public DeleteDataLimitResponse deleteDataLimitWithOptions(DeleteDataLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataLimit"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataLimitResponse());
    }

    public DeleteDataLimitResponse deleteDataLimit(DeleteDataLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDataLimitWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public DescribeColumnsResponse describeColumnsWithOptions(DescribeColumnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceName", request.instanceName);
        query.put("Lang", request.lang);
        query.put("Name", request.name);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("RiskLevelId", request.riskLevelId);
        query.put("RuleId", request.ruleId);
        query.put("RuleName", request.ruleName);
        query.put("SensLevelName", request.sensLevelName);
        query.put("TableId", request.tableId);
        query.put("TableName", request.tableName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeColumns"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeColumnsResponse());
    }

    public DescribeColumnsResponse describeColumns(DescribeColumnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeColumnsWithOptions(request, runtime);
    }

    public DescribeConfigsResponse describeConfigsWithOptions(DescribeConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConfigs"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConfigsResponse());
    }

    public DescribeConfigsResponse describeConfigs(DescribeConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConfigsWithOptions(request, runtime);
    }

    public DescribeDataAssetsResponse describeDataAssetsWithOptions(DescribeDataAssetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("Lang", request.lang);
        query.put("Name", request.name);
        query.put("PageSize", request.pageSize);
        query.put("RangeId", request.rangeId);
        query.put("RiskLevels", request.riskLevels);
        query.put("RuleId", request.ruleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataAssets"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataAssetsResponse());
    }

    public DescribeDataAssetsResponse describeDataAssets(DescribeDataAssetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataAssetsWithOptions(request, runtime);
    }

    public DescribeDataLimitDetailResponse describeDataLimitDetailWithOptions(DescribeDataLimitDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("Lang", request.lang);
        query.put("NetworkType", request.networkType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataLimitDetail"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataLimitDetailResponse());
    }

    public DescribeDataLimitDetailResponse describeDataLimitDetail(DescribeDataLimitDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataLimitDetailWithOptions(request, runtime);
    }

    public DescribeDataLimitSetResponse describeDataLimitSetWithOptions(DescribeDataLimitSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("ParentId", request.parentId);
        query.put("ResourceType", request.resourceType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataLimitSet"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataLimitSetResponse());
    }

    public DescribeDataLimitSetResponse describeDataLimitSet(DescribeDataLimitSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataLimitSetWithOptions(request, runtime);
    }

    public DescribeDataLimitsResponse describeDataLimitsWithOptions(DescribeDataLimitsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuditStatus", request.auditStatus);
        query.put("CheckStatus", request.checkStatus);
        query.put("CurrentPage", request.currentPage);
        query.put("DatamaskStatus", request.datamaskStatus);
        query.put("Enable", request.enable);
        query.put("EndTime", request.endTime);
        query.put("EngineType", request.engineType);
        query.put("Lang", request.lang);
        query.put("PageSize", request.pageSize);
        query.put("ParentId", request.parentId);
        query.put("ResourceType", request.resourceType);
        query.put("ServiceRegionId", request.serviceRegionId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataLimits"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataLimitsResponse());
    }

    public DescribeDataLimitsResponse describeDataLimits(DescribeDataLimitsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataLimitsWithOptions(request, runtime);
    }

    public DescribeDataMaskingRunHistoryResponse describeDataMaskingRunHistoryWithOptions(DescribeDataMaskingRunHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("DstType", request.dstType);
        query.put("EndTime", request.endTime);
        query.put("Lang", request.lang);
        query.put("MainProcessId", request.mainProcessId);
        query.put("PageSize", request.pageSize);
        query.put("SrcTableName", request.srcTableName);
        query.put("SrcType", request.srcType);
        query.put("StartTime", request.startTime);
        query.put("Status", request.status);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataMaskingRunHistory"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataMaskingRunHistoryResponse());
    }

    public DescribeDataMaskingRunHistoryResponse describeDataMaskingRunHistory(DescribeDataMaskingRunHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataMaskingRunHistoryWithOptions(request, runtime);
    }

    public DescribeDataMaskingTasksResponse describeDataMaskingTasksWithOptions(DescribeDataMaskingTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("DstType", request.dstType);
        query.put("EndTime", request.endTime);
        query.put("Lang", request.lang);
        query.put("PageSize", request.pageSize);
        query.put("SearchKey", request.searchKey);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataMaskingTasks"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataMaskingTasksResponse());
    }

    public DescribeDataMaskingTasksResponse describeDataMaskingTasks(DescribeDataMaskingTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataMaskingTasksWithOptions(request, runtime);
    }

    public DescribeEventDetailResponse describeEventDetailWithOptions(DescribeEventDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventDetail"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventDetailResponse());
    }

    public DescribeEventDetailResponse describeEventDetail(DescribeEventDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventDetailWithOptions(request, runtime);
    }

    public DescribeEventTypesResponse describeEventTypesWithOptions(DescribeEventTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("ParentTypeId", request.parentTypeId);
        query.put("ResourceId", request.resourceId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventTypes"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventTypesResponse());
    }

    public DescribeEventTypesResponse describeEventTypes(DescribeEventTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventTypesWithOptions(request, runtime);
    }

    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("DealUserId", request.dealUserId);
        query.put("EndTime", request.endTime);
        query.put("Id", request.id);
        query.put("InstanceName", request.instanceName);
        query.put("Lang", request.lang);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("StartTime", request.startTime);
        query.put("Status", request.status);
        query.put("SubTypeCode", request.subTypeCode);
        query.put("TargetProductCode", request.targetProductCode);
        query.put("TypeCode", request.typeCode);
        query.put("UserId", request.userId);
        query.put("UserName", request.userName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEvents"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventsResponse());
    }

    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventsWithOptions(request, runtime);
    }

    public DescribeInstanceSourcesResponse describeInstanceSourcesWithOptions(DescribeInstanceSourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("EngineType", request.engineType);
        query.put("InstanceId", request.instanceId);
        query.put("Lang", request.lang);
        query.put("PageSize", request.pageSize);
        query.put("ProductId", request.productId);
        query.put("ServiceRegionId", request.serviceRegionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSources"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSourcesResponse());
    }

    public DescribeInstanceSourcesResponse describeInstanceSources(DescribeInstanceSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSourcesWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("FeatureType", request.featureType);
        query.put("Lang", request.lang);
        query.put("Name", request.name);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("ProductId", request.productId);
        query.put("RiskLevelId", request.riskLevelId);
        query.put("RuleId", request.ruleId);
        query.put("ServiceRegionId", request.serviceRegionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeOssObjectDetailResponse describeOssObjectDetailWithOptions(DescribeOssObjectDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssObjectDetail"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssObjectDetailResponse());
    }

    public DescribeOssObjectDetailResponse describeOssObjectDetail(DescribeOssObjectDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOssObjectDetailWithOptions(request, runtime);
    }

    public DescribeOssObjectsResponse describeOssObjectsWithOptions(DescribeOssObjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("InstanceId", request.instanceId);
        query.put("Lang", request.lang);
        query.put("LastScanTimeEnd", request.lastScanTimeEnd);
        query.put("LastScanTimeStart", request.lastScanTimeStart);
        query.put("Name", request.name);
        query.put("PageSize", request.pageSize);
        query.put("RiskLevelId", request.riskLevelId);
        query.put("RuleId", request.ruleId);
        query.put("ServiceRegionId", request.serviceRegionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssObjects"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssObjectsResponse());
    }

    public DescribeOssObjectsResponse describeOssObjects(DescribeOssObjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOssObjectsWithOptions(request, runtime);
    }

    public DescribePackagesResponse describePackagesWithOptions(DescribePackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("InstanceId", request.instanceId);
        query.put("Lang", request.lang);
        query.put("Name", request.name);
        query.put("PageSize", request.pageSize);
        query.put("ProductId", request.productId);
        query.put("RiskLevelId", request.riskLevelId);
        query.put("RuleId", request.ruleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePackages"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePackagesResponse());
    }

    public DescribePackagesResponse describePackages(DescribePackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePackagesWithOptions(request, runtime);
    }

    public DescribeRiskLevelsResponse describeRiskLevelsWithOptions(DescribeRiskLevelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRiskLevels"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRiskLevelsResponse());
    }

    public DescribeRiskLevelsResponse describeRiskLevels(DescribeRiskLevelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRiskLevelsWithOptions(request, runtime);
    }

    public DescribeRulesResponse describeRulesWithOptions(DescribeRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Category", request.category);
        query.put("ContentCategory", request.contentCategory);
        query.put("CurrentPage", request.currentPage);
        query.put("CustomType", request.customType);
        query.put("GroupId", request.groupId);
        query.put("KeywordCompatible", request.keywordCompatible);
        query.put("Lang", request.lang);
        query.put("Name", request.name);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("ProductId", request.productId);
        query.put("RiskLevelId", request.riskLevelId);
        query.put("RuleType", request.ruleType);
        query.put("Status", request.status);
        query.put("WarnLevel", request.warnLevel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRules"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRulesResponse());
    }

    public DescribeRulesResponse describeRules(DescribeRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRulesWithOptions(request, runtime);
    }

    public DescribeTablesResponse describeTablesWithOptions(DescribeTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CurrentPage", request.currentPage);
        query.put("InstanceId", request.instanceId);
        query.put("Lang", request.lang);
        query.put("Name", request.name);
        query.put("PackageId", request.packageId);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("ProductId", request.productId);
        query.put("RiskLevelId", request.riskLevelId);
        query.put("RuleId", request.ruleId);
        query.put("ServiceRegionId", request.serviceRegionId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTables"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTablesResponse());
    }

    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    public DescribeUserStatusResponse describeUserStatusWithOptions(DescribeUserStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserStatus"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserStatusResponse());
    }

    public DescribeUserStatusResponse describeUserStatus(DescribeUserStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserStatusWithOptions(request, runtime);
    }

    public DisableUserConfigResponse disableUserConfigWithOptions(DisableUserConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Code", request.code);
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableUserConfig"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableUserConfigResponse());
    }

    public DisableUserConfigResponse disableUserConfig(DisableUserConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableUserConfigWithOptions(request, runtime);
    }

    public ExecDatamaskResponse execDatamaskWithOptions(ExecDatamaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Data", request.data);
        query.put("TemplateId", request.templateId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecDatamask"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecDatamaskResponse());
    }

    public ExecDatamaskResponse execDatamask(ExecDatamaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.execDatamaskWithOptions(request, runtime);
    }

    public ManualTriggerMaskingProcessResponse manualTriggerMaskingProcessWithOptions(ManualTriggerMaskingProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ManualTriggerMaskingProcess"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ManualTriggerMaskingProcessResponse());
    }

    public ManualTriggerMaskingProcessResponse manualTriggerMaskingProcess(ManualTriggerMaskingProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.manualTriggerMaskingProcessWithOptions(request, runtime);
    }

    public ModifyDataLimitResponse modifyDataLimitWithOptions(ModifyDataLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuditStatus", request.auditStatus);
        query.put("AutoScan", request.autoScan);
        query.put("EngineType", request.engineType);
        query.put("Id", request.id);
        query.put("Lang", request.lang);
        query.put("LogStoreDay", request.logStoreDay);
        query.put("ModifyPassword", request.modifyPassword);
        query.put("Password", request.password);
        query.put("Port", request.port);
        query.put("ResourceType", request.resourceType);
        query.put("ServiceRegionId", request.serviceRegionId);
        query.put("UserName", request.userName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataLimit"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataLimitResponse());
    }

    public ModifyDataLimitResponse modifyDataLimit(ModifyDataLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDataLimitWithOptions(request, runtime);
    }

    public ModifyDefaultLevelResponse modifyDefaultLevelWithOptions(ModifyDefaultLevelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DefaultId", request.defaultId);
        query.put("Lang", request.lang);
        query.put("SensitiveIds", request.sensitiveIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDefaultLevel"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDefaultLevelResponse());
    }

    public ModifyDefaultLevelResponse modifyDefaultLevel(ModifyDefaultLevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDefaultLevelWithOptions(request, runtime);
    }

    public ModifyEventStatusResponse modifyEventStatusWithOptions(ModifyEventStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Backed", request.backed);
        query.put("DealReason", request.dealReason);
        query.put("Id", request.id);
        query.put("Lang", request.lang);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEventStatus"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEventStatusResponse());
    }

    public ModifyEventStatusResponse modifyEventStatus(ModifyEventStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEventStatusWithOptions(request, runtime);
    }

    public ModifyEventTypeStatusResponse modifyEventTypeStatusWithOptions(ModifyEventTypeStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Lang", request.lang);
        query.put("SubTypeIds", request.subTypeIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEventTypeStatus"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEventTypeStatusResponse());
    }

    public ModifyEventTypeStatusResponse modifyEventTypeStatus(ModifyEventTypeStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEventTypeStatusWithOptions(request, runtime);
    }

    public ModifyRuleResponse modifyRuleWithOptions(ModifyRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Category", request.category);
        query.put("Content", request.content);
        query.put("CustomType", request.customType);
        query.put("Id", request.id);
        query.put("Lang", request.lang);
        query.put("Name", request.name);
        query.put("ProductCode", request.productCode);
        query.put("ProductId", request.productId);
        query.put("RiskLevelId", request.riskLevelId);
        query.put("RuleType", request.ruleType);
        query.put("StatExpress", request.statExpress);
        query.put("WarnLevel", request.warnLevel);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRule"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRuleResponse());
    }

    public ModifyRuleResponse modifyRule(ModifyRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRuleWithOptions(request, runtime);
    }

    public ModifyRuleStatusResponse modifyRuleStatusWithOptions(ModifyRuleStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("Ids", request.ids);
        query.put("Lang", request.lang);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRuleStatus"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyRuleStatusResponse());
    }

    public ModifyRuleStatusResponse modifyRuleStatus(ModifyRuleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRuleStatusWithOptions(request, runtime);
    }

    public StopMaskingProcessResponse stopMaskingProcessWithOptions(StopMaskingProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Id", request.id);
        query.put("Lang", request.lang);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMaskingProcess"),
            new TeaPair("version", "2019-01-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMaskingProcessResponse());
    }

    public StopMaskingProcessResponse stopMaskingProcess(StopMaskingProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopMaskingProcessWithOptions(request, runtime);
    }
}
