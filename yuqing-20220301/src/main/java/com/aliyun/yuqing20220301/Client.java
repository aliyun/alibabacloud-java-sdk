// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20220301;

import com.aliyun.tea.*;
import com.aliyun.yuqing20220301.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("yuqing", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CloseProductResponse closeProductWithOptions(CloseProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productInstance)) {
            body.put("productInstance", request.productInstance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseProduct"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/closeProduct.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseProductResponse());
    }

    public CloseProductResponse closeProduct(CloseProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.closeProductWithOptions(request, headers, runtime);
    }

    public ConsoleApiProxyResponse consoleApiProxyWithOptions(ConsoleApiProxyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConsoleApiProxy"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/consoleApiProxy.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConsoleApiProxyResponse());
    }

    public ConsoleApiProxyResponse consoleApiProxy(ConsoleApiProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.consoleApiProxyWithOptions(request, headers, runtime);
    }

    /**
      * @deprecated
      *
      * @param request ConsoleProxyRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return ConsoleProxyResponse
     */
    // Deprecated
    public ConsoleProxyResponse consoleProxyWithOptions(ConsoleProxyRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            body.put("appCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interfaceName)) {
            body.put("interfaceName", request.interfaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramJson)) {
            body.put("paramJson", request.paramJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            body.put("teamHashId", request.teamHashId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConsoleProxy"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/consoleProxy.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConsoleProxyResponse());
    }

    /**
      * @deprecated
      *
      * @param request ConsoleProxyRequest
      * @return ConsoleProxyResponse
     */
    // Deprecated
    public ConsoleProxyResponse consoleProxy(ConsoleProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.consoleProxyWithOptions(request, headers, runtime);
    }

    public GetAnalysisTaskResultResponse getAnalysisTaskResultWithOptions(GetAnalysisTaskResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisId)) {
            query.put("analysisId", request.analysisId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            query.put("teamHashId", request.teamHashId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAnalysisTaskResult"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/getAnalysisComponentResult.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAnalysisTaskResultResponse());
    }

    public GetAnalysisTaskResultResponse getAnalysisTaskResult(GetAnalysisTaskResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAnalysisTaskResultWithOptions(request, headers, runtime);
    }

    public OpenProductResponse openProductWithOptions(OpenProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productInstance)) {
            body.put("productInstance", request.productInstance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenProduct"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/openProduct.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenProductResponse());
    }

    public OpenProductResponse openProduct(OpenProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.openProductWithOptions(request, headers, runtime);
    }

    public QueryProductInstanceListResponse queryProductInstanceListWithOptions(QueryProductInstanceListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCode)) {
            query.put("appCode", request.appCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromTime)) {
            query.put("fromTime", request.fromTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantUid)) {
            query.put("tenantUid", request.tenantUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toTime)) {
            query.put("toTime", request.toTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProductInstanceList"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/queryProductInstanceList.json"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProductInstanceListResponse());
    }

    public QueryProductInstanceListResponse queryProductInstanceList(QueryProductInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProductInstanceListWithOptions(request, headers, runtime);
    }

    public QueryYuqingMessageResponse queryYuqingMessageWithOptions(QueryYuqingMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchCondition)) {
            body.put("searchCondition", request.searchCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            body.put("teamHashId", request.teamHashId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryYuqingMessage"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/queryYuqingMessage.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryYuqingMessageResponse());
    }

    public QueryYuqingMessageResponse queryYuqingMessage(QueryYuqingMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryYuqingMessageWithOptions(request, headers, runtime);
    }

    public SubmitAnalysisTaskResponse submitAnalysisTaskWithOptions(SubmitAnalysisTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("requestId", request.requestId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analyseType)) {
            body.put("analyseType", request.analyseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchCondition)) {
            body.put("searchCondition", request.searchCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.teamHashId)) {
            body.put("teamHashId", request.teamHashId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAnalysisTask"),
            new TeaPair("version", "2022-03-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/aliyun/submitAnalysisComponent.json"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAnalysisTaskResponse());
    }

    public SubmitAnalysisTaskResponse submitAnalysisTask(SubmitAnalysisTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitAnalysisTaskWithOptions(request, headers, runtime);
    }
}
