// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeColdStorageInstanceResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token to retrieve the next page of results. If this parameter is not returned, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>c2FpXzIwMjIwNjI5X2Jhay9zYWlfc3VtbWVyX3RyZWFzdXJlX3Bvb2xfbG9nLkNTVg==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The object type.</p>
     * 
     * <strong>example:</strong>
     * <p>TABLE</p>
     */
    @NameInMap("ObjectType")
    public String objectType;

    /**
     * <p>Indicates whether the OSS bucket is enabled.</p>
     * <ul>
     * <li><p><strong>true</strong>: enabled</p>
     * </li>
     * <li><p><strong>false</strong>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OssClusterEnabled")
    public String ossClusterEnabled;

    /**
     * <p>The list of OSS addresses for the cold storage instances.</p>
     */
    @NameInMap("OssClusterInfoList")
    public java.util.List<DescribeColdStorageInstanceResponseBodyOssClusterInfoList> ossClusterInfoList;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C7A8EA8E-A140-5226-90D7-5BCB304D3DB6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the cluster supports cold storage. If the cluster does not support cold storage, the switch is not displayed on the console.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SupportOssCluster")
    public String supportOssCluster;

    /**
     * <p>The list of cold storage instances.</p>
     */
    @NameInMap("Tables")
    public java.util.List<DescribeColdStorageInstanceResponseBodyTables> tables;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecord")
    public Integer totalRecord;

    public static DescribeColdStorageInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeColdStorageInstanceResponseBody self = new DescribeColdStorageInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeColdStorageInstanceResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeColdStorageInstanceResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeColdStorageInstanceResponseBody setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public DescribeColdStorageInstanceResponseBody setOssClusterEnabled(String ossClusterEnabled) {
        this.ossClusterEnabled = ossClusterEnabled;
        return this;
    }
    public String getOssClusterEnabled() {
        return this.ossClusterEnabled;
    }

    public DescribeColdStorageInstanceResponseBody setOssClusterInfoList(java.util.List<DescribeColdStorageInstanceResponseBodyOssClusterInfoList> ossClusterInfoList) {
        this.ossClusterInfoList = ossClusterInfoList;
        return this;
    }
    public java.util.List<DescribeColdStorageInstanceResponseBodyOssClusterInfoList> getOssClusterInfoList() {
        return this.ossClusterInfoList;
    }

    public DescribeColdStorageInstanceResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeColdStorageInstanceResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeColdStorageInstanceResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeColdStorageInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeColdStorageInstanceResponseBody setSupportOssCluster(String supportOssCluster) {
        this.supportOssCluster = supportOssCluster;
        return this;
    }
    public String getSupportOssCluster() {
        return this.supportOssCluster;
    }

    public DescribeColdStorageInstanceResponseBody setTables(java.util.List<DescribeColdStorageInstanceResponseBodyTables> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<DescribeColdStorageInstanceResponseBodyTables> getTables() {
        return this.tables;
    }

    public DescribeColdStorageInstanceResponseBody setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }
    public Integer getTotalRecord() {
        return this.totalRecord;
    }

    public static class DescribeColdStorageInstanceResponseBodyOssClusterInfoList extends TeaModel {
        /**
         * <p>The time when the cluster was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-10T17:01:16Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The ID of the cold storage instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*****************</p>
         */
        @NameInMap("OssClusterId")
        public String ossClusterId;

        /**
         * <p>The ID of the region where the task is located.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The size of the cold storage table. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Size")
        public String size;

        public static DescribeColdStorageInstanceResponseBodyOssClusterInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeColdStorageInstanceResponseBodyOssClusterInfoList self = new DescribeColdStorageInstanceResponseBodyOssClusterInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeColdStorageInstanceResponseBodyOssClusterInfoList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeColdStorageInstanceResponseBodyOssClusterInfoList setOssClusterId(String ossClusterId) {
            this.ossClusterId = ossClusterId;
            return this;
        }
        public String getOssClusterId() {
            return this.ossClusterId;
        }

        public DescribeColdStorageInstanceResponseBodyOssClusterInfoList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DescribeColdStorageInstanceResponseBodyOssClusterInfoList setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

    public static class DescribeColdStorageInstanceResponseBodyTablesChildObjects extends TeaModel {
        /**
         * <p>The object name.</p>
         * 
         * <strong>example:</strong>
         * <p>img/1728554006462.png</p>
         */
        @NameInMap("ObjectName")
        public String objectName;

        /**
         * <p>The object type.</p>
         * 
         * <strong>example:</strong>
         * <p>File</p>
         */
        @NameInMap("ObjectType")
        public String objectType;

        /**
         * <p>The disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><p><strong>Scheduled</strong>: The task is waiting to be executed.</p>
         * </li>
         * <li><p><strong>Running</strong>: The task is in progress.</p>
         * </li>
         * <li><p><strong>Succeed</strong>: The task is successful.</p>
         * </li>
         * <li><p><strong>Cancelling</strong>: The task is being stopped.</p>
         * </li>
         * <li><p><strong>Canceled</strong>: The task is stopped.</p>
         * </li>
         * <li><p><strong>Waiting</strong>: The task is waiting for a preset time.</p>
         * </li>
         * </ul>
         * <p>To query multiple statuses, separate them with commas (,). If you do not specify this parameter, all statuses are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeColdStorageInstanceResponseBodyTablesChildObjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeColdStorageInstanceResponseBodyTablesChildObjects self = new DescribeColdStorageInstanceResponseBodyTablesChildObjects();
            return TeaModel.build(map, self);
        }

        public DescribeColdStorageInstanceResponseBodyTablesChildObjects setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public DescribeColdStorageInstanceResponseBodyTablesChildObjects setObjectType(String objectType) {
            this.objectType = objectType;
            return this;
        }
        public String getObjectType() {
            return this.objectType;
        }

        public DescribeColdStorageInstanceResponseBodyTablesChildObjects setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeColdStorageInstanceResponseBodyTablesChildObjects setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeColdStorageInstanceResponseBodyTables extends TeaModel {
        /**
         * <p>The list of child objects.</p>
         */
        @NameInMap("ChildObjects")
        public java.util.List<DescribeColdStorageInstanceResponseBodyTablesChildObjects> childObjects;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("DB")
        public String DB;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <p>The name of the large object (LOB) field.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("FieldName")
        public String fieldName;

        /**
         * <p>The ID of the OSS-based cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-*****************</p>
         */
        @NameInMap("OssClusterId")
        public String ossClusterId;

        /**
         * <p>The partition of the cold storage instance.</p>
         * 
         * <strong>example:</strong>
         * <p>202509</p>
         */
        @NameInMap("Partion")
        public String partion;

        /**
         * <p>The disk size of the cold storage instance. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("Table")
        public String table;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeColdStorageInstanceResponseBodyTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeColdStorageInstanceResponseBodyTables self = new DescribeColdStorageInstanceResponseBodyTables();
            return TeaModel.build(map, self);
        }

        public DescribeColdStorageInstanceResponseBodyTables setChildObjects(java.util.List<DescribeColdStorageInstanceResponseBodyTablesChildObjects> childObjects) {
            this.childObjects = childObjects;
            return this;
        }
        public java.util.List<DescribeColdStorageInstanceResponseBodyTablesChildObjects> getChildObjects() {
            return this.childObjects;
        }

        public DescribeColdStorageInstanceResponseBodyTables setDB(String DB) {
            this.DB = DB;
            return this;
        }
        public String getDB() {
            return this.DB;
        }

        public DescribeColdStorageInstanceResponseBodyTables setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeColdStorageInstanceResponseBodyTables setFieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }
        public String getFieldName() {
            return this.fieldName;
        }

        public DescribeColdStorageInstanceResponseBodyTables setOssClusterId(String ossClusterId) {
            this.ossClusterId = ossClusterId;
            return this;
        }
        public String getOssClusterId() {
            return this.ossClusterId;
        }

        public DescribeColdStorageInstanceResponseBodyTables setPartion(String partion) {
            this.partion = partion;
            return this;
        }
        public String getPartion() {
            return this.partion;
        }

        public DescribeColdStorageInstanceResponseBodyTables setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeColdStorageInstanceResponseBodyTables setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeColdStorageInstanceResponseBodyTables setTable(String table) {
            this.table = table;
            return this;
        }
        public String getTable() {
            return this.table;
        }

        public DescribeColdStorageInstanceResponseBodyTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
