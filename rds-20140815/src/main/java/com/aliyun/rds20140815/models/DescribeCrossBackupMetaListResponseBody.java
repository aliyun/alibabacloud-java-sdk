// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossBackupMetaListResponseBody extends TeaModel {
    /**
     * <p>The instance to which the cross-region backup file belongs.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>An array that consists of the information about the databases and tables whose data is included in the cross-region backup file.</p>
     */
    @NameInMap("Items")
    public DescribeCrossBackupMetaListResponseBodyItems items;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages returned.</p>
     */
    @NameInMap("TotalPageCount")
    public Integer totalPageCount;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    public static DescribeCrossBackupMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossBackupMetaListResponseBody self = new DescribeCrossBackupMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCrossBackupMetaListResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeCrossBackupMetaListResponseBody setItems(DescribeCrossBackupMetaListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeCrossBackupMetaListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeCrossBackupMetaListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCrossBackupMetaListResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeCrossBackupMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCrossBackupMetaListResponseBody setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
        return this;
    }
    public Integer getTotalPageCount() {
        return this.totalPageCount;
    }

    public DescribeCrossBackupMetaListResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeCrossBackupMetaListResponseBodyItemsMeta extends TeaModel {
        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The size of the table. Unit: KB. If the database contains more than one table, the names of these tables are separated by commas (,).</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>An array that consists of the names of the tables that the database contains. If the database contains more than one table, the names of these tables are separated by commas (,).</p>
         */
        @NameInMap("Tables")
        public String tables;

        public static DescribeCrossBackupMetaListResponseBodyItemsMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossBackupMetaListResponseBodyItemsMeta self = new DescribeCrossBackupMetaListResponseBodyItemsMeta();
            return TeaModel.build(map, self);
        }

        public DescribeCrossBackupMetaListResponseBodyItemsMeta setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeCrossBackupMetaListResponseBodyItemsMeta setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeCrossBackupMetaListResponseBodyItemsMeta setTables(String tables) {
            this.tables = tables;
            return this;
        }
        public String getTables() {
            return this.tables;
        }

    }

    public static class DescribeCrossBackupMetaListResponseBodyItems extends TeaModel {
        @NameInMap("Meta")
        public java.util.List<DescribeCrossBackupMetaListResponseBodyItemsMeta> meta;

        public static DescribeCrossBackupMetaListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCrossBackupMetaListResponseBodyItems self = new DescribeCrossBackupMetaListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCrossBackupMetaListResponseBodyItems setMeta(java.util.List<DescribeCrossBackupMetaListResponseBodyItemsMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<DescribeCrossBackupMetaListResponseBodyItemsMeta> getMeta() {
            return this.meta;
        }

    }

}
