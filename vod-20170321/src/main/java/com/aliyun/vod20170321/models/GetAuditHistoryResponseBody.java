// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditHistoryResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Histories")
    public java.util.List<GetAuditHistoryResponseBodyHistories> histories;

    /**
     * <p>The review comments, which are provided by the reviewer.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The reviewer.</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The sorting rule of the results. Valid values:</p>
     * <br>
     * <p>*   **CreationTime:Desc**: sorts the results based on the creation time in descending order. This is the default value.</p>
     * <p>*   **CreationTime:Asc**: sorts the results based on the creation time in ascending order.</p>
     */
    @NameInMap("Total")
    public Long total;

    public static GetAuditHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAuditHistoryResponseBody self = new GetAuditHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAuditHistoryResponseBody setHistories(java.util.List<GetAuditHistoryResponseBodyHistories> histories) {
        this.histories = histories;
        return this;
    }
    public java.util.List<GetAuditHistoryResponseBodyHistories> getHistories() {
        return this.histories;
    }

    public GetAuditHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAuditHistoryResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetAuditHistoryResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class GetAuditHistoryResponseBodyHistories extends TeaModel {
        @NameInMap("Auditor")
        public String auditor;

        /**
         * <p>Queries the manual review history.</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The manual review result. Valid values:</p>
         * <br>
         * <p>- **Normal**: The video can be played.</p>
         * <p>- **Blocked**: The video is blocked.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The time when the review record was created. The time follows the ISO 8601 standard in the *yyyy-MM-dd*T*HH:mm:ss*Z format. The time is displayed in UTC.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetAuditHistoryResponseBodyHistories build(java.util.Map<String, ?> map) throws Exception {
            GetAuditHistoryResponseBodyHistories self = new GetAuditHistoryResponseBodyHistories();
            return TeaModel.build(map, self);
        }

        public GetAuditHistoryResponseBodyHistories setAuditor(String auditor) {
            this.auditor = auditor;
            return this;
        }
        public String getAuditor() {
            return this.auditor;
        }

        public GetAuditHistoryResponseBodyHistories setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetAuditHistoryResponseBodyHistories setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public GetAuditHistoryResponseBodyHistories setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetAuditHistoryResponseBodyHistories setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
