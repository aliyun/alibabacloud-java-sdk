// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    /**
     * <p>The following parameters are no longer used. Ignore the parameters.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeBackupsResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>Details of the backup files.</p>
     */
    @NameInMap("Backups")
    public DescribeBackupsResponseBodyBackups backups;

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
     * <p> The value of this parameter is independent of the number and size of the returned backup sets. Instead, it reflects the total size of all valid full backups of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("FullStorageSize")
    public Long fullStorageSize;

    /**
     * <p>The size of the log backup file of the instance. Unit: bytes. This value is valid only when flashback is enabled.</p>
     * <blockquote>
     * <p> The value of this parameter is independent of the number and size of the returned backup sets. Instead, it reflects the total size of all valid log backups of the instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("LogStorageSize")
    public Long logStorageSize;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
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
     * <p>963C20F0-7CE1-4591-AAF3-6F3CD1CE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of backup files that were returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponseBody self = new DescribeBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponseBody setAccessDeniedDetail(DescribeBackupsResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeBackupsResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeBackupsResponseBody setBackups(DescribeBackupsResponseBodyBackups backups) {
        this.backups = backups;
        return this;
    }
    public DescribeBackupsResponseBodyBackups getBackups() {
        return this.backups;
    }

    public DescribeBackupsResponseBody setFreeSize(Long freeSize) {
        this.freeSize = freeSize;
        return this;
    }
    public Long getFreeSize() {
        return this.freeSize;
    }

    public DescribeBackupsResponseBody setFullStorageSize(Long fullStorageSize) {
        this.fullStorageSize = fullStorageSize;
        return this;
    }
    public Long getFullStorageSize() {
        return this.fullStorageSize;
    }

    public DescribeBackupsResponseBody setLogStorageSize(Long logStorageSize) {
        this.logStorageSize = logStorageSize;
        return this;
    }
    public Long getLogStorageSize() {
        return this.logStorageSize;
    }

    public DescribeBackupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeBackupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeBackupsResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>_</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeBackupsResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyAccessDeniedDetail self = new DescribeBackupsResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeBackupsResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeBackupsResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeBackupsResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeBackupsResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeBackupsResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeBackupsResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

    public static class DescribeBackupsResponseBodyBackupsBackup extends TeaModel {
        /**
         * <p>The names of the databases that are backed up. The default value is <strong>all</strong>, which indicates that all databases are backed up.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("BackupDBNames")
        public String backupDBNames;

        /**
         * <p>The public download URL of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://rdsbak-hk45-v2.oss-cn-hongkong.aliyuncs.com/">https://rdsbak-hk45-v2.oss-cn-hongkong.aliyuncs.com/</a>********</p>
         */
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        /**
         * <p>The end time of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-14T05:31:13Z</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The ID of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>165*****50</p>
         */
        @NameInMap("BackupId")
        public Long backupId;

        /**
         * <p>The internal download URL of the backup file.</p>
         * <blockquote>
         * <p> You can use this URL to download the backup file from an Elastic Compute Service (ECS) instance that is connected to the ApsaraDB for Redis instance. The ECS instance must belong to the same classic network or reside in the same virtual private cloud (VPC) as the ApsaraDB for Redis instance.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://rdsbak-hk45-v2.oss-cn-hongkong.aliyuncs.com/">https://rdsbak-hk45-v2.oss-cn-hongkong.aliyuncs.com/</a>********</p>
         */
        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        /**
         * <p>The ID of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>24340</p>
         */
        @NameInMap("BackupJobID")
        public Long backupJobID;

        /**
         * <p>The backup method. Valid values:</p>
         * <ul>
         * <li><strong>Logical</strong></li>
         * <li><strong>Physical</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Physical</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The backup mode. Valid values:</p>
         * <ul>
         * <li><strong>Automated</strong></li>
         * <li><strong>Manual</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Automated</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The size of the backup file.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("BackupSize")
        public Long backupSize;

        /**
         * <p>The start time of the backup.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-14T05:28:50Z</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The status of the backup. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong></li>
         * <li><strong>Failed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The backup type. Valid values:</p>
         * <ul>
         * <li><strong>FullBackup</strong></li>
         * <li><strong>IncrementalBackup</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The engine version (major version) of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The node ID.</p>
         * <blockquote>
         * <p> If the instance uses the standard architecture, this parameter returns the instance ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>r-bp10noxlhcoim2****-db-1</p>
         */
        @NameInMap("NodeInstanceId")
        public String nodeInstanceId;

        @NameInMap("RecoverConfigMode")
        public String recoverConfigMode;

        public static DescribeBackupsResponseBodyBackupsBackup build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyBackupsBackup self = new DescribeBackupsResponseBodyBackupsBackup();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupDBNames(String backupDBNames) {
            this.backupDBNames = backupDBNames;
            return this;
        }
        public String getBackupDBNames() {
            return this.backupDBNames;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupDownloadURL(String backupDownloadURL) {
            this.backupDownloadURL = backupDownloadURL;
            return this;
        }
        public String getBackupDownloadURL() {
            return this.backupDownloadURL;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupId(Long backupId) {
            this.backupId = backupId;
            return this;
        }
        public Long getBackupId() {
            return this.backupId;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupIntranetDownloadURL(String backupIntranetDownloadURL) {
            this.backupIntranetDownloadURL = backupIntranetDownloadURL;
            return this;
        }
        public String getBackupIntranetDownloadURL() {
            return this.backupIntranetDownloadURL;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupJobID(Long backupJobID) {
            this.backupJobID = backupJobID;
            return this;
        }
        public Long getBackupJobID() {
            return this.backupJobID;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public DescribeBackupsResponseBodyBackupsBackup setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupsResponseBodyBackupsBackup setEngineVersion(String engineVersion) {
            this.engineVersion = engineVersion;
            return this;
        }
        public String getEngineVersion() {
            return this.engineVersion;
        }

        public DescribeBackupsResponseBodyBackupsBackup setNodeInstanceId(String nodeInstanceId) {
            this.nodeInstanceId = nodeInstanceId;
            return this;
        }
        public String getNodeInstanceId() {
            return this.nodeInstanceId;
        }

        public DescribeBackupsResponseBodyBackupsBackup setRecoverConfigMode(String recoverConfigMode) {
            this.recoverConfigMode = recoverConfigMode;
            return this;
        }
        public String getRecoverConfigMode() {
            return this.recoverConfigMode;
        }

    }

    public static class DescribeBackupsResponseBodyBackups extends TeaModel {
        @NameInMap("Backup")
        public java.util.List<DescribeBackupsResponseBodyBackupsBackup> backup;

        public static DescribeBackupsResponseBodyBackups build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyBackups self = new DescribeBackupsResponseBodyBackups();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyBackups setBackup(java.util.List<DescribeBackupsResponseBodyBackupsBackup> backup) {
            this.backup = backup;
            return this;
        }
        public java.util.List<DescribeBackupsResponseBodyBackupsBackup> getBackup() {
            return this.backup;
        }

    }

}
