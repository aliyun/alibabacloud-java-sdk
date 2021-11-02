// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103;

import com.aliyun.tea.*;
import com.aliyun.sddp20190103.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConfig", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConfigResponse());
    }

    public CreateConfigResponse createConfig(CreateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConfigWithOptions(request, runtime);
    }

    public CreateDataLimitResponse createDataLimitWithOptions(CreateDataLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDataLimit", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDataLimitResponse());
    }

    public CreateDataLimitResponse createDataLimit(CreateDataLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataLimitWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRule", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateScanTaskResponse createScanTaskWithOptions(CreateScanTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScanTask", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScanTaskResponse());
    }

    public CreateScanTaskResponse createScanTask(CreateScanTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScanTaskWithOptions(request, runtime);
    }

    public DeleteDataLimitResponse deleteDataLimitWithOptions(DeleteDataLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDataLimit", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDataLimitResponse());
    }

    public DeleteDataLimitResponse deleteDataLimit(DeleteDataLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDataLimitWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRule", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public DescribeCategoryTemplateRuleListResponse describeCategoryTemplateRuleListWithOptions(DescribeCategoryTemplateRuleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCategoryTemplateRuleList", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCategoryTemplateRuleListResponse());
    }

    public DescribeCategoryTemplateRuleListResponse describeCategoryTemplateRuleList(DescribeCategoryTemplateRuleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCategoryTemplateRuleListWithOptions(request, runtime);
    }

    public DescribeColumnsResponse describeColumnsWithOptions(DescribeColumnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeColumns", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeColumnsResponse());
    }

    public DescribeColumnsResponse describeColumns(DescribeColumnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeColumnsWithOptions(request, runtime);
    }

    public DescribeConfigsResponse describeConfigsWithOptions(DescribeConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConfigs", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeConfigsResponse());
    }

    public DescribeConfigsResponse describeConfigs(DescribeConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConfigsWithOptions(request, runtime);
    }

    public DescribeDataAssetsResponse describeDataAssetsWithOptions(DescribeDataAssetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataAssets", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataAssetsResponse());
    }

    public DescribeDataAssetsResponse describeDataAssets(DescribeDataAssetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataAssetsWithOptions(request, runtime);
    }

    public DescribeDataLimitDetailResponse describeDataLimitDetailWithOptions(DescribeDataLimitDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataLimitDetail", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataLimitDetailResponse());
    }

    public DescribeDataLimitDetailResponse describeDataLimitDetail(DescribeDataLimitDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataLimitDetailWithOptions(request, runtime);
    }

    public DescribeDataLimitSetResponse describeDataLimitSetWithOptions(DescribeDataLimitSetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataLimitSet", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataLimitSetResponse());
    }

    public DescribeDataLimitSetResponse describeDataLimitSet(DescribeDataLimitSetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataLimitSetWithOptions(request, runtime);
    }

    public DescribeDataLimitsResponse describeDataLimitsWithOptions(DescribeDataLimitsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataLimits", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataLimitsResponse());
    }

    public DescribeDataLimitsResponse describeDataLimits(DescribeDataLimitsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataLimitsWithOptions(request, runtime);
    }

    public DescribeDataMaskingRunHistoryResponse describeDataMaskingRunHistoryWithOptions(DescribeDataMaskingRunHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataMaskingRunHistory", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataMaskingRunHistoryResponse());
    }

    public DescribeDataMaskingRunHistoryResponse describeDataMaskingRunHistory(DescribeDataMaskingRunHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataMaskingRunHistoryWithOptions(request, runtime);
    }

    public DescribeDataMaskingTasksResponse describeDataMaskingTasksWithOptions(DescribeDataMaskingTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDataMaskingTasks", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDataMaskingTasksResponse());
    }

    public DescribeDataMaskingTasksResponse describeDataMaskingTasks(DescribeDataMaskingTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDataMaskingTasksWithOptions(request, runtime);
    }

    public DescribeEventDetailResponse describeEventDetailWithOptions(DescribeEventDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEventDetail", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEventDetailResponse());
    }

    public DescribeEventDetailResponse describeEventDetail(DescribeEventDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventDetailWithOptions(request, runtime);
    }

    public DescribeEventTypesResponse describeEventTypesWithOptions(DescribeEventTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEventTypes", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEventTypesResponse());
    }

    public DescribeEventTypesResponse describeEventTypes(DescribeEventTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventTypesWithOptions(request, runtime);
    }

    public DescribeEventsResponse describeEventsWithOptions(DescribeEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEvents", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEventsResponse());
    }

    public DescribeEventsResponse describeEvents(DescribeEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEventsWithOptions(request, runtime);
    }

    public DescribeInstanceSourcesResponse describeInstanceSourcesWithOptions(DescribeInstanceSourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceSources", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceSourcesResponse());
    }

    public DescribeInstanceSourcesResponse describeInstanceSources(DescribeInstanceSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceSourcesWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeOssObjectDetailResponse describeOssObjectDetailWithOptions(DescribeOssObjectDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOssObjectDetail", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOssObjectDetailResponse());
    }

    public DescribeOssObjectDetailResponse describeOssObjectDetail(DescribeOssObjectDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOssObjectDetailWithOptions(request, runtime);
    }

    public DescribeOssObjectsResponse describeOssObjectsWithOptions(DescribeOssObjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOssObjects", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOssObjectsResponse());
    }

    public DescribeOssObjectsResponse describeOssObjects(DescribeOssObjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOssObjectsWithOptions(request, runtime);
    }

    public DescribePackagesResponse describePackagesWithOptions(DescribePackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePackages", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePackagesResponse());
    }

    public DescribePackagesResponse describePackages(DescribePackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePackagesWithOptions(request, runtime);
    }

    public DescribeRiskLevelsResponse describeRiskLevelsWithOptions(DescribeRiskLevelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRiskLevels", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRiskLevelsResponse());
    }

    public DescribeRiskLevelsResponse describeRiskLevels(DescribeRiskLevelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRiskLevelsWithOptions(request, runtime);
    }

    public DescribeRulesResponse describeRulesWithOptions(DescribeRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRules", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRulesResponse());
    }

    public DescribeRulesResponse describeRules(DescribeRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRulesWithOptions(request, runtime);
    }

    public DescribeTablesResponse describeTablesWithOptions(DescribeTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTables", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTablesResponse());
    }

    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    public DescribeUserStatusResponse describeUserStatusWithOptions(DescribeUserStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserStatus", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserStatusResponse());
    }

    public DescribeUserStatusResponse describeUserStatus(DescribeUserStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserStatusWithOptions(request, runtime);
    }

    public DisableUserConfigResponse disableUserConfigWithOptions(DisableUserConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableUserConfig", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new DisableUserConfigResponse());
    }

    public DisableUserConfigResponse disableUserConfig(DisableUserConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableUserConfigWithOptions(request, runtime);
    }

    public ExecDatamaskResponse execDatamaskWithOptions(ExecDatamaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecDatamask", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new ExecDatamaskResponse());
    }

    public ExecDatamaskResponse execDatamask(ExecDatamaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.execDatamaskWithOptions(request, runtime);
    }

    public ManualTriggerMaskingProcessResponse manualTriggerMaskingProcessWithOptions(ManualTriggerMaskingProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ManualTriggerMaskingProcess", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new ManualTriggerMaskingProcessResponse());
    }

    public ManualTriggerMaskingProcessResponse manualTriggerMaskingProcess(ManualTriggerMaskingProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.manualTriggerMaskingProcessWithOptions(request, runtime);
    }

    public ModifyDataLimitResponse modifyDataLimitWithOptions(ModifyDataLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDataLimit", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDataLimitResponse());
    }

    public ModifyDataLimitResponse modifyDataLimit(ModifyDataLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDataLimitWithOptions(request, runtime);
    }

    public ModifyDefaultLevelResponse modifyDefaultLevelWithOptions(ModifyDefaultLevelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDefaultLevel", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDefaultLevelResponse());
    }

    public ModifyDefaultLevelResponse modifyDefaultLevel(ModifyDefaultLevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDefaultLevelWithOptions(request, runtime);
    }

    public ModifyEventStatusResponse modifyEventStatusWithOptions(ModifyEventStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyEventStatus", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyEventStatusResponse());
    }

    public ModifyEventStatusResponse modifyEventStatus(ModifyEventStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEventStatusWithOptions(request, runtime);
    }

    public ModifyEventTypeStatusResponse modifyEventTypeStatusWithOptions(ModifyEventTypeStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyEventTypeStatus", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyEventTypeStatusResponse());
    }

    public ModifyEventTypeStatusResponse modifyEventTypeStatus(ModifyEventTypeStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEventTypeStatusWithOptions(request, runtime);
    }

    public ModifyRuleResponse modifyRuleWithOptions(ModifyRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRule", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRuleResponse());
    }

    public ModifyRuleResponse modifyRule(ModifyRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRuleWithOptions(request, runtime);
    }

    public ModifyRuleStatusResponse modifyRuleStatusWithOptions(ModifyRuleStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRuleStatus", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRuleStatusResponse());
    }

    public ModifyRuleStatusResponse modifyRuleStatus(ModifyRuleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRuleStatusWithOptions(request, runtime);
    }

    public StopMaskingProcessResponse stopMaskingProcessWithOptions(StopMaskingProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopMaskingProcess", "2019-01-03", "HTTPS", "POST", "AK", "json", req, runtime), new StopMaskingProcessResponse());
    }

    public StopMaskingProcessResponse stopMaskingProcess(StopMaskingProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopMaskingProcessWithOptions(request, runtime);
    }
}
