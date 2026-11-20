// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qwenb2bmed20261116;

import com.aliyun.tea.*;
import com.aliyun.qwenb2bmed20261116.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "QwenB2BMed";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("qwenb2bmed", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Initiates a conversation with the Qwen medical agent.</p>
     * 
     * @param request MedicalAgentChatRequest
     * @param headers MedicalAgentChatHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return MedicalAgentChatResponse
     */
    public MedicalAgentChatResponse medicalAgentChatWithOptions(MedicalAgentChatRequest request, MedicalAgentChatHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.communication)) {
            body.put("communication", request.communication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWAccess)) {
            realHeaders.put("X-GW-Access", com.aliyun.teautil.Common.toJSONString(headers.xGWAccess));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWNonce)) {
            realHeaders.put("X-GW-Nonce", com.aliyun.teautil.Common.toJSONString(headers.xGWNonce));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWProtocol)) {
            realHeaders.put("X-GW-Protocol", com.aliyun.teautil.Common.toJSONString(headers.xGWProtocol));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWSignature)) {
            realHeaders.put("X-GW-Signature", com.aliyun.teautil.Common.toJSONString(headers.xGWSignature));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWTimestamp)) {
            realHeaders.put("X-GW-Timestamp", com.aliyun.teautil.Common.toJSONString(headers.xGWTimestamp));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xRequestId)) {
            realHeaders.put("X-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xRequestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MedicalAgentChat"),
            new TeaPair("version", "2026-11-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/api/medicalQa"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MedicalAgentChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates a conversation with the Qwen medical agent.</p>
     * 
     * @param request MedicalAgentChatRequest
     * @return MedicalAgentChatResponse
     */
    public MedicalAgentChatResponse medicalAgentChat(MedicalAgentChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MedicalAgentChatHeaders headers = new MedicalAgentChatHeaders();
        return this.medicalAgentChatWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs inference using the external Qwen medical foundation model.</p>
     * 
     * @param request MedicalModelInferenceRequest
     * @param headers MedicalModelInferenceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return MedicalModelInferenceResponse
     */
    public MedicalModelInferenceResponse medicalModelInferenceWithOptions(MedicalModelInferenceRequest request, MedicalModelInferenceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.communication)) {
            body.put("communication", request.communication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWAccess)) {
            realHeaders.put("X-GW-Access", com.aliyun.teautil.Common.toJSONString(headers.xGWAccess));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWNonce)) {
            realHeaders.put("X-GW-Nonce", com.aliyun.teautil.Common.toJSONString(headers.xGWNonce));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWProtocol)) {
            realHeaders.put("X-GW-Protocol", com.aliyun.teautil.Common.toJSONString(headers.xGWProtocol));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWSignature)) {
            realHeaders.put("X-GW-Signature", com.aliyun.teautil.Common.toJSONString(headers.xGWSignature));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWTimestamp)) {
            realHeaders.put("X-GW-Timestamp", com.aliyun.teautil.Common.toJSONString(headers.xGWTimestamp));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xRequestId)) {
            realHeaders.put("X-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xRequestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MedicalModelInference"),
            new TeaPair("version", "2026-11-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/api/directModel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MedicalModelInferenceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs inference using the external Qwen medical foundation model.</p>
     * 
     * @param request MedicalModelInferenceRequest
     * @return MedicalModelInferenceResponse
     */
    public MedicalModelInferenceResponse medicalModelInference(MedicalModelInferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MedicalModelInferenceHeaders headers = new MedicalModelInferenceHeaders();
        return this.medicalModelInferenceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the Qwen medical service and returns the current activation status.</p>
     * 
     * @param request OpenServiceRequest
     * @param headers OpenServiceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenServiceResponse
     */
    public OpenServiceResponse openServiceWithOptions(OpenServiceRequest request, OpenServiceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.communication)) {
            body.put("communication", request.communication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.openBenefits)) {
            body.put("openBenefits", request.openBenefits);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWAccess)) {
            realHeaders.put("X-GW-Access", com.aliyun.teautil.Common.toJSONString(headers.xGWAccess));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWNonce)) {
            realHeaders.put("X-GW-Nonce", com.aliyun.teautil.Common.toJSONString(headers.xGWNonce));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWSignature)) {
            realHeaders.put("X-GW-Signature", com.aliyun.teautil.Common.toJSONString(headers.xGWSignature));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xGWTimestamp)) {
            realHeaders.put("X-GW-Timestamp", com.aliyun.teautil.Common.toJSONString(headers.xGWTimestamp));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xRequestId)) {
            realHeaders.put("X-Request-Id", com.aliyun.teautil.Common.toJSONString(headers.xRequestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenService"),
            new TeaPair("version", "2026-11-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1/api/medical/openService"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates the Qwen medical service and returns the current activation status.</p>
     * 
     * @param request OpenServiceRequest
     * @return OpenServiceResponse
     */
    public OpenServiceResponse openService(OpenServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OpenServiceHeaders headers = new OpenServiceHeaders();
        return this.openServiceWithOptions(request, headers, runtime);
    }
}
