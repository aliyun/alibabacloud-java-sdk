// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212;

import com.aliyun.tea.*;
import com.aliyun.unimkt20181212.models.*;
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
            new TeaPair("cn-hangzhou", "cloudcode.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "cloudcode.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("unimkt", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ChangeMediaStatusResponse changeMediaStatusWithOptions(ChangeMediaStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeMediaStatus", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeMediaStatusResponse());
    }

    public ChangeMediaStatusResponse changeMediaStatus(ChangeMediaStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeMediaStatusWithOptions(request, runtime);
    }

    public ChangeSlotStatusResponse changeSlotStatusWithOptions(ChangeSlotStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeSlotStatus", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeSlotStatusResponse());
    }

    public ChangeSlotStatusResponse changeSlotStatus(ChangeSlotStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeSlotStatusWithOptions(request, runtime);
    }

    public ChangeTenantStatusResponse changeTenantStatusWithOptions(ChangeTenantStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeTenantStatus", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeTenantStatusResponse());
    }

    public ChangeTenantStatusResponse changeTenantStatus(ChangeTenantStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeTenantStatusWithOptions(request, runtime);
    }

    public ChangeTenantUserStatusResponse changeTenantUserStatusWithOptions(ChangeTenantUserStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeTenantUserStatus", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeTenantUserStatusResponse());
    }

    public ChangeTenantUserStatusResponse changeTenantUserStatus(ChangeTenantUserStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeTenantUserStatusWithOptions(request, runtime);
    }

    public ChargeLaunchResponse chargeLaunchWithOptions(ChargeLaunchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChargeLaunch", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ChargeLaunchResponse());
    }

    public ChargeLaunchResponse chargeLaunch(ChargeLaunchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.chargeLaunchWithOptions(request, runtime);
    }

    public CheckDeviceResponse checkDeviceWithOptions(CheckDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CheckDeviceResponse());
    }

    public CheckDeviceResponse checkDevice(CheckDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDeviceWithOptions(request, runtime);
    }

    public CheckReceivingDetailResponse checkReceivingDetailWithOptions(CheckReceivingDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckReceivingDetail", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CheckReceivingDetailResponse());
    }

    public CheckReceivingDetailResponse checkReceivingDetail(CheckReceivingDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkReceivingDetailWithOptions(request, runtime);
    }

    public CheckTenantBizResponse checkTenantBizWithOptions(CheckTenantBizRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckTenantBiz", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CheckTenantBizResponse());
    }

    public CheckTenantBizResponse checkTenantBiz(CheckTenantBizRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkTenantBizWithOptions(request, runtime);
    }

    public CountUserResponse countUserWithOptions(CountUserRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CountUserShrinkRequest request = new CountUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sspUser)) {
            request.sspUserShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sspUser, "SspUser", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CountUser", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CountUserResponse());
    }

    public CountUserResponse countUser(CountUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countUserWithOptions(request, runtime);
    }

    public CreateCalculationResponse createCalculationWithOptions(CreateCalculationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCalculation", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCalculationResponse());
    }

    public CreateCalculationResponse createCalculation(CreateCalculationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCalculationWithOptions(request, runtime);
    }

    public CreateFlowResponse createFlowWithOptions(CreateFlowRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFlowShrinkRequest request = new CreateFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.flow)) {
            request.flowShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.flow, "Flow", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlowResponse());
    }

    public CreateFlowResponse createFlow(CreateFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlowWithOptions(request, runtime);
    }

    public CreateMediaResponse createMediaWithOptions(CreateMediaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMediaShrinkRequest request = new CreateMediaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.media)) {
            request.mediaShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.media, "Media", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMedia", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMediaResponse());
    }

    public CreateMediaResponse createMedia(CreateMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMediaWithOptions(request, runtime);
    }

    public CreateProxyBrandUserResponse createProxyBrandUserWithOptions(CreateProxyBrandUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProxyBrandUser", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProxyBrandUserResponse());
    }

    public CreateProxyBrandUserResponse createProxyBrandUser(CreateProxyBrandUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProxyBrandUserWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateRuleShrinkRequest request = new CreateRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adRule)) {
            request.adRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adRule, "AdRule", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRule", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateSlotResponse createSlotWithOptions(CreateSlotRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSlotShrinkRequest request = new CreateSlotShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adSlot)) {
            request.adSlotShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adSlot, "AdSlot", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSlot", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSlotResponse());
    }

    public CreateSlotResponse createSlot(CreateSlotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSlotWithOptions(request, runtime);
    }

    public CreateTenantResponse createTenantWithOptions(CreateTenantRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTenantShrinkRequest request = new CreateTenantShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenant)) {
            request.tenantShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenant, "Tenant", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTenant", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTenantResponse());
    }

    public CreateTenantResponse createTenant(CreateTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTenantWithOptions(request, runtime);
    }

    public CreateTenantUserResponse createTenantUserWithOptions(CreateTenantUserRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTenantUserShrinkRequest request = new CreateTenantUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantUser)) {
            request.tenantUserShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantUser, "TenantUser", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTenantUser", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTenantUserResponse());
    }

    public CreateTenantUserResponse createTenantUser(CreateTenantUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTenantUserWithOptions(request, runtime);
    }

    public CreateUnionTaskResponse createUnionTaskWithOptions(CreateUnionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUnionTask", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUnionTaskResponse());
    }

    public CreateUnionTaskResponse createUnionTask(CreateUnionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUnionTaskWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUserShrinkRequest request = new CreateUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sspUser)) {
            request.sspUserShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sspUser, "SspUser", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUser", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserResponse());
    }

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public CreatesSlotTemplateResponse createsSlotTemplateWithOptions(CreatesSlotTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatesSlotTemplateShrinkRequest request = new CreatesSlotTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adSlotTemplate)) {
            request.adSlotTemplateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adSlotTemplate, "AdSlotTemplate", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatesSlotTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new CreatesSlotTemplateResponse());
    }

    public CreatesSlotTemplateResponse createsSlotTemplate(CreatesSlotTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createsSlotTemplateWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteRuleShrinkRequest request = new DeleteRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adRule)) {
            request.adRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adRule, "AdRule", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRule", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public EndUnionTaskResponse endUnionTaskWithOptions(EndUnionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EndUnionTask", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new EndUnionTaskResponse());
    }

    public EndUnionTaskResponse endUnionTask(EndUnionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.endUnionTaskWithOptions(request, runtime);
    }

    public GetUnionTaskStatusResponse getUnionTaskStatusWithOptions(GetUnionTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUnionTaskStatus", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new GetUnionTaskStatusResponse());
    }

    public GetUnionTaskStatusResponse getUnionTaskStatus(GetUnionTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUnionTaskStatusWithOptions(request, runtime);
    }

    public KeepAliveResponse keepAliveWithOptions(KeepAliveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("KeepAlive", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new KeepAliveResponse());
    }

    public KeepAliveResponse keepAlive(KeepAliveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.keepAliveWithOptions(request, runtime);
    }

    public ListFlowResponse listFlowWithOptions(ListFlowRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListFlowShrinkRequest request = new ListFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listFlow)) {
            request.listFlowShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listFlow, "ListFlow", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListFlowResponse());
    }

    public ListFlowResponse listFlow(ListFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFlowWithOptions(request, runtime);
    }

    public ListMediaResponse listMediaWithOptions(ListMediaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMediaShrinkRequest request = new ListMediaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mediaName)) {
            request.mediaNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mediaName, "MediaName", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMedia", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListMediaResponse());
    }

    public ListMediaResponse listMedia(ListMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMediaWithOptions(request, runtime);
    }

    public ListMediaNameResponse listMediaNameWithOptions(ListMediaNameRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMediaNameShrinkRequest request = new ListMediaNameShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mediaName)) {
            request.mediaNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mediaName, "MediaName", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMediaName", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListMediaNameResponse());
    }

    public ListMediaNameResponse listMediaName(ListMediaNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMediaNameWithOptions(request, runtime);
    }

    public ListRuleResponse listRuleWithOptions(ListRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRule", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListRuleResponse());
    }

    public ListRuleResponse listRule(ListRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleWithOptions(request, runtime);
    }

    public ListRuleAreaResponse listRuleAreaWithOptions(ListRuleAreaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRuleArea", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListRuleAreaResponse());
    }

    public ListRuleAreaResponse listRuleArea(ListRuleAreaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleAreaWithOptions(request, runtime);
    }

    public ListSlotResponse listSlotWithOptions(ListSlotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSlot", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListSlotResponse());
    }

    public ListSlotResponse listSlot(ListSlotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSlotWithOptions(request, runtime);
    }

    public ListTenantResponse listTenantWithOptions(ListTenantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTenant", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListTenantResponse());
    }

    public ListTenantResponse listTenant(ListTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTenantWithOptions(request, runtime);
    }

    public ListTenantNameResponse listTenantNameWithOptions(ListTenantNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTenantName", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListTenantNameResponse());
    }

    public ListTenantNameResponse listTenantName(ListTenantNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTenantNameWithOptions(request, runtime);
    }

    public ListUserResponse listUserWithOptions(ListUserRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListUserShrinkRequest request = new ListUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sspUser)) {
            request.sspUserShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sspUser, "SspUser", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUser", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserResponse());
    }

    public ListUserResponse listUser(ListUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserWithOptions(request, runtime);
    }

    public ModifyMediaResponse modifyMediaWithOptions(ModifyMediaRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyMediaShrinkRequest request = new ModifyMediaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.media)) {
            request.mediaShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.media, "Media", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyMedia", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyMediaResponse());
    }

    public ModifyMediaResponse modifyMedia(ModifyMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyMediaWithOptions(request, runtime);
    }

    public ModifyRuleResponse modifyRuleWithOptions(ModifyRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyRuleShrinkRequest request = new ModifyRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adRule)) {
            request.adRuleShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adRule, "AdRule", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyRule", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyRuleResponse());
    }

    public ModifyRuleResponse modifyRule(ModifyRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyRuleWithOptions(request, runtime);
    }

    public ModifySlotResponse modifySlotWithOptions(ModifySlotRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifySlotShrinkRequest request = new ModifySlotShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adSlot)) {
            request.adSlotShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adSlot, "AdSlot", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySlot", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySlotResponse());
    }

    public ModifySlotResponse modifySlot(ModifySlotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySlotWithOptions(request, runtime);
    }

    public ModifySlotTemplateResponse modifySlotTemplateWithOptions(ModifySlotTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifySlotTemplateShrinkRequest request = new ModifySlotTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.adSlotTemplate)) {
            request.adSlotTemplateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.adSlotTemplate, "AdSlotTemplate", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifySlotTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifySlotTemplateResponse());
    }

    public ModifySlotTemplateResponse modifySlotTemplate(ModifySlotTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifySlotTemplateWithOptions(request, runtime);
    }

    public ModifyTenantInfoResponse modifyTenantInfoWithOptions(ModifyTenantInfoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyTenantInfoShrinkRequest request = new ModifyTenantInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenant)) {
            request.tenantShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenant, "Tenant", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyTenantInfo", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyTenantInfoResponse());
    }

    public ModifyTenantInfoResponse modifyTenantInfo(ModifyTenantInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyTenantInfoWithOptions(request, runtime);
    }

    public PushDeviceStatusResponse pushDeviceStatusWithOptions(PushDeviceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushDeviceStatus", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new PushDeviceStatusResponse());
    }

    public PushDeviceStatusResponse pushDeviceStatus(PushDeviceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushDeviceStatusWithOptions(request, runtime);
    }

    public PushExtraTradeDetailResponse pushExtraTradeDetailWithOptions(PushExtraTradeDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushExtraTradeDetail", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new PushExtraTradeDetailResponse());
    }

    public PushExtraTradeDetailResponse pushExtraTradeDetail(PushExtraTradeDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushExtraTradeDetailWithOptions(request, runtime);
    }

    public PushFaultEventResponse pushFaultEventWithOptions(PushFaultEventRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushFaultEvent", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new PushFaultEventResponse());
    }

    public PushFaultEventResponse pushFaultEvent(PushFaultEventRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushFaultEventWithOptions(request, runtime);
    }

    public PushTradeDetailResponse pushTradeDetailWithOptions(PushTradeDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushTradeDetail", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new PushTradeDetailResponse());
    }

    public PushTradeDetailResponse pushTradeDetail(PushTradeDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushTradeDetailWithOptions(request, runtime);
    }

    public QueryAppPromotionResponse queryAppPromotionWithOptions(QueryAppPromotionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAppPromotion", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAppPromotionResponse());
    }

    public QueryAppPromotionResponse queryAppPromotion(QueryAppPromotionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppPromotionWithOptions(request, runtime);
    }

    public QueryAppTasksResponse queryAppTasksWithOptions(QueryAppTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAppTasks", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAppTasksResponse());
    }

    public QueryAppTasksResponse queryAppTasks(QueryAppTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppTasksWithOptions(request, runtime);
    }

    public QueryAvailableBalanceResponse queryAvailableBalanceWithOptions(QueryAvailableBalanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAvailableBalance", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAvailableBalanceResponse());
    }

    public QueryAvailableBalanceResponse queryAvailableBalance(QueryAvailableBalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAvailableBalanceWithOptions(request, runtime);
    }

    public QueryChannelHistoryDataResponse queryChannelHistoryDataWithOptions(QueryChannelHistoryDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryChannelHistoryData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryChannelHistoryDataResponse());
    }

    public QueryChannelHistoryDataResponse queryChannelHistoryData(QueryChannelHistoryDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryChannelHistoryDataWithOptions(request, runtime);
    }

    public QueryContentInfoResponse queryContentInfoWithOptions(QueryContentInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryContentInfo", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryContentInfoResponse());
    }

    public QueryContentInfoResponse queryContentInfo(QueryContentInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryContentInfoWithOptions(request, runtime);
    }

    public QueryContentListResponse queryContentListWithOptions(QueryContentListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryContentList", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryContentListResponse());
    }

    public QueryContentListResponse queryContentList(QueryContentListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryContentListWithOptions(request, runtime);
    }

    public QueryFlowResponse queryFlowWithOptions(QueryFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFlowResponse());
    }

    public QueryFlowResponse queryFlow(QueryFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFlowWithOptions(request, runtime);
    }

    public QueryIncomeDataResponse queryIncomeDataWithOptions(QueryIncomeDataRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryIncomeDataShrinkRequest request = new QueryIncomeDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mediaName)) {
            request.mediaNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mediaName, "MediaName", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryIncomeData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryIncomeDataResponse());
    }

    public QueryIncomeDataResponse queryIncomeData(QueryIncomeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIncomeDataWithOptions(request, runtime);
    }

    public QueryIncomeTrendResponse queryIncomeTrendWithOptions(QueryIncomeTrendRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryIncomeTrendShrinkRequest request = new QueryIncomeTrendShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.mediaName)) {
            request.mediaNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.mediaName, "MediaName", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryIncomeTrend", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryIncomeTrendResponse());
    }

    public QueryIncomeTrendResponse queryIncomeTrend(QueryIncomeTrendRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIncomeTrendWithOptions(request, runtime);
    }

    public QueryIndustryLabelBagResponse queryIndustryLabelBagWithOptions(QueryIndustryLabelBagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryIndustryLabelBag", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryIndustryLabelBagResponse());
    }

    public QueryIndustryLabelBagResponse queryIndustryLabelBag(QueryIndustryLabelBagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIndustryLabelBagWithOptions(request, runtime);
    }

    public QueryMediaResponse queryMediaWithOptions(QueryMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMedia", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaResponse());
    }

    public QueryMediaResponse queryMedia(QueryMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaWithOptions(request, runtime);
    }

    public QueryPromotionResponse queryPromotionWithOptions(QueryPromotionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPromotion", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPromotionResponse());
    }

    public QueryPromotionResponse queryPromotion(QueryPromotionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPromotionWithOptions(request, runtime);
    }

    public QueryRuleResponse queryRuleWithOptions(QueryRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRule", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRuleResponse());
    }

    public QueryRuleResponse queryRule(QueryRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRuleWithOptions(request, runtime);
    }

    public QuerySlotResponse querySlotWithOptions(QuerySlotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySlot", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySlotResponse());
    }

    public QuerySlotResponse querySlot(QuerySlotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySlotWithOptions(request, runtime);
    }

    public QuerySlotTemplateResponse querySlotTemplateWithOptions(QuerySlotTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySlotTemplate", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySlotTemplateResponse());
    }

    public QuerySlotTemplateResponse querySlotTemplate(QuerySlotTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySlotTemplateWithOptions(request, runtime);
    }

    public QueryTaskBizTypeResponse queryTaskBizTypeWithOptions(QueryTaskBizTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTaskBizType", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskBizTypeResponse());
    }

    public QueryTaskBizTypeResponse queryTaskBizType(QueryTaskBizTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskBizTypeWithOptions(request, runtime);
    }

    public QueryTaskRuleLimitResponse queryTaskRuleLimitWithOptions(QueryTaskRuleLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTaskRuleLimit", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskRuleLimitResponse());
    }

    public QueryTaskRuleLimitResponse queryTaskRuleLimit(QueryTaskRuleLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskRuleLimitWithOptions(request, runtime);
    }

    public QueryTaskRulesResponse queryTaskRulesWithOptions(QueryTaskRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTaskRules", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTaskRulesResponse());
    }

    public QueryTaskRulesResponse queryTaskRules(QueryTaskRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskRulesWithOptions(request, runtime);
    }

    public QueryTenantBizConfigResponse queryTenantBizConfigWithOptions(QueryTenantBizConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTenantBizConfig", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTenantBizConfigResponse());
    }

    public QueryTenantBizConfigResponse queryTenantBizConfig(QueryTenantBizConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTenantBizConfigWithOptions(request, runtime);
    }

    public QueryTenantInfoResponse queryTenantInfoWithOptions(QueryTenantInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTenantInfo", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTenantInfoResponse());
    }

    public QueryTenantInfoResponse queryTenantInfo(QueryTenantInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTenantInfoWithOptions(request, runtime);
    }

    public QueryTenantUserResponse queryTenantUserWithOptions(QueryTenantUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTenantUser", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTenantUserResponse());
    }

    public QueryTenantUserResponse queryTenantUser(QueryTenantUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTenantUserWithOptions(request, runtime);
    }

    public QueryTenantUserByUserIdResponse queryTenantUserByUserIdWithOptions(QueryTenantUserByUserIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTenantUserByUserId", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTenantUserByUserIdResponse());
    }

    public QueryTenantUserByUserIdResponse queryTenantUserByUserId(QueryTenantUserByUserIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTenantUserByUserIdWithOptions(request, runtime);
    }

    public QueryUnionChannelResponse queryUnionChannelWithOptions(QueryUnionChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUnionChannel", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUnionChannelResponse());
    }

    public QueryUnionChannelResponse queryUnionChannel(QueryUnionChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionChannelWithOptions(request, runtime);
    }

    public QueryUnionContentInfoResponse queryUnionContentInfoWithOptions(QueryUnionContentInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUnionContentInfo", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUnionContentInfoResponse());
    }

    public QueryUnionContentInfoResponse queryUnionContentInfo(QueryUnionContentInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionContentInfoWithOptions(request, runtime);
    }

    public QueryUnionPromotionResponse queryUnionPromotionWithOptions(QueryUnionPromotionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUnionPromotion", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUnionPromotionResponse());
    }

    public QueryUnionPromotionResponse queryUnionPromotion(QueryUnionPromotionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionPromotionWithOptions(request, runtime);
    }

    public QueryUnionSumChannelDataResponse queryUnionSumChannelDataWithOptions(QueryUnionSumChannelDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUnionSumChannelData", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUnionSumChannelDataResponse());
    }

    public QueryUnionSumChannelDataResponse queryUnionSumChannelData(QueryUnionSumChannelDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionSumChannelDataWithOptions(request, runtime);
    }

    public QueryUnionTaskInfoResponse queryUnionTaskInfoWithOptions(QueryUnionTaskInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUnionTaskInfo", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUnionTaskInfoResponse());
    }

    public QueryUnionTaskInfoResponse queryUnionTaskInfo(QueryUnionTaskInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionTaskInfoWithOptions(request, runtime);
    }

    public QueryUnionTaskListResponse queryUnionTaskListWithOptions(QueryUnionTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUnionTaskList", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUnionTaskListResponse());
    }

    public QueryUnionTaskListResponse queryUnionTaskList(QueryUnionTaskListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionTaskListWithOptions(request, runtime);
    }

    public QueryUserResponse queryUserWithOptions(QueryUserRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUserShrinkRequest request = new QueryUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sspUser)) {
            request.sspUserShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sspUser, "SspUser", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUser", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUserResponse());
    }

    public QueryUserResponse queryUser(QueryUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUserWithOptions(request, runtime);
    }

    public ReduceAmountResponse reduceAmountWithOptions(ReduceAmountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReduceAmount", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ReduceAmountResponse());
    }

    public ReduceAmountResponse reduceAmount(ReduceAmountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reduceAmountWithOptions(request, runtime);
    }

    public RegistDeviceResponse registDeviceWithOptions(RegistDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegistDevice", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new RegistDeviceResponse());
    }

    public RegistDeviceResponse registDevice(RegistDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registDeviceWithOptions(request, runtime);
    }

    public SaveCpmTradeResponse saveCpmTradeWithOptions(SaveCpmTradeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveCpmTrade", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new SaveCpmTradeResponse());
    }

    public SaveCpmTradeResponse saveCpmTrade(SaveCpmTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveCpmTradeWithOptions(request, runtime);
    }

    public ScanCodeNotificationResponse scanCodeNotificationWithOptions(ScanCodeNotificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ScanCodeNotification", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new ScanCodeNotificationResponse());
    }

    public ScanCodeNotificationResponse scanCodeNotification(ScanCodeNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.scanCodeNotificationWithOptions(request, runtime);
    }

    public SendTaokeInfoResponse sendTaokeInfoWithOptions(SendTaokeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendTaokeInfo", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new SendTaokeInfoResponse());
    }

    public SendTaokeInfoResponse sendTaokeInfo(SendTaokeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendTaokeInfoWithOptions(request, runtime);
    }

    public SyncUnionOrderResponse syncUnionOrderWithOptions(SyncUnionOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncUnionOrder", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new SyncUnionOrderResponse());
    }

    public SyncUnionOrderResponse syncUnionOrder(SyncUnionOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncUnionOrderWithOptions(request, runtime);
    }

    public UpdateFlowResponse updateFlowWithOptions(UpdateFlowRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFlowShrinkRequest request = new UpdateFlowShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.flow)) {
            request.flowShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.flow, "Flow", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlow", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlowResponse());
    }

    public UpdateFlowResponse updateFlow(UpdateFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlowWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateUserShrinkRequest request = new UpdateUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sspUser)) {
            request.sspUserShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sspUser, "SspUser", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUser", "2018-12-12", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }
}
