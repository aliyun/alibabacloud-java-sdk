// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203;

import com.aliyun.tea.*;
import com.aliyun.sas20181203.models.*;
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
            new TeaPair("cn-hangzhou", "tds.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "tds.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "tds.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "tds.aliyuncs.com"),
            new TeaPair("ap-south-1", "tds.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "tds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "tds.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "tds.aliyuncs.com"),
            new TeaPair("cn-beijing", "tds.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "tds.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "tds.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "tds.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "tds.aliyuncs.com"),
            new TeaPair("cn-chengdu", "tds.aliyuncs.com"),
            new TeaPair("cn-edge-1", "tds.aliyuncs.com"),
            new TeaPair("cn-fujian", "tds.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "tds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "tds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "tds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "tds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "tds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "tds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "tds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "tds.aliyuncs.com"),
            new TeaPair("cn-hongkong", "tds.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "tds.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "tds.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "tds.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "tds.aliyuncs.com"),
            new TeaPair("cn-qingdao", "tds.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "tds.aliyuncs.com"),
            new TeaPair("cn-shanghai", "tds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "tds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "tds.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "tds.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "tds.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "tds.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "tds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "tds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "tds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "tds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "tds.aliyuncs.com"),
            new TeaPair("cn-wuhan", "tds.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "tds.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "tds.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "tds.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "tds.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "tds.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "tds.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "tds.aliyuncs.com"),
            new TeaPair("eu-central-1", "tds.aliyuncs.com"),
            new TeaPair("eu-west-1", "tds.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "tds.aliyuncs.com"),
            new TeaPair("me-east-1", "tds.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "tds.aliyuncs.com"),
            new TeaPair("us-east-1", "tds.aliyuncs.com"),
            new TeaPair("us-west-1", "tds.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddVpcHoneyPotResponse addVpcHoneyPotWithOptions(AddVpcHoneyPotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVpcHoneyPot", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new AddVpcHoneyPotResponse());
    }

    public AddVpcHoneyPotResponse addVpcHoneyPot(AddVpcHoneyPotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVpcHoneyPotWithOptions(request, runtime);
    }

    public CheckQuaraFileIdResponse checkQuaraFileIdWithOptions(CheckQuaraFileIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckQuaraFileId", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CheckQuaraFileIdResponse());
    }

    public CheckQuaraFileIdResponse checkQuaraFileId(CheckQuaraFileIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkQuaraFileIdWithOptions(request, runtime);
    }

    public CheckSecurityEventIdResponse checkSecurityEventIdWithOptions(CheckSecurityEventIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckSecurityEventId", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CheckSecurityEventIdResponse());
    }

    public CheckSecurityEventIdResponse checkSecurityEventId(CheckSecurityEventIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkSecurityEventIdWithOptions(request, runtime);
    }

    public CreateAntiBruteForceRuleResponse createAntiBruteForceRuleWithOptions(CreateAntiBruteForceRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAntiBruteForceRule", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAntiBruteForceRuleResponse());
    }

    public CreateAntiBruteForceRuleResponse createAntiBruteForceRule(CreateAntiBruteForceRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntiBruteForceRuleWithOptions(request, runtime);
    }

    public CreateAssetResponse createAssetWithOptions(CreateAssetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAsset", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAssetResponse());
    }

    public CreateAssetResponse createAsset(CreateAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAssetWithOptions(request, runtime);
    }

    public CreateBackupPolicyResponse createBackupPolicyWithOptions(CreateBackupPolicyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBackupPolicyShrinkRequest request = new CreateBackupPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.policy)) {
            request.policyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.policy, "Policy", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBackupPolicy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBackupPolicyResponse());
    }

    public CreateBackupPolicyResponse createBackupPolicy(CreateBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBackupPolicyWithOptions(request, runtime);
    }

    public CreateOrUpdateAssetGroupResponse createOrUpdateAssetGroupWithOptions(CreateOrUpdateAssetGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOrUpdateAssetGroup", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOrUpdateAssetGroupResponse());
    }

    public CreateOrUpdateAssetGroupResponse createOrUpdateAssetGroup(CreateOrUpdateAssetGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrUpdateAssetGroupWithOptions(request, runtime);
    }

    public CreateRestoreJobResponse createRestoreJobWithOptions(CreateRestoreJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRestoreJob", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRestoreJobResponse());
    }

    public CreateRestoreJobResponse createRestoreJob(CreateRestoreJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRestoreJobWithOptions(request, runtime);
    }

    public CreateSasOrderResponse createSasOrderWithOptions(CreateSasOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSasOrder", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSasOrderResponse());
    }

    public CreateSasOrderResponse createSasOrder(CreateSasOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSasOrderWithOptions(request, runtime);
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("CreateServiceLinkedRole", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateServiceLinkedRoleResponse());
    }

    public CreateServiceLinkedRoleResponse createServiceLinkedRole() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(runtime);
    }

    public CreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskWithOptions(CreateSimilarSecurityEventsQueryTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSimilarSecurityEventsQueryTask", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSimilarSecurityEventsQueryTaskResponse());
    }

    public CreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTask(CreateSimilarSecurityEventsQueryTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSimilarSecurityEventsQueryTaskWithOptions(request, runtime);
    }

    public CreateUniBackupPolicyResponse createUniBackupPolicyWithOptions(CreateUniBackupPolicyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUniBackupPolicyShrinkRequest request = new CreateUniBackupPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fullPlan)) {
            request.fullPlanShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fullPlan, "FullPlan", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.incPlan)) {
            request.incPlanShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.incPlan, "IncPlan", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUniBackupPolicy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUniBackupPolicyResponse());
    }

    public CreateUniBackupPolicyResponse createUniBackupPolicy(CreateUniBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUniBackupPolicyWithOptions(request, runtime);
    }

    public CreateUniRestorePlanResponse createUniRestorePlanWithOptions(CreateUniRestorePlanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUniRestorePlan", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUniRestorePlanResponse());
    }

    public CreateUniRestorePlanResponse createUniRestorePlan(CreateUniRestorePlanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUniRestorePlanWithOptions(request, runtime);
    }

    public DeleteAssetResponse deleteAssetWithOptions(DeleteAssetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAsset", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAssetResponse());
    }

    public DeleteAssetResponse deleteAsset(DeleteAssetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAssetWithOptions(request, runtime);
    }

    public DeleteBackupPolicyResponse deleteBackupPolicyWithOptions(DeleteBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBackupPolicy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBackupPolicyResponse());
    }

    public DeleteBackupPolicyResponse deleteBackupPolicy(DeleteBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBackupPolicyWithOptions(request, runtime);
    }

    public DeleteBackupPolicyMachineResponse deleteBackupPolicyMachineWithOptions(DeleteBackupPolicyMachineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBackupPolicyMachine", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBackupPolicyMachineResponse());
    }

    public DeleteBackupPolicyMachineResponse deleteBackupPolicyMachine(DeleteBackupPolicyMachineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBackupPolicyMachineWithOptions(request, runtime);
    }

    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGroup", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGroupResponse());
    }

    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    public DeleteLoginBaseConfigResponse deleteLoginBaseConfigWithOptions(DeleteLoginBaseConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLoginBaseConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLoginBaseConfigResponse());
    }

    public DeleteLoginBaseConfigResponse deleteLoginBaseConfig(DeleteLoginBaseConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLoginBaseConfigWithOptions(request, runtime);
    }

    public DeleteStrategyResponse deleteStrategyWithOptions(DeleteStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteStrategy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteStrategyResponse());
    }

    public DeleteStrategyResponse deleteStrategy(DeleteStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteStrategyWithOptions(request, runtime);
    }

    public DeleteTagWithUuidResponse deleteTagWithUuidWithOptions(DeleteTagWithUuidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTagWithUuid", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTagWithUuidResponse());
    }

    public DeleteTagWithUuidResponse deleteTagWithUuid(DeleteTagWithUuidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTagWithUuidWithOptions(request, runtime);
    }

    public DeleteUniBackupPolicyResponse deleteUniBackupPolicyWithOptions(DeleteUniBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUniBackupPolicy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUniBackupPolicyResponse());
    }

    public DeleteUniBackupPolicyResponse deleteUniBackupPolicy(DeleteUniBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUniBackupPolicyWithOptions(request, runtime);
    }

    public DeleteVpcHoneyPotResponse deleteVpcHoneyPotWithOptions(DeleteVpcHoneyPotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVpcHoneyPot", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVpcHoneyPotResponse());
    }

    public DeleteVpcHoneyPotResponse deleteVpcHoneyPot(DeleteVpcHoneyPotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVpcHoneyPotWithOptions(request, runtime);
    }

    public DescribeAccesskeyLeakListResponse describeAccesskeyLeakListWithOptions(DescribeAccesskeyLeakListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccesskeyLeakList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccesskeyLeakListResponse());
    }

    public DescribeAccesskeyLeakListResponse describeAccesskeyLeakList(DescribeAccesskeyLeakListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccesskeyLeakListWithOptions(request, runtime);
    }

    public DescribeAffectedMaliciousFileImagesResponse describeAffectedMaliciousFileImagesWithOptions(DescribeAffectedMaliciousFileImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAffectedMaliciousFileImages", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAffectedMaliciousFileImagesResponse());
    }

    public DescribeAffectedMaliciousFileImagesResponse describeAffectedMaliciousFileImages(DescribeAffectedMaliciousFileImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAffectedMaliciousFileImagesWithOptions(request, runtime);
    }

    public DescribeAlarmEventDetailResponse describeAlarmEventDetailWithOptions(DescribeAlarmEventDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlarmEventDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlarmEventDetailResponse());
    }

    public DescribeAlarmEventDetailResponse describeAlarmEventDetail(DescribeAlarmEventDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlarmEventDetailWithOptions(request, runtime);
    }

    public DescribeAlarmEventListResponse describeAlarmEventListWithOptions(DescribeAlarmEventListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlarmEventList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlarmEventListResponse());
    }

    public DescribeAlarmEventListResponse describeAlarmEventList(DescribeAlarmEventListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlarmEventListWithOptions(request, runtime);
    }

    public DescribeAlarmEventStackInfoResponse describeAlarmEventStackInfoWithOptions(DescribeAlarmEventStackInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAlarmEventStackInfo", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAlarmEventStackInfoResponse());
    }

    public DescribeAlarmEventStackInfoResponse describeAlarmEventStackInfo(DescribeAlarmEventStackInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAlarmEventStackInfoWithOptions(request, runtime);
    }

    public DescribeAllEntityResponse describeAllEntityWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeAllEntity", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllEntityResponse());
    }

    public DescribeAllEntityResponse describeAllEntity() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllEntityWithOptions(runtime);
    }

    public DescribeAllGroupsResponse describeAllGroupsWithOptions(DescribeAllGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllGroups", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllGroupsResponse());
    }

    public DescribeAllGroupsResponse describeAllGroups(DescribeAllGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllGroupsWithOptions(request, runtime);
    }

    public DescribeAllRegionsStatisticsResponse describeAllRegionsStatisticsWithOptions(DescribeAllRegionsStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllRegionsStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllRegionsStatisticsResponse());
    }

    public DescribeAllRegionsStatisticsResponse describeAllRegionsStatistics(DescribeAllRegionsStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllRegionsStatisticsWithOptions(request, runtime);
    }

    public DescribeAntiBruteForceRulesResponse describeAntiBruteForceRulesWithOptions(DescribeAntiBruteForceRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntiBruteForceRules", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntiBruteForceRulesResponse());
    }

    public DescribeAntiBruteForceRulesResponse describeAntiBruteForceRules(DescribeAntiBruteForceRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntiBruteForceRulesWithOptions(request, runtime);
    }

    public DescribeAssetDetailByUuidResponse describeAssetDetailByUuidWithOptions(DescribeAssetDetailByUuidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAssetDetailByUuid", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAssetDetailByUuidResponse());
    }

    public DescribeAssetDetailByUuidResponse describeAssetDetailByUuid(DescribeAssetDetailByUuidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAssetDetailByUuidWithOptions(request, runtime);
    }

    public DescribeAssetDetailByUuidsResponse describeAssetDetailByUuidsWithOptions(DescribeAssetDetailByUuidsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAssetDetailByUuids", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAssetDetailByUuidsResponse());
    }

    public DescribeAssetDetailByUuidsResponse describeAssetDetailByUuids(DescribeAssetDetailByUuidsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAssetDetailByUuidsWithOptions(request, runtime);
    }

    public DescribeAssetSummaryResponse describeAssetSummaryWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeAssetSummary", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAssetSummaryResponse());
    }

    public DescribeAssetSummaryResponse describeAssetSummary() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAssetSummaryWithOptions(runtime);
    }

    public DescribeAutoDelConfigResponse describeAutoDelConfigWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeAutoDelConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutoDelConfigResponse());
    }

    public DescribeAutoDelConfigResponse describeAutoDelConfig() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutoDelConfigWithOptions(runtime);
    }

    public DescribeBackupClientsResponse describeBackupClientsWithOptions(DescribeBackupClientsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupClients", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupClientsResponse());
    }

    public DescribeBackupClientsResponse describeBackupClients(DescribeBackupClientsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupClientsWithOptions(request, runtime);
    }

    public DescribeBackupDirsResponse describeBackupDirsWithOptions(DescribeBackupDirsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupDirs", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupDirsResponse());
    }

    public DescribeBackupDirsResponse describeBackupDirs(DescribeBackupDirsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupDirsWithOptions(request, runtime);
    }

    public DescribeBackupFilesResponse describeBackupFilesWithOptions(DescribeBackupFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupFiles", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupFilesResponse());
    }

    public DescribeBackupFilesResponse describeBackupFiles(DescribeBackupFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupFilesWithOptions(request, runtime);
    }

    public DescribeBackupMachineStatusResponse describeBackupMachineStatusWithOptions(DescribeBackupMachineStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupMachineStatus", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupMachineStatusResponse());
    }

    public DescribeBackupMachineStatusResponse describeBackupMachineStatus(DescribeBackupMachineStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupMachineStatusWithOptions(request, runtime);
    }

    public DescribeBackupPoliciesResponse describeBackupPoliciesWithOptions(DescribeBackupPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicies", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPoliciesResponse());
    }

    public DescribeBackupPoliciesResponse describeBackupPolicies(DescribeBackupPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPoliciesWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupPolicy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeBackupRestoreCountResponse describeBackupRestoreCountWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeBackupRestoreCount", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBackupRestoreCountResponse());
    }

    public DescribeBackupRestoreCountResponse describeBackupRestoreCount() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBackupRestoreCountWithOptions(runtime);
    }

    public DescribeBruteForceSummaryResponse describeBruteForceSummaryWithOptions(DescribeBruteForceSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBruteForceSummary", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBruteForceSummaryResponse());
    }

    public DescribeBruteForceSummaryResponse describeBruteForceSummary(DescribeBruteForceSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBruteForceSummaryWithOptions(request, runtime);
    }

    public DescribeCheckEcsWarningsResponse describeCheckEcsWarningsWithOptions(DescribeCheckEcsWarningsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCheckEcsWarnings", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCheckEcsWarningsResponse());
    }

    public DescribeCheckEcsWarningsResponse describeCheckEcsWarnings(DescribeCheckEcsWarningsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCheckEcsWarningsWithOptions(request, runtime);
    }

    public DescribeCheckWarningDetailResponse describeCheckWarningDetailWithOptions(DescribeCheckWarningDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCheckWarningDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCheckWarningDetailResponse());
    }

    public DescribeCheckWarningDetailResponse describeCheckWarningDetail(DescribeCheckWarningDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCheckWarningDetailWithOptions(request, runtime);
    }

    public DescribeCheckWarningsResponse describeCheckWarningsWithOptions(DescribeCheckWarningsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCheckWarnings", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCheckWarningsResponse());
    }

    public DescribeCheckWarningsResponse describeCheckWarnings(DescribeCheckWarningsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCheckWarningsWithOptions(request, runtime);
    }

    public DescribeCheckWarningSummaryResponse describeCheckWarningSummaryWithOptions(DescribeCheckWarningSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCheckWarningSummary", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCheckWarningSummaryResponse());
    }

    public DescribeCheckWarningSummaryResponse describeCheckWarningSummary(DescribeCheckWarningSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCheckWarningSummaryWithOptions(request, runtime);
    }

    public DescribeCloudCenterInstancesResponse describeCloudCenterInstancesWithOptions(DescribeCloudCenterInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCloudCenterInstances", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCloudCenterInstancesResponse());
    }

    public DescribeCloudCenterInstancesResponse describeCloudCenterInstances(DescribeCloudCenterInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudCenterInstancesWithOptions(request, runtime);
    }

    public DescribeCloudProductFieldStatisticsResponse describeCloudProductFieldStatisticsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeCloudProductFieldStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCloudProductFieldStatisticsResponse());
    }

    public DescribeCloudProductFieldStatisticsResponse describeCloudProductFieldStatistics() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudProductFieldStatisticsWithOptions(runtime);
    }

    public DescribeConcernNecessityResponse describeConcernNecessityWithOptions(DescribeConcernNecessityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeConcernNecessity", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeConcernNecessityResponse());
    }

    public DescribeConcernNecessityResponse describeConcernNecessity(DescribeConcernNecessityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeConcernNecessityWithOptions(request, runtime);
    }

    public DescribeContainerStatisticsResponse describeContainerStatisticsWithOptions(DescribeContainerStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeContainerStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeContainerStatisticsResponse());
    }

    public DescribeContainerStatisticsResponse describeContainerStatistics(DescribeContainerStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeContainerStatisticsWithOptions(request, runtime);
    }

    public DescribeCriteriaResponse describeCriteriaWithOptions(DescribeCriteriaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCriteria", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCriteriaResponse());
    }

    public DescribeCriteriaResponse describeCriteria(DescribeCriteriaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCriteriaWithOptions(request, runtime);
    }

    public DescribeDialogMessagesResponse describeDialogMessagesWithOptions(DescribeDialogMessagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDialogMessages", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDialogMessagesResponse());
    }

    public DescribeDialogMessagesResponse describeDialogMessages(DescribeDialogMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDialogMessagesWithOptions(request, runtime);
    }

    public DescribeDingTalkResponse describeDingTalkWithOptions(DescribeDingTalkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDingTalk", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDingTalkResponse());
    }

    public DescribeDingTalkResponse describeDingTalk(DescribeDingTalkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDingTalkWithOptions(request, runtime);
    }

    public DescribeDomainCountResponse describeDomainCountWithOptions(DescribeDomainCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainCount", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainCountResponse());
    }

    public DescribeDomainCountResponse describeDomainCount(DescribeDomainCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainCountWithOptions(request, runtime);
    }

    public DescribeDomainDetailResponse describeDomainDetailWithOptions(DescribeDomainDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainDetailResponse());
    }

    public DescribeDomainDetailResponse describeDomainDetail(DescribeDomainDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainDetailWithOptions(request, runtime);
    }

    public DescribeDomainListResponse describeDomainListWithOptions(DescribeDomainListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDomainList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDomainListResponse());
    }

    public DescribeDomainListResponse describeDomainList(DescribeDomainListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDomainListWithOptions(request, runtime);
    }

    public DescribeEmgVulItemResponse describeEmgVulItemWithOptions(DescribeEmgVulItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEmgVulItem", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEmgVulItemResponse());
    }

    public DescribeEmgVulItemResponse describeEmgVulItem(DescribeEmgVulItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEmgVulItemWithOptions(request, runtime);
    }

    public DescribeExcludeSystemPathResponse describeExcludeSystemPathWithOptions(DescribeExcludeSystemPathRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExcludeSystemPath", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExcludeSystemPathResponse());
    }

    public DescribeExcludeSystemPathResponse describeExcludeSystemPath(DescribeExcludeSystemPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExcludeSystemPathWithOptions(request, runtime);
    }

    public DescribeExportInfoResponse describeExportInfoWithOptions(DescribeExportInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExportInfo", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExportInfoResponse());
    }

    public DescribeExportInfoResponse describeExportInfo(DescribeExportInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExportInfoWithOptions(request, runtime);
    }

    public DescribeExposedInstanceCriteriaResponse describeExposedInstanceCriteriaWithOptions(DescribeExposedInstanceCriteriaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExposedInstanceCriteria", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExposedInstanceCriteriaResponse());
    }

    public DescribeExposedInstanceCriteriaResponse describeExposedInstanceCriteria(DescribeExposedInstanceCriteriaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExposedInstanceCriteriaWithOptions(request, runtime);
    }

    public DescribeExposedInstanceDetailResponse describeExposedInstanceDetailWithOptions(DescribeExposedInstanceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExposedInstanceDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExposedInstanceDetailResponse());
    }

    public DescribeExposedInstanceDetailResponse describeExposedInstanceDetail(DescribeExposedInstanceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExposedInstanceDetailWithOptions(request, runtime);
    }

    public DescribeExposedInstanceListResponse describeExposedInstanceListWithOptions(DescribeExposedInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExposedInstanceList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExposedInstanceListResponse());
    }

    public DescribeExposedInstanceListResponse describeExposedInstanceList(DescribeExposedInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExposedInstanceListWithOptions(request, runtime);
    }

    public DescribeExposedRiskNumResponse describeExposedRiskNumWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeExposedRiskNum", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExposedRiskNumResponse());
    }

    public DescribeExposedRiskNumResponse describeExposedRiskNum() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExposedRiskNumWithOptions(runtime);
    }

    public DescribeExposedStatisticsResponse describeExposedStatisticsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeExposedStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExposedStatisticsResponse());
    }

    public DescribeExposedStatisticsResponse describeExposedStatistics() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExposedStatisticsWithOptions(runtime);
    }

    public DescribeExposedStatisticsDetailResponse describeExposedStatisticsDetailWithOptions(DescribeExposedStatisticsDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeExposedStatisticsDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeExposedStatisticsDetailResponse());
    }

    public DescribeExposedStatisticsDetailResponse describeExposedStatisticsDetail(DescribeExposedStatisticsDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeExposedStatisticsDetailWithOptions(request, runtime);
    }

    public DescribeFieldStatisticsResponse describeFieldStatisticsWithOptions(DescribeFieldStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFieldStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFieldStatisticsResponse());
    }

    public DescribeFieldStatisticsResponse describeFieldStatistics(DescribeFieldStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFieldStatisticsWithOptions(request, runtime);
    }

    public DescribeFrontVulPatchListResponse describeFrontVulPatchListWithOptions(DescribeFrontVulPatchListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFrontVulPatchList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFrontVulPatchListResponse());
    }

    public DescribeFrontVulPatchListResponse describeFrontVulPatchList(DescribeFrontVulPatchListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFrontVulPatchListWithOptions(request, runtime);
    }

    public DescribeGraph4InvestigationOnlineResponse describeGraph4InvestigationOnlineWithOptions(DescribeGraph4InvestigationOnlineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGraph4InvestigationOnline", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGraph4InvestigationOnlineResponse());
    }

    public DescribeGraph4InvestigationOnlineResponse describeGraph4InvestigationOnline(DescribeGraph4InvestigationOnlineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGraph4InvestigationOnlineWithOptions(request, runtime);
    }

    public DescribeGroupedContainerInstancesResponse describeGroupedContainerInstancesWithOptions(DescribeGroupedContainerInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroupedContainerInstances", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupedContainerInstancesResponse());
    }

    public DescribeGroupedContainerInstancesResponse describeGroupedContainerInstances(DescribeGroupedContainerInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupedContainerInstancesWithOptions(request, runtime);
    }

    public DescribeGroupedInstancesResponse describeGroupedInstancesWithOptions(DescribeGroupedInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroupedInstances", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupedInstancesResponse());
    }

    public DescribeGroupedInstancesResponse describeGroupedInstances(DescribeGroupedInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupedInstancesWithOptions(request, runtime);
    }

    public DescribeGroupedMaliciousFilesResponse describeGroupedMaliciousFilesWithOptions(DescribeGroupedMaliciousFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroupedMaliciousFiles", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupedMaliciousFilesResponse());
    }

    public DescribeGroupedMaliciousFilesResponse describeGroupedMaliciousFiles(DescribeGroupedMaliciousFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupedMaliciousFilesWithOptions(request, runtime);
    }

    public DescribeGroupedTagsResponse describeGroupedTagsWithOptions(DescribeGroupedTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroupedTags", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupedTagsResponse());
    }

    public DescribeGroupedTagsResponse describeGroupedTags(DescribeGroupedTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupedTagsWithOptions(request, runtime);
    }

    public DescribeGroupedVulResponse describeGroupedVulWithOptions(DescribeGroupedVulRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroupedVul", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupedVulResponse());
    }

    public DescribeGroupedVulResponse describeGroupedVul(DescribeGroupedVulRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupedVulWithOptions(request, runtime);
    }

    public DescribeHoneyPotAuthResponse describeHoneyPotAuthWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeHoneyPotAuth", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHoneyPotAuthResponse());
    }

    public DescribeHoneyPotAuthResponse describeHoneyPotAuth() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHoneyPotAuthWithOptions(runtime);
    }

    public DescribeHoneyPotSuspStatisticsResponse describeHoneyPotSuspStatisticsWithOptions(DescribeHoneyPotSuspStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHoneyPotSuspStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHoneyPotSuspStatisticsResponse());
    }

    public DescribeHoneyPotSuspStatisticsResponse describeHoneyPotSuspStatistics(DescribeHoneyPotSuspStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHoneyPotSuspStatisticsWithOptions(request, runtime);
    }

    public DescribeImageGroupedVulListResponse describeImageGroupedVulListWithOptions(DescribeImageGroupedVulListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageGroupedVulList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageGroupedVulListResponse());
    }

    public DescribeImageGroupedVulListResponse describeImageGroupedVulList(DescribeImageGroupedVulListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageGroupedVulListWithOptions(request, runtime);
    }

    public DescribeImageScanAuthCountResponse describeImageScanAuthCountWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeImageScanAuthCount", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageScanAuthCountResponse());
    }

    public DescribeImageScanAuthCountResponse describeImageScanAuthCount() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageScanAuthCountWithOptions(runtime);
    }

    public DescribeImageStatisticsResponse describeImageStatisticsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeImageStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageStatisticsResponse());
    }

    public DescribeImageStatisticsResponse describeImageStatistics() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageStatisticsWithOptions(runtime);
    }

    public DescribeImageVulListResponse describeImageVulListWithOptions(DescribeImageVulListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeImageVulList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeImageVulListResponse());
    }

    public DescribeImageVulListResponse describeImageVulList(DescribeImageVulListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeImageVulListWithOptions(request, runtime);
    }

    public DescribeInstallCaptchaResponse describeInstallCaptchaWithOptions(DescribeInstallCaptchaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstallCaptcha", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstallCaptchaResponse());
    }

    public DescribeInstallCaptchaResponse describeInstallCaptcha(DescribeInstallCaptchaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstallCaptchaWithOptions(request, runtime);
    }

    public DescribeInstanceAntiBruteForceRulesResponse describeInstanceAntiBruteForceRulesWithOptions(DescribeInstanceAntiBruteForceRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceAntiBruteForceRules", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceAntiBruteForceRulesResponse());
    }

    public DescribeInstanceAntiBruteForceRulesResponse describeInstanceAntiBruteForceRules(DescribeInstanceAntiBruteForceRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceAntiBruteForceRulesWithOptions(request, runtime);
    }

    public DescribeInstanceStatisticsResponse describeInstanceStatisticsWithOptions(DescribeInstanceStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceStatisticsResponse());
    }

    public DescribeInstanceStatisticsResponse describeInstanceStatistics(DescribeInstanceStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceStatisticsWithOptions(request, runtime);
    }

    public DescribeIpInfoResponse describeIpInfoWithOptions(DescribeIpInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpInfo", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpInfoResponse());
    }

    public DescribeIpInfoResponse describeIpInfo(DescribeIpInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpInfoWithOptions(request, runtime);
    }

    public DescribeLogstoreStorageResponse describeLogstoreStorageWithOptions(DescribeLogstoreStorageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLogstoreStorage", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLogstoreStorageResponse());
    }

    public DescribeLogstoreStorageResponse describeLogstoreStorage(DescribeLogstoreStorageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLogstoreStorageWithOptions(request, runtime);
    }

    public DescribeModuleConfigResponse describeModuleConfigWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeModuleConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeModuleConfigResponse());
    }

    public DescribeModuleConfigResponse describeModuleConfig() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeModuleConfigWithOptions(runtime);
    }

    public DescribeNoticeConfigResponse describeNoticeConfigWithOptions(DescribeNoticeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNoticeConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNoticeConfigResponse());
    }

    public DescribeNoticeConfigResponse describeNoticeConfig(DescribeNoticeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNoticeConfigWithOptions(request, runtime);
    }

    public DescribePropertyCountResponse describePropertyCountWithOptions(DescribePropertyCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertyCount", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertyCountResponse());
    }

    public DescribePropertyCountResponse describePropertyCount(DescribePropertyCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertyCountWithOptions(request, runtime);
    }

    public DescribePropertyCronDetailResponse describePropertyCronDetailWithOptions(DescribePropertyCronDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertyCronDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertyCronDetailResponse());
    }

    public DescribePropertyCronDetailResponse describePropertyCronDetail(DescribePropertyCronDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertyCronDetailWithOptions(request, runtime);
    }

    public DescribePropertyPortDetailResponse describePropertyPortDetailWithOptions(DescribePropertyPortDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertyPortDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertyPortDetailResponse());
    }

    public DescribePropertyPortDetailResponse describePropertyPortDetail(DescribePropertyPortDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertyPortDetailWithOptions(request, runtime);
    }

    public DescribePropertyPortItemResponse describePropertyPortItemWithOptions(DescribePropertyPortItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertyPortItem", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertyPortItemResponse());
    }

    public DescribePropertyPortItemResponse describePropertyPortItem(DescribePropertyPortItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertyPortItemWithOptions(request, runtime);
    }

    public DescribePropertyProcDetailResponse describePropertyProcDetailWithOptions(DescribePropertyProcDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertyProcDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertyProcDetailResponse());
    }

    public DescribePropertyProcDetailResponse describePropertyProcDetail(DescribePropertyProcDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertyProcDetailWithOptions(request, runtime);
    }

    public DescribePropertyProcItemResponse describePropertyProcItemWithOptions(DescribePropertyProcItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertyProcItem", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertyProcItemResponse());
    }

    public DescribePropertyProcItemResponse describePropertyProcItem(DescribePropertyProcItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertyProcItemWithOptions(request, runtime);
    }

    public DescribePropertyScaDetailResponse describePropertyScaDetailWithOptions(DescribePropertyScaDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertyScaDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertyScaDetailResponse());
    }

    public DescribePropertyScaDetailResponse describePropertyScaDetail(DescribePropertyScaDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertyScaDetailWithOptions(request, runtime);
    }

    public DescribePropertySoftwareDetailResponse describePropertySoftwareDetailWithOptions(DescribePropertySoftwareDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertySoftwareDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertySoftwareDetailResponse());
    }

    public DescribePropertySoftwareDetailResponse describePropertySoftwareDetail(DescribePropertySoftwareDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertySoftwareDetailWithOptions(request, runtime);
    }

    public DescribePropertySoftwareItemResponse describePropertySoftwareItemWithOptions(DescribePropertySoftwareItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertySoftwareItem", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertySoftwareItemResponse());
    }

    public DescribePropertySoftwareItemResponse describePropertySoftwareItem(DescribePropertySoftwareItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertySoftwareItemWithOptions(request, runtime);
    }

    public DescribePropertyUsageNewestResponse describePropertyUsageNewestWithOptions(DescribePropertyUsageNewestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertyUsageNewest", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertyUsageNewestResponse());
    }

    public DescribePropertyUsageNewestResponse describePropertyUsageNewest(DescribePropertyUsageNewestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertyUsageNewestWithOptions(request, runtime);
    }

    public DescribePropertyUserDetailResponse describePropertyUserDetailWithOptions(DescribePropertyUserDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertyUserDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertyUserDetailResponse());
    }

    public DescribePropertyUserDetailResponse describePropertyUserDetail(DescribePropertyUserDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertyUserDetailWithOptions(request, runtime);
    }

    public DescribePropertyUserItemResponse describePropertyUserItemWithOptions(DescribePropertyUserItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePropertyUserItem", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePropertyUserItemResponse());
    }

    public DescribePropertyUserItemResponse describePropertyUserItem(DescribePropertyUserItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePropertyUserItemWithOptions(request, runtime);
    }

    public DescribeQuaraFileDownloadInfoResponse describeQuaraFileDownloadInfoWithOptions(DescribeQuaraFileDownloadInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeQuaraFileDownloadInfo", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeQuaraFileDownloadInfoResponse());
    }

    public DescribeQuaraFileDownloadInfoResponse describeQuaraFileDownloadInfo(DescribeQuaraFileDownloadInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeQuaraFileDownloadInfoWithOptions(request, runtime);
    }

    public DescribeRestoreJobsResponse describeRestoreJobsWithOptions(DescribeRestoreJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRestoreJobs", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRestoreJobsResponse());
    }

    public DescribeRestoreJobsResponse describeRestoreJobs(DescribeRestoreJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestoreJobsWithOptions(request, runtime);
    }

    public DescribeRestorePlansResponse describeRestorePlansWithOptions(DescribeRestorePlansRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRestorePlans", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRestorePlansResponse());
    }

    public DescribeRestorePlansResponse describeRestorePlans(DescribeRestorePlansRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRestorePlansWithOptions(request, runtime);
    }

    public DescribeRiskCheckItemResultResponse describeRiskCheckItemResultWithOptions(DescribeRiskCheckItemResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRiskCheckItemResult", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRiskCheckItemResultResponse());
    }

    public DescribeRiskCheckItemResultResponse describeRiskCheckItemResult(DescribeRiskCheckItemResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRiskCheckItemResultWithOptions(request, runtime);
    }

    public DescribeRiskCheckResultResponse describeRiskCheckResultWithOptions(DescribeRiskCheckResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRiskCheckResult", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRiskCheckResultResponse());
    }

    public DescribeRiskCheckResultResponse describeRiskCheckResult(DescribeRiskCheckResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRiskCheckResultWithOptions(request, runtime);
    }

    public DescribeRiskCheckSummaryResponse describeRiskCheckSummaryWithOptions(DescribeRiskCheckSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRiskCheckSummary", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRiskCheckSummaryResponse());
    }

    public DescribeRiskCheckSummaryResponse describeRiskCheckSummary(DescribeRiskCheckSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRiskCheckSummaryWithOptions(request, runtime);
    }

    public DescribeRiskItemTypeResponse describeRiskItemTypeWithOptions(DescribeRiskItemTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRiskItemType", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRiskItemTypeResponse());
    }

    public DescribeRiskItemTypeResponse describeRiskItemType(DescribeRiskItemTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRiskItemTypeWithOptions(request, runtime);
    }

    public DescribeRiskListCheckResultResponse describeRiskListCheckResultWithOptions(DescribeRiskListCheckResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRiskListCheckResult", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRiskListCheckResultResponse());
    }

    public DescribeRiskListCheckResultResponse describeRiskListCheckResult(DescribeRiskListCheckResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRiskListCheckResultWithOptions(request, runtime);
    }

    public DescribeScanTaskProgressResponse describeScanTaskProgressWithOptions(DescribeScanTaskProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeScanTaskProgress", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeScanTaskProgressResponse());
    }

    public DescribeScanTaskProgressResponse describeScanTaskProgress(DescribeScanTaskProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeScanTaskProgressWithOptions(request, runtime);
    }

    public DescribeSearchConditionResponse describeSearchConditionWithOptions(DescribeSearchConditionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSearchCondition", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSearchConditionResponse());
    }

    public DescribeSearchConditionResponse describeSearchCondition(DescribeSearchConditionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSearchConditionWithOptions(request, runtime);
    }

    public DescribeSecureSuggestionResponse describeSecureSuggestionWithOptions(DescribeSecureSuggestionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecureSuggestion", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecureSuggestionResponse());
    }

    public DescribeSecureSuggestionResponse describeSecureSuggestion(DescribeSecureSuggestionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecureSuggestionWithOptions(request, runtime);
    }

    public DescribeSecurityCheckScheduleConfigResponse describeSecurityCheckScheduleConfigWithOptions(DescribeSecurityCheckScheduleConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityCheckScheduleConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityCheckScheduleConfigResponse());
    }

    public DescribeSecurityCheckScheduleConfigResponse describeSecurityCheckScheduleConfig(DescribeSecurityCheckScheduleConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityCheckScheduleConfigWithOptions(request, runtime);
    }

    public DescribeSecurityEventOperationsResponse describeSecurityEventOperationsWithOptions(DescribeSecurityEventOperationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityEventOperations", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityEventOperationsResponse());
    }

    public DescribeSecurityEventOperationsResponse describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityEventOperationsWithOptions(request, runtime);
    }

    public DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatusWithOptions(DescribeSecurityEventOperationStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityEventOperationStatus", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityEventOperationStatusResponse());
    }

    public DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityEventOperationStatusWithOptions(request, runtime);
    }

    public DescribeSecurityStatInfoResponse describeSecurityStatInfoWithOptions(DescribeSecurityStatInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSecurityStatInfo", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSecurityStatInfoResponse());
    }

    public DescribeSecurityStatInfoResponse describeSecurityStatInfo(DescribeSecurityStatInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSecurityStatInfoWithOptions(request, runtime);
    }

    public DescribeServiceLinkedRoleStatusResponse describeServiceLinkedRoleStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeServiceLinkedRoleStatus", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeServiceLinkedRoleStatusResponse());
    }

    public DescribeServiceLinkedRoleStatusResponse describeServiceLinkedRoleStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeServiceLinkedRoleStatusWithOptions(runtime);
    }

    public DescribeSimilarEventScenariosResponse describeSimilarEventScenariosWithOptions(DescribeSimilarEventScenariosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSimilarEventScenarios", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSimilarEventScenariosResponse());
    }

    public DescribeSimilarEventScenariosResponse describeSimilarEventScenarios(DescribeSimilarEventScenariosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSimilarEventScenariosWithOptions(request, runtime);
    }

    public DescribeSimilarSecurityEventsResponse describeSimilarSecurityEventsWithOptions(DescribeSimilarSecurityEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSimilarSecurityEvents", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSimilarSecurityEventsResponse());
    }

    public DescribeSimilarSecurityEventsResponse describeSimilarSecurityEvents(DescribeSimilarSecurityEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSimilarSecurityEventsWithOptions(request, runtime);
    }

    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSnapshots", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSnapshotsResponse());
    }

    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    public DescribeStrategyResponse describeStrategyWithOptions(DescribeStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStrategy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStrategyResponse());
    }

    public DescribeStrategyResponse describeStrategy(DescribeStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStrategyWithOptions(request, runtime);
    }

    public DescribeStrategyExecDetailResponse describeStrategyExecDetailWithOptions(DescribeStrategyExecDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStrategyExecDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStrategyExecDetailResponse());
    }

    public DescribeStrategyExecDetailResponse describeStrategyExecDetail(DescribeStrategyExecDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStrategyExecDetailWithOptions(request, runtime);
    }

    public DescribeStrategyProcessResponse describeStrategyProcessWithOptions(DescribeStrategyProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStrategyProcess", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStrategyProcessResponse());
    }

    public DescribeStrategyProcessResponse describeStrategyProcess(DescribeStrategyProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStrategyProcessWithOptions(request, runtime);
    }

    public DescribeStrategyTargetResponse describeStrategyTargetWithOptions(DescribeStrategyTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeStrategyTarget", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeStrategyTargetResponse());
    }

    public DescribeStrategyTargetResponse describeStrategyTarget(DescribeStrategyTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeStrategyTargetWithOptions(request, runtime);
    }

    public DescribeSummaryInfoResponse describeSummaryInfoWithOptions(DescribeSummaryInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSummaryInfo", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSummaryInfoResponse());
    }

    public DescribeSummaryInfoResponse describeSummaryInfo(DescribeSummaryInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSummaryInfoWithOptions(request, runtime);
    }

    public DescribeSupportRegionResponse describeSupportRegionWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeSupportRegion", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSupportRegionResponse());
    }

    public DescribeSupportRegionResponse describeSupportRegion() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSupportRegionWithOptions(runtime);
    }

    public DescribeSuspEventDetailResponse describeSuspEventDetailWithOptions(DescribeSuspEventDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSuspEventDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSuspEventDetailResponse());
    }

    public DescribeSuspEventDetailResponse describeSuspEventDetail(DescribeSuspEventDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventDetailWithOptions(request, runtime);
    }

    public DescribeSuspEventQuaraFilesResponse describeSuspEventQuaraFilesWithOptions(DescribeSuspEventQuaraFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSuspEventQuaraFiles", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSuspEventQuaraFilesResponse());
    }

    public DescribeSuspEventQuaraFilesResponse describeSuspEventQuaraFiles(DescribeSuspEventQuaraFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventQuaraFilesWithOptions(request, runtime);
    }

    public DescribeSuspEventsResponse describeSuspEventsWithOptions(DescribeSuspEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSuspEvents", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSuspEventsResponse());
    }

    public DescribeSuspEventsResponse describeSuspEvents(DescribeSuspEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSuspEventsWithOptions(request, runtime);
    }

    public DescribeUniBackupDatabaseResponse describeUniBackupDatabaseWithOptions(DescribeUniBackupDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUniBackupDatabase", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUniBackupDatabaseResponse());
    }

    public DescribeUniBackupDatabaseResponse describeUniBackupDatabase(DescribeUniBackupDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUniBackupDatabaseWithOptions(request, runtime);
    }

    public DescribeUniBackupPoliciesResponse describeUniBackupPoliciesWithOptions(DescribeUniBackupPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUniBackupPolicies", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUniBackupPoliciesResponse());
    }

    public DescribeUniBackupPoliciesResponse describeUniBackupPolicies(DescribeUniBackupPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUniBackupPoliciesWithOptions(request, runtime);
    }

    public DescribeUniBackupPolicyDetailResponse describeUniBackupPolicyDetailWithOptions(DescribeUniBackupPolicyDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUniBackupPolicyDetail", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUniBackupPolicyDetailResponse());
    }

    public DescribeUniBackupPolicyDetailResponse describeUniBackupPolicyDetail(DescribeUniBackupPolicyDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUniBackupPolicyDetailWithOptions(request, runtime);
    }

    public DescribeUniBackupStatisticsResponse describeUniBackupStatisticsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeUniBackupStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUniBackupStatisticsResponse());
    }

    public DescribeUniBackupStatisticsResponse describeUniBackupStatistics() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUniBackupStatisticsWithOptions(runtime);
    }

    public DescribeUniRecoverableListResponse describeUniRecoverableListWithOptions(DescribeUniRecoverableListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUniRecoverableList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUniRecoverableListResponse());
    }

    public DescribeUniRecoverableListResponse describeUniRecoverableList(DescribeUniRecoverableListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUniRecoverableListWithOptions(request, runtime);
    }

    public DescribeUniSupportRegionResponse describeUniSupportRegionWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeUniSupportRegion", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUniSupportRegionResponse());
    }

    public DescribeUniSupportRegionResponse describeUniSupportRegion() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUniSupportRegionWithOptions(runtime);
    }

    public DescribeUserBackupMachinesResponse describeUserBackupMachinesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeUserBackupMachines", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserBackupMachinesResponse());
    }

    public DescribeUserBackupMachinesResponse describeUserBackupMachines() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserBackupMachinesWithOptions(runtime);
    }

    public DescribeUserBaselineAuthorizationResponse describeUserBaselineAuthorizationWithOptions(DescribeUserBaselineAuthorizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserBaselineAuthorization", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserBaselineAuthorizationResponse());
    }

    public DescribeUserBaselineAuthorizationResponse describeUserBaselineAuthorization(DescribeUserBaselineAuthorizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserBaselineAuthorizationWithOptions(request, runtime);
    }

    public DescribeUserLayoutAuthorizationResponse describeUserLayoutAuthorizationWithOptions(DescribeUserLayoutAuthorizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserLayoutAuthorization", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserLayoutAuthorizationResponse());
    }

    public DescribeUserLayoutAuthorizationResponse describeUserLayoutAuthorization(DescribeUserLayoutAuthorizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserLayoutAuthorizationWithOptions(request, runtime);
    }

    public DescribeUuidsByVulNamesResponse describeUuidsByVulNamesWithOptions(DescribeUuidsByVulNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUuidsByVulNames", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUuidsByVulNamesResponse());
    }

    public DescribeUuidsByVulNamesResponse describeUuidsByVulNames(DescribeUuidsByVulNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUuidsByVulNamesWithOptions(request, runtime);
    }

    public DescribeVersionConfigResponse describeVersionConfigWithOptions(DescribeVersionConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVersionConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVersionConfigResponse());
    }

    public DescribeVersionConfigResponse describeVersionConfig(DescribeVersionConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVersionConfigWithOptions(request, runtime);
    }

    public DescribeVolDingdingMessageResponse describeVolDingdingMessageWithOptions(DescribeVolDingdingMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVolDingdingMessage", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVolDingdingMessageResponse());
    }

    public DescribeVolDingdingMessageResponse describeVolDingdingMessage(DescribeVolDingdingMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVolDingdingMessageWithOptions(request, runtime);
    }

    public DescribeVpcHoneyPotCriteriaResponse describeVpcHoneyPotCriteriaWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeVpcHoneyPotCriteria", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpcHoneyPotCriteriaResponse());
    }

    public DescribeVpcHoneyPotCriteriaResponse describeVpcHoneyPotCriteria() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcHoneyPotCriteriaWithOptions(runtime);
    }

    public DescribeVpcHoneyPotListResponse describeVpcHoneyPotListWithOptions(DescribeVpcHoneyPotListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVpcHoneyPotList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpcHoneyPotListResponse());
    }

    public DescribeVpcHoneyPotListResponse describeVpcHoneyPotList(DescribeVpcHoneyPotListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcHoneyPotListWithOptions(request, runtime);
    }

    public DescribeVpcListResponse describeVpcListWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeVpcList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVpcListResponse());
    }

    public DescribeVpcListResponse describeVpcList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVpcListWithOptions(runtime);
    }

    public DescribeVulDetailsResponse describeVulDetailsWithOptions(DescribeVulDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVulDetails", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVulDetailsResponse());
    }

    public DescribeVulDetailsResponse describeVulDetails(DescribeVulDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulDetailsWithOptions(request, runtime);
    }

    public DescribeVulListResponse describeVulListWithOptions(DescribeVulListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVulList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVulListResponse());
    }

    public DescribeVulListResponse describeVulList(DescribeVulListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulListWithOptions(request, runtime);
    }

    public DescribeVulWhitelistResponse describeVulWhitelistWithOptions(DescribeVulWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVulWhitelist", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVulWhitelistResponse());
    }

    public DescribeVulWhitelistResponse describeVulWhitelist(DescribeVulWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVulWhitelistWithOptions(request, runtime);
    }

    public DescribeWarningMachinesResponse describeWarningMachinesWithOptions(DescribeWarningMachinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWarningMachines", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWarningMachinesResponse());
    }

    public DescribeWarningMachinesResponse describeWarningMachines(DescribeWarningMachinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWarningMachinesWithOptions(request, runtime);
    }

    public DescribeWebLockBindListResponse describeWebLockBindListWithOptions(DescribeWebLockBindListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebLockBindList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebLockBindListResponse());
    }

    public DescribeWebLockBindListResponse describeWebLockBindList(DescribeWebLockBindListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebLockBindListWithOptions(request, runtime);
    }

    public DescribeWebLockConfigListResponse describeWebLockConfigListWithOptions(DescribeWebLockConfigListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeWebLockConfigList", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeWebLockConfigListResponse());
    }

    public DescribeWebLockConfigListResponse describeWebLockConfigList(DescribeWebLockConfigListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeWebLockConfigListWithOptions(request, runtime);
    }

    public ExecStrategyResponse execStrategyWithOptions(ExecStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecStrategy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ExecStrategyResponse());
    }

    public ExecStrategyResponse execStrategy(ExecStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.execStrategyWithOptions(request, runtime);
    }

    public ExportRecordResponse exportRecordWithOptions(ExportRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportRecord", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ExportRecordResponse());
    }

    public ExportRecordResponse exportRecord(ExportRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportRecordWithOptions(request, runtime);
    }

    public FixCheckWarningsResponse fixCheckWarningsWithOptions(FixCheckWarningsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FixCheckWarnings", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new FixCheckWarningsResponse());
    }

    public FixCheckWarningsResponse fixCheckWarnings(FixCheckWarningsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fixCheckWarningsWithOptions(request, runtime);
    }

    public GetBackupStorageCountResponse getBackupStorageCountWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetBackupStorageCount", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetBackupStorageCountResponse());
    }

    public GetBackupStorageCountResponse getBackupStorageCount() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBackupStorageCountWithOptions(runtime);
    }

    public GetIncIOCsResponse getIncIOCsWithOptions(GetIncIOCsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIncIOCs", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetIncIOCsResponse());
    }

    public GetIncIOCsResponse getIncIOCs(GetIncIOCsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIncIOCsWithOptions(request, runtime);
    }

    public GetIOCsResponse getIOCsWithOptions(GetIOCsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIOCs", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetIOCsResponse());
    }

    public GetIOCsResponse getIOCs(GetIOCsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIOCsWithOptions(request, runtime);
    }

    public GetLocalInstallScriptResponse getLocalInstallScriptWithOptions(GetLocalInstallScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLocalInstallScript", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetLocalInstallScriptResponse());
    }

    public GetLocalInstallScriptResponse getLocalInstallScript(GetLocalInstallScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLocalInstallScriptWithOptions(request, runtime);
    }

    public GetLocalUninstallScriptResponse getLocalUninstallScriptWithOptions(GetLocalUninstallScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLocalUninstallScript", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetLocalUninstallScriptResponse());
    }

    public GetLocalUninstallScriptResponse getLocalUninstallScript(GetLocalUninstallScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLocalUninstallScriptWithOptions(request, runtime);
    }

    public GetSuspiciousStatisticsResponse getSuspiciousStatisticsWithOptions(GetSuspiciousStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSuspiciousStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetSuspiciousStatisticsResponse());
    }

    public GetSuspiciousStatisticsResponse getSuspiciousStatistics(GetSuspiciousStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSuspiciousStatisticsWithOptions(request, runtime);
    }

    public GetVulStatisticsResponse getVulStatisticsWithOptions(GetVulStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVulStatistics", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new GetVulStatisticsResponse());
    }

    public GetVulStatisticsResponse getVulStatistics(GetVulStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVulStatisticsWithOptions(request, runtime);
    }

    public HandleSecurityEventsResponse handleSecurityEventsWithOptions(HandleSecurityEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HandleSecurityEvents", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new HandleSecurityEventsResponse());
    }

    public HandleSecurityEventsResponse handleSecurityEvents(HandleSecurityEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.handleSecurityEventsWithOptions(request, runtime);
    }

    public HandleSimilarSecurityEventsResponse handleSimilarSecurityEventsWithOptions(HandleSimilarSecurityEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("HandleSimilarSecurityEvents", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new HandleSimilarSecurityEventsResponse());
    }

    public HandleSimilarSecurityEventsResponse handleSimilarSecurityEvents(HandleSimilarSecurityEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.handleSimilarSecurityEventsWithOptions(request, runtime);
    }

    public IgnoreHcCheckWarningsResponse ignoreHcCheckWarningsWithOptions(IgnoreHcCheckWarningsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("IgnoreHcCheckWarnings", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new IgnoreHcCheckWarningsResponse());
    }

    public IgnoreHcCheckWarningsResponse ignoreHcCheckWarnings(IgnoreHcCheckWarningsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.ignoreHcCheckWarningsWithOptions(request, runtime);
    }

    public InstallBackupClientResponse installBackupClientWithOptions(InstallBackupClientRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InstallBackupClient", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new InstallBackupClientResponse());
    }

    public InstallBackupClientResponse installBackupClient(InstallBackupClientRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installBackupClientWithOptions(request, runtime);
    }

    public InstallUniBackupAgentResponse installUniBackupAgentWithOptions(InstallUniBackupAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InstallUniBackupAgent", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new InstallUniBackupAgentResponse());
    }

    public InstallUniBackupAgentResponse installUniBackupAgent(InstallUniBackupAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installUniBackupAgentWithOptions(request, runtime);
    }

    public ModifyAntiBruteForceRuleResponse modifyAntiBruteForceRuleWithOptions(ModifyAntiBruteForceRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAntiBruteForceRule", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAntiBruteForceRuleResponse());
    }

    public ModifyAntiBruteForceRuleResponse modifyAntiBruteForceRule(ModifyAntiBruteForceRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAntiBruteForceRuleWithOptions(request, runtime);
    }

    public ModifyAssetGroupResponse modifyAssetGroupWithOptions(ModifyAssetGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAssetGroup", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAssetGroupResponse());
    }

    public ModifyAssetGroupResponse modifyAssetGroup(ModifyAssetGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAssetGroupWithOptions(request, runtime);
    }

    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyBackupPolicyShrinkRequest request = new ModifyBackupPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.policy)) {
            request.policyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.policy, "Policy", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPolicy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPolicyResponse());
    }

    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    public ModifyBackupPolicyStatusResponse modifyBackupPolicyStatusWithOptions(ModifyBackupPolicyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBackupPolicyStatus", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBackupPolicyStatusResponse());
    }

    public ModifyBackupPolicyStatusResponse modifyBackupPolicyStatus(ModifyBackupPolicyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBackupPolicyStatusWithOptions(request, runtime);
    }

    public ModifyCreateVulWhitelistResponse modifyCreateVulWhitelistWithOptions(ModifyCreateVulWhitelistRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCreateVulWhitelist", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCreateVulWhitelistResponse());
    }

    public ModifyCreateVulWhitelistResponse modifyCreateVulWhitelist(ModifyCreateVulWhitelistRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCreateVulWhitelistWithOptions(request, runtime);
    }

    public ModifyEmgVulSubmitResponse modifyEmgVulSubmitWithOptions(ModifyEmgVulSubmitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyEmgVulSubmit", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyEmgVulSubmitResponse());
    }

    public ModifyEmgVulSubmitResponse modifyEmgVulSubmit(ModifyEmgVulSubmitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyEmgVulSubmitWithOptions(request, runtime);
    }

    public ModifyGroupPropertyResponse modifyGroupPropertyWithOptions(ModifyGroupPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyGroupProperty", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyGroupPropertyResponse());
    }

    public ModifyGroupPropertyResponse modifyGroupProperty(ModifyGroupPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyGroupPropertyWithOptions(request, runtime);
    }

    public ModifyInstanceAntiBruteForceRuleResponse modifyInstanceAntiBruteForceRuleWithOptions(ModifyInstanceAntiBruteForceRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstanceAntiBruteForceRule", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceAntiBruteForceRuleResponse());
    }

    public ModifyInstanceAntiBruteForceRuleResponse modifyInstanceAntiBruteForceRule(ModifyInstanceAntiBruteForceRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceAntiBruteForceRuleWithOptions(request, runtime);
    }

    public ModifyLoginBaseConfigResponse modifyLoginBaseConfigWithOptions(ModifyLoginBaseConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLoginBaseConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLoginBaseConfigResponse());
    }

    public ModifyLoginBaseConfigResponse modifyLoginBaseConfig(ModifyLoginBaseConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLoginBaseConfigWithOptions(request, runtime);
    }

    public ModifyLoginSwitchConfigResponse modifyLoginSwitchConfigWithOptions(ModifyLoginSwitchConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyLoginSwitchConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyLoginSwitchConfigResponse());
    }

    public ModifyLoginSwitchConfigResponse modifyLoginSwitchConfig(ModifyLoginSwitchConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyLoginSwitchConfigWithOptions(request, runtime);
    }

    public ModifyNoticeConfigResponse modifyNoticeConfigWithOptions(ModifyNoticeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyNoticeConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyNoticeConfigResponse());
    }

    public ModifyNoticeConfigResponse modifyNoticeConfig(ModifyNoticeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyNoticeConfigWithOptions(request, runtime);
    }

    public ModifyOpenLogShipperResponse modifyOpenLogShipperWithOptions(ModifyOpenLogShipperRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyOpenLogShipper", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyOpenLogShipperResponse());
    }

    public ModifyOpenLogShipperResponse modifyOpenLogShipper(ModifyOpenLogShipperRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOpenLogShipperWithOptions(request, runtime);
    }

    public ModifyOperateVulResponse modifyOperateVulWithOptions(ModifyOperateVulRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyOperateVul", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyOperateVulResponse());
    }

    public ModifyOperateVulResponse modifyOperateVul(ModifyOperateVulRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOperateVulWithOptions(request, runtime);
    }

    public ModifyPushAllTaskResponse modifyPushAllTaskWithOptions(ModifyPushAllTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyPushAllTask", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyPushAllTaskResponse());
    }

    public ModifyPushAllTaskResponse modifyPushAllTask(ModifyPushAllTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyPushAllTaskWithOptions(request, runtime);
    }

    public ModifyRiskCheckStatusResponse modifyRiskCheckStatusWithOptions(ModifyRiskCheckStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRiskCheckStatus", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRiskCheckStatusResponse());
    }

    public ModifyRiskCheckStatusResponse modifyRiskCheckStatus(ModifyRiskCheckStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRiskCheckStatusWithOptions(request, runtime);
    }

    public ModifyRiskSingleResultStatusResponse modifyRiskSingleResultStatusWithOptions(ModifyRiskSingleResultStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRiskSingleResultStatus", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRiskSingleResultStatusResponse());
    }

    public ModifyRiskSingleResultStatusResponse modifyRiskSingleResultStatus(ModifyRiskSingleResultStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRiskSingleResultStatusWithOptions(request, runtime);
    }

    public ModifySecurityCheckScheduleConfigResponse modifySecurityCheckScheduleConfigWithOptions(ModifySecurityCheckScheduleConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySecurityCheckScheduleConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySecurityCheckScheduleConfigResponse());
    }

    public ModifySecurityCheckScheduleConfigResponse modifySecurityCheckScheduleConfig(ModifySecurityCheckScheduleConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySecurityCheckScheduleConfigWithOptions(request, runtime);
    }

    public ModifyStartVulScanResponse modifyStartVulScanWithOptions(ModifyStartVulScanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyStartVulScan", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyStartVulScanResponse());
    }

    public ModifyStartVulScanResponse modifyStartVulScan(ModifyStartVulScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStartVulScanWithOptions(request, runtime);
    }

    public ModifyStrategyResponse modifyStrategyWithOptions(ModifyStrategyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyStrategy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyStrategyResponse());
    }

    public ModifyStrategyResponse modifyStrategy(ModifyStrategyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStrategyWithOptions(request, runtime);
    }

    public ModifyStrategyTargetResponse modifyStrategyTargetWithOptions(ModifyStrategyTargetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyStrategyTarget", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyStrategyTargetResponse());
    }

    public ModifyStrategyTargetResponse modifyStrategyTarget(ModifyStrategyTargetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyStrategyTargetWithOptions(request, runtime);
    }

    public ModifyTagWithUuidResponse modifyTagWithUuidWithOptions(ModifyTagWithUuidRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyTagWithUuid", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyTagWithUuidResponse());
    }

    public ModifyTagWithUuidResponse modifyTagWithUuid(ModifyTagWithUuidRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyTagWithUuidWithOptions(request, runtime);
    }

    public ModifyUniBackupPolicyResponse modifyUniBackupPolicyWithOptions(ModifyUniBackupPolicyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyUniBackupPolicyShrinkRequest request = new ModifyUniBackupPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fullPlan)) {
            request.fullPlanShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fullPlan, "FullPlan", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.incPlan)) {
            request.incPlanShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.incPlan, "IncPlan", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyUniBackupPolicy", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyUniBackupPolicyResponse());
    }

    public ModifyUniBackupPolicyResponse modifyUniBackupPolicy(ModifyUniBackupPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyUniBackupPolicyWithOptions(request, runtime);
    }

    public ModifyVpcHoneyPotResponse modifyVpcHoneyPotWithOptions(ModifyVpcHoneyPotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVpcHoneyPot", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVpcHoneyPotResponse());
    }

    public ModifyVpcHoneyPotResponse modifyVpcHoneyPot(ModifyVpcHoneyPotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVpcHoneyPotWithOptions(request, runtime);
    }

    public ModifyVulTargetConfigResponse modifyVulTargetConfigWithOptions(ModifyVulTargetConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyVulTargetConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyVulTargetConfigResponse());
    }

    public ModifyVulTargetConfigResponse modifyVulTargetConfig(ModifyVulTargetConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyVulTargetConfigWithOptions(request, runtime);
    }

    public ModifyWebLockCreateConfigResponse modifyWebLockCreateConfigWithOptions(ModifyWebLockCreateConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebLockCreateConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebLockCreateConfigResponse());
    }

    public ModifyWebLockCreateConfigResponse modifyWebLockCreateConfig(ModifyWebLockCreateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebLockCreateConfigWithOptions(request, runtime);
    }

    public ModifyWebLockDeleteConfigResponse modifyWebLockDeleteConfigWithOptions(ModifyWebLockDeleteConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebLockDeleteConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebLockDeleteConfigResponse());
    }

    public ModifyWebLockDeleteConfigResponse modifyWebLockDeleteConfig(ModifyWebLockDeleteConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebLockDeleteConfigWithOptions(request, runtime);
    }

    public ModifyWebLockStartResponse modifyWebLockStartWithOptions(ModifyWebLockStartRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebLockStart", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebLockStartResponse());
    }

    public ModifyWebLockStartResponse modifyWebLockStart(ModifyWebLockStartRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebLockStartWithOptions(request, runtime);
    }

    public ModifyWebLockStatusResponse modifyWebLockStatusWithOptions(ModifyWebLockStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebLockStatus", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebLockStatusResponse());
    }

    public ModifyWebLockStatusResponse modifyWebLockStatus(ModifyWebLockStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebLockStatusWithOptions(request, runtime);
    }

    public ModifyWebLockUnbindResponse modifyWebLockUnbindWithOptions(ModifyWebLockUnbindRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebLockUnbind", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebLockUnbindResponse());
    }

    public ModifyWebLockUnbindResponse modifyWebLockUnbind(ModifyWebLockUnbindRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebLockUnbindWithOptions(request, runtime);
    }

    public ModifyWebLockUpdateConfigResponse modifyWebLockUpdateConfigWithOptions(ModifyWebLockUpdateConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyWebLockUpdateConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyWebLockUpdateConfigResponse());
    }

    public ModifyWebLockUpdateConfigResponse modifyWebLockUpdateConfig(ModifyWebLockUpdateConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyWebLockUpdateConfigWithOptions(request, runtime);
    }

    public OperateAgentClientInstallResponse operateAgentClientInstallWithOptions(OperateAgentClientInstallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateAgentClientInstall", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new OperateAgentClientInstallResponse());
    }

    public OperateAgentClientInstallResponse operateAgentClientInstall(OperateAgentClientInstallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateAgentClientInstallWithOptions(request, runtime);
    }

    public OperateSuspiciousTargetConfigResponse operateSuspiciousTargetConfigWithOptions(OperateSuspiciousTargetConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateSuspiciousTargetConfig", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new OperateSuspiciousTargetConfigResponse());
    }

    public OperateSuspiciousTargetConfigResponse operateSuspiciousTargetConfig(OperateSuspiciousTargetConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateSuspiciousTargetConfigWithOptions(request, runtime);
    }

    public OperateVulsResponse operateVulsWithOptions(OperateVulsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperateVuls", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new OperateVulsResponse());
    }

    public OperateVulsResponse operateVuls(OperateVulsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operateVulsWithOptions(request, runtime);
    }

    public OperationSuspEventsResponse operationSuspEventsWithOptions(OperationSuspEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OperationSuspEvents", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new OperationSuspEventsResponse());
    }

    public OperationSuspEventsResponse operationSuspEvents(OperationSuspEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.operationSuspEventsWithOptions(request, runtime);
    }

    public PauseClientResponse pauseClientWithOptions(PauseClientRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PauseClient", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new PauseClientResponse());
    }

    public PauseClientResponse pauseClient(PauseClientRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pauseClientWithOptions(request, runtime);
    }

    public QueryDiscoverDatabaseResponse queryDiscoverDatabaseWithOptions(QueryDiscoverDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDiscoverDatabase", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDiscoverDatabaseResponse());
    }

    public QueryDiscoverDatabaseResponse queryDiscoverDatabase(QueryDiscoverDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDiscoverDatabaseWithOptions(request, runtime);
    }

    public QueryPreCheckDatabaseResponse queryPreCheckDatabaseWithOptions(QueryPreCheckDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPreCheckDatabase", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPreCheckDatabaseResponse());
    }

    public QueryPreCheckDatabaseResponse queryPreCheckDatabase(QueryPreCheckDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPreCheckDatabaseWithOptions(request, runtime);
    }

    public RefreshAssetsResponse refreshAssetsWithOptions(RefreshAssetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshAssets", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshAssetsResponse());
    }

    public RefreshAssetsResponse refreshAssets(RefreshAssetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshAssetsWithOptions(request, runtime);
    }

    public RefreshContainerAssetsResponse refreshContainerAssetsWithOptions(RefreshContainerAssetsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefreshContainerAssets", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new RefreshContainerAssetsResponse());
    }

    public RefreshContainerAssetsResponse refreshContainerAssets(RefreshContainerAssetsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refreshContainerAssetsWithOptions(request, runtime);
    }

    public RollbackSuspEventQuaraFileResponse rollbackSuspEventQuaraFileWithOptions(RollbackSuspEventQuaraFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RollbackSuspEventQuaraFile", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new RollbackSuspEventQuaraFileResponse());
    }

    public RollbackSuspEventQuaraFileResponse rollbackSuspEventQuaraFile(RollbackSuspEventQuaraFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.rollbackSuspEventQuaraFileWithOptions(request, runtime);
    }

    public SasInstallCodeResponse sasInstallCodeWithOptions(SasInstallCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SasInstallCode", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new SasInstallCodeResponse());
    }

    public SasInstallCodeResponse sasInstallCode(SasInstallCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sasInstallCodeWithOptions(request, runtime);
    }

    public StartBaselineSecurityCheckResponse startBaselineSecurityCheckWithOptions(StartBaselineSecurityCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartBaselineSecurityCheck", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new StartBaselineSecurityCheckResponse());
    }

    public StartBaselineSecurityCheckResponse startBaselineSecurityCheck(StartBaselineSecurityCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startBaselineSecurityCheckWithOptions(request, runtime);
    }

    public StartDiscoverDatabaseTaskResponse startDiscoverDatabaseTaskWithOptions(StartDiscoverDatabaseTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartDiscoverDatabaseTask", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new StartDiscoverDatabaseTaskResponse());
    }

    public StartDiscoverDatabaseTaskResponse startDiscoverDatabaseTask(StartDiscoverDatabaseTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startDiscoverDatabaseTaskWithOptions(request, runtime);
    }

    public StartImageVulScanResponse startImageVulScanWithOptions(StartImageVulScanRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartImageVulScan", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new StartImageVulScanResponse());
    }

    public StartImageVulScanResponse startImageVulScan(StartImageVulScanRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startImageVulScanWithOptions(request, runtime);
    }

    public StartPreCheckDatabaseResponse startPreCheckDatabaseWithOptions(StartPreCheckDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartPreCheckDatabase", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new StartPreCheckDatabaseResponse());
    }

    public StartPreCheckDatabaseResponse startPreCheckDatabase(StartPreCheckDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startPreCheckDatabaseWithOptions(request, runtime);
    }

    public StartVirusScanTaskResponse startVirusScanTaskWithOptions(StartVirusScanTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartVirusScanTask", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new StartVirusScanTaskResponse());
    }

    public StartVirusScanTaskResponse startVirusScanTask(StartVirusScanTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startVirusScanTaskWithOptions(request, runtime);
    }

    public UnbindAegisResponse unbindAegisWithOptions(UnbindAegisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnbindAegis", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new UnbindAegisResponse());
    }

    public UnbindAegisResponse unbindAegis(UnbindAegisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindAegisWithOptions(request, runtime);
    }

    public UninstallBackupClientResponse uninstallBackupClientWithOptions(UninstallBackupClientRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UninstallBackupClient", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new UninstallBackupClientResponse());
    }

    public UninstallBackupClientResponse uninstallBackupClient(UninstallBackupClientRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uninstallBackupClientWithOptions(request, runtime);
    }

    public UninstallUniBackupAgentResponse uninstallUniBackupAgentWithOptions(UninstallUniBackupAgentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UninstallUniBackupAgent", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new UninstallUniBackupAgentResponse());
    }

    public UninstallUniBackupAgentResponse uninstallUniBackupAgent(UninstallUniBackupAgentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uninstallUniBackupAgentWithOptions(request, runtime);
    }

    public UpgradeBackupPolicyVersionResponse upgradeBackupPolicyVersionWithOptions(UpgradeBackupPolicyVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeBackupPolicyVersion", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeBackupPolicyVersionResponse());
    }

    public UpgradeBackupPolicyVersionResponse upgradeBackupPolicyVersion(UpgradeBackupPolicyVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeBackupPolicyVersionWithOptions(request, runtime);
    }

    public ValidateHcWarningsResponse validateHcWarningsWithOptions(ValidateHcWarningsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ValidateHcWarnings", "2018-12-03", "HTTPS", "POST", "AK", "json", req, runtime), new ValidateHcWarningsResponse());
    }

    public ValidateHcWarningsResponse validateHcWarnings(ValidateHcWarningsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateHcWarningsWithOptions(request, runtime);
    }
}
