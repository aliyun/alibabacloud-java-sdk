// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512;

import com.aliyun.tea.*;
import com.aliyun.tea.interceptor.InterceptorChain;
import com.aliyun.tea.interceptor.RuntimeOptionsInterceptor;
import com.aliyun.tea.interceptor.RequestInterceptor;
import com.aliyun.tea.interceptor.ResponseInterceptor;
import com.aliyun.winnexo20260512.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    private final static InterceptorChain interceptorChain = InterceptorChain.create();

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("winnexo", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }

    public java.util.Map<String, ?> _postOSSObject(String bucketName, java.util.Map<String, ?> data, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, Object> runtime_ = TeaConverter.buildMap(
            new TeaPair("timeouted", "retry"),
            new TeaPair("key", com.aliyun.teautil.Common.defaultString(runtime.key, _key)),
            new TeaPair("cert", com.aliyun.teautil.Common.defaultString(runtime.cert, _cert)),
            new TeaPair("ca", com.aliyun.teautil.Common.defaultString(runtime.ca, _ca)),
            new TeaPair("readTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.readTimeout, _readTimeout)),
            new TeaPair("connectTimeout", com.aliyun.teautil.Common.defaultNumber(runtime.connectTimeout, _connectTimeout)),
            new TeaPair("httpProxy", com.aliyun.teautil.Common.defaultString(runtime.httpProxy, _httpProxy)),
            new TeaPair("httpsProxy", com.aliyun.teautil.Common.defaultString(runtime.httpsProxy, _httpsProxy)),
            new TeaPair("noProxy", com.aliyun.teautil.Common.defaultString(runtime.noProxy, _noProxy)),
            new TeaPair("socks5Proxy", com.aliyun.teautil.Common.defaultString(runtime.socks5Proxy, _socks5Proxy)),
            new TeaPair("socks5NetWork", com.aliyun.teautil.Common.defaultString(runtime.socks5NetWork, _socks5NetWork)),
            new TeaPair("maxIdleConns", com.aliyun.teautil.Common.defaultNumber(runtime.maxIdleConns, _maxIdleConns)),
            new TeaPair("retry", TeaConverter.buildMap(
                new TeaPair("retryable", runtime.autoretry),
                new TeaPair("maxAttempts", com.aliyun.teautil.Common.defaultNumber(runtime.maxAttempts, 3))
            )),
            new TeaPair("backoff", TeaConverter.buildMap(
                new TeaPair("policy", com.aliyun.teautil.Common.defaultString(runtime.backoffPolicy, "no")),
                new TeaPair("period", com.aliyun.teautil.Common.defaultNumber(runtime.backoffPeriod, 1))
            )),
            new TeaPair("ignoreSSL", com.aliyun.teaopenapi.Client.defaultAny(runtime.ignoreSSL, false)),
            new TeaPair("tlsMinVersion", _tlsMinVersion)
        );

        TeaRequest _lastRequest = null;
        Exception _lastException = null;
        long _now = System.currentTimeMillis();
        int _retryTimes = 0;
        while (Tea.allowRetry((java.util.Map<String, Object>) runtime_.get("retry"), _retryTimes, _now)) {
            if (_retryTimes > 0) {
                int backoffTime = Tea.getBackoffTime(runtime_.get("backoff"), _retryTimes);
                if (backoffTime > 0) {
                    Tea.sleep(backoffTime);
                }
            }
            _retryTimes = _retryTimes + 1;
            try {
                TeaRequest request_ = new TeaRequest();
                java.util.Map<String, Object> form = com.aliyun.teautil.Common.assertAsMap(data);
                String boundary = com.aliyun.fileform.Client.getBoundary();
                String tmp = com.aliyun.teautil.Common.assertAsString(form.get("host"));
                String host = "" + bucketName + "." + tmp + "";
                request_.protocol = "HTTPS";
                request_.method = "POST";
                request_.pathname = "/";
                request_.headers = TeaConverter.buildMap(
                    new TeaPair("host", host),
                    new TeaPair("date", com.aliyun.teautil.Common.getDateUTCString()),
                    new TeaPair("user-agent", com.aliyun.teautil.Common.getUserAgent(""))
                );
                request_.headers.put("content-type", "multipart/form-data; boundary=" + boundary + "");
                request_.body = com.aliyun.fileform.Client.toFileForm(form, boundary);
                _lastRequest = request_;
                TeaResponse response_ = Tea.doAction(request_, runtime_, interceptorChain);

                java.util.Map<String, Object> respMap = null;
                String bodyStr = com.aliyun.teautil.Common.readAsString(response_.body);
                if (com.aliyun.teautil.Common.is4xx(response_.statusCode) || com.aliyun.teautil.Common.is5xx(response_.statusCode)) {
                    respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                    java.util.Map<String, Object> err = com.aliyun.teautil.Common.assertAsMap(respMap.get("Error"));
                    throw new TeaException(TeaConverter.buildMap(
                        new TeaPair("code", err.get("Code")),
                        new TeaPair("message", err.get("Message")),
                        new TeaPair("data", TeaConverter.buildMap(
                            new TeaPair("httpCode", response_.statusCode),
                            new TeaPair("requestId", err.get("RequestId")),
                            new TeaPair("hostId", err.get("HostId"))
                        ))
                    ));
                }

                respMap = com.aliyun.teaxml.Client.parseXml(bodyStr, null);
                return TeaConverter.merge(Object.class,
                    respMap
                );
            } catch (Exception e) {
                if (Tea.isRetryable(e)) {
                    _lastException = e;
                    continue;
                }
                throw e;
            }
        }
        throw new TeaUnretryableException(_lastRequest, _lastException);
    }

    public void addRuntimeOptionsInterceptor(RuntimeOptionsInterceptor interceptor) {
        interceptorChain.addRuntimeOptionsInterceptor(interceptor);
    }

    public void addRequestInterceptor(RequestInterceptor interceptor) {
        interceptorChain.addRequestInterceptor(interceptor);
    }

    public void addResponseInterceptor(ResponseInterceptor interceptor) {
        interceptorChain.addResponseInterceptor(interceptor);
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
     * <p>Performs a service health check.</p>
     * 
     * @param request CheckHealthRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckHealthResponse
     */
    public CheckHealthResponse checkHealthWithOptions(CheckHealthRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckHealth"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/checkHealth"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckHealthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a service health check.</p>
     * 
     * @param request CheckHealthRequest
     * @return CheckHealthResponse
     */
    public CheckHealthResponse checkHealth(CheckHealthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkHealthWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a session.</p>
     * 
     * @param tmpReq CreateConversationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConversationResponse
     */
    public CreateConversationResponse createConversationWithOptions(CreateConversationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateConversationShrinkRequest request = new CreateConversationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.operatingObjectName)) {
            request.operatingObjectNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.operatingObjectName, "operatingObjectName", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            body.put("metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            body.put("objectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectNameShrink)) {
            body.put("operatingObjectName", request.operatingObjectNameShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConversation"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createConversation"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConversationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a session.</p>
     * 
     * @param request CreateConversationRequest
     * @return CreateConversationResponse
     */
    public CreateConversationResponse createConversation(CreateConversationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createConversationWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Registers a custom-only organization for subsequent department tree push through syncOrgStructure.
     *     Registration logic:
     *     1. Validates the corpId format (must start with a lowercase letter or digit, 3-64 characters, hyphens allowed).
     *     2. Delegates to OrgSyncAuthorizedService to execute registration (includes permission verification and tenant-level uniqueness check).
     *     3. Returns the registration result.
     *     Note: Custom-only organizations support only department tree synchronization. Member relationship synchronization is not supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Registers a custom-only organization.</p>
     * 
     * @param request CreateCustomOrgRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomOrgResponse
     */
    public CreateCustomOrgResponse createCustomOrgWithOptions(CreateCustomOrgRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            body.put("corpName", request.corpName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomOrg"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createCustomOrg"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomOrgResponse());
    }

    /**
     * <b>description</b> :
     * <p>Registers a custom-only organization for subsequent department tree push through syncOrgStructure.
     *     Registration logic:
     *     1. Validates the corpId format (must start with a lowercase letter or digit, 3-64 characters, hyphens allowed).
     *     2. Delegates to OrgSyncAuthorizedService to execute registration (includes permission verification and tenant-level uniqueness check).
     *     3. Returns the registration result.
     *     Note: Custom-only organizations support only department tree synchronization. Member relationship synchronization is not supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Registers a custom-only organization.</p>
     * 
     * @param request CreateCustomOrgRequest
     * @return CreateCustomOrgResponse
     */
    public CreateCustomOrgResponse createCustomOrg(CreateCustomOrgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCustomOrgWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Connects a specified DingTalk group chat to a group knowledge base that the caller has joined.</li>
     * <li>The resource type is fixed to ALI_DING, the scope is fixed to GROUP, and the owning user is resolved from the gateway authentication identity.</li>
     * <li>groupId, chatId, and historyStartTime are required.</li>
     * <li>updateFrequency can be configured by using a preset or a five-field cron expression for subsequent synchronization frequency.</li>
     * <li>The server verifies the caller\&quot;s group membership, the target group directory permissions, and the uniqueness of chatId within the scope.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a DingTalk group chat knowledge resource in a group.</p>
     * 
     * @param tmpReq CreateGroupAliDingChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupAliDingChatResponse
     */
    public CreateGroupAliDingChatResponse createGroupAliDingChatWithOptions(CreateGroupAliDingChatRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateGroupAliDingChatShrinkRequest request = new CreateGroupAliDingChatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateFrequency)) {
            request.updateFrequencyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateFrequency, "updateFrequency", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatName)) {
            body.put("chatName", request.chatName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("groupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyStartTime)) {
            body.put("historyStartTime", request.historyStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notes)) {
            body.put("notes", request.notes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTags)) {
            body.put("sourceTags", request.sourceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateFrequencyShrink)) {
            body.put("updateFrequency", request.updateFrequencyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroupAliDingChat"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createGroupAliDingChat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupAliDingChatResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>Connects a specified DingTalk group chat to a group knowledge base that the caller has joined.</li>
     * <li>The resource type is fixed to ALI_DING, the scope is fixed to GROUP, and the owning user is resolved from the gateway authentication identity.</li>
     * <li>groupId, chatId, and historyStartTime are required.</li>
     * <li>updateFrequency can be configured by using a preset or a five-field cron expression for subsequent synchronization frequency.</li>
     * <li>The server verifies the caller\&quot;s group membership, the target group directory permissions, and the uniqueness of chatId within the scope.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a DingTalk group chat knowledge resource in a group.</p>
     * 
     * @param request CreateGroupAliDingChatRequest
     * @return CreateGroupAliDingChatResponse
     */
    public CreateGroupAliDingChatResponse createGroupAliDingChat(CreateGroupAliDingChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGroupAliDingChatWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation adds an AliDing online document to a specified enterprise knowledge base.</li>
     * <li>The caller must have the <code>DEVELOPMENT_KB_MANAGE</code> permission.</li>
     * <li><code>source_type</code> is fixed to <code>ONLINE_DOC</code>, <code>platform</code> is fixed to <code>ALI_DING</code>, and <code>scope</code> is fixed to <code>TENANT</code>.</li>
     * <li>If <code>directoryId</code> is not provided, the document is bound to the root directory of the current digital employee by default. If provided, it must be a valid directory ID under the current tenant.</li>
     * <li>The <code>filePublicUrl</code> parameter is required and specifies the publicly accessible URL of the AliDing online document to upload.</li>
     * <li>Optional parameters include <code>operatingObjectName</code> (digital employee name), <code>description</code> (resource description), <code>knowledgeId</code> (knowledge base ID), and <code>sourceTags</code> (resource tags).</li>
     * <li>A successful response returns information about the newly created resource, such as <code>sourceId</code>, <code>name</code>, <code>status</code>, <code>directoryId</code>, and creation time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads an AliDing online document to the enterprise knowledge base. Management permissions are required.</p>
     * 
     * @param request CreateKnowledgeBaseAliDingDocRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKnowledgeBaseAliDingDocResponse
     */
    public CreateKnowledgeBaseAliDingDocResponse createKnowledgeBaseAliDingDocWithOptions(CreateKnowledgeBaseAliDingDocRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePublicUrl)) {
            body.put("filePublicUrl", request.filePublicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("knowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTags)) {
            body.put("sourceTags", request.sourceTags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKnowledgeBaseAliDingDoc"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createKnowledgeBaseAlidingDoc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKnowledgeBaseAliDingDocResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation adds an AliDing online document to a specified enterprise knowledge base.</li>
     * <li>The caller must have the <code>DEVELOPMENT_KB_MANAGE</code> permission.</li>
     * <li><code>source_type</code> is fixed to <code>ONLINE_DOC</code>, <code>platform</code> is fixed to <code>ALI_DING</code>, and <code>scope</code> is fixed to <code>TENANT</code>.</li>
     * <li>If <code>directoryId</code> is not provided, the document is bound to the root directory of the current digital employee by default. If provided, it must be a valid directory ID under the current tenant.</li>
     * <li>The <code>filePublicUrl</code> parameter is required and specifies the publicly accessible URL of the AliDing online document to upload.</li>
     * <li>Optional parameters include <code>operatingObjectName</code> (digital employee name), <code>description</code> (resource description), <code>knowledgeId</code> (knowledge base ID), and <code>sourceTags</code> (resource tags).</li>
     * <li>A successful response returns information about the newly created resource, such as <code>sourceId</code>, <code>name</code>, <code>status</code>, <code>directoryId</code>, and creation time.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads an AliDing online document to the enterprise knowledge base. Management permissions are required.</p>
     * 
     * @param request CreateKnowledgeBaseAliDingDocRequest
     * @return CreateKnowledgeBaseAliDingDocResponse
     */
    public CreateKnowledgeBaseAliDingDocResponse createKnowledgeBaseAliDingDoc(CreateKnowledgeBaseAliDingDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKnowledgeBaseAliDingDocWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows users with the <code>DEVELOPMENT_KB_MANAGE</code> permission to create a category for the enterprise knowledge base.</li>
     * <li>You can specify a parent category ID when creating a category. If no parent category ID is specified, the new category is mounted directly under the root directory of the enterprise knowledge base.</li>
     * <li>The system automatically checks for name conflicts and directory depth limits.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are obtained only through authentication. These parameters are ignored even if they are provided in the request body.</li>
     * <li>Ensure that the specified <code>parentDirectoryId</code> (if any) belongs to the current tenant.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a category directory in the enterprise knowledge base.</p>
     * 
     * @param request CreateKnowledgeBaseDirectoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKnowledgeBaseDirectoryResponse
     */
    public CreateKnowledgeBaseDirectoryResponse createKnowledgeBaseDirectoryWithOptions(CreateKnowledgeBaseDirectoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDirectoryId)) {
            body.put("parentDirectoryId", request.parentDirectoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKnowledgeBaseDirectory"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createKnowledgeBaseDirectory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKnowledgeBaseDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows users with the <code>DEVELOPMENT_KB_MANAGE</code> permission to create a category for the enterprise knowledge base.</li>
     * <li>You can specify a parent category ID when creating a category. If no parent category ID is specified, the new category is mounted directly under the root directory of the enterprise knowledge base.</li>
     * <li>The system automatically checks for name conflicts and directory depth limits.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are obtained only through authentication. These parameters are ignored even if they are provided in the request body.</li>
     * <li>Ensure that the specified <code>parentDirectoryId</code> (if any) belongs to the current tenant.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a category directory in the enterprise knowledge base.</p>
     * 
     * @param request CreateKnowledgeBaseDirectoryRequest
     * @return CreateKnowledgeBaseDirectoryResponse
     */
    public CreateKnowledgeBaseDirectoryResponse createKnowledgeBaseDirectory(CreateKnowledgeBaseDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKnowledgeBaseDirectoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to the enterprise knowledge base.</li>
     * <li>The <code>DEVELOPMENT_KB_MANAGE</code> permission is required to call this operation.</li>
     * <li>You must provide the Object Storage Service (OSS) persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can use <code>sourceTags</code> to add labels to resources for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Ensure that your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a specified file to the enterprise knowledge base. Management permissions are required.</p>
     * 
     * @param request CreateKnowledgeBaseFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKnowledgeBaseFileResponse
     */
    public CreateKnowledgeBaseFileResponse createKnowledgeBaseFileWithOptions(CreateKnowledgeBaseFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileExt)) {
            body.put("fileExt", request.fileExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePublicUrl)) {
            body.put("filePublicUrl", request.filePublicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileRecordId)) {
            body.put("fileRecordId", request.fileRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("knowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTags)) {
            body.put("sourceTags", request.sourceTags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKnowledgeBaseFile"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createKnowledgeBaseFile"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKnowledgeBaseFileResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to the enterprise knowledge base.</li>
     * <li>The <code>DEVELOPMENT_KB_MANAGE</code> permission is required to call this operation.</li>
     * <li>You must provide the Object Storage Service (OSS) persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can use <code>sourceTags</code> to add labels to resources for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Ensure that your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a specified file to the enterprise knowledge base. Management permissions are required.</p>
     * 
     * @param request CreateKnowledgeBaseFileRequest
     * @return CreateKnowledgeBaseFileResponse
     */
    public CreateKnowledgeBaseFileResponse createKnowledgeBaseFile(CreateKnowledgeBaseFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKnowledgeBaseFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to upload plain text information to an enterprise knowledge base. The caller must have the required management permissions.</li>
     * <li>The <code>textContent</code> field is required and represents the plain text content to upload.</li>
     * <li>Optional parameters include the digital employee name (<code>operatingObjectName</code>) and resource description (<code>description</code>), which allow users to customize additional details.</li>
     * <li>If <code>directoryId</code> is provided, the uploaded text is attached to the specified knowledge base folder. If not provided, the text is attached to the root folder of the current digital employee by default.</li>
     * <li>You can use <code>sourceTags</code> to add labels to resources for easier management and retrieval.</li>
     * <li>Before invoking this operation, make sure that you have correctly configured the authentication method (AK, BearerToken, and APP authentication are supported) and have the <code>DEVELOPMENT_KB_MANAGE</code> permission.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds plain text content to a specified enterprise knowledge base.</p>
     * 
     * @param request CreateKnowledgeBaseTextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKnowledgeBaseTextResponse
     */
    public CreateKnowledgeBaseTextResponse createKnowledgeBaseTextWithOptions(CreateKnowledgeBaseTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("knowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTags)) {
            body.put("sourceTags", request.sourceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textContent)) {
            body.put("textContent", request.textContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKnowledgeBaseText"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createKnowledgeBaseText"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKnowledgeBaseTextResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to upload plain text information to an enterprise knowledge base. The caller must have the required management permissions.</li>
     * <li>The <code>textContent</code> field is required and represents the plain text content to upload.</li>
     * <li>Optional parameters include the digital employee name (<code>operatingObjectName</code>) and resource description (<code>description</code>), which allow users to customize additional details.</li>
     * <li>If <code>directoryId</code> is provided, the uploaded text is attached to the specified knowledge base folder. If not provided, the text is attached to the root folder of the current digital employee by default.</li>
     * <li>You can use <code>sourceTags</code> to add labels to resources for easier management and retrieval.</li>
     * <li>Before invoking this operation, make sure that you have correctly configured the authentication method (AK, BearerToken, and APP authentication are supported) and have the <code>DEVELOPMENT_KB_MANAGE</code> permission.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds plain text content to a specified enterprise knowledge base.</p>
     * 
     * @param request CreateKnowledgeBaseTextRequest
     * @return CreateKnowledgeBaseTextResponse
     */
    public CreateKnowledgeBaseTextResponse createKnowledgeBaseText(CreateKnowledgeBaseTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createKnowledgeBaseTextWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Connects the specified AliDing group chat to the current user\&quot;s personal knowledge base.</li>
     * <li>The resource type is fixed to ALI_DING, the scope is fixed to PERSONAL, and the owning user is parsed from the gateway authentication identity.</li>
     * <li>historyStartTime is required and supports YYYY-MM-DD or YYYY-MM-DD HH:MM:SS format.</li>
     * <li>updateFrequency can be configured with a preset or a five-field cron expression for subsequent synchronization frequency.</li>
     * <li>chatId must be unique within the target personal scope.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a personal AliDing group chat knowledge resource.</p>
     * 
     * @param tmpReq CreatePersonalAliDingChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalAliDingChatResponse
     */
    public CreatePersonalAliDingChatResponse createPersonalAliDingChatWithOptions(CreatePersonalAliDingChatRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePersonalAliDingChatShrinkRequest request = new CreatePersonalAliDingChatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateFrequency)) {
            request.updateFrequencyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateFrequency, "updateFrequency", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chatName)) {
            body.put("chatName", request.chatName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyStartTime)) {
            body.put("historyStartTime", request.historyStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notes)) {
            body.put("notes", request.notes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTags)) {
            body.put("sourceTags", request.sourceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateFrequencyShrink)) {
            body.put("updateFrequency", request.updateFrequencyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalAliDingChat"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalAliDingChat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalAliDingChatResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>Connects the specified AliDing group chat to the current user\&quot;s personal knowledge base.</li>
     * <li>The resource type is fixed to ALI_DING, the scope is fixed to PERSONAL, and the owning user is parsed from the gateway authentication identity.</li>
     * <li>historyStartTime is required and supports YYYY-MM-DD or YYYY-MM-DD HH:MM:SS format.</li>
     * <li>updateFrequency can be configured with a preset or a five-field cron expression for subsequent synchronization frequency.</li>
     * <li>chatId must be unique within the target personal scope.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a personal AliDing group chat knowledge resource.</p>
     * 
     * @param request CreatePersonalAliDingChatRequest
     * @return CreatePersonalAliDingChatResponse
     */
    public CreatePersonalAliDingChatResponse createPersonalAliDingChat(CreatePersonalAliDingChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalAliDingChatWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API uploads AliDing meeting materials (such as audio/video files and Shanji links) to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li>The <code>source_type</code> is fixed to <code>ALI_DING_MEETING</code>, and the <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>You must provide a public audio/video OSS URL (<code>ossUrl</code>) and the original Shanji link (<code>shanjiUrl</code>).</li>
     * <li>Optionally, you can specify a target personal directory ID (<code>directoryId</code>). If not specified, the resource is automatically bound to the default root directory of the current digital employee.</li>
     * <li>You can add a resource description (<code>description</code>) and meeting notes (<code>notes</code>). The meeting notes can be used for auxiliary analysis.</li>
     * <li>This operation requires authentication. AK, BearerToken, and APP authentication methods are supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads an AliDing meeting file to the personal resource library of the current digital employee.</p>
     * 
     * @param request CreatePersonalAliDingMeetingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalAliDingMeetingResponse
     */
    public CreatePersonalAliDingMeetingResponse createPersonalAliDingMeetingWithOptions(CreatePersonalAliDingMeetingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notes)) {
            body.put("notes", request.notes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shanjiUrl)) {
            body.put("shanjiUrl", request.shanjiUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalAliDingMeeting"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalAliDingMeeting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalAliDingMeetingResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API uploads AliDing meeting materials (such as audio/video files and Shanji links) to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li>The <code>source_type</code> is fixed to <code>ALI_DING_MEETING</code>, and the <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>You must provide a public audio/video OSS URL (<code>ossUrl</code>) and the original Shanji link (<code>shanjiUrl</code>).</li>
     * <li>Optionally, you can specify a target personal directory ID (<code>directoryId</code>). If not specified, the resource is automatically bound to the default root directory of the current digital employee.</li>
     * <li>You can add a resource description (<code>description</code>) and meeting notes (<code>notes</code>). The meeting notes can be used for auxiliary analysis.</li>
     * <li>This operation requires authentication. AK, BearerToken, and APP authentication methods are supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads an AliDing meeting file to the personal resource library of the current digital employee.</p>
     * 
     * @param request CreatePersonalAliDingMeetingRequest
     * @return CreatePersonalAliDingMeetingResponse
     */
    public CreatePersonalAliDingMeetingResponse createPersonalAliDingMeeting(CreatePersonalAliDingMeetingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalAliDingMeetingWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to add an AliDing online document to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li>Fixed parameters include <code>source_type=ONLINE_DOC</code>, <code>platform=ALI_DING</code>, and <code>scope=PERSONAL</code>.</li>
     * <li>If <code>directoryId</code> is not provided, the document is attached to the root folder of the current digital employee by default. If provided, ensure that the folder belongs to the current user and exists under the current digital employee.</li>
     * <li>During the invoke process, metering is started and related operation logs are recorded.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authentication identity. Values provided by the caller for these fields are ignored.</li>
     * <li>Any validation or execute failure is thrown as an exception by the service and transformed into a POP error code returned to the caller.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads an AliDing online document to the personal resources of the current digital employee.</p>
     * 
     * @param request CreatePersonalAlidingDocRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalAlidingDocResponse
     */
    public CreatePersonalAlidingDocResponse createPersonalAlidingDocWithOptions(CreatePersonalAlidingDocRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePublicUrl)) {
            body.put("filePublicUrl", request.filePublicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalAlidingDoc"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalAliDingDoc"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalAlidingDocResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to add an AliDing online document to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li>Fixed parameters include <code>source_type=ONLINE_DOC</code>, <code>platform=ALI_DING</code>, and <code>scope=PERSONAL</code>.</li>
     * <li>If <code>directoryId</code> is not provided, the document is attached to the root folder of the current digital employee by default. If provided, ensure that the folder belongs to the current user and exists under the current digital employee.</li>
     * <li>During the invoke process, metering is started and related operation logs are recorded.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authentication identity. Values provided by the caller for these fields are ignored.</li>
     * <li>Any validation or execute failure is thrown as an exception by the service and transformed into a POP error code returned to the caller.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads an AliDing online document to the personal resources of the current digital employee.</p>
     * 
     * @param request CreatePersonalAlidingDocRequest
     * @return CreatePersonalAlidingDocResponse
     */
    public CreatePersonalAlidingDocResponse createPersonalAlidingDoc(CreatePersonalAlidingDocRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalAlidingDocWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API creates an AliDing knowledge base and mounts it to the personal resource directory of the specified digital employee.</li>
     * <li><code>platform</code> is fixed to <code>ALI_DING</code>, and <code>directory_type</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>If <code>directoryId</code> is provided, the system verifies that the directory exists and belongs to the current tenant and is of the personal type.</li>
     * <li>During creation, the knowledge base root directory is initialized (with the status set to <code>RUNNING</code>), and background tasks are dispatched based on the provided synchronization configuration to pull the remote directory tree and create child nodes.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authenticated identity. These fields in the request body are ignored.</li>
     * <li>The synchronization configuration is optional. If enabled, a cron expression must be provided. If not provided or disabled, scheduled synchronization is not performed by default.</li>
     * <li>The knowledge base name can be customized. If not provided, it is automatically populated after background synchronization.</li>
     * <li>Multi-value object binding is supported. Related information is serialized and stored in the knowledge base metadata.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an AliDing knowledge base to the personal resources of the current digital employee.</p>
     * 
     * @param tmpReq CreatePersonalAlidingKnowledgeBaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalAlidingKnowledgeBaseResponse
     */
    public CreatePersonalAlidingKnowledgeBaseResponse createPersonalAlidingKnowledgeBaseWithOptions(CreatePersonalAlidingKnowledgeBaseRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePersonalAlidingKnowledgeBaseShrinkRequest request = new CreatePersonalAlidingKnowledgeBaseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectBindings)) {
            request.objectBindingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectBindings, "objectBindings", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.syncConfig)) {
            request.syncConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.syncConfig, "syncConfig", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbName)) {
            body.put("kbName", request.kbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kbUrl)) {
            body.put("kbUrl", request.kbUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectBindingsShrink)) {
            body.put("objectBindings", request.objectBindingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncConfigShrink)) {
            body.put("syncConfig", request.syncConfigShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalAlidingKnowledgeBase"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalAliDingKnowledgeBase"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalAlidingKnowledgeBaseResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API creates an AliDing knowledge base and mounts it to the personal resource directory of the specified digital employee.</li>
     * <li><code>platform</code> is fixed to <code>ALI_DING</code>, and <code>directory_type</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>If <code>directoryId</code> is provided, the system verifies that the directory exists and belongs to the current tenant and is of the personal type.</li>
     * <li>During creation, the knowledge base root directory is initialized (with the status set to <code>RUNNING</code>), and background tasks are dispatched based on the provided synchronization configuration to pull the remote directory tree and create child nodes.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authenticated identity. These fields in the request body are ignored.</li>
     * <li>The synchronization configuration is optional. If enabled, a cron expression must be provided. If not provided or disabled, scheduled synchronization is not performed by default.</li>
     * <li>The knowledge base name can be customized. If not provided, it is automatically populated after background synchronization.</li>
     * <li>Multi-value object binding is supported. Related information is serialized and stored in the knowledge base metadata.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an AliDing knowledge base to the personal resources of the current digital employee.</p>
     * 
     * @param request CreatePersonalAlidingKnowledgeBaseRequest
     * @return CreatePersonalAlidingKnowledgeBaseResponse
     */
    public CreatePersonalAlidingKnowledgeBaseResponse createPersonalAlidingKnowledgeBase(CreatePersonalAlidingKnowledgeBaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalAlidingKnowledgeBaseWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation uploads a DingTalk meeting as a resource to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>DINGTALK_MEETING</code>, and <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>If <code>credentialId</code> is not provided, the system default configurations are used.</li>
     * <li>If <code>directoryId</code> is not specified, the resource is automatically attached to the default root folder of the current digital employee. If specified, it must be an existing personal folder of the invoker under the digital employee.</li>
     * <li>The optional parameters <code>description</code> and <code>notes</code> are used to describe the resource and record meeting notes, respectively. The <code>notes</code> value is used for auxiliary analysis.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a DingTalk meeting to the personal resource library of the current digital employee.</p>
     * 
     * @deprecated OpenAPI CreatePersonalDingtalkMeeting is deprecated
     * 
     * @param request CreatePersonalDingtalkMeetingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalDingtalkMeetingResponse
     */
    @Deprecated
    // Deprecated
    public CreatePersonalDingtalkMeetingResponse createPersonalDingtalkMeetingWithOptions(CreatePersonalDingtalkMeetingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            body.put("credentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notes)) {
            body.put("notes", request.notes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCode)) {
            body.put("roomCode", request.roomCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalDingtalkMeeting"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalDingtalkMeeting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalDingtalkMeetingResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation uploads a DingTalk meeting as a resource to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>DINGTALK_MEETING</code>, and <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>If <code>credentialId</code> is not provided, the system default configurations are used.</li>
     * <li>If <code>directoryId</code> is not specified, the resource is automatically attached to the default root folder of the current digital employee. If specified, it must be an existing personal folder of the invoker under the digital employee.</li>
     * <li>The optional parameters <code>description</code> and <code>notes</code> are used to describe the resource and record meeting notes, respectively. The <code>notes</code> value is used for auxiliary analysis.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a DingTalk meeting to the personal resource library of the current digital employee.</p>
     * 
     * @deprecated OpenAPI CreatePersonalDingtalkMeeting is deprecated
     * 
     * @param request CreatePersonalDingtalkMeetingRequest
     * @return CreatePersonalDingtalkMeetingResponse
     */
    @Deprecated
    // Deprecated
    public CreatePersonalDingtalkMeetingResponse createPersonalDingtalkMeeting(CreatePersonalDingtalkMeetingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalDingtalkMeetingWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API creates a meeting resource by using a standard DingTalk Shanji link. The collection method is fixed to the DWS corresponding to personal OAuth.</li>
     * <li><code>source_type</code> is fixed to <code>DINGTALK_MEETING</code>, and <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>You must provide a standard DingTalk Shanji link or taskUuid (<code>shanjiUrl</code>).</li>
     * <li>Optionally specify a target personal directory ID (<code>directoryId</code>). If not specified, the default root directory of the current digital employee is used.</li>
     * <li>You can add a resource description (<code>description</code>) and meeting notes (<code>notes</code>).</li>
     * <li>This operation supports one of the following authentication methods: AK, BearerToken, or APP.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a meeting to the current user\&quot;s personal knowledge base by using a standard DingTalk Shanji URL.</p>
     * 
     * @param request CreatePersonalDingtalkMinutesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalDingtalkMinutesResponse
     */
    public CreatePersonalDingtalkMinutesResponse createPersonalDingtalkMinutesWithOptions(CreatePersonalDingtalkMinutesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notes)) {
            body.put("notes", request.notes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shanjiUrl)) {
            body.put("shanjiUrl", request.shanjiUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalDingtalkMinutes"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalDingtalkMinutes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalDingtalkMinutesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API creates a meeting resource by using a standard DingTalk Shanji link. The collection method is fixed to the DWS corresponding to personal OAuth.</li>
     * <li><code>source_type</code> is fixed to <code>DINGTALK_MEETING</code>, and <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>You must provide a standard DingTalk Shanji link or taskUuid (<code>shanjiUrl</code>).</li>
     * <li>Optionally specify a target personal directory ID (<code>directoryId</code>). If not specified, the default root directory of the current digital employee is used.</li>
     * <li>You can add a resource description (<code>description</code>) and meeting notes (<code>notes</code>).</li>
     * <li>This operation supports one of the following authentication methods: AK, BearerToken, or APP.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a meeting to the current user\&quot;s personal knowledge base by using a standard DingTalk Shanji URL.</p>
     * 
     * @param request CreatePersonalDingtalkMinutesRequest
     * @return CreatePersonalDingtalkMinutesResponse
     */
    public CreatePersonalDingtalkMinutesResponse createPersonalDingtalkMinutes(CreatePersonalDingtalkMinutesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalDingtalkMinutesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to create a personal folder (category) under &quot;My Resources&quot;.</li>
     * <li>If <code>parentDirectoryId</code> is not specified, the system automatically uses or creates the default root folder of the current digital human as the parent folder.</li>
     * <li>If <code>parentDirectoryId</code> is specified, it must be an existing personal folder of the current user under the current digital human.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are derived from the authentication identity only. These fields are ignored if included in the request body.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a personal folder (category) under My Resources.</p>
     * 
     * @param request CreatePersonalDirectoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalDirectoryResponse
     */
    public CreatePersonalDirectoryResponse createPersonalDirectoryWithOptions(CreatePersonalDirectoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDirectoryId)) {
            body.put("parentDirectoryId", request.parentDirectoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalDirectory"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalDirectory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to create a personal folder (category) under &quot;My Resources&quot;.</li>
     * <li>If <code>parentDirectoryId</code> is not specified, the system automatically uses or creates the default root folder of the current digital human as the parent folder.</li>
     * <li>If <code>parentDirectoryId</code> is specified, it must be an existing personal folder of the current user under the current digital human.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are derived from the authentication identity only. These fields are ignored if included in the request body.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a personal folder (category) under My Resources.</p>
     * 
     * @param request CreatePersonalDirectoryRequest
     * @return CreatePersonalDirectoryResponse
     */
    public CreatePersonalDirectoryResponse createPersonalDirectory(CreatePersonalDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalDirectoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API uses the Lark application connection managed by the user corresponding to the current OpenAPI identity. It pulls the name and historical messages of the specified group chat through the built-in CLI of the project and creates a knowledge resource in the user\&quot;s personal knowledge base.</p>
     * <ul>
     * <li><code>chatId</code>: The Lark group chat ID. Must start with <code>oc_</code>.</li>
     * <li><code>directoryId</code> (optional): The target personal directory ID. If omitted, the current user\&quot;s default personal root directory is used.</li>
     * <li><code>historyStartTime</code> (optional): The start time for historical messages. Supports <code>YYYY-MM-DD</code> or <code>YYYY-MM-DD HH:MM:SS</code>.</li>
     * <li><code>updateFrequency</code> (optional): The Source-level scheduled synchronization configuration. Supports preset frequencies or five-field cron expressions.</li>
     * <li><code>description</code>, <code>operatingObjectName</code>, <code>notes</code>, <code>sourceTags</code>: Optional Source metadata.
     * Security constraints: The Source Type is fixed to FEISHU, and the knowledge scope is fixed to PERSONAL. The Lark connector user is determined by the POP trusted identity. Credentials or user IDs passed by the caller are not accepted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a personal knowledge resource from a single Lark group chat using the current user\&quot;s Lark authorization.</p>
     * 
     * @param tmpReq CreatePersonalFeishuChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalFeishuChatResponse
     */
    public CreatePersonalFeishuChatResponse createPersonalFeishuChatWithOptions(CreatePersonalFeishuChatRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePersonalFeishuChatShrinkRequest request = new CreatePersonalFeishuChatShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateFrequency)) {
            request.updateFrequencyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateFrequency, "updateFrequency", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatId)) {
            body.put("chatId", request.chatId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyStartTime)) {
            body.put("historyStartTime", request.historyStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notes)) {
            body.put("notes", request.notes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTags)) {
            body.put("sourceTags", request.sourceTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateFrequencyShrink)) {
            body.put("updateFrequency", request.updateFrequencyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalFeishuChat"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalFeishuChat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalFeishuChatResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API uses the Lark application connection managed by the user corresponding to the current OpenAPI identity. It pulls the name and historical messages of the specified group chat through the built-in CLI of the project and creates a knowledge resource in the user\&quot;s personal knowledge base.</p>
     * <ul>
     * <li><code>chatId</code>: The Lark group chat ID. Must start with <code>oc_</code>.</li>
     * <li><code>directoryId</code> (optional): The target personal directory ID. If omitted, the current user\&quot;s default personal root directory is used.</li>
     * <li><code>historyStartTime</code> (optional): The start time for historical messages. Supports <code>YYYY-MM-DD</code> or <code>YYYY-MM-DD HH:MM:SS</code>.</li>
     * <li><code>updateFrequency</code> (optional): The Source-level scheduled synchronization configuration. Supports preset frequencies or five-field cron expressions.</li>
     * <li><code>description</code>, <code>operatingObjectName</code>, <code>notes</code>, <code>sourceTags</code>: Optional Source metadata.
     * Security constraints: The Source Type is fixed to FEISHU, and the knowledge scope is fixed to PERSONAL. The Lark connector user is determined by the POP trusted identity. Credentials or user IDs passed by the caller are not accepted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a personal knowledge resource from a single Lark group chat using the current user\&quot;s Lark authorization.</p>
     * 
     * @param request CreatePersonalFeishuChatRequest
     * @return CreatePersonalFeishuChatResponse
     */
    public CreatePersonalFeishuChatResponse createPersonalFeishuChat(CreatePersonalFeishuChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalFeishuChatWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API uploads a meeting record from Lark Minutes to the &quot;My Resources&quot; section of a specified digital employee. By providing the required parameters, such as the unique identifier of the Lark Minutes record (<code>minuteToken</code>) and the credential ID (<code>credentialId</code>), you can migrate and save meeting content. If no target directory is specified, the resource is bound to the root directory of the current digital employee by default.</p>
     * <ul>
     * <li><code>operatingObjectName</code>: The name of the digital employee that performs the operation.</li>
     * <li><code>name</code>: The display name of the uploaded resource in the system.</li>
     * <li><code>minuteToken</code>: The unique identifier of the meeting from the Lark Minutes platform.</li>
     * <li><code>credentialId</code>: The ID associated with specific authentication information, used to verify the validity of the request.</li>
     * <li><code>directoryId</code> (optional): The ID of the target personal directory where the resource is stored. If this field is omitted, the resource is automatically placed in the default location.</li>
     * <li><code>description</code> (optional): A brief description or note about the uploaded resource.
     * Precautions:</li>
     * <li>Ensure that the provided <code>minuteToken</code> and <code>credentialId</code> are valid.</li>
     * <li>If <code>directoryId</code> is specified, confirm that it belongs to one of the available personal directories of the caller in the current digital employee environment.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a Lark Minutes meeting file to the personal resource library of the current digital employee.</p>
     * 
     * @param request CreatePersonalFeishuMinuteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalFeishuMinuteResponse
     */
    public CreatePersonalFeishuMinuteResponse createPersonalFeishuMinuteWithOptions(CreatePersonalFeishuMinuteRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            body.put("credentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minuteToken)) {
            body.put("minuteToken", request.minuteToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalFeishuMinute"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalFeishuMinute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalFeishuMinuteResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API uploads a meeting record from Lark Minutes to the &quot;My Resources&quot; section of a specified digital employee. By providing the required parameters, such as the unique identifier of the Lark Minutes record (<code>minuteToken</code>) and the credential ID (<code>credentialId</code>), you can migrate and save meeting content. If no target directory is specified, the resource is bound to the root directory of the current digital employee by default.</p>
     * <ul>
     * <li><code>operatingObjectName</code>: The name of the digital employee that performs the operation.</li>
     * <li><code>name</code>: The display name of the uploaded resource in the system.</li>
     * <li><code>minuteToken</code>: The unique identifier of the meeting from the Lark Minutes platform.</li>
     * <li><code>credentialId</code>: The ID associated with specific authentication information, used to verify the validity of the request.</li>
     * <li><code>directoryId</code> (optional): The ID of the target personal directory where the resource is stored. If this field is omitted, the resource is automatically placed in the default location.</li>
     * <li><code>description</code> (optional): A brief description or note about the uploaded resource.
     * Precautions:</li>
     * <li>Ensure that the provided <code>minuteToken</code> and <code>credentialId</code> are valid.</li>
     * <li>If <code>directoryId</code> is specified, confirm that it belongs to one of the available personal directories of the caller in the current digital employee environment.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a Lark Minutes meeting file to the personal resource library of the current digital employee.</p>
     * 
     * @param request CreatePersonalFeishuMinuteRequest
     * @return CreatePersonalFeishuMinuteResponse
     */
    public CreatePersonalFeishuMinuteResponse createPersonalFeishuMinute(CreatePersonalFeishuMinuteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalFeishuMinuteWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to upload a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>The file must include an OSS persistent address (<code>filePath</code>). Other information such as the public access URL and original file name is optional.</li>
     * <li>If the target folder ID (<code>directoryId</code>) is not specified, the file is automatically attached to the default root folder of the current digital employee. If specified, ensure that the folder belongs to the personal folder of the caller.</li>
     * <li>Security authentication is supported through multiple authentication methods (AK, BearerToken, and APP) to authenticate requests.</li>
     * <li>The operation type is write (<code>write</code>), and operation logs are recorded for subsequent auditing.
     * To invoke this operation, you can use AK, BearerToken, or APP authentication.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a file to the personal resource library of the current digital employee.</p>
     * 
     * @param request CreatePersonalFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalFileResponse
     */
    public CreatePersonalFileResponse createPersonalFileWithOptions(CreatePersonalFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileExt)) {
            body.put("fileExt", request.fileExt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePublicUrl)) {
            body.put("filePublicUrl", request.filePublicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileRecordId)) {
            body.put("fileRecordId", request.fileRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalFile"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalFile"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalFileResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to upload a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>The file must include an OSS persistent address (<code>filePath</code>). Other information such as the public access URL and original file name is optional.</li>
     * <li>If the target folder ID (<code>directoryId</code>) is not specified, the file is automatically attached to the default root folder of the current digital employee. If specified, ensure that the folder belongs to the personal folder of the caller.</li>
     * <li>Security authentication is supported through multiple authentication methods (AK, BearerToken, and APP) to authenticate requests.</li>
     * <li>The operation type is write (<code>write</code>), and operation logs are recorded for subsequent auditing.
     * To invoke this operation, you can use AK, BearerToken, or APP authentication.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a file to the personal resource library of the current digital employee.</p>
     * 
     * @param request CreatePersonalFileRequest
     * @return CreatePersonalFileResponse
     */
    public CreatePersonalFileResponse createPersonalFile(CreatePersonalFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to add plain text content to the personal resources of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>TEXT</code>, and <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>If <code>directoryId</code> is not provided, the content is bound to the root directory of the current digital employee by default. If provided, it must be an existing personal directory of the caller under the digital employee.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> can only be obtained from the authentication identity information. These parameters are ignored if passed in the request body.</li>
     * <li>The call initiates metering and generates a corresponding <code>billing_id</code>.</li>
     * <li>The text content is written to <code>unstructured_docs</code>, and an initial resource record is generated.</li>
     * <li>Any validation or execution failure throws a <code>RobjectException</code>, which is converted to a POP error code by the global middleware and returned to the caller.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads plain text content to the personal resource library of the current digital employee.</p>
     * 
     * @param request CreatePersonalTextRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalTextResponse
     */
    public CreatePersonalTextResponse createPersonalTextWithOptions(CreatePersonalTextRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textContent)) {
            body.put("textContent", request.textContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalText"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalText"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalTextResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to add plain text content to the personal resources of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>TEXT</code>, and <code>scope</code> is fixed to <code>PERSONAL</code>.</li>
     * <li>If <code>directoryId</code> is not provided, the content is bound to the root directory of the current digital employee by default. If provided, it must be an existing personal directory of the caller under the digital employee.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> can only be obtained from the authentication identity information. These parameters are ignored if passed in the request body.</li>
     * <li>The call initiates metering and generates a corresponding <code>billing_id</code>.</li>
     * <li>The text content is written to <code>unstructured_docs</code>, and an initial resource record is generated.</li>
     * <li>Any validation or execution failure throws a <code>RobjectException</code>, which is converted to a POP error code by the global middleware and returned to the caller.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads plain text content to the personal resource library of the current digital employee.</p>
     * 
     * @param request CreatePersonalTextRequest
     * @return CreatePersonalTextResponse
     */
    public CreatePersonalTextResponse createPersonalText(CreatePersonalTextRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalTextWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation uploads an offline meeting audio file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>VOICE_MEETING</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>voice_meeting_type</code> is fixed to <code>OFFLINE</code>.</li>
     * <li>If <code>directoryId</code> is not provided in the request body, the resource is automatically bound to the default root directory. If <code>directoryId</code> is provided, it must be an existing personal directory of the current user under the current digital employee.</li>
     * <li>Calling this operation starts a background process to transcribe the audio file and returns information about the newly created resource.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authenticated identity. These fields are ignored even if they are included in the request body.</li>
     * <li>Any validation or execution failure throws a <code>RobjectException</code>, which is converted to a POP error code through the global middleware.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads an offline meeting audio file to the personal resources of the current digital employee.</p>
     * 
     * @param request CreatePersonalVoiceMeetingRequest
     * @param headers CreatePersonalVoiceMeetingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalVoiceMeetingResponse
     */
    public CreatePersonalVoiceMeetingResponse createPersonalVoiceMeetingWithOptions(CreatePersonalVoiceMeetingRequest request, CreatePersonalVoiceMeetingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.requestId)) {
            realHeaders.put("requestId", com.aliyun.teautil.Common.toJSONString(headers.requestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalVoiceMeeting"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createPersonalVoiceMeeting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalVoiceMeetingResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation uploads an offline meeting audio file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>VOICE_MEETING</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>voice_meeting_type</code> is fixed to <code>OFFLINE</code>.</li>
     * <li>If <code>directoryId</code> is not provided in the request body, the resource is automatically bound to the default root directory. If <code>directoryId</code> is provided, it must be an existing personal directory of the current user under the current digital employee.</li>
     * <li>Calling this operation starts a background process to transcribe the audio file and returns information about the newly created resource.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authenticated identity. These fields are ignored even if they are included in the request body.</li>
     * <li>Any validation or execution failure throws a <code>RobjectException</code>, which is converted to a POP error code through the global middleware.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads an offline meeting audio file to the personal resources of the current digital employee.</p>
     * 
     * @param request CreatePersonalVoiceMeetingRequest
     * @return CreatePersonalVoiceMeetingResponse
     */
    public CreatePersonalVoiceMeetingResponse createPersonalVoiceMeeting(CreatePersonalVoiceMeetingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreatePersonalVoiceMeetingHeaders headers = new CreatePersonalVoiceMeetingHeaders();
        return this.createPersonalVoiceMeetingWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation is used to upload files to an enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL of the file and the original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee by default.</li>
     * <li>You can add tags to resources by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure that your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scheduled task.</p>
     * 
     * @param tmpReq CreateScheduledTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTaskWithOptions(CreateScheduledTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScheduledTaskShrinkRequest request = new CreateScheduledTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.description)) {
            request.descriptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.description, "description", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.digitalEmployeeName)) {
            request.digitalEmployeeNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.digitalEmployeeName, "digitalEmployeeName", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.segments)) {
            request.segmentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.segments, "segments", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskDetail)) {
            request.taskDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskDetail, "taskDetail", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.triggerConfig)) {
            request.triggerConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.triggerConfig, "triggerConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.visibleMemberUserIds)) {
            request.visibleMemberUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.visibleMemberUserIds, "visibleMemberUserIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collaborationGroupId)) {
            body.put("collaborationGroupId", request.collaborationGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.descriptionShrink)) {
            body.put("description", request.descriptionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalEmployeeNameShrink)) {
            body.put("digitalEmployeeName", request.digitalEmployeeNameShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOpen)) {
            body.put("isOpen", request.isOpen);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.segmentsShrink)) {
            body.put("segments", request.segmentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDetailShrink)) {
            body.put("taskDetail", request.taskDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConfigShrink)) {
            body.put("triggerConfig", request.triggerConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            body.put("visibility", request.visibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibleMemberUserIdsShrink)) {
            body.put("visibleMemberUserIds", request.visibleMemberUserIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScheduledTask"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createScheduledTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduledTaskResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation is used to upload files to an enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL of the file and the original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee by default.</li>
     * <li>You can add tags to resources by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure that your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a scheduled task.</p>
     * 
     * @param request CreateScheduledTaskRequest
     * @return CreateScheduledTaskResponse
     */
    public CreateScheduledTaskResponse createScheduledTask(CreateScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createScheduledTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to create a new enterprise knowledge base directory under a specified tenant.</li>
     * <li>You can specify the parent directory of the new directory by setting the <code>parentId</code> parameter. If this parameter is not specified, the directory is created as a root directory by default.</li>
     * <li>The <code>path</code> parameter is optional. If this parameter is not specified, the system automatically calculates the path based on the parent directory.</li>
     * <li>Calling this operation requires the corresponding permissions. Multiple authentication methods are supported, including AK, BearerToken, and APP authentication.</li>
     * <li>After the directory is created, the related information of the new directory is returned, such as the directory ID and name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a knowledge base and knowledge base categories.</p>
     * 
     * @param request CreateTenantDirectoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTenantDirectoryResponse
     */
    public CreateTenantDirectoryResponse createTenantDirectoryWithOptions(CreateTenantDirectoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("parentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTenantDirectory"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createTenantDirectory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTenantDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to create a new enterprise knowledge base directory under a specified tenant.</li>
     * <li>You can specify the parent directory of the new directory by setting the <code>parentId</code> parameter. If this parameter is not specified, the directory is created as a root directory by default.</li>
     * <li>The <code>path</code> parameter is optional. If this parameter is not specified, the system automatically calculates the path based on the parent directory.</li>
     * <li>Calling this operation requires the corresponding permissions. Multiple authentication methods are supported, including AK, BearerToken, and APP authentication.</li>
     * <li>After the directory is created, the related information of the new directory is returned, such as the directory ID and name.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds a knowledge base and knowledge base categories.</p>
     * 
     * @param request CreateTenantDirectoryRequest
     * @return CreateTenantDirectoryResponse
     */
    public CreateTenantDirectoryResponse createTenantDirectory(CreateTenantDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTenantDirectoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a user by using OpenAPI.
     *     Business orchestration:
     *     1. Parses roleCodes → role_ids (validates against system role enumerations).
     *     2. Checks whether the user already exists (used to return the isNewUser flag).
     *     3. Calls UserManagementService.add_tenant_member to create or add the user (the password must be passed in as an RSA ciphertext by the caller).
     *     4. Returns the creation result (including the isNewUser flag).
     *     Error codes:
     *     - ERR.User.DeactivatedInTenant: The user is deactivated in the tenant. Use updateUser to resume the user.
     *     - ERR.User.AlreadyInTenant: The user is already an active member of the tenant.
     *     - ERR.User.DisplayNameDuplicateInTenant: The display name is duplicate within the tenant.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user and adds the user to a tenant.</p>
     * 
     * @param tmpReq CreateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUserShrinkRequest request = new CreateUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "roleCodes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordEncrypted)) {
            body.put("passwordEncrypted", request.passwordEncrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("roleCodes", request.roleCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wnAccountId)) {
            body.put("wnAccountId", request.wnAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/createUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a user by using OpenAPI.
     *     Business orchestration:
     *     1. Parses roleCodes → role_ids (validates against system role enumerations).
     *     2. Checks whether the user already exists (used to return the isNewUser flag).
     *     3. Calls UserManagementService.add_tenant_member to create or add the user (the password must be passed in as an RSA ciphertext by the caller).
     *     4. Returns the creation result (including the isNewUser flag).
     *     Error codes:
     *     - ERR.User.DeactivatedInTenant: The user is deactivated in the tenant. Use updateUser to resume the user.
     *     - ERR.User.AlreadyInTenant: The user is already an active member of the tenant.
     *     - ERR.User.DisplayNameDuplicateInTenant: The display name is duplicate within the tenant.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user and adds the user to a tenant.</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to upload a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>The file must include an OSS persistent address (<code>filePath</code>). Other information such as the public access URL and original file name is optional.</li>
     * <li>If the target directory ID (<code>directoryId</code>) is not specified, the file is automatically attached to the default root directory of the current digital employee. If specified, ensure that the directory belongs to the personal directory of the caller.</li>
     * <li>Security authentication is supported through multiple methods (AK, BearerToken, APP).</li>
     * <li>The operation type is write (<code>write</code>), and operation logs are recorded for subsequent auditing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a session.</p>
     * 
     * @param request DeleteChatSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChatSessionResponse
     */
    public DeleteChatSessionResponse deleteChatSessionWithOptions(DeleteChatSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChatSession"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/deleteChatSession"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChatSessionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to upload a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>The file must include an OSS persistent address (<code>filePath</code>). Other information such as the public access URL and original file name is optional.</li>
     * <li>If the target directory ID (<code>directoryId</code>) is not specified, the file is automatically attached to the default root directory of the current digital employee. If specified, ensure that the directory belongs to the personal directory of the caller.</li>
     * <li>Security authentication is supported through multiple methods (AK, BearerToken, APP).</li>
     * <li>The operation type is write (<code>write</code>), and operation logs are recorded for subsequent auditing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a session.</p>
     * 
     * @param request DeleteChatSessionRequest
     * @return DeleteChatSessionResponse
     */
    public DeleteChatSessionResponse deleteChatSession(DeleteChatSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteChatSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>tenantId</code> is derived from the authenticated identity only. Any value passed by the caller is ignored.</li>
     * <li><code>sourceId</code> is passed through the request body. The registration path is the flat URI <code>/openapi/deleteSource</code> and does not contain a <code>{sourceId}</code> path template. Do not append the resource ID as a path segment. The gateway performs exact routing based on the flat URI and returns <code>InvalidAction.NotFound</code> if the path does not match.</li>
     * <li>Deletion is irreversible. The parsing results and bindings associated with the resource are invalidated.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified source.</p>
     * 
     * @param request DeleteSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSourceResponse
     */
    public DeleteSourceResponse deleteSourceWithOptions(DeleteSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/deleteSource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>tenantId</code> is derived from the authenticated identity only. Any value passed by the caller is ignored.</li>
     * <li><code>sourceId</code> is passed through the request body. The registration path is the flat URI <code>/openapi/deleteSource</code> and does not contain a <code>{sourceId}</code> path template. Do not append the resource ID as a path segment. The gateway performs exact routing based on the flat URI and returns <code>InvalidAction.NotFound</code> if the path does not match.</li>
     * <li>Deletion is irreversible. The parsing results and bindings associated with the resource are invalidated.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified source.</p>
     * 
     * @param request DeleteSourceRequest
     * @return DeleteSourceResponse
     */
    public DeleteSourceResponse deleteSource(DeleteSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API allows you to delete a specific enterprise knowledge base directory.</li>
     * <li>Set the <code>deleteMode</code> parameter to select different deletion strategies, including reject deletion (reject), recursive deletion (recursive), or move the directory to the root directory (move_to_root).</li>
     * <li>If <code>deleteMode</code> is not provided, the default behavior is to reject deletion.</li>
     * <li>The enterprise directory boundary is validated before the deletion operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an enterprise knowledge base and its subdirectories.</p>
     * 
     * @param request DeleteTenantDirectoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTenantDirectoryResponse
     */
    public DeleteTenantDirectoryResponse deleteTenantDirectoryWithOptions(DeleteTenantDirectoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteMode)) {
            body.put("deleteMode", request.deleteMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTenantDirectory"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/deleteTenantDirectory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTenantDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API allows you to delete a specific enterprise knowledge base directory.</li>
     * <li>Set the <code>deleteMode</code> parameter to select different deletion strategies, including reject deletion (reject), recursive deletion (recursive), or move the directory to the root directory (move_to_root).</li>
     * <li>If <code>deleteMode</code> is not provided, the default behavior is to reject deletion.</li>
     * <li>The enterprise directory boundary is validated before the deletion operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an enterprise knowledge base and its subdirectories.</p>
     * 
     * @param request DeleteTenantDirectoryRequest
     * @return DeleteTenantDirectoryResponse
     */
    public DeleteTenantDirectoryResponse deleteTenantDirectory(DeleteTenantDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTenantDirectoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Disables the INSTANCE token of a user.
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is enforced).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Calls disable_token (ACTIVE → INACTIVE).
     *     4. Returns disabled=True.
     *     Idempotence: If no ACTIVE token exists, deactivate_all affects 0 rows and does not return an error.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an API token.</p>
     * 
     * @param request DisableTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableTokenResponse
     */
    public DisableTokenResponse disableTokenWithOptions(DisableTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wnUserId)) {
            body.put("wnUserId", request.wnUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableToken"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/disableToken"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Disables the INSTANCE token of a user.
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is enforced).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Calls disable_token (ACTIVE → INACTIVE).
     *     4. Returns disabled=True.
     *     Idempotence: If no ACTIVE token exists, deactivate_all affects 0 rows and does not return an error.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an API token.</p>
     * 
     * @param request DisableTokenRequest
     * @return DisableTokenResponse
     */
    public DisableTokenResponse disableToken(DisableTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.disableTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Enables the INSTANCE token for a user (idempotent).
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is required).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Calls enable_token:
     *        - If an ACTIVE token exists, returns idempotently (only the masked value is returned, and the plaintext is not issued again).
     *        - If an INACTIVE token exists, reactivates it (returns the plaintext).
     *        - If no token exists, creates one (returns the plaintext).
     *     Security constraint: The token plaintext is returned only once when the token is first enabled. Subsequent idempotent calls do not return the plaintext.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables an API token.</p>
     * 
     * @param request EnableTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableTokenResponse
     */
    public EnableTokenResponse enableTokenWithOptions(EnableTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wnUserId)) {
            body.put("wnUserId", request.wnUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableToken"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/enableToken"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Enables the INSTANCE token for a user (idempotent).
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is required).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Calls enable_token:
     *        - If an ACTIVE token exists, returns idempotently (only the masked value is returned, and the plaintext is not issued again).
     *        - If an INACTIVE token exists, reactivates it (returns the plaintext).
     *        - If no token exists, creates one (returns the plaintext).
     *     Security constraint: The token plaintext is returned only once when the token is first enabled. Subsequent idempotent calls do not return the plaintext.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables an API token.</p>
     * 
     * @param request EnableTokenRequest
     * @return EnableTokenResponse
     */
    public EnableTokenResponse enableToken(EnableTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.enableTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API uploads a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>The file must include an OSS persistent address (<code>filePath</code>). Other information such as the public access URL and original file name is optional.</li>
     * <li>If no target folder ID (<code>directoryId</code>) is specified, the file is automatically attached to the default root folder of the current digital employee. If specified, ensure that the folder belongs to the invoker\&quot;s personal folder.</li>
     * <li>Security verification is supported through multiple authenticate methods (AK, BearerToken, APP).</li>
     * <li>The operation type is write (<code>write</code>), and operation logs are recorded for subsequent auditing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves session details.</p>
     * 
     * @param request GetChatSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChatSessionResponse
     */
    public GetChatSessionResponse getChatSessionWithOptions(GetChatSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChatSession"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getChatSession"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChatSessionResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API uploads a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>The file must include an OSS persistent address (<code>filePath</code>). Other information such as the public access URL and original file name is optional.</li>
     * <li>If no target folder ID (<code>directoryId</code>) is specified, the file is automatically attached to the default root folder of the current digital employee. If specified, ensure that the folder belongs to the invoker\&quot;s personal folder.</li>
     * <li>Security verification is supported through multiple authenticate methods (AK, BearerToken, APP).</li>
     * <li>The operation type is write (<code>write</code>), and operation logs are recorded for subsequent auditing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves session details.</p>
     * 
     * @param request GetChatSessionRequest
     * @return GetChatSessionResponse
     */
    public GetChatSessionResponse getChatSession(GetChatSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChatSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Reads the active schema_content and securely trims it based on the token user\&quot;s semantic resource READ permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the active Graph Schema that is readable by the current user.</p>
     * 
     * @param request GetGraphSchemaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGraphSchemaResponse
     */
    public GetGraphSchemaResponse getGraphSchemaWithOptions(GetGraphSchemaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.graphName)) {
            body.put("graphName", request.graphName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGraphSchema"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getGraphSchema"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGraphSchemaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Reads the active schema_content and securely trims it based on the token user\&quot;s semantic resource READ permissions.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the active Graph Schema that is readable by the current user.</p>
     * 
     * @param request GetGraphSchemaRequest
     * @return GetGraphSchemaResponse
     */
    public GetGraphSchemaResponse getGraphSchema(GetGraphSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getGraphSchemaWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries the expiration time of the most recently created standard package instance for a specified tenant.</li>
     * <li>If no standard package instance is found, the <code>found</code> field returns <code>False</code>.</li>
     * <li>You can use the <code>tenantId</code> parameter to specify the tenant ID. By default, the tenant ID of the caller is used.</li>
     * <li>The request method is POST and must be called over HTTPS.</li>
     * <li>Valid authentication information (such as AK, BearerToken, or APP) is required to complete the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the expiration time of the most recently created standard package instance for a tenant.</p>
     * 
     * @param request GetInstanceExpireTimeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceExpireTimeResponse
     */
    public GetInstanceExpireTimeResponse getInstanceExpireTimeWithOptions(GetInstanceExpireTimeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceExpireTime"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getInstanceExpireTime"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceExpireTimeResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries the expiration time of the most recently created standard package instance for a specified tenant.</li>
     * <li>If no standard package instance is found, the <code>found</code> field returns <code>False</code>.</li>
     * <li>You can use the <code>tenantId</code> parameter to specify the tenant ID. By default, the tenant ID of the caller is used.</li>
     * <li>The request method is POST and must be called over HTTPS.</li>
     * <li>Valid authentication information (such as AK, BearerToken, or APP) is required to complete the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the expiration time of the most recently created standard package instance for a tenant.</p>
     * 
     * @param request GetInstanceExpireTimeRequest
     * @return GetInstanceExpireTimeResponse
     */
    public GetInstanceExpireTimeResponse getInstanceExpireTime(GetInstanceExpireTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getInstanceExpireTimeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation retrieves the details of a specific knowledge item in the enterprise knowledge base.</li>
     * <li>Calling this operation requires the <code>DEVELOPMENT_KB_VIEW</code> feature permission.</li>
     * <li>Knowledge details include but are not limited to the knowledge type, name, and description.</li>
     * <li>The <code>sourceId</code> parameter is required to identify the knowledge item to query.</li>
     * <li><code>tenantId</code> is an optional parameter. The tenant ID of the caller is used by default.</li>
     * <li>Authentication is supported through <code>AK</code>, <code>BearerToken</code>, or <code>APP</code> methods.</li>
     * <li>Security constraint: <code>tenant_id</code> and <code>user_id</code> can only be derived from the authenticated identity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified knowledge item in the enterprise knowledge base.</p>
     * 
     * @param request GetKnowledgeBaseSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetKnowledgeBaseSourceResponse
     */
    public GetKnowledgeBaseSourceResponse getKnowledgeBaseSourceWithOptions(GetKnowledgeBaseSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetKnowledgeBaseSource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getKnowledgeBaseSource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetKnowledgeBaseSourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation retrieves the details of a specific knowledge item in the enterprise knowledge base.</li>
     * <li>Calling this operation requires the <code>DEVELOPMENT_KB_VIEW</code> feature permission.</li>
     * <li>Knowledge details include but are not limited to the knowledge type, name, and description.</li>
     * <li>The <code>sourceId</code> parameter is required to identify the knowledge item to query.</li>
     * <li><code>tenantId</code> is an optional parameter. The tenant ID of the caller is used by default.</li>
     * <li>Authentication is supported through <code>AK</code>, <code>BearerToken</code>, or <code>APP</code> methods.</li>
     * <li>Security constraint: <code>tenant_id</code> and <code>user_id</code> can only be derived from the authenticated identity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified knowledge item in the enterprise knowledge base.</p>
     * 
     * @param request GetKnowledgeBaseSourceRequest
     * @return GetKnowledgeBaseSourceResponse
     */
    public GetKnowledgeBaseSourceResponse getKnowledgeBaseSource(GetKnowledgeBaseSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getKnowledgeBaseSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to an enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can add tags to the resource by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the execution details of a scheduled task.</p>
     * 
     * @param request GetScheduledTaskExecutionDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduledTaskExecutionDetailResponse
     */
    public GetScheduledTaskExecutionDetailResponse getScheduledTaskExecutionDetailWithOptions(GetScheduledTaskExecutionDetailRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executionId)) {
            query.put("executionId", request.executionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheduledTaskExecutionDetail"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getScheduledTaskExecutionDetail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduledTaskExecutionDetailResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to an enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can add tags to the resource by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the execution details of a scheduled task.</p>
     * 
     * @param request GetScheduledTaskExecutionDetailRequest
     * @return GetScheduledTaskExecutionDetailResponse
     */
    public GetScheduledTaskExecutionDetailResponse getScheduledTaskExecutionDetail(GetScheduledTaskExecutionDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScheduledTaskExecutionDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to the enterprise knowledge base.</li>
     * <li>The <code>DEVELOPMENT_KB_MANAGE</code> feature permission is required to call this API.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can add tags to the resource by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Ensure that your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves execution records of scheduled tasks.</p>
     * 
     * @param request GetScheduledTaskExecutionRecordsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduledTaskExecutionRecordsResponse
     */
    public GetScheduledTaskExecutionRecordsResponse getScheduledTaskExecutionRecordsWithOptions(GetScheduledTaskExecutionRecordsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collaborationGroupId)) {
            query.put("collaborationGroupId", request.collaborationGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initiatorUserId)) {
            query.put("initiatorUserId", request.initiatorUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheduledTaskExecutionRecords"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getScheduledTaskExecutionRecords"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduledTaskExecutionRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to the enterprise knowledge base.</li>
     * <li>The <code>DEVELOPMENT_KB_MANAGE</code> feature permission is required to call this API.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can add tags to the resource by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Ensure that your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves execution records of scheduled tasks.</p>
     * 
     * @param request GetScheduledTaskExecutionRecordsRequest
     * @return GetScheduledTaskExecutionRecordsResponse
     */
    public GetScheduledTaskExecutionRecordsResponse getScheduledTaskExecutionRecords(GetScheduledTaskExecutionRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScheduledTaskExecutionRecordsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation uploads a file to the enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL of the file and the original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee by default.</li>
     * <li>You can add tags to the resource by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Ensure that your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of scheduled task understanding.</p>
     * 
     * @deprecated OpenAPI GetScheduledTaskUnderstandDetail is deprecated
     * 
     * @param tmpReq GetScheduledTaskUnderstandDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduledTaskUnderstandDetailResponse
     */
    @Deprecated
    // Deprecated
    public GetScheduledTaskUnderstandDetailResponse getScheduledTaskUnderstandDetailWithOptions(GetScheduledTaskUnderstandDetailRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetScheduledTaskUnderstandDetailShrinkRequest request = new GetScheduledTaskUnderstandDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.digitalEmployeeName)) {
            request.digitalEmployeeNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.digitalEmployeeName, "digitalEmployeeName", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.segments)) {
            request.segmentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.segments, "segments", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collaborationGroupId)) {
            query.put("collaborationGroupId", request.collaborationGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalEmployeeNameShrink)) {
            query.put("digitalEmployeeName", request.digitalEmployeeNameShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.segmentsShrink)) {
            query.put("segments", request.segmentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInput)) {
            query.put("userInput", request.userInput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetScheduledTaskUnderstandDetail"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getScheduledTaskUnderstandDetail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduledTaskUnderstandDetailResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation uploads a file to the enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL of the file and the original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee by default.</li>
     * <li>You can add tags to the resource by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Ensure that your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of scheduled task understanding.</p>
     * 
     * @deprecated OpenAPI GetScheduledTaskUnderstandDetail is deprecated
     * 
     * @param request GetScheduledTaskUnderstandDetailRequest
     * @return GetScheduledTaskUnderstandDetailResponse
     */
    @Deprecated
    // Deprecated
    public GetScheduledTaskUnderstandDetailResponse getScheduledTaskUnderstandDetail(GetScheduledTaskUnderstandDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScheduledTaskUnderstandDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Queries skill details by SkillCode or SkillName, including metadata, input parameter schema, and SKILL.md summary.</p>
     * <ul>
     * <li><strong>TenantId</strong>: Optional common parameter passed through by the gateway to the backend header. If not specified, the default tenant of the current caller is used.</li>
     * <li><strong>SkillCode</strong>: Mutually exclusive with SkillName. If both are specified, SkillCode takes precedence.</li>
     * <li><strong>SkillName</strong>: Mutually exclusive with SkillCode. If the name is not unique within the tenant, <code>ERR.SkillHub.SkillNameAmbiguous</code> is returned.</li>
     * <li><strong>ViewMode</strong>: Optional. Valid values: <code>draft</code> (draft/editing view) or <code>published</code> (published view, default).</li>
     * <li><strong>IncludeSkillFiles</strong>: Optional. Specifies whether to return the complete skill file tree (SKILL.md / scripts / templates). Default value: <code>false</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves skill details.</p>
     * 
     * @param request GetSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillResponse
     */
    public GetSkillResponse getSkillWithOptions(GetSkillRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeSkillFiles)) {
            body.put("includeSkillFiles", request.includeSkillFiles);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillCode)) {
            body.put("skillCode", request.skillCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            body.put("skillName", request.skillName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewMode)) {
            body.put("viewMode", request.viewMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkill"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getSkill"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Queries skill details by SkillCode or SkillName, including metadata, input parameter schema, and SKILL.md summary.</p>
     * <ul>
     * <li><strong>TenantId</strong>: Optional common parameter passed through by the gateway to the backend header. If not specified, the default tenant of the current caller is used.</li>
     * <li><strong>SkillCode</strong>: Mutually exclusive with SkillName. If both are specified, SkillCode takes precedence.</li>
     * <li><strong>SkillName</strong>: Mutually exclusive with SkillCode. If the name is not unique within the tenant, <code>ERR.SkillHub.SkillNameAmbiguous</code> is returned.</li>
     * <li><strong>ViewMode</strong>: Optional. Valid values: <code>draft</code> (draft/editing view) or <code>published</code> (published view, default).</li>
     * <li><strong>IncludeSkillFiles</strong>: Optional. Specifies whether to return the complete skill file tree (SKILL.md / scripts / templates). Default value: <code>false</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves skill details.</p>
     * 
     * @param request GetSkillRequest
     * @return GetSkillResponse
     */
    public GetSkillResponse getSkill(GetSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSkillWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Queries the current status and result of an asynchronous task by <code>RunId</code>.</p>
     * <ul>
     * <li><strong>State machine</strong>: Running (PENDING/RUNNING) → Succeeded / Failed / Cancelled</li>
     * <li><strong>TenantId</strong>: An optional common parameter passed through by the gateway. The backend verifies that the RunId belongs to the current tenant. Otherwise, <code>ERR.SkillHub.RunNotFound</code> is returned to avoid exposing existence information.</li>
     * <li><strong>IncludeLogs</strong>: Optional. Specifies whether to return execution logs. Default value: <code>false</code>.
     * When execution succeeds, <code>Result.Content[]</code> is an MCP-style Content block array (Text / File / Image).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution result of a skill.</p>
     * 
     * @param request GetSkillRunRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSkillRunResponse
     */
    public GetSkillRunResponse getSkillRunWithOptions(GetSkillRunRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeLogs)) {
            body.put("includeLogs", request.includeLogs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runId)) {
            body.put("runId", request.runId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSkillRun"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getSkillRun"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSkillRunResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Queries the current status and result of an asynchronous task by <code>RunId</code>.</p>
     * <ul>
     * <li><strong>State machine</strong>: Running (PENDING/RUNNING) → Succeeded / Failed / Cancelled</li>
     * <li><strong>TenantId</strong>: An optional common parameter passed through by the gateway. The backend verifies that the RunId belongs to the current tenant. Otherwise, <code>ERR.SkillHub.RunNotFound</code> is returned to avoid exposing existence information.</li>
     * <li><strong>IncludeLogs</strong>: Optional. Specifies whether to return execution logs. Default value: <code>false</code>.
     * When execution succeeds, <code>Result.Content[]</code> is an MCP-style Content block array (Text / File / Image).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution result of a skill.</p>
     * 
     * @param request GetSkillRunRequest
     * @return GetSkillRunResponse
     */
    public GetSkillRunResponse getSkillRun(GetSkillRunRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSkillRunWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>tenant_id</code> is derived from the authenticated identity only. Any value passed in the body is ignored.</li>
     * <li>Response parameters do not expose audit fields such as <code>creator</code> or <code>modifier</code>. The <code>unstructured_docs[ ].content</code> field is not returned by default to avoid large responses.</li>
     * <li>Set the <code>includeDetails</code> parameter to <code>True</code> to retrieve additional details including <code>settings</code>, <code>notes</code>, <code>structuredTables</code>, and <code>unstructuredDocs</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified resource (knowledge), with support for returning large detail fields on demand.</p>
     * 
     * @param request GetSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSourceResponse
     */
    public GetSourceResponse getSourceWithOptions(GetSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.includeDetails)) {
            body.put("includeDetails", request.includeDetails);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getSource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><code>tenant_id</code> is derived from the authenticated identity only. Any value passed in the body is ignored.</li>
     * <li>Response parameters do not expose audit fields such as <code>creator</code> or <code>modifier</code>. The <code>unstructured_docs[ ].content</code> field is not returned by default to avoid large responses.</li>
     * <li>Set the <code>includeDetails</code> parameter to <code>True</code> to retrieve additional details including <code>settings</code>, <code>notes</code>, <code>structuredTables</code>, and <code>unstructuredDocs</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified resource (knowledge), with support for returning large detail fields on demand.</p>
     * 
     * @param request GetSourceRequest
     * @return GetSourceResponse
     */
    public GetSourceResponse getSource(GetSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API allows callers to obtain a signed URL for directly uploading files to Alibaba Cloud Object Storage Service (OSS) based on the provided file name and other information. With this URL, users can upload files directly to the specified OSS location without routing through an intermediate server, which improves efficiency and security.</p>
     * <ul>
     * <li><strong>Security constraint</strong>: <code>tenant_id</code>/<code>user_id</code> are derived only from the authenticated identity. Values provided in the request body are ignored.</li>
     * <li><strong>Default value</strong>: If the <code>expires</code> parameter is not specified, the default expiration time is 3600 seconds (1 hour).</li>
     * <li><strong>Content-Type</strong>: If <code>contentType</code> is not provided, the system attempts to automatically infer the file type.</li>
     * <li><strong>Scope</strong>: The <code>scope</code> parameter defines whether the data source belongs to a personal or enterprise knowledge base. In most cases, this does not need to be set.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a signed URL for directly uploading files to OSS.</p>
     * 
     * @param request GetSourceUploadSignatureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSourceUploadSignatureResponse
     */
    public GetSourceUploadSignatureResponse getSourceUploadSignatureWithOptions(GetSourceUploadSignatureRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("contentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expires)) {
            body.put("expires", request.expires);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filename)) {
            body.put("filename", request.filename);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSourceUploadSignature"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getSourceUploadSignature"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSourceUploadSignatureResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API allows callers to obtain a signed URL for directly uploading files to Alibaba Cloud Object Storage Service (OSS) based on the provided file name and other information. With this URL, users can upload files directly to the specified OSS location without routing through an intermediate server, which improves efficiency and security.</p>
     * <ul>
     * <li><strong>Security constraint</strong>: <code>tenant_id</code>/<code>user_id</code> are derived only from the authenticated identity. Values provided in the request body are ignored.</li>
     * <li><strong>Default value</strong>: If the <code>expires</code> parameter is not specified, the default expiration time is 3600 seconds (1 hour).</li>
     * <li><strong>Content-Type</strong>: If <code>contentType</code> is not provided, the system attempts to automatically infer the file type.</li>
     * <li><strong>Scope</strong>: The <code>scope</code> parameter defines whether the data source belongs to a personal or enterprise knowledge base. In most cases, this does not need to be set.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates a signed URL for directly uploading files to OSS.</p>
     * 
     * @param request GetSourceUploadSignatureRequest
     * @return GetSourceUploadSignatureResponse
     */
    public GetSourceUploadSignatureResponse getSourceUploadSignature(GetSourceUploadSignatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSourceUploadSignatureWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the INSTANCE token status of a user.
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is required).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Queries the ACTIVE INSTANCE token.
     *     4. If the token exists, returns enabled=True with the masked value and creation time.
     *     5. If the token does not exist, returns enabled=False.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token status of a user.</p>
     * 
     * @param request GetTokenInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenInfoResponse
     */
    public GetTokenInfoResponse getTokenInfoWithOptions(GetTokenInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wnUserId)) {
            body.put("wnUserId", request.wnUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTokenInfo"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getTokenInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the INSTANCE token status of a user.
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is required).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Queries the ACTIVE INSTANCE token.
     *     4. If the token exists, returns enabled=True with the masked value and creation time.
     *     5. If the token does not exist, returns enabled=False.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token status of a user.</p>
     * 
     * @param request GetTokenInfoRequest
     * @return GetTokenInfoResponse
     */
    public GetTokenInfoResponse getTokenInfo(GetTokenInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries user details through OpenAPI.
     *     Business orchestration:
     *     1. Locate the user by wnUserId or accountId.
     *     2. Query the user mapping information in the current tenant (status, join time, and last logon time).
     *     3. Query the role list of the user in the current tenant.
     *     4. Query the user group list of the user in the current tenant.
     *     5. Assemble the response.
     *     Error codes:
     *     - ERR.User.NotFound: The user does not exist.
     *     - ERR.User.NotInTenant: The user does not belong to the current tenant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries user details.</p>
     * 
     * @param request GetUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wnAccountId)) {
            query.put("wnAccountId", request.wnAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wnUserId)) {
            query.put("wnUserId", request.wnUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries user details through OpenAPI.
     *     Business orchestration:
     *     1. Locate the user by wnUserId or accountId.
     *     2. Query the user mapping information in the current tenant (status, join time, and last logon time).
     *     3. Query the role list of the user in the current tenant.
     *     4. Query the user group list of the user in the current tenant.
     *     5. Assemble the response.
     *     Error codes:
     *     - ERR.User.NotFound: The user does not exist.
     *     - ERR.User.NotInTenant: The user does not belong to the current tenant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries user details.</p>
     * 
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to retrieve the credit usage details of the current logged-on user, including the credit limit, consumed credits, and remaining credits.</li>
     * <li>Data is sourced from a real-time Redis cache, ensuring information immediacy.</li>
     * <li>You can specify a tenant ID to query the credit usage of a user under a specific tenant. By default, the caller\&quot;s default tenant is used.</li>
     * <li>You can optionally provide a <code>RequestId</code> as a request identifier, but this is not required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time credit consumption, limit, and remaining balance of the current logged-on user.</p>
     * 
     * @param request GetUserCreditUsageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserCreditUsageResponse
     */
    public GetUserCreditUsageResponse getUserCreditUsageWithOptions(GetUserCreditUsageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserCreditUsage"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getUserCreditUsage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserCreditUsageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to retrieve the credit usage details of the current logged-on user, including the credit limit, consumed credits, and remaining credits.</li>
     * <li>Data is sourced from a real-time Redis cache, ensuring information immediacy.</li>
     * <li>You can specify a tenant ID to query the credit usage of a user under a specific tenant. By default, the caller\&quot;s default tenant is used.</li>
     * <li>You can optionally provide a <code>RequestId</code> as a request identifier, but this is not required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the real-time credit consumption, limit, and remaining balance of the current logged-on user.</p>
     * 
     * @param request GetUserCreditUsageRequest
     * @return GetUserCreditUsageResponse
     */
    public GetUserCreditUsageResponse getUserCreditUsage(GetUserCreditUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserCreditUsageWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation returns the detailed information of the current authenticated user.</li>
     * <li>If the tenant information is invalid, the corresponding error message is returned.</li>
     * <li><code>tenantId</code> is an optional parameter. If not provided, the default tenant ID of the caller is used.</li>
     * <li>Multiple authentication methods are supported: AK, BearerToken, and APP authentication.</li>
     * <li>The returned data includes the user profile (such as username and profile picture URL), role preference settings, and details of all tenants to which the user belongs.</li>
     * <li>If the current logon tenant is the system tenant (that is, <code>tenantId=10000</code>), this is explicitly indicated in the response.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the complete information of the authenticated user through OpenAPI, including basic information and tenant list.</p>
     * 
     * @param request GetUserInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserInfoResponse
     */
    public GetUserInfoResponse getUserInfoWithOptions(GetUserInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserInfo"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/getUserInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserInfoResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation returns the detailed information of the current authenticated user.</li>
     * <li>If the tenant information is invalid, the corresponding error message is returned.</li>
     * <li><code>tenantId</code> is an optional parameter. If not provided, the default tenant ID of the caller is used.</li>
     * <li>Multiple authentication methods are supported: AK, BearerToken, and APP authentication.</li>
     * <li>The returned data includes the user profile (such as username and profile picture URL), role preference settings, and details of all tenants to which the user belongs.</li>
     * <li>If the current logon tenant is the system tenant (that is, <code>tenantId=10000</code>), this is explicitly indicated in the response.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the complete information of the authenticated user through OpenAPI, including basic information and tenant list.</p>
     * 
     * @param request GetUserInfoRequest
     * @return GetUserInfoResponse
     */
    public GetUserInfoResponse getUserInfo(GetUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Grants authorization to authorized users or user groups to use a specified digital human.
     *     Business logic:
     *     1. Constructs an AuthContext from identity.
     *     2. Performs mutual exclusion validation on the request body: specify either userIds or userGroupIds.
     *     3. Delegates to AgentAuthorizationAuthorizedService.grant_authorization to execute.
     *     4. Pre-validation: verifies MANAGE permission and agent existence (performed at the AuthorizedService layer, which performs authentication first before it exposes existence).
     *     5. Existing authorization records are updated (expire_date / permissions).</p>
     * 
     * <b>summary</b> : 
     * <p>Grants authorization to authorized users or user groups to use a digital human.</p>
     * 
     * @param tmpReq GrantAgentUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantAgentUsersResponse
     */
    public GrantAgentUsersResponse grantAgentUsersWithOptions(GrantAgentUsersRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantAgentUsersShrinkRequest request = new GrantAgentUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.permissions)) {
            request.permissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.permissions, "permissions", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userGroupIds)) {
            request.userGroupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userGroupIds, "userGroupIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIds)) {
            request.userIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIds, "userIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expireDate)) {
            body.put("expireDate", request.expireDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionsShrink)) {
            body.put("permissions", request.permissionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIdsShrink)) {
            body.put("userGroupIds", request.userGroupIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdsShrink)) {
            body.put("userIds", request.userIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantAgentUsers"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/grantAgentUsers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantAgentUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Grants authorization to authorized users or user groups to use a specified digital human.
     *     Business logic:
     *     1. Constructs an AuthContext from identity.
     *     2. Performs mutual exclusion validation on the request body: specify either userIds or userGroupIds.
     *     3. Delegates to AgentAuthorizationAuthorizedService.grant_authorization to execute.
     *     4. Pre-validation: verifies MANAGE permission and agent existence (performed at the AuthorizedService layer, which performs authentication first before it exposes existence).
     *     5. Existing authorization records are updated (expire_date / permissions).</p>
     * 
     * <b>summary</b> : 
     * <p>Grants authorization to authorized users or user groups to use a digital human.</p>
     * 
     * @param request GrantAgentUsersRequest
     * @return GrantAgentUsersResponse
     */
    public GrantAgentUsersResponse grantAgentUsers(GrantAgentUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantAgentUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API supports two modes: when <code>directoryId</code> is empty or set to \&quot;root\&quot;, the top-level knowledge base list is returned. When <code>directoryId</code> has a specific value, a drill-down operation is performed to return subdirectories and resources under the specified directory.</li>
     * <li><code>tenantId</code> is a common parameter. If not provided, the caller\&quot;s tenant ID is used by default.</li>
     * <li>In drill-down mode (when <code>directoryId</code> is not empty), use the <code>sourceTypes</code> parameter to filter resources by specific types.</li>
     * <li>The sort field (<code>sortField</code>) and sort order (<code>sortOrder</code>) can be customized. Invalid values are reset to default settings.</li>
     * <li>The search feature is only effective when retrieving the top-level list and supports only fuzzy matching on names or descriptions.</li>
     * <li>For security purposes, <code>tenant_id</code> is strictly obtained from the authenticated identity and cannot be passed through the request body.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries or drills down into the enterprise knowledge base list of a tenant.</p>
     * 
     * @param tmpReq ListAdminKnowledgeBasesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAdminKnowledgeBasesResponse
     */
    public ListAdminKnowledgeBasesResponse listAdminKnowledgeBasesWithOptions(ListAdminKnowledgeBasesRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAdminKnowledgeBasesShrinkRequest request = new ListAdminKnowledgeBasesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTypes)) {
            request.sourceTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTypes, "sourceTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("sortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("sortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTypesShrink)) {
            body.put("sourceTypes", request.sourceTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAdminKnowledgeBases"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listAdminKnowledgeBases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAdminKnowledgeBasesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API supports two modes: when <code>directoryId</code> is empty or set to \&quot;root\&quot;, the top-level knowledge base list is returned. When <code>directoryId</code> has a specific value, a drill-down operation is performed to return subdirectories and resources under the specified directory.</li>
     * <li><code>tenantId</code> is a common parameter. If not provided, the caller\&quot;s tenant ID is used by default.</li>
     * <li>In drill-down mode (when <code>directoryId</code> is not empty), use the <code>sourceTypes</code> parameter to filter resources by specific types.</li>
     * <li>The sort field (<code>sortField</code>) and sort order (<code>sortOrder</code>) can be customized. Invalid values are reset to default settings.</li>
     * <li>The search feature is only effective when retrieving the top-level list and supports only fuzzy matching on names or descriptions.</li>
     * <li>For security purposes, <code>tenant_id</code> is strictly obtained from the authenticated identity and cannot be passed through the request body.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries or drills down into the enterprise knowledge base list of a tenant.</p>
     * 
     * @param request ListAdminKnowledgeBasesRequest
     * @return ListAdminKnowledgeBasesResponse
     */
    public ListAdminKnowledgeBasesResponse listAdminKnowledgeBases(ListAdminKnowledgeBasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAdminKnowledgeBasesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the full list of digital employees under a tenant, including deactivated ones.
     *     Business logic:
     *     1. Constructs AuthContext from identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.list_agents to complete permission verification (APPLICATION_AGENT_VIEW).
     *     3. Returns rich fields for all digital employees of the tenant (operatingObjectName / displayName / authMode / isActive).
     *     4. System-level tokens are automatically allowed through ctx.skip_permission.
     *     Difference from listAuthorizedAgents: This operation returns all digital employees of the tenant (including deactivated ones, without authorization filtering) and includes rich fields such as displayName and isActive for management console display.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the full list of digital employees for a tenant.</p>
     * 
     * @param request ListAgentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgentsWithOptions(ListAgentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAgents"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listAgents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAgentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the full list of digital employees under a tenant, including deactivated ones.
     *     Business logic:
     *     1. Constructs AuthContext from identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.list_agents to complete permission verification (APPLICATION_AGENT_VIEW).
     *     3. Returns rich fields for all digital employees of the tenant (operatingObjectName / displayName / authMode / isActive).
     *     4. System-level tokens are automatically allowed through ctx.skip_permission.
     *     Difference from listAuthorizedAgents: This operation returns all digital employees of the tenant (including deactivated ones, without authorization filtering) and includes rich fields such as displayName and isActive for management console display.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the full list of digital employees for a tenant.</p>
     * 
     * @param request ListAgentsRequest
     * @return ListAgentsResponse
     */
    public ListAgentsResponse listAgents(ListAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAgentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of digital human names for which the current caller (or a specified target user) has specified permissions (USE/MANAGE).
     *     Business logic:
     *     1. Constructs an AuthContext from the identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.list_authorized_agents to execute the query.
     *     3. When skip_permission=True, returns all active agents for the tenant.
     *     4. Regular users are filtered based on authorization records and auth_mode.
     *     5. When targetUserId is specified (querying on behalf of another user), the APPLICATION_AGENT_VIEW gate is required, and the query is restricted to the current tenant. If the target user is not a member of the current tenant, a USER_NOT_IN_TENANT error is thrown (an empty list is not silently returned).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of digital human names for which the caller has specified permissions.</p>
     * 
     * @param request ListAuthorizedAgentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizedAgentsResponse
     */
    public ListAuthorizedAgentsResponse listAuthorizedAgentsWithOptions(ListAuthorizedAgentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.permission)) {
            body.put("permission", request.permission);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUserId)) {
            body.put("targetUserId", request.targetUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizedAgents"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listAuthorizedAgents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedAgentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of digital human names for which the current caller (or a specified target user) has specified permissions (USE/MANAGE).
     *     Business logic:
     *     1. Constructs an AuthContext from the identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.list_authorized_agents to execute the query.
     *     3. When skip_permission=True, returns all active agents for the tenant.
     *     4. Regular users are filtered based on authorization records and auth_mode.
     *     5. When targetUserId is specified (querying on behalf of another user), the APPLICATION_AGENT_VIEW gate is required, and the query is restricted to the current tenant. If the target user is not a member of the current tenant, a USER_NOT_IN_TENANT error is thrown (an empty list is not silently returned).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of digital human names for which the caller has specified permissions.</p>
     * 
     * @param request ListAuthorizedAgentsRequest
     * @return ListAuthorizedAgentsResponse
     */
    public ListAuthorizedAgentsResponse listAuthorizedAgents(ListAuthorizedAgentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthorizedAgentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of authorized users or user groups for a specified digital employee.
     *     Business logic:
     *     1. Constructs an AuthContext from the identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.list_authorized_users to execute the query.
     *     3. Permission verification is performed at the AuthorizedService layer by @require_permission(APPLICATION_AGENT_VIEW).
     *     4. When auth_mode=ALL_USERS, only records with MANAGE permissions are displayed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of authorized users or user groups for a digital employee.</p>
     * 
     * @param request ListAuthorizedUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizedUsersResponse
     */
    public ListAuthorizedUsersResponse listAuthorizedUsersWithOptions(ListAuthorizedUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.granteeType)) {
            body.put("granteeType", request.granteeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permission)) {
            body.put("permission", request.permission);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizedUsers"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listAuthorizedUsers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of authorized users or user groups for a specified digital employee.
     *     Business logic:
     *     1. Constructs an AuthContext from the identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.list_authorized_users to execute the query.
     *     3. Permission verification is performed at the AuthorizedService layer by @require_permission(APPLICATION_AGENT_VIEW).
     *     4. When auth_mode=ALL_USERS, only records with MANAGE permissions are displayed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of authorized users or user groups for a digital employee.</p>
     * 
     * @param request ListAuthorizedUsersRequest
     * @return ListAuthorizedUsersResponse
     */
    public ListAuthorizedUsersResponse listAuthorizedUsers(ListAuthorizedUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAuthorizedUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Enumerates all available organization synchronization configurations under the current tenant.
     *     Returns a unified configs list covering four platform types:
     *     - <strong>wecom</strong>: Retrieves active WeCom SSO configurations from SsoProviderRegistry.
     *     - <strong>saml</strong>: Retrieves active SAML SSO configurations from SsoProviderRegistry. The corpId is set to idpEntityId.
     *     - <strong>oauth2</strong>: Retrieves active OAuth2 SSO configurations from SsoProviderRegistry. The corpId is set to clientId.
     *     - <strong>custom</strong>: Queries the database for pure custom organizations registered under the tenant.
     *     The client distinguishes processing logic based on the returned platformType. The corpId is a required parameter for subsequent synchronization operations.</p>
     * 
     * <b>summary</b> : 
     * <p>Enumerates available organization synchronization configurations.</p>
     * 
     * @param request ListAvailableConfigsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableConfigsResponse
     */
    public ListAvailableConfigsResponse listAvailableConfigsWithOptions(ListAvailableConfigsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableConfigs"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listAvailableConfigs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableConfigsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Enumerates all available organization synchronization configurations under the current tenant.
     *     Returns a unified configs list covering four platform types:
     *     - <strong>wecom</strong>: Retrieves active WeCom SSO configurations from SsoProviderRegistry.
     *     - <strong>saml</strong>: Retrieves active SAML SSO configurations from SsoProviderRegistry. The corpId is set to idpEntityId.
     *     - <strong>oauth2</strong>: Retrieves active OAuth2 SSO configurations from SsoProviderRegistry. The corpId is set to clientId.
     *     - <strong>custom</strong>: Queries the database for pure custom organizations registered under the tenant.
     *     The client distinguishes processing logic based on the returned platformType. The corpId is a required parameter for subsequent synchronization operations.</p>
     * 
     * <b>summary</b> : 
     * <p>Enumerates available organization synchronization configurations.</p>
     * 
     * @param request ListAvailableConfigsRequest
     * @return ListAvailableConfigsResponse
     */
    public ListAvailableConfigsResponse listAvailableConfigs(ListAvailableConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listAvailableConfigsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries the bill list based on specified conditions.</li>
     * <li>Supports filtering by tenant, user, operation type, status, time range, business source, and other conditions.</li>
     * <li>Returns bill data in pages. The default page size is 20 records.</li>
     * <li>You can choose whether to filter out bills with zero credit consumption. By default, such bills are filtered out.</li>
     * <li>Authentication information (such as AK, BearerToken, or APP authentication) is required in the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries and filters the bill list through OpenAPI with support for multiple filter conditions.</p>
     * 
     * @param request ListBillingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBillingResponse
     */
    public ListBillingResponse listBillingWithOptions(ListBillingRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("bizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("bizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("endTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreZero)) {
            body.put("ignoreZero", request.ignoreZero);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("startTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wnUserId)) {
            body.put("wnUserId", request.wnUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBilling"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listBilling"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBillingResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries the bill list based on specified conditions.</li>
     * <li>Supports filtering by tenant, user, operation type, status, time range, business source, and other conditions.</li>
     * <li>Returns bill data in pages. The default page size is 20 records.</li>
     * <li>You can choose whether to filter out bills with zero credit consumption. By default, such bills are filtered out.</li>
     * <li>Authentication information (such as AK, BearerToken, or APP authentication) is required in the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries and filters the bill list through OpenAPI with support for multiple filter conditions.</p>
     * 
     * @param request ListBillingRequest
     * @return ListBillingResponse
     */
    public ListBillingResponse listBilling(ListBillingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBillingWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API supports filtering and sorting by multiple parameters, including tenant ID, page size, pagination token, keyword search, digital employee name, and update time range.</li>
     * <li>By default, results are sorted in descending order by the <code>UpdatedAt</code> field.</li>
     * <li>If an invalid <code>NextToken</code> is provided or <code>PageSize</code> exceeds the allowed range (1-100), the API returns a 400 error.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists chat sessions of the current user in reverse chronological order by creation time.</p>
     * 
     * @param request ListChatSessionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListChatSessionsResponse
     */
    public ListChatSessionsResponse listChatSessionsWithOptions(ListChatSessionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.digitalEmployeeName)) {
            query.put("digitalEmployeeName", request.digitalEmployeeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChatSessions"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listChatSessions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChatSessionsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API supports filtering and sorting by multiple parameters, including tenant ID, page size, pagination token, keyword search, digital employee name, and update time range.</li>
     * <li>By default, results are sorted in descending order by the <code>UpdatedAt</code> field.</li>
     * <li>If an invalid <code>NextToken</code> is provided or <code>PageSize</code> exceeds the allowed range (1-100), the API returns a 400 error.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Lists chat sessions of the current user in reverse chronological order by creation time.</p>
     * 
     * @param request ListChatSessionsRequest
     * @return ListChatSessionsResponse
     */
    public ListChatSessionsResponse listChatSessions(ListChatSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listChatSessionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists published knowledge graphs under an identity tenant.
     *     CLI mapping: <code>winnexo graph list</code>. <code>tenantId</code> is a required common parameter and is not included in the request body.
     *     The returned <code>graphName</code> can be used directly in <code>querySemanticKnowledge</code>. This query is consistent with the existing frontend knowledge graph list and does not apply digital worker permission filtering. Specific semantic queries still verify agent USE permissions.
     *     Database exceptions go directly into unified 5xx error handling and are not disguised as a successful empty list.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of knowledge graphs available for semantic queries under a tenant.</p>
     * 
     * @param request ListGraphsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGraphsResponse
     */
    public ListGraphsResponse listGraphsWithOptions(ListGraphsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGraphs"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listGraphs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGraphsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Lists published knowledge graphs under an identity tenant.
     *     CLI mapping: <code>winnexo graph list</code>. <code>tenantId</code> is a required common parameter and is not included in the request body.
     *     The returned <code>graphName</code> can be used directly in <code>querySemanticKnowledge</code>. This query is consistent with the existing frontend knowledge graph list and does not apply digital worker permission filtering. Specific semantic queries still verify agent USE permissions.
     *     Database exceptions go directly into unified 5xx error handling and are not disguised as a successful empty list.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of knowledge graphs available for semantic queries under a tenant.</p>
     * 
     * @param request ListGraphsRequest
     * @return ListGraphsResponse
     */
    public ListGraphsResponse listGraphs(ListGraphsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listGraphsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API retrieves the category list (subdirectory tree) of an enterprise knowledge base. You must have the knowledge base view permission.</li>
     * <li>If the <code>directoryId</code> parameter is not provided, the API returns all category trees under the root directory of the enterprise knowledge base. If <code>directoryId</code> is provided, the API returns the subdirectory tree rooted at the specified directory.</li>
     * <li>You can sort results by using the <code>sortField</code> and <code>sortOrder</code> parameters. By default, results are sorted by creation time in descending order.</li>
     * <li>Security constraints: <code>tenant_id</code> and <code>user_id</code> are derived only from the authenticated identity, and the caller must have the <code>DEVELOPMENT_KB_VIEW</code> feature permission.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the category directory tree of an enterprise knowledge base, with support for sorting by a specified field.</p>
     * 
     * @param request ListKnowledgeBaseDirectoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListKnowledgeBaseDirectoriesResponse
     */
    public ListKnowledgeBaseDirectoriesResponse listKnowledgeBaseDirectoriesWithOptions(ListKnowledgeBaseDirectoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("sortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("sortOrder", request.sortOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListKnowledgeBaseDirectories"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listKnowledgeBaseDirectories"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListKnowledgeBaseDirectoriesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API retrieves the category list (subdirectory tree) of an enterprise knowledge base. You must have the knowledge base view permission.</li>
     * <li>If the <code>directoryId</code> parameter is not provided, the API returns all category trees under the root directory of the enterprise knowledge base. If <code>directoryId</code> is provided, the API returns the subdirectory tree rooted at the specified directory.</li>
     * <li>You can sort results by using the <code>sortField</code> and <code>sortOrder</code> parameters. By default, results are sorted by creation time in descending order.</li>
     * <li>Security constraints: <code>tenant_id</code> and <code>user_id</code> are derived only from the authenticated identity, and the caller must have the <code>DEVELOPMENT_KB_VIEW</code> feature permission.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the category directory tree of an enterprise knowledge base, with support for sorting by a specified field.</p>
     * 
     * @param request ListKnowledgeBaseDirectoriesRequest
     * @return ListKnowledgeBaseDirectoriesResponse
     */
    public ListKnowledgeBaseDirectoriesResponse listKnowledgeBaseDirectories(ListKnowledgeBaseDirectoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listKnowledgeBaseDirectoriesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries the output list of the current logon user.</li>
     * <li><code>tenantId</code> is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</li>
     * <li>You can filter results by using parameters such as <code>operatingObjectName</code>, <code>itemType</code>, and <code>keyword</code>.</li>
     * <li>Set <code>sharedOnly</code> to <code>true</code> to display only shared outputs.</li>
     * <li>Pagination is controlled by <code>page</code> (page number) and <code>pageSize</code> (number of entries per page). By default, the first page is returned with 20 records per page.</li>
     * <li>Results are sorted by update time in descending order by default.</li>
     * <li>The <code>tenant_id</code> or <code>user_id</code> values passed in the request body are ignored. This information is obtained only from the authenticated identity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the output list of the current user with support for conditional filtering and pagination.</p>
     * 
     * @param request ListOutputFilesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOutputFilesResponse
     */
    public ListOutputFilesResponse listOutputFilesWithOptions(ListOutputFilesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemType)) {
            body.put("itemType", request.itemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedOnly)) {
            body.put("sharedOnly", request.sharedOnly);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOutputFiles"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listOutputFiles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOutputFilesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation queries the output list of the current logon user.</li>
     * <li><code>tenantId</code> is a common parameter. If this parameter is not specified, the default tenant of the caller is used.</li>
     * <li>You can filter results by using parameters such as <code>operatingObjectName</code>, <code>itemType</code>, and <code>keyword</code>.</li>
     * <li>Set <code>sharedOnly</code> to <code>true</code> to display only shared outputs.</li>
     * <li>Pagination is controlled by <code>page</code> (page number) and <code>pageSize</code> (number of entries per page). By default, the first page is returned with 20 records per page.</li>
     * <li>Results are sorted by update time in descending order by default.</li>
     * <li>The <code>tenant_id</code> or <code>user_id</code> values passed in the request body are ignored. This information is obtained only from the authenticated identity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the output list of the current user with support for conditional filtering and pagination.</p>
     * 
     * @param request ListOutputFilesRequest
     * @return ListOutputFilesResponse
     */
    public ListOutputFilesResponse listOutputFiles(ListOutputFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listOutputFilesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to drill down and query subdirectories and resources under the &quot;My Resources&quot; directory.</li>
     * <li>When <code>directoryId</code> is set to \&quot;root\&quot;, the service automatically resolves and returns the content under the current digital employee\&quot;s default root directory. If a specific directory ID is provided, the subdirectories and resources under that directory are returned.</li>
     * <li>Security constraint: <code>tenant_id</code> and <code>user_id</code> can only come from the authenticated identity information. These fields provided by the caller in the request body are ignored.</li>
     * <li>You can use the <code>sourceTypes</code> parameter to filter resources of specific types. When this parameter has a value, only resources that match the type condition are returned, and subdirectories are not included.</li>
     * <li>Sorting supports ascending or descending order by name (<code>name</code>), creation time (<code>gmt_create</code>), or modification time (<code>gmt_modified</code>).</li>
     * <li>The pagination feature allows you to customize the number of items displayed per page (maximum 100) and the current page number.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries subdirectories and resources under a specified digital employee resource directory.</p>
     * 
     * @param tmpReq ListPersonalDirectoryContentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPersonalDirectoryContentsResponse
     */
    public ListPersonalDirectoryContentsResponse listPersonalDirectoryContentsWithOptions(ListPersonalDirectoryContentsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPersonalDirectoryContentsShrinkRequest request = new ListPersonalDirectoryContentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTypes)) {
            request.sourceTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTypes, "sourceTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("sortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("sortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTypesShrink)) {
            body.put("sourceTypes", request.sourceTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPersonalDirectoryContents"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listPersonalDirectoryContents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPersonalDirectoryContentsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to drill down and query subdirectories and resources under the &quot;My Resources&quot; directory.</li>
     * <li>When <code>directoryId</code> is set to \&quot;root\&quot;, the service automatically resolves and returns the content under the current digital employee\&quot;s default root directory. If a specific directory ID is provided, the subdirectories and resources under that directory are returned.</li>
     * <li>Security constraint: <code>tenant_id</code> and <code>user_id</code> can only come from the authenticated identity information. These fields provided by the caller in the request body are ignored.</li>
     * <li>You can use the <code>sourceTypes</code> parameter to filter resources of specific types. When this parameter has a value, only resources that match the type condition are returned, and subdirectories are not included.</li>
     * <li>Sorting supports ascending or descending order by name (<code>name</code>), creation time (<code>gmt_create</code>), or modification time (<code>gmt_modified</code>).</li>
     * <li>The pagination feature allows you to customize the number of items displayed per page (maximum 100) and the current page number.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries subdirectories and resources under a specified digital employee resource directory.</p>
     * 
     * @param request ListPersonalDirectoryContentsRequest
     * @return ListPersonalDirectoryContentsResponse
     */
    public ListPersonalDirectoryContentsResponse listPersonalDirectoryContents(ListPersonalDirectoryContentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPersonalDirectoryContentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of system built-in roles.
     *     Business logic:
     *     1. Constructs AuthContext from identity.
     *     2. Delegates to UserManagementAuthorizedService.list_system_roles for permission verification (PLATFORM_USER_VIEW).
     *     3. Renders role names and descriptions based on the request Accept-Language header.
     *     4. Returns a fixed set of 7 system built-in roles.
     *     The returned roleCode field can be directly used as the roleCodes parameter for createUser or updateUser.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of system built-in roles.</p>
     * 
     * @param request ListRolesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRolesResponse
     */
    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoles"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listRoles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the list of system built-in roles.
     *     Business logic:
     *     1. Constructs AuthContext from identity.
     *     2. Delegates to UserManagementAuthorizedService.list_system_roles for permission verification (PLATFORM_USER_VIEW).
     *     3. Renders role names and descriptions based on the request Accept-Language header.
     *     4. Returns a fixed set of 7 system built-in roles.
     *     The returned roleCode field can be directly used as the roleCodes parameter for createUser or updateUser.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of system built-in roles.</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRolesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to an enterprise knowledge base.</li>
     * <li>The <code>DEVELOPMENT_KB_MANAGE</code> permission is required to call this API.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can add tags to the resource by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of scheduled tasks.</p>
     * 
     * @param tmpReq ListScheduledTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledTasksResponse
     */
    public ListScheduledTasksResponse listScheduledTasksWithOptions(ListScheduledTasksRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListScheduledTasksShrinkRequest request = new ListScheduledTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.visibilities)) {
            request.visibilitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.visibilities, "visibilities", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collaborationGroupId)) {
            query.put("collaborationGroupId", request.collaborationGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorOnly)) {
            query.put("creatorOnly", request.creatorOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibilitiesShrink)) {
            query.put("visibilities", request.visibilitiesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScheduledTasks"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listScheduledTasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScheduledTasksResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation uploads a file to an enterprise knowledge base.</li>
     * <li>The <code>DEVELOPMENT_KB_MANAGE</code> permission is required to call this API.</li>
     * <li>You must provide the OSS persistent address (<code>filePath</code>) of the file when uploading.</li>
     * <li>Optional parameters include the public access URL and original file name to enhance the completeness of file information.</li>
     * <li>If <code>directoryId</code> is specified, the file is placed in the corresponding enterprise knowledge base directory. Otherwise, the file is bound to the default root directory of the current digital employee.</li>
     * <li>You can add tags to the resource by using <code>sourceTags</code> for subsequent management and retrieval.</li>
     * <li>This operation initiates a billing item (UNSTRUCTURED_PARSE). Make sure your account balance is sufficient.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of scheduled tasks.</p>
     * 
     * @param request ListScheduledTasksRequest
     * @return ListScheduledTasksResponse
     */
    public ListScheduledTasksResponse listScheduledTasks(ListScheduledTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScheduledTasksWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves all visible skills under the current tenant. It supports filtering by digital employee binding relationship, skill source, tags, keywords, and other conditions, and supports pagination.</p>
     * <h3>Request parameters</h3>
     * <ul>
     * <li><strong>TenantId</strong>: Optional. A common parameter passed through by the gateway to the backend header. If not specified, the default tenant of the current caller is used.</li>
     * <li><strong>FilterType</strong>: Optional. The skill filtering dimension. Valid values: <code>ALL</code> (all published), <code>BUILTIN</code> (built-in published), <code>CUSTOM</code> (custom published), <code>DRAFT</code> (drafts, including published skills with unpublished modifications). Default value: <code>ALL</code>.</li>
     * <li><strong>Tags</strong>: Optional. Filters by tags. A match occurs if any tag in the array is hit.</li>
     * <li><strong>Keyword</strong>: Optional. Performs fuzzy matching by skill name or description.</li>
     * <li><strong>Page</strong>: Optional. The page number. Minimum value: 1. Default value: 1.</li>
     * <li><strong>PageSize</strong>: Optional. The number of entries per page. Value range: 1 to 100. Default value: 20.</li>
     * <li><strong>OperatingObjectName</strong>: Optional. The digital employee name. If specified, filters by binding relationship. Must be used together with <code>BindStatus</code>.</li>
     * <li><strong>BindStatus</strong>: Optional. The binding status. Valid values: <code>BOUND</code> (bound), <code>UNBOUND</code> (unbound global skills).</li>
     * </ul>
     * <h3>Response parameters</h3>
     * <p>The response contains the skill list <code>items</code>, total count <code>total</code>, current page <code>page</code>, and page size <code>pageSize</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the skills visible to the current tenant.</p>
     * 
     * @param tmpReq ListSkillsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSkillsResponse
     */
    public ListSkillsResponse listSkillsWithOptions(ListSkillsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSkillsShrinkRequest request = new ListSkillsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindStatus)) {
            body.put("bindStatus", request.bindStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterType)) {
            body.put("filterType", request.filterType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            body.put("tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSkills"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listSkills"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSkillsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves all visible skills under the current tenant. It supports filtering by digital employee binding relationship, skill source, tags, keywords, and other conditions, and supports pagination.</p>
     * <h3>Request parameters</h3>
     * <ul>
     * <li><strong>TenantId</strong>: Optional. A common parameter passed through by the gateway to the backend header. If not specified, the default tenant of the current caller is used.</li>
     * <li><strong>FilterType</strong>: Optional. The skill filtering dimension. Valid values: <code>ALL</code> (all published), <code>BUILTIN</code> (built-in published), <code>CUSTOM</code> (custom published), <code>DRAFT</code> (drafts, including published skills with unpublished modifications). Default value: <code>ALL</code>.</li>
     * <li><strong>Tags</strong>: Optional. Filters by tags. A match occurs if any tag in the array is hit.</li>
     * <li><strong>Keyword</strong>: Optional. Performs fuzzy matching by skill name or description.</li>
     * <li><strong>Page</strong>: Optional. The page number. Minimum value: 1. Default value: 1.</li>
     * <li><strong>PageSize</strong>: Optional. The number of entries per page. Value range: 1 to 100. Default value: 20.</li>
     * <li><strong>OperatingObjectName</strong>: Optional. The digital employee name. If specified, filters by binding relationship. Must be used together with <code>BindStatus</code>.</li>
     * <li><strong>BindStatus</strong>: Optional. The binding status. Valid values: <code>BOUND</code> (bound), <code>UNBOUND</code> (unbound global skills).</li>
     * </ul>
     * <h3>Response parameters</h3>
     * <p>The response contains the skill list <code>items</code>, total count <code>total</code>, current page <code>page</code>, and page size <code>pageSize</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the skills visible to the current tenant.</p>
     * 
     * @param request ListSkillsRequest
     * @return ListSkillsResponse
     */
    public ListSkillsResponse listSkills(ListSkillsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSkillsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to perform a paging query on the folder content and resources in an enterprise knowledge base.</li>
     * <li>Multiple parameters are supported for filtering and sorting, such as <code>directoryId</code>, <code>page</code>, <code>pageSize</code>, <code>sortField</code>, <code>sortOrder</code>, and others.</li>
     * <li>The <code>sourceTypes</code> parameter allows you to filter by resource type. Separate multiple types with commas.</li>
     * <li>When <code>directoryId</code> is not specified or set to <code>root</code>, the root folder list of the knowledge base is queried by default.</li>
     * <li>The default sort field is <code>name</code>, and the default sort order is ascending (<code>asc</code>).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of knowledge bases.</p>
     * 
     * @param request ListTenantDirectoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTenantDirectoryResponse
     */
    public ListTenantDirectoryResponse listTenantDirectoryWithOptions(ListTenantDirectoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("sortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("sortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTypes)) {
            body.put("sourceTypes", request.sourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTenantDirectory"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listTenantDirectory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API is used to perform a paging query on the folder content and resources in an enterprise knowledge base.</li>
     * <li>Multiple parameters are supported for filtering and sorting, such as <code>directoryId</code>, <code>page</code>, <code>pageSize</code>, <code>sortField</code>, <code>sortOrder</code>, and others.</li>
     * <li>The <code>sourceTypes</code> parameter allows you to filter by resource type. Separate multiple types with commas.</li>
     * <li>When <code>directoryId</code> is not specified or set to <code>root</code>, the root folder list of the knowledge base is queried by default.</li>
     * <li>The default sort field is <code>name</code>, and the default sort order is ascending (<code>asc</code>).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of knowledge bases.</p>
     * 
     * @param request ListTenantDirectoryRequest
     * @return ListTenantDirectoryResponse
     */
    public ListTenantDirectoryResponse listTenantDirectory(ListTenantDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTenantDirectoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation returns subdirectories and READY resources under the specified directory based on the enterprise knowledge base frontend scope.</li>
     * <li>The user identity and directory visibility scope are derived from the OpenAPI authentication context.</li>
     * <li>When <code>sourceTypes</code> has a value, only resources are returned. <code>keyword</code> searches only the current directory level.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the knowledge base directory content visible to the current OpenAPI user.</p>
     * 
     * @param request ListUserVisibleKnowledgeBaseContentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserVisibleKnowledgeBaseContentsResponse
     */
    public ListUserVisibleKnowledgeBaseContentsResponse listUserVisibleKnowledgeBaseContentsWithOptions(ListUserVisibleKnowledgeBaseContentsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("sortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("sortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTypes)) {
            body.put("sourceTypes", request.sourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserVisibleKnowledgeBaseContents"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listUserVisibleKnowledgeBaseContents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserVisibleKnowledgeBaseContentsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation returns subdirectories and READY resources under the specified directory based on the enterprise knowledge base frontend scope.</li>
     * <li>The user identity and directory visibility scope are derived from the OpenAPI authentication context.</li>
     * <li>When <code>sourceTypes</code> has a value, only resources are returned. <code>keyword</code> searches only the current directory level.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the knowledge base directory content visible to the current OpenAPI user.</p>
     * 
     * @param request ListUserVisibleKnowledgeBaseContentsRequest
     * @return ListUserVisibleKnowledgeBaseContentsResponse
     */
    public ListUserVisibleKnowledgeBaseContentsResponse listUserVisibleKnowledgeBaseContents(ListUserVisibleKnowledgeBaseContentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserVisibleKnowledgeBaseContentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries the enterprise knowledge bases visible to the platform user mapped from the OpenAPI authentication identity.</li>
     * <li>Both the tenant and user identities are determined by the authentication context. Callers cannot expand the visible scope through business parameters.</li>
     * <li><code>tenantId</code> is an optional common parameter. <code>keyword</code> can filter by knowledge base name or description.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of enterprise knowledge bases visible to the current OpenAPI user.</p>
     * 
     * @param request ListUserVisibleKnowledgeBasesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserVisibleKnowledgeBasesResponse
     */
    public ListUserVisibleKnowledgeBasesResponse listUserVisibleKnowledgeBasesWithOptions(ListUserVisibleKnowledgeBasesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserVisibleKnowledgeBases"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listUserVisibleKnowledgeBases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserVisibleKnowledgeBasesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries the enterprise knowledge bases visible to the platform user mapped from the OpenAPI authentication identity.</li>
     * <li>Both the tenant and user identities are determined by the authentication context. Callers cannot expand the visible scope through business parameters.</li>
     * <li><code>tenantId</code> is an optional common parameter. <code>keyword</code> can filter by knowledge base name or description.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of enterprise knowledge bases visible to the current OpenAPI user.</p>
     * 
     * @param request ListUserVisibleKnowledgeBasesRequest
     * @return ListUserVisibleKnowledgeBasesResponse
     */
    public ListUserVisibleKnowledgeBasesResponse listUserVisibleKnowledgeBases(ListUserVisibleKnowledgeBasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserVisibleKnowledgeBasesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries a paged list of tenant members by using OpenAPI.
     *     Business orchestration:
     *     1. Parse filter conditions (roleCodes → role_ids).
     *     2. Call UserTenantMappingRepository.query_paged_tenant_members to perform a paged query.
     *     3. Convert role_id in the results to roleCode and assemble the response.
     *     Error codes:
     *     - An error is thrown when an invalid roleCode parameter is specified.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries tenant members by paging.</p>
     * 
     * @param tmpReq ListUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListUsersShrinkRequest request = new ListUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountIds)) {
            request.accountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountIds, "accountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "roleCodes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsShrink)) {
            body.put("accountIds", request.accountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isActive)) {
            body.put("isActive", request.isActive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("roleCodes", request.roleCodesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listUsers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries a paged list of tenant members by using OpenAPI.
     *     Business orchestration:
     *     1. Parse filter conditions (roleCodes → role_ids).
     *     2. Call UserTenantMappingRepository.query_paged_tenant_members to perform a paged query.
     *     3. Convert role_id in the results to roleCode and assemble the response.
     *     Error codes:
     *     - An error is thrown when an invalid roleCode parameter is specified.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries tenant members by paging.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries all subdirectories and resources under a specified knowledge base directory for a specific digital employee.</li>
     * <li>The user must have the USE permission on the target digital employee, and the digital employee must have access to the directory and its subdirectories specified in the request.</li>
     * <li>You must provide the digital employee name (<code>operatingObjectName</code>) and the directory ID (<code>directoryId</code>) to query. Other parameters such as pagination information and sorting method are optional.</li>
     * <li>The response includes the list of subdirectories and resources under the directory, and supports pagination.</li>
     * <li>The <code>sourceStatus</code> field filters only resources in the <code>READY</code> state.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authenticated identity. Values passed in the request body by the caller are ignored.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Drills down to query subdirectories and resources under a specified knowledge base directory visible to a specified digital employee.</p>
     * 
     * @param tmpReq ListVisibleKnowledgeBaseContentsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVisibleKnowledgeBaseContentsResponse
     */
    public ListVisibleKnowledgeBaseContentsResponse listVisibleKnowledgeBaseContentsWithOptions(ListVisibleKnowledgeBaseContentsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListVisibleKnowledgeBaseContentsShrinkRequest request = new ListVisibleKnowledgeBaseContentsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sourceTypes)) {
            request.sourceTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sourceTypes, "sourceTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("sortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortOrder)) {
            body.put("sortOrder", request.sortOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTypesShrink)) {
            body.put("sourceTypes", request.sourceTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVisibleKnowledgeBaseContents"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listVisibleKnowledgeBaseContents"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVisibleKnowledgeBaseContentsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation queries all subdirectories and resources under a specified knowledge base directory for a specific digital employee.</li>
     * <li>The user must have the USE permission on the target digital employee, and the digital employee must have access to the directory and its subdirectories specified in the request.</li>
     * <li>You must provide the digital employee name (<code>operatingObjectName</code>) and the directory ID (<code>directoryId</code>) to query. Other parameters such as pagination information and sorting method are optional.</li>
     * <li>The response includes the list of subdirectories and resources under the directory, and supports pagination.</li>
     * <li>The <code>sourceStatus</code> field filters only resources in the <code>READY</code> state.</li>
     * <li>For security purposes, <code>tenant_id</code> and <code>user_id</code> are obtained only from the authenticated identity. Values passed in the request body by the caller are ignored.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Drills down to query subdirectories and resources under a specified knowledge base directory visible to a specified digital employee.</p>
     * 
     * @param request ListVisibleKnowledgeBaseContentsRequest
     * @return ListVisibleKnowledgeBaseContentsResponse
     */
    public ListVisibleKnowledgeBaseContentsResponse listVisibleKnowledgeBaseContents(ListVisibleKnowledgeBaseContentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listVisibleKnowledgeBaseContentsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation retrieves the list of top-level knowledge base directories visible to a specified digital employee (operating object) within the enterprise.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the top-level directories of enterprise knowledge bases accessible to a digital employee.</p>
     * 
     * @param request ListVisibleKnowledgeBasesRequest
     * @param headers ListVisibleKnowledgeBasesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVisibleKnowledgeBasesResponse
     */
    public ListVisibleKnowledgeBasesResponse listVisibleKnowledgeBasesWithOptions(ListVisibleKnowledgeBasesRequest request, ListVisibleKnowledgeBasesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.requestId)) {
            realHeaders.put("requestId", com.aliyun.teautil.Common.toJSONString(headers.requestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVisibleKnowledgeBases"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/listVisibleKnowledgeBases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVisibleKnowledgeBasesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API operation retrieves the list of top-level knowledge base directories visible to a specified digital employee (operating object) within the enterprise.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the top-level directories of enterprise knowledge bases accessible to a digital employee.</p>
     * 
     * @param request ListVisibleKnowledgeBasesRequest
     * @return ListVisibleKnowledgeBasesResponse
     */
    public ListVisibleKnowledgeBasesResponse listVisibleKnowledgeBases(ListVisibleKnowledgeBasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListVisibleKnowledgeBasesHeaders headers = new ListVisibleKnowledgeBasesHeaders();
        return this.listVisibleKnowledgeBasesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Authentication flow</strong>:<ol>
     * <li>Basic authentication is performed by the root router (<code>request.state.openapi_identity</code>).</li>
     * <li>This handler checks the <code>DEVELOPMENT_KB_MANAGE</code> feature permission.</li>
     * </ol>
     * </li>
     * <li><strong>Procedure</strong>:<ol>
     * <li>Check that the source directory and target directory are not the same.</li>
     * <li>Confirm that the target directory exists.</li>
     * <li>Verify that the resource to be moved is in the source directory.</li>
     * <li>Update the directory binding of the resource.</li>
     * <li>Best-effort update of <code>source.settings[&quot;knowledge_id&quot;]</code> to the target knowledge base ID.</li>
     * <li>Best-effort notification to DocumentAgent to sync <code>knowledge_id</code> and <code>update_time</code>.</li>
     * </ol>
     * </li>
     * <li><strong>Security constraints</strong>:<ul>
     * <li><code>tenant_id</code> and <code>user_id</code> must come from the authenticated identity.</li>
     * <li>The caller must have KB management permissions.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Moves a specified resource between enterprise knowledge base directories. Management permissions are required.</p>
     * 
     * @param request MoveKnowledgeBaseResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveKnowledgeBaseResourceResponse
     */
    public MoveKnowledgeBaseResourceResponse moveKnowledgeBaseResourceWithOptions(MoveKnowledgeBaseResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.knowledgeId)) {
            body.put("knowledgeId", request.knowledgeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDirectoryId)) {
            body.put("sourceDirectoryId", request.sourceDirectoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDirectoryId)) {
            body.put("targetDirectoryId", request.targetDirectoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveKnowledgeBaseResource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/moveKnowledgeBaseResource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveKnowledgeBaseResourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li><strong>Authentication flow</strong>:<ol>
     * <li>Basic authentication is performed by the root router (<code>request.state.openapi_identity</code>).</li>
     * <li>This handler checks the <code>DEVELOPMENT_KB_MANAGE</code> feature permission.</li>
     * </ol>
     * </li>
     * <li><strong>Procedure</strong>:<ol>
     * <li>Check that the source directory and target directory are not the same.</li>
     * <li>Confirm that the target directory exists.</li>
     * <li>Verify that the resource to be moved is in the source directory.</li>
     * <li>Update the directory binding of the resource.</li>
     * <li>Best-effort update of <code>source.settings[&quot;knowledge_id&quot;]</code> to the target knowledge base ID.</li>
     * <li>Best-effort notification to DocumentAgent to sync <code>knowledge_id</code> and <code>update_time</code>.</li>
     * </ol>
     * </li>
     * <li><strong>Security constraints</strong>:<ul>
     * <li><code>tenant_id</code> and <code>user_id</code> must come from the authenticated identity.</li>
     * <li>The caller must have KB management permissions.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Moves a specified resource between enterprise knowledge base directories. Management permissions are required.</p>
     * 
     * @param request MoveKnowledgeBaseResourceRequest
     * @return MoveKnowledgeBaseResourceResponse
     */
    public MoveKnowledgeBaseResourceResponse moveKnowledgeBaseResource(MoveKnowledgeBaseResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.moveKnowledgeBaseResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>The source directory and target directory cannot be the same</strong>. Otherwise, the <code>ERR.Robject.UserDirectory.InvalidOperation</code> error is returned.</li>
     * <li><strong>The target directory must exist</strong>. If it does not exist, the <code>ERR.Robject.UserDirectory.DirectoryNotFound</code> error is returned.</li>
     * <li><strong>The resource to be moved must exist in the source directory</strong>. If it is not in the source directory, the <code>ERR.Robject.UserDirectory.ResourceNotInDirectory</code> error is returned.</li>
     * <li>After a successful move, the system attempts to notify DocumentAgent to update the new path (<code>source_path</code>) of the resource. This step is best-effort. Even if it fails, the overall operation success status is not affected. Only an error log is recorded.</li>
     * <li>For security purposes, the value of <code>tenant_id</code> can only be derived from the authenticated identity information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Moves a specified resource between personal directories of a user.</p>
     * 
     * @param request MoveResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceResponse
     */
    public MoveResourceResponse moveResourceWithOptions(MoveResourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceDirectoryId)) {
            body.put("sourceDirectoryId", request.sourceDirectoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDirectoryId)) {
            body.put("targetDirectoryId", request.targetDirectoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/moveResource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>The source directory and target directory cannot be the same</strong>. Otherwise, the <code>ERR.Robject.UserDirectory.InvalidOperation</code> error is returned.</li>
     * <li><strong>The target directory must exist</strong>. If it does not exist, the <code>ERR.Robject.UserDirectory.DirectoryNotFound</code> error is returned.</li>
     * <li><strong>The resource to be moved must exist in the source directory</strong>. If it is not in the source directory, the <code>ERR.Robject.UserDirectory.ResourceNotInDirectory</code> error is returned.</li>
     * <li>After a successful move, the system attempts to notify DocumentAgent to update the new path (<code>source_path</code>) of the resource. This step is best-effort. Even if it fails, the overall operation success status is not affected. Only an error log is recorded.</li>
     * <li>For security purposes, the value of <code>tenant_id</code> can only be derived from the authenticated identity information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Moves a specified resource between personal directories of a user.</p>
     * 
     * @param request MoveResourceRequest
     * @return MoveResourceResponse
     */
    public MoveResourceResponse moveResource(MoveResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.moveResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation previews the content of a specified knowledge entry in an enterprise knowledge base.</li>
     * <li>The <code>DEVELOPMENT_KB_VIEW</code> permission is required to call this API.</li>
     * <li><code>sourceId</code> is a required parameter that identifies the knowledge entry to preview.</li>
     * <li>The optional parameter <code>tenantId</code> specifies the tenant ID. If not provided, the default tenant ID of the caller is used.</li>
     * <li>Multiple preview types are supported, including but not limited to images, audio, video, and text.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Previews the knowledge content in a specified enterprise knowledge base.</p>
     * 
     * @param request PreviewKnowledgeBaseSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewKnowledgeBaseSourceResponse
     */
    public PreviewKnowledgeBaseSourceResponse previewKnowledgeBaseSourceWithOptions(PreviewKnowledgeBaseSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewKnowledgeBaseSource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/previewKnowledgeBaseSource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewKnowledgeBaseSourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation previews the content of a specified knowledge entry in an enterprise knowledge base.</li>
     * <li>The <code>DEVELOPMENT_KB_VIEW</code> permission is required to call this API.</li>
     * <li><code>sourceId</code> is a required parameter that identifies the knowledge entry to preview.</li>
     * <li>The optional parameter <code>tenantId</code> specifies the tenant ID. If not provided, the default tenant ID of the caller is used.</li>
     * <li>Multiple preview types are supported, including but not limited to images, audio, video, and text.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Previews the knowledge content in a specified enterprise knowledge base.</p>
     * 
     * @param request PreviewKnowledgeBaseSourceRequest
     * @return PreviewKnowledgeBaseSourceResponse
     */
    public PreviewKnowledgeBaseSourceResponse previewKnowledgeBaseSource(PreviewKnowledgeBaseSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewKnowledgeBaseSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation only allows a user to preview resources in their own personal directory.</li>
     * <li>The authentication process includes basic authentication and data source ownership verification to ensure that the requester can only access knowledge in their personal directory.</li>
     * <li>You must provide the unique identifier <code>sourceId</code> of the knowledge content in the request. The system queries and returns the corresponding preview information based on this ID and the user\&quot;s tenant information.</li>
     * <li>Multiple preview types are supported, such as image, audio, and video. The system returns the corresponding preview URL or direct content display based on the type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Allows a user to preview specified knowledge content in their personal directory.</p>
     * 
     * @param request PreviewPersonalSourceRequest
     * @param headers PreviewPersonalSourceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewPersonalSourceResponse
     */
    public PreviewPersonalSourceResponse previewPersonalSourceWithOptions(PreviewPersonalSourceRequest request, PreviewPersonalSourceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.requestId)) {
            realHeaders.put("requestId", com.aliyun.teautil.Common.toJSONString(headers.requestId));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewPersonalSource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/previewPersonalSource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewPersonalSourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation only allows a user to preview resources in their own personal directory.</li>
     * <li>The authentication process includes basic authentication and data source ownership verification to ensure that the requester can only access knowledge in their personal directory.</li>
     * <li>You must provide the unique identifier <code>sourceId</code> of the knowledge content in the request. The system queries and returns the corresponding preview information based on this ID and the user\&quot;s tenant information.</li>
     * <li>Multiple preview types are supported, such as image, audio, and video. The system returns the corresponding preview URL or direct content display based on the type.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Allows a user to preview specified knowledge content in their personal directory.</p>
     * 
     * @param request PreviewPersonalSourceRequest
     * @return PreviewPersonalSourceResponse
     */
    public PreviewPersonalSourceResponse previewPersonalSource(PreviewPersonalSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PreviewPersonalSourceHeaders headers = new PreviewPersonalSourceHeaders();
        return this.previewPersonalSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API queries primary object data by a specified operating object name (such as <code>customer_1</code>) with paging.</li>
     * <li>Keyword-based search is supported. You can set whether to return only objects marked as favorites in Settings.</li>
     * <li>Complex filter conditions can be used to further narrow results, including but not limited to equal to, not equal to, greater than, and less than operators.</li>
     * <li>If no primary object type is configured, an empty result set is returned.</li>
     * <li>Data in the request undergoes authentication and filtering to ensure security and accuracy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries primary object data by operating object name with paging support, including filtering and search.</p>
     * 
     * @param request QueryPrimaryObjectDataRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPrimaryObjectDataResponse
     */
    public QueryPrimaryObjectDataResponse queryPrimaryObjectDataWithOptions(QueryPrimaryObjectDataRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            body.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyFavorites)) {
            body.put("onlyFavorites", request.onlyFavorites);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPrimaryObjectData"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/queryPrimaryObjectData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPrimaryObjectDataResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API queries primary object data by a specified operating object name (such as <code>customer_1</code>) with paging.</li>
     * <li>Keyword-based search is supported. You can set whether to return only objects marked as favorites in Settings.</li>
     * <li>Complex filter conditions can be used to further narrow results, including but not limited to equal to, not equal to, greater than, and less than operators.</li>
     * <li>If no primary object type is configured, an empty result set is returned.</li>
     * <li>Data in the request undergoes authentication and filtering to ensure security and accuracy.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries primary object data by operating object name with paging support, including filtering and search.</p>
     * 
     * @param request QueryPrimaryObjectDataRequest
     * @return QueryPrimaryObjectDataResponse
     */
    public QueryPrimaryObjectDataResponse queryPrimaryObjectData(QueryPrimaryObjectDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryPrimaryObjectDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Exposes only the schema_knowledge semantic recall capability of smart-query.
     *     CLI mapping: <code>winnexo semantic query</code>. <code>tenantId</code> is passed through common parameters. <code>userId</code>
     *     is read only from the Token identity and cannot be overridden by the request body. The service validates
     *     the ownership of <code>graphName + agentName</code>, active graph status, digital human enablement status, and
     *     the current user\&quot;s USE permission. A cross-graph agent with the same name will fail and be closed.
     *     Then <code>outputs=[schema_knowledge]</code> is fixed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries semantic knowledge related to a user question.</p>
     * 
     * @param request QuerySemanticKnowledgeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySemanticKnowledgeResponse
     */
    public QuerySemanticKnowledgeResponse querySemanticKnowledgeWithOptions(QuerySemanticKnowledgeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentName)) {
            body.put("agentName", request.agentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.graphName)) {
            body.put("graphName", request.graphName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("query", request.query);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySemanticKnowledge"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/querySemanticKnowledge"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySemanticKnowledgeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Exposes only the schema_knowledge semantic recall capability of smart-query.
     *     CLI mapping: <code>winnexo semantic query</code>. <code>tenantId</code> is passed through common parameters. <code>userId</code>
     *     is read only from the Token identity and cannot be overridden by the request body. The service validates
     *     the ownership of <code>graphName + agentName</code>, active graph status, digital human enablement status, and
     *     the current user\&quot;s USE permission. A cross-graph agent with the same name will fail and be closed.
     *     Then <code>outputs=[schema_knowledge]</code> is fixed.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries semantic knowledge related to a user question.</p>
     * 
     * @param request QuerySemanticKnowledgeRequest
     * @return QuerySemanticKnowledgeResponse
     */
    public QuerySemanticKnowledgeResponse querySemanticKnowledge(QuerySemanticKnowledgeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySemanticKnowledgeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the execution status and result of an organization synchronization task based on the task ID.
     *     Task status transitions: PENDING → RUNNING → COMPLETED / FAILED / TIMEOUT / CANCELED
     *     Recommended client polling interval: 3 to 5 seconds.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an organization synchronization task.</p>
     * 
     * @param request QuerySyncResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySyncResultResponse
     */
    public QuerySyncResultResponse querySyncResultWithOptions(QuerySyncResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySyncResult"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/querySyncResult"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySyncResultResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the execution status and result of an organization synchronization task based on the task ID.
     *     Task status transitions: PENDING → RUNNING → COMPLETED / FAILED / TIMEOUT / CANCELED
     *     Recommended client polling interval: 3 to 5 seconds.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the result of an organization synchronization task.</p>
     * 
     * @param request QuerySyncResultRequest
     * @return QuerySyncResultResponse
     */
    public QuerySyncResultResponse querySyncResult(QuerySyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySyncResultWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Based on the most recent N messages in a session and the skills attached to the agent, this operation invokes an LLM to generate 0 to 3 next-step recommendations (follow-up questions or recommended skills to execute).</p>
     * <ul>
     * <li><code>sessionId</code>: The session ID. Required. Only sessions that the currently authenticated user has permission to access are allowed.</li>
     * <li><code>recentMessageCount</code>: The number of recent messages used to assemble contextual information. Valid values: 1 to 30. Default value: 10 (approximately 5 rounds of user+assistant conversation).</li>
     * <li><code>customPrompt</code>: A custom recommendation instruction (up to 10,000 characters). This is injected into the default recommendation template as a custom instruction (before the output format constraints). The output is still subject to the JSON format and type constraints of the template.</li>
     * <li><code>outputType</code>: The output type filter. followUpOnly = follow-up recommendations only (default). skillOnly = skill recommendations only. both = generate both types.
     * Unlike internal endpoints, API calls are not restricted by the next-step recommendation toggle in user personal settings and always execute recommendation generation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates next-step recommendations for a session.</p>
     * 
     * @param request RecommendNextActionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecommendNextActionsResponse
     */
    public RecommendNextActionsResponse recommendNextActionsWithOptions(RecommendNextActionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPrompt)) {
            body.put("customPrompt", request.customPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputType)) {
            body.put("outputType", request.outputType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recentMessageCount)) {
            body.put("recentMessageCount", request.recentMessageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecommendNextActions"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/recommendNextActions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecommendNextActionsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>Based on the most recent N messages in a session and the skills attached to the agent, this operation invokes an LLM to generate 0 to 3 next-step recommendations (follow-up questions or recommended skills to execute).</p>
     * <ul>
     * <li><code>sessionId</code>: The session ID. Required. Only sessions that the currently authenticated user has permission to access are allowed.</li>
     * <li><code>recentMessageCount</code>: The number of recent messages used to assemble contextual information. Valid values: 1 to 30. Default value: 10 (approximately 5 rounds of user+assistant conversation).</li>
     * <li><code>customPrompt</code>: A custom recommendation instruction (up to 10,000 characters). This is injected into the default recommendation template as a custom instruction (before the output format constraints). The output is still subject to the JSON format and type constraints of the template.</li>
     * <li><code>outputType</code>: The output type filter. followUpOnly = follow-up recommendations only (default). skillOnly = skill recommendations only. both = generate both types.
     * Unlike internal endpoints, API calls are not restricted by the next-step recommendation toggle in user personal settings and always execute recommendation generation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Generates next-step recommendations for a session.</p>
     * 
     * @param request RecommendNextActionsRequest
     * @return RecommendNextActionsResponse
     */
    public RecommendNextActionsResponse recommendNextActions(RecommendNextActionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.recommendNextActionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Removes a user from a tenant.
     *     Business orchestration:
     *     1. Obtains tenant_id from identity.
     *     2. Calls delete_user_from_tenant (includes last admin protection).
     *     3. Returns success.
     *     This operation:
     *     - Removes all role associations of the user under the tenant.
     *     - Removes all user group associations of the user under the tenant.
     *     - Revokes all digital employee usage authorizations of the user under the tenant.
     *     - Deletes the user-tenant mapping.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a user from a tenant.</p>
     * 
     * @param request RemoveUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserResponse
     */
    public RemoveUserResponse removeUserWithOptions(RemoveUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wnUserId)) {
            query.put("wnUserId", request.wnUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUser"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/removeUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Removes a user from a tenant.
     *     Business orchestration:
     *     1. Obtains tenant_id from identity.
     *     2. Calls delete_user_from_tenant (includes last admin protection).
     *     3. Returns success.
     *     This operation:
     *     - Removes all role associations of the user under the tenant.
     *     - Removes all user group associations of the user under the tenant.
     *     - Revokes all digital employee usage authorizations of the user under the tenant.
     *     - Deletes the user-tenant mapping.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a user from a tenant.</p>
     * 
     * @param request RemoveUserRequest
     * @return RemoveUserResponse
     */
    public RemoveUserResponse removeUser(RemoveUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.removeUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows users with the required permissions to modify the name of a specific data source in an enterprise knowledge base.</li>
     * <li>You must provide the ID of the data source to be renamed (sourceId) and the new name (newName).</li>
     * <li>The rename operation only updates the name field of the data source and does not trigger other processing flows.</li>
     * <li>After successful execution, the system publishes a <code>SOURCE_CHANGED</code> event for frontend display refresh and attempts to notify DocumentAgent to synchronize the latest source_name information. However, if this step fails, it does not affect the completion status of the main flow.</li>
     * <li>If the specified sourceId does not exist, the error code <code>ERR.Robject.Source.NotFound</code> is returned.</li>
     * <li>To invoke this API, you must have the <code>DEVELOPMENT_KB_MANAGE</code> feature permission.</li>
     * <li>Identity verification is supported through AccessKey, BearerToken, or APP methods to authenticate requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Renames a data source in a specified enterprise knowledge base.</p>
     * 
     * @param request RenameKnowledgeBaseSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameKnowledgeBaseSourceResponse
     */
    public RenameKnowledgeBaseSourceResponse renameKnowledgeBaseSourceWithOptions(RenameKnowledgeBaseSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newName)) {
            body.put("newName", request.newName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameKnowledgeBaseSource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/renameKnowledgeBaseSource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameKnowledgeBaseSourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation allows users with the required permissions to modify the name of a specific data source in an enterprise knowledge base.</li>
     * <li>You must provide the ID of the data source to be renamed (sourceId) and the new name (newName).</li>
     * <li>The rename operation only updates the name field of the data source and does not trigger other processing flows.</li>
     * <li>After successful execution, the system publishes a <code>SOURCE_CHANGED</code> event for frontend display refresh and attempts to notify DocumentAgent to synchronize the latest source_name information. However, if this step fails, it does not affect the completion status of the main flow.</li>
     * <li>If the specified sourceId does not exist, the error code <code>ERR.Robject.Source.NotFound</code> is returned.</li>
     * <li>To invoke this API, you must have the <code>DEVELOPMENT_KB_MANAGE</code> feature permission.</li>
     * <li>Identity verification is supported through AccessKey, BearerToken, or APP methods to authenticate requests.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Renames a data source in a specified enterprise knowledge base.</p>
     * 
     * @param request RenameKnowledgeBaseSourceRequest
     * @return RenameKnowledgeBaseSourceResponse
     */
    public RenameKnowledgeBaseSourceResponse renameKnowledgeBaseSource(RenameKnowledgeBaseSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renameKnowledgeBaseSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API updates only the <code>name</code> field of the data source and does not trigger <code>process_source</code>.</li>
     * <li>After a successful update, a <code>SOURCE_CHANGED</code> event is published for the frontend to refresh the display.</li>
     * <li>The system makes a best-effort attempt to notify DocumentAgent to sync the new <code>source_name</code>. Even if the sync fails, the main process is not blocked.</li>
     * <li>If the specified data source does not exist, the <code>ERR.Robject.Source.NotFound</code> error is returned. The global middleware converts this error into a POP error code.</li>
     * <li>Security constraint: <code>tenant_id</code> and <code>user_id</code> must be derived from the authenticated identity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Renames a specified data source. This is a lightweight operation.</p>
     * 
     * @param request RenameSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameSourceResponse
     */
    public RenameSourceResponse renameSourceWithOptions(RenameSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newName)) {
            body.put("newName", request.newName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameSource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/renameSource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameSourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API updates only the <code>name</code> field of the data source and does not trigger <code>process_source</code>.</li>
     * <li>After a successful update, a <code>SOURCE_CHANGED</code> event is published for the frontend to refresh the display.</li>
     * <li>The system makes a best-effort attempt to notify DocumentAgent to sync the new <code>source_name</code>. Even if the sync fails, the main process is not blocked.</li>
     * <li>If the specified data source does not exist, the <code>ERR.Robject.Source.NotFound</code> error is returned. The global middleware converts this error into a POP error code.</li>
     * <li>Security constraint: <code>tenant_id</code> and <code>user_id</code> must be derived from the authenticated identity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Renames a specified data source. This is a lightweight operation.</p>
     * 
     * @param request RenameSourceRequest
     * @return RenameSourceResponse
     */
    public RenameSourceResponse renameSource(RenameSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renameSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation re-parses a specified data source. You can choose synchronous or asynchronous execution. You must provide the data source ID in the request. You can optionally specify whether to synchronously wait for parsing to complete. By default, the request is processed asynchronously by being added to a queue. You can also use the <code>tenantId</code> parameter to specify a tenant ID, but this parameter is optional.</p>
     * <ul>
     * <li><strong>forceSync</strong>: If set to <code>true</code>, the operation synchronously waits for the re-parsing to complete. Default value: <code>false</code>, which indicates that the request is processed asynchronously.</li>
     * <li>When the service returns <code>None</code>, it is converted to a <code>SourceNotFound</code> exception. Other exceptions are handled by the OpenAPI global exception chain.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Re-parses a resource.</p>
     * 
     * @param request ReparseSourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReparseSourceResponse
     */
    public ReparseSourceResponse reparseSourceWithOptions(ReparseSourceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceSync)) {
            body.put("forceSync", request.forceSync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReparseSource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/reparseSource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReparseSourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation re-parses a specified data source. You can choose synchronous or asynchronous execution. You must provide the data source ID in the request. You can optionally specify whether to synchronously wait for parsing to complete. By default, the request is processed asynchronously by being added to a queue. You can also use the <code>tenantId</code> parameter to specify a tenant ID, but this parameter is optional.</p>
     * <ul>
     * <li><strong>forceSync</strong>: If set to <code>true</code>, the operation synchronously waits for the re-parsing to complete. Default value: <code>false</code>, which indicates that the request is processed asynchronously.</li>
     * <li>When the service returns <code>None</code>, it is converted to a <code>SourceNotFound</code> exception. Other exceptions are handled by the OpenAPI global exception chain.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Re-parses a resource.</p>
     * 
     * @param request ReparseSourceRequest
     * @return ReparseSourceResponse
     */
    public ReparseSourceResponse reparseSource(ReparseSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reparseSourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API allows you to update a specific FILE-type data source in a self-built enterprise knowledge base and trigger the system to re-parse the data source by providing a new file path and public access URL. Operations can be performed in synchronous or asynchronous mode. In synchronous mode, the client waits until the parsing process is complete.</p>
     * <ul>
     * <li>The <strong>forceSync</strong> parameter controls whether the request is processed synchronously. The default value is <code>false</code>, which indicates asynchronous processing.</li>
     * <li>If <strong>fileName</strong> is not provided or its value is empty, the newly uploaded file retains the original file name.</li>
     * <li>Ensure that the provided <strong>filePath</strong> and <strong>filePublicUrl</strong> are valid and point to the same file entity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Replaces a FILE resource in a specified enterprise knowledge base and triggers re-parsing.</p>
     * 
     * @param request ReplaceKnowledgeBaseSourceFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplaceKnowledgeBaseSourceFileResponse
     */
    public ReplaceKnowledgeBaseSourceFileResponse replaceKnowledgeBaseSourceFileWithOptions(ReplaceKnowledgeBaseSourceFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePublicUrl)) {
            body.put("filePublicUrl", request.filePublicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileRecordId)) {
            body.put("fileRecordId", request.fileRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceSync)) {
            body.put("forceSync", request.forceSync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceKnowledgeBaseSourceFile"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/replaceKnowledgeBaseSourceFile"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceKnowledgeBaseSourceFileResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API allows you to update a specific FILE-type data source in a self-built enterprise knowledge base and trigger the system to re-parse the data source by providing a new file path and public access URL. Operations can be performed in synchronous or asynchronous mode. In synchronous mode, the client waits until the parsing process is complete.</p>
     * <ul>
     * <li>The <strong>forceSync</strong> parameter controls whether the request is processed synchronously. The default value is <code>false</code>, which indicates asynchronous processing.</li>
     * <li>If <strong>fileName</strong> is not provided or its value is empty, the newly uploaded file retains the original file name.</li>
     * <li>Ensure that the provided <strong>filePath</strong> and <strong>filePublicUrl</strong> are valid and point to the same file entity.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Replaces a FILE resource in a specified enterprise knowledge base and triggers re-parsing.</p>
     * 
     * @param request ReplaceKnowledgeBaseSourceFileRequest
     * @return ReplaceKnowledgeBaseSourceFileResponse
     */
    public ReplaceKnowledgeBaseSourceFileResponse replaceKnowledgeBaseSourceFile(ReplaceKnowledgeBaseSourceFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceKnowledgeBaseSourceFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API performs a full replacement of object bindings for a specified data source (deletes existing bindings first, then inserts new bindings). If an empty list is passed, all bindings are cleared.</p>
     * <ul>
     * <li><strong>Security constraints</strong>: <code>tenant_id</code> and <code>user_id</code> must come from the authenticated identity.</li>
     * <li><strong>Error handling</strong>: If the specified data source does not exist, an <code>ERR.Robject.InvalidParameter</code> error is thrown and converted to a POP error code by the global middleware.</li>
     * <li><strong>Synchronous notification</strong>: After a successful replacement, the system makes a best-effort synchronous notification to DocumentAgent to update <code>semantics.object_bindings</code>. However, failures are only logged and do not block the main process.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Replaces all object binding information under a specified data source.</p>
     * 
     * @param tmpReq ReplaceObjectBindingsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplaceObjectBindingsResponse
     */
    public ReplaceObjectBindingsResponse replaceObjectBindingsWithOptions(ReplaceObjectBindingsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReplaceObjectBindingsShrinkRequest request = new ReplaceObjectBindingsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectBindings)) {
            request.objectBindingsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectBindings, "objectBindings", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.objectBindingsShrink)) {
            body.put("objectBindings", request.objectBindingsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceObjectBindings"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/replaceObjectBindings"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceObjectBindingsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API performs a full replacement of object bindings for a specified data source (deletes existing bindings first, then inserts new bindings). If an empty list is passed, all bindings are cleared.</p>
     * <ul>
     * <li><strong>Security constraints</strong>: <code>tenant_id</code> and <code>user_id</code> must come from the authenticated identity.</li>
     * <li><strong>Error handling</strong>: If the specified data source does not exist, an <code>ERR.Robject.InvalidParameter</code> error is thrown and converted to a POP error code by the global middleware.</li>
     * <li><strong>Synchronous notification</strong>: After a successful replacement, the system makes a best-effort synchronous notification to DocumentAgent to update <code>semantics.object_bindings</code>. However, failures are only logged and do not block the main process.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Replaces all object binding information under a specified data source.</p>
     * 
     * @param request ReplaceObjectBindingsRequest
     * @return ReplaceObjectBindingsResponse
     */
    public ReplaceObjectBindingsResponse replaceObjectBindings(ReplaceObjectBindingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceObjectBindingsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation replaces a personal FILE resource created by the current platform user and triggers the system to re-parse the file.</li>
     * <li>The <code>tenant_id</code>, operator, and creator constraints are read only from the authenticated identity. Requests without a platform user are rejected to prevent bypassing ownership verification.</li>
     * <li>If the server returns <code>None</code>, it is converted to a <code>NotFound</code> exception. Other exceptions are handled by the OpenAPI global exception chain.</li>
     * <li>This operation supports synchronous or asynchronous waiting for re-parsing to complete. The default behavior is asynchronous queuing (controlled by the <code>forceSync</code> parameter).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Allows a user to replace a personal file resource that they created and triggers the system to re-parse the file.</p>
     * 
     * @param request ReplaceSourceFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReplaceSourceFileResponse
     */
    public ReplaceSourceFileResponse replaceSourceFileWithOptions(ReplaceSourceFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            body.put("filePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePublicUrl)) {
            body.put("filePublicUrl", request.filePublicUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileRecordId)) {
            body.put("fileRecordId", request.fileRecordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceSync)) {
            body.put("forceSync", request.forceSync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReplaceSourceFile"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/replaceSourceFile"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReplaceSourceFileResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation replaces a personal FILE resource created by the current platform user and triggers the system to re-parse the file.</li>
     * <li>The <code>tenant_id</code>, operator, and creator constraints are read only from the authenticated identity. Requests without a platform user are rejected to prevent bypassing ownership verification.</li>
     * <li>If the server returns <code>None</code>, it is converted to a <code>NotFound</code> exception. Other exceptions are handled by the OpenAPI global exception chain.</li>
     * <li>This operation supports synchronous or asynchronous waiting for re-parsing to complete. The default behavior is asynchronous queuing (controlled by the <code>forceSync</code> parameter).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Allows a user to replace a personal file resource that they created and triggers the system to re-parse the file.</p>
     * 
     * @param request ReplaceSourceFileRequest
     * @return ReplaceSourceFileResponse
     */
    public ReplaceSourceFileResponse replaceSourceFile(ReplaceSourceFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.replaceSourceFileWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Resets the password of a user through OpenAPI.
     *     Business orchestration:
     *     1. Call UserManagementService.reset_member_password with password_encrypted (required).
     *        The service internally performs RSA decryption, complexity validation, bcrypt hashing, and writes the result.
     *     2. Returns the reset result.
     *     Error codes:
     *     - ERR.User.NotFound: The user does not exist.
     *     - ERR.User.NotInTenant: The user does not belong to the current tenant.
     *     - ERR.User.WinnexoPasswordRequired: The user does not have password credentials (non-WINNEXO type).</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of a user.</p>
     * 
     * @param request ResetPasswordRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPasswordWithOptions(ResetPasswordRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.passwordEncrypted)) {
            body.put("passwordEncrypted", request.passwordEncrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wnUserId)) {
            body.put("wnUserId", request.wnUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetPassword"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/resetPassword"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetPasswordResponse());
    }

    /**
     * <b>description</b> :
     * <p>Resets the password of a user through OpenAPI.
     *     Business orchestration:
     *     1. Call UserManagementService.reset_member_password with password_encrypted (required).
     *        The service internally performs RSA decryption, complexity validation, bcrypt hashing, and writes the result.
     *     2. Returns the reset result.
     *     Error codes:
     *     - ERR.User.NotFound: The user does not exist.
     *     - ERR.User.NotInTenant: The user does not belong to the current tenant.
     *     - ERR.User.WinnexoPasswordRequired: The user does not have password credentials (non-WINNEXO type).</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of a user.</p>
     * 
     * @param request ResetPasswordRequest
     * @return ResetPasswordResponse
     */
    public ResetPasswordResponse resetPassword(ResetPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetPasswordWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Resets the token of a user.
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is required).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Calls reset_token:
     *        - Changes the old ACTIVE token to RESET (permanently invalidated).
     *        - Generates a new ACTIVE token.
     *     4. Returns the new token in plaintext and the masked value.
     *     Note: After the reset, the old token is permanently invalidated and cannot be recovered. The new token in plaintext is returned only in this response.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets an API token.</p>
     * 
     * @param request ResetTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetTokenResponse
     */
    public ResetTokenResponse resetTokenWithOptions(ResetTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wnUserId)) {
            body.put("wnUserId", request.wnUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetToken"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/resetToken"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>Resets the token of a user.
     *     Business logic:
     *     1. Retrieves user_id from identity (caller_type=user is required).
     *     2. Constructs an AuthContext and delegates permission verification to UserTokenAuthorizedService.
     *     3. Calls reset_token:
     *        - Changes the old ACTIVE token to RESET (permanently invalidated).
     *        - Generates a new ACTIVE token.
     *     4. Returns the new token in plaintext and the masked value.
     *     Note: After the reset, the old token is permanently invalidated and cannot be recovered. The new token in plaintext is returned only in this response.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets an API token.</p>
     * 
     * @param request ResetTokenRequest
     * @return ResetTokenResponse
     */
    public ResetTokenResponse resetToken(ResetTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.resetTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves and retries data sources with a FAILED status in the specified personal folder of a user (including all subfolders). The request returns immediately, and the actual retry tasks are executed asynchronously in the background. Only resources that the current logged-in user has access to and that were created by the user can be retried.</p>
     * <h3>Security and permissions</h3>
     * <ul>
     * <li>This operation requires appropriate RAM permissions.</li>
     * <li>You can only operate on resources within the tenant to which the current user belongs.</li>
     * <li>Ensure that <code>tenantId</code> and <code>userId</code> come from verified identity information.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li><code>directoryId</code> is a required parameter that specifies the target folder in which to check and retry failed data sources.</li>
     * <li>If <code>tenantId</code> is not provided, the tenant ID of the caller is used by default.</li>
     * <li>The API supports multiple authentication methods, including AccessKey, BearerToken, and APP authentication.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retries all failed data sources in a specified folder and its subfolders in batch.</p>
     * 
     * @param request RetryDirectoryFailedSourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryDirectoryFailedSourcesResponse
     */
    public RetryDirectoryFailedSourcesResponse retryDirectoryFailedSourcesWithOptions(RetryDirectoryFailedSourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryDirectoryFailedSources"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/retryDirectoryFailedSources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryDirectoryFailedSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves and retries data sources with a FAILED status in the specified personal folder of a user (including all subfolders). The request returns immediately, and the actual retry tasks are executed asynchronously in the background. Only resources that the current logged-in user has access to and that were created by the user can be retried.</p>
     * <h3>Security and permissions</h3>
     * <ul>
     * <li>This operation requires appropriate RAM permissions.</li>
     * <li>You can only operate on resources within the tenant to which the current user belongs.</li>
     * <li>Ensure that <code>tenantId</code> and <code>userId</code> come from verified identity information.</li>
     * </ul>
     * <h3>Precautions</h3>
     * <ul>
     * <li><code>directoryId</code> is a required parameter that specifies the target folder in which to check and retry failed data sources.</li>
     * <li>If <code>tenantId</code> is not provided, the tenant ID of the caller is used by default.</li>
     * <li>The API supports multiple authentication methods, including AccessKey, BearerToken, and APP authentication.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retries all failed data sources in a specified folder and its subfolders in batch.</p>
     * 
     * @param request RetryDirectoryFailedSourcesRequest
     * @return RetryDirectoryFailedSourcesResponse
     */
    public RetryDirectoryFailedSourcesResponse retryDirectoryFailedSources(RetryDirectoryFailedSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryDirectoryFailedSourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves and retries all data sources in FAILED status under a specified enterprise knowledge base directory (including its subdirectories). The request returns immediately, and the actual retry operations are executed asynchronously in the background.</p>
     * <ul>
     * <li><strong>Authentication</strong>: In addition to basic authentication, the <code>DEVELOPMENT_KB_MANAGE</code> permission is required.</li>
     * <li><strong>Security constraints</strong>: Only callers with the corresponding tenant and user identity are allowed access, and KB management permission is required. Administrators can initiate retries for failed resources of any user.</li>
     * <li><strong>Parameters</strong>:<ul>
     * <li><code>directoryId</code> (required): The ID of the enterprise knowledge base directory for which to check and retry failed data sources.</li>
     * <li><code>tenantId</code> (optional): The tenant ID. The default tenant of the caller is used if this parameter is not specified.</li>
     * </ul>
     * </li>
     * <li><strong>Response</strong>: On success, returns the number of data sources enqueued for retry and related details.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retries all data sources in failed status under a specified directory in batch.</p>
     * 
     * @param request RetryKnowledgeBaseFailedSourcesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryKnowledgeBaseFailedSourcesResponse
     */
    public RetryKnowledgeBaseFailedSourcesResponse retryKnowledgeBaseFailedSourcesWithOptions(RetryKnowledgeBaseFailedSourcesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryKnowledgeBaseFailedSources"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/retryKnowledgeBaseFailedSources"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryKnowledgeBaseFailedSourcesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This API retrieves and retries all data sources in FAILED status under a specified enterprise knowledge base directory (including its subdirectories). The request returns immediately, and the actual retry operations are executed asynchronously in the background.</p>
     * <ul>
     * <li><strong>Authentication</strong>: In addition to basic authentication, the <code>DEVELOPMENT_KB_MANAGE</code> permission is required.</li>
     * <li><strong>Security constraints</strong>: Only callers with the corresponding tenant and user identity are allowed access, and KB management permission is required. Administrators can initiate retries for failed resources of any user.</li>
     * <li><strong>Parameters</strong>:<ul>
     * <li><code>directoryId</code> (required): The ID of the enterprise knowledge base directory for which to check and retry failed data sources.</li>
     * <li><code>tenantId</code> (optional): The tenant ID. The default tenant of the caller is used if this parameter is not specified.</li>
     * </ul>
     * </li>
     * <li><strong>Response</strong>: On success, returns the number of data sources enqueued for retry and related details.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Retries all data sources in failed status under a specified directory in batch.</p>
     * 
     * @param request RetryKnowledgeBaseFailedSourcesRequest
     * @return RetryKnowledgeBaseFailedSourcesResponse
     */
    public RetryKnowledgeBaseFailedSourcesResponse retryKnowledgeBaseFailedSources(RetryKnowledgeBaseFailedSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.retryKnowledgeBaseFailedSourcesWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Revokes the usage permissions of a user or user group on a specified digital human.
     *     Business logic:
     *     1. Constructs an AuthContext from identity.
     *     2. Performs mutual exclusion validation on the request body: either userIds or userGroupIds must be specified.
     *     3. Delegates to AgentAuthorizationAuthorizedService.revoke_authorization for execution.
     *     4. Pre-validation: MANAGE permission + agent existence check (performed by the AuthorizedService layer, which authenticates before exposing existence).
     *     5. After direct user authorization is revoked, the user may still have access through user group authorization.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes the usage permissions of a user or user group on a digital human.</p>
     * 
     * @param tmpReq RevokeAgentUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeAgentUsersResponse
     */
    public RevokeAgentUsersResponse revokeAgentUsersWithOptions(RevokeAgentUsersRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RevokeAgentUsersShrinkRequest request = new RevokeAgentUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userGroupIds)) {
            request.userGroupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userGroupIds, "userGroupIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIds)) {
            request.userIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIds, "userIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIdsShrink)) {
            body.put("userGroupIds", request.userGroupIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdsShrink)) {
            body.put("userIds", request.userIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeAgentUsers"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/revokeAgentUsers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeAgentUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Revokes the usage permissions of a user or user group on a specified digital human.
     *     Business logic:
     *     1. Constructs an AuthContext from identity.
     *     2. Performs mutual exclusion validation on the request body: either userIds or userGroupIds must be specified.
     *     3. Delegates to AgentAuthorizationAuthorizedService.revoke_authorization for execution.
     *     4. Pre-validation: MANAGE permission + agent existence check (performed by the AuthorizedService layer, which authenticates before exposing existence).
     *     5. After direct user authorization is revoked, the user may still have access through user group authorization.</p>
     * 
     * <b>summary</b> : 
     * <p>Revokes the usage permissions of a user or user group on a digital human.</p>
     * 
     * @param request RevokeAgentUsersRequest
     * @return RevokeAgentUsersResponse
     */
    public RevokeAgentUsersResponse revokeAgentUsers(RevokeAgentUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeAgentUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation supports only asynchronous mode. After submission, the operation immediately returns a <code>RunId</code> and <code>Status=Running</code>. The client polls for the final result by calling <code>GetSkillRun</code>.</p>
     * <ul>
     * <li><strong>TenantId</strong>: An optional common parameter that the gateway passes through to the backend header.</li>
     * <li><strong>SkillCode</strong> / <strong>SkillName</strong>: Specify one of the two parameters. SkillCode takes priority. If SkillName is not unique, <code>ERR.SkillHub.SkillNameAmbiguous</code> is returned.</li>
     * <li><strong>Arguments</strong>: Required. The skill input parameter object. The structure is described by the inputConfig returned by <code>GetSkill</code>.</li>
     * <li><strong>ClientToken</strong>: An optional idempotency key. In the current version, this value is only recorded in the task metadata and is not used for strict idempotency deduplication.
     * Note: Synchronous mode (Async=false), Stream, and CallbackUrl are not supported in the first release and will be available in later versions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously triggers skill execution and immediately returns a RunId.</p>
     * 
     * @param tmpReq RunSkillRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunSkillResponse
     */
    public RunSkillResponse runSkillWithOptions(RunSkillRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunSkillShrinkRequest request = new RunSkillShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.arguments)) {
            request.argumentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.arguments, "arguments", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.argumentsShrink)) {
            body.put("arguments", request.argumentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("clientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillCode)) {
            body.put("skillCode", request.skillCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skillName)) {
            body.put("skillName", request.skillName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunSkill"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/runSkill"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunSkillResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation supports only asynchronous mode. After submission, the operation immediately returns a <code>RunId</code> and <code>Status=Running</code>. The client polls for the final result by calling <code>GetSkillRun</code>.</p>
     * <ul>
     * <li><strong>TenantId</strong>: An optional common parameter that the gateway passes through to the backend header.</li>
     * <li><strong>SkillCode</strong> / <strong>SkillName</strong>: Specify one of the two parameters. SkillCode takes priority. If SkillName is not unique, <code>ERR.SkillHub.SkillNameAmbiguous</code> is returned.</li>
     * <li><strong>Arguments</strong>: Required. The skill input parameter object. The structure is described by the inputConfig returned by <code>GetSkill</code>.</li>
     * <li><strong>ClientToken</strong>: An optional idempotency key. In the current version, this value is only recorded in the task metadata and is not used for strict idempotency deduplication.
     * Note: Synchronous mode (Async=false), Stream, and CallbackUrl are not supported in the first release and will be available in later versions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously triggers skill execution and immediately returns a RunId.</p>
     * 
     * @param request RunSkillRequest
     * @return RunSkillResponse
     */
    public RunSkillResponse runSkill(RunSkillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runSkillWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API saves a batch of output details as personal resources for the user.</li>
     * <li>Two save modes are supported: <code>link</code> and <code>copy</code>. When <code>link</code> is selected, edits to the output are synchronized to the resource. When <code>copy</code> is selected, a snapshot is created with no limit on the number of copies.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are derived only from the authenticated identity.</li>
     * <li>If <code>operating_object</code> values are inconsistent within the batch and <code>directoryId</code> is not specified, the entire batch fails with a pre-check error.</li>
     * <li>The processing result of a single record does not affect other records. Failure information for individual records is returned in the response.</li>
     * <li>A maximum of 50 records are supported per batch operation.</li>
     * <li>Batch-level pre-check failures are returned in a POP-compatible error format by the global exception middleware.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Saves output details in batch as personal resources. Supports link or copy mode.</p>
     * 
     * @param tmpReq SaveOutputFileToResourceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveOutputFileToResourceResponse
     */
    public SaveOutputFileToResourceResponse saveOutputFileToResourceWithOptions(SaveOutputFileToResourceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveOutputFileToResourceShrinkRequest request = new SaveOutputFileToResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "itemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemIdsShrink)) {
            body.put("itemIds", request.itemIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("mode", request.mode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveOutputFileToResource"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/saveOutputFileToResource"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveOutputFileToResourceResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API saves a batch of output details as personal resources for the user.</li>
     * <li>Two save modes are supported: <code>link</code> and <code>copy</code>. When <code>link</code> is selected, edits to the output are synchronized to the resource. When <code>copy</code> is selected, a snapshot is created with no limit on the number of copies.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are derived only from the authenticated identity.</li>
     * <li>If <code>operating_object</code> values are inconsistent within the batch and <code>directoryId</code> is not specified, the entire batch fails with a pre-check error.</li>
     * <li>The processing result of a single record does not affect other records. Failure information for individual records is returned in the response.</li>
     * <li>A maximum of 50 records are supported per batch operation.</li>
     * <li>Batch-level pre-check failures are returned in a POP-compatible error format by the global exception middleware.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Saves output details in batch as personal resources. Supports link or copy mode.</p>
     * 
     * @param request SaveOutputFileToResourceRequest
     * @return SaveOutputFileToResourceResponse
     */
    public SaveOutputFileToResourceResponse saveOutputFileToResource(SaveOutputFileToResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.saveOutputFileToResourceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Asynchronously sends a session message.</p>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously sends a session message.</p>
     * 
     * @param tmpReq SendAsyncChatMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendAsyncChatMessageResponse
     */
    public SendAsyncChatMessageResponse sendAsyncChatMessageWithOptions(SendAsyncChatMessageRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendAsyncChatMessageShrinkRequest request = new SendAsyncChatMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.digitalEmployeeName)) {
            request.digitalEmployeeNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.digitalEmployeeName, "digitalEmployeeName", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "files", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskExecution)) {
            request.taskExecutionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskExecution, "taskExecution", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("contentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalEmployeeNameShrink)) {
            body.put("digitalEmployeeName", request.digitalEmployeeNameShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directChat)) {
            body.put("directChat", request.directChat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            body.put("files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reuseLastSession)) {
            body.put("reuseLastSession", request.reuseLastSession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExecutionShrink)) {
            body.put("taskExecution", request.taskExecutionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendAsyncChatMessage"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/sendAsyncChatMessage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendAsyncChatMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Asynchronously sends a session message.</p>
     * 
     * <b>summary</b> : 
     * <p>Asynchronously sends a session message.</p>
     * 
     * @param request SendAsyncChatMessageRequest
     * @return SendAsyncChatMessageResponse
     */
    public SendAsyncChatMessageResponse sendAsyncChatMessage(SendAsyncChatMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendAsyncChatMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to upload a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>A persistent OSS address (<code>filePath</code>) must be provided for the file. Other information such as the public access URL and original file name is optional.</li>
     * <li>If the target folder ID (<code>directoryId</code>) is not specified, the file is automatically attached to the default root folder of the current digital employee. If specified, ensure that the folder belongs to the invoker\&quot;s personal folder.</li>
     * <li>Multiple authentication methods (AK, BearerToken, APP) are supported to authenticate requests.</li>
     * <li>The operation type is write, and operation logs are recorded for subsequent auditing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a message.</p>
     * 
     * @param tmpReq SendChatMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendChatMessageResponse
     */
    public SendChatMessageResponse sendChatMessageWithOptions(SendChatMessageRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendChatMessageShrinkRequest request = new SendChatMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.digitalEmployeeName)) {
            request.digitalEmployeeNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.digitalEmployeeName, "digitalEmployeeName", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.files)) {
            request.filesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.files, "files", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskExecution)) {
            request.taskExecutionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskExecution, "taskExecution", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("contentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalEmployeeNameShrink)) {
            body.put("digitalEmployeeName", request.digitalEmployeeNameShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directChat)) {
            body.put("directChat", request.directChat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filesShrink)) {
            body.put("files", request.filesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reuseLastSession)) {
            body.put("reuseLastSession", request.reuseLastSession);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskExecutionShrink)) {
            body.put("taskExecution", request.taskExecutionShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendChatMessage"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/sendChatMessage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendChatMessageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API is used to upload a file to the &quot;My Resources&quot; section of a specified digital employee.</li>
     * <li><code>source_type</code> is fixed to <code>FILE</code>, <code>scope</code> is fixed to <code>PERSONAL</code>, and <code>platform</code> is fixed to <code>LOCAL</code>.</li>
     * <li>A persistent OSS address (<code>filePath</code>) must be provided for the file. Other information such as the public access URL and original file name is optional.</li>
     * <li>If the target folder ID (<code>directoryId</code>) is not specified, the file is automatically attached to the default root folder of the current digital employee. If specified, ensure that the folder belongs to the invoker\&quot;s personal folder.</li>
     * <li>Multiple authentication methods (AK, BearerToken, APP) are supported to authenticate requests.</li>
     * <li>The operation type is write, and operation logs are recorded for subsequent auditing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sends a message.</p>
     * 
     * @param request SendChatMessageRequest
     * @return SendChatMessageResponse
     */
    public SendChatMessageResponse sendChatMessage(SendChatMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.sendChatMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops conversation generation.</p>
     * 
     * @param request StopChatMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopChatMessageResponse
     */
    public StopChatMessageResponse stopChatMessageWithOptions(StopChatMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopChatMessage"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/stopChatMessage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopChatMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops conversation generation.</p>
     * 
     * @param request StopChatMessageRequest
     * @return StopChatMessageResponse
     */
    public StopChatMessageResponse stopChatMessage(StopChatMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopChatMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Subscribes to a conversation message stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Subscribes to a conversation message stream.</p>
     * 
     * @param request StreamChatMessageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StreamChatMessageResponse
     */
    public StreamChatMessageResponse streamChatMessageWithOptions(String messageId, StreamChatMessageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lastEventId)) {
            query.put("lastEventId", request.lastEventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StreamChatMessage"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/streamChatMessage/" + com.aliyun.openapiutil.Client.getEncodeParam(messageId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StreamChatMessageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Subscribes to a conversation message stream.</p>
     * 
     * <b>summary</b> : 
     * <p>Subscribes to a conversation message stream.</p>
     * 
     * @param request StreamChatMessageRequest
     * @return StreamChatMessageResponse
     */
    public StreamChatMessageResponse streamChatMessage(String messageId, StreamChatMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.streamChatMessageWithOptions(messageId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Accepts a department tree and member relationships pushed from the client and creates an asynchronous synchronization task.
     *     Processing flow:
     *     1. Validates platformType (only saml, oauth2, or custom are allowed).
     *     2. Validates data volume limits (departments + members &lt;= 50000).
     *     3. Validates the compatibility between syncMembers and platformType.
     *     4. SAML/OAuth2 scenario: Parses or automatically derives ssoSettingsId.
     *     5. Custom scenario: Validates that corpId has been registered through createCustomOrg.
     *     6. Delegates to OrgSyncAuthorizedService to create the task (which includes permission verification).
     *     7. Returns taskId for polling.</p>
     * 
     * <b>summary</b> : 
     * <p>Pushes organizational structure synchronization.</p>
     * 
     * @param tmpReq SyncOrgStructureRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncOrgStructureResponse
     */
    public SyncOrgStructureResponse syncOrgStructureWithOptions(SyncOrgStructureRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncOrgStructureShrinkRequest request = new SyncOrgStructureShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.departments)) {
            request.departmentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.departments, "departments", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "members", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corpId", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departmentsShrink)) {
            body.put("departments", request.departmentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            body.put("members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformType)) {
            body.put("platformType", request.platformType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssoSettingsId)) {
            body.put("ssoSettingsId", request.ssoSettingsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncMembers)) {
            body.put("syncMembers", request.syncMembers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncOrgStructure"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/syncOrgStructure"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncOrgStructureResponse());
    }

    /**
     * <b>description</b> :
     * <p>Accepts a department tree and member relationships pushed from the client and creates an asynchronous synchronization task.
     *     Processing flow:
     *     1. Validates platformType (only saml, oauth2, or custom are allowed).
     *     2. Validates data volume limits (departments + members &lt;= 50000).
     *     3. Validates the compatibility between syncMembers and platformType.
     *     4. SAML/OAuth2 scenario: Parses or automatically derives ssoSettingsId.
     *     5. Custom scenario: Validates that corpId has been registered through createCustomOrg.
     *     6. Delegates to OrgSyncAuthorizedService to create the task (which includes permission verification).
     *     7. Returns taskId for polling.</p>
     * 
     * <b>summary</b> : 
     * <p>Pushes organizational structure synchronization.</p>
     * 
     * @param request SyncOrgStructureRequest
     * @return SyncOrgStructureResponse
     */
    public SyncOrgStructureResponse syncOrgStructure(SyncOrgStructureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.syncOrgStructureWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Precheck</strong>:<ol>
     * <li>When adding a follow: The system checks whether the primary object is already followed to prevent duplicates, and authenticates that the primary object exists.</li>
     * <li>When unfollowing: This is an idempotent operation. Regardless of whether the user has previously followed the object, <code>success=true</code> is returned.</li>
     * </ol>
     * </li>
     * <li><strong>Security</strong>: Three authentication methods are supported: AK, BearerToken, and APP.</li>
     * <li><strong>Request frequency limit</strong>: A maximum of 100 requests can be send per second.</li>
     * <li><strong>Response log</strong>: The response log record feature is enabled.</li>
     * <li><strong>Tenant relevance</strong>: This API is associated with a specific tenant. The tenant ID of the invoker is used by default.</li>
     * <li><strong>Operation type</strong>: Write operation.</li>
     * <li><strong>Backend service</strong>: Requests are forwarded to an internal service for processing. The timeout period is 3 seconds.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Follows or unfollows a specified primary object.</p>
     * 
     * @param tmpReq TogglePrimaryObjectFavoriteRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return TogglePrimaryObjectFavoriteResponse
     */
    public TogglePrimaryObjectFavoriteResponse togglePrimaryObjectFavoriteWithOptions(TogglePrimaryObjectFavoriteRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TogglePrimaryObjectFavoriteShrinkRequest request = new TogglePrimaryObjectFavoriteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.objectIds)) {
            request.objectIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.objectIds, "objectIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.action)) {
            body.put("action", request.action);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectIdsShrink)) {
            body.put("objectIds", request.objectIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            body.put("objectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TogglePrimaryObjectFavorite"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/togglePrimaryObjectFavorite"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TogglePrimaryObjectFavoriteResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li><strong>Precheck</strong>:<ol>
     * <li>When adding a follow: The system checks whether the primary object is already followed to prevent duplicates, and authenticates that the primary object exists.</li>
     * <li>When unfollowing: This is an idempotent operation. Regardless of whether the user has previously followed the object, <code>success=true</code> is returned.</li>
     * </ol>
     * </li>
     * <li><strong>Security</strong>: Three authentication methods are supported: AK, BearerToken, and APP.</li>
     * <li><strong>Request frequency limit</strong>: A maximum of 100 requests can be send per second.</li>
     * <li><strong>Response log</strong>: The response log record feature is enabled.</li>
     * <li><strong>Tenant relevance</strong>: This API is associated with a specific tenant. The tenant ID of the invoker is used by default.</li>
     * <li><strong>Operation type</strong>: Write operation.</li>
     * <li><strong>Backend service</strong>: Requests are forwarded to an internal service for processing. The timeout period is 3 seconds.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Follows or unfollows a specified primary object.</p>
     * 
     * @param request TogglePrimaryObjectFavoriteRequest
     * @return TogglePrimaryObjectFavoriteResponse
     */
    public TogglePrimaryObjectFavoriteResponse togglePrimaryObjectFavorite(TogglePrimaryObjectFavoriteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.togglePrimaryObjectFavoriteWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Switches the authorization mode for digital employee usage permissions.
     *     Business logic:
     *     1. Constructs an AuthContext from the identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.update_auth_mode for execution.
     *     3. Pre-validation: MANAGE permission + agent existence check (performed by the AuthorizedService layer, which authenticates before exposing existence).
     *     4. SPECIFIED_USERS: Explicit authorization is required before usage.
     *     5. ALL_USERS: All users can use the digital employee without authorization (management permissions are not affected).</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the authorization mode for digital employee usage permissions.</p>
     * 
     * @param request UpdateAgentAuthModeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAgentAuthModeResponse
     */
    public UpdateAgentAuthModeResponse updateAgentAuthModeWithOptions(UpdateAgentAuthModeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authMode)) {
            body.put("authMode", request.authMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAgentAuthMode"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateAgentAuthMode"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAgentAuthModeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Switches the authorization mode for digital employee usage permissions.
     *     Business logic:
     *     1. Constructs an AuthContext from the identity.
     *     2. Delegates to AgentAuthorizationAuthorizedService.update_auth_mode for execution.
     *     3. Pre-validation: MANAGE permission + agent existence check (performed by the AuthorizedService layer, which authenticates before exposing existence).
     *     4. SPECIFIED_USERS: Explicit authorization is required before usage.
     *     5. ALL_USERS: All users can use the digital employee without authorization (management permissions are not affected).</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the authorization mode for digital employee usage permissions.</p>
     * 
     * @param request UpdateAgentAuthModeRequest
     * @return UpdateAgentAuthModeResponse
     */
    public UpdateAgentAuthModeResponse updateAgentAuthMode(UpdateAgentAuthModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateAgentAuthModeWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates a session.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a session.</p>
     * 
     * @param request UpdateChatSessionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateChatSessionResponse
     */
    public UpdateChatSessionResponse updateChatSessionWithOptions(UpdateChatSessionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateChatSession"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateChatSession"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateChatSessionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates a session.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a session.</p>
     * 
     * @param request UpdateChatSessionRequest
     * @return UpdateChatSessionResponse
     */
    public UpdateChatSessionResponse updateChatSession(UpdateChatSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateChatSessionWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation updates the personal directory information of a specified user, including the name, description, and parent directory. Ensure that the directory corresponding to the provided <code>directoryId</code> exists and belongs to the current user. If the <code>name</code> or <code>path</code> of the directory is changed, the system automatically and recursively updates the paths of all subdirectories to maintain consistency. When adjusting the parent directory, ensure the validity of the new parent directory (that is, it is not the directory itself and does not cause a circular dependency).</p>
     * <ul>
     * <li><strong>Security constraints</strong>: <code>tenant_id</code> and <code>user_id</code> must be derived from the authenticated identity.</li>
     * <li><strong>Permission requirements</strong>: Corresponding RAM permissions are required to perform this operation.</li>
     * <li><strong>Input parameters</strong>:<ul>
     * <li><code>directoryId</code>: Required. The unique identifier of the directory to update.</li>
     * <li><code>name</code>: Optional. The new directory name.</li>
     * <li><code>description</code>: Optional. The new directory description.</li>
     * <li><code>parentId</code>: Optional. The ID of the new parent directory.</li>
     * <li><code>path</code>: Optional. When specified, the system cascades the update to the paths of the current directory and all its subdirectories.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information of a user\&quot;s personal directory.</p>
     * 
     * @param request UpdateDirectoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDirectoryResponse
     */
    public UpdateDirectoryResponse updateDirectoryWithOptions(UpdateDirectoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("parentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDirectory"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateDirectory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API operation updates the personal directory information of a specified user, including the name, description, and parent directory. Ensure that the directory corresponding to the provided <code>directoryId</code> exists and belongs to the current user. If the <code>name</code> or <code>path</code> of the directory is changed, the system automatically and recursively updates the paths of all subdirectories to maintain consistency. When adjusting the parent directory, ensure the validity of the new parent directory (that is, it is not the directory itself and does not cause a circular dependency).</p>
     * <ul>
     * <li><strong>Security constraints</strong>: <code>tenant_id</code> and <code>user_id</code> must be derived from the authenticated identity.</li>
     * <li><strong>Permission requirements</strong>: Corresponding RAM permissions are required to perform this operation.</li>
     * <li><strong>Input parameters</strong>:<ul>
     * <li><code>directoryId</code>: Required. The unique identifier of the directory to update.</li>
     * <li><code>name</code>: Optional. The new directory name.</li>
     * <li><code>description</code>: Optional. The new directory description.</li>
     * <li><code>parentId</code>: Optional. The ID of the new parent directory.</li>
     * <li><code>path</code>: Optional. When specified, the system cascades the update to the paths of the current directory and all its subdirectories.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the basic information of a user\&quot;s personal directory.</p>
     * 
     * @param request UpdateDirectoryRequest
     * @return UpdateDirectoryResponse
     */
    public UpdateDirectoryResponse updateDirectory(UpdateDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDirectoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation modifies a directory in the enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>The <code>tenantId</code> parameter is optional. If not provided, the tenant ID of the caller is used by default.</li>
     * <li>You must specify the <code>directoryId</code> of the directory to modify. The <code>name</code>, <code>description</code>, and <code>parentDirectoryId</code> parameters are optional. If not provided, the corresponding fields remain unchanged.</li>
     * <li>When a new <code>parentDirectoryId</code> is specified, the system checks whether the new parent directory belongs to the current tenant and does not cause a circular dependency.</li>
     * <li>This API operation supports multiple authentication methods (AK, BearerToken, APP) and has RAM permission control and operation auditing enabled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the information of a specified enterprise knowledge base directory, including the name, description, and parent directory.</p>
     * 
     * @param request UpdateKnowledgeBaseDirectoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKnowledgeBaseDirectoryResponse
     */
    public UpdateKnowledgeBaseDirectoryResponse updateKnowledgeBaseDirectoryWithOptions(UpdateKnowledgeBaseDirectoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDirectoryId)) {
            body.put("parentDirectoryId", request.parentDirectoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKnowledgeBaseDirectory"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateKnowledgeBaseDirectory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKnowledgeBaseDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This operation modifies a directory in the enterprise knowledge base.</li>
     * <li>You must have the <code>DEVELOPMENT_KB_MANAGE</code> permission to call this API operation.</li>
     * <li>The <code>tenantId</code> parameter is optional. If not provided, the tenant ID of the caller is used by default.</li>
     * <li>You must specify the <code>directoryId</code> of the directory to modify. The <code>name</code>, <code>description</code>, and <code>parentDirectoryId</code> parameters are optional. If not provided, the corresponding fields remain unchanged.</li>
     * <li>When a new <code>parentDirectoryId</code> is specified, the system checks whether the new parent directory belongs to the current tenant and does not cause a circular dependency.</li>
     * <li>This API operation supports multiple authentication methods (AK, BearerToken, APP) and has RAM permission control and operation auditing enabled.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the information of a specified enterprise knowledge base directory, including the name, description, and parent directory.</p>
     * 
     * @param request UpdateKnowledgeBaseDirectoryRequest
     * @return UpdateKnowledgeBaseDirectoryResponse
     */
    public UpdateKnowledgeBaseDirectoryResponse updateKnowledgeBaseDirectory(UpdateKnowledgeBaseDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKnowledgeBaseDirectoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation allows you to update the body content of a specified enterprise knowledge base data source and optionally wait synchronously for parsing to complete. By setting the <code>forceSync</code> parameter, you can control whether the parsing process is executed synchronously or asynchronously. The default is asynchronous processing.</p>
     * <ul>
     * <li><strong>Note</strong>: When the <code>content</code> field is an empty string, the original content is cleared.</li>
     * <li><strong>Permission requirement</strong>: Calling this operation requires the corresponding RAM action permission (<code>winnexo:UpdateKnowledgeBaseSourceContent</code>).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Edits the body content of a resource in an enterprise self-built knowledge base and triggers re-parsing.</p>
     * 
     * @param request UpdateKnowledgeBaseSourceContentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKnowledgeBaseSourceContentResponse
     */
    public UpdateKnowledgeBaseSourceContentResponse updateKnowledgeBaseSourceContentWithOptions(UpdateKnowledgeBaseSourceContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceSync)) {
            body.put("forceSync", request.forceSync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKnowledgeBaseSourceContent"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateKnowledgeBaseSourceContent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKnowledgeBaseSourceContentResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <p>This operation allows you to update the body content of a specified enterprise knowledge base data source and optionally wait synchronously for parsing to complete. By setting the <code>forceSync</code> parameter, you can control whether the parsing process is executed synchronously or asynchronously. The default is asynchronous processing.</p>
     * <ul>
     * <li><strong>Note</strong>: When the <code>content</code> field is an empty string, the original content is cleared.</li>
     * <li><strong>Permission requirement</strong>: Calling this operation requires the corresponding RAM action permission (<code>winnexo:UpdateKnowledgeBaseSourceContent</code>).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Edits the body content of a resource in an enterprise self-built knowledge base and triggers re-parsing.</p>
     * 
     * @param request UpdateKnowledgeBaseSourceContentRequest
     * @return UpdateKnowledgeBaseSourceContentResponse
     */
    public UpdateKnowledgeBaseSourceContentResponse updateKnowledgeBaseSourceContent(UpdateKnowledgeBaseSourceContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKnowledgeBaseSourceContentWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation updates the labels of a specific data source in an enterprise knowledge base.</li>
     * <li>You must have knowledge base management permissions to invoke this operation.</li>
     * <li>The <code>sourceTags</code> parameter accepts a JSON character string list, such as <code>[&quot;tagA&quot;, &quot;tagB&quot;]</code>. If you set this parameter to <code>null</code>, all existing labels are cleared.</li>
     * <li>The update operation affects only the <code>sourceTags</code> and <code>gmt_modified</code> fields and does not trigger the <code>process_source</code> workflow.</li>
     * <li>If the specified data source does not exist, the <code>ERR.Robject.Source.NotFound</code> fault is returned.</li>
     * <li>This operation supports authentication through AccessKey, BearerToken, or APP methods.</li>
     * <li>When you invoke this operation, make sure that <code>tenant_id</code> and <code>user_id</code> are from valid authentication identity information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the resource tags of a specified data source in an enterprise knowledge base.</p>
     * 
     * @param request UpdateKnowledgeBaseSourceTagsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateKnowledgeBaseSourceTagsResponse
     */
    public UpdateKnowledgeBaseSourceTagsResponse updateKnowledgeBaseSourceTagsWithOptions(UpdateKnowledgeBaseSourceTagsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceTags)) {
            body.put("sourceTags", request.sourceTags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateKnowledgeBaseSourceTags"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateKnowledgeBaseSourceTags"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateKnowledgeBaseSourceTagsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation updates the labels of a specific data source in an enterprise knowledge base.</li>
     * <li>You must have knowledge base management permissions to invoke this operation.</li>
     * <li>The <code>sourceTags</code> parameter accepts a JSON character string list, such as <code>[&quot;tagA&quot;, &quot;tagB&quot;]</code>. If you set this parameter to <code>null</code>, all existing labels are cleared.</li>
     * <li>The update operation affects only the <code>sourceTags</code> and <code>gmt_modified</code> fields and does not trigger the <code>process_source</code> workflow.</li>
     * <li>If the specified data source does not exist, the <code>ERR.Robject.Source.NotFound</code> fault is returned.</li>
     * <li>This operation supports authentication through AccessKey, BearerToken, or APP methods.</li>
     * <li>When you invoke this operation, make sure that <code>tenant_id</code> and <code>user_id</code> are from valid authentication identity information.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the resource tags of a specified data source in an enterprise knowledge base.</p>
     * 
     * @param request UpdateKnowledgeBaseSourceTagsRequest
     * @return UpdateKnowledgeBaseSourceTagsResponse
     */
    public UpdateKnowledgeBaseSourceTagsResponse updateKnowledgeBaseSourceTags(UpdateKnowledgeBaseSourceTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateKnowledgeBaseSourceTagsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates a scheduled task.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a scheduled task.</p>
     * 
     * @param tmpReq UpdateScheduledTaskRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScheduledTaskResponse
     */
    public UpdateScheduledTaskResponse updateScheduledTaskWithOptions(UpdateScheduledTaskRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateScheduledTaskShrinkRequest request = new UpdateScheduledTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.description)) {
            request.descriptionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.description, "description", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.digitalEmployeeName)) {
            request.digitalEmployeeNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.digitalEmployeeName, "digitalEmployeeName", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.segments)) {
            request.segmentsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.segments, "segments", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.taskDetail)) {
            request.taskDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.taskDetail, "taskDetail", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.triggerConfig)) {
            request.triggerConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.triggerConfig, "triggerConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.visibleMemberUserIds)) {
            request.visibleMemberUserIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.visibleMemberUserIds, "visibleMemberUserIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.descriptionShrink)) {
            body.put("description", request.descriptionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.digitalEmployeeNameShrink)) {
            body.put("digitalEmployeeName", request.digitalEmployeeNameShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isOpen)) {
            body.put("isOpen", request.isOpen);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.segmentsShrink)) {
            body.put("segments", request.segmentsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskDetailShrink)) {
            body.put("taskDetail", request.taskDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("taskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerConfigShrink)) {
            body.put("triggerConfig", request.triggerConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibility)) {
            body.put("visibility", request.visibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.visibleMemberUserIdsShrink)) {
            body.put("visibleMemberUserIds", request.visibleMemberUserIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScheduledTask"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateScheduledTask"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScheduledTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates a scheduled task.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a scheduled task.</p>
     * 
     * @param request UpdateScheduledTaskRequest
     * @return UpdateScheduledTaskResponse
     */
    public UpdateScheduledTaskResponse updateScheduledTask(UpdateScheduledTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateScheduledTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation updates the content of a data source within a specified tenant and triggers synchronous or asynchronous re-parsing of the data source as needed.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are used only for authentication and are not involved in actual business logic processing.</li>
     * <li>When the provided content is an empty string, the system performs the operation according to the existing service contract.</li>
     * <li>If the specified data source does not exist, a standard NotFound error is returned. Other exceptions are handled by the global exception chain.</li>
     * <li>Set the <code>forceSync</code> parameter to determine whether to wait for the parsing process to complete. The default behavior is asynchronous queuing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the content of an editable data source within a tenant and triggers re-parsing.</p>
     * 
     * @param request UpdateSourceContentRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSourceContentResponse
     */
    public UpdateSourceContentResponse updateSourceContentWithOptions(UpdateSourceContentRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceSync)) {
            body.put("forceSync", request.forceSync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceId)) {
            body.put("sourceId", request.sourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSourceContent"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateSourceContent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSourceContentResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <ul>
     * <li>This API operation updates the content of a data source within a specified tenant and triggers synchronous or asynchronous re-parsing of the data source as needed.</li>
     * <li><code>tenant_id</code> and <code>user_id</code> are used only for authentication and are not involved in actual business logic processing.</li>
     * <li>When the provided content is an empty string, the system performs the operation according to the existing service contract.</li>
     * <li>If the specified data source does not exist, a standard NotFound error is returned. Other exceptions are handled by the global exception chain.</li>
     * <li>Set the <code>forceSync</code> parameter to determine whether to wait for the parsing process to complete. The default behavior is asynchronous queuing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the content of an editable data source within a tenant and triggers re-parsing.</p>
     * 
     * @param request UpdateSourceContentRequest
     * @return UpdateSourceContentResponse
     */
    public UpdateSourceContentResponse updateSourceContent(UpdateSourceContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateSourceContentWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Modifies knowledge base folder information.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies knowledge base folder information.</p>
     * 
     * @param request UpdateTenantDirectoryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTenantDirectoryResponse
     */
    public UpdateTenantDirectoryResponse updateTenantDirectoryWithOptions(UpdateTenantDirectoryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            body.put("directoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("parentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTenantDirectory"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateTenantDirectory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTenantDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modifies knowledge base folder information.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies knowledge base folder information.</p>
     * 
     * @param request UpdateTenantDirectoryRequest
     * @return UpdateTenantDirectoryResponse
     */
    public UpdateTenantDirectoryResponse updateTenantDirectory(UpdateTenantDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTenantDirectoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Modifies user information through OpenAPI.
     *     Business orchestration:
     *     1. Parse roleCodes → role_ids
     *     2. If isActive has changed, perform the status switch first (including last super admin protection)
     *     3. Call update_tenant_member to modify other fields (displayName / roleCodes / userGroupIds)
     *     4. Return HTTP 200 if all steps succeed
     *     Execution order notes:
     *     - The isActive status change is performed before other field writes. The two steps are not in the same transaction.
     *     - If validation fails (such as last super admin protection) → an exception is thrown and subsequent steps are not executed.
     *     - If the isActive change has been persisted but a subsequent step fails, the isActive change is not rolled back.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies user information, including enabling or disabling the user.</p>
     * 
     * @param tmpReq UpdateUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateUserShrinkRequest request = new UpdateUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleCodes)) {
            request.roleCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleCodes, "roleCodes", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userGroupIds)) {
            request.userGroupIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userGroupIds, "userGroupIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isActive)) {
            body.put("isActive", request.isActive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodesShrink)) {
            body.put("roleCodes", request.roleCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIdsShrink)) {
            body.put("userGroupIds", request.userGroupIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wnUserId)) {
            body.put("wnUserId", request.wnUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modifies user information through OpenAPI.
     *     Business orchestration:
     *     1. Parse roleCodes → role_ids
     *     2. If isActive has changed, perform the status switch first (including last super admin protection)
     *     3. Call update_tenant_member to modify other fields (displayName / roleCodes / userGroupIds)
     *     4. Return HTTP 200 if all steps succeed
     *     Execution order notes:
     *     - The isActive status change is performed before other field writes. The two steps are not in the same transaction.
     *     - If validation fails (such as last super admin protection) → an exception is thrown and subsequent steps are not executed.
     *     - If the isActive change has been persisted but a subsequent step fails, the isActive change is not rolled back.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies user information, including enabling or disabling the user.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API allows the caller to update some or all optional fields of a specified user. Fields that are not provided retain their original values.</li>
     * <li>Use the <code>tenantId</code> parameter to specify a tenant ID. If omitted, the default tenant of the caller is used.</li>
     * <li>After a successful update, the response body contains the complete user information object.</li>
     * <li>This operation requires authentication and supports AK, BearerToken, and APP security schemes.</li>
     * <li>The request content type is JSON, and the operation is available only over HTTPS.</li>
     * <li>Note: The <code>profileRoleInfo</code> field is valid only when the user role is set to Others. It describes the specific role information of the user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates partial fields of the current user information and returns the complete user information.</p>
     * 
     * @param request UpdateUserInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserInfoResponse
     */
    public UpdateUserInfoResponse updateUserInfoWithOptions(UpdateUserInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.avatar)) {
            body.put("avatar", request.avatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languagePreference)) {
            body.put("languagePreference", request.languagePreference);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offering)) {
            body.put("offering", request.offering);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileRoleInfo)) {
            body.put("profileRoleInfo", request.profileRoleInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selfIntroduction)) {
            body.put("selfIntroduction", request.selfIntroduction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserInfo"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/updateUserInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserInfoResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This API allows the caller to update some or all optional fields of a specified user. Fields that are not provided retain their original values.</li>
     * <li>Use the <code>tenantId</code> parameter to specify a tenant ID. If omitted, the default tenant of the caller is used.</li>
     * <li>After a successful update, the response body contains the complete user information object.</li>
     * <li>This operation requires authentication and supports AK, BearerToken, and APP security schemes.</li>
     * <li>The request content type is JSON, and the operation is available only over HTTPS.</li>
     * <li>Note: The <code>profileRoleInfo</code> field is valid only when the user role is set to Others. It describes the specific role information of the user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates partial fields of the current user information and returns the complete user information.</p>
     * 
     * @param request UpdateUserInfoRequest
     * @return UpdateUserInfoResponse
     */
    public UpdateUserInfoResponse updateUserInfo(UpdateUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateUserInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API is used to upload a session temporary file by using the <strong>file transfer upload</strong> mode (<code>fileTransfer</code>). The file binary data is not transmitted through the request body of this API. Instead, the file is first uploaded to Object Storage Service (OSS), and then the OSS address is passed to the backend through the <code>FileUrl</code> parameter. The backend retrieves the bytes from that address, writes them to its own OSS, and creates a session temporary file record.</p>
     * <h3>Call methods</h3>
     * <ul>
     * <li><strong>Recommended</strong>: Use the <code>UploadChatFileAdvance</code> method generated by the SDK. Pass in the local file stream, and the SDK automatically completes the transfer upload and populates <code>FileUrl</code>.</li>
     * <li><strong>Direct upload</strong>: Upload the file to an OSS address accessible by the server, and then directly call this API with the <code>FileUrl</code> parameter.</li>
     * </ul>
     * <h3>Request parameters</h3>
     * <ul>
     * <li><strong>FileUrl</strong>: Required. The OSS address of the file. When you use the Advance method, the SDK automatically populates this parameter. You do not need to manually assign a value.</li>
     * <li><strong>FileName</strong>: Required. The original file name including the extension, such as <code>report.pdf</code>. The OSS address generated during transfer does not carry the original file name. The backend uses this parameter to determine the file extension and display name. Therefore, you must explicitly pass in this parameter.</li>
     * <li><strong>ContentType</strong>: Optional. The MIME type of the file. If this parameter is not specified, <code>application/octet-stream</code> is used.</li>
     * <li><strong>OperatingObjectName</strong>: Optional. The Agent namespace identifier that determines the file storage path.</li>
     * </ul>
     * <h3>Response parameters</h3>
     * <p>The response includes the OSS object path <code>objectName</code>, the storage address <code>fileUrl</code>, the public access address <code>filePublicUrl</code> (valid for 1 hour), and the file record ID <code>fileRecordId</code>. The <code>uploadSignatureUrl</code> parameter is always empty in this mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a local file in a session.</p>
     * 
     * @param request UploadChatFileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadChatFileResponse
     */
    public UploadChatFileResponse uploadChatFileWithOptions(UploadChatFileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            query.put("tenantId", request.tenantId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentType)) {
            body.put("contentType", request.contentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("fileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("fileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatingObjectName)) {
            body.put("operatingObjectName", request.operatingObjectName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadChatFile"),
            new TeaPair("version", "2026-05-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/openapi/uploadChatFile"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadChatFileResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This API is used to upload a session temporary file by using the <strong>file transfer upload</strong> mode (<code>fileTransfer</code>). The file binary data is not transmitted through the request body of this API. Instead, the file is first uploaded to Object Storage Service (OSS), and then the OSS address is passed to the backend through the <code>FileUrl</code> parameter. The backend retrieves the bytes from that address, writes them to its own OSS, and creates a session temporary file record.</p>
     * <h3>Call methods</h3>
     * <ul>
     * <li><strong>Recommended</strong>: Use the <code>UploadChatFileAdvance</code> method generated by the SDK. Pass in the local file stream, and the SDK automatically completes the transfer upload and populates <code>FileUrl</code>.</li>
     * <li><strong>Direct upload</strong>: Upload the file to an OSS address accessible by the server, and then directly call this API with the <code>FileUrl</code> parameter.</li>
     * </ul>
     * <h3>Request parameters</h3>
     * <ul>
     * <li><strong>FileUrl</strong>: Required. The OSS address of the file. When you use the Advance method, the SDK automatically populates this parameter. You do not need to manually assign a value.</li>
     * <li><strong>FileName</strong>: Required. The original file name including the extension, such as <code>report.pdf</code>. The OSS address generated during transfer does not carry the original file name. The backend uses this parameter to determine the file extension and display name. Therefore, you must explicitly pass in this parameter.</li>
     * <li><strong>ContentType</strong>: Optional. The MIME type of the file. If this parameter is not specified, <code>application/octet-stream</code> is used.</li>
     * <li><strong>OperatingObjectName</strong>: Optional. The Agent namespace identifier that determines the file storage path.</li>
     * </ul>
     * <h3>Response parameters</h3>
     * <p>The response includes the OSS object path <code>objectName</code>, the storage address <code>fileUrl</code>, the public access address <code>filePublicUrl</code> (valid for 1 hour), and the file record ID <code>fileRecordId</code>. The <code>uploadSignatureUrl</code> parameter is always empty in this mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Uploads a local file in a session.</p>
     * 
     * @param request UploadChatFileRequest
     * @return UploadChatFileResponse
     */
    public UploadChatFileResponse uploadChatFile(UploadChatFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.uploadChatFileWithOptions(request, headers, runtime);
    }

    public UploadChatFileResponse uploadChatFileAdvance(UploadChatFileAdvanceRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        com.aliyun.credentials.models.CredentialModel credentialModel = null;
        if (com.aliyun.teautil.Common.isUnset(_credential)) {
            throw new TeaException(TeaConverter.buildMap(
                new TeaPair("code", "InvalidCredentials"),
                new TeaPair("message", "Please set up the credentials correctly. If you are setting them through environment variables, please ensure that ALIBABA_CLOUD_ACCESS_KEY_ID and ALIBABA_CLOUD_ACCESS_KEY_SECRET are set correctly. See https://help.aliyun.com/zh/sdk/developer-reference/configure-the-alibaba-cloud-accesskey-environment-variable-on-linux-macos-and-windows-systems for more details.")
            ));
        }

        credentialModel = _credential.getCredential();
        String accessKeyId = credentialModel.accessKeyId;
        String accessKeySecret = credentialModel.accessKeySecret;
        String securityToken = credentialModel.securityToken;
        String credentialType = credentialModel.type;
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.teaopenapi.Client authClient = new com.aliyun.teaopenapi.Client(authConfig);
        java.util.Map<String, String> authRequest = TeaConverter.buildMap(
            new TeaPair("Product", "WinNexo"),
            new TeaPair("RegionId", _regionId)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest authReq = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(authRequest))
        ));
        com.aliyun.teaopenapi.models.Params authParams = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeFileUpload"),
            new TeaPair("version", "2019-12-19"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        java.util.Map<String, Object> authResponse = new java.util.HashMap<>();
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        java.util.Map<String, Object> ossHeader = new java.util.HashMap<>();
        java.util.Map<String, Object> tmpBody = new java.util.HashMap<>();
        Boolean useAccelerate = false;
        java.util.Map<String, String> authResponseBody = new java.util.HashMap<>();
        UploadChatFileRequest uploadChatFileReq = new UploadChatFileRequest();
        com.aliyun.openapiutil.Client.convert(request, uploadChatFileReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            Object tmpResp0 = authClient.callApi(authParams, authReq, runtime);
            authResponse = com.aliyun.teautil.Common.assertAsMap(tmpResp0);
            tmpBody = com.aliyun.teautil.Common.assertAsMap(authResponse.get("body"));
            useAccelerate = com.aliyun.teautil.Common.assertAsBoolean(tmpBody.get("UseAccelerate"));
            authResponseBody = com.aliyun.teautil.Common.stringifyMapValue(tmpBody);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponseBody.get("ObjectKey")),
                new TeaPair("content", request.fileUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = TeaConverter.buildMap(
                new TeaPair("host", com.aliyun.openapiutil.Client.getEndpoint(authResponseBody.get("Endpoint"), useAccelerate, _endpointType)),
                new TeaPair("OSSAccessKeyId", authResponseBody.get("AccessKeyId")),
                new TeaPair("policy", authResponseBody.get("EncodedPolicy")),
                new TeaPair("Signature", authResponseBody.get("Signature")),
                new TeaPair("key", authResponseBody.get("ObjectKey")),
                new TeaPair("file", fileObj),
                new TeaPair("success_action_status", "201")
            );
            this._postOSSObject(authResponseBody.get("Bucket"), ossHeader, runtime);
            uploadChatFileReq.fileUrl = "http://" + authResponseBody.get("Bucket") + "." + authResponseBody.get("Endpoint") + "/" + authResponseBody.get("ObjectKey") + "";
        }

        UploadChatFileResponse uploadChatFileResp = this.uploadChatFileWithOptions(uploadChatFileReq, headers, runtime);
        return uploadChatFileResp;
    }
}
