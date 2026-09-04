// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225;

import com.aliyun.tea.*;
import com.aliyun.notifications20241225.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-southeast-1", "notifications-intl.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "notifications.aliyuncs.com")
        );
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
     * <p>Creates a webhook contact.</p>
     * 
     * @param request CreateWebhookContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWebhookContactResponse
     */
    public CreateWebhookContactResponse createWebhookContactWithOptions(CreateWebhookContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.botSecurityToken)) {
            body.put("BotSecurityToken", request.botSecurityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverUrl)) {
            body.put("ServerUrl", request.serverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verificationCode)) {
            body.put("VerificationCode", request.verificationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookType)) {
            body.put("WebhookType", request.webhookType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWebhookContact"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWebhookContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a webhook contact.</p>
     * 
     * @param request CreateWebhookContactRequest
     * @return CreateWebhookContactResponse
     */
    public CreateWebhookContactResponse createWebhookContact(CreateWebhookContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWebhookContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a message.</p>
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
     * <p>Deletes a message.</p>
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
     * <p>Deletes all in-app messages (logical deletion).</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.groupCode)) {
            body.put("GroupCode", request.groupCode);
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
     * <p>Deletes all in-app messages (logical deletion).</p>
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
     * <p>Deletes a webhook contact.</p>
     * 
     * @param request DeleteWebhookContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebhookContactResponse
     */
    public DeleteWebhookContactResponse deleteWebhookContactWithOptions(DeleteWebhookContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
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
            new TeaPair("action", "DeleteWebhookContact"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebhookContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a webhook contact.</p>
     * 
     * @param request DeleteWebhookContactRequest
     * @return DeleteWebhookContactResponse
     */
    public DeleteWebhookContactResponse deleteWebhookContact(DeleteWebhookContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWebhookContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all common contacts across accounts.</p>
     * 
     * @param request ReadAllCommonContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadAllCommonContactsResponse
     */
    public ReadAllCommonContactsResponse readAllCommonContactsWithOptions(ReadAllCommonContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ReadAllCommonContacts"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadAllCommonContactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all common contacts across accounts.</p>
     * 
     * @param request ReadAllCommonContactsRequest
     * @return ReadAllCommonContactsResponse
     */
    public ReadAllCommonContactsResponse readAllCommonContacts(ReadAllCommonContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readAllCommonContactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all marketing preference configurations.</p>
     * 
     * @param request ReadAllMarketingPreferencesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadAllMarketingPreferencesResponse
     */
    public ReadAllMarketingPreferencesResponse readAllMarketingPreferencesWithOptions(ReadAllMarketingPreferencesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ReadAllMarketingPreferences"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadAllMarketingPreferencesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all marketing preference configurations.</p>
     * 
     * @param request ReadAllMarketingPreferencesRequest
     * @return ReadAllMarketingPreferencesResponse
     */
    public ReadAllMarketingPreferencesResponse readAllMarketingPreferences(ReadAllMarketingPreferencesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readAllMarketingPreferencesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Marks all messages as read. If no category is specified, all messages are marked as read.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.groupCode)) {
            body.put("GroupCode", request.groupCode);
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
     * <p>Marks all messages as read. If no category is specified, all messages are marked as read.</p>
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
     * <p>Retrieves the full list of webhooks.</p>
     * 
     * @param request ReadAllWebhookContactsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadAllWebhookContactsResponse
     */
    public ReadAllWebhookContactsResponse readAllWebhookContactsWithOptions(ReadAllWebhookContactsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ReadAllWebhookContacts"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadAllWebhookContactsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the full list of webhooks.</p>
     * 
     * @param request ReadAllWebhookContactsRequest
     * @return ReadAllWebhookContactsResponse
     */
    public ReadAllWebhookContactsResponse readAllWebhookContacts(ReadAllWebhookContactsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readAllWebhookContactsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get category group list</p>
     * 
     * @param request ReadCategoryGroupListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadCategoryGroupListResponse
     */
    public ReadCategoryGroupListResponse readCategoryGroupListWithOptions(ReadCategoryGroupListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.channelGroupCode)) {
            body.put("ChannelGroupCode", request.channelGroupCode);
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
            new TeaPair("action", "ReadCategoryGroupList"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadCategoryGroupListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get category group list</p>
     * 
     * @param request ReadCategoryGroupListRequest
     * @return ReadCategoryGroupListResponse
     */
    public ReadCategoryGroupListResponse readCategoryGroupList(ReadCategoryGroupListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readCategoryGroupListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the number of read messages for each category.</p>
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
     * <p>Retrieves the number of read messages for each category.</p>
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
     * <p>Retrieves a general contact.</p>
     * 
     * @param request ReadCommonContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadCommonContactResponse
     */
    public ReadCommonContactResponse readCommonContactWithOptions(ReadCommonContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
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
            new TeaPair("action", "ReadCommonContact"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadCommonContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a general contact.</p>
     * 
     * @param request ReadCommonContactRequest
     * @return ReadCommonContactResponse
     */
    public ReadCommonContactResponse readCommonContact(ReadCommonContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readCommonContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户营销偏好</p>
     * 
     * @param request ReadMarketingPreferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadMarketingPreferenceResponse
     */
    public ReadMarketingPreferenceResponse readMarketingPreferenceWithOptions(ReadMarketingPreferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
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
            new TeaPair("action", "ReadMarketingPreference"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadMarketingPreferenceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户营销偏好</p>
     * 
     * @param request ReadMarketingPreferenceRequest
     * @return ReadMarketingPreferenceResponse
     */
    public ReadMarketingPreferenceResponse readMarketingPreference(ReadMarketingPreferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readMarketingPreferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Marks a message as read.</p>
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
     * <p>Marks a message as read.</p>
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
     * <p>Retrieves the body of a message.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.groupCode)) {
            body.put("GroupCode", request.groupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.history)) {
            body.put("History", request.history);
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
     * <p>Retrieves the body of a message.</p>
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
     * <p>Retrieves the message language.</p>
     * 
     * @param request ReadMessageLanguageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadMessageLanguageResponse
     */
    public ReadMessageLanguageResponse readMessageLanguageWithOptions(ReadMessageLanguageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.returnDefaultLang)) {
            body.put("ReturnDefaultLang", request.returnDefaultLang);
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
            new TeaPair("action", "ReadMessageLanguage"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadMessageLanguageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the message language.</p>
     * 
     * @param request ReadMessageLanguageRequest
     * @return ReadMessageLanguageResponse
     */
    public ReadMessageLanguageResponse readMessageLanguage(ReadMessageLanguageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readMessageLanguageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of messages.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.groupCode)) {
            body.put("GroupCode", request.groupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.history)) {
            body.put("History", request.history);
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
     * <p>Retrieves a list of messages.</p>
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
     * <p>Retrieves the total number of unread messages.</p>
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
     * <p>Retrieves the total number of unread messages.</p>
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
     * <p>Retrieves the count of read messages for each category.</p>
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
     * <p>Retrieves the count of read messages for each category.</p>
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
     * <p>Method description: Get information under all categories</p>
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
     * <p>Method description: Get information under all categories</p>
     * 
     * @param request ReadNumGroupTotalRequest
     * @return ReadNumGroupTotalResponse
     */
    public ReadNumGroupTotalResponse readNumGroupTotal(ReadNumGroupTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readNumGroupTotalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves revision records.</p>
     * 
     * @param tmpReq ReadRevisionHistoryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadRevisionHistoryListResponse
     */
    public ReadRevisionHistoryListResponse readRevisionHistoryListWithOptions(ReadRevisionHistoryListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReadRevisionHistoryListShrinkRequest request = new ReadRevisionHistoryListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pageInfo)) {
            request.pageInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pageInfo, "PageInfo", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.categoryCode)) {
            body.put("CategoryCode", request.categoryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelGroupCode)) {
            body.put("ChannelGroupCode", request.channelGroupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageInfoShrink)) {
            body.put("PageInfo", request.pageInfoShrink);
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
            new TeaPair("action", "ReadRevisionHistoryList"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadRevisionHistoryListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves revision records.</p>
     * 
     * @param request ReadRevisionHistoryListRequest
     * @return ReadRevisionHistoryListResponse
     */
    public ReadRevisionHistoryListResponse readRevisionHistoryList(ReadRevisionHistoryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readRevisionHistoryListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户订阅列表</p>
     * 
     * @param request ReadUserSubscriptionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadUserSubscriptionListResponse
     */
    public ReadUserSubscriptionListResponse readUserSubscriptionListWithOptions(ReadUserSubscriptionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.categoryGroupCode)) {
            body.put("CategoryGroupCode", request.categoryGroupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelGroupCode)) {
            body.put("ChannelGroupCode", request.channelGroupCode);
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
            new TeaPair("action", "ReadUserSubscriptionList"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadUserSubscriptionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户订阅列表</p>
     * 
     * @param request ReadUserSubscriptionListRequest
     * @return ReadUserSubscriptionListResponse
     */
    public ReadUserSubscriptionListResponse readUserSubscriptionList(ReadUserSubscriptionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readUserSubscriptionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a webhook contact.</p>
     * 
     * @param request ReadWebhookContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadWebhookContactResponse
     */
    public ReadWebhookContactResponse readWebhookContactWithOptions(ReadWebhookContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
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
            new TeaPair("action", "ReadWebhookContact"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadWebhookContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a webhook contact.</p>
     * 
     * @param request ReadWebhookContactRequest
     * @return ReadWebhookContactResponse
     */
    public ReadWebhookContactResponse readWebhookContact(ReadWebhookContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readWebhookContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of webhook send templates.</p>
     * 
     * @param request ReadWebhookContactSendTemplateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadWebhookContactSendTemplateListResponse
     */
    public ReadWebhookContactSendTemplateListResponse readWebhookContactSendTemplateListWithOptions(ReadWebhookContactSendTemplateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
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
            new TeaPair("action", "ReadWebhookContactSendTemplateList"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadWebhookContactSendTemplateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the list of webhook send templates.</p>
     * 
     * @param request ReadWebhookContactSendTemplateListRequest
     * @return ReadWebhookContactSendTemplateListResponse
     */
    public ReadWebhookContactSendTemplateListResponse readWebhookContactSendTemplateList(ReadWebhookContactSendTemplateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.readWebhookContactSendTemplateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets user subscriptions.</p>
     * 
     * @param tmpReq ResetUserSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetUserSubscriptionResponse
     */
    public ResetUserSubscriptionResponse resetUserSubscriptionWithOptions(ResetUserSubscriptionRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResetUserSubscriptionShrinkRequest request = new ResetUserSubscriptionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.categoryCodes)) {
            request.categoryCodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.categoryCodes, "CategoryCodes", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.categoryCodesShrink)) {
            body.put("CategoryCodes", request.categoryCodesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelGroupCode)) {
            body.put("ChannelGroupCode", request.channelGroupCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remarks)) {
            body.put("Remarks", request.remarks);
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
            new TeaPair("action", "ResetUserSubscription"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetUserSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets user subscriptions.</p>
     * 
     * @param request ResetUserSubscriptionRequest
     * @return ResetUserSubscriptionResponse
     */
    public ResetUserSubscriptionResponse resetUserSubscription(ResetUserSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetUserSubscriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Tests a webhook.</p>
     * 
     * @param request TestWebhookContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TestWebhookContactResponse
     */
    public TestWebhookContactResponse testWebhookContactWithOptions(TestWebhookContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.botSecurityToken)) {
            body.put("BotSecurityToken", request.botSecurityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverUrl)) {
            body.put("ServerUrl", request.serverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookType)) {
            body.put("WebhookType", request.webhookType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TestWebhookContact"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TestWebhookContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Tests a webhook.</p>
     * 
     * @param request TestWebhookContactRequest
     * @return TestWebhookContactResponse
     */
    public TestWebhookContactResponse testWebhookContact(TestWebhookContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.testWebhookContactWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新营销偏好</p>
     * 
     * @param request UpdateMarketingPreferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMarketingPreferenceResponse
     */
    public UpdateMarketingPreferenceResponse updateMarketingPreferenceWithOptions(UpdateMarketingPreferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            body.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowMarketing)) {
            body.put("AllowMarketing", request.allowMarketing);
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

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
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
            new TeaPair("action", "UpdateMarketingPreference"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMarketingPreferenceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新营销偏好</p>
     * 
     * @param request UpdateMarketingPreferenceRequest
     * @return UpdateMarketingPreferenceResponse
     */
    public UpdateMarketingPreferenceResponse updateMarketingPreference(UpdateMarketingPreferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMarketingPreferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the message language.</p>
     * 
     * @param request UpdateMessageLanguageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMessageLanguageResponse
     */
    public UpdateMessageLanguageResponse updateMessageLanguageWithOptions(UpdateMessageLanguageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.preferLang)) {
            body.put("PreferLang", request.preferLang);
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
            new TeaPair("action", "UpdateMessageLanguage"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMessageLanguageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the message language.</p>
     * 
     * @param request UpdateMessageLanguageRequest
     * @return UpdateMessageLanguageResponse
     */
    public UpdateMessageLanguageResponse updateMessageLanguage(UpdateMessageLanguageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMessageLanguageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a webhook contact.</p>
     * 
     * @param request UpdateWebhookContactRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWebhookContactResponse
     */
    public UpdateWebhookContactResponse updateWebhookContactWithOptions(UpdateWebhookContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.botSecurityToken)) {
            body.put("BotSecurityToken", request.botSecurityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callerProtocol)) {
            body.put("CallerProtocol", request.callerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSource)) {
            body.put("ClientSource", request.clientSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            body.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookies)) {
            body.put("Cookies", request.cookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            body.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverUrl)) {
            body.put("ServerUrl", request.serverUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcUrl)) {
            body.put("SrcUrl", request.srcUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantCode)) {
            body.put("TenantCode", request.tenantCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidType)) {
            body.put("UidType", request.uidType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verificationCode)) {
            body.put("VerificationCode", request.verificationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookType)) {
            body.put("WebhookType", request.webhookType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWebhookContact"),
            new TeaPair("version", "2024-12-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWebhookContactResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a webhook contact.</p>
     * 
     * @param request UpdateWebhookContactRequest
     * @return UpdateWebhookContactResponse
     */
    public UpdateWebhookContactResponse updateWebhookContact(UpdateWebhookContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWebhookContactWithOptions(request, runtime);
    }
}
