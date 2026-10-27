// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeArchiveTableListResponseBody extends TeaModel {
    /**
     * <p>The data.</p>
     */
    @NameInMap("Data")
    public DescribeArchiveTableListResponseBodyData data;

    /**
     * <p>requestId</p>
     * 
     * <strong>example:</strong>
     * <p>1A6D328C-84B8-40DC-BF49-6C73984D7494</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeArchiveTableListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeArchiveTableListResponseBody self = new DescribeArchiveTableListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeArchiveTableListResponseBody setData(DescribeArchiveTableListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeArchiveTableListResponseBodyData getData() {
        return this.data;
    }

    public DescribeArchiveTableListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeArchiveTableListResponseBodyDataTables extends TeaModel {
        /**
         * <p>The archiving status. Valid values: SUCCESS, PAUSE, and RUNNING.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("ArchiveStatus")
        public String archiveStatus;

        /**
         * <p>The time when the table was created.</p>
         */
        @NameInMap("CreatedDate")
        public Long createdDate;

        /**
         * <p>The number of files.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FileCount")
        public Integer fileCount;

        /**
         * <p>The time of the last successful archiving.</p>
         */
        @NameInMap("LastSuccessArchiveTime")
        public Long lastSuccessArchiveTime;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The amount of storage space used.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SpaceSize")
        public Double spaceSize;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DescribeArchiveTableListResponseBodyDataTables build(java.util.Map<String, ?> map) throws Exception {
            DescribeArchiveTableListResponseBodyDataTables self = new DescribeArchiveTableListResponseBodyDataTables();
            return TeaModel.build(map, self);
        }

        public DescribeArchiveTableListResponseBodyDataTables setArchiveStatus(String archiveStatus) {
            this.archiveStatus = archiveStatus;
            return this;
        }
        public String getArchiveStatus() {
            return this.archiveStatus;
        }

        public DescribeArchiveTableListResponseBodyDataTables setCreatedDate(Long createdDate) {
            this.createdDate = createdDate;
            return this;
        }
        public Long getCreatedDate() {
            return this.createdDate;
        }

        public DescribeArchiveTableListResponseBodyDataTables setFileCount(Integer fileCount) {
            this.fileCount = fileCount;
            return this;
        }
        public Integer getFileCount() {
            return this.fileCount;
        }

        public DescribeArchiveTableListResponseBodyDataTables setLastSuccessArchiveTime(Long lastSuccessArchiveTime) {
            this.lastSuccessArchiveTime = lastSuccessArchiveTime;
            return this;
        }
        public Long getLastSuccessArchiveTime() {
            return this.lastSuccessArchiveTime;
        }

        public DescribeArchiveTableListResponseBodyDataTables setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public DescribeArchiveTableListResponseBodyDataTables setSpaceSize(Double spaceSize) {
            this.spaceSize = spaceSize;
            return this;
        }
        public Double getSpaceSize() {
            return this.spaceSize;
        }

        public DescribeArchiveTableListResponseBodyDataTables setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DescribeArchiveTableListResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageIndex")
        public Long pageIndex;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The number of tables in the PAUSE state.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PausedCount")
        public Integer pausedCount;

        /**
         * <p>The number of tables being archived.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RunningCount")
        public Integer runningCount;

        /**
         * <p>The number of successfully archived tables.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        /**
         * <p>The list of archived tables.</p>
         */
        @NameInMap("Tables")
        public java.util.List<DescribeArchiveTableListResponseBodyDataTables> tables;

        /**
         * <p>The number of tables to be archived.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TobeArchivedConut")
        public Integer tobeArchivedConut;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Total")
        public Long total;

        public static DescribeArchiveTableListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeArchiveTableListResponseBodyData self = new DescribeArchiveTableListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeArchiveTableListResponseBodyData setPageIndex(Long pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Long getPageIndex() {
            return this.pageIndex;
        }

        public DescribeArchiveTableListResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeArchiveTableListResponseBodyData setPausedCount(Integer pausedCount) {
            this.pausedCount = pausedCount;
            return this;
        }
        public Integer getPausedCount() {
            return this.pausedCount;
        }

        public DescribeArchiveTableListResponseBodyData setRunningCount(Integer runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public Integer getRunningCount() {
            return this.runningCount;
        }

        public DescribeArchiveTableListResponseBodyData setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

        public DescribeArchiveTableListResponseBodyData setTables(java.util.List<DescribeArchiveTableListResponseBodyDataTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<DescribeArchiveTableListResponseBodyDataTables> getTables() {
            return this.tables;
        }

        public DescribeArchiveTableListResponseBodyData setTobeArchivedConut(Integer tobeArchivedConut) {
            this.tobeArchivedConut = tobeArchivedConut;
            return this;
        }
        public Integer getTobeArchivedConut() {
            return this.tobeArchivedConut;
        }

        public DescribeArchiveTableListResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
