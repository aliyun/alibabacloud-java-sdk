// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetAgentWorkLogResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The agent operation records in reverse chronological order. If no records are saved, an empty list is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("logs")
    public java.util.List<GetAgentWorkLogResponseBodyLogs> logs;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The current page number, starting from 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of filtered operation log entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static GetAgentWorkLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAgentWorkLogResponseBody self = new GetAgentWorkLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAgentWorkLogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetAgentWorkLogResponseBody setLogs(java.util.List<GetAgentWorkLogResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<GetAgentWorkLogResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public GetAgentWorkLogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAgentWorkLogResponseBody setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public GetAgentWorkLogResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetAgentWorkLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAgentWorkLogResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetAgentWorkLogResponseBodyLogs extends TeaModel {
        /**
         * <p>The record type. Valid values: THINK, REPLY, TOOL_CALL, SKILL_CALL, and ARTIFACT.</p>
         * 
         * <strong>example:</strong>
         * <p>REPLY</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The saved raw record content. Tool invocations and artifact metadata are represented as JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>The data query for the current round is completed</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>The duration of this operation record, in milliseconds. The value is 0 for artifact records.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>The key of the node to which the record belongs. This is not the session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>The time when the event was recorded, in ISO 8601 format. If the source record has no time, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-14T08:00:00Z</p>
         */
        @NameInMap("timestamp")
        public String timestamp;

        public static GetAgentWorkLogResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            GetAgentWorkLogResponseBodyLogs self = new GetAgentWorkLogResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public GetAgentWorkLogResponseBodyLogs setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetAgentWorkLogResponseBodyLogs setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public GetAgentWorkLogResponseBodyLogs setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetAgentWorkLogResponseBodyLogs setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public GetAgentWorkLogResponseBodyLogs setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
