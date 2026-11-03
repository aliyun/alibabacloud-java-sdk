// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribePipelineResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirect.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The batch information.</p>
     */
    @NameInMap("Data")
    public DescribePipelineResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>Successful request: The <strong>ErrorCode</strong> field is not returned.</li>
     * <li>Failed request: The <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information about the call result.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>559B4247-C41C-4D9E-B866-B55D360B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the batch information was queried successfully. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The query was successful.</li>
     * <li><strong>false</strong>: The query failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to accurately query call information.</p>
     * 
     * <strong>example:</strong>
     * <p>0be3e0c316390414649128666e****</p>
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
         * <p>The error code for the task execution failure. This code is not returned if the task succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>EDAS-10022</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Specifies whether subsequent tasks can be executed after a failure. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Not supported.</li>
         * <li><strong>1</strong>: Supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorIgnore")
        public Integer errorIgnore;

        /**
         * <p>The error message for the task execution. This message is not returned if the task succeeds.</p>
         * 
         * <strong>example:</strong>
         * <p>EDAS-10022</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The task execution information.</p>
         * 
         * <strong>example:</strong>
         * <p>init Namespace success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Specifies whether a running task can be manually skipped. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ShowManualIgnore")
        public Boolean showManualIgnore;

        /**
         * <p>The stage ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c3a55592-4c30-4d84-ac2d-e98c18ec****</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Ready.</li>
         * <li><strong>1</strong>: Running.</li>
         * <li><strong>2</strong>: Succeeded.</li>
         * <li><strong>3</strong>: Failed.</li>
         * <li><strong>5</strong>: Waiting for retry.</li>
         * <li><strong>6</strong>: Aborted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bef0122f-de9a-4ab0-8223-b88bf8ad****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Environment initialization</p>
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
         * <p>The stage type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Serial.</li>
         * <li><strong>1</strong>: Parallel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExecutorType")
        public Integer executorType;

        /**
         * <p>The stage ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c3a55592-4c30-4d84-ac2d-e98c18ec****</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The stage name.</p>
         * 
         * <strong>example:</strong>
         * <p>Application Deployment</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The stage status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Ready.</li>
         * <li><strong>1</strong>: Running.</li>
         * <li><strong>2</strong>: Succeeded.</li>
         * <li><strong>3</strong>: Failed.</li>
         * <li><strong>6</strong>: Aborted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The list of task status information.</p>
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
         * <p>The status of the change order associated with the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>Executed successfully</p>
         */
        @NameInMap("CoStatus")
        public String coStatus;

        /**
         * <p>The ID of the stage being executed in the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>c3a55592-4c30-4d84-ac2d-e98c18ec****</p>
         */
        @NameInMap("CurrentStageId")
        public String currentStageId;

        /**
         * <p>The ID of the next batch.</p>
         * 
         * <strong>example:</strong>
         * <p>b77b1c98-5772-4f05-95fc-c7bee5fa****</p>
         */
        @NameInMap("NextPipelineId")
        public String nextPipelineId;

        /**
         * <p>The batch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>917660ba-5092-44ca-b8e0-80012c96****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The batch name.</p>
         * 
         * <strong>example:</strong>
         * <p>First batch</p>
         */
        @NameInMap("PipelineName")
        public String pipelineName;

        /**
         * <p>The batch status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Ready.</li>
         * <li><strong>1</strong>: Running.</li>
         * <li><strong>2</strong>: Succeeded.</li>
         * <li><strong>3</strong>: Failed.</li>
         * <li><strong>6</strong>: Aborted.</li>
         * <li><strong>10</strong>: Failed due to a system exception.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PipelineStatus")
        public Integer pipelineStatus;

        /**
         * <p>Specifies whether the execution of the next batch can start. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: The execution of the next batch cannot start.</li>
         * <li><strong>true</strong>: The execution of the next batch can start.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ShowBatch")
        public Boolean showBatch;

        /**
         * <p>The list of stages in the batch.</p>
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
