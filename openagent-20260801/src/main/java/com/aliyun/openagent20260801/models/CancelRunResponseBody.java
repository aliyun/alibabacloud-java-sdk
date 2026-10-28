// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class CancelRunResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public CancelRunResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CancelRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CancelRunResponseBody self = new CancelRunResponseBody();
        return TeaModel.build(map, self);
    }

    public CancelRunResponseBody setData(CancelRunResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CancelRunResponseBodyData getData() {
        return this.data;
    }

    public CancelRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CancelRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CancelRunResponseBodyData extends TeaModel {
        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>The run status. If the cancellation is successful, the value is fixed to <code>CANCELLED</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>CANCELLED</p>
         */
        @NameInMap("status")
        public String status;

        public static CancelRunResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CancelRunResponseBodyData self = new CancelRunResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CancelRunResponseBodyData setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public CancelRunResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
