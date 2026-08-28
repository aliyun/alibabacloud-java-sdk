// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class TriggerPatrolResponseBody extends TeaModel {
    /**
     * <p>The response data of the triggered inspection.</p>
     */
    @NameInMap("data")
    public TriggerPatrolResponseBodyData data;

    /**
     * <p>When success is false, this value is not empty and indicates the business error code. When success is true, this value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorCode")
    public String errorCode;

    /**
     * <p>When success is false, this value is not empty and indicates the business error message. When success is true, this value is empty.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The business status code, which is uniformly 200. Use success to determine whether the business request is successful.</p>
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
     * <p>Indicates whether the business request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static TriggerPatrolResponseBody build(java.util.Map<String, ?> map) throws Exception {
        TriggerPatrolResponseBody self = new TriggerPatrolResponseBody();
        return TeaModel.build(map, self);
    }

    public TriggerPatrolResponseBody setData(TriggerPatrolResponseBodyData data) {
        this.data = data;
        return this;
    }
    public TriggerPatrolResponseBodyData getData() {
        return this.data;
    }

    public TriggerPatrolResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public TriggerPatrolResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public TriggerPatrolResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public TriggerPatrolResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public TriggerPatrolResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class TriggerPatrolResponseBodyData extends TeaModel {
        /**
         * <p>The generated report ID.</p>
         * 
         * <strong>example:</strong>
         * <p>inspection-cf8f8843-64e4-4b45-9500-06790107130f</p>
         */
        @NameInMap("reportId")
        public String reportId;

        /**
         * <p>The report status.</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("status")
        public String status;

        public static TriggerPatrolResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            TriggerPatrolResponseBodyData self = new TriggerPatrolResponseBodyData();
            return TeaModel.build(map, self);
        }

        public TriggerPatrolResponseBodyData setReportId(String reportId) {
            this.reportId = reportId;
            return this;
        }
        public String getReportId() {
            return this.reportId;
        }

        public TriggerPatrolResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
