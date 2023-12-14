// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetMaliciousFileWhitelistConfigResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetMaliciousFileWhitelistConfigResponseBodyData data;

    /**
     * <p>The HTTP status code. The value 200 indicates that the request was successful.</p>
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

    public static GetMaliciousFileWhitelistConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMaliciousFileWhitelistConfigResponseBody self = new GetMaliciousFileWhitelistConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMaliciousFileWhitelistConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMaliciousFileWhitelistConfigResponseBody setData(GetMaliciousFileWhitelistConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMaliciousFileWhitelistConfigResponseBodyData getData() {
        return this.data;
    }

    public GetMaliciousFileWhitelistConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMaliciousFileWhitelistConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMaliciousFileWhitelistConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMaliciousFileWhitelistConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMaliciousFileWhitelistConfigResponseBodyData extends TeaModel {
        /**
         * <p>The number of assets on which the whitelist rule takes effect.</p>
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
        public Long id;

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

        public static GetMaliciousFileWhitelistConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMaliciousFileWhitelistConfigResponseBodyData self = new GetMaliciousFileWhitelistConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setFieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }
        public String getFieldValue() {
            return this.fieldValue;
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public GetMaliciousFileWhitelistConfigResponseBodyData setTargetValue(String targetValue) {
            this.targetValue = targetValue;
            return this;
        }
        public String getTargetValue() {
            return this.targetValue;
        }

    }

}
