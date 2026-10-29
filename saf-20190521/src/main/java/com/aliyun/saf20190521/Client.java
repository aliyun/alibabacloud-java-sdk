// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.saf20190521;

import com.aliyun.tea.*;
import com.aliyun.saf20190521.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "saf.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("saf", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Detects risks. This API operation supports public service invocation and allows you to invoke custom events.</p>
     * 
     * @param request ExecuteRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteRequestResponse
     */
    public ExecuteRequestResponse executeRequestWithOptions(ExecuteRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteRequest"),
            new TeaPair("version", "2019-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteRequestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detects risks. This API operation supports public service invocation and allows you to invoke custom events.</p>
     * 
     * @param request ExecuteRequestRequest
     * @return ExecuteRequestResponse
     */
    public ExecuteRequestResponse executeRequest(ExecuteRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeRequestWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detects risks. This operation supports only custom event calls and is available only in the Malaysia region.</p>
     * 
     * @param request ExecuteRequestMLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteRequestMLResponse
     */
    public ExecuteRequestMLResponse executeRequestMLWithOptions(ExecuteRequestMLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteRequestML"),
            new TeaPair("version", "2019-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteRequestMLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detects risks. This operation supports only custom event calls and is available only in the Malaysia region.</p>
     * 
     * @param request ExecuteRequestMLRequest
     * @return ExecuteRequestMLResponse
     */
    public ExecuteRequestMLResponse executeRequestML(ExecuteRequestMLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeRequestMLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detects risks. This API allows you to invoke public services and custom events.</p>
     * 
     * @param request ExecuteRequestSGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteRequestSGResponse
     */
    public ExecuteRequestSGResponse executeRequestSGWithOptions(ExecuteRequestSGRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteRequestSG"),
            new TeaPair("version", "2019-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteRequestSGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detects risks. This API allows you to invoke public services and custom events.</p>
     * 
     * @param request ExecuteRequestSGRequest
     * @return ExecuteRequestSGResponse
     */
    public ExecuteRequestSGResponse executeRequestSG(ExecuteRequestSGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeRequestSGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detects risks. This operation supports only custom event calls.</p>
     * 
     * @param request RequestDecisionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RequestDecisionResponse
     */
    public RequestDecisionResponse requestDecisionWithOptions(RequestDecisionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eventCode)) {
            query.put("EventCode", request.eventCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceParameters)) {
            query.put("ServiceParameters", request.serviceParameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RequestDecision"),
            new TeaPair("version", "2019-05-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RequestDecisionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detects risks. This operation supports only custom event calls.</p>
     * 
     * @param request RequestDecisionRequest
     * @return RequestDecisionResponse
     */
    public RequestDecisionResponse requestDecision(RequestDecisionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requestDecisionWithOptions(request, runtime);
    }
}
