// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribePipelineResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribePipelineResponseBodyData data;

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

    public static DescribePipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineResponseBody self = new DescribePipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePipelineResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribePipelineResponseBody setData(DescribePipelineResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribePipelineResponseBodyData getData() {
        return this.data;
    }

    public DescribePipelineResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribePipelineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePipelineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribePipelineResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribePipelineResponseBodyDataStageListTaskList extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorIgnore")
        public Integer errorIgnore;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Message")
        public String message;

        @NameInMap("ShowManualIgnore")
        public Boolean showManualIgnore;

        @NameInMap("StageId")
        public String stageId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static DescribePipelineResponseBodyDataStageListTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribePipelineResponseBodyDataStageListTaskList self = new DescribePipelineResponseBodyDataStageListTaskList();
            return TeaModel.build(map, self);
        }

        public DescribePipelineResponseBodyDataStageListTaskList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribePipelineResponseBodyDataStageListTaskList setErrorIgnore(Integer errorIgnore) {
            this.errorIgnore = errorIgnore;
            return this;
        }
        public Integer getErrorIgnore() {
            return this.errorIgnore;
        }

        public DescribePipelineResponseBodyDataStageListTaskList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribePipelineResponseBodyDataStageListTaskList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribePipelineResponseBodyDataStageListTaskList setShowManualIgnore(Boolean showManualIgnore) {
            this.showManualIgnore = showManualIgnore;
            return this;
        }
        public Boolean getShowManualIgnore() {
            return this.showManualIgnore;
        }

        public DescribePipelineResponseBodyDataStageListTaskList setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public DescribePipelineResponseBodyDataStageListTaskList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribePipelineResponseBodyDataStageListTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribePipelineResponseBodyDataStageListTaskList setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

    public static class DescribePipelineResponseBodyDataStageList extends TeaModel {
        @NameInMap("ExecutorType")
        public Integer executorType;

        @NameInMap("StageId")
        public String stageId;

        @NameInMap("StageName")
        public String stageName;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TaskList")
        public java.util.List<DescribePipelineResponseBodyDataStageListTaskList> taskList;

        public static DescribePipelineResponseBodyDataStageList build(java.util.Map<String, ?> map) throws Exception {
            DescribePipelineResponseBodyDataStageList self = new DescribePipelineResponseBodyDataStageList();
            return TeaModel.build(map, self);
        }

        public DescribePipelineResponseBodyDataStageList setExecutorType(Integer executorType) {
            this.executorType = executorType;
            return this;
        }
        public Integer getExecutorType() {
            return this.executorType;
        }

        public DescribePipelineResponseBodyDataStageList setStageId(String stageId) {
            this.stageId = stageId;
            return this;
        }
        public String getStageId() {
            return this.stageId;
        }

        public DescribePipelineResponseBodyDataStageList setStageName(String stageName) {
            this.stageName = stageName;
            return this;
        }
        public String getStageName() {
            return this.stageName;
        }

        public DescribePipelineResponseBodyDataStageList setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribePipelineResponseBodyDataStageList setTaskList(java.util.List<DescribePipelineResponseBodyDataStageListTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<DescribePipelineResponseBodyDataStageListTaskList> getTaskList() {
            return this.taskList;
        }

    }

    public static class DescribePipelineResponseBodyData extends TeaModel {
        @NameInMap("CoStatus")
        public String coStatus;

        @NameInMap("CurrentStageId")
        public String currentStageId;

        @NameInMap("NextPipelineId")
        public String nextPipelineId;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("PipelineName")
        public String pipelineName;

        @NameInMap("PipelineStatus")
        public Integer pipelineStatus;

        @NameInMap("ShowBatch")
        public Boolean showBatch;

        @NameInMap("StageList")
        public java.util.List<DescribePipelineResponseBodyDataStageList> stageList;

        public static DescribePipelineResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribePipelineResponseBodyData self = new DescribePipelineResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribePipelineResponseBodyData setCoStatus(String coStatus) {
            this.coStatus = coStatus;
            return this;
        }
        public String getCoStatus() {
            return this.coStatus;
        }

        public DescribePipelineResponseBodyData setCurrentStageId(String currentStageId) {
            this.currentStageId = currentStageId;
            return this;
        }
        public String getCurrentStageId() {
            return this.currentStageId;
        }

        public DescribePipelineResponseBodyData setNextPipelineId(String nextPipelineId) {
            this.nextPipelineId = nextPipelineId;
            return this;
        }
        public String getNextPipelineId() {
            return this.nextPipelineId;
        }

        public DescribePipelineResponseBodyData setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public DescribePipelineResponseBodyData setPipelineName(String pipelineName) {
            this.pipelineName = pipelineName;
            return this;
        }
        public String getPipelineName() {
            return this.pipelineName;
        }

        public DescribePipelineResponseBodyData setPipelineStatus(Integer pipelineStatus) {
            this.pipelineStatus = pipelineStatus;
            return this;
        }
        public Integer getPipelineStatus() {
            return this.pipelineStatus;
        }

        public DescribePipelineResponseBodyData setShowBatch(Boolean showBatch) {
            this.showBatch = showBatch;
            return this;
        }
        public Boolean getShowBatch() {
            return this.showBatch;
        }

        public DescribePipelineResponseBodyData setStageList(java.util.List<DescribePipelineResponseBodyDataStageList> stageList) {
            this.stageList = stageList;
            return this;
        }
        public java.util.List<DescribePipelineResponseBodyDataStageList> getStageList() {
            return this.stageList;
        }

    }

}
