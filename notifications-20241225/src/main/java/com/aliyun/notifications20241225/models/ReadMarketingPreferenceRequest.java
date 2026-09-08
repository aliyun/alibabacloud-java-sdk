// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMarketingPreferenceRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application name of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The business line of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("BizName")
    public String bizName;

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
     * <p>The contact ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("ContactId")
    public Long contactId;

    /**
     * <p>The cookies of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Cookies")
    public String cookies;

    /**
     * <p>The URL of the source page.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("SrcUrl")
    public String srcUrl;

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

    public static ReadMarketingPreferenceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadMarketingPreferenceRequest self = new ReadMarketingPreferenceRequest();
        return TeaModel.build(map, self);
    }

    public ReadMarketingPreferenceRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReadMarketingPreferenceRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ReadMarketingPreferenceRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ReadMarketingPreferenceRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public ReadMarketingPreferenceRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public ReadMarketingPreferenceRequest setContactId(Long contactId) {
        this.contactId = contactId;
        return this;
    }
    public Long getContactId() {
        return this.contactId;
    }

    public ReadMarketingPreferenceRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public ReadMarketingPreferenceRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public ReadMarketingPreferenceRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ReadMarketingPreferenceRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

}
