// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryLastAccelerationEngineJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>46e53*********92704c8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public QueryLastAccelerationEngineJobResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryLastAccelerationEngineJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLastAccelerationEngineJobResponseBody self = new QueryLastAccelerationEngineJobResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLastAccelerationEngineJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLastAccelerationEngineJobResponseBody setResult(QueryLastAccelerationEngineJobResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLastAccelerationEngineJobResponseBodyResult getResult() {
        return this.result;
    }

    public QueryLastAccelerationEngineJobResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryLastAccelerationEngineJobResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-18 17:07:43</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-06-18 17:08:26</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>46e53********5464564</p>
         */
        @NameInMap("JobHistoryId")
        public String jobHistoryId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        public static QueryLastAccelerationEngineJobResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLastAccelerationEngineJobResponseBodyResult self = new QueryLastAccelerationEngineJobResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLastAccelerationEngineJobResponseBodyResult setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryLastAccelerationEngineJobResponseBodyResult setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryLastAccelerationEngineJobResponseBodyResult setJobHistoryId(String jobHistoryId) {
            this.jobHistoryId = jobHistoryId;
            return this;
        }
        public String getJobHistoryId() {
            return this.jobHistoryId;
        }

        public QueryLastAccelerationEngineJobResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
