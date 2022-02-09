// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDataBackupTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeDataBackupTaskResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDataBackupTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataBackupTaskResponseBody self = new DescribeDataBackupTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataBackupTaskResponseBody setData(java.util.List<DescribeDataBackupTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDataBackupTaskResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDataBackupTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDataBackupTaskResponseBodyData extends TeaModel {
        @NameInMap("DataPercent")
        public Integer dataPercent;

        @NameInMap("DataSize")
        public Float dataSize;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static DescribeDataBackupTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataBackupTaskResponseBodyData self = new DescribeDataBackupTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataBackupTaskResponseBodyData setDataPercent(Integer dataPercent) {
            this.dataPercent = dataPercent;
            return this;
        }
        public Integer getDataPercent() {
            return this.dataPercent;
        }

        public DescribeDataBackupTaskResponseBodyData setDataSize(Float dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Float getDataSize() {
            return this.dataSize;
        }

        public DescribeDataBackupTaskResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDataBackupTaskResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDataBackupTaskResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataBackupTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeDataBackupTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
