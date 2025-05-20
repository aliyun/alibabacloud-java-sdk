// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageNewTotalRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("CallerProtocol")
    public String callerProtocol;

    @NameInMap("ClientSource")
    public String clientSource;

    @NameInMap("Cookies")
    public String cookies;

    @NameInMap("SrcUrl")
    public String srcUrl;

    @NameInMap("TenantCode")
    public String tenantCode;

    @NameInMap("UidType")
    public String uidType;

    public static ReadMessageNewTotalRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageNewTotalRequest self = new ReadMessageNewTotalRequest();
        return TeaModel.build(map, self);
    }

    public ReadMessageNewTotalRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReadMessageNewTotalRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ReadMessageNewTotalRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ReadMessageNewTotalRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public ReadMessageNewTotalRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public ReadMessageNewTotalRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public ReadMessageNewTotalRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public ReadMessageNewTotalRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ReadMessageNewTotalRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

}
