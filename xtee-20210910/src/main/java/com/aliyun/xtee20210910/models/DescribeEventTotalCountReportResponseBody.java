// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventTotalCountReportResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The input parameter data is not valid. order_storage_company_num component not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public DescribeEventTotalCountReportResponseBodyResultObject resultObject;

    /**
     * <p>Indicates whether this operation was successful, <code>true</code> means success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Comparison with yesterday\&quot;s event invocation count</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("ratio")
        public String ratio;

        /**
         * <p>Today\&quot;s event invocation count</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
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
