// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class DelMessageRequest extends TeaModel {
    /**
     * <p>The language. Default value: zh-CN (Simplified Chinese).</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>A system parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>A system parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("BizName")
    public String bizName;

    /**
     * <p>A system parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("CallerProtocol")
    public String callerProtocol;

    /**
     * <p>A system parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("ClientSource")
    public String clientSource;

    /**
     * <p>A system parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Cookies")
    public String cookies;

    /**
     * <p>The message ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3727683838</p>
     */
    @NameInMap("MsgId")
    public String msgId;

    /**
     * <p>A system parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("SrcUrl")
    public String srcUrl;

    /**
     * <p>A system parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("TenantCode")
    public String tenantCode;

    /**
     * <p>A system parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("UidType")
    public String uidType;

    public static DelMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        DelMessageRequest self = new DelMessageRequest();
        return TeaModel.build(map, self);
    }

    public DelMessageRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public DelMessageRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DelMessageRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public DelMessageRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public DelMessageRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public DelMessageRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public DelMessageRequest setMsgId(String msgId) {
        this.msgId = msgId;
        return this;
    }
    public String getMsgId() {
        return this.msgId;
    }

    public DelMessageRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public DelMessageRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public DelMessageRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

}
