// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListBucketRedundancyTransitionResponseBody extends TeaModel {
    @NameInMap("RedundancyTransitionInfo")
    public ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo redundancyTransitionInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("StorageRedundancyType")
    public String storageRedundancyType;

    public static ListBucketRedundancyTransitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBucketRedundancyTransitionResponseBody self = new ListBucketRedundancyTransitionResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBucketRedundancyTransitionResponseBody setRedundancyTransitionInfo(ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo redundancyTransitionInfo) {
        this.redundancyTransitionInfo = redundancyTransitionInfo;
        return this;
    }
    public ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo getRedundancyTransitionInfo() {
        return this.redundancyTransitionInfo;
    }

    public ListBucketRedundancyTransitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBucketRedundancyTransitionResponseBody setStorageRedundancyType(String storageRedundancyType) {
        this.storageRedundancyType = storageRedundancyType;
        return this;
    }
    public String getStorageRedundancyType() {
        return this.storageRedundancyType;
    }

    public static class ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("EstimatedRemainingTime")
        public String estimatedRemainingTime;

        @NameInMap("ProcessPercentage")
        public String processPercentage;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        public static ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo build(java.util.Map<String, ?> map) throws Exception {
            ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo self = new ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo();
            return TeaModel.build(map, self);
        }

        public ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo setEstimatedRemainingTime(String estimatedRemainingTime) {
            this.estimatedRemainingTime = estimatedRemainingTime;
            return this;
        }
        public String getEstimatedRemainingTime() {
            return this.estimatedRemainingTime;
        }

        public ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo setProcessPercentage(String processPercentage) {
            this.processPercentage = processPercentage;
            return this;
        }
        public String getProcessPercentage() {
            return this.processPercentage;
        }

        public ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBucketRedundancyTransitionResponseBodyRedundancyTransitionInfo setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
