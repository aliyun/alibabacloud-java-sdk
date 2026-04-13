// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731;

import com.aliyun.tea.*;
import com.aliyun.paicopilot20250731.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("paicopilot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>CreateChat</p>
     * 
     * @param request CreateChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChatResponse
     */
    public CreateChatResponse createChatWithOptions(String SessionId, CreateChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extraData)) {
            body.put("ExtraData", request.extraData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payload)) {
            body.put("Payload", request.payload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.question)) {
            body.put("Question", request.question);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChat"),
            new TeaPair("version", "2025-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(SessionId) + "/chats"),
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
     * <p>CreateChat</p>
     * 
     * @param request CreateChatRequest
     * @return CreateChatResponse
     */
    public CreateChatResponse createChat(String SessionId, CreateChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChatWithOptions(SessionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>/api/v1/sessions</p>
     * 
     * @param request CreateSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSessionResponse
     */
    public CreateSessionResponse createSessionWithOptions(CreateSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            body.put("Labels", request.labels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSession"),
            new TeaPair("version", "2025-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sessions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>/api/v1/sessions</p>
     * 
     * @param request CreateSessionRequest
     * @return CreateSessionResponse
     */
    public CreateSessionResponse createSession(CreateSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteChat</p>
     * 
     * @param request DeleteChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChatResponse
     */
    public DeleteChatResponse deleteChatWithOptions(String SessionId, String ChatId, DeleteChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChat"),
            new TeaPair("version", "2025-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(SessionId) + "/chats/" + com.aliyun.openapiutil.Client.getEncodeParam(ChatId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteChat</p>
     * 
     * @param request DeleteChatRequest
     * @return DeleteChatResponse
     */
    public DeleteChatResponse deleteChat(String SessionId, String ChatId, DeleteChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChatWithOptions(SessionId, ChatId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteSession</p>
     * 
     * @param request DeleteSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSessionResponse
     */
    public DeleteSessionResponse deleteSessionWithOptions(String SessionId, DeleteSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSession"),
            new TeaPair("version", "2025-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(SessionId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteSession</p>
     * 
     * @param request DeleteSessionRequest
     * @return DeleteSessionResponse
     */
    public DeleteSessionResponse deleteSession(String SessionId, DeleteSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSessionWithOptions(SessionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetChat</p>
     * 
     * @param request GetChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatResponse
     */
    public GetChatResponse getChatWithOptions(String ChatId, String SessionId, GetChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChat"),
            new TeaPair("version", "2025-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(SessionId) + "/chats/" + com.aliyun.openapiutil.Client.getEncodeParam(ChatId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetChat</p>
     * 
     * @param request GetChatRequest
     * @return GetChatResponse
     */
    public GetChatResponse getChat(String ChatId, String SessionId, GetChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChatWithOptions(ChatId, SessionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetSession</p>
     * 
     * @param request GetSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSessionResponse
     */
    public GetSessionResponse getSessionWithOptions(String SessionId, GetSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSession"),
            new TeaPair("version", "2025-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(SessionId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetSession</p>
     * 
     * @param request GetSessionRequest
     * @return GetSessionResponse
     */
    public GetSessionResponse getSession(String SessionId, GetSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSessionWithOptions(SessionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListChats</p>
     * 
     * @param request ListChatsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatsResponse
     */
    public ListChatsResponse listChatsWithOptions(String SessionId, ListChatsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.verbose)) {
            query.put("Verbose", request.verbose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChats"),
            new TeaPair("version", "2025-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sessions/" + com.aliyun.openapiutil.Client.getEncodeParam(SessionId) + "/chats"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListChats</p>
     * 
     * @param request ListChatsRequest
     * @return ListChatsResponse
     */
    public ListChatsResponse listChats(String SessionId, ListChatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChatsWithOptions(SessionId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetChat</p>
     * 
     * @param request ListSessionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSessionsResponse
     */
    public ListSessionsResponse listSessionsWithOptions(ListSessionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.labels)) {
            query.put("Labels", request.labels);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSessions"),
            new TeaPair("version", "2025-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/sessions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSessionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetChat</p>
     * 
     * @param request ListSessionsRequest
     * @return ListSessionsResponse
     */
    public ListSessionsResponse listSessions(ListSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSessionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>/api/v1/sessions</p>
     * 
     * @param request SearchInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchInfoResponse
     */
    public SearchInfoResponse searchInfoWithOptions(SearchInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeBaseFilters)) {
            body.put("KnowledgeBaseFilters", request.knowledgeBaseFilters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webFilters)) {
            body.put("WebFilters", request.webFilters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchInfo"),
            new TeaPair("version", "2025-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/v1/searches"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>/api/v1/sessions</p>
     * 
     * @param request SearchInfoRequest
     * @return SearchInfoResponse
     */
    public SearchInfoResponse searchInfo(SearchInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchInfoWithOptions(request, headers, runtime);
    }
}
