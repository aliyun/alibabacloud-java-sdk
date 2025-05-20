// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMessageContentRequest extends TeaModel {
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

    @NameInMap("MsgId")
    public String msgId;

    @NameInMap("SrcUrl")
    public String srcUrl;

    @NameInMap("Status")
    public Integer status;

    @NameInMap("TenantCode")
    public String tenantCode;

    @NameInMap("UidType")
    public String uidType;

    public static ReadMessageContentRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageContentRequest self = new ReadMessageContentRequest();
        return TeaModel.build(map, self);
    }

    public ReadMessageContentRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public ReadMessageContentRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ReadMessageContentRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public ReadMessageContentRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public ReadMessageContentRequest setClassId(Long classId) {
        this.classId = classId;
        return this;
    }
    public Long getClassId() {
        return this.classId;
    }

    public ReadMessageContentRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public ReadMessageContentRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public ReadMessageContentRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public ReadMessageContentRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public ReadMessageContentRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ReadMessageContentRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public ReadMessageContentRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

}
