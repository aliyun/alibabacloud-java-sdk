// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class StopSqlExecutionResponseBody extends TeaModel {
    /**
     * <p>SqlExecutionStopResult</p>
     */
    @NameInMap("data")
    public StopSqlExecutionResponseBodyData data;

    /**
     * <p>The business error code. This parameter is not empty when success is false. This parameter is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>The business error message. This parameter is not empty when success is false. This parameter is empty when success is true.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The business status code, which is always 200. Use success to determine whether the business request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpCode")
    public Integer httpCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CBC799F0-AS7S-1D30-8A4F-882ED4DD****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the business request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static StopSqlExecutionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopSqlExecutionResponseBody self = new StopSqlExecutionResponseBody();
        return TeaModel.build(map, self);
    }

    public StopSqlExecutionResponseBody setData(StopSqlExecutionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public StopSqlExecutionResponseBodyData getData() {
        return this.data;
    }

    public StopSqlExecutionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StopSqlExecutionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StopSqlExecutionResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public StopSqlExecutionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StopSqlExecutionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class StopSqlExecutionResponseBodyData extends TeaModel {
        /**
         * <p>The supplementary information about stopping the query script.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>Indicates whether the stop instruction was successfully initiated.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        @NameInMap("success")
        public Boolean success;

        public static StopSqlExecutionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            StopSqlExecutionResponseBodyData self = new StopSqlExecutionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public StopSqlExecutionResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public StopSqlExecutionResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
