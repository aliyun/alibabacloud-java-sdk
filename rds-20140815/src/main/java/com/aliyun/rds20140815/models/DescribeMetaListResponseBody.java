// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMetaListResponseBody extends TeaModel {
    /**
     * <p>The instance name.</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The information about the databases and tables whose data is included in the backup set.</p>
     */
    @NameInMap("Items")
    public DescribeMetaListResponseBodyItems items;

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

    public static DescribeMetaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMetaListResponseBody self = new DescribeMetaListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMetaListResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeMetaListResponseBody setItems(DescribeMetaListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeMetaListResponseBodyItems getItems() {
        return this.items;
    }

    public DescribeMetaListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMetaListResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetaListResponseBody setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
        return this;
    }
    public Integer getTotalPageCount() {
        return this.totalPageCount;
    }

    public DescribeMetaListResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeMetaListResponseBodyItemsMeta extends TeaModel {
        /**
         * <p>The database name.</p>
         */
        @NameInMap("Database")
        public String database;

        /**
         * <p>The table size. Unit: KB.</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The table name.</p>
         */
        @NameInMap("Tables")
        public String tables;

        public static DescribeMetaListResponseBodyItemsMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaListResponseBodyItemsMeta self = new DescribeMetaListResponseBodyItemsMeta();
            return TeaModel.build(map, self);
        }

        public DescribeMetaListResponseBodyItemsMeta setDatabase(String database) {
            this.database = database;
            return this;
        }
        public String getDatabase() {
            return this.database;
        }

        public DescribeMetaListResponseBodyItemsMeta setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public DescribeMetaListResponseBodyItemsMeta setTables(String tables) {
            this.tables = tables;
            return this;
        }
        public String getTables() {
            return this.tables;
        }

    }

    public static class DescribeMetaListResponseBodyItems extends TeaModel {
        @NameInMap("Meta")
        public java.util.List<DescribeMetaListResponseBodyItemsMeta> meta;

        public static DescribeMetaListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaListResponseBodyItems self = new DescribeMetaListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeMetaListResponseBodyItems setMeta(java.util.List<DescribeMetaListResponseBodyItemsMeta> meta) {
            this.meta = meta;
            return this;
        }
        public java.util.List<DescribeMetaListResponseBodyItemsMeta> getMeta() {
            return this.meta;
        }

    }

}
