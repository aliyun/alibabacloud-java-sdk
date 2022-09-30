// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsOpenAPIProjectStepsResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyData> data;

    @NameInMap("ErrorDetail")
    public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail errorDetail;

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

    public static DescribeOmsOpenAPIProjectStepsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsOpenAPIProjectStepsResponseBody self = new DescribeOmsOpenAPIProjectStepsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setData(java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setErrorDetail(DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeOmsOpenAPIProjectStepsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("Proposal")
        public String proposal;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails self = new DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails> errorDetails;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ErrorParam")
        public java.util.Map<String, String> errorParam;

        @NameInMap("FailedTime")
        public String failedTime;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo self = new DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo setErrorDetails(java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfoErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo setErrorParam(java.util.Map<String, String> errorParam) {
            this.errorParam = errorParam;
            return this;
        }
        public java.util.Map<String, String> getErrorParam() {
            return this.errorParam;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview extends TeaModel {
        @NameInMap("EstimatedRemainingTimeOfSec")
        public Long estimatedRemainingTimeOfSec;

        @NameInMap("EstimatedTotalCount")
        public Long estimatedTotalCount;

        @NameInMap("FinishedCount")
        public Long finishedCount;

        @NameInMap("Progress")
        public Integer progress;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview self = new DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview setEstimatedRemainingTimeOfSec(Long estimatedRemainingTimeOfSec) {
            this.estimatedRemainingTimeOfSec = estimatedRemainingTimeOfSec;
            return this;
        }
        public Long getEstimatedRemainingTimeOfSec() {
            return this.estimatedRemainingTimeOfSec;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview setEstimatedTotalCount(Long estimatedTotalCount) {
            this.estimatedTotalCount = estimatedTotalCount;
            return this;
        }
        public Long getEstimatedTotalCount() {
            return this.estimatedTotalCount;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview setFinishedCount(Long finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }
        public Long getFinishedCount() {
            return this.finishedCount;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo extends TeaModel {
        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("ConnectorFullProgressOverview")
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview connectorFullProgressOverview;

        @NameInMap("DeployId")
        public String deployId;

        @NameInMap("DstIops")
        public Long dstIops;

        @NameInMap("DstRps")
        public Long dstRps;

        @NameInMap("DstRpsRef")
        public Long dstRpsRef;

        @NameInMap("DstRt")
        public Long dstRt;

        @NameInMap("DstRtRef")
        public Long dstRtRef;

        @NameInMap("Gmt")
        public Long gmt;

        @NameInMap("Inconsistencies")
        public Long inconsistencies;

        @NameInMap("IncrTimestampCheckpoint")
        public Long incrTimestampCheckpoint;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ProcessedRecords")
        public Long processedRecords;

        @NameInMap("Skipped")
        public Boolean skipped;

        @NameInMap("SrcIops")
        public Long srcIops;

        @NameInMap("SrcIopsRef")
        public Long srcIopsRef;

        @NameInMap("SrcRps")
        public Long srcRps;

        @NameInMap("SrcRpsRef")
        public Long srcRpsRef;

        @NameInMap("SrcRt")
        public Long srcRt;

        @NameInMap("SrcRtRef")
        public Long srcRtRef;

        @NameInMap("Validated")
        public Boolean validated;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo self = new DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setConnectorFullProgressOverview(DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview connectorFullProgressOverview) {
            this.connectorFullProgressOverview = connectorFullProgressOverview;
            return this;
        }
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfoConnectorFullProgressOverview getConnectorFullProgressOverview() {
            return this.connectorFullProgressOverview;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDeployId(String deployId) {
            this.deployId = deployId;
            return this;
        }
        public String getDeployId() {
            return this.deployId;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDstIops(Long dstIops) {
            this.dstIops = dstIops;
            return this;
        }
        public Long getDstIops() {
            return this.dstIops;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDstRps(Long dstRps) {
            this.dstRps = dstRps;
            return this;
        }
        public Long getDstRps() {
            return this.dstRps;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDstRpsRef(Long dstRpsRef) {
            this.dstRpsRef = dstRpsRef;
            return this;
        }
        public Long getDstRpsRef() {
            return this.dstRpsRef;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDstRt(Long dstRt) {
            this.dstRt = dstRt;
            return this;
        }
        public Long getDstRt() {
            return this.dstRt;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setDstRtRef(Long dstRtRef) {
            this.dstRtRef = dstRtRef;
            return this;
        }
        public Long getDstRtRef() {
            return this.dstRtRef;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setGmt(Long gmt) {
            this.gmt = gmt;
            return this;
        }
        public Long getGmt() {
            return this.gmt;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setInconsistencies(Long inconsistencies) {
            this.inconsistencies = inconsistencies;
            return this;
        }
        public Long getInconsistencies() {
            return this.inconsistencies;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setIncrTimestampCheckpoint(Long incrTimestampCheckpoint) {
            this.incrTimestampCheckpoint = incrTimestampCheckpoint;
            return this;
        }
        public Long getIncrTimestampCheckpoint() {
            return this.incrTimestampCheckpoint;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setProcessedRecords(Long processedRecords) {
            this.processedRecords = processedRecords;
            return this;
        }
        public Long getProcessedRecords() {
            return this.processedRecords;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSkipped(Boolean skipped) {
            this.skipped = skipped;
            return this;
        }
        public Boolean getSkipped() {
            return this.skipped;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcIops(Long srcIops) {
            this.srcIops = srcIops;
            return this;
        }
        public Long getSrcIops() {
            return this.srcIops;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcIopsRef(Long srcIopsRef) {
            this.srcIopsRef = srcIopsRef;
            return this;
        }
        public Long getSrcIopsRef() {
            return this.srcIopsRef;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcRps(Long srcRps) {
            this.srcRps = srcRps;
            return this;
        }
        public Long getSrcRps() {
            return this.srcRps;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcRpsRef(Long srcRpsRef) {
            this.srcRpsRef = srcRpsRef;
            return this;
        }
        public Long getSrcRpsRef() {
            return this.srcRpsRef;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcRt(Long srcRt) {
            this.srcRt = srcRt;
            return this;
        }
        public Long getSrcRt() {
            return this.srcRt;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setSrcRtRef(Long srcRtRef) {
            this.srcRtRef = srcRtRef;
            return this;
        }
        public Long getSrcRtRef() {
            return this.srcRtRef;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo setValidated(Boolean validated) {
            this.validated = validated;
            return this;
        }
        public Boolean getValidated() {
            return this.validated;
        }

    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyData extends TeaModel {
        @NameInMap("EstimatedRemainingSeconds")
        public Long estimatedRemainingSeconds;

        @NameInMap("ExtraInfo")
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo extraInfo;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Interactive")
        public Boolean interactive;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StepDescription")
        public String stepDescription;

        @NameInMap("StepInfo")
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo stepInfo;

        @NameInMap("StepName")
        public String stepName;

        @NameInMap("StepOrder")
        public Integer stepOrder;

        @NameInMap("StepProgress")
        public Integer stepProgress;

        @NameInMap("StepStatus")
        public String stepStatus;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyData self = new DescribeOmsOpenAPIProjectStepsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setEstimatedRemainingSeconds(Long estimatedRemainingSeconds) {
            this.estimatedRemainingSeconds = estimatedRemainingSeconds;
            return this;
        }
        public Long getEstimatedRemainingSeconds() {
            return this.estimatedRemainingSeconds;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setExtraInfo(DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setInteractive(Boolean interactive) {
            this.interactive = interactive;
            return this;
        }
        public Boolean getInteractive() {
            return this.interactive;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepDescription(String stepDescription) {
            this.stepDescription = stepDescription;
            return this;
        }
        public String getStepDescription() {
            return this.stepDescription;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepInfo(DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo stepInfo) {
            this.stepInfo = stepInfo;
            return this;
        }
        public DescribeOmsOpenAPIProjectStepsResponseBodyDataStepInfo getStepInfo() {
            return this.stepInfo;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepProgress(Integer stepProgress) {
            this.stepProgress = stepProgress;
            return this;
        }
        public Integer getStepProgress() {
            return this.stepProgress;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyData setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

    public static class DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("Proposal")
        public String proposal;

        public static DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail self = new DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOmsOpenAPIProjectStepsResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
