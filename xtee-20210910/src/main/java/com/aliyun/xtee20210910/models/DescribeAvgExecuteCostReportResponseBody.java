// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAvgExecuteCostReportResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeAvgExecuteCostReportResponseBodyResultObject> resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeAvgExecuteCostReportResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAvgExecuteCostReportResponseBody self = new DescribeAvgExecuteCostReportResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAvgExecuteCostReportResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAvgExecuteCostReportResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAvgExecuteCostReportResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAvgExecuteCostReportResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAvgExecuteCostReportResponseBody setResultObject(java.util.List<DescribeAvgExecuteCostReportResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeAvgExecuteCostReportResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeAvgExecuteCostReportResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAvgExecuteCostReportResponseBodyResultObject extends TeaModel {
        @NameInMap("ratio")
        public String ratio;

        @NameInMap("value")
        public String value;

        public static DescribeAvgExecuteCostReportResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeAvgExecuteCostReportResponseBodyResultObject self = new DescribeAvgExecuteCostReportResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeAvgExecuteCostReportResponseBodyResultObject setRatio(String ratio) {
            this.ratio = ratio;
            return this;
        }
        public String getRatio() {
            return this.ratio;
        }

        public DescribeAvgExecuteCostReportResponseBodyResultObject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
