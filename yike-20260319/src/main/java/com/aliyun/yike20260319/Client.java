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
     * <p>增加用户积分</p>
     * 
     * @param request AddYikeUserCreditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddYikeUserCreditResponse
     */
    public AddYikeUserCreditResponse addYikeUserCreditWithOptions(AddYikeUserCreditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credit)) {
            query.put("Credit", request.credit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yikeUserId)) {
            query.put("YikeUserId", request.yikeUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddYikeUserCredit"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddYikeUserCreditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>增加用户积分</p>
     * 
     * @param request AddYikeUserCreditRequest
     * @return AddYikeUserCreditResponse
     */
    public AddYikeUserCreditResponse addYikeUserCredit(AddYikeUserCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addYikeUserCreditWithOptions(request, runtime);
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
     * <p>批量获取媒资信息</p>
     * 
     * @param request BatchGetYikeAssetMediaInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetYikeAssetMediaInfosResponse
     */
    public BatchGetYikeAssetMediaInfosResponse batchGetYikeAssetMediaInfosWithOptions(BatchGetYikeAssetMediaInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetYikeAssetMediaInfos"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetYikeAssetMediaInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取媒资信息</p>
     * 
     * @param request BatchGetYikeAssetMediaInfosRequest
     * @return BatchGetYikeAssetMediaInfosResponse
     */
    public BatchGetYikeAssetMediaInfosResponse batchGetYikeAssetMediaInfos(BatchGetYikeAssetMediaInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetYikeAssetMediaInfosWithOptions(request, runtime);
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
     * <p>创建一刻项目</p>
     * 
     * @param request CreateYikeProductionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateYikeProductionResponse
     */
    public CreateYikeProductionResponse createYikeProductionWithOptions(CreateYikeProductionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateYikeProduction"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateYikeProductionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一刻项目</p>
     * 
     * @param request CreateYikeProductionRequest
     * @return CreateYikeProductionResponse
     */
    public CreateYikeProductionResponse createYikeProduction(CreateYikeProductionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createYikeProductionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一刻子用户</p>
     * 
     * @param request CreateYikeUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateYikeUserResponse
     */
    public CreateYikeUserResponse createYikeUserWithOptions(CreateYikeUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nickname)) {
            query.put("Nickname", request.nickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productionIds)) {
            query.put("ProductionIds", request.productionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNamePrefix)) {
            query.put("UserNamePrefix", request.userNamePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateYikeUser"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateYikeUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一刻子用户</p>
     * 
     * @param request CreateYikeUserRequest
     * @return CreateYikeUserResponse
     */
    public CreateYikeUserResponse createYikeUser(CreateYikeUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createYikeUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作室</p>
     * 
     * @param request CreateYikeWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateYikeWorkspaceResponse
     */
    public CreateYikeWorkspaceResponse createYikeWorkspaceWithOptions(CreateYikeWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userCountLimit)) {
            query.put("UserCountLimit", request.userCountLimit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateYikeWorkspace"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateYikeWorkspaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建工作室</p>
     * 
     * @param request CreateYikeWorkspaceRequest
     * @return CreateYikeWorkspaceResponse
     */
    public CreateYikeWorkspaceResponse createYikeWorkspace(CreateYikeWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createYikeWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒资信息</p>
     * 
     * @param request DeleteYikeAssetMediaInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteYikeAssetMediaInfosResponse
     */
    public DeleteYikeAssetMediaInfosResponse deleteYikeAssetMediaInfosWithOptions(DeleteYikeAssetMediaInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicDelete)) {
            query.put("LogicDelete", request.logicDelete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteYikeAssetMediaInfos"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteYikeAssetMediaInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除媒资信息</p>
     * 
     * @param request DeleteYikeAssetMediaInfosRequest
     * @return DeleteYikeAssetMediaInfosResponse
     */
    public DeleteYikeAssetMediaInfosResponse deleteYikeAssetMediaInfos(DeleteYikeAssetMediaInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteYikeAssetMediaInfosWithOptions(request, runtime);
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
     * <p>获取一刻媒资内容信息</p>
     * 
     * @param request GetYikeAssetMediaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikeAssetMediaInfoResponse
     */
    public GetYikeAssetMediaInfoResponse getYikeAssetMediaInfoWithOptions(GetYikeAssetMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikeAssetMediaInfo"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikeAssetMediaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻媒资内容信息</p>
     * 
     * @param request GetYikeAssetMediaInfoRequest
     * @return GetYikeAssetMediaInfoResponse
     */
    public GetYikeAssetMediaInfoResponse getYikeAssetMediaInfo(GetYikeAssetMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikeAssetMediaInfoWithOptions(request, runtime);
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
     * <p>获取一刻子用户信息</p>
     * 
     * @param request GetYikeUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikeUserResponse
     */
    public GetYikeUserResponse getYikeUserWithOptions(GetYikeUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikeUser"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikeUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻子用户信息</p>
     * 
     * @param request GetYikeUserRequest
     * @return GetYikeUserResponse
     */
    public GetYikeUserResponse getYikeUser(GetYikeUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikeUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询一刻用户积分</p>
     * 
     * @param request GetYikeUserCreditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikeUserCreditResponse
     */
    public GetYikeUserCreditResponse getYikeUserCreditWithOptions(GetYikeUserCreditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.yikeUserId)) {
            query.put("YikeUserId", request.yikeUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikeUserCredit"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikeUserCreditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询一刻用户积分</p>
     * 
     * @param request GetYikeUserCreditRequest
     * @return GetYikeUserCreditResponse
     */
    public GetYikeUserCreditResponse getYikeUserCredit(GetYikeUserCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikeUserCreditWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询一刻口播视频生成任务</p>
     * 
     * @param request GetYikeVoiceNarratorJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikeVoiceNarratorJobResponse
     */
    public GetYikeVoiceNarratorJobResponse getYikeVoiceNarratorJobWithOptions(GetYikeVoiceNarratorJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikeVoiceNarratorJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikeVoiceNarratorJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询一刻口播视频生成任务</p>
     * 
     * @param request GetYikeVoiceNarratorJobRequest
     * @return GetYikeVoiceNarratorJobResponse
     */
    public GetYikeVoiceNarratorJobResponse getYikeVoiceNarratorJob(GetYikeVoiceNarratorJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikeVoiceNarratorJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻文件夹列表</p>
     * 
     * @param request ListYikeAssetFoldersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListYikeAssetFoldersResponse
     */
    public ListYikeAssetFoldersResponse listYikeAssetFoldersWithOptions(ListYikeAssetFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productionId)) {
            query.put("ProductionId", request.productionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListYikeAssetFolders"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListYikeAssetFoldersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻文件夹列表</p>
     * 
     * @param request ListYikeAssetFoldersRequest
     * @return ListYikeAssetFoldersResponse
     */
    public ListYikeAssetFoldersResponse listYikeAssetFolders(ListYikeAssetFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listYikeAssetFoldersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻项目列表</p>
     * 
     * @param request ListYikeProductionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListYikeProductionsResponse
     */
    public ListYikeProductionsResponse listYikeProductionsWithOptions(ListYikeProductionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListYikeProductions"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListYikeProductionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取一刻项目列表</p>
     * 
     * @param request ListYikeProductionsRequest
     * @return ListYikeProductionsResponse
     */
    public ListYikeProductionsResponse listYikeProductions(ListYikeProductionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listYikeProductionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查应用参数是否合法</p>
     * 
     * @param request PrecheckYikeAIAppJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PrecheckYikeAIAppJobResponse
     */
    public PrecheckYikeAIAppJobResponse precheckYikeAIAppJobWithOptions(PrecheckYikeAIAppJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appParams)) {
            query.put("AppParams", request.appParams);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PrecheckYikeAIAppJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PrecheckYikeAIAppJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查应用参数是否合法</p>
     * 
     * @param request PrecheckYikeAIAppJobRequest
     * @return PrecheckYikeAIAppJobResponse
     */
    public PrecheckYikeAIAppJobResponse precheckYikeAIAppJob(PrecheckYikeAIAppJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.precheckYikeAIAppJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册一刻媒资</p>
     * 
     * @param request RegisterYikeAssetMediaInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterYikeAssetMediaInfoResponse
     */
    public RegisterYikeAssetMediaInfoResponse registerYikeAssetMediaInfoWithOptions(RegisterYikeAssetMediaInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputURL)) {
            query.put("InputURL", request.inputURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaType)) {
            query.put("MediaType", request.mediaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productionId)) {
            query.put("ProductionId", request.productionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterYikeAssetMediaInfo"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterYikeAssetMediaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注册一刻媒资</p>
     * 
     * @param request RegisterYikeAssetMediaInfoRequest
     * @return RegisterYikeAssetMediaInfoResponse
     */
    public RegisterYikeAssetMediaInfoResponse registerYikeAssetMediaInfo(RegisterYikeAssetMediaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerYikeAssetMediaInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>故事板任务恢复继续执行任务</p>
     * 
     * @param request ResumeYikeStoryboardJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeYikeStoryboardJobResponse
     */
    public ResumeYikeStoryboardJobResponse resumeYikeStoryboardJobWithOptions(ResumeYikeStoryboardJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeYikeStoryboardJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeYikeStoryboardJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>故事板任务恢复继续执行任务</p>
     * 
     * @param request ResumeYikeStoryboardJobRequest
     * @return ResumeYikeStoryboardJobResponse
     */
    public ResumeYikeStoryboardJobResponse resumeYikeStoryboardJob(ResumeYikeStoryboardJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeYikeStoryboardJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>配置一刻事件回调</p>
     * 
     * @param request SetYikeCallbackConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetYikeCallbackConfigResponse
     */
    public SetYikeCallbackConfigResponse setYikeCallbackConfigWithOptions(SetYikeCallbackConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackConfig)) {
            query.put("CallbackConfig", request.callbackConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackUrl)) {
            query.put("CallbackUrl", request.callbackUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetYikeCallbackConfig"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetYikeCallbackConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>配置一刻事件回调</p>
     * 
     * @param request SetYikeCallbackConfigRequest
     * @return SetYikeCallbackConfigResponse
     */
    public SetYikeCallbackConfigResponse setYikeCallbackConfig(SetYikeCallbackConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setYikeCallbackConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置用户角色</p>
     * 
     * @param request SetYikeUserRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetYikeUserRoleResponse
     */
    public SetYikeUserRoleResponse setYikeUserRoleWithOptions(SetYikeUserRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yikeUserId)) {
            query.put("YikeUserId", request.yikeUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetYikeUserRole"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetYikeUserRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置用户角色</p>
     * 
     * @param request SetYikeUserRoleRequest
     * @return SetYikeUserRoleResponse
     */
    public SetYikeUserRoleResponse setYikeUserRole(SetYikeUserRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setYikeUserRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>扣减用户积分</p>
     * 
     * @param request SubYikeUserCreditRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubYikeUserCreditResponse
     */
    public SubYikeUserCreditResponse subYikeUserCreditWithOptions(SubYikeUserCreditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credit)) {
            query.put("Credit", request.credit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yikeUserId)) {
            query.put("YikeUserId", request.yikeUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubYikeUserCredit"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubYikeUserCreditResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>扣减用户积分</p>
     * 
     * @param request SubYikeUserCreditRequest
     * @return SubYikeUserCreditResponse
     */
    public SubYikeUserCreditResponse subYikeUserCredit(SubYikeUserCreditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subYikeUserCreditWithOptions(request, runtime);
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

    /**
     * <b>summary</b> : 
     * <p>提交一刻口播视频生成任务</p>
     * 
     * @param request SubmitYikeVoiceNarratorJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitYikeVoiceNarratorJobResponse
     */
    public SubmitYikeVoiceNarratorJobResponse submitYikeVoiceNarratorJobWithOptions(SubmitYikeVoiceNarratorJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobParams)) {
            body.put("JobParams", request.jobParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitYikeVoiceNarratorJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitYikeVoiceNarratorJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交一刻口播视频生成任务</p>
     * 
     * @param request SubmitYikeVoiceNarratorJobRequest
     * @return SubmitYikeVoiceNarratorJobResponse
     */
    public SubmitYikeVoiceNarratorJobResponse submitYikeVoiceNarratorJob(SubmitYikeVoiceNarratorJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitYikeVoiceNarratorJobWithOptions(request, runtime);
    }
}
