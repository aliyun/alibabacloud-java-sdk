// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class AppStackTask extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1706518652</p>
     */
    @NameInMap("CreateTime")
    public Long createTime;

    /**
     * <strong>example:</strong>
     * <p>1706518652</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>i-789y</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>palworld</p>
     */
    @NameInMap("StackId")
    public String stackId;

    /**
     * <strong>example:</strong>
     * <p>1706518652</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>WAIT</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Steps")
    public java.util.List<AppStackTaskSteps> steps;

    /**
     * <strong>example:</strong>
     * <p>t-789y-deploy</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static AppStackTask build(java.util.Map<String, ?> map) throws Exception {
        AppStackTask self = new AppStackTask();
        return TeaModel.build(map, self);
    }

    public AppStackTask setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public AppStackTask setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public AppStackTask setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AppStackTask setStackId(String stackId) {
        this.stackId = stackId;
        return this;
    }
    public String getStackId() {
        return this.stackId;
    }

    public AppStackTask setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public AppStackTask setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public AppStackTask setSteps(java.util.List<AppStackTaskSteps> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<AppStackTaskSteps> getSteps() {
        return this.steps;
    }

    public AppStackTask setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class AppStackTaskSteps extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>1706518652</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>VPC_CREATE_NETWORK</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>初始化 VPC 网络</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1706518652</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>WAIT</p>
         */
        @NameInMap("Status")
        public String status;

        public static AppStackTaskSteps build(java.util.Map<String, ?> map) throws Exception {
            AppStackTaskSteps self = new AppStackTaskSteps();
            return TeaModel.build(map, self);
        }

        public AppStackTaskSteps setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AppStackTaskSteps setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public AppStackTaskSteps setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public AppStackTaskSteps setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AppStackTaskSteps setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AppStackTaskSteps setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AppStackTaskSteps setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public AppStackTaskSteps setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
