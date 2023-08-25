// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectStepsResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public java.util.List<DescribeProjectStepsResponseBodyData> data;

    @NameInMap("ErrorDetail")
    public DescribeProjectStepsResponseBodyErrorDetail errorDetail;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeProjectStepsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectStepsResponseBody self = new DescribeProjectStepsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeProjectStepsResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeProjectStepsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeProjectStepsResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DescribeProjectStepsResponseBody setData(java.util.List<DescribeProjectStepsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeProjectStepsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeProjectStepsResponseBody setErrorDetail(DescribeProjectStepsResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public DescribeProjectStepsResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public DescribeProjectStepsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeProjectStepsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeProjectStepsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeProjectStepsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeProjectStepsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeProjectStepsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails self = new DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

    public static class DescribeProjectStepsResponseBodyDataExtraInfo extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails> errorDetails;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ErrorParam")
        public java.util.Map<String, String> errorParam;

        @NameInMap("FailedTime")
        public String failedTime;

        public static DescribeProjectStepsResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectStepsResponseBodyDataExtraInfo self = new DescribeProjectStepsResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeProjectStepsResponseBodyDataExtraInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfo setErrorDetails(java.util.List<DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeProjectStepsResponseBodyDataExtraInfoErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfo setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfo setErrorParam(java.util.Map<String, String> errorParam) {
            this.errorParam = errorParam;
            return this;
        }
        public java.util.Map<String, String> getErrorParam() {
            return this.errorParam;
        }

        public DescribeProjectStepsResponseBodyDataExtraInfo setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

    }

    public static class DescribeProjectStepsResponseBodyData extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("ExtraInfo")
        public DescribeProjectStepsResponseBodyDataExtraInfo extraInfo;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Name")
        public String name;

        @NameInMap("Order")
        public Integer order;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StepInfo")
        public java.util.Map<String, ?> stepInfo;

        public static DescribeProjectStepsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectStepsResponseBodyData self = new DescribeProjectStepsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeProjectStepsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeProjectStepsResponseBodyData setExtraInfo(DescribeProjectStepsResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeProjectStepsResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeProjectStepsResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeProjectStepsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeProjectStepsResponseBodyData setOrder(Integer order) {
            this.order = order;
            return this;
        }
        public Integer getOrder() {
            return this.order;
        }

        public DescribeProjectStepsResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeProjectStepsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeProjectStepsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeProjectStepsResponseBodyData setStepInfo(java.util.Map<String, ?> stepInfo) {
            this.stepInfo = stepInfo;
            return this;
        }
        public java.util.Map<String, ?> getStepInfo() {
            return this.stepInfo;
        }

    }

    public static class DescribeProjectStepsResponseBodyErrorDetail extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ExtraContext")
        public java.util.Map<String, ?> extraContext;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("MessageMcmsContext")
        public java.util.Map<String, String> messageMcmsContext;

        @NameInMap("MessageMcmsKey")
        public String messageMcmsKey;

        @NameInMap("Proposal")
        public String proposal;

        @NameInMap("ProposalMcmsContext")
        public java.util.Map<String, String> proposalMcmsContext;

        @NameInMap("ProposalMcmsKey")
        public String proposalMcmsKey;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("ReasonMcmsContext")
        public java.util.Map<String, String> reasonMcmsContext;

        @NameInMap("ReasonMcmsKey")
        public String reasonMcmsKey;

        @NameInMap("UpstreamErrorDetail")
        public Object upstreamErrorDetail;

        public static DescribeProjectStepsResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeProjectStepsResponseBodyErrorDetail self = new DescribeProjectStepsResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public DescribeProjectStepsResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setExtraContext(java.util.Map<String, ?> extraContext) {
            this.extraContext = extraContext;
            return this;
        }
        public java.util.Map<String, ?> getExtraContext() {
            return this.extraContext;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setMessageMcmsContext(java.util.Map<String, String> messageMcmsContext) {
            this.messageMcmsContext = messageMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getMessageMcmsContext() {
            return this.messageMcmsContext;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setMessageMcmsKey(String messageMcmsKey) {
            this.messageMcmsKey = messageMcmsKey;
            return this;
        }
        public String getMessageMcmsKey() {
            return this.messageMcmsKey;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setProposalMcmsContext(java.util.Map<String, String> proposalMcmsContext) {
            this.proposalMcmsContext = proposalMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getProposalMcmsContext() {
            return this.proposalMcmsContext;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setProposalMcmsKey(String proposalMcmsKey) {
            this.proposalMcmsKey = proposalMcmsKey;
            return this;
        }
        public String getProposalMcmsKey() {
            return this.proposalMcmsKey;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setReasonMcmsContext(java.util.Map<String, String> reasonMcmsContext) {
            this.reasonMcmsContext = reasonMcmsContext;
            return this;
        }
        public java.util.Map<String, String> getReasonMcmsContext() {
            return this.reasonMcmsContext;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setReasonMcmsKey(String reasonMcmsKey) {
            this.reasonMcmsKey = reasonMcmsKey;
            return this;
        }
        public String getReasonMcmsKey() {
            return this.reasonMcmsKey;
        }

        public DescribeProjectStepsResponseBodyErrorDetail setUpstreamErrorDetail(Object upstreamErrorDetail) {
            this.upstreamErrorDetail = upstreamErrorDetail;
            return this;
        }
        public Object getUpstreamErrorDetail() {
            return this.upstreamErrorDetail;
        }

    }

}
