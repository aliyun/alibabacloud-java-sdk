// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429;

import com.aliyun.tea.*;
import com.aliyun.websitebuild20250429.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("websitebuild", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>分配Supabase实例</p>
     * 
     * @param request AllocateSupabaseForAdminRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateSupabaseForAdminResponse
     */
    public AllocateSupabaseForAdminResponse allocateSupabaseForAdminWithOptions(AllocateSupabaseForAdminRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateSupabaseForAdmin"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateSupabaseForAdminResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分配Supabase实例</p>
     * 
     * @param request AllocateSupabaseForAdminRequest
     * @return AllocateSupabaseForAdminResponse
     */
    public AllocateSupabaseForAdminResponse allocateSupabaseForAdmin(AllocateSupabaseForAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateSupabaseForAdminWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量校验资源计量</p>
     * 
     * @param request BatchCheckResourceMeasureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCheckResourceMeasureResponse
     */
    public BatchCheckResourceMeasureResponse batchCheckResourceMeasureWithOptions(BatchCheckResourceMeasureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.belongId)) {
            query.put("BelongId", request.belongId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.belongIdType)) {
            query.put("BelongIdType", request.belongIdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.espBizId)) {
            query.put("EspBizId", request.espBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderComponentParams)) {
            query.put("OrderComponentParams", request.orderComponentParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCheckItems)) {
            query.put("ResourceCheckItems", request.resourceCheckItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCheckResourceMeasure"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCheckResourceMeasureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量校验资源计量</p>
     * 
     * @param request BatchCheckResourceMeasureRequest
     * @return BatchCheckResourceMeasureResponse
     */
    public BatchCheckResourceMeasureResponse batchCheckResourceMeasure(BatchCheckResourceMeasureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCheckResourceMeasureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Bind Application Domain</p>
     * 
     * @param request BindAppDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAppDomainResponse
     */
    public BindAppDomainResponse bindAppDomainWithOptions(BindAppDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAppDomain"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAppDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Bind Application Domain</p>
     * 
     * @param request BindAppDomainRequest
     * @return BindAppDomainResponse
     */
    public BindAppDomainResponse bindAppDomain(BindAppDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAppDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验资源计量</p>
     * 
     * @param request CheckResourceMeasureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckResourceMeasureResponse
     */
    public CheckResourceMeasureResponse checkResourceMeasureWithOptions(CheckResourceMeasureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.belongId)) {
            query.put("BelongId", request.belongId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.belongIdType)) {
            query.put("BelongIdType", request.belongIdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.espBizId)) {
            query.put("EspBizId", request.espBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderComponentParams)) {
            query.put("OrderComponentParams", request.orderComponentParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCode)) {
            query.put("ResourceCode", request.resourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceValue)) {
            query.put("ResourceValue", request.resourceValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckResourceMeasure"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckResourceMeasureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验资源计量</p>
     * 
     * @param request CheckResourceMeasureRequest
     * @return CheckResourceMeasureResponse
     */
    public CheckResourceMeasureResponse checkResourceMeasure(CheckResourceMeasureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkResourceMeasureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验用户资源计量</p>
     * 
     * @param request CheckUserResourceMeasureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUserResourceMeasureResponse
     */
    public CheckUserResourceMeasureResponse checkUserResourceMeasureWithOptions(CheckUserResourceMeasureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.belongId)) {
            query.put("BelongId", request.belongId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.belongIdType)) {
            query.put("BelongIdType", request.belongIdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.espBizId)) {
            query.put("EspBizId", request.espBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderComponentParams)) {
            query.put("OrderComponentParams", request.orderComponentParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCode)) {
            query.put("ResourceCode", request.resourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceValue)) {
            query.put("ResourceValue", request.resourceValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUserResourceMeasure"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUserResourceMeasureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验用户资源计量</p>
     * 
     * @param request CheckUserResourceMeasureRequest
     * @return CheckUserResourceMeasureResponse
     */
    public CheckUserResourceMeasureResponse checkUserResourceMeasure(CheckUserResourceMeasureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUserResourceMeasureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>复制插件配置</p>
     * 
     * @param request CopyAppPluginConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyAppPluginConfigResponse
     */
    public CopyAppPluginConfigResponse copyAppPluginConfigWithOptions(CopyAppPluginConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceBizId)) {
            query.put("SourceBizId", request.sourceBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetBizId)) {
            query.put("TargetBizId", request.targetBizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyAppPluginConfig"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyAppPluginConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>复制插件配置</p>
     * 
     * @param request CopyAppPluginConfigRequest
     * @return CopyAppPluginConfigResponse
     */
    public CopyAppPluginConfigResponse copyAppPluginConfig(CopyAppPluginConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyAppPluginConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>异步发起AI员工对话</p>
     * 
     * @param request CreateAIStaffChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAIStaffChatResponse
     */
    public CreateAIStaffChatResponse createAIStaffChatWithOptions(CreateAIStaffChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("Messages", request.messages);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metaData)) {
            bodyFlat.put("MetaData", request.metaData);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAIStaffChat"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAIStaffChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>异步发起AI员工对话</p>
     * 
     * @param request CreateAIStaffChatRequest
     * @return CreateAIStaffChatResponse
     */
    public CreateAIStaffChatResponse createAIStaffChat(CreateAIStaffChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAIStaffChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建AI员工会话</p>
     * 
     * @param request CreateAIStaffConversationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAIStaffConversationResponse
     */
    public CreateAIStaffConversationResponse createAIStaffConversationWithOptions(CreateAIStaffConversationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAIStaffConversation"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAIStaffConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建AI员工会话</p>
     * 
     * @param request CreateAIStaffConversationRequest
     * @return CreateAIStaffConversationResponse
     */
    public CreateAIStaffConversationResponse createAIStaffConversation(CreateAIStaffConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAIStaffConversationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用助手智能体</p>
     * 
     * @param request CreateAppAssistantAgentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppAssistantAgentResponse
     */
    public CreateAppAssistantAgentResponse createAppAssistantAgentWithOptions(CreateAppAssistantAgentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            query.put("AgentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformType)) {
            query.put("PlatformType", request.platformType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppAssistantAgent"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppAssistantAgentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用助手智能体</p>
     * 
     * @param request CreateAppAssistantAgentRequest
     * @return CreateAppAssistantAgentResponse
     */
    public CreateAppAssistantAgentResponse createAppAssistantAgent(CreateAppAssistantAgentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppAssistantAgentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成应用助手SSO免登</p>
     * 
     * @param request CreateAppAssistantAgentSsoLoginRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppAssistantAgentSsoLoginResponse
     */
    public CreateAppAssistantAgentSsoLoginResponse createAppAssistantAgentSsoLoginWithOptions(CreateAppAssistantAgentSsoLoginRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformType)) {
            query.put("PlatformType", request.platformType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUrl)) {
            query.put("TargetUrl", request.targetUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppAssistantAgentSsoLogin"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppAssistantAgentSsoLoginResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生成应用助手SSO免登</p>
     * 
     * @param request CreateAppAssistantAgentSsoLoginRequest
     * @return CreateAppAssistantAgentSsoLoginResponse
     */
    public CreateAppAssistantAgentSsoLoginResponse createAppAssistantAgentSsoLogin(CreateAppAssistantAgentSsoLoginRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppAssistantAgentSsoLoginWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>万小智发起AI对话</p>
     * 
     * @param request CreateAppChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppChatResponse
     */
    public CreateAppChatResponse createAppChatWithOptions(CreateAppChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.botId)) {
            query.put("BotId", request.botId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            query.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            query.put("Messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppChat"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>万小智发起AI对话</p>
     * 
     * @param request CreateAppChatRequest
     * @return CreateAppChatResponse
     */
    public CreateAppChatResponse createAppChat(CreateAppChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a website instance</p>
     * 
     * @param tmpReq CreateAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppInstanceResponse
     */
    public CreateAppInstanceResponse createAppInstanceWithOptions(CreateAppInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppInstanceShrinkRequest request = new CreateAppInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            query.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createAction)) {
            query.put("CreateAction", request.createAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployArea)) {
            query.put("DeployArea", request.deployArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppInstance"),
            new TeaPair("version", "2025-04-29"),
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
     * <b>summary</b> : 
     * <p>Create a website instance</p>
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
     * <p>SSO ticket</p>
     * 
     * @param request CreateAppInstanceTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppInstanceTicketResponse
     */
    public CreateAppInstanceTicketResponse createAppInstanceTicketWithOptions(CreateAppInstanceTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppInstanceTicket"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppInstanceTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SSO ticket</p>
     * 
     * @param request CreateAppInstanceTicketRequest
     * @return CreateAppInstanceTicketResponse
     */
    public CreateAppInstanceTicketResponse createAppInstanceTicket(CreateAppInstanceTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppInstanceTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用实例创建 LLM 网关 API-KEY</p>
     * 
     * @param request CreateAppLlmApiKeyForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppLlmApiKeyForPartnerResponse
     */
    public CreateAppLlmApiKeyForPartnerResponse createAppLlmApiKeyForPartnerWithOptions(CreateAppLlmApiKeyForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipWhiteList)) {
            body.put("IpWhiteList", request.ipWhiteList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppLlmApiKeyForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppLlmApiKeyForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用实例创建 LLM 网关 API-KEY</p>
     * 
     * @param request CreateAppLlmApiKeyForPartnerRequest
     * @return CreateAppLlmApiKeyForPartnerResponse
     */
    public CreateAppLlmApiKeyForPartnerResponse createAppLlmApiKeyForPartner(CreateAppLlmApiKeyForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppLlmApiKeyForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Activate the Wanxiaozhi Inspiration Value service</p>
     * 
     * @param request CreateAppTokenServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppTokenServiceResponse
     */
    public CreateAppTokenServiceResponse createAppTokenServiceWithOptions(CreateAppTokenServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createAction)) {
            query.put("CreateAction", request.createAction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppTokenService"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppTokenServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activate the Wanxiaozhi Inspiration Value service</p>
     * 
     * @param request CreateAppTokenServiceRequest
     * @return CreateAppTokenServiceResponse
     */
    public CreateAppTokenServiceResponse createAppTokenService(CreateAppTokenServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppTokenServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交创建Logo任务</p>
     * 
     * @param request CreateLogoTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogoTaskResponse
     */
    public CreateLogoTaskResponse createLogoTaskWithOptions(CreateLogoTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logoVersion)) {
            query.put("LogoVersion", request.logoVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.negativePrompt)) {
            query.put("NegativePrompt", request.negativePrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogoTask"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogoTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交创建Logo任务</p>
     * 
     * @param request CreateLogoTaskRequest
     * @return CreateLogoTaskResponse
     */
    public CreateLogoTaskResponse createLogoTask(CreateLogoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogoTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建素材中心文件夹</p>
     * 
     * @param request CreateMaterialDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMaterialDirectoryResponse
     */
    public CreateMaterialDirectoryResponse createMaterialDirectoryWithOptions(CreateMaterialDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDirectoryId)) {
            query.put("ParentDirectoryId", request.parentDirectoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMaterialDirectory"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMaterialDirectoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建素材中心文件夹</p>
     * 
     * @param request CreateMaterialDirectoryRequest
     * @return CreateMaterialDirectoryResponse
     */
    public CreateMaterialDirectoryResponse createMaterialDirectory(CreateMaterialDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMaterialDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the SSL certificate of a domain</p>
     * 
     * @param request DeleteAppDomainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppDomainCertificateResponse
     */
    public DeleteAppDomainCertificateResponse deleteAppDomainCertificateWithOptions(DeleteAppDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppDomainCertificate"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppDomainCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the SSL certificate of a domain</p>
     * 
     * @param request DeleteAppDomainCertificateRequest
     * @return DeleteAppDomainCertificateResponse
     */
    public DeleteAppDomainCertificateResponse deleteAppDomainCertificate(DeleteAppDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppDomainCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the domain redirection rules</p>
     * 
     * @param request DeleteAppDomainRedirectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppDomainRedirectResponse
     */
    public DeleteAppDomainRedirectResponse deleteAppDomainRedirectWithOptions(DeleteAppDomainRedirectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            query.put("RecordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppDomainRedirect"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppDomainRedirectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the domain redirection rules</p>
     * 
     * @param request DeleteAppDomainRedirectRequest
     * @return DeleteAppDomainRedirectResponse
     */
    public DeleteAppDomainRedirectResponse deleteAppDomainRedirect(DeleteAppDomainRedirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppDomainRedirectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除文件</p>
     * 
     * @param request DeleteAppInstanceFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppInstanceFileResponse
     */
    public DeleteAppInstanceFileResponse deleteAppInstanceFileWithOptions(DeleteAppInstanceFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppInstanceFile"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppInstanceFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除文件</p>
     * 
     * @param request DeleteAppInstanceFileRequest
     * @return DeleteAppInstanceFileResponse
     */
    public DeleteAppInstanceFileResponse deleteAppInstanceFile(DeleteAppInstanceFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppInstanceFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Supabase密钥</p>
     * 
     * @param request DeleteAppSupabaseSecretsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppSupabaseSecretsResponse
     */
    public DeleteAppSupabaseSecretsResponse deleteAppSupabaseSecretsWithOptions(DeleteAppSupabaseSecretsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keysJson)) {
            query.put("KeysJson", request.keysJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppSupabaseSecrets"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppSupabaseSecretsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Supabase密钥</p>
     * 
     * @param request DeleteAppSupabaseSecretsRequest
     * @return DeleteAppSupabaseSecretsResponse
     */
    public DeleteAppSupabaseSecretsResponse deleteAppSupabaseSecrets(DeleteAppSupabaseSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppSupabaseSecretsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除素材中心文件夹</p>
     * 
     * @param request DeleteMaterialDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMaterialDirectoryResponse
     */
    public DeleteMaterialDirectoryResponse deleteMaterialDirectoryWithOptions(DeleteMaterialDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMaterialDirectory"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMaterialDirectoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除素材中心文件夹</p>
     * 
     * @param request DeleteMaterialDirectoryRequest
     * @return DeleteMaterialDirectoryResponse
     */
    public DeleteMaterialDirectoryResponse deleteMaterialDirectory(DeleteMaterialDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMaterialDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除素材生产任务</p>
     * 
     * @param tmpReq DeleteMaterialTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMaterialTaskResponse
     */
    public DeleteMaterialTaskResponse deleteMaterialTaskWithOptions(DeleteMaterialTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteMaterialTaskShrinkRequest request = new DeleteMaterialTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskIds)) {
            request.taskIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskIds, "TaskIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskIdsShrink)) {
            query.put("TaskIds", request.taskIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMaterialTask"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMaterialTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除素材生产任务</p>
     * 
     * @param request DeleteMaterialTaskRequest
     * @return DeleteMaterialTaskResponse
     */
    public DeleteMaterialTaskResponse deleteMaterialTask(DeleteMaterialTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMaterialTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the DNS resolution records of a domain</p>
     * 
     * @param request DescribeAppDomainDnsRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppDomainDnsRecordResponse
     */
    public DescribeAppDomainDnsRecordResponse describeAppDomainDnsRecordWithOptions(DescribeAppDomainDnsRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purpose)) {
            query.put("Purpose", request.purpose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppDomainDnsRecord"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppDomainDnsRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the DNS resolution records of a domain</p>
     * 
     * @param request DescribeAppDomainDnsRecordRequest
     * @return DescribeAppDomainDnsRecordResponse
     */
    public DescribeAppDomainDnsRecordResponse describeAppDomainDnsRecord(DescribeAppDomainDnsRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppDomainDnsRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DispatchConsoleAPIForPartner</p>
     * 
     * @param request DispatchConsoleAPIForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DispatchConsoleAPIForPartnerResponse
     */
    public DispatchConsoleAPIForPartnerResponse dispatchConsoleAPIForPartnerWithOptions(DispatchConsoleAPIForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liveToken)) {
            query.put("LiveToken", request.liveToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            query.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("Product", request.product);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteHost)) {
            query.put("SiteHost", request.siteHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DispatchConsoleAPIForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DispatchConsoleAPIForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DispatchConsoleAPIForPartner</p>
     * 
     * @param request DispatchConsoleAPIForPartnerRequest
     * @return DispatchConsoleAPIForPartnerResponse
     */
    public DispatchConsoleAPIForPartnerResponse dispatchConsoleAPIForPartner(DispatchConsoleAPIForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dispatchConsoleAPIForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑插件配置</p>
     * 
     * @param request EditPluginConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditPluginConfigResponse
     */
    public EditPluginConfigResponse editPluginConfigWithOptions(EditPluginConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginConfig)) {
            query.put("PluginConfig", request.pluginConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginDesc)) {
            query.put("PluginDesc", request.pluginDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            query.put("PluginId", request.pluginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginName)) {
            query.put("PluginName", request.pluginName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditPluginConfig"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditPluginConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑插件配置</p>
     * 
     * @param request EditPluginConfigRequest
     * @return EditPluginConfigResponse
     */
    public EditPluginConfigResponse editPluginConfig(EditPluginConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editPluginConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>导出素材文件</p>
     * 
     * @param tmpReq ExportMaterialFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportMaterialFileResponse
     */
    public ExportMaterialFileResponse exportMaterialFileWithOptions(ExportMaterialFileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExportMaterialFileShrinkRequest request = new ExportMaterialFileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileIds)) {
            request.fileIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileIds, "FileIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIdsShrink)) {
            query.put("FileIds", request.fileIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportMaterialFile"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportMaterialFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>导出素材文件</p>
     * 
     * @param request ExportMaterialFileRequest
     * @return ExportMaterialFileResponse
     */
    public ExportMaterialFileResponse exportMaterialFile(ExportMaterialFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportMaterialFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取AI员工站点预览地址</p>
     * 
     * @param request GetAIStaffPreviewUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAIStaffPreviewUrlResponse
     */
    public GetAIStaffPreviewUrlResponse getAIStaffPreviewUrlWithOptions(GetAIStaffPreviewUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restart)) {
            body.put("Restart", request.restart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAIStaffPreviewUrl"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAIStaffPreviewUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取AI员工站点预览地址</p>
     * 
     * @param request GetAIStaffPreviewUrlRequest
     * @return GetAIStaffPreviewUrlResponse
     */
    public GetAIStaffPreviewUrlResponse getAIStaffPreviewUrl(GetAIStaffPreviewUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAIStaffPreviewUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取代码工作区详情</p>
     * 
     * @param request GetAppCodeWorkspaceDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppCodeWorkspaceDetailResponse
     */
    public GetAppCodeWorkspaceDetailResponse getAppCodeWorkspaceDetailWithOptions(GetAppCodeWorkspaceDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppCodeWorkspaceDetail"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppCodeWorkspaceDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取代码工作区详情</p>
     * 
     * @param request GetAppCodeWorkspaceDetailRequest
     * @return GetAppCodeWorkspaceDetailResponse
     */
    public GetAppCodeWorkspaceDetailResponse getAppCodeWorkspaceDetail(GetAppCodeWorkspaceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppCodeWorkspaceDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取对话详情</p>
     * 
     * @param request GetAppConversationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppConversationResponse
     */
    public GetAppConversationResponse getAppConversationWithOptions(GetAppConversationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.botId)) {
            query.put("BotId", request.botId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppConversation"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取对话详情</p>
     * 
     * @param request GetAppConversationRequest
     * @return GetAppConversationResponse
     */
    public GetAppConversationResponse getAppConversation(GetAppConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppConversationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话锁定状态</p>
     * 
     * @param request GetAppConversationLockStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppConversationLockStatusResponse
     */
    public GetAppConversationLockStatusResponse getAppConversationLockStatusWithOptions(GetAppConversationLockStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppConversationLockStatus"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppConversationLockStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话锁定状态</p>
     * 
     * @param request GetAppConversationLockStatusRequest
     * @return GetAppConversationLockStatusResponse
     */
    public GetAppConversationLockStatusResponse getAppConversationLockStatus(GetAppConversationLockStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppConversationLockStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据库表结构</p>
     * 
     * @param request GetAppDatabaseTableSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppDatabaseTableSchemasResponse
     */
    public GetAppDatabaseTableSchemasResponse getAppDatabaseTableSchemasWithOptions(GetAppDatabaseTableSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppDatabaseTableSchemas"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppDatabaseTableSchemasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数据库表结构</p>
     * 
     * @param request GetAppDatabaseTableSchemasRequest
     * @return GetAppDatabaseTableSchemasResponse
     */
    public GetAppDatabaseTableSchemasResponse getAppDatabaseTableSchemas(GetAppDatabaseTableSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppDatabaseTableSchemasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>读取文件及修改时间</p>
     * 
     * @param request GetAppFileContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppFileContentResponse
     */
    public GetAppFileContentResponse getAppFileContentWithOptions(GetAppFileContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppFileContent"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppFileContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>读取文件及修改时间</p>
     * 
     * @param request GetAppFileContentRequest
     * @return GetAppFileContentResponse
     */
    public GetAppFileContentResponse getAppFileContent(GetAppFileContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppFileContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Application Instance Details</p>
     * 
     * @param request GetAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppInstanceResponse
     */
    public GetAppInstanceResponse getAppInstanceWithOptions(GetAppInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppInstance"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Application Instance Details</p>
     * 
     * @param request GetAppInstanceRequest
     * @return GetAppInstanceResponse
     */
    public GetAppInstanceResponse getAppInstance(GetAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetAppInstanceEntitlement</p>
     * 
     * @param request GetAppInstanceEntitlementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppInstanceEntitlementResponse
     */
    public GetAppInstanceEntitlementResponse getAppInstanceEntitlementWithOptions(GetAppInstanceEntitlementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppInstanceEntitlement"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppInstanceEntitlementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetAppInstanceEntitlement</p>
     * 
     * @param request GetAppInstanceEntitlementRequest
     * @return GetAppInstanceEntitlementResponse
     */
    public GetAppInstanceEntitlementResponse getAppInstanceEntitlement(GetAppInstanceEntitlementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInstanceEntitlementWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query application instance information</p>
     * 
     * @param request GetAppInstanceForAdminRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppInstanceForAdminResponse
     */
    public GetAppInstanceForAdminResponse getAppInstanceForAdminWithOptions(GetAppInstanceForAdminRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppInstanceForAdmin"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppInstanceForAdminResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query application instance information</p>
     * 
     * @param request GetAppInstanceForAdminRequest
     * @return GetAppInstanceForAdminResponse
     */
    public GetAppInstanceForAdminResponse getAppInstanceForAdmin(GetAppInstanceForAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInstanceForAdminWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query instance details</p>
     * 
     * @param request GetAppInstanceForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppInstanceForPartnerResponse
     */
    public GetAppInstanceForPartnerResponse getAppInstanceForPartnerWithOptions(GetAppInstanceForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppInstanceForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppInstanceForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query instance details</p>
     * 
     * @param request GetAppInstanceForPartnerRequest
     * @return GetAppInstanceForPartnerResponse
     */
    public GetAppInstanceForPartnerResponse getAppInstanceForPartner(GetAppInstanceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInstanceForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用临时短链</p>
     * 
     * @param request GetAppInstanceTempShortUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppInstanceTempShortUrlResponse
     */
    public GetAppInstanceTempShortUrlResponse getAppInstanceTempShortUrlWithOptions(GetAppInstanceTempShortUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppInstanceTempShortUrl"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppInstanceTempShortUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用临时短链</p>
     * 
     * @param request GetAppInstanceTempShortUrlRequest
     * @return GetAppInstanceTempShortUrlResponse
     */
    public GetAppInstanceTempShortUrlResponse getAppInstanceTempShortUrl(GetAppInstanceTempShortUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInstanceTempShortUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生码-获取插件配置信息</p>
     * 
     * @param request GetAppPluginConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppPluginConfigResponse
     */
    public GetAppPluginConfigResponse getAppPluginConfigWithOptions(GetAppPluginConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginId)) {
            body.put("PluginId", request.pluginId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppPluginConfig"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppPluginConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生码-获取插件配置信息</p>
     * 
     * @param request GetAppPluginConfigRequest
     * @return GetAppPluginConfigResponse
     */
    public GetAppPluginConfigResponse getAppPluginConfig(GetAppPluginConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppPluginConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布状态查询</p>
     * 
     * @param request GetAppPublishStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppPublishStatusResponse
     */
    public GetAppPublishStatusResponse getAppPublishStatusWithOptions(GetAppPublishStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployOrderId)) {
            query.put("DeployOrderId", request.deployOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.websiteDomain)) {
            query.put("WebsiteDomain", request.websiteDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppPublishStatus"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppPublishStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布状态查询</p>
     * 
     * @param request GetAppPublishStatusRequest
     * @return GetAppPublishStatusResponse
     */
    public GetAppPublishStatusResponse getAppPublishStatus(GetAppPublishStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppPublishStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询万小智推荐商品</p>
     * 
     * @param request GetAppRecommendedCommoditiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppRecommendedCommoditiesResponse
     */
    public GetAppRecommendedCommoditiesResponse getAppRecommendedCommoditiesWithOptions(GetAppRecommendedCommoditiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceConditions)) {
            query.put("ResourceConditions", request.resourceConditions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            query.put("Scene", request.scene);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppRecommendedCommodities"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppRecommendedCommoditiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询万小智推荐商品</p>
     * 
     * @param request GetAppRecommendedCommoditiesRequest
     * @return GetAppRecommendedCommoditiesResponse
     */
    public GetAppRecommendedCommoditiesResponse getAppRecommendedCommodities(GetAppRecommendedCommoditiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppRecommendedCommoditiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>需求查询</p>
     * 
     * @param request GetAppRequirementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppRequirementResponse
     */
    public GetAppRequirementResponse getAppRequirementWithOptions(GetAppRequirementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppRequirement"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppRequirementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>需求查询</p>
     * 
     * @param request GetAppRequirementRequest
     * @return GetAppRequirementResponse
     */
    public GetAppRequirementResponse getAppRequirement(GetAppRequirementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppRequirementWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取沙箱预览地址</p>
     * 
     * @param request GetAppSandboxPreviewUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppSandboxPreviewUrlResponse
     */
    public GetAppSandboxPreviewUrlResponse getAppSandboxPreviewUrlWithOptions(GetAppSandboxPreviewUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restart)) {
            body.put("Restart", request.restart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppSandboxPreviewUrl"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppSandboxPreviewUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取沙箱预览地址</p>
     * 
     * @param request GetAppSandboxPreviewUrlRequest
     * @return GetAppSandboxPreviewUrlResponse
     */
    public GetAppSandboxPreviewUrlResponse getAppSandboxPreviewUrl(GetAppSandboxPreviewUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppSandboxPreviewUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询SEO索引状态</p>
     * 
     * @param request GetAppSeoStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppSeoStatusResponse
     */
    public GetAppSeoStatusResponse getAppSeoStatusWithOptions(GetAppSeoStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seType)) {
            query.put("SeType", request.seType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppSeoStatus"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppSeoStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询SEO索引状态</p>
     * 
     * @param request GetAppSeoStatusRequest
     * @return GetAppSeoStatusResponse
     */
    public GetAppSeoStatusResponse getAppSeoStatus(GetAppSeoStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppSeoStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SEO索引图表</p>
     * 
     * @param request GetAppSeoTrendsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppSeoTrendsResponse
     */
    public GetAppSeoTrendsResponse getAppSeoTrendsWithOptions(GetAppSeoTrendsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seType)) {
            query.put("SeType", request.seType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppSeoTrends"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppSeoTrendsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>SEO索引图表</p>
     * 
     * @param request GetAppSeoTrendsRequest
     * @return GetAppSeoTrendsResponse
     */
    public GetAppSeoTrendsResponse getAppSeoTrends(GetAppSeoTrendsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppSeoTrendsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取站点地图</p>
     * 
     * @param request GetAppSitemapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppSitemapResponse
     */
    public GetAppSitemapResponse getAppSitemapWithOptions(GetAppSitemapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seType)) {
            query.put("SeType", request.seType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppSitemap"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppSitemapResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取站点地图</p>
     * 
     * @param request GetAppSitemapRequest
     * @return GetAppSitemapResponse
     */
    public GetAppSitemapResponse getAppSitemap(GetAppSitemapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppSitemapWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Supabase认证设置查询</p>
     * 
     * @param request GetAppSupabaseAuthConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppSupabaseAuthConfigResponse
     */
    public GetAppSupabaseAuthConfigResponse getAppSupabaseAuthConfigWithOptions(GetAppSupabaseAuthConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppSupabaseAuthConfig"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppSupabaseAuthConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Supabase认证设置查询</p>
     * 
     * @param request GetAppSupabaseAuthConfigRequest
     * @return GetAppSupabaseAuthConfigResponse
     */
    public GetAppSupabaseAuthConfigResponse getAppSupabaseAuthConfig(GetAppSupabaseAuthConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppSupabaseAuthConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Supabase实例信息</p>
     * 
     * @param request GetAppSupabaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppSupabaseInstanceResponse
     */
    public GetAppSupabaseInstanceResponse getAppSupabaseInstanceWithOptions(GetAppSupabaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppSupabaseInstance"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppSupabaseInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Supabase实例信息</p>
     * 
     * @param request GetAppSupabaseInstanceRequest
     * @return GetAppSupabaseInstanceResponse
     */
    public GetAppSupabaseInstanceResponse getAppSupabaseInstance(GetAppSupabaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppSupabaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Supabase密钥</p>
     * 
     * @param request GetAppSupabaseSecretsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppSupabaseSecretsResponse
     */
    public GetAppSupabaseSecretsResponse getAppSupabaseSecretsWithOptions(GetAppSupabaseSecretsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppSupabaseSecrets"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppSupabaseSecretsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Supabase密钥</p>
     * 
     * @param request GetAppSupabaseSecretsRequest
     * @return GetAppSupabaseSecretsResponse
     */
    public GetAppSupabaseSecretsResponse getAppSupabaseSecrets(GetAppSupabaseSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppSupabaseSecretsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模板详情查询</p>
     * 
     * @param request GetAppTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppTemplateResponse
     */
    public GetAppTemplateResponse getAppTemplateWithOptions(GetAppTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppTemplate"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>模板详情查询</p>
     * 
     * @param request GetAppTemplateRequest
     * @return GetAppTemplateResponse
     */
    public GetAppTemplateResponse getAppTemplate(GetAppTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询万小智灵感值服务</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppTokenServiceResponse
     */
    public GetAppTokenServiceResponse getAppTokenServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppTokenService"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppTokenServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询万小智灵感值服务</p>
     * @return GetAppTokenServiceResponse
     */
    public GetAppTokenServiceResponse getAppTokenService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppTokenServiceWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作区目录结构</p>
     * 
     * @param request GetAppWorkspaceDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppWorkspaceDirectoryResponse
     */
    public GetAppWorkspaceDirectoryResponse getAppWorkspaceDirectoryWithOptions(GetAppWorkspaceDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deep)) {
            body.put("Deep", request.deep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("FilePath", request.filePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppWorkspaceDirectory"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppWorkspaceDirectoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作区目录结构</p>
     * 
     * @param request GetAppWorkspaceDirectoryRequest
     * @return GetAppWorkspaceDirectoryResponse
     */
    public GetAppWorkspaceDirectoryResponse getAppWorkspaceDirectory(GetAppWorkspaceDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppWorkspaceDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Logo创建任务</p>
     * 
     * @param request GetCreateLogoTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCreateLogoTaskResponse
     */
    public GetCreateLogoTaskResponse getCreateLogoTaskWithOptions(GetCreateLogoTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCreateLogoTask"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCreateLogoTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Logo创建任务</p>
     * 
     * @param request GetCreateLogoTaskRequest
     * @return GetCreateLogoTaskResponse
     */
    public GetCreateLogoTaskResponse getCreateLogoTask(GetCreateLogoTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCreateLogoTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提供给服务商的域名查询接口</p>
     * 
     * @param request GetDomainInfoForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDomainInfoForPartnerResponse
     */
    public GetDomainInfoForPartnerResponse getDomainInfoForPartnerWithOptions(GetDomainInfoForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomainInfoForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainInfoForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提供给服务商的域名查询接口</p>
     * 
     * @param request GetDomainInfoForPartnerRequest
     * @return GetDomainInfoForPartnerResponse
     */
    public GetDomainInfoForPartnerResponse getDomainInfoForPartner(GetDomainInfoForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDomainInfoForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名备案信息</p>
     * 
     * @param request GetIcpFilingInfoForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIcpFilingInfoForPartnerResponse
     */
    public GetIcpFilingInfoForPartnerResponse getIcpFilingInfoForPartnerWithOptions(GetIcpFilingInfoForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIcpFilingInfoForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIcpFilingInfoForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询域名备案信息</p>
     * 
     * @param request GetIcpFilingInfoForPartnerRequest
     * @return GetIcpFilingInfoForPartnerResponse
     */
    public GetIcpFilingInfoForPartnerResponse getIcpFilingInfoForPartner(GetIcpFilingInfoForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIcpFilingInfoForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询LLM Proxy配置</p>
     * 
     * @param request GetLlmProxyConfigForAdminRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLlmProxyConfigForAdminResponse
     */
    public GetLlmProxyConfigForAdminResponse getLlmProxyConfigForAdminWithOptions(GetLlmProxyConfigForAdminRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.capability)) {
            query.put("Capability", request.capability);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLlmProxyConfigForAdmin"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLlmProxyConfigForAdminResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询LLM Proxy配置</p>
     * 
     * @param request GetLlmProxyConfigForAdminRequest
     * @return GetLlmProxyConfigForAdminResponse
     */
    public GetLlmProxyConfigForAdminResponse getLlmProxyConfigForAdmin(GetLlmProxyConfigForAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLlmProxyConfigForAdminWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过授权码得到accessToken</p>
     * 
     * @param request GetUserAccessTokenForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserAccessTokenForPartnerResponse
     */
    public GetUserAccessTokenForPartnerResponse getUserAccessTokenForPartnerWithOptions(GetUserAccessTokenForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteHost)) {
            query.put("SiteHost", request.siteHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ticket)) {
            query.put("Ticket", request.ticket);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserAccessTokenForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserAccessTokenForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过授权码得到accessToken</p>
     * 
     * @param request GetUserAccessTokenForPartnerRequest
     * @return GetUserAccessTokenForPartnerResponse
     */
    public GetUserAccessTokenForPartnerResponse getUserAccessTokenForPartner(GetUserAccessTokenForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserAccessTokenForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴获取用户SLR角色授权临时凭证</p>
     * 
     * @param request GetUserTmpIdentityForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserTmpIdentityForPartnerResponse
     */
    public GetUserTmpIdentityForPartnerResponse getUserTmpIdentityForPartnerWithOptions(GetUserTmpIdentityForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authPurpose)) {
            query.put("AuthPurpose", request.authPurpose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceLinkedRole)) {
            query.put("ServiceLinkedRole", request.serviceLinkedRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserTmpIdentityForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserTmpIdentityForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴获取用户SLR角色授权临时凭证</p>
     * 
     * @param request GetUserTmpIdentityForPartnerRequest
     * @return GetUserTmpIdentityForPartnerResponse
     */
    public GetUserTmpIdentityForPartnerResponse getUserTmpIdentityForPartner(GetUserTmpIdentityForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserTmpIdentityForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查AccessToken</p>
     * 
     * @param request IntrospectAppInstanceTicketForPreviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IntrospectAppInstanceTicketForPreviewResponse
     */
    public IntrospectAppInstanceTicketForPreviewResponse introspectAppInstanceTicketForPreviewWithOptions(IntrospectAppInstanceTicketForPreviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IntrospectAppInstanceTicketForPreview"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IntrospectAppInstanceTicketForPreviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查AccessToken</p>
     * 
     * @param request IntrospectAppInstanceTicketForPreviewRequest
     * @return IntrospectAppInstanceTicketForPreviewResponse
     */
    public IntrospectAppInstanceTicketForPreviewResponse introspectAppInstanceTicketForPreview(IntrospectAppInstanceTicketForPreviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.introspectAppInstanceTicketForPreviewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取AI员工对话增量SSE事件</p>
     * 
     * @param request ListAIStaffChatEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAIStaffChatEventsResponse
     */
    public ListAIStaffChatEventsResponse listAIStaffChatEventsWithOptions(ListAIStaffChatEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastEventId)) {
            body.put("LastEventId", request.lastEventId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAIStaffChatEvents"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAIStaffChatEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取AI员工对话增量SSE事件</p>
     * 
     * @param request ListAIStaffChatEventsRequest
     * @return ListAIStaffChatEventsResponse
     */
    public ListAIStaffChatEventsResponse listAIStaffChatEvents(ListAIStaffChatEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIStaffChatEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询AI员工对话消息列表</p>
     * 
     * @param request ListAIStaffChatMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAIStaffChatMessagesResponse
     */
    public ListAIStaffChatMessagesResponse listAIStaffChatMessagesWithOptions(ListAIStaffChatMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            body.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startCreateTime)) {
            body.put("StartCreateTime", request.startCreateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAIStaffChatMessages"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAIStaffChatMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询AI员工对话消息列表</p>
     * 
     * @param request ListAIStaffChatMessagesRequest
     * @return ListAIStaffChatMessagesResponse
     */
    public ListAIStaffChatMessagesResponse listAIStaffChatMessages(ListAIStaffChatMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAIStaffChatMessagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用助手智能体列表</p>
     * 
     * @param request ListAppAssistantAgentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppAssistantAgentsResponse
     */
    public ListAppAssistantAgentsResponse listAppAssistantAgentsWithOptions(ListAppAssistantAgentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformType)) {
            query.put("PlatformType", request.platformType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppAssistantAgents"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppAssistantAgentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用助手智能体列表</p>
     * 
     * @param request ListAppAssistantAgentsRequest
     * @return ListAppAssistantAgentsResponse
     */
    public ListAppAssistantAgentsResponse listAppAssistantAgents(ListAppAssistantAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppAssistantAgentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定聊天的消息列表</p>
     * 
     * @param request ListAppChatMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppChatMessagesResponse
     */
    public ListAppChatMessagesResponse listAppChatMessagesWithOptions(ListAppChatMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            query.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sectionId)) {
            query.put("SectionId", request.sectionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppChatMessages"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppChatMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定聊天的消息列表</p>
     * 
     * @param request ListAppChatMessagesRequest
     * @return ListAppChatMessagesResponse
     */
    public ListAppChatMessagesResponse listAppChatMessages(ListAppChatMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppChatMessagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取商品配置信息</p>
     * 
     * @deprecated OpenAPI ListAppCommoditySpecificationsForPartner is deprecated, please use WebsiteBuild::2025-04-29::ListAppCommoditySpecificationsV2ForPartner instead.
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppCommoditySpecificationsForPartnerResponse
     */
    @Deprecated
    // Deprecated
    public ListAppCommoditySpecificationsForPartnerResponse listAppCommoditySpecificationsForPartnerWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppCommoditySpecificationsForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppCommoditySpecificationsForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取商品配置信息</p>
     * 
     * @deprecated OpenAPI ListAppCommoditySpecificationsForPartner is deprecated, please use WebsiteBuild::2025-04-29::ListAppCommoditySpecificationsV2ForPartner instead.
     * @return ListAppCommoditySpecificationsForPartnerResponse
     */
    @Deprecated
    // Deprecated
    public ListAppCommoditySpecificationsForPartnerResponse listAppCommoditySpecificationsForPartner() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppCommoditySpecificationsForPartnerWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>网站信息查询</p>
     * 
     * @param request ListAppCommoditySpecificationsV2ForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppCommoditySpecificationsV2ForPartnerResponse
     */
    public ListAppCommoditySpecificationsV2ForPartnerResponse listAppCommoditySpecificationsV2ForPartnerWithOptions(ListAppCommoditySpecificationsV2ForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppCommoditySpecificationsV2ForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppCommoditySpecificationsV2ForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>网站信息查询</p>
     * 
     * @param request ListAppCommoditySpecificationsV2ForPartnerRequest
     * @return ListAppCommoditySpecificationsV2ForPartnerResponse
     */
    public ListAppCommoditySpecificationsV2ForPartnerResponse listAppCommoditySpecificationsV2ForPartner(ListAppCommoditySpecificationsV2ForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppCommoditySpecificationsV2ForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询对话消息列表</p>
     * 
     * @param request ListAppConversationMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppConversationMessagesResponse
     */
    public ListAppConversationMessagesResponse listAppConversationMessagesWithOptions(ListAppConversationMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startCreateTime)) {
            query.put("StartCreateTime", request.startCreateTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppConversationMessages"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppConversationMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询对话消息列表</p>
     * 
     * @param request ListAppConversationMessagesRequest
     * @return ListAppConversationMessagesResponse
     */
    public ListAppConversationMessagesResponse listAppConversationMessages(ListAppConversationMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppConversationMessagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>搜索对话列表</p>
     * 
     * @param request ListAppConversationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppConversationsResponse
     */
    public ListAppConversationsResponse listAppConversationsWithOptions(ListAppConversationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.botId)) {
            query.put("BotId", request.botId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endModifyTime)) {
            query.put("EndModifyTime", request.endModifyTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startModifyTime)) {
            query.put("StartModifyTime", request.startModifyTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppConversations"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppConversationsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>搜索对话列表</p>
     * 
     * @param request ListAppConversationsRequest
     * @return ListAppConversationsResponse
     */
    public ListAppConversationsResponse listAppConversations(ListAppConversationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppConversationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of domain redirection rules</p>
     * 
     * @param request ListAppDomainRedirectRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppDomainRedirectRecordsResponse
     */
    public ListAppDomainRedirectRecordsResponse listAppDomainRedirectRecordsWithOptions(ListAppDomainRedirectRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppDomainRedirectRecords"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppDomainRedirectRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of domain redirection rules</p>
     * 
     * @param request ListAppDomainRedirectRecordsRequest
     * @return ListAppDomainRedirectRecordsResponse
     */
    public ListAppDomainRedirectRecordsResponse listAppDomainRedirectRecords(ListAppDomainRedirectRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppDomainRedirectRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List all domain names under the application instance</p>
     * 
     * @param request ListAppInstanceDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppInstanceDomainsResponse
     */
    public ListAppInstanceDomainsResponse listAppInstanceDomainsWithOptions(ListAppInstanceDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainKeyword)) {
            query.put("DomainKeyword", request.domainKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInstanceDomains"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInstanceDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List all domain names under the application instance</p>
     * 
     * @param request ListAppInstanceDomainsRequest
     * @return ListAppInstanceDomainsResponse
     */
    public ListAppInstanceDomainsResponse listAppInstanceDomains(ListAppInstanceDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInstanceDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Website Instance List Query</p>
     * 
     * @param tmpReq ListAppInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppInstancesResponse
     */
    public ListAppInstancesResponse listAppInstancesWithOptions(ListAppInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAppInstancesShrinkRequest request = new ListAppInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statusList)) {
            request.statusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statusList, "StatusList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeBegin)) {
            query.put("EndTimeBegin", request.endTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeEnd)) {
            query.put("EndTimeEnd", request.endTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusListShrink)) {
            query.put("StatusList", request.statusListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInstances"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Website Instance List Query</p>
     * 
     * @param request ListAppInstancesRequest
     * @return ListAppInstancesResponse
     */
    public ListAppInstancesResponse listAppInstances(ListAppInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取码农插件配置列表</p>
     * 
     * @param request ListAppPluginConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppPluginConfigsResponse
     */
    public ListAppPluginConfigsResponse listAppPluginConfigsWithOptions(ListAppPluginConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppPluginConfigs"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppPluginConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取码农插件配置列表</p>
     * 
     * @param request ListAppPluginConfigsRequest
     * @return ListAppPluginConfigsResponse
     */
    public ListAppPluginConfigsResponse listAppPluginConfigs(ListAppPluginConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppPluginConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用插件列表</p>
     * 
     * @param request ListAppPluginsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppPluginsResponse
     */
    public ListAppPluginsResponse listAppPluginsWithOptions(ListAppPluginsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phase)) {
            query.put("Phase", request.phase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppPlugins"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppPluginsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用插件列表</p>
     * 
     * @param request ListAppPluginsRequest
     * @return ListAppPluginsResponse
     */
    public ListAppPluginsResponse listAppPlugins(ListAppPluginsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppPluginsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布历史查询</p>
     * 
     * @param request ListAppPublishHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppPublishHistoryResponse
     */
    public ListAppPublishHistoryResponse listAppPublishHistoryWithOptions(ListAppPublishHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sort)) {
            query.put("Sort", request.sort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.websiteDomain)) {
            query.put("WebsiteDomain", request.websiteDomain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppPublishHistory"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppPublishHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布历史查询</p>
     * 
     * @param request ListAppPublishHistoryRequest
     * @return ListAppPublishHistoryResponse
     */
    public ListAppPublishHistoryResponse listAppPublishHistory(ListAppPublishHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppPublishHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>字典列表查询</p>
     * 
     * @param request ListAppTemplateDictsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppTemplateDictsResponse
     */
    public ListAppTemplateDictsResponse listAppTemplateDictsWithOptions(ListAppTemplateDictsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dictType)) {
            query.put("DictType", request.dictType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppTemplateDicts"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppTemplateDictsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>字典列表查询</p>
     * 
     * @param request ListAppTemplateDictsRequest
     * @return ListAppTemplateDictsResponse
     */
    public ListAppTemplateDictsResponse listAppTemplateDicts(ListAppTemplateDictsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppTemplateDictsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模板列表查询</p>
     * 
     * @param request ListAppTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppTemplatesResponse
     */
    public ListAppTemplatesResponse listAppTemplatesWithOptions(ListAppTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.colorScheme)) {
            query.put("ColorScheme", request.colorScheme);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            query.put("Industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            query.put("ProductVersion", request.productVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppTemplates"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>模板列表查询</p>
     * 
     * @param request ListAppTemplatesRequest
     * @return ListAppTemplatesResponse
     */
    public ListAppTemplatesResponse listAppTemplates(ListAppTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询支付宝ISV插件配置</p>
     * 
     * @param request ListIsvPaymentPluginConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIsvPaymentPluginConfigsResponse
     */
    public ListIsvPaymentPluginConfigsResponse listIsvPaymentPluginConfigsWithOptions(ListIsvPaymentPluginConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIsvPaymentPluginConfigs"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIsvPaymentPluginConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询支付宝ISV插件配置</p>
     * 
     * @param request ListIsvPaymentPluginConfigsRequest
     * @return ListIsvPaymentPluginConfigsResponse
     */
    public ListIsvPaymentPluginConfigsResponse listIsvPaymentPluginConfigs(ListIsvPaymentPluginConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIsvPaymentPluginConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the configuration of a building instance</p>
     * 
     * @param request ModifyAppInstanceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppInstanceSpecResponse
     */
    public ModifyAppInstanceSpecResponse modifyAppInstanceSpecWithOptions(ModifyAppInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            query.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployArea)) {
            query.put("DeployArea", request.deployArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppInstanceSpec"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppInstanceSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the configuration of a building instance</p>
     * 
     * @param request ModifyAppInstanceSpecRequest
     * @return ModifyAppInstanceSpecResponse
     */
    public ModifyAppInstanceSpecResponse modifyAppInstanceSpec(ModifyAppInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppInstanceSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改素材中心文件夹</p>
     * 
     * @param request ModifyMaterialDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMaterialDirectoryResponse
     */
    public ModifyMaterialDirectoryResponse modifyMaterialDirectoryWithOptions(ModifyMaterialDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMaterialDirectory"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMaterialDirectoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改素材中心文件夹</p>
     * 
     * @param request ModifyMaterialDirectoryRequest
     * @return ModifyMaterialDirectoryResponse
     */
    public ModifyMaterialDirectoryResponse modifyMaterialDirectory(ModifyMaterialDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMaterialDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改素材文件</p>
     * 
     * @param request ModifyMaterialFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMaterialFileResponse
     */
    public ModifyMaterialFileResponse modifyMaterialFileWithOptions(ModifyMaterialFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMaterialFile"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMaterialFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改素材文件</p>
     * 
     * @param request ModifyMaterialFileRequest
     * @return ModifyMaterialFileResponse
     */
    public ModifyMaterialFileResponse modifyMaterialFile(ModifyMaterialFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMaterialFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改素材文件状态</p>
     * 
     * @param tmpReq ModifyMaterialFileStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMaterialFileStatusResponse
     */
    public ModifyMaterialFileStatusResponse modifyMaterialFileStatusWithOptions(ModifyMaterialFileStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyMaterialFileStatusShrinkRequest request = new ModifyMaterialFileStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileIds)) {
            request.fileIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileIds, "FileIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIdsShrink)) {
            query.put("FileIds", request.fileIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMaterialFileStatus"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMaterialFileStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改素材文件状态</p>
     * 
     * @param request ModifyMaterialFileStatusRequest
     * @return ModifyMaterialFileStatusResponse
     */
    public ModifyMaterialFileStatusResponse modifyMaterialFileStatus(ModifyMaterialFileStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMaterialFileStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移动素材中心文件夹</p>
     * 
     * @param request MoveMaterialDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveMaterialDirectoryResponse
     */
    public MoveMaterialDirectoryResponse moveMaterialDirectoryWithOptions(MoveMaterialDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDirectoryId)) {
            query.put("ParentDirectoryId", request.parentDirectoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortNum)) {
            query.put("SortNum", request.sortNum);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveMaterialDirectory"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveMaterialDirectoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移动素材中心文件夹</p>
     * 
     * @param request MoveMaterialDirectoryRequest
     * @return MoveMaterialDirectoryResponse
     */
    public MoveMaterialDirectoryResponse moveMaterialDirectory(MoveMaterialDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveMaterialDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移动素材文件</p>
     * 
     * @param tmpReq MoveMaterialFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveMaterialFileResponse
     */
    public MoveMaterialFileResponse moveMaterialFileWithOptions(MoveMaterialFileRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MoveMaterialFileShrinkRequest request = new MoveMaterialFileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.fileIds)) {
            request.fileIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.fileIds, "FileIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileIdsShrink)) {
            query.put("FileIds", request.fileIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveMaterialFile"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveMaterialFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移动素材文件</p>
     * 
     * @param request MoveMaterialFileRequest
     * @return MoveMaterialFileResponse
     */
    public MoveMaterialFileResponse moveMaterialFile(MoveMaterialFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveMaterialFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴操作应用</p>
     * 
     * @param request OperateAppInstanceForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateAppInstanceForPartnerResponse
     */
    public OperateAppInstanceForPartnerResponse operateAppInstanceForPartnerWithOptions(OperateAppInstanceForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateEvent)) {
            query.put("OperateEvent", request.operateEvent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateAppInstanceForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateAppInstanceForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴操作应用</p>
     * 
     * @param request OperateAppInstanceForPartnerRequest
     * @return OperateAppInstanceForPartnerResponse
     */
    public OperateAppInstanceForPartnerResponse operateAppInstanceForPartner(OperateAppInstanceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateAppInstanceForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴操作应用服务</p>
     * 
     * @param request OperateAppServiceForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateAppServiceForPartnerResponse
     */
    public OperateAppServiceForPartnerResponse operateAppServiceForPartnerWithOptions(OperateAppServiceForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateEvent)) {
            query.put("OperateEvent", request.operateEvent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateAppServiceForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateAppServiceForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴操作应用服务</p>
     * 
     * @param request OperateAppServiceForPartnerRequest
     * @return OperateAppServiceForPartnerResponse
     */
    public OperateAppServiceForPartnerResponse operateAppServiceForPartner(OperateAppServiceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateAppServiceForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>切换模板点赞统计</p>
     * 
     * @param request OperateAppTemplateLikeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateAppTemplateLikeResponse
     */
    public OperateAppTemplateLikeResponse operateAppTemplateLikeWithOptions(OperateAppTemplateLikeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.liked)) {
            query.put("Liked", request.liked);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateAppTemplateLike"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateAppTemplateLikeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>切换模板点赞统计</p>
     * 
     * @param request OperateAppTemplateLikeRequest
     * @return OperateAppTemplateLikeResponse
     */
    public OperateAppTemplateLikeResponse operateAppTemplateLike(OperateAppTemplateLikeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateAppTemplateLikeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通用Supabase操作</p>
     * 
     * @param request OperateSupabaseForAdminRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateSupabaseForAdminResponse
     */
    public OperateSupabaseForAdminResponse operateSupabaseForAdminWithOptions(OperateSupabaseForAdminRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeSql)) {
            query.put("ExecuteSql", request.executeSql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByClause)) {
            query.put("OrderByClause", request.orderByClause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whereClause)) {
            query.put("WhereClause", request.whereClause);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateSupabaseForAdmin"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateSupabaseForAdminResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通用Supabase操作</p>
     * 
     * @param request OperateSupabaseForAdminRequest
     * @return OperateSupabaseForAdminResponse
     */
    public OperateSupabaseForAdminResponse operateSupabaseForAdmin(OperateSupabaseForAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateSupabaseForAdminWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发布应用实例</p>
     * 
     * @param request PublishAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishAppInstanceResponse
     */
    public PublishAppInstanceResponse publishAppInstanceWithOptions(PublishAppInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployChannel)) {
            query.put("DeployChannel", request.deployChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalNumber)) {
            query.put("LogicalNumber", request.logicalNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishNumber)) {
            query.put("PublishNumber", request.publishNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weappAction)) {
            query.put("WeappAction", request.weappAction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishAppInstance"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishAppInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布应用实例</p>
     * 
     * @param request PublishAppInstanceRequest
     * @return PublishAppInstanceResponse
     */
    public PublishAppInstanceResponse publishAppInstance(PublishAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送资源计量数据</p>
     * 
     * @param request PushResourceMeasureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushResourceMeasureResponse
     */
    public PushResourceMeasureResponse pushResourceMeasureWithOptions(PushResourceMeasureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.belongId)) {
            query.put("BelongId", request.belongId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.belongIdType)) {
            query.put("BelongIdType", request.belongIdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.measureData)) {
            query.put("MeasureData", request.measureData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaData)) {
            query.put("MetaData", request.metaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCode)) {
            query.put("ResourceCode", request.resourceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useTime)) {
            query.put("UseTime", request.useTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useType)) {
            query.put("UseType", request.useType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushResourceMeasure"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushResourceMeasureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推送资源计量数据</p>
     * 
     * @param request PushResourceMeasureRequest
     * @return PushResourceMeasureResponse
     */
    public PushResourceMeasureResponse pushResourceMeasure(PushResourceMeasureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushResourceMeasureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询灵感值获取明细</p>
     * 
     * @param request QueryInspirationAccountDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInspirationAccountDetailsResponse
     */
    public QueryInspirationAccountDetailsResponse queryInspirationAccountDetailsWithOptions(QueryInspirationAccountDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInspirationAccountDetails"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInspirationAccountDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询灵感值获取明细</p>
     * 
     * @param request QueryInspirationAccountDetailsRequest
     * @return QueryInspirationAccountDetailsResponse
     */
    public QueryInspirationAccountDetailsResponse queryInspirationAccountDetails(QueryInspirationAccountDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInspirationAccountDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询灵感值余额总览</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInspirationBalanceResponse
     */
    public QueryInspirationBalanceResponse queryInspirationBalanceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInspirationBalance"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInspirationBalanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询灵感值余额总览</p>
     * @return QueryInspirationBalanceResponse
     */
    public QueryInspirationBalanceResponse queryInspirationBalance() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInspirationBalanceWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询灵感值消耗明细</p>
     * 
     * @param request QueryInspirationConsumeRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInspirationConsumeRecordsResponse
     */
    public QueryInspirationConsumeRecordsResponse queryInspirationConsumeRecordsWithOptions(QueryInspirationConsumeRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneName)) {
            query.put("SceneName", request.sceneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInspirationConsumeRecords"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInspirationConsumeRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询灵感值消耗明细</p>
     * 
     * @param request QueryInspirationConsumeRecordsRequest
     * @return QueryInspirationConsumeRecordsResponse
     */
    public QueryInspirationConsumeRecordsResponse queryInspirationConsumeRecords(QueryInspirationConsumeRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInspirationConsumeRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材中心文件夹树结构</p>
     * 
     * @param request QueryMaterialDirectoryTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMaterialDirectoryTreeResponse
     */
    public QueryMaterialDirectoryTreeResponse queryMaterialDirectoryTreeWithOptions(QueryMaterialDirectoryTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hiddenPublic)) {
            query.put("HiddenPublic", request.hiddenPublic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.root)) {
            query.put("Root", request.root);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMaterialDirectoryTree"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMaterialDirectoryTreeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材中心文件夹树结构</p>
     * 
     * @param request QueryMaterialDirectoryTreeRequest
     * @return QueryMaterialDirectoryTreeResponse
     */
    public QueryMaterialDirectoryTreeResponse queryMaterialDirectoryTree(QueryMaterialDirectoryTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMaterialDirectoryTreeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材文件详情</p>
     * 
     * @param request QueryMaterialFileDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMaterialFileDetailResponse
     */
    public QueryMaterialFileDetailResponse queryMaterialFileDetailWithOptions(QueryMaterialFileDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileId)) {
            query.put("FileId", request.fileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMaterialFileDetail"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMaterialFileDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材文件详情</p>
     * 
     * @param request QueryMaterialFileDetailRequest
     * @return QueryMaterialFileDetailResponse
     */
    public QueryMaterialFileDetailResponse queryMaterialFileDetail(QueryMaterialFileDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMaterialFileDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Material File List</p>
     * 
     * @param tmpReq QueryMaterialFileListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMaterialFileListResponse
     */
    public QueryMaterialFileListResponse queryMaterialFileListWithOptions(QueryMaterialFileListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMaterialFileListShrinkRequest request = new QueryMaterialFileListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statusList)) {
            request.statusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statusList, "StatusList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.suffixList)) {
            request.suffixListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.suffixList, "SuffixList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.typeList)) {
            request.typeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.typeList, "TypeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxFileSize)) {
            query.put("MaxFileSize", request.maxFileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minFileSize)) {
            query.put("MinFileSize", request.minFileSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusListShrink)) {
            query.put("StatusList", request.statusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suffixListShrink)) {
            query.put("SuffixList", request.suffixListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeListShrink)) {
            query.put("TypeList", request.typeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMaterialFileList"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMaterialFileListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Material File List</p>
     * 
     * @param request QueryMaterialFileListRequest
     * @return QueryMaterialFileListResponse
     */
    public QueryMaterialFileListResponse queryMaterialFileList(QueryMaterialFileListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMaterialFileListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材中心文件概要信息</p>
     * 
     * @param tmpReq QueryMaterialFileSummaryInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMaterialFileSummaryInfoResponse
     */
    public QueryMaterialFileSummaryInfoResponse queryMaterialFileSummaryInfoWithOptions(QueryMaterialFileSummaryInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMaterialFileSummaryInfoShrinkRequest request = new QueryMaterialFileSummaryInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statusList)) {
            request.statusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statusList, "StatusList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.typeList)) {
            request.typeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.typeList, "TypeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusListShrink)) {
            query.put("StatusList", request.statusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeListShrink)) {
            query.put("TypeList", request.typeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMaterialFileSummaryInfo"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMaterialFileSummaryInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材中心文件概要信息</p>
     * 
     * @param request QueryMaterialFileSummaryInfoRequest
     * @return QueryMaterialFileSummaryInfoResponse
     */
    public QueryMaterialFileSummaryInfoResponse queryMaterialFileSummaryInfo(QueryMaterialFileSummaryInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMaterialFileSummaryInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材生产任务详情</p>
     * 
     * @param request QueryMaterialTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMaterialTaskDetailResponse
     */
    public QueryMaterialTaskDetailResponse queryMaterialTaskDetailWithOptions(QueryMaterialTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMaterialTaskDetail"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMaterialTaskDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材生产任务详情</p>
     * 
     * @param request QueryMaterialTaskDetailRequest
     * @return QueryMaterialTaskDetailResponse
     */
    public QueryMaterialTaskDetailResponse queryMaterialTaskDetail(QueryMaterialTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMaterialTaskDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材生产任务列表</p>
     * 
     * @param tmpReq QueryMaterialTaskListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMaterialTaskListResponse
     */
    public QueryMaterialTaskListResponse queryMaterialTaskListWithOptions(QueryMaterialTaskListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMaterialTaskListShrinkRequest request = new QueryMaterialTaskListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statusList)) {
            request.statusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statusList, "StatusList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskTypeList)) {
            request.taskTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskTypeList, "TaskTypeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusListShrink)) {
            query.put("StatusList", request.statusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskTypeListShrink)) {
            query.put("TaskTypeList", request.taskTypeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMaterialTaskList"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMaterialTaskListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询素材生产任务列表</p>
     * 
     * @param request QueryMaterialTaskListRequest
     * @return QueryMaterialTaskListResponse
     */
    public QueryMaterialTaskListResponse queryMaterialTaskList(QueryMaterialTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMaterialTaskListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Supabase Auth配置信息</p>
     * 
     * @param request QuerySupabaseAuthConfigsForAdminRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySupabaseAuthConfigsForAdminResponse
     */
    public QuerySupabaseAuthConfigsForAdminResponse querySupabaseAuthConfigsForAdminWithOptions(QuerySupabaseAuthConfigsForAdminRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authType)) {
            query.put("AuthType", request.authType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySupabaseAuthConfigsForAdmin"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySupabaseAuthConfigsForAdminResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Supabase Auth配置信息</p>
     * 
     * @param request QuerySupabaseAuthConfigsForAdminRequest
     * @return QuerySupabaseAuthConfigsForAdminResponse
     */
    public QuerySupabaseAuthConfigsForAdminResponse querySupabaseAuthConfigsForAdmin(QuerySupabaseAuthConfigsForAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySupabaseAuthConfigsForAdminWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Supabase配置信息</p>
     * 
     * @param request QuerySupabaseConfigsForAdminRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySupabaseConfigsForAdminResponse
     */
    public QuerySupabaseConfigsForAdminResponse querySupabaseConfigsForAdminWithOptions(QuerySupabaseConfigsForAdminRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySupabaseConfigsForAdmin"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySupabaseConfigsForAdminResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Supabase配置信息</p>
     * 
     * @param request QuerySupabaseConfigsForAdminRequest
     * @return QuerySupabaseConfigsForAdminResponse
     */
    public QuerySupabaseConfigsForAdminResponse querySupabaseConfigsForAdmin(QuerySupabaseConfigsForAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySupabaseConfigsForAdminWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询Supabase实例信息</p>
     * 
     * @param request QuerySupabaseInstanceInfoForAdminRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySupabaseInstanceInfoForAdminResponse
     */
    public QuerySupabaseInstanceInfoForAdminResponse querySupabaseInstanceInfoForAdminWithOptions(QuerySupabaseInstanceInfoForAdminRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.env)) {
            query.put("Env", request.env);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderColumn)) {
            query.put("OrderColumn", request.orderColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySupabaseInstanceInfoForAdmin"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySupabaseInstanceInfoForAdminResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询Supabase实例信息</p>
     * 
     * @param request QuerySupabaseInstanceInfoForAdminRequest
     * @return QuerySupabaseInstanceInfoForAdminResponse
     */
    public QuerySupabaseInstanceInfoForAdminResponse querySupabaseInstanceInfoForAdmin(QuerySupabaseInstanceInfoForAdminRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySupabaseInstanceInfoForAdminWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重新连接AI对话</p>
     * 
     * @param request ReconnectAppChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReconnectAppChatResponse
     */
    public ReconnectAppChatResponse reconnectAppChatWithOptions(ReconnectAppChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            query.put("ChatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastEventId)) {
            query.put("LastEventId", request.lastEventId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReconnectAppChat"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReconnectAppChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重新连接AI对话</p>
     * 
     * @param request ReconnectAppChatRequest
     * @return ReconnectAppChatResponse
     */
    public ReconnectAppChatResponse reconnectAppChat(ReconnectAppChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reconnectAppChatWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Refresh ticket</p>
     * 
     * @param request RefreshAppInstanceTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshAppInstanceTicketResponse
     */
    public RefreshAppInstanceTicketResponse refreshAppInstanceTicketWithOptions(RefreshAppInstanceTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshAppInstanceTicket"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshAppInstanceTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Refresh ticket</p>
     * 
     * @param request RefreshAppInstanceTicketRequest
     * @return RefreshAppInstanceTicketResponse
     */
    public RefreshAppInstanceTicketResponse refreshAppInstanceTicket(RefreshAppInstanceTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshAppInstanceTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>渠道业务退款接口</p>
     * 
     * @param request RefundAppInstanceForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundAppInstanceForPartnerResponse
     */
    public RefundAppInstanceForPartnerResponse refundAppInstanceForPartnerWithOptions(RefundAppInstanceForPartnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundReason)) {
            query.put("RefundReason", request.refundReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundAppInstanceForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundAppInstanceForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>渠道业务退款接口</p>
     * 
     * @param request RefundAppInstanceForPartnerRequest
     * @return RefundAppInstanceForPartnerResponse
     */
    public RefundAppInstanceForPartnerResponse refundAppInstanceForPartner(RefundAppInstanceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refundAppInstanceForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renewal of website building instance</p>
     * 
     * @param request RenewAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewAppInstanceResponse
     */
    public RenewAppInstanceResponse renewAppInstanceWithOptions(RenewAppInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAppInstance"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAppInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renewal of website building instance</p>
     * 
     * @param request RenewAppInstanceRequest
     * @return RenewAppInstanceResponse
     */
    public RenewAppInstanceResponse renewAppInstance(RenewAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>续期/刷新沙箱环境</p>
     * 
     * @param request RenewAppSandboxRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewAppSandboxResponse
     */
    public RenewAppSandboxResponse renewAppSandboxWithOptions(RenewAppSandboxRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAppSandbox"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAppSandboxResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>续期/刷新沙箱环境</p>
     * 
     * @param request RenewAppSandboxRequest
     * @return RenewAppSandboxResponse
     */
    public RenewAppSandboxResponse renewAppSandbox(RenewAppSandboxRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewAppSandboxWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>代码快照回滚</p>
     * 
     * @param request RollbackAppCodeSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackAppCodeSnapshotResponse
     */
    public RollbackAppCodeSnapshotResponse rollbackAppCodeSnapshotWithOptions(RollbackAppCodeSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.siteId)) {
            query.put("SiteId", request.siteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLogicalNumber)) {
            query.put("TargetLogicalNumber", request.targetLogicalNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackAppCodeSnapshot"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackAppCodeSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>代码快照回滚</p>
     * 
     * @param request RollbackAppCodeSnapshotRequest
     * @return RollbackAppCodeSnapshotResponse
     */
    public RollbackAppCodeSnapshotResponse rollbackAppCodeSnapshot(RollbackAppCodeSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackAppCodeSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>回滚应用实例发布</p>
     * 
     * @param request RollbackAppInstancePublishRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackAppInstancePublishResponse
     */
    public RollbackAppInstancePublishResponse rollbackAppInstancePublishWithOptions(RollbackAppInstancePublishRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployChannel)) {
            query.put("DeployChannel", request.deployChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishNumber)) {
            query.put("PublishNumber", request.publishNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quickRollback)) {
            query.put("QuickRollback", request.quickRollback);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackAppInstancePublish"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackAppInstancePublishResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>回滚应用实例发布</p>
     * 
     * @param request RollbackAppInstancePublishRequest
     * @return RollbackAppInstancePublishResponse
     */
    public RollbackAppInstancePublishResponse rollbackAppInstancePublish(RollbackAppInstancePublishRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackAppInstancePublishWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存需求</p>
     * 
     * @param request SaveAppRequirementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveAppRequirementResponse
     */
    public SaveAppRequirementResponse saveAppRequirementWithOptions(SaveAppRequirementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.prd)) {
            body.put("Prd", request.prd);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveAppRequirement"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveAppRequirementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存需求</p>
     * 
     * @param request SaveAppRequirementRequest
     * @return SaveAppRequirementResponse
     */
    public SaveAppRequirementResponse saveAppRequirement(SaveAppRequirementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveAppRequirementWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>保存Supabase密钥</p>
     * 
     * @param request SaveAppSupabaseSecretsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveAppSupabaseSecretsResponse
     */
    public SaveAppSupabaseSecretsResponse saveAppSupabaseSecretsWithOptions(SaveAppSupabaseSecretsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretsJson)) {
            query.put("SecretsJson", request.secretsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveAppSupabaseSecrets"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveAppSupabaseSecretsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>保存Supabase密钥</p>
     * 
     * @param request SaveAppSupabaseSecretsRequest
     * @return SaveAppSupabaseSecretsResponse
     */
    public SaveAppSupabaseSecretsResponse saveAppSupabaseSecrets(SaveAppSupabaseSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveAppSupabaseSecretsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>图片检索</p>
     * 
     * @param tmpReq SearchImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchImageResponse
     */
    public SearchImageResponse searchImageWithOptions(SearchImageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchImageShrinkRequest request = new SearchImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.colorHex)) {
            query.put("ColorHex", request.colorHex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasPerson)) {
            query.put("HasPerson", request.hasPerson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCategory)) {
            query.put("ImageCategory", request.imageCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageRatio)) {
            query.put("ImageRatio", request.imageRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxHeight)) {
            query.put("MaxHeight", request.maxHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxWidth)) {
            query.put("MaxWidth", request.maxWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minHeight)) {
            query.put("MinHeight", request.minHeight);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minWidth)) {
            query.put("MinWidth", request.minWidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossKey)) {
            query.put("OssKey", request.ossKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            query.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            query.put("Text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchImage"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>图片检索</p>
     * 
     * @param request SearchImageRequest
     * @return SearchImageResponse
     */
    public SearchImageResponse searchImage(SearchImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Set the SSL certificate for a domain</p>
     * 
     * @param request SetAppDomainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAppDomainCertificateResponse
     */
    public SetAppDomainCertificateResponse setAppDomainCertificateWithOptions(SetAppDomainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateName)) {
            query.put("CertificateName", request.certificateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateType)) {
            query.put("CertificateType", request.certificateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateKey)) {
            query.put("PrivateKey", request.privateKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKey)) {
            query.put("PublicKey", request.publicKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAppDomainCertificate"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAppDomainCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Set the SSL certificate for a domain</p>
     * 
     * @param request SetAppDomainCertificateRequest
     * @return SetAppDomainCertificateResponse
     */
    public SetAppDomainCertificateResponse setAppDomainCertificate(SetAppDomainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAppDomainCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交SEO索引</p>
     * 
     * @param request SubmitAppSeoIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitAppSeoIndexResponse
     */
    public SubmitAppSeoIndexResponse submitAppSeoIndexWithOptions(SubmitAppSeoIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seType)) {
            query.put("SeType", request.seType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitLater)) {
            query.put("SubmitLater", request.submitLater);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitAppSeoIndex"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitAppSeoIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交SEO索引</p>
     * 
     * @param request SubmitAppSeoIndexRequest
     * @return SubmitAppSeoIndexResponse
     */
    public SubmitAppSeoIndexResponse submitAppSeoIndex(SubmitAppSeoIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitAppSeoIndexWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交素材生产任务</p>
     * 
     * @param request SubmitMaterialTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitMaterialTaskResponse
     */
    public SubmitMaterialTaskResponse submitMaterialTaskWithOptions(SubmitMaterialTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskParam)) {
            query.put("TaskParam", request.taskParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitMaterialTask"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitMaterialTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交素材生产任务</p>
     * 
     * @param request SubmitMaterialTaskRequest
     * @return SubmitMaterialTaskResponse
     */
    public SubmitMaterialTaskResponse submitMaterialTask(SubmitMaterialTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitMaterialTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>切换到指定对话</p>
     * 
     * @param request SwitchAppConversationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchAppConversationResponse
     */
    public SwitchAppConversationResponse switchAppConversationWithOptions(SwitchAppConversationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.botId)) {
            query.put("BotId", request.botId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchAppConversation"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchAppConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>切换到指定对话</p>
     * 
     * @param request SwitchAppConversationRequest
     * @return SwitchAppConversationResponse
     */
    public SwitchAppConversationResponse switchAppConversation(SwitchAppConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchAppConversationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴同步应用实例</p>
     * 
     * @param tmpReq SyncAppInstanceForPartnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncAppInstanceForPartnerResponse
     */
    public SyncAppInstanceForPartnerResponse syncAppInstanceForPartnerWithOptions(SyncAppInstanceForPartnerRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncAppInstanceForPartnerShrinkRequest request = new SyncAppInstanceForPartnerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appInstance)) {
            request.appInstanceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appInstance, "AppInstance", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceShrink)) {
            query.put("AppInstance", request.appInstanceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventType)) {
            query.put("EventType", request.eventType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operator)) {
            query.put("Operator", request.operator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceBizId)) {
            query.put("SourceBizId", request.sourceBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncAppInstanceForPartner"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncAppInstanceForPartnerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作伙伴同步应用实例</p>
     * 
     * @param request SyncAppInstanceForPartnerRequest
     * @return SyncAppInstanceForPartnerResponse
     */
    public SyncAppInstanceForPartnerResponse syncAppInstanceForPartner(SyncAppInstanceForPartnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncAppInstanceForPartnerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbind Application Domain</p>
     * 
     * @param request UnbindAppDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindAppDomainResponse
     */
    public UnbindAppDomainResponse unbindAppDomainWithOptions(UnbindAppDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindAppDomain"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindAppDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbind Application Domain</p>
     * 
     * @param request UnbindAppDomainRequest
     * @return UnbindAppDomainResponse
     */
    public UnbindAppDomainResponse unbindAppDomain(UnbindAppDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindAppDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新消息内容</p>
     * 
     * @param request UpdateAppChatMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppChatMessageResponse
     */
    public UpdateAppChatMessageResponse updateAppChatMessageWithOptions(UpdateAppChatMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addedMetaData)) {
            query.put("AddedMetaData", request.addedMetaData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppChatMessage"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppChatMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新消息内容</p>
     * 
     * @param request UpdateAppChatMessageRequest
     * @return UpdateAppChatMessageResponse
     */
    public UpdateAppChatMessageResponse updateAppChatMessage(UpdateAppChatMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppChatMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>编辑JSX代码</p>
     * 
     * @param request UpdateAppCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppCodeResponse
     */
    public UpdateAppCodeResponse updateAppCodeWithOptions(UpdateAppCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppCode"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>编辑JSX代码</p>
     * 
     * @param request UpdateAppCodeRequest
     * @return UpdateAppCodeResponse
     */
    public UpdateAppCodeResponse updateAppCode(UpdateAppCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新文件</p>
     * 
     * @param request UpdateAppFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppFileResponse
     */
    public UpdateAppFileResponse updateAppFileWithOptions(UpdateAppFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationId)) {
            query.put("ConversationId", request.conversationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppFile"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新文件</p>
     * 
     * @param request UpdateAppFileRequest
     * @return UpdateAppFileResponse
     */
    public UpdateAppFileResponse updateAppFile(UpdateAppFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>建站实例变配</p>
     * 
     * @param tmpReq UpdateAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppInstanceResponse
     */
    public UpdateAppInstanceResponse updateAppInstanceWithOptions(UpdateAppInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAppInstanceShrinkRequest request = new UpdateAppInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationType)) {
            query.put("ApplicationType", request.applicationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deployArea)) {
            query.put("DeployArea", request.deployArea);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extend)) {
            query.put("Extend", request.extend);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iconUrl)) {
            query.put("IconUrl", request.iconUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteVersion)) {
            query.put("SiteVersion", request.siteVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thumbnailUrl)) {
            query.put("ThumbnailUrl", request.thumbnailUrl);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppInstance"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>建站实例变配</p>
     * 
     * @param request UpdateAppInstanceRequest
     * @return UpdateAppInstanceResponse
     */
    public UpdateAppInstanceResponse updateAppInstance(UpdateAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>WanXiaoZhi 2.0 AI Conversation</p>
     * 
     * <b>summary</b> : 
     * <p>Update SEO Index Status</p>
     * 
     * @param request UpdateAppSeoStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppSeoStatusResponse
     */
    public UpdateAppSeoStatusResponse updateAppSeoStatusWithOptions(UpdateAppSeoStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seType)) {
            query.put("SeType", request.seType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppSeoStatus"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppSeoStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>WanXiaoZhi 2.0 AI Conversation</p>
     * 
     * <b>summary</b> : 
     * <p>Update SEO Index Status</p>
     * 
     * @param request UpdateAppSeoStatusRequest
     * @return UpdateAppSeoStatusResponse
     */
    public UpdateAppSeoStatusResponse updateAppSeoStatus(UpdateAppSeoStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppSeoStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Supabase认证配置更新</p>
     * 
     * @param request UpdateAppSupabaseAuthConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppSupabaseAuthConfigResponse
     */
    public UpdateAppSupabaseAuthConfigResponse updateAppSupabaseAuthConfigWithOptions(UpdateAppSupabaseAuthConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configsJson)) {
            query.put("ConfigsJson", request.configsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppSupabaseAuthConfig"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppSupabaseAuthConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Supabase认证配置更新</p>
     * 
     * @param request UpdateAppSupabaseAuthConfigRequest
     * @return UpdateAppSupabaseAuthConfigResponse
     */
    public UpdateAppSupabaseAuthConfigResponse updateAppSupabaseAuthConfig(UpdateAppSupabaseAuthConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppSupabaseAuthConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Supabase密钥</p>
     * 
     * @param request UpdateAppSupabaseSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppSupabaseSecretResponse
     */
    public UpdateAppSupabaseSecretResponse updateAppSupabaseSecretWithOptions(UpdateAppSupabaseSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretKey)) {
            query.put("SecretKey", request.secretKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretName)) {
            query.put("SecretName", request.secretName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretType)) {
            query.put("SecretType", request.secretType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretValue)) {
            query.put("SecretValue", request.secretValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppSupabaseSecret"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppSupabaseSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Supabase密钥</p>
     * 
     * @param request UpdateAppSupabaseSecretRequest
     * @return UpdateAppSupabaseSecretResponse
     */
    public UpdateAppSupabaseSecretResponse updateAppSupabaseSecret(UpdateAppSupabaseSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppSupabaseSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传到站点根目录</p>
     * 
     * @param request UploadAppSiteValidationFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadAppSiteValidationFileResponse
     */
    public UploadAppSiteValidationFileResponse uploadAppSiteValidationFileWithOptions(UploadAppSiteValidationFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.file)) {
            query.put("File", request.file);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileContent)) {
            query.put("FileContent", request.fileContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.siteHost)) {
            query.put("SiteHost", request.siteHost);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadAppSiteValidationFile"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadAppSiteValidationFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传到站点根目录</p>
     * 
     * @param request UploadAppSiteValidationFileRequest
     * @return UploadAppSiteValidationFileResponse
     */
    public UploadAppSiteValidationFileResponse uploadAppSiteValidationFile(UploadAppSiteValidationFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadAppSiteValidationFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上传素材文件</p>
     * 
     * @param request UploadMaterialFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadMaterialFileResponse
     */
    public UploadMaterialFileResponse uploadMaterialFileWithOptions(UploadMaterialFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadMaterialFile"),
            new TeaPair("version", "2025-04-29"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadMaterialFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上传素材文件</p>
     * 
     * @param request UploadMaterialFileRequest
     * @return UploadMaterialFileResponse
     */
    public UploadMaterialFileResponse uploadMaterialFile(UploadMaterialFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadMaterialFileWithOptions(request, runtime);
    }
}
