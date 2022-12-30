// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resellertrade20191227;

import com.aliyun.tea.*;
import com.aliyun.resellertrade20191227.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-south-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "resellertrade.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-chengdu", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-edge-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-fujian", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hongkong", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-qingdao", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-wuhan", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "resellertrade.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-central-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-west-1", "resellertrade.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "resellertrade.aliyuncs.com"),
            new TeaPair("me-east-1", "resellertrade.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "resellertrade.aliyuncs.com"),
            new TeaPair("us-east-1", "resellertrade.aliyuncs.com"),
            new TeaPair("us-west-1", "resellertrade.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("resellertrade", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateCouponTemplateResponse createCouponTemplateWithOptions(CreateCouponTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activitySite)) {
            body.put("ActivitySite", request.activitySite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certainMoney)) {
            body.put("CertainMoney", request.certainMoney);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            body.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityType)) {
            body.put("CommodityType", request.commodityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.controlType)) {
            body.put("ControlType", request.controlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponAmount)) {
            body.put("CouponAmount", request.couponAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponEndTime)) {
            body.put("CouponEndTime", request.couponEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponFixedType)) {
            body.put("CouponFixedType", request.couponFixedType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponStartTime)) {
            body.put("CouponStartTime", request.couponStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponType)) {
            body.put("CouponType", request.couponType);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            bodyFlat.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discountRate)) {
            body.put("DiscountRate", request.discountRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendsMap)) {
            bodyFlat.put("ExtendsMap", request.extendsMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromApp)) {
            body.put("FromApp", request.fromApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemCodeSet)) {
            body.put("ItemCodeSet", request.itemCodeSet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.market)) {
            body.put("Market", request.market);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marketType)) {
            body.put("MarketType", request.marketType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRelease)) {
            body.put("MaxRelease", request.maxRelease);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            body.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderTypeSet)) {
            body.put("OrderTypeSet", request.orderTypeSet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perLimitNum)) {
            body.put("PerLimitNum", request.perLimitNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            body.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relativeSecond)) {
            body.put("RelativeSecond", request.relativeSecond);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectionIdSet)) {
            body.put("SelectionIdSet", request.selectionIdSet);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.site)) {
            body.put("Site", request.site);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spId)) {
            body.put("SpId", request.spId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.universalType)) {
            body.put("UniversalType", request.universalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upperLimit)) {
            body.put("UpperLimit", request.upperLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageCount)) {
            body.put("UsageCount", request.usageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useScene)) {
            body.put("UseScene", request.useScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPkAmount)) {
            body.put("UserPkAmount", request.userPkAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityType)) {
            body.put("ValidityType", request.validityType);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCouponTemplate"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCouponTemplateResponse());
    }

    public CreateCouponTemplateResponse createCouponTemplate(CreateCouponTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCouponTemplateWithOptions(request, runtime);
    }

    public DiscardCouponListResponse discardCouponListWithOptions(DiscardCouponListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponList)) {
            body.put("CouponList", request.couponList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DiscardCouponList"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DiscardCouponListResponse());
    }

    public DiscardCouponListResponse discardCouponList(DiscardCouponListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.discardCouponListWithOptions(request, runtime);
    }

    public GetCouponPageResponse getCouponPageWithOptions(GetCouponPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCouponPage"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCouponPageResponse());
    }

    public GetCouponPageResponse getCouponPage(GetCouponPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCouponPageWithOptions(request, runtime);
    }

    public GetCustomerListResponse getCustomerListWithOptions(GetCustomerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerList"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerListResponse());
    }

    public GetCustomerListResponse getCustomerList(GetCustomerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerListWithOptions(request, runtime);
    }

    public GetRelationResponse getRelationWithOptions(GetRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRelation"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRelationResponse());
    }

    public GetRelationResponse getRelation(GetRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRelationWithOptions(request, runtime);
    }

    public GetResellerPayOrderResponse getResellerPayOrderWithOptions(GetResellerPayOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResellerPayOrder"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResellerPayOrderResponse());
    }

    public GetResellerPayOrderResponse getResellerPayOrder(GetResellerPayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResellerPayOrderWithOptions(request, runtime);
    }

    public LabelPartnerUserResponse labelPartnerUserWithOptions(LabelPartnerUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPK)) {
            body.put("UserPK", request.userPK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userTag)) {
            body.put("UserTag", request.userTag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LabelPartnerUser"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LabelPartnerUserResponse());
    }

    public LabelPartnerUserResponse labelPartnerUser(LabelPartnerUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.labelPartnerUserWithOptions(request, runtime);
    }

    public MigrateResourceResponse migrateResourceWithOptions(MigrateResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCode)) {
            body.put("ActionCode", request.actionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateResource"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateResourceResponse());
    }

    public MigrateResourceResponse migrateResource(MigrateResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateResourceWithOptions(request, runtime);
    }

    public OfflineActivityResponse offlineActivityWithOptions(OfflineActivityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityList)) {
            body.put("ActivityList", request.activityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineActivity"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineActivityResponse());
    }

    public OfflineActivityResponse offlineActivity(OfflineActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineActivityWithOptions(request, runtime);
    }

    public PayResultCallbackResponse payResultCallbackWithOptions(PayResultCallbackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payStatus)) {
            query.put("PayStatus", request.payStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payTime)) {
            query.put("PayTime", request.payTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PayResultCallback"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PayResultCallbackResponse());
    }

    public PayResultCallbackResponse payResultCallback(PayResultCallbackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.payResultCallbackWithOptions(request, runtime);
    }

    public PublicActivityResponse publicActivityWithOptions(PublicActivityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityList)) {
            body.put("ActivityList", request.activityList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapType)) {
            body.put("SnapType", request.snapType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublicActivity"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublicActivityResponse());
    }

    public PublicActivityResponse publicActivity(PublicActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publicActivityWithOptions(request, runtime);
    }

    public QueryActivityResponse queryActivityWithOptions(QueryActivityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityId)) {
            body.put("ActivityId", request.activityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapType)) {
            body.put("SnapType", request.snapType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryActivity"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryActivityResponse());
    }

    public QueryActivityResponse queryActivity(QueryActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryActivityWithOptions(request, runtime);
    }

    public QueryEcoRelationResponse queryEcoRelationWithOptions(QueryEcoRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.relationTime)) {
            body.put("RelationTime", request.relationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            body.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEcoRelation"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEcoRelationResponse());
    }

    public QueryEcoRelationResponse queryEcoRelation(QueryEcoRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEcoRelationWithOptions(request, runtime);
    }

    public SaveActivityResponse saveActivityWithOptions(SaveActivityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveActivityShrinkRequest request = new SaveActivityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendMap)) {
            request.extendMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendMap, "ExtendMap", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.activityName)) {
            body.put("ActivityName", request.activityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blackUidList)) {
            body.put("BlackUidList", request.blackUidList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendMapShrink)) {
            body.put("ExtendMap", request.extendMapShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fusionPromotionParamList)) {
            body.put("FusionPromotionParamList", request.fusionPromotionParamList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishTag)) {
            body.put("PublishTag", request.publishTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.testAccountUidList)) {
            body.put("TestAccountUidList", request.testAccountUidList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteUidList)) {
            body.put("WhiteUidList", request.whiteUidList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveActivity"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveActivityResponse());
    }

    public SaveActivityResponse saveActivity(SaveActivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveActivityWithOptions(request, runtime);
    }

    public SendCouponResponse sendCouponWithOptions(SendCouponRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromApp)) {
            body.put("FromApp", request.fromApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            body.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            body.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAmountModelList)) {
            body.put("UserAmountModelList", request.userAmountModelList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendCoupon"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendCouponResponse());
    }

    public SendCouponResponse sendCoupon(SendCouponRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sendCouponWithOptions(request, runtime);
    }

    public TransferResourceResponse transferResourceWithOptions(TransferResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionCode)) {
            body.put("ActionCode", request.actionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferResource"),
            new TeaPair("version", "2019-12-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferResourceResponse());
    }

    public TransferResourceResponse transferResource(TransferResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferResourceWithOptions(request, runtime);
    }
}
