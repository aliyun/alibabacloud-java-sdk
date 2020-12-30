// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeGatherStatsResultResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("GatherStatsResult")
    public DescribeGatherStatsResultResponseBodyGatherStatsResult gatherStatsResult;

    @NameInMap("Code")
    public String code;

    public static DescribeGatherStatsResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatherStatsResultResponseBody self = new DescribeGatherStatsResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatherStatsResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatherStatsResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatherStatsResultResponseBody setGatherStatsResult(DescribeGatherStatsResultResponseBodyGatherStatsResult gatherStatsResult) {
        this.gatherStatsResult = gatherStatsResult;
        return this;
    }
    public DescribeGatherStatsResultResponseBodyGatherStatsResult getGatherStatsResult() {
        return this.gatherStatsResult;
    }

    public DescribeGatherStatsResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeGatherStatsResultResponseBodyGatherStatsResultChange extends TeaModel {
        @NameInMap("ChangePaused")
        public Boolean changePaused;

        @NameInMap("ChangeDescription")
        public String changeDescription;

        @NameInMap("FinishTime")
        public Long finishTime;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("ChangeTimedout")
        public Boolean changeTimedout;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ChangeMessage")
        public String changeMessage;

        @NameInMap("ActionName")
        public String actionName;

        @NameInMap("ChangeFinished")
        public Boolean changeFinished;

        @NameInMap("CreateUsername")
        public String createUsername;

        @NameInMap("ChangeSucceeded")
        public Boolean changeSucceeded;

        @NameInMap("ChangeId")
        public String changeId;

        @NameInMap("ChangeAborted")
        public Boolean changeAborted;

        @NameInMap("EnvId")
        public String envId;

        @NameInMap("ChangeName")
        public String changeName;

        public static DescribeGatherStatsResultResponseBodyGatherStatsResultChange build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatherStatsResultResponseBodyGatherStatsResultChange self = new DescribeGatherStatsResultResponseBodyGatherStatsResultChange();
            return TeaModel.build(map, self);
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setChangePaused(Boolean changePaused) {
            this.changePaused = changePaused;
            return this;
        }
        public Boolean getChangePaused() {
            return this.changePaused;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setChangeDescription(String changeDescription) {
            this.changeDescription = changeDescription;
            return this;
        }
        public String getChangeDescription() {
            return this.changeDescription;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setChangeTimedout(Boolean changeTimedout) {
            this.changeTimedout = changeTimedout;
            return this;
        }
        public Boolean getChangeTimedout() {
            return this.changeTimedout;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setChangeMessage(String changeMessage) {
            this.changeMessage = changeMessage;
            return this;
        }
        public String getChangeMessage() {
            return this.changeMessage;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setChangeFinished(Boolean changeFinished) {
            this.changeFinished = changeFinished;
            return this;
        }
        public Boolean getChangeFinished() {
            return this.changeFinished;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setCreateUsername(String createUsername) {
            this.createUsername = createUsername;
            return this;
        }
        public String getCreateUsername() {
            return this.createUsername;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setChangeSucceeded(Boolean changeSucceeded) {
            this.changeSucceeded = changeSucceeded;
            return this;
        }
        public Boolean getChangeSucceeded() {
            return this.changeSucceeded;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setChangeAborted(Boolean changeAborted) {
            this.changeAborted = changeAborted;
            return this;
        }
        public Boolean getChangeAborted() {
            return this.changeAborted;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange setChangeName(String changeName) {
            this.changeName = changeName;
            return this;
        }
        public String getChangeName() {
            return this.changeName;
        }

    }

    public static class DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult extends TeaModel {
        @NameInMap("TaskMessage")
        public String taskMessage;

        @NameInMap("StorageKey")
        public String storageKey;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TaskSucceeded")
        public Boolean taskSucceeded;

        public static DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult self = new DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult();
            return TeaModel.build(map, self);
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult setTaskMessage(String taskMessage) {
            this.taskMessage = taskMessage;
            return this;
        }
        public String getTaskMessage() {
            return this.taskMessage;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult setStorageKey(String storageKey) {
            this.storageKey = storageKey;
            return this;
        }
        public String getStorageKey() {
            return this.storageKey;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult setTaskSucceeded(Boolean taskSucceeded) {
            this.taskSucceeded = taskSucceeded;
            return this;
        }
        public Boolean getTaskSucceeded() {
            return this.taskSucceeded;
        }

    }

    public static class DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResults extends TeaModel {
        @NameInMap("InstanceResult")
        public java.util.List<DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult> instanceResult;

        public static DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResults self = new DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResults();
            return TeaModel.build(map, self);
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResults setInstanceResult(java.util.List<DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult> instanceResult) {
            this.instanceResult = instanceResult;
            return this;
        }
        public java.util.List<DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResultsInstanceResult> getInstanceResult() {
            return this.instanceResult;
        }

    }

    public static class DescribeGatherStatsResultResponseBodyGatherStatsResult extends TeaModel {
        @NameInMap("Change")
        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange change;

        @NameInMap("InstanceResults")
        public DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResults instanceResults;

        public static DescribeGatherStatsResultResponseBodyGatherStatsResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatherStatsResultResponseBodyGatherStatsResult self = new DescribeGatherStatsResultResponseBodyGatherStatsResult();
            return TeaModel.build(map, self);
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResult setChange(DescribeGatherStatsResultResponseBodyGatherStatsResultChange change) {
            this.change = change;
            return this;
        }
        public DescribeGatherStatsResultResponseBodyGatherStatsResultChange getChange() {
            return this.change;
        }

        public DescribeGatherStatsResultResponseBodyGatherStatsResult setInstanceResults(DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResults instanceResults) {
            this.instanceResults = instanceResults;
            return this;
        }
        public DescribeGatherStatsResultResponseBodyGatherStatsResultInstanceResults getInstanceResults() {
            return this.instanceResults;
        }

    }

}
