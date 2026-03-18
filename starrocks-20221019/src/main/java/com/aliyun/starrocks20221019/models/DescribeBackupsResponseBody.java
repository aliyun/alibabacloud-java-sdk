// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class DescribeBackupsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeBackupsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <strong>example:</strong>
     * <p>Invalid params: [instance not exists].</p>
     */
    @NameInMap("ErrMessage")
    public String errMessage;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>32A44F0D-BFF6-5664-999A-218BBDE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeBackupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupsResponseBody self = new DescribeBackupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupsResponseBody setData(java.util.List<DescribeBackupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBackupsResponseBodyData> getData() {
        return this.data;
    }

    public DescribeBackupsResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public DescribeBackupsResponseBody setErrMessage(String errMessage) {
        this.errMessage = errMessage;
        return this;
    }
    public String getErrMessage() {
        return this.errMessage;
    }

    public DescribeBackupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeBackupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBackupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeBackupsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FE</p>
         */
        @NameInMap("ComponentType")
        public String componentType;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cu")
        public Integer cu;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DiskNumber")
        public String diskNumber;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("LocalStorageInstanceType")
        public String localStorageInstanceType;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ResidentNodeNumber")
        public String residentNodeNumber;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SpecType")
        public String specType;

        /**
         * <strong>example:</strong>
         * <p>pl1</p>
         */
        @NameInMap("StoragePerformanceLevel")
        public String storagePerformanceLevel;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StorageSize")
        public Integer storageSize;

        public static DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups self = new DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups setComponentType(String componentType) {
            this.componentType = componentType;
            return this;
        }
        public String getComponentType() {
            return this.componentType;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups setCu(Integer cu) {
            this.cu = cu;
            return this;
        }
        public Integer getCu() {
            return this.cu;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups setDiskNumber(String diskNumber) {
            this.diskNumber = diskNumber;
            return this;
        }
        public String getDiskNumber() {
            return this.diskNumber;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups setLocalStorageInstanceType(String localStorageInstanceType) {
            this.localStorageInstanceType = localStorageInstanceType;
            return this;
        }
        public String getLocalStorageInstanceType() {
            return this.localStorageInstanceType;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups setResidentNodeNumber(String residentNodeNumber) {
            this.residentNodeNumber = residentNodeNumber;
            return this;
        }
        public String getResidentNodeNumber() {
            return this.residentNodeNumber;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups setStoragePerformanceLevel(String storagePerformanceLevel) {
            this.storagePerformanceLevel = storagePerformanceLevel;
            return this;
        }
        public String getStoragePerformanceLevel() {
            return this.storagePerformanceLevel;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups setStorageSize(Integer storageSize) {
            this.storageSize = storageSize;
            return this;
        }
        public Integer getStorageSize() {
            return this.storageSize;
        }

    }

    public static class DescribeBackupsResponseBodyDataInstanceSnapshotTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>bk-time</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>1747708000</p>
         */
        @NameInMap("Value")
        public String value;

        public static DescribeBackupsResponseBodyDataInstanceSnapshotTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyDataInstanceSnapshotTags self = new DescribeBackupsResponseBodyDataInstanceSnapshotTags();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshotTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshotTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeBackupsResponseBodyDataInstanceSnapshot extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>c-37708ec80b5****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <strong>example:</strong>
         * <p>3.3.13-1.0-1.7.2</p>
         */
        @NameInMap("MinorVersion")
        public String minorVersion;

        @NameInMap("NodeGroups")
        public java.util.List<DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups> nodeGroups;

        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>rg-aekzd7frphchx3a</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <strong>example:</strong>
         * <p>shared_data</p>
         */
        @NameInMap("RunMode")
        public String runMode;

        /**
         * <strong>example:</strong>
         * <p>standard</p>
         */
        @NameInMap("SpecType")
        public String specType;

        @NameInMap("Tags")
        public java.util.List<DescribeBackupsResponseBodyDataInstanceSnapshotTags> tags;

        /**
         * <strong>example:</strong>
         * <p>3.3</p>
         */
        @NameInMap("Version")
        public String version;

        /**
         * <p>VPC ID。</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze0cez8106f2n85c2d7i</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeBackupsResponseBodyDataInstanceSnapshot build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyDataInstanceSnapshot self = new DescribeBackupsResponseBodyDataInstanceSnapshot();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshot setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshot setMinorVersion(String minorVersion) {
            this.minorVersion = minorVersion;
            return this;
        }
        public String getMinorVersion() {
            return this.minorVersion;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshot setNodeGroups(java.util.List<DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups> nodeGroups) {
            this.nodeGroups = nodeGroups;
            return this;
        }
        public java.util.List<DescribeBackupsResponseBodyDataInstanceSnapshotNodeGroups> getNodeGroups() {
            return this.nodeGroups;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshot setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshot setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshot setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshot setSpecType(String specType) {
            this.specType = specType;
            return this;
        }
        public String getSpecType() {
            return this.specType;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshot setTags(java.util.List<DescribeBackupsResponseBodyDataInstanceSnapshotTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<DescribeBackupsResponseBodyDataInstanceSnapshotTags> getTags() {
            return this.tags;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshot setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public DescribeBackupsResponseBodyDataInstanceSnapshot setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class DescribeBackupsResponseBodyDataSubTasks extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test1</p>
         */
        @NameInMap("DataBase")
        public String dataBase;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>1747718190</p>
         */
        @NameInMap("FinishedTime")
        public Long finishedTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>2025-02-10_backup</p>
         */
        @NameInMap("SnapshotName")
        public String snapshotName;

        /**
         * <strong>example:</strong>
         * <p>1747708190</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>cdc_ods_t2030_lcpf_api_topic_msg</p>
         */
        @NameInMap("Table")
        public String table;

        public static DescribeBackupsResponseBodyDataSubTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyDataSubTasks self = new DescribeBackupsResponseBodyDataSubTasks();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyDataSubTasks setDataBase(String dataBase) {
            this.dataBase = dataBase;
            return this;
        }
        public String getDataBase() {
            return this.dataBase;
        }

        public DescribeBackupsResponseBodyDataSubTasks setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public DescribeBackupsResponseBodyDataSubTasks setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeBackupsResponseBodyDataSubTasks setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeBackupsResponseBodyDataSubTasks setSnapshotName(String snapshotName) {
            this.snapshotName = snapshotName;
            return this;
        }
        public String getSnapshotName() {
            return this.snapshotName;
        }

        public DescribeBackupsResponseBodyDataSubTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeBackupsResponseBodyDataSubTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupsResponseBodyDataSubTasks setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeBackupsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1742179028000</p>
         */
        @NameInMap("BackupFinishedTime")
        public Long backupFinishedTime;

        /**
         * <strong>example:</strong>
         * <p>1742179018000</p>
         */
        @NameInMap("BackupStartTime")
        public Long backupStartTime;

        /**
         * <strong>example:</strong>
         * <p>bt-12sui21312dd</p>
         */
        @NameInMap("BackupTaskId")
        public String backupTaskId;

        /**
         * <strong>example:</strong>
         * <p>FullBackup</p>
         */
        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1742189008000</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <strong>example:</strong>
         * <p>c-d4be777ff5e8cXXX</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceSnapshot")
        public DescribeBackupsResponseBodyDataInstanceSnapshot instanceSnapshot;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SubTasks")
        public java.util.List<DescribeBackupsResponseBodyDataSubTasks> subTasks;

        public static DescribeBackupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackupsResponseBodyData self = new DescribeBackupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackupsResponseBodyData setBackupFinishedTime(Long backupFinishedTime) {
            this.backupFinishedTime = backupFinishedTime;
            return this;
        }
        public Long getBackupFinishedTime() {
            return this.backupFinishedTime;
        }

        public DescribeBackupsResponseBodyData setBackupStartTime(Long backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public Long getBackupStartTime() {
            return this.backupStartTime;
        }

        public DescribeBackupsResponseBodyData setBackupTaskId(String backupTaskId) {
            this.backupTaskId = backupTaskId;
            return this;
        }
        public String getBackupTaskId() {
            return this.backupTaskId;
        }

        public DescribeBackupsResponseBodyData setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public DescribeBackupsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBackupsResponseBodyData setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeBackupsResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeBackupsResponseBodyData setInstanceSnapshot(DescribeBackupsResponseBodyDataInstanceSnapshot instanceSnapshot) {
            this.instanceSnapshot = instanceSnapshot;
            return this;
        }
        public DescribeBackupsResponseBodyDataInstanceSnapshot getInstanceSnapshot() {
            return this.instanceSnapshot;
        }

        public DescribeBackupsResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeBackupsResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeBackupsResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackupsResponseBodyData setSubTasks(java.util.List<DescribeBackupsResponseBodyDataSubTasks> subTasks) {
            this.subTasks = subTasks;
            return this;
        }
        public java.util.List<DescribeBackupsResponseBodyDataSubTasks> getSubTasks() {
            return this.subTasks;
        }

    }

}
