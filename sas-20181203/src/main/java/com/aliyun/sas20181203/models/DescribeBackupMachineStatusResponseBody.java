// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupMachineStatusResponseBody extends TeaModel {
    @NameInMap("BackupMachineStatus")
    public DescribeBackupMachineStatusResponseBodyBackupMachineStatus backupMachineStatus;

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
        @NameInMap("ErrorCode")
        public String errorCode;

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
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("ClientStatus")
        public String clientStatus;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorList")
        public java.util.List<DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList> errorList;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SavedBackupCount")
        public Integer savedBackupCount;

        @NameInMap("Status")
        public String status;

        @NameInMap("Uuid")
        public String uuid;

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
