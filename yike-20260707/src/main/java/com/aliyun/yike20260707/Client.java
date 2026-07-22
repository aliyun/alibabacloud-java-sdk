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
     * <h2>请求说明</h2>
     * <p>该API用于查询媒资内容理解作业。</p>
     * 
     * <b>summary</b> : 
     * <p>批量获取媒资信息</p>
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
     * <h2>请求说明</h2>
     * <p>该API用于查询媒资内容理解作业。</p>
     * 
     * <b>summary</b> : 
     * <p>批量获取媒资信息</p>
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
     * <p>分类最多支持三级分类，每级分类最多支持创建 100 个子分类。</p>
     * 
     * <b>summary</b> : 
     * <p>创建分类</p>
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
     * <p>分类最多支持三级分类，每级分类最多支持创建 100 个子分类。</p>
     * 
     * <b>summary</b> : 
     * <p>创建分类</p>
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
     * <p>此接口会同时删除其子分类（包括二级分类和三级分类），请慎重操作。</p>
     * 
     * <b>summary</b> : 
     * <p>删除分类</p>
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
     * <p>此接口会同时删除其子分类（包括二级分类和三级分类），请慎重操作。</p>
     * 
     * <b>summary</b> : 
     * <p>删除分类</p>
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
     * <p>删除媒资信息</p>
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
     * <p>删除媒资信息</p>
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
     * <p>查询分类</p>
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
     * <p>查询分类</p>
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
     * <p>查询图片生成任务</p>
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
     * <p>查询图片生成任务</p>
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
     * <b>summary</b> : 
     * <p>查询媒资内容理解作业</p>
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
     * <b>summary</b> : 
     * <p>查询媒资内容理解作业</p>
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
     * <p>查询视频生成任务</p>
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
     * <p>查询视频生成任务</p>
     * 
     * @param request GetVideoGenerationJobRequest
     * @return GetVideoGenerationJobResponse
     */
    public GetVideoGenerationJobResponse getVideoGenerationJob(GetVideoGenerationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoGenerationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>该API用于查询媒资内容理解作业。</p>
     * 
     * <b>summary</b> : 
     * <p>导入媒资</p>
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
     * <h2>请求说明</h2>
     * <p>该API用于查询媒资内容理解作业。</p>
     * 
     * <b>summary</b> : 
     * <p>导入媒资</p>
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
     * <p>列出分类</p>
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
     * <p>列出分类</p>
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
     * <p>搜索媒资</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.searchLibName)) {
            query.put("SearchLibName", request.searchLibName);
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
     * <p>搜索媒资</p>
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
     * <p>提交图像生成接口</p>
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
     * <p>提交图像生成接口</p>
     * 
     * @param request SubmitImageGenerationJobRequest
     * @return SubmitImageGenerationJobResponse
     */
    public SubmitImageGenerationJobResponse submitImageGenerationJob(SubmitImageGenerationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitImageGenerationJobWithOptions(request, runtime);
    }

    /**
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
        if (!com.aliyun.teautil.Common.isUnset(request.jobParams)) {
            query.put("JobParams", request.jobParams);
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
     * <b>summary</b> : 
     * <p>提交视频生成接口</p>
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
     * <p>提交视频生成接口</p>
     * 
     * @param request SubmitVideoGenerationJobRequest
     * @return SubmitVideoGenerationJobResponse
     */
    public SubmitVideoGenerationJobResponse submitVideoGenerationJob(SubmitVideoGenerationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitVideoGenerationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>创建媒资分类后，可调用本接口通过分类 ID 来定位并更新媒资分类的名称。</p>
     * 
     * <b>summary</b> : 
     * <p>更新媒资分类</p>
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
     * <p>创建媒资分类后，可调用本接口通过分类 ID 来定位并更新媒资分类的名称。</p>
     * 
     * <b>summary</b> : 
     * <p>更新媒资分类</p>
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
     * <h2>请求说明</h2>
     * <p>该API用于查询媒资内容理解作业。</p>
     * 
     * <b>summary</b> : 
     * <p>UpdateMedia</p>
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
     * <h2>请求说明</h2>
     * <p>该API用于查询媒资内容理解作业。</p>
     * 
     * <b>summary</b> : 
     * <p>UpdateMedia</p>
     * 
     * @param request UpdateMediaRequest
     * @return UpdateMediaResponse
     */
    public UpdateMediaResponse updateMedia(UpdateMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMediaWithOptions(request, runtime);
    }
}
