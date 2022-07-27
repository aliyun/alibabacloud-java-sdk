// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class NotifyExecutionRequest extends TeaModel {
    @NameInMap("ExecutionId")
    public String executionId;

    @NameInMap("ExecutionStatus")
    public String executionStatus;

    @NameInMap("LoopItem")
    public String loopItem;

    @NameInMap("NotifyNote")
    public String notifyNote;

    @NameInMap("NotifyType")
    public String notifyType;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TaskExecutionId")
    public String taskExecutionId;

    @NameInMap("TaskExecutionIds")
    public String taskExecutionIds;

    @NameInMap("TaskName")
    public String taskName;

    public static NotifyExecutionRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyExecutionRequest self = new NotifyExecutionRequest();
        return TeaModel.build(map, self);
    }

    public NotifyExecutionRequest setExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }
    public String getExecutionId() {
        return this.executionId;
    }

    public NotifyExecutionRequest setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
        return this;
    }
    public String getExecutionStatus() {
        return this.executionStatus;
    }

    public NotifyExecutionRequest setLoopItem(String loopItem) {
        this.loopItem = loopItem;
        return this;
    }
    public String getLoopItem() {
        return this.loopItem;
    }

    public NotifyExecutionRequest setNotifyNote(String notifyNote) {
        this.notifyNote = notifyNote;
        return this;
    }
    public String getNotifyNote() {
        return this.notifyNote;
    }

    public NotifyExecutionRequest setNotifyType(String notifyType) {
        this.notifyType = notifyType;
        return this;
    }
    public String getNotifyType() {
        return this.notifyType;
    }

    public NotifyExecutionRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public NotifyExecutionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public NotifyExecutionRequest setTaskExecutionId(String taskExecutionId) {
        this.taskExecutionId = taskExecutionId;
        return this;
    }
    public String getTaskExecutionId() {
        return this.taskExecutionId;
    }

    public NotifyExecutionRequest setTaskExecutionIds(String taskExecutionIds) {
        this.taskExecutionIds = taskExecutionIds;
        return this;
    }
    public String getTaskExecutionIds() {
        return this.taskExecutionIds;
    }

    public NotifyExecutionRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
