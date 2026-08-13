// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySyncResultResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>任务完成时间（ISO 8601）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("completedAt")
    public String completedAt;

    /**
     * <p>企业标识</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCorpId</p>
     */
    @NameInMap("corpId")
    public String corpId;

    /**
     * <p>部门同步统计（完成时有值）</p>
     */
    @NameInMap("deptStats")
    public QuerySyncResultResponseBodyDeptStats deptStats;

    /**
     * <p>执行时长（秒）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("durationSeconds")
    public Long durationSeconds;

    /**
     * <p>错误信息（失败时有值）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>成员同步统计（syncMembers=true 且完成时有值）</p>
     */
    @NameInMap("memberStats")
    public QuerySyncResultResponseBodyMemberStats memberStats;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>平台类型</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("platformType")
    public String platformType;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>任务开始执行时间（ISO 8601）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <p>任务状态: PENDING / RUNNING / COMPLETED / FAILED / TIMEOUT / CANCELED</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>任务提交时间（ISO 8601）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("submittedAt")
    public String submittedAt;

    /**
     * <p>执行摘要（人可读）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("summary")
    public String summary;

    /**
     * <p>任务 ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("taskId")
    public Long taskId;

    public static QuerySyncResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySyncResultResponseBody self = new QuerySyncResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySyncResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySyncResultResponseBody setCompletedAt(String completedAt) {
        this.completedAt = completedAt;
        return this;
    }
    public String getCompletedAt() {
        return this.completedAt;
    }

    public QuerySyncResultResponseBody setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public QuerySyncResultResponseBody setDeptStats(QuerySyncResultResponseBodyDeptStats deptStats) {
        this.deptStats = deptStats;
        return this;
    }
    public QuerySyncResultResponseBodyDeptStats getDeptStats() {
        return this.deptStats;
    }

    public QuerySyncResultResponseBody setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }
    public Long getDurationSeconds() {
        return this.durationSeconds;
    }

    public QuerySyncResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QuerySyncResultResponseBody setMemberStats(QuerySyncResultResponseBodyMemberStats memberStats) {
        this.memberStats = memberStats;
        return this;
    }
    public QuerySyncResultResponseBodyMemberStats getMemberStats() {
        return this.memberStats;
    }

    public QuerySyncResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QuerySyncResultResponseBody setPlatformType(String platformType) {
        this.platformType = platformType;
        return this;
    }
    public String getPlatformType() {
        return this.platformType;
    }

    public QuerySyncResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySyncResultResponseBody setStartedAt(String startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    public String getStartedAt() {
        return this.startedAt;
    }

    public QuerySyncResultResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QuerySyncResultResponseBody setSubmittedAt(String submittedAt) {
        this.submittedAt = submittedAt;
        return this;
    }
    public String getSubmittedAt() {
        return this.submittedAt;
    }

    public QuerySyncResultResponseBody setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public QuerySyncResultResponseBody setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

    public static class QuerySyncResultResponseBodyDeptStats extends TeaModel {
        /**
         * <p>新增的用户组数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p>标记删除的用户组数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("deleted")
        public Long deleted;

        /**
         * <p>移动的用户组数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("moved")
        public Long moved;

        /**
         * <p>更名的用户组数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("renamed")
        public Long renamed;

        /**
         * <p>跳过的用户组数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("skipped")
        public Long skipped;

        /**
         * <p>外部部门总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalExternal")
        public Long totalExternal;

        public static QuerySyncResultResponseBodyDeptStats build(java.util.Map<String, ?> map) throws Exception {
            QuerySyncResultResponseBodyDeptStats self = new QuerySyncResultResponseBodyDeptStats();
            return TeaModel.build(map, self);
        }

        public QuerySyncResultResponseBodyDeptStats setCreated(Long created) {
            this.created = created;
            return this;
        }
        public Long getCreated() {
            return this.created;
        }

        public QuerySyncResultResponseBodyDeptStats setDeleted(Long deleted) {
            this.deleted = deleted;
            return this;
        }
        public Long getDeleted() {
            return this.deleted;
        }

        public QuerySyncResultResponseBodyDeptStats setMoved(Long moved) {
            this.moved = moved;
            return this;
        }
        public Long getMoved() {
            return this.moved;
        }

        public QuerySyncResultResponseBodyDeptStats setRenamed(Long renamed) {
            this.renamed = renamed;
            return this;
        }
        public Long getRenamed() {
            return this.renamed;
        }

        public QuerySyncResultResponseBodyDeptStats setSkipped(Long skipped) {
            this.skipped = skipped;
            return this;
        }
        public Long getSkipped() {
            return this.skipped;
        }

        public QuerySyncResultResponseBodyDeptStats setTotalExternal(Long totalExternal) {
            this.totalExternal = totalExternal;
            return this;
        }
        public Long getTotalExternal() {
            return this.totalExternal;
        }

    }

    public static class QuerySyncResultResponseBodyMemberStats extends TeaModel {
        /**
         * <p>失败的成员数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("failed")
        public Long failed;

        /**
         * <p>新增的成员关系数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relationshipAdded")
        public Long relationshipAdded;

        /**
         * <p>移除的成员关系数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relationshipRemoved")
        public Long relationshipRemoved;

        /**
         * <p>外部成员总数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalExternal")
        public Long totalExternal;

        /**
         * <p>未变更的成员关系数</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("unchanged")
        public Long unchanged;

        public static QuerySyncResultResponseBodyMemberStats build(java.util.Map<String, ?> map) throws Exception {
            QuerySyncResultResponseBodyMemberStats self = new QuerySyncResultResponseBodyMemberStats();
            return TeaModel.build(map, self);
        }

        public QuerySyncResultResponseBodyMemberStats setFailed(Long failed) {
            this.failed = failed;
            return this;
        }
        public Long getFailed() {
            return this.failed;
        }

        public QuerySyncResultResponseBodyMemberStats setRelationshipAdded(Long relationshipAdded) {
            this.relationshipAdded = relationshipAdded;
            return this;
        }
        public Long getRelationshipAdded() {
            return this.relationshipAdded;
        }

        public QuerySyncResultResponseBodyMemberStats setRelationshipRemoved(Long relationshipRemoved) {
            this.relationshipRemoved = relationshipRemoved;
            return this;
        }
        public Long getRelationshipRemoved() {
            return this.relationshipRemoved;
        }

        public QuerySyncResultResponseBodyMemberStats setTotalExternal(Long totalExternal) {
            this.totalExternal = totalExternal;
            return this;
        }
        public Long getTotalExternal() {
            return this.totalExternal;
        }

        public QuerySyncResultResponseBodyMemberStats setUnchanged(Long unchanged) {
            this.unchanged = unchanged;
            return this;
        }
        public Long getUnchanged() {
            return this.unchanged;
        }

    }

}
