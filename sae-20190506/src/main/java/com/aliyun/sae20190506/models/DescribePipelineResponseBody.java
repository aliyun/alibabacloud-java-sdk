// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribePipelineResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <br>
     * <p>*   **2xx**: indicates that the request was successful.</p>
     * <p>*   **3xx**: indicates that the request was redirected.</p>
     * <p>*   **4xx**: indicates that the request was invalid.</p>
     * <p>*   **5xx**: indicates that a server error occurred.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The batch information.</p>
     */
    @NameInMap("Data")
    public DescribePipelineResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <br>
     * <p>*   The **ErrorCode** parameter is not returned when the request succeeds.</p>
     * <p>*   The **ErrorCode** parameter is returned when the request fails. For more information, see **Error codes** in this topic.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the batch information was obtained. Valid values:</p>
     * <br>
     * <p>*   **true**: indicates that the information was obtained.</p>
     * <p>*   **false**: indicates that the information could not be obtained.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of the trace. It is used to query the details of a request.</p>
     */
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
        /**
         * <p>The error code returned when the task could not be executed. If the task is successfully executed, this parameter is not returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether to execute the subsequent tasks when the task failed. Valid values:</p>
         * <br>
         * <p>*   **0**: The subsequent tasks cannot be executed.</p>
         * <p>*   **1**: The subsequent tasks can be executed.</p>
         */
        @NameInMap("ErrorIgnore")
        public Integer errorIgnore;

        /**
         * <p>The error message returned when the task could not be executed. If the task is successfully executed, this parameter is not returned.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The returned message indicating the task execution result.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether a running task can be manually skipped. Valid values:</p>
         * <br>
         * <p>*   **true**: The running task can be skipped.</p>
         * <p>*   **false**: The running task cannot be skipped.</p>
         */
        @NameInMap("ShowManualIgnore")
        public Boolean showManualIgnore;

        /**
         * <p>The ID of the stage.</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The task status. Valid values:</p>
         * <br>
         * <p>*   **0**: The task is prepared for execution.</p>
         * <p>*   **1**: The task is being executed.</p>
         * <p>*   **2**: The task was executed.</p>
         * <p>*   **3**: The task could not be executed.</p>
         * <p>*   **5**: The task is pending retry.</p>
         * <p>*   **6**: The task was terminated.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the task.</p>
         */
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
        /**
         * <p>The execution type of the stage. Valid values:</p>
         * <br>
         * <p>*   **0**: in sequence.</p>
         * <p>*   **1**: in parallel.</p>
         */
        @NameInMap("ExecutorType")
        public Integer executorType;

        /**
         * <p>The ID of the stage.</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The name of the stage.</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The status of the batch processing stage. Valid values:</p>
         * <br>
         * <p>*   **0**: The batch is prepared for this processing stage.</p>
         * <p>*   **1**: The processing stage is in progress.</p>
         * <p>*   **2**: The processing stage was complete.</p>
         * <p>*   **3**: The processing failed in this stage.</p>
         * <p>*   **6**: The processing stage was terminated.</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The list of task statuses.</p>
         */
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
        /**
         * <p>The status of the change order for the batch.</p>
         */
        @NameInMap("CoStatus")
        public String coStatus;

        /**
         * <p>The ID of the batch processing stage.</p>
         */
        @NameInMap("CurrentStageId")
        public String currentStageId;

        /**
         * <p>The ID of the next batch.</p>
         */
        @NameInMap("NextPipelineId")
        public String nextPipelineId;

        /**
         * <p>The ID of the batch.</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The name of the batch.</p>
         */
        @NameInMap("PipelineName")
        public String pipelineName;

        /**
         * <p>The batch status. Valid values:</p>
         * <br>
         * <p>*   **0**: The batch is prepared for processing.</p>
         * <p>*   **1**: The batch is being processed.</p>
         * <p>*   **2**: The batch was processed.</p>
         * <p>*   **3**: The batch could not be processed.</p>
         * <p>*   **6**: The batch processing was terminated.</p>
         * <p>*   **10**: The batch could not be processed due to a system exception.</p>
         */
        @NameInMap("PipelineStatus")
        public Integer pipelineStatus;

        /**
         * <p>Indicates whether to start processing the next batch. Valid values:</p>
         * <br>
         * <p>*   **false**: indicates that the next batch cannot be processed yet.</p>
         * <p>*   **true**: indicates that the next batch can be processed now.</p>
         */
        @NameInMap("ShowBatch")
        public Boolean showBatch;

        /**
         * <p>The list of batch processing stages.</p>
         */
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
