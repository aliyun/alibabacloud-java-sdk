// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeClusterBackupListResponseBody extends TeaModel {
    @NameInMap("ClusterBackups")
    public java.util.List<DescribeClusterBackupListResponseBodyClusterBackups> clusterBackups;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeClusterBackupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterBackupListResponseBody self = new DescribeClusterBackupListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterBackupListResponseBody setClusterBackups(java.util.List<DescribeClusterBackupListResponseBodyClusterBackups> clusterBackups) {
        this.clusterBackups = clusterBackups;
        return this;
    }
    public java.util.List<DescribeClusterBackupListResponseBodyClusterBackups> getClusterBackups() {
        return this.clusterBackups;
    }

    public DescribeClusterBackupListResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeClusterBackupListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClusterBackupListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeClusterBackupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeClusterBackupListResponseBodyClusterBackupsBackupsExtraInfo extends TeaModel {
        @NameInMap("CustinsDbVersion")
        public String custinsDbVersion;

        public static DescribeClusterBackupListResponseBodyClusterBackupsBackupsExtraInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBackupListResponseBodyClusterBackupsBackupsExtraInfo self = new DescribeClusterBackupListResponseBodyClusterBackupsBackupsExtraInfo();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackupsExtraInfo setCustinsDbVersion(String custinsDbVersion) {
            this.custinsDbVersion = custinsDbVersion;
            return this;
        }
        public String getCustinsDbVersion() {
            return this.custinsDbVersion;
        }

    }

    public static class DescribeClusterBackupListResponseBodyClusterBackupsBackups extends TeaModel {
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        @NameInMap("BackupName")
        public String backupName;

        @NameInMap("BackupSize")
        public String backupSize;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("ExtraInfo")
        public DescribeClusterBackupListResponseBodyClusterBackupsBackupsExtraInfo extraInfo;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("IsAvail")
        public String isAvail;

        public static DescribeClusterBackupListResponseBodyClusterBackupsBackups build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBackupListResponseBodyClusterBackupsBackups self = new DescribeClusterBackupListResponseBodyClusterBackupsBackups();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
            return this;
        }
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
            this.backupIntranetDownloadURL = backupIntranetDownloadURL;
            return this;
        }
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setBackupName(String backupName) {
            this.backupName = backupName;
            return this;
        }
        public String getBackupName() {
            return this.backupName;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setBackupSize(String backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public String getBackupSize() {
            return this.backupSize;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setExtraInfo(DescribeClusterBackupListResponseBodyClusterBackupsBackupsExtraInfo extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }
        public DescribeClusterBackupListResponseBodyClusterBackupsBackupsExtraInfo getExtraInfo() {
            return this.extraInfo;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setIsAvail(String isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public String getIsAvail() {
            return this.isAvail;
        }

    }

    public static class DescribeClusterBackupListResponseBodyClusterBackups extends TeaModel {
        @NameInMap("Backups")
        public java.util.List<DescribeClusterBackupListResponseBodyClusterBackupsBackups> backups;

        @NameInMap("ClusterBackupEndTime")
        public String clusterBackupEndTime;

        @NameInMap("ClusterBackupId")
        public String clusterBackupId;

        @NameInMap("ClusterBackupMode")
        public String clusterBackupMode;

        @NameInMap("ClusterBackupSize")
        public String clusterBackupSize;

        @NameInMap("ClusterBackupStartTime")
        public String clusterBackupStartTime;

        @NameInMap("ClusterBackupStatus")
        public String clusterBackupStatus;

        @NameInMap("IsAvail")
        public Integer isAvail;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("ShardClassMemory")
        public Integer shardClassMemory;

        public static DescribeClusterBackupListResponseBodyClusterBackups build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterBackupListResponseBodyClusterBackups self = new DescribeClusterBackupListResponseBodyClusterBackups();
            return TeaModel.build(map, self);
        }

        public DescribeClusterBackupListResponseBodyClusterBackups setBackups(java.util.List<DescribeClusterBackupListResponseBodyClusterBackupsBackups> backups) {
            this.backups = backups;
            return this;
        }
        public java.util.List<DescribeClusterBackupListResponseBodyClusterBackupsBackups> getBackups() {
            return this.backups;
        }

        public DescribeClusterBackupListResponseBodyClusterBackups setClusterBackupEndTime(String clusterBackupEndTime) {
            this.clusterBackupEndTime = clusterBackupEndTime;
            return this;
        }
        public String getClusterBackupEndTime() {
            return this.clusterBackupEndTime;
        }

        public DescribeClusterBackupListResponseBodyClusterBackups setClusterBackupId(String clusterBackupId) {
            this.clusterBackupId = clusterBackupId;
            return this;
        }
        public String getClusterBackupId() {
            return this.clusterBackupId;
        }

        public DescribeClusterBackupListResponseBodyClusterBackups setClusterBackupMode(String clusterBackupMode) {
            this.clusterBackupMode = clusterBackupMode;
            return this;
        }
        public String getClusterBackupMode() {
            return this.clusterBackupMode;
        }

        public DescribeClusterBackupListResponseBodyClusterBackups setClusterBackupSize(String clusterBackupSize) {
            this.clusterBackupSize = clusterBackupSize;
            return this;
        }
        public String getClusterBackupSize() {
            return this.clusterBackupSize;
        }

        public DescribeClusterBackupListResponseBodyClusterBackups setClusterBackupStartTime(String clusterBackupStartTime) {
            this.clusterBackupStartTime = clusterBackupStartTime;
            return this;
        }
        public String getClusterBackupStartTime() {
            return this.clusterBackupStartTime;
        }

        public DescribeClusterBackupListResponseBodyClusterBackups setClusterBackupStatus(String clusterBackupStatus) {
            this.clusterBackupStatus = clusterBackupStatus;
            return this;
        }
        public String getClusterBackupStatus() {
            return this.clusterBackupStatus;
        }

        public DescribeClusterBackupListResponseBodyClusterBackups setIsAvail(Integer isAvail) {
            this.isAvail = isAvail;
            return this;
        }
        public Integer getIsAvail() {
            return this.isAvail;
        }

        public DescribeClusterBackupListResponseBodyClusterBackups setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeClusterBackupListResponseBodyClusterBackups setShardClassMemory(Integer shardClassMemory) {
            this.shardClassMemory = shardClassMemory;
            return this;
        }
        public Integer getShardClassMemory() {
            return this.shardClassMemory;
        }

    }

}
