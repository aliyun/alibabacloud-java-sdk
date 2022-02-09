// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestoreTaskResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeRestoreTaskResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeRestoreTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreTaskResponseBody self = new DescribeRestoreTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreTaskResponseBody setData(java.util.List<DescribeRestoreTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeRestoreTaskResponseBodyData> getData() {
        return this.data;
    }

    public DescribeRestoreTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeRestoreTaskResponseBodyData extends TeaModel {
        @NameInMap("SourceInstanceId")
        public String sourceInstanceId;

        @NameInMap("SourceInstanceName")
        public String sourceInstanceName;

        @NameInMap("SourceTenantId")
        public String sourceTenantId;

        @NameInMap("SourceTenantName")
        public String sourceTenantName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        @NameInMap("TargetInstanceName")
        public String targetInstanceName;

        @NameInMap("TargetTenantId")
        public String targetTenantId;

        @NameInMap("TargetTenantName")
        public String targetTenantName;

        @NameInMap("TargetTime")
        public String targetTime;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static DescribeRestoreTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRestoreTaskResponseBodyData self = new DescribeRestoreTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeRestoreTaskResponseBodyData setSourceInstanceId(String sourceInstanceId) {
            this.sourceInstanceId = sourceInstanceId;
            return this;
        }
        public String getSourceInstanceId() {
            return this.sourceInstanceId;
        }

        public DescribeRestoreTaskResponseBodyData setSourceInstanceName(String sourceInstanceName) {
            this.sourceInstanceName = sourceInstanceName;
            return this;
        }
        public String getSourceInstanceName() {
            return this.sourceInstanceName;
        }

        public DescribeRestoreTaskResponseBodyData setSourceTenantId(String sourceTenantId) {
            this.sourceTenantId = sourceTenantId;
            return this;
        }
        public String getSourceTenantId() {
            return this.sourceTenantId;
        }

        public DescribeRestoreTaskResponseBodyData setSourceTenantName(String sourceTenantName) {
            this.sourceTenantName = sourceTenantName;
            return this;
        }
        public String getSourceTenantName() {
            return this.sourceTenantName;
        }

        public DescribeRestoreTaskResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRestoreTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRestoreTaskResponseBodyData setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public DescribeRestoreTaskResponseBodyData setTargetInstanceName(String targetInstanceName) {
            this.targetInstanceName = targetInstanceName;
            return this;
        }
        public String getTargetInstanceName() {
            return this.targetInstanceName;
        }

        public DescribeRestoreTaskResponseBodyData setTargetTenantId(String targetTenantId) {
            this.targetTenantId = targetTenantId;
            return this;
        }
        public String getTargetTenantId() {
            return this.targetTenantId;
        }

        public DescribeRestoreTaskResponseBodyData setTargetTenantName(String targetTenantName) {
            this.targetTenantName = targetTenantName;
            return this;
        }
        public String getTargetTenantName() {
            return this.targetTenantName;
        }

        public DescribeRestoreTaskResponseBodyData setTargetTime(String targetTime) {
            this.targetTime = targetTime;
            return this;
        }
        public String getTargetTime() {
            return this.targetTime;
        }

        public DescribeRestoreTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeRestoreTaskResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

}
