// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220318.models;

import com.aliyun.tea.*;

public class CreateApplicationShrinkRequest extends TeaModel {
    // 阿里UID
    @NameInMap("AliUid")
    public Long aliUid;

    // 应用名称
    @NameInMap("AppName")
    public String appName;

    // dynamic（动态业务）/static（静态业务
    @NameInMap("AppTypeList")
    public String appTypeListShrink;

    @NameInMap("AppingList")
    public String appingListShrink;

    // 商品code
    @NameInMap("ItemCode")
    public String itemCode;

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

    public static CreateApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationShrinkRequest self = new CreateApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationShrinkRequest setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public CreateApplicationShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CreateApplicationShrinkRequest setAppTypeListShrink(String appTypeListShrink) {
        this.appTypeListShrink = appTypeListShrink;
        return this;
    }
    public String getAppTypeListShrink() {
        return this.appTypeListShrink;
    }

    public CreateApplicationShrinkRequest setAppingListShrink(String appingListShrink) {
        this.appingListShrink = appingListShrink;
        return this;
    }
    public String getAppingListShrink() {
        return this.appingListShrink;
    }

    public CreateApplicationShrinkRequest setItemCode(String itemCode) {
        this.itemCode = itemCode;
        return this;
    }
    public String getItemCode() {
        return this.itemCode;
    }

    public CreateApplicationShrinkRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApplicationShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateApplicationShrinkRequest setAppIp(String appIp) {
        this.appIp = appIp;
        return this;
    }
    public String getAppIp() {
        return this.appIp;
    }

    public CreateApplicationShrinkRequest setCallerParentId(Long callerParentId) {
        this.callerParentId = callerParentId;
        return this;
    }
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    public CreateApplicationShrinkRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public CreateApplicationShrinkRequest setCallerUid(Long callerUid) {
        this.callerUid = callerUid;
        return this;
    }
    public Long getCallerUid() {
        return this.callerUid;
    }

    public CreateApplicationShrinkRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public CreateApplicationShrinkRequest setStsParentAccount(Long stsParentAccount) {
        this.stsParentAccount = stsParentAccount;
        return this;
    }
    public Long getStsParentAccount() {
        return this.stsParentAccount;
    }

    public CreateApplicationShrinkRequest setStsTokenCallerUid(Long stsTokenCallerUid) {
        this.stsTokenCallerUid = stsTokenCallerUid;
        return this;
    }
    public Long getStsTokenCallerUid() {
        return this.stsTokenCallerUid;
    }

}
