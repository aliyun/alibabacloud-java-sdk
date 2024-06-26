// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ListProjectFullVerifyResultResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Contact the administrator.</p>
     */
    @NameInMap("Advice")
    public String advice;

    /**
     * <strong>example:</strong>
     * <p>INNER_ERROR</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public ListProjectFullVerifyResultResponseBodyData data;

    @NameInMap("ErrorDetail")
    public ListProjectFullVerifyResultResponseBodyErrorDetail errorDetail;

    /**
     * <strong>example:</strong>
     * <p>A system error occurred.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListProjectFullVerifyResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectFullVerifyResultResponseBody self = new ListProjectFullVerifyResultResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectFullVerifyResultResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public ListProjectFullVerifyResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListProjectFullVerifyResultResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public ListProjectFullVerifyResultResponseBody setData(ListProjectFullVerifyResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListProjectFullVerifyResultResponseBodyData getData() {
        return this.data;
    }

    public ListProjectFullVerifyResultResponseBody setErrorDetail(ListProjectFullVerifyResultResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ListProjectFullVerifyResultResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public ListProjectFullVerifyResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListProjectFullVerifyResultResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectFullVerifyResultResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProjectFullVerifyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectFullVerifyResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProjectFullVerifyResultResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails self = new ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails();
            return TeaModel.build(map, self);
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("ConsistentCount")
        public Long consistentCount;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DestOnlyCount")
        public Long destOnlyCount;

        /**
         * <strong>example:</strong>
         * <p>dest_db</p>
         */
        @NameInMap("DestSchemaName")
        public String destSchemaName;

        @NameInMap("ErrorDetails")
        public java.util.List<ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails> errorDetails;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MismatchedCount")
        public Long mismatchedCount;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("ResultDesc")
        public String resultDesc;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ResultType")
        public String resultType;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SourceOnlyCount")
        public Long sourceOnlyCount;

        /**
         * <strong>example:</strong>
         * <p>source_db</p>
         */
        @NameInMap("SourceSchemaName")
        public String sourceSchemaName;

        /**
         * <strong>example:</strong>
         * <p>source_table</p>
         */
        @NameInMap("SourceTableName")
        public String sourceTableName;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics build(java.util.Map<String, ?> map) throws Exception {
            ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics self = new ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics();
            return TeaModel.build(map, self);
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setConsistentCount(Long consistentCount) {
            this.consistentCount = consistentCount;
            return this;
        }
        public Long getConsistentCount() {
            return this.consistentCount;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setDestOnlyCount(Long destOnlyCount) {
            this.destOnlyCount = destOnlyCount;
            return this;
        }
        public Long getDestOnlyCount() {
            return this.destOnlyCount;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setDestSchemaName(String destSchemaName) {
            this.destSchemaName = destSchemaName;
            return this;
        }
        public String getDestSchemaName() {
            return this.destSchemaName;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setErrorDetails(java.util.List<ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatisticsErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setMismatchedCount(Long mismatchedCount) {
            this.mismatchedCount = mismatchedCount;
            return this;
        }
        public Long getMismatchedCount() {
            return this.mismatchedCount;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setResultDesc(String resultDesc) {
            this.resultDesc = resultDesc;
            return this;
        }
        public String getResultDesc() {
            return this.resultDesc;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setResultType(String resultType) {
            this.resultType = resultType;
            return this;
        }
        public String getResultType() {
            return this.resultType;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setSourceOnlyCount(Long sourceOnlyCount) {
            this.sourceOnlyCount = sourceOnlyCount;
            return this;
        }
        public Long getSourceOnlyCount() {
            return this.sourceOnlyCount;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setSourceSchemaName(String sourceSchemaName) {
            this.sourceSchemaName = sourceSchemaName;
            return this;
        }
        public String getSourceSchemaName() {
            return this.sourceSchemaName;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setSourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            return this;
        }
        public String getSourceTableName() {
            return this.sourceTableName;
        }

        public ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListProjectFullVerifyResultResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("DifferentNumber")
        public Long differentNumber;

        @NameInMap("FullVerifyTableStatistics")
        public java.util.List<ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics> fullVerifyTableStatistics;

        public static ListProjectFullVerifyResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectFullVerifyResultResponseBodyData self = new ListProjectFullVerifyResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectFullVerifyResultResponseBodyData setDifferentNumber(Long differentNumber) {
            this.differentNumber = differentNumber;
            return this;
        }
        public Long getDifferentNumber() {
            return this.differentNumber;
        }

        public ListProjectFullVerifyResultResponseBodyData setFullVerifyTableStatistics(java.util.List<ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics> fullVerifyTableStatistics) {
            this.fullVerifyTableStatistics = fullVerifyTableStatistics;
            return this;
        }
        public java.util.List<ListProjectFullVerifyResultResponseBodyDataFullVerifyTableStatistics> getFullVerifyTableStatistics() {
            return this.fullVerifyTableStatistics;
        }

    }

    public static class ListProjectFullVerifyResultResponseBodyErrorDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CM-RESOAT1111</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        /**
         * <strong>example:</strong>
         * <p>ERROR</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <strong>example:</strong>
         * <p>A system error occurred.</p>
         */
        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static ListProjectFullVerifyResultResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            ListProjectFullVerifyResultResponseBodyErrorDetail self = new ListProjectFullVerifyResultResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public ListProjectFullVerifyResultResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
