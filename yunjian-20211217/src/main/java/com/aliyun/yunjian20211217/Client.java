// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217;

import com.aliyun.tea.*;
import com.aliyun.yunjian20211217.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("yunjian", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request CreateDemandPlanRequest
     * @param headers CreateDemandPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDemandPlanResponse
     */
    public CreateDemandPlanResponse createDemandPlanWithOptions(CreateDemandPlanRequest request, CreateDemandPlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetCid)) {
            body.put("targetCid", request.targetCid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDemandPlan"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/demand/urgent/saveUrgentDemandPlanItem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDemandPlanResponse());
    }

    /**
     * @param request CreateDemandPlanRequest
     * @return CreateDemandPlanResponse
     */
    public CreateDemandPlanResponse createDemandPlan(CreateDemandPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateDemandPlanHeaders headers = new CreateDemandPlanHeaders();
        return this.createDemandPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建plan2.0版本</p>
     * 
     * @param request CreateDemandPlanV2Request
     * @param headers CreateDemandPlanV2Headers
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDemandPlanV2Response
     */
    public CreateDemandPlanV2Response createDemandPlanV2WithOptions(CreateDemandPlanV2Request request, CreateDemandPlanV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("productType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetCid)) {
            body.put("targetCid", request.targetCid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDemandPlanV2"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/demand/urgent/saveDemandPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDemandPlanV2Response());
    }

    /**
     * <b>summary</b> : 
     * <p>创建plan2.0版本</p>
     * 
     * @param request CreateDemandPlanV2Request
     * @return CreateDemandPlanV2Response
     */
    public CreateDemandPlanV2Response createDemandPlanV2(CreateDemandPlanV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateDemandPlanV2Headers headers = new CreateDemandPlanV2Headers();
        return this.createDemandPlanV2WithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>紧急需求单ite 删除</p>
     * 
     * @param request DeleteUrgentDemandItemRequest
     * @param headers DeleteUrgentDemandItemHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUrgentDemandItemResponse
     */
    public DeleteUrgentDemandItemResponse deleteUrgentDemandItemWithOptions(DeleteUrgentDemandItemRequest request, DeleteUrgentDemandItemHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifier)) {
            query.put("modifier", request.modifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUrgentDemandItem"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/demand/urgent/deleteUrgentDemandItem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUrgentDemandItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>紧急需求单ite 删除</p>
     * 
     * @param request DeleteUrgentDemandItemRequest
     * @return DeleteUrgentDemandItemResponse
     */
    public DeleteUrgentDemandItemResponse deleteUrgentDemandItem(DeleteUrgentDemandItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteUrgentDemandItemHeaders headers = new DeleteUrgentDemandItemHeaders();
        return this.deleteUrgentDemandItemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>紧急需求单plan删除</p>
     * 
     * @param request DeleteUrgentDemandPlanRequest
     * @param headers DeleteUrgentDemandPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUrgentDemandPlanResponse
     */
    public DeleteUrgentDemandPlanResponse deleteUrgentDemandPlanWithOptions(DeleteUrgentDemandPlanRequest request, DeleteUrgentDemandPlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifier)) {
            query.put("modifier", request.modifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUrgentDemandPlan"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/demand/urgent/deleteUrgentDemandPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUrgentDemandPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>紧急需求单plan删除</p>
     * 
     * @param request DeleteUrgentDemandPlanRequest
     * @return DeleteUrgentDemandPlanResponse
     */
    public DeleteUrgentDemandPlanResponse deleteUrgentDemandPlan(DeleteUrgentDemandPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteUrgentDemandPlanHeaders headers = new DeleteUrgentDemandPlanHeaders();
        return this.deleteUrgentDemandPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>交付信息同步</p>
     * 
     * @param request DeliveryItemDetailSynRequest
     * @param headers DeliveryItemDetailSynHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeliveryItemDetailSynResponse
     */
    public DeliveryItemDetailSynResponse deliveryItemDetailSynWithOptions(DeliveryItemDetailSynRequest request, DeliveryItemDetailSynHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryItemDetailDTOS)) {
            body.put("deliveryItemDetailDTOS", request.deliveryItemDetailDTOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryItemId)) {
            body.put("deliveryItemId", request.deliveryItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryPlanId)) {
            body.put("deliveryPlanId", request.deliveryPlanId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeliveryItemDetailSyn"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/supply/deliveryItemDataSync"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeliveryItemDetailSynResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>交付信息同步</p>
     * 
     * @param request DeliveryItemDetailSynRequest
     * @return DeliveryItemDetailSynResponse
     */
    public DeliveryItemDetailSynResponse deliveryItemDetailSyn(DeliveryItemDetailSynRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeliveryItemDetailSynHeaders headers = new DeliveryItemDetailSynHeaders();
        return this.deliveryItemDetailSynWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询报备单中报备项列表</p>
     * 
     * @param request GetUrgentDemandItemListRequest
     * @param headers GetUrgentDemandItemListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUrgentDemandItemListResponse
     */
    public GetUrgentDemandItemListResponse getUrgentDemandItemListWithOptions(GetUrgentDemandItemListRequest request, GetUrgentDemandItemListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("commodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityTypeCode)) {
            body.put("commodityTypeCode", request.commodityTypeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            body.put("planId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zone)) {
            body.put("zone", request.zone);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUrgentDemandItemList"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/demand/urgent/getUrgentDemandItemList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUrgentDemandItemListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询报备单中报备项列表</p>
     * 
     * @param request GetUrgentDemandItemListRequest
     * @return GetUrgentDemandItemListResponse
     */
    public GetUrgentDemandItemListResponse getUrgentDemandItemList(GetUrgentDemandItemListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUrgentDemandItemListHeaders headers = new GetUrgentDemandItemListHeaders();
        return this.getUrgentDemandItemListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>getUrgentDemandPlanDetail</p>
     * 
     * @param request GetUrgentDemandPlanDetailRequest
     * @param headers GetUrgentDemandPlanDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUrgentDemandPlanDetailResponse
     */
    public GetUrgentDemandPlanDetailResponse getUrgentDemandPlanDetailWithOptions(GetUrgentDemandPlanDetailRequest request, GetUrgentDemandPlanDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            body.put("planId", request.planId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUrgentDemandPlanDetail"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/demand/urgent/getUrgentDemandPlanDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUrgentDemandPlanDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>getUrgentDemandPlanDetail</p>
     * 
     * @param request GetUrgentDemandPlanDetailRequest
     * @return GetUrgentDemandPlanDetailResponse
     */
    public GetUrgentDemandPlanDetailResponse getUrgentDemandPlanDetail(GetUrgentDemandPlanDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUrgentDemandPlanDetailHeaders headers = new GetUrgentDemandPlanDetailHeaders();
        return this.getUrgentDemandPlanDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询报备单列表</p>
     * 
     * @param request GetUrgentDemandPlanListRequest
     * @param headers GetUrgentDemandPlanListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUrgentDemandPlanListResponse
     */
    public GetUrgentDemandPlanListResponse getUrgentDemandPlanListWithOptions(GetUrgentDemandPlanListRequest request, GetUrgentDemandPlanListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planType)) {
            body.put("planType", request.planType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUrgentDemandPlanList"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/demand/urgent/getUrgentDemandPlanList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUrgentDemandPlanListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询报备单列表</p>
     * 
     * @param request GetUrgentDemandPlanListRequest
     * @return GetUrgentDemandPlanListResponse
     */
    public GetUrgentDemandPlanListResponse getUrgentDemandPlanList(GetUrgentDemandPlanListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUrgentDemandPlanListHeaders headers = new GetUrgentDemandPlanListHeaders();
        return this.getUrgentDemandPlanListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ecs资源方案</p>
     * 
     * @param request PushResourcePlanRequest
     * @param headers PushResourcePlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushResourcePlanResponse
     */
    public PushResourcePlanResponse pushResourcePlanWithOptions(PushResourcePlanRequest request, PushResourcePlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bufferCnt)) {
            body.put("bufferCnt", request.bufferCnt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.demandCount)) {
            body.put("demandCount", request.demandCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.demandId)) {
            body.put("demandId", request.demandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.methodList)) {
            body.put("methodList", request.methodList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            body.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireCnt)) {
            body.put("requireCnt", request.requireCnt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDemandId)) {
            body.put("subDemandId", request.subDemandId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushResourcePlan"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/supply/resourcePlan/push"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushResourcePlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ecs资源方案</p>
     * 
     * @param request PushResourcePlanRequest
     * @return PushResourcePlanResponse
     */
    public PushResourcePlanResponse pushResourcePlan(PushResourcePlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PushResourcePlanHeaders headers = new PushResourcePlanHeaders();
        return this.pushResourcePlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询accountId下所有存在交付状态（包括部分）的报备数据, 以及开通数据情况</p>
     * 
     * @param request QueryDeliveredSupplyItemsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeliveredSupplyItemsResponse
     */
    public QueryDeliveredSupplyItemsResponse queryDeliveredSupplyItemsWithOptions(QueryDeliveredSupplyItemsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityTypeCode)) {
            query.put("commodityTypeCode", request.commodityTypeCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeliveredSupplyItems"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/supply/queryDeliveredSupplyItems"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeliveredSupplyItemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询accountId下所有存在交付状态（包括部分）的报备数据, 以及开通数据情况</p>
     * 
     * @param request QueryDeliveredSupplyItemsRequest
     * @return QueryDeliveredSupplyItemsResponse
     */
    public QueryDeliveredSupplyItemsResponse queryDeliveredSupplyItems(QueryDeliveredSupplyItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeliveredSupplyItemsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询账单预算数据</p>
     * 
     * @param request QueryPeriodBudgetBillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPeriodBudgetBillResponse
     */
    public QueryPeriodBudgetBillResponse queryPeriodBudgetBillWithOptions(QueryPeriodBudgetBillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectIds)) {
            query.put("objectIds", request.objectIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("objectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("period", request.period);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPeriodBudgetBill"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/annual/budget/queryPeriodBudgetBill"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPeriodBudgetBillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询账单预算数据</p>
     * 
     * @param request QueryPeriodBudgetBillRequest
     * @return QueryPeriodBudgetBillResponse
     */
    public QueryPeriodBudgetBillResponse queryPeriodBudgetBill(QueryPeriodBudgetBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPeriodBudgetBillWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>紧急需求单item新增</p>
     * 
     * @param request SaveUrgentDemandItemRequest
     * @param headers SaveUrgentDemandItemHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveUrgentDemandItemResponse
     */
    public SaveUrgentDemandItemResponse saveUrgentDemandItemWithOptions(SaveUrgentDemandItemRequest request, SaveUrgentDemandItemHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            body.put("accountId", request.accountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            body.put("creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectTime)) {
            body.put("effectTime", request.effectTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifier)) {
            body.put("modifier", request.modifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("networkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payDuration)) {
            body.put("payDuration", request.payDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payDurationUnit)) {
            body.put("payDurationUnit", request.payDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            body.put("payType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            body.put("planId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urgentDemandEbsRequest)) {
            body.put("urgentDemandEbsRequest", request.urgentDemandEbsRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.urgentDemandEcsRequest)) {
            body.put("urgentDemandEcsRequest", request.urgentDemandEcsRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zone)) {
            body.put("zone", request.zone);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveUrgentDemandItem"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/demand/urgent/saveUrgentDemandItem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveUrgentDemandItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>紧急需求单item新增</p>
     * 
     * @param request SaveUrgentDemandItemRequest
     * @return SaveUrgentDemandItemResponse
     */
    public SaveUrgentDemandItemResponse saveUrgentDemandItem(SaveUrgentDemandItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SaveUrgentDemandItemHeaders headers = new SaveUrgentDemandItemHeaders();
        return this.saveUrgentDemandItemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>submitUrgentDemandPlan</p>
     * 
     * @param request SubmitUrgentDemandPlanRequest
     * @param headers SubmitUrgentDemandPlanHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitUrgentDemandPlanResponse
     */
    public SubmitUrgentDemandPlanResponse submitUrgentDemandPlanWithOptions(SubmitUrgentDemandPlanRequest request, SubmitUrgentDemandPlanHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("planId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("userId", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.yunUserId)) {
            realHeaders.put("Yun-User-Id", com.aliyun.teautil.Common.toJSONString(headers.yunUserId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitUrgentDemandPlan"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/demand/urgent/submitUrgentDemandPlan"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitUrgentDemandPlanResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>submitUrgentDemandPlan</p>
     * 
     * @param request SubmitUrgentDemandPlanRequest
     * @return SubmitUrgentDemandPlanResponse
     */
    public SubmitUrgentDemandPlanResponse submitUrgentDemandPlan(SubmitUrgentDemandPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SubmitUrgentDemandPlanHeaders headers = new SubmitUrgentDemandPlanHeaders();
        return this.submitUrgentDemandPlanWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云产品交付决策反馈回调</p>
     * 
     * @param request AcceptFulfillmentDecisionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptFulfillmentDecisionResponse
     */
    public AcceptFulfillmentDecisionResponse acceptFulfillmentDecisionWithOptions(AcceptFulfillmentDecisionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.decisionConclusion)) {
            body.put("DecisionConclusion", request.decisionConclusion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decisionType)) {
            body.put("DecisionType", request.decisionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "acceptFulfillmentDecision"),
            new TeaPair("version", "2021-12-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/acceptFulfillmentDecision"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptFulfillmentDecisionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云产品交付决策反馈回调</p>
     * 
     * @param request AcceptFulfillmentDecisionRequest
     * @return AcceptFulfillmentDecisionResponse
     */
    public AcceptFulfillmentDecisionResponse acceptFulfillmentDecision(AcceptFulfillmentDecisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.acceptFulfillmentDecisionWithOptions(request, headers, runtime);
    }
}
