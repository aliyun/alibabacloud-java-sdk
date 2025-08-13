// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class ImportFieldResponseBody extends TeaModel {
    /**
     * <p>API status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result</p>
     */
    @NameInMap("ResultObject")
    public ImportFieldResponseBodyResultObject resultObject;

    /**
     * <p>Indicator of whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ImportFieldResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportFieldResponseBody self = new ImportFieldResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportFieldResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportFieldResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportFieldResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportFieldResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportFieldResponseBody setResultObject(ImportFieldResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public ImportFieldResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public ImportFieldResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportFieldResponseBodyResultObject extends TeaModel {
        /**
         * <p>Names of fields that failed to upload</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("FailFieldNames")
        public String failFieldNames;

        /**
         * <p>Number of successful executions.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("SuccessNum")
        public Integer successNum;

        /**
         * <p>Total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("TotalNum")
        public Integer totalNum;

        public static ImportFieldResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            ImportFieldResponseBodyResultObject self = new ImportFieldResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public ImportFieldResponseBodyResultObject setFailFieldNames(String failFieldNames) {
            this.failFieldNames = failFieldNames;
            return this;
        }
        public String getFailFieldNames() {
            return this.failFieldNames;
        }

        public ImportFieldResponseBodyResultObject setSuccessNum(Integer successNum) {
            this.successNum = successNum;
            return this;
        }
        public Integer getSuccessNum() {
            return this.successNum;
        }

        public ImportFieldResponseBodyResultObject setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

    }

}
