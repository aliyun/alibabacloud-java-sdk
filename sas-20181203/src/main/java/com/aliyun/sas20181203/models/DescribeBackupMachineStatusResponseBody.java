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

        @NameInMap("ErrorFile")
        public String errorFile;

        @NameInMap("ErrorFileUrl")
        public String errorFileUrl;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ErrorStatus")
        public String errorStatus;

        @NameInMap("ErrorTime")
        public Long errorTime;

        @NameInMap("ErrorType")
        public String errorType;

        @NameInMap("Key")
        public String key;

        @NameInMap("Path")
        public String path;

        @NameInMap("RequestId")
        public String requestId;

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

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorFile(String errorFile) {
            this.errorFile = errorFile;
            return this;
        }
        public String getErrorFile() {
            return this.errorFile;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorFileUrl(String errorFileUrl) {
            this.errorFileUrl = errorFileUrl;
            return this;
        }
        public String getErrorFileUrl() {
            return this.errorFileUrl;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorStatus(String errorStatus) {
            this.errorStatus = errorStatus;
            return this;
        }
        public String getErrorStatus() {
            return this.errorStatus;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorTime(Long errorTime) {
            this.errorTime = errorTime;
            return this;
        }
        public Long getErrorTime() {
            return this.errorTime;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
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

        @NameInMap("RequestId")
        public String requestId;

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

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
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
