// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateBackupStrategyRequest extends TeaModel {
    @NameInMap("BackupModel")
    public String backupModel;

    @NameInMap("CleanupScheduleTime")
    public String cleanupScheduleTime;

    @NameInMap("DataMaintainDays")
    public Integer dataMaintainDays;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("LaunchLogBackup")
    public Boolean launchLogBackup;

    @NameInMap("ScheduleTime")
    public String scheduleTime;

    @NameInMap("TimeList")
    public String timeList;

    public static CreateBackupStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateBackupStrategyRequest self = new CreateBackupStrategyRequest();
        return TeaModel.build(map, self);
    }

    public CreateBackupStrategyRequest setBackupModel(String backupModel) {
        this.backupModel = backupModel;
        return this;
    }
    public String getBackupModel() {
        return this.backupModel;
    }

    public CreateBackupStrategyRequest setCleanupScheduleTime(String cleanupScheduleTime) {
        this.cleanupScheduleTime = cleanupScheduleTime;
        return this;
    }
    public String getCleanupScheduleTime() {
        return this.cleanupScheduleTime;
    }

    public CreateBackupStrategyRequest setDataMaintainDays(Integer dataMaintainDays) {
        this.dataMaintainDays = dataMaintainDays;
        return this;
    }
    public Integer getDataMaintainDays() {
        return this.dataMaintainDays;
    }

    public CreateBackupStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateBackupStrategyRequest setLaunchLogBackup(Boolean launchLogBackup) {
        this.launchLogBackup = launchLogBackup;
        return this;
    }
    public Boolean getLaunchLogBackup() {
        return this.launchLogBackup;
    }

    public CreateBackupStrategyRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public CreateBackupStrategyRequest setTimeList(String timeList) {
        this.timeList = timeList;
        return this;
    }
    public String getTimeList() {
        return this.timeList;
    }

}
