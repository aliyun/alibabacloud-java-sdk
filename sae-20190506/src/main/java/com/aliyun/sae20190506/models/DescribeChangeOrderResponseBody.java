// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeChangeOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeChangeOrderResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TraceId")
    public String traceId;

    public static DescribeChangeOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChangeOrderResponseBody self = new DescribeChangeOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChangeOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeChangeOrderResponseBody setData(DescribeChangeOrderResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeChangeOrderResponseBodyData getData() {
        return this.data;
    }

    public DescribeChangeOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeChangeOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeChangeOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChangeOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeChangeOrderResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeChangeOrderResponseBodyDataPipelines extends TeaModel {
        @NameInMap("BatchType")
        public Integer batchType;

        @NameInMap("ParallelCount")
        public Integer parallelCount;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("PipelineName")
        public String pipelineName;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeChangeOrderResponseBodyDataPipelines build(java.util.Map<String, ?> map) throws Exception {
            DescribeChangeOrderResponseBodyDataPipelines self = new DescribeChangeOrderResponseBodyDataPipelines();
            return TeaModel.build(map, self);
        }

        public DescribeChangeOrderResponseBodyDataPipelines setBatchType(Integer batchType) {
            this.batchType = batchType;
            return this;
        }
        public Integer getBatchType() {
            return this.batchType;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setParallelCount(Integer parallelCount) {
            this.parallelCount = parallelCount;
            return this;
        }
        public Integer getParallelCount() {
            return this.parallelCount;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeChangeOrderResponseBodyDataPipelines setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeChangeOrderResponseBodyData extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("ApprovalId")
        public String approvalId;

        @NameInMap("Auto")
        public Boolean auto;

        @NameInMap("BatchCount")
        public Integer batchCount;

        @NameInMap("BatchType")
        public String batchType;

        @NameInMap("BatchWaitTime")
        public Integer batchWaitTime;

        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("CoType")
        public String coType;

        @NameInMap("CoTypeCode")
        public String coTypeCode;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CurrentPipelineId")
        public String currentPipelineId;

        @NameInMap("Description")
        public String description;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Pipelines")
        public java.util.List<DescribeChangeOrderResponseBodyDataPipelines> pipelines;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubStatus")
        public Integer subStatus;

        @NameInMap("SupportRollback")
        public Boolean supportRollback;

        public static DescribeChangeOrderResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChangeOrderResponseBodyData self = new DescribeChangeOrderResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeChangeOrderResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeChangeOrderResponseBodyData setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public DescribeChangeOrderResponseBodyData setAuto(Boolean auto) {
            this.auto = auto;
            return this;
        }
        public Boolean getAuto() {
            return this.auto;
        }

        public DescribeChangeOrderResponseBodyData setBatchCount(Integer batchCount) {
            this.batchCount = batchCount;
            return this;
        }
        public Integer getBatchCount() {
            return this.batchCount;
        }

        public DescribeChangeOrderResponseBodyData setBatchType(String batchType) {
            this.batchType = batchType;
            return this;
        }
        public String getBatchType() {
            return this.batchType;
        }

        public DescribeChangeOrderResponseBodyData setBatchWaitTime(Integer batchWaitTime) {
            this.batchWaitTime = batchWaitTime;
            return this;
        }
        public Integer getBatchWaitTime() {
            return this.batchWaitTime;
        }

        public DescribeChangeOrderResponseBodyData setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public DescribeChangeOrderResponseBodyData setCoType(String coType) {
            this.coType = coType;
            return this;
        }
        public String getCoType() {
            return this.coType;
        }

        public DescribeChangeOrderResponseBodyData setCoTypeCode(String coTypeCode) {
            this.coTypeCode = coTypeCode;
            return this;
        }
        public String getCoTypeCode() {
            return this.coTypeCode;
        }

        public DescribeChangeOrderResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeChangeOrderResponseBodyData setCurrentPipelineId(String currentPipelineId) {
            this.currentPipelineId = currentPipelineId;
            return this;
        }
        public String getCurrentPipelineId() {
            return this.currentPipelineId;
        }

        public DescribeChangeOrderResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeChangeOrderResponseBodyData setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeChangeOrderResponseBodyData setPipelines(java.util.List<DescribeChangeOrderResponseBodyDataPipelines> pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public java.util.List<DescribeChangeOrderResponseBodyDataPipelines> getPipelines() {
            return this.pipelines;
        }

        public DescribeChangeOrderResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeChangeOrderResponseBodyData setSubStatus(Integer subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public Integer getSubStatus() {
            return this.subStatus;
        }

        public DescribeChangeOrderResponseBodyData setSupportRollback(Boolean supportRollback) {
            this.supportRollback = supportRollback;
            return this;
        }
        public Boolean getSupportRollback() {
            return this.supportRollback;
        }

    }

}
