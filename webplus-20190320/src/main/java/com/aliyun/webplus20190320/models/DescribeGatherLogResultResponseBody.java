// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeGatherLogResultResponseBody extends TeaModel {
    @NameInMap("GatherLogResult")
    public DescribeGatherLogResultResponseBodyGatherLogResult gatherLogResult;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    public static DescribeGatherLogResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGatherLogResultResponseBody self = new DescribeGatherLogResultResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGatherLogResultResponseBody setGatherLogResult(DescribeGatherLogResultResponseBodyGatherLogResult gatherLogResult) {
        this.gatherLogResult = gatherLogResult;
        return this;
    }
    public DescribeGatherLogResultResponseBodyGatherLogResult getGatherLogResult() {
        return this.gatherLogResult;
    }

    public DescribeGatherLogResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeGatherLogResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGatherLogResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeGatherLogResultResponseBodyGatherLogResultChange extends TeaModel {
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

        public static DescribeGatherLogResultResponseBodyGatherLogResultChange build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatherLogResultResponseBodyGatherLogResultChange self = new DescribeGatherLogResultResponseBodyGatherLogResultChange();
            return TeaModel.build(map, self);
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setChangePaused(Boolean changePaused) {
            this.changePaused = changePaused;
            return this;
        }
        public Boolean getChangePaused() {
            return this.changePaused;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setChangeDescription(String changeDescription) {
            this.changeDescription = changeDescription;
            return this;
        }
        public String getChangeDescription() {
            return this.changeDescription;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setFinishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public Long getFinishTime() {
            return this.finishTime;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setChangeTimedout(Boolean changeTimedout) {
            this.changeTimedout = changeTimedout;
            return this;
        }
        public Boolean getChangeTimedout() {
            return this.changeTimedout;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setChangeMessage(String changeMessage) {
            this.changeMessage = changeMessage;
            return this;
        }
        public String getChangeMessage() {
            return this.changeMessage;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setActionName(String actionName) {
            this.actionName = actionName;
            return this;
        }
        public String getActionName() {
            return this.actionName;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setChangeFinished(Boolean changeFinished) {
            this.changeFinished = changeFinished;
            return this;
        }
        public Boolean getChangeFinished() {
            return this.changeFinished;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setCreateUsername(String createUsername) {
            this.createUsername = createUsername;
            return this;
        }
        public String getCreateUsername() {
            return this.createUsername;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setChangeSucceeded(Boolean changeSucceeded) {
            this.changeSucceeded = changeSucceeded;
            return this;
        }
        public Boolean getChangeSucceeded() {
            return this.changeSucceeded;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setChangeId(String changeId) {
            this.changeId = changeId;
            return this;
        }
        public String getChangeId() {
            return this.changeId;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setChangeAborted(Boolean changeAborted) {
            this.changeAborted = changeAborted;
            return this;
        }
        public Boolean getChangeAborted() {
            return this.changeAborted;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setEnvId(String envId) {
            this.envId = envId;
            return this;
        }
        public String getEnvId() {
            return this.envId;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultChange setChangeName(String changeName) {
            this.changeName = changeName;
            return this;
        }
        public String getChangeName() {
            return this.changeName;
        }

    }

    public static class DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult extends TeaModel {
        @NameInMap("TaskMessage")
        public String taskMessage;

        @NameInMap("StorageKey")
        public String storageKey;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TaskSucceeded")
        public Boolean taskSucceeded;

        public static DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult self = new DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult();
            return TeaModel.build(map, self);
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult setTaskMessage(String taskMessage) {
            this.taskMessage = taskMessage;
            return this;
        }
        public String getTaskMessage() {
            return this.taskMessage;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult setStorageKey(String storageKey) {
            this.storageKey = storageKey;
            return this;
        }
        public String getStorageKey() {
            return this.storageKey;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult setTaskSucceeded(Boolean taskSucceeded) {
            this.taskSucceeded = taskSucceeded;
            return this;
        }
        public Boolean getTaskSucceeded() {
            return this.taskSucceeded;
        }

    }

    public static class DescribeGatherLogResultResponseBodyGatherLogResultInstanceResults extends TeaModel {
        @NameInMap("InstanceResult")
        public java.util.List<DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult> instanceResult;

        public static DescribeGatherLogResultResponseBodyGatherLogResultInstanceResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatherLogResultResponseBodyGatherLogResultInstanceResults self = new DescribeGatherLogResultResponseBodyGatherLogResultInstanceResults();
            return TeaModel.build(map, self);
        }

        public DescribeGatherLogResultResponseBodyGatherLogResultInstanceResults setInstanceResult(java.util.List<DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult> instanceResult) {
            this.instanceResult = instanceResult;
            return this;
        }
        public java.util.List<DescribeGatherLogResultResponseBodyGatherLogResultInstanceResultsInstanceResult> getInstanceResult() {
            return this.instanceResult;
        }

    }

    public static class DescribeGatherLogResultResponseBodyGatherLogResult extends TeaModel {
        @NameInMap("LogPath")
        public String logPath;

        @NameInMap("Change")
        public DescribeGatherLogResultResponseBodyGatherLogResultChange change;

        @NameInMap("InstanceResults")
        public DescribeGatherLogResultResponseBodyGatherLogResultInstanceResults instanceResults;

        public static DescribeGatherLogResultResponseBodyGatherLogResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeGatherLogResultResponseBodyGatherLogResult self = new DescribeGatherLogResultResponseBodyGatherLogResult();
            return TeaModel.build(map, self);
        }

        public DescribeGatherLogResultResponseBodyGatherLogResult setLogPath(String logPath) {
            this.logPath = logPath;
            return this;
        }
        public String getLogPath() {
            return this.logPath;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResult setChange(DescribeGatherLogResultResponseBodyGatherLogResultChange change) {
            this.change = change;
            return this;
        }
        public DescribeGatherLogResultResponseBodyGatherLogResultChange getChange() {
            return this.change;
        }

        public DescribeGatherLogResultResponseBodyGatherLogResult setInstanceResults(DescribeGatherLogResultResponseBodyGatherLogResultInstanceResults instanceResults) {
            this.instanceResults = instanceResults;
            return this;
        }
        public DescribeGatherLogResultResponseBodyGatherLogResultInstanceResults getInstanceResults() {
            return this.instanceResults;
        }

    }

}
