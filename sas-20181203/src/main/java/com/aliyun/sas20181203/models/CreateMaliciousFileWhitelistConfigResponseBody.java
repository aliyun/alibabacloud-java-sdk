// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateMaliciousFileWhitelistConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public CreateMaliciousFileWhitelistConfigResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        public String id;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Source")
        public String source;

        @NameInMap("TargetType")
        public String targetType;

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
