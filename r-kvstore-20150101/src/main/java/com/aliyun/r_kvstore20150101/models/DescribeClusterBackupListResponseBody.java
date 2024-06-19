// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeClusterBackupListResponseBody extends TeaModel {
    /**
     * <p>The backup sets of the instance. An instance backup contains the backup sets of all nodes in the instance.</p>
     */
    @NameInMap("ClusterBackups")
    public java.util.List<DescribeClusterBackupListResponseBodyClusterBackups> clusterBackups;

    /**
     * <p>This parameter does not take effect. Ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("FreeSize")
    public Long freeSize;

    /**
     * <p>The size of the full backup file of the instance. Unit: bytes. Full backups originate from scheduled backups, manual backups, and backups generated during cache analysis.</p>
     * <blockquote>
     * <p> The value of this parameter is independent of the number and size of returned backup sets. Instead, it represents the size of all valid full backups of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("FullStorageSize")
    public Long fullStorageSize;

    /**
     * <p>The size of the log backup file of the instance. Unit: bytes. This parameter is valid only when flashback is enabled.</p>
     * <blockquote>
     * <p> The value of this parameter is independent of the number and size of returned backup sets. Instead, it represents the size of all valid log backups of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("LogStorageSize")
    public Long logStorageSize;

    /**
     * <p>The number of entries to return per page. Valid values: 1 to 100.
     * Default value: 30.</p>
     * <blockquote>
     * <p>If you specify this parameter, PageSize and PageNumber are unavailable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The maximum number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C009DA42-3B19-5B81-963D-1509DE2408DD</p>
     */
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

    public DescribeClusterBackupListResponseBody setFreeSize(Long freeSize) {
        this.freeSize = freeSize;
        return this;
    }
    public Long getFreeSize() {
        return this.freeSize;
    }

    public DescribeClusterBackupListResponseBody setFullStorageSize(Long fullStorageSize) {
        this.fullStorageSize = fullStorageSize;
        return this;
    }
    public Long getFullStorageSize() {
        return this.fullStorageSize;
    }

    public DescribeClusterBackupListResponseBody setLogStorageSize(Long logStorageSize) {
        this.logStorageSize = logStorageSize;
        return this;
    }
    public Long getLogStorageSize() {
        return this.logStorageSize;
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
        /**
         * <p>The engine version.</p>
         * 
         * <strong>example:</strong>
         * <p>5.0</p>
         */
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
        /**
         * <p>The public download URL of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://rdsbakbucket-huhehaote-v2.oss-cn-huhehaote.aliyuncs.com/custins424747958/hins100322105_data_20240110012135.rdb">http://rdsbakbucket-huhehaote-v2.oss-cn-huhehaote.aliyuncs.com/custins424747958/hins100322105_data_20240110012135.rdb</a></p>
         */
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        /**
         * <p>The end time of the backup. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-09T17:21:57</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The ID of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>514645788</p>
         */
        @NameInMap("BackupId")
        public String backupId;

        /**
         * <p>The internal download URL of the backup file.</p>
         * <blockquote>
         * <p> You can use this URL to download the backup file from an Elastic Compute Service (ECS) instance that is connected to the ApsaraDB for Redis instance. The ECS instance must belong to the same classic network or reside in the same virtual private cloud (VPC) as the ApsaraDB for Redis instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://rdsbakbucket-huhehaote-v2.oss-cn-huhehaote-internal.aliyuncs.com/custins424747958/hins100322105_data_20240110012135.rdb">http://rdsbakbucket-huhehaote-v2.oss-cn-huhehaote-internal.aliyuncs.com/custins424747958/hins100322105_data_20240110012135.rdb</a></p>
         */
        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        /**
         * <p>The backup name.</p>
         * 
         * <strong>example:</strong>
         * <p>hins100322105_data_20240110012135.rdb</p>
         */
        @NameInMap("BackupName")
        public String backupName;

        /**
         * <p>The size of the backup file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("BackupSize")
        public String backupSize;

        /**
         * <p>The start time of the backup. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-09T17:21:30Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The status of the backup. Valid values:</p>
         * <ul>
         * <li><strong>OK</strong></li>
         * <li><strong>ERROR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The database engine. The return value is <strong>redis</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>redis</p>
         */
        @NameInMap("Engine")
        public String engine;

        /**
         * <p>The additional information.</p>
         */
        @NameInMap("ExtraInfo")
        public DescribeClusterBackupListResponseBodyClusterBackupsBackupsExtraInfo extraInfo;

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>hins100322105_data_20240108012127.rdb</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>Indicates whether the backup set is available. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unavailable</li>
         * <li><strong>1</strong>: available</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAvail")
        public String isAvail;

        @NameInMap("RecoverConfigMode")
        public String recoverConfigMode;

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

        public DescribeClusterBackupListResponseBodyClusterBackupsBackups setRecoverConfigMode(String recoverConfigMode) {
            this.recoverConfigMode = recoverConfigMode;
            return this;
        }
        public String getRecoverConfigMode() {
            return this.recoverConfigMode;
        }

    }

    public static class DescribeClusterBackupListResponseBodyClusterBackups extends TeaModel {
        /**
         * <p>The backup sets of all nodes in the instance.</p>
         */
        @NameInMap("Backups")
        public java.util.List<DescribeClusterBackupListResponseBodyClusterBackupsBackups> backups;

        /**
         * <p>The end time of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-10T17:21:55Z</p>
         */
        @NameInMap("ClusterBackupEndTime")
        public String clusterBackupEndTime;

        /**
         * <p>The ID of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>cb-zmdqj2m3xyxjtdt0</p>
         */
        @NameInMap("ClusterBackupId")
        public String clusterBackupId;

        /**
         * <p>The backup mode.</p>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        @NameInMap("ClusterBackupMode")
        public String clusterBackupMode;

        /**
         * <p>The size of the backup set.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("ClusterBackupSize")
        public String clusterBackupSize;

        /**
         * <p>The start time of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-10T17:21:25Z</p>
         */
        @NameInMap("ClusterBackupStartTime")
        public String clusterBackupStartTime;

        /**
         * <p>The status of the backup set.</p>
         * <ul>
         * <li>OK</li>
         * <li>RUNNING</li>
         * <li>Failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("ClusterBackupStatus")
        public String clusterBackupStatus;

        /**
         * <p>Indicates whether the backup set is valid. A value of 0 indicates that node-level backups failed or have not been completed.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsAvail")
        public Integer isAvail;

        /**
         * <p>The backup progress. The system displays only the progress of running backup tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>100%</p>
         */
        @NameInMap("Progress")
        public String progress;

        /**
         * <p>The memory size of a single node during a full backup. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
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
