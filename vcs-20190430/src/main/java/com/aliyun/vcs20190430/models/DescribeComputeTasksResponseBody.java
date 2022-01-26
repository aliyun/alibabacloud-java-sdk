// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20190430.models;

import com.aliyun.tea.*;

public class DescribeComputeTasksResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<DescribeComputeTasksResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeComputeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComputeTasksResponseBody self = new DescribeComputeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComputeTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeComputeTasksResponseBody setData(java.util.List<DescribeComputeTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeComputeTasksResponseBodyData> getData() {
        return this.data;
    }

    public DescribeComputeTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComputeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComputeTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeComputeTasksResponseBodyData extends TeaModel {
        @NameInMap("AlgorithmName")
        public String algorithmName;

        @NameInMap("DeviceNum")
        public Integer deviceNum;

        @NameInMap("ImageSize")
        public Float imageSize;

        @NameInMap("Runtime")
        public String runtime;

        @NameInMap("StructuredSize")
        public Float structuredSize;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("VectorSize")
        public Float vectorSize;

        public static DescribeComputeTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeComputeTasksResponseBodyData self = new DescribeComputeTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeComputeTasksResponseBodyData setAlgorithmName(String algorithmName) {
            this.algorithmName = algorithmName;
            return this;
        }
        public String getAlgorithmName() {
            return this.algorithmName;
        }

        public DescribeComputeTasksResponseBodyData setDeviceNum(Integer deviceNum) {
            this.deviceNum = deviceNum;
            return this;
        }
        public Integer getDeviceNum() {
            return this.deviceNum;
        }

        public DescribeComputeTasksResponseBodyData setImageSize(Float imageSize) {
            this.imageSize = imageSize;
            return this;
        }
        public Float getImageSize() {
            return this.imageSize;
        }

        public DescribeComputeTasksResponseBodyData setRuntime(String runtime) {
            this.runtime = runtime;
            return this;
        }
        public String getRuntime() {
            return this.runtime;
        }

        public DescribeComputeTasksResponseBodyData setStructuredSize(Float structuredSize) {
            this.structuredSize = structuredSize;
            return this;
        }
        public Float getStructuredSize() {
            return this.structuredSize;
        }

        public DescribeComputeTasksResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeComputeTasksResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeComputeTasksResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeComputeTasksResponseBodyData setVectorSize(Float vectorSize) {
            this.vectorSize = vectorSize;
            return this;
        }
        public Float getVectorSize() {
            return this.vectorSize;
        }

    }

}
