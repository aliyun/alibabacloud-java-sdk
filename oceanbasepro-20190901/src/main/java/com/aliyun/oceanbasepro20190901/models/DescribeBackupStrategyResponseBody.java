// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupStrategyResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeBackupStrategyResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupStrategyResponseBody self = new DescribeBackupStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupStrategyResponseBody setData(DescribeBackupStrategyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBackupStrategyResponseBodyData getData() {
        return this.data;
    }

    public DescribeBackupStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupStrategyResponseBodyData extends TeaModel {
        @NameInMap("BackupDataType")
        public String backupDataType;

        @NameInMap("BackupModel")
        public String backupModel;

        // 异地备份开关
        @NameInMap("CrossRegionFlag")
        public Boolean crossRegionFlag;

        @NameInMap("DataMaintainDays")
        public Integer dataMaintainDays;

        @NameInMap("LaunchExpirationCleanup")
        public Boolean launchExpirationCleanup;

        @NameInMap("LaunchLogBackup")
        public Boolean launchLogBackup;

        // 主备份地域
        @NameInMap("LocalBackupRegion")
        public String localBackupRegion;

        @NameInMap("NextBackupTime")
        public String nextBackupTime;

        @NameInMap("Offsite")
        public String offsite;

        // 异地备份地域，若异地备份开关为false时，该值为空
        @NameInMap("RemoteBackupRegion")
        public String remoteBackupRegion;

        // 集群删除时的备份保留策略
        @NameInMap("RetainMode")
        public String retainMode;

        @NameInMap("ScheduleTime")
        public String scheduleTime;

        @NameInMap("TimeList")
        public String timeList;

        public static DescribeBackupStrategyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupStrategyResponseBodyData self = new DescribeBackupStrategyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupStrategyResponseBodyData setBackupDataType(String backupDataType) {
            this.backupDataType = backupDataType;
            return this;
        }
        public String getBackupDataType() {
            return this.backupDataType;
        }

        public DescribeBackupStrategyResponseBodyData setBackupModel(String backupModel) {
            this.backupModel = backupModel;
            return this;
        }
        public String getBackupModel() {
            return this.backupModel;
        }

        public DescribeBackupStrategyResponseBodyData setCrossRegionFlag(Boolean crossRegionFlag) {
            this.crossRegionFlag = crossRegionFlag;
            return this;
        }
        public Boolean getCrossRegionFlag() {
            return this.crossRegionFlag;
        }

        public DescribeBackupStrategyResponseBodyData setDataMaintainDays(Integer dataMaintainDays) {
            this.dataMaintainDays = dataMaintainDays;
            return this;
        }
        public Integer getDataMaintainDays() {
            return this.dataMaintainDays;
        }

        public DescribeBackupStrategyResponseBodyData setLaunchExpirationCleanup(Boolean launchExpirationCleanup) {
            this.launchExpirationCleanup = launchExpirationCleanup;
            return this;
        }
        public Boolean getLaunchExpirationCleanup() {
            return this.launchExpirationCleanup;
        }

        public DescribeBackupStrategyResponseBodyData setLaunchLogBackup(Boolean launchLogBackup) {
            this.launchLogBackup = launchLogBackup;
            return this;
        }
        public Boolean getLaunchLogBackup() {
            return this.launchLogBackup;
        }

        public DescribeBackupStrategyResponseBodyData setLocalBackupRegion(String localBackupRegion) {
            this.localBackupRegion = localBackupRegion;
            return this;
        }
        public String getLocalBackupRegion() {
            return this.localBackupRegion;
        }

        public DescribeBackupStrategyResponseBodyData setNextBackupTime(String nextBackupTime) {
            this.nextBackupTime = nextBackupTime;
            return this;
        }
        public String getNextBackupTime() {
            return this.nextBackupTime;
        }

        public DescribeBackupStrategyResponseBodyData setOffsite(String offsite) {
            this.offsite = offsite;
            return this;
        }
        public String getOffsite() {
            return this.offsite;
        }

        public DescribeBackupStrategyResponseBodyData setRemoteBackupRegion(String remoteBackupRegion) {
            this.remoteBackupRegion = remoteBackupRegion;
            return this;
        }
        public String getRemoteBackupRegion() {
            return this.remoteBackupRegion;
        }

        public DescribeBackupStrategyResponseBodyData setRetainMode(String retainMode) {
            this.retainMode = retainMode;
            return this;
        }
        public String getRetainMode() {
            return this.retainMode;
        }

        public DescribeBackupStrategyResponseBodyData setScheduleTime(String scheduleTime) {
            this.scheduleTime = scheduleTime;
            return this;
        }
        public String getScheduleTime() {
            return this.scheduleTime;
        }

        public DescribeBackupStrategyResponseBodyData setTimeList(String timeList) {
            this.timeList = timeList;
            return this;
        }
        public String getTimeList() {
            return this.timeList;
        }

    }

}
