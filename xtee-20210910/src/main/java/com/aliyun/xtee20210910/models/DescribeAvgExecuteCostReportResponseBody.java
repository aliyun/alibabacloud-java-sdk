// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeAvgExecuteCostReportResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
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
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public java.util.List<DescribeAvgExecuteCostReportResponseBodyResultObject> resultObject;

    /**
     * <p>Whether the call was successful</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Comparison with yesterday\&quot;s average execution time</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("ratio")
        public String ratio;

        /**
         * <p>Today\&quot;s average execution time</p>
         * 
         * <strong>example:</strong>
         * <p>0.1 毫秒</p>
         */
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
