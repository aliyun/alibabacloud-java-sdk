// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220318.models;

import com.aliyun.tea.*;

public class ModifyApplicationShrinkRequest extends TeaModel {
    // AppId
    @NameInMap("AppCode")
    public String appCode;

    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // dynamic（动态业务）/static（静态业务
    @NameInMap("AppTypeList")
    public String appTypeListShrink;

    // 扩展属性 源域名和源ip信息保存
    @NameInMap("AppingList")
    public String appingListShrink;

    // 请求幂等
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("app_ip")
    public String appIp;

    @NameInMap("callerParentId")
    public Long callerParentId;

    @NameInMap("callerType")
    public String callerType;

    @NameInMap("callerUid")
    public Long callerUid;

    @NameInMap("resource")
    public String resource;

    // sts 主账号
    @NameInMap("stsParentAccount")
    public Long stsParentAccount;

    // sts 子账号
    @NameInMap("stsTokenCallerUid")
    public Long stsTokenCallerUid;

    public static ModifyApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApplicationShrinkRequest self = new ModifyApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApplicationShrinkRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public ModifyApplicationShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public ModifyApplicationShrinkRequest setAppTypeListShrink(String appTypeListShrink) {
        this.appTypeListShrink = appTypeListShrink;
        return this;
    }
    public String getAppTypeListShrink() {
        return this.appTypeListShrink;
    }

    public ModifyApplicationShrinkRequest setAppingListShrink(String appingListShrink) {
        this.appingListShrink = appingListShrink;
        return this;
    }
    public String getAppingListShrink() {
        return this.appingListShrink;
    }

    public ModifyApplicationShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyApplicationShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyApplicationShrinkRequest setAppIp(String appIp) {
        this.appIp = appIp;
        return this;
    }
    public String getAppIp() {
        return this.appIp;
    }

    public ModifyApplicationShrinkRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public ModifyApplicationShrinkRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public ModifyApplicationShrinkRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public ModifyApplicationShrinkRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public ModifyApplicationShrinkRequest setStsParentAccount(Long stsParentAccount) {
        this.stsParentAccount = stsParentAccount;
        return this;
    }
    public Long getStsParentAccount() {
        return this.stsParentAccount;
    }

    public ModifyApplicationShrinkRequest setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

}
