// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeLogBackupTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeLogBackupTaskResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLogBackupTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLogBackupTaskResponseBody self = new DescribeLogBackupTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLogBackupTaskResponseBody setData(java.util.List<DescribeLogBackupTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeLogBackupTaskResponseBodyData> getData() {
        return this.data;
    }

    public DescribeLogBackupTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLogBackupTaskResponseBodyData extends TeaModel {
        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("DelayTime")
        public Integer delayTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        @NameInMap("TenantName")
        public String tenantName;

        public static DescribeLogBackupTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLogBackupTaskResponseBodyData self = new DescribeLogBackupTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLogBackupTaskResponseBodyData setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeLogBackupTaskResponseBodyData setDelayTime(Integer delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Integer getDelayTime() {
            return this.delayTime;
        }

        public DescribeLogBackupTaskResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeLogBackupTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeLogBackupTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeLogBackupTaskResponseBodyData setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

}
