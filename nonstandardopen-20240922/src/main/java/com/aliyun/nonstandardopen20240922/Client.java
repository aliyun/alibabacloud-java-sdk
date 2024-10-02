// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nonstandardopen20240922;

import com.aliyun.tea.*;
import com.aliyun.nonstandardopen20240922.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "NonStandardOpen";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("nonstandardopen", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>创建分销token</p>
     * 
     * @param request GetTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenResponse
     */
    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("appKey", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            query.put("appSecret", request.appSecret);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2024-09-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/distribution/nonstandard/getToken"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetTokenResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>创建分销token</p>
     * 
     * @param request GetTokenRequest
     * @return GetTokenResponse
     */
    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分销生卡</p>
     * 
     * @param request InitCardRequest
     * @param headers InitCardHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitCardResponse
     */
    public InitCardResponse initCardWithOptions(InitCardRequest request, InitCardHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizParam)) {
            query.put("bizParam", request.bizParam);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("xAcsAirticketAccessToken", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("xAcsAirticketLanguage", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitCard"),
            new TeaPair("version", "2024-09-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/distribution/nonstandard/initCard"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InitCardResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InitCardResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>分销生卡</p>
     * 
     * @param request InitCardRequest
     * @return InitCardResponse
     */
    public InitCardResponse initCard(InitCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InitCardHeaders headers = new InitCardHeaders();
        return this.initCardWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分销订单信息查询</p>
     * 
     * @param request QueryOrderInfoRequest
     * @param headers QueryOrderInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderInfoResponse
     */
    public QueryOrderInfoResponse queryOrderInfoWithOptions(QueryOrderInfoRequest request, QueryOrderInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizParam)) {
            query.put("bizParam", request.bizParam);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("xAcsAirticketAccessToken", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("xAcsAirticketLanguage", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderInfo"),
            new TeaPair("version", "2024-09-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/distribution/nonstandard/queryOrderInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryOrderInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>分销订单信息查询</p>
     * 
     * @param request QueryOrderInfoRequest
     * @return QueryOrderInfoResponse
     */
    public QueryOrderInfoResponse queryOrderInfo(QueryOrderInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryOrderInfoHeaders headers = new QueryOrderInfoHeaders();
        return this.queryOrderInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分销退确认</p>
     * 
     * @param request RefundConfirmRequest
     * @param headers RefundConfirmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundConfirmResponse
     */
    public RefundConfirmResponse refundConfirmWithOptions(RefundConfirmRequest request, RefundConfirmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizParam)) {
            query.put("bizParam", request.bizParam);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("xAcsAirticketAccessToken", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("xAcsAirticketLanguage", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundConfirm"),
            new TeaPair("version", "2024-09-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/distribution/nonstandard/refundConfirm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RefundConfirmResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RefundConfirmResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>分销退确认</p>
     * 
     * @param request RefundConfirmRequest
     * @return RefundConfirmResponse
     */
    public RefundConfirmResponse refundConfirm(RefundConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RefundConfirmHeaders headers = new RefundConfirmHeaders();
        return this.refundConfirmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分销退提交</p>
     * 
     * @param request RefundSubmitRequest
     * @param headers RefundSubmitHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundSubmitResponse
     */
    public RefundSubmitResponse refundSubmitWithOptions(RefundSubmitRequest request, RefundSubmitHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizParam)) {
            query.put("bizParam", request.bizParam);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("xAcsAirticketAccessToken", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("xAcsAirticketLanguage", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundSubmit"),
            new TeaPair("version", "2024-09-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/distribution/nonstandard/refundSubmit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RefundSubmitResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RefundSubmitResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>分销退提交</p>
     * 
     * @param request RefundSubmitRequest
     * @return RefundSubmitResponse
     */
    public RefundSubmitResponse refundSubmit(RefundSubmitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RefundSubmitHeaders headers = new RefundSubmitHeaders();
        return this.refundSubmitWithOptions(request, headers, runtime);
    }
}
