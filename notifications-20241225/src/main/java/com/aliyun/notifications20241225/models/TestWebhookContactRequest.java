// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class TestWebhookContactRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the caller application.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The business line of the caller.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The security token.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("BotSecurityToken")
    public String botSecurityToken;

    /**
     * <p>The type of the request protocol.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("CallerProtocol")
    public String callerProtocol;

    /**
     * <p>The source of the operation terminal.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("ClientSource")
    public String clientSource;

    /**
     * <p>webhook id</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The name of the webhook contact.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ContactName")
    public String contactName;

    /**
     * <p>The user cookies.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Cookies")
    public String cookies;

    /**
     * <p>The webhook server URL.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("ServerUrl")
    public String serverUrl;

    /**
     * <p>The URL of the source page.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("SrcUrl")
    public String srcUrl;

    /**
     * <p>The template code.</p>
     * 
     * <strong>example:</strong>
     * <p>lark</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The tenant information.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    /**
     * <p>The user type.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("UidType")
    public String uidType;

    /**
     * <p>The webhook type.</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("WebhookType")
    public String webhookType;

    public static TestWebhookContactRequest build(java.util.Map<String, ?> map) throws Exception {
        TestWebhookContactRequest self = new TestWebhookContactRequest();
        return TeaModel.build(map, self);
    }

    public TestWebhookContactRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public TestWebhookContactRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public TestWebhookContactRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public TestWebhookContactRequest setBotSecurityToken(String botSecurityToken) {
        this.botSecurityToken = botSecurityToken;
        return this;
    }
    public String getBotSecurityToken() {
        return this.botSecurityToken;
    }

    public TestWebhookContactRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public TestWebhookContactRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public TestWebhookContactRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public TestWebhookContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public TestWebhookContactRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public TestWebhookContactRequest setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }

    public TestWebhookContactRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public TestWebhookContactRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public TestWebhookContactRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public TestWebhookContactRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

    public TestWebhookContactRequest setWebhookType(String webhookType) {
        this.webhookType = webhookType;
        return this;
    }
    public String getWebhookType() {
        return this.webhookType;
    }

}
