// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadUserSubscriptionListResponseBody extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ReadUserSubscriptionListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>成功</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadUserSubscriptionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadUserSubscriptionListResponseBody self = new ReadUserSubscriptionListResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadUserSubscriptionListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadUserSubscriptionListResponseBody setData(java.util.List<ReadUserSubscriptionListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ReadUserSubscriptionListResponseBodyData> getData() {
        return this.data;
    }

    public ReadUserSubscriptionListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadUserSubscriptionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadUserSubscriptionListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadUserSubscriptionListResponseBodyDataChannelConfigs extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>email</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("CheckedState")
        public String checkedState;

        /**
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("DefaultChecked")
        public String defaultChecked;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("FatigueDayLimit")
        public Integer fatigueDayLimit;

        /**
         * <strong>example:</strong>
         * <p>YES</p>
         */
        @NameInMap("Optional")
        public String optional;

        public static ReadUserSubscriptionListResponseBodyDataChannelConfigs build(java.util.Map<String, ?> map) throws Exception {
            ReadUserSubscriptionListResponseBodyDataChannelConfigs self = new ReadUserSubscriptionListResponseBodyDataChannelConfigs();
            return TeaModel.build(map, self);
        }

        public ReadUserSubscriptionListResponseBodyDataChannelConfigs setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public ReadUserSubscriptionListResponseBodyDataChannelConfigs setCheckedState(String checkedState) {
            this.checkedState = checkedState;
            return this;
        }
        public String getCheckedState() {
            return this.checkedState;
        }

        public ReadUserSubscriptionListResponseBodyDataChannelConfigs setDefaultChecked(String defaultChecked) {
            this.defaultChecked = defaultChecked;
            return this;
        }
        public String getDefaultChecked() {
            return this.defaultChecked;
        }

        public ReadUserSubscriptionListResponseBodyDataChannelConfigs setFatigueDayLimit(Integer fatigueDayLimit) {
            this.fatigueDayLimit = fatigueDayLimit;
            return this;
        }
        public Integer getFatigueDayLimit() {
            return this.fatigueDayLimit;
        }

        public ReadUserSubscriptionListResponseBodyDataChannelConfigs setOptional(String optional) {
            this.optional = optional;
            return this;
        }
        public String getOptional() {
            return this.optional;
        }

    }

    public static class ReadUserSubscriptionListResponseBodyDataContactCommonContactsMessageSource extends TeaModel {
        @NameInMap("KeywordBlacklist")
        public java.util.List<String> keywordBlacklist;

        @NameInMap("KeywordWhitelist")
        public java.util.List<String> keywordWhitelist;

        public static ReadUserSubscriptionListResponseBodyDataContactCommonContactsMessageSource build(java.util.Map<String, ?> map) throws Exception {
            ReadUserSubscriptionListResponseBodyDataContactCommonContactsMessageSource self = new ReadUserSubscriptionListResponseBodyDataContactCommonContactsMessageSource();
            return TeaModel.build(map, self);
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContactsMessageSource setKeywordBlacklist(java.util.List<String> keywordBlacklist) {
            this.keywordBlacklist = keywordBlacklist;
            return this;
        }
        public java.util.List<String> getKeywordBlacklist() {
            return this.keywordBlacklist;
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContactsMessageSource setKeywordWhitelist(java.util.List<String> keywordWhitelist) {
            this.keywordWhitelist = keywordWhitelist;
            return this;
        }
        public java.util.List<String> getKeywordWhitelist() {
            return this.keywordWhitelist;
        }

    }

    public static class ReadUserSubscriptionListResponseBodyDataContactCommonContacts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>t*@qq.*</p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <strong>example:</strong>
         * <p>130*90</p>
         */
        @NameInMap("ContactMobile")
        public String contactMobile;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailConfirmed")
        public Boolean emailConfirmed;

        @NameInMap("MessageSource")
        public ReadUserSubscriptionListResponseBodyDataContactCommonContactsMessageSource messageSource;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MobileConfirmed")
        public Boolean mobileConfirmed;

        /**
         * <strong>example:</strong>
         * <p>CEO</p>
         */
        @NameInMap("Position")
        public String position;

        public static ReadUserSubscriptionListResponseBodyDataContactCommonContacts build(java.util.Map<String, ?> map) throws Exception {
            ReadUserSubscriptionListResponseBodyDataContactCommonContacts self = new ReadUserSubscriptionListResponseBodyDataContactCommonContacts();
            return TeaModel.build(map, self);
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContacts setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContacts setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContacts setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContacts setContactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }
        public String getContactMobile() {
            return this.contactMobile;
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContacts setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContacts setMessageSource(ReadUserSubscriptionListResponseBodyDataContactCommonContactsMessageSource messageSource) {
            this.messageSource = messageSource;
            return this;
        }
        public ReadUserSubscriptionListResponseBodyDataContactCommonContactsMessageSource getMessageSource() {
            return this.messageSource;
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContacts setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        public ReadUserSubscriptionListResponseBodyDataContactCommonContacts setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

    public static class ReadUserSubscriptionListResponseBodyDataContactWebhookContactsMessageSource extends TeaModel {
        @NameInMap("KeywordBlacklist")
        public java.util.List<String> keywordBlacklist;

        @NameInMap("KeywordWhitelist")
        public java.util.List<String> keywordWhitelist;

        public static ReadUserSubscriptionListResponseBodyDataContactWebhookContactsMessageSource build(java.util.Map<String, ?> map) throws Exception {
            ReadUserSubscriptionListResponseBodyDataContactWebhookContactsMessageSource self = new ReadUserSubscriptionListResponseBodyDataContactWebhookContactsMessageSource();
            return TeaModel.build(map, self);
        }

        public ReadUserSubscriptionListResponseBodyDataContactWebhookContactsMessageSource setKeywordBlacklist(java.util.List<String> keywordBlacklist) {
            this.keywordBlacklist = keywordBlacklist;
            return this;
        }
        public java.util.List<String> getKeywordBlacklist() {
            return this.keywordBlacklist;
        }

        public ReadUserSubscriptionListResponseBodyDataContactWebhookContactsMessageSource setKeywordWhitelist(java.util.List<String> keywordWhitelist) {
            this.keywordWhitelist = keywordWhitelist;
            return this;
        }
        public java.util.List<String> getKeywordWhitelist() {
            return this.keywordWhitelist;
        }

    }

    public static class ReadUserSubscriptionListResponseBodyDataContactWebhookContacts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        @NameInMap("MessageSource")
        public ReadUserSubscriptionListResponseBodyDataContactWebhookContactsMessageSource messageSource;

        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("SecurityToken")
        public String securityToken;

        /**
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=xxxxxxxx">https://oapi.dingtalk.com/robot/send?access_token=xxxxxxxx</a></p>
         */
        @NameInMap("ServerUrl")
        public String serverUrl;

        /**
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        @NameInMap("WebhookType")
        public String webhookType;

        public static ReadUserSubscriptionListResponseBodyDataContactWebhookContacts build(java.util.Map<String, ?> map) throws Exception {
            ReadUserSubscriptionListResponseBodyDataContactWebhookContacts self = new ReadUserSubscriptionListResponseBodyDataContactWebhookContacts();
            return TeaModel.build(map, self);
        }

        public ReadUserSubscriptionListResponseBodyDataContactWebhookContacts setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ReadUserSubscriptionListResponseBodyDataContactWebhookContacts setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ReadUserSubscriptionListResponseBodyDataContactWebhookContacts setMessageSource(ReadUserSubscriptionListResponseBodyDataContactWebhookContactsMessageSource messageSource) {
            this.messageSource = messageSource;
            return this;
        }
        public ReadUserSubscriptionListResponseBodyDataContactWebhookContactsMessageSource getMessageSource() {
            return this.messageSource;
        }

        public ReadUserSubscriptionListResponseBodyDataContactWebhookContacts setSecurityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }
        public String getSecurityToken() {
            return this.securityToken;
        }

        public ReadUserSubscriptionListResponseBodyDataContactWebhookContacts setServerUrl(String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }
        public String getServerUrl() {
            return this.serverUrl;
        }

        public ReadUserSubscriptionListResponseBodyDataContactWebhookContacts setWebhookType(String webhookType) {
            this.webhookType = webhookType;
            return this;
        }
        public String getWebhookType() {
            return this.webhookType;
        }

    }

    public static class ReadUserSubscriptionListResponseBodyDataContact extends TeaModel {
        @NameInMap("CommonContacts")
        public java.util.List<ReadUserSubscriptionListResponseBodyDataContactCommonContacts> commonContacts;

        @NameInMap("WebhookContacts")
        public java.util.List<ReadUserSubscriptionListResponseBodyDataContactWebhookContacts> webhookContacts;

        public static ReadUserSubscriptionListResponseBodyDataContact build(java.util.Map<String, ?> map) throws Exception {
            ReadUserSubscriptionListResponseBodyDataContact self = new ReadUserSubscriptionListResponseBodyDataContact();
            return TeaModel.build(map, self);
        }

        public ReadUserSubscriptionListResponseBodyDataContact setCommonContacts(java.util.List<ReadUserSubscriptionListResponseBodyDataContactCommonContacts> commonContacts) {
            this.commonContacts = commonContacts;
            return this;
        }
        public java.util.List<ReadUserSubscriptionListResponseBodyDataContactCommonContacts> getCommonContacts() {
            return this.commonContacts;
        }

        public ReadUserSubscriptionListResponseBodyDataContact setWebhookContacts(java.util.List<ReadUserSubscriptionListResponseBodyDataContactWebhookContacts> webhookContacts) {
            this.webhookContacts = webhookContacts;
            return this;
        }
        public java.util.List<ReadUserSubscriptionListResponseBodyDataContactWebhookContacts> getWebhookContacts() {
            return this.webhookContacts;
        }

    }

    public static class ReadUserSubscriptionListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <strong>example:</strong>
         * <p>prod_edu_content</p>
         */
        @NameInMap("CategoryCode")
        public String categoryCode;

        /**
         * <strong>example:</strong>
         * <p>产品的使用场景、技术分享的相关内容</p>
         */
        @NameInMap("CategoryDesc")
        public String categoryDesc;

        /**
         * <strong>example:</strong>
         * <p>prod_msg</p>
         */
        @NameInMap("CategoryGroupCode")
        public String categoryGroupCode;

        /**
         * <strong>example:</strong>
         * <p>产品消息</p>
         */
        @NameInMap("CategoryGroupName")
        public String categoryGroupName;

        /**
         * <strong>example:</strong>
         * <p>产品教育内容</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        @NameInMap("ChannelConfigs")
        public java.util.List<ReadUserSubscriptionListResponseBodyDataChannelConfigs> channelConfigs;

        @NameInMap("Contact")
        public ReadUserSubscriptionListResponseBodyDataContact contact;

        @NameInMap("ReceiveTimeList")
        public java.util.List<Integer> receiveTimeList;

        public static ReadUserSubscriptionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadUserSubscriptionListResponseBodyData self = new ReadUserSubscriptionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadUserSubscriptionListResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ReadUserSubscriptionListResponseBodyData setCategoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public String getCategoryCode() {
            return this.categoryCode;
        }

        public ReadUserSubscriptionListResponseBodyData setCategoryDesc(String categoryDesc) {
            this.categoryDesc = categoryDesc;
            return this;
        }
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        public ReadUserSubscriptionListResponseBodyData setCategoryGroupCode(String categoryGroupCode) {
            this.categoryGroupCode = categoryGroupCode;
            return this;
        }
        public String getCategoryGroupCode() {
            return this.categoryGroupCode;
        }

        public ReadUserSubscriptionListResponseBodyData setCategoryGroupName(String categoryGroupName) {
            this.categoryGroupName = categoryGroupName;
            return this;
        }
        public String getCategoryGroupName() {
            return this.categoryGroupName;
        }

        public ReadUserSubscriptionListResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ReadUserSubscriptionListResponseBodyData setChannelConfigs(java.util.List<ReadUserSubscriptionListResponseBodyDataChannelConfigs> channelConfigs) {
            this.channelConfigs = channelConfigs;
            return this;
        }
        public java.util.List<ReadUserSubscriptionListResponseBodyDataChannelConfigs> getChannelConfigs() {
            return this.channelConfigs;
        }

        public ReadUserSubscriptionListResponseBodyData setContact(ReadUserSubscriptionListResponseBodyDataContact contact) {
            this.contact = contact;
            return this;
        }
        public ReadUserSubscriptionListResponseBodyDataContact getContact() {
            return this.contact;
        }

        public ReadUserSubscriptionListResponseBodyData setReceiveTimeList(java.util.List<Integer> receiveTimeList) {
            this.receiveTimeList = receiveTimeList;
            return this;
        }
        public java.util.List<Integer> getReceiveTimeList() {
            return this.receiveTimeList;
        }

    }

}
