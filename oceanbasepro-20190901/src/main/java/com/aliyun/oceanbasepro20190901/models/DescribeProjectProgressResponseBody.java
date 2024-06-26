// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectProgressResponseBody extends TeaModel {
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
    public DescribeProjectProgressResponseBodyData data;

    @NameInMap("ErrorDetail")
    public DescribeProjectProgressResponseBodyErrorDetail errorDetail;

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
     * <p>1</p>
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

    public static DescribeProjectProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectProgressResponseBody self = new DescribeProjectProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectProgressResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeProjectProgressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProjectProgressResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DescribeProjectProgressResponseBody setData(DescribeProjectProgressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeProjectProgressResponseBodyData getData() {
        return this.data;
    }

    public DescribeProjectProgressResponseBody setErrorDetail(DescribeProjectProgressResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public DescribeProjectProgressResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public DescribeProjectProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProjectProgressResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProjectProgressResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProjectProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProjectProgressResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProjectProgressResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MEDIUM</p>
         */
        @NameInMap("AlarmLevel")
        public String alarmLevel;

        /**
         * <strong>example:</strong>
         * <p>PRE_CHECK</p>
         */
        @NameInMap("CurrentStep")
        public String currentStep;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableFullTransfer")
        public Boolean enableFullTransfer;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableIncrSync")
        public Boolean enableIncrSync;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableReverseIncrTransfer")
        public Boolean enableReverseIncrTransfer;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableStructTransfer")
        public Boolean enableStructTransfer;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FullTransferProgress")
        public Integer fullTransferProgress;

        /**
         * <strong>example:</strong>
         * <p>1689248064</p>
         */
        @NameInMap("IncrSyncCheckpoint")
        public Long incrSyncCheckpoint;

        /**
         * <strong>example:</strong>
         * <p>np_fe****</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>1689248075</p>
         */
        @NameInMap("ReverseIncrTransferCheckpoint")
        public Long reverseIncrTransferCheckpoint;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("StructTransferProgress")
        public Integer structTransferProgress;

        public static DescribeProjectProgressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectProgressResponseBodyData self = new DescribeProjectProgressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProjectProgressResponseBodyData setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public DescribeProjectProgressResponseBodyData setCurrentStep(String currentStep) {
            this.currentStep = currentStep;
            return this;
        }
        public String getCurrentStep() {
            return this.currentStep;
        }

        public DescribeProjectProgressResponseBodyData setEnableFullTransfer(Boolean enableFullTransfer) {
            this.enableFullTransfer = enableFullTransfer;
            return this;
        }
        public Boolean getEnableFullTransfer() {
            return this.enableFullTransfer;
        }

        public DescribeProjectProgressResponseBodyData setEnableIncrSync(Boolean enableIncrSync) {
            this.enableIncrSync = enableIncrSync;
            return this;
        }
        public Boolean getEnableIncrSync() {
            return this.enableIncrSync;
        }

        public DescribeProjectProgressResponseBodyData setEnableReverseIncrTransfer(Boolean enableReverseIncrTransfer) {
            this.enableReverseIncrTransfer = enableReverseIncrTransfer;
            return this;
        }
        public Boolean getEnableReverseIncrTransfer() {
            return this.enableReverseIncrTransfer;
        }

        public DescribeProjectProgressResponseBodyData setEnableStructTransfer(Boolean enableStructTransfer) {
            this.enableStructTransfer = enableStructTransfer;
            return this;
        }
        public Boolean getEnableStructTransfer() {
            return this.enableStructTransfer;
        }

        public DescribeProjectProgressResponseBodyData setFullTransferProgress(Integer fullTransferProgress) {
            this.fullTransferProgress = fullTransferProgress;
            return this;
        }
        public Integer getFullTransferProgress() {
            return this.fullTransferProgress;
        }

        public DescribeProjectProgressResponseBodyData setIncrSyncCheckpoint(Long incrSyncCheckpoint) {
            this.incrSyncCheckpoint = incrSyncCheckpoint;
            return this;
        }
        public Long getIncrSyncCheckpoint() {
            return this.incrSyncCheckpoint;
        }

        public DescribeProjectProgressResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeProjectProgressResponseBodyData setReverseIncrTransferCheckpoint(Long reverseIncrTransferCheckpoint) {
            this.reverseIncrTransferCheckpoint = reverseIncrTransferCheckpoint;
            return this;
        }
        public Long getReverseIncrTransferCheckpoint() {
            return this.reverseIncrTransferCheckpoint;
        }

        public DescribeProjectProgressResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProjectProgressResponseBodyData setStructTransferProgress(Integer structTransferProgress) {
            this.structTransferProgress = structTransferProgress;
            return this;
        }
        public Integer getStructTransferProgress() {
            return this.structTransferProgress;
        }

    }

    public static class DescribeProjectProgressResponseBodyErrorDetail extends TeaModel {
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

        public static DescribeProjectProgressResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectProgressResponseBodyErrorDetail self = new DescribeProjectProgressResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public DescribeProjectProgressResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectProgressResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
