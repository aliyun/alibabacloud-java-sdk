// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starops20260428;

import com.aliyun.tea.*;
import com.aliyun.starops20260428.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("starops", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建对话</p>
     * 
     * @param request CreateChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatResponse
     */
    public CreateChatResponse createChatWithOptions(CreateChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalEmployeeName)) {
            body.put("digitalEmployeeName", request.digitalEmployeeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messages)) {
            body.put("messages", request.messages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadId)) {
            body.put("threadId", request.threadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChat"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/chat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建对话</p>
     * 
     * @param request CreateChatRequest
     * @return CreateChatResponse
     */
    public CreateChatResponse createChat(CreateChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChatWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建DigitalEmployee</p>
     * 
     * @param request CreateDigitalEmployeeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDigitalEmployeeResponse
     */
    public CreateDigitalEmployeeResponse createDigitalEmployeeWithOptions(CreateDigitalEmployeeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            body.put("attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRule)) {
            body.put("defaultRule", request.defaultRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledges)) {
            body.put("knowledges", request.knowledges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("roleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDigitalEmployee"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digital-employee"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDigitalEmployeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建DigitalEmployee</p>
     * 
     * @param request CreateDigitalEmployeeRequest
     * @return CreateDigitalEmployeeResponse
     */
    public CreateDigitalEmployeeResponse createDigitalEmployee(CreateDigitalEmployeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDigitalEmployeeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建技能</p>
     * 
     * @param request CreateDigitalEmployeeSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDigitalEmployeeSkillResponse
     */
    public CreateDigitalEmployeeSkillResponse createDigitalEmployeeSkillWithOptions(String name, CreateDigitalEmployeeSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            body.put("skillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDigitalEmployeeSkill"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skill"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDigitalEmployeeSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建技能</p>
     * 
     * @param request CreateDigitalEmployeeSkillRequest
     * @return CreateDigitalEmployeeSkillResponse
     */
    public CreateDigitalEmployeeSkillResponse createDigitalEmployeeSkill(String name, CreateDigitalEmployeeSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDigitalEmployeeSkillWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建 MCP 服务</p>
     * 
     * @param request CreateMcpServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMcpServiceResponse
     */
    public CreateMcpServiceResponse createMcpServiceWithOptions(String name, CreateMcpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connection)) {
            body.put("connection", request.connection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcpServiceName)) {
            body.put("mcpServiceName", request.mcpServiceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tools)) {
            body.put("tools", request.tools);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMcpService"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/mcpService"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMcpServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建 MCP 服务</p>
     * 
     * @param request CreateMcpServiceRequest
     * @return CreateMcpServiceResponse
     */
    public CreateMcpServiceResponse createMcpService(String name, CreateMcpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMcpServiceWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建会话</p>
     * 
     * @param request CreateThreadRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateThreadResponse
     */
    public CreateThreadResponse createThreadWithOptions(String name, CreateThreadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            body.put("attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.variables)) {
            body.put("variables", request.variables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateThread"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/thread"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateThreadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建会话</p>
     * 
     * @param request CreateThreadRequest
     * @return CreateThreadResponse
     */
    public CreateThreadResponse createThread(String name, CreateThreadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createThreadWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建票据</p>
     * 
     * @param request CreateTicketRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicketWithOptions(CreateTicketRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenExpirationTime)) {
            query.put("accessTokenExpirationTime", request.accessTokenExpirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTime)) {
            query.put("expirationTime", request.expirationTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTicket"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/tickets"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTicketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建票据</p>
     * 
     * @param request CreateTicketRequest
     * @return CreateTicketResponse
     */
    public CreateTicketResponse createTicket(CreateTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTicketWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除DigitalEmployee</p>
     * 
     * @param request DeleteDigitalEmployeeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDigitalEmployeeResponse
     */
    public DeleteDigitalEmployeeResponse deleteDigitalEmployeeWithOptions(String name, DeleteDigitalEmployeeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDigitalEmployee"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digital-employee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDigitalEmployeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除DigitalEmployee</p>
     * 
     * @param request DeleteDigitalEmployeeRequest
     * @return DeleteDigitalEmployeeResponse
     */
    public DeleteDigitalEmployeeResponse deleteDigitalEmployee(String name, DeleteDigitalEmployeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDigitalEmployeeWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除技能</p>
     * 
     * @param request DeleteDigitalEmployeeSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDigitalEmployeeSkillResponse
     */
    public DeleteDigitalEmployeeSkillResponse deleteDigitalEmployeeSkillWithOptions(String name, String skillName, DeleteDigitalEmployeeSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDigitalEmployeeSkill"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skill/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDigitalEmployeeSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除技能</p>
     * 
     * @param request DeleteDigitalEmployeeSkillRequest
     * @return DeleteDigitalEmployeeSkillResponse
     */
    public DeleteDigitalEmployeeSkillResponse deleteDigitalEmployeeSkill(String name, String skillName, DeleteDigitalEmployeeSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDigitalEmployeeSkillWithOptions(name, skillName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除 MCP 服务</p>
     * 
     * @param request DeleteMcpServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMcpServiceResponse
     */
    public DeleteMcpServiceResponse deleteMcpServiceWithOptions(String name, String mcpServiceName, DeleteMcpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMcpService"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/mcpService/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServiceName) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMcpServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除 MCP 服务</p>
     * 
     * @param request DeleteMcpServiceRequest
     * @return DeleteMcpServiceResponse
     */
    public DeleteMcpServiceResponse deleteMcpService(String name, String mcpServiceName, DeleteMcpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMcpServiceWithOptions(name, mcpServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除会话</p>
     * 
     * @param request DeleteThreadRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteThreadResponse
     */
    public DeleteThreadResponse deleteThreadWithOptions(String name, String threadId, DeleteThreadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteThread"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/thread/" + com.aliyun.openapiutil.Client.getEncodeParam(threadId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteThreadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除会话</p>
     * 
     * @param request DeleteThreadRequest
     * @return DeleteThreadResponse
     */
    public DeleteThreadResponse deleteThread(String name, String threadId, DeleteThreadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteThreadWithOptions(name, threadId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>预览远端 MCP 工具列表</p>
     * 
     * @param request FetchRemoteMcpToolsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return FetchRemoteMcpToolsResponse
     */
    public FetchRemoteMcpToolsResponse fetchRemoteMcpToolsWithOptions(FetchRemoteMcpToolsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connection)) {
            body.put("connection", request.connection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("network", request.network);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FetchRemoteMcpTools"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/mcptools"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FetchRemoteMcpToolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>预览远端 MCP 工具列表</p>
     * 
     * @param request FetchRemoteMcpToolsRequest
     * @return FetchRemoteMcpToolsResponse
     */
    public FetchRemoteMcpToolsResponse fetchRemoteMcpTools(FetchRemoteMcpToolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.fetchRemoteMcpToolsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载小型产物文件</p>
     * 
     * @param request GetArtifactRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetArtifactResponse
     */
    public GetArtifactResponse getArtifactWithOptions(String name, GetArtifactRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactPath)) {
            query.put("artifactPath", request.artifactPath);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetArtifact"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/artifact"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "binary")
        ));
        GetArtifactResponse res = new GetArtifactResponse();
        java.util.Map<String, Object> tmp = com.aliyun.teautil.Common.assertAsMap(this.callApi(params, req, runtime));
        if (!com.aliyun.teautil.Common.isUnset(tmp.get("body"))) {
            java.io.InputStream respBody = com.aliyun.teautil.Common.assertAsReadable(tmp.get("body"));
            res.body = respBody;
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("headers"))) {
            java.util.Map<String, Object> respHeaders = com.aliyun.teautil.Common.assertAsMap(tmp.get("headers"));
            res.headers = com.aliyun.teautil.Common.stringifyMapValue(respHeaders);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.get("statusCode"))) {
            Integer statusCode = com.aliyun.teautil.Common.assertAsInteger(tmp.get("statusCode"));
            res.statusCode = statusCode;
        }

        return res;
    }

    /**
     * <b>summary</b> : 
     * <p>下载小型产物文件</p>
     * 
     * @param request GetArtifactRequest
     * @return GetArtifactResponse
     */
    public GetArtifactResponse getArtifact(String name, GetArtifactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getArtifactWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 DigitalEmployee</p>
     * 
     * @param request GetDigitalEmployeeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDigitalEmployeeResponse
     */
    public GetDigitalEmployeeResponse getDigitalEmployeeWithOptions(String name, GetDigitalEmployeeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDigitalEmployee"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digital-employee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDigitalEmployeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 DigitalEmployee</p>
     * 
     * @param request GetDigitalEmployeeRequest
     * @return GetDigitalEmployeeResponse
     */
    public GetDigitalEmployeeResponse getDigitalEmployee(String name, GetDigitalEmployeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDigitalEmployeeWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取技能详情</p>
     * 
     * @param request GetDigitalEmployeeSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDigitalEmployeeSkillResponse
     */
    public GetDigitalEmployeeSkillResponse getDigitalEmployeeSkillWithOptions(String name, String skillName, GetDigitalEmployeeSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDigitalEmployeeSkill"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skill/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDigitalEmployeeSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取技能详情</p>
     * 
     * @param request GetDigitalEmployeeSkillRequest
     * @return GetDigitalEmployeeSkillResponse
     */
    public GetDigitalEmployeeSkillResponse getDigitalEmployeeSkill(String name, String skillName, GetDigitalEmployeeSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDigitalEmployeeSkillWithOptions(name, skillName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 MCP 服务</p>
     * 
     * @param request GetMcpServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMcpServiceResponse
     */
    public GetMcpServiceResponse getMcpServiceWithOptions(String name, String mcpServiceName, GetMcpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMcpService"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/mcpService/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServiceName) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMcpServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 MCP 服务</p>
     * 
     * @param request GetMcpServiceRequest
     * @return GetMcpServiceResponse
     */
    public GetMcpServiceResponse getMcpService(String name, String mcpServiceName, GetMcpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMcpServiceWithOptions(name, mcpServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话</p>
     * 
     * @param request GetThreadRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetThreadResponse
     */
    public GetThreadResponse getThreadWithOptions(String name, String threadId, GetThreadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetThread"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/thread/" + com.aliyun.openapiutil.Client.getEncodeParam(threadId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetThreadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话</p>
     * 
     * @param request GetThreadRequest
     * @return GetThreadResponse
     */
    public GetThreadResponse getThread(String name, String threadId, GetThreadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getThreadWithOptions(name, threadId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话数据</p>
     * 
     * @param request GetThreadDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetThreadDataResponse
     */
    public GetThreadDataResponse getThreadDataWithOptions(String name, String threadId, GetThreadDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetThreadData"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/thread/" + com.aliyun.openapiutil.Client.getEncodeParam(threadId) + "/data"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetThreadDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取会话数据</p>
     * 
     * @param request GetThreadDataRequest
     * @return GetThreadDataResponse
     */
    public GetThreadDataResponse getThreadData(String name, String threadId, GetThreadDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getThreadDataWithOptions(name, threadId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出产物文件</p>
     * 
     * @param request ListArtifactsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListArtifactsResponse
     */
    public ListArtifactsResponse listArtifactsWithOptions(String name, ListArtifactsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.artifactPath)) {
            query.put("artifactPath", request.artifactPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListArtifacts"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/artifacts"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListArtifactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出产物文件</p>
     * 
     * @param request ListArtifactsRequest
     * @return ListArtifactsResponse
     */
    public ListArtifactsResponse listArtifacts(String name, ListArtifactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listArtifactsWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出技能版本</p>
     * 
     * @param request ListDigitalEmployeeSkillVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDigitalEmployeeSkillVersionsResponse
     */
    public ListDigitalEmployeeSkillVersionsResponse listDigitalEmployeeSkillVersionsWithOptions(String name, String skillName, ListDigitalEmployeeSkillVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDigitalEmployeeSkillVersions"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skill/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + "/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDigitalEmployeeSkillVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出技能版本</p>
     * 
     * @param request ListDigitalEmployeeSkillVersionsRequest
     * @return ListDigitalEmployeeSkillVersionsResponse
     */
    public ListDigitalEmployeeSkillVersionsResponse listDigitalEmployeeSkillVersions(String name, String skillName, ListDigitalEmployeeSkillVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDigitalEmployeeSkillVersionsWithOptions(name, skillName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出技能</p>
     * 
     * @param request ListDigitalEmployeeSkillsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDigitalEmployeeSkillsResponse
     */
    public ListDigitalEmployeeSkillsResponse listDigitalEmployeeSkillsWithOptions(String name, ListDigitalEmployeeSkillsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            query.put("skillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDigitalEmployeeSkills"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skills"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDigitalEmployeeSkillsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出技能</p>
     * 
     * @param request ListDigitalEmployeeSkillsRequest
     * @return ListDigitalEmployeeSkillsResponse
     */
    public ListDigitalEmployeeSkillsResponse listDigitalEmployeeSkills(String name, ListDigitalEmployeeSkillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDigitalEmployeeSkillsWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出资源DigitalEmployee</p>
     * 
     * @param tmpReq ListDigitalEmployeesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDigitalEmployeesResponse
     */
    public ListDigitalEmployeesResponse listDigitalEmployeesWithOptions(ListDigitalEmployeesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDigitalEmployeesShrinkRequest request = new ListDigitalEmployeesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.employeeType)) {
            query.put("employeeType", request.employeeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("resourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDigitalEmployees"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digital-employee"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDigitalEmployeesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出资源DigitalEmployee</p>
     * 
     * @param request ListDigitalEmployeesRequest
     * @return ListDigitalEmployeesResponse
     */
    public ListDigitalEmployeesResponse listDigitalEmployees(ListDigitalEmployeesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDigitalEmployeesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询数字员工下的 MCP 服务列表</p>
     * 
     * @param request ListMcpServicesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMcpServicesResponse
     */
    public ListMcpServicesResponse listMcpServicesWithOptions(String name, ListMcpServicesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMcpServices"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/mcpServices"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMcpServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询数字员工下的 MCP 服务列表</p>
     * 
     * @param request ListMcpServicesRequest
     * @return ListMcpServicesResponse
     */
    public ListMcpServicesResponse listMcpServices(String name, ListMcpServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMcpServicesWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出会话</p>
     * 
     * @param tmpReq ListThreadsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListThreadsResponse
     */
    public ListThreadsResponse listThreadsWithOptions(String name, ListThreadsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListThreadsShrinkRequest request = new ListThreadsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filter)) {
            request.filterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filter, "filter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterShrink)) {
            query.put("filter", request.filterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeMission)) {
            query.put("includeMission", request.includeMission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threadId)) {
            query.put("threadId", request.threadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListThreads"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/threads"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListThreadsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出会话</p>
     * 
     * @param request ListThreadsRequest
     * @return ListThreadsResponse
     */
    public ListThreadsResponse listThreads(String name, ListThreadsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listThreadsWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新UpdateDigitalEmployee</p>
     * 
     * @param request UpdateDigitalEmployeeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDigitalEmployeeResponse
     */
    public UpdateDigitalEmployeeResponse updateDigitalEmployeeWithOptions(String name, UpdateDigitalEmployeeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            body.put("attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultRule)) {
            body.put("defaultRule", request.defaultRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledges)) {
            body.put("knowledges", request.knowledges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("roleArn", request.roleArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDigitalEmployee"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digital-employee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDigitalEmployeeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新UpdateDigitalEmployee</p>
     * 
     * @param request UpdateDigitalEmployeeRequest
     * @return UpdateDigitalEmployeeResponse
     */
    public UpdateDigitalEmployeeResponse updateDigitalEmployee(String name, UpdateDigitalEmployeeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDigitalEmployeeWithOptions(name, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新技能</p>
     * 
     * @param request UpdateDigitalEmployeeSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDigitalEmployeeSkillResponse
     */
    public UpdateDigitalEmployeeSkillResponse updateDigitalEmployeeSkillWithOptions(String name, String skillName, UpdateDigitalEmployeeSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            body.put("files", request.files);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDigitalEmployeeSkill"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/skill/" + com.aliyun.openapiutil.Client.getEncodeParam(skillName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDigitalEmployeeSkillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新技能</p>
     * 
     * @param request UpdateDigitalEmployeeSkillRequest
     * @return UpdateDigitalEmployeeSkillResponse
     */
    public UpdateDigitalEmployeeSkillResponse updateDigitalEmployeeSkill(String name, String skillName, UpdateDigitalEmployeeSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDigitalEmployeeSkillWithOptions(name, skillName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新 MCP 服务</p>
     * 
     * @param request UpdateMcpServiceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMcpServiceResponse
     */
    public UpdateMcpServiceResponse updateMcpServiceWithOptions(String name, String mcpServiceName, UpdateMcpServiceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connection)) {
            body.put("connection", request.connection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enable)) {
            body.put("enable", request.enable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.network)) {
            body.put("network", request.network);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tools)) {
            body.put("tools", request.tools);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMcpService"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/mcpService/" + com.aliyun.openapiutil.Client.getEncodeParam(mcpServiceName) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMcpServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新 MCP 服务</p>
     * 
     * @param request UpdateMcpServiceRequest
     * @return UpdateMcpServiceResponse
     */
    public UpdateMcpServiceResponse updateMcpService(String name, String mcpServiceName, UpdateMcpServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMcpServiceWithOptions(name, mcpServiceName, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新会话</p>
     * 
     * @param request UpdateThreadRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateThreadResponse
     */
    public UpdateThreadResponse updateThreadWithOptions(String name, String threadId, UpdateThreadRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attributes)) {
            body.put("attributes", request.attributes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateThread"),
            new TeaPair("version", "2026-04-28"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/digitalEmployee/" + com.aliyun.openapiutil.Client.getEncodeParam(name) + "/thread/" + com.aliyun.openapiutil.Client.getEncodeParam(threadId) + ""),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateThreadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新会话</p>
     * 
     * @param request UpdateThreadRequest
     * @return UpdateThreadResponse
     */
    public UpdateThreadResponse updateThread(String name, String threadId, UpdateThreadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateThreadWithOptions(name, threadId, request, headers, runtime);
    }
}
