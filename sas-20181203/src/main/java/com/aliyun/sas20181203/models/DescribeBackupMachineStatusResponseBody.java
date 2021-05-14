// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackupMachineStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("BackupMachineStatus")
    public DescribeBackupMachineStatusResponseBodyBackupMachineStatus backupMachineStatus;

    public static DescribeBackupMachineStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupMachineStatusResponseBody self = new DescribeBackupMachineStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupMachineStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupMachineStatusResponseBody setBackupMachineStatus(DescribeBackupMachineStatusResponseBodyBackupMachineStatus backupMachineStatus) {
        this.backupMachineStatus = backupMachineStatus;
        return this;
    }
    public DescribeBackupMachineStatusResponseBodyBackupMachineStatus getBackupMachineStatus() {
        return this.backupMachineStatus;
    }

    public static class DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("ErrorFile")
        public String errorFile;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ErrorFileUrl")
        public String errorFileUrl;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorStatus")
        public String errorStatus;

        @NameInMap("Path")
        public String path;

        @NameInMap("ErrorMsg")
        public String errorMsg;

        @NameInMap("ErrorType")
        public String errorType;

        @NameInMap("ErrorTime")
        public Long errorTime;

        public static DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList self = new DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList();
            return TeaModel.build(map, self);
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorFile(String errorFile) {
            this.errorFile = errorFile;
            return this;
        }
        public String getErrorFile() {
            return this.errorFile;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorFileUrl(String errorFileUrl) {
            this.errorFileUrl = errorFileUrl;
            return this;
        }
        public String getErrorFileUrl() {
            return this.errorFileUrl;
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

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorType(String errorType) {
            this.errorType = errorType;
            return this;
        }
        public String getErrorType() {
            return this.errorType;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList setErrorTime(Long errorTime) {
            this.errorTime = errorTime;
            return this;
        }
        public Long getErrorTime() {
            return this.errorTime;
        }

    }

    public static class DescribeBackupMachineStatusResponseBodyBackupMachineStatus extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("VaultId")
        public String vaultId;

        @NameInMap("Jobs")
        public String jobs;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ClientStatus")
        public String clientStatus;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("SavedBackupCount")
        public Integer savedBackupCount;

        @NameInMap("ClientVersion")
        public String clientVersion;

        @NameInMap("ErrorList")
        public java.util.List<DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList> errorList;

        public static DescribeBackupMachineStatusResponseBodyBackupMachineStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupMachineStatusResponseBodyBackupMachineStatus self = new DescribeBackupMachineStatusResponseBodyBackupMachineStatus();
            return TeaModel.build(map, self);
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setVaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }
        public String getVaultId() {
            return this.vaultId;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setJobs(String jobs) {
            this.jobs = jobs;
            return this;
        }
        public String getJobs() {
            return this.jobs;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setClientStatus(String clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }
        public String getClientStatus() {
            return this.clientStatus;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setSavedBackupCount(Integer savedBackupCount) {
            this.savedBackupCount = savedBackupCount;
            return this;
        }
        public Integer getSavedBackupCount() {
            return this.savedBackupCount;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setClientVersion(String clientVersion) {
            this.clientVersion = clientVersion;
            return this;
        }
        public String getClientVersion() {
            return this.clientVersion;
        }

        public DescribeBackupMachineStatusResponseBodyBackupMachineStatus setErrorList(java.util.List<DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList> errorList) {
            this.errorList = errorList;
            return this;
        }
        public java.util.List<DescribeBackupMachineStatusResponseBodyBackupMachineStatusErrorList> getErrorList() {
            return this.errorList;
        }

    }

}
