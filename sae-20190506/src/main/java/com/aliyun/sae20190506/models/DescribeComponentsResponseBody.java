// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeComponentsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("TraceId")
    @Validation(required = true)
    public String traceId;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<DescribeComponentsResponseBodyData> data;

    public static DescribeComponentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentsResponseBody self = new DescribeComponentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComponentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComponentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeComponentsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeComponentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComponentsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeComponentsResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public DescribeComponentsResponseBody setData(java.util.List<DescribeComponentsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeComponentsResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeComponentsResponseBodyData extends TeaModel {
        @NameInMap("ComponentKey")
        @Validation(required = true)
        public String componentKey;

        @NameInMap("ComponentDescription")
        @Validation(required = true)
        public String componentDescription;

        @NameInMap("Expired")
        @Validation(required = true)
        public Boolean expired;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        public static DescribeComponentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeComponentsResponseBodyData self = new DescribeComponentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeComponentsResponseBodyData setComponentKey(String componentKey) {
            this.componentKey = componentKey;
            return this;
        }
        public String getComponentKey() {
            return this.componentKey;
        }

        public DescribeComponentsResponseBodyData setComponentDescription(String componentDescription) {
            this.componentDescription = componentDescription;
            return this;
        }
        public String getComponentDescription() {
            return this.componentDescription;
        }

        public DescribeComponentsResponseBodyData setExpired(Boolean expired) {
            this.expired = expired;
            return this;
        }
        public Boolean getExpired() {
            return this.expired;
        }

        public DescribeComponentsResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
