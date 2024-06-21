// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529;

import com.aliyun.tea.*;
import com.aliyun.searchplat20240529.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "";
    }


    /**
     * <b>summary</b> : 
     * <p>创建异步提取任务</p>
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
     * <p>创建异步提取任务</p>
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
     * <p>获取异步提取任务状态</p>
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
     * <p>获取异步提取任务状态</p>
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
}
