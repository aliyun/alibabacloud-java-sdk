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
     */
    @NameInMap("FreeSize")
    public Long freeSize;

    /**
     * <p>The size of the full backup file of the instance. Unit: bytes. Full backups originate from scheduled backups, manual backups, and backups generated during cache analysis.</p>
     * <br>
     * <p>>  The value of this parameter is independent of the number and size of the returned backup sets. Instead, it reflects the total size of all valid full backups of the instance.</p>
     */
    @NameInMap("FullStorageSize")
    public Long fullStorageSize;

    /**
     * <p>The size of the log backup file of the instance. Unit: bytes. This value is valid only when flashback is enabled.</p>
     * <br>
     * <p>>  The value of this parameter is independent of the number and size of the returned backup sets. Instead, it reflects the total size of all valid log backups of the instance.</p>
     */
    @NameInMap("LogStorageSize")
    public Long logStorageSize;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of backup files that were returned.</p>
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
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>This parameter is no longer used. Ignore this parameter.</p>
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
         * <p>The names of the databases that are backed up. The default value is **all**, which indicates that all databases are backed up.</p>
         */
        @NameInMap("BackupDBNames")
        public String backupDBNames;

        /**
         * <p>The public download URL of the backup file.</p>
         */
        @NameInMap("BackupDownloadURL")
        public String backupDownloadURL;

        /**
         * <p>The end time of the backup.</p>
         */
        @NameInMap("BackupEndTime")
        public String backupEndTime;

        /**
         * <p>The ID of the backup file.</p>
         */
        @NameInMap("BackupId")
        public Long backupId;

        /**
         * <p>The internal download URL of the backup file.</p>
         * <br>
         * <p>>  You can use this URL to download the backup file from an Elastic Compute Service (ECS) instance that is connected to the ApsaraDB for Redis instance. The ECS instance must belong to the same classic network or reside in the same virtual private cloud (VPC) as the ApsaraDB for Redis instance.</p>
         */
        @NameInMap("BackupIntranetDownloadURL")
        public String backupIntranetDownloadURL;

        /**
         * <p>The ID of the backup task.</p>
         */
        @NameInMap("BackupJobID")
        public Long backupJobID;

        /**
         * <p>The backup method. Valid values:</p>
         * <br>
         * <p>*   **Logical**</p>
         * <p>*   **Physical**</p>
         */
        @NameInMap("BackupMethod")
        public String backupMethod;

        /**
         * <p>The backup mode. Valid values:</p>
         * <br>
         * <p>*   **Automated**</p>
         * <p>*   **Manual**</p>
         */
        @NameInMap("BackupMode")
        public String backupMode;

        /**
         * <p>The size of the backup file.</p>
         */
        @NameInMap("BackupSize")
        public Long backupSize;

        /**
         * <p>The start time of the backup.</p>
         */
        @NameInMap("BackupStartTime")
        public String backupStartTime;

        /**
         * <p>The status of the backup. Valid values:</p>
         * <br>
         * <p>*   **Success**</p>
         * <p>*   **Failed**</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The backup type. Valid values:</p>
         * <br>
         * <p>*   **FullBackup**</p>
         * <p>*   **IncrementalBackup**</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        /**
         * <p>The engine version (major version) of the instance.</p>
         */
        @NameInMap("EngineVersion")
        public String engineVersion;

        /**
         * <p>The node ID.</p>
         * <br>
         * <p>>  If the instance uses the standard architecture, this parameter returns the instance ID.</p>
         */
        @NameInMap("NodeInstanceId")
        public String nodeInstanceId;

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
