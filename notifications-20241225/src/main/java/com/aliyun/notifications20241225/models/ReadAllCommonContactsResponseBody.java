// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadAllCommonContactsResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The query result.</p>
     */
    @NameInMap("Data")
    public java.util.List<ReadAllCommonContactsResponseBodyData> data;

    /**
     * <p>The result message.</p>
     * 
     * <strong>example:</strong>
     * <p>/</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>73FD6AE8-898F-5D09-9763-69B8A875488A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li>true: The call was successful.</li>
     * <li>false: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadAllCommonContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadAllCommonContactsResponseBody self = new ReadAllCommonContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadAllCommonContactsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadAllCommonContactsResponseBody setData(java.util.List<ReadAllCommonContactsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ReadAllCommonContactsResponseBodyData> getData() {
        return this.data;
    }

    public ReadAllCommonContactsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadAllCommonContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadAllCommonContactsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadAllCommonContactsResponseBodyData extends TeaModel {
        /**
         * <p>The Alibaba Cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>/</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The email address of the contact.</p>
         * 
         * <strong>example:</strong>
         * <p>t*@qq.*</p>
         */
        @NameInMap("ContactEmail")
        public String contactEmail;

        /**
         * <p>The contact ID in the Account Center. A value of 0 indicates the account contact.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>The mobile phone number of the contact in the Account Center (masked).</p>
         * 
         * <strong>example:</strong>
         * <p>130**123</p>
         */
        @NameInMap("ContactMobile")
        public String contactMobile;

        /**
         * <p>The contact name in the Account Center.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>Indicates whether the email address is verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailConfirmed")
        public Boolean emailConfirmed;

        /**
         * <p>Indicates whether the mobile phone number of the contact in the Account Center is verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MobileConfirmed")
        public Boolean mobileConfirmed;

        /**
         * <p>The position of the contact in the Account Center.</p>
         * 
         * <strong>example:</strong>
         * <p>CEO</p>
         */
        @NameInMap("Position")
        public String position;

        public static ReadAllCommonContactsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadAllCommonContactsResponseBodyData self = new ReadAllCommonContactsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadAllCommonContactsResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ReadAllCommonContactsResponseBodyData setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public ReadAllCommonContactsResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ReadAllCommonContactsResponseBodyData setContactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }
        public String getContactMobile() {
            return this.contactMobile;
        }

        public ReadAllCommonContactsResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ReadAllCommonContactsResponseBodyData setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public ReadAllCommonContactsResponseBodyData setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        public ReadAllCommonContactsResponseBodyData setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

}
