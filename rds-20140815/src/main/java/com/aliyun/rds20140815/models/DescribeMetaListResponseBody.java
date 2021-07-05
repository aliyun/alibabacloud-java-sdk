// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeMetaListResponseBody extends TeaModel {
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("TotalPageCount")
    public Integer totalPageCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageRecordCount")
    public Integer pageRecordCount;

    @NameInMap("TotalRecordCount")
    public Integer totalRecordCount;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Items")
    public DescribeMetaListResponseBodyItems items;

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

    public DescribeMetaListResponseBody setTotalPageCount(Integer totalPageCount) {
        this.totalPageCount = totalPageCount;
        return this;
    }
    public Integer getTotalPageCount() {
        return this.totalPageCount;
    }

    public DescribeMetaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMetaListResponseBody setPageRecordCount(Integer pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeMetaListResponseBody setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public DescribeMetaListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMetaListResponseBody setItems(DescribeMetaListResponseBodyItems items) {
        this.items = items;
        return this;
    }
    public DescribeMetaListResponseBodyItems getItems() {
        return this.items;
    }

    public static class DescribeMetaListResponseBodyItemsMeta extends TeaModel {
        @NameInMap("Tables")
        public String tables;

        @NameInMap("Database")
        public String database;

        @NameInMap("Size")
        public String size;

        public static DescribeMetaListResponseBodyItemsMeta build(java.util.Map<String, ?> map) throws Exception {
            DescribeMetaListResponseBodyItemsMeta self = new DescribeMetaListResponseBodyItemsMeta();
            return TeaModel.build(map, self);
        }

        public DescribeMetaListResponseBodyItemsMeta setTables(String tables) {
            this.tables = tables;
            return this;
        }
        public String getTables() {
            return this.tables;
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
