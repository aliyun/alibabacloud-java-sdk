// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20201210;

import com.aliyun.tea.*;
import com.aliyun.workorder20201210.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "workorder.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "workorder.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("workorder", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request GetTicketTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTicketTemplateResponse
     */
    public GetTicketTemplateResponse getTicketTemplateWithOptions(GetTicketTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cna)) {
            query.put("Cna", request.cna);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionChannel)) {
            query.put("DistributionChannel", request.distributionChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referrer)) {
            query.put("Referrer", request.referrer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDistributionChannel)) {
            query.put("SubDistributionChannel", request.subDistributionChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XGatewayExtendInfo)) {
            query.put("XGatewayExtendInfo", request.XGatewayExtendInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTicketTemplate"),
            new TeaPair("version", "2020-12-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTicketTemplateResponse());
    }

    /**
     * @param request GetTicketTemplateRequest
     * @return GetTicketTemplateResponse
     */
    public GetTicketTemplateResponse getTicketTemplate(GetTicketTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTicketTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>是否首次访问BBS工单</p>
     * 
     * @param request IsFirstBbsTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IsFirstBbsTicketResponse
     */
    public IsFirstBbsTicketResponse isFirstBbsTicketWithOptions(IsFirstBbsTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cna)) {
            query.put("Cna", request.cna);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionChannel)) {
            query.put("DistributionChannel", request.distributionChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referrer)) {
            query.put("Referrer", request.referrer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDistributionChannel)) {
            query.put("SubDistributionChannel", request.subDistributionChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XGatewayExtendInfo)) {
            query.put("XGatewayExtendInfo", request.XGatewayExtendInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsFirstBbsTicket"),
            new TeaPair("version", "2020-12-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsFirstBbsTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>是否首次访问BBS工单</p>
     * 
     * @param request IsFirstBbsTicketRequest
     * @return IsFirstBbsTicketResponse
     */
    public IsFirstBbsTicketResponse isFirstBbsTicket(IsFirstBbsTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.isFirstBbsTicketWithOptions(request, runtime);
    }

    /**
     * @param request SuggestCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuggestCategoryResponse
     */
    public SuggestCategoryResponse suggestCategoryWithOptions(SuggestCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cna)) {
            query.put("Cna", request.cna);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionChannel)) {
            query.put("DistributionChannel", request.distributionChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.referrer)) {
            query.put("Referrer", request.referrer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subDistributionChannel)) {
            query.put("SubDistributionChannel", request.subDistributionChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticketId)) {
            query.put("TicketId", request.ticketId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topN)) {
            query.put("TopN", request.topN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useHotSuggestCatchAll)) {
            query.put("UseHotSuggestCatchAll", request.useHotSuggestCatchAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XGatewayExtendInfo)) {
            query.put("XGatewayExtendInfo", request.XGatewayExtendInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuggestCategory"),
            new TeaPair("version", "2020-12-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuggestCategoryResponse());
    }

    /**
     * @param request SuggestCategoryRequest
     * @return SuggestCategoryResponse
     */
    public SuggestCategoryResponse suggestCategory(SuggestCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suggestCategoryWithOptions(request, runtime);
    }
}
