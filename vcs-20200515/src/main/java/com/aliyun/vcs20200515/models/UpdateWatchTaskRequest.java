// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class UpdateWatchTaskRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceList")
    public String deviceList;

    @NameInMap("MessageReceiver")
    public String messageReceiver;

    @NameInMap("ScheduleCycleDates")
    public String scheduleCycleDates;

    @NameInMap("ScheduleTimes")
    public String scheduleTimes;

    @NameInMap("ScheduleType")
    public String scheduleType;

    @NameInMap("TaskName")
    public String taskName;

    @NameInMap("WatchPolicyIds")
    public String watchPolicyIds;

    @NameInMap("WatchTaskId")
    public String watchTaskId;

    public static UpdateWatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWatchTaskRequest self = new UpdateWatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWatchTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateWatchTaskRequest setDeviceList(String deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public String getDeviceList() {
        return this.deviceList;
    }

    public UpdateWatchTaskRequest setMessageReceiver(String messageReceiver) {
        this.messageReceiver = messageReceiver;
        return this;
    }
    public String getMessageReceiver() {
        return this.messageReceiver;
    }

    public UpdateWatchTaskRequest setScheduleCycleDates(String scheduleCycleDates) {
        this.scheduleCycleDates = scheduleCycleDates;
        return this;
    }
    public String getScheduleCycleDates() {
        return this.scheduleCycleDates;
    }

    public UpdateWatchTaskRequest setScheduleTimes(String scheduleTimes) {
        this.scheduleTimes = scheduleTimes;
        return this;
    }
    public String getScheduleTimes() {
        return this.scheduleTimes;
    }

    public UpdateWatchTaskRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public UpdateWatchTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public UpdateWatchTaskRequest setWatchPolicyIds(String watchPolicyIds) {
        this.watchPolicyIds = watchPolicyIds;
        return this;
    }
    public String getWatchPolicyIds() {
        return this.watchPolicyIds;
    }

    public UpdateWatchTaskRequest setWatchTaskId(String watchTaskId) {
        this.watchTaskId = watchTaskId;
        return this;
    }
    public String getWatchTaskId() {
        return this.watchTaskId;
    }

}
