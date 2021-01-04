// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class NotifyExecutionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("NotifyNote")
    public String notifyNote;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("TaskExecutionId")
    public String taskExecutionId;

    @NameInMap("ExecutionStatus")
    public String executionStatus;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("LoopItem")
    public String loopItem;

    @NameInMap("TaskExecutionIds")
    public String taskExecutionIds;

    public static NotifyExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyExecutionRequest self = new NotifyExecutionRequest();
        return TeaModel.build(map, self);
    }

    public NotifyExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public NotifyExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public NotifyExecutionRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public NotifyExecutionRequest setNotifyNote(String notifyNote) {
        this.notifyNote = notifyNote;
        return this;
    }
    public String getNotifyNote() {
        return this.notifyNote;
    }

    public NotifyExecutionRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public NotifyExecutionRequest setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    public NotifyExecutionRequest setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    public NotifyExecutionRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public NotifyExecutionRequest setLoopItem(String loopItem) {
        this.loopItem = loopItem;
        return this;
    }
    public String getLoopItem() {
        return this.loopItem;
    }

    public NotifyExecutionRequest setTaskExecutionIds(String taskExecutionIds) {
        this.taskExecutionIds = taskExecutionIds;
        return this;
    }
    public String getTaskExecutionIds() {
        return this.taskExecutionIds;
    }

}
