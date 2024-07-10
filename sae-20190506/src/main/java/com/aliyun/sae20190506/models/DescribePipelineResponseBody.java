// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribePipelineResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The call was successful.</li>
     * <li><strong>3xx</strong>: The call was redirected.</li>
     * <li><strong>4xx</strong>: The call failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
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
     * <p>The error code returned if the request failed. Take note of the following rules:</p>
     * <ul>
     * <li>The <strong>ErrorCode</strong> parameter is not returned if the request succeeds.</li>
     * <li>If the call fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section of this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Null</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned for the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>559B4247-C41C-4D9E-B866-B55D360B****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the batch information was obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The information was queried.</li>
     * <li><strong>false</strong>: The image failed to be found.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID that is used to query the details of the request.</p>
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
         * <p>The error code returned when the task could not be executed. If the task is successfully executed, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>EDAS-10022</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>Indicates whether to execute the subsequent tasks when the task failed. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The subsequent tasks cannot be executed.</li>
         * <li><strong>1</strong>: The subsequent tasks can be executed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ErrorIgnore")
        public Integer errorIgnore;

        /**
         * <p>The error message returned when the task could not be executed. If the task is successfully executed, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>EDAS-10022 \&lt;a target=\&quot;_blank\&quot; href=\&quot;<a href="https://help.aliyun.com/knowledge_detail/106573.html#EDAS-10022%5C%5C%22%3EREADINESS">https://help.aliyun.com/knowledge_detail/106573.html#EDAS-10022\\&quot;&gt;READINESS</a> check failed during the application startup.\</a></p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The returned message indicating the task execution result.</p>
         * 
         * <strong>example:</strong>
         * <p>init Namespace success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether a running task can be manually skipped. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The running task can be skipped.</li>
         * <li><strong>false</strong>: The zone does not allow you to change the network type of an ApsaraDB for Redis instance from classic network to VPC.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ShowManualIgnore")
        public Boolean showManualIgnore;

        /**
         * <p>The ID of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>c3a55592-4c30-4d84-ac2d-e98c18ec****</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The task is prepared for execution.</li>
         * <li><strong>1</strong>: The task is being executed.</li>
         * <li><strong>2</strong>: successful</li>
         * <li><strong>3</strong>: The task could not be executed.</li>
         * <li><strong>5</strong>: The task is pending retry.</li>
         * <li><strong>6</strong>: The task was terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>bef0122f-de9a-4ab0-8223-b88bf8ad****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the task.</p>
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
         * <p>The execution type of the stage. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: in sequence.</li>
         * <li><strong>1</strong>: in parallel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ExecutorType")
        public Integer executorType;

        /**
         * <p>The ID of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>c3a55592-4c30-4d84-ac2d-e98c18ec****</p>
         */
        @NameInMap("StageId")
        public String stageId;

        /**
         * <p>The name of the stage.</p>
         * 
         * <strong>example:</strong>
         * <p>Deploy an application</p>
         */
        @NameInMap("StageName")
        public String stageName;

        /**
         * <p>The status of the batch processing stage. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The batch is prepared for this processing stage.</li>
         * <li><strong>1</strong>: The task is being executed.</li>
         * <li><strong>2</strong>: successful</li>
         * <li><strong>3</strong>: The processing failed in this stage.</li>
         * <li><strong>6</strong>: The processing stage was terminated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        @NameInMap("CoStatus")
        public String coStatus;

        /**
         * <p>The ID of the batch processing stage.</p>
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
         * <p>The ID of the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>917660ba-5092-44ca-b8e0-80012c96****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The name of the batch.</p>
         * 
         * <strong>example:</strong>
         * <p>First batch</p>
         */
        @NameInMap("PipelineName")
        public String pipelineName;

        /**
         * <p>The batch status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The batch is prepared for processing.</li>
         * <li><strong>1</strong>: The task is being executed.</li>
         * <li><strong>2</strong>: successful</li>
         * <li><strong>3</strong>: The processing failed in this stage.</li>
         * <li><strong>6</strong>: The batch processing was terminated.</li>
         * <li><strong>10</strong>: The batch could not be processed due to a system exception.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PipelineStatus")
        public Integer pipelineStatus;

        /**
         * <p>Indicates whether to start processing the next batch. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: indicates that the next batch cannot be processed yet.</li>
         * <li><strong>true</strong>: indicates that the next batch can be processed now.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
