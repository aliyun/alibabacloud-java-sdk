// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class QuerySyncResultResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The time when the task was completed (ISO 8601 format).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("completedAt")
    public String completedAt;

    /**
     * <p>The enterprise identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>exampleCorpId</p>
     */
    @NameInMap("corpId")
    public String corpId;

    /**
     * <p>The department synchronization statistics. This field has a value when the task is completed.</p>
     */
    @NameInMap("deptStats")
    public QuerySyncResultResponseBodyDeptStats deptStats;

    /**
     * <p>The execution duration, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("durationSeconds")
    public Long durationSeconds;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The member synchronization statistics. This field has a value when syncMembers is set to true and the task is completed.</p>
     */
    @NameInMap("memberStats")
    public QuerySyncResultResponseBodyMemberStats memberStats;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The platform type.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("platformType")
    public String platformType;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The time when the task started (ISO 8601 format).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("startedAt")
    public String startedAt;

    /**
     * <p>The task status. Valid values: PENDING, RUNNING, COMPLETED, FAILED, TIMEOUT, and CANCELED.</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The time when the task was submitted (ISO 8601 format).</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("submittedAt")
    public String submittedAt;

    /**
     * <p>The intelligent meeting summary content.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("summary")
    public String summary;

    /**
     * <p>The task ID.</p>
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
         * <p>The total number of external departments.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("created")
        public Long created;

        /**
         * <p>The number of user groups marked for deletion.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("deleted")
        public Long deleted;

        /**
         * <p>The number of moved user groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("moved")
        public Long moved;

        /**
         * <p>The number of renamed user groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("renamed")
        public Long renamed;

        /**
         * <p>The number of skipped user groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("skipped")
        public Long skipped;

        /**
         * <p>The total number of external departments.</p>
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
         * <p>The number of failed members.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("failed")
        public Long failed;

        /**
         * <p>The number of added member relationships.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relationshipAdded")
        public Long relationshipAdded;

        /**
         * <p>The number of removed member relationships.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("relationshipRemoved")
        public Long relationshipRemoved;

        /**
         * <p>The total number of external members.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalExternal")
        public Long totalExternal;

        /**
         * <p>The number of unchanged member relationships.</p>
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
