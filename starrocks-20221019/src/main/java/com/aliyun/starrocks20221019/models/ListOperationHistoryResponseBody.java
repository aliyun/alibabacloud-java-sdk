// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ListOperationHistoryResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{     &quot;PolicyType&quot;: &quot;AccountLevelIdentityBasedPolicy&quot;,     &quot;AuthPrincipalOwnerId&quot;: &quot;xxx&quot;,     &quot;EncodedDiagnosticMessage&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalType&quot;: &quot;xxx&quot;,     &quot;AuthPrincipalDisplayName&quot;: &quot;xxx&quot;,     &quot;NoPermissionType&quot;: &quot;ImplicitDeny&quot;,     &quot;AuthAction&quot;: &quot;sr:xxx&quot;   }</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public java.util.List<ListOperationHistoryResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>InvalidParams</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>832</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListOperationHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOperationHistoryResponseBody self = new ListOperationHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOperationHistoryResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListOperationHistoryResponseBody setData(java.util.List<ListOperationHistoryResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListOperationHistoryResponseBodyData> getData() {
        return this.data;
    }

    public ListOperationHistoryResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ListOperationHistoryResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public ListOperationHistoryResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOperationHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOperationHistoryResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListOperationHistoryResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListOperationHistoryResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FE enable = true</p>
         */
        @NameInMap("AfterValue")
        public String afterValue;

        /**
         * <strong>example:</strong>
         * <p>FE enable = false</p>
         */
        @NameInMap("BeforeValue")
        public String beforeValue;

        /**
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1742179008000</p>
         */
        @NameInMap("GmtEnd")
        public Long gmtEnd;

        /**
         * <strong>example:</strong>
         * <p>c-cd7a3a6f2186d5c9</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OperationDetail")
        public String operationDetail;

        /**
         * <strong>example:</strong>
         * <p>op-f49743caa809****</p>
         */
        @NameInMap("OperationId")
        public String operationId;

        /**
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("OperationStatus")
        public String operationStatus;

        /**
         * <strong>example:</strong>
         * <p>upgrade_version</p>
         */
        @NameInMap("OperationType")
        public String operationType;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        public static ListOperationHistoryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListOperationHistoryResponseBodyData self = new ListOperationHistoryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListOperationHistoryResponseBodyData setAfterValue(String afterValue) {
            this.afterValue = afterValue;
            return this;
        }
        public String getAfterValue() {
            return this.afterValue;
        }

        public ListOperationHistoryResponseBodyData setBeforeValue(String beforeValue) {
            this.beforeValue = beforeValue;
            return this;
        }
        public String getBeforeValue() {
            return this.beforeValue;
        }

        public ListOperationHistoryResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListOperationHistoryResponseBodyData setGmtEnd(Long gmtEnd) {
            this.gmtEnd = gmtEnd;
            return this;
        }
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        public ListOperationHistoryResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListOperationHistoryResponseBodyData setOperationDetail(String operationDetail) {
            this.operationDetail = operationDetail;
            return this;
        }
        public String getOperationDetail() {
            return this.operationDetail;
        }

        public ListOperationHistoryResponseBodyData setOperationId(String operationId) {
            this.operationId = operationId;
            return this;
        }
        public String getOperationId() {
            return this.operationId;
        }

        public ListOperationHistoryResponseBodyData setOperationStatus(String operationStatus) {
            this.operationStatus = operationStatus;
            return this;
        }
        public String getOperationStatus() {
            return this.operationStatus;
        }

        public ListOperationHistoryResponseBodyData setOperationType(String operationType) {
            this.operationType = operationType;
            return this;
        }
        public String getOperationType() {
            return this.operationType;
        }

        public ListOperationHistoryResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

    }

}
