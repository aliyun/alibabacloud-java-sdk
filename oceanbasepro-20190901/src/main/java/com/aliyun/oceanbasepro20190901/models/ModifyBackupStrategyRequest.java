// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ModifyBackupStrategyRequest extends TeaModel {
    // 异地备份开关
    @NameInMap("CrossRegionFlag")
    public Boolean crossRegionFlag;

    // 数据清理日期
    @NameInMap("DataMaintainDays")
    public Integer dataMaintainDays;

    // 集群ID
    @NameInMap("InstanceId")
    public String instanceId;

    // 异地备份地域，在异地备份开关为ture时，为必选
    @NameInMap("RemoteBackupRegion")
    public String remoteBackupRegion;

    // 集群删除备份保留策略
    @NameInMap("RetainMode")
    public String retainMode;

    // 调度时间点
    @NameInMap("ScheduleTime")
    public String scheduleTime;

    // 调度日期列表
    @NameInMap("TimeList")
    public String timeList;

    public static ModifyBackupStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyBackupStrategyRequest self = new ModifyBackupStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyBackupStrategyRequest setCrossRegionFlag(Boolean crossRegionFlag) {
        this.crossRegionFlag = crossRegionFlag;
        return this;
    }
    public Boolean getCrossRegionFlag() {
        return this.crossRegionFlag;
    }

    public ModifyBackupStrategyRequest setDataMaintainDays(Integer dataMaintainDays) {
        this.dataMaintainDays = dataMaintainDays;
        return this;
    }
    public Integer getDataMaintainDays() {
        return this.dataMaintainDays;
    }

    public ModifyBackupStrategyRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyBackupStrategyRequest setRemoteBackupRegion(String remoteBackupRegion) {
        this.remoteBackupRegion = remoteBackupRegion;
        return this;
    }
    public String getRemoteBackupRegion() {
        return this.remoteBackupRegion;
    }

    public ModifyBackupStrategyRequest setRetainMode(String retainMode) {
        this.retainMode = retainMode;
        return this;
    }
    public String getRetainMode() {
        return this.retainMode;
    }

    public ModifyBackupStrategyRequest setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
        return this;
    }
    public String getScheduleTime() {
        return this.scheduleTime;
    }

    public ModifyBackupStrategyRequest setTimeList(String timeList) {
        this.timeList = timeList;
        return this;
    }
    public String getTimeList() {
        return this.timeList;
    }

}
