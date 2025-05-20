// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529;

import com.aliyun.tea.*;
import com.aliyun.searchplat20240529.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "Searchplat";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "";
    }


    /**
     * <b>summary</b> : 
     * <p>创建文档解析异步提取任务</p>
     * 
     * @param request CreateDocumentAnalyzeTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDocumentAnalyzeTaskResponse
     */
    public CreateDocumentAnalyzeTaskResponse createDocumentAnalyzeTaskWithOptions(String workspaceName, String serviceId, CreateDocumentAnalyzeTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.document)) {
            body.put("document", request.document);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            body.put("strategy", request.strategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDocumentAnalyzeTask"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/document-analyze/" + serviceId + "/async"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateDocumentAnalyzeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建文档解析异步提取任务</p>
     * 
     * @param request CreateDocumentAnalyzeTaskRequest
     * @return CreateDocumentAnalyzeTaskResponse
     */
    public CreateDocumentAnalyzeTaskResponse createDocumentAnalyzeTask(String workspaceName, String serviceId, CreateDocumentAnalyzeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDocumentAnalyzeTaskWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建图片解析异步提取任务</p>
     * 
     * @param request CreateImageAnalyzeTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageAnalyzeTaskResponse
     */
    public CreateImageAnalyzeTaskResponse createImageAnalyzeTaskWithOptions(String workspaceName, String serviceId, CreateImageAnalyzeTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.document)) {
            body.put("document", request.document);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageAnalyzeTask"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/image-analyze/" + serviceId + "/async"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateImageAnalyzeTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建图片解析异步提取任务</p>
     * 
     * @param request CreateImageAnalyzeTaskRequest
     * @return CreateImageAnalyzeTaskResponse
     */
    public CreateImageAnalyzeTaskResponse createImageAnalyzeTask(String workspaceName, String serviceId, CreateImageAnalyzeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createImageAnalyzeTaskWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档解析异步提取任务状态</p>
     * 
     * @param request GetDocumentAnalyzeTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentAnalyzeTaskStatusResponse
     */
    public GetDocumentAnalyzeTaskStatusResponse getDocumentAnalyzeTaskStatusWithOptions(String workspaceName, String serviceId, GetDocumentAnalyzeTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetDocumentAnalyzeTaskStatus"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/document-analyze/" + serviceId + "/async/task-status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetDocumentAnalyzeTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取文档解析异步提取任务状态</p>
     * 
     * @param request GetDocumentAnalyzeTaskStatusRequest
     * @return GetDocumentAnalyzeTaskStatusResponse
     */
    public GetDocumentAnalyzeTaskStatusResponse getDocumentAnalyzeTaskStatus(String workspaceName, String serviceId, GetDocumentAnalyzeTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentAnalyzeTaskStatusWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档相关性打分</p>
     * 
     * @param request GetDocumentRankRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentRankResponse
     */
    public GetDocumentRankResponse getDocumentRankWithOptions(String workspaceName, String serviceId, GetDocumentRankRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docs)) {
            body.put("docs", request.docs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentRank"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/ranker/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetDocumentRankResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档相关性打分</p>
     * 
     * @param request GetDocumentRankRequest
     * @return GetDocumentRankResponse
     */
    public GetDocumentRankResponse getDocumentRank(String workspaceName, String serviceId, GetDocumentRankRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentRankWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文档切片</p>
     * 
     * @param request GetDocumentSplitRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDocumentSplitResponse
     */
    public GetDocumentSplitResponse getDocumentSplitWithOptions(String workspaceName, String serviceId, GetDocumentSplitRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.document)) {
            body.put("document", request.document);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategy)) {
            body.put("strategy", request.strategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDocumentSplit"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/document-split/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetDocumentSplitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文档切片</p>
     * 
     * @param request GetDocumentSplitRequest
     * @return GetDocumentSplitResponse
     */
    public GetDocumentSplitResponse getDocumentSplit(String workspaceName, String serviceId, GetDocumentSplitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDocumentSplitWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>向量微调</p>
     * 
     * @param request GetEmbeddingTuningRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEmbeddingTuningResponse
     */
    public GetEmbeddingTuningResponse getEmbeddingTuningWithOptions(String workspaceName, String serviceId, GetEmbeddingTuningRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEmbeddingTuning"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/embedding-tuning/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetEmbeddingTuningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>向量微调</p>
     * 
     * @param request GetEmbeddingTuningRequest
     * @return GetEmbeddingTuningResponse
     */
    public GetEmbeddingTuningResponse getEmbeddingTuning(String workspaceName, String serviceId, GetEmbeddingTuningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEmbeddingTuningWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片解析异步提取任务状态</p>
     * 
     * @param request GetImageAnalyzeTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageAnalyzeTaskStatusResponse
     */
    public GetImageAnalyzeTaskStatusResponse getImageAnalyzeTaskStatusWithOptions(String workspaceName, String serviceId, GetImageAnalyzeTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetImageAnalyzeTaskStatus"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/image-analyze/" + serviceId + "/async/task-status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetImageAnalyzeTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取图片解析异步提取任务状态</p>
     * 
     * @param request GetImageAnalyzeTaskStatusRequest
     * @return GetImageAnalyzeTaskStatusResponse
     */
    public GetImageAnalyzeTaskStatusResponse getImageAnalyzeTaskStatus(String workspaceName, String serviceId, GetImageAnalyzeTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageAnalyzeTaskStatusWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>多模态向量化</p>
     * 
     * @param request GetMultiModalEmbeddingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMultiModalEmbeddingResponse
     */
    public GetMultiModalEmbeddingResponse getMultiModalEmbeddingWithOptions(String workspaceName, String serviceId, GetMultiModalEmbeddingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMultiModalEmbedding"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/multi-modal-embedding/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMultiModalEmbeddingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>多模态向量化</p>
     * 
     * @param request GetMultiModalEmbeddingRequest
     * @return GetMultiModalEmbeddingResponse
     */
    public GetMultiModalEmbeddingResponse getMultiModalEmbedding(String workspaceName, String serviceId, GetMultiModalEmbeddingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMultiModalEmbeddingWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取推理结果</p>
     * 
     * @param request GetPredictionRequest
     * @param headers GetPredictionHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPredictionResponse
     */
    public GetPredictionResponse getPredictionWithOptions(String deploymentId, GetPredictionRequest request, GetPredictionHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.token)) {
            realHeaders.put("Token", com.aliyun.teautil.Common.toJSONString(headers.token));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", request.body)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrediction"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/deployments/" + deploymentId + "/predict"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetPredictionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取推理结果</p>
     * 
     * @param request GetPredictionRequest
     * @return GetPredictionResponse
     */
    public GetPredictionResponse getPrediction(String deploymentId, GetPredictionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetPredictionHeaders headers = new GetPredictionHeaders();
        return this.getPredictionWithOptions(deploymentId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取query分析结果</p>
     * 
     * @param request GetQueryAnalysisRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryAnalysisResponse
     */
    public GetQueryAnalysisResponse getQueryAnalysisWithOptions(String workspaceName, String serviceId, GetQueryAnalysisRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functions)) {
            body.put("functions", request.functions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.history)) {
            body.put("history", request.history);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryAnalysis"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/query-analyze/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetQueryAnalysisResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取query分析结果</p>
     * 
     * @param request GetQueryAnalysisRequest
     * @return GetQueryAnalysisResponse
     */
    public GetQueryAnalysisResponse getQueryAnalysis(String workspaceName, String serviceId, GetQueryAnalysisRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQueryAnalysisWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文本向量化</p>
     * 
     * @param request GetTextEmbeddingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextEmbeddingResponse
     */
    public GetTextEmbeddingResponse getTextEmbeddingWithOptions(String workspaceName, String serviceId, GetTextEmbeddingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputType)) {
            body.put("input_type", request.inputType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTextEmbedding"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/text-embedding/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetTextEmbeddingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文本向量化</p>
     * 
     * @param request GetTextEmbeddingRequest
     * @return GetTextEmbeddingResponse
     */
    public GetTextEmbeddingResponse getTextEmbedding(String workspaceName, String serviceId, GetTextEmbeddingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextEmbeddingWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>大模型问答</p>
     * 
     * @param request GetTextGenerationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextGenerationResponse
     */
    public GetTextGenerationResponse getTextGenerationWithOptions(String workspaceName, String serviceId, GetTextGenerationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.csiLevel)) {
            body.put("csi_level", request.csiLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSearch)) {
            body.put("enable_search", request.enableSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTextGeneration"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/text-generation/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetTextGenerationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>大模型问答</p>
     * 
     * @param request GetTextGenerationRequest
     * @return GetTextGenerationResponse
     */
    public GetTextGenerationResponse getTextGeneration(String workspaceName, String serviceId, GetTextGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextGenerationWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>文本稀疏向量化</p>
     * 
     * @param request GetTextSparseEmbeddingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTextSparseEmbeddingResponse
     */
    public GetTextSparseEmbeddingResponse getTextSparseEmbeddingWithOptions(String workspaceName, String serviceId, GetTextSparseEmbeddingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputType)) {
            body.put("input_type", request.inputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnToken)) {
            body.put("return_token", request.returnToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTextSparseEmbedding"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/text-sparse-embedding/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetTextSparseEmbeddingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>文本稀疏向量化</p>
     * 
     * @param request GetTextSparseEmbeddingRequest
     * @return GetTextSparseEmbeddingResponse
     */
    public GetTextSparseEmbeddingResponse getTextSparseEmbedding(String workspaceName, String serviceId, GetTextSparseEmbeddingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTextSparseEmbeddingWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>联网搜索</p>
     * 
     * @param request GetWebSearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWebSearchResponse
     */
    public GetWebSearchResponse getWebSearchWithOptions(String workspaceName, String serviceId, GetWebSearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            body.put("top_k", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.way)) {
            body.put("way", request.way);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWebSearch"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/web-search/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetWebSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>联网搜索</p>
     * 
     * @param request GetWebSearchRequest
     * @return GetWebSearchResponse
     */
    public GetWebSearchResponse getWebSearch(String workspaceName, String serviceId, GetWebSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWebSearchWithOptions(workspaceName, serviceId, request, headers, runtime);
    }
}
