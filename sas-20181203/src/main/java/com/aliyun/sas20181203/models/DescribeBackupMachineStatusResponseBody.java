// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupMachineStatusResponseBody extends TeaModel {
    /**
     * <p>The backup status of the server.</p>
     */
    @NameInMap("BackupMachineStatus")
    public DescribeBackupMachineStatusResponseBodyBackupMachineStatus backupMachineStatus;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupMachineStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupMachineStatusResponseBody self = new DescribeBackupMachineStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupMachineStatusResponseBody setBackupMachineStatus(DescribeBackupMachineStatusResponseBodyBackupMachineStatus backupMachineStatus) {
        this.backupMachineStatus = backupMachineStatus;
        return this;
    }
    public DescribeBackupMachineStatusResponseBodyBackupMachineStatus getBackupMachineStatus() {
        return this.backupMachineStatus;
    }

    public DescribeBackupMachineStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList extends TeaModel {
        /**
         * <p>The error code returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned.</p>
         */
        @NameInMap("ErrorStatus")
        public String errorStatus;

        public static DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList self = new DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList();
            return TeaModel.build(map, self);
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorStatus(String errorStatus) {
            this.errorStatus = errorStatus;
            return this;
        }
        public String getErrorStatus() {
            return this.errorStatus;
        }

    }

    public static class DescribeBackupMachineStatusResponseBodyBackupMachineStatus extends TeaModel {
        /**
         * <p>The ID of the anti-ransomware agent.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The status of the anti-ransomware agent. Valid values:</p>
         * <br>
         * <p>*   **ONLINE**: normal</p>
         * <p>*   **CLIENT_CONNECTION_ERROR**: abnormal</p>
         * <p>*   **UNINSTALLING**: being uninstalled</p>
         * <p>*   **UNINSTALL_FAILED**: failed to be uninstalled</p>
         * <p>*   **UPGRADING**: being upgraded</p>
         * <p>*   **UPGRADE_FAILED**: failed to be upgraded</p>
         */
        @NameInMap("ClientStatus")
        public String clientStatus;

        /**
         * <p>The version of the anti-ransomware agent.</p>
         */
        @NameInMap("ClientVersion")
        public String clientVersion;

        /**
         * <p>The error code returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>An array that consists of the error information reported by the backup server.</p>
         */
        @NameInMap("ErrorList")
        public java.util.List<DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList> errorList;

        /**
         * <p>The ID of the server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the region in which the server resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The number of backup versions.</p>
         */
        @NameInMap("SavedBackupCount")
        public Integer savedBackupCount;

        /**
         * <p>The status of the anti-ransomware service. Valid values:</p>
         * <p>*   **SERVICE_EXCEPTION**: Service exception</p>
         * <p>*   **RESTORING**: Restoring</p>
         * <p>*   **BACKING_UP**: Backup in process</p>
         */
        @NameInMap("ServiceStatus")
        public String serviceStatus;

        /**
         * <p>The status of the anti-ransomware agent. Valid values:</p>
         * <br>
         * <p>*   **NOT_INSTALLED**: not installed</p>
         * <p>*   **CLIENT_CONNECTION_ERROR**: abnormal</p>
         * <p>*   **ACTIVATED**: normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The UUID of the server.</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the backup vault in which the backup data is stored.</p>
         */
        @NameInMap("VaultId")
        public String vaultId;

        public static DescribeBackupMachineStatusResponseBodyBackupMachineStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupMachineStatusResponseBodyBackupMachineStatus self = new DescribeBackupMachineStatusResponseBodyBackupMachineStatus();
            return TeaModel.build(map, self);
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setErrorList(java.util.List<DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList> errorList) {
            this.errorList = errorList;
            return this;
        }
        public java.util.List<DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList> getErrorList() {
            return this.errorList;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setSavedBackupCount(Integer savedBackupCount) {
            this.savedBackupCount = savedBackupCount;
            return this;
        }
        public Integer getSavedBackupCount() {
            return this.savedBackupCount;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setServiceStatus(String serviceStatus) {
            this.serviceStatus = serviceStatus;
            return this;
        }
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

    }

}
