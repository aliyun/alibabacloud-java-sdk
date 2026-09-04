// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class CreateWebhookContactRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application name of the caller.</p>
     * 
     * <strong>example:</strong>
     * <p>yunge-user</p>
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
     * <p>The webhook security signature token.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("BotSecurityToken")
    public String botSecurityToken;

    /**
     * <p>The request protocol type.</p>
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

    @NameInMap("SecurityToken")
    @Deprecated
    public String securityToken;

    /**
     * <p>The DingTalk group chatbot URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=xxxxxxx">https://oapi.dingtalk.com/robot/send?access_token=xxxxxxx</a></p>
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
     * <p>The verification code.</p>
     * 
     * <strong>example:</strong>
     * <p>352036</p>
     */
    @NameInMap("VerificationCode")
    public String verificationCode;

    /**
     * <p>The webhook type.</p>
     * 
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("WebhookType")
    public String webhookType;

    public static CreateWebhookContactRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWebhookContactRequest self = new CreateWebhookContactRequest();
        return TeaModel.build(map, self);
    }

    public CreateWebhookContactRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public CreateWebhookContactRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateWebhookContactRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public CreateWebhookContactRequest setBotSecurityToken(String botSecurityToken) {
        this.botSecurityToken = botSecurityToken;
        return this;
    }
    public String getBotSecurityToken() {
        return this.botSecurityToken;
    }

    public CreateWebhookContactRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public CreateWebhookContactRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public CreateWebhookContactRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public CreateWebhookContactRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    @Deprecated
    public CreateWebhookContactRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateWebhookContactRequest setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
        return this;
    }
    public String getServerUrl() {
        return this.serverUrl;
    }

    public CreateWebhookContactRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public CreateWebhookContactRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public CreateWebhookContactRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public CreateWebhookContactRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

    public CreateWebhookContactRequest setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }
    public String getVerificationCode() {
        return this.verificationCode;
    }

    public CreateWebhookContactRequest setWebhookType(String webhookType) {
        this.webhookType = webhookType;
        return this;
    }
    public String getWebhookType() {
        return this.webhookType;
    }

}
