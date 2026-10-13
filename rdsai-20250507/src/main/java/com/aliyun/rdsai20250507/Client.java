// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507;

import com.aliyun.tea.*;
import com.aliyun.rdsai20250507.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-wulanchabu", "rdsai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "rdsai.aliyuncs.com"),
            new TeaPair("cn-beijing", "rdsai.aliyuncs.com"),
            new TeaPair("cn-shanghai", "rdsai.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "rdsai.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "rdsai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("rdsai", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Adds a job exclusion item.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an exclusion item to an import task.</p>
     * 
     * @param request AddContextDatabaseSyncJobExclusionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddContextDatabaseSyncJobExclusionResponse
     */
    public AddContextDatabaseSyncJobExclusionResponse addContextDatabaseSyncJobExclusionWithOptions(AddContextDatabaseSyncJobExclusionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            query.put("DocumentId", request.documentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddContextDatabaseSyncJobExclusion"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddContextDatabaseSyncJobExclusionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Adds a job exclusion item.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an exclusion item to an import task.</p>
     * 
     * @param request AddContextDatabaseSyncJobExclusionRequest
     * @return AddContextDatabaseSyncJobExclusionResponse
     */
    public AddContextDatabaseSyncJobExclusionResponse addContextDatabaseSyncJobExclusion(AddContextDatabaseSyncJobExclusionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addContextDatabaseSyncJobExclusionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can specify a ClientToken to ensure idempotence for write operations. If you do not specify this parameter, the backend automatically generates one.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels an in-progress discovery task by task ID.</p>
     * 
     * @param request CancelContextDatabaseSyncDiscoveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelContextDatabaseSyncDiscoveryResponse
     */
    public CancelContextDatabaseSyncDiscoveryResponse cancelContextDatabaseSyncDiscoveryWithOptions(CancelContextDatabaseSyncDiscoveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelContextDatabaseSyncDiscovery"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelContextDatabaseSyncDiscoveryResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can specify a ClientToken to ensure idempotence for write operations. If you do not specify this parameter, the backend automatically generates one.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels an in-progress discovery task by task ID.</p>
     * 
     * @param request CancelContextDatabaseSyncDiscoveryRequest
     * @return CancelContextDatabaseSyncDiscoveryResponse
     */
    public CancelContextDatabaseSyncDiscoveryResponse cancelContextDatabaseSyncDiscovery(CancelContextDatabaseSyncDiscoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelContextDatabaseSyncDiscoveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence through ClientToken. If ClientToken is not provided, the backend generates one automatically. Cancellation is best-effort. Completed RunItems are not affected.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a run.</p>
     * 
     * @param request CancelContextDatabaseSyncRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelContextDatabaseSyncRunResponse
     */
    public CancelContextDatabaseSyncRunResponse cancelContextDatabaseSyncRunWithOptions(CancelContextDatabaseSyncRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            query.put("RunId", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelContextDatabaseSyncRun"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelContextDatabaseSyncRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence through ClientToken. If ClientToken is not provided, the backend generates one automatically. Cancellation is best-effort. Completed RunItems are not affected.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a run.</p>
     * 
     * @param request CancelContextDatabaseSyncRunRequest
     * @return CancelContextDatabaseSyncRunResponse
     */
    public CancelContextDatabaseSyncRunResponse cancelContextDatabaseSyncRun(CancelContextDatabaseSyncRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelContextDatabaseSyncRunWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sends a conversation message.</p>
     * 
     * @param tmpReq ChatMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatMessagesResponse
     */
    public ChatMessagesResponse chatMessagesWithOptions(ChatMessagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ChatMessagesShrinkRequest request = new ChatMessagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "Files", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputs)) {
            request.inputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputs, "Inputs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventMode)) {
            query.put("EventMode", request.eventMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            query.put("Files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputsShrink)) {
            query.put("Inputs", request.inputsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentMessageId)) {
            query.put("ParentMessageId", request.parentMessageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatMessages"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sends a conversation message.</p>
     * 
     * @param request ChatMessagesRequest
     * @return ChatMessagesResponse
     */
    public ChatMessagesResponse chatMessages(ChatMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatMessagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a conversation.</p>
     * 
     * @param request ChatMessagesTaskStopRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatMessagesTaskStopResponse
     */
    public ChatMessagesTaskStopResponse chatMessagesTaskStopWithOptions(ChatMessagesTaskStopRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChatMessagesTaskStop"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChatMessagesTaskStopResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a conversation.</p>
     * 
     * @param request ChatMessagesTaskStopRequest
     * @return ChatMessagesTaskStopResponse
     */
    public ChatMessagesTaskStopResponse chatMessagesTaskStop(ChatMessagesTaskStopRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.chatMessagesTaskStopWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom API key.</p>
     * 
     * @param request CreateApiKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApiKeyResponse
     */
    public CreateApiKeyResponse createApiKeyWithOptions(CreateApiKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dailyTokenQuota)) {
            query.put("DailyTokenQuota", request.dailyTokenQuota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyName)) {
            query.put("KeyName", request.keyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitRate)) {
            query.put("LimitRate", request.limitRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitType)) {
            query.put("LimitType", request.limitType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            query.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenQuota)) {
            query.put("TokenQuota", request.tokenQuota);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApiKey"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Creates a custom API key.</p>
     * 
     * @param request CreateApiKeyRequest
     * @return CreateApiKeyResponse
     */
    public CreateApiKeyResponse createApiKey(CreateApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApiKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation incurs fees. Read the related documentation carefully before you perform this operation.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an RDS AI application instance.</p>
     * 
     * @param tmpReq CreateAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppInstanceResponse
     */
    public CreateAppInstanceResponse createAppInstanceWithOptions(CreateAppInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppInstanceShrinkRequest request = new CreateAppInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.components)) {
            request.componentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.components, "Components", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.DBInstanceConfig)) {
            request.DBInstanceConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.DBInstanceConfig, "DBInstanceConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentsShrink)) {
            query.put("Components", request.componentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceConfigShrink)) {
            query.put("DBInstanceConfig", request.DBInstanceConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dashboardPassword)) {
            query.put("DashboardPassword", request.dashboardPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dashboardUsername)) {
            query.put("DashboardUsername", request.dashboardUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePassword)) {
            query.put("DatabasePassword", request.databasePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initializeWithExistingData)) {
            query.put("InitializeWithExistingData", request.initializeWithExistingData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicEndpointEnabled)) {
            query.put("PublicEndpointEnabled", request.publicEndpointEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicNetworkAccessEnabled)) {
            query.put("PublicNetworkAccessEnabled", request.publicNetworkAccessEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RAGEnabled)) {
            query.put("RAGEnabled", request.RAGEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppInstance"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation incurs fees. Read the related documentation carefully before you perform this operation.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an RDS AI application instance.</p>
     * 
     * @param request CreateAppInstanceRequest
     * @return CreateAppInstanceResponse
     */
    public CreateAppInstanceResponse createAppInstance(CreateAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates an API key and returns the plaintext apiKey.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a context database API key.</p>
     * 
     * @param request CreateContextDatabaseApiKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContextDatabaseApiKeyResponse
     */
    public CreateContextDatabaseApiKeyResponse createContextDatabaseApiKeyWithOptions(CreateContextDatabaseApiKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContextDatabaseApiKey"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContextDatabaseApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates an API key and returns the plaintext apiKey.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a context database API key.</p>
     * 
     * @param request CreateContextDatabaseApiKeyRequest
     * @return CreateContextDatabaseApiKeyResponse
     */
    public CreateContextDatabaseApiKeyResponse createContextDatabaseApiKey(CreateContextDatabaseApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContextDatabaseApiKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a member. If GenerateInitialKey is set to true, the first API key is also issued, and the plaintext ApiKey is returned in the response. This is a sensitive field and is returned only once. Store it securely. After the member is created, you can call the List or Get operation to query the member and the metadata of the API keys under the member.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a ContextDB member.</p>
     * 
     * @param request CreateContextDatabaseMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContextDatabaseMemberResponse
     */
    public CreateContextDatabaseMemberResponse createContextDatabaseMemberWithOptions(CreateContextDatabaseMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.generateInitialKey)) {
            query.put("GenerateInitialKey", request.generateInitialKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initialKeyName)) {
            query.put("InitialKeyName", request.initialKeyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            query.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContextDatabaseMember"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContextDatabaseMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a member. If GenerateInitialKey is set to true, the first API key is also issued, and the plaintext ApiKey is returned in the response. This is a sensitive field and is returned only once. Store it securely. After the member is created, you can call the List or Get operation to query the member and the metadata of the API keys under the member.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a ContextDB member.</p>
     * 
     * @param request CreateContextDatabaseMemberRequest
     * @return CreateContextDatabaseMemberResponse
     */
    public CreateContextDatabaseMemberResponse createContextDatabaseMember(CreateContextDatabaseMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContextDatabaseMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For write operations, you can specify a ClientToken to ensure idempotency. If no ClientToken is provided, the backend automatically generates one. Upon successful creation, the complete information of the created object is returned, including the ID that can be used for subsequent queries or updates.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a synchronization connection.</p>
     * 
     * @param request CreateContextDatabaseSyncConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContextDatabaseSyncConnectionResponse
     */
    public CreateContextDatabaseSyncConnectionResponse createContextDatabaseSyncConnectionWithOptions(CreateContextDatabaseSyncConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authKind)) {
            query.put("AuthKind", request.authKind);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContextDatabaseSyncConnection"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContextDatabaseSyncConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>For write operations, you can specify a ClientToken to ensure idempotency. If no ClientToken is provided, the backend automatically generates one. Upon successful creation, the complete information of the created object is returned, including the ID that can be used for subsequent queries or updates.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a synchronization connection.</p>
     * 
     * @param request CreateContextDatabaseSyncConnectionRequest
     * @return CreateContextDatabaseSyncConnectionResponse
     */
    public CreateContextDatabaseSyncConnectionResponse createContextDatabaseSyncConnection(CreateContextDatabaseSyncConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContextDatabaseSyncConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence via ClientToken. If ClientToken is not provided, the backend generates one automatically. Target is an implicit concept — you only need to provide KnowledgeBaseId, and the backend automatically creates or matches the Target.
     * On success, the response returns the complete information of the created object. The Id field is active and can be used for subsequent queries or updates.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an import task.</p>
     * 
     * @param tmpReq CreateContextDatabaseSyncJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContextDatabaseSyncJobResponse
     */
    public CreateContextDatabaseSyncJobResponse createContextDatabaseSyncJobWithOptions(CreateContextDatabaseSyncJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateContextDatabaseSyncJobShrinkRequest request = new CreateContextDatabaseSyncJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filters)) {
            request.filtersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filters, "Filters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filtersShrink)) {
            query.put("Filters", request.filtersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseId)) {
            query.put("KnowledgeBaseId", request.knowledgeBaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetKnowledgeBaseId)) {
            query.put("TargetKnowledgeBaseId", request.targetKnowledgeBaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetKnowledgeBaseName)) {
            query.put("TargetKnowledgeBaseName", request.targetKnowledgeBaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContextDatabaseSyncJob"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContextDatabaseSyncJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence via ClientToken. If ClientToken is not provided, the backend generates one automatically. Target is an implicit concept — you only need to provide KnowledgeBaseId, and the backend automatically creates or matches the Target.
     * On success, the response returns the complete information of the created object. The Id field is active and can be used for subsequent queries or updates.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an import task.</p>
     * 
     * @param request CreateContextDatabaseSyncJobRequest
     * @return CreateContextDatabaseSyncJobResponse
     */
    public CreateContextDatabaseSyncJobResponse createContextDatabaseSyncJob(CreateContextDatabaseSyncJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContextDatabaseSyncJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no token is provided, the backend generates one automatically. After creating a data selection scope, you typically need to call StartContextDatabaseSyncSourceDiscovery to discover available nodes.
     * On success, the response returns the complete information of the created object. The Id field can be used for subsequent queries or updates.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data selection scope.</p>
     * 
     * @param tmpReq CreateContextDatabaseSyncSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContextDatabaseSyncSourceResponse
     */
    public CreateContextDatabaseSyncSourceResponse createContextDatabaseSyncSourceWithOptions(CreateContextDatabaseSyncSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateContextDatabaseSyncSourceShrinkRequest request = new CreateContextDatabaseSyncSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceConfig)) {
            request.sourceConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceConfig, "SourceConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceConfigShrink)) {
            query.put("SourceConfig", request.sourceConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContextDatabaseSyncSource"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContextDatabaseSyncSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no token is provided, the backend generates one automatically. After creating a data selection scope, you typically need to call StartContextDatabaseSyncSourceDiscovery to discover available nodes.
     * On success, the response returns the complete information of the created object. The Id field can be used for subsequent queries or updates.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data selection scope.</p>
     * 
     * @param request CreateContextDatabaseSyncSourceRequest
     * @return CreateContextDatabaseSyncSourceResponse
     */
    public CreateContextDatabaseSyncSourceResponse createContextDatabaseSyncSource(CreateContextDatabaseSyncSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContextDatabaseSyncSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a workspace along with the first member and the first API key in a one-time onboarding process. The plaintext API key is returned in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workspace, the first member, and the first API key in a one-time onboarding process.</p>
     * 
     * @param request CreateContextDatabaseWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateContextDatabaseWorkspaceResponse
     */
    public CreateContextDatabaseWorkspaceResponse createContextDatabaseWorkspaceWithOptions(CreateContextDatabaseWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            query.put("MemberName", request.memberName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("WorkspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateContextDatabaseWorkspace"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateContextDatabaseWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a workspace along with the first member and the first API key in a one-time onboarding process. The plaintext API key is returned in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workspace, the first member, and the first API key in a one-time onboarding process.</p>
     * 
     * @param request CreateContextDatabaseWorkspaceRequest
     * @return CreateContextDatabaseWorkspaceResponse
     */
    public CreateContextDatabaseWorkspaceResponse createContextDatabaseWorkspace(CreateContextDatabaseWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createContextDatabaseWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a user-specific agent.</p>
     * 
     * @param tmpReq CreateCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomAgentResponse
     */
    public CreateCustomAgentResponse createCustomAgentWithOptions(CreateCustomAgentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCustomAgentShrinkRequest request = new CreateCustomAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.skillIds)) {
            request.skillIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.skillIds, "SkillIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tools)) {
            request.toolsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tools, "Tools", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableTools)) {
            query.put("EnableTools", request.enableTools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillIdsShrink)) {
            query.put("SkillIds", request.skillIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemPrompt)) {
            query.put("SystemPrompt", request.systemPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolsShrink)) {
            query.put("Tools", request.toolsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomAgent"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a user-specific agent.</p>
     * 
     * @param request CreateCustomAgentRequest
     * @return CreateCustomAgentResponse
     */
    public CreateCustomAgentResponse createCustomAgent(CreateCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a batch instance inspection task.</p>
     * 
     * @param request CreateInspectionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInspectionTaskResponse
     */
    public CreateInspectionTaskResponse createInspectionTaskWithOptions(CreateInspectionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inspectionItems)) {
            query.put("InspectionItems", request.inspectionItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportLanguage)) {
            query.put("ReportLanguage", request.reportLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportRegionId)) {
            query.put("ReportRegionId", request.reportRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("ReportType", request.reportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInspectionTask"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInspectionTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a batch instance inspection task.</p>
     * 
     * @param request CreateInspectionTaskRequest
     * @return CreateInspectionTaskResponse
     */
    public CreateInspectionTaskResponse createInspectionTask(CreateInspectionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInspectionTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Triggers an asynchronous export task for MO usage details in CSV format.</p>
     * 
     * @param request CreateMOUsageDetailExportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMOUsageDetailExportResponse
     */
    public CreateMOUsageDetailExportResponse createMOUsageDetailExportWithOptions(CreateMOUsageDetailExportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageType)) {
            query.put("UsageType", request.usageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMOUsageDetailExport"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMOUsageDetailExportResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Triggers an asynchronous export task for MO usage details in CSV format.</p>
     * 
     * @param request CreateMOUsageDetailExportRequest
     * @return CreateMOUsageDetailExportResponse
     */
    public CreateMOUsageDetailExportResponse createMOUsageDetailExport(CreateMOUsageDetailExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMOUsageDetailExportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Creates a sandbox template.</p>
     * 
     * @param tmpReq CreateSandboxTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSandboxTemplateResponse
     */
    public CreateSandboxTemplateResponse createSandboxTemplateWithOptions(CreateSandboxTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSandboxTemplateShrinkRequest request = new CreateSandboxTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultCpu)) {
            query.put("DefaultCpu", request.defaultCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultMemory)) {
            query.put("DefaultMemory", request.defaultMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSandboxTemplate"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSandboxTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Creates a sandbox template.</p>
     * 
     * @param request CreateSandboxTemplateRequest
     * @return CreateSandboxTemplateResponse
     */
    public CreateSandboxTemplateResponse createSandboxTemplate(CreateSandboxTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSandboxTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation incurs fees. Read the related feature documentation carefully before you perform this operation.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a scheduled inspection configuration for batch instances.</p>
     * 
     * @param request CreateScheduledTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTaskWithOptions(CreateScheduledTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequency)) {
            query.put("Frequency", request.frequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inspectionItems)) {
            query.put("InspectionItems", request.inspectionItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportLanguage)) {
            query.put("ReportLanguage", request.reportLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportRegionId)) {
            query.put("ReportRegionId", request.reportRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("ReportType", request.reportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("TimeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledTask"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation incurs fees. Read the related feature documentation carefully before you perform this operation.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a scheduled inspection configuration for batch instances.</p>
     * 
     * @param request CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScheduledTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a user-defined skill.</p>
     * 
     * @param tmpReq CreateSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillResponse
     */
    public CreateSkillResponse createSkillWithOptions(CreateSkillRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSkillShrinkRequest request = new CreateSkillShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dbtypes)) {
            request.dbtypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dbtypes, "Dbtypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbtypesShrink)) {
            query.put("Dbtypes", request.dbtypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateNote)) {
            query.put("UpdateNote", request.updateNote);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("UploadId", request.uploadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadToken)) {
            query.put("UploadToken", request.uploadToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkill"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a user-defined skill.</p>
     * 
     * @param request CreateSkillRequest
     * @return CreateSkillResponse
     */
    public CreateSkillResponse createSkill(CreateSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom API key.</p>
     * 
     * @param request DeleteApiKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApiKeyResponse
     */
    public DeleteApiKeyResponse deleteApiKeyWithOptions(DeleteApiKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApiKey"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom API key.</p>
     * 
     * @param request DeleteApiKeyRequest
     * @return DeleteApiKeyResponse
     */
    public DeleteApiKeyResponse deleteApiKey(DeleteApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApiKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable DPI engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation incurs fees. Read the related feature documentation carefully before you perform this operation.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>
     * Notice: Deleting an RDS Supabase project does not automatically delete the ApsaraDB RDS for PostgreSQL instance or the Internet NAT gateway that were created along with the project. You must <a href="https://help.aliyun.com/document_detail/96749.html">manual release the instance</a> and delete the <a href="https://help.aliyun.com/document_detail/121139.html">Internet NAT gateway</a> and <a href="https://help.aliyun.com/document_detail/121527.html">EIP</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes an RDS AI application instance.</p>
     * 
     * @param request DeleteAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppInstanceResponse
     */
    public DeleteAppInstanceResponse deleteAppInstanceWithOptions(DeleteAppInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteDBInstance)) {
            query.put("DeleteDBInstance", request.deleteDBInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppInstance"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable DPI engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation incurs fees. Read the related feature documentation carefully before you perform this operation.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>
     * Notice: Deleting an RDS Supabase project does not automatically delete the ApsaraDB RDS for PostgreSQL instance or the Internet NAT gateway that were created along with the project. You must <a href="https://help.aliyun.com/document_detail/96749.html">manual release the instance</a> and delete the <a href="https://help.aliyun.com/document_detail/121139.html">Internet NAT gateway</a> and <a href="https://help.aliyun.com/document_detail/121527.html">EIP</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes an RDS AI application instance.</p>
     * 
     * @param request DeleteAppInstanceRequest
     * @return DeleteAppInstanceResponse
     */
    public DeleteAppInstanceResponse deleteAppInstance(DeleteAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a member. This is a hard delete and cannot be undone.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a context database member.</p>
     * 
     * @param request DeleteContextDatabaseMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContextDatabaseMemberResponse
     */
    public DeleteContextDatabaseMemberResponse deleteContextDatabaseMemberWithOptions(DeleteContextDatabaseMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContextDatabaseMember"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContextDatabaseMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a member. This is a hard delete and cannot be undone.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a context database member.</p>
     * 
     * @param request DeleteContextDatabaseMemberRequest
     * @return DeleteContextDatabaseMemberResponse
     */
    public DeleteContextDatabaseMemberResponse deleteContextDatabaseMember(DeleteContextDatabaseMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContextDatabaseMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For write operations, you can specify a ClientToken to ensure idempotency. If you do not specify a ClientToken, the backend automatically generates one.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data source.</p>
     * 
     * @param request DeleteContextDatabaseSyncConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContextDatabaseSyncConnectionResponse
     */
    public DeleteContextDatabaseSyncConnectionResponse deleteContextDatabaseSyncConnectionWithOptions(DeleteContextDatabaseSyncConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContextDatabaseSyncConnection"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContextDatabaseSyncConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>For write operations, you can specify a ClientToken to ensure idempotency. If you do not specify a ClientToken, the backend automatically generates one.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data source.</p>
     * 
     * @param request DeleteContextDatabaseSyncConnectionRequest
     * @return DeleteContextDatabaseSyncConnectionResponse
     */
    public DeleteContextDatabaseSyncConnectionResponse deleteContextDatabaseSyncConnection(DeleteContextDatabaseSyncConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContextDatabaseSyncConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can provide a ClientToken to ensure idempotency for write operations. If not provided, the backend automatically generates one.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an import task.</p>
     * 
     * @param request DeleteContextDatabaseSyncJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContextDatabaseSyncJobResponse
     */
    public DeleteContextDatabaseSyncJobResponse deleteContextDatabaseSyncJobWithOptions(DeleteContextDatabaseSyncJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContextDatabaseSyncJob"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContextDatabaseSyncJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can provide a ClientToken to ensure idempotency for write operations. If not provided, the backend automatically generates one.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an import task.</p>
     * 
     * @param request DeleteContextDatabaseSyncJobRequest
     * @return DeleteContextDatabaseSyncJobResponse
     */
    public DeleteContextDatabaseSyncJobResponse deleteContextDatabaseSyncJob(DeleteContextDatabaseSyncJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContextDatabaseSyncJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence through ClientToken. If ClientToken is not provided, the backend generates one automatically.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data selection scope.</p>
     * 
     * @param request DeleteContextDatabaseSyncSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContextDatabaseSyncSourceResponse
     */
    public DeleteContextDatabaseSyncSourceResponse deleteContextDatabaseSyncSourceWithOptions(DeleteContextDatabaseSyncSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContextDatabaseSyncSource"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContextDatabaseSyncSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence through ClientToken. If ClientToken is not provided, the backend generates one automatically.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a data selection scope.</p>
     * 
     * @param request DeleteContextDatabaseSyncSourceRequest
     * @return DeleteContextDatabaseSyncSourceResponse
     */
    public DeleteContextDatabaseSyncSourceResponse deleteContextDatabaseSyncSource(DeleteContextDatabaseSyncSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContextDatabaseSyncSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a workspace. This is a hard delete and cannot be recovered. After the workspace is deleted, the local metadata is soft-deleted synchronously. Deleted workspaces no longer count toward the quota.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a ContextDB workspace.</p>
     * 
     * @param request DeleteContextDatabaseWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteContextDatabaseWorkspaceResponse
     */
    public DeleteContextDatabaseWorkspaceResponse deleteContextDatabaseWorkspaceWithOptions(DeleteContextDatabaseWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteContextDatabaseWorkspace"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteContextDatabaseWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a workspace. This is a hard delete and cannot be recovered. After the workspace is deleted, the local metadata is soft-deleted synchronously. Deleted workspaces no longer count toward the quota.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a ContextDB workspace.</p>
     * 
     * @param request DeleteContextDatabaseWorkspaceRequest
     * @return DeleteContextDatabaseWorkspaceResponse
     */
    public DeleteContextDatabaseWorkspaceResponse deleteContextDatabaseWorkspace(DeleteContextDatabaseWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteContextDatabaseWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dedicated agent created by the user.</p>
     * 
     * @param request DeleteCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomAgentResponse
     */
    public DeleteCustomAgentResponse deleteCustomAgentWithOptions(DeleteCustomAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customAgentId)) {
            query.put("CustomAgentId", request.customAgentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomAgent"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a dedicated agent created by the user.</p>
     * 
     * @param request DeleteCustomAgentRequest
     * @return DeleteCustomAgentResponse
     */
    public DeleteCustomAgentResponse deleteCustomAgent(DeleteCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a sandbox template.</p>
     * 
     * @param request DeleteSandboxTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSandboxTemplateResponse
     */
    public DeleteSandboxTemplateResponse deleteSandboxTemplateWithOptions(DeleteSandboxTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSandboxTemplate"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSandboxTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a sandbox template.</p>
     * 
     * @param request DeleteSandboxTemplateRequest
     * @return DeleteSandboxTemplateResponse
     */
    public DeleteSandboxTemplateResponse deleteSandboxTemplate(DeleteSandboxTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSandboxTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified inspection configuration.</p>
     * 
     * @param request DeleteScheduledTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduledTaskResponse
     */
    public DeleteScheduledTaskResponse deleteScheduledTaskWithOptions(DeleteScheduledTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scheduledId)) {
            query.put("ScheduledId", request.scheduledId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScheduledTask"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduledTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified inspection configuration.</p>
     * 
     * @param request DeleteScheduledTaskRequest
     * @return DeleteScheduledTaskResponse
     */
    public DeleteScheduledTaskResponse deleteScheduledTask(DeleteScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScheduledTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified Skill.</p>
     * 
     * @param request DeleteSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSkillResponse
     */
    public DeleteSkillResponse deleteSkillWithOptions(DeleteSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.skillId)) {
            query.put("SkillId", request.skillId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSkill"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified Skill.</p>
     * 
     * @param request DeleteSkillRequest
     * @return DeleteSkillResponse
     */
    public DeleteSkillResponse deleteSkill(DeleteSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSkillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an RDS AI application instance.</p>
     * 
     * @param request DescribeAppInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppInstanceAttributeResponse
     */
    public DescribeAppInstanceAttributeResponse describeAppInstanceAttributeWithOptions(DescribeAppInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppInstanceAttribute"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppInstanceAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an RDS AI application instance.</p>
     * 
     * @param request DescribeAppInstanceAttributeRequest
     * @return DescribeAppInstanceAttributeResponse
     */
    public DescribeAppInstanceAttributeResponse describeAppInstanceAttribute(DescribeAppInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of RDS AI application instances.</p>
     * 
     * @param request DescribeAppInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppInstancesResponse
     */
    public DescribeAppInstancesResponse describeAppInstancesWithOptions(DescribeAppInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppInstances"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of RDS AI application instances.</p>
     * 
     * @param request DescribeAppInstancesRequest
     * @return DescribeAppInstancesResponse
     */
    public DescribeAppInstancesResponse describeAppInstances(DescribeAppInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of supported sandbox templates.</p>
     * 
     * @param request DescribeCommonSandboxTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCommonSandboxTemplatesResponse
     */
    public DescribeCommonSandboxTemplatesResponse describeCommonSandboxTemplatesWithOptions(DescribeCommonSandboxTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCommonSandboxTemplates"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCommonSandboxTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of supported sandbox templates.</p>
     * 
     * @param request DescribeCommonSandboxTemplatesRequest
     * @return DescribeCommonSandboxTemplatesResponse
     */
    public DescribeCommonSandboxTemplatesResponse describeCommonSandboxTemplates(DescribeCommonSandboxTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommonSandboxTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of events.</p>
     * 
     * @param request DescribeEventsListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEventsListResponse
     */
    public DescribeEventsListResponse describeEventsListWithOptions(DescribeEventsListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            query.put("InstanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEventsList"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEventsListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of events.</p>
     * 
     * @param request DescribeEventsListRequest
     * @return DescribeEventsListResponse
     */
    public DescribeEventsListResponse describeEventsList(DescribeEventsListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEventsListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the authentication information of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceAuthInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceAuthInfoResponse
     */
    public DescribeInstanceAuthInfoResponse describeInstanceAuthInfoWithOptions(DescribeInstanceAuthInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAuthInfo"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAuthInfoResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the authentication information of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceAuthInfoRequest
     * @return DescribeInstanceAuthInfoResponse
     */
    public DescribeInstanceAuthInfoResponse describeInstanceAuthInfo(DescribeInstanceAuthInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAuthInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the endpoint information of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceEndpointsResponse
     */
    public DescribeInstanceEndpointsResponse describeInstanceEndpointsWithOptions(DescribeInstanceEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceEndpoints"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceEndpointsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the endpoint information of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceEndpointsRequest
     * @return DescribeInstanceEndpointsResponse
     */
    public DescribeInstanceEndpointsResponse describeInstanceEndpoints(DescribeInstanceEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP whitelist of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceIpWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceIpWhitelistResponse
     */
    public DescribeInstanceIpWhitelistResponse describeInstanceIpWhitelistWithOptions(DescribeInstanceIpWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceIpWhitelist"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceIpWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP whitelist of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceIpWhitelistRequest
     * @return DescribeInstanceIpWhitelistResponse
     */
    public DescribeInstanceIpWhitelistResponse describeInstanceIpWhitelist(DescribeInstanceIpWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceIpWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the RAG Agent configuration of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceRAGConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceRAGConfigResponse
     */
    public DescribeInstanceRAGConfigResponse describeInstanceRAGConfigWithOptions(DescribeInstanceRAGConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceRAGConfig"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceRAGConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the RAG Agent configuration of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceRAGConfigRequest
     * @return DescribeInstanceRAGConfigResponse
     */
    public DescribeInstanceRAGConfigResponse describeInstanceRAGConfig(DescribeInstanceRAGConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceRAGConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the SSL configuration of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSSLResponse
     */
    public DescribeInstanceSSLResponse describeInstanceSSLWithOptions(DescribeInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSSL"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSSLResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the SSL configuration of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceSSLRequest
     * @return DescribeInstanceSSLResponse
     */
    public DescribeInstanceSSLResponse describeInstanceSSL(DescribeInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSSLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>Currently, only Object Storage Service (OSS) is supported.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage configuration of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceStorageConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceStorageConfigResponse
     */
    public DescribeInstanceStorageConfigResponse describeInstanceStorageConfigWithOptions(DescribeInstanceStorageConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceStorageConfig"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceStorageConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>Currently, only Object Storage Service (OSS) is supported.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage configuration of an RDS AI application instance.</p>
     * 
     * @param request DescribeInstanceStorageConfigRequest
     * @return DescribeInstanceStorageConfigResponse
     */
    public DescribeInstanceStorageConfigResponse describeInstanceStorageConfig(DescribeInstanceStorageConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceStorageConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token usage records of RDS AI Assistant Ultimate Edition.</p>
     * 
     * @param request DescribeMOTokenUsageDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMOTokenUsageDetailResponse
     */
    public DescribeMOTokenUsageDetailResponse describeMOTokenUsageDetailWithOptions(DescribeMOTokenUsageDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumerName)) {
            query.put("ConsumerName", request.consumerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("Cursor", request.cursor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageType)) {
            query.put("UsageType", request.usageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMOTokenUsageDetail"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMOTokenUsageDetailResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token usage records of RDS AI Assistant Ultimate Edition.</p>
     * 
     * @param request DescribeMOTokenUsageDetailRequest
     * @return DescribeMOTokenUsageDetailResponse
     */
    public DescribeMOTokenUsageDetailResponse describeMOTokenUsageDetail(DescribeMOTokenUsageDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMOTokenUsageDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token usage summary for a model operator instance.</p>
     * 
     * @param request DescribeMOTokenUsageSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMOTokenUsageSummaryResponse
     */
    public DescribeMOTokenUsageSummaryResponse describeMOTokenUsageSummaryWithOptions(DescribeMOTokenUsageSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usageType)) {
            query.put("UsageType", request.usageType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMOTokenUsageSummary"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMOTokenUsageSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token usage summary for a model operator instance.</p>
     * 
     * @param request DescribeMOTokenUsageSummaryRequest
     * @return DescribeMOTokenUsageSummaryResponse
     */
    public DescribeMOTokenUsageSummaryResponse describeMOTokenUsageSummary(DescribeMOTokenUsageSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMOTokenUsageSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status or download link of an asynchronous CSV export task for MO usage details.</p>
     * 
     * @param request DescribeMOUsageDetailExportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMOUsageDetailExportResponse
     */
    public DescribeMOUsageDetailExportResponse describeMOUsageDetailExportWithOptions(DescribeMOUsageDetailExportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMOUsageDetailExport"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMOUsageDetailExportResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status or download link of an asynchronous CSV export task for MO usage details.</p>
     * 
     * @param request DescribeMOUsageDetailExportRequest
     * @return DescribeMOUsageDetailExportResponse
     */
    public DescribeMOUsageDetailExportResponse describeMOUsageDetailExport(DescribeMOUsageDetailExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMOUsageDetailExportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information and usage of an RDS AI Assistant Ultimate Edition instance.</p>
     * 
     * @param request DescribeModelOperatorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeModelOperatorResponse
     */
    public DescribeModelOperatorResponse describeModelOperatorWithOptions(DescribeModelOperatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeModelOperator"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModelOperatorResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information and usage of an RDS AI Assistant Ultimate Edition instance.</p>
     * 
     * @param request DescribeModelOperatorRequest
     * @return DescribeModelOperatorResponse
     */
    public DescribeModelOperatorResponse describeModelOperator(DescribeModelOperatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModelOperatorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries instance monitoring data of an RDS AI Assistant Ultimate Edition instance.</p>
     * 
     * @param tmpReq DescribeMonitorDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMonitorDataResponse
     */
    public DescribeMonitorDataResponse describeMonitorDataWithOptions(DescribeMonitorDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeMonitorDataShrinkRequest request = new DescribeMonitorDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apiKeyName)) {
            request.apiKeyNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apiKeyName, "ApiKeyName", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKeyNameShrink)) {
            query.put("ApiKeyName", request.apiKeyNameShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            query.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMonitorData"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMonitorDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries instance monitoring data of an RDS AI Assistant Ultimate Edition instance.</p>
     * 
     * @param request DescribeMonitorDataRequest
     * @return DescribeMonitorDataResponse
     */
    public DescribeMonitorDataResponse describeMonitorData(DescribeMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMonitorDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of sandbox templates used to create Supabase sandboxes.</p>
     * 
     * @param request DescribeSandboxTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSandboxTemplatesResponse
     */
    public DescribeSandboxTemplatesResponse describeSandboxTemplatesWithOptions(DescribeSandboxTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSandboxTemplates"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSandboxTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of sandbox templates used to create Supabase sandboxes.</p>
     * 
     * @param request DescribeSandboxTemplatesRequest
     * @return DescribeSandboxTemplatesResponse
     */
    public DescribeSandboxTemplatesResponse describeSandboxTemplates(DescribeSandboxTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSandboxTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the whitelist of an RDS AI Assistant Ultimate Edition instance.</p>
     * 
     * @param request DescribeWhitelistIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWhitelistIpsResponse
     */
    public DescribeWhitelistIpsResponse describeWhitelistIpsWithOptions(DescribeWhitelistIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWhitelistIps"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWhitelistIpsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the whitelist of an RDS AI Assistant Ultimate Edition instance.</p>
     * 
     * @param request DescribeWhitelistIpsRequest
     * @return DescribeWhitelistIpsResponse
     */
    public DescribeWhitelistIpsResponse describeWhitelistIps(DescribeWhitelistIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWhitelistIpsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Disables the sandbox and Edge Routine capabilities of a Supabase instance.</p>
     * <blockquote>
     * <p>Notice: This operation deletes all sandboxes and Edge Routines of the Supabase instance. Fully assess the business risks before performing this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables the sandbox and Edge Routine capabilities of a Supabase instance. Note: This operation deletes all sandboxes and Edge Routines of the instance. Fully assess the business risks before performing this operation.</p>
     * 
     * @param request DisableAgentRuntimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAgentRuntimeResponse
     */
    public DisableAgentRuntimeResponse disableAgentRuntimeWithOptions(DisableAgentRuntimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAgentRuntime"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAgentRuntimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Disables the sandbox and Edge Routine capabilities of a Supabase instance.</p>
     * <blockquote>
     * <p>Notice: This operation deletes all sandboxes and Edge Routines of the Supabase instance. Fully assess the business risks before performing this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables the sandbox and Edge Routine capabilities of a Supabase instance. Note: This operation deletes all sandboxes and Edge Routines of the instance. Fully assess the business risks before performing this operation.</p>
     * 
     * @param request DisableAgentRuntimeRequest
     * @return DisableAgentRuntimeResponse
     */
    public DisableAgentRuntimeResponse disableAgentRuntime(DisableAgentRuntimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAgentRuntimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>During the public preview, the sandbox and Edge Routine features are free of charge.</p>
     * <h3>Before you begin</h3>
     * <p>Before you use this feature, <a href="https://api.aliyun.com/api/ResourceManager/2020-03-31/CreateServiceLinkedRole?spm=api-workbench.API%20Document.0.0.4ea75094rJgPzK&RegionId=cn-beijing&tab=DEBUG&params=%7B%2522ServiceName%2522:%2522supabase.rdsai.aliyuncs.com%2522%7D&sdkStyle=old">authorize the service-linked role</a>. The service-linked role used is <a href="https://www.alibabacloud.com/help/en/ram/product-overview/services-that-work-with-service-linked-roles">AliyunServiceRoleForRDSAISupabase</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the sandbox and Edge Routine capabilities for a Supabase instance. Read the operation description before you call this operation.</p>
     * 
     * @param request EnableAgentRuntimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAgentRuntimeResponse
     */
    public EnableAgentRuntimeResponse enableAgentRuntimeWithOptions(EnableAgentRuntimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAgentRuntime"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAgentRuntimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>During the public preview, the sandbox and Edge Routine features are free of charge.</p>
     * <h3>Before you begin</h3>
     * <p>Before you use this feature, <a href="https://api.aliyun.com/api/ResourceManager/2020-03-31/CreateServiceLinkedRole?spm=api-workbench.API%20Document.0.0.4ea75094rJgPzK&RegionId=cn-beijing&tab=DEBUG&params=%7B%2522ServiceName%2522:%2522supabase.rdsai.aliyuncs.com%2522%7D&sdkStyle=old">authorize the service-linked role</a>. The service-linked role used is <a href="https://www.alibabacloud.com/help/en/ram/product-overview/services-that-work-with-service-linked-roles">AliyunServiceRoleForRDSAISupabase</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the sandbox and Edge Routine capabilities for a Supabase instance. Read the operation description before you call this operation.</p>
     * 
     * @param request EnableAgentRuntimeRequest
     * @return EnableAgentRuntimeResponse
     */
    public EnableAgentRuntimeResponse enableAgentRuntime(EnableAgentRuntimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAgentRuntimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of large language models supported by the current RDS Supabase AI gateway.</p>
     * 
     * @param request GetAvailableLLMModelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAvailableLLMModelsResponse
     */
    public GetAvailableLLMModelsResponse getAvailableLLMModelsWithOptions(GetAvailableLLMModelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAvailableLLMModels"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAvailableLLMModelsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of large language models supported by the current RDS Supabase AI gateway.</p>
     * 
     * @param request GetAvailableLLMModelsRequest
     * @return GetAvailableLLMModelsResponse
     */
    public GetAvailableLLMModelsResponse getAvailableLLMModels(GetAvailableLLMModelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAvailableLLMModelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the available models for a session.</p>
     * 
     * @param request GetChatModelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatModelResponse
     */
    public GetChatModelResponse getChatModelWithOptions(GetChatModelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatModel"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatModelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the available models for a session.</p>
     * 
     * @param request GetChatModelRequest
     * @return GetChatModelResponse
     */
    public GetChatModelResponse getChatModel(GetChatModelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getChatModelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a connection.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a datasource configuration.</p>
     * 
     * @param request GetContextDatabaseSyncConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextDatabaseSyncConnectionResponse
     */
    public GetContextDatabaseSyncConnectionResponse getContextDatabaseSyncConnectionWithOptions(GetContextDatabaseSyncConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextDatabaseSyncConnection"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextDatabaseSyncConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a connection.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a datasource configuration.</p>
     * 
     * @param request GetContextDatabaseSyncConnectionRequest
     * @return GetContextDatabaseSyncConnectionResponse
     */
    public GetContextDatabaseSyncConnectionResponse getContextDatabaseSyncConnection(GetContextDatabaseSyncConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContextDatabaseSyncConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the authorization scope of a connection.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the authorization scope of a data source.</p>
     * 
     * @param request GetContextDatabaseSyncConnectionAuthorizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextDatabaseSyncConnectionAuthorizationResponse
     */
    public GetContextDatabaseSyncConnectionAuthorizationResponse getContextDatabaseSyncConnectionAuthorizationWithOptions(GetContextDatabaseSyncConnectionAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextDatabaseSyncConnectionAuthorization"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextDatabaseSyncConnectionAuthorizationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the authorization scope of a connection.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the authorization scope of a data source.</p>
     * 
     * @param request GetContextDatabaseSyncConnectionAuthorizationRequest
     * @return GetContextDatabaseSyncConnectionAuthorizationResponse
     */
    public GetContextDatabaseSyncConnectionAuthorizationResponse getContextDatabaseSyncConnectionAuthorization(GetContextDatabaseSyncConnectionAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContextDatabaseSyncConnectionAuthorizationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the status of a discovery task by task ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a discovery task by task ID.</p>
     * 
     * @param request GetContextDatabaseSyncDiscoveryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextDatabaseSyncDiscoveryTaskResponse
     */
    public GetContextDatabaseSyncDiscoveryTaskResponse getContextDatabaseSyncDiscoveryTaskWithOptions(GetContextDatabaseSyncDiscoveryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextDatabaseSyncDiscoveryTask"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextDatabaseSyncDiscoveryTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the status of a discovery task by task ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a discovery task by task ID.</p>
     * 
     * @param request GetContextDatabaseSyncDiscoveryTaskRequest
     * @return GetContextDatabaseSyncDiscoveryTaskResponse
     */
    public GetContextDatabaseSyncDiscoveryTaskResponse getContextDatabaseSyncDiscoveryTask(GetContextDatabaseSyncDiscoveryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContextDatabaseSyncDiscoveryTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a job.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an import job.</p>
     * 
     * @param request GetContextDatabaseSyncJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextDatabaseSyncJobResponse
     */
    public GetContextDatabaseSyncJobResponse getContextDatabaseSyncJobWithOptions(GetContextDatabaseSyncJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextDatabaseSyncJob"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextDatabaseSyncJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a job.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an import job.</p>
     * 
     * @param request GetContextDatabaseSyncJobRequest
     * @return GetContextDatabaseSyncJobResponse
     */
    public GetContextDatabaseSyncJobResponse getContextDatabaseSyncJob(GetContextDatabaseSyncJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContextDatabaseSyncJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries whether a job can be started.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether an import task can be started.</p>
     * 
     * @param request GetContextDatabaseSyncJobReadinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextDatabaseSyncJobReadinessResponse
     */
    public GetContextDatabaseSyncJobReadinessResponse getContextDatabaseSyncJobReadinessWithOptions(GetContextDatabaseSyncJobReadinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextDatabaseSyncJobReadiness"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextDatabaseSyncJobReadinessResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries whether a job can be started.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether an import task can be started.</p>
     * 
     * @param request GetContextDatabaseSyncJobReadinessRequest
     * @return GetContextDatabaseSyncJobReadinessResponse
     */
    public GetContextDatabaseSyncJobReadinessResponse getContextDatabaseSyncJobReadiness(GetContextDatabaseSyncJobReadinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContextDatabaseSyncJobReadinessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the scheduling configuration of a job.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the scheduling configuration of an import task.</p>
     * 
     * @param request GetContextDatabaseSyncJobScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextDatabaseSyncJobScheduleResponse
     */
    public GetContextDatabaseSyncJobScheduleResponse getContextDatabaseSyncJobScheduleWithOptions(GetContextDatabaseSyncJobScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextDatabaseSyncJobSchedule"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextDatabaseSyncJobScheduleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the scheduling configuration of a job.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the scheduling configuration of an import task.</p>
     * 
     * @param request GetContextDatabaseSyncJobScheduleRequest
     * @return GetContextDatabaseSyncJobScheduleResponse
     */
    public GetContextDatabaseSyncJobScheduleResponse getContextDatabaseSyncJobSchedule(GetContextDatabaseSyncJobScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContextDatabaseSyncJobScheduleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a run.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a run.</p>
     * 
     * @param request GetContextDatabaseSyncRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextDatabaseSyncRunResponse
     */
    public GetContextDatabaseSyncRunResponse getContextDatabaseSyncRunWithOptions(GetContextDatabaseSyncRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            query.put("RunId", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextDatabaseSyncRun"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextDatabaseSyncRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a run.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a run.</p>
     * 
     * @param request GetContextDatabaseSyncRunRequest
     * @return GetContextDatabaseSyncRunResponse
     */
    public GetContextDatabaseSyncRunResponse getContextDatabaseSyncRun(GetContextDatabaseSyncRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContextDatabaseSyncRunWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a source.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a data selection scope.</p>
     * 
     * @param request GetContextDatabaseSyncSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextDatabaseSyncSourceResponse
     */
    public GetContextDatabaseSyncSourceResponse getContextDatabaseSyncSourceWithOptions(GetContextDatabaseSyncSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextDatabaseSyncSource"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextDatabaseSyncSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of a source.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a data selection scope.</p>
     * 
     * @param request GetContextDatabaseSyncSourceRequest
     * @return GetContextDatabaseSyncSourceResponse
     */
    public GetContextDatabaseSyncSourceResponse getContextDatabaseSyncSource(GetContextDatabaseSyncSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContextDatabaseSyncSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the current node selection of the source.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the current node selection in the data selection scope.</p>
     * 
     * @param request GetContextDatabaseSyncSourceSelectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContextDatabaseSyncSourceSelectionResponse
     */
    public GetContextDatabaseSyncSourceSelectionResponse getContextDatabaseSyncSourceSelectionWithOptions(GetContextDatabaseSyncSourceSelectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContextDatabaseSyncSourceSelection"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContextDatabaseSyncSourceSelectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the current node selection of the source.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the current node selection in the data selection scope.</p>
     * 
     * @param request GetContextDatabaseSyncSourceSelectionRequest
     * @return GetContextDatabaseSyncSourceSelectionResponse
     */
    public GetContextDatabaseSyncSourceSelectionResponse getContextDatabaseSyncSourceSelection(GetContextDatabaseSyncSourceSelectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getContextDatabaseSyncSourceSelectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical conversations of a user.</p>
     * 
     * @param request GetConversationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConversationsResponse
     */
    public GetConversationsResponse getConversationsWithOptions(GetConversationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lastId)) {
            query.put("LastId", request.lastId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pinned)) {
            query.put("Pinned", request.pinned);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConversations"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConversationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the historical conversations of a user.</p>
     * 
     * @param request GetConversationsRequest
     * @return GetConversationsResponse
     */
    public GetConversationsResponse getConversations(GetConversationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConversationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a dedicated agent created by the user.</p>
     * 
     * @param request GetCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomAgentResponse
     */
    public GetCustomAgentResponse getCustomAgentWithOptions(GetCustomAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customAgentId)) {
            query.put("CustomAgentId", request.customAgentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomAgent"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a dedicated agent created by the user.</p>
     * 
     * @param request GetCustomAgentRequest
     * @return GetCustomAgentResponse
     */
    public GetCustomAgentResponse getCustomAgent(GetCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an inspection report by report ID.</p>
     * 
     * @param request GetInspectionReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInspectionReportResponse
     */
    public GetInspectionReportResponse getInspectionReportWithOptions(GetInspectionReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("ReportType", request.reportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInspectionReport"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInspectionReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an inspection report by report ID.</p>
     * 
     * @param request GetInspectionReportRequest
     * @return GetInspectionReportResponse
     */
    public GetInspectionReportResponse getInspectionReport(GetInspectionReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInspectionReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of specific conversation messages.</p>
     * 
     * @param request GetMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMessagesResponse
     */
    public GetMessagesResponse getMessagesWithOptions(GetMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventMode)) {
            query.put("EventMode", request.eventMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstId)) {
            query.put("FirstId", request.firstId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessages"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of specific conversation messages.</p>
     * 
     * @param request GetMessagesRequest
     * @return GetMessagesResponse
     */
    public GetMessagesResponse getMessages(GetMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMessagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves order information for RDS AI Assistant Ultimate Edition.</p>
     * 
     * @param request GetModelOperatorOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelOperatorOrderResponse
     */
    public GetModelOperatorOrderResponse getModelOperatorOrderWithOptions(GetModelOperatorOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelOperatorOrder"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelOperatorOrderResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves order information for RDS AI Assistant Ultimate Edition.</p>
     * 
     * @param request GetModelOperatorOrderRequest
     * @return GetModelOperatorOrderResponse
     */
    public GetModelOperatorOrderResponse getModelOperatorOrder(GetModelOperatorOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getModelOperatorOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of all instance IDs included in a specified scheduled inspection configuration.</p>
     * 
     * @param request GetScheduledInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduledInstancesResponse
     */
    public GetScheduledInstancesResponse getScheduledInstancesWithOptions(GetScheduledInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledId)) {
            query.put("ScheduledId", request.scheduledId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheduledInstances"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduledInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of all instance IDs included in a specified scheduled inspection configuration.</p>
     * 
     * @param request GetScheduledInstancesRequest
     * @return GetScheduledInstancesResponse
     */
    public GetScheduledInstancesResponse getScheduledInstances(GetScheduledInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScheduledInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all inspection reports under a specified scheduled task, with support for filtering by time range and pagination.</p>
     * 
     * @param request GetScheduledReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduledReportsResponse
     */
    public GetScheduledReportsResponse getScheduledReportsWithOptions(GetScheduledReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledId)) {
            query.put("ScheduledId", request.scheduledId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheduledReports"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduledReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all inspection reports under a specified scheduled task, with support for filtering by time range and pagination.</p>
     * 
     * @param request GetScheduledReportsRequest
     * @return GetScheduledReportsResponse
     */
    public GetScheduledReportsResponse getScheduledReports(GetScheduledReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getScheduledReportsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified skill. You can retrieve your own skills or system preset skills.</p>
     * 
     * @param request GetSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillResponse
     */
    public GetSkillResponse getSkillWithOptions(GetSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.download)) {
            query.put("Download", request.download);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            query.put("Path", request.path);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillId)) {
            query.put("SkillId", request.skillId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkill"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified skill. You can retrieve your own skills or system preset skills.</p>
     * 
     * @param request GetSkillRequest
     * @return GetSkillResponse
     */
    public GetSkillResponse getSkill(GetSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSkillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of individual inspection reports for all non-scheduled tasks under a specified user, with pagination support.</p>
     * 
     * @param request GetStandAloneReportsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStandAloneReportsResponse
     */
    public GetStandAloneReportsResponse getStandAloneReportsWithOptions(GetStandAloneReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("ReportType", request.reportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStandAloneReports"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStandAloneReportsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of individual inspection reports for all non-scheduled tasks under a specified user, with pagination support.</p>
     * 
     * @param request GetStandAloneReportsRequest
     * @return GetStandAloneReportsResponse
     */
    public GetStandAloneReportsResponse getStandAloneReports(GetStandAloneReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStandAloneReportsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries custom API keys.</p>
     * 
     * @param request ListApiKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApiKeysResponse
     */
    public ListApiKeysResponse listApiKeysWithOptions(ListApiKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApiKeys"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApiKeysResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries custom API keys.</p>
     * 
     * @param request ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApiKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists the API keys under a specified member. The plaintext key values are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the API keys for a context database.</p>
     * 
     * @param request ListContextDatabaseApiKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseApiKeysResponse
     */
    public ListContextDatabaseApiKeysResponse listContextDatabaseApiKeysWithOptions(ListContextDatabaseApiKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContextDatabaseApiKeys"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseApiKeysResponse());
    }

    /**
     * <b>description</b> :
     * <p>Lists the API keys under a specified member. The plaintext key values are not returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the API keys for a context database.</p>
     * 
     * @param request ListContextDatabaseApiKeysRequest
     * @return ListContextDatabaseApiKeysResponse
     */
    public ListContextDatabaseApiKeysResponse listContextDatabaseApiKeys(ListContextDatabaseApiKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseApiKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists all members in a specified workspace. Each member includes a list of API keys (plaintext values are not returned).</p>
     * 
     * <b>summary</b> : 
     * <p>Lists context database members.</p>
     * 
     * @param request ListContextDatabaseMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseMembersResponse
     */
    public ListContextDatabaseMembersResponse listContextDatabaseMembersWithOptions(ListContextDatabaseMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContextDatabaseMembers"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseMembersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Lists all members in a specified workspace. Each member includes a list of API keys (plaintext values are not returned).</p>
     * 
     * <b>summary</b> : 
     * <p>Lists context database members.</p>
     * 
     * @param request ListContextDatabaseMembersRequest
     * @return ListContextDatabaseMembersResponse
     */
    public ListContextDatabaseMembersResponse listContextDatabaseMembers(ListContextDatabaseMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The list operation returns paginated results by default. Page and PageSize are optional parameters.
     * The Data list field in the response is returned as an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the datasource configurations in a workspace.</p>
     * 
     * @param request ListContextDatabaseSyncConnectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseSyncConnectionsResponse
     */
    public ListContextDatabaseSyncConnectionsResponse listContextDatabaseSyncConnectionsWithOptions(ListContextDatabaseSyncConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContextDatabaseSyncConnections"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseSyncConnectionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The list operation returns paginated results by default. Page and PageSize are optional parameters.
     * The Data list field in the response is returned as an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the datasource configurations in a workspace.</p>
     * 
     * @param request ListContextDatabaseSyncConnectionsRequest
     * @return ListContextDatabaseSyncConnectionsResponse
     */
    public ListContextDatabaseSyncConnectionsResponse listContextDatabaseSyncConnections(ListContextDatabaseSyncConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseSyncConnectionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, this operation returns paginated results. The Page and PageSize parameters are optional. The Data field in the response is returned as an array, and the Total field indicates the total number of matching entries.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the documents associated with an import task.</p>
     * 
     * @param request ListContextDatabaseSyncJobDocumentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseSyncJobDocumentsResponse
     */
    public ListContextDatabaseSyncJobDocumentsResponse listContextDatabaseSyncJobDocumentsWithOptions(ListContextDatabaseSyncJobDocumentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
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
            new TeaPair("action", "ListContextDatabaseSyncJobDocuments"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseSyncJobDocumentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>By default, this operation returns paginated results. The Page and PageSize parameters are optional. The Data field in the response is returned as an array, and the Total field indicates the total number of matching entries.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the documents associated with an import task.</p>
     * 
     * @param request ListContextDatabaseSyncJobDocumentsRequest
     * @return ListContextDatabaseSyncJobDocumentsResponse
     */
    public ListContextDatabaseSyncJobDocumentsResponse listContextDatabaseSyncJobDocuments(ListContextDatabaseSyncJobDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseSyncJobDocumentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation uses pagination by default. Page and PageSize are optional parameters.
     * The Data field in the response returns an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the exclusions of an import task.</p>
     * 
     * @param request ListContextDatabaseSyncJobExclusionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseSyncJobExclusionsResponse
     */
    public ListContextDatabaseSyncJobExclusionsResponse listContextDatabaseSyncJobExclusionsWithOptions(ListContextDatabaseSyncJobExclusionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContextDatabaseSyncJobExclusions"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseSyncJobExclusionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation uses pagination by default. Page and PageSize are optional parameters.
     * The Data field in the response returns an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the exclusions of an import task.</p>
     * 
     * @param request ListContextDatabaseSyncJobExclusionsRequest
     * @return ListContextDatabaseSyncJobExclusionsResponse
     */
    public ListContextDatabaseSyncJobExclusionsResponse listContextDatabaseSyncJobExclusions(ListContextDatabaseSyncJobExclusionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseSyncJobExclusionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The list operation returns paginated results by default. Page and PageSize are optional parameters.
     * The Data list field in the response is returned as an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists import tasks.</p>
     * 
     * @param request ListContextDatabaseSyncJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseSyncJobsResponse
     */
    public ListContextDatabaseSyncJobsResponse listContextDatabaseSyncJobsWithOptions(ListContextDatabaseSyncJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseId)) {
            query.put("KnowledgeBaseId", request.knowledgeBaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
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
            new TeaPair("action", "ListContextDatabaseSyncJobs"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseSyncJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The list operation returns paginated results by default. Page and PageSize are optional parameters.
     * The Data list field in the response is returned as an array. Total indicates the total number of records that match the specified conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists import tasks.</p>
     * 
     * @param request ListContextDatabaseSyncJobsRequest
     * @return ListContextDatabaseSyncJobsResponse
     */
    public ListContextDatabaseSyncJobsResponse listContextDatabaseSyncJobs(ListContextDatabaseSyncJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseSyncJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation returns a fixed-length array of available plugins in the workspace and does not support pagination.
     * The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists available synchronization plugins.</p>
     * 
     * @param request ListContextDatabaseSyncPluginsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseSyncPluginsResponse
     */
    public ListContextDatabaseSyncPluginsResponse listContextDatabaseSyncPluginsWithOptions(ListContextDatabaseSyncPluginsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContextDatabaseSyncPlugins"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseSyncPluginsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation returns a fixed-length array of available plugins in the workspace and does not support pagination.
     * The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists available synchronization plugins.</p>
     * 
     * @param request ListContextDatabaseSyncPluginsRequest
     * @return ListContextDatabaseSyncPluginsResponse
     */
    public ListContextDatabaseSyncPluginsResponse listContextDatabaseSyncPlugins(ListContextDatabaseSyncPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseSyncPluginsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The list API returns paginated results by default. The Page and PageSize parameters are optional. Run records are a list of RunItems that show the processing results of each document in each import run.
     * The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the run records.</p>
     * 
     * @param request ListContextDatabaseSyncRunItemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseSyncRunItemsResponse
     */
    public ListContextDatabaseSyncRunItemsResponse listContextDatabaseSyncRunItemsWithOptions(ListContextDatabaseSyncRunItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            query.put("RunId", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContextDatabaseSyncRunItems"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseSyncRunItemsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The list API returns paginated results by default. The Page and PageSize parameters are optional. Run records are a list of RunItems that show the processing results of each document in each import run.
     * The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the run records.</p>
     * 
     * @param request ListContextDatabaseSyncRunItemsRequest
     * @return ListContextDatabaseSyncRunItemsResponse
     */
    public ListContextDatabaseSyncRunItemsResponse listContextDatabaseSyncRunItems(ListContextDatabaseSyncRunItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseSyncRunItemsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>列表接口默认分页返回，Page 与 PageSize 为可选参数。
     * 响应中的 Data 列表字段使用数组返回，Total 表示符合条件的总条数。</p>
     * 
     * <b>summary</b> : 
     * <p>列出 Run 日志</p>
     * 
     * @param request ListContextDatabaseSyncRunLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseSyncRunLogsResponse
     */
    public ListContextDatabaseSyncRunLogsResponse listContextDatabaseSyncRunLogsWithOptions(ListContextDatabaseSyncRunLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            query.put("RunId", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContextDatabaseSyncRunLogs"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseSyncRunLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>列表接口默认分页返回，Page 与 PageSize 为可选参数。
     * 响应中的 Data 列表字段使用数组返回，Total 表示符合条件的总条数。</p>
     * 
     * <b>summary</b> : 
     * <p>列出 Run 日志</p>
     * 
     * @param request ListContextDatabaseSyncRunLogsRequest
     * @return ListContextDatabaseSyncRunLogsResponse
     */
    public ListContextDatabaseSyncRunLogsResponse listContextDatabaseSyncRunLogs(ListContextDatabaseSyncRunLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseSyncRunLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, this operation returns paginated results. The Page and PageSize parameters are optional.
     * The Data field in the response is returned as an array, and the Total field indicates the total number of items that meet the query conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the runs.</p>
     * 
     * @param request ListContextDatabaseSyncRunsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseSyncRunsResponse
     */
    public ListContextDatabaseSyncRunsResponse listContextDatabaseSyncRunsWithOptions(ListContextDatabaseSyncRunsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
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
            new TeaPair("action", "ListContextDatabaseSyncRuns"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseSyncRunsResponse());
    }

    /**
     * <b>description</b> :
     * <p>By default, this operation returns paginated results. The Page and PageSize parameters are optional.
     * The Data field in the response is returned as an array, and the Total field indicates the total number of items that meet the query conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the runs.</p>
     * 
     * @param request ListContextDatabaseSyncRunsRequest
     * @return ListContextDatabaseSyncRunsResponse
     */
    public ListContextDatabaseSyncRunsResponse listContextDatabaseSyncRuns(ListContextDatabaseSyncRunsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseSyncRunsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>List operations return paginated results by default. Page and PageSize are optional parameters. The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the discovered tree nodes for the data selection scope.</p>
     * 
     * @param request ListContextDatabaseSyncSourceTreeNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseSyncSourceTreeNodesResponse
     */
    public ListContextDatabaseSyncSourceTreeNodesResponse listContextDatabaseSyncSourceTreeNodesWithOptions(ListContextDatabaseSyncSourceTreeNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContextDatabaseSyncSourceTreeNodes"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseSyncSourceTreeNodesResponse());
    }

    /**
     * <b>description</b> :
     * <p>List operations return paginated results by default. Page and PageSize are optional parameters. The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the discovered tree nodes for the data selection scope.</p>
     * 
     * @param request ListContextDatabaseSyncSourceTreeNodesRequest
     * @return ListContextDatabaseSyncSourceTreeNodesResponse
     */
    public ListContextDatabaseSyncSourceTreeNodesResponse listContextDatabaseSyncSourceTreeNodes(ListContextDatabaseSyncSourceTreeNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseSyncSourceTreeNodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, the list operation returns paginated results. Page and PageSize are optional parameters. The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the data selection scopes.</p>
     * 
     * @param request ListContextDatabaseSyncSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseSyncSourcesResponse
     */
    public ListContextDatabaseSyncSourcesResponse listContextDatabaseSyncSourcesWithOptions(ListContextDatabaseSyncSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
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
            new TeaPair("action", "ListContextDatabaseSyncSources"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseSyncSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>By default, the list operation returns paginated results. Page and PageSize are optional parameters. The Data list field in the response is returned as an array, and Total indicates the total number of entries that meet the conditions.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the data selection scopes.</p>
     * 
     * @param request ListContextDatabaseSyncSourcesRequest
     * @return ListContextDatabaseSyncSourcesResponse
     */
    public ListContextDatabaseSyncSourcesResponse listContextDatabaseSyncSources(ListContextDatabaseSyncSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseSyncSourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists ContextDB workspaces.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists ContextDB workspaces.</p>
     * 
     * @param request ListContextDatabaseWorkspacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListContextDatabaseWorkspacesResponse
     */
    public ListContextDatabaseWorkspacesResponse listContextDatabaseWorkspacesWithOptions(ListContextDatabaseWorkspacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContextDatabaseWorkspaces"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContextDatabaseWorkspacesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Lists ContextDB workspaces.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists ContextDB workspaces.</p>
     * 
     * @param request ListContextDatabaseWorkspacesRequest
     * @return ListContextDatabaseWorkspacesResponse
     */
    public ListContextDatabaseWorkspacesResponse listContextDatabaseWorkspaces(ListContextDatabaseWorkspacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContextDatabaseWorkspacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of dedicated agents created by the user.</p>
     * 
     * @param request ListCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomAgentResponse
     */
    public ListCustomAgentResponse listCustomAgentWithOptions(ListCustomAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomAgent"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of dedicated agents created by the user.</p>
     * 
     * @param request ListCustomAgentRequest
     * @return ListCustomAgentResponse
     */
    public ListCustomAgentResponse listCustomAgent(ListCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Agent tools for a user.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomAgentToolsResponse
     */
    public ListCustomAgentToolsResponse listCustomAgentToolsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomAgentTools"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomAgentToolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of Agent tools for a user.</p>
     * @return ListCustomAgentToolsResponse
     */
    public ListCustomAgentToolsResponse listCustomAgentTools() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomAgentToolsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the AI gateway token usage for an RDS Supabase instance.</p>
     * 
     * @param request ListLLMTokenUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLLMTokenUsageResponse
     */
    public ListLLMTokenUsageResponse listLLMTokenUsageWithOptions(ListLLMTokenUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            query.put("Model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLLMTokenUsage"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLLMTokenUsageResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the AI gateway token usage for an RDS Supabase instance.</p>
     * 
     * @param request ListLLMTokenUsageRequest
     * @return ListLLMTokenUsageResponse
     */
    public ListLLMTokenUsageResponse listLLMTokenUsage(ListLLMTokenUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLLMTokenUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of basic information about all inspection configurations under a specified user UID.</p>
     * 
     * @param request ListScheduledTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledTasksResponse
     */
    public ListScheduledTasksResponse listScheduledTasksWithOptions(ListScheduledTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledId)) {
            query.put("ScheduledId", request.scheduledId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledTasks"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduledTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of basic information about all inspection configurations under a specified user UID.</p>
     * 
     * @param request ListScheduledTasksRequest
     * @return ListScheduledTasksResponse
     */
    public ListScheduledTasksResponse listScheduledTasks(ListScheduledTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScheduledTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the custom skills of the current user and all system-preset skills.</p>
     * 
     * @param request ListSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillResponse
     */
    public ListSkillResponse listSkillWithOptions(ListSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("Scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkill"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the custom skills of the current user and all system-preset skills.</p>
     * 
     * @param request ListSkillRequest
     * @return ListSkillResponse
     */
    public ListSkillResponse listSkill(ListSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSkillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the modules of an RDS AI application instance.</p>
     * 
     * @param tmpReq ModifyAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppInstanceResponse
     */
    public ModifyAppInstanceResponse modifyAppInstanceWithOptions(ModifyAppInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppInstanceShrinkRequest request = new ModifyAppInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.components)) {
            request.componentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.components, "Components", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentsShrink)) {
            query.put("Components", request.componentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceName)) {
            query.put("DBInstanceName", request.DBInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceClass)) {
            query.put("InstanceClass", request.instanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppInstance"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the modules of an RDS AI application instance.</p>
     * 
     * @param request ModifyAppInstanceRequest
     * @return ModifyAppInstanceResponse
     */
    public ModifyAppInstanceResponse modifyAppInstance(ModifyAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the authentication configuration of an RDS AI application instance.</p>
     * 
     * @param tmpReq ModifyInstanceAuthConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceAuthConfigResponse
     */
    public ModifyInstanceAuthConfigResponse modifyInstanceAuthConfigWithOptions(ModifyInstanceAuthConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyInstanceAuthConfigShrinkRequest request = new ModifyInstanceAuthConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configList)) {
            request.configListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configList, "ConfigList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configListShrink)) {
            query.put("ConfigList", request.configListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAuthConfig"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAuthConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the authentication configuration of an RDS AI application instance.</p>
     * 
     * @param request ModifyInstanceAuthConfigRequest
     * @return ModifyInstanceAuthConfigResponse
     */
    public ModifyInstanceAuthConfigResponse modifyInstanceAuthConfig(ModifyInstanceAuthConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAuthConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the general configurations of an instance, such as network EIP and NAT configurations.</p>
     * 
     * @param request ModifyInstanceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceConfigResponse
     */
    public ModifyInstanceConfigResponse modifyInstanceConfigWithOptions(ModifyInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("ConfigName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configValue)) {
            query.put("ConfigValue", request.configValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceConfig"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the general configurations of an instance, such as network EIP and NAT configurations.</p>
     * 
     * @param request ModifyInstanceConfigRequest
     * @return ModifyInstanceConfigResponse
     */
    public ModifyInstanceConfigResponse modifyInstanceConfig(ModifyInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP whitelist of an RDS AI application instance.</p>
     * 
     * @param request ModifyInstanceIpWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceIpWhitelistResponse
     */
    public ModifyInstanceIpWhitelistResponse modifyInstanceIpWhitelistWithOptions(ModifyInstanceIpWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelist)) {
            query.put("IpWhitelist", request.ipWhitelist);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("ModifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceIpWhitelist"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceIpWhitelistResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Supported engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP whitelist of an RDS AI application instance.</p>
     * 
     * @param request ModifyInstanceIpWhitelistRequest
     * @return ModifyInstanceIpWhitelistResponse
     */
    public ModifyInstanceIpWhitelistResponse modifyInstanceIpWhitelist(ModifyInstanceIpWhitelistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceIpWhitelistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the RAG Agent configuration of an RDS AI application instance.</p>
     * 
     * @param tmpReq ModifyInstanceRAGConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceRAGConfigResponse
     */
    public ModifyInstanceRAGConfigResponse modifyInstanceRAGConfigWithOptions(ModifyInstanceRAGConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyInstanceRAGConfigShrinkRequest request = new ModifyInstanceRAGConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configList)) {
            request.configListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configList, "ConfigList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configListShrink)) {
            query.put("ConfigList", request.configListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceRAGConfig"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceRAGConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the RAG Agent configuration of an RDS AI application instance.</p>
     * 
     * @param request ModifyInstanceRAGConfigRequest
     * @return ModifyInstanceRAGConfigResponse
     */
    public ModifyInstanceRAGConfigResponse modifyInstanceRAGConfig(ModifyInstanceRAGConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceRAGConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the SSL configuration of an RDS AI application instance.</p>
     * 
     * @param request ModifyInstanceSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceSSLResponse
     */
    public ModifyInstanceSSLResponse modifyInstanceSSLWithOptions(ModifyInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.CAType)) {
            query.put("CAType", request.CAType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLEnabled)) {
            query.put("SSLEnabled", request.SSLEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCert)) {
            query.put("ServerCert", request.serverCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverKey)) {
            query.put("ServerKey", request.serverKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceSSL"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceSSLResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the SSL configuration of an RDS AI application instance.</p>
     * 
     * @param request ModifyInstanceSSLRequest
     * @return ModifyInstanceSSLResponse
     */
    public ModifyInstanceSSLResponse modifyInstanceSSL(ModifyInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceSSLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>Currently, only Object Storage Service (OSS) is supported.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the storage configuration of an RDS AI application instance.</p>
     * 
     * @param tmpReq ModifyInstanceStorageConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceStorageConfigResponse
     */
    public ModifyInstanceStorageConfigResponse modifyInstanceStorageConfigWithOptions(ModifyInstanceStorageConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyInstanceStorageConfigShrinkRequest request = new ModifyInstanceStorageConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configList)) {
            request.configListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configList, "ConfigList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configListShrink)) {
            query.put("ConfigList", request.configListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceStorageConfig"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceStorageConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>Currently, only Object Storage Service (OSS) is supported.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the storage configuration of an RDS AI application instance.</p>
     * 
     * @param request ModifyInstanceStorageConfigRequest
     * @return ModifyInstanceStorageConfigResponse
     */
    public ModifyInstanceStorageConfigResponse modifyInstanceStorageConfig(ModifyInstanceStorageConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceStorageConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Batch modifies the SSL configurations of RDS AI application instances.</p>
     * 
     * @param tmpReq ModifyInstancesSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstancesSSLResponse
     */
    public ModifyInstancesSSLResponse modifyInstancesSSLWithOptions(ModifyInstancesSSLRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyInstancesSSLShrinkRequest request = new ModifyInstancesSSLShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceNames)) {
            request.instanceNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceNames, "InstanceNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.CAType)) {
            query.put("CAType", request.CAType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceNamesShrink)) {
            query.put("InstanceNames", request.instanceNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLEnabled)) {
            query.put("SSLEnabled", request.SSLEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCert)) {
            query.put("ServerCert", request.serverCert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverKey)) {
            query.put("ServerKey", request.serverKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstancesSSL"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstancesSSLResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Batch modifies the SSL configurations of RDS AI application instances.</p>
     * 
     * @param request ModifyInstancesSSLRequest
     * @return ModifyInstancesSSLResponse
     */
    public ModifyInstancesSSLResponse modifyInstancesSSL(ModifyInstancesSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstancesSSLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies message feedback.</p>
     * 
     * @param request ModifyMessagesFeedbacksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMessagesFeedbacksResponse
     */
    public ModifyMessagesFeedbacksResponse modifyMessagesFeedbacksWithOptions(ModifyMessagesFeedbacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rating)) {
            query.put("Rating", request.rating);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMessagesFeedbacks"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMessagesFeedbacksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies message feedback.</p>
     * 
     * @param request ModifyMessagesFeedbacksRequest
     * @return ModifyMessagesFeedbacksResponse
     */
    public ModifyMessagesFeedbacksResponse modifyMessagesFeedbacks(ModifyMessagesFeedbacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMessagesFeedbacksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a sandbox template.</p>
     * 
     * @param tmpReq ModifySandboxTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySandboxTemplateResponse
     */
    public ModifySandboxTemplateResponse modifySandboxTemplateWithOptions(ModifySandboxTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifySandboxTemplateShrinkRequest request = new ModifySandboxTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultCpu)) {
            query.put("DefaultCpu", request.defaultCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultMemory)) {
            query.put("DefaultMemory", request.defaultMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            query.put("Image", request.image);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySandboxTemplate"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySandboxTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS Supabase</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a sandbox template.</p>
     * 
     * @param request ModifySandboxTemplateRequest
     * @return ModifySandboxTemplateResponse
     */
    public ModifySandboxTemplateResponse modifySandboxTemplate(ModifySandboxTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySandboxTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an existing inspection configuration.</p>
     * 
     * @param request ModifyScheduledTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyScheduledTaskResponse
     */
    public ModifyScheduledTaskResponse modifyScheduledTaskWithOptions(ModifyScheduledTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequency)) {
            query.put("Frequency", request.frequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inspectionItems)) {
            query.put("InspectionItems", request.inspectionItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportLanguage)) {
            query.put("ReportLanguage", request.reportLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduledId)) {
            query.put("ScheduledId", request.scheduledId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeRange)) {
            query.put("TimeRange", request.timeRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyScheduledTask"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyScheduledTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an existing inspection configuration.</p>
     * 
     * @param request ModifyScheduledTaskRequest
     * @return ModifyScheduledTaskResponse
     */
    public ModifyScheduledTaskResponse modifyScheduledTask(ModifyScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyScheduledTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP whitelist of an RDS AI Assistant Ultimate Edition instance.</p>
     * 
     * @param request ModifyWhitelistIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWhitelistIpsResponse
     */
    public ModifyWhitelistIpsResponse modifyWhitelistIpsWithOptions(ModifyWhitelistIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhitelist)) {
            query.put("IpWhitelist", request.ipWhitelist);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWhitelistIps"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWhitelistIpsResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP whitelist of an RDS AI Assistant Ultimate Edition instance.</p>
     * 
     * @param request ModifyWhitelistIpsRequest
     * @return ModifyWhitelistIpsResponse
     */
    public ModifyWhitelistIpsResponse modifyWhitelistIps(ModifyWhitelistIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWhitelistIpsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes an exclusion item for a job.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an exclusion item for an import job.</p>
     * 
     * @param request RemoveContextDatabaseSyncJobExclusionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveContextDatabaseSyncJobExclusionResponse
     */
    public RemoveContextDatabaseSyncJobExclusionResponse removeContextDatabaseSyncJobExclusionWithOptions(RemoveContextDatabaseSyncJobExclusionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentId)) {
            query.put("DocumentId", request.documentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveContextDatabaseSyncJobExclusion"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveContextDatabaseSyncJobExclusionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes an exclusion item for a job.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an exclusion item for an import job.</p>
     * 
     * @param request RemoveContextDatabaseSyncJobExclusionRequest
     * @return RemoveContextDatabaseSyncJobExclusionResponse
     */
    public RemoveContextDatabaseSyncJobExclusionResponse removeContextDatabaseSyncJobExclusion(RemoveContextDatabaseSyncJobExclusionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeContextDatabaseSyncJobExclusionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Renames a custom API key.</p>
     * 
     * @param request RenameApiKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameApiKeyResponse
     */
    public RenameApiKeyResponse renameApiKeyWithOptions(RenameApiKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyName)) {
            query.put("KeyName", request.keyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            query.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameApiKey"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Renames a custom API key.</p>
     * 
     * @param request RenameApiKeyRequest
     * @return RenameApiKeyResponse
     */
    public RenameApiKeyResponse renameApiKey(RenameApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameApiKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Resets the API key.</p>
     * 
     * @param request ResetApiKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetApiKeyResponse
     */
    public ResetApiKeyResponse resetApiKeyWithOptions(ResetApiKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apiKey)) {
            query.put("ApiKey", request.apiKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetApiKey"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Resets the API key.</p>
     * 
     * @param request ResetApiKeyRequest
     * @return ResetApiKeyResponse
     */
    public ResetApiKeyResponse resetApiKey(ResetApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetApiKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Resets the keys of an RDS AI instance, including AnonKey, ServiceKey, and JwtSecret. After the reset, the old keys and secret become invalid immediately. Ensure that your applications are updated accordingly.</p>
     * 
     * @param request ResetInstanceKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetInstanceKeysResponse
     */
    public ResetInstanceKeysResponse resetInstanceKeysWithOptions(ResetInstanceKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetInstanceKeys"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetInstanceKeysResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Resets the keys of an RDS AI instance, including AnonKey, ServiceKey, and JwtSecret. After the reset, the old keys and secret become invalid immediately. Ensure that your applications are updated accordingly.</p>
     * 
     * @param request ResetInstanceKeysRequest
     * @return ResetInstanceKeysResponse
     */
    public ResetInstanceKeysResponse resetInstanceKeys(ResetInstanceKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetInstanceKeysWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>Currently, only the password of the RDS Supabase Dashboard user can be modified.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets the logon password and database access password of an RDS AI application instance.</p>
     * 
     * @param request ResetInstancePasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetInstancePasswordResponse
     */
    public ResetInstancePasswordResponse resetInstancePasswordWithOptions(ResetInstancePasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dashboardPassword)) {
            query.put("DashboardPassword", request.dashboardPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePassword)) {
            query.put("DatabasePassword", request.databasePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetInstancePassword"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetInstancePasswordResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>Currently, only the password of the RDS Supabase Dashboard user can be modified.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets the logon password and database access password of an RDS AI application instance.</p>
     * 
     * @param request ResetInstancePasswordRequest
     * @return ResetInstancePasswordResponse
     */
    public ResetInstancePasswordResponse resetInstancePassword(ResetInstancePasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetInstancePasswordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Restarts an ApsaraDB RDS AI application instance that is in the Running state.</p>
     * 
     * @param request RestartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartInstance"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Restarts an ApsaraDB RDS AI application instance that is in the Running state.</p>
     * 
     * @param request RestartInstanceRequest
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。 重试会基于失败项生成新的 Run，原 Run 状态保持不变。</p>
     * 
     * <b>summary</b> : 
     * <p>基于快照重试失败明细</p>
     * 
     * @param request RetryFailedContextDatabaseSyncRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryFailedContextDatabaseSyncRunResponse
     */
    public RetryFailedContextDatabaseSyncRunResponse retryFailedContextDatabaseSyncRunWithOptions(RetryFailedContextDatabaseSyncRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            query.put("RunId", request.runId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryFailedContextDatabaseSyncRun"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryFailedContextDatabaseSyncRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。 重试会基于失败项生成新的 Run，原 Run 状态保持不变。</p>
     * 
     * <b>summary</b> : 
     * <p>基于快照重试失败明细</p>
     * 
     * @param request RetryFailedContextDatabaseSyncRunRequest
     * @return RetryFailedContextDatabaseSyncRunResponse
     */
    public RetryFailedContextDatabaseSyncRunResponse retryFailedContextDatabaseSyncRun(RetryFailedContextDatabaseSyncRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryFailedContextDatabaseSyncRunWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Revokes an API key.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes an API key for a context database.</p>
     * 
     * @param request RevokeContextDatabaseApiKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeContextDatabaseApiKeyResponse
     */
    public RevokeContextDatabaseApiKeyResponse revokeContextDatabaseApiKeyWithOptions(RevokeContextDatabaseApiKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeContextDatabaseApiKey"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeContextDatabaseApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Revokes an API key.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes an API key for a context database.</p>
     * 
     * @param request RevokeContextDatabaseApiKeyRequest
     * @return RevokeContextDatabaseApiKeyResponse
     */
    public RevokeContextDatabaseApiKeyResponse revokeContextDatabaseApiKey(RevokeContextDatabaseApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeContextDatabaseApiKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no ClientToken is provided, the backend generates one automatically.</p>
     * 
     * <b>summary</b> : 
     * <p>Manually triggers a run.</p>
     * 
     * @param request StartContextDatabaseSyncRunRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartContextDatabaseSyncRunResponse
     */
    public StartContextDatabaseSyncRunResponse startContextDatabaseSyncRunWithOptions(StartContextDatabaseSyncRunRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartContextDatabaseSyncRun"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartContextDatabaseSyncRunResponse());
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no ClientToken is provided, the backend generates one automatically.</p>
     * 
     * <b>summary</b> : 
     * <p>Manually triggers a run.</p>
     * 
     * @param request StartContextDatabaseSyncRunRequest
     * @return StartContextDatabaseSyncRunResponse
     */
    public StartContextDatabaseSyncRunResponse startContextDatabaseSyncRun(StartContextDatabaseSyncRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startContextDatabaseSyncRunWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no ClientToken is provided, the backend generates one automatically. Discovery is an asynchronous operation. The operation returns a discovery task identifier. Poll for results to retrieve SelectedNodeKeys.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates a snapshot discovery task for data selection scope configuration.</p>
     * 
     * @param request StartContextDatabaseSyncSourceDiscoveryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartContextDatabaseSyncSourceDiscoveryResponse
     */
    public StartContextDatabaseSyncSourceDiscoveryResponse startContextDatabaseSyncSourceDiscoveryWithOptions(StartContextDatabaseSyncSourceDiscoveryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartContextDatabaseSyncSourceDiscovery"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartContextDatabaseSyncSourceDiscoveryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence by passing a ClientToken. If no ClientToken is provided, the backend generates one automatically. Discovery is an asynchronous operation. The operation returns a discovery task identifier. Poll for results to retrieve SelectedNodeKeys.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiates a snapshot discovery task for data selection scope configuration.</p>
     * 
     * @param request StartContextDatabaseSyncSourceDiscoveryRequest
     * @return StartContextDatabaseSyncSourceDiscoveryResponse
     */
    public StartContextDatabaseSyncSourceDiscoveryResponse startContextDatabaseSyncSourceDiscovery(StartContextDatabaseSyncSourceDiscoveryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startContextDatabaseSyncSourceDiscoveryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Starts an RDS AI application instance that is in the Stopped state.</p>
     * 
     * @param request StartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Starts an RDS AI application instance that is in the Stopped state.</p>
     * 
     * @param request StartInstanceRequest
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Pauses an RDS AI application instance that is in the Running state.</p>
     * 
     * @param request StopInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.branchName)) {
            query.put("BranchName", request.branchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            query.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Pauses an RDS AI application instance that is in the Running state.</p>
     * 
     * @param request StopInstanceRequest
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the quota of an API key.</p>
     * 
     * @param tmpReq UpdateApiKeyQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApiKeyQuotaResponse
     */
    public UpdateApiKeyQuotaResponse updateApiKeyQuotaWithOptions(UpdateApiKeyQuotaRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateApiKeyQuotaShrinkRequest request = new UpdateApiKeyQuotaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            query.put("Keys", request.keysShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApiKeyQuota"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApiKeyQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the quota of an API key.</p>
     * 
     * @param request UpdateApiKeyQuotaRequest
     * @return UpdateApiKeyQuotaResponse
     */
    public UpdateApiKeyQuotaResponse updateApiKeyQuota(UpdateApiKeyQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApiKeyQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the display metadata of an API key. At least one of Name or Description must be specified. The plaintext key is not reissued.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the API key of a context database.</p>
     * 
     * @param request UpdateContextDatabaseApiKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContextDatabaseApiKeyResponse
     */
    public UpdateContextDatabaseApiKeyResponse updateContextDatabaseApiKeyWithOptions(UpdateContextDatabaseApiKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyId)) {
            query.put("KeyId", request.keyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContextDatabaseApiKey"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContextDatabaseApiKeyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the display metadata of an API key. At least one of Name or Description must be specified. The plaintext key is not reissued.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the API key of a context database.</p>
     * 
     * @param request UpdateContextDatabaseApiKeyRequest
     * @return UpdateContextDatabaseApiKeyResponse
     */
    public UpdateContextDatabaseApiKeyResponse updateContextDatabaseApiKey(UpdateContextDatabaseApiKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContextDatabaseApiKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the role or status of a member.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a context database member.</p>
     * 
     * @param request UpdateContextDatabaseMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContextDatabaseMemberResponse
     */
    public UpdateContextDatabaseMemberResponse updateContextDatabaseMemberWithOptions(UpdateContextDatabaseMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            query.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContextDatabaseMember"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContextDatabaseMemberResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the role or status of a member.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a context database member.</p>
     * 
     * @param request UpdateContextDatabaseMemberRequest
     * @return UpdateContextDatabaseMemberResponse
     */
    public UpdateContextDatabaseMemberResponse updateContextDatabaseMember(UpdateContextDatabaseMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContextDatabaseMemberWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * <b>summary</b> : 
     * <p>更新连接元数据</p>
     * 
     * @param request UpdateContextDatabaseSyncConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContextDatabaseSyncConnectionResponse
     */
    public UpdateContextDatabaseSyncConnectionResponse updateContextDatabaseSyncConnectionWithOptions(UpdateContextDatabaseSyncConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContextDatabaseSyncConnection"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContextDatabaseSyncConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * <b>summary</b> : 
     * <p>更新连接元数据</p>
     * 
     * @param request UpdateContextDatabaseSyncConnectionRequest
     * @return UpdateContextDatabaseSyncConnectionResponse
     */
    public UpdateContextDatabaseSyncConnectionResponse updateContextDatabaseSyncConnection(UpdateContextDatabaseSyncConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContextDatabaseSyncConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * <b>summary</b> : 
     * <p>单独轮换连接凭据</p>
     * 
     * @param tmpReq UpdateContextDatabaseSyncConnectionCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContextDatabaseSyncConnectionCredentialResponse
     */
    public UpdateContextDatabaseSyncConnectionCredentialResponse updateContextDatabaseSyncConnectionCredentialWithOptions(UpdateContextDatabaseSyncConnectionCredentialRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateContextDatabaseSyncConnectionCredentialShrinkRequest request = new UpdateContextDatabaseSyncConnectionCredentialShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.credentials)) {
            request.credentialsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.credentials, "Credentials", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialsShrink)) {
            query.put("Credentials", request.credentialsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContextDatabaseSyncConnectionCredential"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContextDatabaseSyncConnectionCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * <b>summary</b> : 
     * <p>单独轮换连接凭据</p>
     * 
     * @param request UpdateContextDatabaseSyncConnectionCredentialRequest
     * @return UpdateContextDatabaseSyncConnectionCredentialResponse
     */
    public UpdateContextDatabaseSyncConnectionCredentialResponse updateContextDatabaseSyncConnectionCredential(UpdateContextDatabaseSyncConnectionCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContextDatabaseSyncConnectionCredentialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。 Target 为隐含概念，调用方只需传入 KnowledgeBaseId，后端自动创建/匹配 Target。</p>
     * 
     * <b>summary</b> : 
     * <p>更新 Job 元数据</p>
     * 
     * @param tmpReq UpdateContextDatabaseSyncJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContextDatabaseSyncJobResponse
     */
    public UpdateContextDatabaseSyncJobResponse updateContextDatabaseSyncJobWithOptions(UpdateContextDatabaseSyncJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateContextDatabaseSyncJobShrinkRequest request = new UpdateContextDatabaseSyncJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filters)) {
            request.filtersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filters, "Filters", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filtersShrink)) {
            query.put("Filters", request.filtersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetKnowledgeBaseId)) {
            query.put("TargetKnowledgeBaseId", request.targetKnowledgeBaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetKnowledgeBaseName)) {
            query.put("TargetKnowledgeBaseName", request.targetKnowledgeBaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContextDatabaseSyncJob"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContextDatabaseSyncJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。 Target 为隐含概念，调用方只需传入 KnowledgeBaseId，后端自动创建/匹配 Target。</p>
     * 
     * <b>summary</b> : 
     * <p>更新 Job 元数据</p>
     * 
     * @param request UpdateContextDatabaseSyncJobRequest
     * @return UpdateContextDatabaseSyncJobResponse
     */
    public UpdateContextDatabaseSyncJobResponse updateContextDatabaseSyncJob(UpdateContextDatabaseSyncJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContextDatabaseSyncJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * <b>summary</b> : 
     * <p>更新 Job 调度配置</p>
     * 
     * @param tmpReq UpdateContextDatabaseSyncJobScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContextDatabaseSyncJobScheduleResponse
     */
    public UpdateContextDatabaseSyncJobScheduleResponse updateContextDatabaseSyncJobScheduleWithOptions(UpdateContextDatabaseSyncJobScheduleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateContextDatabaseSyncJobScheduleShrinkRequest request = new UpdateContextDatabaseSyncJobScheduleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dailyTimes)) {
            request.dailyTimesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dailyTimes, "DailyTimes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dailyTimesShrink)) {
            query.put("DailyTimes", request.dailyTimesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intervalMinutes)) {
            query.put("IntervalMinutes", request.intervalMinutes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.missedPolicy)) {
            query.put("MissedPolicy", request.missedPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContextDatabaseSyncJobSchedule"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContextDatabaseSyncJobScheduleResponse());
    }

    /**
     * <b>description</b> :
     * <p>写操作可传入 ClientToken 实现幂等；未传时由后端自动生成。</p>
     * 
     * <b>summary</b> : 
     * <p>更新 Job 调度配置</p>
     * 
     * @param request UpdateContextDatabaseSyncJobScheduleRequest
     * @return UpdateContextDatabaseSyncJobScheduleResponse
     */
    public UpdateContextDatabaseSyncJobScheduleResponse updateContextDatabaseSyncJobSchedule(UpdateContextDatabaseSyncJobScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContextDatabaseSyncJobScheduleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence via ClientToken. If ClientToken is not provided, the backend generates one automatically.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the metadata of a data selection scope.</p>
     * 
     * @param tmpReq UpdateContextDatabaseSyncSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContextDatabaseSyncSourceResponse
     */
    public UpdateContextDatabaseSyncSourceResponse updateContextDatabaseSyncSourceWithOptions(UpdateContextDatabaseSyncSourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateContextDatabaseSyncSourceShrinkRequest request = new UpdateContextDatabaseSyncSourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceConfig)) {
            request.sourceConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceConfig, "SourceConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceConfigShrink)) {
            query.put("SourceConfig", request.sourceConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContextDatabaseSyncSource"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContextDatabaseSyncSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Write operations support idempotence via ClientToken. If ClientToken is not provided, the backend generates one automatically.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the metadata of a data selection scope.</p>
     * 
     * @param request UpdateContextDatabaseSyncSourceRequest
     * @return UpdateContextDatabaseSyncSourceResponse
     */
    public UpdateContextDatabaseSyncSourceResponse updateContextDatabaseSyncSource(UpdateContextDatabaseSyncSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContextDatabaseSyncSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For write operations, you can pass the ClientToken parameter to ensure idempotency. If this parameter is not provided, the backend automatically generates one.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the explicit node selection for the data selection scope.</p>
     * 
     * @param tmpReq UpdateContextDatabaseSyncSourceSelectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContextDatabaseSyncSourceSelectionResponse
     */
    public UpdateContextDatabaseSyncSourceSelectionResponse updateContextDatabaseSyncSourceSelectionWithOptions(UpdateContextDatabaseSyncSourceSelectionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateContextDatabaseSyncSourceSelectionShrinkRequest request = new UpdateContextDatabaseSyncSourceSelectionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.selectedNodeKeys)) {
            request.selectedNodeKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.selectedNodeKeys, "SelectedNodeKeys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedNodeKeysShrink)) {
            query.put("SelectedNodeKeys", request.selectedNodeKeysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectionPolicy)) {
            query.put("SelectionPolicy", request.selectionPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            query.put("SourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContextDatabaseSyncSourceSelection"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContextDatabaseSyncSourceSelectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>For write operations, you can pass the ClientToken parameter to ensure idempotency. If this parameter is not provided, the backend automatically generates one.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the explicit node selection for the data selection scope.</p>
     * 
     * @param request UpdateContextDatabaseSyncSourceSelectionRequest
     * @return UpdateContextDatabaseSyncSourceSelectionResponse
     */
    public UpdateContextDatabaseSyncSourceSelectionResponse updateContextDatabaseSyncSourceSelection(UpdateContextDatabaseSyncSourceSelectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContextDatabaseSyncSourceSelectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Modifies the name of a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a ContextDB workspace.</p>
     * 
     * @param request UpdateContextDatabaseWorkspaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateContextDatabaseWorkspaceResponse
     */
    public UpdateContextDatabaseWorkspaceResponse updateContextDatabaseWorkspaceWithOptions(UpdateContextDatabaseWorkspaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceName)) {
            query.put("WorkspaceName", request.workspaceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateContextDatabaseWorkspace"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateContextDatabaseWorkspaceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modifies the name of a workspace.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a ContextDB workspace.</p>
     * 
     * @param request UpdateContextDatabaseWorkspaceRequest
     * @return UpdateContextDatabaseWorkspaceResponse
     */
    public UpdateContextDatabaseWorkspaceResponse updateContextDatabaseWorkspace(UpdateContextDatabaseWorkspaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateContextDatabaseWorkspaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a Custom Agent.</p>
     * 
     * @param tmpReq UpdateCustomAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomAgentResponse
     */
    public UpdateCustomAgentResponse updateCustomAgentWithOptions(UpdateCustomAgentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCustomAgentShrinkRequest request = new UpdateCustomAgentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.skillIds)) {
            request.skillIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.skillIds, "SkillIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tools)) {
            request.toolsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tools, "Tools", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customAgentId)) {
            query.put("CustomAgentId", request.customAgentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableTools)) {
            query.put("EnableTools", request.enableTools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillIdsShrink)) {
            query.put("SkillIds", request.skillIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemPrompt)) {
            query.put("SystemPrompt", request.systemPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolsShrink)) {
            query.put("Tools", request.toolsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomAgent"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a Custom Agent.</p>
     * 
     * @param request UpdateCustomAgentRequest
     * @return UpdateCustomAgentResponse
     */
    public UpdateCustomAgentResponse updateCustomAgent(UpdateCustomAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomAgentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Updates the alert threshold percentage for an API key.</p>
     * 
     * @param tmpReq UpdateMOQuotaAlertThresholdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMOQuotaAlertThresholdResponse
     */
    public UpdateMOQuotaAlertThresholdResponse updateMOQuotaAlertThresholdWithOptions(UpdateMOQuotaAlertThresholdRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMOQuotaAlertThresholdShrinkRequest request = new UpdateMOQuotaAlertThresholdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.apikey)) {
            request.apikeyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.apikey, "Apikey", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apikeyShrink)) {
            query.put("Apikey", request.apikeyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMOQuotaAlertThreshold"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMOQuotaAlertThresholdResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Applicable engine</h3>
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Updates the alert threshold percentage for an API key.</p>
     * 
     * @param request UpdateMOQuotaAlertThresholdRequest
     * @return UpdateMOQuotaAlertThresholdResponse
     */
    public UpdateMOQuotaAlertThresholdResponse updateMOQuotaAlertThreshold(UpdateMOQuotaAlertThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMOQuotaAlertThresholdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a specified Skill.</p>
     * 
     * @param tmpReq UpdateSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSkillResponse
     */
    public UpdateSkillResponse updateSkillWithOptions(UpdateSkillRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSkillShrinkRequest request = new UpdateSkillShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.content)) {
            request.contentShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.content, "Content", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dbtypes)) {
            request.dbtypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dbtypes, "Dbtypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentShrink)) {
            query.put("Content", request.contentShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbtypesShrink)) {
            query.put("Dbtypes", request.dbtypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillId)) {
            query.put("SkillId", request.skillId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateNote)) {
            query.put("UpdateNote", request.updateNote);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadId)) {
            query.put("UploadId", request.uploadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadToken)) {
            query.put("UploadToken", request.uploadToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSkill"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a specified Skill.</p>
     * 
     * @param request UpdateSkillRequest
     * @return UpdateSkillResponse
     */
    public UpdateSkillResponse updateSkill(UpdateSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Validates the connection credentials and authorization.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates datasource credentials and authorization.</p>
     * 
     * @param request VerifyContextDatabaseSyncConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyContextDatabaseSyncConnectionResponse
     */
    public VerifyContextDatabaseSyncConnectionResponse verifyContextDatabaseSyncConnectionWithOptions(VerifyContextDatabaseSyncConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionId)) {
            query.put("ConnectionId", request.connectionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyContextDatabaseSyncConnection"),
            new TeaPair("version", "2025-05-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyContextDatabaseSyncConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Validates the connection credentials and authorization.</p>
     * 
     * <b>summary</b> : 
     * <p>Validates datasource credentials and authorization.</p>
     * 
     * @param request VerifyContextDatabaseSyncConnectionRequest
     * @return VerifyContextDatabaseSyncConnectionResponse
     */
    public VerifyContextDatabaseSyncConnectionResponse verifyContextDatabaseSyncConnection(VerifyContextDatabaseSyncConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyContextDatabaseSyncConnectionWithOptions(request, runtime);
    }
}
