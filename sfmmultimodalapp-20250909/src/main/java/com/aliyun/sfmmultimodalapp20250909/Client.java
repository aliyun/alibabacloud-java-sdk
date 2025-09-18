// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909;

import com.aliyun.tea.*;
import com.aliyun.sfmmultimodalapp20250909.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("sfmmultimodalapp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>指令创建</p>
     * 
     * @param tmpReq CreateCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCommandResponse
     */
    public CreateCommandResponse createCommandWithOptions(CreateCommandRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCommandShrinkRequest request = new CreateCommandShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.toolExamples)) {
            request.toolExamplesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.toolExamples, "ToolExamples", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.toolParams)) {
            request.toolParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.toolParams, "ToolParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolDescription)) {
            query.put("ToolDescription", request.toolDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolExamplesShrink)) {
            query.put("ToolExamples", request.toolExamplesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolName)) {
            query.put("ToolName", request.toolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolParamsShrink)) {
            query.put("ToolParams", request.toolParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCommand"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>指令创建</p>
     * 
     * @param request CreateCommandRequest
     * @return CreateCommandResponse
     */
    public CreateCommandResponse createCommand(CreateCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建多模态应用</p>
     * 
     * @param tmpReq CreateMmAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMmAppResponse
     */
    public CreateMmAppResponse createMmAppWithOptions(CreateMmAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateMmAppShrinkRequest request = new CreateMmAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bindingConfig)) {
            request.bindingConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bindingConfig, "BindingConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.conversationConfig)) {
            request.conversationConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.conversationConfig, "ConversationConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.modelConfig)) {
            request.modelConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.modelConfig, "ModelConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindingConfigShrink)) {
            query.put("BindingConfig", request.bindingConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationConfigShrink)) {
            query.put("ConversationConfig", request.conversationConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelConfigShrink)) {
            query.put("ModelConfig", request.modelConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMmApp"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMmAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建多模态应用</p>
     * 
     * @param request CreateMmAppRequest
     * @return CreateMmAppResponse
     */
    public CreateMmAppResponse createMmApp(CreateMmAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMmAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指令</p>
     * 
     * @param request DeleteCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCommandResponse
     */
    public DeleteCommandResponse deleteCommandWithOptions(DeleteCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolId)) {
            query.put("ToolId", request.toolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCommand"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指令</p>
     * 
     * @param request DeleteCommandRequest
     * @return DeleteCommandResponse
     */
    public DeleteCommandResponse deleteCommand(DeleteCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除多模态应用</p>
     * 
     * @param request DeleteMmAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMmAppResponse
     */
    public DeleteMmAppResponse deleteMmAppWithOptions(DeleteMmAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMmApp"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMmAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除多模态应用</p>
     * 
     * @param request DeleteMmAppRequest
     * @return DeleteMmAppResponse
     */
    public DeleteMmAppResponse deleteMmApp(DeleteMmAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMmAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指令详情</p>
     * 
     * @param request DescribeCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCommandResponse
     */
    public DescribeCommandResponse describeCommandWithOptions(DescribeCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolId)) {
            query.put("ToolId", request.toolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCommand"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>指令详情</p>
     * 
     * @param request DescribeCommandRequest
     * @return DescribeCommandResponse
     */
    public DescribeCommandResponse describeCommand(DescribeCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>多模态应用详情</p>
     * 
     * @param request DescribeMmAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMmAppResponse
     */
    public DescribeMmAppResponse describeMmAppWithOptions(DescribeMmAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMmApp"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMmAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>多模态应用详情</p>
     * 
     * @param request DescribeMmAppRequest
     * @return DescribeMmAppResponse
     */
    public DescribeMmAppResponse describeMmApp(DescribeMmAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMmAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指令列表</p>
     * 
     * @param request ListCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCommandResponse
     */
    public ListCommandResponse listCommandWithOptions(ListCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolName)) {
            query.put("ToolName", request.toolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCommand"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>指令列表</p>
     * 
     * @param request ListCommandRequest
     * @return ListCommandResponse
     */
    public ListCommandResponse listCommand(ListCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取多模态应用列表</p>
     * 
     * @param request ListMmAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMmAppResponse
     */
    public ListMmAppResponse listMmAppWithOptions(ListMmAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
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
            new TeaPair("action", "ListMmApp"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMmAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取多模态应用列表</p>
     * 
     * @param request ListMmAppRequest
     * @return ListMmAppResponse
     */
    public ListMmAppResponse listMmApp(ListMmAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMmAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用发布列表</p>
     * 
     * @param request ListPublishedMmAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublishedMmAppResponse
     */
    public ListPublishedMmAppResponse listPublishedMmAppWithOptions(ListPublishedMmAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
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
            new TeaPair("action", "ListPublishedMmApp"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublishedMmAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用发布列表</p>
     * 
     * @param request ListPublishedMmAppRequest
     * @return ListPublishedMmAppResponse
     */
    public ListPublishedMmAppResponse listPublishedMmApp(ListPublishedMmAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublishedMmAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>多模态应用发布</p>
     * 
     * @param request PublishMmAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishMmAppResponse
     */
    public PublishMmAppResponse publishMmAppWithOptions(PublishMmAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishMmApp"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishMmAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>多模态应用发布</p>
     * 
     * @param request PublishMmAppRequest
     * @return PublishMmAppResponse
     */
    public PublishMmAppResponse publishMmApp(PublishMmAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishMmAppWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>指令更新</p>
     * 
     * @param tmpReq UpdateCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCommandResponse
     */
    public UpdateCommandResponse updateCommandWithOptions(UpdateCommandRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCommandShrinkRequest request = new UpdateCommandShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.toolExamples)) {
            request.toolExamplesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.toolExamples, "ToolExamples", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.toolParams)) {
            request.toolParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.toolParams, "ToolParams", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            query.put("DomainCode", request.domainCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolDescription)) {
            query.put("ToolDescription", request.toolDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolExamplesShrink)) {
            query.put("ToolExamples", request.toolExamplesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolId)) {
            query.put("ToolId", request.toolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolName)) {
            query.put("ToolName", request.toolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toolParamsShrink)) {
            query.put("ToolParams", request.toolParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCommand"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>指令更新</p>
     * 
     * @param request UpdateCommandRequest
     * @return UpdateCommandResponse
     */
    public UpdateCommandResponse updateCommand(UpdateCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>多模态应用更新</p>
     * 
     * @param tmpReq UpdateMmAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMmAppResponse
     */
    public UpdateMmAppResponse updateMmAppWithOptions(UpdateMmAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateMmAppShrinkRequest request = new UpdateMmAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bindingConfig)) {
            request.bindingConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bindingConfig, "BindingConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.conversationConfig)) {
            request.conversationConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.conversationConfig, "ConversationConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.modelConfig)) {
            request.modelConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.modelConfig, "ModelConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindingConfigShrink)) {
            query.put("BindingConfig", request.bindingConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conversationConfigShrink)) {
            query.put("ConversationConfig", request.conversationConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelConfigShrink)) {
            query.put("ModelConfig", request.modelConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            query.put("Prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMmApp"),
            new TeaPair("version", "2025-09-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMmAppResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>多模态应用更新</p>
     * 
     * @param request UpdateMmAppRequest
     * @return UpdateMmAppResponse
     */
    public UpdateMmAppResponse updateMmApp(UpdateMmAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMmAppWithOptions(request, runtime);
    }
}
