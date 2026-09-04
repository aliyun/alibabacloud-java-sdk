// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadCommonContactResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the call failed. For more information, see error codes.</p>
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
    public ReadCommonContactResponseBodyData data;

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
     * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
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

    public static ReadCommonContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadCommonContactResponseBody self = new ReadCommonContactResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadCommonContactResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadCommonContactResponseBody setData(ReadCommonContactResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadCommonContactResponseBodyData getData() {
        return this.data;
    }

    public ReadCommonContactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadCommonContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadCommonContactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadCommonContactResponseBodyData extends TeaModel {
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
         * <p>The contact ID in Account Center. A value of 0 indicates the account contact.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ContactId")
        public Long contactId;

        /**
         * <p>The mobile phone number of the contact in Account Center (masked).</p>
         * 
         * <strong>example:</strong>
         * <p>130**123</p>
         */
        @NameInMap("ContactMobile")
        public String contactMobile;

        /**
         * <p>The contact name in Account Center.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>Indicates whether the email address of the contact is verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EmailConfirmed")
        public Boolean emailConfirmed;

        /**
         * <p>Indicates whether the mobile phone number of the contact in Account Center is verified.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("MobileConfirmed")
        public Boolean mobileConfirmed;

        /**
         * <p>The position of the contact in Account Center.</p>
         * 
         * <strong>example:</strong>
         * <p>CEO</p>
         */
        @NameInMap("Position")
        public String position;

        public static ReadCommonContactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadCommonContactResponseBodyData self = new ReadCommonContactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadCommonContactResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ReadCommonContactResponseBodyData setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public ReadCommonContactResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ReadCommonContactResponseBodyData setContactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }
        public String getContactMobile() {
            return this.contactMobile;
        }

        public ReadCommonContactResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ReadCommonContactResponseBodyData setEmailConfirmed(Boolean emailConfirmed) {
            this.emailConfirmed = emailConfirmed;
            return this;
        }
        public Boolean getEmailConfirmed() {
            return this.emailConfirmed;
        }

        public ReadCommonContactResponseBodyData setMobileConfirmed(Boolean mobileConfirmed) {
            this.mobileConfirmed = mobileConfirmed;
            return this;
        }
        public Boolean getMobileConfirmed() {
            return this.mobileConfirmed;
        }

        public ReadCommonContactResponseBodyData setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

}
