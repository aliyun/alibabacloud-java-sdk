// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRequestPeakReportResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeRequestPeakReportResponseBodyResultObject> resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeRequestPeakReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRequestPeakReportResponseBody self = new DescribeRequestPeakReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRequestPeakReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRequestPeakReportResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeRequestPeakReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRequestPeakReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRequestPeakReportResponseBody setResultObject(java.util.List<DescribeRequestPeakReportResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeRequestPeakReportResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeRequestPeakReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRequestPeakReportResponseBodyResultObject extends TeaModel {
        @NameInMap("ratio")
        public String ratio;

        @NameInMap("value")
        public String value;

        public static DescribeRequestPeakReportResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRequestPeakReportResponseBodyResultObject self = new DescribeRequestPeakReportResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRequestPeakReportResponseBodyResultObject setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public DescribeRequestPeakReportResponseBodyResultObject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
