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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AuthDiagnosisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AuthDiagnosisResponse());
        }

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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateCopilotResponseResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GenerateCopilotResponseResponse());
        }

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
     * <p>流式copilot服务接口</p>
     * 
     * @param request GenerateCopilotStreamResponseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateCopilotStreamResponseResponse
     */
    public GenerateCopilotStreamResponseResponse generateCopilotStreamResponseWithOptions(GenerateCopilotStreamResponseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GenerateCopilotStreamResponse"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/copilot/generate_copilot_stream_response"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateCopilotStreamResponseResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GenerateCopilotStreamResponseResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>流式copilot服务接口</p>
     * 
     * @param request GenerateCopilotStreamResponseRequest
     * @return GenerateCopilotStreamResponseResponse
     */
    public GenerateCopilotStreamResponseResponse generateCopilotStreamResponse(GenerateCopilotStreamResponseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateCopilotStreamResponseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看AI Infra分析结果</p>
     * 
     * @param request GetAIQueryResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAIQueryResultResponse
     */
    public GetAIQueryResultResponse getAIQueryResultWithOptions(GetAIQueryResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisId)) {
            body.put("analysisId", request.analysisId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAIQueryResult"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/app_observ/aiAnalysis/query_result"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetAIQueryResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetAIQueryResultResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查看AI Infra分析结果</p>
     * 
     * @param request GetAIQueryResultRequest
     * @return GetAIQueryResultResponse
     */
    public GetAIQueryResultResponse getAIQueryResult(GetAIQueryResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAIQueryResultWithOptions(request, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.showPod)) {
            query.put("showPod", request.showPod);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetAbnormalEventsCountResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetAbnormalEventsCountResponse());
        }

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
     * <p>获取某个组件的详情</p>
     * 
     * @param request GetAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgentWithOptions(GetAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            query.put("agent_id", request.agentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgent"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/get_agent"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetAgentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取某个组件的详情</p>
     * 
     * @param request GetAgentRequest
     * @return GetAgentResponse
     */
    public GetAgentResponse getAgent(GetAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Agent安装任务执行状态</p>
     * 
     * @param request GetAgentTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentTaskResponse
     */
    public GetAgentTaskResponse getAgentTaskWithOptions(GetAgentTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetAgentTask"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/get_agent_task"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentTaskResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetAgentTaskResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取Agent安装任务执行状态</p>
     * 
     * @param request GetAgentTaskRequest
     * @return GetAgentTaskResponse
     */
    public GetAgentTaskResponse getAgentTask(GetAgentTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAgentTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取copilot历史聊天记录</p>
     * 
     * @param request GetCopilotHistoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCopilotHistoryResponse
     */
    public GetCopilotHistoryResponse getCopilotHistoryWithOptions(GetCopilotHistoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("count", request.count);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCopilotHistory"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/copilot/get_copilot_history"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetCopilotHistoryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetCopilotHistoryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取copilot历史聊天记录</p>
     * 
     * @param request GetCopilotHistoryRequest
     * @return GetCopilotHistoryResponse
     */
    public GetCopilotHistoryResponse getCopilotHistory(GetCopilotHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCopilotHistoryWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiagnosisResultResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDiagnosisResultResponse());
        }

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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHealthPercentageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHealthPercentageResponse());
        }

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
     * <p>获取集群节点数量</p>
     * 
     * @param request GetHostCountRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHostCountResponse
     */
    public GetHostCountResponse getHostCountWithOptions(GetHostCountRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetHostCount"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/host_count"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHostCountResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHostCountResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取集群节点数量</p>
     * 
     * @param request GetHostCountRequest
     * @return GetHostCountResponse
     */
    public GetHostCountResponse getHostCount(GetHostCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHostCountWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例下的某个字段列表</p>
     * 
     * @param request GetHotSpotUniqListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotSpotUniqListResponse
     */
    public GetHotSpotUniqListResponse getHotSpotUniqListWithOptions(GetHotSpotUniqListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.begEnd)) {
            body.put("beg_end", request.begEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begStart)) {
            body.put("beg_start", request.begStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            body.put("pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniq)) {
            body.put("uniq", request.uniq);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotSpotUniqList"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/livetrace_proxy/hotspot_uniq_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotSpotUniqListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHotSpotUniqListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例下的某个字段列表</p>
     * 
     * @param request GetHotSpotUniqListRequest
     * @return GetHotSpotUniqListResponse
     */
    public GetHotSpotUniqListResponse getHotSpotUniqList(GetHotSpotUniqListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotSpotUniqListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取热定分析结果</p>
     * 
     * @param request GetHotspotAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotAnalysisResponse
     */
    public GetHotspotAnalysisResponse getHotspotAnalysisWithOptions(GetHotspotAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("appType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begEnd)) {
            body.put("beg_end", request.begEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begStart)) {
            body.put("beg_start", request.begStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            body.put("pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotAnalysis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/livetrace_hotspot_analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotAnalysisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHotspotAnalysisResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取热定分析结果</p>
     * 
     * @param request GetHotspotAnalysisRequest
     * @return GetHotspotAnalysisResponse
     */
    public GetHotspotAnalysisResponse getHotspotAnalysis(GetHotspotAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotAnalysisWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>热点对比</p>
     * 
     * @param request GetHotspotCompareRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotCompareResponse
     */
    public GetHotspotCompareResponse getHotspotCompareWithOptions(GetHotspotCompareRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beg1End)) {
            body.put("beg1_end", request.beg1End);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beg1Start)) {
            body.put("beg1_start", request.beg1Start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beg2End)) {
            body.put("beg2_end", request.beg2End);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beg2Start)) {
            body.put("beg2_start", request.beg2Start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotType)) {
            body.put("hot_type", request.hotType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance1)) {
            body.put("instance1", request.instance1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance2)) {
            body.put("instance2", request.instance2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid1)) {
            body.put("pid1", request.pid1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid2)) {
            body.put("pid2", request.pid2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotCompare"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/livetrace_hotspot_compare"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotCompareResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHotspotCompareResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>热点对比</p>
     * 
     * @param request GetHotspotCompareRequest
     * @return GetHotspotCompareResponse
     */
    public GetHotspotCompareResponse getHotspotCompare(GetHotspotCompareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotCompareWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取热点实例列表</p>
     * 
     * @param request GetHotspotInstanceListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotInstanceListResponse
     */
    public GetHotspotInstanceListResponse getHotspotInstanceListWithOptions(GetHotspotInstanceListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.begEnd)) {
            body.put("beg_end", request.begEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begStart)) {
            body.put("beg_start", request.begStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotInstanceList"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/livetrace_hotspot_instance_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotInstanceListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHotspotInstanceListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取热点实例列表</p>
     * 
     * @param request GetHotspotInstanceListRequest
     * @return GetHotspotInstanceListResponse
     */
    public GetHotspotInstanceListResponse getHotspotInstanceList(GetHotspotInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotInstanceListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某个实例的pid列表</p>
     * 
     * @param request GetHotspotPidListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotPidListResponse
     */
    public GetHotspotPidListResponse getHotspotPidListWithOptions(GetHotspotPidListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.begEnd)) {
            body.put("beg_end", request.begEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begStart)) {
            body.put("beg_start", request.begStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotPidList"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/livetrace_hotspot_pid_list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotPidListResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHotspotPidListResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取某个实例的pid列表</p>
     * 
     * @param request GetHotspotPidListRequest
     * @return GetHotspotPidListResponse
     */
    public GetHotspotPidListResponse getHotspotPidList(GetHotspotPidListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotPidListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发起热点追踪</p>
     * 
     * @param request GetHotspotTrackingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHotspotTrackingResponse
     */
    public GetHotspotTrackingResponse getHotspotTrackingWithOptions(GetHotspotTrackingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.begEnd)) {
            body.put("beg_end", request.begEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.begStart)) {
            body.put("beg_start", request.begStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotType)) {
            body.put("hot_type", request.hotType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pid)) {
            body.put("pid", request.pid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            body.put("table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotspotTracking"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/livetrace_hotspot_tracking"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotspotTrackingResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetHotspotTrackingResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>发起热点追踪</p>
     * 
     * @param request GetHotspotTrackingRequest
     * @return GetHotspotTrackingResponse
     */
    public GetHotspotTrackingResponse getHotspotTracking(GetHotspotTrackingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getHotspotTrackingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实时集群/节点健康度分数</p>
     * 
     * @param request GetInstantScoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstantScoreResponse
     */
    public GetInstantScoreResponse getInstantScoreWithOptions(GetInstantScoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstantScore"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/instant/score"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstantScoreResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetInstantScoreResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实时集群/节点健康度分数</p>
     * 
     * @param request GetInstantScoreRequest
     * @return GetInstantScoreResponse
     */
    public GetInstantScoreResponse getInstantScore(GetInstantScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstantScoreWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>AI Infra获取分析记录列表</p>
     * 
     * @param request GetListRecordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetListRecordResponse
     */
    public GetListRecordResponse getListRecordWithOptions(GetListRecordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetListRecord"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/app_observ/aiAnalysis/list_record"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetListRecordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetListRecordResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>AI Infra获取分析记录列表</p>
     * 
     * @param request GetListRecordRequest
     * @return GetListRecordResponse
     */
    public GetListRecordResponse getListRecord(GetListRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getListRecordWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一定时间内集群中节点/节点中pod异常问题占比</p>
     * 
     * @param request GetProblemPercentageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProblemPercentageResponse
     */
    public GetProblemPercentageResponse getProblemPercentageWithOptions(GetProblemPercentageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetProblemPercentage"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/problem_percentage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetProblemPercentageResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetProblemPercentageResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取一定时间内集群中节点/节点中pod异常问题占比</p>
     * 
     * @param request GetProblemPercentageRequest
     * @return GetProblemPercentageResponse
     */
    public GetProblemPercentageResponse getProblemPercentage(GetProblemPercentageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getProblemPercentageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取健康分趋势</p>
     * 
     * @param request GetRangeScoreRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRangeScoreResponse
     */
    public GetRangeScoreResponse getRangeScoreWithOptions(GetRangeScoreRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetRangeScore"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/score"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetRangeScoreResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetRangeScoreResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取健康分趋势</p>
     * 
     * @param request GetRangeScoreRequest
     * @return GetRangeScoreResponse
     */
    public GetRangeScoreResponse getRangeScore(GetRangeScoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRangeScoreWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群/节点资源实时使用情况</p>
     * 
     * @param request GetResourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourcesResponse
     */
    public GetResourcesResponse getResourcesWithOptions(GetResourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResources"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/instant/resource"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourcesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetResourcesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取集群/节点资源实时使用情况</p>
     * 
     * @param request GetResourcesRequest
     * @return GetResourcesResponse
     */
    public GetResourcesResponse getResources(GetResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getResourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取功能模块配置</p>
     * 
     * @param tmpReq GetServiceFuncStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceFuncStatusResponse
     */
    public GetServiceFuncStatusResponse getServiceFuncStatusWithOptions(GetServiceFuncStatusRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetServiceFuncStatusShrinkRequest request = new GetServiceFuncStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "params", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            query.put("params", request.paramsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("service_name", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceFuncStatus"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/func-switch/get-service-func-status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceFuncStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetServiceFuncStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取功能模块配置</p>
     * 
     * @param request GetServiceFuncStatusRequest
     * @return GetServiceFuncStatusResponse
     */
    public GetServiceFuncStatusResponse getServiceFuncStatus(GetServiceFuncStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceFuncStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>初始化SysOM，确保角色存在</p>
     * 
     * @param request InitialSysomRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitialSysomResponse
     */
    public InitialSysomResponse initialSysomWithOptions(InitialSysomRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkOnly)) {
            body.put("check_only", request.checkOnly);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitialSysom"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/initial"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InitialSysomResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InitialSysomResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>初始化SysOM，确保角色存在</p>
     * 
     * @param request InitialSysomRequest
     * @return InitialSysomResponse
     */
    public InitialSysomResponse initialSysom(InitialSysomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.initialSysomWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>在指定的实例上安装 Agent</p>
     * 
     * @param request InstallAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallAgentResponse
     */
    public InstallAgentResponse installAgentWithOptions(InstallAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installType)) {
            body.put("install_type", request.installType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallAgent"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/install_agent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAgentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InstallAgentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>在指定的实例上安装 Agent</p>
     * 
     * @param request InstallAgentRequest
     * @return InstallAgentResponse
     */
    public InstallAgentResponse installAgent(InstallAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>给集群安装组件</p>
     * 
     * @param request InstallAgentForClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallAgentForClusterResponse
     */
    public InstallAgentForClusterResponse installAgentForClusterWithOptions(InstallAgentForClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grayscaleConfig)) {
            body.put("grayscale_config", request.grayscaleConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallAgentForCluster"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/install_agent_by_cluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAgentForClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InstallAgentForClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>给集群安装组件</p>
     * 
     * @param request InstallAgentForClusterRequest
     * @return InstallAgentForClusterResponse
     */
    public InstallAgentForClusterResponse installAgentForCluster(InstallAgentForClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.installAgentForClusterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>异常项诊断跳转</p>
     * 
     * @param request InvokeAnomalyDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeAnomalyDiagnosisResponse
     */
    public InvokeAnomalyDiagnosisResponse invokeAnomalyDiagnosisWithOptions(InvokeAnomalyDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeAnomalyDiagnosis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/diagnosis/invoke_anomaly_diagnose"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeAnomalyDiagnosisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InvokeAnomalyDiagnosisResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>异常项诊断跳转</p>
     * 
     * @param request InvokeAnomalyDiagnosisRequest
     * @return InvokeAnomalyDiagnosisResponse
     */
    public InvokeAnomalyDiagnosisResponse invokeAnomalyDiagnosis(InvokeAnomalyDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invokeAnomalyDiagnosisWithOptions(request, headers, runtime);
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
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeDiagnosisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InvokeDiagnosisResponse());
        }

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

    /**
     * <b>summary</b> : 
     * <p>获取一定时间段内的异常事件</p>
     * 
     * @param request ListAbnormalyEventsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAbnormalyEventsResponse
     */
    public ListAbnormalyEventsResponse listAbnormalyEventsWithOptions(ListAbnormalyEventsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pod)) {
            query.put("pod", request.pod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showPod)) {
            query.put("showPod", request.showPod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAbnormalyEvents"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/abnormaly_events"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAbnormalyEventsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAbnormalyEventsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取一定时间段内的异常事件</p>
     * 
     * @param request ListAbnormalyEventsRequest
     * @return ListAbnormalyEventsResponse
     */
    public ListAbnormalyEventsResponse listAbnormalyEvents(ListAbnormalyEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAbnormalyEventsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出 Agent 的安装记录</p>
     * 
     * @param request ListAgentInstallRecordsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentInstallRecordsResponse
     */
    public ListAgentInstallRecordsResponse listAgentInstallRecordsWithOptions(ListAgentInstallRecordsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("instance_id", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("plugin_id", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginVersion)) {
            query.put("plugin_version", request.pluginVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgentInstallRecords"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/list_agent_install_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentInstallRecordsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAgentInstallRecordsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>列出 Agent 的安装记录</p>
     * 
     * @param request ListAgentInstallRecordsRequest
     * @return ListAgentInstallRecordsResponse
     */
    public ListAgentInstallRecordsResponse listAgentInstallRecords(ListAgentInstallRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentInstallRecordsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取 Agent 列表</p>
     * 
     * @param request ListAgentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgentsWithOptions(ListAgentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgents"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/list_agents"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListAgentsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取 Agent 列表</p>
     * 
     * @param request ListAgentsRequest
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgents(ListAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取集群组件安装记录</p>
     * 
     * @param request ListClusterAgentInstallRecordsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterAgentInstallRecordsResponse
     */
    public ListClusterAgentInstallRecordsResponse listClusterAgentInstallRecordsWithOptions(ListClusterAgentInstallRecordsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("plugin_id", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginVersion)) {
            query.put("plugin_version", request.pluginVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterAgentInstallRecords"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/list_cluster_agent_install_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterAgentInstallRecordsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListClusterAgentInstallRecordsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取集群组件安装记录</p>
     * 
     * @param request ListClusterAgentInstallRecordsRequest
     * @return ListClusterAgentInstallRecordsResponse
     */
    public ListClusterAgentInstallRecordsResponse listClusterAgentInstallRecords(ListClusterAgentInstallRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClusterAgentInstallRecordsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前用户的所有集群</p>
     * 
     * @param request ListClustersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterStatus)) {
            query.put("cluster_status", request.clusterStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterType)) {
            query.put("cluster_type", request.clusterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/cluster/list_clusters"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListClustersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取当前用户的所有集群</p>
     * 
     * @param request ListClustersRequest
     * @return ListClustersResponse
     */
    public ListClustersResponse listClusters(ListClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listClustersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取诊断历史记录列表</p>
     * 
     * @param request ListDiagnosisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDiagnosisResponse
     */
    public ListDiagnosisResponse listDiagnosisWithOptions(ListDiagnosisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("service_name", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiagnosis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/diagnosis/list_diagnosis"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiagnosisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListDiagnosisResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取诊断历史记录列表</p>
     * 
     * @param request ListDiagnosisRequest
     * @return ListDiagnosisResponse
     */
    public ListDiagnosisResponse listDiagnosis(ListDiagnosisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiagnosisWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一定时间内集群节点/Pod健康度列表</p>
     * 
     * @param request ListInstanceHealthRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceHealthResponse
     */
    public ListInstanceHealthResponse listInstanceHealthWithOptions(ListInstanceHealthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cluster)) {
            query.put("cluster", request.cluster);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            query.put("end", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceHealth"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/cluster_health/range/instance_health_list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceHealthResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListInstanceHealthResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取一定时间内集群节点/Pod健康度列表</p>
     * 
     * @param request ListInstanceHealthRequest
     * @return ListInstanceHealthResponse
     */
    public ListInstanceHealthResponse listInstanceHealth(ListInstanceHealthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceHealthWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例状态</p>
     * 
     * @param request ListInstanceStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceStatusResponse
     */
    public ListInstanceStatusResponse listInstanceStatusWithOptions(ListInstanceStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceStatus"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/list_instance_status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceStatusResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListInstanceStatusResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例状态</p>
     * 
     * @param request ListInstanceStatusRequest
     * @return ListInstanceStatusResponse
     */
    public ListInstanceStatusResponse listInstanceStatus(ListInstanceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例列表</p>
     * 
     * @param request ListInstancesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/list_instances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListInstancesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例列表</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstancesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例中的pod列表</p>
     * 
     * @param request ListPodsOfInstanceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPodsOfInstanceResponse
     */
    public ListPodsOfInstanceResponse listPodsOfInstanceWithOptions(ListPodsOfInstanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("cluster_id", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            query.put("current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            query.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPodsOfInstance"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/list_pod_of_instance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPodsOfInstanceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPodsOfInstanceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取实例中的pod列表</p>
     * 
     * @param request ListPodsOfInstanceRequest
     * @return ListPodsOfInstanceResponse
     */
    public ListPodsOfInstanceResponse listPodsOfInstance(ListPodsOfInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPodsOfInstanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出所有纳管了机器的区域</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/instance/list_regions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListRegionsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>列出所有纳管了机器的区域</p>
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRegionsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启动AI作业分析</p>
     * 
     * @param request StartAIAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartAIAnalysisResponse
     */
    public StartAIAnalysisResponse startAIAnalysisWithOptions(StartAIAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            body.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comms)) {
            body.put("comms", request.comms);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instance)) {
            body.put("instance", request.instance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pids)) {
            body.put("pids", request.pids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            body.put("timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAIAnalysis"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/start_ai_analysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new StartAIAnalysisResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new StartAIAnalysisResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>启动AI作业分析</p>
     * 
     * @param request StartAIAnalysisRequest
     * @return StartAIAnalysisResponse
     */
    public StartAIAnalysisResponse startAIAnalysis(StartAIAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.startAIAnalysisWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>卸载 SysOM Agent</p>
     * 
     * @param request UninstallAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallAgentResponse
     */
    public UninstallAgentResponse uninstallAgentWithOptions(UninstallAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallAgent"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/uninstall_agent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallAgentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UninstallAgentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>卸载 SysOM Agent</p>
     * 
     * @param request UninstallAgentRequest
     * @return UninstallAgentResponse
     */
    public UninstallAgentResponse uninstallAgent(UninstallAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>给集群卸载组件</p>
     * 
     * @param request UninstallAgentForClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallAgentForClusterResponse
     */
    public UninstallAgentForClusterResponse uninstallAgentForClusterWithOptions(UninstallAgentForClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("cluster_id", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallAgentForCluster"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/uninstall_agent_by_cluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallAgentForClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UninstallAgentForClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>给集群卸载组件</p>
     * 
     * @param request UninstallAgentForClusterRequest
     * @return UninstallAgentForClusterResponse
     */
    public UninstallAgentForClusterResponse uninstallAgentForCluster(UninstallAgentForClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uninstallAgentForClusterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>异常项关注度更新</p>
     * 
     * @param tmpReq UpdateEventsAttentionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEventsAttentionResponse
     */
    public UpdateEventsAttentionResponse updateEventsAttentionWithOptions(UpdateEventsAttentionRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEventsAttentionShrinkRequest request = new UpdateEventsAttentionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            query.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEventsAttention"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/openapi/proxy/post/cluster_update_events_attention"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEventsAttentionResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateEventsAttentionResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>异常项关注度更新</p>
     * 
     * @param request UpdateEventsAttentionRequest
     * @return UpdateEventsAttentionResponse
     */
    public UpdateEventsAttentionResponse updateEventsAttention(UpdateEventsAttentionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateEventsAttentionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取功能模块配置</p>
     * 
     * @param tmpReq UpdateFuncSwitchRecordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFuncSwitchRecordResponse
     */
    public UpdateFuncSwitchRecordResponse updateFuncSwitchRecordWithOptions(UpdateFuncSwitchRecordRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateFuncSwitchRecordShrinkRequest request = new UpdateFuncSwitchRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.params)) {
            request.paramsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.params, "params", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsShrink)) {
            query.put("params", request.paramsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("service_name", request.serviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFuncSwitchRecord"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/func-switch/update-service-func-switch"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFuncSwitchRecordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateFuncSwitchRecordResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>获取功能模块配置</p>
     * 
     * @param request UpdateFuncSwitchRecordRequest
     * @return UpdateFuncSwitchRecordResponse
     */
    public UpdateFuncSwitchRecordResponse updateFuncSwitchRecord(UpdateFuncSwitchRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFuncSwitchRecordWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 SysOM Agent</p>
     * 
     * @param request UpgradeAgentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeAgentResponse
     */
    public UpgradeAgentResponse upgradeAgentWithOptions(UpgradeAgentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instances)) {
            body.put("instances", request.instances);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeAgent"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/upgrade_agent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeAgentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpgradeAgentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>更新 SysOM Agent</p>
     * 
     * @param request UpgradeAgentRequest
     * @return UpgradeAgentResponse
     */
    public UpgradeAgentResponse upgradeAgent(UpgradeAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeAgentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>给集群更新组件</p>
     * 
     * @param request UpgradeAgentForClusterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeAgentForClusterResponse
     */
    public UpgradeAgentForClusterResponse upgradeAgentForClusterWithOptions(UpgradeAgentForClusterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("agent_version", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("cluster_id", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeAgentForCluster"),
            new TeaPair("version", "2023-12-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/am/agent/upgrade_agent_by_cluster"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeAgentForClusterResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpgradeAgentForClusterResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>给集群更新组件</p>
     * 
     * @param request UpgradeAgentForClusterRequest
     * @return UpgradeAgentForClusterResponse
     */
    public UpgradeAgentForClusterResponse upgradeAgentForCluster(UpgradeAgentForClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeAgentForClusterWithOptions(request, headers, runtime);
    }
}
