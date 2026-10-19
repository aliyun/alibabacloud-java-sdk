// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetAgentWorkLogResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>按时间倒序的 Agent 工作记录，未保存记录时为空列表</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("logs")
    public java.util.List<GetAgentWorkLogResponseBodyLogs> logs;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>当前页码，从1开始</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Long page;

    /**
     * <p>每页条数，取值1至100</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>筛选后的工作日志总条数</p>
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
         * <p>记录类型：THINK、REPLY、TOOL_CALL、SKILL_CALL或ARTIFACT</p>
         * 
         * <strong>example:</strong>
         * <p>REPLY</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>已保存的原始记录内容；工具调用与产物元数据为JSON字符串</p>
         * 
         * <strong>example:</strong>
         * <p>已完成本轮数据查询</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>该条工作记录耗时，单位毫秒；产物记录为0</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("duration")
        public Long duration;

        /**
         * <p>所属节点key（nodeKey），不是会话ID</p>
         * 
         * <strong>example:</strong>
         * <p>query.amount</p>
         */
        @NameInMap("nodeId")
        public String nodeId;

        /**
         * <p>记录事件时间，ISO-8601格式；源记录无时间时为空字符串</p>
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
