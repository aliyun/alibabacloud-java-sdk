// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260707;

import com.aliyun.tea.*;
import com.aliyun.yike20260707.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "Yike";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
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
     * <p>Adds users under the same Alibaba Cloud account to a specified project in the default workspace of the Alibaba Cloud account, and grants the Edit permission by default. ProjectId specifies the project ID. YikeUserIds specifies a comma-separated list of Yike user IDs, which are not Alibaba Cloud UIDs. Currently, only the default workspace of the Alibaba Cloud account is supported, and projects in newly created workspaces are not supported. This operation follows the behavior of the original member API operation: adding an existing member resets the project permissions. Regular members are assigned the Edit permission, and SuperAdmins of the default workspace retain the Manage permission. Only Alibaba Cloud accounts that have activated ProductionOpenAPI are supported. Default Alibaba Cloud account projects (pd_Alibaba Cloud account ID) are not supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds members to a project.</p>
     * 
     * @param request AddProjectMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddProjectMembersResponse
     */
    public AddProjectMembersResponse addProjectMembersWithOptions(AddProjectMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yikeUserIds)) {
            query.put("YikeUserIds", request.yikeUserIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddProjectMembers"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddProjectMembersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Adds users under the same Alibaba Cloud account to a specified project in the default workspace of the Alibaba Cloud account, and grants the Edit permission by default. ProjectId specifies the project ID. YikeUserIds specifies a comma-separated list of Yike user IDs, which are not Alibaba Cloud UIDs. Currently, only the default workspace of the Alibaba Cloud account is supported, and projects in newly created workspaces are not supported. This operation follows the behavior of the original member API operation: adding an existing member resets the project permissions. Regular members are assigned the Edit permission, and SuperAdmins of the default workspace retain the Manage permission. Only Alibaba Cloud accounts that have activated ProductionOpenAPI are supported. Default Alibaba Cloud account projects (pd_Alibaba Cloud account ID) are not supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds members to a project.</p>
     * 
     * @param request AddProjectMembersRequest
     * @return AddProjectMembersResponse
     */
    public AddProjectMembersResponse addProjectMembers(AddProjectMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addProjectMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the information of multiple media assets.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.bizConfig)) {
            query.put("BizConfig", request.bizConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaIds)) {
            query.put("MediaIds", request.mediaIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnDynamicMeta)) {
            query.put("ReturnDynamicMeta", request.returnDynamicMeta);
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
     * <h2>Request description</h2>
     * <p>This API operation queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the information of multiple media assets.</p>
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
     * <p>Queries the status and results of multiple video character replacement jobs. JobIds is a comma-separated string of job IDs. The response includes a JobList. The input parameters for each job are located in the AppInputConfig field. For the single query operation GetVideoCharacterReplaceJob, the corresponding field is AppParams. When the Status is Finished, you can retrieve the output media assets from the Result field.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries multiple video character replacement jobs.</p>
     * 
     * @param request BatchGetVideoCharacterReplaceJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetVideoCharacterReplaceJobsResponse
     */
    public BatchGetVideoCharacterReplaceJobsResponse batchGetVideoCharacterReplaceJobsWithOptions(BatchGetVideoCharacterReplaceJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetVideoCharacterReplaceJobs"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetVideoCharacterReplaceJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the status and results of multiple video character replacement jobs. JobIds is a comma-separated string of job IDs. The response includes a JobList. The input parameters for each job are located in the AppInputConfig field. For the single query operation GetVideoCharacterReplaceJob, the corresponding field is AppParams. When the Status is Finished, you can retrieve the output media assets from the Result field.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries multiple video character replacement jobs.</p>
     * 
     * @param request BatchGetVideoCharacterReplaceJobsRequest
     * @return BatchGetVideoCharacterReplaceJobsResponse
     */
    public BatchGetVideoCharacterReplaceJobsResponse batchGetVideoCharacterReplaceJobs(BatchGetVideoCharacterReplaceJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchGetVideoCharacterReplaceJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a generation task.</p>
     * 
     * @param request CancelGenerationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelGenerationJobResponse
     */
    public CancelGenerationJobResponse cancelGenerationJobWithOptions(CancelGenerationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelGenerationJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelGenerationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels a generation task.</p>
     * 
     * @param request CancelGenerationJobRequest
     * @return CancelGenerationJobResponse
     */
    public CancelGenerationJobResponse cancelGenerationJob(CancelGenerationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelGenerationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Categories support up to three levels of hierarchy, and each level supports up to 100 subcategories.</p>
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
     * <p>Categories support up to three levels of hierarchy, and each level supports up to 100 subcategories.</p>
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
     * <h2>Request description</h2>
     * <p>This API queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an infinite canvas.</p>
     * 
     * @param request CreateInfiniteCanvasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInfiniteCanvasResponse
     */
    public CreateInfiniteCanvasResponse createInfiniteCanvasWithOptions(CreateInfiniteCanvasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.coverUrl)) {
            query.put("CoverUrl", request.coverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productionId)) {
            query.put("ProductionId", request.productionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

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
            new TeaPair("action", "CreateInfiniteCanvas"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInfiniteCanvasResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an infinite canvas.</p>
     * 
     * @param request CreateInfiniteCanvasRequest
     * @return CreateInfiniteCanvasResponse
     */
    public CreateInfiniteCanvasResponse createInfiniteCanvas(CreateInfiniteCanvasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInfiniteCanvasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation generates temporary OSS upload credentials so that clients can directly upload files to a specified OSS bucket.</li>
     * <li>The <code>FileExt</code> parameter is required and specifies the file name extension of the file to be uploaded, such as mp4 or wav. Do not include the dot.</li>
     * <li>The <code>FileType</code> parameter is optional and defaults to <code>Media</code>. It affects the path segment in the returned <code>ObjectKey</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates OSS upload credentials for client-side direct upload without registering media assets or creating media asset records.</p>
     * 
     * @param request CreateOssUploadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOssUploadResponse
     */
    public CreateOssUploadResponse createOssUploadWithOptions(CreateOssUploadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizConfig)) {
            query.put("BizConfig", request.bizConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialType)) {
            query.put("CredentialType", request.credentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileExt)) {
            query.put("FileExt", request.fileExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetBucket)) {
            query.put("TargetBucket", request.targetBucket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOssUpload"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOssUploadResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation generates temporary OSS upload credentials so that clients can directly upload files to a specified OSS bucket.</li>
     * <li>The <code>FileExt</code> parameter is required and specifies the file name extension of the file to be uploaded, such as mp4 or wav. Do not include the dot.</li>
     * <li>The <code>FileType</code> parameter is optional and defaults to <code>Media</code>. It affects the path segment in the returned <code>ObjectKey</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates OSS upload credentials for client-side direct upload without registering media assets or creating media asset records.</p>
     * 
     * @param request CreateOssUploadRequest
     * @return CreateOssUploadResponse
     */
    public CreateOssUploadResponse createOssUpload(CreateOssUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOssUploadWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a project in a specified workspace and returns the project ID. If WorkspaceId is not specified, the default workspace of the current account is used. After the project is created, you can call GetProject to query the details or call ListProjects to list projects.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a project.</p>
     * 
     * @param request CreateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateProject"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a project in a specified workspace and returns the project ID. If WorkspaceId is not specified, the default workspace of the current account is used. After the project is created, you can call GetProject to query the details or call ListProjects to list projects.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a project.</p>
     * 
     * @param request CreateProjectRequest
     * @return CreateProjectResponse
     */
    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports two modes: creating a new media asset and overwriting an existing media asset.</li>
     * <li>When creating a new media asset, the <code>FileInfo</code> and <code>MediaMetaData</code> parameters are required.</li>
     * <li>When overwriting an existing media asset, you must set <code>Overwrite</code> to true and provide <code>MediaId</code>.</li>
     * <li>You can specify the credential type by using <code>CredentialType</code>. The default value is STS_TOKEN.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates or overwrites a media asset for upload and obtains upload credentials.</p>
     * 
     * @param request CreateUploadMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUploadMediaResponse
     */
    public CreateUploadMediaResponse createUploadMediaWithOptions(CreateUploadMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialType)) {
            query.put("CredentialType", request.credentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileInfo)) {
            query.put("FileInfo", request.fileInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            query.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaMetaData)) {
            query.put("MediaMetaData", request.mediaMetaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.overwrite)) {
            query.put("Overwrite", request.overwrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageLocation)) {
            query.put("StorageLocation", request.storageLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUploadMedia"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUploadMediaResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation supports two modes: creating a new media asset and overwriting an existing media asset.</li>
     * <li>When creating a new media asset, the <code>FileInfo</code> and <code>MediaMetaData</code> parameters are required.</li>
     * <li>When overwriting an existing media asset, you must set <code>Overwrite</code> to true and provide <code>MediaId</code>.</li>
     * <li>You can specify the credential type by using <code>CredentialType</code>. The default value is STS_TOKEN.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates or overwrites a media asset for upload and obtains upload credentials.</p>
     * 
     * @param request CreateUploadMediaRequest
     * @return CreateUploadMediaResponse
     */
    public CreateUploadMediaResponse createUploadMedia(CreateUploadMediaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadMediaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a studio and triggers the automatic creation of a default project for the studio. Returns the WorkspaceId and the ProjectId of the default project. You can use the ProjectId directly without creating the default project again.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a studio.</p>
     * 
     * @param request CreateWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateWorkspace"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a studio and triggers the automatic creation of a default project for the studio. Returns the WorkspaceId and the ProjectId of the default project. You can use the ProjectId directly without creating the default project again.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a studio.</p>
     * 
     * @param request CreateWorkspaceRequest
     * @return CreateWorkspaceResponse
     */
    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation also deletes its subcategories, including level-2 and level-3 subcategories. Proceed with caution.</p>
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
     * <p>This operation also deletes its subcategories, including level-2 and level-3 subcategories. Proceed with caution.</p>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an infinite canvas.</p>
     * 
     * @param request DeleteInfiniteCanvasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInfiniteCanvasResponse
     */
    public DeleteInfiniteCanvasResponse deleteInfiniteCanvasWithOptions(DeleteInfiniteCanvasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.canvasId)) {
            query.put("CanvasId", request.canvasId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInfiniteCanvas"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInfiniteCanvasResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an infinite canvas.</p>
     * 
     * @param request DeleteInfiniteCanvasRequest
     * @return DeleteInfiniteCanvasResponse
     */
    public DeleteInfiniteCanvasResponse deleteInfiniteCanvas(DeleteInfiniteCanvasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInfiniteCanvasWithOptions(request, runtime);
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
        if (!com.aliyun.teautil.Common.isUnset(request.bizConfig)) {
            query.put("BizConfig", request.bizConfig);
        }

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
     * <b>description</b> :
     * <p>Deletes a project by ProjectId. The caller must have project management permissions.
     * Default projects cannot be deleted. If you attempt to delete a default project, DefaultProductionNotSupported is returned. This operation marks the project as deleted and does not physically delete all assets in the project.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a project.</p>
     * 
     * @param request DeleteProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProject"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a project by ProjectId. The caller must have project management permissions.
     * Default projects cannot be deleted. If you attempt to delete a default project, DefaultProductionNotSupported is returned. This operation marks the project as deleted and does not physically delete all assets in the project.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a project.</p>
     * 
     * @param request DeleteProjectRequest
     * @return DeleteProjectResponse
     */
    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice:  The AI generation-related API operations in the current 2026-03-19 API version will be retired soon. Upgrade to the 2026-07-07 API version.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the logon token for an enterprise account.</p>
     * 
     * @param request GenerateYikeLoginTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateYikeLoginTokenResponse
     */
    public GenerateYikeLoginTokenResponse generateYikeLoginTokenWithOptions(GenerateYikeLoginTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateProduction)) {
            query.put("AutoCreateProduction", request.autoCreateProduction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expires)) {
            query.put("Expires", request.expires);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nickName)) {
            query.put("NickName", request.nickName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productionAuth)) {
            query.put("ProductionAuth", request.productionAuth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subUserCredit)) {
            query.put("SubUserCredit", request.subUserCredit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenant)) {
            query.put("Tenant", request.tenant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateYikeLoginToken"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateYikeLoginTokenResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Notice:  The AI generation-related API operations in the current 2026-03-19 API version will be retired soon. Upgrade to the 2026-07-07 API version.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the logon token for an enterprise account.</p>
     * 
     * @param request GenerateYikeLoginTokenRequest
     * @return GenerateYikeLoginTokenResponse
     */
    public GenerateYikeLoginTokenResponse generateYikeLoginToken(GenerateYikeLoginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateYikeLoginTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an asynchronous task of the agent node.</p>
     * 
     * @param request GetAgentJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAgentJobResponse
     */
    public GetAgentJobResponse getAgentJobWithOptions(GetAgentJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAgentJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAgentJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an asynchronous task of the agent node.</p>
     * 
     * @param request GetAgentJobRequest
     * @return GetAgentJobResponse
     */
    public GetAgentJobResponse getAgentJob(GetAgentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAgentJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified category and a list of its subcategories.</p>
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
     * <p>Retrieves the details of a specified category and a list of its subcategories.</p>
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
     * <h2>Request description</h2>
     * <p>This API queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an infinite canvas.</p>
     * 
     * @param request GetInfiniteCanvasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInfiniteCanvasResponse
     */
    public GetInfiniteCanvasResponse getInfiniteCanvasWithOptions(GetInfiniteCanvasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.canvasId)) {
            query.put("CanvasId", request.canvasId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInfiniteCanvas"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInfiniteCanvasResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an infinite canvas.</p>
     * 
     * @param request GetInfiniteCanvasRequest
     * @return GetInfiniteCanvasResponse
     */
    public GetInfiniteCanvasResponse getInfiniteCanvas(GetInfiniteCanvasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInfiniteCanvasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API operation queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media assets.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.bizConfig)) {
            query.put("BizConfig", request.bizConfig);
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
     * <h2>Request description</h2>
     * <p>This API operation queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media assets.</p>
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
     * <h2>Request description</h2>
     * <p>This operation queries media content comprehension jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media content comprehension jobs.</p>
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
     * <h2>Request description</h2>
     * <p>This operation queries media content comprehension jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries media content comprehension jobs.</p>
     * 
     * @param request GetMediaComprehensionJobRequest
     * @return GetMediaComprehensionJobResponse
     */
    public GetMediaComprehensionJobResponse getMediaComprehensionJob(GetMediaComprehensionJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMediaComprehensionJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the basic information of a project and the permissions of the current caller on the project based on the ProjectId. The project information is contained in the Project object of the response and does not include the list of project assets.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a project.</p>
     * 
     * @param request GetProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProjectResponse
     */
    public GetProjectResponse getProjectWithOptions(GetProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProject"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the basic information of a project and the permissions of the current caller on the project based on the ProjectId. The project information is contained in the Project object of the response and does not include the list of project assets.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a project.</p>
     * 
     * @param request GetProjectRequest
     * @return GetProjectResponse
     */
    public GetProjectResponse getProject(GetProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProjectWithOptions(request, runtime);
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
     * <b>description</b> :
     * <p>Queries the status and result of a single task by using the JobId returned by the submit operation. When the Status is Finished, you can read the output media assets in Result. Executing indicates that the task is still running.
     * This operation uses AppParams to return the task input parameters. The corresponding field name in the batch query operation is AppInputConfig. The output results are categorized into ImageResult, VideoResult, and AudioResult. Each category contains MediaId and OutputUrl.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a video character replacement task.</p>
     * 
     * @param request GetVideoCharacterReplaceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoCharacterReplaceJobResponse
     */
    public GetVideoCharacterReplaceJobResponse getVideoCharacterReplaceJobWithOptions(GetVideoCharacterReplaceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoCharacterReplaceJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoCharacterReplaceJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the status and result of a single task by using the JobId returned by the submit operation. When the Status is Finished, you can read the output media assets in Result. Executing indicates that the task is still running.
     * This operation uses AppParams to return the task input parameters. The corresponding field name in the batch query operation is AppInputConfig. The output results are categorized into ImageResult, VideoResult, and AudioResult. Each category contains MediaId and OutputUrl.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a video character replacement task.</p>
     * 
     * @param request GetVideoCharacterReplaceJobRequest
     * @return GetVideoCharacterReplaceJobResponse
     */
    public GetVideoCharacterReplaceJobResponse getVideoCharacterReplaceJob(GetVideoCharacterReplaceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoCharacterReplaceJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries video creative generation jobs.</p>
     * 
     * @param request GetVideoCreativeGenerationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoCreativeGenerationJobResponse
     */
    public GetVideoCreativeGenerationJobResponse getVideoCreativeGenerationJobWithOptions(GetVideoCreativeGenerationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoCreativeGenerationJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoCreativeGenerationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries video creative generation jobs.</p>
     * 
     * @param request GetVideoCreativeGenerationJobRequest
     * @return GetVideoCreativeGenerationJobResponse
     */
    public GetVideoCreativeGenerationJobResponse getVideoCreativeGenerationJob(GetVideoCreativeGenerationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoCreativeGenerationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the status, input, parameters, and final results of a video text removal job based on the <code>JobId</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status, input parameters, and video results of a video text removal job.</p>
     * 
     * @param request GetVideoDetextJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoDetextJobResponse
     */
    public GetVideoDetextJobResponse getVideoDetextJobWithOptions(GetVideoDetextJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoDetextJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoDetextJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the status, input, parameters, and final results of a video text removal job based on the <code>JobId</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status, input parameters, and video results of a video text removal job.</p>
     * 
     * @param request GetVideoDetextJobRequest
     * @return GetVideoDetextJobResponse
     */
    public GetVideoDetextJobResponse getVideoDetextJob(GetVideoDetextJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoDetextJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a video generation job.</p>
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
     * <p>Queries a video generation job.</p>
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
     * <p>Queries the task status based on the JobId returned by SubmitVideoRemakeJob. Upon completion, returns the download URLs of the JSON files for the video content understanding results and the creative script. If the task fails, returns ErrorCode and ErrorMessage.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a content understanding and creative script generation task.</p>
     * 
     * @param request GetVideoRemakeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoRemakeJobResponse
     */
    public GetVideoRemakeJobResponse getVideoRemakeJobWithOptions(GetVideoRemakeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoRemakeJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoRemakeJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the task status based on the JobId returned by SubmitVideoRemakeJob. Upon completion, returns the download URLs of the JSON files for the video content understanding results and the creative script. If the task fails, returns ErrorCode and ErrorMessage.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a content understanding and creative script generation task.</p>
     * 
     * @param request GetVideoRemakeJobRequest
     * @return GetVideoRemakeJobResponse
     */
    public GetVideoRemakeJobResponse getVideoRemakeJob(GetVideoRemakeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoRemakeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a video rendering and compositing job.</p>
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
     * <p>Submits a video rendering and compositing job.</p>
     * 
     * @param request GetVideoRenderJobRequest
     * @return GetVideoRenderJobResponse
     */
    public GetVideoRenderJobResponse getVideoRenderJob(GetVideoRenderJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoRenderJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the status, input, parameters, and final results of a video translation job based on JobId.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status, input parameters, and multilingual outputs of a video translation job.</p>
     * 
     * @param request GetVideoTranslationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVideoTranslationJobResponse
     */
    public GetVideoTranslationJobResponse getVideoTranslationJobWithOptions(GetVideoTranslationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVideoTranslationJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVideoTranslationJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the status, input, parameters, and final results of a video translation job based on JobId.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status, input parameters, and multilingual outputs of a video translation job.</p>
     * 
     * @param request GetVideoTranslationJobRequest
     * @return GetVideoTranslationJobResponse
     */
    public GetVideoTranslationJobResponse getVideoTranslationJob(GetVideoTranslationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVideoTranslationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the membership plan and credit information of the Yike main account.</p>
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
     * <p>Retrieves the membership plan and credit information of the Yike main account.</p>
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
     * <p>Queries the actual credits consumed by a task.</p>
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
     * <p>Queries the actual credits consumed by a task.</p>
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
     * <h2>Request description</h2>
     * <p>This API operation queries media content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports media assets.</p>
     * 
     * @param request ImportMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportMediaResponse
     */
    public ImportMediaResponse importMediaWithOptions(ImportMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizConfig)) {
            query.put("BizConfig", request.bizConfig);
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.yikeAssetConfig)) {
            query.put("YikeAssetConfig", request.yikeAssetConfig);
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
     * <h2>Request description</h2>
     * <p>This API operation queries media content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Imports media assets.</p>
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
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of infinite canvases.</p>
     * 
     * @param request ListInfiniteCanvasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInfiniteCanvasesResponse
     */
    public ListInfiniteCanvasesResponse listInfiniteCanvasesWithOptions(ListInfiniteCanvasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productionId)) {
            query.put("ProductionId", request.productionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            query.put("SortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInfiniteCanvases"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInfiniteCanvasesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of infinite canvases.</p>
     * 
     * @param request ListInfiniteCanvasesRequest
     * @return ListInfiniteCanvasesResponse
     */
    public ListInfiniteCanvasesResponse listInfiniteCanvases(ListInfiniteCanvasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInfiniteCanvasesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation retrieves a list of all media folders in a specified project (<code>ProductionId</code>). Pagination is supported by using the <code>PageNo</code> and <code>PageSize</code> parameters.</li>
     * <li>If <code>ProductionId</code> is not provided, the default project of the current account is used.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a paginated list of media folders in a specified project.</p>
     * 
     * @param request ListMediaFoldersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMediaFoldersResponse
     */
    public ListMediaFoldersResponse listMediaFoldersWithOptions(ListMediaFoldersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListMediaFolders"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMediaFoldersResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation retrieves a list of all media folders in a specified project (<code>ProductionId</code>). Pagination is supported by using the <code>PageNo</code> and <code>PageSize</code> parameters.</li>
     * <li>If <code>ProductionId</code> is not provided, the default project of the current account is used.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a paginated list of media folders in a specified project.</p>
     * 
     * @param request ListMediaFoldersRequest
     * @return ListMediaFoldersResponse
     */
    public ListMediaFoldersResponse listMediaFolders(ListMediaFoldersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMediaFoldersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of projects accessible to the current caller. You can use WorkspaceId to filter projects by workspace. For pagination, specify both PageNo and PageSize as positive integers starting from 1. If valid values are not provided for both parameters, the query defaults to page 1 with 10 entries per page. The response includes ProjectList but does not include TotalCount. MaxResults and NextToken are retained for backward compatibility and are not used for pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of projects.</p>
     * 
     * @param request ListProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListProjects"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProjectsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of projects accessible to the current caller. You can use WorkspaceId to filter projects by workspace. For pagination, specify both PageNo and PageSize as positive integers starting from 1. If valid values are not provided for both parameters, the query defaults to page 1 with 10 entries per page. The response includes ProjectList but does not include TotalCount. MaxResults and NextToken are retained for backward compatibility and are not used for pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of projects.</p>
     * 
     * @param request ListProjectsRequest
     * @return ListProjectsResponse
     */
    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of workspaces accessible to the current caller. You can use PageNo and PageSize to paginate the results. The default page number is 1, and the default page size is 10. The response includes WorkspaceList and TotalCount. The ID of the default project for a workspace is returned in the DefaultProjectId field.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of workspaces.</p>
     * 
     * @param request ListWorkspacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of workspaces accessible to the current caller. You can use PageNo and PageSize to paginate the results. The default page number is 1, and the default page size is 10. The response includes WorkspaceList and TotalCount. The ID of the default project for a workspace is returned in the DefaultProjectId field.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of workspaces.</p>
     * 
     * @param request ListWorkspacesRequest
     * @return ListWorkspacesResponse
     */
    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkspacesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before submitting a task, validates the input materials for a specified application. AppParams is a JSON-serialized string. The field names must match the input definition of the application corresponding to the AppId. Image, audio, and video materials must match the input types and be accessible.
     * If Status is Success, the validation passes and Result is an empty array. If Status is Failed, Result returns the failed parameter keys and error codes for each item. This operation does not create a task. After the validation passes, call SubmitVideoCharacterReplaceJob to submit the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Pre-validates a video character replacement task.</p>
     * 
     * @param request PrecheckVideoCharacterReplaceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PrecheckVideoCharacterReplaceJobResponse
     */
    public PrecheckVideoCharacterReplaceJobResponse precheckVideoCharacterReplaceJobWithOptions(PrecheckVideoCharacterReplaceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "PrecheckVideoCharacterReplaceJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PrecheckVideoCharacterReplaceJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before submitting a task, validates the input materials for a specified application. AppParams is a JSON-serialized string. The field names must match the input definition of the application corresponding to the AppId. Image, audio, and video materials must match the input types and be accessible.
     * If Status is Success, the validation passes and Result is an empty array. If Status is Failed, Result returns the failed parameter keys and error codes for each item. This operation does not create a task. After the validation passes, call SubmitVideoCharacterReplaceJob to submit the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Pre-validates a video character replacement task.</p>
     * 
     * @param request PrecheckVideoCharacterReplaceJobRequest
     * @return PrecheckVideoCharacterReplaceJobResponse
     */
    public PrecheckVideoCharacterReplaceJobResponse precheckVideoCharacterReplaceJob(PrecheckVideoCharacterReplaceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.precheckVideoCharacterReplaceJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves media asset information that matches the specified parameters.</p>
     * 
     * @param request SearchMediaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchMediaResponse
     */
    public SearchMediaResponse searchMediaWithOptions(SearchMediaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizConfig)) {
            query.put("BizConfig", request.bizConfig);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
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
     * <p>Retrieves media asset information that matches the specified parameters.</p>
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
     * <p>Submits an asynchronous task for an agent node.</p>
     * 
     * @param request SubmitAgentJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAgentJobResponse
     */
    public SubmitAgentJobResponse submitAgentJobWithOptions(SubmitAgentJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notifyUrl)) {
            query.put("NotifyUrl", request.notifyUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skill)) {
            query.put("Skill", request.skill);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAgentJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAgentJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an asynchronous task for an agent node.</p>
     * 
     * @param request SubmitAgentJobRequest
     * @return SubmitAgentJobResponse
     */
    public SubmitAgentJobResponse submitAgentJob(SubmitAgentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAgentJobWithOptions(request, runtime);
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
     * <h2>Request description</h2>
     * <p>This API operation performs content understanding based on provided media files, such as video URLs. Additionally, you can pass custom parameters through the <code>UserData</code> field, which are returned as-is in the callback.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a media content understanding job.</p>
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
     * <h2>Request description</h2>
     * <p>This API operation performs content understanding based on provided media files, such as video URLs. Additionally, you can pass custom parameters through the <code>UserData</code> field, which are returned as-is in the callback.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a media content understanding job.</p>
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
     * <p>This API generates a new voiceover script based on content understanding results and new product or avatar information. It also supports passing custom parameters through the UserData field, which are returned as-is in the callback.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a creative script generation task.</p>
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
     * <p>This API generates a new voiceover script based on content understanding results and new product or avatar information. It also supports passing custom parameters through the UserData field, which are returned as-is in the callback.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a creative script generation task.</p>
     * 
     * @param request SubmitRemakeScriptJobRequest
     * @return SubmitRemakeScriptJobResponse
     */
    public SubmitRemakeScriptJobResponse submitRemakeScriptJob(SubmitRemakeScriptJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitRemakeScriptJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs an asynchronous commit for a video character replacement node. First, call PrecheckVideoCharacterReplaceJob with the same AppId and AppParams to check the input materials.
     * A returned JobId only indicates that the node has been submitted, not that it has been completed. Use GetVideoCharacterReplaceJob or BatchGetVideoCharacterReplaceJobs to query the status and output results. ProjectId is used to specify a project, and FolderId is used to specify a file folder.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a video character replacement job.</p>
     * 
     * @param request SubmitVideoCharacterReplaceJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVideoCharacterReplaceJobResponse
     */
    public SubmitVideoCharacterReplaceJobResponse submitVideoCharacterReplaceJobWithOptions(SubmitVideoCharacterReplaceJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVideoCharacterReplaceJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVideoCharacterReplaceJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs an asynchronous commit for a video character replacement node. First, call PrecheckVideoCharacterReplaceJob with the same AppId and AppParams to check the input materials.
     * A returned JobId only indicates that the node has been submitted, not that it has been completed. Use GetVideoCharacterReplaceJob or BatchGetVideoCharacterReplaceJobs to query the status and output results. ProjectId is used to specify a project, and FolderId is used to specify a file folder.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a video character replacement job.</p>
     * 
     * @param request SubmitVideoCharacterReplaceJobRequest
     * @return SubmitVideoCharacterReplaceJobResponse
     */
    public SubmitVideoCharacterReplaceJobResponse submitVideoCharacterReplaceJob(SubmitVideoCharacterReplaceJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitVideoCharacterReplaceJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a video creative generation job.</p>
     * 
     * @param request SubmitVideoCreativeGenerationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVideoCreativeGenerationJobResponse
     */
    public SubmitVideoCreativeGenerationJobResponse submitVideoCreativeGenerationJobWithOptions(SubmitVideoCreativeGenerationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aspectRatio)) {
            query.put("AspectRatio", request.aspectRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarData)) {
            query.put("AvatarData", request.avatarData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobParams)) {
            query.put("JobParams", request.jobParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputLanguages)) {
            query.put("OutputLanguages", request.outputLanguages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            query.put("Resolution", request.resolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            query.put("SceneType", request.sceneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMaterials)) {
            query.put("UserMaterials", request.userMaterials);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withSubtitles)) {
            query.put("WithSubtitles", request.withSubtitles);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVideoCreativeGenerationJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVideoCreativeGenerationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a video creative generation job.</p>
     * 
     * @param request SubmitVideoCreativeGenerationJobRequest
     * @return SubmitVideoCreativeGenerationJobResponse
     */
    public SubmitVideoCreativeGenerationJobResponse submitVideoCreativeGenerationJob(SubmitVideoCreativeGenerationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitVideoCreativeGenerationJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Submits an asynchronous video text erasure task. The input can be an accessible video URL or a Yike video media asset ID. You can configure the erasure time range and text region.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits an asynchronous video text erasure task that supports full-area erasure, time ranges, and specified regions.</p>
     * 
     * @param request SubmitVideoDetextJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVideoDetextJobResponse
     */
    public SubmitVideoDetextJobResponse submitVideoDetextJobWithOptions(SubmitVideoDetextJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            body.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobParameters)) {
            body.put("JobParameters", request.jobParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            body.put("Output", request.output);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            body.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVideoDetextJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVideoDetextJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Submits an asynchronous video text erasure task. The input can be an accessible video URL or a Yike video media asset ID. You can configure the erasure time range and text region.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits an asynchronous video text erasure task that supports full-area erasure, time ranges, and specified regions.</p>
     * 
     * @param request SubmitVideoDetextJobRequest
     * @return SubmitVideoDetextJobResponse
     */
    public SubmitVideoDetextJobResponse submitVideoDetextJob(SubmitVideoDetextJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitVideoDetextJobWithOptions(request, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.output)) {
            query.put("Output", request.output);
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
     * <b>description</b> :
     * <p>Submits the original video and remake information such as new products and characters to asynchronously complete video content understanding and creative script generation. Uses the returned JobId to call GetVideoRemakeJob to query the progress and outputs. Video rendering requires a separate call to SubmitVideoRenderJob.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a content understanding and creative script generation task.</p>
     * 
     * @param request SubmitVideoRemakeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitVideoRemakeJobResponse
     */
    public SubmitVideoRemakeJobResponse submitVideoRemakeJobWithOptions(SubmitVideoRemakeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.input)) {
            query.put("Input", request.input);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remakeParams)) {
            query.put("RemakeParams", request.remakeParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitVideoRemakeJob"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitVideoRemakeJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Submits the original video and remake information such as new products and characters to asynchronously complete video content understanding and creative script generation. Uses the returned JobId to call GetVideoRemakeJob to query the progress and outputs. Video rendering requires a separate call to SubmitVideoRenderJob.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a content understanding and creative script generation task.</p>
     * 
     * @param request SubmitVideoRemakeJobRequest
     * @return SubmitVideoRemakeJobResponse
     */
    public SubmitVideoRemakeJobResponse submitVideoRemakeJob(SubmitVideoRemakeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitVideoRemakeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a video rendering and compositing task.</p>
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
     * <p>Submits a video rendering and compositing task.</p>
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
     * <p>Submits an asynchronous video translation task. The input supports a media URL or a Yike media asset ID. The task parameters are used to select the source language, target language, and the translation capabilities to be enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits an asynchronous video translation task that supports subtitle translation, voice translation, primary subtitle removal, and on-screen text translation.</p>
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
     * <p>Submits an asynchronous video translation task. The input supports a media URL or a Yike media asset ID. The task parameters are used to select the source language, target language, and the translation capabilities to be enabled.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits an asynchronous video translation task that supports subtitle translation, voice translation, primary subtitle removal, and on-screen text translation.</p>
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
     * <p>After you create a media asset category, you can call this operation to update the name of the category by specifying its ID.</p>
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
     * <p>After you create a media asset category, you can call this operation to update the name of the category by specifying its ID.</p>
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
     * <p>This API queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information of an infinite canvas.</p>
     * 
     * @param request UpdateInfiniteCanvasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInfiniteCanvasResponse
     */
    public UpdateInfiniteCanvasResponse updateInfiniteCanvasWithOptions(UpdateInfiniteCanvasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.canvasId)) {
            query.put("CanvasId", request.canvasId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coverUrl)) {
            query.put("CoverUrl", request.coverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInfiniteCanvas"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInfiniteCanvasResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries media asset content understanding jobs.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the information of an infinite canvas.</p>
     * 
     * @param request UpdateInfiniteCanvasRequest
     * @return UpdateInfiniteCanvasResponse
     */
    public UpdateInfiniteCanvasResponse updateInfiniteCanvas(UpdateInfiniteCanvasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInfiniteCanvasWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API queries media asset content understanding jobs.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.bizConfig)) {
            query.put("BizConfig", request.bizConfig);
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
     * <p>This API queries media asset content understanding jobs.</p>
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

    /**
     * <b>description</b> :
     * <p>Updates the name of a project based on the ProjectId and uses Title to specify the new name. This operation only supports modifying the name and does not support modifying the description or cover image. The caller must have edit permissions for the project.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the name of a project.</p>
     * 
     * @param request UpdateProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProject"),
            new TeaPair("version", "2026-07-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateProjectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the name of a project based on the ProjectId and uses Title to specify the new name. This operation only supports modifying the name and does not support modifying the description or cover image. The caller must have edit permissions for the project.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the name of a project.</p>
     * 
     * @param request UpdateProjectRequest
     * @return UpdateProjectResponse
     */
    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }
}
