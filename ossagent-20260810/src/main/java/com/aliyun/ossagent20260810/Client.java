// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260810;

import com.aliyun.tea.*;
import com.aliyun.ossagent20260810.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ossagent", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>A2A接口</p>
     * 
     * @param request A2aRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return A2aResponse
     */
    public A2aResponse a2aWithOptions(A2aRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonrpc)) {
            body.put("jsonrpc", request.jsonrpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.method)) {
            body.put("method", request.method);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "a2a"),
            new TeaPair("version", "2026-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "any")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new A2aResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>A2A接口</p>
     * 
     * @param request A2aRequest
     * @return A2aResponse
     */
    public A2aResponse a2a(A2aRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.a2aWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Agent_Card</p>
     * 
     * @param request AgentCardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AgentCardResponse
     */
    public AgentCardResponse agent_cardWithOptions(AgentCardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "agent_card"),
            new TeaPair("version", "2026-08-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "any")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AgentCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Agent_Card</p>
     * 
     * @param request AgentCardRequest
     * @return AgentCardResponse
     */
    public AgentCardResponse agent_card(AgentCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.agent_cardWithOptions(request, runtime);
    }
}
