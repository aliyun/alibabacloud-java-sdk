// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707;

import com.aliyun.tea.*;
import com.aliyun.yike20260707.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "yike.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "yike.ap-southeast-1.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about multiple media assets in a batch.</p>
     * 
     * @param request BatchGetMediasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetMediasResponse
     */
    public BatchGetMediasResponse batchGetMediasWithOptions(BatchGetMediasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authTimeout)) {
            query.put("AuthTimeout", request.authTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetMedias"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetMediasResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description.</h2>
     * 
     * <b>summary</b> : 
     * <p>Retrieves information about multiple media assets in a batch.</p>
     * 
     * @param request BatchGetMediasRequest
     * @return BatchGetMediasResponse
     */
    public BatchGetMediasResponse batchGetMedias(BatchGetMediasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetMediasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Categories support up to three levels, and each level supports up to 100 subcategories.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a media asset category.</p>
     * 
     * @param request CreateAssetCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAssetCategoryResponse
     */
    public CreateAssetCategoryResponse createAssetCategoryWithOptions(CreateAssetCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            query.put("CategoryName", request.categoryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAssetCategory"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAssetCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Categories support up to three levels, and each level supports up to 100 subcategories.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a media asset category.</p>
     * 
     * @param request CreateAssetCategoryRequest
     * @return CreateAssetCategoryResponse
     */
    public CreateAssetCategoryResponse createAssetCategory(CreateAssetCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAssetCategoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation also deletes all subcategories (including second-level and third-level categories). Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a media asset category.</p>
     * 
     * @param request DeleteAssetCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAssetCategoryResponse
     */
    public DeleteAssetCategoryResponse deleteAssetCategoryWithOptions(DeleteAssetCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAssetCategory"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAssetCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation also deletes all subcategories (including second-level and third-level categories). Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a media asset category.</p>
     * 
     * @param request DeleteAssetCategoryRequest
     * @return DeleteAssetCategoryResponse
     */
    public DeleteAssetCategoryResponse deleteAssetCategory(DeleteAssetCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAssetCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes media asset information.</p>
     * 
     * @param request DeleteMediasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMediasResponse
     */
    public DeleteMediasResponse deleteMediasWithOptions(DeleteMediasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deletePhysicalFiles)) {
            query.put("DeletePhysicalFiles", request.deletePhysicalFiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputURLs)) {
            query.put("InputURLs", request.inputURLs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMedias"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMediasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes media asset information.</p>
     * 
     * @param request DeleteMediasRequest
     * @return DeleteMediasResponse
     */
    public DeleteMediasResponse deleteMedias(DeleteMediasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMediasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information of a specified category and the list of its subcategories (immediate child categories).</p>
     * 
     * @param request GetAssetCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAssetCategoryResponse
     */
    public GetAssetCategoryResponse getAssetCategoryWithOptions(GetAssetCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAssetCategory"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAssetCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information of a specified category and the list of its subcategories (immediate child categories).</p>
     * 
     * @param request GetAssetCategoryRequest
     * @return GetAssetCategoryResponse
     */
    public GetAssetCategoryResponse getAssetCategory(GetAssetCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAssetCategoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an image generation task.</p>
     * 
     * @param request GetImageGenerationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetImageGenerationJobResponse
     */
    public GetImageGenerationJobResponse getImageGenerationJobWithOptions(GetImageGenerationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetImageGenerationJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetImageGenerationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an image generation task.</p>
     * 
     * @param request GetImageGenerationJobRequest
     * @return GetImageGenerationJobResponse
     */
    public GetImageGenerationJobResponse getImageGenerationJob(GetImageGenerationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getImageGenerationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API用于查询媒资内容理解作业。</p>
     * 
     * <b>summary</b> : 
     * <p>查询媒资</p>
     * 
     * @param request GetMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaResponse
     */
    public GetMediaResponse getMediaWithOptions(GetMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authTimeout)) {
            query.put("AuthTimeout", request.authTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputURL)) {
            query.put("InputURL", request.inputURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMedia"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API用于查询媒资内容理解作业。</p>
     * 
     * <b>summary</b> : 
     * <p>查询媒资</p>
     * 
     * @param request GetMediaRequest
     * @return GetMediaResponse
     */
    public GetMediaResponse getMedia(GetMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API is used to query a media asset content understanding job.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a media asset content understanding job.</p>
     * 
     * @param request GetMediaComprehensionJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMediaComprehensionJobResponse
     */
    public GetMediaComprehensionJobResponse getMediaComprehensionJobWithOptions(GetMediaComprehensionJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMediaComprehensionJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMediaComprehensionJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Description</h2>
     * <p>This API is used to query a media asset content understanding job.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a media asset content understanding job.</p>
     * 
     * @param request GetMediaComprehensionJobRequest
     * @return GetMediaComprehensionJobResponse
     */
    public GetMediaComprehensionJobResponse getMediaComprehensionJob(GetMediaComprehensionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaComprehensionJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a creative script generation task.</p>
     * 
     * @param request GetRemakeScriptJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRemakeScriptJobResponse
     */
    public GetRemakeScriptJobResponse getRemakeScriptJobWithOptions(GetRemakeScriptJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRemakeScriptJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRemakeScriptJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a creative script generation task.</p>
     * 
     * @param request GetRemakeScriptJobRequest
     * @return GetRemakeScriptJobResponse
     */
    public GetRemakeScriptJobResponse getRemakeScriptJob(GetRemakeScriptJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRemakeScriptJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a video generation task.</p>
     * 
     * @param request GetVideoGenerationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoGenerationJobResponse
     */
    public GetVideoGenerationJobResponse getVideoGenerationJobWithOptions(GetVideoGenerationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoGenerationJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoGenerationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a video generation task.</p>
     * 
     * @param request GetVideoGenerationJobRequest
     * @return GetVideoGenerationJobResponse
     */
    public GetVideoGenerationJobResponse getVideoGenerationJob(GetVideoGenerationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoGenerationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询爆款新视频渲染任务</p>
     * 
     * @param request GetVideoRenderJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoRenderJobResponse
     */
    public GetVideoRenderJobResponse getVideoRenderJobWithOptions(GetVideoRenderJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoRenderJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoRenderJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询爆款新视频渲染任务</p>
     * 
     * @param request GetVideoRenderJobRequest
     * @return GetVideoRenderJobResponse
     */
    public GetVideoRenderJobResponse getVideoRenderJob(GetVideoRenderJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoRenderJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the membership plan and credit information for a Yike primary account.</p>
     * 
     * @param request GetYikeAccountCreditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikeAccountCreditResponse
     */
    public GetYikeAccountCreditResponse getYikeAccountCreditWithOptions(GetYikeAccountCreditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikeAccountCredit"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikeAccountCreditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the membership plan and credit information for a Yike primary account.</p>
     * 
     * @param request GetYikeAccountCreditRequest
     * @return GetYikeAccountCreditResponse
     */
    public GetYikeAccountCreditResponse getYikeAccountCredit(GetYikeAccountCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikeAccountCreditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the actual credit consumption of a task.</p>
     * 
     * @param request GetYikeJobCreditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikeJobCreditResponse
     */
    public GetYikeJobCreditResponse getYikeJobCreditWithOptions(GetYikeJobCreditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikeJobCredit"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikeJobCreditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the actual credit consumption of a task.</p>
     * 
     * @param request GetYikeJobCreditRequest
     * @return GetYikeJobCreditResponse
     */
    public GetYikeJobCreditResponse getYikeJobCredit(GetYikeJobCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikeJobCreditWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API is used to query media content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports a media asset.</p>
     * 
     * @param request ImportMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportMediaResponse
     */
    public ImportMediaResponse importMediaWithOptions(ImportMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicMetaData)) {
            query.put("DynamicMetaData", request.dynamicMetaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.importSource)) {
            query.put("ImportSource", request.importSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputURL)) {
            query.put("InputURL", request.inputURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaTags)) {
            query.put("MediaTags", request.mediaTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            query.put("Overwrite", request.overwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registerConfig)) {
            query.put("RegisterConfig", request.registerConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportMedia"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportMediaResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API is used to query media content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports a media asset.</p>
     * 
     * @param request ImportMediaRequest
     * @return ImportMediaResponse
     */
    public ImportMediaResponse importMedia(ImportMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of categories.</p>
     * 
     * @param request ListAssetCategoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAssetCategoriesResponse
     */
    public ListAssetCategoriesResponse listAssetCategoriesWithOptions(ListAssetCategoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAssetCategories"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAssetCategoriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of categories.</p>
     * 
     * @param request ListAssetCategoriesRequest
     * @return ListAssetCategoriesResponse
     */
    public ListAssetCategoriesResponse listAssetCategories(ListAssetCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAssetCategoriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns media asset information that matches the specified filter conditions.</p>
     * 
     * @param request SearchMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMediaResponse
     */
    public SearchMediaResponse searchMediaWithOptions(SearchMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.match)) {
            query.put("Match", request.match);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scrollToken)) {
            query.put("ScrollToken", request.scrollToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchMedia"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchMediaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns media asset information that matches the specified filter conditions.</p>
     * 
     * @param request SearchMediaRequest
     * @return SearchMediaResponse
     */
    public SearchMediaResponse searchMedia(SearchMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchMediaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an image generation task.</p>
     * 
     * @param request SubmitImageGenerationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitImageGenerationJobResponse
     */
    public SubmitImageGenerationJobResponse submitImageGenerationJobWithOptions(SubmitImageGenerationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aspectRatio)) {
            query.put("AspectRatio", request.aspectRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobParameters)) {
            query.put("JobParameters", request.jobParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.n)) {
            query.put("N", request.n);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            query.put("Resolution", request.resolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitImageGenerationJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitImageGenerationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an image generation task.</p>
     * 
     * @param request SubmitImageGenerationJobRequest
     * @return SubmitImageGenerationJobResponse
     */
    public SubmitImageGenerationJobResponse submitImageGenerationJob(SubmitImageGenerationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitImageGenerationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API用于根据提供的媒资文件（比如视频链接）进行内容理解。此外，支持通过<code>UserData</code>字段传递自定义参数，在回调时原样返回。</p>
     * 
     * <b>summary</b> : 
     * <p>提交媒资内容理解作业</p>
     * 
     * @param request SubmitMediaComprehensionJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitMediaComprehensionJobResponse
     */
    public SubmitMediaComprehensionJobResponse submitMediaComprehensionJobWithOptions(SubmitMediaComprehensionJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobParams)) {
            query.put("JobParams", request.jobParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitMediaComprehensionJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitMediaComprehensionJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API用于根据提供的媒资文件（比如视频链接）进行内容理解。此外，支持通过<code>UserData</code>字段传递自定义参数，在回调时原样返回。</p>
     * 
     * <b>summary</b> : 
     * <p>提交媒资内容理解作业</p>
     * 
     * @param request SubmitMediaComprehensionJobRequest
     * @return SubmitMediaComprehensionJobResponse
     */
    public SubmitMediaComprehensionJobResponse submitMediaComprehensionJob(SubmitMediaComprehensionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMediaComprehensionJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>该 API 用于根据内容理解的结果与新商品/模特信息，仿写生成新的口播脚本。此外，支持通过UserData字段传递自定义参数，在回调时原样返回。</p>
     * 
     * <b>summary</b> : 
     * <p>提交爆款复刻新脚本生成任务</p>
     * 
     * @param request SubmitRemakeScriptJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitRemakeScriptJobResponse
     */
    public SubmitRemakeScriptJobResponse submitRemakeScriptJobWithOptions(SubmitRemakeScriptJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.remakeParams)) {
            query.put("RemakeParams", request.remakeParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remakeType)) {
            query.put("RemakeType", request.remakeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitRemakeScriptJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitRemakeScriptJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>该 API 用于根据内容理解的结果与新商品/模特信息，仿写生成新的口播脚本。此外，支持通过UserData字段传递自定义参数，在回调时原样返回。</p>
     * 
     * <b>summary</b> : 
     * <p>提交爆款复刻新脚本生成任务</p>
     * 
     * @param request SubmitRemakeScriptJobRequest
     * @return SubmitRemakeScriptJobResponse
     */
    public SubmitRemakeScriptJobResponse submitRemakeScriptJob(SubmitRemakeScriptJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitRemakeScriptJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a video generation task.</p>
     * 
     * @param request SubmitVideoGenerationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVideoGenerationJobResponse
     */
    public SubmitVideoGenerationJobResponse submitVideoGenerationJobWithOptions(SubmitVideoGenerationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aspectRatio)) {
            query.put("AspectRatio", request.aspectRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobParameters)) {
            query.put("JobParameters", request.jobParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            query.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.n)) {
            query.put("N", request.n);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            query.put("Resolution", request.resolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVideoGenerationJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVideoGenerationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a video generation task.</p>
     * 
     * @param request SubmitVideoGenerationJobRequest
     * @return SubmitVideoGenerationJobResponse
     */
    public SubmitVideoGenerationJobResponse submitVideoGenerationJob(SubmitVideoGenerationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitVideoGenerationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交爆款新视频渲染任务</p>
     * 
     * @param request SubmitVideoRenderJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVideoRenderJobResponse
     */
    public SubmitVideoRenderJobResponse submitVideoRenderJobWithOptions(SubmitVideoRenderJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.script)) {
            query.put("Script", request.script);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settings)) {
            query.put("Settings", request.settings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVideoRenderJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVideoRenderJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交爆款新视频渲染任务</p>
     * 
     * @param request SubmitVideoRenderJobRequest
     * @return SubmitVideoRenderJobResponse
     */
    public SubmitVideoRenderJobResponse submitVideoRenderJob(SubmitVideoRenderJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitVideoRenderJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API supports multiple video translation features, including subtitle translation and voice translation.</li>
     * <li>The <code>JobType</code> parameter defines the task type, such as <code>SubtitleTranslate</code> and <code>VoiceTranslate</code>.</li>
     * <li>The <code>Input</code> and <code>Output</code> parameters specify the input resource and output path, respectively.</li>
     * <li><code>JobParameters</code> contains language configuration and other feature switches, such as <code>SourceLanguage</code>, <code>TargetLanguage</code>, <code>NeedDetext</code>, and <code>NeedVisualTranslate</code>.</li>
     * <li><code>EditingConfig</code> can be used to specify the style configuration for the final editing and compositing.</li>
     * <li><code>ClientToken</code> is an optional parameter used to ensure the idempotence of the request.</li>
     * <li>Ensure that all required fields are correctly filled in. Otherwise, the request may fail.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a video translation task that supports subtitle translation, voice translation, and on-screen text translation.</p>
     * 
     * @param request SubmitVideoTranslationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVideoTranslationJobResponse
     */
    public SubmitVideoTranslationJobResponse submitVideoTranslationJobWithOptions(SubmitVideoTranslationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobParameters)) {
            body.put("JobParameters", request.jobParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVideoTranslationJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVideoTranslationJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API supports multiple video translation features, including subtitle translation and voice translation.</li>
     * <li>The <code>JobType</code> parameter defines the task type, such as <code>SubtitleTranslate</code> and <code>VoiceTranslate</code>.</li>
     * <li>The <code>Input</code> and <code>Output</code> parameters specify the input resource and output path, respectively.</li>
     * <li><code>JobParameters</code> contains language configuration and other feature switches, such as <code>SourceLanguage</code>, <code>TargetLanguage</code>, <code>NeedDetext</code>, and <code>NeedVisualTranslate</code>.</li>
     * <li><code>EditingConfig</code> can be used to specify the style configuration for the final editing and compositing.</li>
     * <li><code>ClientToken</code> is an optional parameter used to ensure the idempotence of the request.</li>
     * <li>Ensure that all required fields are correctly filled in. Otherwise, the request may fail.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a video translation task that supports subtitle translation, voice translation, and on-screen text translation.</p>
     * 
     * @param request SubmitVideoTranslationJobRequest
     * @return SubmitVideoTranslationJobResponse
     */
    public SubmitVideoTranslationJobResponse submitVideoTranslationJob(SubmitVideoTranslationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitVideoTranslationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you create a media asset category, you can call this operation to locate and update the name of the media asset category by category ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a media asset category.</p>
     * 
     * @param request UpdateAssetCategoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAssetCategoryResponse
     */
    public UpdateAssetCategoryResponse updateAssetCategoryWithOptions(UpdateAssetCategoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            query.put("CategoryName", request.categoryName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAssetCategory"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAssetCategoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you create a media asset category, you can call this operation to locate and update the name of the media asset category by category ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a media asset category.</p>
     * 
     * @param request UpdateAssetCategoryRequest
     * @return UpdateAssetCategoryResponse
     */
    public UpdateAssetCategoryResponse updateAssetCategory(UpdateAssetCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAssetCategoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API is used to query media content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates media asset information.</p>
     * 
     * @param request UpdateMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMediaResponse
     */
    public UpdateMediaResponse updateMediaWithOptions(UpdateMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appendTags)) {
            query.put("AppendTags", request.appendTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryId)) {
            query.put("CategoryId", request.categoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverURL)) {
            query.put("CoverURL", request.coverURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dynamicMetaData)) {
            query.put("DynamicMetaData", request.dynamicMetaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputURL)) {
            query.put("InputURL", request.inputURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaTags)) {
            query.put("MediaTags", request.mediaTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMedia"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMediaResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API is used to query media content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates media asset information.</p>
     * 
     * @param request UpdateMediaRequest
     * @return UpdateMediaResponse
     */
    public UpdateMediaResponse updateMedia(UpdateMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaWithOptions(request, runtime);
    }
}
