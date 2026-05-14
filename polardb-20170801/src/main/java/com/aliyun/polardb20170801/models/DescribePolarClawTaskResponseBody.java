// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>C890995A-CF06-4F4D-8DB8-DD26C2******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Task")
    public DescribePolarClawTaskResponseBodyTask task;

    public static DescribePolarClawTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawTaskResponseBody self = new DescribePolarClawTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawTaskResponseBody setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribePolarClawTaskResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribePolarClawTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribePolarClawTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarClawTaskResponseBody setTask(DescribePolarClawTaskResponseBodyTask task) {
        this.task = task;
        return this;
    }
    public DescribePolarClawTaskResponseBodyTask getTask() {
        return this.task;
    }

    public static class DescribePolarClawTaskResponseBodyTaskError extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>INVALID_REQUEST</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>channelId format invalid</p>
         */
        @NameInMap("Message")
        public String message;

        public static DescribePolarClawTaskResponseBodyTaskError build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawTaskResponseBodyTaskError self = new DescribePolarClawTaskResponseBodyTaskError();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawTaskResponseBodyTaskError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribePolarClawTaskResponseBodyTaskError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribePolarClawTaskResponseBodyTask extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1778564698304</p>
         */
        @NameInMap("CreatedAtMs")
        public Long createdAtMs;

        @NameInMap("Error")
        public DescribePolarClawTaskResponseBodyTaskError error;

        /**
         * <strong>example:</strong>
         * <p>LoginPolarClawChannel</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Result")
        public java.util.Map<String, ?> result;

        /**
         * <strong>example:</strong>
         * <p>running</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>5956e600-ce6e-4d11-9648-939ef3286e94</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>1778564750541</p>
         */
        @NameInMap("UpdatedAtMs")
        public Long updatedAtMs;

        public static DescribePolarClawTaskResponseBodyTask build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarClawTaskResponseBodyTask self = new DescribePolarClawTaskResponseBodyTask();
            return TeaModel.build(map, self);
        }

        public DescribePolarClawTaskResponseBodyTask setCreatedAtMs(Long createdAtMs) {
            this.createdAtMs = createdAtMs;
            return this;
        }
        public Long getCreatedAtMs() {
            return this.createdAtMs;
        }

        public DescribePolarClawTaskResponseBodyTask setError(DescribePolarClawTaskResponseBodyTaskError error) {
            this.error = error;
            return this;
        }
        public DescribePolarClawTaskResponseBodyTaskError getError() {
            return this.error;
        }

        public DescribePolarClawTaskResponseBodyTask setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public DescribePolarClawTaskResponseBodyTask setResult(java.util.Map<String, ?> result) {
            this.result = result;
            return this;
        }
        public java.util.Map<String, ?> getResult() {
            return this.result;
        }

        public DescribePolarClawTaskResponseBodyTask setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public DescribePolarClawTaskResponseBodyTask setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribePolarClawTaskResponseBodyTask setUpdatedAtMs(Long updatedAtMs) {
            this.updatedAtMs = updatedAtMs;
            return this;
        }
        public Long getUpdatedAtMs() {
            return this.updatedAtMs;
        }

    }

}
