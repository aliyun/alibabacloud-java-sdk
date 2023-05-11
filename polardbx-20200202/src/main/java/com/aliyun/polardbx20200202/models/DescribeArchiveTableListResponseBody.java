// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeArchiveTableListResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeArchiveTableListResponseBodyData data;

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
        @NameInMap("ArchiveStatus")
        public String archiveStatus;

        @NameInMap("CreatedDate")
        public Long createdDate;

        @NameInMap("FileCount")
        public Integer fileCount;

        @NameInMap("LastSuccessArchiveTime")
        public Long lastSuccessArchiveTime;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SpaceSize")
        public Double spaceSize;

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
        @NameInMap("PageIndex")
        public Long pageIndex;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("PausedCount")
        public Integer pausedCount;

        @NameInMap("RunningCount")
        public Integer runningCount;

        @NameInMap("SuccessCount")
        public Integer successCount;

        @NameInMap("Tables")
        public java.util.List<DescribeArchiveTableListResponseBodyDataTables> tables;

        @NameInMap("TobeArchivedConut")
        public Integer tobeArchivedConut;

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
