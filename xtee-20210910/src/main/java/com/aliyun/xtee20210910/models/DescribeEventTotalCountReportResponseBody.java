// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventTotalCountReportResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeEventTotalCountReportResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeEventTotalCountReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventTotalCountReportResponseBody self = new DescribeEventTotalCountReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventTotalCountReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEventTotalCountReportResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeEventTotalCountReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventTotalCountReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventTotalCountReportResponseBody setResultObject(DescribeEventTotalCountReportResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeEventTotalCountReportResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeEventTotalCountReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEventTotalCountReportResponseBodyResultObject extends TeaModel {
        @NameInMap("ratio")
        public String ratio;

        @NameInMap("value")
        public String value;

        public static DescribeEventTotalCountReportResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventTotalCountReportResponseBodyResultObject self = new DescribeEventTotalCountReportResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventTotalCountReportResponseBodyResultObject setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public DescribeEventTotalCountReportResponseBodyResultObject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
