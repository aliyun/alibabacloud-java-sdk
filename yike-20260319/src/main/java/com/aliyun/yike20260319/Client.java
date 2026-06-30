// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319;

import com.aliyun.tea.*;
import com.aliyun.yike20260319.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "yike.cn-shanghai.aliyuncs.com")
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
     * <b>summary</b> : 
     * <p>Adds a member to a Yike project.</p>
     * 
     * @param request AddYikeProductionMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddYikeProductionMembersResponse
     */
    public AddYikeProductionMembersResponse addYikeProductionMembersWithOptions(AddYikeProductionMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productionId)) {
            query.put("ProductionId", request.productionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yikeUserIds)) {
            query.put("YikeUserIds", request.yikeUserIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddYikeProductionMembers"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddYikeProductionMembersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a member to a Yike project.</p>
     * 
     * @param request AddYikeProductionMembersRequest
     * @return AddYikeProductionMembersResponse
     */
    public AddYikeProductionMembersResponse addYikeProductionMembers(AddYikeProductionMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addYikeProductionMembersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Increases user credits.</p>
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
     * <p>Increases user credits.</p>
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
     * <p>Retrieves multiple Yike AI application generation tasks in a batch.</p>
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
     * <p>Retrieves multiple Yike AI application generation tasks in a batch.</p>
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
     * <p>Retrieves information about multiple media assets in a batch.</p>
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
     * <p>Retrieves information about multiple media assets in a batch.</p>
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
     * <p>Retrieves the upload credential for a media asset.</p>
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
     * <p>Retrieves the upload credential for a media asset.</p>
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
     * <p>Creates a project.</p>
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
     * <p>Creates a project.</p>
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
     * <p>Creates a sub-account user in WonderClip.</p>
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
     * <p>Creates a sub-account user in WonderClip.</p>
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
     * <p>Creates a workspace.</p>
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
     * <p>Creates a workspace.</p>
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
     * <p>Deletes media asset information.</p>
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
     * <p>Deletes media asset information.</p>
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
     * <p>Retrieves the details of an AI application task.</p>
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
     * <p>Retrieves the details of an AI application task.</p>
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
     * <p>Queries an agent task.</p>
     * 
     * @param request GetYikeAgentJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikeAgentJobResponse
     */
    public GetYikeAgentJobResponse getYikeAgentJobWithOptions(GetYikeAgentJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikeAgentJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikeAgentJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an agent task.</p>
     * 
     * @param request GetYikeAgentJobRequest
     * @return GetYikeAgentJobResponse
     */
    public GetYikeAgentJobResponse getYikeAgentJob(GetYikeAgentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikeAgentJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the content information of a media asset.</p>
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
     * <p>Retrieves the content information of a media asset.</p>
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
     * <p>Queries the information and results of an editing project export task.</p>
     * 
     * @param request GetYikeProjectExportJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikeProjectExportJobResponse
     */
    public GetYikeProjectExportJobResponse getYikeProjectExportJobWithOptions(GetYikeProjectExportJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikeProjectExportJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikeProjectExportJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information and results of an editing project export task.</p>
     * 
     * @param request GetYikeProjectExportJobRequest
     * @return GetYikeProjectExportJobResponse
     */
    public GetYikeProjectExportJobResponse getYikeProjectExportJob(GetYikeProjectExportJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikeProjectExportJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a Yike prompt enhancement and audio repair video generation task.</p>
     * 
     * @param request GetYikePromptExpansionVoiceFixJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetYikePromptExpansionVoiceFixJobResponse
     */
    public GetYikePromptExpansionVoiceFixJobResponse getYikePromptExpansionVoiceFixJobWithOptions(GetYikePromptExpansionVoiceFixJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetYikePromptExpansionVoiceFixJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetYikePromptExpansionVoiceFixJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a Yike prompt enhancement and audio repair video generation task.</p>
     * 
     * @param request GetYikePromptExpansionVoiceFixJobRequest
     * @return GetYikePromptExpansionVoiceFixJobResponse
     */
    public GetYikePromptExpansionVoiceFixJobResponse getYikePromptExpansionVoiceFixJob(GetYikePromptExpansionVoiceFixJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getYikePromptExpansionVoiceFixJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a storyboard task.</p>
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
     * <p>Retrieves a storyboard task.</p>
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
     * <p>Retrieves information about a WonderClip sub-account.</p>
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
     * <p>Retrieves information about a WonderClip sub-account.</p>
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
     * <p>Queries the credit balance of a WonderClip user.</p>
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
     * <p>Queries the credit balance of a WonderClip user.</p>
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
     * <p>Queries an intelligent video generation task for a narration-only video without a digital human.</p>
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
     * <p>Queries an intelligent video generation task for a narration-only video without a digital human.</p>
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
     * <p>Retrieves the list of folders.</p>
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
     * <p>Retrieves the list of folders.</p>
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
     * <p>Retrieves a list of Yike projects.</p>
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
     * <p>Retrieves a list of Yike projects.</p>
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
     * <p>Get Yike Workspace List</p>
     * 
     * @param request ListYikeWorkspacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListYikeWorkspacesResponse
     */
    public ListYikeWorkspacesResponse listYikeWorkspacesWithOptions(ListYikeWorkspacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListYikeWorkspaces"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListYikeWorkspacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Yike Workspace List</p>
     * 
     * @param request ListYikeWorkspacesRequest
     * @return ListYikeWorkspacesResponse
     */
    public ListYikeWorkspacesResponse listYikeWorkspaces(ListYikeWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listYikeWorkspacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the application parameters are valid.</p>
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
     * <p>Checks whether the application parameters are valid.</p>
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
     * <p>Registers a Yike media asset.</p>
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
     * <p>Registers a Yike media asset.</p>
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
     * <p>Resumes the execution of a storyboard task.</p>
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
     * <p>Resumes the execution of a storyboard task.</p>
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
     * <p>Configures event callbacks for the business system.</p>
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
     * <p>Configures event callbacks for the business system.</p>
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
     * <p>Sets the user role.</p>
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
     * <p>Sets the user role.</p>
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
     * <p>Reclaims credits from a user.</p>
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
     * <p>Reclaims credits from a user.</p>
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
     * <p>Submits an AI application task to Yike AI.</p>
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
     * <p>Submits an AI application task to Yike AI.</p>
     * 
     * @param request SubmitYikeAIAppJobRequest
     * @return SubmitYikeAIAppJobResponse
     */
    public SubmitYikeAIAppJobResponse submitYikeAIAppJob(SubmitYikeAIAppJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitYikeAIAppJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation generates a video featuring a virtual human delivering an oral broadcast based on the provided text content and other parameters such as digital human information and common scenario type. You must specify key configuration items including the text type (raw script or oral broadcast script), video dimensions, and resolution. You can also choose whether to add subtitles or specify the output language. In addition, you can pass custom parameters through the <code>UserData</code> field, which are returned as-is in the callback.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an intelligent video production task for a digital human oral broadcasting scenario. This task is applicable to video scenarios such as influencer product promotion and knowledge sharing.</p>
     * 
     * @param request SubmitYikeAvatarNarratorJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitYikeAvatarNarratorJobResponse
     */
    public SubmitYikeAvatarNarratorJobResponse submitYikeAvatarNarratorJobWithOptions(SubmitYikeAvatarNarratorJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "SubmitYikeAvatarNarratorJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitYikeAvatarNarratorJobResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation generates a video featuring a virtual human delivering an oral broadcast based on the provided text content and other parameters such as digital human information and common scenario type. You must specify key configuration items including the text type (raw script or oral broadcast script), video dimensions, and resolution. You can also choose whether to add subtitles or specify the output language. In addition, you can pass custom parameters through the <code>UserData</code> field, which are returned as-is in the callback.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an intelligent video production task for a digital human oral broadcasting scenario. This task is applicable to video scenarios such as influencer product promotion and knowledge sharing.</p>
     * 
     * @param request SubmitYikeAvatarNarratorJobRequest
     * @return SubmitYikeAvatarNarratorJobResponse
     */
    public SubmitYikeAvatarNarratorJobResponse submitYikeAvatarNarratorJob(SubmitYikeAvatarNarratorJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitYikeAvatarNarratorJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an online editing project export task that supports exporting pure audio and SRT subtitles.</p>
     * 
     * @param request SubmitYikeProjectExportJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitYikeProjectExportJobResponse
     */
    public SubmitYikeProjectExportJobResponse submitYikeProjectExportJobWithOptions(SubmitYikeProjectExportJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exportType)) {
            query.put("ExportType", request.exportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitYikeProjectExportJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitYikeProjectExportJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an online editing project export task that supports exporting pure audio and SRT subtitles.</p>
     * 
     * @param request SubmitYikeProjectExportJobRequest
     * @return SubmitYikeProjectExportJobResponse
     */
    public SubmitYikeProjectExportJobResponse submitYikeProjectExportJob(SubmitYikeProjectExportJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitYikeProjectExportJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a video generation task with prompt enhancement and audio repair.</p>
     * 
     * @param request SubmitYikePromptExpansionVoiceFixJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitYikePromptExpansionVoiceFixJobResponse
     */
    public SubmitYikePromptExpansionVoiceFixJobResponse submitYikePromptExpansionVoiceFixJobWithOptions(SubmitYikePromptExpansionVoiceFixJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "SubmitYikePromptExpansionVoiceFixJob"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitYikePromptExpansionVoiceFixJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a video generation task with prompt enhancement and audio repair.</p>
     * 
     * @param request SubmitYikePromptExpansionVoiceFixJobRequest
     * @return SubmitYikePromptExpansionVoiceFixJobResponse
     */
    public SubmitYikePromptExpansionVoiceFixJobResponse submitYikePromptExpansionVoiceFixJob(SubmitYikePromptExpansionVoiceFixJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitYikePromptExpansionVoiceFixJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Ensure that your credits remain above 5,000 when calling this operation. Insufficient credits may cause the task to be interrupted.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a storyboard generation task.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.keepOriginDialogue)) {
            query.put("KeepOriginDialogue", request.keepOriginDialogue);
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
     * <b>description</b> :
     * <p>Ensure that your credits remain above 5,000 when calling this operation. Insufficient credits may cause the task to be interrupted.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a storyboard generation task.</p>
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
     * <p>Creates an intelligent video generation task for a voiceover-only scenario (without a digital human). This task is applicable to video scenarios such as product showcases and news broadcasts.</p>
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
     * <p>Creates an intelligent video generation task for a voiceover-only scenario (without a digital human). This task is applicable to video scenarios such as product showcases and news broadcasts.</p>
     * 
     * @param request SubmitYikeVoiceNarratorJobRequest
     * @return SubmitYikeVoiceNarratorJobResponse
     */
    public SubmitYikeVoiceNarratorJobResponse submitYikeVoiceNarratorJob(SubmitYikeVoiceNarratorJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitYikeVoiceNarratorJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update a Yike project</p>
     * 
     * @param request UpdateYikeProductionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateYikeProductionResponse
     */
    public UpdateYikeProductionResponse updateYikeProductionWithOptions(UpdateYikeProductionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productionId)) {
            query.put("ProductionId", request.productionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateYikeProduction"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateYikeProductionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update a Yike project</p>
     * 
     * @param request UpdateYikeProductionRequest
     * @return UpdateYikeProductionResponse
     */
    public UpdateYikeProductionResponse updateYikeProduction(UpdateYikeProductionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateYikeProductionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the permissions of a Yike project member.</p>
     * 
     * @param request UpdateYikeProductionMemberAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateYikeProductionMemberAuthResponse
     */
    public UpdateYikeProductionMemberAuthResponse updateYikeProductionMemberAuthWithOptions(UpdateYikeProductionMemberAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auth)) {
            query.put("Auth", request.auth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productionId)) {
            query.put("ProductionId", request.productionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yikeUserId)) {
            query.put("YikeUserId", request.yikeUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateYikeProductionMemberAuth"),
            new TeaPair("version", "2026-03-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateYikeProductionMemberAuthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the permissions of a Yike project member.</p>
     * 
     * @param request UpdateYikeProductionMemberAuthRequest
     * @return UpdateYikeProductionMemberAuthResponse
     */
    public UpdateYikeProductionMemberAuthResponse updateYikeProductionMemberAuth(UpdateYikeProductionMemberAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateYikeProductionMemberAuthWithOptions(request, runtime);
    }
}
