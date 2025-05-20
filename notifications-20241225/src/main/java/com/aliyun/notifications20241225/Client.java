// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225;

import com.aliyun.tea.*;
import com.aliyun.notifications20241225.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("notifications", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>方法描述：删除消息</p>
     * 
     * @param request DelMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DelMessageResponse
     */
    public DelMessageResponse delMessageWithOptions(DelMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            body.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DelMessage"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DelMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：删除消息</p>
     * 
     * @param request DelMessageRequest
     * @return DelMessageResponse
     */
    public DelMessageResponse delMessage(DelMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.delMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：站内信全部删除（逻辑删除）</p>
     * 
     * @param request DeleteAllMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAllMessageResponse
     */
    public DeleteAllMessageResponse deleteAllMessageWithOptions(DeleteAllMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classId)) {
            body.put("ClassId", request.classId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAllMessage"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAllMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：站内信全部删除（逻辑删除）</p>
     * 
     * @param request DeleteAllMessageRequest
     * @return DeleteAllMessageResponse
     */
    public DeleteAllMessageResponse deleteAllMessage(DeleteAllMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAllMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：分类全部标记为已读，不填则全部标记</p>
     * 
     * @param request ReadAllMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadAllMessageResponse
     */
    public ReadAllMessageResponse readAllMessageWithOptions(ReadAllMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classId)) {
            body.put("ClassId", request.classId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadAllMessage"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadAllMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：分类全部标记为已读，不填则全部标记</p>
     * 
     * @param request ReadAllMessageRequest
     * @return ReadAllMessageResponse
     */
    public ReadAllMessageResponse readAllMessage(ReadAllMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readAllMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取各分类已读消息数</p>
     * 
     * @param request ReadClassNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadClassNameResponse
     */
    public ReadClassNameResponse readClassNameWithOptions(ReadClassNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadClassName"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadClassNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取各分类已读消息数</p>
     * 
     * @param request ReadClassNameRequest
     * @return ReadClassNameResponse
     */
    public ReadClassNameResponse readClassName(ReadClassNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readClassNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：消息标记为已读</p>
     * 
     * @param request ReadMessageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadMessageResponse
     */
    public ReadMessageResponse readMessageWithOptions(ReadMessageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            body.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadMessage"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：消息标记为已读</p>
     * 
     * @param request ReadMessageRequest
     * @return ReadMessageResponse
     */
    public ReadMessageResponse readMessage(ReadMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readMessageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取消息正文</p>
     * 
     * @param request ReadMessageContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadMessageContentResponse
     */
    public ReadMessageContentResponse readMessageContentWithOptions(ReadMessageContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classId)) {
            body.put("ClassId", request.classId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.msgId)) {
            body.put("MsgId", request.msgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadMessageContent"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadMessageContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取消息正文</p>
     * 
     * @param request ReadMessageContentRequest
     * @return ReadMessageContentResponse
     */
    public ReadMessageContentResponse readMessageContent(ReadMessageContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readMessageContentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取消息列表</p>
     * 
     * @param request ReadMessageListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadMessageListResponse
     */
    public ReadMessageListResponse readMessageListWithOptions(ReadMessageListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.classId)) {
            body.put("ClassId", request.classId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loc)) {
            body.put("Loc", request.loc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            body.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadMessageList"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadMessageListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取消息列表</p>
     * 
     * @param request ReadMessageListRequest
     * @return ReadMessageListResponse
     */
    public ReadMessageListResponse readMessageList(ReadMessageListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readMessageListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取未读消息总数</p>
     * 
     * @param request ReadMessageNewTotalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadMessageNewTotalResponse
     */
    public ReadMessageNewTotalResponse readMessageNewTotalWithOptions(ReadMessageNewTotalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadMessageNewTotal"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadMessageNewTotalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取未读消息总数</p>
     * 
     * @param request ReadMessageNewTotalRequest
     * @return ReadMessageNewTotalResponse
     */
    public ReadMessageNewTotalResponse readMessageNewTotal(ReadMessageNewTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readMessageNewTotalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取各分类已读消息数</p>
     * 
     * @param request ReadNumGroupByClassRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadNumGroupByClassResponse
     */
    public ReadNumGroupByClassResponse readNumGroupByClassWithOptions(ReadNumGroupByClassRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadNumGroupByClass"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadNumGroupByClassResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取各分类已读消息数</p>
     * 
     * @param request ReadNumGroupByClassRequest
     * @return ReadNumGroupByClassResponse
     */
    public ReadNumGroupByClassResponse readNumGroupByClass(ReadNumGroupByClassRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readNumGroupByClassWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取所有分类下的信息</p>
     * 
     * @param request ReadNumGroupTotalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadNumGroupTotalResponse
     */
    public ReadNumGroupTotalResponse readNumGroupTotalWithOptions(ReadNumGroupTotalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizName)) {
            body.put("BizName", request.bizName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadNumGroupTotal"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadNumGroupTotalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>方法描述：获取所有分类下的信息</p>
     * 
     * @param request ReadNumGroupTotalRequest
     * @return ReadNumGroupTotalResponse
     */
    public ReadNumGroupTotalResponse readNumGroupTotal(ReadNumGroupTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readNumGroupTotalWithOptions(request, runtime);
    }
}
