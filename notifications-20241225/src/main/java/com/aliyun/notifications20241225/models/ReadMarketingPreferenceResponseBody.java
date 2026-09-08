// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.notifications20241225.models;

import com.aliyun.tea.*;

public class ReadMarketingPreferenceResponseBody extends TeaModel {
    /**
     * <p>The error code returned by the system. For more information about error codes, see error codes.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The execution result.</p>
     */
    @NameInMap("Data")
    public ReadMarketingPreferenceResponseBodyData data;

    /**
     * <p>The message.</p>
     * 
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A5F62766-1C2F-1F56-A39D-63E3D30F0633</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ReadMarketingPreferenceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadMarketingPreferenceResponseBody self = new ReadMarketingPreferenceResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadMarketingPreferenceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadMarketingPreferenceResponseBody setData(ReadMarketingPreferenceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReadMarketingPreferenceResponseBodyData getData() {
        return this.data;
    }

    public ReadMarketingPreferenceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadMarketingPreferenceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadMarketingPreferenceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ReadMarketingPreferenceResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether notifications are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AllowMarketing")
        public Boolean allowMarketing;

        /**
         * <p>The email address of the contact in Account Center.</p>
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
         * <p>130*123</p>
         */
        @NameInMap("ContactMobile")
        public String contactMobile;

        /**
         * <p>The name of the contact in Account Center.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ContactName")
        public String contactName;

        /**
         * <p>The position of the contact in Account Center.</p>
         * 
         * <strong>example:</strong>
         * <p>CEO</p>
         */
        @NameInMap("Position")
        public String position;

        public static ReadMarketingPreferenceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReadMarketingPreferenceResponseBodyData self = new ReadMarketingPreferenceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReadMarketingPreferenceResponseBodyData setAllowMarketing(Boolean allowMarketing) {
            this.allowMarketing = allowMarketing;
            return this;
        }
        public Boolean getAllowMarketing() {
            return this.allowMarketing;
        }

        public ReadMarketingPreferenceResponseBodyData setContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }
        public String getContactEmail() {
            return this.contactEmail;
        }

        public ReadMarketingPreferenceResponseBodyData setContactId(Long contactId) {
            this.contactId = contactId;
            return this;
        }
        public Long getContactId() {
            return this.contactId;
        }

        public ReadMarketingPreferenceResponseBodyData setContactMobile(String contactMobile) {
            this.contactMobile = contactMobile;
            return this;
        }
        public String getContactMobile() {
            return this.contactMobile;
        }

        public ReadMarketingPreferenceResponseBodyData setContactName(String contactName) {
            this.contactName = contactName;
            return this;
        }
        public String getContactName() {
            return this.contactName;
        }

        public ReadMarketingPreferenceResponseBodyData setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
        }

    }

}
