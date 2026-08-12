// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class GetNotificationContactsResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><strong>200</strong>: Success.</li>
     * <li><strong>Other (400, 500)</strong>: Failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetNotificationContactsResponseBodyData> data;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2FBDD713-00A5-5C98-B661-3FD31A349B6E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation is successful.</p>
     * <ul>
     * <li><strong>true</strong>: Success.</li>
     * <li><strong>false</strong>: Failure.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetNotificationContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNotificationContactsResponseBody self = new GetNotificationContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNotificationContactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetNotificationContactsResponseBody setData(java.util.List<GetNotificationContactsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetNotificationContactsResponseBodyData> getData() {
        return this.data;
    }

    public GetNotificationContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNotificationContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNotificationContactsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNotificationContactsResponseBodyDataChannelConfigs extends TeaModel {
        /**
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>email</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <p>Indicates whether the subscription is configured.</p>
         * <ul>
         * <li><strong>NO</strong></li>
         * <li><strong>YES</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("CheckedState")
        public String checkedState;

        /**
         * <p>Indicates whether the channel is selected by default.</p>
         * <ul>
         * <li><strong>NO</strong></li>
         * <li><strong>YES</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("DefaultChecked")
        public String defaultChecked;

        /**
         * <p>The fatigue limit.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("FatigueDayLimit")
        public Integer fatigueDayLimit;

        /**
         * <p>Indicates whether the channel is modifiable.</p>
         * <ul>
         * <li><strong>NO</strong></li>
         * <li><strong>YES</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("Optional")
        public String optional;

        public static GetNotificationContactsResponseBodyDataChannelConfigs build(java.util.Map<String, ?> map) throws Exception {
            GetNotificationContactsResponseBodyDataChannelConfigs self = new GetNotificationContactsResponseBodyDataChannelConfigs();
            return TeaModel.build(map, self);
        }

        public GetNotificationContactsResponseBodyDataChannelConfigs setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public GetNotificationContactsResponseBodyDataChannelConfigs setCheckedState(String checkedState) {
            this.checkedState = checkedState;
            return this;
        }
        public String getCheckedState() {
            return this.checkedState;
        }

        public GetNotificationContactsResponseBodyDataChannelConfigs setDefaultChecked(String defaultChecked) {
            this.defaultChecked = defaultChecked;
            return this;
        }
        public String getDefaultChecked() {
            return this.defaultChecked;
        }

        public GetNotificationContactsResponseBodyDataChannelConfigs setFatigueDayLimit(Integer fatigueDayLimit) {
            this.fatigueDayLimit = fatigueDayLimit;
            return this;
        }
        public Integer getFatigueDayLimit() {
            return this.fatigueDayLimit;
        }

        public GetNotificationContactsResponseBodyDataChannelConfigs setOptional(String optional) {
            this.optional = optional;
            return this;
        }
        public String getOptional() {
            return this.optional;
        }

    }

    public static class GetNotificationContactsResponseBodyDataContactInfoList extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1492387044070147</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>Indicates whether the contact is bound.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>fasle</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("BindContact")
        public Boolean bindContact;

        /**
         * <p>The contact email address.</p>
         * 
         * <strong>example:</strong>
         * <p>t*@qq.*</p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <p>The Account Center contact ID. A value of 0 indicates the account contact.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>The Account Center contact mobile number (masked).</p>
         * 
         * <strong>example:</strong>
         * <p>13580xxx136</p>
         */
        @NameInMap("ContactMobile")
        public String contactMobile;

        /**
         * <p>The Account Center contact name.</p>
         * 
         * <strong>example:</strong>
         * <p>shianyu</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>Indicates whether the email address is verified.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailConfirmed")
        public Boolean emailConfirmed;

        /**
         * <p>Indicates whether the Account Center contact mobile number is verified.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MobileConfirmed")
        public Boolean mobileConfirmed;

        /**
         * <p>The Account Center contact position.</p>
         * 
         * <strong>example:</strong>
         * <p>CEO</p>
         */
        @NameInMap("Position")
        public String position;

        public static GetNotificationContactsResponseBodyDataContactInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetNotificationContactsResponseBodyDataContactInfoList self = new GetNotificationContactsResponseBodyDataContactInfoList();
            return TeaModel.build(map, self);
        }

        public GetNotificationContactsResponseBodyDataContactInfoList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetNotificationContactsResponseBodyDataContactInfoList setBindContact(Boolean bindContact) {
            this.bindContact = bindContact;
            return this;
        }
        public Boolean getBindContact() {
            return this.bindContact;
        }

        public GetNotificationContactsResponseBodyDataContactInfoList setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public GetNotificationContactsResponseBodyDataContactInfoList setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public GetNotificationContactsResponseBodyDataContactInfoList setContactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }
        public String getContactMobile() {
            return this.contactMobile;
        }

        public GetNotificationContactsResponseBodyDataContactInfoList setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public GetNotificationContactsResponseBodyDataContactInfoList setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public GetNotificationContactsResponseBodyDataContactInfoList setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        public GetNotificationContactsResponseBodyDataContactInfoList setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

    public static class GetNotificationContactsResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1355290655619147</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The message category code.</p>
         * 
         * <strong>example:</strong>
         * <p>prod_edu_content</p>
         */
        @NameInMap("CategoryCode")
        public String categoryCode;

        /**
         * <p>The message category description.</p>
         * 
         * <strong>example:</strong>
         * <p>Product usage scenarios and technical sharing content.</p>
         */
        @NameInMap("CategoryDesc")
        public String categoryDesc;

        /**
         * <p>The category group code.</p>
         * 
         * <strong>example:</strong>
         * <p>prod_msg</p>
         */
        @NameInMap("CategoryGroupCode")
        public String categoryGroupCode;

        /**
         * <p>The category group name.</p>
         * 
         * <strong>example:</strong>
         * <p>Product messages.</p>
         */
        @NameInMap("CategoryGroupName")
        public String categoryGroupName;

        /**
         * <p>The message category name.</p>
         * 
         * <strong>example:</strong>
         * <p>Product educational content.</p>
         */
        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <p>The channel list.</p>
         */
        @NameInMap("ChannelConfigs")
        public java.util.List<GetNotificationContactsResponseBodyDataChannelConfigs> channelConfigs;

        /**
         * <p>Indicates whether all notification methods are selected.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ChooseAllChannel")
        public Boolean chooseAllChannel;

        /**
         * <p>The general contact list.</p>
         */
        @NameInMap("ContactInfoList")
        public java.util.List<GetNotificationContactsResponseBodyDataContactInfoList> contactInfoList;

        public static GetNotificationContactsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetNotificationContactsResponseBodyData self = new GetNotificationContactsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetNotificationContactsResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetNotificationContactsResponseBodyData setCategoryCode(String categoryCode) {
            this.categoryCode = categoryCode;
            return this;
        }
        public String getCategoryCode() {
            return this.categoryCode;
        }

        public GetNotificationContactsResponseBodyData setCategoryDesc(String categoryDesc) {
            this.categoryDesc = categoryDesc;
            return this;
        }
        public String getCategoryDesc() {
            return this.categoryDesc;
        }

        public GetNotificationContactsResponseBodyData setCategoryGroupCode(String categoryGroupCode) {
            this.categoryGroupCode = categoryGroupCode;
            return this;
        }
        public String getCategoryGroupCode() {
            return this.categoryGroupCode;
        }

        public GetNotificationContactsResponseBodyData setCategoryGroupName(String categoryGroupName) {
            this.categoryGroupName = categoryGroupName;
            return this;
        }
        public String getCategoryGroupName() {
            return this.categoryGroupName;
        }

        public GetNotificationContactsResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetNotificationContactsResponseBodyData setChannelConfigs(java.util.List<GetNotificationContactsResponseBodyDataChannelConfigs> channelConfigs) {
            this.channelConfigs = channelConfigs;
            return this;
        }
        public java.util.List<GetNotificationContactsResponseBodyDataChannelConfigs> getChannelConfigs() {
            return this.channelConfigs;
        }

        public GetNotificationContactsResponseBodyData setChooseAllChannel(Boolean chooseAllChannel) {
            this.chooseAllChannel = chooseAllChannel;
            return this;
        }
        public Boolean getChooseAllChannel() {
            return this.chooseAllChannel;
        }

        public GetNotificationContactsResponseBodyData setContactInfoList(java.util.List<GetNotificationContactsResponseBodyDataContactInfoList> contactInfoList) {
            this.contactInfoList = contactInfoList;
            return this;
        }
        public java.util.List<GetNotificationContactsResponseBodyDataContactInfoList> getContactInfoList() {
            return this.contactInfoList;
        }

    }

}
