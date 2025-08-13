// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeResultCountResponseBody extends TeaModel {
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
    public java.util.List<DescribeResultCountResponseBodyResultObject> resultObject;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DescribeResultCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResultCountResponseBody self = new DescribeResultCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResultCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeResultCountResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeResultCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeResultCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResultCountResponseBody setResultObject(java.util.List<DescribeResultCountResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeResultCountResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeResultCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeResultCountResponseBodyResultObject extends TeaModel {
        /**
         * <p>Execution result</p>
         * 
         * <strong>example:</strong>
         * <p>PASS</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>Quantity</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("total")
        public String total;

        public static DescribeResultCountResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeResultCountResponseBodyResultObject self = new DescribeResultCountResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeResultCountResponseBodyResultObject setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public DescribeResultCountResponseBodyResultObject setTotal(String total) {
            this.total = total;
            return this;
        }
        public String getTotal() {
            return this.total;
        }

    }

}
