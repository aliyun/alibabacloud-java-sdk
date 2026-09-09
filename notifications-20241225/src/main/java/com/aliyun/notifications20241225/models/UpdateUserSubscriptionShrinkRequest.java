// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class UpdateUserSubscriptionShrinkRequest extends TeaModel {
    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh-CN</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The application name of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>yunge-user</p>
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
     * <p>The list of categories.</p>
     */
    @NameInMap("CategoryCodes")
    public String categoryCodesShrink;

    /**
     * <p>The list of channels.</p>
     */
    @NameInMap("ChannelConfigs")
    public String channelConfigsShrink;

    /**
     * <p>The channel group. Valid values:</p>
     * <ul>
     * <li>tts: Voice channel group.</li>
     * <li>webhook: Chatbot channel group.</li>
     * <li>base: Basic channel group.</li>
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
     * <p>The common contacts.</p>
     */
    @NameInMap("CommonContacts")
    public String commonContactsShrink;

    /**
     * <p>The user cookies.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Cookies")
    public String cookies;

    /**
     * <p>The revision type. Valid values:</p>
     * <ul>
     * <li>receive_contact: Receive contact.</li>
     * <li>receive_channel: Receive channel.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>receive_channel</p>
     */
    @NameInMap("OperationItemCode")
    public String operationItemCode;

    /**
     * <p>Not supported.</p>
     */
    @NameInMap("ReceiveTimeList")
    public String receiveTimeListShrink;

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

    /**
     * <p>The list of chatbot contacts.</p>
     */
    @NameInMap("WebhookContacts")
    public String webhookContactsShrink;

    public static UpdateUserSubscriptionShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserSubscriptionShrinkRequest self = new UpdateUserSubscriptionShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserSubscriptionShrinkRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateUserSubscriptionShrinkRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateUserSubscriptionShrinkRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public UpdateUserSubscriptionShrinkRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public UpdateUserSubscriptionShrinkRequest setCategoryCodesShrink(String categoryCodesShrink) {
        this.categoryCodesShrink = categoryCodesShrink;
        return this;
    }
    public String getCategoryCodesShrink() {
        return this.categoryCodesShrink;
    }

    public UpdateUserSubscriptionShrinkRequest setChannelConfigsShrink(String channelConfigsShrink) {
        this.channelConfigsShrink = channelConfigsShrink;
        return this;
    }
    public String getChannelConfigsShrink() {
        return this.channelConfigsShrink;
    }

    public UpdateUserSubscriptionShrinkRequest setChannelGroupCode(String channelGroupCode) {
        this.channelGroupCode = channelGroupCode;
        return this;
    }
    public String getChannelGroupCode() {
        return this.channelGroupCode;
    }

    public UpdateUserSubscriptionShrinkRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public UpdateUserSubscriptionShrinkRequest setCommonContactsShrink(String commonContactsShrink) {
        this.commonContactsShrink = commonContactsShrink;
        return this;
    }
    public String getCommonContactsShrink() {
        return this.commonContactsShrink;
    }

    public UpdateUserSubscriptionShrinkRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public UpdateUserSubscriptionShrinkRequest setOperationItemCode(String operationItemCode) {
        this.operationItemCode = operationItemCode;
        return this;
    }
    public String getOperationItemCode() {
        return this.operationItemCode;
    }

    public UpdateUserSubscriptionShrinkRequest setReceiveTimeListShrink(String receiveTimeListShrink) {
        this.receiveTimeListShrink = receiveTimeListShrink;
        return this;
    }
    public String getReceiveTimeListShrink() {
        return this.receiveTimeListShrink;
    }

    public UpdateUserSubscriptionShrinkRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public UpdateUserSubscriptionShrinkRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public UpdateUserSubscriptionShrinkRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public UpdateUserSubscriptionShrinkRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

    public UpdateUserSubscriptionShrinkRequest setWebhookContactsShrink(String webhookContactsShrink) {
        this.webhookContactsShrink = webhookContactsShrink;
        return this;
    }
    public String getWebhookContactsShrink() {
        return this.webhookContactsShrink;
    }

}
