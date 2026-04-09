// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319;

import com.aliyun.tea.*;
import com.aliyun.yike20260319.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("yike", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>批量获取一刻AI应用生成任务</p>
     * 
     * @param request BatchGetYikeAIAppJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetYikeAIAppJobResponse
     */
    public BatchGetYikeAIAppJobResponse batchGetYikeAIAppJobWithOptions(BatchGetYikeAIAppJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetYikeAIAppJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetYikeAIAppJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取一刻AI应用生成任务</p>
     * 
     * @param request BatchGetYikeAIAppJobRequest
     * @return BatchGetYikeAIAppJobResponse
     */
    public BatchGetYikeAIAppJobResponse batchGetYikeAIAppJob(BatchGetYikeAIAppJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetYikeAIAppJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻媒资上传凭证</p>
     * 
     * @param request CreateYikeAssetUploadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateYikeAssetUploadResponse
     */
    public CreateYikeAssetUploadResponse createYikeAssetUploadWithOptions(CreateYikeAssetUploadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileExt)) {
            query.put("FileExt", request.fileExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateYikeAssetUpload"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateYikeAssetUploadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻媒资上传凭证</p>
     * 
     * @param request CreateYikeAssetUploadRequest
     * @return CreateYikeAssetUploadResponse
     */
    public CreateYikeAssetUploadResponse createYikeAssetUpload(CreateYikeAssetUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createYikeAssetUploadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻AI应用任务</p>
     * 
     * @param request GetYikeAIAppJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikeAIAppJobResponse
     */
    public GetYikeAIAppJobResponse getYikeAIAppJobWithOptions(GetYikeAIAppJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikeAIAppJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikeAIAppJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻AI应用任务</p>
     * 
     * @param request GetYikeAIAppJobRequest
     * @return GetYikeAIAppJobResponse
     */
    public GetYikeAIAppJobResponse getYikeAIAppJob(GetYikeAIAppJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikeAIAppJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻故事板任务</p>
     * 
     * @param request GetYikeStoryboardJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikeStoryboardJobResponse
     */
    public GetYikeStoryboardJobResponse getYikeStoryboardJobWithOptions(GetYikeStoryboardJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikeStoryboardJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikeStoryboardJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻故事板任务</p>
     * 
     * @param request GetYikeStoryboardJobRequest
     * @return GetYikeStoryboardJobResponse
     */
    public GetYikeStoryboardJobResponse getYikeStoryboardJob(GetYikeStoryboardJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikeStoryboardJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交一刻AI应用任务</p>
     * 
     * @param request SubmitYikeAIAppJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitYikeAIAppJobResponse
     */
    public SubmitYikeAIAppJobResponse submitYikeAIAppJobWithOptions(SubmitYikeAIAppJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appParams)) {
            body.put("AppParams", request.appParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productionId)) {
            body.put("ProductionId", request.productionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitYikeAIAppJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitYikeAIAppJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交一刻AI应用任务</p>
     * 
     * @param request SubmitYikeAIAppJobRequest
     * @return SubmitYikeAIAppJobResponse
     */
    public SubmitYikeAIAppJobResponse submitYikeAIAppJob(SubmitYikeAIAppJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitYikeAIAppJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交一刻故事板任务</p>
     * 
     * @param request SubmitYikeStoryboardJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitYikeStoryboardJobResponse
     */
    public SubmitYikeStoryboardJobResponse submitYikeStoryboardJobWithOptions(SubmitYikeStoryboardJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aspectRatio)) {
            query.put("AspectRatio", request.aspectRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.execMode)) {
            query.put("ExecMode", request.execMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelParams)) {
            query.put("ModelParams", request.modelParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.narrationVoiceId)) {
            query.put("NarrationVoiceId", request.narrationVoiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            query.put("Resolution", request.resolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shotPromptMode)) {
            query.put("ShotPromptMode", request.shotPromptMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipFailureShot)) {
            query.put("SkipFailureShot", request.skipFailureShot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoModel)) {
            query.put("VideoModel", request.videoModel);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileURL)) {
            body.put("FileURL", request.fileURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shotSplitMode)) {
            body.put("ShotSplitMode", request.shotSplitMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.styleId)) {
            body.put("StyleId", request.styleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitYikeStoryboardJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitYikeStoryboardJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交一刻故事板任务</p>
     * 
     * @param request SubmitYikeStoryboardJobRequest
     * @return SubmitYikeStoryboardJobResponse
     */
    public SubmitYikeStoryboardJobResponse submitYikeStoryboardJob(SubmitYikeStoryboardJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitYikeStoryboardJobWithOptions(request, runtime);
    }
}
