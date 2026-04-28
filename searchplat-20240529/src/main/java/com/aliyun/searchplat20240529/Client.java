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
     * <p>创建语音转录异步任务</p>
     * 
     * @param request CreateAudioAsrTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAudioAsrTaskResponse
     */
    public CreateAudioAsrTaskResponse createAudioAsrTaskWithOptions(String workspaceName, String serviceId, CreateAudioAsrTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAudioAsrTask"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/audio-asr/" + serviceId + "/async"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateAudioAsrTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建语音转录异步任务</p>
     * 
     * @param request CreateAudioAsrTaskRequest
     * @return CreateAudioAsrTaskResponse
     */
    public CreateAudioAsrTaskResponse createAudioAsrTask(String workspaceName, String serviceId, CreateAudioAsrTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAudioAsrTaskWithOptions(workspaceName, serviceId, request, headers, runtime);
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
     * <p>存储 Memory 内容</p>
     * 
     * @param request CreateMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemoryResponse
     */
    public CreateMemoryResponse createMemoryWithOptions(String workspaceName, String serviceId, CreateMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enhancements)) {
            body.put("enhancements", request.enhancements);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            body.put("run_id", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMemory"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/memories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateMemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>存储 Memory 内容</p>
     * 
     * @param request CreateMemoryRequest
     * @return CreateMemoryResponse
     */
    public CreateMemoryResponse createMemory(String workspaceName, String serviceId, CreateMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMemoryWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传skill</p>
     * 
     * @param request CreateMemorySkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMemorySkillResponse
     */
    public CreateMemorySkillResponse createMemorySkillWithOptions(String workspaceName, String serviceId, CreateMemorySkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zipBase64)) {
            body.put("zip_base64", request.zipBase64);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMemorySkill"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/skills"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateMemorySkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传skill</p>
     * 
     * @param request CreateMemorySkillRequest
     * @return CreateMemorySkillResponse
     */
    public CreateMemorySkillResponse createMemorySkill(String workspaceName, String serviceId, CreateMemorySkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMemorySkillWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建视频切割异步任务</p>
     * 
     * @param request CreateVideoSegmentationTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVideoSegmentationTaskResponse
     */
    public CreateVideoSegmentationTaskResponse createVideoSegmentationTaskWithOptions(String workspaceName, String serviceId, CreateVideoSegmentationTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoSegmentationTask"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/video-segmentation/" + serviceId + "/async"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateVideoSegmentationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建视频切割异步任务</p>
     * 
     * @param request CreateVideoSegmentationTaskRequest
     * @return CreateVideoSegmentationTaskResponse
     */
    public CreateVideoSegmentationTaskResponse createVideoSegmentationTask(String workspaceName, String serviceId, CreateVideoSegmentationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVideoSegmentationTaskWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建语音转录异步任务</p>
     * 
     * @param request CreateVideoSnapshotTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVideoSnapshotTaskResponse
     */
    public CreateVideoSnapshotTaskResponse createVideoSnapshotTaskWithOptions(String workspaceName, String serviceId, CreateVideoSnapshotTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoSnapshotTask"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/video-snapshot/" + serviceId + "/async"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateVideoSnapshotTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建语音转录异步任务</p>
     * 
     * @param request CreateVideoSnapshotTaskRequest
     * @return CreateVideoSnapshotTaskResponse
     */
    public CreateVideoSnapshotTaskResponse createVideoSnapshotTask(String workspaceName, String serviceId, CreateVideoSnapshotTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVideoSnapshotTaskWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建视频总结异步任务</p>
     * 
     * @param request CreateVideoSummarizationTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVideoSummarizationTaskResponse
     */
    public CreateVideoSummarizationTaskResponse createVideoSummarizationTaskWithOptions(String workspaceName, String serviceId, CreateVideoSummarizationTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            body.put("parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVideoSummarizationTask"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/video-summarization/" + serviceId + "/async"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new CreateVideoSummarizationTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建视频总结异步任务</p>
     * 
     * @param request CreateVideoSummarizationTaskRequest
     * @return CreateVideoSummarizationTaskResponse
     */
    public CreateVideoSummarizationTaskResponse createVideoSummarizationTask(String workspaceName, String serviceId, CreateVideoSummarizationTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createVideoSummarizationTaskWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一条 Memory</p>
     * 
     * @param request DeleteMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemoryResponse
     */
    public DeleteMemoryResponse deleteMemoryWithOptions(String workspaceName, String serviceId, String memoryId, DeleteMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMemory"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/memories/" + memoryId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一条 Memory</p>
     * 
     * @param request DeleteMemoryRequest
     * @return DeleteMemoryResponse
     */
    public DeleteMemoryResponse deleteMemory(String workspaceName, String serviceId, String memoryId, DeleteMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemoryWithOptions(workspaceName, serviceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除skill</p>
     * 
     * @param request DeleteMemorySkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMemorySkillResponse
     */
    public DeleteMemorySkillResponse deleteMemorySkillWithOptions(String workspaceName, String serviceId, String skillId, DeleteMemorySkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMemorySkill"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/skills/" + skillId + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new DeleteMemorySkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除skill</p>
     * 
     * @param request DeleteMemorySkillRequest
     * @return DeleteMemorySkillResponse
     */
    public DeleteMemorySkillResponse deleteMemorySkill(String workspaceName, String serviceId, String skillId, DeleteMemorySkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMemorySkillWithOptions(workspaceName, serviceId, skillId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频截帧异步提取任务状态</p>
     * 
     * @param request GetAudioAsrTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAudioAsrTaskStatusResponse
     */
    public GetAudioAsrTaskStatusResponse getAudioAsrTaskStatusWithOptions(String workspaceName, String serviceId, GetAudioAsrTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetAudioAsrTaskStatus"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/audio-asr/" + serviceId + "/async/task-status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetAudioAsrTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频截帧异步提取任务状态</p>
     * 
     * @param request GetAudioAsrTaskStatusRequest
     * @return GetAudioAsrTaskStatusResponse
     */
    public GetAudioAsrTaskStatusResponse getAudioAsrTaskStatus(String workspaceName, String serviceId, GetAudioAsrTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAudioAsrTaskStatusWithOptions(workspaceName, serviceId, request, headers, runtime);
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
     * <p>图片主体检测</p>
     * 
     * @param request GetImageObjectDetectionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageObjectDetectionResponse
     */
    public GetImageObjectDetectionResponse getImageObjectDetectionWithOptions(String workspaceName, String serviceId, GetImageObjectDetectionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            body.put("image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageObjectDetection"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/image-object-detection/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetImageObjectDetectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片主体检测</p>
     * 
     * @param request GetImageObjectDetectionRequest
     * @return GetImageObjectDetectionResponse
     */
    public GetImageObjectDetectionResponse getImageObjectDetection(String workspaceName, String serviceId, GetImageObjectDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getImageObjectDetectionWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看memory详情</p>
     * 
     * @param request GetMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryResponse
     */
    public GetMemoryResponse getMemoryWithOptions(String workspaceName, String serviceId, String memoryId, GetMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemory"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/memories/" + memoryId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看memory详情</p>
     * 
     * @param request GetMemoryRequest
     * @return GetMemoryResponse
     */
    public GetMemoryResponse getMemory(String workspaceName, String serviceId, String memoryId, GetMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryWithOptions(workspaceName, serviceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查 Memory 服务健康状态</p>
     * 
     * @param request GetMemoryHealthRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryHealthResponse
     */
    public GetMemoryHealthResponse getMemoryHealthWithOptions(String workspaceName, String serviceId, GetMemoryHealthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemoryHealth"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/health"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMemoryHealthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查 Memory 服务健康状态</p>
     * 
     * @param request GetMemoryHealthRequest
     * @return GetMemoryHealthResponse
     */
    public GetMemoryHealthResponse getMemoryHealth(String workspaceName, String serviceId, GetMemoryHealthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryHealthWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看skill详情</p>
     * 
     * @param request GetMemorySkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemorySkillResponse
     */
    public GetMemorySkillResponse getMemorySkillWithOptions(String workspaceName, String serviceId, String skillId, GetMemorySkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemorySkill"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/skills/" + skillId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMemorySkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看skill详情</p>
     * 
     * @param request GetMemorySkillRequest
     * @return GetMemorySkillResponse
     */
    public GetMemorySkillResponse getMemorySkill(String workspaceName, String serviceId, String skillId, GetMemorySkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemorySkillWithOptions(workspaceName, serviceId, skillId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询memory异步任务的处理状态</p>
     * 
     * @param request GetMemoryTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMemoryTaskResponse
     */
    public GetMemoryTaskResponse getMemoryTaskWithOptions(String workspaceName, String serviceId, String taskId, GetMemoryTaskRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMemoryTask"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/tasks/" + taskId + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMemoryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询memory异步任务的处理状态</p>
     * 
     * @param request GetMemoryTaskRequest
     * @return GetMemoryTaskResponse
     */
    public GetMemoryTaskResponse getMemoryTask(String workspaceName, String serviceId, String taskId, GetMemoryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMemoryTaskWithOptions(workspaceName, serviceId, taskId, request, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
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
     * <p>多模态 Reranker</p>
     * 
     * @param request GetMultiModalRerankerRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMultiModalRerankerResponse
     */
    public GetMultiModalRerankerResponse getMultiModalRerankerWithOptions(String workspaceName, String serviceId, GetMultiModalRerankerRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.docs)) {
            body.put("docs", request.docs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMultiModalReranker"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/multi-modal-reranker/" + serviceId + ""),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetMultiModalRerankerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>多模态 Reranker</p>
     * 
     * @param request GetMultiModalRerankerRequest
     * @return GetMultiModalRerankerResponse
     */
    public GetMultiModalRerankerResponse getMultiModalReranker(String workspaceName, String serviceId, GetMultiModalRerankerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMultiModalRerankerWithOptions(workspaceName, serviceId, request, headers, runtime);
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
     * <p>获取视频切割异步任务状态</p>
     * 
     * @param request GetVideoSegmentationTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoSegmentationTaskStatusResponse
     */
    public GetVideoSegmentationTaskStatusResponse getVideoSegmentationTaskStatusWithOptions(String workspaceName, String serviceId, GetVideoSegmentationTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetVideoSegmentationTaskStatus"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/video-segmentation/" + serviceId + "/async/task-status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetVideoSegmentationTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频切割异步任务状态</p>
     * 
     * @param request GetVideoSegmentationTaskStatusRequest
     * @return GetVideoSegmentationTaskStatusResponse
     */
    public GetVideoSegmentationTaskStatusResponse getVideoSegmentationTaskStatus(String workspaceName, String serviceId, GetVideoSegmentationTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVideoSegmentationTaskStatusWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频截帧异步提取任务状态</p>
     * 
     * @param request GetVideoSnapshotTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoSnapshotTaskStatusResponse
     */
    public GetVideoSnapshotTaskStatusResponse getVideoSnapshotTaskStatusWithOptions(String workspaceName, String serviceId, GetVideoSnapshotTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetVideoSnapshotTaskStatus"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/video-snapshot/" + serviceId + "/async/task-status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetVideoSnapshotTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频截帧异步提取任务状态</p>
     * 
     * @param request GetVideoSnapshotTaskStatusRequest
     * @return GetVideoSnapshotTaskStatusResponse
     */
    public GetVideoSnapshotTaskStatusResponse getVideoSnapshotTaskStatus(String workspaceName, String serviceId, GetVideoSnapshotTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVideoSnapshotTaskStatusWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频总结异步任务状态</p>
     * 
     * @param request GetVideoSummarizationTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoSummarizationTaskStatusResponse
     */
    public GetVideoSummarizationTaskStatusResponse getVideoSummarizationTaskStatusWithOptions(String workspaceName, String serviceId, GetVideoSummarizationTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetVideoSummarizationTaskStatus"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/video-summarization/" + serviceId + "/async/task-status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new GetVideoSummarizationTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取视频总结异步任务状态</p>
     * 
     * @param request GetVideoSummarizationTaskStatusRequest
     * @return GetVideoSummarizationTaskStatusResponse
     */
    public GetVideoSummarizationTaskStatusResponse getVideoSummarizationTaskStatus(String workspaceName, String serviceId, GetVideoSummarizationTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getVideoSummarizationTaskStatusWithOptions(workspaceName, serviceId, request, headers, runtime);
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
        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("content_type", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.history)) {
            body.put("history", request.history);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryRewrite)) {
            body.put("query_rewrite", request.queryRewrite);
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

    /**
     * <b>summary</b> : 
     * <p>根据查询条件搜索 Memory</p>
     * 
     * @param request SearchMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMemoryResponse
     */
    public SearchMemoryResponse searchMemoryWithOptions(String workspaceName, String serviceId, SearchMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enhancements)) {
            body.put("enhancements", request.enhancements);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            body.put("run_id", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMemory"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new SearchMemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据查询条件搜索 Memory</p>
     * 
     * @param request SearchMemoryRequest
     * @return SearchMemoryResponse
     */
    public SearchMemoryResponse searchMemory(String workspaceName, String serviceId, SearchMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchMemoryWithOptions(workspaceName, serviceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 Memory</p>
     * 
     * @param request UpdateMemoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemoryResponse
     */
    public UpdateMemoryResponse updateMemoryWithOptions(String workspaceName, String serviceId, String memoryId, UpdateMemoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            body.put("memory", request.memory);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemory"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/memories/" + memoryId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMemoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新 Memory</p>
     * 
     * @param request UpdateMemoryRequest
     * @return UpdateMemoryResponse
     */
    public UpdateMemoryResponse updateMemory(String workspaceName, String serviceId, String memoryId, UpdateMemoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMemoryWithOptions(workspaceName, serviceId, memoryId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 Skill</p>
     * 
     * @param request UpdateMemorySkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemorySkillResponse
     */
    public UpdateMemorySkillResponse updateMemorySkillWithOptions(String workspaceName, String serviceId, String skillId, UpdateMemorySkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentId)) {
            body.put("agent_id", request.agentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            body.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemorySkill"),
            new TeaPair("version", "2024-05-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v3/openapi/workspaces/" + workspaceName + "/memory/" + serviceId + "/skills/" + skillId + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.execute(params, req, runtime), new UpdateMemorySkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新 Skill</p>
     * 
     * @param request UpdateMemorySkillRequest
     * @return UpdateMemorySkillResponse
     */
    public UpdateMemorySkillResponse updateMemorySkill(String workspaceName, String serviceId, String skillId, UpdateMemorySkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMemorySkillWithOptions(workspaceName, serviceId, skillId, request, headers, runtime);
    }
}
