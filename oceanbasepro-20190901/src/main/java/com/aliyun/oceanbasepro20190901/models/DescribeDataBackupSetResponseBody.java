// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeDataBackupSetResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeDataBackupSetResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataBackupSetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataBackupSetResponseBody self = new DescribeDataBackupSetResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataBackupSetResponseBody setData(java.util.List<DescribeDataBackupSetResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDataBackupSetResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDataBackupSetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataBackupSetResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataBackupSetResponseBodyDataBackupObjectsDatabaseTablesList extends TeaModel {
        @NameInMap("Database")
        public String database;

        @NameInMap("Tables")
        public java.util.List<String> tables;

        public static DescribeDataBackupSetResponseBodyDataBackupObjectsDatabaseTablesList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataBackupSetResponseBodyDataBackupObjectsDatabaseTablesList self = new DescribeDataBackupSetResponseBodyDataBackupObjectsDatabaseTablesList();
            return TeaModel.build(map, self);
        }

        public DescribeDataBackupSetResponseBodyDataBackupObjectsDatabaseTablesList setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeDataBackupSetResponseBodyDataBackupObjectsDatabaseTablesList setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

    }

    public static class DescribeDataBackupSetResponseBodyDataBackupObjects extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("DatabaseTablesList")
        public java.util.List<DescribeDataBackupSetResponseBodyDataBackupObjectsDatabaseTablesList> databaseTablesList;

        @NameInMap("TenantName")
        public String tenantName;

        public static DescribeDataBackupSetResponseBodyDataBackupObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataBackupSetResponseBodyDataBackupObjects self = new DescribeDataBackupSetResponseBodyDataBackupObjects();
            return TeaModel.build(map, self);
        }

        public DescribeDataBackupSetResponseBodyDataBackupObjects setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeDataBackupSetResponseBodyDataBackupObjects setDatabaseTablesList(java.util.List<DescribeDataBackupSetResponseBodyDataBackupObjectsDatabaseTablesList> databaseTablesList) {
            this.databaseTablesList = databaseTablesList;
            return this;
        }
        public java.util.List<DescribeDataBackupSetResponseBodyDataBackupObjectsDatabaseTablesList> getDatabaseTablesList() {
            return this.databaseTablesList;
        }

        public DescribeDataBackupSetResponseBodyDataBackupObjects setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

    public static class DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults extends TeaModel {
        @NameInMap("Database")
        public String database;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public String status;

        @NameInMap("Table")
        public String table;

        public static DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults self = new DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults();
            return TeaModel.build(map, self);
        }

        public DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

    }

    public static class DescribeDataBackupSetResponseBodyDataBackupResults extends TeaModel {
        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("TableBackupResults")
        public java.util.List<DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults> tableBackupResults;

        @NameInMap("TenantName")
        public String tenantName;

        public static DescribeDataBackupSetResponseBodyDataBackupResults build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataBackupSetResponseBodyDataBackupResults self = new DescribeDataBackupSetResponseBodyDataBackupResults();
            return TeaModel.build(map, self);
        }

        public DescribeDataBackupSetResponseBodyDataBackupResults setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public DescribeDataBackupSetResponseBodyDataBackupResults setTableBackupResults(java.util.List<DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults> tableBackupResults) {
            this.tableBackupResults = tableBackupResults;
            return this;
        }
        public java.util.List<DescribeDataBackupSetResponseBodyDataBackupResultsTableBackupResults> getTableBackupResults() {
            return this.tableBackupResults;
        }

        public DescribeDataBackupSetResponseBodyDataBackupResults setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

    }

    public static class DescribeDataBackupSetResponseBodyData extends TeaModel {
        @NameInMap("BackupObjectType")
        public String backupObjectType;

        @NameInMap("BackupObjects")
        public java.util.List<DescribeDataBackupSetResponseBodyDataBackupObjects> backupObjects;

        @NameInMap("BackupResults")
        public java.util.List<DescribeDataBackupSetResponseBodyDataBackupResults> backupResults;

        @NameInMap("Checkpoint")
        public String checkpoint;

        @NameInMap("DataSize")
        public Integer dataSize;

        @NameInMap("DataVersion")
        public Integer dataVersion;

        @NameInMap("DownloadTaskId")
        public Long downloadTaskId;

        @NameInMap("DownloadTaskStatus")
        public String downloadTaskStatus;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Method")
        public String method;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("SetId")
        public Integer setId;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("StorageClass")
        public String storageClass;

        @NameInMap("Type")
        public String type;

        @NameInMap("Validity")
        public String validity;

        public static DescribeDataBackupSetResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataBackupSetResponseBodyData self = new DescribeDataBackupSetResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDataBackupSetResponseBodyData setBackupObjectType(String backupObjectType) {
            this.backupObjectType = backupObjectType;
            return this;
        }
        public String getBackupObjectType() {
            return this.backupObjectType;
        }

        public DescribeDataBackupSetResponseBodyData setBackupObjects(java.util.List<DescribeDataBackupSetResponseBodyDataBackupObjects> backupObjects) {
            this.backupObjects = backupObjects;
            return this;
        }
        public java.util.List<DescribeDataBackupSetResponseBodyDataBackupObjects> getBackupObjects() {
            return this.backupObjects;
        }

        public DescribeDataBackupSetResponseBodyData setBackupResults(java.util.List<DescribeDataBackupSetResponseBodyDataBackupResults> backupResults) {
            this.backupResults = backupResults;
            return this;
        }
        public java.util.List<DescribeDataBackupSetResponseBodyDataBackupResults> getBackupResults() {
            return this.backupResults;
        }

        public DescribeDataBackupSetResponseBodyData setCheckpoint(String checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public String getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeDataBackupSetResponseBodyData setDataSize(Integer dataSize) {
            this.dataSize = dataSize;
            return this;
        }
        public Integer getDataSize() {
            return this.dataSize;
        }

        public DescribeDataBackupSetResponseBodyData setDataVersion(Integer dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public Integer getDataVersion() {
            return this.dataVersion;
        }

        public DescribeDataBackupSetResponseBodyData setDownloadTaskId(Long downloadTaskId) {
            this.downloadTaskId = downloadTaskId;
            return this;
        }
        public Long getDownloadTaskId() {
            return this.downloadTaskId;
        }

        public DescribeDataBackupSetResponseBodyData setDownloadTaskStatus(String downloadTaskStatus) {
            this.downloadTaskStatus = downloadTaskStatus;
            return this;
        }
        public String getDownloadTaskStatus() {
            return this.downloadTaskStatus;
        }

        public DescribeDataBackupSetResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDataBackupSetResponseBodyData setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public DescribeDataBackupSetResponseBodyData setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public DescribeDataBackupSetResponseBodyData setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public DescribeDataBackupSetResponseBodyData setSetId(Integer setId) {
            this.setId = setId;
            return this;
        }
        public Integer getSetId() {
            return this.setId;
        }

        public DescribeDataBackupSetResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDataBackupSetResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataBackupSetResponseBodyData setStorageClass(String storageClass) {
            this.storageClass = storageClass;
            return this;
        }
        public String getStorageClass() {
            return this.storageClass;
        }

        public DescribeDataBackupSetResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeDataBackupSetResponseBodyData setValidity(String validity) {
            this.validity = validity;
            return this;
        }
        public String getValidity() {
            return this.validity;
        }

    }

}
