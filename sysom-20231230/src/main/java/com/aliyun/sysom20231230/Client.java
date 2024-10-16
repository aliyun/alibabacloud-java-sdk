// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230;

import com.aliyun.tea.*;
import com.aliyun.sysom20231230.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sysom", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>授权 SysOM 对某个机器进行诊断</p>
     * 
     * @param request AuthDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthDiagnosisResponse
     */
    public AuthDiagnosisResponse authDiagnosisWithOptions(AuthDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateRole)) {
            body.put("autoCreateRole", request.autoCreateRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoInstallAgent)) {
            body.put("autoInstallAgent", request.autoInstallAgent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthDiagnosis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/diagnosis/auth"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthDiagnosisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>授权 SysOM 对某个机器进行诊断</p>
     * 
     * @param request AuthDiagnosisRequest
     * @return AuthDiagnosisResponse
     */
    public AuthDiagnosisResponse authDiagnosis(AuthDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.authDiagnosisWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取copilot服务的返回结果</p>
     * 
     * @param request GenerateCopilotResponseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateCopilotResponseResponse
     */
    public GenerateCopilotResponseResponse generateCopilotResponseWithOptions(GenerateCopilotResponseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.llmParamString)) {
            body.put("llmParamString", request.llmParamString);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateCopilotResponse"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/copilot/generate_copilot_response"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateCopilotResponseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取copilot服务的返回结果</p>
     * 
     * @param request GenerateCopilotResponseRequest
     * @return GenerateCopilotResponseResponse
     */
    public GenerateCopilotResponseResponse generateCopilotResponse(GenerateCopilotResponseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateCopilotResponseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取节点/Pod不同等级异常事件的数量</p>
     * 
     * @param request GetAbnormalEventsCountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAbnormalEventsCountResponse
     */
    public GetAbnormalEventsCountResponse getAbnormalEventsCountWithOptions(GetAbnormalEventsCountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pod)) {
            query.put("pod", request.pod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAbnormalEventsCount"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/abnormaly_events_count"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAbnormalEventsCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取节点/Pod不同等级异常事件的数量</p>
     * 
     * @param request GetAbnormalEventsCountRequest
     * @return GetAbnormalEventsCountResponse
     */
    public GetAbnormalEventsCountResponse getAbnormalEventsCount(GetAbnormalEventsCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAbnormalEventsCountWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取诊断结果</p>
     * 
     * @param request GetDiagnosisResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDiagnosisResultResponse
     */
    public GetDiagnosisResultResponse getDiagnosisResultWithOptions(GetDiagnosisResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("task_id", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiagnosisResult"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/diagnosis/get_diagnosis_results"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiagnosisResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取诊断结果</p>
     * 
     * @param request GetDiagnosisResultRequest
     * @return GetDiagnosisResultResponse
     */
    public GetDiagnosisResultResponse getDiagnosisResult(GetDiagnosisResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDiagnosisResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一段时间的节点/pod健康度比例</p>
     * 
     * @param request GetHealthPercentageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHealthPercentageResponse
     */
    public GetHealthPercentageResponse getHealthPercentageWithOptions(GetHealthPercentageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHealthPercentage"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/health_percentage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHealthPercentageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一段时间的节点/pod健康度比例</p>
     * 
     * @param request GetHealthPercentageRequest
     * @return GetHealthPercentageResponse
     */
    public GetHealthPercentageResponse getHealthPercentage(GetHealthPercentageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHealthPercentageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发起诊断</p>
     * 
     * @param request InvokeDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeDiagnosisResponse
     */
    public InvokeDiagnosisResponse invokeDiagnosisWithOptions(InvokeDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            body.put("service_name", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeDiagnosis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/diagnosis/invoke_diagnosis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeDiagnosisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发起诊断</p>
     * 
     * @param request InvokeDiagnosisRequest
     * @return InvokeDiagnosisResponse
     */
    public InvokeDiagnosisResponse invokeDiagnosis(InvokeDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invokeDiagnosisWithOptions(request, headers, runtime);
    }
}
