// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class GetAuditHistoryResponseBody extends TeaModel {
    /**
     * <p>The list of review history records.</p>
     */
    @NameInMap("Histories")
    public java.util.List<GetAuditHistoryResponseBodyHistories> histories;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-43*****D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The review result. Indicates the result of the current manual review. Valid values:</p>
     * <ul>
     * <li><strong>Normal</strong>: the content is normal.</li>
     * <li><strong>Blocked</strong>: the content is blocked.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Normal</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The total number of review history records.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
        /**
         * <p>The reviewer.</p>
         * 
         * <strong>example:</strong>
         * <p>auditor</p>
         */
        @NameInMap("Auditor")
        public String auditor;

        /**
         * <p>The review details, which are the specific comments provided by the reviewer.</p>
         * 
         * <strong>example:</strong>
         * <p>Contains nudity</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>The time when the record was created. The time is in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2017-01-11T12:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The reason for rejection. If the review result is rejection, the reason must be provided.</p>
         * 
         * <strong>example:</strong>
         * <p>Pornographic video</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The review result. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong></li>
         * <li><strong>Blocked</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Blocked</p>
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
