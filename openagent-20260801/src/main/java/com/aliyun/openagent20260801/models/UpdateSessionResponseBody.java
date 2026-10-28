// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class UpdateSessionResponseBody extends TeaModel {
    /**
     * <p>The session information.</p>
     */
    @NameInMap("data")
    public UpdateSessionResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static UpdateSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionResponseBody self = new UpdateSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateSessionResponseBody setData(UpdateSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateSessionResponseBodyData getData() {
        return this.data;
    }

    public UpdateSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateSessionResponseBodyData extends TeaModel {
        /**
         * <p>The time when the session was created, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The ID of the last run.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        @NameInMap("lastRunId")
        public String lastRunId;

        /**
         * <p>The status of the last run. Valid values:</p>
         * <ul>
         * <li><code>PENDING</code>: Pending.</li>
         * <li><code>RUNNING</code>: Running.</li>
         * <li><code>WAITING_USER</code>: Waiting for interrupt handling.</li>
         * <li><code>COMPLETED</code>: Completed.</li>
         * <li><code>FAILED</code>: Failed.</li>
         * <li><code>CANCELLED</code>: Cancelled.</li>
         * <li><code>REJECTED</code>: Rejected.</li>
         * </ul>
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
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>session_example_001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The session status. Valid values:</p>
         * <ul>
         * <li><code>IDLE</code>: Idle.</li>
         * <li><code>ACTIVE</code>: Active.</li>
         * <li><code>WAITING_USER_INPUT</code>: Waiting for user input.</li>
         * <li><code>WAITING_APPROVAL</code>: Waiting for user confirmation.</li>
         * <li><code>WAITING_OUT_OF_BAND_APPROVAL</code>: Waiting for out-of-band approval.</li>
         * <li><code>CLOSED</code>: Closed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IDLE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The session title.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud resource inspection example</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The time when the session was last updated, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:01:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static UpdateSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateSessionResponseBodyData self = new UpdateSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateSessionResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public UpdateSessionResponseBodyData setLastRunId(String lastRunId) {
            this.lastRunId = lastRunId;
            return this;
        }
        public String getLastRunId() {
            return this.lastRunId;
        }

        public UpdateSessionResponseBodyData setLastRunStatus(String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        public UpdateSessionResponseBodyData setPinned(Boolean pinned) {
            this.pinned = pinned;
            return this;
        }
        public Boolean getPinned() {
            return this.pinned;
        }

        public UpdateSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public UpdateSessionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public UpdateSessionResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateSessionResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
