// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeCustomerModuleOutputInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>055f1546-f465-4c92-a2da-bfb86abe6f56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObject")
    public DescribeCustomerModuleOutputInfoResponseBodyResultObject resultObject;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeCustomerModuleOutputInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerModuleOutputInfoResponseBody self = new DescribeCustomerModuleOutputInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerModuleOutputInfoResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeCustomerModuleOutputInfoResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeCustomerModuleOutputInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeCustomerModuleOutputInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCustomerModuleOutputInfoResponseBody setResultObject(DescribeCustomerModuleOutputInfoResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeCustomerModuleOutputInfoResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeCustomerModuleOutputInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeCustomerModuleOutputInfoResponseBodyResultObject extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("FinalScoreFormat")
        public String finalScoreFormat;

        /**
         * <strong>example:</strong>
         * <p>score</p>
         */
        @NameInMap("ProcessExpression")
        public String processExpression;

        /**
         * <strong>example:</strong>
         * <p>customer/xxxxxxxxx/xxxxxxxx.pmml</p>
         */
        @NameInMap("TestFile")
        public String testFile;

        public static DescribeCustomerModuleOutputInfoResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeCustomerModuleOutputInfoResponseBodyResultObject self = new DescribeCustomerModuleOutputInfoResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeCustomerModuleOutputInfoResponseBodyResultObject setFinalScoreFormat(String finalScoreFormat) {
            this.finalScoreFormat = finalScoreFormat;
            return this;
        }
        public String getFinalScoreFormat() {
            return this.finalScoreFormat;
        }

        public DescribeCustomerModuleOutputInfoResponseBodyResultObject setProcessExpression(String processExpression) {
            this.processExpression = processExpression;
            return this;
        }
        public String getProcessExpression() {
            return this.processExpression;
        }

        public DescribeCustomerModuleOutputInfoResponseBodyResultObject setTestFile(String testFile) {
            this.testFile = testFile;
            return this;
        }
        public String getTestFile() {
            return this.testFile;
        }

    }

}
