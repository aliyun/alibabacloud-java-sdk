// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pailangstudio20240710;

import com.aliyun.tea.*;
import com.aliyun.pailangstudio20240710.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("pailangstudio", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建知识库</p>
     * 
     * @param request CreateKnowledgeBaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKnowledgeBaseResponse
     */
    public CreateKnowledgeBaseResponse createKnowledgeBaseWithOptions(CreateKnowledgeBaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chunkConfig)) {
            body.put("ChunkConfig", request.chunkConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSources)) {
            body.put("DataSources", request.dataSources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.embeddingConfig)) {
            body.put("EmbeddingConfig", request.embeddingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexColumnConfig)) {
            body.put("IndexColumnConfig", request.indexColumnConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseType)) {
            body.put("KnowledgeBaseType", request.knowledgeBaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaDataConfig)) {
            body.put("MetaDataConfig", request.metaDataConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputDir)) {
            body.put("OutputDir", request.outputDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeId)) {
            body.put("RuntimeId", request.runtimeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vectorDBConfig)) {
            body.put("VectorDBConfig", request.vectorDBConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKnowledgeBase"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建知识库</p>
     * 
     * @param request CreateKnowledgeBaseRequest
     * @return CreateKnowledgeBaseResponse
     */
    public CreateKnowledgeBaseResponse createKnowledgeBase(CreateKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKnowledgeBaseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建知识库任务</p>
     * 
     * @param request CreateKnowledgeBaseJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKnowledgeBaseJobResponse
     */
    public CreateKnowledgeBaseJobResponse createKnowledgeBaseJobWithOptions(String KnowledgeBaseId, CreateKnowledgeBaseJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessibility)) {
            body.put("Accessibility", request.accessibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsSpecs)) {
            body.put("EcsSpecs", request.ecsSpecs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.embeddingConfig)) {
            body.put("EmbeddingConfig", request.embeddingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobAction)) {
            body.put("JobAction", request.jobAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxRunningTimeInSeconds)) {
            body.put("MaxRunningTimeInSeconds", request.maxRunningTimeInSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userVpc)) {
            body.put("UserVpc", request.userVpc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKnowledgeBaseJob"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + "/knowledgebasejobs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKnowledgeBaseJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建知识库任务</p>
     * 
     * @param request CreateKnowledgeBaseJobRequest
     * @return CreateKnowledgeBaseJobResponse
     */
    public CreateKnowledgeBaseJobResponse createKnowledgeBaseJob(String KnowledgeBaseId, CreateKnowledgeBaseJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKnowledgeBaseJobWithOptions(KnowledgeBaseId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除知识库</p>
     * 
     * @param request DeleteKnowledgeBaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKnowledgeBaseResponse
     */
    public DeleteKnowledgeBaseResponse deleteKnowledgeBaseWithOptions(String KnowledgeBaseId, DeleteKnowledgeBaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKnowledgeBase"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除知识库</p>
     * 
     * @param request DeleteKnowledgeBaseRequest
     * @return DeleteKnowledgeBaseResponse
     */
    public DeleteKnowledgeBaseResponse deleteKnowledgeBase(String KnowledgeBaseId, DeleteKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteKnowledgeBaseWithOptions(KnowledgeBaseId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除知识库任务</p>
     * 
     * @param request DeleteKnowledgeBaseJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKnowledgeBaseJobResponse
     */
    public DeleteKnowledgeBaseJobResponse deleteKnowledgeBaseJobWithOptions(String KnowledgeBaseId, String KnowledgeBaseJobId, DeleteKnowledgeBaseJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKnowledgeBaseJob"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + "/knowledgebasejobs/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseJobId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKnowledgeBaseJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除知识库任务</p>
     * 
     * @param request DeleteKnowledgeBaseJobRequest
     * @return DeleteKnowledgeBaseJobResponse
     */
    public DeleteKnowledgeBaseJobResponse deleteKnowledgeBaseJob(String KnowledgeBaseId, String KnowledgeBaseJobId, DeleteKnowledgeBaseJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteKnowledgeBaseJobWithOptions(KnowledgeBaseId, KnowledgeBaseJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看知识库</p>
     * 
     * @param request GetKnowledgeBaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKnowledgeBaseResponse
     */
    public GetKnowledgeBaseResponse getKnowledgeBaseWithOptions(String KnowledgeBaseId, GetKnowledgeBaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            query.put("VersionName", request.versionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKnowledgeBase"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看知识库</p>
     * 
     * @param request GetKnowledgeBaseRequest
     * @return GetKnowledgeBaseResponse
     */
    public GetKnowledgeBaseResponse getKnowledgeBase(String KnowledgeBaseId, GetKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKnowledgeBaseWithOptions(KnowledgeBaseId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看知识库任务</p>
     * 
     * @param request GetKnowledgeBaseJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKnowledgeBaseJobResponse
     */
    public GetKnowledgeBaseJobResponse getKnowledgeBaseJobWithOptions(String KnowledgeBaseId, String KnowledgeBaseJobId, GetKnowledgeBaseJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKnowledgeBaseJob"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + "/knowledgebasejobs/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseJobId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKnowledgeBaseJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看知识库任务</p>
     * 
     * @param request GetKnowledgeBaseJobRequest
     * @return GetKnowledgeBaseJobResponse
     */
    public GetKnowledgeBaseJobResponse getKnowledgeBaseJob(String KnowledgeBaseId, String KnowledgeBaseJobId, GetKnowledgeBaseJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKnowledgeBaseJobWithOptions(KnowledgeBaseId, KnowledgeBaseJobId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库切片列表</p>
     * 
     * @param request ListKnowledgeBaseChunksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKnowledgeBaseChunksResponse
     */
    public ListKnowledgeBaseChunksResponse listKnowledgeBaseChunksWithOptions(String KnowledgeBaseId, ListKnowledgeBaseChunksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunkStatus)) {
            query.put("ChunkStatus", request.chunkStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaData)) {
            query.put("MetaData", request.metaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            query.put("VersionName", request.versionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKnowledgeBaseChunks"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + "/knowledgebasechunks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKnowledgeBaseChunksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库切片列表</p>
     * 
     * @param request ListKnowledgeBaseChunksRequest
     * @return ListKnowledgeBaseChunksResponse
     */
    public ListKnowledgeBaseChunksResponse listKnowledgeBaseChunks(String KnowledgeBaseId, ListKnowledgeBaseChunksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKnowledgeBaseChunksWithOptions(KnowledgeBaseId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库任务列表</p>
     * 
     * @param request ListKnowledgeBaseJobsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKnowledgeBaseJobsResponse
     */
    public ListKnowledgeBaseJobsResponse listKnowledgeBaseJobsWithOptions(String KnowledgeBaseId, ListKnowledgeBaseJobsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobAction)) {
            query.put("JobAction", request.jobAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseJobId)) {
            query.put("KnowledgeBaseJobId", request.knowledgeBaseJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKnowledgeBaseJobs"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + "/knowledgebasejobs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKnowledgeBaseJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库任务列表</p>
     * 
     * @param request ListKnowledgeBaseJobsRequest
     * @return ListKnowledgeBaseJobsResponse
     */
    public ListKnowledgeBaseJobsResponse listKnowledgeBaseJobs(String KnowledgeBaseId, ListKnowledgeBaseJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKnowledgeBaseJobsWithOptions(KnowledgeBaseId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库列表</p>
     * 
     * @param request ListKnowledgeBasesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKnowledgeBasesResponse
     */
    public ListKnowledgeBasesResponse listKnowledgeBasesWithOptions(ListKnowledgeBasesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseId)) {
            query.put("KnowledgeBaseId", request.knowledgeBaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseType)) {
            query.put("KnowledgeBaseType", request.knowledgeBaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKnowledgeBases"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKnowledgeBasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取知识库列表</p>
     * 
     * @param request ListKnowledgeBasesRequest
     * @return ListKnowledgeBasesResponse
     */
    public ListKnowledgeBasesResponse listKnowledgeBases(ListKnowledgeBasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKnowledgeBasesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索知识库</p>
     * 
     * @param request RetrieveKnowledgeBaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetrieveKnowledgeBaseResponse
     */
    public RetrieveKnowledgeBaseResponse retrieveKnowledgeBaseWithOptions(String KnowledgeBaseId, RetrieveKnowledgeBaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hybridStrategyConfig)) {
            body.put("HybridStrategyConfig", request.hybridStrategyConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaDataFilterConditions)) {
            body.put("MetaDataFilterConditions", request.metaDataFilterConditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryMode)) {
            body.put("QueryMode", request.queryMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankConfig)) {
            body.put("RerankConfig", request.rerankConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rewriteConfig)) {
            body.put("RewriteConfig", request.rewriteConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scoreThreshold)) {
            body.put("ScoreThreshold", request.scoreThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            body.put("TopK", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionName)) {
            body.put("VersionName", request.versionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetrieveKnowledgeBase"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + "/action/retrieve"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetrieveKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>搜索知识库</p>
     * 
     * @param request RetrieveKnowledgeBaseRequest
     * @return RetrieveKnowledgeBaseResponse
     */
    public RetrieveKnowledgeBaseResponse retrieveKnowledgeBase(String KnowledgeBaseId, RetrieveKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retrieveKnowledgeBaseWithOptions(KnowledgeBaseId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新知识库</p>
     * 
     * @param request UpdateKnowledgeBaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKnowledgeBaseResponse
     */
    public UpdateKnowledgeBaseResponse updateKnowledgeBaseWithOptions(String KnowledgeBaseId, UpdateKnowledgeBaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoUpdateConfig)) {
            body.put("AutoUpdateConfig", request.autoUpdateConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindRuntime)) {
            body.put("BindRuntime", request.bindRuntime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaDataConfig)) {
            body.put("MetaDataConfig", request.metaDataConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeId)) {
            body.put("RuntimeId", request.runtimeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKnowledgeBase"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKnowledgeBaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新知识库</p>
     * 
     * @param request UpdateKnowledgeBaseRequest
     * @return UpdateKnowledgeBaseResponse
     */
    public UpdateKnowledgeBaseResponse updateKnowledgeBase(String KnowledgeBaseId, UpdateKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKnowledgeBaseWithOptions(KnowledgeBaseId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新知识库切片</p>
     * 
     * @param request UpdateKnowledgeBaseChunkRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKnowledgeBaseChunkResponse
     */
    public UpdateKnowledgeBaseChunkResponse updateKnowledgeBaseChunkWithOptions(String KnowledgeBaseId, String KnowledgeBaseChunkId, UpdateKnowledgeBaseChunkRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunkContent)) {
            body.put("ChunkContent", request.chunkContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chunkStatus)) {
            body.put("ChunkStatus", request.chunkStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKnowledgeBaseChunk"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + "/knowledgebasechunks/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseChunkId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKnowledgeBaseChunkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新知识库切片</p>
     * 
     * @param request UpdateKnowledgeBaseChunkRequest
     * @return UpdateKnowledgeBaseChunkResponse
     */
    public UpdateKnowledgeBaseChunkResponse updateKnowledgeBaseChunk(String KnowledgeBaseId, String KnowledgeBaseChunkId, UpdateKnowledgeBaseChunkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKnowledgeBaseChunkWithOptions(KnowledgeBaseId, KnowledgeBaseChunkId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新知识库任务</p>
     * 
     * @param request UpdateKnowledgeBaseJobRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKnowledgeBaseJobResponse
     */
    public UpdateKnowledgeBaseJobResponse updateKnowledgeBaseJobWithOptions(String KnowledgeBaseId, String KnowledgeBaseJobId, UpdateKnowledgeBaseJobRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKnowledgeBaseJob"),
            new TeaPair("version", "2024-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/langstudio/knowledgebases/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseId) + "/knowledgebasejobs/" + com.aliyun.openapiutil.Client.getEncodeParam(KnowledgeBaseJobId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKnowledgeBaseJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新知识库任务</p>
     * 
     * @param request UpdateKnowledgeBaseJobRequest
     * @return UpdateKnowledgeBaseJobResponse
     */
    public UpdateKnowledgeBaseJobResponse updateKnowledgeBaseJob(String KnowledgeBaseId, String KnowledgeBaseJobId, UpdateKnowledgeBaseJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKnowledgeBaseJobWithOptions(KnowledgeBaseId, KnowledgeBaseJobId, request, headers, runtime);
    }
}
