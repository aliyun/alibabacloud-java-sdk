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
        this._endpointRule = "";
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
     * <p>服务健康检查</p>
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
     * <p>服务健康检查</p>
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
     * <p>创建会话</p>
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
     * <p>创建会话</p>
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
     * <p>注册一个纯自定义组织，用于后续通过 syncOrgStructure 推送部门树。
     *     注册逻辑：
     *     1. 校验 corpId 格式（小写字母/数字开头，3-64 位，允许中划线）
     *     2. 委托 OrgSyncAuthorizedService 执行注册（内含权限校验 + 租户内唯一性检查）
     *     3. 返回注册结果
     *     注意：纯自定义组织仅支持部门树同步，不支持成员关系同步。</p>
     * 
     * <b>summary</b> : 
     * <p>注册纯自定义组织</p>
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
     * <p>注册一个纯自定义组织，用于后续通过 syncOrgStructure 推送部门树。
     *     注册逻辑：
     *     1. 校验 corpId 格式（小写字母/数字开头，3-64 位，允许中划线）
     *     2. 委托 OrgSyncAuthorizedService 执行注册（内含权限校验 + 租户内唯一性检查）
     *     3. 返回注册结果
     *     注意：纯自定义组织仅支持部门树同步，不支持成员关系同步。</p>
     * 
     * <b>summary</b> : 
     * <p>注册纯自定义组织</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于将阿里钉在线文档添加到指定的企业知识库中。</li>
     * <li>调用者必须具备<code>DEVELOPMENT_KB_MANAGE</code>功能权限。</li>
     * <li><code>source_type</code>固定为<code>ONLINE_DOC</code>，<code>platform</code>固定为<code>ALI_DING</code>，<code>scope</code>固定为<code>TENANT</code>。</li>
     * <li>如果不提供<code>directoryId</code>，则默认绑定到当前数字员工的根目录；若提供，则必须是当前租户下的有效目录ID。</li>
     * <li><code>filePublicUrl</code>参数是必需的，表示要上传的阿里钉在线文档的公开访问URL。</li>
     * <li>可选参数包括<code>operatingObjectName</code>（数字员工名称）、<code>description</code>（资源描述）、<code>knowledgeId</code>（知识库ID）和<code>sourceTags</code>（资源标签）等。</li>
     * <li>成功响应会返回新创建资源的相关信息，如<code>sourceId</code>、<code>name</code>、<code>status</code>、<code>directoryId</code>及创建时间等。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将阿里钉在线文档上传到企业知识库，需管理权限。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于将阿里钉在线文档添加到指定的企业知识库中。</li>
     * <li>调用者必须具备<code>DEVELOPMENT_KB_MANAGE</code>功能权限。</li>
     * <li><code>source_type</code>固定为<code>ONLINE_DOC</code>，<code>platform</code>固定为<code>ALI_DING</code>，<code>scope</code>固定为<code>TENANT</code>。</li>
     * <li>如果不提供<code>directoryId</code>，则默认绑定到当前数字员工的根目录；若提供，则必须是当前租户下的有效目录ID。</li>
     * <li><code>filePublicUrl</code>参数是必需的，表示要上传的阿里钉在线文档的公开访问URL。</li>
     * <li>可选参数包括<code>operatingObjectName</code>（数字员工名称）、<code>description</code>（资源描述）、<code>knowledgeId</code>（知识库ID）和<code>sourceTags</code>（资源标签）等。</li>
     * <li>成功响应会返回新创建资源的相关信息，如<code>sourceId</code>、<code>name</code>、<code>status</code>、<code>directoryId</code>及创建时间等。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将阿里钉在线文档上传到企业知识库，需管理权限。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口允许具有<code>DEVELOPMENT_KB_MANAGE</code>权限的用户为企业知识库创建新的分类。</li>
     * <li>创建时可指定父分类ID，若未指定，则新分类将直接挂载于企业知识库根目录下。</li>
     * <li>系统会自动检查同名冲突及目录深度限制等问题。</li>
     * <li><code>tenant_id</code>和<code>user_id</code>仅通过鉴权身份获取，请求体中即使提供也会被忽略。</li>
     * <li>需要确保提供的<code>parentDirectoryId</code>（如果有的话）属于当前租户。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于在企业知识库中创建新的分类目录。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口允许具有<code>DEVELOPMENT_KB_MANAGE</code>权限的用户为企业知识库创建新的分类。</li>
     * <li>创建时可指定父分类ID，若未指定，则新分类将直接挂载于企业知识库根目录下。</li>
     * <li>系统会自动检查同名冲突及目录深度限制等问题。</li>
     * <li><code>tenant_id</code>和<code>user_id</code>仅通过鉴权身份获取，请求体中即使提供也会被忽略。</li>
     * <li>需要确保提供的<code>parentDirectoryId</code>（如果有的话）属于当前租户。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于在企业知识库中创建新的分类目录。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于向企业知识库中上传文件。</li>
     * <li>需要拥有<code>DEVELOPMENT_KB_MANAGE</code>功能权限才能调用此API。</li>
     * <li>文件上传时必须提供文件的OSS持久化地址(<code>filePath</code>)。</li>
     * <li>可选参数包括文件公开访问URL、原始文件名等，以增强文件信息的完整性。</li>
     * <li>如果指定了<code>directoryId</code>，则文件会被放置在对应的企业知识库目录下；否则，默认绑定到当前数字员工默认根目录。</li>
     * <li>支持通过<code>sourceTags</code>为资源添加标签，便于后续管理和检索。</li>
     * <li>本操作会启动计费账单（UNSTRUCTURED_PARSE），请确保账户余额充足。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将指定文件上传至企业知识库，需具备管理权限。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于向企业知识库中上传文件。</li>
     * <li>需要拥有<code>DEVELOPMENT_KB_MANAGE</code>功能权限才能调用此API。</li>
     * <li>文件上传时必须提供文件的OSS持久化地址(<code>filePath</code>)。</li>
     * <li>可选参数包括文件公开访问URL、原始文件名等，以增强文件信息的完整性。</li>
     * <li>如果指定了<code>directoryId</code>，则文件会被放置在对应的企业知识库目录下；否则，默认绑定到当前数字员工默认根目录。</li>
     * <li>支持通过<code>sourceTags</code>为资源添加标签，便于后续管理和检索。</li>
     * <li>本操作会启动计费账单（UNSTRUCTURED_PARSE），请确保账户余额充足。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将指定文件上传至企业知识库，需具备管理权限。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于向企业知识库上传纯文本信息，要求调用者具备相应的管理权限。</li>
     * <li><code>textContent</code>字段为必填项，代表要上传的纯文本内容。</li>
     * <li>可选参数包括数字员工名称(<code>operatingObjectName</code>)、资源描述(<code>description</code>)等，允许用户自定义更多细节。</li>
     * <li>如果提供了<code>directoryId</code>，则会将上传的文本绑定到指定的知识库目录下；若未提供，则默认绑定到当前数字员工的根目录。</li>
     * <li>支持通过<code>sourceTags</code>给资源打标签，方便后续管理和检索。</li>
     * <li>调用此接口前，请确保已正确配置身份验证方式（支持AK、BearerToken及APP认证）并拥有<code>DEVELOPMENT_KB_MANAGE</code>权限。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将纯文本内容添加至指定的企业知识库中。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于向企业知识库上传纯文本信息，要求调用者具备相应的管理权限。</li>
     * <li><code>textContent</code>字段为必填项，代表要上传的纯文本内容。</li>
     * <li>可选参数包括数字员工名称(<code>operatingObjectName</code>)、资源描述(<code>description</code>)等，允许用户自定义更多细节。</li>
     * <li>如果提供了<code>directoryId</code>，则会将上传的文本绑定到指定的知识库目录下；若未提供，则默认绑定到当前数字员工的根目录。</li>
     * <li>支持通过<code>sourceTags</code>给资源打标签，方便后续管理和检索。</li>
     * <li>调用此接口前，请确保已正确配置身份验证方式（支持AK、BearerToken及APP认证）并拥有<code>DEVELOPMENT_KB_MANAGE</code>权限。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将纯文本内容添加至指定的企业知识库中。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将阿里钉会议相关资料（如音视频、闪记链接等）上传至指定数字员工的“我的资源”中。</li>
     * <li><code>source_type</code> 固定为 <code>ALI_DING_MEETING</code>，且作用范围 <code>scope</code> 固定为 <code>PERSONAL</code>。</li>
     * <li>必须提供公开的音视频OSS地址 (<code>ossUrl</code>) 和原始的闪记链接 (<code>shanjiUrl</code>)。</li>
     * <li>可选地，可以指定目标个人目录ID (<code>directoryId</code>)；若未指定，则自动绑定到当前数字员工默认根目录。</li>
     * <li>支持添加资源描述 (<code>description</code>) 和会议笔记内容 (<code>notes</code>)，其中会议笔记可用于辅助分析。</li>
     * <li>此操作需要相应的权限认证，支持AK、BearerToken和APP三种认证方式之一。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将阿里钉会议文件上传至当前数字员工的个人资源库。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将阿里钉会议相关资料（如音视频、闪记链接等）上传至指定数字员工的“我的资源”中。</li>
     * <li><code>source_type</code> 固定为 <code>ALI_DING_MEETING</code>，且作用范围 <code>scope</code> 固定为 <code>PERSONAL</code>。</li>
     * <li>必须提供公开的音视频OSS地址 (<code>ossUrl</code>) 和原始的闪记链接 (<code>shanjiUrl</code>)。</li>
     * <li>可选地，可以指定目标个人目录ID (<code>directoryId</code>)；若未指定，则自动绑定到当前数字员工默认根目录。</li>
     * <li>支持添加资源描述 (<code>description</code>) 和会议笔记内容 (<code>notes</code>)，其中会议笔记可用于辅助分析。</li>
     * <li>此操作需要相应的权限认证，支持AK、BearerToken和APP三种认证方式之一。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将阿里钉会议文件上传至当前数字员工的个人资源库。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将阿里钉在线文档添加到指定数字员工的&quot;我的资源&quot;中。</li>
     * <li>固定参数包括 <code>source_type=ONLINE_DOC</code>、<code>platform=ALI_DING</code> 和 <code>scope=PERSONAL</code>。</li>
     * <li>如果未提供<code>directoryId</code>，则默认绑定到当前数字员工的根目录；若提供了，则需确保该目录属于当前用户且在当前数字员工下存在。</li>
     * <li>调用过程中会启动计量并记录相关操作日志。</li>
     * <li>安全性方面，<code>tenant_id</code>和<code>user_id</code>仅从鉴权身份获取，调用方提供的这些字段值将被忽略。</li>
     * <li>任何校验或执行失败都会通过服务抛出异常，并转换为POP错误码返回给调用者。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将阿里钉在线文档上传至当前数字员工的个人资源中。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将阿里钉在线文档添加到指定数字员工的&quot;我的资源&quot;中。</li>
     * <li>固定参数包括 <code>source_type=ONLINE_DOC</code>、<code>platform=ALI_DING</code> 和 <code>scope=PERSONAL</code>。</li>
     * <li>如果未提供<code>directoryId</code>，则默认绑定到当前数字员工的根目录；若提供了，则需确保该目录属于当前用户且在当前数字员工下存在。</li>
     * <li>调用过程中会启动计量并记录相关操作日志。</li>
     * <li>安全性方面，<code>tenant_id</code>和<code>user_id</code>仅从鉴权身份获取，调用方提供的这些字段值将被忽略。</li>
     * <li>任何校验或执行失败都会通过服务抛出异常，并转换为POP错误码返回给调用者。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将阿里钉在线文档上传至当前数字员工的个人资源中。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于创建一个阿里钉知识库，并将其挂载到指定数字员工的个人资源目录下。</li>
     * <li><code>platform</code>固定为<code>ALI_DING</code>，<code>directory_type</code>固定为<code>PERSONAL</code>。</li>
     * <li>如果提供了<code>directoryId</code>，则会验证该目录是否存在且属于当前租户和个人类型。</li>
     * <li>创建过程中会初始化知识库根目录（状态设置为<code>RUNNING</code>），并根据提供的同步配置派发后台任务以拉取远程目录树和创建子节点。</li>
     * <li>安全性方面，<code>tenant_id</code>与<code>user_id</code>仅从鉴权身份获取，请求体中的这些字段会被忽略。</li>
     * <li>同步配置可选，若启用需提供cron表达式；未传或禁用时，默认不进行定时同步。</li>
     * <li>知识库名称可以自定义，如果不提供，则会在后台同步后自动填充。</li>
     * <li>支持多值对象绑定，相关信息将被序列化并存储于知识库元数据中。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将阿里钉整体知识库添加到当前数字员工的个人资源中。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于创建一个阿里钉知识库，并将其挂载到指定数字员工的个人资源目录下。</li>
     * <li><code>platform</code>固定为<code>ALI_DING</code>，<code>directory_type</code>固定为<code>PERSONAL</code>。</li>
     * <li>如果提供了<code>directoryId</code>，则会验证该目录是否存在且属于当前租户和个人类型。</li>
     * <li>创建过程中会初始化知识库根目录（状态设置为<code>RUNNING</code>），并根据提供的同步配置派发后台任务以拉取远程目录树和创建子节点。</li>
     * <li>安全性方面，<code>tenant_id</code>与<code>user_id</code>仅从鉴权身份获取，请求体中的这些字段会被忽略。</li>
     * <li>同步配置可选，若启用需提供cron表达式；未传或禁用时，默认不进行定时同步。</li>
     * <li>知识库名称可以自定义，如果不提供，则会在后台同步后自动填充。</li>
     * <li>支持多值对象绑定，相关信息将被序列化并存储于知识库元数据中。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将阿里钉整体知识库添加到当前数字员工的个人资源中。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于将钉钉会议作为资源上传到指定数字员工的“我的资源”中。</li>
     * <li><code>source_type</code> 固定为 <code>DINGTALK_MEETING</code>，<code>scope</code> 固定为 <code>PERSONAL</code>。</li>
     * <li>如果不提供 <code>credentialId</code>，则使用系统默认配置。</li>
     * <li>当未指定 <code>directoryId</code> 时，资源将自动绑定到当前数字员工的默认根目录下；若指定，则必须是调用者在该数字员工下的已有个人目录。</li>
     * <li>可选参数 <code>description</code> 和 <code>notes</code> 分别用于描述资源和记录会议笔记，其中 <code>notes</code> 会参与辅助分析。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将钉钉会议上传至当前数字员工的个人资源库。</p>
     * 
     * @param request CreatePersonalDingtalkMeetingRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalDingtalkMeetingResponse
     */
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于将钉钉会议作为资源上传到指定数字员工的“我的资源”中。</li>
     * <li><code>source_type</code> 固定为 <code>DINGTALK_MEETING</code>，<code>scope</code> 固定为 <code>PERSONAL</code>。</li>
     * <li>如果不提供 <code>credentialId</code>，则使用系统默认配置。</li>
     * <li>当未指定 <code>directoryId</code> 时，资源将自动绑定到当前数字员工的默认根目录下；若指定，则必须是调用者在该数字员工下的已有个人目录。</li>
     * <li>可选参数 <code>description</code> 和 <code>notes</code> 分别用于描述资源和记录会议笔记，其中 <code>notes</code> 会参与辅助分析。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将钉钉会议上传至当前数字员工的个人资源库。</p>
     * 
     * @param request CreatePersonalDingtalkMeetingRequest
     * @return CreatePersonalDingtalkMeetingResponse
     */
    public CreatePersonalDingtalkMeetingResponse createPersonalDingtalkMeeting(CreatePersonalDingtalkMeetingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPersonalDingtalkMeetingWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于在“我的资源”下创建个人目录（分类）。</li>
     * <li>若未传 <code>parentDirectoryId</code>，系统将自动使用或创建当前数字员工的默认根目录作为父目录。</li>
     * <li>若传入 <code>parentDirectoryId</code>，则必须是当前用户在当前数字员工下的已有个人目录。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 仅来自鉴权身份，调用方在请求体中传入这些字段会被忽略。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>在我的资源下创建个人目录（分类）</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于在“我的资源”下创建个人目录（分类）。</li>
     * <li>若未传 <code>parentDirectoryId</code>，系统将自动使用或创建当前数字员工的默认根目录作为父目录。</li>
     * <li>若传入 <code>parentDirectoryId</code>，则必须是当前用户在当前数字员工下的已有个人目录。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 仅来自鉴权身份，调用方在请求体中传入这些字段会被忽略。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>在我的资源下创建个人目录（分类）</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于将飞书妙记中的会议记录上传至指定数字员工的&quot;我的资源&quot;中。通过提供必要的参数，如飞书妙记的唯一标识符（<code>minuteToken</code>）和凭证 ID（<code>credentialId</code>），可以实现会议内容的迁移与保存。若未指定目标目录，则默认绑定到当前数字员工下的根目录。</p>
     * <ul>
     * <li><code>operatingObjectName</code>：执行操作的数字员工名称。</li>
     * <li><code>name</code>：上传后资源在系统内的显示名称。</li>
     * <li><code>minuteToken</code>：来自飞书妙记平台的会议唯一标识符。</li>
     * <li><code>credentialId</code>：关联到特定认证信息的ID，用于验证请求合法性。</li>
     * <li><code>directoryId</code>（可选）：指定要存放资源的目标个人目录ID；如果省略此字段，则资源将被自动放置于默认位置。</li>
     * <li><code>description</code>（可选）：对所上传资源的简短描述或备注。
     * 注意事项：</li>
     * <li>确保提供的 <code>minuteToken</code> 和 <code>credentialId</code> 的有效性。</li>
     * <li>当指定了 <code>directoryId</code> 时，请确认其属于调用者在当前数字员工环境下的可用个人目录之一。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将飞书妙记会议文件上传至当前数字员工的个人资源库。</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于将飞书妙记中的会议记录上传至指定数字员工的&quot;我的资源&quot;中。通过提供必要的参数，如飞书妙记的唯一标识符（<code>minuteToken</code>）和凭证 ID（<code>credentialId</code>），可以实现会议内容的迁移与保存。若未指定目标目录，则默认绑定到当前数字员工下的根目录。</p>
     * <ul>
     * <li><code>operatingObjectName</code>：执行操作的数字员工名称。</li>
     * <li><code>name</code>：上传后资源在系统内的显示名称。</li>
     * <li><code>minuteToken</code>：来自飞书妙记平台的会议唯一标识符。</li>
     * <li><code>credentialId</code>：关联到特定认证信息的ID，用于验证请求合法性。</li>
     * <li><code>directoryId</code>（可选）：指定要存放资源的目标个人目录ID；如果省略此字段，则资源将被自动放置于默认位置。</li>
     * <li><code>description</code>（可选）：对所上传资源的简短描述或备注。
     * 注意事项：</li>
     * <li>确保提供的 <code>minuteToken</code> 和 <code>credentialId</code> 的有效性。</li>
     * <li>当指定了 <code>directoryId</code> 时，请确认其属于调用者在当前数字员工环境下的可用个人目录之一。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将飞书妙记会议文件上传至当前数字员工的个人资源库。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将文件上传到指定数字员工的&quot;我的资源&quot;中。</li>
     * <li><code>source_type</code> 固定为 <code>FILE</code>，<code>scope</code> 固定为 <code>PERSONAL</code>，<code>platform</code> 固定为 <code>LOCAL</code>。</li>
     * <li>文件必须提供OSS持久化地址 (<code>filePath</code>)，其他如公开访问URL、原始文件名等信息可选提供。</li>
     * <li>如果不指定目标目录ID (<code>directoryId</code>)，则文件会被自动绑定到当前数字员工默认根目录下；如果指定，则需确保该目录属于调用者的个人目录。</li>
     * <li>支持通过多种认证方式（AK、BearerToken、APP）进行安全验证。</li>
     * <li>操作类型为写入(<code>write</code>)，并记录操作日志以供后续审计使用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将文件上传至当前数字员工的个人资源库。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将文件上传到指定数字员工的&quot;我的资源&quot;中。</li>
     * <li><code>source_type</code> 固定为 <code>FILE</code>，<code>scope</code> 固定为 <code>PERSONAL</code>，<code>platform</code> 固定为 <code>LOCAL</code>。</li>
     * <li>文件必须提供OSS持久化地址 (<code>filePath</code>)，其他如公开访问URL、原始文件名等信息可选提供。</li>
     * <li>如果不指定目标目录ID (<code>directoryId</code>)，则文件会被自动绑定到当前数字员工默认根目录下；如果指定，则需确保该目录属于调用者的个人目录。</li>
     * <li>支持通过多种认证方式（AK、BearerToken、APP）进行安全验证。</li>
     * <li>操作类型为写入(<code>write</code>)，并记录操作日志以供后续审计使用。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将文件上传至当前数字员工的个人资源库。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于向指定数字员工的个人资源中添加纯文本内容。</li>
     * <li><code>source_type</code> 固定为 <code>TEXT</code>，<code>scope</code> 固定为 <code>PERSONAL</code>。</li>
     * <li>如果不提供<code>directoryId</code>，则默认绑定到当前数字员工的根目录；若提供，则必须是调用者在该数字员工下的已有个人目录。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 只能来自鉴权身份信息，通过请求体传递这些参数将被忽略。</li>
     * <li>调用过程中会启动计量并生成相应的<code>billing_id</code>。</li>
     * <li>文本内容将被写入<code>unstructured_docs</code>，并生成初始资源记录。</li>
     * <li>任何校验或执行失败都将抛出<code>RobjectException</code>异常，并由全局中间件转换为POP错误码返回给调用方。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将纯文本内容上传至当前数字员工的个人资源库。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于向指定数字员工的个人资源中添加纯文本内容。</li>
     * <li><code>source_type</code> 固定为 <code>TEXT</code>，<code>scope</code> 固定为 <code>PERSONAL</code>。</li>
     * <li>如果不提供<code>directoryId</code>，则默认绑定到当前数字员工的根目录；若提供，则必须是调用者在该数字员工下的已有个人目录。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 只能来自鉴权身份信息，通过请求体传递这些参数将被忽略。</li>
     * <li>调用过程中会启动计量并生成相应的<code>billing_id</code>。</li>
     * <li>文本内容将被写入<code>unstructured_docs</code>，并生成初始资源记录。</li>
     * <li>任何校验或执行失败都将抛出<code>RobjectException</code>异常，并由全局中间件转换为POP错误码返回给调用方。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将纯文本内容上传至当前数字员工的个人资源库。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将离线会议的音频文件上传到指定数字员工的“我的资源”中。</li>
     * <li><code>source_type</code>固定为<code>VOICE_MEETING</code>，<code>scope</code>固定为<code>PERSONAL</code>，且<code>voice_meeting_type</code>固定为<code>OFFLINE</code>。</li>
     * <li>如果请求体中未提供<code>directoryId</code>，则资源将自动绑定到默认根目录；若提供了<code>directoryId</code>，则必须是当前用户在当前数字员工下的已有个人目录。</li>
     * <li>调用此接口会启动一个后台流程来处理音频文件转写，并返回新建资源的相关信息。</li>
     * <li>安全性方面，<code>tenant_id</code>和<code>user_id</code>仅从鉴权身份获取，即使请求体中包含这些字段也会被忽略。</li>
     * <li>任何校验或执行失败都会抛出<code>RobjectException</code>，并通过全局中间件转换为POP错误码。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将离线会议音频文件上传至当前数字员工的个人资源中。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将离线会议的音频文件上传到指定数字员工的“我的资源”中。</li>
     * <li><code>source_type</code>固定为<code>VOICE_MEETING</code>，<code>scope</code>固定为<code>PERSONAL</code>，且<code>voice_meeting_type</code>固定为<code>OFFLINE</code>。</li>
     * <li>如果请求体中未提供<code>directoryId</code>，则资源将自动绑定到默认根目录；若提供了<code>directoryId</code>，则必须是当前用户在当前数字员工下的已有个人目录。</li>
     * <li>调用此接口会启动一个后台流程来处理音频文件转写，并返回新建资源的相关信息。</li>
     * <li>安全性方面，<code>tenant_id</code>和<code>user_id</code>仅从鉴权身份获取，即使请求体中包含这些字段也会被忽略。</li>
     * <li>任何校验或执行失败都会抛出<code>RobjectException</code>，并通过全局中间件转换为POP错误码。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将离线会议音频文件上传至当前数字员工的个人资源中。</p>
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
     * <b>summary</b> : 
     * <p>创建定时任务</p>
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
     * <b>summary</b> : 
     * <p>创建定时任务</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于在指定租户下创建新的企业知识库目录。</li>
     * <li>可以通过设置 <code>parentId</code> 参数来指定新目录的父目录，如果不传则默认创建为根目录。</li>
     * <li><code>path</code> 参数可选，不提供时系统会根据父目录自动计算路径。</li>
     * <li>调用此接口需要具备相应的权限，并且支持多种认证方式包括 AK、BearerToken 和 APP 认证。</li>
     * <li>创建成功后返回新目录的相关信息，如目录 ID、名称等。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>使用租户和用户信息创建企业知识库目录。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于在指定租户下创建新的企业知识库目录。</li>
     * <li>可以通过设置 <code>parentId</code> 参数来指定新目录的父目录，如果不传则默认创建为根目录。</li>
     * <li><code>path</code> 参数可选，不提供时系统会根据父目录自动计算路径。</li>
     * <li>调用此接口需要具备相应的权限，并且支持多种认证方式包括 AK、BearerToken 和 APP 认证。</li>
     * <li>创建成功后返回新目录的相关信息，如目录 ID、名称等。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>使用租户和用户信息创建企业知识库目录。</p>
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
     * <p>OpenAPI 创建用户。
     *     业务编排：
     *     1. 解析 roleCodes → role_ids（系统角色枚举校验）
     *     2. 判断用户是否已存在（用于返回 isNewUser 标记）
     *     3. 调用 UserManagementService.add_tenant_member 完成创建/加入（密码由调用方强制传入 RSA 密文）
     *     4. 返回创建结果（含 isNewUser 标记）
     *     错误码：
     *     - ERR.User.DeactivatedInTenant: 用户在租户中已停用，请使用 updateUser 恢复
     *     - ERR.User.AlreadyInTenant: 用户已是租户活跃成员
     *     - ERR.User.DisplayNameDuplicateInTenant: 租户内显示名重复</p>
     * 
     * <b>summary</b> : 
     * <p>创建用户并加入租户</p>
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
     * <p>OpenAPI 创建用户。
     *     业务编排：
     *     1. 解析 roleCodes → role_ids（系统角色枚举校验）
     *     2. 判断用户是否已存在（用于返回 isNewUser 标记）
     *     3. 调用 UserManagementService.add_tenant_member 完成创建/加入（密码由调用方强制传入 RSA 密文）
     *     4. 返回创建结果（含 isNewUser 标记）
     *     错误码：
     *     - ERR.User.DeactivatedInTenant: 用户在租户中已停用，请使用 updateUser 恢复
     *     - ERR.User.AlreadyInTenant: 用户已是租户活跃成员
     *     - ERR.User.DisplayNameDuplicateInTenant: 租户内显示名重复</p>
     * 
     * <b>summary</b> : 
     * <p>创建用户并加入租户</p>
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
     * <b>summary</b> : 
     * <p>删除会话</p>
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
     * <b>summary</b> : 
     * <p>删除会话</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>tenantId</code> 仅来自鉴权身份；调用方传入会被忽略。</li>
     * <li><code>sourceId</code> 通过 body 传递，注册路径为扁平的 <code>/openapi/deleteSource</code>，不含 <code>{sourceId}</code> 路径模板；请勿以路径段形式追加资源 ID，网关按扁平 URI 精确路由，会回 <code>InvalidAction.NotFound</code>。</li>
     * <li>删除为不可逆操作，资源关联的解析结果与绑定关系会一并失效。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除当前租户内的指定资源（知识）。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>tenantId</code> 仅来自鉴权身份；调用方传入会被忽略。</li>
     * <li><code>sourceId</code> 通过 body 传递，注册路径为扁平的 <code>/openapi/deleteSource</code>，不含 <code>{sourceId}</code> 路径模板；请勿以路径段形式追加资源 ID，网关按扁平 URI 精确路由，会回 <code>InvalidAction.NotFound</code>。</li>
     * <li>删除为不可逆操作，资源关联的解析结果与绑定关系会一并失效。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>删除当前租户内的指定资源（知识）。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API允许用户删除特定的企业知识库目录。</li>
     * <li>用户可以通过设置<code>deleteMode</code>参数来选择不同的删除策略，包括拒绝删除（reject）、递归删除（recursive）或将目录移动到根目录（move_to_root）。</li>
     * <li>如果不提供<code>deleteMode</code>，默认行为是拒绝删除。</li>
     * <li>删除操作前会校验企业目录边界。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于删除指定的企业知识库目录，支持不同删除模式。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API允许用户删除特定的企业知识库目录。</li>
     * <li>用户可以通过设置<code>deleteMode</code>参数来选择不同的删除策略，包括拒绝删除（reject）、递归删除（recursive）或将目录移动到根目录（move_to_root）。</li>
     * <li>如果不提供<code>deleteMode</code>，默认行为是拒绝删除。</li>
     * <li>删除操作前会校验企业目录边界。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于删除指定的企业知识库目录，支持不同删除模式。</p>
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
     * <p>关闭用户的 INSTANCE Token。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 调用 disable_token（ACTIVE → INACTIVE）
     *     4. 返回 disabled=True
     *     幂等性：若当前无 ACTIVE Token，deactivate_all 影响 0 行，不报错。</p>
     * 
     * <b>summary</b> : 
     * <p>关闭 API Token</p>
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
     * <p>关闭用户的 INSTANCE Token。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 调用 disable_token（ACTIVE → INACTIVE）
     *     4. 返回 disabled=True
     *     幂等性：若当前无 ACTIVE Token，deactivate_all 影响 0 行，不报错。</p>
     * 
     * <b>summary</b> : 
     * <p>关闭 API Token</p>
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
     * <p>开启用户的 INSTANCE Token（幂等）。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 调用 enable_token：
     *        - 已有 ACTIVE → 幂等返回（仅脱敏值，不重复下发明文）
     *        - 有 INACTIVE → 重新激活（返回明文）
     *        - 都没有 → 新建（返回明文）
     *     安全约束：Token 明文仅在首次开启时返回一次，后续幂等调用不再下发明文。</p>
     * 
     * <b>summary</b> : 
     * <p>开启 API Token</p>
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
     * <p>开启用户的 INSTANCE Token（幂等）。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 调用 enable_token：
     *        - 已有 ACTIVE → 幂等返回（仅脱敏值，不重复下发明文）
     *        - 有 INACTIVE → 重新激活（返回明文）
     *        - 都没有 → 新建（返回明文）
     *     安全约束：Token 明文仅在首次开启时返回一次，后续幂等调用不再下发明文。</p>
     * 
     * <b>summary</b> : 
     * <p>开启 API Token</p>
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
     * <b>summary</b> : 
     * <p>获取会话详情</p>
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
     * <b>summary</b> : 
     * <p>获取会话详情</p>
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
     * <p>读取 active schema_content，并按 Token 用户的语义资源 READ 权限安全裁剪。</p>
     * 
     * <b>summary</b> : 
     * <p>获取当前用户可读的 active Graph Schema</p>
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
     * <p>读取 active schema_content，并按 Token 用户的语义资源 READ 权限安全裁剪。</p>
     * 
     * <b>summary</b> : 
     * <p>获取当前用户可读的 active Graph Schema</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于查询指定租户下最新创建的标准包实例的过期时间。</li>
     * <li>如果未找到相关标准包实例，<code>found</code> 字段将返回 <code>False</code>。</li>
     * <li>支持通过 <code>tenantId</code> 参数指定查询的租户ID，默认使用调用方的租户ID。</li>
     * <li>请求方法为 POST，且需要通过 HTTPS 协议进行调用。</li>
     * <li>需要提供有效的认证信息（如 AK、BearerToken 或 APP）以完成请求。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询租户最新创建的标准包实例的过期时间。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于查询指定租户下最新创建的标准包实例的过期时间。</li>
     * <li>如果未找到相关标准包实例，<code>found</code> 字段将返回 <code>False</code>。</li>
     * <li>支持通过 <code>tenantId</code> 参数指定查询的租户ID，默认使用调用方的租户ID。</li>
     * <li>请求方法为 POST，且需要通过 HTTPS 协议进行调用。</li>
     * <li>需要提供有效的认证信息（如 AK、BearerToken 或 APP）以完成请求。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询租户最新创建的标准包实例的过期时间。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于获取企业知识库下特定知识的详情。</li>
     * <li>调用此接口需要具备 <code>DEVELOPMENT_KB_VIEW</code> 功能权限。</li>
     * <li>知识详情包括但不限于知识类型、名称、描述等。</li>
     * <li>请求时必须提供 <code>sourceId</code> 参数，标识要查询的知识。</li>
     * <li><code>tenantId</code> 是可选参数，默认使用调用方的租户ID。</li>
     * <li>支持通过 <code>AK</code>、<code>BearerToken</code> 或 <code>APP</code> 方式进行鉴权。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 只能来自鉴权身份。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定知识在企业知识库中的详细信息。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于获取企业知识库下特定知识的详情。</li>
     * <li>调用此接口需要具备 <code>DEVELOPMENT_KB_VIEW</code> 功能权限。</li>
     * <li>知识详情包括但不限于知识类型、名称、描述等。</li>
     * <li>请求时必须提供 <code>sourceId</code> 参数，标识要查询的知识。</li>
     * <li><code>tenantId</code> 是可选参数，默认使用调用方的租户ID。</li>
     * <li>支持通过 <code>AK</code>、<code>BearerToken</code> 或 <code>APP</code> 方式进行鉴权。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 只能来自鉴权身份。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定知识在企业知识库中的详细信息。</p>
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
     * <b>summary</b> : 
     * <p>获取定时任务执行详情</p>
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
     * <b>summary</b> : 
     * <p>获取定时任务执行详情</p>
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
     * <b>summary</b> : 
     * <p>获取定时任务执行记录</p>
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
     * <b>summary</b> : 
     * <p>获取定时任务执行记录</p>
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
     * <b>summary</b> : 
     * <p>获取定时任务理解详情</p>
     * 
     * @param tmpReq GetScheduledTaskUnderstandDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduledTaskUnderstandDetailResponse
     */
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
     * <b>summary</b> : 
     * <p>获取定时任务理解详情</p>
     * 
     * @param request GetScheduledTaskUnderstandDetailRequest
     * @return GetScheduledTaskUnderstandDetailResponse
     */
    public GetScheduledTaskUnderstandDetailResponse getScheduledTaskUnderstandDetail(GetScheduledTaskUnderstandDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getScheduledTaskUnderstandDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>请求说明</h2>
     * <p>根据 SkillCode 或 SkillName 查询技能详情，包括元数据、入参 Schema、SKILL.md 摘要等。</p>
     * <ul>
     * <li><strong>TenantId</strong>：可选公共参数，由网关透传到后端 Header；不传时使用当前调用方的默认租户。</li>
     * <li><strong>SkillCode</strong>：与 SkillName 二选一；同时传入时 SkillCode 优先。</li>
     * <li><strong>SkillName</strong>：与 SkillCode 二选一；租户内不唯一时返回 <code>ERR.SkillHub.SkillNameAmbiguous</code>。</li>
     * <li><strong>ViewMode</strong>：可选，<code>draft</code>（草稿/编辑视角）或 <code>published</code>（已发布视角，默认）。</li>
     * <li><strong>IncludeSkillFiles</strong>：可选，是否返回完整技能文件树（SKILL.md / scripts / templates），默认 <code>false</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>获取技能详情。</p>
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
     * <h2>请求说明</h2>
     * <p>根据 SkillCode 或 SkillName 查询技能详情，包括元数据、入参 Schema、SKILL.md 摘要等。</p>
     * <ul>
     * <li><strong>TenantId</strong>：可选公共参数，由网关透传到后端 Header；不传时使用当前调用方的默认租户。</li>
     * <li><strong>SkillCode</strong>：与 SkillName 二选一；同时传入时 SkillCode 优先。</li>
     * <li><strong>SkillName</strong>：与 SkillCode 二选一；租户内不唯一时返回 <code>ERR.SkillHub.SkillNameAmbiguous</code>。</li>
     * <li><strong>ViewMode</strong>：可选，<code>draft</code>（草稿/编辑视角）或 <code>published</code>（已发布视角，默认）。</li>
     * <li><strong>IncludeSkillFiles</strong>：可选，是否返回完整技能文件树（SKILL.md / scripts / templates），默认 <code>false</code>。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>获取技能详情。</p>
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
     * <h2>请求说明</h2>
     * <p>通过 <code>RunId</code> 查询异步任务的当前状态与结果。</p>
     * <ul>
     * <li><strong>状态机</strong>：Running（PENDING/RUNNING）→ Succeeded / Failed / Cancelled</li>
     * <li><strong>TenantId</strong>：可选公共参数，由网关透传；后端会校验 RunId 必须属于当前租户，否则统一返回 <code>ERR.SkillHub.RunNotFound</code>（避免泄漏存在性）。</li>
     * <li><strong>IncludeLogs</strong>：可选，是否返回执行日志，默认 <code>false</code>。
     * 执行成功时 <code>Result.Content[]</code> 为 MCP 风格 Content 块数组（Text / File / Image）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询技能执行结果。</p>
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
     * <h2>请求说明</h2>
     * <p>通过 <code>RunId</code> 查询异步任务的当前状态与结果。</p>
     * <ul>
     * <li><strong>状态机</strong>：Running（PENDING/RUNNING）→ Succeeded / Failed / Cancelled</li>
     * <li><strong>TenantId</strong>：可选公共参数，由网关透传；后端会校验 RunId 必须属于当前租户，否则统一返回 <code>ERR.SkillHub.RunNotFound</code>（避免泄漏存在性）。</li>
     * <li><strong>IncludeLogs</strong>：可选，是否返回执行日志，默认 <code>false</code>。
     * 执行成功时 <code>Result.Content[]</code> 为 MCP 风格 Content 块数组（Text / File / Image）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询技能执行结果。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>tenant_id</code> 仅来自鉴权身份；调用方在 body 中传入会被忽略。</li>
     * <li>出参不暴露 <code>creator</code> / <code>modifier</code> 等审计字段；<code>unstructured_docs[ ].content</code> 默认不返回，以避免大体积响应。</li>
     * <li>通过设置 <code>includeDetails</code> 参数为 <code>True</code> 可以获取包括 <code>settings</code>, <code>notes</code>, <code>structuredTables</code>, 和 <code>unstructuredDocs</code> 在内的更多细节信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定资源（知识）的详细信息，支持按需返回大体积明细字段。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><code>tenant_id</code> 仅来自鉴权身份；调用方在 body 中传入会被忽略。</li>
     * <li>出参不暴露 <code>creator</code> / <code>modifier</code> 等审计字段；<code>unstructured_docs[ ].content</code> 默认不返回，以避免大体积响应。</li>
     * <li>通过设置 <code>includeDetails</code> 参数为 <code>True</code> 可以获取包括 <code>settings</code>, <code>notes</code>, <code>structuredTables</code>, 和 <code>unstructuredDocs</code> 在内的更多细节信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定资源（知识）的详细信息，支持按需返回大体积明细字段。</p>
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
     * <h2>请求说明</h2>
     * <p>该API允许调用方根据提供的文件名等信息，获取一个可用于直接上传文件至阿里云OSS（对象存储服务）的签名URL。通过此URL，用户可以将文件直接上传至指定的OSS位置而无需经过中间服务器转发，从而提高效率和安全性。</p>
     * <ul>
     * <li><strong>安全约束</strong>：<code>tenant_id</code>/<code>user_id</code>仅来自鉴权身份，即使在请求体中提供也会被忽略。</li>
     * <li><strong>默认值</strong>：如果未指定<code>expires</code>参数，则默认过期时间为3600秒（即1小时）。</li>
     * <li><strong>Content-Type</strong>：如果不提供<code>contentType</code>，系统会尝试自动推断文件类型。</li>
     * <li><strong>归属范围</strong>：通过<code>scope</code>参数定义数据源是属于个人还是企业知识库，默认情况下可能不需要设置。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>生成用于直接上传文件到OSS的签名URL。</p>
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
     * <h2>请求说明</h2>
     * <p>该API允许调用方根据提供的文件名等信息，获取一个可用于直接上传文件至阿里云OSS（对象存储服务）的签名URL。通过此URL，用户可以将文件直接上传至指定的OSS位置而无需经过中间服务器转发，从而提高效率和安全性。</p>
     * <ul>
     * <li><strong>安全约束</strong>：<code>tenant_id</code>/<code>user_id</code>仅来自鉴权身份，即使在请求体中提供也会被忽略。</li>
     * <li><strong>默认值</strong>：如果未指定<code>expires</code>参数，则默认过期时间为3600秒（即1小时）。</li>
     * <li><strong>Content-Type</strong>：如果不提供<code>contentType</code>，系统会尝试自动推断文件类型。</li>
     * <li><strong>归属范围</strong>：通过<code>scope</code>参数定义数据源是属于个人还是企业知识库，默认情况下可能不需要设置。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>生成用于直接上传文件到OSS的签名URL。</p>
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
     * <p>查询用户的 INSTANCE Token 状态。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 查询 ACTIVE INSTANCE Token
     *     4. 存在 → 返回 enabled=True + 脱敏值 + 创建时间
     *     5. 不存在 → 返回 enabled=False</p>
     * 
     * <b>summary</b> : 
     * <p>查询用户的 Token 状态</p>
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
     * <p>查询用户的 INSTANCE Token 状态。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 查询 ACTIVE INSTANCE Token
     *     4. 存在 → 返回 enabled=True + 脱敏值 + 创建时间
     *     5. 不存在 → 返回 enabled=False</p>
     * 
     * <b>summary</b> : 
     * <p>查询用户的 Token 状态</p>
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
     * <p>OpenAPI 查询用户详情。
     *     业务编排：
     *     1. 按 wnUserId 或 accountId 定位用户
     *     2. 查询用户在当前租户的映射信息（状态、加入时间、最后登录）
     *     3. 查询用户在当前租户的角色列表
     *     4. 查询用户在当前租户的用户组列表
     *     5. 组装响应
     *     错误码：
     *     - ERR.User.NotFound: 用户不存在
     *     - ERR.User.NotInTenant: 用户不在当前租户下</p>
     * 
     * <b>summary</b> : 
     * <p>查询用户详情</p>
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
     * <p>OpenAPI 查询用户详情。
     *     业务编排：
     *     1. 按 wnUserId 或 accountId 定位用户
     *     2. 查询用户在当前租户的映射信息（状态、加入时间、最后登录）
     *     3. 查询用户在当前租户的角色列表
     *     4. 查询用户在当前租户的用户组列表
     *     5. 组装响应
     *     错误码：
     *     - ERR.User.NotFound: 用户不存在
     *     - ERR.User.NotInTenant: 用户不在当前租户下</p>
     * 
     * <b>summary</b> : 
     * <p>查询用户详情</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取当前登录用户的信用使用详情，包括信用限额、已消耗的信用额度以及剩余信用额度。</li>
     * <li>数据来源于Redis实时缓存，确保了信息的即时性。</li>
     * <li>支持通过租户ID来指定查询特定租户下的用户信用使用情况，默认情况下将使用调用方的默认租户。</li>
     * <li>请求时可选择提供<code>RequestId</code>作为请求标识符，但这不是必需的。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询当前登录用户的实时信用消耗、限额及剩余情况。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取当前登录用户的信用使用详情，包括信用限额、已消耗的信用额度以及剩余信用额度。</li>
     * <li>数据来源于Redis实时缓存，确保了信息的即时性。</li>
     * <li>支持通过租户ID来指定查询特定租户下的用户信用使用情况，默认情况下将使用调用方的默认租户。</li>
     * <li>请求时可选择提供<code>RequestId</code>作为请求标识符，但这不是必需的。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询当前登录用户的实时信用消耗、限额及剩余情况。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于返回当前鉴权用户的详细信息。</li>
     * <li>当租户信息失效时，将返回对应的错误信息。</li>
     * <li><code>tenantId</code>为可选参数，若未提供，则使用调用方默认的租户ID。</li>
     * <li>支持多种认证方式：AK、BearerToken和APP认证。</li>
     * <li>返回的数据中包含了用户的个人资料（如用户名、头像链接）、角色偏好设置以及所属的所有租户详情。</li>
     * <li>特别注意，如果当前登录的租户是系统租户（即<code>tenantId=10000</code>），则会在响应中明确标识出来。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过OpenAPI获取鉴权用户的完整信息，包括基本信息、租户列表等。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于返回当前鉴权用户的详细信息。</li>
     * <li>当租户信息失效时，将返回对应的错误信息。</li>
     * <li><code>tenantId</code>为可选参数，若未提供，则使用调用方默认的租户ID。</li>
     * <li>支持多种认证方式：AK、BearerToken和APP认证。</li>
     * <li>返回的数据中包含了用户的个人资料（如用户名、头像链接）、角色偏好设置以及所属的所有租户详情。</li>
     * <li>特别注意，如果当前登录的租户是系统租户（即<code>tenantId=10000</code>），则会在响应中明确标识出来。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过OpenAPI获取鉴权用户的完整信息，包括基本信息、租户列表等。</p>
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
     * <p>授权用户或用户组使用指定数字员工。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 请求体互斥校验：userIds / userGroupIds 二选一
     *     3. 委托 AgentAuthorizationAuthorizedService.grant_authorization 执行
     *     4. 前置校验：MANAGE 权限 + agent 存在性（由 AuthorizedService 层执行，先鉴权后暴露存在性）
     *     5. 已存在的授权记录会被更新（expire_date / permissions）</p>
     * 
     * <b>summary</b> : 
     * <p>授权用户/用户组使用数字员工</p>
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
     * <p>授权用户或用户组使用指定数字员工。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 请求体互斥校验：userIds / userGroupIds 二选一
     *     3. 委托 AgentAuthorizationAuthorizedService.grant_authorization 执行
     *     4. 前置校验：MANAGE 权限 + agent 存在性（由 AuthorizedService 层执行，先鉴权后暴露存在性）
     *     5. 已存在的授权记录会被更新（expire_date / permissions）</p>
     * 
     * <b>summary</b> : 
     * <p>授权用户/用户组使用数字员工</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 支持两种模式：当 <code>directoryId</code> 为空或为 &#39;root&#39; 时，返回知识库的顶层列表；当 <code>directoryId</code> 有具体值时，则进行下钻操作，返回指定目录下的子目录和资源。</li>
     * <li><code>tenantId</code> 作为公共参数，若未提供则默认使用调用方的租户 ID。</li>
     * <li>在下钻模式下（即 <code>directoryId</code> 非空），可以通过 <code>sourceTypes</code> 参数来过滤特定类型的资源。</li>
     * <li>排序字段 (<code>sortField</code>) 和排序方向 (<code>sortOrder</code>) 可以自定义，但非法值将被重置为默认设置。</li>
     * <li>搜索功能仅在获取顶层列表时有效，并且只支持模糊匹配名称或描述。</li>
     * <li>安全性方面，<code>tenant_id</code> 严格从鉴权身份中获取，不允许通过请求体传递。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于查询或下钻查看租户的企业知识库列表。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 支持两种模式：当 <code>directoryId</code> 为空或为 &#39;root&#39; 时，返回知识库的顶层列表；当 <code>directoryId</code> 有具体值时，则进行下钻操作，返回指定目录下的子目录和资源。</li>
     * <li><code>tenantId</code> 作为公共参数，若未提供则默认使用调用方的租户 ID。</li>
     * <li>在下钻模式下（即 <code>directoryId</code> 非空），可以通过 <code>sourceTypes</code> 参数来过滤特定类型的资源。</li>
     * <li>排序字段 (<code>sortField</code>) 和排序方向 (<code>sortOrder</code>) 可以自定义，但非法值将被重置为默认设置。</li>
     * <li>搜索功能仅在获取顶层列表时有效，并且只支持模糊匹配名称或描述。</li>
     * <li>安全性方面，<code>tenant_id</code> 严格从鉴权身份中获取，不允许通过请求体传递。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于查询或下钻查看租户的企业知识库列表。</p>
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
     * <p>查询租户下全部数字员工列表（含停用）。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.list_agents 完成权限校验（APPLICATION_AGENT_VIEW）
     *     3. 返回租户全量数字员工的富字段（operatingObjectName / displayName / authMode / isActive）
     *     4. 系统级 Token 通过 ctx.skip_permission 自动放行
     *     与 listAuthorizedAgents 区别：本接口返回租户全量（含停用、不做授权过滤），
     *     并携带 displayName / isActive 等富字段，供管理端展示。</p>
     * 
     * <b>summary</b> : 
     * <p>查询租户全量数字员工列表</p>
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
     * <p>查询租户下全部数字员工列表（含停用）。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.list_agents 完成权限校验（APPLICATION_AGENT_VIEW）
     *     3. 返回租户全量数字员工的富字段（operatingObjectName / displayName / authMode / isActive）
     *     4. 系统级 Token 通过 ctx.skip_permission 自动放行
     *     与 listAuthorizedAgents 区别：本接口返回租户全量（含停用、不做授权过滤），
     *     并携带 displayName / isActive 等富字段，供管理端展示。</p>
     * 
     * <b>summary</b> : 
     * <p>查询租户全量数字员工列表</p>
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
     * <p>查询当前调用方（或指定目标用户）拥有指定权限（USE/MANAGE）的数字员工名称列表。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.list_authorized_agents 执行查询
     *     3. skip_permission=True 时返回租户全量活跃 agent
     *     4. 普通用户根据授权记录 + auth_mode 过滤
     *     5. 传入 targetUserId（代查他人）时需 APPLICATION_AGENT_VIEW 门控，查询限定本租户；
     *        目标用户非本租户成员时抛 USER_NOT_IN_TENANT（不静默返回空列表）</p>
     * 
     * <b>summary</b> : 
     * <p>查询调用方有指定权限的数字员工名称列表</p>
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
     * <p>查询当前调用方（或指定目标用户）拥有指定权限（USE/MANAGE）的数字员工名称列表。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.list_authorized_agents 执行查询
     *     3. skip_permission=True 时返回租户全量活跃 agent
     *     4. 普通用户根据授权记录 + auth_mode 过滤
     *     5. 传入 targetUserId（代查他人）时需 APPLICATION_AGENT_VIEW 门控，查询限定本租户；
     *        目标用户非本租户成员时抛 USER_NOT_IN_TENANT（不静默返回空列表）</p>
     * 
     * <b>summary</b> : 
     * <p>查询调用方有指定权限的数字员工名称列表</p>
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
     * <p>查询某数字员工已授权的用户/用户组列表。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.list_authorized_users 执行查询
     *     3. 权限校验由 AuthorizedService 层 @require_permission(APPLICATION_AGENT_VIEW) 完成
     *     4. auth_mode=ALL_USERS 时仅展示有 MANAGE 权限的记录</p>
     * 
     * <b>summary</b> : 
     * <p>查询数字员工已授权的用户/用户组列表</p>
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
     * <p>查询某数字员工已授权的用户/用户组列表。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.list_authorized_users 执行查询
     *     3. 权限校验由 AuthorizedService 层 @require_permission(APPLICATION_AGENT_VIEW) 完成
     *     4. auth_mode=ALL_USERS 时仅展示有 MANAGE 权限的记录</p>
     * 
     * <b>summary</b> : 
     * <p>查询数字员工已授权的用户/用户组列表</p>
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
     * <p>枚举当前租户下所有可用的组织同步配置。
     *     返回统一格式的 configs 列表，涵盖四种平台类型：
     *     - <strong>wecom</strong>：从 SsoProviderRegistry 获取活跃的企微 SSO 配置
     *     - <strong>saml</strong>：从 SsoProviderRegistry 获取活跃的 SAML SSO 配置，corpId 取 idpEntityId
     *     - <strong>oauth2</strong>：从 SsoProviderRegistry 获取活跃的 OAuth2 SSO 配置，corpId 取 clientId
     *     - <strong>custom</strong>：从数据库查询该租户已注册的纯自定义组织
     *     客户端根据返回的 platformType 区分处理逻辑，corpId 为后续同步接口的必传参数。</p>
     * 
     * <b>summary</b> : 
     * <p>枚举可用的组织同步配置</p>
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
     * <p>枚举当前租户下所有可用的组织同步配置。
     *     返回统一格式的 configs 列表，涵盖四种平台类型：
     *     - <strong>wecom</strong>：从 SsoProviderRegistry 获取活跃的企微 SSO 配置
     *     - <strong>saml</strong>：从 SsoProviderRegistry 获取活跃的 SAML SSO 配置，corpId 取 idpEntityId
     *     - <strong>oauth2</strong>：从 SsoProviderRegistry 获取活跃的 OAuth2 SSO 配置，corpId 取 clientId
     *     - <strong>custom</strong>：从数据库查询该租户已注册的纯自定义组织
     *     客户端根据返回的 platformType 区分处理逻辑，corpId 为后续同步接口的必传参数。</p>
     * 
     * <b>summary</b> : 
     * <p>枚举可用的组织同步配置</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询指定条件下的账单列表。</li>
     * <li>支持按租户、用户、操作类型、状态、时间范围、业务来源等条件进行筛选。</li>
     * <li>分页返回账单数据，默认每页显示20条记录。</li>
     * <li>可选择是否过滤掉credit消耗为0的账单，默认过滤。</li>
     * <li>请求时需提供必要的认证信息（如AK、BearerToken或APP认证）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过OpenAPI查询并筛选账单列表，支持多种条件过滤。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于查询指定条件下的账单列表。</li>
     * <li>支持按租户、用户、操作类型、状态、时间范围、业务来源等条件进行筛选。</li>
     * <li>分页返回账单数据，默认每页显示20条记录。</li>
     * <li>可选择是否过滤掉credit消耗为0的账单，默认过滤。</li>
     * <li>请求时需提供必要的认证信息（如AK、BearerToken或APP认证）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过OpenAPI查询并筛选账单列表，支持多种条件过滤。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 支持通过多种参数进行过滤和排序，包括租户 ID、分页大小、分页令牌、关键词搜索、数字员工名称以及更新时间区间。</li>
     * <li>默认情况下，结果将按照 <code>UpdatedAt</code> 字段降序排列。</li>
     * <li>如果提供了无效的 <code>NextToken</code> 或者 <code>PageSize</code> 超出了允许范围（1-100），API 将返回 400 错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>按创建时间倒序列出当前用户的聊天会话。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 支持通过多种参数进行过滤和排序，包括租户 ID、分页大小、分页令牌、关键词搜索、数字员工名称以及更新时间区间。</li>
     * <li>默认情况下，结果将按照 <code>UpdatedAt</code> 字段降序排列。</li>
     * <li>如果提供了无效的 <code>NextToken</code> 或者 <code>PageSize</code> 超出了允许范围（1-100），API 将返回 400 错误。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>按创建时间倒序列出当前用户的聊天会话。</p>
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
     * <p>列出身份租户下的已发布图谱。
     *     CLI 映射为 <code>winnexo graph list</code>；<code>tenantId</code> 是必传公共参数，不进入请求体。
     *     返回的 <code>graphName</code> 可直接用于 <code>querySemanticKnowledge</code>。该查询与现有前台
     *     图谱列表保持一致，不做数字员工权限过滤；具体语义查询仍会校验 agent USE 权限。
     *     数据库异常直接进入统一 5xx 错误处理，不会伪装为成功空列表。</p>
     * 
     * <b>summary</b> : 
     * <p>查询租户可用于语义查询的图谱列表</p>
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
     * <p>列出身份租户下的已发布图谱。
     *     CLI 映射为 <code>winnexo graph list</code>；<code>tenantId</code> 是必传公共参数，不进入请求体。
     *     返回的 <code>graphName</code> 可直接用于 <code>querySemanticKnowledge</code>。该查询与现有前台
     *     图谱列表保持一致，不做数字员工权限过滤；具体语义查询仍会校验 agent USE 权限。
     *     数据库异常直接进入统一 5xx 错误处理，不会伪装为成功空列表。</p>
     * 
     * <b>summary</b> : 
     * <p>查询租户可用于语义查询的图谱列表</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于获取企业知识库的分类列表（子目录树），需要具备知识库查看权限。</li>
     * <li>如果未提供 <code>directoryId</code> 参数，则返回企业知识库根目录下的所有分类树；如果提供了 <code>directoryId</code>，则以该目录为根返回其子目录树。</li>
     * <li>支持通过 <code>sortField</code> 和 <code>sortOrder</code> 参数对结果进行排序，默认按照创建时间降序排列。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 仅来自鉴权身份，并且调用者必须拥有 <code>DEVELOPMENT_KB_VIEW</code> 功能权限。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询企业知识库的分类目录树，支持按指定字段排序。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于获取企业知识库的分类列表（子目录树），需要具备知识库查看权限。</li>
     * <li>如果未提供 <code>directoryId</code> 参数，则返回企业知识库根目录下的所有分类树；如果提供了 <code>directoryId</code>，则以该目录为根返回其子目录树。</li>
     * <li>支持通过 <code>sortField</code> 和 <code>sortOrder</code> 参数对结果进行排序，默认按照创建时间降序排列。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 仅来自鉴权身份，并且调用者必须拥有 <code>DEVELOPMENT_KB_VIEW</code> 功能权限。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询企业知识库的分类目录树，支持按指定字段排序。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于查询当前登录用户的产出列表。</li>
     * <li><code>tenantId</code>作为公共参数，缺省时使用调用方默认租户。</li>
     * <li>支持通过<code>operatingObjectName</code>、<code>itemType</code>、<code>keyword</code>等参数进行过滤查询。</li>
     * <li>可以设置<code>sharedOnly</code>为<code>true</code>来仅展示开启分享的产出。</li>
     * <li>分页信息通过<code>page</code>（页码）和<code>pageSize</code>（每页数量）控制，默认从第1页开始，每页显示20条记录。</li>
     * <li>默认按更新时间倒序排列。</li>
     * <li>调用者在请求体中传入的<code>tenant_id</code>或<code>user_id</code>将被忽略，这些信息仅来自鉴权身份。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询当前用户的产出列表，支持按条件过滤和分页。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于查询当前登录用户的产出列表。</li>
     * <li><code>tenantId</code>作为公共参数，缺省时使用调用方默认租户。</li>
     * <li>支持通过<code>operatingObjectName</code>、<code>itemType</code>、<code>keyword</code>等参数进行过滤查询。</li>
     * <li>可以设置<code>sharedOnly</code>为<code>true</code>来仅展示开启分享的产出。</li>
     * <li>分页信息通过<code>page</code>（页码）和<code>pageSize</code>（每页数量）控制，默认从第1页开始，每页显示20条记录。</li>
     * <li>默认按更新时间倒序排列。</li>
     * <li>调用者在请求体中传入的<code>tenant_id</code>或<code>user_id</code>将被忽略，这些信息仅来自鉴权身份。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询当前用户的产出列表，支持按条件过滤和分页。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于下钻查询&quot;我的资源&quot;目录下的子目录与资源。</li>
     * <li>当 <code>directoryId</code> 设置为 &#39;root&#39; 时，服务将自动解析并返回当前数字员工默认根目录下的内容；若提供具体的目录 ID，则返回该目录下的子目录和资源。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 只能来自鉴权身份信息，调用方在请求体中提供的这些字段将被忽略。</li>
     * <li>支持通过 <code>sourceTypes</code> 参数筛选特定类型的资源，当此参数有值时，仅返回符合类型条件的资源而不包含子目录。</li>
     * <li>排序支持按名称 (<code>name</code>)、创建时间 (<code>gmt_create</code>) 或修改时间 (<code>gmt_modified</code>) 进行升序或降序排列。</li>
     * <li>分页功能允许用户自定义每页显示的数量（最大100）及当前查看的页码。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定数字员工资源目录下的子目录与资源。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 用于下钻查询&quot;我的资源&quot;目录下的子目录与资源。</li>
     * <li>当 <code>directoryId</code> 设置为 &#39;root&#39; 时，服务将自动解析并返回当前数字员工默认根目录下的内容；若提供具体的目录 ID，则返回该目录下的子目录和资源。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 只能来自鉴权身份信息，调用方在请求体中提供的这些字段将被忽略。</li>
     * <li>支持通过 <code>sourceTypes</code> 参数筛选特定类型的资源，当此参数有值时，仅返回符合类型条件的资源而不包含子目录。</li>
     * <li>排序支持按名称 (<code>name</code>)、创建时间 (<code>gmt_create</code>) 或修改时间 (<code>gmt_modified</code>) 进行升序或降序排列。</li>
     * <li>分页功能允许用户自定义每页显示的数量（最大100）及当前查看的页码。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询指定数字员工资源目录下的子目录与资源。</p>
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
     * <p>查询系统内置角色列表。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 UserManagementAuthorizedService.list_system_roles 完成权限校验（PLATFORM_USER_VIEW）
     *     3. 按请求 Accept-Language 渲染角色名称与说明
     *     4. 返回固定的 7 个系统内置角色
     *     返回字段 roleCode 可直接用于 createUser / updateUser 的 roleCodes 参数。</p>
     * 
     * <b>summary</b> : 
     * <p>查询系统内置角色列表</p>
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
     * <p>查询系统内置角色列表。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 UserManagementAuthorizedService.list_system_roles 完成权限校验（PLATFORM_USER_VIEW）
     *     3. 按请求 Accept-Language 渲染角色名称与说明
     *     4. 返回固定的 7 个系统内置角色
     *     返回字段 roleCode 可直接用于 createUser / updateUser 的 roleCodes 参数。</p>
     * 
     * <b>summary</b> : 
     * <p>查询系统内置角色列表</p>
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
     * <b>summary</b> : 
     * <p>获取定时任务列表</p>
     * 
     * @param request ListScheduledTasksRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScheduledTasksResponse
     */
    public ListScheduledTasksResponse listScheduledTasksWithOptions(ListScheduledTasksRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collaborationGroupId)) {
            query.put("collaborationGroupId", request.collaborationGroupId);
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
     * <b>summary</b> : 
     * <p>获取定时任务列表</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于获取当前租户下所有可见的技能列表。支持按数字员工绑定关系、技能来源、标签、关键词等条件进行过滤，并支持分页。</p>
     * <h3>入参</h3>
     * <ul>
     * <li><strong>TenantId</strong>：可选，公共参数，由网关透传到后端 Header；不传时使用当前调用方所属的默认租户。</li>
     * <li><strong>FilterType</strong>：可选，技能筛选维度。可选值：<code>ALL</code>(全部已发布)、<code>BUILTIN</code>(内置已发布)、<code>CUSTOM</code>(自定义已发布)、<code>DRAFT</code>(草稿箱，含未发布修改的已发布技能)。默认 <code>ALL</code>。</li>
     * <li><strong>Tags</strong>：可选，按标签过滤，数组任一命中即匹配。</li>
     * <li><strong>Keyword</strong>：可选，按技能名称或描述模糊匹配。</li>
     * <li><strong>Page</strong>：可选，页码，最小 1，默认 1。</li>
     * <li><strong>PageSize</strong>：可选，每页数量，范围 1~100，默认 20。</li>
     * <li><strong>OperatingObjectName</strong>：可选，数字员工名称，传入时按绑定关系过滤；必须配合 <code>BindStatus</code> 使用。</li>
     * <li><strong>BindStatus</strong>：可选，绑定状态。可选值：<code>BOUND</code>(已绑定)、<code>UNBOUND</code>(未绑定的全局技能)。</li>
     * </ul>
     * <h3>出参</h3>
     * <p>响应包含技能列表 <code>items</code>、总数 <code>total</code>、当前页 <code>page</code> 与每页数量 <code>pageSize</code>。</p>
     * 
     * <b>summary</b> : 
     * <p>列出当前租户可见的技能。</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于获取当前租户下所有可见的技能列表。支持按数字员工绑定关系、技能来源、标签、关键词等条件进行过滤，并支持分页。</p>
     * <h3>入参</h3>
     * <ul>
     * <li><strong>TenantId</strong>：可选，公共参数，由网关透传到后端 Header；不传时使用当前调用方所属的默认租户。</li>
     * <li><strong>FilterType</strong>：可选，技能筛选维度。可选值：<code>ALL</code>(全部已发布)、<code>BUILTIN</code>(内置已发布)、<code>CUSTOM</code>(自定义已发布)、<code>DRAFT</code>(草稿箱，含未发布修改的已发布技能)。默认 <code>ALL</code>。</li>
     * <li><strong>Tags</strong>：可选，按标签过滤，数组任一命中即匹配。</li>
     * <li><strong>Keyword</strong>：可选，按技能名称或描述模糊匹配。</li>
     * <li><strong>Page</strong>：可选，页码，最小 1，默认 1。</li>
     * <li><strong>PageSize</strong>：可选，每页数量，范围 1~100，默认 20。</li>
     * <li><strong>OperatingObjectName</strong>：可选，数字员工名称，传入时按绑定关系过滤；必须配合 <code>BindStatus</code> 使用。</li>
     * <li><strong>BindStatus</strong>：可选，绑定状态。可选值：<code>BOUND</code>(已绑定)、<code>UNBOUND</code>(未绑定的全局技能)。</li>
     * </ul>
     * <h3>出参</h3>
     * <p>响应包含技能列表 <code>items</code>、总数 <code>total</code>、当前页 <code>page</code> 与每页数量 <code>pageSize</code>。</p>
     * 
     * <b>summary</b> : 
     * <p>列出当前租户可见的技能。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于分页查询企业知识库中的目录内容和资源。</li>
     * <li>支持通过多种参数进行过滤和排序，如<code>directoryId</code>、<code>page</code>、<code>pageSize</code>、<code>sortField</code>、<code>sortOrder</code>等。</li>
     * <li><code>sourceTypes</code>参数允许用户根据资源类型进行过滤，多个类型使用逗号分隔。</li>
     * <li>当不传或传入<code>root</code>作为<code>directoryId</code>时，默认查询知识库根目录列表。</li>
     * <li>默认的排序字段为<code>name</code>，默认排序方向为升序（<code>asc</code>）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>按管理端口径分页查询企业知识库目录与资源。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于分页查询企业知识库中的目录内容和资源。</li>
     * <li>支持通过多种参数进行过滤和排序，如<code>directoryId</code>、<code>page</code>、<code>pageSize</code>、<code>sortField</code>、<code>sortOrder</code>等。</li>
     * <li><code>sourceTypes</code>参数允许用户根据资源类型进行过滤，多个类型使用逗号分隔。</li>
     * <li>当不传或传入<code>root</code>作为<code>directoryId</code>时，默认查询知识库根目录列表。</li>
     * <li>默认的排序字段为<code>name</code>，默认排序方向为升序（<code>asc</code>）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>按管理端口径分页查询企业知识库目录与资源。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口按企业知识库前台口径返回指定目录的子目录和 READY 资源。</li>
     * <li>用户身份与目录可见范围均来自 OpenAPI 鉴权上下文。</li>
     * <li><code>sourceTypes</code> 有值时仅返回资源；<code>keyword</code> 仅搜索当前目录层级。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询当前 OpenAPI 用户可见知识库目录内容。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口按企业知识库前台口径返回指定目录的子目录和 READY 资源。</li>
     * <li>用户身份与目录可见范围均来自 OpenAPI 鉴权上下文。</li>
     * <li><code>sourceTypes</code> 有值时仅返回资源；<code>keyword</code> 仅搜索当前目录层级。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询当前 OpenAPI 用户可见知识库目录内容。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口按 OpenAPI 鉴权身份映射的平台用户查询其可见企业知识库。</li>
     * <li>租户和用户身份均由鉴权上下文确定，调用方不能通过业务参数扩大可见范围。</li>
     * <li><code>tenantId</code> 为可选公共参数；<code>keyword</code> 可按知识库名称或描述过滤。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询当前 OpenAPI 用户可见的企业知识库列表。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口按 OpenAPI 鉴权身份映射的平台用户查询其可见企业知识库。</li>
     * <li>租户和用户身份均由鉴权上下文确定，调用方不能通过业务参数扩大可见范围。</li>
     * <li><code>tenantId</code> 为可选公共参数；<code>keyword</code> 可按知识库名称或描述过滤。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询当前 OpenAPI 用户可见的企业知识库列表。</p>
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
     * <p>OpenAPI 分页查询租户成员列表。
     *     业务编排：
     *     1. 解析筛选条件（roleCodes → role_ids）
     *     2. 调用 UserTenantMappingRepository.query_paged_tenant_members 分页查询
     *     3. 将结果中的 role_id 转为 roleCode 并组装响应
     *     错误码：
     *     - 非法 roleCode 参数时抛出错误</p>
     * 
     * <b>summary</b> : 
     * <p>分页查询租户成员列表</p>
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
     * <p>OpenAPI 分页查询租户成员列表。
     *     业务编排：
     *     1. 解析筛选条件（roleCodes → role_ids）
     *     2. 调用 UserTenantMappingRepository.query_paged_tenant_members 分页查询
     *     3. 将结果中的 role_id 转为 roleCode 并组装响应
     *     错误码：
     *     - 非法 roleCode 参数时抛出错误</p>
     * 
     * <b>summary</b> : 
     * <p>分页查询租户成员列表</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于查询特定数字员工在指定知识库目录下的所有子目录和资源。</li>
     * <li>用户需拥有对目标数字员工的USE权限，且该数字员工必须有权访问请求中指定的目录及其子目录。</li>
     * <li>请求时需要提供数字员工名称（<code>operatingObjectName</code>）及要查询的目录ID（<code>directoryId</code>），其他参数如分页信息、排序方式等为可选项。</li>
     * <li>接口返回结果包括目录下的子目录和资源列表，并支持按页码分页显示。</li>
     * <li><code>sourceStatus</code>字段固定过滤值为<code>READY</code>状态的资源。</li>
     * <li>安全性方面，<code>tenant_id</code>与<code>user_id</code>仅从鉴权身份获取，调用方即使在请求体中传递也会被忽略。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>下钻查询指定数字员工可见的知识库目录下的子目录与资源。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>本接口用于查询特定数字员工在指定知识库目录下的所有子目录和资源。</li>
     * <li>用户需拥有对目标数字员工的USE权限，且该数字员工必须有权访问请求中指定的目录及其子目录。</li>
     * <li>请求时需要提供数字员工名称（<code>operatingObjectName</code>）及要查询的目录ID（<code>directoryId</code>），其他参数如分页信息、排序方式等为可选项。</li>
     * <li>接口返回结果包括目录下的子目录和资源列表，并支持按页码分页显示。</li>
     * <li><code>sourceStatus</code>字段固定过滤值为<code>READY</code>状态的资源。</li>
     * <li>安全性方面，<code>tenant_id</code>与<code>user_id</code>仅从鉴权身份获取，调用方即使在请求体中传递也会被忽略。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>下钻查询指定数字员工可见的知识库目录下的子目录与资源。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取指定数字员工（运营对象）在企业内可见的知识库顶层目录列表。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询数字员工可访问的企业知识库顶层目录。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于获取指定数字员工（运营对象）在企业内可见的知识库顶层目录列表。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>查询数字员工可访问的企业知识库顶层目录。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>鉴权流程</strong>：<ol>
     * <li>基础鉴权由根 router 统一完成（<code>request.state.openapi_identity</code>）。</li>
     * <li>本 handler 校验 <code>DEVELOPMENT_KB_MANAGE</code> 功能权限。</li>
     * </ol>
     * </li>
     * <li><strong>操作步骤</strong>：<ol>
     * <li>检查源目录与目标目录不能相同。</li>
     * <li>确认目标目录存在。</li>
     * <li>验证待移动的资源确实位于源目录中。</li>
     * <li>更新资源的目录绑定关系。</li>
     * <li>尽力更新 <code>source.settings[&quot;knowledge_id&quot;]</code> 为目标知识库 ID。</li>
     * <li>尽力通知 DocumentAgent 同步 <code>knowledge_id</code> 和 <code>update_time</code>。</li>
     * </ol>
     * </li>
     * <li><strong>安全约束</strong>：<ul>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 必须来自鉴权身份。</li>
     * <li>调用者需要拥有 KB 管理权限。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>在企业知识库目录间移动指定资源，需具备管理权限。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>鉴权流程</strong>：<ol>
     * <li>基础鉴权由根 router 统一完成（<code>request.state.openapi_identity</code>）。</li>
     * <li>本 handler 校验 <code>DEVELOPMENT_KB_MANAGE</code> 功能权限。</li>
     * </ol>
     * </li>
     * <li><strong>操作步骤</strong>：<ol>
     * <li>检查源目录与目标目录不能相同。</li>
     * <li>确认目标目录存在。</li>
     * <li>验证待移动的资源确实位于源目录中。</li>
     * <li>更新资源的目录绑定关系。</li>
     * <li>尽力更新 <code>source.settings[&quot;knowledge_id&quot;]</code> 为目标知识库 ID。</li>
     * <li>尽力通知 DocumentAgent 同步 <code>knowledge_id</code> 和 <code>update_time</code>。</li>
     * </ol>
     * </li>
     * <li><strong>安全约束</strong>：<ul>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 必须来自鉴权身份。</li>
     * <li>调用者需要拥有 KB 管理权限。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>在企业知识库目录间移动指定资源，需具备管理权限。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>源目录与目标目录不能相同</strong>，否则将返回 <code>ERR.Robject.UserDirectory.InvalidOperation</code> 错误。</li>
     * <li><strong>目标目录必须存在</strong>，如果不存在则会返回 <code>ERR.Robject.UserDirectory.DirectoryNotFound</code> 错误。</li>
     * <li><strong>待移动的资源必须存在于源目录中</strong>，若不在源目录中，则会收到 <code>ERR.Robject.UserDirectory.ResourceNotInDirectory</code> 错误。</li>
     * <li>成功移动后，系统会尝试通知 DocumentAgent 更新资源的新路径 (<code>source_path</code>)，但此步骤为尽力而为（best-effort），即使失败也不会影响整体操作的成功状态，仅记录错误日志。</li>
     * <li>安全性方面，<code>tenant_id</code> 的值只能来源于鉴权身份信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>在用户的个人目录之间移动指定资源。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>源目录与目标目录不能相同</strong>，否则将返回 <code>ERR.Robject.UserDirectory.InvalidOperation</code> 错误。</li>
     * <li><strong>目标目录必须存在</strong>，如果不存在则会返回 <code>ERR.Robject.UserDirectory.DirectoryNotFound</code> 错误。</li>
     * <li><strong>待移动的资源必须存在于源目录中</strong>，若不在源目录中，则会收到 <code>ERR.Robject.UserDirectory.ResourceNotInDirectory</code> 错误。</li>
     * <li>成功移动后，系统会尝试通知 DocumentAgent 更新资源的新路径 (<code>source_path</code>)，但此步骤为尽力而为（best-effort），即使失败也不会影响整体操作的成功状态，仅记录错误日志。</li>
     * <li>安全性方面，<code>tenant_id</code> 的值只能来源于鉴权身份信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>在用户的个人目录之间移动指定资源。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于预览企业知识库下指定知识的内容。</li>
     * <li>需要具备<code>DEVELOPMENT_KB_VIEW</code>功能权限才能调用此API。</li>
     * <li><code>sourceId</code>是必需参数，用来标识要预览的知识条目。</li>
     * <li>可选参数<code>tenantId</code>允许指定租户ID；若未提供，则使用调用方默认的租户ID。</li>
     * <li>支持多种类型的预览，包括但不限于图片、音频、视频及文本等。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>预览指定企业知识库下的知识内容</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于预览企业知识库下指定知识的内容。</li>
     * <li>需要具备<code>DEVELOPMENT_KB_VIEW</code>功能权限才能调用此API。</li>
     * <li><code>sourceId</code>是必需参数，用来标识要预览的知识条目。</li>
     * <li>可选参数<code>tenantId</code>允许指定租户ID；若未提供，则使用调用方默认的租户ID。</li>
     * <li>支持多种类型的预览，包括但不限于图片、音频、视频及文本等。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>预览指定企业知识库下的知识内容</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口仅允许用户预览属于自己的个人目录下的资源。</li>
     * <li>鉴权流程包括基础鉴权和数据源归属校验，确保请求者只能访问其个人目录中的知识。</li>
     * <li>请求时需提供知识的唯一标识 <code>sourceId</code>，系统将根据此ID及用户的租户信息查询并返回相应的预览信息。</li>
     * <li>支持多种类型的预览，如图片、音频、视频等，并根据不同类型返回对应的预览URL或直接的内容展示。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>允许用户预览其个人目录下的指定知识内容。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口仅允许用户预览属于自己的个人目录下的资源。</li>
     * <li>鉴权流程包括基础鉴权和数据源归属校验，确保请求者只能访问其个人目录中的知识。</li>
     * <li>请求时需提供知识的唯一标识 <code>sourceId</code>，系统将根据此ID及用户的租户信息查询并返回相应的预览信息。</li>
     * <li>支持多种类型的预览，如图片、音频、视频等，并根据不同类型返回对应的预览URL或直接的内容展示。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>允许用户预览其个人目录下的指定知识内容。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于根据给定的运营对象名称（如 <code>customer_1</code>）分页查询相关的主对象数据。</li>
     * <li>支持通过关键字进行搜索，并且可以设置是否仅返回被标记为关注的对象。</li>
     * <li>可以使用复杂的过滤条件来进一步筛选结果，包括但不限于等于、不等于、大于、小于等逻辑操作符。</li>
     * <li>如果没有配置主对象类型，则会返回一个空的结果集。</li>
     * <li>请求中包含的数据将经过鉴权与过滤处理，确保安全性和准确性。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过运营对象名称分页查询主对象数据，支持过滤和搜索。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于根据给定的运营对象名称（如 <code>customer_1</code>）分页查询相关的主对象数据。</li>
     * <li>支持通过关键字进行搜索，并且可以设置是否仅返回被标记为关注的对象。</li>
     * <li>可以使用复杂的过滤条件来进一步筛选结果，包括但不限于等于、不等于、大于、小于等逻辑操作符。</li>
     * <li>如果没有配置主对象类型，则会返回一个空的结果集。</li>
     * <li>请求中包含的数据将经过鉴权与过滤处理，确保安全性和准确性。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过运营对象名称分页查询主对象数据，支持过滤和搜索。</p>
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
     * <p>仅开放 smart-query 的 schema_knowledge 语义召回能力。
     *     CLI 映射为 <code>winnexo semantic query</code>。<code>tenantId</code> 由公共参数传入，<code>userId</code>
     *     仅从 Token 身份读取，禁止请求体覆盖。服务会校验 <code>graphName + agentName</code> 归属、
     *     active graph、数字员工启用状态及当前用户 USE 权限；跨图同名 agent 会失败关闭，
     *     随后固定 <code>outputs=[schema_knowledge]</code>。</p>
     * 
     * <b>summary</b> : 
     * <p>查询与用户问题相关的语义知识</p>
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
     * <p>仅开放 smart-query 的 schema_knowledge 语义召回能力。
     *     CLI 映射为 <code>winnexo semantic query</code>。<code>tenantId</code> 由公共参数传入，<code>userId</code>
     *     仅从 Token 身份读取，禁止请求体覆盖。服务会校验 <code>graphName + agentName</code> 归属、
     *     active graph、数字员工启用状态及当前用户 USE 权限；跨图同名 agent 会失败关闭，
     *     随后固定 <code>outputs=[schema_knowledge]</code>。</p>
     * 
     * <b>summary</b> : 
     * <p>查询与用户问题相关的语义知识</p>
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
     * <p>根据 taskId 查询组织同步任务的执行状态和结果。
     *     任务状态流转：PENDING → RUNNING → COMPLETED / FAILED / TIMEOUT / CANCELED
     *     建议客户端轮询间隔：3-5 秒。</p>
     * 
     * <b>summary</b> : 
     * <p>查询组织同步结果</p>
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
     * <p>根据 taskId 查询组织同步任务的执行状态和结果。
     *     任务状态流转：PENDING → RUNNING → COMPLETED / FAILED / TIMEOUT / CANCELED
     *     建议客户端轮询间隔：3-5 秒。</p>
     * 
     * <b>summary</b> : 
     * <p>查询组织同步结果</p>
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
     * <p>OpenAPI 从租户移除用户。
     *     业务编排：
     *     1. 从 identity 获取 tenant_id
     *     2. 调用 delete_user_from_tenant（内部含最后超管保护）
     *     3. 返回成功
     *     该操作会：
     *     - 移除用户在租户下的所有角色关联
     *     - 移除用户在租户下的所有用户组关联
     *     - 撤销用户在租户下的全部数字员工使用授权
     *     - 删除用户-租户映射</p>
     * 
     * <b>summary</b> : 
     * <p>从租户移除用户</p>
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
     * <p>OpenAPI 从租户移除用户。
     *     业务编排：
     *     1. 从 identity 获取 tenant_id
     *     2. 调用 delete_user_from_tenant（内部含最后超管保护）
     *     3. 返回成功
     *     该操作会：
     *     - 移除用户在租户下的所有角色关联
     *     - 移除用户在租户下的所有用户组关联
     *     - 撤销用户在租户下的全部数字员工使用授权
     *     - 删除用户-租户映射</p>
     * 
     * <b>summary</b> : 
     * <p>从租户移除用户</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口允许具有相应权限的用户修改企业知识库中的特定数据源名称。</li>
     * <li>需要提供待修改的数据源ID(<code>sourceId</code>)及新的名称(<code>newName</code>)。</li>
     * <li>修改操作仅更新数据源的名字字段，不会触发其他处理流程。</li>
     * <li>成功执行后，系统会发布<code>SOURCE_CHANGED</code>事件以供前端刷新显示，并尝试通知DocumentAgent同步最新的source_name信息，但此步骤失败不会影响主流程的完成状态。</li>
     * <li>如果提供的<code>sourceId</code>不存在，则返回错误码<code>ERR.Robject.Source.NotFound</code>。</li>
     * <li>此API调用需具备<code>DEVELOPMENT_KB_MANAGE</code>功能权限。</li>
     * <li>支持通过AK、BearerToken或APP方式进行身份验证。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于更改指定企业知识库内数据源的名称。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口允许具有相应权限的用户修改企业知识库中的特定数据源名称。</li>
     * <li>需要提供待修改的数据源ID(<code>sourceId</code>)及新的名称(<code>newName</code>)。</li>
     * <li>修改操作仅更新数据源的名字字段，不会触发其他处理流程。</li>
     * <li>成功执行后，系统会发布<code>SOURCE_CHANGED</code>事件以供前端刷新显示，并尝试通知DocumentAgent同步最新的source_name信息，但此步骤失败不会影响主流程的完成状态。</li>
     * <li>如果提供的<code>sourceId</code>不存在，则返回错误码<code>ERR.Robject.Source.NotFound</code>。</li>
     * <li>此API调用需具备<code>DEVELOPMENT_KB_MANAGE</code>功能权限。</li>
     * <li>支持通过AK、BearerToken或APP方式进行身份验证。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于更改指定企业知识库内数据源的名称。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 仅更新数据源的 <code>name</code> 字段，不会触发 <code>process_source</code>。</li>
     * <li>成功后会发布 <code>SOURCE_CHANGED</code> 事件供前端刷新显示。</li>
     * <li>将尽力通知 DocumentAgent 同步新的 <code>source_name</code>，即使同步失败也不会阻断主流程。</li>
     * <li>如果指定的数据源不存在，则抛出 <code>ERR.Robject.Source.NotFound</code> 错误，并由全局中间件统一转换为 POP 错误码。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 必须来自鉴权身份。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于更改指定数据源的名称，支持轻量级操作。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该 API 仅更新数据源的 <code>name</code> 字段，不会触发 <code>process_source</code>。</li>
     * <li>成功后会发布 <code>SOURCE_CHANGED</code> 事件供前端刷新显示。</li>
     * <li>将尽力通知 DocumentAgent 同步新的 <code>source_name</code>，即使同步失败也不会阻断主流程。</li>
     * <li>如果指定的数据源不存在，则抛出 <code>ERR.Robject.Source.NotFound</code> 错误，并由全局中间件统一转换为 POP 错误码。</li>
     * <li>安全约束：<code>tenant_id</code> 和 <code>user_id</code> 必须来自鉴权身份。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于更改指定数据源的名称，支持轻量级操作。</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于重新解析指定的数据源，支持同步或异步执行。请求时需提供数据源 ID，并可选择是否同步等待解析完成，默认为异步入队处理。此外，可以通过 <code>tenantId</code> 参数指定租户ID，但此参数非必填。</p>
     * <ul>
     * <li><strong>forceSync</strong>：若设置为 <code>true</code>，则会同步等待重新解析操作完成；默认值为 <code>false</code>，表示以异步方式处理请求。</li>
     * <li>当服务返回 <code>None</code> 时，将被转换成 <code>SourceNotFound</code> 异常；其他异常情况将由 OpenAPI 的全局异常链进行处理。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>重新解析当前租户内的指定数据源。</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于重新解析指定的数据源，支持同步或异步执行。请求时需提供数据源 ID，并可选择是否同步等待解析完成，默认为异步入队处理。此外，可以通过 <code>tenantId</code> 参数指定租户ID，但此参数非必填。</p>
     * <ul>
     * <li><strong>forceSync</strong>：若设置为 <code>true</code>，则会同步等待重新解析操作完成；默认值为 <code>false</code>，表示以异步方式处理请求。</li>
     * <li>当服务返回 <code>None</code> 时，将被转换成 <code>SourceNotFound</code> 异常；其他异常情况将由 OpenAPI 的全局异常链进行处理。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>重新解析当前租户内的指定数据源。</p>
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
     * <h2>请求说明</h2>
     * <p>该API允许用户更新企业自建知识库中特定的FILE类型的数据源，并通过提供新的文件路径和公开访问URL来触发系统对该数据源的重新解析。支持同步或异步模式下的操作执行，其中同步模式下客户端将等待直到解析过程完成。</p>
     * <ul>
     * <li><strong>forceSync</strong> 参数控制是否采用同步方式处理请求，默认为 <code>false</code>，即以异步方式进行。</li>
     * <li>当不提供 <strong>fileName</strong> 或其值为空时，新上传的文件将保留原有的文件名。</li>
     * <li>必须确保提供的 <strong>filePath</strong> 和 <strong>filePublicUrl</strong> 是有效的且指向同一个文件实体。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于替换指定的企业知识库中的FILE资源并触发重新解析。</p>
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
     * <h2>请求说明</h2>
     * <p>该API允许用户更新企业自建知识库中特定的FILE类型的数据源，并通过提供新的文件路径和公开访问URL来触发系统对该数据源的重新解析。支持同步或异步模式下的操作执行，其中同步模式下客户端将等待直到解析过程完成。</p>
     * <ul>
     * <li><strong>forceSync</strong> 参数控制是否采用同步方式处理请求，默认为 <code>false</code>，即以异步方式进行。</li>
     * <li>当不提供 <strong>fileName</strong> 或其值为空时，新上传的文件将保留原有的文件名。</li>
     * <li>必须确保提供的 <strong>filePath</strong> 和 <strong>filePublicUrl</strong> 是有效的且指向同一个文件实体。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于替换指定的企业知识库中的FILE资源并触发重新解析。</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于全量替换特定数据源的对象绑定（先删除现有绑定，再插入新的绑定）。如果传入空列表，则表示清空所有绑定。</p>
     * <ul>
     * <li><strong>安全约束</strong>：<code>tenant_id</code> 和 <code>user_id</code> 必须来自鉴权身份。</li>
     * <li><strong>错误处理</strong>：若指定的数据源不存在，将抛出 <code>ERR.Robject.InvalidParameter</code> 错误，并由全局中间件转换为 POP 错误码。</li>
     * <li><strong>同步通知</strong>：替换成功后会尽力同步通知 DocumentAgent 更新 <code>semantics.object_bindings</code>，但失败仅记录日志，不会阻断主流程。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于全量替换指定数据源下的对象绑定信息。</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于全量替换特定数据源的对象绑定（先删除现有绑定，再插入新的绑定）。如果传入空列表，则表示清空所有绑定。</p>
     * <ul>
     * <li><strong>安全约束</strong>：<code>tenant_id</code> 和 <code>user_id</code> 必须来自鉴权身份。</li>
     * <li><strong>错误处理</strong>：若指定的数据源不存在，将抛出 <code>ERR.Robject.InvalidParameter</code> 错误，并由全局中间件转换为 POP 错误码。</li>
     * <li><strong>同步通知</strong>：替换成功后会尽力同步通知 DocumentAgent 更新 <code>semantics.object_bindings</code>，但失败仅记录日志，不会阻断主流程。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于全量替换指定数据源下的对象绑定信息。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>此 API 用于替换当前平台用户创建的个人 FILE 资源，并触发系统对该文件的重新解析。</li>
     * <li><code>tenant_id</code>、操作人和创建者约束只读取鉴权身份。缺少平台用户时请求将被拒绝，以防止绕过所有权校验。</li>
     * <li>如果服务端返回 <code>None</code>，则会被转换为 <code>NotFound</code> 异常；其他异常由 OpenAPI 全局异常链处理。</li>
     * <li>该接口支持同步或异步等待重新解析完成，默认为异步入队（通过设置 <code>forceSync</code> 参数控制）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>允许用户替换其创建的个人文件资源，并触发系统重新解析该文件。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>此 API 用于替换当前平台用户创建的个人 FILE 资源，并触发系统对该文件的重新解析。</li>
     * <li><code>tenant_id</code>、操作人和创建者约束只读取鉴权身份。缺少平台用户时请求将被拒绝，以防止绕过所有权校验。</li>
     * <li>如果服务端返回 <code>None</code>，则会被转换为 <code>NotFound</code> 异常；其他异常由 OpenAPI 全局异常链处理。</li>
     * <li>该接口支持同步或异步等待重新解析完成，默认为异步入队（通过设置 <code>forceSync</code> 参数控制）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>允许用户替换其创建的个人文件资源，并触发系统重新解析该文件。</p>
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
     * <p>OpenAPI 重置用户密码。
     *     业务编排：
     *     1. 调用 UserManagementService.reset_member_password 传入 password_encrypted（必填）
     *        → service 内部完成 RSA 解密 + 复杂度校验 + bcrypt hash + 写入
     *     2. 返回重置结果
     *     错误码：
     *     - ERR.User.NotFound: 用户不存在
     *     - ERR.User.NotInTenant: 用户不在当前租户下
     *     - ERR.User.WinnexoPasswordRequired: 用户无密码凭证（非 WINNEXO 类型）</p>
     * 
     * <b>summary</b> : 
     * <p>重置用户密码</p>
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
     * <p>OpenAPI 重置用户密码。
     *     业务编排：
     *     1. 调用 UserManagementService.reset_member_password 传入 password_encrypted（必填）
     *        → service 内部完成 RSA 解密 + 复杂度校验 + bcrypt hash + 写入
     *     2. 返回重置结果
     *     错误码：
     *     - ERR.User.NotFound: 用户不存在
     *     - ERR.User.NotInTenant: 用户不在当前租户下
     *     - ERR.User.WinnexoPasswordRequired: 用户无密码凭证（非 WINNEXO 类型）</p>
     * 
     * <b>summary</b> : 
     * <p>重置用户密码</p>
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
     * <p>重置用户的 INSTANCE Token。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 调用 reset_token：
     *        - 旧 ACTIVE Token → RESET（永久失效）
     *        - 生成新 ACTIVE Token
     *     4. 返回新 Token 明文 + 脱敏值
     *     注意：重置后旧 Token 永久失效且不可恢复。新 Token 明文仅在本次响应中返回。</p>
     * 
     * <b>summary</b> : 
     * <p>重置 API Token</p>
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
     * <p>重置用户的 INSTANCE Token。
     *     业务逻辑：
     *     1. 从 identity 取 user_id（强制 caller_type=user）
     *     2. 构造 AuthContext，委托 UserTokenAuthorizedService 完成权限校验
     *     3. 调用 reset_token：
     *        - 旧 ACTIVE Token → RESET（永久失效）
     *        - 生成新 ACTIVE Token
     *     4. 返回新 Token 明文 + 脱敏值
     *     注意：重置后旧 Token 永久失效且不可恢复。新 Token 明文仅在本次响应中返回。</p>
     * 
     * <b>summary</b> : 
     * <p>重置 API Token</p>
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
     * <h2>请求说明</h2>
     * <p>该API用于获取并重试指定用户个人目录（包括其所有子目录）中状态为FAILED的数据源。请求将立即返回，实际的重试任务将在后台异步执行。请注意，只有当前登录用户有权访问且属于其创建的资源才能被重试。</p>
     * <h3>安全与权限</h3>
     * <ul>
     * <li>此操作需要适当的RAM权限。</li>
     * <li>只能对当前用户所属租户内的资源进行操作。</li>
     * <li>确保<code>tenantId</code>和<code>userId</code>来自经过验证的身份信息。</li>
     * </ul>
     * <h3>注意事项</h3>
     * <ul>
     * <li><code>directoryId</code>是必需参数，指定了要检查和重试失败数据源的目标目录。</li>
     * <li>如果没有提供<code>tenantId</code>，则默认使用调用方的租户ID。</li>
     * <li>API支持多种认证方式，包括AK、BearerToken以及APP认证。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>批量重试指定目录及其子目录下的所有失败数据源。</p>
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
     * <h2>请求说明</h2>
     * <p>该API用于获取并重试指定用户个人目录（包括其所有子目录）中状态为FAILED的数据源。请求将立即返回，实际的重试任务将在后台异步执行。请注意，只有当前登录用户有权访问且属于其创建的资源才能被重试。</p>
     * <h3>安全与权限</h3>
     * <ul>
     * <li>此操作需要适当的RAM权限。</li>
     * <li>只能对当前用户所属租户内的资源进行操作。</li>
     * <li>确保<code>tenantId</code>和<code>userId</code>来自经过验证的身份信息。</li>
     * </ul>
     * <h3>注意事项</h3>
     * <ul>
     * <li><code>directoryId</code>是必需参数，指定了要检查和重试失败数据源的目标目录。</li>
     * <li>如果没有提供<code>tenantId</code>，则默认使用调用方的租户ID。</li>
     * <li>API支持多种认证方式，包括AK、BearerToken以及APP认证。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>批量重试指定目录及其子目录下的所有失败数据源。</p>
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
     * <h2>请求说明</h2>
     * <p>该API用于获取并重试指定企业知识库目录（包括其子目录）下的所有处于FAILED状态的数据源。请求将立即返回，实际的重试操作将在后台异步执行。</p>
     * <ul>
     * <li><strong>鉴权</strong>：除了基础鉴权外，还需具备<code>DEVELOPMENT_KB_MANAGE</code>权限。</li>
     * <li><strong>安全约束</strong>：仅允许具有相应租户和用户身份的调用者访问，并且需要KB管理权限；管理员可以对任何用户的失败资源发起重试。</li>
     * <li><strong>参数</strong>：<ul>
     * <li><code>directoryId</code> (必填)：指定要检查和重试失败数据源的企业知识库目录ID。</li>
     * <li><code>tenantId</code> (可选)：指定租户ID，默认使用调用方的默认租户。</li>
     * </ul>
     * </li>
     * <li><strong>响应</strong>：成功时返回已入队等待重试的数据源数量及详情等信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>批量重试指定目录下所有失败状态的数据源</p>
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
     * <h2>请求说明</h2>
     * <p>该API用于获取并重试指定企业知识库目录（包括其子目录）下的所有处于FAILED状态的数据源。请求将立即返回，实际的重试操作将在后台异步执行。</p>
     * <ul>
     * <li><strong>鉴权</strong>：除了基础鉴权外，还需具备<code>DEVELOPMENT_KB_MANAGE</code>权限。</li>
     * <li><strong>安全约束</strong>：仅允许具有相应租户和用户身份的调用者访问，并且需要KB管理权限；管理员可以对任何用户的失败资源发起重试。</li>
     * <li><strong>参数</strong>：<ul>
     * <li><code>directoryId</code> (必填)：指定要检查和重试失败数据源的企业知识库目录ID。</li>
     * <li><code>tenantId</code> (可选)：指定租户ID，默认使用调用方的默认租户。</li>
     * </ul>
     * </li>
     * <li><strong>响应</strong>：成功时返回已入队等待重试的数据源数量及详情等信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>批量重试指定目录下所有失败状态的数据源</p>
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
     * <p>撤销用户或用户组对指定数字员工的使用权限。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 请求体互斥校验：userIds / userGroupIds 二选一
     *     3. 委托 AgentAuthorizationAuthorizedService.revoke_authorization 执行
     *     4. 前置校验：MANAGE 权限 + agent 存在性（由 AuthorizedService 层执行，先鉴权后暴露存在性）
     *     5. 撤销用户直接授权后，用户可能仍通过用户组获得授权</p>
     * 
     * <b>summary</b> : 
     * <p>撤销用户/用户组的数字员工使用权限</p>
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
     * <p>撤销用户或用户组对指定数字员工的使用权限。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 请求体互斥校验：userIds / userGroupIds 二选一
     *     3. 委托 AgentAuthorizationAuthorizedService.revoke_authorization 执行
     *     4. 前置校验：MANAGE 权限 + agent 存在性（由 AuthorizedService 层执行，先鉴权后暴露存在性）
     *     5. 撤销用户直接授权后，用户可能仍通过用户组获得授权</p>
     * 
     * <b>summary</b> : 
     * <p>撤销用户/用户组的数字员工使用权限</p>
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
     * <h2>请求说明</h2>
     * <p>本接口仅支持异步模式：提交后立即返回 <code>RunId</code> 和 <code>Status=Running</code>，客户端通过 <code>GetSkillRun</code> 轮询最终结果。</p>
     * <ul>
     * <li><strong>TenantId</strong>：可选公共参数，由网关透传到后端 Header。</li>
     * <li><strong>SkillCode</strong> / <strong>SkillName</strong>：二选一；SkillCode 优先；SkillName 不唯一时返回 <code>ERR.SkillHub.SkillNameAmbiguous</code>。</li>
     * <li><strong>Arguments</strong>：必填，技能入参对象，结构由 <code>GetSkill</code> 返回的 inputConfig 描述。</li>
     * <li><strong>ClientToken</strong>：可选幂等键；当前版本仅记录到任务元数据，不做强幂等去重。
     * 注意：同步模式（Async=false）、Stream、CallbackUrl 一期不支持，将在后续版本提供。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>异步触发技能执行，立即返回 RunId。</p>
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
     * <h2>请求说明</h2>
     * <p>本接口仅支持异步模式：提交后立即返回 <code>RunId</code> 和 <code>Status=Running</code>，客户端通过 <code>GetSkillRun</code> 轮询最终结果。</p>
     * <ul>
     * <li><strong>TenantId</strong>：可选公共参数，由网关透传到后端 Header。</li>
     * <li><strong>SkillCode</strong> / <strong>SkillName</strong>：二选一；SkillCode 优先；SkillName 不唯一时返回 <code>ERR.SkillHub.SkillNameAmbiguous</code>。</li>
     * <li><strong>Arguments</strong>：必填，技能入参对象，结构由 <code>GetSkill</code> 返回的 inputConfig 描述。</li>
     * <li><strong>ClientToken</strong>：可选幂等键；当前版本仅记录到任务元数据，不做强幂等去重。
     * 注意：同步模式（Async=false）、Stream、CallbackUrl 一期不支持，将在后续版本提供。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>异步触发技能执行，立即返回 RunId。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将一批产出明细保存为用户的个人资源。</li>
     * <li>支持两种保存方式：<code>link</code>（链接）和<code>copy</code>（复制）。选择<code>link</code>时，编辑产出会同步到资源；选择<code>copy</code>则创建快照，不限次数。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 仅来自鉴权身份。</li>
     * <li>如果批内 <code>operating_object</code> 不一致且未传 <code>directoryId</code>，则整批请求前置失败。</li>
     * <li>单条记录的处理结果不会影响其他记录的结果，单条失败信息会在响应中返回。</li>
     * <li>批量操作最多支持50条记录。</li>
     * <li>整批前置失败的情况由全局异常中间件统一返回POP兼容错误格式。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将产出明细批量保存为个人资源，支持链接或复制模式。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于将一批产出明细保存为用户的个人资源。</li>
     * <li>支持两种保存方式：<code>link</code>（链接）和<code>copy</code>（复制）。选择<code>link</code>时，编辑产出会同步到资源；选择<code>copy</code>则创建快照，不限次数。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 仅来自鉴权身份。</li>
     * <li>如果批内 <code>operating_object</code> 不一致且未传 <code>directoryId</code>，则整批请求前置失败。</li>
     * <li>单条记录的处理结果不会影响其他记录的结果，单条失败信息会在响应中返回。</li>
     * <li>批量操作最多支持50条记录。</li>
     * <li>整批前置失败的情况由全局异常中间件统一返回POP兼容错误格式。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>将产出明细批量保存为个人资源，支持链接或复制模式。</p>
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
     * <b>summary</b> : 
     * <p>异步发送会话消息</p>
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
     * <b>summary</b> : 
     * <p>异步发送会话消息</p>
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
     * <b>summary</b> : 
     * <p>发送消息</p>
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
     * <b>summary</b> : 
     * <p>发送消息</p>
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
     * <p>停止对话生成</p>
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
     * <p>停止对话生成</p>
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
     * <b>summary</b> : 
     * <p>订阅会话消息流</p>
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
     * <b>summary</b> : 
     * <p>订阅会话消息流</p>
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
     * <p>接收客户端推送的部门树和成员关系，创建异步同步任务。
     *     处理流程：
     *     1. 校验 platformType（仅允许 saml / oauth2 / custom）
     *     2. 校验数据量限制（departments + members &lt;= 50000）
     *     3. 校验 syncMembers 与 platformType 的兼容性
     *     4. SAML/OAuth2 场景：解析或自动推导 ssoSettingsId
     *     5. Custom 场景：校验 corpId 已通过 createCustomOrg 注册
     *     6. 委托 OrgSyncAuthorizedService 创建任务（内含权限校验）
     *     7. 返回 taskId 供轮询</p>
     * 
     * <b>summary</b> : 
     * <p>推送组织架构同步</p>
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
     * <p>接收客户端推送的部门树和成员关系，创建异步同步任务。
     *     处理流程：
     *     1. 校验 platformType（仅允许 saml / oauth2 / custom）
     *     2. 校验数据量限制（departments + members &lt;= 50000）
     *     3. 校验 syncMembers 与 platformType 的兼容性
     *     4. SAML/OAuth2 场景：解析或自动推导 ssoSettingsId
     *     5. Custom 场景：校验 corpId 已通过 createCustomOrg 注册
     *     6. 委托 OrgSyncAuthorizedService 创建任务（内含权限校验）
     *     7. 返回 taskId 供轮询</p>
     * 
     * <b>summary</b> : 
     * <p>推送组织架构同步</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>Precheck</strong>:<ol>
     * <li>添加关注时：系统会检查是否已对该主对象进行了关注以防止重复，并且会验证该主对象是否存在。</li>
     * <li>取消关注时：这是一个幂等操作，无论用户之前是否已经关注了该对象，都会返回 <code>success=true</code>。</li>
     * </ol>
     * </li>
     * <li><strong>安全性</strong>：支持AK、BearerToken和APP三种认证方式。</li>
     * <li><strong>请求频率限制</strong>：每秒最多可发送100次请求。</li>
     * <li><strong>响应日志</strong>：开启响应日志记录功能。</li>
     * <li><strong>租户相关性</strong>：此API与特定租户相关联，默认使用调用方的租户ID。</li>
     * <li><strong>操作类型</strong>：属于写入型操作。</li>
     * <li><strong>后端服务</strong>：请求将被转发至内部服务进行处理，超时时间为3秒。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过此API可以对指定的主对象执行关注或取消关注操作。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li><strong>Precheck</strong>:<ol>
     * <li>添加关注时：系统会检查是否已对该主对象进行了关注以防止重复，并且会验证该主对象是否存在。</li>
     * <li>取消关注时：这是一个幂等操作，无论用户之前是否已经关注了该对象，都会返回 <code>success=true</code>。</li>
     * </ol>
     * </li>
     * <li><strong>安全性</strong>：支持AK、BearerToken和APP三种认证方式。</li>
     * <li><strong>请求频率限制</strong>：每秒最多可发送100次请求。</li>
     * <li><strong>响应日志</strong>：开启响应日志记录功能。</li>
     * <li><strong>租户相关性</strong>：此API与特定租户相关联，默认使用调用方的租户ID。</li>
     * <li><strong>操作类型</strong>：属于写入型操作。</li>
     * <li><strong>后端服务</strong>：请求将被转发至内部服务进行处理，超时时间为3秒。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>通过此API可以对指定的主对象执行关注或取消关注操作。</p>
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
     * <p>切换数字员工的使用权限授权模式。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.update_auth_mode 执行
     *     3. 前置校验：MANAGE 权限 + agent 存在性（由 AuthorizedService 层执行，先鉴权后暴露存在性）
     *     4. SPECIFIED_USERS：需显式授权才能使用
     *     5. ALL_USERS：所有用户无需授权即可使用（管理权限不受影响）</p>
     * 
     * <b>summary</b> : 
     * <p>更新数字员工使用权限授权模式</p>
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
     * <p>切换数字员工的使用权限授权模式。
     *     业务逻辑：
     *     1. 从 identity 构造 AuthContext
     *     2. 委托 AgentAuthorizationAuthorizedService.update_auth_mode 执行
     *     3. 前置校验：MANAGE 权限 + agent 存在性（由 AuthorizedService 层执行，先鉴权后暴露存在性）
     *     4. SPECIFIED_USERS：需显式授权才能使用
     *     5. ALL_USERS：所有用户无需授权即可使用（管理权限不受影响）</p>
     * 
     * <b>summary</b> : 
     * <p>更新数字员工使用权限授权模式</p>
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
     * <b>summary</b> : 
     * <p>更新会话</p>
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
     * <b>summary</b> : 
     * <p>更新会话</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于更新指定用户的个人目录信息，包括名称、描述、父目录等。请求时需确保提供的 <code>directoryId</code> 对应的目录存在且属于当前用户。此外，如果更改了目录的 <code>name</code> 或 <code>path</code>，系统将自动递归更新所有子目录的路径以保持一致性。特别注意，在调整父目录时，必须保证新父目录的有效性（即非自身或不会导致循环引用）。</p>
     * <ul>
     * <li><strong>安全约束</strong>：<code>tenant_id</code> 和 <code>user_id</code> 必须来自于鉴权身份。</li>
     * <li><strong>权限要求</strong>：执行此操作需要相应的 RAM 权限。</li>
     * <li><strong>输入参数</strong>：<ul>
     * <li><code>directoryId</code>：必填，表示要更新的目录唯一标识。</li>
     * <li><code>name</code>：选填，设置新的目录名称。</li>
     * <li><code>description</code>：选填，提供新的目录描述。</li>
     * <li><code>parentId</code>：选填，指定新的父目录ID。</li>
     * <li><code>path</code>：选填，当传入时会级联更新当前及所有子目录的路径。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于更新用户的个人目录基础信息。</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于更新指定用户的个人目录信息，包括名称、描述、父目录等。请求时需确保提供的 <code>directoryId</code> 对应的目录存在且属于当前用户。此外，如果更改了目录的 <code>name</code> 或 <code>path</code>，系统将自动递归更新所有子目录的路径以保持一致性。特别注意，在调整父目录时，必须保证新父目录的有效性（即非自身或不会导致循环引用）。</p>
     * <ul>
     * <li><strong>安全约束</strong>：<code>tenant_id</code> 和 <code>user_id</code> 必须来自于鉴权身份。</li>
     * <li><strong>权限要求</strong>：执行此操作需要相应的 RAM 权限。</li>
     * <li><strong>输入参数</strong>：<ul>
     * <li><code>directoryId</code>：必填，表示要更新的目录唯一标识。</li>
     * <li><code>name</code>：选填，设置新的目录名称。</li>
     * <li><code>description</code>：选填，提供新的目录描述。</li>
     * <li><code>parentId</code>：选填，指定新的父目录ID。</li>
     * <li><code>path</code>：选填，当传入时会级联更新当前及所有子目录的路径。</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于更新用户的个人目录基础信息。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于修改企业知识库中的某个分类。</li>
     * <li>需要具有<code>DEVELOPMENT_KB_MANAGE</code>功能权限才能调用此API。</li>
     * <li><code>tenantId</code>参数为可选，若未提供，则默认使用调用者的租户ID。</li>
     * <li>必须提供待修改的<code>directoryId</code>，而<code>name</code>、<code>description</code>和<code>parentDirectoryId</code>均为可选项，不提供则表示这些字段保持不变。</li>
     * <li>当指定了新的<code>parentDirectoryId</code>时，系统会检查新父目录是否属于当前租户，并且不会导致循环引用问题。</li>
     * <li>安全性方面，本API支持多种认证方式（AK、BearerToken、APP），并启用了RAM权限控制与操作审计。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新指定的企业知识库分类信息，包括名称、描述及父目录。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于修改企业知识库中的某个分类。</li>
     * <li>需要具有<code>DEVELOPMENT_KB_MANAGE</code>功能权限才能调用此API。</li>
     * <li><code>tenantId</code>参数为可选，若未提供，则默认使用调用者的租户ID。</li>
     * <li>必须提供待修改的<code>directoryId</code>，而<code>name</code>、<code>description</code>和<code>parentDirectoryId</code>均为可选项，不提供则表示这些字段保持不变。</li>
     * <li>当指定了新的<code>parentDirectoryId</code>时，系统会检查新父目录是否属于当前租户，并且不会导致循环引用问题。</li>
     * <li>安全性方面，本API支持多种认证方式（AK、BearerToken、APP），并启用了RAM权限控制与操作审计。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新指定的企业知识库分类信息，包括名称、描述及父目录。</p>
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
     * <h2>请求说明</h2>
     * <p>本接口允许用户更新指定的企业知识库数据源的正文内容，并可选择是否同步等待解析完成。通过设置<code>forceSync</code>参数，可以控制解析过程是同步还是异步执行，默认为异步处理。</p>
     * <ul>
     * <li><strong>注意</strong>：当<code>content</code>字段为空字符串时，表示清空原有内容。</li>
     * <li><strong>权限要求</strong>：调用此接口需要具备相应的RAM操作权限（<code>winnexo:UpdateKnowledgeBaseSourceContent</code>）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于编辑企业自建知识库中的资源正文并触发重新解析。</p>
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
     * <h2>请求说明</h2>
     * <p>本接口允许用户更新指定的企业知识库数据源的正文内容，并可选择是否同步等待解析完成。通过设置<code>forceSync</code>参数，可以控制解析过程是同步还是异步执行，默认为异步处理。</p>
     * <ul>
     * <li><strong>注意</strong>：当<code>content</code>字段为空字符串时，表示清空原有内容。</li>
     * <li><strong>权限要求</strong>：调用此接口需要具备相应的RAM操作权限（<code>winnexo:UpdateKnowledgeBaseSourceContent</code>）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>用于编辑企业自建知识库中的资源正文并触发重新解析。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于更新企业知识库中特定数据源的标签。</li>
     * <li>需要具备知识库管理权限才能调用此接口。</li>
     * <li><code>sourceTags</code> 参数接受 JSON 字符串列表形式，例如 <code>[&quot;tagA&quot;, &quot;tagB&quot;]</code>；若传入 <code>null</code> 则表示清空所有现有标签。</li>
     * <li>更新操作仅影响 <code>sourceTags</code> 和 <code>gmt_modified</code> 字段，并不会触发 <code>process_source</code> 流程。</li>
     * <li>如果指定的数据源不存在，则会抛出 <code>ERR.Robject.Source.NotFound</code> 错误。</li>
     * <li>接口支持通过 AK、BearerToken 或 APP 方式进行身份验证。</li>
     * <li>调用时需确保 <code>tenant_id</code> 和 <code>user_id</code> 来自有效的鉴权身份信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新指定企业知识库数据源的资源标签。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该接口用于更新企业知识库中特定数据源的标签。</li>
     * <li>需要具备知识库管理权限才能调用此接口。</li>
     * <li><code>sourceTags</code> 参数接受 JSON 字符串列表形式，例如 <code>[&quot;tagA&quot;, &quot;tagB&quot;]</code>；若传入 <code>null</code> 则表示清空所有现有标签。</li>
     * <li>更新操作仅影响 <code>sourceTags</code> 和 <code>gmt_modified</code> 字段，并不会触发 <code>process_source</code> 流程。</li>
     * <li>如果指定的数据源不存在，则会抛出 <code>ERR.Robject.Source.NotFound</code> 错误。</li>
     * <li>接口支持通过 AK、BearerToken 或 APP 方式进行身份验证。</li>
     * <li>调用时需确保 <code>tenant_id</code> 和 <code>user_id</code> 来自有效的鉴权身份信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新指定企业知识库数据源的资源标签。</p>
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
     * <b>summary</b> : 
     * <p>更新定时任务</p>
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
     * <b>summary</b> : 
     * <p>更新定时任务</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于更新指定租户内的数据源内容，并根据需要触发同步或异步的数据源重新解析。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 仅用于鉴权，不参与实际业务逻辑处理。</li>
     * <li>当提供的正文为空字符串时，系统将按照现有服务契约执行操作。</li>
     * <li>如果指定的数据源不存在，则返回标准的NotFound错误；其他异常情况则由全局异常链处理。</li>
     * <li>可通过设置<code>forceSync</code>参数来决定是否等待解析过程完成（默认为异步入队）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新租户内可编辑数据源的正文并触发重新解析。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API用于更新指定租户内的数据源内容，并根据需要触发同步或异步的数据源重新解析。</li>
     * <li><code>tenant_id</code> 和 <code>user_id</code> 仅用于鉴权，不参与实际业务逻辑处理。</li>
     * <li>当提供的正文为空字符串时，系统将按照现有服务契约执行操作。</li>
     * <li>如果指定的数据源不存在，则返回标准的NotFound错误；其他异常情况则由全局异常链处理。</li>
     * <li>可通过设置<code>forceSync</code>参数来决定是否等待解析过程完成（默认为异步入队）。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>更新租户内可编辑数据源的正文并触发重新解析。</p>
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
     * <h2>请求说明</h2>
     * 
     * <b>summary</b> : 
     * <p>用于更新指定的企业知识库目录信息。</p>
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
     * <h2>请求说明</h2>
     * 
     * <b>summary</b> : 
     * <p>用于更新指定的企业知识库目录信息。</p>
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
     * <p>OpenAPI 修改用户信息。
     *     业务编排：
     *     1. 解析 roleCodes → role_ids
     *     2. 若 isActive 有变更，先执行状态切换（含最后超管保护）
     *     3. 调用 update_tenant_member 修改其他字段（displayName / roleCodes / userGroupIds）
     *     4. 全部成功返回 HTTP 200
     *     执行顺序说明：
     *     - isActive 状态变更先于其他字段写入。两步不在同一事务中。
     *     - 校验失败（如最后超管保护）→ 抛出异常，后续步骤不执行。
     *     - 若 isActive 变更已落库但后续步骤异常，isActive 不会回滚。</p>
     * 
     * <b>summary</b> : 
     * <p>修改用户信息（含启停用）</p>
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
     * <p>OpenAPI 修改用户信息。
     *     业务编排：
     *     1. 解析 roleCodes → role_ids
     *     2. 若 isActive 有变更，先执行状态切换（含最后超管保护）
     *     3. 调用 update_tenant_member 修改其他字段（displayName / roleCodes / userGroupIds）
     *     4. 全部成功返回 HTTP 200
     *     执行顺序说明：
     *     - isActive 状态变更先于其他字段写入。两步不在同一事务中。
     *     - 校验失败（如最后超管保护）→ 抛出异常，后续步骤不执行。
     *     - 若 isActive 变更已落库但后续步骤异常，isActive 不会回滚。</p>
     * 
     * <b>summary</b> : 
     * <p>修改用户信息（含启停用）</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API允许调用者更新指定用户的部分或全部可选字段，未提供的字段将保持原有值。</li>
     * <li>支持通过<code>tenantId</code>参数指定租户ID；若省略，则默认使用调用方的默认租户。</li>
     * <li>更新成功后，响应体中会包含完整的用户信息对象。</li>
     * <li>此接口要求认证，支持AK、BearerToken和APP三种安全方案。</li>
     * <li>接口消费类型为JSON格式，且仅在HTTPS协议下可用。</li>
     * <li>特别注意：<code>profileRoleInfo</code>字段仅当用户角色设置为Others时有效，用于描述用户的具体角色信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>支持部分字段更新当前用户信息，并返回完整用户信息。</p>
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
     * <h2>请求说明</h2>
     * <ul>
     * <li>该API允许调用者更新指定用户的部分或全部可选字段，未提供的字段将保持原有值。</li>
     * <li>支持通过<code>tenantId</code>参数指定租户ID；若省略，则默认使用调用方的默认租户。</li>
     * <li>更新成功后，响应体中会包含完整的用户信息对象。</li>
     * <li>此接口要求认证，支持AK、BearerToken和APP三种安全方案。</li>
     * <li>接口消费类型为JSON格式，且仅在HTTPS协议下可用。</li>
     * <li>特别注意：<code>profileRoleInfo</code>字段仅当用户角色设置为Others时有效，用于描述用户的具体角色信息。</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>支持部分字段更新当前用户信息，并返回完整用户信息。</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于上传会话临时文件，采用<strong>文件中转上传</strong>模式（<code>fileTransfer</code>）：文件二进制不经本 API 的请求体传输，而是先落到 OSS，再把 OSS 地址通过 <code>FileUrl</code> 入参交给后端；后端从该地址取回字节并写入自己的 OSS，创建会话临时文件记录。</p>
     * <h3>调用方式</h3>
     * <ul>
     * <li><strong>推荐</strong>：使用 SDK 生成的 <code>UploadChatFileAdvance</code> 方法，传入本地文件流，SDK 自动完成中转上传并回填 <code>FileUrl</code>。</li>
     * <li><strong>直传</strong>：自行将文件上传到可被服务端访问的 OSS 地址，然后直接调用本 API 并传入 <code>FileUrl</code>。</li>
     * </ul>
     * <h3>入参</h3>
     * <ul>
     * <li><strong>FileUrl</strong>：必填，文件的 OSS 地址。使用 Advance 方法时由 SDK 自动回填，无需手动赋值。</li>
     * <li><strong>FileName</strong>：必填，原始文件名（含后缀，如 <code>report.pdf</code>）。中转生成的 OSS 地址不携带原始文件名，后端据此确定文件后缀与展示名，因此必须显式传入。</li>
     * <li><strong>ContentType</strong>：可选，文件 MIME 类型；不传时按 <code>application/octet-stream</code> 处理。</li>
     * <li><strong>OperatingObjectName</strong>：可选，Agent 命名空间标识，决定文件入库路径。</li>
     * </ul>
     * <h3>出参</h3>
     * <p>返回 OSS 对象路径 <code>objectName</code>、入库地址 <code>fileUrl</code>、公开访问地址 <code>filePublicUrl</code>（有效期 1 小时）、文件记录 ID <code>fileRecordId</code> 等；<code>uploadSignatureUrl</code> 在本模式下恒为空。</p>
     * 
     * <b>summary</b> : 
     * <p>会话上传本地文件</p>
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
     * <h2>请求说明</h2>
     * <p>该 API 用于上传会话临时文件，采用<strong>文件中转上传</strong>模式（<code>fileTransfer</code>）：文件二进制不经本 API 的请求体传输，而是先落到 OSS，再把 OSS 地址通过 <code>FileUrl</code> 入参交给后端；后端从该地址取回字节并写入自己的 OSS，创建会话临时文件记录。</p>
     * <h3>调用方式</h3>
     * <ul>
     * <li><strong>推荐</strong>：使用 SDK 生成的 <code>UploadChatFileAdvance</code> 方法，传入本地文件流，SDK 自动完成中转上传并回填 <code>FileUrl</code>。</li>
     * <li><strong>直传</strong>：自行将文件上传到可被服务端访问的 OSS 地址，然后直接调用本 API 并传入 <code>FileUrl</code>。</li>
     * </ul>
     * <h3>入参</h3>
     * <ul>
     * <li><strong>FileUrl</strong>：必填，文件的 OSS 地址。使用 Advance 方法时由 SDK 自动回填，无需手动赋值。</li>
     * <li><strong>FileName</strong>：必填，原始文件名（含后缀，如 <code>report.pdf</code>）。中转生成的 OSS 地址不携带原始文件名，后端据此确定文件后缀与展示名，因此必须显式传入。</li>
     * <li><strong>ContentType</strong>：可选，文件 MIME 类型；不传时按 <code>application/octet-stream</code> 处理。</li>
     * <li><strong>OperatingObjectName</strong>：可选，Agent 命名空间标识，决定文件入库路径。</li>
     * </ul>
     * <h3>出参</h3>
     * <p>返回 OSS 对象路径 <code>objectName</code>、入库地址 <code>fileUrl</code>、公开访问地址 <code>filePublicUrl</code>（有效期 1 小时）、文件记录 ID <code>fileRecordId</code> 等；<code>uploadSignatureUrl</code> 在本模式下恒为空。</p>
     * 
     * <b>summary</b> : 
     * <p>会话上传本地文件</p>
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
