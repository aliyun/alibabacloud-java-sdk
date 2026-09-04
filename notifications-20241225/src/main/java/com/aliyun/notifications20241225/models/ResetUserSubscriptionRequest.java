// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ResetUserSubscriptionRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application name of the caller.</p>
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
     * <p>The request protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("CallerProtocol")
    public String callerProtocol;

    /**
     * <p>The list of category codes.</p>
     */
    @NameInMap("CategoryCodes")
    public java.util.List<String> categoryCodes;

    /**
     * <p>The channel group. Valid values:</p>
     * <ul>
     * <li>tts: Voice reception management.</li>
     * <li>webhook: Bot reception management.</li>
     * <li>base: Basic reception management.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>base</p>
     */
    @NameInMap("ChannelGroupCode")
    public String channelGroupCode;

    /**
     * <p>The source of the operation terminal.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("ClientSource")
    public String clientSource;

    /**
     * <p>The user cookies.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Cookies")
    public String cookies;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Remarks")
    public String remarks;

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

    public static ResetUserSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetUserSubscriptionRequest self = new ResetUserSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public ResetUserSubscriptionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ResetUserSubscriptionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ResetUserSubscriptionRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ResetUserSubscriptionRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public ResetUserSubscriptionRequest setCategoryCodes(java.util.List<String> categoryCodes) {
        this.categoryCodes = categoryCodes;
        return this;
    }
    public java.util.List<String> getCategoryCodes() {
        return this.categoryCodes;
    }

    public ResetUserSubscriptionRequest setChannelGroupCode(String channelGroupCode) {
        this.channelGroupCode = channelGroupCode;
        return this;
    }
    public String getChannelGroupCode() {
        return this.channelGroupCode;
    }

    public ResetUserSubscriptionRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public ResetUserSubscriptionRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public ResetUserSubscriptionRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public ResetUserSubscriptionRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public ResetUserSubscriptionRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ResetUserSubscriptionRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

}
