// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeByPassShuntEventResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeByPassShuntEventResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeByPassShuntEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeByPassShuntEventResponseBody self = new DescribeByPassShuntEventResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeByPassShuntEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeByPassShuntEventResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeByPassShuntEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeByPassShuntEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeByPassShuntEventResponseBody setResultObject(DescribeByPassShuntEventResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeByPassShuntEventResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeByPassShuntEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeByPassShuntEventResponseBodyResultObject extends TeaModel {
        @NameInMap("eventName")
        public String eventName;

        public static DescribeByPassShuntEventResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeByPassShuntEventResponseBodyResultObject self = new DescribeByPassShuntEventResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeByPassShuntEventResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

    }

}
