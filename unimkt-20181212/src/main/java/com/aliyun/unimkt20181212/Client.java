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
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeMediaStatus"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeMediaStatusResponse());
    }

    public ChangeMediaStatusResponse changeMediaStatus(ChangeMediaStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeMediaStatusWithOptions(request, runtime);
    }

    public ChangeSlotStatusResponse changeSlotStatusWithOptions(ChangeSlotStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeSlotStatus"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeSlotStatusResponse());
    }

    public ChangeSlotStatusResponse changeSlotStatus(ChangeSlotStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeSlotStatusWithOptions(request, runtime);
    }

    public ChangeTenantStatusResponse changeTenantStatusWithOptions(ChangeTenantStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeTenantStatus"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeTenantStatusResponse());
    }

    public ChangeTenantStatusResponse changeTenantStatus(ChangeTenantStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeTenantStatusWithOptions(request, runtime);
    }

    public ChangeTenantUserStatusResponse changeTenantUserStatusWithOptions(ChangeTenantUserStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeTenantUserStatus"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeTenantUserStatusResponse());
    }

    public ChangeTenantUserStatusResponse changeTenantUserStatus(ChangeTenantUserStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeTenantUserStatusWithOptions(request, runtime);
    }

    public ChargeLaunchResponse chargeLaunchWithOptions(ChargeLaunchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AlipayOpenId", request.alipayOpenId);
        query.put("ChannelId", request.channelId);
        query.put("Extra", request.extra);
        query.put("OuterCode", request.outerCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChargeLaunch"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChargeLaunchResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDeviceResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckReceivingDetail"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckReceivingDetailResponse());
    }

    public CheckReceivingDetailResponse checkReceivingDetail(CheckReceivingDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkReceivingDetailWithOptions(request, runtime);
    }

    public CheckTenantBizResponse checkTenantBizWithOptions(CheckTenantBizRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdSlotId", request.adSlotId);
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("MediaId", request.mediaId);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckTenantBiz"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckTenantBizResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CountUser"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CountUserResponse());
    }

    public CountUserResponse countUser(CountUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countUserWithOptions(request, runtime);
    }

    public CreateCalculationResponse createCalculationWithOptions(CreateCalculationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("CloudCodeUserId", request.cloudCodeUserId);
        query.put("QueryString", request.queryString);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCalculation"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCalculationResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFlow"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFlowResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMedia"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMediaResponse());
    }

    public CreateMediaResponse createMedia(CreateMediaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMediaWithOptions(request, runtime);
    }

    public CreateProxyBrandUserResponse createProxyBrandUserWithOptions(CreateProxyBrandUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BrandUserNick", request.brandUserNick);
        query.put("ChannelId", request.channelId);
        query.put("ClientToken", request.clientToken);
        query.put("Company", request.company);
        query.put("ContactName", request.contactName);
        query.put("ContactPhone", request.contactPhone);
        query.put("Industry", request.industry);
        query.put("ProxyUserId", request.proxyUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProxyBrandUser"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProxyBrandUserResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRule"),
            new TeaPair("version", "2018-12-12"),
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSlot"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSlotResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTenant"),
            new TeaPair("version", "2018-12-12"),
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTenantUser"),
            new TeaPair("version", "2018-12-12"),
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

    public CreateTenantUserResponse createTenantUser(CreateTenantUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTenantUserWithOptions(request, runtime);
    }

    public CreateUnionTaskResponse createUnionTaskWithOptions(CreateUnionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BrandUserId", request.brandUserId);
        query.put("BrandUserNick", request.brandUserNick);
        query.put("Channel", request.channel);
        query.put("ChannelId", request.channelId);
        query.put("ClientToken", request.clientToken);
        query.put("ContentId", request.contentId);
        query.put("ContentUrl", request.contentUrl);
        query.put("CustomCreativeType", request.customCreativeType);
        query.put("EndTime", request.endTime);
        query.put("IndustryLabelBagId", request.industryLabelBagId);
        query.put("Name", request.name);
        query.put("ProxyUserId", request.proxyUserId);
        query.put("Quota", request.quota);
        query.put("QuotaDay", request.quotaDay);
        query.put("StartTime", request.startTime);
        query.put("TaskBizType", request.taskBizType);
        query.put("TaskRuleType", request.taskRuleType);
        query.put("TaskType", request.taskType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUnionTask"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUnionTaskResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatesSlotTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatesSlotTemplateResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("Message", request.message);
        query.put("MessageKey", request.messageKey);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("RuleId", request.ruleId);
        query.put("Status", request.status);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRule"),
            new TeaPair("version", "2018-12-12"),
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

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public EndUnionTaskResponse endUnionTaskWithOptions(EndUnionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        query.put("ProxyUserId", request.proxyUserId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EndUnionTask"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EndUnionTaskResponse());
    }

    public EndUnionTaskResponse endUnionTask(EndUnionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.endUnionTaskWithOptions(request, runtime);
    }

    public GetMainPartListResponse getMainPartListWithOptions(GetMainPartListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("MainName", request.mainName);
        query.put("MainType", request.mainType);
        query.put("PageIndex", request.pageIndex);
        query.put("PageSize", request.pageSize);
        query.put("ParentMainId", request.parentMainId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMainPartList"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMainPartListResponse());
    }

    public GetMainPartListResponse getMainPartList(GetMainPartListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMainPartListWithOptions(request, runtime);
    }

    public GetUnionTaskStatusResponse getUnionTaskStatusWithOptions(GetUnionTaskStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AlipayOpenId", request.alipayOpenId);
        query.put("ChannelId", request.channelId);
        query.put("Sign", request.sign);
        query.put("TaskId", request.taskId);
        query.put("UserId", request.userId);
        query.put("UserNick", request.userNick);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUnionTaskStatus"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUnionTaskStatusResponse());
    }

    public GetUnionTaskStatusResponse getUnionTaskStatus(GetUnionTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUnionTaskStatusWithOptions(request, runtime);
    }

    public InnerCallServiceResponse innerCallServiceWithOptions(InnerCallServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InnerCallService"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InnerCallServiceResponse());
    }

    public InnerCallServiceResponse innerCallService(InnerCallServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.innerCallServiceWithOptions(request, runtime);
    }

    public KeepAliveResponse keepAliveWithOptions(KeepAliveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KeepAlive"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KeepAliveResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFlow"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFlowResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessStatus", request.accessStatus);
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("EndCreateTime", request.endCreateTime);
        query.put("Environment", request.environment);
        query.put("FirstScene", request.firstScene);
        query.put("MediaName", request.mediaNameShrink);
        query.put("MediaStatus", request.mediaStatus);
        query.put("MediaType", request.mediaType);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("Os", request.os);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecondScene", request.secondScene);
        query.put("StartCreateTime", request.startCreateTime);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMedia"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMediaResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccessStatus", request.accessStatus);
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("EndCreateTime", request.endCreateTime);
        query.put("Environment", request.environment);
        query.put("FirstScene", request.firstScene);
        query.put("MediaName", request.mediaNameShrink);
        query.put("MediaStatus", request.mediaStatus);
        query.put("MediaType", request.mediaType);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("Os", request.os);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SecondScene", request.secondScene);
        query.put("StartCreateTime", request.startCreateTime);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMediaName"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMediaNameResponse());
    }

    public ListMediaNameResponse listMediaName(ListMediaNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMediaNameWithOptions(request, runtime);
    }

    public ListRuleResponse listRuleWithOptions(ListRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdSlotId", request.adSlotId);
        query.put("AdSlotName", request.adSlotName);
        query.put("AdSlotType", request.adSlotType);
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("EndCreateTime", request.endCreateTime);
        query.put("Environment", request.environment);
        query.put("MediaId", request.mediaId);
        query.put("MediaName", request.mediaName);
        query.put("MediaStatus", request.mediaStatus);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RuleId", request.ruleId);
        query.put("RuleName", request.ruleName);
        query.put("RuleType", request.ruleType);
        query.put("StartCreateTime", request.startCreateTime);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRule"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRuleResponse());
    }

    public ListRuleResponse listRule(ListRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleWithOptions(request, runtime);
    }

    public ListRuleAreaResponse listRuleAreaWithOptions(ListRuleAreaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdSlotId", request.adSlotId);
        query.put("AdSlotType", request.adSlotType);
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("EndCreateTime", request.endCreateTime);
        query.put("Environment", request.environment);
        query.put("MediaId", request.mediaId);
        query.put("MediaStatus", request.mediaStatus);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("RuleId", request.ruleId);
        query.put("RuleName", request.ruleName);
        query.put("RuleType", request.ruleType);
        query.put("StartCreateTime", request.startCreateTime);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRuleArea"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRuleAreaResponse());
    }

    public ListRuleAreaResponse listRuleArea(ListRuleAreaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleAreaWithOptions(request, runtime);
    }

    public ListSlotResponse listSlotWithOptions(ListSlotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdSlotCorporateStatus", request.adSlotCorporateStatus);
        query.put("AdSlotId", request.adSlotId);
        query.put("AdSlotName", request.adSlotName);
        query.put("AdSlotStatus", request.adSlotStatus);
        query.put("AdSlotType", request.adSlotType);
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("EndCreateTime", request.endCreateTime);
        query.put("Environment", request.environment);
        query.put("MediaId", request.mediaId);
        query.put("MediaName", request.mediaName);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("StartCreateTime", request.startCreateTime);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSlot"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSlotResponse());
    }

    public ListSlotResponse listSlot(ListSlotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSlotWithOptions(request, runtime);
    }

    public ListTenantResponse listTenantWithOptions(ListTenantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("EndCreateTime", request.endCreateTime);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("StartCreateTime", request.startCreateTime);
        query.put("Status", request.status);
        query.put("TenantId", request.tenantId);
        query.put("TenantName", request.tenantName);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTenant"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantResponse());
    }

    public ListTenantResponse listTenant(ListTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTenantWithOptions(request, runtime);
    }

    public ListTenantNameResponse listTenantNameWithOptions(ListTenantNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("EndCreateTime", request.endCreateTime);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("StartCreateTime", request.startCreateTime);
        query.put("Status", request.status);
        query.put("TenantId", request.tenantId);
        query.put("TenantName", request.tenantName);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTenantName"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantNameResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUser"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMedia"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMediaResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyRule"),
            new TeaPair("version", "2018-12-12"),
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySlot"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySlotResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySlotTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySlotTemplateResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantInfo"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantInfoResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushDeviceStatus"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushDeviceStatusResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushExtraTradeDetail"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushExtraTradeDetailResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushFaultEvent"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushFaultEventResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushTradeDetail"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushTradeDetailResponse());
    }

    public PushTradeDetailResponse pushTradeDetail(PushTradeDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushTradeDetailWithOptions(request, runtime);
    }

    public QueryAppPromotionResponse queryAppPromotionWithOptions(QueryAppPromotionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        query.put("Extra", request.extra);
        query.put("UserId", request.userId);
        query.put("UserType", request.userType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAppPromotion"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAppPromotionResponse());
    }

    public QueryAppPromotionResponse queryAppPromotion(QueryAppPromotionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppPromotionWithOptions(request, runtime);
    }

    public QueryAppTasksResponse queryAppTasksWithOptions(QueryAppTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageIndex", request.pageIndex);
        query.put("PageSize", request.pageSize);
        query.put("TaskId", request.taskId);
        query.put("TaskType", request.taskType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAppTasks"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAppTasksResponse());
    }

    public QueryAppTasksResponse queryAppTasks(QueryAppTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppTasksWithOptions(request, runtime);
    }

    public QueryAvailableBalanceResponse queryAvailableBalanceWithOptions(QueryAvailableBalanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        query.put("ProxyUserId", request.proxyUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAvailableBalance"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvailableBalanceResponse());
    }

    public QueryAvailableBalanceResponse queryAvailableBalance(QueryAvailableBalanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAvailableBalanceWithOptions(request, runtime);
    }

    public QueryChannelHistoryDataResponse queryChannelHistoryDataWithOptions(QueryChannelHistoryDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        query.put("EndTime", request.endTime);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        query.put("TaskType", request.taskType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryChannelHistoryData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryChannelHistoryDataResponse());
    }

    public QueryChannelHistoryDataResponse queryChannelHistoryData(QueryChannelHistoryDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryChannelHistoryDataWithOptions(request, runtime);
    }

    public QueryContentInfoResponse queryContentInfoWithOptions(QueryContentInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ContentId", request.contentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryContentInfo"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryContentInfoResponse());
    }

    public QueryContentInfoResponse queryContentInfo(QueryContentInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryContentInfoWithOptions(request, runtime);
    }

    public QueryContentListResponse queryContentListWithOptions(QueryContentListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BrandUserId", request.brandUserId);
        query.put("ChannelId", request.channelId);
        query.put("ProxyUserId", request.proxyUserId);
        query.put("TaskBizType", request.taskBizType);
        query.put("TaskType", request.taskType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryContentList"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryContentListResponse());
    }

    public QueryContentListResponse queryContentList(QueryContentListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryContentListWithOptions(request, runtime);
    }

    public QueryFlowResponse queryFlowWithOptions(QueryFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFlow"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFlowResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdSlotId", request.adSlotId);
        query.put("AdSlotName", request.adSlotName);
        query.put("AdSlotType", request.adSlotType);
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Dimension", request.dimension);
        query.put("EndTime", request.endTime);
        query.put("Environment", request.environment);
        query.put("MediaId", request.mediaId);
        query.put("MediaName", request.mediaNameShrink);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("QueryType", request.queryType);
        query.put("StartTime", request.startTime);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIncomeData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIncomeDataResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdSlotId", request.adSlotId);
        query.put("AdSlotName", request.adSlotName);
        query.put("AdSlotType", request.adSlotType);
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Dimension", request.dimension);
        query.put("EndTime", request.endTime);
        query.put("Environment", request.environment);
        query.put("MediaId", request.mediaId);
        query.put("MediaName", request.mediaNameShrink);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("QueryType", request.queryType);
        query.put("Slot", request.slot);
        query.put("SlotDimension", request.slotDimension);
        query.put("StartTime", request.startTime);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIncomeTrend"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIncomeTrendResponse());
    }

    public QueryIncomeTrendResponse queryIncomeTrend(QueryIncomeTrendRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIncomeTrendWithOptions(request, runtime);
    }

    public QueryIndustryLabelBagResponse queryIndustryLabelBagWithOptions(QueryIndustryLabelBagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryIndustryLabelBag"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryIndustryLabelBagResponse());
    }

    public QueryIndustryLabelBagResponse queryIndustryLabelBag(QueryIndustryLabelBagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryIndustryLabelBagWithOptions(request, runtime);
    }

    public QueryMediaResponse queryMediaWithOptions(QueryMediaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("MediaId", request.mediaId);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMedia"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPromotion"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPromotionResponse());
    }

    public QueryPromotionResponse queryPromotion(QueryPromotionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPromotionWithOptions(request, runtime);
    }

    public QueryRuleResponse queryRuleWithOptions(QueryRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("RuleId", request.ruleId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRule"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRuleResponse());
    }

    public QueryRuleResponse queryRule(QueryRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRuleWithOptions(request, runtime);
    }

    public QuerySlotResponse querySlotWithOptions(QuerySlotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdSlotId", request.adSlotId);
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySlot"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySlotResponse());
    }

    public QuerySlotResponse querySlot(QuerySlotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySlotWithOptions(request, runtime);
    }

    public QuerySlotTemplateResponse querySlotTemplateWithOptions(QuerySlotTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdSlotTemplateId", request.adSlotTemplateId);
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySlotTemplate"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySlotTemplateResponse());
    }

    public QuerySlotTemplateResponse querySlotTemplate(QuerySlotTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySlotTemplateWithOptions(request, runtime);
    }

    public QueryTaskBizTypeResponse queryTaskBizTypeWithOptions(QueryTaskBizTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskBizType"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskBizTypeResponse());
    }

    public QueryTaskBizTypeResponse queryTaskBizType(QueryTaskBizTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskBizTypeWithOptions(request, runtime);
    }

    public QueryTaskRuleLimitResponse queryTaskRuleLimitWithOptions(QueryTaskRuleLimitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskRuleLimit"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskRuleLimitResponse());
    }

    public QueryTaskRuleLimitResponse queryTaskRuleLimit(QueryTaskRuleLimitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskRuleLimitWithOptions(request, runtime);
    }

    public QueryTaskRulesResponse queryTaskRulesWithOptions(QueryTaskRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TaskId", request.taskId);
        query.put("TaskRuleType", request.taskRuleType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTaskRules"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTaskRulesResponse());
    }

    public QueryTaskRulesResponse queryTaskRules(QueryTaskRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskRulesWithOptions(request, runtime);
    }

    public QueryTenantBizConfigResponse queryTenantBizConfigWithOptions(QueryTenantBizConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("BizId", request.bizId);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTenantBizConfig"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTenantBizConfigResponse());
    }

    public QueryTenantBizConfigResponse queryTenantBizConfig(QueryTenantBizConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTenantBizConfigWithOptions(request, runtime);
    }

    public QueryTenantInfoResponse queryTenantInfoWithOptions(QueryTenantInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTenantInfo"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTenantInfoResponse());
    }

    public QueryTenantInfoResponse queryTenantInfo(QueryTenantInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTenantInfoWithOptions(request, runtime);
    }

    public QueryTenantUserResponse queryTenantUserWithOptions(QueryTenantUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTenantUser"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTenantUserResponse());
    }

    public QueryTenantUserResponse queryTenantUser(QueryTenantUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTenantUserWithOptions(request, runtime);
    }

    public QueryTenantUserByUserIdResponse queryTenantUserByUserIdWithOptions(QueryTenantUserByUserIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTenantUserByUserId"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTenantUserByUserIdResponse());
    }

    public QueryTenantUserByUserIdResponse queryTenantUserByUserId(QueryTenantUserByUserIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTenantUserByUserIdWithOptions(request, runtime);
    }

    public QueryUnionChannelResponse queryUnionChannelWithOptions(QueryUnionChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnionChannel"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnionChannelResponse());
    }

    public QueryUnionChannelResponse queryUnionChannel(QueryUnionChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionChannelWithOptions(request, runtime);
    }

    public QueryUnionContentInfoResponse queryUnionContentInfoWithOptions(QueryUnionContentInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        query.put("ContentId", request.contentId);
        query.put("ProxyUserId", request.proxyUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnionContentInfo"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnionContentInfoResponse());
    }

    public QueryUnionContentInfoResponse queryUnionContentInfo(QueryUnionContentInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionContentInfoWithOptions(request, runtime);
    }

    public QueryUnionPromotionResponse queryUnionPromotionWithOptions(QueryUnionPromotionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AlipayOpenId", request.alipayOpenId);
        query.put("ChannelId", request.channelId);
        query.put("ProxyChannelId", request.proxyChannelId);
        query.put("Sign", request.sign);
        query.put("UnionBizType", request.unionBizType);
        query.put("UserId", request.userId);
        query.put("UserNick", request.userNick);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnionPromotion"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnionPromotionResponse());
    }

    public QueryUnionPromotionResponse queryUnionPromotion(QueryUnionPromotionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionPromotionWithOptions(request, runtime);
    }

    public QueryUnionSumChannelDataResponse queryUnionSumChannelDataWithOptions(QueryUnionSumChannelDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        query.put("TaskType", request.taskType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnionSumChannelData"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnionSumChannelDataResponse());
    }

    public QueryUnionSumChannelDataResponse queryUnionSumChannelData(QueryUnionSumChannelDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionSumChannelDataWithOptions(request, runtime);
    }

    public QueryUnionTaskInfoResponse queryUnionTaskInfoWithOptions(QueryUnionTaskInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        query.put("ProxyUserId", request.proxyUserId);
        query.put("TaskId", request.taskId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnionTaskInfo"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnionTaskInfoResponse());
    }

    public QueryUnionTaskInfoResponse queryUnionTaskInfo(QueryUnionTaskInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnionTaskInfoWithOptions(request, runtime);
    }

    public QueryUnionTaskListResponse queryUnionTaskListWithOptions(QueryUnionTaskListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BrandUserId", request.brandUserId);
        query.put("ChannelId", request.channelId);
        query.put("PageIndex", request.pageIndex);
        query.put("PageSize", request.pageSize);
        query.put("ProxyUserId", request.proxyUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnionTaskList"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnionTaskListResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUser"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserResponse());
    }

    public QueryUserResponse queryUser(QueryUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUserWithOptions(request, runtime);
    }

    public ReduceAmountResponse reduceAmountWithOptions(ReduceAmountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Amount", request.amount);
        query.put("ChannelId", request.channelId);
        query.put("TaskId", request.taskId);
        query.put("V", request.v);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReduceAmount"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReduceAmountResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegistDevice"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegistDeviceResponse());
    }

    public RegistDeviceResponse registDevice(RegistDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registDeviceWithOptions(request, runtime);
    }

    public SaveCpmTradeResponse saveCpmTradeWithOptions(SaveCpmTradeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdvertType", request.advertType);
        query.put("Age", request.age);
        query.put("ApplyPrice", request.applyPrice);
        query.put("BizType", request.bizType);
        query.put("ChannelId", request.channelId);
        query.put("ChargeType", request.chargeType);
        query.put("CostDetail", request.costDetail);
        query.put("DeviceCode", request.deviceCode);
        query.put("ExtendString", request.extendString);
        query.put("HoldId", request.holdId);
        query.put("OuterCode", request.outerCode);
        query.put("RealCostAmount", request.realCostAmount);
        query.put("Sex", request.sex);
        query.put("TaskId", request.taskId);
        query.put("TaskTag", request.taskTag);
        query.put("TaskType", request.taskType);
        query.put("TradeTime", request.tradeTime);
        query.put("V", request.v);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveCpmTrade"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveCpmTradeResponse());
    }

    public SaveCpmTradeResponse saveCpmTrade(SaveCpmTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveCpmTradeWithOptions(request, runtime);
    }

    public ScanCodeNotificationResponse scanCodeNotificationWithOptions(ScanCodeNotificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Age", request.age);
        query.put("AlipayOpenId", request.alipayOpenId);
        query.put("ApplyPrice", request.applyPrice);
        query.put("BizResult", request.bizResult);
        query.put("BizType", request.bizType);
        query.put("BrandNick", request.brandNick);
        query.put("BrandUserId", request.brandUserId);
        query.put("ChannelId", request.channelId);
        query.put("ChargeTag", request.chargeTag);
        query.put("Cid", request.cid);
        query.put("CommodityId", request.commodityId);
        query.put("CostDetail", request.costDetail);
        query.put("DeviceCode", request.deviceCode);
        query.put("DeviceType", request.deviceType);
        query.put("HolderId", request.holderId);
        query.put("OuterCode", request.outerCode);
        query.put("Phase", request.phase);
        query.put("ProxyUserId", request.proxyUserId);
        query.put("QueryStr", request.queryStr);
        query.put("RealCostAmount", request.realCostAmount);
        query.put("SalePrice", request.salePrice);
        query.put("Sex", request.sex);
        query.put("TaskId", request.taskId);
        query.put("TaskType", request.taskType);
        query.put("V", request.v);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScanCodeNotification"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanCodeNotificationResponse());
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
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendTaokeInfo"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendTaokeInfoResponse());
    }

    public SendTaokeInfoResponse sendTaokeInfo(SendTaokeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendTaokeInfoWithOptions(request, runtime);
    }

    public SyncUnionOrderResponse syncUnionOrderWithOptions(SyncUnionOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Age", request.age);
        query.put("ApplyPrice", request.applyPrice);
        query.put("BizSerialNumber", request.bizSerialNumber);
        query.put("BrandName", request.brandName);
        query.put("BrandUserId", request.brandUserId);
        query.put("ChannelId", request.channelId);
        query.put("DeviceId", request.deviceId);
        query.put("ExtendInfo", request.extendInfo);
        query.put("HolderId", request.holderId);
        query.put("IndustryLabelBagId", request.industryLabelBagId);
        query.put("ProxyChannelId", request.proxyChannelId);
        query.put("ProxyUserId", request.proxyUserId);
        query.put("RealCostAmount", request.realCostAmount);
        query.put("Sex", request.sex);
        query.put("Status", request.status);
        query.put("TaskBizType", request.taskBizType);
        query.put("TaskId", request.taskId);
        query.put("TaskRuleType", request.taskRuleType);
        query.put("TaskType", request.taskType);
        query.put("TradeTimeString", request.tradeTimeString);
        query.put("V", request.v);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncUnionOrder"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncUnionOrderResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFlow"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFlowResponse());
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

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("Business", request.business);
        query.put("ClientToken", request.clientToken);
        query.put("Environment", request.environment);
        query.put("OriginSiteUserId", request.originSiteUserId);
        query.put("TenantId", request.tenantId);
        query.put("UserId", request.userId);
        query.put("UserSite", request.userSite);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2018-12-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }
}
