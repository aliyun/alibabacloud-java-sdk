// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListSignalsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dlc-...</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Signals")
    public java.util.List<ListSignalsResponseBodySignals> signals;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListSignalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSignalsResponseBody self = new ListSignalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSignalsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public ListSignalsResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListSignalsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListSignalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSignalsResponseBody setSignals(java.util.List<ListSignalsResponseBodySignals> signals) {
        this.signals = signals;
        return this;
    }
    public java.util.List<ListSignalsResponseBodySignals> getSignals() {
        return this.signals;
    }

    public ListSignalsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListSignalsResponseBodySignals extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-30T14:07:38+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2025-12-30T14:07:38+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>signal delivered to 1 pods</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("PodNames")
        public java.util.List<String> podNames;

        /**
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("Roles")
        public java.util.List<String> roles;

        /**
         * <strong>example:</strong>
         * <p>pods</p>
         */
        @NameInMap("Scope")
        public String scope;

        /**
         * <strong>example:</strong>
         * <p>SIGUSR1</p>
         */
        @NameInMap("Signal")
        public String signal;

        /**
         * <strong>example:</strong>
         * <p>oper*********</p>
         */
        @NameInMap("SignalId")
        public String signalId;

        /**
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListSignalsResponseBodySignals build(java.util.Map<String, ?> map) throws Exception {
            ListSignalsResponseBodySignals self = new ListSignalsResponseBodySignals();
            return TeaModel.build(map, self);
        }

        public ListSignalsResponseBodySignals setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public ListSignalsResponseBodySignals setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListSignalsResponseBodySignals setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListSignalsResponseBodySignals setPodNames(java.util.List<String> podNames) {
            this.podNames = podNames;
            return this;
        }
        public java.util.List<String> getPodNames() {
            return this.podNames;
        }

        public ListSignalsResponseBodySignals setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListSignalsResponseBodySignals setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public ListSignalsResponseBodySignals setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListSignalsResponseBodySignals setSignal(String signal) {
            this.signal = signal;
            return this;
        }
        public String getSignal() {
            return this.signal;
        }

        public ListSignalsResponseBodySignals setSignalId(String signalId) {
            this.signalId = signalId;
            return this;
        }
        public String getSignalId() {
            return this.signalId;
        }

        public ListSignalsResponseBodySignals setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
