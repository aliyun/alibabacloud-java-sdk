// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731;

import com.aliyun.tea.*;
import com.aliyun.paicopilot20250731.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paicopilot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>/api/v1/sessions</p>
     * 
     * @param request SearchInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchInfoResponse
     */
    public SearchInfoResponse searchInfoWithOptions(SearchInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseFilters)) {
            body.put("KnowledgeBaseFilters", request.knowledgeBaseFilters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webFilters)) {
            body.put("WebFilters", request.webFilters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchInfo"),
            new TeaPair("version", "2025-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/searches"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>/api/v1/sessions</p>
     * 
     * @param request SearchInfoRequest
     * @return SearchInfoResponse
     */
    public SearchInfoResponse searchInfo(SearchInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchInfoWithOptions(request, headers, runtime);
    }
}
