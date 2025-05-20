// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadAllMessageRequest extends TeaModel {
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("BizName")
    public String bizName;

    @NameInMap("CallerProtocol")
    public String callerProtocol;

    @NameInMap("ClassId")
    public Long classId;

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

    public static ReadAllMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadAllMessageRequest self = new ReadAllMessageRequest();
        return TeaModel.build(map, self);
    }

    public ReadAllMessageRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReadAllMessageRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ReadAllMessageRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ReadAllMessageRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public ReadAllMessageRequest setClassId(Long classId) {
        this.classId = classId;
        return this;
    }
    public Long getClassId() {
        return this.classId;
    }

    public ReadAllMessageRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public ReadAllMessageRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public ReadAllMessageRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public ReadAllMessageRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ReadAllMessageRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

}
