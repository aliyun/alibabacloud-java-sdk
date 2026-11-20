// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class GetSessionResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetSessionResponseBodyData data;

    /**
     * <p>The ID of the request.</p>
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

    public static GetSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionResponseBody self = new GetSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionResponseBody setData(GetSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSessionResponseBodyData getData() {
        return this.data;
    }

    public GetSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSessionResponseBodyData extends TeaModel {
        /**
         * <p>The time when the session was created, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The ID of the latest run.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        @NameInMap("lastRunId")
        public String lastRunId;

        /**
         * <p>The status of the latest run. Valid values: <code>PENDING</code> (Pending), <code>RUNNING</code> (Running), <code>WAITING_USER</code> (Waiting for interrupt handling), <code>COMPLETED</code> (Completed), <code>FAILED</code> (Failed), <code>CANCELLED</code> (Cancelled), and <code>REJECTED</code> (Rejected).</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("lastRunStatus")
        public String lastRunStatus;

        /**
         * <p>Indicates whether the session is pinned.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("pinned")
        public Boolean pinned;

        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>session_example_001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The status of the session. Valid values: <code>IDLE</code> (Idle), <code>ACTIVE</code> (Running), <code>WAITING_USER_INPUT</code> (Waiting for user input), <code>WAITING_APPROVAL</code> (Waiting for user confirmation), <code>WAITING_OUT_OF_BAND_APPROVAL</code> (Waiting for out-of-band approval), and <code>CLOSED</code> (Closed).</p>
         * 
         * <strong>example:</strong>
         * <p>IDLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The title of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud resource inspection example</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The time when the session was last updated, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:01:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static GetSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSessionResponseBodyData self = new GetSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSessionResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetSessionResponseBodyData setLastRunId(String lastRunId) {
            this.lastRunId = lastRunId;
            return this;
        }
        public String getLastRunId() {
            return this.lastRunId;
        }

        public GetSessionResponseBodyData setLastRunStatus(String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        public GetSessionResponseBodyData setPinned(Boolean pinned) {
            this.pinned = pinned;
            return this;
        }
        public Boolean getPinned() {
            return this.pinned;
        }

        public GetSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetSessionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetSessionResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetSessionResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
