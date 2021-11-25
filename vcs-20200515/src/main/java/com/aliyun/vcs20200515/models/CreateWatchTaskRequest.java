// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class CreateWatchTaskRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

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

    public static CreateWatchTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWatchTaskRequest self = new CreateWatchTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateWatchTaskRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public CreateWatchTaskRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateWatchTaskRequest setDeviceList(String deviceList) {
        this.deviceList = deviceList;
        return this;
    }
    public String getDeviceList() {
        return this.deviceList;
    }

    public CreateWatchTaskRequest setMessageReceiver(String messageReceiver) {
        this.messageReceiver = messageReceiver;
        return this;
    }
    public String getMessageReceiver() {
        return this.messageReceiver;
    }

    public CreateWatchTaskRequest setScheduleCycleDates(String scheduleCycleDates) {
        this.scheduleCycleDates = scheduleCycleDates;
        return this;
    }
    public String getScheduleCycleDates() {
        return this.scheduleCycleDates;
    }

    public CreateWatchTaskRequest setScheduleTimes(String scheduleTimes) {
        this.scheduleTimes = scheduleTimes;
        return this;
    }
    public String getScheduleTimes() {
        return this.scheduleTimes;
    }

    public CreateWatchTaskRequest setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    public String getScheduleType() {
        return this.scheduleType;
    }

    public CreateWatchTaskRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

    public CreateWatchTaskRequest setWatchPolicyIds(String watchPolicyIds) {
        this.watchPolicyIds = watchPolicyIds;
        return this;
    }
    public String getWatchPolicyIds() {
        return this.watchPolicyIds;
    }

}
