// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeBackupInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeBackupInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupInfoResponseBody self = new DescribeBackupInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupInfoResponseBody setData(DescribeBackupInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeBackupInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeBackupInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupInfoResponseBodyDataStorageInfoList extends TeaModel {
        // 数据备份大小
        @NameInMap("DataSize")
        public Integer dataSize;

        // 日志备份大小
        @NameInMap("LogSize")
        public Integer logSize;

        // 地域
        @NameInMap("Region")
        public String region;

        // 地域类型
        @NameInMap("RegionType")
        public String regionType;

        public static DescribeBackupInfoResponseBodyDataStorageInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupInfoResponseBodyDataStorageInfoList self = new DescribeBackupInfoResponseBodyDataStorageInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeBackupInfoResponseBodyDataStorageInfoList setDataSize(Integer dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Integer getDataSize() {
            return this.dataSize;
        }

        public DescribeBackupInfoResponseBodyDataStorageInfoList setLogSize(Integer logSize) {
            this.logSize = logSize;
            return this;
        }
        public Integer getLogSize() {
            return this.logSize;
        }

        public DescribeBackupInfoResponseBodyDataStorageInfoList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeBackupInfoResponseBodyDataStorageInfoList setRegionType(String regionType) {
            this.regionType = regionType;
            return this;
        }
        public String getRegionType() {
            return this.regionType;
        }

    }

    public static class DescribeBackupInfoResponseBodyData extends TeaModel {
        @NameInMap("BackupStrategyStatus")
        public String backupStrategyStatus;

        @NameInMap("LatestBackupDataSize")
        public String latestBackupDataSize;

        @NameInMap("LatestBackupTime")
        public String latestBackupTime;

        @NameInMap("LaunchLogBackup")
        public Boolean launchLogBackup;

        // 下次备份时间
        @NameInMap("NextBackupTime")
        public String nextBackupTime;

        // 备份存储信息
        @NameInMap("StorageInfoList")
        public java.util.List<DescribeBackupInfoResponseBodyDataStorageInfoList> storageInfoList;

        public static DescribeBackupInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupInfoResponseBodyData self = new DescribeBackupInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupInfoResponseBodyData setBackupStrategyStatus(String backupStrategyStatus) {
            this.backupStrategyStatus = backupStrategyStatus;
            return this;
        }
        public String getBackupStrategyStatus() {
            return this.backupStrategyStatus;
        }

        public DescribeBackupInfoResponseBodyData setLatestBackupDataSize(String latestBackupDataSize) {
            this.latestBackupDataSize = latestBackupDataSize;
            return this;
        }
        public String getLatestBackupDataSize() {
            return this.latestBackupDataSize;
        }

        public DescribeBackupInfoResponseBodyData setLatestBackupTime(String latestBackupTime) {
            this.latestBackupTime = latestBackupTime;
            return this;
        }
        public String getLatestBackupTime() {
            return this.latestBackupTime;
        }

        public DescribeBackupInfoResponseBodyData setLaunchLogBackup(Boolean launchLogBackup) {
            this.launchLogBackup = launchLogBackup;
            return this;
        }
        public Boolean getLaunchLogBackup() {
            return this.launchLogBackup;
        }

        public DescribeBackupInfoResponseBodyData setNextBackupTime(String nextBackupTime) {
            this.nextBackupTime = nextBackupTime;
            return this;
        }
        public String getNextBackupTime() {
            return this.nextBackupTime;
        }

        public DescribeBackupInfoResponseBodyData setStorageInfoList(java.util.List<DescribeBackupInfoResponseBodyDataStorageInfoList> storageInfoList) {
            this.storageInfoList = storageInfoList;
            return this;
        }
        public java.util.List<DescribeBackupInfoResponseBodyDataStorageInfoList> getStorageInfoList() {
            return this.storageInfoList;
        }

    }

}
