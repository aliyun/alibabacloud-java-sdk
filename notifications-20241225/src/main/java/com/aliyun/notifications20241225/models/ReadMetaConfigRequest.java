// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMetaConfigRequest extends TeaModel {
    /**
     * <p>The language type of the returned information. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application project name of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxApp</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The business line of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>SystemAlerts</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>The request protocol type.</p>
     * 
     * <strong>example:</strong>
     * <p>https</p>
     */
    @NameInMap("CallerProtocol")
    public String callerProtocol;

    /**
     * <p>The source of the operation terminal.</p>
     * 
     * <strong>example:</strong>
     * <p>h5</p>
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
     * <p>The URL of the source page.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/notify,0">https://example.com/notify,0</a></p>
     */
    @NameInMap("SrcUrl")
    public String srcUrl;

    /**
     * <p>The tenant information.</p>
     * 
     * <strong>example:</strong>
     * <p>T002</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    /**
     * <p>The user type.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyunPk</p>
     */
    @NameInMap("UidType")
    public String uidType;

    public static ReadMetaConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadMetaConfigRequest self = new ReadMetaConfigRequest();
        return TeaModel.build(map, self);
    }

    public ReadMetaConfigRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReadMetaConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ReadMetaConfigRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ReadMetaConfigRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public ReadMetaConfigRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public ReadMetaConfigRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public ReadMetaConfigRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public ReadMetaConfigRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ReadMetaConfigRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

}
