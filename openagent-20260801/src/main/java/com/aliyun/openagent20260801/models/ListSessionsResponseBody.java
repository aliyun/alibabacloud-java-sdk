// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class ListSessionsResponseBody extends TeaModel {
    /**
     * <p>The list of sessions and pagination information for the current page.</p>
     */
    @NameInMap("data")
    public ListSessionsResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Specifies whether the request is successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListSessionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSessionsResponseBody self = new ListSessionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSessionsResponseBody setData(ListSessionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSessionsResponseBodyData getData() {
        return this.data;
    }

    public ListSessionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSessionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSessionsResponseBodyDataSessions extends TeaModel {
        /**
         * <p>The time when the session was created, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The ID of the most recent run.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        @NameInMap("lastRunId")
        public String lastRunId;

        /**
         * <p>The status of the most recent run. Valid values:</p>
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
         * <p>Specifies whether the session is pinned.</p>
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

        public static ListSessionsResponseBodyDataSessions build(java.util.Map<String, ?> map) throws Exception {
            ListSessionsResponseBodyDataSessions self = new ListSessionsResponseBodyDataSessions();
            return TeaModel.build(map, self);
        }

        public ListSessionsResponseBodyDataSessions setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListSessionsResponseBodyDataSessions setLastRunId(String lastRunId) {
            this.lastRunId = lastRunId;
            return this;
        }
        public String getLastRunId() {
            return this.lastRunId;
        }

        public ListSessionsResponseBodyDataSessions setLastRunStatus(String lastRunStatus) {
            this.lastRunStatus = lastRunStatus;
            return this;
        }
        public String getLastRunStatus() {
            return this.lastRunStatus;
        }

        public ListSessionsResponseBodyDataSessions setPinned(Boolean pinned) {
            this.pinned = pinned;
            return this;
        }
        public Boolean getPinned() {
            return this.pinned;
        }

        public ListSessionsResponseBodyDataSessions setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListSessionsResponseBodyDataSessions setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSessionsResponseBodyDataSessions setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListSessionsResponseBodyDataSessions setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListSessionsResponseBodyData extends TeaModel {
        /**
         * <p>The pagination token for the next page. A value of null indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>example-next-token</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        /**
         * <p>The list of sessions returned on the current page.</p>
         */
        @NameInMap("sessions")
        public java.util.List<ListSessionsResponseBodyDataSessions> sessions;

        /**
         * <p>The number of sessions returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListSessionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSessionsResponseBodyData self = new ListSessionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSessionsResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListSessionsResponseBodyData setSessions(java.util.List<ListSessionsResponseBodyDataSessions> sessions) {
            this.sessions = sessions;
            return this;
        }
        public java.util.List<ListSessionsResponseBodyDataSessions> getSessions() {
            return this.sessions;
        }

        public ListSessionsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
