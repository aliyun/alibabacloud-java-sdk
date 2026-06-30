// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507;

import com.aliyun.tea.*;
import com.aliyun.rdsai20250507.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("us-west-1", "rdsai.us-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "rdsai.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "rdsai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "rdsai.aliyuncs.com"),
            new TeaPair("cn-shanghai", "rdsai.aliyuncs.com"),
            new TeaPair("cn-hongkong", "rdsai.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "rdsai.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "rdsai.aliyuncs.com"),
            new TeaPair("cn-chengdu", "rdsai.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-beijing", "rdsai.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "rdsai.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "rdsai.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "rdsai.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "rdsai.ap-northeast-1.aliyuncs.com")
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
     * <b>summary</b> : 
     * <p>Sends chat messages.</p>
     * 
     * @param tmpReq ChatMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChatMessagesResponse
     */
    public ChatMessagesResponse chatMessagesWithOptions(ChatMessagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ChatMessagesShrinkRequest request = new ChatMessagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
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
     * <p>Sends chat messages.</p>
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
     * <h3>Supported engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Create a custom API key.</p>
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
     * <h3>Supported engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Create a custom API key.</p>
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
     * <h3>Supported Engine</h3>
     * <p>RDS PostgreSQL  </p>
     * <h3>Related Function Documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation involves a Fee. Carefully read the related Function Documentation before performing this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an RDS Supabase instance.</p>
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
     * <h3>Supported Engine</h3>
     * <p>RDS PostgreSQL  </p>
     * <h3>Related Function Documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation involves a Fee. Carefully read the related Function Documentation before performing this operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates an RDS Supabase instance.</p>
     * 
     * @param request CreateAppInstanceRequest
     * @return CreateAppInstanceResponse
     */
    public CreateAppInstanceResponse createAppInstance(CreateAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppInstanceWithOptions(request, runtime);
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
     * <p>Creates an inspection task for one or more instances.</p>
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
     * <p>Creates an inspection task for one or more instances.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS Supabase</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>创建沙箱模板</p>
     * 
     * @param request CreateSandboxTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSandboxTemplateResponse
     */
    public CreateSandboxTemplateResponse createSandboxTemplateWithOptions(CreateSandboxTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.replicas)) {
            query.put("Replicas", request.replicas);
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
     * <h3>适用引擎</h3>
     * <p>RDS Supabase</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>创建沙箱模板</p>
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
     * <h3>Supported engines</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation may incur charges. Please read the related feature documentation carefully before you proceed.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a scheduled inspection task for one or more instances.</p>
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
     * <h3>Supported engines</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related feature documentation</h3>
     * <blockquote>
     * <p>Warning: This API operation may incur charges. Please read the related feature documentation carefully before you proceed.
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a scheduled inspection task for one or more instances.</p>
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
     * <p>Create a user-defined skill.</p>
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
     * <p>Create a user-defined skill.</p>
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
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Enterprise Edition</a></p>
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
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Enterprise Edition</a></p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <blockquote>
     * <p>Warning: 该API操作涉及费用，请仔细阅读相关功能文档后再进行操作。
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>
     * Notice: 删除RDS Supabase项目并不会自动删除在创建该项目时所生成的RDS PostgreSQL实例及开通的NAT网关，您需要<a href="https://help.aliyun.com/document_detail/96749.html">手动释放该实例</a>，并删除<a href="https://help.aliyun.com/document_detail/121139.html">公网NAT网关</a>和<a href="https://help.aliyun.com/document_detail/121527.html">EIP</a>。</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes an RDS Supabase instance.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <blockquote>
     * <p>Warning: 该API操作涉及费用，请仔细阅读相关功能文档后再进行操作。
     * <a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a>
     * Notice: 删除RDS Supabase项目并不会自动删除在创建该项目时所生成的RDS PostgreSQL实例及开通的NAT网关，您需要<a href="https://help.aliyun.com/document_detail/96749.html">手动释放该实例</a>，并删除<a href="https://help.aliyun.com/document_detail/121139.html">公网NAT网关</a>和<a href="https://help.aliyun.com/document_detail/121527.html">EIP</a>。</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes an RDS Supabase instance.</p>
     * 
     * @param request DeleteAppInstanceRequest
     * @return DeleteAppInstanceResponse
     */
    public DeleteAppInstanceResponse deleteAppInstance(DeleteAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the dedicated agent created by a user.</p>
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
     * <p>Deletes the dedicated agent created by a user.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS Supabase</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>删除沙箱模板</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS Supabase</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>删除沙箱模板</p>
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
     * <p>Deletes the specified skill.</p>
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
     * <p>Deletes the specified skill.</p>
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
     * <h3>Supported engines</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>This API retrieves a list of RDS AI application instances.</p>
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
     * <h3>Supported engines</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related documentation</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>This API retrieves a list of RDS AI application instances.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS Supabase</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>查询已支持的沙箱模板列表</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS Supabase</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>查询已支持的沙箱模板列表</p>
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
     * <p>This API retrieves the list of events.</p>
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
     * <p>This API retrieves the list of events.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the endpoint of an RDS Supabase instance.</p>
     * 
     * @param request DescribeInstanceEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceEndpointsResponse
     */
    public DescribeInstanceEndpointsResponse describeInstanceEndpointsWithOptions(DescribeInstanceEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the endpoint of an RDS Supabase instance.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP address whitelists of an RDS Supabase instance.</p>
     * 
     * @param request DescribeInstanceIpWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceIpWhitelistResponse
     */
    public DescribeInstanceIpWhitelistResponse describeInstanceIpWhitelistWithOptions(DescribeInstanceIpWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP address whitelists of an RDS Supabase instance.</p>
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
     * <p>Queries the RAG agent configurations of an RDS Supabase instance.</p>
     * 
     * @param request DescribeInstanceRAGConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceRAGConfigResponse
     */
    public DescribeInstanceRAGConfigResponse describeInstanceRAGConfigWithOptions(DescribeInstanceRAGConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <p>Queries the RAG agent configurations of an RDS Supabase instance.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the SSL settings of an RDS Supabase instance.</p>
     * 
     * @param request DescribeInstanceSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSSLResponse
     */
    public DescribeInstanceSSLResponse describeInstanceSSLWithOptions(DescribeInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the SSL settings of an RDS Supabase instance.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>当前仅支持对象存储OSS。</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage configurations of an RDS Supabase instance.</p>
     * 
     * @param request DescribeInstanceStorageConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceStorageConfigResponse
     */
    public DescribeInstanceStorageConfigResponse describeInstanceStorageConfigWithOptions(DescribeInstanceStorageConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>当前仅支持对象存储OSS。</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage configurations of an RDS Supabase instance.</p>
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
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a>.</p>
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
     * <p><a href="https://www.alibabacloud.com/help/en/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a>.</p>
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
     * <h3>Supported engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Enterprise Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>View basic information and usage for the RDS AI Assistant Ultimate Edition.</p>
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
     * <h3>Supported engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Enterprise Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>View basic information and usage for the RDS AI Assistant Ultimate Edition.</p>
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
     * <h3>Supported engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves monitoring data for an RDS AI Assistant Ultimate Edition instance.</p>
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
     * <h3>Supported engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves monitoring data for an RDS AI Assistant Ultimate Edition instance.</p>
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
     * <h3>Related documents</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Lists the sandbox templates you can use to create Supabase sandboxes.</p>
     * 
     * @param request DescribeSandboxTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSandboxTemplatesResponse
     */
    public DescribeSandboxTemplatesResponse describeSandboxTemplatesWithOptions(DescribeSandboxTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <h3>Related documents</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Lists the sandbox templates you can use to create Supabase sandboxes.</p>
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
     * <h3>Supported engine</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Enterprise Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Describes the whitelist of an RDS AI Assistant Enterprise Edition instance.</p>
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
     * <h3>Supported engine</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Enterprise Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Describes the whitelist of an RDS AI Assistant Enterprise Edition instance.</p>
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
     * <p>Disables the sandbox and edge function capabilities for a Supabase instance.</p>
     * <blockquote>
     * <p>Notice: This operation deletes all sandboxes and edge functions of the Supabase instance. Fully assess the business risks before you proceed.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables the sandbox and edge function capabilities for a Supabase instance. Note: This operation deletes all sandboxes and edge functions of the instance. Fully assess the business risks before you proceed.</p>
     * 
     * @param request DisableAgentRuntimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAgentRuntimeResponse
     */
    public DisableAgentRuntimeResponse disableAgentRuntimeWithOptions(DisableAgentRuntimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <p>Disables the sandbox and edge function capabilities for a Supabase instance.</p>
     * <blockquote>
     * <p>Notice: This operation deletes all sandboxes and edge functions of the Supabase instance. Fully assess the business risks before you proceed.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Disables the sandbox and edge function capabilities for a Supabase instance. Note: This operation deletes all sandboxes and edge functions of the instance. Fully assess the business risks before you proceed.</p>
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
     * <p>Before using this feature, you must complete <a href="https://api.aliyun.com/api/ResourceManager/2020-03-31/CreateServiceLinkedRole?spm=api-workbench.API%20Document.0.0.4ea75094rJgPzK&RegionId=cn-beijing&tab=DEBUG&params=%7B%2522ServiceName%2522:%2522supabase.rdsai.aliyuncs.com%2522%7D&sdkStyle=old">service-linked role authorization</a>. The service-linked role used is <a href="https://www.alibabacloud.com/help/en/ram/product-overview/services-that-work-with-service-linked-roles">AliyunServiceRoleForRDSAISupabase</a>.</p>
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
     * <p>Before using this feature, you must complete <a href="https://api.aliyun.com/api/ResourceManager/2020-03-31/CreateServiceLinkedRole?spm=api-workbench.API%20Document.0.0.4ea75094rJgPzK&RegionId=cn-beijing&tab=DEBUG&params=%7B%2522ServiceName%2522:%2522supabase.rdsai.aliyuncs.com%2522%7D&sdkStyle=old">service-linked role authorization</a>. The service-linked role used is <a href="https://www.alibabacloud.com/help/en/ram/product-overview/services-that-work-with-service-linked-roles">AliyunServiceRoleForRDSAISupabase</a>.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS SUPABASE</p>
     * 
     * <b>summary</b> : 
     * <p>GetAvailableLLMModels</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS SUPABASE</p>
     * 
     * <b>summary</b> : 
     * <p>GetAvailableLLMModels</p>
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
     * <p>Queries the history conversations of a user.</p>
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
     * <p>Queries the history conversations of a user.</p>
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
     * <p>Retrieves details for a specified custom agent.</p>
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
     * <p>Retrieves details for a specified custom agent.</p>
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
     * <p>Queries the content of a specified inspection report.</p>
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
     * <p>Queries the content of a specified inspection report.</p>
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
     * <p>Retrieves a list of messages in a specific conversation.</p>
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
     * <p>Retrieves a list of messages in a specific conversation.</p>
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
     * <h3>Applicable DPI engine</h3>
     * 
     * <b>summary</b> : 
     * <p>Obtain RDS AI Assistant Ultimate order information</p>
     * 
     * @param request GetModelOperatorOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelOperatorOrderResponse
     */
    public GetModelOperatorOrderResponse getModelOperatorOrderWithOptions(GetModelOperatorOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
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
     * <h3>Applicable DPI engine</h3>
     * 
     * <b>summary</b> : 
     * <p>Obtain RDS AI Assistant Ultimate order information</p>
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
     * <p>Queries the IDs of all instances that are included by a specified scheduled inspection configuration.</p>
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
     * <p>Queries the IDs of all instances that are included by a specified scheduled inspection configuration.</p>
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
     * <p>Retrieves all inspection reports for a specified scheduled task. You can filter the results by time range and use pagination.</p>
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
     * <p>Retrieves all inspection reports for a specified scheduled task. You can filter the results by time range and use pagination.</p>
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
     * <p>Obtains the details of a specified skill. You can obtain the details of user-defined skills or the system preset skills.</p>
     * 
     * @param request GetSkillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillResponse
     */
    public GetSkillResponse getSkillWithOptions(GetSkillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillId)) {
            query.put("SkillId", request.skillId);
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
     * <p>Obtains the details of a specified skill. You can obtain the details of user-defined skills or the system preset skills.</p>
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
     * <p>Retrieves paginated standalone inspection reports on a specified user\&quot;s non-scheduled tasks.</p>
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
     * <p>Retrieves paginated standalone inspection reports on a specified user\&quot;s non-scheduled tasks.</p>
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
     * <h3>Supported engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">DAS Enterprise Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>View Custom API Key</p>
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
     * <h3>Supported engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">DAS Enterprise Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>View Custom API Key</p>
     * 
     * @param request ListApiKeysRequest
     * @return ListApiKeysResponse
     */
    public ListApiKeysResponse listApiKeys(ListApiKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApiKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists your custom agents.</p>
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
     * <p>Lists your custom agents.</p>
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
     * <p>Queries the custom agent tools of the user.</p>
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
     * <p>Queries the custom agent tools of the user.</p>
     * @return ListCustomAgentToolsResponse
     */
    public ListCustomAgentToolsResponse listCustomAgentTools() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomAgentToolsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h3>适用引擎</h3>
     * <p>RDS SUPABASE</p>
     * 
     * <b>summary</b> : 
     * <p>ListLLMTokenUsage</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS SUPABASE</p>
     * 
     * <b>summary</b> : 
     * <p>ListLLMTokenUsage</p>
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
     * <p>Lists basic information about all inspection configurations for the specified user ID.</p>
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
     * <p>Lists basic information about all inspection configurations for the specified user ID.</p>
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
     * <p>Obtains the user-defined skills and all system preset skills of the current user.</p>
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
     * <p>Obtains the user-defined skills and all system preset skills of the current user.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>修改RDS AI应用实例</p>
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
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.componentsShrink)) {
            query.put("Components", request.componentsShrink);
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>修改RDS AI应用实例</p>
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
     * <h3>Applicable Engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related Function Documentation</h3>
     * 
     * <b>summary</b> : 
     * <p>Modifies the authentication configurations of an RDS Supabase instance.</p>
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
     * <h3>Applicable Engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related Function Documentation</h3>
     * 
     * <b>summary</b> : 
     * <p>Modifies the authentication configurations of an RDS Supabase instance.</p>
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
     * <p>Modifies the general configurations of an instance, such as the EIP and NAT settings.</p>
     * 
     * @param request ModifyInstanceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceConfigResponse
     */
    public ModifyInstanceConfigResponse modifyInstanceConfigWithOptions(ModifyInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <p>Modifies the general configurations of an instance, such as the EIP and NAT settings.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of an RDS Supabase instance.</p>
     * 
     * @param request ModifyInstanceIpWhitelistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceIpWhitelistResponse
     */
    public ModifyInstanceIpWhitelistResponse modifyInstanceIpWhitelistWithOptions(ModifyInstanceIpWhitelistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of an RDS Supabase instance.</p>
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
     * <p>Modifies the RAG agent configurations of an RDS Supabase instance.</p>
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
     * <p>Modifies the RAG agent configurations of an RDS Supabase instance.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the SSL settings of an RDS Supabase instance.</p>
     * 
     * @param request ModifyInstanceSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceSSLResponse
     */
    public ModifyInstanceSSLResponse modifyInstanceSSLWithOptions(ModifyInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the SSL settings of an RDS Supabase instance.</p>
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
     * <h3>Supported Engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related Function Documentation</h3>
     * 
     * <b>summary</b> : 
     * <p>Modifies the storage configurations of an RDS Supabase instance.</p>
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
     * <h3>Supported Engine</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>Related Function Documentation</h3>
     * 
     * <b>summary</b> : 
     * <p>Modifies the storage configurations of an RDS Supabase instance.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the SSL settings of RDS Supabase instances in batches.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the SSL settings of RDS Supabase instances in batches.</p>
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
     * <p>Modifies the returned messages.</p>
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
     * <p>Modifies the returned messages.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS Supabase</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>修改沙箱模板</p>
     * 
     * @param request ModifySandboxTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySandboxTemplateResponse
     */
    public ModifySandboxTemplateResponse modifySandboxTemplateWithOptions(ModifySandboxTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultCpu)) {
            query.put("DefaultCpu", request.defaultCpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultMemory)) {
            query.put("DefaultMemory", request.defaultMemory);
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
     * <h3>适用引擎</h3>
     * <p>RDS Supabase</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>修改沙箱模板</p>
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
     * <h3>Applicable engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Enterprise Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP whitelist for an RDS AI Assistant Enterprise Edition instance.</p>
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
     * <h3>Applicable engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Enterprise Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP whitelist for an RDS AI Assistant Enterprise Edition instance.</p>
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
     * <h3>Applicable engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant (Ultimate Edition)</a></p>
     * 
     * <b>summary</b> : 
     * <p>Renames an API key.</p>
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
     * <h3>Applicable engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant (Ultimate Edition)</a></p>
     * 
     * <b>summary</b> : 
     * <p>Renames an API key.</p>
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
     * <h3>Applicable engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant (Ultimate Edition)</a></p>
     * 
     * <b>summary</b> : 
     * <p>Resets an API key.</p>
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
     * <h3>Applicable engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant (Ultimate Edition)</a></p>
     * 
     * <b>summary</b> : 
     * <p>Resets an API key.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>当前仅支持修改RDS Supabase Dashboard用户的密码。</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets the logon password of the RDS Supabase instance and the access password of the database.</p>
     * 
     * @param request ResetInstancePasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetInstancePasswordResponse
     */
    public ResetInstancePasswordResponse resetInstancePasswordWithOptions(ResetInstancePasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * <blockquote>
     * <p>当前仅支持修改RDS Supabase Dashboard用户的密码。</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets the logon password of the RDS Supabase instance and the access password of the database.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Restarts an RDS Supabase instance that is in the Running state.</p>
     * 
     * @param request RestartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstanceWithOptions(RestartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Restarts an RDS Supabase instance that is in the Running state.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Starts a stopped RDS Supabase instance.</p>
     * 
     * @param request StartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Starts a stopped RDS Supabase instance.</p>
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Stops a running RDS Supabase instance.</p>
     * 
     * @param request StopInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * <h3>适用引擎</h3>
     * <p>RDS PostgreSQL</p>
     * <h3>相关功能文档</h3>
     * <p><a href="https://help.aliyun.com/document_detail/2938735.html">RDS Supabase</a></p>
     * 
     * <b>summary</b> : 
     * <p>Stops a running RDS Supabase instance.</p>
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
     * <h3>Supported engine</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modify the API KEY Quota</p>
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
     * <h3>Supported engine</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Ultimate Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Modify the API KEY Quota</p>
     * 
     * @param request UpdateApiKeyQuotaRequest
     * @return UpdateApiKeyQuotaResponse
     */
    public UpdateApiKeyQuotaResponse updateApiKeyQuota(UpdateApiKeyQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApiKeyQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom agent.</p>
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
     * <p>Updates a custom agent.</p>
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
     * <h3>Applicable engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Enterprise Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Updates the alert threshold percentage for API keys.</p>
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
     * <h3>Applicable engines</h3>
     * <p><a href="https://help.aliyun.com/zh/rds/apsaradb-rds-for-mysql/rds-copilot-ultra">RDS AI Assistant Enterprise Edition</a></p>
     * 
     * <b>summary</b> : 
     * <p>Updates the alert threshold percentage for API keys.</p>
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
     * <p>Updates the information about a specified skill.</p>
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
     * <p>Updates the information about a specified skill.</p>
     * 
     * @param request UpdateSkillRequest
     * @return UpdateSkillResponse
     */
    public UpdateSkillResponse updateSkill(UpdateSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSkillWithOptions(request, runtime);
    }
}
