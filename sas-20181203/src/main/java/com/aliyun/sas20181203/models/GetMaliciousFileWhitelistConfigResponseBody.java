// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetMaliciousFileWhitelistConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetMaliciousFileWhitelistConfigResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Count")
        public String count;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("Field")
        public String field;

        @NameInMap("FieldValue")
        public String fieldValue;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Source")
        public String source;

        @NameInMap("TargetType")
        public String targetType;

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
