// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class UpdateUserSubscriptionRequest extends TeaModel {
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
    public java.util.List<String> categoryCodes;

    /**
     * <p>The list of channels.</p>
     */
    @NameInMap("ChannelConfigs")
    public java.util.List<UpdateUserSubscriptionRequestChannelConfigs> channelConfigs;

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
    public java.util.List<UpdateUserSubscriptionRequestCommonContacts> commonContacts;

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
    public java.util.List<Integer> receiveTimeList;

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
    public java.util.List<UpdateUserSubscriptionRequestWebhookContacts> webhookContacts;

    public static UpdateUserSubscriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserSubscriptionRequest self = new UpdateUserSubscriptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserSubscriptionRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public UpdateUserSubscriptionRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateUserSubscriptionRequest setBizName(String bizName) {
        this.bizName = bizName;
        return this;
    }
    public String getBizName() {
        return this.bizName;
    }

    public UpdateUserSubscriptionRequest setCallerProtocol(String callerProtocol) {
        this.callerProtocol = callerProtocol;
        return this;
    }
    public String getCallerProtocol() {
        return this.callerProtocol;
    }

    public UpdateUserSubscriptionRequest setCategoryCodes(java.util.List<String> categoryCodes) {
        this.categoryCodes = categoryCodes;
        return this;
    }
    public java.util.List<String> getCategoryCodes() {
        return this.categoryCodes;
    }

    public UpdateUserSubscriptionRequest setChannelConfigs(java.util.List<UpdateUserSubscriptionRequestChannelConfigs> channelConfigs) {
        this.channelConfigs = channelConfigs;
        return this;
    }
    public java.util.List<UpdateUserSubscriptionRequestChannelConfigs> getChannelConfigs() {
        return this.channelConfigs;
    }

    public UpdateUserSubscriptionRequest setChannelGroupCode(String channelGroupCode) {
        this.channelGroupCode = channelGroupCode;
        return this;
    }
    public String getChannelGroupCode() {
        return this.channelGroupCode;
    }

    public UpdateUserSubscriptionRequest setClientSource(String clientSource) {
        this.clientSource = clientSource;
        return this;
    }
    public String getClientSource() {
        return this.clientSource;
    }

    public UpdateUserSubscriptionRequest setCommonContacts(java.util.List<UpdateUserSubscriptionRequestCommonContacts> commonContacts) {
        this.commonContacts = commonContacts;
        return this;
    }
    public java.util.List<UpdateUserSubscriptionRequestCommonContacts> getCommonContacts() {
        return this.commonContacts;
    }

    public UpdateUserSubscriptionRequest setCookies(String cookies) {
        this.cookies = cookies;
        return this;
    }
    public String getCookies() {
        return this.cookies;
    }

    public UpdateUserSubscriptionRequest setOperationItemCode(String operationItemCode) {
        this.operationItemCode = operationItemCode;
        return this;
    }
    public String getOperationItemCode() {
        return this.operationItemCode;
    }

    public UpdateUserSubscriptionRequest setReceiveTimeList(java.util.List<Integer> receiveTimeList) {
        this.receiveTimeList = receiveTimeList;
        return this;
    }
    public java.util.List<Integer> getReceiveTimeList() {
        return this.receiveTimeList;
    }

    public UpdateUserSubscriptionRequest setRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }
    public String getRemarks() {
        return this.remarks;
    }

    public UpdateUserSubscriptionRequest setSrcUrl(String srcUrl) {
        this.srcUrl = srcUrl;
        return this;
    }
    public String getSrcUrl() {
        return this.srcUrl;
    }

    public UpdateUserSubscriptionRequest setTenantCode(String tenantCode) {
        this.tenantCode = tenantCode;
        return this;
    }
    public String getTenantCode() {
        return this.tenantCode;
    }

    public UpdateUserSubscriptionRequest setUidType(String uidType) {
        this.uidType = uidType;
        return this;
    }
    public String getUidType() {
        return this.uidType;
    }

    public UpdateUserSubscriptionRequest setWebhookContacts(java.util.List<UpdateUserSubscriptionRequestWebhookContacts> webhookContacts) {
        this.webhookContacts = webhookContacts;
        return this;
    }
    public java.util.List<UpdateUserSubscriptionRequestWebhookContacts> getWebhookContacts() {
        return this.webhookContacts;
    }

    public static class UpdateUserSubscriptionRequestChannelConfigs extends TeaModel {
        /**
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>pmsg</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <p>Specifies whether the channel is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("CheckedState")
        public String checkedState;

        /**
         * <p>The fatigue threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("FatigueDayLimit")
        public Integer fatigueDayLimit;

        public static UpdateUserSubscriptionRequestChannelConfigs build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserSubscriptionRequestChannelConfigs self = new UpdateUserSubscriptionRequestChannelConfigs();
            return TeaModel.build(map, self);
        }

        public UpdateUserSubscriptionRequestChannelConfigs setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public UpdateUserSubscriptionRequestChannelConfigs setCheckedState(String checkedState) {
            this.checkedState = checkedState;
            return this;
        }
        public String getCheckedState() {
            return this.checkedState;
        }

        public UpdateUserSubscriptionRequestChannelConfigs setFatigueDayLimit(Integer fatigueDayLimit) {
            this.fatigueDayLimit = fatigueDayLimit;
            return this;
        }
        public Integer getFatigueDayLimit() {
            return this.fatigueDayLimit;
        }

    }

    public static class UpdateUserSubscriptionRequestCommonContactsMessageSource extends TeaModel {
        /**
         * <p>The blacklist.</p>
         */
        @NameInMap("KeywordBlacklist")
        public java.util.List<String> keywordBlacklist;

        /**
         * <p>The whitelist.</p>
         */
        @NameInMap("KeywordWhitelist")
        public java.util.List<String> keywordWhitelist;

        public static UpdateUserSubscriptionRequestCommonContactsMessageSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserSubscriptionRequestCommonContactsMessageSource self = new UpdateUserSubscriptionRequestCommonContactsMessageSource();
            return TeaModel.build(map, self);
        }

        public UpdateUserSubscriptionRequestCommonContactsMessageSource setKeywordBlacklist(java.util.List<String> keywordBlacklist) {
            this.keywordBlacklist = keywordBlacklist;
            return this;
        }
        public java.util.List<String> getKeywordBlacklist() {
            return this.keywordBlacklist;
        }

        public UpdateUserSubscriptionRequestCommonContactsMessageSource setKeywordWhitelist(java.util.List<String> keywordWhitelist) {
            this.keywordWhitelist = keywordWhitelist;
            return this;
        }
        public java.util.List<String> getKeywordWhitelist() {
            return this.keywordWhitelist;
        }

    }

    public static class UpdateUserSubscriptionRequestCommonContacts extends TeaModel {
        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <p>The contact ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("ContactMobile")
        public String contactMobile;

        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("EmailConfirmed")
        public Boolean emailConfirmed;

        /**
         * <p>The message source.</p>
         */
        @NameInMap("MessageSource")
        public UpdateUserSubscriptionRequestCommonContactsMessageSource messageSource;

        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("MobileConfirmed")
        public Boolean mobileConfirmed;

        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("Position")
        public String position;

        public static UpdateUserSubscriptionRequestCommonContacts build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserSubscriptionRequestCommonContacts self = new UpdateUserSubscriptionRequestCommonContacts();
            return TeaModel.build(map, self);
        }

        public UpdateUserSubscriptionRequestCommonContacts setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public UpdateUserSubscriptionRequestCommonContacts setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public UpdateUserSubscriptionRequestCommonContacts setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public UpdateUserSubscriptionRequestCommonContacts setContactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }
        public String getContactMobile() {
            return this.contactMobile;
        }

        public UpdateUserSubscriptionRequestCommonContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public UpdateUserSubscriptionRequestCommonContacts setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public UpdateUserSubscriptionRequestCommonContacts setMessageSource(UpdateUserSubscriptionRequestCommonContactsMessageSource messageSource) {
            this.messageSource = messageSource;
            return this;
        }
        public UpdateUserSubscriptionRequestCommonContactsMessageSource getMessageSource() {
            return this.messageSource;
        }

        public UpdateUserSubscriptionRequestCommonContacts setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        public UpdateUserSubscriptionRequestCommonContacts setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

    public static class UpdateUserSubscriptionRequestWebhookContactsMessageSource extends TeaModel {
        /**
         * <p>The blacklist.</p>
         */
        @NameInMap("KeywordBlacklist")
        public java.util.List<String> keywordBlacklist;

        /**
         * <p>The whitelist.</p>
         */
        @NameInMap("KeywordWhitelist")
        public java.util.List<String> keywordWhitelist;

        public static UpdateUserSubscriptionRequestWebhookContactsMessageSource build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserSubscriptionRequestWebhookContactsMessageSource self = new UpdateUserSubscriptionRequestWebhookContactsMessageSource();
            return TeaModel.build(map, self);
        }

        public UpdateUserSubscriptionRequestWebhookContactsMessageSource setKeywordBlacklist(java.util.List<String> keywordBlacklist) {
            this.keywordBlacklist = keywordBlacklist;
            return this;
        }
        public java.util.List<String> getKeywordBlacklist() {
            return this.keywordBlacklist;
        }

        public UpdateUserSubscriptionRequestWebhookContactsMessageSource setKeywordWhitelist(java.util.List<String> keywordWhitelist) {
            this.keywordWhitelist = keywordWhitelist;
            return this;
        }
        public java.util.List<String> getKeywordWhitelist() {
            return this.keywordWhitelist;
        }

    }

    public static class UpdateUserSubscriptionRequestWebhookContacts extends TeaModel {
        /**
         * <p>webhook id</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The message source.</p>
         */
        @NameInMap("MessageSource")
        public UpdateUserSubscriptionRequestWebhookContactsMessageSource messageSource;

        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("ServerUrl")
        public String serverUrl;

        /**
         * <p>No input required.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("WebhookType")
        public String webhookType;

        public static UpdateUserSubscriptionRequestWebhookContacts build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserSubscriptionRequestWebhookContacts self = new UpdateUserSubscriptionRequestWebhookContacts();
            return TeaModel.build(map, self);
        }

        public UpdateUserSubscriptionRequestWebhookContacts setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public UpdateUserSubscriptionRequestWebhookContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public UpdateUserSubscriptionRequestWebhookContacts setMessageSource(UpdateUserSubscriptionRequestWebhookContactsMessageSource messageSource) {
            this.messageSource = messageSource;
            return this;
        }
        public UpdateUserSubscriptionRequestWebhookContactsMessageSource getMessageSource() {
            return this.messageSource;
        }

        public UpdateUserSubscriptionRequestWebhookContacts setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public UpdateUserSubscriptionRequestWebhookContacts setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public UpdateUserSubscriptionRequestWebhookContacts setWebhookType(String webhookType) {
            this.webhookType = webhookType;
            return this;
        }
        public String getWebhookType() {
            return this.webhookType;
        }

    }

}
