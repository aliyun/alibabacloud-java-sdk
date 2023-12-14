// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMaliciousFileWhitelistConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public CreateMaliciousFileWhitelistConfigResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateMaliciousFileWhitelistConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateMaliciousFileWhitelistConfigResponseBody self = new CreateMaliciousFileWhitelistConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateMaliciousFileWhitelistConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateMaliciousFileWhitelistConfigResponseBody setData(CreateMaliciousFileWhitelistConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateMaliciousFileWhitelistConfigResponseBodyData getData() {
        return this.data;
    }

    public CreateMaliciousFileWhitelistConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateMaliciousFileWhitelistConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateMaliciousFileWhitelistConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateMaliciousFileWhitelistConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateMaliciousFileWhitelistConfigResponseBodyData extends TeaModel {
        /**
         * <p>The number of the assets on which the whitelist rule takes effect.</p>
         * <br>
         * <p>>  The value of this parameter is returned only if the value of TargetType is SELECTION_KEY.</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The name of the alert.</p>
         * <br>
         * <p>*   The value is fixed as ALL, which indicates all alert types.</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The field that is used in the whitelist rule.</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <p>The value of the field that is used in the whitelist rule.</p>
         */
        @NameInMap("FieldValue")
        public String fieldValue;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the whitelist rule.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The logical operator that is used in the whitelist rule.</p>
         * <br>
         * <p>*   The value is fixed as strEqual, which indicates the equality operator (=).</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The feature to which this operation belongs.</p>
         * <br>
         * <p>*   The value is fixed as agentless, which indicates the agentless detection feature.</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <p>The type of the assets on which the whitelist rule takes effect. Valid values:</p>
         * <br>
         * <p>*   ALL: all assets</p>
         * <p>*   SELECTION_KEY: selected assets</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The assets on which the whitelist rule takes effect. Valid values:</p>
         * <br>
         * <p>*   ALL: all assets</p>
         * <p>*   Others: selected assets</p>
         */
        @NameInMap("TargetValue")
        public String targetValue;

        public static CreateMaliciousFileWhitelistConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateMaliciousFileWhitelistConfigResponseBodyData self = new CreateMaliciousFileWhitelistConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public CreateMaliciousFileWhitelistConfigResponseBodyData setTargetValue(String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public String getTargetValue() {
            return this.targetValue;
        }

    }

}
