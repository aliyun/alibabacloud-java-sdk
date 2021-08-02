// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224;

import com.aliyun.tea.*;
import com.aliyun.retailbot20210224.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("retailbot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public UpdateRobotResponse updateRobotWithOptions(UpdateRobotRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateRobotShrinkRequest request = new UpdateRobotShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.robotDTO))) {
            request.robotDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.robotDTO), "RobotDTO", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRobot", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRobotResponse());
    }

    public UpdateRobotResponse updateRobot(UpdateRobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRobotWithOptions(request, runtime);
    }

    public InstallPackageResponse installPackageWithOptions(InstallPackageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InstallPackageShrinkRequest request = new InstallPackageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packages)) {
            request.packagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packages, "Packages", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InstallPackage", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new InstallPackageResponse());
    }

    public InstallPackageResponse installPackage(InstallPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installPackageWithOptions(request, runtime);
    }

    public ListSubscriptionByPackageResponse listSubscriptionByPackageWithOptions(ListSubscriptionByPackageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSubscriptionByPackageShrinkRequest request = new ListSubscriptionByPackageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.packageDTO))) {
            request.packageDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.packageDTO), "PackageDTO", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.pageData))) {
            request.pageDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.pageData), "PageData", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSubscriptionByPackage", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListSubscriptionByPackageResponse());
    }

    public ListSubscriptionByPackageResponse listSubscriptionByPackage(ListSubscriptionByPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSubscriptionByPackageWithOptions(request, runtime);
    }

    public DeleteRobotResponse deleteRobotWithOptions(DeleteRobotRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteRobotShrinkRequest request = new DeleteRobotShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRobot", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRobotResponse());
    }

    public DeleteRobotResponse deleteRobot(DeleteRobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRobotWithOptions(request, runtime);
    }

    public OlineIsvTestResponse olineIsvTestWithOptions(OlineIsvTestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OlineIsvTest", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new OlineIsvTestResponse());
    }

    public OlineIsvTestResponse olineIsvTest(OlineIsvTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.olineIsvTestWithOptions(request, runtime);
    }

    public ReleaseServiceTestResponse releaseServiceTestWithOptions(ReleaseServiceTestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseServiceTest", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseServiceTestResponse());
    }

    public ReleaseServiceTestResponse releaseServiceTest(ReleaseServiceTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseServiceTestWithOptions(request, runtime);
    }

    public VerifyOrderResponse verifyOrderWithOptions(VerifyOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyOrder", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyOrderResponse());
    }

    public VerifyOrderResponse verifyOrder(VerifyOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyOrderWithOptions(request, runtime);
    }

    public UpdateSolutionResponse updateSolutionWithOptions(UpdateSolutionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSolutionShrinkRequest request = new UpdateSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.solution))) {
            request.solutionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.solution), "Solution", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSolution", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSolutionResponse());
    }

    public UpdateSolutionResponse updateSolution(UpdateSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSolutionWithOptions(request, runtime);
    }

    public ListSubscribedPackageKnowledgesResponse listSubscribedPackageKnowledgesWithOptions(ListSubscribedPackageKnowledgesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSubscribedPackageKnowledges", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListSubscribedPackageKnowledgesResponse());
    }

    public ListSubscribedPackageKnowledgesResponse listSubscribedPackageKnowledges(ListSubscribedPackageKnowledgesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSubscribedPackageKnowledgesWithOptions(request, runtime);
    }

    public AdminTestSeviceResponse adminTestSeviceWithOptions(AdminTestSeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AdminTestSevice", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new AdminTestSeviceResponse());
    }

    public AdminTestSeviceResponse adminTestSevice(AdminTestSeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.adminTestSeviceWithOptions(request, runtime);
    }

    public ProcessMessageResponse processMessageWithOptions(ProcessMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ProcessMessage", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ProcessMessageResponse());
    }

    public ProcessMessageResponse processMessage(ProcessMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.processMessageWithOptions(request, runtime);
    }

    public UninstallPackageResponse uninstallPackageWithOptions(UninstallPackageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UninstallPackageShrinkRequest request = new UninstallPackageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packages)) {
            request.packagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packages, "Packages", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UninstallPackage", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new UninstallPackageResponse());
    }

    public UninstallPackageResponse uninstallPackage(UninstallPackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uninstallPackageWithOptions(request, runtime);
    }

    public UpgradeIsvConfigResponse upgradeIsvConfigWithOptions(UpgradeIsvConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeIsvConfig", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeIsvConfigResponse());
    }

    public UpgradeIsvConfigResponse upgradeIsvConfig(UpgradeIsvConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeIsvConfigWithOptions(request, runtime);
    }

    public AddSolutionResponse addSolutionWithOptions(AddSolutionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddSolutionShrinkRequest request = new AddSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.solution))) {
            request.solutionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.solution), "Solution", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSolution", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new AddSolutionResponse());
    }

    public AddSolutionResponse addSolution(AddSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSolutionWithOptions(request, runtime);
    }

    public UpgradePackageResponse upgradePackageWithOptions(UpgradePackageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpgradePackageShrinkRequest request = new UpgradePackageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.robotCodes)) {
            request.robotCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.robotCodes, "RobotCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.packageDTO))) {
            request.packageDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.packageDTO), "PackageDTO", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradePackage", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradePackageResponse());
    }

    public UpgradePackageResponse upgradePackage(UpgradePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradePackageWithOptions(request, runtime);
    }

    public ListIndustryPackagesResponse listIndustryPackagesWithOptions(ListIndustryPackagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIndustryPackages", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListIndustryPackagesResponse());
    }

    public ListIndustryPackagesResponse listIndustryPackages(ListIndustryPackagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIndustryPackagesWithOptions(request, runtime);
    }

    public UploadLabelDataResponse uploadLabelDataWithOptions(UploadLabelDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadLabelData", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new UploadLabelDataResponse());
    }

    public UploadLabelDataResponse uploadLabelData(UploadLabelDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadLabelDataWithOptions(request, runtime);
    }

    public RecognizeMessageForTestResponse recognizeMessageForTestWithOptions(RecognizeMessageForTestRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecognizeMessageForTestShrinkRequest request = new RecognizeMessageForTestShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraContent)) {
            request.extraContentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraContent, "ExtraContent", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orders)) {
            request.ordersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orders, "Orders", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.items)) {
            request.itemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.items, "Items", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.clientInfo))) {
            request.clientInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.clientInfo), "ClientInfo", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeMessageForTest", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new RecognizeMessageForTestResponse());
    }

    public RecognizeMessageForTestResponse recognizeMessageForTest(RecognizeMessageForTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMessageForTestWithOptions(request, runtime);
    }

    public ListCategoriesResponse listCategoriesWithOptions(ListCategoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCategories", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListCategoriesResponse());
    }

    public ListCategoriesResponse listCategories(ListCategoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCategoriesWithOptions(request, runtime);
    }

    public SyncRobotMessageResponse syncRobotMessageWithOptions(SyncRobotMessageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncRobotMessageShrinkRequest request = new SyncRobotMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.solutions)) {
            request.solutionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.solutions, "Solutions", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncRobotMessage", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new SyncRobotMessageResponse());
    }

    public SyncRobotMessageResponse syncRobotMessage(SyncRobotMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncRobotMessageWithOptions(request, runtime);
    }

    public EnableSceneResponse enableSceneWithOptions(EnableSceneRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EnableSceneShrinkRequest request = new EnableSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.knowledgeIds)) {
            request.knowledgeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.knowledgeIds, "KnowledgeIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableScene", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new EnableSceneResponse());
    }

    public EnableSceneResponse enableScene(EnableSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSceneWithOptions(request, runtime);
    }

    public ListSyncRobotMessagesResponse listSyncRobotMessagesWithOptions(ListSyncRobotMessagesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSyncRobotMessagesShrinkRequest request = new ListSyncRobotMessagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.robotMessageDTOList)) {
            request.robotMessageDTOListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.robotMessageDTOList, "RobotMessageDTOList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSyncRobotMessages", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListSyncRobotMessagesResponse());
    }

    public ListSyncRobotMessagesResponse listSyncRobotMessages(ListSyncRobotMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSyncRobotMessagesWithOptions(request, runtime);
    }

    public CreateRobotResponse createRobotWithOptions(CreateRobotRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRobotShrinkRequest request = new CreateRobotShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.robotDTO))) {
            request.robotDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.robotDTO), "RobotDTO", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.operator))) {
            request.operatorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.operator), "Operator", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRobot", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRobotResponse());
    }

    public CreateRobotResponse createRobot(CreateRobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRobotWithOptions(request, runtime);
    }

    public RecognizeMessageResponse recognizeMessageWithOptions(RecognizeMessageRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RecognizeMessageShrinkRequest request = new RecognizeMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraContent)) {
            request.extraContentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraContent, "ExtraContent", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orders)) {
            request.ordersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orders, "Orders", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.items)) {
            request.itemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.items, "Items", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packages)) {
            request.packagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packages, "Packages", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.clientInfo))) {
            request.clientInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.clientInfo), "ClientInfo", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RecognizeMessage", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new RecognizeMessageResponse());
    }

    public RecognizeMessageResponse recognizeMessage(RecognizeMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.recognizeMessageWithOptions(request, runtime);
    }

    public ListPackageKnowledgesResponse listPackageKnowledgesWithOptions(ListPackageKnowledgesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPackageKnowledges", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListPackageKnowledgesResponse());
    }

    public ListPackageKnowledgesResponse listPackageKnowledges(ListPackageKnowledgesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPackageKnowledgesWithOptions(request, runtime);
    }

    public SyncMessageResponse syncMessageWithOptions(SyncMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncMessage", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new SyncMessageResponse());
    }

    public SyncMessageResponse syncMessage(SyncMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncMessageWithOptions(request, runtime);
    }

    public GetKnowledgeResponse getKnowledgeWithOptions(GetKnowledgeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetKnowledge", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetKnowledgeResponse());
    }

    public GetKnowledgeResponse getKnowledge(GetKnowledgeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getKnowledgeWithOptions(request, runtime);
    }

    public DisableSceneResponse disableSceneWithOptions(DisableSceneRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DisableSceneShrinkRequest request = new DisableSceneShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.knowledgeIds)) {
            request.knowledgeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.knowledgeIds, "KnowledgeIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableScene", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new DisableSceneResponse());
    }

    public DisableSceneResponse disableScene(DisableSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSceneWithOptions(request, runtime);
    }

    public DeleteSolutionResponse deleteSolutionWithOptions(DeleteSolutionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteSolutionShrinkRequest request = new DeleteSolutionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.solutionIds)) {
            request.solutionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.solutionIds, "SolutionIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSolution", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSolutionResponse());
    }

    public DeleteSolutionResponse deleteSolution(DeleteSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSolutionWithOptions(request, runtime);
    }

    public RefundResponse refundWithOptions(RefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("Refund", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new RefundResponse());
    }

    public RefundResponse refund(RefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundWithOptions(request, runtime);
    }

    public ListPackageVersionsResponse listPackageVersionsWithOptions(ListPackageVersionsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPackageVersionsShrinkRequest request = new ListPackageVersionsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packageCodes)) {
            request.packageCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packageCodes, "PackageCodes", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPackageVersions", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListPackageVersionsResponse());
    }

    public ListPackageVersionsResponse listPackageVersions(ListPackageVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPackageVersionsWithOptions(request, runtime);
    }

    public ListSyncMessagesResponse listSyncMessagesWithOptions(ListSyncMessagesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSyncMessagesShrinkRequest request = new ListSyncMessagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.messageDTOList)) {
            request.messageDTOListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.messageDTOList, "MessageDTOList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSyncMessages", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListSyncMessagesResponse());
    }

    public ListSyncMessagesResponse listSyncMessages(ListSyncMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSyncMessagesWithOptions(request, runtime);
    }

    public GetPackageVersionResponse getPackageVersionWithOptions(GetPackageVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPackageVersion", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetPackageVersionResponse());
    }

    public GetPackageVersionResponse getPackageVersion(GetPackageVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPackageVersionWithOptions(request, runtime);
    }

    public ListSubscriptionByRobotResponse listSubscriptionByRobotWithOptions(ListSubscriptionByRobotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSubscriptionByRobot", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new ListSubscriptionByRobotResponse());
    }

    public ListSubscriptionByRobotResponse listSubscriptionByRobot(ListSubscriptionByRobotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSubscriptionByRobotWithOptions(request, runtime);
    }

    public PayOrderCallbackResponse payOrderCallbackWithOptions(PayOrderCallbackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PayOrderCallback", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new PayOrderCallbackResponse());
    }

    public PayOrderCallbackResponse payOrderCallback(PayOrderCallbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.payOrderCallbackWithOptions(request, runtime);
    }

    public GetSolutionResponse getSolutionWithOptions(GetSolutionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSolution", "2021-02-24", "HTTPS", "POST", "AK", "json", req, runtime), new GetSolutionResponse());
    }

    public GetSolutionResponse getSolution(GetSolutionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSolutionWithOptions(request, runtime);
    }
}
