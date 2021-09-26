// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320;

import com.aliyun.tea.*;
import com.aliyun.yundun_dbaudit20180320.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("yundun-dbaudit", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddLogMaskConfigResponse addLogMaskConfigWithOptions(AddLogMaskConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddLogMaskConfig", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new AddLogMaskConfigResponse());
    }

    public AddLogMaskConfigResponse addLogMaskConfig(AddLogMaskConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLogMaskConfigWithOptions(request, runtime);
    }

    public AssociateDbToRuleResponse associateDbToRuleWithOptions(AssociateDbToRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateDbToRule", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateDbToRuleResponse());
    }

    public AssociateDbToRuleResponse associateDbToRule(AssociateDbToRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateDbToRuleWithOptions(request, runtime);
    }

    public AssociateRuleToDbResponse associateRuleToDbWithOptions(AssociateRuleToDbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AssociateRuleToDb", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new AssociateRuleToDbResponse());
    }

    public AssociateRuleToDbResponse associateRuleToDb(AssociateRuleToDbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.associateRuleToDbWithOptions(request, runtime);
    }

    public ChangeAgentStatusResponse changeAgentStatusWithOptions(ChangeAgentStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeAgentStatus", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeAgentStatusResponse());
    }

    public ChangeAgentStatusResponse changeAgentStatus(ChangeAgentStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeAgentStatusWithOptions(request, runtime);
    }

    public ChangeLogMaskConfigStateResponse changeLogMaskConfigStateWithOptions(ChangeLogMaskConfigStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeLogMaskConfigState", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeLogMaskConfigStateResponse());
    }

    public ChangeLogMaskConfigStateResponse changeLogMaskConfigState(ChangeLogMaskConfigStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeLogMaskConfigStateWithOptions(request, runtime);
    }

    public ChangeRulePriorityResponse changeRulePriorityWithOptions(ChangeRulePriorityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeRulePriority", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeRulePriorityResponse());
    }

    public ChangeRulePriorityResponse changeRulePriority(ChangeRulePriorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeRulePriorityWithOptions(request, runtime);
    }

    public ChangeRuleStatusResponse changeRuleStatusWithOptions(ChangeRuleStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeRuleStatus", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeRuleStatusResponse());
    }

    public ChangeRuleStatusResponse changeRuleStatus(ChangeRuleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeRuleStatusWithOptions(request, runtime);
    }

    public CheckMailRegisteredResponse checkMailRegisteredWithOptions(CheckMailRegisteredRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckMailRegistered", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CheckMailRegisteredResponse());
    }

    public CheckMailRegisteredResponse checkMailRegistered(CheckMailRegisteredRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkMailRegisteredWithOptions(request, runtime);
    }

    public ClearAgentRecordsResponse clearAgentRecordsWithOptions(ClearAgentRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClearAgentRecords", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ClearAgentRecordsResponse());
    }

    public ClearAgentRecordsResponse clearAgentRecords(ClearAgentRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearAgentRecordsWithOptions(request, runtime);
    }

    public ConfigInstanceNetworkResponse configInstanceNetworkWithOptions(ConfigInstanceNetworkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigInstanceNetwork", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigInstanceNetworkResponse());
    }

    public ConfigInstanceNetworkResponse configInstanceNetwork(ConfigInstanceNetworkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configInstanceNetworkWithOptions(request, runtime);
    }

    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDataSource", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDataSourceResponse());
    }

    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataSourceWithOptions(request, runtime);
    }

    public CreateGradeProtectionReportResponse createGradeProtectionReportWithOptions(CreateGradeProtectionReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGradeProtectionReport", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGradeProtectionReportResponse());
    }

    public CreateGradeProtectionReportResponse createGradeProtectionReport(CreateGradeProtectionReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGradeProtectionReportWithOptions(request, runtime);
    }

    public CreateIntegratedReportResponse createIntegratedReportWithOptions(CreateIntegratedReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIntegratedReport", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIntegratedReportResponse());
    }

    public CreateIntegratedReportResponse createIntegratedReport(CreateIntegratedReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIntegratedReportWithOptions(request, runtime);
    }

    public CreateLogAlarmTaskResponse createLogAlarmTaskWithOptions(CreateLogAlarmTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLogAlarmTask", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLogAlarmTaskResponse());
    }

    public CreateLogAlarmTaskResponse createLogAlarmTask(CreateLogAlarmTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLogAlarmTaskWithOptions(request, runtime);
    }

    public CreatePCIReportResponse createPCIReportWithOptions(CreatePCIReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePCIReport", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePCIReportResponse());
    }

    public CreatePCIReportResponse createPCIReport(CreatePCIReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPCIReportWithOptions(request, runtime);
    }

    public CreateReportPushTaskResponse createReportPushTaskWithOptions(CreateReportPushTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateReportPushTask", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateReportPushTaskResponse());
    }

    public CreateReportPushTaskResponse createReportPushTask(CreateReportPushTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createReportPushTaskWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRule", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateRuleGroupResponse createRuleGroupWithOptions(CreateRuleGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRuleGroup", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRuleGroupResponse());
    }

    public CreateRuleGroupResponse createRuleGroup(CreateRuleGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleGroupWithOptions(request, runtime);
    }

    public CreateSOXReportResponse createSOXReportWithOptions(CreateSOXReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSOXReport", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSOXReportResponse());
    }

    public CreateSOXReportResponse createSOXReport(CreateSOXReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSOXReportWithOptions(request, runtime);
    }

    public CreateSqlRuleResponse createSqlRuleWithOptions(CreateSqlRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSqlRule", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSqlRuleResponse());
    }

    public CreateSqlRuleResponse createSqlRule(CreateSqlRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSqlRuleWithOptions(request, runtime);
    }

    public CreateSystemAlarmTaskResponse createSystemAlarmTaskWithOptions(CreateSystemAlarmTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSystemAlarmTask", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSystemAlarmTaskResponse());
    }

    public CreateSystemAlarmTaskResponse createSystemAlarmTask(CreateSystemAlarmTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSystemAlarmTaskWithOptions(request, runtime);
    }

    public DeleteAlarmTaskResponse deleteAlarmTaskWithOptions(DeleteAlarmTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlarmTask", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlarmTaskResponse());
    }

    public DeleteAlarmTaskResponse deleteAlarmTask(DeleteAlarmTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlarmTaskWithOptions(request, runtime);
    }

    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDataSource", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDataSourceResponse());
    }

    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDataSourceWithOptions(request, runtime);
    }

    public DeleteReportPushTaskResponse deleteReportPushTaskWithOptions(DeleteReportPushTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteReportPushTask", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteReportPushTaskResponse());
    }

    public DeleteReportPushTaskResponse deleteReportPushTask(DeleteReportPushTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteReportPushTaskWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRule", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public DeleteRuleGroupResponse deleteRuleGroupWithOptions(DeleteRuleGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRuleGroup", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRuleGroupResponse());
    }

    public DeleteRuleGroupResponse deleteRuleGroup(DeleteRuleGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleGroupWithOptions(request, runtime);
    }

    public DeregisterTemplatesFromRuleResponse deregisterTemplatesFromRuleWithOptions(DeregisterTemplatesFromRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeregisterTemplatesFromRule", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DeregisterTemplatesFromRuleResponse());
    }

    public DeregisterTemplatesFromRuleResponse deregisterTemplatesFromRule(DeregisterTemplatesFromRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deregisterTemplatesFromRuleWithOptions(request, runtime);
    }

    public DescribeInstanceAttributeResponse describeInstanceAttributeWithOptions(DescribeInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAttribute", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAttributeResponse());
    }

    public DescribeInstanceAttributeResponse describeInstanceAttribute(DescribeInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAttributeWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstances", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstancesResponse());
    }

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeLoginTicketResponse describeLoginTicketWithOptions(DescribeLoginTicketRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLoginTicket", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLoginTicketResponse());
    }

    public DescribeLoginTicketResponse describeLoginTicket(DescribeLoginTicketRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLoginTicketWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeSyncInfoResponse describeSyncInfoWithOptions(DescribeSyncInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSyncInfo", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSyncInfoResponse());
    }

    public DescribeSyncInfoResponse describeSyncInfo(DescribeSyncInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSyncInfoWithOptions(request, runtime);
    }

    public DisableLogMaskConfigsResponse disableLogMaskConfigsWithOptions(DisableLogMaskConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableLogMaskConfigs", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DisableLogMaskConfigsResponse());
    }

    public DisableLogMaskConfigsResponse disableLogMaskConfigs(DisableLogMaskConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableLogMaskConfigsWithOptions(request, runtime);
    }

    public DissociateRulesFromDbResponse dissociateRulesFromDbWithOptions(DissociateRulesFromDbRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DissociateRulesFromDb", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DissociateRulesFromDbResponse());
    }

    public DissociateRulesFromDbResponse dissociateRulesFromDb(DissociateRulesFromDbRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateRulesFromDbWithOptions(request, runtime);
    }

    public DissociateTemplatesFromRuleResponse dissociateTemplatesFromRuleWithOptions(DissociateTemplatesFromRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DissociateTemplatesFromRule", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new DissociateTemplatesFromRuleResponse());
    }

    public DissociateTemplatesFromRuleResponse dissociateTemplatesFromRule(DissociateTemplatesFromRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dissociateTemplatesFromRuleWithOptions(request, runtime);
    }

    public EditLogMaskConfigResponse editLogMaskConfigWithOptions(EditLogMaskConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EditLogMaskConfig", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new EditLogMaskConfigResponse());
    }

    public EditLogMaskConfigResponse editLogMaskConfig(EditLogMaskConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editLogMaskConfigWithOptions(request, runtime);
    }

    public EnableLogMaskConfigsResponse enableLogMaskConfigsWithOptions(EnableLogMaskConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableLogMaskConfigs", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new EnableLogMaskConfigsResponse());
    }

    public EnableLogMaskConfigsResponse enableLogMaskConfigs(EnableLogMaskConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableLogMaskConfigsWithOptions(request, runtime);
    }

    public GetAgentFileUrlResponse getAgentFileUrlWithOptions(GetAgentFileUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgentFileUrl", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetAgentFileUrlResponse());
    }

    public GetAgentFileUrlResponse getAgentFileUrl(GetAgentFileUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentFileUrlWithOptions(request, runtime);
    }

    public GetAgentListResponse getAgentListWithOptions(GetAgentListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgentList", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetAgentListResponse());
    }

    public GetAgentListResponse getAgentList(GetAgentListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentListWithOptions(request, runtime);
    }

    public GetAppointOperationResponse getAppointOperationWithOptions(GetAppointOperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAppointOperation", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetAppointOperationResponse());
    }

    public GetAppointOperationResponse getAppointOperation(GetAppointOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppointOperationWithOptions(request, runtime);
    }

    public GetAuditCountResponse getAuditCountWithOptions(GetAuditCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuditCount", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuditCountResponse());
    }

    public GetAuditCountResponse getAuditCount(GetAuditCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuditCountWithOptions(request, runtime);
    }

    public GetAuditCountDistributionResponse getAuditCountDistributionWithOptions(GetAuditCountDistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAuditCountDistribution", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetAuditCountDistributionResponse());
    }

    public GetAuditCountDistributionResponse getAuditCountDistribution(GetAuditCountDistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAuditCountDistributionWithOptions(request, runtime);
    }

    public GetBaseTemplateListResponse getBaseTemplateListWithOptions(GetBaseTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBaseTemplateList", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetBaseTemplateListResponse());
    }

    public GetBaseTemplateListResponse getBaseTemplateList(GetBaseTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBaseTemplateListWithOptions(request, runtime);
    }

    public GetDasUsageResponse getDasUsageWithOptions(GetDasUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDasUsage", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetDasUsageResponse());
    }

    public GetDasUsageResponse getDasUsage(GetDasUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDasUsageWithOptions(request, runtime);
    }

    public GetDBAuditCountListResponse getDBAuditCountListWithOptions(GetDBAuditCountListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDBAuditCountList", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetDBAuditCountListResponse());
    }

    public GetDBAuditCountListResponse getDBAuditCountList(GetDBAuditCountListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDBAuditCountListWithOptions(request, runtime);
    }

    public GetGroupDetailResponse getGroupDetailWithOptions(GetGroupDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGroupDetail", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetGroupDetailResponse());
    }

    public GetGroupDetailResponse getGroupDetail(GetGroupDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGroupDetailWithOptions(request, runtime);
    }

    public GetLicenseResponse getLicenseWithOptions(GetLicenseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLicense", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetLicenseResponse());
    }

    public GetLicenseResponse getLicense(GetLicenseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLicenseWithOptions(request, runtime);
    }

    public GetLogDetailResponse getLogDetailWithOptions(GetLogDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogDetail", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetLogDetailResponse());
    }

    public GetLogDetailResponse getLogDetail(GetLogDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogDetailWithOptions(request, runtime);
    }

    public GetLogListResponse getLogListWithOptions(GetLogListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogList", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetLogListResponse());
    }

    public GetLogListResponse getLogList(GetLogListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogListWithOptions(request, runtime);
    }

    public GetLogMaskConfigsResponse getLogMaskConfigsWithOptions(GetLogMaskConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogMaskConfigs", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetLogMaskConfigsResponse());
    }

    public GetLogMaskConfigsResponse getLogMaskConfigs(GetLogMaskConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogMaskConfigsWithOptions(request, runtime);
    }

    public GetLogQueryConditionResponse getLogQueryConditionWithOptions(GetLogQueryConditionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogQueryCondition", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetLogQueryConditionResponse());
    }

    public GetLogQueryConditionResponse getLogQueryCondition(GetLogQueryConditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogQueryConditionWithOptions(request, runtime);
    }

    public GetLogStatisticsResponse getLogStatisticsWithOptions(GetLogStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogStatistics", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetLogStatisticsResponse());
    }

    public GetLogStatisticsResponse getLogStatistics(GetLogStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogStatisticsWithOptions(request, runtime);
    }

    public GetLogTopDistributionResponse getLogTopDistributionWithOptions(GetLogTopDistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogTopDistribution", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetLogTopDistributionResponse());
    }

    public GetLogTopDistributionResponse getLogTopDistribution(GetLogTopDistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogTopDistributionWithOptions(request, runtime);
    }

    public GetLogTopStatisticsResponse getLogTopStatisticsWithOptions(GetLogTopStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogTopStatistics", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetLogTopStatisticsResponse());
    }

    public GetLogTopStatisticsResponse getLogTopStatistics(GetLogTopStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogTopStatisticsWithOptions(request, runtime);
    }

    public GetLogTypeDistributionResponse getLogTypeDistributionWithOptions(GetLogTypeDistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogTypeDistribution", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetLogTypeDistributionResponse());
    }

    public GetLogTypeDistributionResponse getLogTypeDistribution(GetLogTypeDistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogTypeDistributionWithOptions(request, runtime);
    }

    public GetNewSqlTemplateListResponse getNewSqlTemplateListWithOptions(GetNewSqlTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNewSqlTemplateList", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetNewSqlTemplateListResponse());
    }

    public GetNewSqlTemplateListResponse getNewSqlTemplateList(GetNewSqlTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNewSqlTemplateListWithOptions(request, runtime);
    }

    public GetReportFileUrlResponse getReportFileUrlWithOptions(GetReportFileUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetReportFileUrl", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetReportFileUrlResponse());
    }

    public GetReportFileUrlResponse getReportFileUrl(GetReportFileUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getReportFileUrlWithOptions(request, runtime);
    }

    public GetRiskLevelDistributionResponse getRiskLevelDistributionWithOptions(GetRiskLevelDistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRiskLevelDistribution", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetRiskLevelDistributionResponse());
    }

    public GetRiskLevelDistributionResponse getRiskLevelDistribution(GetRiskLevelDistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRiskLevelDistributionWithOptions(request, runtime);
    }

    public GetRiskStatisticsResponse getRiskStatisticsWithOptions(GetRiskStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRiskStatistics", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetRiskStatisticsResponse());
    }

    public GetRiskStatisticsResponse getRiskStatistics(GetRiskStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRiskStatisticsWithOptions(request, runtime);
    }

    public GetRuleDetailResponse getRuleDetailWithOptions(GetRuleDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRuleDetail", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetRuleDetailResponse());
    }

    public GetRuleDetailResponse getRuleDetail(GetRuleDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleDetailWithOptions(request, runtime);
    }

    public GetRuleGroupNameResponse getRuleGroupNameWithOptions(GetRuleGroupNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRuleGroupName", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetRuleGroupNameResponse());
    }

    public GetRuleGroupNameResponse getRuleGroupName(GetRuleGroupNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleGroupNameWithOptions(request, runtime);
    }

    public GetSessionDetailResponse getSessionDetailWithOptions(GetSessionDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSessionDetail", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetSessionDetailResponse());
    }

    public GetSessionDetailResponse getSessionDetail(GetSessionDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSessionDetailWithOptions(request, runtime);
    }

    public GetSessionDistributionResponse getSessionDistributionWithOptions(GetSessionDistributionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSessionDistribution", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetSessionDistributionResponse());
    }

    public GetSessionDistributionResponse getSessionDistribution(GetSessionDistributionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSessionDistributionWithOptions(request, runtime);
    }

    public GetSessionListResponse getSessionListWithOptions(GetSessionListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSessionList", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetSessionListResponse());
    }

    public GetSessionListResponse getSessionList(GetSessionListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSessionListWithOptions(request, runtime);
    }

    public GetSessionQueryConditionResponse getSessionQueryConditionWithOptions(GetSessionQueryConditionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSessionQueryCondition", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetSessionQueryConditionResponse());
    }

    public GetSessionQueryConditionResponse getSessionQueryCondition(GetSessionQueryConditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSessionQueryConditionWithOptions(request, runtime);
    }

    public GetSqlTemplateListResponse getSqlTemplateListWithOptions(GetSqlTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSqlTemplateList", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetSqlTemplateListResponse());
    }

    public GetSqlTemplateListResponse getSqlTemplateList(GetSqlTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSqlTemplateListWithOptions(request, runtime);
    }

    public GetTopSqlTemplateListResponse getTopSqlTemplateListWithOptions(GetTopSqlTemplateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTopSqlTemplateList", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GetTopSqlTemplateListResponse());
    }

    public GetTopSqlTemplateListResponse getTopSqlTemplateList(GetTopSqlTemplateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTopSqlTemplateListWithOptions(request, runtime);
    }

    public GradeProtectionReportResponse gradeProtectionReportWithOptions(GradeProtectionReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GradeProtectionReport", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new GradeProtectionReportResponse());
    }

    public GradeProtectionReportResponse gradeProtectionReport(GradeProtectionReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.gradeProtectionReportWithOptions(request, runtime);
    }

    public ImportDataSourceResponse importDataSourceWithOptions(ImportDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportDataSource", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ImportDataSourceResponse());
    }

    public ImportDataSourceResponse importDataSource(ImportDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importDataSourceWithOptions(request, runtime);
    }

    public IntegratedReportResponse integratedReportWithOptions(IntegratedReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("IntegratedReport", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new IntegratedReportResponse());
    }

    public IntegratedReportResponse integratedReport(IntegratedReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.integratedReportWithOptions(request, runtime);
    }

    public ListAssociatedRulesResponse listAssociatedRulesWithOptions(ListAssociatedRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAssociatedRules", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListAssociatedRulesResponse());
    }

    public ListAssociatedRulesResponse listAssociatedRules(ListAssociatedRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAssociatedRulesWithOptions(request, runtime);
    }

    public ListDataSourceAttributeResponse listDataSourceAttributeWithOptions(ListDataSourceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDataSourceAttribute", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListDataSourceAttributeResponse());
    }

    public ListDataSourceAttributeResponse listDataSourceAttribute(ListDataSourceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDataSourceAttributeWithOptions(request, runtime);
    }

    public ListDataSourcesResponse listDataSourcesWithOptions(ListDataSourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDataSources", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListDataSourcesResponse());
    }

    public ListDataSourcesResponse listDataSources(ListDataSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDataSourcesWithOptions(request, runtime);
    }

    public ListLogAlarmTasksResponse listLogAlarmTasksWithOptions(ListLogAlarmTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLogAlarmTasks", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListLogAlarmTasksResponse());
    }

    public ListLogAlarmTasksResponse listLogAlarmTasks(ListLogAlarmTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLogAlarmTasksWithOptions(request, runtime);
    }

    public ListReportPushTasksResponse listReportPushTasksWithOptions(ListReportPushTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListReportPushTasks", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListReportPushTasksResponse());
    }

    public ListReportPushTasksResponse listReportPushTasks(ListReportPushTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listReportPushTasksWithOptions(request, runtime);
    }

    public ListRuleGroupsResponse listRuleGroupsWithOptions(ListRuleGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRuleGroups", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListRuleGroupsResponse());
    }

    public ListRuleGroupsResponse listRuleGroups(ListRuleGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleGroupsWithOptions(request, runtime);
    }

    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRules", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListRulesResponse());
    }

    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    public ListSqlTypeKeysForRuleResponse listSqlTypeKeysForRuleWithOptions(ListSqlTypeKeysForRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSqlTypeKeysForRule", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListSqlTypeKeysForRuleResponse());
    }

    public ListSqlTypeKeysForRuleResponse listSqlTypeKeysForRule(ListSqlTypeKeysForRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSqlTypeKeysForRuleWithOptions(request, runtime);
    }

    public ListSqlTypesForRuleResponse listSqlTypesForRuleWithOptions(ListSqlTypesForRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSqlTypesForRule", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListSqlTypesForRuleResponse());
    }

    public ListSqlTypesForRuleResponse listSqlTypesForRule(ListSqlTypesForRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSqlTypesForRuleWithOptions(request, runtime);
    }

    public ListSupportDbTypesResponse listSupportDbTypesWithOptions(ListSupportDbTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSupportDbTypes", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListSupportDbTypesResponse());
    }

    public ListSupportDbTypesResponse listSupportDbTypes(ListSupportDbTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSupportDbTypesWithOptions(request, runtime);
    }

    public ListSystemAlarmsResponse listSystemAlarmsWithOptions(ListSystemAlarmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSystemAlarms", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListSystemAlarmsResponse());
    }

    public ListSystemAlarmsResponse listSystemAlarms(ListSystemAlarmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSystemAlarmsWithOptions(request, runtime);
    }

    public ListSystemAlarmTasksResponse listSystemAlarmTasksWithOptions(ListSystemAlarmTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSystemAlarmTasks", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListSystemAlarmTasksResponse());
    }

    public ListSystemAlarmTasksResponse listSystemAlarmTasks(ListSystemAlarmTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSystemAlarmTasksWithOptions(request, runtime);
    }

    public ListTagKeysResponse listTagKeysWithOptions(ListTagKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagKeys", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagKeysResponse());
    }

    public ListTagKeysResponse listTagKeys(ListTagKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagKeysWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ListTemplatesForSqlRuleResponse listTemplatesForSqlRuleWithOptions(ListTemplatesForSqlRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTemplatesForSqlRule", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListTemplatesForSqlRuleResponse());
    }

    public ListTemplatesForSqlRuleResponse listTemplatesForSqlRule(ListTemplatesForSqlRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplatesForSqlRuleWithOptions(request, runtime);
    }

    public ListUsedSqlTypesResponse listUsedSqlTypesWithOptions(ListUsedSqlTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsedSqlTypes", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsedSqlTypesResponse());
    }

    public ListUsedSqlTypesResponse listUsedSqlTypes(ListUsedSqlTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsedSqlTypesWithOptions(request, runtime);
    }

    public ModifyBaseTemplateStateResponse modifyBaseTemplateStateWithOptions(ModifyBaseTemplateStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBaseTemplateState", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBaseTemplateStateResponse());
    }

    public ModifyBaseTemplateStateResponse modifyBaseTemplateState(ModifyBaseTemplateStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBaseTemplateStateWithOptions(request, runtime);
    }

    public ModifyCustomNameResponse modifyCustomNameWithOptions(ModifyCustomNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCustomName", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCustomNameResponse());
    }

    public ModifyCustomNameResponse modifyCustomName(ModifyCustomNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCustomNameWithOptions(request, runtime);
    }

    public ModifyDataSourceResponse modifyDataSourceWithOptions(ModifyDataSourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDataSource", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDataSourceResponse());
    }

    public ModifyDataSourceResponse modifyDataSource(ModifyDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDataSourceWithOptions(request, runtime);
    }

    public ModifyDataSourceAttributeResponse modifyDataSourceAttributeWithOptions(ModifyDataSourceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyDataSourceAttribute", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyDataSourceAttributeResponse());
    }

    public ModifyDataSourceAttributeResponse modifyDataSourceAttribute(ModifyDataSourceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDataSourceAttributeWithOptions(request, runtime);
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAttribute", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAttributeResponse());
    }

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    public ModifyLogAlarmTaskResponse modifyLogAlarmTaskWithOptions(ModifyLogAlarmTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLogAlarmTask", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLogAlarmTaskResponse());
    }

    public ModifyLogAlarmTaskResponse modifyLogAlarmTask(ModifyLogAlarmTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLogAlarmTaskWithOptions(request, runtime);
    }

    public ModifyPlanResponse modifyPlanWithOptions(ModifyPlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPlan", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPlanResponse());
    }

    public ModifyPlanResponse modifyPlan(ModifyPlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPlanWithOptions(request, runtime);
    }

    public ModifyReportPushTaskResponse modifyReportPushTaskWithOptions(ModifyReportPushTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyReportPushTask", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyReportPushTaskResponse());
    }

    public ModifyReportPushTaskResponse modifyReportPushTask(ModifyReportPushTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyReportPushTaskWithOptions(request, runtime);
    }

    public ModifyRuleGroupResponse modifyRuleGroupWithOptions(ModifyRuleGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRuleGroup", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRuleGroupResponse());
    }

    public ModifyRuleGroupResponse modifyRuleGroup(ModifyRuleGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRuleGroupWithOptions(request, runtime);
    }

    public ModifySystemAlarmTaskResponse modifySystemAlarmTaskWithOptions(ModifySystemAlarmTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySystemAlarmTask", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySystemAlarmTaskResponse());
    }

    public ModifySystemAlarmTaskResponse modifySystemAlarmTask(ModifySystemAlarmTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySystemAlarmTaskWithOptions(request, runtime);
    }

    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MoveResourceGroup", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new MoveResourceGroupResponse());
    }

    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    public PciReportResponse pciReportWithOptions(PciReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PciReport", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new PciReportResponse());
    }

    public PciReportResponse pciReport(PciReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pciReportWithOptions(request, runtime);
    }

    public PutLoginCountResponse putLoginCountWithOptions(PutLoginCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PutLoginCount", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new PutLoginCountResponse());
    }

    public PutLoginCountResponse putLoginCount(PutLoginCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.putLoginCountWithOptions(request, runtime);
    }

    public ReadMarkSystemAlarmsResponse readMarkSystemAlarmsWithOptions(ReadMarkSystemAlarmsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReadMarkSystemAlarms", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new ReadMarkSystemAlarmsResponse());
    }

    public ReadMarkSystemAlarmsResponse readMarkSystemAlarms(ReadMarkSystemAlarmsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.readMarkSystemAlarmsWithOptions(request, runtime);
    }

    public RefundInstanceResponse refundInstanceWithOptions(RefundInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefundInstance", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new RefundInstanceResponse());
    }

    public RefundInstanceResponse refundInstance(RefundInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundInstanceWithOptions(request, runtime);
    }

    public RegisterNoticeMailResponse registerNoticeMailWithOptions(RegisterNoticeMailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterNoticeMail", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterNoticeMailResponse());
    }

    public RegisterNoticeMailResponse registerNoticeMail(RegisterNoticeMailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerNoticeMailWithOptions(request, runtime);
    }

    public RemoveLogMaskConfigResponse removeLogMaskConfigWithOptions(RemoveLogMaskConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveLogMaskConfig", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveLogMaskConfigResponse());
    }

    public RemoveLogMaskConfigResponse removeLogMaskConfig(RemoveLogMaskConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeLogMaskConfigWithOptions(request, runtime);
    }

    public SendVerifyCodeMailResponse sendVerifyCodeMailWithOptions(SendVerifyCodeMailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendVerifyCodeMail", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new SendVerifyCodeMailResponse());
    }

    public SendVerifyCodeMailResponse sendVerifyCodeMail(SendVerifyCodeMailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendVerifyCodeMailWithOptions(request, runtime);
    }

    public SoxReportResponse soxReportWithOptions(SoxReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SoxReport", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new SoxReportResponse());
    }

    public SoxReportResponse soxReport(SoxReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.soxReportWithOptions(request, runtime);
    }

    public StartAlarmTaskResponse startAlarmTaskWithOptions(StartAlarmTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartAlarmTask", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new StartAlarmTaskResponse());
    }

    public StartAlarmTaskResponse startAlarmTask(StartAlarmTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startAlarmTaskWithOptions(request, runtime);
    }

    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartInstance", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new StartInstanceResponse());
    }

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    public StopAlarmTaskResponse stopAlarmTaskWithOptions(StopAlarmTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopAlarmTask", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new StopAlarmTaskResponse());
    }

    public StopAlarmTaskResponse stopAlarmTask(StopAlarmTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopAlarmTaskWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpgradeInstanceVersionResponse upgradeInstanceVersionWithOptions(UpgradeInstanceVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeInstanceVersion", "2018-03-20", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeInstanceVersionResponse());
    }

    public UpgradeInstanceVersionResponse upgradeInstanceVersion(UpgradeInstanceVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeInstanceVersionWithOptions(request, runtime);
    }
}
