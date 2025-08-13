// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRequestPeakReportResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>HTTP status code.</p>
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
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeRequestPeakReportResponseBodyResultObject> resultObject;

    /**
     * <p>Whether the request was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Return value</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("ratio")
        public String ratio;

        /**
         * <p>Return text</p>
         * 
         * <strong>example:</strong>
         * <p>1.0 次/秒</p>
         */
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
