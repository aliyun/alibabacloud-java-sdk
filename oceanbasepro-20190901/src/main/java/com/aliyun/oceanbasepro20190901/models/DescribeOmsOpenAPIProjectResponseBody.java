// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsOpenAPIProjectResponseBody extends TeaModel {
    @NameInMap("Advice")
    public String advice;

    @NameInMap("Code")
    public String code;

    @NameInMap("Cost")
    public String cost;

    @NameInMap("Data")
    public DescribeOmsOpenAPIProjectResponseBodyData data;

    @NameInMap("ErrorDetail")
    public DescribeOmsOpenAPIProjectResponseBodyErrorDetail errorDetail;

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

    public static DescribeOmsOpenAPIProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsOpenAPIProjectResponseBody self = new DescribeOmsOpenAPIProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOmsOpenAPIProjectResponseBody setAdvice(String advice) {
        this.advice = advice;
        return this;
    }
    public String getAdvice() {
        return this.advice;
    }

    public DescribeOmsOpenAPIProjectResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeOmsOpenAPIProjectResponseBody setCost(String cost) {
        this.cost = cost;
        return this;
    }
    public String getCost() {
        return this.cost;
    }

    public DescribeOmsOpenAPIProjectResponseBody setData(DescribeOmsOpenAPIProjectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeOmsOpenAPIProjectResponseBodyData getData() {
        return this.data;
    }

    public DescribeOmsOpenAPIProjectResponseBody setErrorDetail(DescribeOmsOpenAPIProjectResponseBodyErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public DescribeOmsOpenAPIProjectResponseBodyErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public DescribeOmsOpenAPIProjectResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeOmsOpenAPIProjectResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeOmsOpenAPIProjectResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeOmsOpenAPIProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOmsOpenAPIProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeOmsOpenAPIProjectResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataDestConfig extends TeaModel {
        @NameInMap("EnableMsgTrace")
        public Boolean enableMsgTrace;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("MsgTags")
        public String msgTags;

        @NameInMap("Partition")
        public Integer partition;

        @NameInMap("PartitionMode")
        public String partitionMode;

        @NameInMap("ProducerGroup")
        public String producerGroup;

        @NameInMap("SendMsgTimeout")
        public Long sendMsgTimeout;

        @NameInMap("SequenceEnable")
        public Boolean sequenceEnable;

        @NameInMap("SequenceStartTimestamp")
        public Long sequenceStartTimestamp;

        @NameInMap("SerializerType")
        public String serializerType;

        @NameInMap("TopicType")
        public String topicType;

        public static DescribeOmsOpenAPIProjectResponseBodyDataDestConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataDestConfig self = new DescribeOmsOpenAPIProjectResponseBodyDataDestConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setEnableMsgTrace(Boolean enableMsgTrace) {
            this.enableMsgTrace = enableMsgTrace;
            return this;
        }
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setMsgTags(String msgTags) {
            this.msgTags = msgTags;
            return this;
        }
        public String getMsgTags() {
            return this.msgTags;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setPartitionMode(String partitionMode) {
            this.partitionMode = partitionMode;
            return this;
        }
        public String getPartitionMode() {
            return this.partitionMode;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setProducerGroup(String producerGroup) {
            this.producerGroup = producerGroup;
            return this;
        }
        public String getProducerGroup() {
            return this.producerGroup;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setSendMsgTimeout(Long sendMsgTimeout) {
            this.sendMsgTimeout = sendMsgTimeout;
            return this;
        }
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setSequenceEnable(Boolean sequenceEnable) {
            this.sequenceEnable = sequenceEnable;
            return this;
        }
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setSequenceStartTimestamp(Long sequenceStartTimestamp) {
            this.sequenceStartTimestamp = sequenceStartTimestamp;
            return this;
        }
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setSerializerType(String serializerType) {
            this.serializerType = serializerType;
            return this;
        }
        public String getSerializerType() {
            return this.serializerType;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataLabels extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Creator")
        public String creator;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static DescribeOmsOpenAPIProjectResponseBodyDataLabels build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataLabels self = new DescribeOmsOpenAPIProjectResponseBodyDataLabels();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataLabels setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataLabels setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataLabels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataLabels setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig extends TeaModel {
        @NameInMap("EnableMsgTrace")
        public Boolean enableMsgTrace;

        @NameInMap("EndpointId")
        public String endpointId;

        @NameInMap("EndpointType")
        public String endpointType;

        @NameInMap("MsgTags")
        public String msgTags;

        @NameInMap("Partition")
        public Integer partition;

        @NameInMap("PartitionMode")
        public String partitionMode;

        @NameInMap("ProducerGroup")
        public String producerGroup;

        @NameInMap("SendMsgTimeout")
        public Long sendMsgTimeout;

        @NameInMap("SequenceEnable")
        public Boolean sequenceEnable;

        @NameInMap("SequenceStartTimestamp")
        public Long sequenceStartTimestamp;

        @NameInMap("SerializerType")
        public String serializerType;

        @NameInMap("TopicType")
        public String topicType;

        public static DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig self = new DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setEnableMsgTrace(Boolean enableMsgTrace) {
            this.enableMsgTrace = enableMsgTrace;
            return this;
        }
        public Boolean getEnableMsgTrace() {
            return this.enableMsgTrace;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setEndpointId(String endpointId) {
            this.endpointId = endpointId;
            return this;
        }
        public String getEndpointId() {
            return this.endpointId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setEndpointType(String endpointType) {
            this.endpointType = endpointType;
            return this;
        }
        public String getEndpointType() {
            return this.endpointType;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setMsgTags(String msgTags) {
            this.msgTags = msgTags;
            return this;
        }
        public String getMsgTags() {
            return this.msgTags;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setPartition(Integer partition) {
            this.partition = partition;
            return this;
        }
        public Integer getPartition() {
            return this.partition;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setPartitionMode(String partitionMode) {
            this.partitionMode = partitionMode;
            return this;
        }
        public String getPartitionMode() {
            return this.partitionMode;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setProducerGroup(String producerGroup) {
            this.producerGroup = producerGroup;
            return this;
        }
        public String getProducerGroup() {
            return this.producerGroup;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setSendMsgTimeout(Long sendMsgTimeout) {
            this.sendMsgTimeout = sendMsgTimeout;
            return this;
        }
        public Long getSendMsgTimeout() {
            return this.sendMsgTimeout;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setSequenceEnable(Boolean sequenceEnable) {
            this.sequenceEnable = sequenceEnable;
            return this;
        }
        public Boolean getSequenceEnable() {
            return this.sequenceEnable;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setSequenceStartTimestamp(Long sequenceStartTimestamp) {
            this.sequenceStartTimestamp = sequenceStartTimestamp;
            return this;
        }
        public Long getSequenceStartTimestamp() {
            return this.sequenceStartTimestamp;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setSerializerType(String serializerType) {
            this.serializerType = serializerType;
            return this;
        }
        public String getSerializerType() {
            return this.serializerType;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig setTopicType(String topicType) {
            this.topicType = topicType;
            return this;
        }
        public String getTopicType() {
            return this.topicType;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("Proposal")
        public String proposal;

        public static DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails self = new DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorDetails")
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails> errorDetails;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ErrorParam")
        public java.util.Map<String, String> errorParam;

        @NameInMap("FailedTime")
        public String failedTime;

        public static DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo self = new DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo setErrorDetails(java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails> errorDetails) {
            this.errorDetails = errorDetails;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfoErrorDetails> getErrorDetails() {
            return this.errorDetails;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo setErrorParam(java.util.Map<String, String> errorParam) {
            this.errorParam = errorParam;
            return this;
        }
        public java.util.Map<String, String> getErrorParam() {
            return this.errorParam;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo setFailedTime(String failedTime) {
            this.failedTime = failedTime;
            return this;
        }
        public String getFailedTime() {
            return this.failedTime;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview extends TeaModel {
        @NameInMap("EstimatedRemainingTimeOfSec")
        public Long estimatedRemainingTimeOfSec;

        @NameInMap("EstimatedTotalCount")
        public Long estimatedTotalCount;

        @NameInMap("FinishedCount")
        public Long finishedCount;

        @NameInMap("Progress")
        public Integer progress;

        public static DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview self = new DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview setEstimatedRemainingTimeOfSec(Long estimatedRemainingTimeOfSec) {
            this.estimatedRemainingTimeOfSec = estimatedRemainingTimeOfSec;
            return this;
        }
        public Long getEstimatedRemainingTimeOfSec() {
            return this.estimatedRemainingTimeOfSec;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview setEstimatedTotalCount(Long estimatedTotalCount) {
            this.estimatedTotalCount = estimatedTotalCount;
            return this;
        }
        public Long getEstimatedTotalCount() {
            return this.estimatedTotalCount;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview setFinishedCount(Long finishedCount) {
            this.finishedCount = finishedCount;
            return this;
        }
        public Long getFinishedCount() {
            return this.finishedCount;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo extends TeaModel {
        @NameInMap("Capacity")
        public Long capacity;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("ConnectorFullProgressOverview")
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview connectorFullProgressOverview;

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

        public static DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo self = new DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setConnectorFullProgressOverview(DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview connectorFullProgressOverview) {
            this.connectorFullProgressOverview = connectorFullProgressOverview;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfoConnectorFullProgressOverview getConnectorFullProgressOverview() {
            return this.connectorFullProgressOverview;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDeployId(String deployId) {
            this.deployId = deployId;
            return this;
        }
        public String getDeployId() {
            return this.deployId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDstIops(Long dstIops) {
            this.dstIops = dstIops;
            return this;
        }
        public Long getDstIops() {
            return this.dstIops;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDstRps(Long dstRps) {
            this.dstRps = dstRps;
            return this;
        }
        public Long getDstRps() {
            return this.dstRps;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDstRpsRef(Long dstRpsRef) {
            this.dstRpsRef = dstRpsRef;
            return this;
        }
        public Long getDstRpsRef() {
            return this.dstRpsRef;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDstRt(Long dstRt) {
            this.dstRt = dstRt;
            return this;
        }
        public Long getDstRt() {
            return this.dstRt;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setDstRtRef(Long dstRtRef) {
            this.dstRtRef = dstRtRef;
            return this;
        }
        public Long getDstRtRef() {
            return this.dstRtRef;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setGmt(Long gmt) {
            this.gmt = gmt;
            return this;
        }
        public Long getGmt() {
            return this.gmt;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setInconsistencies(Long inconsistencies) {
            this.inconsistencies = inconsistencies;
            return this;
        }
        public Long getInconsistencies() {
            return this.inconsistencies;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setIncrTimestampCheckpoint(Long incrTimestampCheckpoint) {
            this.incrTimestampCheckpoint = incrTimestampCheckpoint;
            return this;
        }
        public Long getIncrTimestampCheckpoint() {
            return this.incrTimestampCheckpoint;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setProcessedRecords(Long processedRecords) {
            this.processedRecords = processedRecords;
            return this;
        }
        public Long getProcessedRecords() {
            return this.processedRecords;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSkipped(Boolean skipped) {
            this.skipped = skipped;
            return this;
        }
        public Boolean getSkipped() {
            return this.skipped;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcIops(Long srcIops) {
            this.srcIops = srcIops;
            return this;
        }
        public Long getSrcIops() {
            return this.srcIops;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcIopsRef(Long srcIopsRef) {
            this.srcIopsRef = srcIopsRef;
            return this;
        }
        public Long getSrcIopsRef() {
            return this.srcIopsRef;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcRps(Long srcRps) {
            this.srcRps = srcRps;
            return this;
        }
        public Long getSrcRps() {
            return this.srcRps;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcRpsRef(Long srcRpsRef) {
            this.srcRpsRef = srcRpsRef;
            return this;
        }
        public Long getSrcRpsRef() {
            return this.srcRpsRef;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcRt(Long srcRt) {
            this.srcRt = srcRt;
            return this;
        }
        public Long getSrcRt() {
            return this.srcRt;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setSrcRtRef(Long srcRtRef) {
            this.srcRtRef = srcRtRef;
            return this;
        }
        public Long getSrcRtRef() {
            return this.srcRtRef;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo setValidated(Boolean validated) {
            this.validated = validated;
            return this;
        }
        public Boolean getValidated() {
            return this.validated;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataSteps extends TeaModel {
        @NameInMap("EstimatedRemainingSeconds")
        public Long estimatedRemainingSeconds;

        @NameInMap("ExtraInfo")
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo extraInfo;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Interactive")
        public Boolean interactive;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("StepDescription")
        public String stepDescription;

        @NameInMap("StepInfo")
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo stepInfo;

        @NameInMap("StepName")
        public String stepName;

        @NameInMap("StepOrder")
        public Integer stepOrder;

        @NameInMap("StepProgress")
        public Integer stepProgress;

        @NameInMap("StepStatus")
        public String stepStatus;

        public static DescribeOmsOpenAPIProjectResponseBodyDataSteps build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataSteps self = new DescribeOmsOpenAPIProjectResponseBodyDataSteps();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setEstimatedRemainingSeconds(Long estimatedRemainingSeconds) {
            this.estimatedRemainingSeconds = estimatedRemainingSeconds;
            return this;
        }
        public Long getEstimatedRemainingSeconds() {
            return this.estimatedRemainingSeconds;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setExtraInfo(DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setInteractive(Boolean interactive) {
            this.interactive = interactive;
            return this;
        }
        public Boolean getInteractive() {
            return this.interactive;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepDescription(String stepDescription) {
            this.stepDescription = stepDescription;
            return this;
        }
        public String getStepDescription() {
            return this.stepDescription;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepInfo(DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo stepInfo) {
            this.stepInfo = stepInfo;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataStepsStepInfo getStepInfo() {
            return this.stepInfo;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepOrder(Integer stepOrder) {
            this.stepOrder = stepOrder;
            return this;
        }
        public Integer getStepOrder() {
            return this.stepOrder;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepProgress(Integer stepProgress) {
            this.stepProgress = stepProgress;
            return this;
        }
        public Integer getStepProgress() {
            return this.stepProgress;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataSteps setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema extends TeaModel {
        @NameInMap("DistributedKeys")
        public java.util.List<String> distributedKeys;

        @NameInMap("PartitionLifeCycle")
        public Integer partitionLifeCycle;

        @NameInMap("PartitionStatement")
        public String partitionStatement;

        @NameInMap("PrimaryKeys")
        public java.util.List<String> primaryKeys;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setDistributedKeys(java.util.List<String> distributedKeys) {
            this.distributedKeys = distributedKeys;
            return this;
        }
        public java.util.List<String> getDistributedKeys() {
            return this.distributedKeys;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPartitionLifeCycle(Integer partitionLifeCycle) {
            this.partitionLifeCycle = partitionLifeCycle;
            return this;
        }
        public Integer getPartitionLifeCycle() {
            return this.partitionLifeCycle;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPartitionStatement(String partitionStatement) {
            this.partitionStatement = partitionStatement;
            return this;
        }
        public String getPartitionStatement() {
            return this.partitionStatement;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema setPrimaryKeys(java.util.List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }
        public java.util.List<String> getPrimaryKeys() {
            return this.primaryKeys;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables extends TeaModel {
        @NameInMap("AdbTableSchema")
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema adbTableSchema;

        @NameInMap("FilterColumns")
        public java.util.List<String> filterColumns;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("ShardColumns")
        public java.util.List<String> shardColumns;

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("Type")
        public String type;

        @NameInMap("WhereClause")
        public String whereClause;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setAdbTableSchema(DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema adbTableSchema) {
            this.adbTableSchema = adbTableSchema;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTablesAdbTableSchema getAdbTableSchema() {
            return this.adbTableSchema;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setFilterColumns(java.util.List<String> filterColumns) {
            this.filterColumns = filterColumns;
            return this;
        }
        public java.util.List<String> getFilterColumns() {
            return this.filterColumns;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setShardColumns(java.util.List<String> shardColumns) {
            this.shardColumns = shardColumns;
            return this;
        }
        public java.util.List<String> getShardColumns() {
            return this.shardColumns;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables setWhereClause(String whereClause) {
            this.whereClause = whereClause;
            return this;
        }
        public String getWhereClause() {
            return this.whereClause;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases extends TeaModel {
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("MappedName")
        public String mappedName;

        @NameInMap("Tables")
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables> tables;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("Type")
        public String type;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setMappedName(String mappedName) {
            this.mappedName = mappedName;
            return this;
        }
        public String getMappedName() {
            return this.mappedName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setTables(java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabasesTables> getTables() {
            return this.tables;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases> databases;

        @NameInMap("Mode")
        public String mode;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping setDatabases(java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataTransferMappingDatabases> getDatabases() {
            return this.databases;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping setMode(String mode) {
            this.mode = mode;
            return this;
        }
        public String getMode() {
            return this.mode;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig extends TeaModel {
        @NameInMap("RecordTypeList")
        public java.util.List<String> recordTypeList;

        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        @NameInMap("StoreLogKeptHour")
        public Long storeLogKeptHour;

        @NameInMap("StoreTransactionEnabled")
        public Boolean storeTransactionEnabled;

        @NameInMap("TransferStepType")
        public String transferStepType;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setRecordTypeList(java.util.List<String> recordTypeList) {
            this.recordTypeList = recordTypeList;
            return this;
        }
        public java.util.List<String> getRecordTypeList() {
            return this.recordTypeList;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setStoreLogKeptHour(Long storeLogKeptHour) {
            this.storeLogKeptHour = storeLogKeptHour;
            return this;
        }
        public Long getStoreLogKeptHour() {
            return this.storeLogKeptHour;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setStoreTransactionEnabled(Boolean storeTransactionEnabled) {
            this.storeTransactionEnabled = storeTransactionEnabled;
            return this;
        }
        public Boolean getStoreTransactionEnabled() {
            return this.storeTransactionEnabled;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig setTransferStepType(String transferStepType) {
            this.transferStepType = transferStepType;
            return this;
        }
        public String getTransferStepType() {
            return this.transferStepType;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig extends TeaModel {
        @NameInMap("EnableFullSync")
        public Boolean enableFullSync;

        @NameInMap("EnableIncrSync")
        public Boolean enableIncrSync;

        @NameInMap("EnableStructSync")
        public Boolean enableStructSync;

        @NameInMap("IncrSyncStepTransferConfig")
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig incrSyncStepTransferConfig;

        public static DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig self = new DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig setEnableFullSync(Boolean enableFullSync) {
            this.enableFullSync = enableFullSync;
            return this;
        }
        public Boolean getEnableFullSync() {
            return this.enableFullSync;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig setEnableIncrSync(Boolean enableIncrSync) {
            this.enableIncrSync = enableIncrSync;
            return this;
        }
        public Boolean getEnableIncrSync() {
            return this.enableIncrSync;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig setEnableStructSync(Boolean enableStructSync) {
            this.enableStructSync = enableStructSync;
            return this;
        }
        public Boolean getEnableStructSync() {
            return this.enableStructSync;
        }

        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig setIncrSyncStepTransferConfig(DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig incrSyncStepTransferConfig) {
            this.incrSyncStepTransferConfig = incrSyncStepTransferConfig;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfigIncrSyncStepTransferConfig getIncrSyncStepTransferConfig() {
            return this.incrSyncStepTransferConfig;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyData extends TeaModel {
        @NameInMap("BusinessName")
        public String businessName;

        @NameInMap("DestConfig")
        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig destConfig;

        @NameInMap("Labels")
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataLabels> labels;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectOwner")
        public String projectOwner;

        @NameInMap("SourceConfig")
        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig sourceConfig;

        @NameInMap("Steps")
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataSteps> steps;

        @NameInMap("TransferMapping")
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping transferMapping;

        @NameInMap("TransferStepConfig")
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig transferStepConfig;

        public static DescribeOmsOpenAPIProjectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyData self = new DescribeOmsOpenAPIProjectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setBusinessName(String businessName) {
            this.businessName = businessName;
            return this;
        }
        public String getBusinessName() {
            return this.businessName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setDestConfig(DescribeOmsOpenAPIProjectResponseBodyDataDestConfig destConfig) {
            this.destConfig = destConfig;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataDestConfig getDestConfig() {
            return this.destConfig;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setLabels(java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataLabels> labels) {
            this.labels = labels;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataLabels> getLabels() {
            return this.labels;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setProjectOwner(String projectOwner) {
            this.projectOwner = projectOwner;
            return this;
        }
        public String getProjectOwner() {
            return this.projectOwner;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setSourceConfig(DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig sourceConfig) {
            this.sourceConfig = sourceConfig;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataSourceConfig getSourceConfig() {
            return this.sourceConfig;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setSteps(java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataSteps> steps) {
            this.steps = steps;
            return this;
        }
        public java.util.List<DescribeOmsOpenAPIProjectResponseBodyDataSteps> getSteps() {
            return this.steps;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setTransferMapping(DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping transferMapping) {
            this.transferMapping = transferMapping;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferMapping getTransferMapping() {
            return this.transferMapping;
        }

        public DescribeOmsOpenAPIProjectResponseBodyData setTransferStepConfig(DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig transferStepConfig) {
            this.transferStepConfig = transferStepConfig;
            return this;
        }
        public DescribeOmsOpenAPIProjectResponseBodyDataTransferStepConfig getTransferStepConfig() {
            return this.transferStepConfig;
        }

    }

    public static class DescribeOmsOpenAPIProjectResponseBodyErrorDetail extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Level")
        public String level;

        @NameInMap("Message")
        public String message;

        @NameInMap("Proposal")
        public String proposal;

        public static DescribeOmsOpenAPIProjectResponseBodyErrorDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeOmsOpenAPIProjectResponseBodyErrorDetail self = new DescribeOmsOpenAPIProjectResponseBodyErrorDetail();
            return TeaModel.build(map, self);
        }

        public DescribeOmsOpenAPIProjectResponseBodyErrorDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeOmsOpenAPIProjectResponseBodyErrorDetail setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeOmsOpenAPIProjectResponseBodyErrorDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeOmsOpenAPIProjectResponseBodyErrorDetail setProposal(String proposal) {
            this.proposal = proposal;
            return this;
        }
        public String getProposal() {
            return this.proposal;
        }

    }

}
